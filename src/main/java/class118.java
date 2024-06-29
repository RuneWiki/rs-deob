import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class118 {

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "J")
    public static long field2105 = 0L;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Ljf;")
    public static class229 field2100 = class212.method1457((byte) 111, "Wordpack geladen)3");

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field2108 = 0;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lni;")
    public static class24 field2101 = new class24(50);

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    public static boolean field2109 = false;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lek;")
    public static class185 field2102;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 8)
    public static void method841(int arg0) {
        field2101 = null;
        field2100 = null;
        if (arg0 == -1) {
            field2102 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V", line = 33)
    public static final void method842(int arg0, long[] arg1, Object[] arg2, int arg3, int arg4) {
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            long var6 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var6;
            int var8 = arg0;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if ((long) (var10 & 0x1) + var6 > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var8];
                    arg1[var8] = var11;
                    Object var13 = arg2[var10];
                    arg2[var10] = arg2[var8];
                    arg2[var8++] = var13;
                }
            }
            arg1[arg3] = arg1[var8];
            arg1[var8] = var6;
            arg2[arg3] = arg2[var8];
            arg2[var8] = var9;
            method842(arg0, arg1, arg2, var8 - 1, 1);
            method842(var8 + 1, arg1, arg2, arg3, 1);
        }
        if (arg4 != 1) {
            field2102 = (class185) null;
        }
        field2099++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 92)
    public static final void method843(int arg0) {
        field2107++;
        class223.field3801.method226((byte) -119);
        if (arg0 != -6477) {
            method842(94, (long[]) null, (Object[]) null, -102, -46);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lnf;Ljf;B)Ljf;", line = 103)
    public static final class229 method844(class67 arg0, class229 arg1, byte arg2) {
        if (arg2 <= 5) {
            return (class229) null;
        }
        field2104++;
        if (arg1.method1649(class280.field4790, (byte) -110) == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.method1649(class223.field3806, (byte) -110);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method1649(class241.field4252, (byte) -112);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method1649(class284.field4876, (byte) -105);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method1649(class63.field1088, (byte) -88);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method1649(class24.field436, (byte) -114);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method1649(class328.field5516, (byte) -114);
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    class229 var9 = class331.field5638;
                                                    if (class169.field2903 != null) {
                                                        var9 = class270.method1904(127, class169.field2903.field4008);
                                                        try {
                                                            if (class169.field2903.field4009 != null) {
                                                                byte[] var10 = ((String) class169.field2903.field4009).getBytes("ISO-8859-1");
                                                                var9 = class102.method686(var10.length, 0, true, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg1 = class142.method989(new class229[] { arg1.method1639((byte) -20, var8, 0), var9, arg1.method1625(true, var8 + 4) }, -125);
                                                }
                                            }
                                            arg1 = class142.method989(new class229[] { arg1.method1639((byte) -20, var7, 0), class3.method11(64, class238.method1700(4, arg0, (byte) 115)), arg1.method1625(true, var7 + 2) }, -74);
                                        }
                                    }
                                    arg1 = class142.method989(new class229[] { arg1.method1639((byte) -20, var6, 0), class3.method11(64, class238.method1700(3, arg0, (byte) 115)), arg1.method1625(true, var6 + 2) }, -69);
                                }
                            }
                            arg1 = class142.method989(new class229[] { arg1.method1639((byte) -20, var5, 0), class3.method11(64, class238.method1700(2, arg0, (byte) 115)), arg1.method1625(true, var5 + 2) }, -55);
                        }
                    }
                    arg1 = class142.method989(new class229[] { arg1.method1639((byte) -20, var4, 0), class3.method11(64, class238.method1700(1, arg0, (byte) 115)), arg1.method1625(true, var4 + 2) }, -80);
                }
            }
            arg1 = class142.method989(new class229[] { arg1.method1639((byte) -20, var3, 0), class3.method11(64, class238.method1700(0, arg0, (byte) 115)), arg1.method1625(true, var3 + 2) }, -86);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public abstract void method609(boolean arg0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
    public abstract int method610(int arg0, int arg1, int arg2);
}
