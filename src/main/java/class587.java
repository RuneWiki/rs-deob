import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class587 extends class712 {

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "Z")
    private boolean field7993 = false;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "Z")
    private boolean field7986;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "[Lpda;")
    private class492[] field7985;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "[C")
    public static char[] field7990 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Lst;")
    public static class335 field7983 = new class335(34, 8);

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "Lkr;")
    public static class602 field7996 = new class602(11, 4);

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "Luu;")
    public static class237 field7997;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)V", line = 11)
    public final void method394(byte arg0, boolean arg1) {
        if (arg0 >= 39) {
            super.field9945.method1388(class87.field1239, (byte) 52, class179.field2467);
            ++field7991;
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(III)I", line = 22)
    public static final int method3392(int arg0, int arg1, int arg2) {
        if (arg2 < 50) {
            field7990 = null;
        }
        int var3 = (arg1 & 127) * arg0 >> 7;
        ++field7984;
        if (~var3 > -3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (65408 & arg1) + var3;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILhba;)V", line = 44)
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 == 0) {
            super.field9945.method1458(arg1 ^ 399403340, arg2);
            ++field7988;
            super.field9945.method1503(arg0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)V", line = 56)
    public final void method393(int arg0, int arg1, int arg2) {
        ++field7989;
        if (this.field7993) {
            super.field9945.method1431(0, 1);
            super.field9945.method1458(399403340, this.field7985[arg1 + -1]);
            super.field9945.method1431(0, 0);
        }
        if (arg2 <= 96) {
            method3393(15);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB)V", line = 75)
    public final void method399(boolean arg0, byte arg1) {
        if (arg1 < 44) {
            this.method399(false, (byte) 46);
        }
        ++field7987;
        if (this.field7985 != null && arg0) {
            super.field9945.method1431(0, 1);
            super.field9945.method338(class433.field6041, -128);
            class474 var3 = super.field9945.method1410((byte) -122);
            var3.method880(1024);
            super.field9945.method1460(class235.field3478, -128);
            if (this.field7986) {
                super.field9945.method1388(class87.field1239, (byte) 52, class161.field2237);
                super.field9945.method324(0, true, -9608, class15.field140, false);
                super.field9945.method1528(class684.field9515, false, 0);
            } else {
                super.field9945.method1388(class179.field2467, (byte) 52, class87.field1239);
                super.field9945.method1408(0, 0, class231.field3142);
                super.field9945.method1431(0, 2);
                super.field9945.method1388(class87.field1239, (byte) 52, class161.field2237);
                super.field9945.method1408(0, 0, class231.field3142);
                super.field9945.method324(1, true, -9608, class231.field3142, false);
                super.field9945.method1528(class684.field9515, false, 0);
                super.field9945.method1458(399403340, super.field9945.field3427);
            }
            super.field9945.method1431(0, 0);
            this.field7993 = true;
        } else {
            super.field9945.method1528(class684.field9515, false, 0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lrl;)V", line = 144)
    public class587(class232 arg0) {
        super(arg0);
        if (arg0.field3394) {
            this.field7986 = arg0.field3416 < 3;
            int var2 = this.field7986 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 == 1) {
                                var15 = var12;
                            } else if (var14 == 2) {
                                var15 = var13;
                            } else if (~var14 == -4) {
                                var15 = -var13;
                            } else if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field7985 = new class492[3];
            this.field7985[0] = super.field9945.method329(64, (byte) 75, var4, false);
            this.field7985[1] = super.field9945.method329(64, (byte) 75, var5, false);
            this.field7985[2] = super.field9945.method329(64, (byte) 75, var3, false);
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(Z)Z", line = 126)
    public final boolean method396(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field7994;
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)V", line = 262)
    public static void method3393(int arg0) {
        field7997 = null;
        field7983 = null;
        field7990 = null;
        field7996 = null;
        if (arg0 != 64) {
            method3393(-116);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V", line = 275)
    public final void method389(boolean arg0) {
        if (!this.field7993) {
            super.field9945.method1528(class15.field140, arg0, 0);
        } else {
            super.field9945.method1431(0, 1);
            super.field9945.method1458(399403340, (class190) null);
            super.field9945.method338(class134.field1909, -128);
            super.field9945.method1459(0);
            if (!this.field7986) {
                super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
                super.field9945.method1408(0, 0, class15.field140);
                super.field9945.method1431(0, 2);
                super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
                super.field9945.method1408(0, 0, class15.field140);
                super.field9945.method1408(1, 0, class231.field3142);
                super.field9945.method1528(class15.field140, false, 0);
                super.field9945.method1458(399403340, (class190) null);
            } else {
                super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
                super.field9945.method1408(0, 0, class15.field140);
                super.field9945.method1528(class15.field140, false, 0);
            }
            super.field9945.method1431(0, 0);
            this.field7993 = false;
        }
        if (arg0) {
            method3393(90);
        }
        ++field7992;
        super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
    }
}
