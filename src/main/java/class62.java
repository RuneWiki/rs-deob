import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class62 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public int field889 = -1;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[I")
    public static int[] field891 = new int[500];

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field906 = -1;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lhe;")
    private class372 field905;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/lang/String;")
    private String field894;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Ljava/lang/String;")
    private String field902;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[I")
    private int[] field886;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "[I")
    private int[] field892;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
    private int[] field893;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "[I")
    private int[] field895;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
    private int[] field897;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
    private int[] field899;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "[I")
    private int[] field901;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[I")
    private int[] field907;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field887;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field888;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[[I")
    private int[][] field896;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[[I")
    private int[][] field900;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[[I")
    private int[][] field904;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method559(boolean arg0) {
        field891 = null;
        if (arg0) {
            method559(false);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLrg;I)V")
    private final void method560(boolean arg0, class645 arg1, int arg2) {
        if (arg2 == 1) {
            this.field894 = arg1.method3696(-108);
        } else if (arg2 == 2) {
            this.field902 = arg1.method3696(-114);
        } else if (arg2 == 3) {
            int var22 = arg1.method3745(-6314);
            this.field904 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field904[var23][0] = arg1.method3712((byte) -113);
                this.field904[var23][1] = arg1.method3720(-19541);
                this.field904[var23][2] = arg1.method3720(-19541);
            }
        } else if (arg2 == 4) {
            int var20 = arg1.method3745(-6314);
            this.field900 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field900[var21][0] = arg1.method3712((byte) -116);
                this.field900[var21][1] = arg1.method3720(-19541);
                this.field900[var21][2] = arg1.method3720(-19541);
            }
        } else if (arg2 == 5) {
            arg1.method3712((byte) -15);
        } else if (arg2 == 6) {
            arg1.method3745(-6314);
        } else if (arg2 == 7) {
            arg1.method3745(-6314);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method3745(-6314);
            } else if (arg2 == 10) {
                int var18 = arg1.method3745(-6314);
                this.field892 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field892[var19] = arg1.method3720(-19541);
                }
            } else if (arg2 == 12) {
                arg1.method3720(-19541);
            } else if (arg2 == 13) {
                int var16 = arg1.method3745(-6314);
                this.field899 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field899[var17] = arg1.method3712((byte) -118);
                }
            } else if (arg2 == 14) {
                int var14 = arg1.method3745(-6314);
                this.field896 = new int[var14][2];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field896[var15][0] = arg1.method3745(-6314);
                    this.field896[var15][1] = arg1.method3745(-6314);
                }
            } else if (arg2 == 15) {
                arg1.method3712((byte) 14);
            } else if (arg2 == 17) {
                this.field889 = arg1.method3712((byte) 115);
            } else if (arg2 == 18) {
                int var4 = arg1.method3745(-6314);
                this.field886 = new int[var4];
                this.field888 = new String[var4];
                this.field907 = new int[var4];
                this.field901 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field901[var5] = arg1.method3720(-19541);
                    this.field886[var5] = arg1.method3720(-19541);
                    this.field907[var5] = arg1.method3720(-19541);
                    this.field888[var5] = arg1.method3752(-2);
                }
            } else if (arg2 == 19) {
                int var6 = arg1.method3745(-6314);
                this.field895 = new int[var6];
                this.field893 = new int[var6];
                this.field887 = new String[var6];
                this.field897 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field897[var7] = arg1.method3720(-19541);
                    this.field893[var7] = arg1.method3720(-19541);
                    this.field895[var7] = arg1.method3720(-19541);
                    this.field887[var7] = arg1.method3752(-2);
                }
            } else if (arg2 == 249) {
                int var8 = arg1.method3745(-6314);
                if (this.field905 == null) {
                    int var9 = class432.method2684(var8, -21774);
                    this.field905 = new class372(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg1.method3745(-6314) == 1;
                    int var12 = arg1.method3747((byte) -74);
                    class184 var13;
                    if (var11) {
                        var13 = new class139(arg1.method3752(-2));
                    } else {
                        var13 = new class317(arg1.method3720(-19541));
                    }
                    this.field905.method2278((byte) -121, (long) var12, var13);
                }
            }
        }
        if (!arg0) {
            this.method561(null, -122);
        }
        field903++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lrg;I)V")
    public final void method561(class645 arg0, int arg1) {
        if (arg1 != 0) {
            method559(false);
        }
        while (true) {
            int var3 = arg0.method3745(arg1 ^ 0xFFFFE756);
            if (var3 == 0) {
                field890++;
                return;
            }
            this.method560(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public final void method562(int arg0) {
        if (arg0 != 15) {
            this.method562(-51);
        }
        if (this.field902 == null) {
            this.field902 = this.field894;
        }
        field898++;
    }
}
