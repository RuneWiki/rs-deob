import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class202 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field3279 = 5;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Z")
    public boolean field3296 = false;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field3285 = -1;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Z")
    public boolean field3294 = false;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public int field3295 = 99;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field3291 = 2;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public int field3301 = -1;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public int field3299 = -1;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public int field3305 = -1;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Z")
    public boolean field3286 = false;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field3282 = -1;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Z")
    public boolean field3297 = false;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "Ldb;")
    public static class102 field3307 = new class102(32);

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "[Lpi;")
    public static class202[] field3308 = new class202[14];

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lak;")
    public static class172 field3277;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
    private int[] field3287;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "[I")
    public int[] field3290;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[I")
    public int[] field3293;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[Z")
    public boolean[] field3292;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[[I")
    public int[][] field3289;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljj;II)V", line = 4)
    private final void method1472(class44 arg0, int arg1, int arg2) {
        if (arg1 <= 36) {
            return;
        }
        if (arg2 == 1) {
            int var13 = arg0.method271(21081);
            this.field3290 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3290[var14] = arg0.method271(21081);
            }
            this.field3293 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3293[var15] = arg0.method271(21081);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3293[var16] = (arg0.method271(21081) << 16) + this.field3293[var16];
            }
        } else if (arg2 == 2) {
            this.field3301 = arg0.method271(21081);
        } else if (arg2 == 3) {
            this.field3292 = new boolean[256];
            int var4 = arg0.method286((byte) -83);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3292[arg0.method286((byte) -80)] = true;
            }
        } else if (arg2 == 4) {
            this.field3294 = true;
        } else if (arg2 == 5) {
            this.field3279 = arg0.method286((byte) -93);
        } else if (arg2 == 6) {
            this.field3299 = arg0.method271(21081);
        } else if (arg2 == 7) {
            this.field3282 = arg0.method271(21081);
        } else if (arg2 == 8) {
            this.field3295 = arg0.method286((byte) -113);
        } else if (arg2 == 9) {
            this.field3305 = arg0.method286((byte) -112);
        } else if (arg2 == 10) {
            this.field3285 = arg0.method286((byte) -99);
        } else if (arg2 == 11) {
            this.field3291 = arg0.method286((byte) -115);
        } else if (arg2 == 12) {
            int var10 = arg0.method286((byte) -71);
            this.field3287 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3287[var11] = arg0.method271(21081);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3287[var12] += arg0.method271(21081) << 16;
            }
        } else if (arg2 == 13) {
            int var6 = arg0.method271(21081);
            this.field3289 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method286((byte) -98);
                if (var8 > 0) {
                    this.field3289[var7] = new int[var8];
                    this.field3289[var7][0] = arg0.method273(-867673064);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field3289[var7][var9] = arg0.method271(21081);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3297 = true;
        } else if (arg2 == 15) {
            this.field3286 = true;
        } else if (arg2 == 16) {
            this.field3296 = true;
        }
        field3304++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 167)
    public static void method1473(byte arg0) {
        field3308 = null;
        field3307 = null;
        field3277 = null;
        int var1 = -88 / ((-arg0) / 54);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIIIILei;)Lei;", line = 181)
    public final class262 method1474(boolean arg0, int arg1, int arg2, int arg3, int arg4, class262 arg5) {
        field3300++;
        int var7 = this.field3290[arg3];
        int var8 = this.field3293[arg3];
        class126 var9 = class240.method1721((byte) -121, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method1166(true, true, true);
        }
        int var11 = arg2 & 0x3;
        if (!arg0) {
            return (class262) null;
        }
        class126 var12 = null;
        if ((this.field3286 || class98.field1399) && arg4 != -1 && this.field3293.length > arg4) {
            int var13 = this.field3293[arg4];
            var12 = class240.method1721((byte) -121, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class262 var14;
        if (var12 == null) {
            var14 = arg5.method1166(!var9.method914((byte) 88, var10), !var9.method918(var10, 4), !this.field3297);
        } else {
            var14 = arg5.method1166(!var9.method914((byte) 45, var10) & !var12.method914((byte) 50, arg4), !var9.method918(var10, 4) & !var12.method918(arg4, 4), !this.field3297);
        }
        if (class232.field3690 && this.field3297) {
            if (var11 == 1) {
                ((class163) var14).method1150();
            } else if (var11 == 2) {
                ((class163) var14).method1157();
            } else if (var11 == 3) {
                ((class163) var14).method1185();
            }
        } else if (var11 == 1) {
            var14.method1176();
        } else if (var11 == 2) {
            var14.method1190();
        } else if (var11 == 3) {
            var14.method1169();
        }
        var14.method1870(var9, var10, var12, arg4, arg1 - 1, var7, this.field3297);
        if (class232.field3690 && this.field3297) {
            if (var11 == 1) {
                ((class163) var14).method1185();
            } else if (var11 == 2) {
                ((class163) var14).method1157();
            } else if (var11 == 3) {
                ((class163) var14).method1150();
            }
        } else if (var11 == 1) {
            var14.method1169();
        } else if (var11 == 2) {
            var14.method1190();
        } else if (var11 == 3) {
            var14.method1176();
        }
        return var14;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 280)
    public final void method1475(int arg0) {
        field3306++;
        if (this.field3285 == -1) {
            if (this.field3292 == null) {
                this.field3285 = 0;
            } else {
                this.field3285 = 2;
            }
        }
        if (~this.field3305 != arg0) {
            return;
        }
        if (this.field3292 == null) {
            this.field3305 = 0;
        } else {
            this.field3305 = 2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lao;", line = 313)
    public static final class273 method1476(int arg0, int arg1) {
        field3302++;
        class273 var2 = (class273) class223.field3561.method704((byte) 72, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 3272) {
            field3307 = (class102) null;
        }
        byte[] var3 = class304.field4762.method1287(arg1, 33, -1);
        class273 var4 = new class273();
        if (var3 != null) {
            var4.method1975(arg0 - 3389, new class44(var3), arg1);
        }
        class223.field3561.method703(var4, (long) arg1, (byte) -100);
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILei;III)Lei;", line = 352)
    public final class262 method1477(int arg0, class262 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3290[arg2];
        if (arg3 != 1) {
            method1473((byte) -105);
        }
        field3298++;
        int var7 = this.field3293[arg2];
        class126 var8 = class240.method1721((byte) -121, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method1191(true, true, true);
        }
        class126 var10 = null;
        if ((this.field3286 || class98.field1399) && arg4 != -1 && this.field3293.length > arg4) {
            int var11 = this.field3293[arg4];
            var10 = class240.method1721((byte) -121, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class262 var12;
        if (var10 == null) {
            var12 = arg1.method1191(!var8.method914((byte) 97, var9), !var8.method918(var9, 4), !this.field3297);
        } else {
            var12 = arg1.method1191(!var8.method914((byte) 59, var9) & !var10.method914((byte) 99, arg4), !var8.method918(var9, 4) & !var10.method918(arg4, arg3 + 3), !this.field3297);
        }
        var12.method1870(var8, var9, var10, arg4, arg0 - 1, var6, this.field3297);
        return var12;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILei;II)Lei;", line = 390)
    public final class262 method1478(int arg0, int arg1, class262 arg2, int arg3, int arg4) {
        field3278++;
        int var6 = this.field3290[arg1];
        int var7 = this.field3293[arg1];
        class126 var8 = class240.method1721((byte) -121, var7 >> 16);
        int var9 = var7 & arg0;
        if (var8 == null) {
            return arg2.method1195(true, true, true);
        }
        class126 var10 = null;
        class126 var11 = null;
        int var12 = 0;
        class126 var13 = null;
        int var14 = 0;
        if ((this.field3286 || class98.field1399) && arg3 != -1 && this.field3293.length > arg3) {
            int var15 = this.field3293[arg3];
            var13 = class240.method1721((byte) -121, var15 >> 16);
            arg3 = var15 & 0xFFFF;
        }
        if (this.field3287 != null) {
            if (arg1 < this.field3287.length) {
                var14 = this.field3287[arg1];
                if (var14 != 65535) {
                    var10 = class240.method1721((byte) -121, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field3286 || class98.field1399) && arg3 != -1 && this.field3287.length > arg3) {
                var12 = this.field3287[arg3];
                if (var12 != 65535) {
                    var11 = class240.method1721((byte) -121, var12 >> 16);
                    var12 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method914((byte) 65, var9);
        boolean var17 = !var8.method918(var9, arg0 - 65531);
        if (var10 != null) {
            var16 &= !var10.method914((byte) 111, var14);
            var17 &= !var10.method918(var14, 4);
        }
        if (var13 != null) {
            var16 &= !var13.method914((byte) 67, arg3);
            var17 &= !var13.method918(arg3, 4);
        }
        if (var11 != null) {
            var16 &= !var11.method914((byte) 90, var12);
            var17 &= !var11.method918(var12, 4);
        }
        class262 var18 = arg2.method1195(var16, var17, !this.field3297);
        var18.method1870(var8, var9, var13, arg3, arg4 - 1, var6, this.field3297);
        if (var10 != null) {
            var18.method1870(var10, var14, var11, var12, arg4 - 1, var6, this.field3297);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILei;ZII)Lei;", line = 488)
    public final class262 method1479(int arg0, int arg1, class262 arg2, boolean arg3, int arg4, int arg5) {
        field3283++;
        int var7 = this.field3290[arg0];
        int var8 = this.field3293[arg0];
        class126 var9 = class240.method1721((byte) -121, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1195(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class126 var12 = null;
        if ((this.field3286 || class98.field1399) && arg1 != -1 && this.field3293.length > arg1) {
            int var13 = this.field3293[arg1];
            var12 = class240.method1721((byte) -121, var13 >> 16);
            arg1 = var13 & 0xFFFF;
        }
        class262 var14;
        if (var12 == null) {
            var14 = arg2.method1195(!var9.method914((byte) 80, var10), !var9.method918(var10, 4), !this.field3297);
        } else {
            var14 = arg2.method1195(!var9.method914((byte) 117, var10) & !var12.method914((byte) 42, arg1), !var9.method918(var10, 4) & !var12.method918(arg1, 4), !this.field3297);
        }
        if (this.field3297 && class232.field3690) {
            if (var11 == 1) {
                ((class163) var14).method1150();
            } else if (var11 == 2) {
                ((class163) var14).method1157();
            } else if (var11 == 3) {
                ((class163) var14).method1185();
            }
        } else if (var11 == 1) {
            var14.method1176();
        } else if (var11 == 2) {
            var14.method1190();
        } else if (var11 == 3) {
            var14.method1169();
        }
        var14.method1870(var9, var10, var12, arg1, arg4 - 1, var7, this.field3297);
        if (!arg3) {
            return (class262) null;
        }
        if (this.field3297 && class232.field3690) {
            if (var11 == 1) {
                ((class163) var14).method1185();
            } else if (var11 == 2) {
                ((class163) var14).method1157();
            } else if (var11 == 3) {
                ((class163) var14).method1150();
            }
        } else if (var11 == 1) {
            var14.method1169();
        } else if (var11 == 2) {
            var14.method1190();
        } else if (var11 == 3) {
            var14.method1176();
        }
        return var14;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljj;B)V", line = 605)
    public final void method1480(class44 arg0, byte arg1) {
        field3303++;
        while (true) {
            int var3 = arg0.method286((byte) -65);
            if (var3 == 0) {
                if (arg1 <= 29) {
                    this.field3291 = -62;
                }
                return;
            }
            this.method1472(arg0, 122, var3);
        }
    }
}
