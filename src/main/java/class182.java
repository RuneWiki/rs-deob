import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class182 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public int field3317 = 2;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field3321 = 5;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public int field3338 = -1;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public int field3339 = -1;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Z")
    public boolean field3337 = false;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Z")
    public boolean field3336 = false;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public int field3342 = -1;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Z")
    public boolean field3331 = false;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field3324 = -1;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Z")
    public boolean field3349 = false;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public int field3344 = 99;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public int field3350 = -1;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field3332 = 0;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "[I")
    public static int[] field3351 = new int[2];

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lud;")
    public static class279 field3353 = class130.method1024("hitmarks", 255);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lud;")
    public static class279 field3322 = class130.method1024("headicons_pk", 255);

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Lok;")
    public static class149 field3343;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lok;")
    public static class149 field3347;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
    public int[] field3318;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[I")
    public int[] field3341;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "[I")
    private int[] field3352;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[Z")
    public boolean[] field3326;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[[I")
    public int[][] field3316;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "[[I")
    public static int[][] field3348;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[[[B")
    public static byte[][][] field3323;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lga;IBIII)Lga;", line = 6)
    public final class19 method1405(class19 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3330++;
        int var7 = this.field3318[arg4];
        int var8 = this.field3341[arg4];
        class211 var9 = class17.method153(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method159(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class211 var12 = null;
        if ((this.field3331 || class293.field5234) && arg3 != -1 && this.field3341.length > arg3) {
            int var13 = this.field3341[arg3];
            var12 = class17.method153(var13 >> 16, true);
            arg3 = var13 & 0xFFFF;
        }
        if (arg2 != 81) {
            this.field3350 = -76;
        }
        class19 var14;
        if (var12 == null) {
            var14 = arg0.method159(!var9.method1549(4096, var10), !var9.method1545(var10, false), !this.field3336);
        } else {
            var14 = arg0.method159(!var9.method1549(4096, var10) & !var12.method1549(4096, arg3), !var9.method1545(var10, false) & !var12.method1545(arg3, false), !this.field3336);
        }
        if (this.field3336 && class97.field1824) {
            if (var11 == 1) {
                ((class299) var14).method2114();
            } else if (var11 == 2) {
                ((class299) var14).method2117();
            } else if (var11 == 3) {
                ((class299) var14).method2110();
            }
        } else if (var11 == 1) {
            var14.method185();
        } else if (var11 == 2) {
            var14.method169();
        } else if (var11 == 3) {
            var14.method183();
        }
        var14.method174(var9, var10, var12, arg3, arg5 - 1, var7, this.field3336);
        if (this.field3336 && class97.field1824) {
            if (var11 == 1) {
                ((class299) var14).method2110();
            } else if (var11 == 2) {
                ((class299) var14).method2117();
            } else if (var11 == 3) {
                ((class299) var14).method2114();
            }
        } else if (var11 == 1) {
            var14.method183();
        } else if (var11 == 2) {
            var14.method169();
        } else if (var11 == 3) {
            var14.method185();
        }
        return var14;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)Lud;", line = 108)
    public static final class279 method1406(byte arg0, int arg1) {
        class279 var2 = class191.method1447(5, arg1);
        for (int var3 = var2.method1984(8) - 3; var3 > 0; var3 -= 3) {
            var2 = class115.method929(new class279[] { var2.method2009((byte) -84, 0, var3), class134.field2450, var2.method1988((byte) -101, var3) }, (byte) 60);
        }
        field3329++;
        if (var2.method1984(8) > 9) {
            return class115.method929(new class279[] { class29.field691, var2.method2009((byte) -84, 0, var2.method1984(8) - 8), class68.field1343, class169.field3063, var2, class254.field4531 }, (byte) 60);
        } else if (arg0 >= -78) {
            return (class279) null;
        } else if (var2.method1984(8) > 6) {
            return class115.method929(new class279[] { class324.field5664, var2.method2009((byte) -84, 0, var2.method1984(8) - 4), class43.field893, class169.field3063, var2, class254.field4531 }, (byte) 60);
        } else {
            return class115.method929(new class279[] { class194.field3492, var2, class178.field3206 }, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILga;B)Lga;", line = 144)
    public final class19 method1407(int arg0, int arg1, int arg2, class19 arg3, byte arg4) {
        field3325++;
        int var6 = this.field3318[arg2];
        int var7 = this.field3341[arg2];
        class211 var8 = class17.method153(var7 >> 16, true);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method187(true, true, true);
        }
        class211 var10 = null;
        if ((this.field3331 || class293.field5234) && arg1 != -1 && this.field3341.length > arg1) {
            int var11 = this.field3341[arg1];
            var10 = class17.method153(var11 >> 16, true);
            arg1 = var11 & 0xFFFF;
        }
        if (arg4 != 117) {
            method1414(-59, false, (class149) null);
        }
        class19 var12;
        if (var10 == null) {
            var12 = arg3.method187(!var8.method1549(4096, var9), !var8.method1545(var9, false), !this.field3336);
        } else {
            var12 = arg3.method187(!var8.method1549(arg4 ^ 0x1075, var9) & !var10.method1549(arg4 + 3979, arg1), !var8.method1545(var9, false) & !var10.method1545(arg1, false), !this.field3336);
        }
        var12.method174(var8, var9, var10, arg1, arg0 - 1, var6, this.field3336);
        return var12;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 182)
    public static void method1408(byte arg0) {
        field3347 = null;
        if (arg0 != -16) {
            method1414(-101, false, (class149) null);
        }
        field3348 = (int[][]) null;
        field3353 = null;
        field3351 = null;
        field3322 = null;
        field3323 = (byte[][][]) null;
        field3343 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lga;IIIII)Lga;", line = 205)
    public final class19 method1409(class19 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3327++;
        int var7 = this.field3318[arg5];
        int var8 = this.field3341[arg5];
        class211 var9 = class17.method153(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method176(true, true, true);
        }
        class211 var11 = null;
        int var12 = arg4 & 0x3;
        if (arg3 != -3) {
            this.field3342 = -26;
        }
        if ((this.field3331 || class293.field5234) && arg1 != -1 && this.field3341.length > arg1) {
            int var13 = this.field3341[arg1];
            var11 = class17.method153(var13 >> 16, true);
            arg1 = var13 & 0xFFFF;
        }
        class19 var14;
        if (var11 == null) {
            var14 = arg0.method176(!var9.method1549(4096, var10), !var9.method1545(var10, false), !this.field3336);
        } else {
            var14 = arg0.method176(!var9.method1549(4096, var10) & !var11.method1549(4096, arg1), !var9.method1545(var10, false) & !var11.method1545(arg1, false), !this.field3336);
        }
        if (class97.field1824 && this.field3336) {
            if (var12 == 1) {
                ((class299) var14).method2114();
            } else if (var12 == 2) {
                ((class299) var14).method2117();
            } else if (var12 == 3) {
                ((class299) var14).method2110();
            }
        } else if (var12 == 1) {
            var14.method185();
        } else if (var12 == 2) {
            var14.method169();
        } else if (var12 == 3) {
            var14.method183();
        }
        var14.method174(var9, var10, var11, arg1, arg2 - 1, var7, this.field3336);
        if (class97.field1824 && this.field3336) {
            if (var12 == 1) {
                ((class299) var14).method2110();
            } else if (var12 == 2) {
                ((class299) var14).method2117();
            } else if (var12 == 3) {
                ((class299) var14).method2114();
            }
        } else if (var12 == 1) {
            var14.method183();
        } else if (var12 == 2) {
            var14.method169();
        } else if (var12 == 3) {
            var14.method185();
        }
        return var14;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILvh;)V", line = 309)
    private final void method1410(int arg0, int arg1, class53 arg2) {
        field3319++;
        if (arg1 >= -101) {
            field3347 = (class149) null;
        }
        if (arg0 == 1) {
            int var13 = arg2.method468(28214);
            this.field3318 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3318[var14] = arg2.method468(28214);
            }
            this.field3341 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3341[var15] = arg2.method468(28214);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3341[var16] = (arg2.method468(28214) << 16) + this.field3341[var16];
            }
        } else if (arg0 == 2) {
            this.field3350 = arg2.method468(28214);
        } else if (arg0 == 3) {
            this.field3326 = new boolean[256];
            int var4 = arg2.method483(-101);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3326[arg2.method483(-114)] = true;
            }
        } else if (arg0 == 4) {
            this.field3349 = true;
        } else if (arg0 == 5) {
            this.field3321 = arg2.method483(-107);
        } else if (arg0 == 6) {
            this.field3324 = arg2.method468(28214);
        } else if (arg0 == 7) {
            this.field3338 = arg2.method468(28214);
        } else if (arg0 == 8) {
            this.field3344 = arg2.method483(-120);
        } else if (arg0 == 9) {
            this.field3339 = arg2.method483(-124);
        } else if (arg0 == 10) {
            this.field3342 = arg2.method483(-126);
        } else if (arg0 == 11) {
            this.field3317 = arg2.method483(-101);
        } else if (arg0 == 12) {
            int var6 = arg2.method483(-122);
            this.field3352 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3352[var7] = arg2.method468(28214);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field3352[var8] = (arg2.method468(28214) << 16) + this.field3352[var8];
            }
        } else if (arg0 == 13) {
            int var9 = arg2.method468(28214);
            this.field3316 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg2.method483(-104);
                if (var11 > 0) {
                    this.field3316[var10] = new int[var11];
                    this.field3316[var10][0] = arg2.method461((byte) 118);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field3316[var10][var12] = arg2.method468(28214);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3336 = true;
        } else if (arg0 == 15) {
            this.field3331 = true;
        } else if (arg0 == 16) {
            this.field3337 = true;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLvh;)V", line = 480)
    public final void method1411(byte arg0, class53 arg1) {
        field3333++;
        while (true) {
            int var3 = arg1.method483(-120);
            if (var3 == 0) {
                if (arg0 <= 52) {
                    this.field3317 = -91;
                }
                return;
            }
            this.method1410(var3, -118, arg1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lga;IIIB)Lga;", line = 507)
    public final class19 method1412(class19 arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = this.field3318[arg2];
        int var7 = this.field3341[arg2];
        field3340++;
        class211 var8 = class17.method153(var7 >> 16, true);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method159(true, true, true);
        }
        class211 var10 = null;
        class211 var11 = null;
        int var12 = 0;
        class211 var13 = null;
        int var14 = 0;
        if ((this.field3331 || class293.field5234) && arg3 != -1 && arg3 < this.field3341.length) {
            int var15 = this.field3341[arg3];
            var11 = class17.method153(var15 >> 16, true);
            arg3 = var15 & 0xFFFF;
        }
        if (this.field3352 != null) {
            if (this.field3352.length > arg2) {
                var12 = this.field3352[arg2];
                if (var12 != 65535) {
                    var10 = class17.method153(var12 >> 16, true);
                    var12 &= 0xFFFF;
                }
            }
            if ((this.field3331 || class293.field5234) && arg3 != -1 && arg3 < this.field3352.length) {
                var14 = this.field3352[arg3];
                if (var14 != 65535) {
                    var13 = class17.method153(var14 >> 16, true);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1549(4096, var9);
        boolean var17 = !var8.method1545(var9, false);
        if (var10 != null) {
            var16 &= !var10.method1549(4096, var12);
            var17 &= !var10.method1545(var12, false);
        }
        if (var11 != null) {
            var16 &= !var11.method1549(4096, arg3);
            var17 &= !var11.method1545(arg3, false);
        }
        if (var13 != null) {
            var16 &= !var13.method1549(4096, var14);
            var17 &= !var13.method1545(var14, false);
        }
        class19 var18 = arg0.method159(var16, var17, !this.field3336);
        var18.method174(var8, var9, var11, arg3, arg1 - 1, var6, this.field3336);
        if (arg4 >= -8) {
            return (class19) null;
        } else {
            if (var10 != null) {
                var18.method174(var10, var12, var13, var14, arg1 - 1, var6, this.field3336);
            }
            return var18;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 645)
    public final void method1413(byte arg0) {
        if (this.field3339 == -1) {
            if (this.field3326 == null) {
                this.field3339 = 0;
            } else {
                this.field3339 = 2;
            }
        }
        if (arg0 != 104) {
            this.field3350 = 117;
        }
        field3346++;
        if (this.field3342 != -1) {
            return;
        }
        if (this.field3326 == null) {
            this.field3342 = 0;
        } else {
            this.field3342 = 2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLok;)Lom;", line = 682)
    public static final class70 method1414(int arg0, boolean arg1, class149 arg2) {
        field3345++;
        if (class125.method993(arg2, 127, arg0)) {
            if (!arg1) {
                method1406((byte) 4, -21);
            }
            return class20.method192(false);
        } else {
            return null;
        }
    }
}
