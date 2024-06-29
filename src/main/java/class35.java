import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class35 {

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public int field541 = -1;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field543 = 5;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public int field542 = -1;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public int field561 = -1;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public int field566 = 2;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public int field562 = -1;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public int field548 = 99;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public int field553 = -1;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "Z")
    public boolean field558 = false;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Lhi;")
    public static class82 field560 = class95.method664((byte) -109, "<img=1>");

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Lva;")
    public static class209 field545 = new class209(5000);

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "Lhi;")
    public static class82 field564 = class95.method664((byte) -46, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field569 = -1;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "[I")
    public static int[] field568 = new int[32];

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "Z")
    public static boolean field572 = false;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "F")
    public static float field567;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "Lum;")
    public static class222 field563;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
    public int[] field539;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[I")
    public int[] field547;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[I")
    private int[] field549;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "[I")
    private int[] field554;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "[[I")
    public int[][] field552;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILpa;I)Lpa;", line = 22)
    public final class155 method266(int arg0, class155 arg1, int arg2) {
        int var4 = this.field547[arg0];
        class290 var5 = class36.method282(-48, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg2 != 9193) {
            this.method268(-16, (class153) null);
        }
        field550++;
        if (var5 == null) {
            return arg1.method196(true, true);
        } else {
            class155 var7 = arg1.method196(!var5.method2005(arg2 - 9194, var6), !this.field571);
            var7.method198(var5, var6, this.field571);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIILum;)[Ljm;", line = 45)
    public static final class303[] method267(byte arg0, int arg1, int arg2, class222 arg3) {
        if (arg0 != -30) {
            field563 = (class222) null;
        }
        field565++;
        return client.method866(arg2, arg1, (byte) 49, arg3) ? class284.method1974((byte) -70) : null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILbc;)V", line = 68)
    public final void method268(int arg0, class153 arg1) {
        while (true) {
            int var3 = arg1.method1082(arg0 ^ 0x3805);
            if (var3 == 0) {
                field559++;
                if (arg0 != -14464) {
                    this.method268(12, (class153) null);
                }
                return;
            }
            this.method275(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lpa;II)Lpa;", line = 86)
    public final class155 method269(class155 arg0, int arg1, int arg2) {
        field546++;
        int var4 = this.field547[arg2];
        class290 var5 = class36.method282(-94, var4 >> 16);
        int var6 = var4 & arg1;
        if (var5 == null) {
            return arg0.method244(true, true);
        }
        int var7 = 0;
        class290 var8 = null;
        if (this.field554 != null && this.field554.length > arg2) {
            int var9 = this.field554[arg2];
            var8 = class36.method282(-53, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class155 var11 = arg0.method244(!var5.method2005(arg1 ^ 0xFFFF0000, var6), !this.field571);
            var11.method198(var5, var6, this.field571);
            return var11;
        } else {
            class155 var10 = arg0.method244(!var5.method2005(arg1 - 65536, var6) & !var8.method2005(arg1 - 65536, var7), !this.field571);
            var10.method198(var5, var6, this.field571);
            var10.method198(var8, var7, this.field571);
            return var10;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILpa;BI)Lpa;", line = 128)
    public final class155 method270(int arg0, class155 arg1, byte arg2, int arg3) {
        int var5 = 31 / ((51 - arg2) / 58);
        int var6 = this.field547[arg3];
        field544++;
        class290 var7 = class36.method282(-13, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method244(true, true);
        }
        int var9 = arg0 & 0x3;
        class155 var10 = arg1.method244(!var7.method2005(-1, var8), !this.field571);
        if (var9 == 1) {
            var10.method230();
        } else if (var9 == 2) {
            var10.method201();
        } else if (var9 == 3) {
            var10.method210();
        }
        var10.method198(var7, var8, this.field571);
        if (var9 == 1) {
            var10.method210();
        } else if (var9 == 2) {
            var10.method201();
        } else if (var9 == 3) {
            var10.method230();
        }
        return var10;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lpa;II)Lpa;", line = 170)
    public final class155 method271(class155 arg0, int arg1, int arg2) {
        int var4 = this.field547[arg2];
        class290 var5 = class36.method282(-40, var4 >> 16);
        field551++;
        if (arg1 >= -102) {
            this.field554 = (int[]) null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method244(true, true);
        } else {
            class155 var7 = arg0.method244(!var5.method2005(-1, var6), !this.field571);
            var7.method198(var5, var6, this.field571);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 194)
    public final void method272(int arg0) {
        if (arg0 != 8447) {
            this.method275(-67, true, (class153) null);
        }
        if (this.field562 == -1) {
            if (this.field549 == null) {
                this.field562 = 0;
            } else {
                this.field562 = 2;
            }
        }
        if (this.field561 == -1) {
            if (this.field549 == null) {
                this.field561 = 0;
            } else {
                this.field561 = 2;
            }
        }
        field570++;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 227)
    public static void method273(int arg0) {
        field563 = null;
        field564 = null;
        field560 = null;
        field568 = null;
        int var1 = -94 / ((-arg0 - 2) / 58);
        field545 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([S[Lhi;I)V", line = 244)
    public static final void method274(short[] arg0, class82[] arg1, int arg2) {
        if (arg2 >= 47) {
            class284.method1971((byte) -80, arg1.length - 1, 0, arg0, arg1);
            field538++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZLbc;)V", line = 268)
    private final void method275(int arg0, boolean arg1, class153 arg2) {
        field540++;
        if (arg1) {
            this.method270(-62, (class155) null, (byte) -40, -30);
        }
        if (arg0 == 1) {
            int var13 = arg2.method1090(false);
            this.field539 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field539[var14] = arg2.method1090(false);
            }
            this.field547 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field547[var15] = arg2.method1090(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field547[var16] += arg2.method1090(false) << 16;
            }
        } else if (arg0 == 2) {
            this.field541 = arg2.method1090(false);
        } else if (arg0 == 3) {
            int var11 = arg2.method1082(-70);
            this.field549 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field549[var12] = arg2.method1082(-34);
            }
            this.field549[var11] = 9999999;
        } else if (arg0 == 4) {
            this.field558 = true;
        } else if (arg0 == 5) {
            this.field543 = arg2.method1082(-49);
        } else if (arg0 == 6) {
            this.field553 = arg2.method1090(false);
        } else if (arg0 == 7) {
            this.field542 = arg2.method1090(arg1);
        } else if (arg0 == 8) {
            this.field548 = arg2.method1082(-111);
        } else if (arg0 == 9) {
            this.field562 = arg2.method1082(-113);
        } else if (arg0 == 10) {
            this.field561 = arg2.method1082(-125);
        } else if (arg0 == 11) {
            this.field566 = arg2.method1082(-50);
        } else if (arg0 == 12) {
            int var8 = arg2.method1082(-71);
            this.field554 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field554[var9] = arg2.method1090(arg1);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field554[var10] += arg2.method1090(false) << 16;
            }
        } else if (arg0 == 13) {
            int var4 = arg2.method1090(arg1);
            this.field552 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1082(-110);
                if (var6 > 0) {
                    this.field552[var5] = new int[var6];
                    this.field552[var5][0] = arg2.method1107((byte) 82);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field552[var5][var7] = arg2.method1090(arg1);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field571 = true;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lpa;ILkl;II)Lpa;", line = 437)
    public final class155 method276(class155 arg0, int arg1, class35 arg2, int arg3, int arg4) {
        field555++;
        int var6 = this.field547[arg4];
        class290 var7 = class36.method282(-99, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method271(arg0, -127, arg1);
        }
        int var9 = -118 / ((arg3 - 67) / 53);
        int var10 = arg2.field547[arg1];
        class290 var11 = class36.method282(-95, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            class155 var13 = arg0.method244(!var7.method2005(-1, var8), !this.field571);
            var13.method198(var7, var8, this.field571);
            return var13;
        } else {
            class155 var14 = arg0.method244(!var7.method2005(-1, var8) & !var11.method2005(-1, var12), !arg2.field571 & !this.field571);
            var14.method190(var7, var8, var11, var12, this.field549, arg2.field571 | this.field571);
            return var14;
        }
    }
}
