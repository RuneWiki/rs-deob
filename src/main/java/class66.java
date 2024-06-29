import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class66 {

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public int field837 = -1;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "[Leb;")
    public static class449[] field834 = new class449[14];

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "Lfc;")
    public static class174 field842 = new class174(5);

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "[Z")
    public static boolean[] field845 = new boolean[100];

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "[I")
    public static int[] field846 = new int[4096];

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Lqi;")
    private class406 field827;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "Ljava/lang/String;")
    private String field835;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "Ljava/lang/String;")
    private String field844;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "[I")
    private int[] field829;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "[I")
    private int[] field830;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "[I")
    private int[] field838;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "[I")
    private int[] field840;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "[I")
    private int[] field841;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "[I")
    private int[] field843;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field832;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field836;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "[[I")
    private int[][] field825;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "[[I")
    private int[][] field826;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "[[I")
    private int[][] field828;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lwm;I)V")
    public final void method521(class403 arg0, int arg1) {
        field839++;
        while (true) {
            int var3 = arg0.method2357((byte) 127);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.field824 = null;
                    return;
                }
            }
            this.method524(var3, 66, arg0);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public final void method522(boolean arg0) {
        if (arg0) {
            field833++;
            if (this.field844 == null) {
                this.field844 = this.field835;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[J[I)V")
    public static final void method523(int arg0, long[] arg1, int[] arg2) {
        field831++;
        class113.method761(arg2, arg0, arg1.length - 1, (byte) 20, arg1);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILwm;)V")
    private final void method524(int arg0, int arg1, class403 arg2) {
        if (arg1 < 22) {
            this.method524(98, -7, null);
        }
        field847++;
        if (arg0 == 1) {
            this.field835 = arg2.method2367(-5042);
        } else if (arg0 == 2) {
            this.field844 = arg2.method2367(-5042);
        } else if (arg0 == 3) {
            int var22 = arg2.method2357((byte) 121);
            this.field826 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field826[var23][0] = arg2.method2338(0);
                this.field826[var23][1] = arg2.method2319((byte) 115);
                this.field826[var23][2] = arg2.method2319((byte) 120);
            }
        } else if (arg0 == 4) {
            int var4 = arg2.method2357((byte) 115);
            this.field828 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field828[var5][0] = arg2.method2338(0);
                this.field828[var5][1] = arg2.method2319((byte) 126);
                this.field828[var5][2] = arg2.method2319((byte) 79);
            }
        } else if (arg0 == 5) {
            arg2.method2338(0);
        } else if (arg0 == 6) {
            arg2.method2357((byte) 116);
        } else if (arg0 == 7) {
            arg2.method2357((byte) 105);
            return;
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method2357((byte) 106);
                return;
            }
            if (arg0 == 10) {
                int var6 = arg2.method2357((byte) 109);
                this.field843 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field843[var7] = arg2.method2319((byte) 78);
                }
                return;
            }
            if (arg0 == 12) {
                arg2.method2319((byte) 79);
                return;
            }
            if (arg0 == 13) {
                int var8 = arg2.method2357((byte) 118);
                this.field824 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field824[var9] = arg2.method2338(0);
                }
                return;
            }
            if (arg0 != 14) {
                if (arg0 == 15) {
                    arg2.method2338(0);
                    return;
                }
                if (arg0 == 17) {
                    this.field837 = arg2.method2338(0);
                    return;
                }
                if (arg0 == 18) {
                    int var10 = arg2.method2357((byte) 120);
                    this.field838 = new int[var10];
                    this.field840 = new int[var10];
                    this.field829 = new int[var10];
                    this.field832 = new String[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field840[var11] = arg2.method2319((byte) 80);
                        this.field829[var11] = arg2.method2319((byte) 75);
                        this.field838[var11] = arg2.method2319((byte) 94);
                        this.field832[var11] = arg2.method2356(-25178);
                    }
                    return;
                }
                if (arg0 == 19) {
                    int var18 = arg2.method2357((byte) 116);
                    this.field830 = new int[var18];
                    this.field841 = new int[var18];
                    this.field836 = new String[var18];
                    this.field823 = new int[var18];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field823[var19] = arg2.method2319((byte) 123);
                        this.field830[var19] = arg2.method2319((byte) 86);
                        this.field841[var19] = arg2.method2319((byte) 117);
                        this.field836[var19] = arg2.method2356(-25178);
                    }
                } else if (arg0 == 249) {
                    int var12 = arg2.method2357((byte) 108);
                    if (this.field827 == null) {
                        int var13 = class280.method1749(-31679, var12);
                        this.field827 = new class406(var13);
                    }
                    for (int var14 = 0; var14 < var12; var14++) {
                        boolean var15 = arg2.method2357((byte) 105) == 1;
                        int var16 = arg2.method2323((byte) 82);
                        class498 var17;
                        if (var15) {
                            var17 = new class74(arg2.method2356(-25178));
                        } else {
                            var17 = new class254(arg2.method2319((byte) 122));
                        }
                        this.field827.method2413((long) var16, var17, -1);
                    }
                    return;
                }
                return;
            }
            int var20 = arg2.method2357((byte) 124);
            this.field825 = new int[var20][2];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field825[var21][0] = arg2.method2357((byte) 126);
                this.field825[var21][1] = arg2.method2357((byte) 112);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method525(int arg0) {
        if (arg0 != 0) {
            field846 = null;
        }
        field842 = null;
        field846 = null;
        field845 = null;
        field834 = null;
    }
}
