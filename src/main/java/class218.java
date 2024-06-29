import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class218 {

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public int field3582 = -1;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "[I")
    public static int[] field3575 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field3567 = 0;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Lbn;")
    private class256 field3572;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Ljava/lang/String;")
    private String field3579;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Ljava/lang/String;")
    private String field3581;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "[I")
    private int[] field3561;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[I")
    private int[] field3562;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[I")
    private int[] field3563;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
    private int[] field3566;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "[I")
    private int[] field3573;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
    private int[] field3576;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "[I")
    private int[] field3577;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
    private int[] field3583;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field3571;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field3584;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "[[I")
    private int[][] field3560;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "[[I")
    private int[][] field3569;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "[[I")
    private int[][] field3574;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 13)
    public final void method1555(int arg0) {
        field3564++;
        if (this.field3581 == null) {
            this.field3581 = this.field3579;
        }
        if (arg0 != 0) {
            this.field3574 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjg;I)V", line = 29)
    private final void method1556(byte arg0, class186 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3579 = arg1.method1302(22284);
        } else if (arg2 == 2) {
            this.field3581 = arg1.method1302(22284);
        } else if (arg2 == 3) {
            int var22 = arg1.method1322(false);
            this.field3560 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field3560[var23][0] = arg1.method1272((byte) -117);
                this.field3560[var23][1] = arg1.method1284(8388607);
                this.field3560[var23][2] = arg1.method1284(8388607);
            }
        } else if (arg2 == 4) {
            int var20 = arg1.method1322(false);
            this.field3574 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field3574[var21][0] = arg1.method1272((byte) -119);
                this.field3574[var21][1] = arg1.method1284(8388607);
                this.field3574[var21][2] = arg1.method1284(8388607);
            }
        } else if (arg2 == 5) {
            arg1.method1272((byte) -118);
        } else if (arg2 == 6) {
            arg1.method1322(false);
        } else if (arg2 == 7) {
            arg1.method1322(false);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method1322(false);
            } else if (arg2 == 10) {
                int var18 = arg1.method1322(false);
                this.field3576 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field3576[var19] = arg1.method1284(8388607);
                }
            } else if (arg2 == 12) {
                arg1.method1284(8388607);
            } else if (arg2 == 13) {
                int var4 = arg1.method1322(false);
                this.field3577 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3577[var5] = arg1.method1272((byte) -110);
                }
            } else if (arg2 == 14) {
                int var16 = arg1.method1322(false);
                this.field3569 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field3569[var17][0] = arg1.method1322(false);
                    this.field3569[var17][1] = arg1.method1322(false);
                }
            } else if (arg2 == 15) {
                arg1.method1272((byte) -124);
            } else if (arg2 == 17) {
                this.field3582 = arg1.method1272((byte) -102);
            } else if (arg2 == 18) {
                int var6 = arg1.method1322(false);
                this.field3571 = new String[var6];
                this.field3566 = new int[var6];
                this.field3563 = new int[var6];
                this.field3561 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3561[var7] = arg1.method1284(8388607);
                    this.field3566[var7] = arg1.method1284(8388607);
                    this.field3563[var7] = arg1.method1284(8388607);
                    this.field3571[var7] = arg1.method1270(-9970);
                }
            } else if (arg2 == 19) {
                int var14 = arg1.method1322(false);
                this.field3584 = new String[var14];
                this.field3583 = new int[var14];
                this.field3573 = new int[var14];
                this.field3562 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field3562[var15] = arg1.method1284(8388607);
                    this.field3573[var15] = arg1.method1284(8388607);
                    this.field3583[var15] = arg1.method1284(8388607);
                    this.field3584[var15] = arg1.method1270(-9970);
                }
            } else if (arg2 == 249) {
                int var8 = arg1.method1322(false);
                if (this.field3572 == null) {
                    int var9 = class111.method822((byte) 90, var8);
                    this.field3572 = new class256(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg1.method1322(false) == 1;
                    int var12 = arg1.method1275(-1);
                    class161 var13;
                    if (var11) {
                        var13 = new class249(arg1.method1270(-9970));
                    } else {
                        var13 = new class160(arg1.method1284(8388607));
                    }
                    this.field3572.method1766((long) var12, var13, -72);
                }
            }
        }
        field3580++;
        int var24 = 25 % ((-arg0 - 45) / 49);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljg;B)V", line = 258)
    public final void method1557(class186 arg0, byte arg1) {
        field3578++;
        if (arg1 < 5) {
            return;
        }
        while (true) {
            int var3 = arg0.method1322(false);
            if (var3 == 0) {
                return;
            }
            this.method1556((byte) -112, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 293)
    public static final void method1558(boolean arg0) {
        class368.field5580.method335((byte) 120);
        field3565++;
        if (arg0) {
            method1559((byte) -111, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZ)I", line = 304)
    public static final int method1559(byte arg0, boolean arg1) {
        field3568++;
        long var2 = class46.method297(27104);
        class317 var4 = arg1 ? (class317) class58.field746.method1776(true) : (class317) class58.field746.method1773(-1);
        if (arg0 >= -28) {
            return -51;
        }
        while (var4 != null) {
            if (var2 > (var4.field4968 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4968 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2539;
                    class403.field6014[var5] = class391.field5869[var5];
                    var4.method1120(-86);
                    return var5;
                }
                var4.method1120(73);
            }
            var4 = (class317) class58.field746.method1773(-1);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 359)
    public static void method1560(int arg0) {
        if (arg0 == 0) {
            field3575 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([BB)[B", line = 386)
    public static final byte[] method1561(byte[] arg0, byte arg1) {
        field3570++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < 96) {
            method1561((byte[]) null, (byte) 111);
        }
        byte[] var2 = new byte[arg0.length];
        class408.method2559(arg0, 0, var2, 0, arg0.length);
        return var2;
    }
}
