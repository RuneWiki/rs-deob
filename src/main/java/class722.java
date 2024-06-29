import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class722 {

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field9909 = -1;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "F")
    public static float field9920 = 1.0F;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Lcja;")
    private class46 field9916;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljava/lang/String;")
    private String field9900;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Ljava/lang/String;")
    private String field9904;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
    private int[] field9903;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
    private int[] field9905;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[I")
    private int[] field9906;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
    private int[] field9912;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "[I")
    private int[] field9913;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[I")
    private int[] field9915;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "[I")
    private int[] field9919;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "[I")
    private int[] field9921;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field9910;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field9918;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "[[I")
    private int[][] field9907;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[[I")
    private int[][] field9911;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[[I")
    private int[][] field9914;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lfca;B)V")
    public final void method3997(class93 arg0, byte arg1) {
        field9917++;
        while (true) {
            int var3 = arg0.method793((byte) 106);
            if (var3 == 0) {
                if (arg1 > -26) {
                    this.method3999(null, 79, -1);
                    return;
                } else {
                    return;
                }
            }
            this.method3999(arg0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public final void method3998(byte arg0) {
        if (this.field9900 == null) {
            this.field9900 = this.field9904;
        }
        field9902++;
        int var2 = 83 % ((39 - arg0) / 46);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lfca;II)V")
    private final void method3999(class93 arg0, int arg1, int arg2) {
        field9908++;
        if (arg1 == arg2) {
            this.field9904 = arg0.method795(-15475);
        } else if (arg1 == 2) {
            this.field9900 = arg0.method795(-15475);
        } else if (arg1 == 3) {
            int var4 = arg0.method793((byte) 59);
            this.field9914 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9914[var5][0] = arg0.method763(-58);
                this.field9914[var5][1] = arg0.method773(3);
                this.field9914[var5][2] = arg0.method773(class18.method125(arg2, 2));
            }
        } else if (arg1 == 4) {
            int var6 = arg0.method793((byte) 77);
            this.field9911 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field9911[var7][0] = arg0.method763(-124);
                this.field9911[var7][1] = arg0.method773(3);
                this.field9911[var7][2] = arg0.method773(3);
            }
        } else if (arg1 == 5) {
            arg0.method763(-74);
        } else if (arg1 == 6) {
            arg0.method793((byte) 112);
        } else if (arg1 == 7) {
            arg0.method793((byte) 100);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method793((byte) 66);
                return;
            }
            if (arg1 == 10) {
                int var8 = arg0.method793((byte) 120);
                this.field9903 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field9903[var9] = arg0.method773(arg2 + 2);
                }
                return;
            }
            if (arg1 == 12) {
                arg0.method773(3);
                return;
            }
            if (arg1 != 13) {
                if (arg1 == 14) {
                    int var10 = arg0.method793((byte) 9);
                    this.field9907 = new int[var10][2];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field9907[var11][0] = arg0.method793((byte) 32);
                        this.field9907[var11][1] = arg0.method793((byte) 49);
                    }
                    return;
                }
                if (arg1 == 15) {
                    arg0.method763(-43);
                    return;
                }
                if (arg1 == 17) {
                    this.field9909 = arg0.method763(-78);
                    return;
                }
                if (arg1 == 18) {
                    int var12 = arg0.method793((byte) 51);
                    this.field9905 = new int[var12];
                    this.field9921 = new int[var12];
                    this.field9910 = new String[var12];
                    this.field9913 = new int[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field9905[var13] = arg0.method773(3);
                        this.field9913[var13] = arg0.method773(3);
                        this.field9921[var13] = arg0.method773(3);
                        this.field9910[var13] = arg0.method752(0);
                    }
                    return;
                }
                if (arg1 == 19) {
                    int var20 = arg0.method793((byte) 20);
                    this.field9906 = new int[var20];
                    this.field9919 = new int[var20];
                    this.field9912 = new int[var20];
                    this.field9918 = new String[var20];
                    for (int var21 = 0; var21 < var20; var21++) {
                        this.field9919[var21] = arg0.method773(3);
                        this.field9906[var21] = arg0.method773(3);
                        this.field9912[var21] = arg0.method773(arg2 + 2);
                        this.field9918[var21] = arg0.method752(0);
                    }
                } else if (arg1 == 249) {
                    int var14 = arg0.method793((byte) 7);
                    if (this.field9916 == null) {
                        int var15 = class241.method1609((byte) -127, var14);
                        this.field9916 = new class46(var15);
                    }
                    for (int var16 = 0; var16 < var14; var16++) {
                        boolean var17 = arg0.method793((byte) 31) == 1;
                        int var18 = arg0.method767((byte) -120);
                        class154 var19;
                        if (var17) {
                            var19 = new class682(arg0.method752(0));
                        } else {
                            var19 = new class345(arg0.method773(3));
                        }
                        this.field9916.method341((long) var18, var19, (byte) 113);
                    }
                    return;
                }
                return;
            }
            int var22 = arg0.method793((byte) 19);
            this.field9915 = new int[var22];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field9915[var23] = arg0.method763(-43);
            }
            return;
        }
    }
}
