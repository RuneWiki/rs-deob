import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class241 extends class220 {

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public int field4119 = -1;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public int field4124 = 12800;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public int field4126 = 12800;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public int field4131 = 0;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public int field4128 = 0;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "Z")
    public boolean field4135 = true;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "Lmh;")
    public class128 field4127;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "Lmh;")
    public class128 field4130;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "Lvf;")
    public class296 field4134;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "[J")
    public static long[] field4116 = new long[32];

    @OriginalMember(owner = "client!md", name = "R", descriptor = "[I")
    public static int[] field4125 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Lmh;")
    private static class128 field4122 = class22.method156(125, " from your ignore list first)3");

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Lmh;")
    private static class128 field4121 = class22.method156(124, "M");

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Lmh;")
    public static class128 field4123 = field4122;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lmh;")
    public static class128 field4117 = field4121;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field4129 = 0;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lmh;")
    public static class128 field4113 = field4121;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "Ljava/lang/String;")
    public static String field4137;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lff;IIIIIIZ)V", line = 13)
    public static final void method1635(class48 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field975.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field975[var9] - class260.field4501;
            int var11 = arg0.field968[var9] - class166.field2847;
            int var12 = arg0.field971[var9] - class156.field2682;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field965 != null) {
                class48.field963[var9] = var13;
                class48.field956[var9] = var16;
                class48.field970[var9] = var17;
            }
            class48.field957[var9] = (var13 << 9) / var17 + class141.field2415;
            class48.field967[var9] = (var16 << 9) / var17 + class141.field2422;
        }
        class141.field2410 = 0;
        int var19 = arg0.field955.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field955[var20];
            int var22 = arg0.field958[var20];
            int var23 = arg0.field969[var20];
            int var24 = class48.field957[var21];
            int var25 = class48.field957[var22];
            int var26 = class48.field957[var23];
            int var27 = class48.field967[var21];
            int var28 = class48.field967[var22];
            int var29 = class48.field967[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class173.field3065 && class223.method1538(class30.field667 + class141.field2415, class77.field1418 + class141.field2422, var27, var28, var29, var24, var25, var26)) {
                    class204.field3604 = arg5;
                    class260.field4511 = arg6;
                }
                if (!class247.field4247 && !arg7) {
                    class141.field2420 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class141.field2416 || var25 > class141.field2416 || var26 > class141.field2416) {
                        class141.field2420 = true;
                    }
                    if (arg0.field965 == null || arg0.field965[var20] == -1) {
                        if (arg0.field976[var20] != 12345678) {
                            class141.method926(var27, var28, var29, var24, var25, var26, arg0.field976[var20], arg0.field961[var20], arg0.field964[var20]);
                        }
                    } else if (!class121.field2039) {
                        int var30 = class141.field2419.method97(arg0.field965[var20], 0);
                        class141.method926(var27, var28, var29, var24, var25, var26, class314.method2141(var30, arg0.field976[var20]), class314.method2141(var30, arg0.field961[var20]), class314.method2141(var30, arg0.field964[var20]));
                    } else if (arg0.field959) {
                        class141.method928(var27, var28, var29, var24, var25, var26, arg0.field976[var20], arg0.field961[var20], arg0.field964[var20], class48.field963[0], class48.field963[1], class48.field963[3], class48.field956[0], class48.field956[1], class48.field956[3], class48.field970[0], class48.field970[1], class48.field970[3], arg0.field965[var20]);
                    } else {
                        class141.method928(var27, var28, var29, var24, var25, var26, arg0.field976[var20], arg0.field961[var20], arg0.field964[var20], class48.field963[var21], class48.field963[var22], class48.field963[var23], class48.field956[var21], class48.field956[var22], class48.field956[var23], class48.field970[var21], class48.field970[var22], class48.field970[var23], arg0.field965[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(ZII)Z", line = 127)
    public final boolean method1636(boolean arg0, int arg1, int arg2) {
        field4133++;
        if (this.field4126 > arg2 || this.field4131 < arg2 || this.field4124 > arg1 || this.field4128 < arg1) {
            return false;
        } else if (arg0) {
            for (class109 var4 = (class109) this.field4134.method2024(0); var4 != null; var4 = (class109) this.field4134.method2027(1211754408)) {
                if (var4.method665(64, arg2, arg1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 152)
    public static void method1637(int arg0) {
        field4113 = null;
        field4137 = null;
        field4117 = null;
        field4123 = null;
        field4116 = null;
        if (arg0 != 0) {
            method1637(94);
        }
        field4125 = null;
        field4122 = null;
        field4121 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lfj;", line = 176)
    public static final class229 method1638(int arg0, int arg1, int arg2) {
        int var3 = 38 / ((50 - arg1) / 51);
        field4112++;
        class229 var4 = (class229) class268.field4648.method728(false, (long) arg0 << 32 | (long) arg2);
        if (var4 == null) {
            var4 = new class229(arg0, arg2);
            class268.field4648.method730(var4, var4.field4915, (byte) 120);
        }
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 194)
    public final void method1639(int arg0) {
        field4136++;
        this.field4128 = 0;
        this.field4124 = arg0;
        this.field4131 = 0;
        this.field4126 = 12800;
        for (class109 var2 = (class109) this.field4134.method2024(0); var2 != null; var2 = (class109) this.field4134.method2027(1211754408)) {
            if (this.field4128 < var2.field1851) {
                this.field4128 = var2.field1851;
            }
            if (this.field4124 > var2.field1852) {
                this.field4124 = var2.field1852;
            }
            if (this.field4131 < var2.field1855) {
                this.field4131 = var2.field1855;
            }
            if (var2.field1858 < this.field4126) {
                this.field4126 = var2.field1858;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lmh;Lmh;IIIZ)V", line = 324)
    public class241(class128 arg0, class128 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4135 = arg5;
        this.field4132 = arg3;
        this.field4115 = arg2;
        this.field4127 = arg1;
        this.field4119 = arg4;
        this.field4130 = arg0;
        this.field4134 = new class296();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V", line = 271)
    public static final void method1640(int arg0, byte arg1) {
        int var2 = 80 / ((arg1 - 61) / 48);
        field4120++;
        class201.field3559.method1833(arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZJ)V", line = 290)
    public static final void method1641(boolean arg0, long arg1) {
        field4118++;
        try {
            Thread.sleep(arg1);
            if (!arg0) {
                field4122 = (class128) null;
            }
        } catch (InterruptedException var4) {
        }
    }
}
