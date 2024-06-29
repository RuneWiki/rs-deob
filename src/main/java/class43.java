import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class43 extends class140 {

    @OriginalMember(owner = "client!ga", name = "Xb", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!ga", name = "sc", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!ga", name = "rc", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!ga", name = "mc", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!ga", name = "ec", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!ga", name = "vc", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!ga", name = "wc", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!ga", name = "tc", descriptor = "Lbd;")
    private class12 field1015;

    @OriginalMember(owner = "client!ga", name = "nc", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!ga", name = "Wb", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!ga", name = "Yb", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!ga", name = "fc", descriptor = "Lja;")
    public static class62 field1001 = class30.method243(43, "p11_full");

    @OriginalMember(owner = "client!ga", name = "gc", descriptor = "[I")
    public static int[] field1002 = new int[5];

    @OriginalMember(owner = "client!ga", name = "hc", descriptor = "I")
    public static int field1003 = 0;

    @OriginalMember(owner = "client!ga", name = "bc", descriptor = "Lja;")
    private static class62 field997 = class30.method243(43, "Location");

    @OriginalMember(owner = "client!ga", name = "lc", descriptor = "I")
    public static int field1007 = 0;

    @OriginalMember(owner = "client!ga", name = "cc", descriptor = "Lja;")
    private static class62 field998 = class30.method243(43, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ga", name = "pc", descriptor = "I")
    public static int field1011 = 0;

    @OriginalMember(owner = "client!ga", name = "jc", descriptor = "Lja;")
    public static class62 field1005 = field997;

    @OriginalMember(owner = "client!ga", name = "Vb", descriptor = "Lja;")
    public static class62 field991 = field998;

    @OriginalMember(owner = "client!ga", name = "kc", descriptor = "Lja;")
    public static class62 field1006 = class30.method243(43, "<)4col>");

    @OriginalMember(owner = "client!ga", name = "oc", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ga", name = "qc", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ga", name = "uc", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ga", name = "Zb", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ga", name = "ac", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ga", name = "dc", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ga", name = "ic", descriptor = "Lpd;")
    public static class108 field1004;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIB)Lja;")
    public static final class62 method317(int arg0, boolean arg1, int arg2, byte arg3) {
        field1010++;
        int var4 = 1;
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        for (int var5 = arg0 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        if (arg3 != -68) {
            return null;
        }
        int var6 = var4;
        if (arg0 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg0 % arg2;
            arg0 /= arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class62 var9 = new class62();
        var9.field1538 = var6;
        var9.field1504 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(B)V")
    public static void method318(byte arg0) {
        if (arg0 >= -50) {
            field1007 = 89;
        }
        field998 = null;
        field1001 = null;
        field1005 = null;
        field1004 = null;
        field1002 = null;
        field991 = null;
        field1006 = null;
        field997 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static final void method319(boolean arg0) {
        class48 var1 = (class48) class136.field3132.method840(true);
        field995++;
        if (arg0) {
            return;
        }
        while (var1 != null) {
            if (class155.field3598 != var1.field1110 || class86.field2060 > var1.field1120) {
                var1.method1176((byte) 97);
            } else if (class86.field2060 >= var1.field1105) {
                if (var1.field1113 > 0) {
                    class130 var2 = class136.field3127[var1.field1113 - 1];
                    if (var2 != null && var2.field136 >= 0 && var2.field136 < 13312 && var2.field134 >= 0 && var2.field134 < 13312) {
                        var1.method340(class86.field2060, var2.field136, -5203, class111.method908(128, var2.field136, var2.field134, var1.field1110) - var1.field1122, var2.field134);
                    }
                }
                if (var1.field1113 < 0) {
                    int var3 = -var1.field1113 - 1;
                    class115 var4;
                    if (class34.field812 == var3) {
                        var4 = class40.field936;
                    } else {
                        var4 = class52.field1200[var3];
                    }
                    if (var4 != null && var4.field136 >= 0 && var4.field136 < 13312 && var4.field134 >= 0 && var4.field134 < 13312) {
                        var1.method340(class86.field2060, var4.field136, -5203, class111.method908(128, var4.field136, var4.field134, var1.field1110) - var1.field1122, var4.field134);
                    }
                }
                var1.method342((byte) -126, class45.field1024);
                class119.field2703.method576(class155.field3598, (int) var1.field1107, (int) var1.field1099, (int) var1.field1098, 60, var1, var1.field1104, -1, false);
            }
            var1 = (class48) class136.field3132.method841((byte) 18);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILja;Lja;)V")
    public static final void method320(int arg0, int arg1, class62 arg2, class62 arg3) {
        field1012++;
        class98.method758(arg3, -13412, null, arg1, arg2);
        if (arg0 != 0) {
            field1005 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)Lvb;")
    public final class145 method321(byte arg0) {
        if (this.field1015 != null) {
            int var2 = class86.field2060 - this.field1009;
            if (var2 > 100 && this.field1015.field273 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field1015.field280[this.field992] >= var2) {
                            break label42;
                        }
                        var2 -= this.field1015.field280[this.field992];
                        this.field992++;
                    } while (this.field992 < this.field1015.field263.length);
                    this.field992 -= this.field1015.field273;
                } while (this.field992 >= 0 && this.field992 < this.field1015.field263.length);
                this.field1015 = null;
            }
            this.field1009 = class86.field2060 - var2;
        }
        field996++;
        if (arg0 != 3) {
            field994 = -92;
        }
        class65 var3 = class84.method653(6, this.field1000);
        if (var3.field1594 != null) {
            var3 = var3.method505(-1);
        }
        return var3 == null ? null : var3.method507((byte) 92, this.field993, this.field1015, this.field1017, this.field1014, this.field1018, this.field1008, this.field992, this.field1013);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIIIIIZLuc;)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class140 arg9) {
        this.field993 = arg1;
        this.field1014 = arg5;
        this.field1013 = arg4;
        this.field1008 = arg3;
        this.field1000 = arg0;
        this.field1017 = arg6;
        this.field1018 = arg2;
        if (arg7 != -1) {
            this.field1015 = class141.method1121(arg7, -24732);
            this.field1009 = class86.field2060 - 1;
            this.field992 = 0;
            if (this.field1015.field272 == 0 && arg9 != null && arg9 instanceof class43) {
                class43 var11 = (class43) arg9;
                if (this.field1015 == var11.field1015) {
                    this.field1009 = var11.field1009;
                    this.field992 = var11.field992;
                    return;
                }
            }
            if (arg8 && this.field1015.field273 != -1) {
                this.field992 = (int) ((double) this.field1015.field263.length * Math.random());
                this.field1009 -= (int) ((double) this.field1015.field280[this.field992] * Math.random());
                return;
            }
        }
    }
}
