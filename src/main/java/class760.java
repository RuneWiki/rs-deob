import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class760 implements class126 {

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "Lvd;")
    private class39 field10610;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "Ljava/lang/String;")
    private String field10611;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public static int field10604 = 0;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "[I")
    public static int[] field10603 = new int[8];

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field10602;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field10605;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field10606;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "Lcs;")
    public static class342 field10609;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "[[[Z")
    public static boolean[][][] field10608;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V")
    public static final void method4229(boolean arg0, int arg1) {
        for (class449 var2 = (class449) class269.field3852.method1195(0); var2 != null; var2 = (class449) class269.field3852.method1201(2)) {
            if (var2.field6659 != null) {
                class171.field2666.method3834(var2.field6659);
                var2.field6659 = null;
            }
            if (var2.field6656 != null) {
                class171.field2666.method3834(var2.field6656);
                var2.field6656 = null;
            }
            var2.method1304((byte) 7);
        }
        if (arg1 < 121) {
            method4229(true, -18);
        }
        field10602++;
        if (!arg0) {
            return;
        }
        for (class449 var3 = (class449) class478.field6929.method1195(0); var3 != null; var3 = (class449) class478.field6929.method1201(2)) {
            if (var3.field6659 != null) {
                class171.field2666.method3834(var3.field6659);
                var3.field6659 = null;
            }
            var3.method1304((byte) 7);
        }
        for (class449 var4 = (class449) class87.field1236.method2283(false); var4 != null; var4 = (class449) class87.field1236.method2282((byte) 31)) {
            if (var4.field6659 != null) {
                class171.field2666.method3834(var4.field6659);
                var4.field6659 = null;
            }
            var4.method1304((byte) 7);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)Lgj;")
    public final class637 method27(int arg0) {
        if (arg0 >= -40) {
            this.field10611 = null;
        }
        field10606++;
        return class637.field8940;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
    public static void method4230(byte arg0) {
        field10609 = null;
        if (arg0 != -110) {
            field10603 = null;
        }
        field10608 = null;
        field10603 = null;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I")
    public final int method31(byte arg0) {
        if (arg0 > -16) {
            this.method31((byte) -80);
        }
        field10605++;
        return this.field10610.method234(this.field10611, (byte) 125) ? 100 : 0;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Luf;IIIBI)V")
    public static final void method4231(class449 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field10607++;
        if (arg0.field6641 == -1 && arg0.field6644 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg0.field6651 * class63.field916.field10211.method2268(17503) >> 8;
        if (arg0.field6650 < arg1) {
            var6 += arg1 - arg0.field6650;
        } else if (arg0.field6636 > arg1) {
            var6 += arg0.field6636 - arg1;
        }
        if (arg0.field6658 < arg2) {
            var6 += arg2 - arg0.field6658;
        } else if (arg2 < arg0.field6637) {
            var6 += arg0.field6637 - arg2;
        }
        if (arg0.field6632 == 0 || arg0.field6632 < (var6 - 256) || class63.field916.field10211.method2268(17503) == 0 || arg0.field6639 != arg5) {
            if (arg0.field6659 != null) {
                class171.field2666.method3834(arg0.field6659);
                arg0.field6631 = null;
                arg0.field6642 = null;
                arg0.field6659 = null;
            }
            if (arg0.field6656 != null) {
                class171.field2666.method3834(arg0.field6656);
                arg0.field6645 = null;
                arg0.field6656 = null;
                arg0.field6661 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg0.field6632 - arg0.field6648;
        if (var8 < 0) {
            var8 = arg0.field6632;
        }
        int var9 = var7;
        int var10 = var6 - arg0.field6648;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class130.field1749.method2579(false);
        int var11 = 8192;
        int var12 = (arg0.field6650 + arg0.field6636) / 2 - arg1;
        int var13 = (arg0.field6658 + arg0.field6637) / 2 - arg2;
        if (var12 != 0 || var13 != 0) {
            int var14 = -class660.field9234 - ((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D) + 4096) & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 >= 4096) {
                var15 = 16384;
            } else {
                var15 = (var6 * 8192 / 4096) + 8192;
            }
            var11 = (16384 - var15 >> 1) + var14 * var15 / 8192;
        }
        if (arg0.field6659 != null) {
            arg0.field6659.method3448(var9);
            arg0.field6659.method3435(var11);
        } else if (arg0.field6641 >= 0) {
            int var16 = arg0.field6635 == 256 && arg0.field6649 == 256 ? 256 : class320.method2027(arg0.field6635, arg0.field6649, (byte) -9);
            if (arg0.field6638) {
                if (arg0.field6631 == null) {
                    arg0.field6631 = class552.method3226(class555.field7932, arg0.field6641);
                }
                if (arg0.field6631 != null) {
                    if (arg0.field6642 == null) {
                        arg0.field6642 = arg0.field6631.method3225(new int[] { 22050 });
                    }
                    if (arg0.field6642 != null) {
                        class591 var17 = class591.method3458(arg0.field6642, var16, var9 << 6, var11);
                        var17.method3433(-1);
                        class171.field2666.method3835(var17);
                        arg0.field6659 = var17;
                    }
                }
            } else {
                class747 var18 = class747.method4174(class756.field10584, arg0.field6641, 0);
                if (var18 != null) {
                    class125 var19 = var18.method4175().method888(class229.field3370);
                    class591 var20 = class591.method3458(var19, var16, var9 << 6, var11);
                    var20.method3433(-1);
                    class171.field2666.method3835(var20);
                    arg0.field6659 = var20;
                }
            }
        }
        if (arg0.field6656 != null) {
            arg0.field6656.method3448(var9);
            arg0.field6656.method3435(var11);
            if (!arg0.field6656.method1303((byte) 26)) {
                arg0.field6645 = null;
                arg0.field6661 = null;
                arg0.field6656 = null;
            }
        } else if (arg0.field6644 != null && (arg0.field6647 -= arg3) <= 0) {
            int var21 = arg0.field6635 == 256 && arg0.field6649 == 256 ? 256 : arg0.field6649 + (int) ((double) (arg0.field6635 - arg0.field6649) * Math.random());
            if (arg0.field6657) {
                if (arg0.field6645 == null) {
                    int var22 = (int) (Math.random() * (double) arg0.field6644.length);
                    arg0.field6645 = class552.method3226(class555.field7932, arg0.field6644[var22]);
                }
                if (arg0.field6645 != null) {
                    if (arg0.field6661 == null) {
                        arg0.field6661 = arg0.field6645.method3225(new int[] { 22050 });
                    }
                    if (arg0.field6661 != null) {
                        class591 var23 = class591.method3458(arg0.field6661, var21, var9 << 6, var11);
                        var23.method3433(0);
                        class171.field2666.method3835(var23);
                        arg0.field6647 = arg0.field6643 + ((int) ((double) (arg0.field6652 - arg0.field6643) * Math.random()));
                        arg0.field6656 = var23;
                    }
                }
            } else {
                int var24 = (int) (Math.random() * (double) arg0.field6644.length);
                class747 var25 = class747.method4174(class756.field10584, arg0.field6644[var24], 0);
                if (var25 != null) {
                    class125 var26 = var25.method4175().method888(class229.field3370);
                    class591 var27 = class591.method3458(var26, var21, var9 << 6, var11);
                    var27.method3433(0);
                    class171.field2666.method3835(var27);
                    arg0.field6647 = arg0.field6643 + (int) (Math.random() * (double) (arg0.field6652 - arg0.field6643));
                    arg0.field6656 = var27;
                }
            }
        }
        if (arg4 > -31) {
            method4230((byte) 103);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lvd;Ljava/lang/String;)V")
    public class760(class39 arg0, String arg1) {
        this.field10610 = arg0;
        this.field10611 = arg1;
    }
}
