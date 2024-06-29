import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public abstract class class358 extends class69 {

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "Lpq;")
    public class194 field5149;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "[I")
    public static int[] field5147 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "Liga;")
    public static class91 field5151 = new class91(1, 19);

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "Z")
    public boolean field5148;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)I", line = 3)
    public int method2239(boolean arg0) {
        if (arg0) {
            return -122;
        } else {
            field5146++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lha;IILsda;Lhv;I)Z", line = 22)
    public static final boolean method2243(class473 arg0, int arg1, int arg2, class547 arg3, class226 arg4, int arg5) {
        field5154++;
        int var6 = Integer.MAX_VALUE;
        if (arg2 != 1) {
            method2244(-24);
        }
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field7626 != null) {
            var6 = (arg3.field7601 + arg4.field3424 - class46.field514) * (class46.field515 - class46.field510) / (class46.field497 - class46.field514) + class46.field510;
            var7 = (arg4.field3424 + arg3.field7613 - class46.field514) * (class46.field515 - class46.field510) / (class46.field497 - class46.field514) + class46.field510;
            var8 = class46.field507 - ((class46.field507 - class46.field499) * (arg3.field7636 + arg4.field3434 - class46.field517) / (class46.field504 - class46.field517));
            var9 = class46.field507 - ((arg3.field7598 + arg4.field3434 - class46.field517) * (class46.field507 - class46.field499) / (class46.field504 - class46.field517));
        }
        class318 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field7634 != -1) {
            if (arg4.field3426 && arg3.field7630 != -1) {
                var10 = arg3.method3237(arg2 + 3, arg0, true);
            } else {
                var10 = arg3.method3237(-123, arg0, false);
            }
            if (var10 != null) {
                var11 = arg4.field3425 - (var10.method749() + 1 >> 1);
                var12 = arg4.field3425 + (var10.method749() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var13 = arg4.field3430 - (var10.method736() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg4.field3430 + (var10.method736() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class506 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg3.field7597 != null) {
            var15 = class76.method554(arg3.field7631, (byte) 121);
            if (var15 != null) {
                var16 = class525.field7226.method1955(null, class548.field7648, arg3.field7597, null, false);
                var17 = (class46.field515 - class46.field510) * arg3.field7599 / (class46.field497 - class46.field514) + arg4.field3425;
                int var24 = arg4.field3430 - ((class46.field507 - class46.field499) * arg3.field7610 / (class46.field504 - class46.field517));
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method2953() / 2;
                } else {
                    var18 = var24 - ((var10.method736() >> 1) + var16 * var15.method2950());
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class548.field7648[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method2952(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg5 - var19 / 2;
                var21 = var19 / 2 + arg5 + var17;
                if (var6 > var20) {
                    var6 = var20;
                }
                if (var7 < var21) {
                    var7 = var21;
                }
                var22 = arg1 + var18;
                var23 = var15.method2950() * var16 + var18 + arg1;
                if (var22 < var8) {
                    var8 = var22;
                }
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (var7 < class46.field510 || class46.field515 < var6 || var9 < class46.field499 || var8 > class46.field507) {
            return true;
        }
        class46.method376(arg0, arg4, arg3);
        if (var10 != null) {
            if (class202.field2840 > 0 && (class457.field6394 != -1 && class457.field6394 == arg4.field3433 || class95.field1108 != -1 && class95.field1108 == arg3.field7604)) {
                int var28;
                if (class160.field2064 <= 50) {
                    var28 = class160.field2064 * 2;
                } else {
                    var28 = (100 - class160.field2064) * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg0.method2819(var29, arg2 ^ 0x11, arg4.field3425, arg4.field3430, var10.method737() / 2 + 7);
                arg0.method2819(var29, 16, arg4.field3425, arg4.field3430, var10.method737() / 2 + 5);
                arg0.method2819(var29, 16, arg4.field3425, arg4.field3430, var10.method737() / 2 + 3);
                arg0.method2819(var29, 16, arg4.field3425, arg4.field3430, var10.method737() / 2 + 1);
                arg0.method2819(var29, 16, arg4.field3425, arg4.field3430, var10.method737() / 2);
            }
            var10.method2025(arg4.field3425 - (var10.method749() >> 1), arg4.field3430 - (var10.method736() >> 1));
        }
        if (arg3.field7597 != null && var15 != null) {
            class482.method2867(var15, arg4, var18, var17, var19, arg3, arg0, (byte) -128, var16);
        }
        if (arg3.field7634 != -1 || arg3.field7597 != null) {
            class361 var30 = new class361(arg4);
            var30.field5211 = var13;
            var30.field5205 = var23;
            var30.field5202 = var14;
            var30.field5203 = var21;
            var30.field5206 = var20;
            var30.field5215 = var12;
            var30.field5210 = var22;
            var30.field5209 = var11;
            class94.field1093.method1039(var30, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lpq;)V", line = 212)
    public class358(class194 arg0) {
        this.field5149 = arg0;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)V", line = 221)
    public static void method2244(int arg0) {
        int var1 = -74 / ((arg0 + 39) / 62);
        field5151 = null;
        field5147 = null;
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)Z", line = 234)
    public final boolean method2246(int arg0) {
        field5153++;
        if (arg0 != -8247) {
            field5151 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "(I)Z", line = 245)
    public final boolean method2247(int arg0) {
        if (arg0 != 1) {
            field5147 = null;
        }
        field5150++;
        return this.field5148;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)I", line = 259)
    public final int method2249(boolean arg0) {
        if (arg0) {
            this.method2240((byte) -21, -24);
        }
        field5152++;
        return 1;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BI)V")
    public abstract void method2240(byte arg0, int arg1);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
    public abstract void method2241(byte arg0);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Z")
    public abstract boolean method2242(int arg0);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZII)V")
    public abstract void method2245(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "(I)Z")
    public abstract boolean method2248(int arg0);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lrq;Lrq;BI)V")
    public abstract void method2250(class470 arg0, class470 arg1, byte arg2, int arg3);
}
