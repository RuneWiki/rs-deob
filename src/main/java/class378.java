import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class378 {

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public int field5318 = -1;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field5332 = -1;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "Laj;")
    private class71 field5335;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "Ljava/lang/String;")
    private String field5316;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Ljava/lang/String;")
    private String field5328;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "[I")
    private int[] field5312;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
    private int[] field5313;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[I")
    private int[] field5314;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "[I")
    private int[] field5321;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "[I")
    private int[] field5327;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "[I")
    private int[] field5329;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "[I")
    private int[] field5333;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "[I")
    private int[] field5336;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[Lu;")
    public static class187[] field5322;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field5323;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field5325;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[[I")
    private int[][] field5319;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "[[I")
    private int[][] field5326;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "[[I")
    private int[][] field5330;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lrk;ILka;Lrk;Lrk;)Z")
    public static final boolean method2357(class427 arg0, int arg1, class407 arg2, class427 arg3, class427 arg4) {
        class127.field1800 = arg3;
        class288.field3858 = arg4;
        class258.field3484 = arg2;
        if (arg1 != 1) {
            method2360(21);
        }
        class190.field2738 = arg0;
        field5320++;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lap;II)V")
    private final void method2358(class289 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5328 = arg0.method1859(true);
        } else if (arg2 == 2) {
            this.field5316 = arg0.method1859(true);
        } else if (arg2 == 3) {
            int var22 = arg0.method1861((byte) -72);
            this.field5319 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5319[var23][0] = arg0.method1853(113);
                this.field5319[var23][1] = arg0.method1856((byte) 121);
                this.field5319[var23][2] = arg0.method1856((byte) 127);
            }
        } else if (arg2 == 4) {
            int var4 = arg0.method1861((byte) -72);
            this.field5326 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5326[var5][0] = arg0.method1853(95);
                this.field5326[var5][1] = arg0.method1856((byte) 112);
                this.field5326[var5][2] = arg0.method1856((byte) 107);
            }
        } else if (arg2 == 5) {
            arg0.method1853(-83);
        } else if (arg2 == 6) {
            arg0.method1861((byte) -72);
        } else if (arg2 == 7) {
            arg0.method1861((byte) -72);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method1861((byte) -72);
            } else if (arg2 == 10) {
                int var20 = arg0.method1861((byte) -72);
                this.field5312 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field5312[var21] = arg0.method1856((byte) 67);
                }
            } else if (arg2 == 12) {
                arg0.method1856((byte) 10);
            } else if (arg2 == 13) {
                int var6 = arg0.method1861((byte) -72);
                this.field5314 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5314[var7] = arg0.method1853(class331.method2109(arg1, -79));
                }
            } else if (arg2 == 14) {
                int var18 = arg0.method1861((byte) -72);
                this.field5330 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field5330[var19][0] = arg0.method1861((byte) -72);
                    this.field5330[var19][1] = arg0.method1861((byte) -72);
                }
            } else if (arg2 == 15) {
                arg0.method1853(-47);
            } else if (arg2 == 17) {
                this.field5318 = arg0.method1853(arg1 ^ 0xFFFFFFA7);
            } else if (arg2 == 18) {
                int var8 = arg0.method1861((byte) -72);
                this.field5327 = new int[var8];
                this.field5325 = new String[var8];
                this.field5321 = new int[var8];
                this.field5333 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5333[var9] = arg0.method1856((byte) 124);
                    this.field5327[var9] = arg0.method1856((byte) 107);
                    this.field5321[var9] = arg0.method1856((byte) 27);
                    this.field5325[var9] = arg0.method1871(-1);
                }
            } else if (arg2 == 19) {
                int var16 = arg0.method1861((byte) -72);
                this.field5329 = new int[var16];
                this.field5323 = new String[var16];
                this.field5313 = new int[var16];
                this.field5336 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field5313[var17] = arg0.method1856((byte) 34);
                    this.field5336[var17] = arg0.method1856((byte) 115);
                    this.field5329[var17] = arg0.method1856((byte) 121);
                    this.field5323[var17] = arg0.method1871(-1);
                }
            } else if (arg2 == 249) {
                int var10 = arg0.method1861((byte) -72);
                if (this.field5335 == null) {
                    int var11 = class443.method2751(true, var10);
                    this.field5335 = new class71(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg0.method1861((byte) -72) == 1;
                    int var14 = arg0.method1880((byte) 67);
                    class381 var15;
                    if (var13) {
                        var15 = new class448(arg0.method1871(-1));
                    } else {
                        var15 = new class193(arg0.method1856((byte) 52));
                    }
                    this.field5335.method612((long) var14, -1, var15);
                }
            }
        }
        field5324++;
        if (arg1 != 4) {
            this.method2358((class289) null, -51, -16);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static final void method2359(int arg0) {
        field5311++;
        class236.field3262.method2539(84);
        if (arg0 != 0) {
            method2359(43);
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static void method2360(int arg0) {
        field5322 = null;
        if (arg0 != 2) {
            method2362(true, (class427) null, (class427) null, false);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    public final void method2361(byte arg0) {
        if (this.field5316 == null) {
            this.field5316 = this.field5328;
        }
        field5315++;
        if (arg0 != 39) {
            this.method2363((byte) -64, (class289) null);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLrk;Lrk;Z)V")
    public static final void method2362(boolean arg0, class427 arg1, class427 arg2, boolean arg3) {
        class204.field2877 = arg1;
        class132.field1888 = arg2;
        if (!arg0) {
            method2357((class427) null, 50, (class407) null, (class427) null, (class427) null);
        }
        class153.field2334 = arg3;
        field5331++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLap;)V")
    public final void method2363(byte arg0, class289 arg1) {
        if (arg0 > -81) {
            field5322 = null;
        }
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                field5334++;
                return;
            }
            this.method2358(arg1, 4, var3);
        }
    }
}
