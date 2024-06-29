import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class137 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    private int[] field3215;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lwd;")
    private static class150 field3211 = class2.method9(true, "white:");

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3209 = 0;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lwd;")
    public static class150 field3218 = field3211;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[Lqa;")
    public static class111[] field3217 = new class111[2048];

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lwd;")
    public static class150 field3210 = field3211;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lwd;")
    public static class150 field3220 = class2.method9(true, "backhmid1");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static volatile int field3208 = 0;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
    public static int[] field3216;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1015(boolean arg0, String arg1) throws ClassNotFoundException {
        field3214++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg0) {
                method1018(121);
            }
            if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([I)V")
    public class137(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3215 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3215[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3215[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field3215[var5 + var5] = arg0[var4];
            this.field3215[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
    public final int method1016(byte arg0, int arg1) {
        field3213++;
        int var3 = -65 % ((17 - arg0) / 37);
        int var4 = this.field3215.length - 2;
        int var5 = arg1 << 1 & var4;
        while (true) {
            int var6 = this.field3215[var5];
            if (arg1 == var6) {
                return this.field3215[var5 + 1];
            }
            if (var6 == -1) {
                return -1;
            }
            var5 = var4 & var5 + 2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILff;I)Lnb;")
    public static final class92 method1017(int arg0, class42 arg1, int arg2) {
        if (arg2 != 16067) {
            field3208 = 105;
        }
        field3212++;
        byte[] var3 = arg1.method304(arg0, true);
        return var3 == null ? null : new class92(var3);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field3218 = null;
        field3217 = null;
        if (arg0 == -1) {
            field3216 = null;
            field3210 = null;
            field3220 = null;
            field3211 = null;
        }
    }
}
