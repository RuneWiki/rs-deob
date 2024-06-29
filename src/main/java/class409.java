import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class409 {

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public int field5597 = -1;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "[B")
    public static byte[] field5588 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field5589 = -1;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Llb;")
    private class465 field5598;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "Ljava/lang/String;")
    private String field5591;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "Ljava/lang/String;")
    private String field5593;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[I")
    private int[] field5581;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "[I")
    private int[] field5583;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "[I")
    private int[] field5584;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "[I")
    private int[] field5585;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "[I")
    private int[] field5594;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "[I")
    private int[] field5599;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "[I")
    private int[] field5600;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "[I")
    private int[] field5601;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field5580;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field5592;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "[[I")
    private int[][] field5579;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "[[I")
    private int[][] field5586;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "[[I")
    private int[][] field5590;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
    public static void method2403(boolean arg0) {
        if (arg0) {
            field5589 = 45;
        }
        field5588 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BILgw;)V")
    private final void method2404(byte arg0, int arg1, class148 arg2) {
        field5587++;
        if (arg1 == 1) {
            this.field5591 = arg2.method1039(-37);
        } else if (arg1 == 2) {
            this.field5593 = arg2.method1039(-64);
        } else if (arg1 == 3) {
            int var22 = arg2.method1032((byte) -33);
            this.field5579 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5579[var23][0] = arg2.method1045(true);
                this.field5579[var23][1] = arg2.method1026(arg0 - 917302120);
                this.field5579[var23][2] = arg2.method1026(-917302120);
            }
        } else if (arg1 == 4) {
            int var20 = arg2.method1032((byte) -33);
            this.field5590 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field5590[var21][0] = arg2.method1045(true);
                this.field5590[var21][1] = arg2.method1026(arg0 - 917302120);
                this.field5590[var21][2] = arg2.method1026(-917302120);
            }
        } else if (arg1 == 5) {
            arg2.method1045(true);
        } else if (arg1 == 6) {
            arg2.method1032((byte) -33);
        } else if (arg1 == 7) {
            arg2.method1032((byte) -33);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method1032((byte) -33);
            } else if (arg1 == 10) {
                int var18 = arg2.method1032((byte) -33);
                this.field5600 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field5600[var19] = arg2.method1026(-917302120);
                }
            } else if (arg1 == 12) {
                arg2.method1026(arg0 ^ 0xC9531498);
            } else if (arg1 == 13) {
                int var16 = arg2.method1032((byte) -33);
                this.field5599 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field5599[var17] = arg2.method1045(true);
                }
            } else if (arg1 == 14) {
                int var4 = arg2.method1032((byte) -33);
                this.field5586 = new int[var4][2];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5586[var5][0] = arg2.method1032((byte) -33);
                    this.field5586[var5][1] = arg2.method1032((byte) -33);
                }
            } else if (arg1 == 15) {
                arg2.method1045(true);
            } else if (arg1 == 17) {
                this.field5597 = arg2.method1045(true);
            } else if (arg1 == 18) {
                int var14 = arg2.method1032((byte) -33);
                this.field5594 = new int[var14];
                this.field5601 = new int[var14];
                this.field5580 = new String[var14];
                this.field5583 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field5583[var15] = arg2.method1026(-917302120);
                    this.field5601[var15] = arg2.method1026(-917302120);
                    this.field5594[var15] = arg2.method1026(-917302120);
                    this.field5580[var15] = arg2.method1023(-29153);
                }
            } else if (arg1 == 19) {
                int var12 = arg2.method1032((byte) -33);
                this.field5584 = new int[var12];
                this.field5581 = new int[var12];
                this.field5585 = new int[var12];
                this.field5592 = new String[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field5581[var13] = arg2.method1026(arg0 - 917302120);
                    this.field5584[var13] = arg2.method1026(-917302120);
                    this.field5585[var13] = arg2.method1026(-917302120);
                    this.field5592[var13] = arg2.method1023(-29153);
                }
            } else if (arg1 == 249) {
                int var6 = arg2.method1032((byte) -33);
                if (this.field5598 == null) {
                    int var7 = class322.method1938(var6, 65);
                    this.field5598 = new class465(var7);
                }
                for (int var8 = 0; var8 < var6; var8++) {
                    boolean var9 = arg2.method1032((byte) -33) == 1;
                    int var10 = arg2.method1028((byte) 123);
                    class417 var11;
                    if (var9) {
                        var11 = new class528(arg2.method1023(arg0 ^ 0xFFFF8E1F));
                    } else {
                        var11 = new class556(arg2.method1026(arg0 - 917302120));
                    }
                    this.field5598.method2797(arg0 - 4234, var11, (long) var10);
                }
            }
        }
        if (arg0 != 0) {
            method2403(false);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILgw;)V")
    public final void method2405(int arg0, class148 arg1) {
        if (arg0 >= -59) {
            return;
        }
        field5596++;
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                return;
            }
            this.method2404((byte) 0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public final void method2406(int arg0) {
        field5582++;
        if (this.field5593 == null) {
            this.field5593 = this.field5591;
        }
        if (arg0 != 21202) {
            method2403(false);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lvp;III)V")
    public static final void method2407(class162 arg0, int arg1, int arg2, int arg3) {
        field5595++;
        if (class307.field4210 != null || class446.field6245 || arg0 == null || class285.method1770((byte) 50, arg0) == null) {
            return;
        }
        class307.field4210 = arg0;
        class57.field716 = class285.method1770((byte) 86, arg0);
        class595.field8796 = arg3;
        class114.field1610 = arg1;
        class188.field2801 = arg2;
        class199.field2932 = false;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method2408(int arg0, int arg1, int arg2, Class arg3) {
        class205 var4 = class420.field5697[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class636 var5 = var4.field3029; var5 != null; var5 = var5.field9302) {
            class577 var6 = var5.field9299;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8504 == arg1 && var6.field8509 == arg2) {
                class607.method3571(var6);
                return;
            }
        }
    }
}
