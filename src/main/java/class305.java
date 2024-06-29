import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class305 {

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public int field4462 = -1;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field4450 = -1;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field4455 = 99;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Ljj;")
    private class156 field4463;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Lja;")
    public static class90 field4460;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Ljava/lang/String;")
    private String field4445;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Ljava/lang/String;")
    private String field4458;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[I")
    private int[] field4439;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
    private int[] field4440;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
    private int[] field4441;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
    private int[] field4444;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[I")
    private int[] field4453;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "[I")
    private int[] field4454;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
    private int[] field4456;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "[I")
    private int[] field4459;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field4446;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field4457;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[[I")
    private int[][] field4443;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[[I")
    private int[][] field4448;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[[I")
    private int[][] field4449;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public final void method2086(boolean arg0) {
        if (this.field4445 == null) {
            this.field4445 = this.field4458;
        }
        field4438++;
        if (!arg0) {
            this.method2086(true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lec;B)V")
    public final void method2087(class37 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method271((byte) 116);
            if (var3 == 0) {
                if (arg1 <= 6) {
                    this.method2086(true);
                }
                field4447++;
                return;
            }
            this.method2091(arg0, var3, -20);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method2088(int arg0, String arg1, byte arg2) {
        field4452++;
        class221 var3 = class447.method2795(2, (byte) -49, arg0);
        if (arg2 < -98) {
            var3.method1692(0);
            var3.field3290 = arg1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static final void method2089(int arg0) {
        class18 var1 = class83.field1360;
        synchronized (class83.field1360) {
            class83.field1360.method112(0);
        }
        field4442++;
        if (arg0 != 19924) {
            method2088(-27, (String) null, (byte) 111);
        }
        class18 var2 = class418.field6059;
        synchronized (class418.field6059) {
            class418.field6059.method112(0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public static void method2090(int arg0) {
        field4460 = null;
        if (arg0 != 99) {
            method2089(-45);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lec;II)V")
    private final void method2091(class37 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field4458 = arg0.method312(1);
        } else if (arg1 == 2) {
            this.field4445 = arg0.method312(1);
        } else if (arg1 == 3) {
            int var4 = arg0.method271((byte) 112);
            this.field4448 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4448[var5][0] = arg0.method320((byte) -87);
                this.field4448[var5][1] = arg0.method278(127);
                this.field4448[var5][2] = arg0.method278(120);
            }
        } else if (arg1 == 4) {
            int var6 = arg0.method271((byte) 110);
            this.field4443 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4443[var7][0] = arg0.method320((byte) -87);
                this.field4443[var7][1] = arg0.method278(arg2 + 61);
                this.field4443[var7][2] = arg0.method278(class277.method1976(arg2, -126));
            }
        } else if (arg1 == 5) {
            arg0.method320((byte) -87);
        } else if (arg1 == 6) {
            arg0.method271((byte) 102);
        } else if (arg1 == 7) {
            arg0.method271((byte) 119);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method271((byte) 104);
            } else if (arg1 == 10) {
                int var22 = arg0.method271((byte) 117);
                this.field4454 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field4454[var23] = arg0.method278(33);
                }
            } else if (arg1 == 12) {
                arg0.method278(arg2 ^ 0xFFFFFFBF);
            } else if (arg1 == 13) {
                int var20 = arg0.method271((byte) 120);
                this.field4453 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field4453[var21] = arg0.method320((byte) -87);
                }
            } else if (arg1 == 14) {
                int var18 = arg0.method271((byte) 114);
                this.field4449 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field4449[var19][0] = arg0.method271((byte) 119);
                    this.field4449[var19][1] = arg0.method271((byte) 109);
                }
            } else if (arg1 == 15) {
                arg0.method320((byte) -87);
            } else if (arg1 == 17) {
                this.field4462 = arg0.method320((byte) -87);
            } else if (arg1 == 18) {
                int var8 = arg0.method271((byte) 116);
                this.field4456 = new int[var8];
                this.field4459 = new int[var8];
                this.field4446 = new String[var8];
                this.field4441 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4456[var9] = arg0.method278(class277.method1976(arg2, 105));
                    this.field4459[var9] = arg0.method278(class277.method1976(arg2, -61));
                    this.field4441[var9] = arg0.method278(-18);
                    this.field4446[var9] = arg0.method322((byte) -34);
                }
            } else if (arg1 == 19) {
                int var10 = arg0.method271((byte) 116);
                this.field4444 = new int[var10];
                this.field4440 = new int[var10];
                this.field4439 = new int[var10];
                this.field4457 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field4439[var11] = arg0.method278(13);
                    this.field4440[var11] = arg0.method278(121);
                    this.field4444[var11] = arg0.method278(31);
                    this.field4457[var11] = arg0.method322((byte) -34);
                }
            } else if (arg1 == 249) {
                int var12 = arg0.method271((byte) 112);
                if (this.field4463 == null) {
                    int var13 = class202.method1526(var12, -2092404400);
                    this.field4463 = new class156(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg0.method271((byte) 123) == 1;
                    int var16 = arg0.method295(true);
                    class35 var17;
                    if (var15) {
                        var17 = new class450(arg0.method322((byte) -34));
                    } else {
                        var17 = new class9(arg0.method278(arg2 - 104));
                    }
                    this.field4463.method1217(arg2 ^ 0xFFFFFFED, (long) var16, var17);
                }
            }
        }
        field4461++;
        if (arg2 != -20) {
            field4451 = -38;
        }
    }
}
