import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class165 {

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public int field2021 = -1;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    public static int[] field2031;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lsd;")
    private class80 field2016;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Ljava/lang/String;")
    private String field2029;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Ljava/lang/String;")
    private String field2036;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
    private int[] field2018;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    private int[] field2020;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
    private int[] field2023;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
    private int[] field2030;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "[I")
    private int[] field2032;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "[I")
    private int[] field2033;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
    private int[] field2034;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "[I")
    private int[] field2037;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field2022;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field2028;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[[I")
    private int[][] field2015;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[[I")
    private int[][] field2017;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[[I")
    private int[][] field2019;

    static {
        new class474("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field2031 = new int[1];
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lrt;II)V", line = 19)
    private final void method953(class194 arg0, int arg1, int arg2) {
        field2024++;
        if (arg2 == 1) {
            this.field2036 = arg0.method1201(-29266);
        } else if (arg2 == 2) {
            this.field2029 = arg0.method1201(arg1 - 29266);
        } else if (arg2 == 3) {
            int var22 = arg0.method1177(255);
            this.field2015 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2015[var23][0] = arg0.method1220(120);
                this.field2015[var23][1] = arg0.method1178(-230315992);
                this.field2015[var23][2] = arg0.method1178(arg1 - 230315992);
            }
        } else if (arg2 == 4) {
            int var20 = arg0.method1177(255);
            this.field2017 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field2017[var21][0] = arg0.method1220(-82);
                this.field2017[var21][1] = arg0.method1178(-230315992);
                this.field2017[var21][2] = arg0.method1178(arg1 - 230315992);
            }
        } else if (arg2 == 5) {
            arg0.method1220(124);
        } else if (arg2 == 6) {
            arg0.method1177(255);
        } else if (arg2 == 7) {
            arg0.method1177(255);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method1177(255);
            } else if (arg2 == 10) {
                int var4 = arg0.method1177(255);
                this.field2020 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2020[var5] = arg0.method1178(-230315992);
                }
            } else if (arg2 == 12) {
                arg0.method1178(arg1 - 230315992);
            } else if (arg2 == 13) {
                int var18 = arg0.method1177(255);
                this.field2037 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field2037[var19] = arg0.method1220(126);
                }
            } else if (arg2 == 14) {
                int var6 = arg0.method1177(255);
                this.field2019 = new int[var6][2];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2019[var7][0] = arg0.method1177(255);
                    this.field2019[var7][1] = arg0.method1177(255);
                }
            } else if (arg2 == 15) {
                arg0.method1220(-108);
            } else if (arg2 == 17) {
                this.field2021 = arg0.method1220(-82);
            } else if (arg2 == 18) {
                int var16 = arg0.method1177(255);
                this.field2030 = new int[var16];
                this.field2018 = new int[var16];
                this.field2022 = new String[var16];
                this.field2033 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field2018[var17] = arg0.method1178(-230315992);
                    this.field2033[var17] = arg0.method1178(-230315992);
                    this.field2030[var17] = arg0.method1178(-230315992);
                    this.field2022[var17] = arg0.method1218(false);
                }
            } else if (arg2 == 19) {
                int var14 = arg0.method1177(255);
                this.field2032 = new int[var14];
                this.field2028 = new String[var14];
                this.field2023 = new int[var14];
                this.field2034 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field2034[var15] = arg0.method1178(class92.method583(arg1, -230315992));
                    this.field2023[var15] = arg0.method1178(arg1 - 230315992);
                    this.field2032[var15] = arg0.method1178(-230315992);
                    this.field2028[var15] = arg0.method1218(false);
                }
            } else if (arg2 == 249) {
                int var8 = arg0.method1177(arg1 ^ 0xFF);
                if (this.field2016 == null) {
                    int var9 = class367.method2354(-224121456, var8);
                    this.field2016 = new class80(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method1177(255) == 1;
                    int var12 = arg0.method1180(-832631516);
                    class324 var13;
                    if (var11) {
                        var13 = new class621(arg0.method1218(false));
                    } else {
                        var13 = new class388(arg0.method1178(-230315992));
                    }
                    this.field2016.method520((byte) -61, var13, (long) var12);
                }
            }
        }
        if (arg1 != 0) {
            method958((byte) 29);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lrt;B)V", line = 249)
    public final void method954(class194 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                int var4 = 101 / ((-arg1 - 55) / 47);
                field2027++;
                return;
            }
            this.method953(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 280)
    public static final void method955(int arg0) {
        if (arg0 != -16) {
            method959((byte) -111);
        }
        field2026++;
        class567[] var1 = class254.field3627;
        synchronized (class254.field3627) {
            for (int var2 = 0; var2 < class254.field3627.length; var2++) {
                class254.field3627[var2] = new class567();
                class609.field8883[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 315)
    public final void method956(int arg0) {
        if (this.field2029 == null) {
            this.field2029 = this.field2036;
        }
        field2038++;
        if (arg0 != 0) {
            this.field2016 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V", line = 337)
    public static final void method957(int arg0, int arg1, int arg2, int arg3) {
        field2035++;
        if (arg1 == arg3) {
            class6.field58++;
            class308.method2044(class325.field4693, -7434);
        }
        if (arg3 == 1) {
            class308.method2044(class573.field8274, -7434);
            class292.field4040++;
        }
        class468.field6960.method1231((byte) -93, class280.field3915.method284(arg1 ^ 0xFFFFFFA1, 82) ? 1 : 0);
        class468.field6960.method1216(arg2 + class250.field3549, arg1 ^ 0xFFFFCCC1);
        class468.field6960.method1235(class287.field3980 + arg0, (byte) 11);
        class82.field925 = arg0;
        class87.field992 = false;
        class50.field531 = arg2;
        class304.method2026((byte) 73);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 365)
    public static final void method958(byte arg0) {
        field2025++;
        class150.method888();
        for (int var1 = 0; var1 < 4; var1++) {
            class14.field120[var1].method2870(true);
        }
        class635.method3622((byte) -109);
        class457.method2821((byte) -118);
        if (arg0 <= 16) {
            field2031 = null;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 397)
    public static void method959(byte arg0) {
        field2031 = null;
        if (arg0 > -52) {
            field2031 = null;
        }
    }
}
