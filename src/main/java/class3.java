import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lke;")
    public class65 field27 = new class65();

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lrc;")
    private static class105 field24 = class43.method374("Report abuse", 0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lrc;")
    private static class105 field23 = class43.method374("Invalid username or password)3", 0);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lrc;")
    public static class105 field32 = class43.method374("Lade Wordpack )2 ", 0);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lrc;")
    public static class105 field25 = field23;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Lrc;")
    public static class105 field46 = class43.method374("Diese Welt ist voll)3", 0);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lrc;")
    public static class105 field31 = field24;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field36 = new Object();

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Lrc;")
    public static class105 field53 = class43.method374("m-Ochte sich mit Ihnen duellieren)3", 0);

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Z")
    public static boolean field56 = false;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "Lrc;")
    public static class105 field54 = class43.method374("(Udns", 0);

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Lrc;")
    public static class105 field51 = class43.method374("Ihre Nachricht an: ", 0);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Ls;")
    public static class108 field34;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lke;")
    private class65 field41;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "[I")
    public static int[] field55;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 18)
    public static void method21(int arg0) {
        field32 = null;
        field55 = null;
        field46 = null;
        field51 = null;
        field36 = null;
        field25 = null;
        field53 = null;
        field54 = null;
        field34 = null;
        field31 = null;
        field24 = null;
        if (arg0 != -31280) {
            field23 = null;
        }
        field23 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjd;)V", line = 40)
    public static final void method22(int arg0, class58 arg1) {
        arg1.field1271 = arg1.field1290;
        field44++;
        if (arg1.field1266 == 0) {
            arg1.field1242 = 0;
            return;
        }
        if (arg1.field1238 != -1 && arg1.field1230 == 0) {
            class116 var2 = class6.method49(103, arg1.field1238);
            if (arg1.field1270 > 0 && var2.field2691 == 0) {
                arg1.field1242++;
                return;
            }
            if (arg1.field1270 <= 0 && var2.field2704 == 0) {
                arg1.field1242++;
                return;
            }
        }
        int var3 = arg1.field1229;
        int var4 = arg1.field1274;
        int var5 = arg1.field1281[arg1.field1266 - 1] * 128 + arg1.field1227 * 64;
        int var6 = arg1.field1261[arg1.field1266 - 1] * 128 + arg1.field1227 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field1229 = var5;
            arg1.field1274 = var6;
            return;
        }
        if (var3 >= var5) {
            if (var3 > var5) {
                if (var6 > var4) {
                    arg1.field1253 = 768;
                } else if (var4 > var6) {
                    arg1.field1253 = 256;
                } else {
                    arg1.field1253 = 512;
                }
            } else if (var4 < var6) {
                arg1.field1253 = 1024;
            } else if (var4 > var6) {
                arg1.field1253 = 0;
            }
        } else if (var6 > var4) {
            arg1.field1253 = 1280;
        } else if (var6 < var4) {
            arg1.field1253 = 1792;
        } else {
            arg1.field1253 = 1536;
        }
        int var7 = arg1.field1253 - arg1.field1226 & 0x7FF;
        if (arg0 != 256) {
            return;
        }
        int var8 = arg1.field1285;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1278;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1265;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1259;
        }
        if (var8 == -1) {
            var8 = arg1.field1278;
        }
        int var9 = 4;
        if (arg1.field1253 != arg1.field1226 && arg1.field1214 == -1 && arg1.field1254 != 0) {
            var9 = 2;
        }
        if (arg1.field1266 > 2) {
            var9 = 6;
        }
        if (arg1.field1266 > 3) {
            var9 = 8;
        }
        arg1.field1271 = var8;
        if (arg1.field1242 > 0 && arg1.field1266 > 1) {
            arg1.field1242--;
            var9 = 8;
        }
        if (arg1.field1250[arg1.field1266 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field1278 == arg1.field1271 && arg1.field1213 != -1) {
            arg1.field1271 = arg1.field1213;
        }
        if (var5 > var3) {
            arg1.field1229 += var9;
            if (arg1.field1229 > var5) {
                arg1.field1229 = var5;
            }
        } else if (var5 < var3) {
            arg1.field1229 -= var9;
            if (arg1.field1229 < var5) {
                arg1.field1229 = var5;
            }
        }
        if (var6 > var4) {
            arg1.field1274 += var9;
            if (arg1.field1274 > var6) {
                arg1.field1274 = var6;
            }
        } else if (var6 < var4) {
            arg1.field1274 -= var9;
            if (var6 > arg1.field1274) {
                arg1.field1274 = var6;
            }
        }
        if (arg1.field1229 != var5 || arg1.field1274 != var6) {
            return;
        }
        arg1.field1266--;
        if (arg1.field1270 > 0) {
            arg1.field1270--;
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILke;)V", line = 228)
    public final void method23(int arg0, class65 arg1) {
        if (arg1.field1467 != null) {
            arg1.method551(94);
        }
        field50++;
        arg1.field1467 = this.field27.field1467;
        arg1.field1449 = this.field27;
        arg1.field1467.field1449 = arg1;
        if (arg0 == 1024) {
            arg1.field1449.field1467 = arg1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 245)
    public final void method24(int arg0) {
        if (arg0 != 1633) {
            field55 = null;
        }
        field28++;
        while (true) {
            class65 var2 = this.field27.field1449;
            if (this.field27 == var2) {
                return;
            }
            var2.method551(-120);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lke;", line = 266)
    public final class65 method25(boolean arg0) {
        field49++;
        if (arg0) {
            method30(78);
        }
        class65 var2 = this.field27.field1467;
        if (this.field27 == var2) {
            this.field41 = null;
            return null;
        } else {
            this.field41 = var2.field1467;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lke;", line = 290)
    public final class65 method26(byte arg0) {
        field40++;
        if (arg0 != 108) {
            field53 = null;
        }
        class65 var2 = this.field41;
        if (this.field27 == var2) {
            this.field41 = null;
            return null;
        } else {
            this.field41 = var2.field1449;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)V", line = 312)
    public static final void method27(boolean arg0, int arg1) {
        if (arg1 != -105) {
            method36(115, -29, null, 76);
        }
        for (int var2 = 0; var2 < class133.field3229; var2++) {
            class115 var3 = class19.field466[class24.field578[var2]];
            int var4 = (class24.field578[var2] << 14) + 536870912;
            if (var3 != null && var3.method164(arg1 ^ 0xFFFFFFF0) && arg0 == var3.field2681.field458 && var3.field2681.method222(0)) {
                int var5 = var3.field1229 >> 7;
                int var6 = var3.field1274 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field1227 == 1 && (var3.field1229 & 0x7F) == 64 && (var3.field1274 & 0x7F) == 64) {
                        if (class43.field987[var5][var6] == class105.field2421) {
                            continue;
                        }
                        class43.field987[var5][var6] = class105.field2421;
                    }
                    if (!var3.field2681.field495) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class130.field3161.method509(class73.field1619, var3.field1229, var3.field1274, class134.method1061(arg1 + 11492, class73.field1619, var3.field1227 * 64 + var3.field1229 - 64, var3.field1274 - -(var3.field1227 * 64) - 64), var3.field1227 * 64 + 60 - 64, var3, var3.field1226, var4, var3.field1284);
                }
            }
        }
        field47++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lbb;", line = 362)
    public static final class9 method28(int arg0, byte arg1) {
        class9 var2 = (class9) class42.field951.method601((long) arg0, (byte) 118);
        field43++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class36.field828.method766(arg0, (byte) -45, 1);
        class9 var4 = new class9();
        if (var3 != null) {
            var4.method117(126, arg0, new class7(var3));
        }
        var4.method123(-14304);
        if (arg1 < 35) {
            field24 = null;
        }
        class42.field951.method608((long) arg0, var4, (byte) 126);
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lke;Z)V", line = 399)
    public final void method29(class65 arg0, boolean arg1) {
        field45++;
        if (arg0.field1467 != null) {
            arg0.method551(125);
        }
        arg0.field1449 = this.field27.field1449;
        arg0.field1467 = this.field27;
        if (!arg1) {
            field54 = null;
        }
        arg0.field1467.field1449 = arg0;
        arg0.field1449.field1467 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 417)
    public static final void method30(int arg0) {
        field29++;
        class62.field1406 = true;
        class109.field2520 = true;
        if (arg0 != -1) {
            field25 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Lke;", line = 429)
    public final class65 method31(int arg0) {
        field38++;
        class65 var2 = this.field27.field1449;
        if (this.field27 == var2) {
            this.field41 = null;
            return null;
        }
        if (arg0 != 1280) {
            method27(false, -54);
        }
        this.field41 = var2.field1449;
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 546)
    public class3() {
        this.field27.field1449 = this.field27;
        this.field27.field1467 = this.field27;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Lke;", line = 453)
    public final class65 method32(boolean arg0) {
        if (arg0) {
            return null;
        }
        class65 var2 = this.field41;
        field37++;
        if (this.field27 == var2) {
            this.field41 = null;
            return null;
        } else {
            this.field41 = var2.field1467;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILpb;II)[B", line = 488)
    public static final byte[] method33(int arg0, int arg1, class92 arg2, int arg3, int arg4) {
        field33++;
        long var5 = ((long) arg4 << 32) + (long) (arg0 << 16) + (long) (arg0 * 37 + arg3 & 0xFFFF);
        if (arg1 != -9) {
            method27(true, 71);
        }
        if (class132.field3184 != null) {
            class136 var7 = (class136) class132.field3184.method601(var5, (byte) 118);
            if (var7 != null) {
                return var7.field3323;
            }
        }
        byte[] var8 = arg2.method766(arg3, (byte) -45, arg0);
        if (var8 == null) {
            return null;
        } else {
            if (class132.field3184 != null) {
                class132.field3184.method608(var5, new class136(var8), (byte) 126);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Lke;", line = 522)
    public final class65 method34(byte arg0) {
        field26++;
        class65 var2 = this.field27.field1449;
        if (this.field27 == var2) {
            return null;
        }
        var2.method551(-97);
        if (arg0 != 55) {
            field36 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lke;", line = 560)
    public final class65 method35(byte arg0) {
        class65 var2 = this.field27.field1467;
        field48++;
        if (arg0 != -92) {
            field52 = -42;
        }
        if (this.field27 == var2) {
            return null;
        } else {
            var2.method551(arg0 + 199);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[Lrc;I)Lrc;", line = 582)
    public static final class105 method36(int arg0, int arg1, class105[] arg2, int arg3) {
        field42++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class37.field867;
            }
            var4 += arg2[arg0 + var5].field2383;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg1 <= 110) {
            return null;
        }
        for (int var8 = 0; var8 < arg3; var8++) {
            class105 var10 = arg2[arg0 + var8];
            class82.method697(var10.field2417, 0, var6, var7, var10.field2383);
            var7 += var10.field2383;
        }
        class105 var9 = new class105();
        var9.field2383 = var4;
        var9.field2417 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILke;Lke;)V", line = 635)
    public final void method37(int arg0, class65 arg1, class65 arg2) {
        if (arg1.field1467 != null) {
            arg1.method551(-120);
        }
        arg1.field1449 = arg2;
        arg1.field1467 = arg2.field1467;
        field35++;
        if (arg0 != 0) {
            field24 = null;
        }
        arg1.field1467.field1449 = arg1;
        arg1.field1449.field1467 = arg1;
    }
}
