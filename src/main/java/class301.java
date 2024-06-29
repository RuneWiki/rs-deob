import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class301 {

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public int field4236 = -1;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lqe;")
    public static class465 field4222 = new class465(48, -1);

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lqaa;")
    public static class27 field4231 = new class27(29, 18);

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lqaa;")
    public static class27 field4234 = new class27(7, 15);

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field4237 = new String[200];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lmp;")
    private class758 field4225;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Ljava/lang/String;")
    private String field4214;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Ljava/lang/String;")
    private String field4238;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    private int[] field4213;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    private int[] field4217;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    private int[] field4218;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
    private int[] field4220;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
    private int[] field4221;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[I")
    private int[] field4223;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
    private int[] field4228;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
    private int[] field4229;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field4215;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field4233;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[[I")
    private int[][] field4224;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[[I")
    private int[][] field4226;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[[I")
    private int[][] field4235;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lud;IB)V")
    private final void method1957(class35 arg0, int arg1, byte arg2) {
        field4227++;
        if (arg2 > -63) {
            this.method1958(null, (byte) -37);
        }
        if (arg1 == 1) {
            this.field4214 = arg0.method279((byte) -110);
        } else if (arg1 == 2) {
            this.field4238 = arg0.method279((byte) 104);
        } else if (arg1 == 3) {
            int var22 = arg0.method273(255);
            this.field4226 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4226[var23][0] = arg0.method253(-13900);
                this.field4226[var23][1] = arg0.method234((byte) -92);
                this.field4226[var23][2] = arg0.method234((byte) -96);
            }
        } else if (arg1 == 4) {
            int var4 = arg0.method273(255);
            this.field4224 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4224[var5][0] = arg0.method253(-13900);
                this.field4224[var5][1] = arg0.method234((byte) -120);
                this.field4224[var5][2] = arg0.method234((byte) -121);
            }
        } else if (arg1 == 5) {
            arg0.method253(-13900);
        } else if (arg1 == 6) {
            arg0.method273(255);
        } else if (arg1 == 7) {
            arg0.method273(255);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method273(255);
                return;
            }
            if (arg1 != 10) {
                if (arg1 == 12) {
                    arg0.method234((byte) -117);
                    return;
                }
                if (arg1 != 13) {
                    if (arg1 == 14) {
                        int var6 = arg0.method273(255);
                        this.field4235 = new int[var6][2];
                        for (int var7 = 0; var7 < var6; var7++) {
                            this.field4235[var7][0] = arg0.method273(255);
                            this.field4235[var7][1] = arg0.method273(255);
                        }
                        return;
                    }
                    if (arg1 == 15) {
                        arg0.method253(-13900);
                        return;
                    }
                    if (arg1 == 17) {
                        this.field4236 = arg0.method253(-13900);
                    } else if (arg1 == 18) {
                        int var8 = arg0.method273(255);
                        this.field4223 = new int[var8];
                        this.field4228 = new int[var8];
                        this.field4215 = new String[var8];
                        this.field4218 = new int[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            this.field4218[var9] = arg0.method234((byte) -109);
                            this.field4228[var9] = arg0.method234((byte) -98);
                            this.field4223[var9] = arg0.method234((byte) -113);
                            this.field4215[var9] = arg0.method272(2);
                        }
                        return;
                    } else if (arg1 == 19) {
                        int var10 = arg0.method273(255);
                        this.field4233 = new String[var10];
                        this.field4213 = new int[var10];
                        this.field4229 = new int[var10];
                        this.field4221 = new int[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field4213[var11] = arg0.method234((byte) -99);
                            this.field4229[var11] = arg0.method234((byte) -102);
                            this.field4221[var11] = arg0.method234((byte) -114);
                            this.field4233[var11] = arg0.method272(2);
                        }
                        return;
                    } else if (arg1 == 249) {
                        int var12 = arg0.method273(255);
                        if (this.field4225 == null) {
                            int var13 = class613.method3530(false, var12);
                            this.field4225 = new class758(var13);
                        }
                        for (int var14 = 0; var14 < var12; var14++) {
                            boolean var15 = arg0.method273(255) == 1;
                            int var16 = arg0.method239(-114);
                            class626 var17;
                            if (var15) {
                                var17 = new class589(arg0.method272(2));
                            } else {
                                var17 = new class528(arg0.method234((byte) -123));
                            }
                            this.field4225.method4211(var17, (byte) 28, (long) var16);
                        }
                        return;
                    }
                    return;
                }
                int var18 = arg0.method273(255);
                this.field4217 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field4217[var19] = arg0.method253(-13900);
                }
                return;
            }
            int var20 = arg0.method273(255);
            this.field4220 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field4220[var21] = arg0.method234((byte) -122);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lud;B)V")
    public final void method1958(class35 arg0, byte arg1) {
        if (arg1 != 101) {
            this.field4226 = null;
        }
        field4232++;
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                return;
            }
            this.method1957(arg0, var3, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public static final void method1959(int arg0, int arg1) {
        field4216++;
        if (!class4.method19(122, arg0)) {
            return;
        }
        class50[] var2 = class117.field1849[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class50 var4 = var2[var3];
            if (var4 != null) {
                var4.field798 = 1;
                var4.field751 = 0;
                var4.field714 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public final void method1960(int arg0) {
        if (arg0 != 200) {
            this.method1958(null, (byte) -68);
        }
        field4219++;
        if (this.field4238 == null) {
            this.field4238 = this.field4214;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1961(int arg0) {
        field4222 = null;
        field4231 = null;
        field4237 = null;
        if (arg0 != -2) {
            method1962(24);
        }
        field4234 = null;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
    public static final int method1962(int arg0) {
        field4230++;
        if (arg0 < 108) {
            method1959(47, -109);
        }
        return class131.field1954;
    }
}
