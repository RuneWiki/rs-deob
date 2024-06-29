import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 extends class196 {

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    private final int field593;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    private final int field586;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    private final int field596;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    private final int field600;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field585 = -1;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "Loa;")
    public static class99 field590 = class221.method1463(2844, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field591 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "[I")
    public static int[] field581 = new int[100];

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "Loa;")
    public static class99 field588 = class221.method1463(2844, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "[I")
    public static int[] field598 = new int[4096];

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB[B)I")
    public static final int method268(int arg0, byte arg1, byte[] arg2) {
        if (arg1 != -39) {
            return 31;
        } else {
            ++field595;
            return class208.method1391(false, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZ)I")
    public static final int method269(int arg0, int arg1, boolean arg2) {
        ++field584;
        class9 var3 = (class9) class277.field4868.method1550(arg2, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (!arg2) {
                field585 = -88;
            }
            while (var3.field69.length > var5) {
                if (~var3.field66[var5] == ~arg1) {
                    var4 += var3.field69[var5];
                }
                ++var5;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method270(byte arg0) {
        field598 = null;
        field588 = null;
        field590 = null;
        if (arg0 <= 114) {
            field590 = null;
        }
        field581 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)V")
    public final void method271(int arg0, int arg1, byte arg2) {
        ++field589;
        if (arg2 != 108) {
            field590 = null;
        }
        int var4 = this.field593 * arg0 >> 12;
        int var5 = this.field596 * arg0 >> 12;
        int var6 = this.field600 * arg1 >> 12;
        int var7 = this.field586 * arg1 >> 12;
        class143.method965(-120, var4, var7, var5, var6, super.field3421);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)V")
    public static final void method272(byte arg0, int arg1, int arg2) {
        ++field587;
        class65 var3 = class152.method1010(arg2, 5, (byte) -81);
        if (arg0 != 24) {
            field588 = null;
        }
        var3.method433(arg0 + 8);
        var3.field1094 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILik;)Lbl;")
    public static final class33 method273(int arg0, class261 arg1) {
        ++field594;
        return arg0 != 12062 ? null : new class33(arg1.method1751(arg0 ^ 12190), arg1.method1751(arg0 ^ 12190), arg1.method1751(arg0 + -11934), arg1.method1751(128), arg1.method1747(false), arg1.method1747(false), arg1.method1693((byte) -102));
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
    public static final void method274(byte arg0, int arg1) {
        ++field597;
        short var2 = 256;
        if (~arg1 < ~var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class123.field2163 += arg1 * 128;
        if (~class219.field3818.length > ~class123.field2163) {
            class123.field2163 -= class219.field3818.length;
            int var3 = (int) (Math.random() * 12.0D);
            class19.method114((byte) 96, class90.field1538[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (-arg1 + var2) * 128;
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            int var26 = class219.field3817[var4 + var5] + -(class219.field3818[class123.field2163 + var4 & class219.field3818.length + -1] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class219.field3817[var4++] = var26;
        }
        for (int var8 = -arg1 + var2; ~var8 > ~var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && ~var24 < -11 && var24 < 118) {
                    class219.field3817[var23 + var24] = 255;
                } else {
                    class219.field3817[var24 - -var23] = 0;
                }
            }
        }
        if (arg0 == -119) {
            for (int var9 = 0; ~var9 > ~(-arg1 + var2); ++var9) {
                class167.field2974[var9] = class167.field2974[arg1 + var9];
            }
            for (int var10 = -arg1 + var2; var10 < var2; ++var10) {
                class167.field2974[var10] = (int) (Math.sin((double) class185.field3281 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class185.field3281 / 15.0D) + 12.0D * Math.sin((double) class185.field3281 / 16.0D));
                ++class185.field3281;
            }
            int var11 = (arg1 - -(class56.field926 & 1)) / 2;
            class291.field5106 += arg1;
            if (var11 > 0) {
                for (int var12 = 0; ~class291.field5106 < ~var12; ++var12) {
                    int var21 = (int) (124.0D * Math.random()) + 2;
                    int var22 = (int) (128.0D * Math.random()) - -128;
                    class219.field3817[(var22 << 7) + var21] = 192;
                }
                class291.field5106 = 0;
                for (int var13 = 0; var13 < var2; ++var13) {
                    int var18 = 0;
                    int var19 = var13 * 128;
                    for (int var20 = -var11; ~var20 > -129; ++var20) {
                        if (~(var11 + var20) > -129) {
                            var18 += class219.field3817[var19 + var20 + var11];
                        }
                        if (-1 - (var11 - var20) >= 0) {
                            var18 -= class219.field3817[-1 - (var11 - var19) + var20];
                        }
                        if (~var20 <= -1) {
                            class85.field1478[var19 + var20] = var18 / (var11 * 2 + 1);
                        }
                    }
                }
                for (int var14 = 0; var14 < 128; ++var14) {
                    int var15 = 0;
                    for (int var16 = -var11; ~var16 > ~var2; ++var16) {
                        int var17 = var16 * 128;
                        if (var2 > var11 + var16) {
                            var15 += class85.field1478[var11 * 128 + var14 + var17];
                        }
                        if (var16 - var11 - 1 >= 0) {
                            var15 -= class85.field1478[var14 + var17 - (var11 * 128 + 128)];
                        }
                        if (~var16 <= -1) {
                            class219.field3817[var14 - -var17] = var15 / (var11 * 2 + 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        ++field599;
        int var4 = this.field593 * arg0 >> 12;
        int var5 = this.field600 * arg1 >> 12;
        int var6 = this.field586 * arg1 >> 12;
        int var7 = this.field596 * arg0 >> 12;
        class281.method1850(super.field3412, var6, 107, var7, var5, super.field3422, var4);
        if (arg2 != 205) {
            field588 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    public static final void method276(int arg0, int arg1) {
        ++field580;
        class248.field4269.method1809(arg0, (byte) -70);
        if (arg1 != -13182) {
            field598 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIII)V")
    private class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field593 = arg0;
        this.field586 = arg3;
        this.field596 = arg2;
        this.field600 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        int var4 = this.field593 * arg0 >> 12;
        ++field582;
        int var5 = this.field596 * arg0 >> 12;
        int var6 = this.field600 * arg1 >> 12;
        int var7 = this.field586 * arg1 >> 12;
        class193.method1305(super.field3412, arg2, var7, var6, super.field3421, var5, var4, super.field3422);
    }
}
