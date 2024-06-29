import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class636 {

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public int field8861 = -1;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field8842 = 999999;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field8849 = new String[200];

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Lbc;")
    private class9 field8863;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/lang/String;")
    private String field8845;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Ljava/lang/String;")
    private String field8850;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    private int[] field8846;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    private int[] field8847;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[I")
    private int[] field8848;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
    private int[] field8853;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
    private int[] field8854;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "[I")
    private int[] field8855;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[I")
    private int[] field8859;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "[I")
    private int[] field8866;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field8856;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field8857;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[[I")
    private int[][] field8844;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[[I")
    private int[][] field8851;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "[[I")
    private int[][] field8864;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILfd;I)V", line = 3)
    private final void method3511(int arg0, class418 arg1, int arg2) {
        if (arg2 == 1) {
            this.field8850 = arg1.method2372(-55);
        } else if (arg2 == 2) {
            this.field8845 = arg1.method2372(-116);
        } else if (arg2 == 3) {
            int var22 = arg1.method2396(122);
            this.field8844 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field8844[var23][0] = arg1.method2393(-30727);
                this.field8844[var23][1] = arg1.method2355(49);
                this.field8844[var23][2] = arg1.method2355(48);
            }
        } else if (arg2 == 4) {
            int var20 = arg1.method2396(-116);
            this.field8851 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field8851[var21][0] = arg1.method2393(-30727);
                this.field8851[var21][1] = arg1.method2355(53);
                this.field8851[var21][2] = arg1.method2355(99);
            }
        } else if (arg2 == 5) {
            arg1.method2393(-30727);
        } else if (arg2 == 6) {
            arg1.method2396(52);
        } else if (arg2 == 7) {
            arg1.method2396(-26);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method2396(-20);
            } else if (arg2 == 10) {
                int var4 = arg1.method2396(-102);
                this.field8848 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field8848[var5] = arg1.method2355(30);
                }
            } else if (arg2 == 12) {
                arg1.method2355(119);
            } else if (arg2 == 13) {
                int var18 = arg1.method2396(-112);
                this.field8854 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field8854[var19] = arg1.method2393(-30727);
                }
            } else if (arg2 == 14) {
                int var6 = arg1.method2396(-110);
                this.field8864 = new int[var6][2];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field8864[var7][0] = arg1.method2396(-112);
                    this.field8864[var7][1] = arg1.method2396(-102);
                }
            } else if (arg2 == 15) {
                arg1.method2393(-30727);
            } else if (arg2 == 17) {
                this.field8861 = arg1.method2393(-30727);
            } else if (arg2 == 18) {
                int var16 = arg1.method2396(-126);
                this.field8866 = new int[var16];
                this.field8856 = new String[var16];
                this.field8855 = new int[var16];
                this.field8847 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field8855[var17] = arg1.method2355(44);
                    this.field8866[var17] = arg1.method2355(86);
                    this.field8847[var17] = arg1.method2355(116);
                    this.field8856[var17] = arg1.method2394(4);
                }
            } else if (arg2 == 19) {
                int var14 = arg1.method2396(-128);
                this.field8859 = new int[var14];
                this.field8853 = new int[var14];
                this.field8857 = new String[var14];
                this.field8846 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field8859[var15] = arg1.method2355(48);
                    this.field8846[var15] = arg1.method2355(125);
                    this.field8853[var15] = arg1.method2355(115);
                    this.field8857[var15] = arg1.method2394(4);
                }
            } else if (arg2 == 249) {
                int var8 = arg1.method2396(-114);
                if (this.field8863 == null) {
                    int var9 = class426.method2447(var8, 250);
                    this.field8863 = new class9(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg1.method2396(73) == 1;
                    int var12 = arg1.method2364(-108);
                    class424 var13;
                    if (var11) {
                        var13 = new class181(arg1.method2394(4));
                    } else {
                        var13 = new class195(arg1.method2355(83));
                    }
                    this.field8863.method38(var13, -111, (long) var12);
                }
            }
        }
        if (arg0 <= 12) {
            this.method3514(null, (byte) 43);
        }
        field8858++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 240)
    public final void method3512(int arg0) {
        if (arg0 == -22311) {
            if (this.field8845 == null) {
                this.field8845 = this.field8850;
            }
            field8865++;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZLjava/lang/String;)V", line = 258)
    public static final void method3513(boolean arg0, boolean arg1, String arg2) {
        field8843++;
        if (arg1) {
            class47.method434(arg2, arg0, false, -1, -1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lfd;B)V", line = 272)
    public final void method3514(class418 arg0, byte arg1) {
        field8862++;
        while (true) {
            int var3 = arg0.method2396(arg1 + 105);
            if (var3 == 0) {
                if (arg1 == -19) {
                    return;
                } else {
                    this.field8850 = null;
                    return;
                }
            }
            this.method3511(arg1 + 66, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBLrba;I)Ljk;", line = 296)
    public static final class705 method3515(int arg0, byte arg1, class101 arg2, int arg3) {
        field8860++;
        if (arg1 < 104) {
            field8849 = null;
        }
        int var4 = arg0 << 10 | arg2.field1352;
        class705 var5 = (class705) class258.field3482.method3880((long) var4 << 16, -43);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class517.field6774.method3365(class517.field6774.method3348(false, var4), (byte) 104);
        if (var6 == null) {
            int var8 = arg3 + 65536 << 10 | arg2.field1352;
            class705 var9 = (class705) class258.field3482.method3880((long) var8 << 16, -60);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class517.field6774.method3365(class517.field6774.method3348(false, var8), (byte) 91);
            if (var10 == null) {
                int var12 = arg2.field1352 | 0x3FFFC00;
                class705 var13 = (class705) class258.field3482.method3880((long) var12 << 16, -58);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class517.field6774.method3365(class517.field6774.method3348(false, var12), (byte) 106);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class705 var15 = class3.method10(var14, false);
                    var15.field9821 = arg2;
                    class258.field3482.method3881((long) var12 << 16, (byte) 125, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class705 var11 = class3.method10(var10, false);
                var11.field9821 = arg2;
                class258.field3482.method3881((long) var8 << 16, (byte) 18, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class705 var7 = class3.method10(var6, false);
            var7.field9821 = arg2;
            class258.field3482.method3881((long) var4 << 16, (byte) 127, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 370)
    public static void method3516(int arg0) {
        field8849 = null;
        if (arg0 != 14) {
            field8867 = 99;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([SBI)[S", line = 394)
    public static final short[] method3517(short[] arg0, byte arg1, int arg2) {
        field8852++;
        short[] var3 = new short[arg2];
        if (arg1 < 109) {
            return null;
        } else {
            class443.method2516(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }
}
