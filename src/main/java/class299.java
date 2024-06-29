import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public abstract class class299 extends class435 {

    @OriginalMember(owner = "client!st", name = "q", descriptor = "Z")
    public static boolean field3932 = false;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field3928 = 0;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "Lho;")
    public static class103 field3931 = new class103(36, -1);

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    public static int field3936 = 0;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "[I")
    public static int[] field3927;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lsv;[[BI)V", line = 13)
    public static final void method1785(class472 arg0, byte[][] arg1, int arg2) {
        field3933++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field601; var4++) {
            class466.method2847(false);
            for (int var5 = 0; var5 < class308.field4128 >> 3; var5++) {
                for (int var6 = 0; var6 < (class426.field6200 >> 3); var6++) {
                    int var7 = class495.field7230[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field598 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFF020) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class467.field6937.length; var13++) {
                                if (class467.field6937[var13] == var12 && arg1[var13] != null) {
                                    class396 var14 = new class396(arg1[var13]);
                                    arg0.method313(var8, var10, (byte) 106, var9, var11, var14, var4, var6 * 8, class96.field1223, var5 * 8);
                                    arg0.method2881(var3[0] == -1 ? var3 : null, var8, var4, var9, var14, var5 * 8, class343.field4596, var11, var10, false, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class155.field2027 = client.field2571.method2822(71, class333.field4407, var3[0], var3[2], var3[3], var3[1]);
            class139.field1851 = var3[4];
        }
        if (arg2 != 5) {
            method1786(119);
        }
    }

    @OriginalMember(owner = "client!st", name = "f", descriptor = "(I)V", line = 111)
    public static void method1786(int arg0) {
        field3931 = null;
        if (arg0 != 23757) {
            method1785(null, null, 15);
        }
        field3927 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)Z", line = 123)
    public static final boolean method1787(int arg0, int arg1, int arg2) {
        int var3 = 47 % ((arg1 - 46) / 44);
        field3934++;
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;", line = 133)
    public static final Class method1788(String arg0, boolean arg1) throws ClassNotFoundException {
        field3935++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            if (!arg1) {
                field3928 = 61;
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 173)
    public static final boolean method1789(String arg0, int arg1) {
        field3930++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 <= 59) {
            return false;
        }
        while (class85.field1014 > var2) {
            if (arg0.equalsIgnoreCase(class52.field611[var2])) {
                return true;
            }
            var2++;
        }
        return arg0.equalsIgnoreCase(class96.field1170.field7783);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)I")
    public abstract int method1758(byte arg0);

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)I")
    public abstract int method1760(int arg0);

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(I)J")
    public abstract long method1757(int arg0);

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(I)I")
    public abstract int method1755(int arg0);
}
