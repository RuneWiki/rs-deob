import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 extends class44 {

    @OriginalMember(owner = "client!he", name = "yb", descriptor = "I")
    public int field1229 = -1;

    @OriginalMember(owner = "client!he", name = "Eb", descriptor = "I")
    public int field1235 = -1;

    @OriginalMember(owner = "client!he", name = "Lb", descriptor = "I")
    public int field1242 = 2;

    @OriginalMember(owner = "client!he", name = "Fb", descriptor = "I")
    public int field1236 = -1;

    @OriginalMember(owner = "client!he", name = "Rb", descriptor = "I")
    public int field1248 = -1;

    @OriginalMember(owner = "client!he", name = "Wb", descriptor = "I")
    public int field1253 = 5;

    @OriginalMember(owner = "client!he", name = "Xb", descriptor = "I")
    public int field1254 = 99;

    @OriginalMember(owner = "client!he", name = "Zb", descriptor = "I")
    public int field1256 = -1;

    @OriginalMember(owner = "client!he", name = "Yb", descriptor = "Z")
    public boolean field1255 = false;

    @OriginalMember(owner = "client!he", name = "Ab", descriptor = "La;")
    public static class1 field1231 = class113.method934(-11538, ":tradereq:");

    @OriginalMember(owner = "client!he", name = "Jb", descriptor = "La;")
    public static class1 field1240 = class113.method934(-11538, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!he", name = "Ib", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!he", name = "Qb", descriptor = "La;")
    public static class1 field1247 = class113.method934(-11538, "titlebox");

    @OriginalMember(owner = "client!he", name = "Db", descriptor = "La;")
    public static class1 field1234 = class113.method934(-11538, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!he", name = "Pb", descriptor = "La;")
    public static class1 field1246 = class113.method934(-11538, "sch-Utteln:");

    @OriginalMember(owner = "client!he", name = "sb", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!he", name = "tb", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!he", name = "vb", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!he", name = "wb", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!he", name = "xb", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!he", name = "zb", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!he", name = "Gb", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!he", name = "Ob", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!he", name = "Tb", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!he", name = "Ub", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!he", name = "Vb", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!he", name = "Mb", descriptor = "Lbd;")
    public static class11 field1243;

    @OriginalMember(owner = "client!he", name = "Kb", descriptor = "Ljd;")
    public static class58 field1241;

    @OriginalMember(owner = "client!he", name = "ub", descriptor = "[I")
    public int[] field1225;

    @OriginalMember(owner = "client!he", name = "Bb", descriptor = "[I")
    private int[] field1232;

    @OriginalMember(owner = "client!he", name = "Hb", descriptor = "[I")
    private int[] field1238;

    @OriginalMember(owner = "client!he", name = "Nb", descriptor = "[I")
    public int[] field1244;

    @OriginalMember(owner = "client!he", name = "Cb", descriptor = "[Ljd;")
    public static class58[] field1233;

    @OriginalMember(owner = "client!he", name = "Sb", descriptor = "[[I")
    public static int[][] field1249;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V", line = 7)
    public static void method486(int arg0) {
        field1247 = null;
        field1243 = null;
        field1234 = null;
        field1241 = null;
        if (arg0 < 47) {
            method489(null, 56, null, 0, -91, 58, -86);
        }
        field1231 = null;
        field1233 = null;
        field1240 = null;
        field1246 = null;
        field1249 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lpa;Lhe;IIB)Lpa;", line = 29)
    public final class91 method487(class91 arg0, class47 arg1, int arg2, int arg3, byte arg4) {
        int var6 = this.field1244[arg2];
        field1228++;
        class114 var7 = class108.method900((byte) -99, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method496(arg3, arg0, false);
        }
        int var9 = arg1.field1244[arg3];
        class114 var10 = class108.method900((byte) -99, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class91 var12 = arg0.method788(!var7.method941(var8, 124));
            var12.method796(var7, var8);
            return var12;
        } else if (arg4 == 63) {
            class91 var13 = arg0.method788(!var7.method941(var8, 122) & !var10.method941(var11, 123));
            var13.method780(var7, var8, var10, var11, this.field1232);
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 70)
    public final void method488(byte arg0) {
        if (this.field1235 == -1) {
            if (this.field1232 == null) {
                this.field1235 = 0;
            } else {
                this.field1235 = 2;
            }
        }
        int var2 = -117 / ((-arg0 - 76) / 39);
        if (this.field1229 == -1) {
            if (this.field1232 == null) {
                this.field1229 = 0;
            } else {
                this.field1229 = 2;
            }
        }
        field1250++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([Lad;I[BIIII)V", line = 103)
    public static final void method489(class5[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field1251++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg0[var7].field202[arg4 + var12][arg5 + var13] = class132.method1034(arg0[var7].field202[arg4 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class8 var8 = new class8(arg2);
        if (arg3 != -6) {
            return;
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class98.method844(var10 + arg4, 0, var8, -99, arg5 + var11, arg6, arg1, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZLpa;I)Lpa;", line = 170)
    public final class91 method490(int arg0, boolean arg1, class91 arg2, int arg3) {
        field1227++;
        int var5 = this.field1244[arg0];
        class114 var6 = class108.method900((byte) -99, var5 >> 16);
        if (arg1) {
            this.field1238 = null;
        }
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method788(true);
        }
        int var8 = arg3 & 0x3;
        class91 var9 = arg2.method788(!var6.method941(var7, 124));
        if (var8 == 1) {
            var9.method795();
        } else if (var8 == 2) {
            var9.method790();
        } else if (var8 == 3) {
            var9.method784();
        }
        var9.method796(var6, var7);
        if (var8 == 1) {
            var9.method784();
        } else if (var8 == 2) {
            var9.method790();
        } else if (var8 == 3) {
            var9.method795();
        }
        return var9;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILba;)V", line = 220)
    public final void method491(int arg0, class8 arg1) {
        field1223++;
        while (true) {
            int var3 = arg1.method145(false);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.field1229 = -80;
                    return;
                }
            }
            this.method492(-102, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILba;)V", line = 274)
    private final void method492(int arg0, int arg1, class8 arg2) {
        int var4 = 3 / ((arg0 + 12) / 51);
        field1224++;
        if (arg1 == 1) {
            int var5 = arg2.method145(false);
            this.field1225 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1225[var6] = arg2.method146(65280);
            }
            this.field1244 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field1244[var7] = arg2.method146(65280);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field1244[var8] += arg2.method146(65280) << 16;
            }
        } else if (arg1 == 2) {
            this.field1256 = arg2.method146(65280);
        } else if (arg1 == 3) {
            int var12 = arg2.method145(false);
            this.field1232 = new int[var12 + 1];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1232[var13] = arg2.method145(false);
            }
            this.field1232[var12] = 9999999;
        } else if (arg1 == 4) {
            this.field1255 = true;
        } else if (arg1 == 5) {
            this.field1253 = arg2.method145(false);
        } else if (arg1 == 6) {
            this.field1236 = arg2.method146(65280);
        } else if (arg1 == 7) {
            this.field1248 = arg2.method146(65280);
        } else if (arg1 == 8) {
            this.field1254 = arg2.method145(false);
        } else if (arg1 == 9) {
            this.field1229 = arg2.method145(false);
        } else if (arg1 == 10) {
            this.field1235 = arg2.method145(false);
        } else if (arg1 == 11) {
            this.field1242 = arg2.method145(false);
            return;
        } else if (arg1 == 12) {
            int var9 = arg2.method145(false);
            this.field1238 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1238[var10] = arg2.method146(65280);
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1238[var11] += arg2.method146(65280) << 16;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBI)Z", line = 397)
    public static final boolean method493(int arg0, int arg1, byte arg2, int arg3) {
        field1245++;
        int var4 = arg1 >> 14 & 0x7FFF;
        if (arg2 > -9) {
            method493(-4, -74, (byte) -44, -62);
        }
        int var5 = class130.field3186.method98(class2.field76, arg0, arg3, arg1);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class49 var8 = class32.method390(var4, (byte) 127);
            int var9 = var8.field1297;
            if (var6 != 0) {
                var9 = (var9 >> 4 - var6) + (var9 << var6 & 0xF);
            }
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var11 = var8.field1300;
                var10 = var8.field1288;
            } else {
                var10 = var8.field1300;
                var11 = var8.field1288;
            }
            class60.method579(var10, var9, class104.field2624.field1965[0], arg0, (byte) 94, 0, true, 0, var11, class104.field2624.field2012[0], arg3, 2);
        } else {
            class60.method579(0, 0, class104.field2624.field1965[0], arg0, (byte) 98, var7 + 1, true, var6, 0, class104.field2624.field2012[0], arg3, 2);
        }
        class119.field2970 = class112.field2765;
        class92.field2298 = 2;
        class16.field524 = class1.field14;
        class34.field895 = 0;
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLpa;I)Lpa;", line = 451)
    public final class91 method494(byte arg0, class91 arg1, int arg2) {
        int var4 = this.field1244[arg2];
        field1226++;
        class114 var5 = class108.method900((byte) -99, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method777(true);
        } else if (arg0 == -87) {
            class91 var7 = arg1.method777(!var5.method941(var6, 124));
            var7.method796(var5, var6);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILpa;Z)Lpa;", line = 480)
    public final class91 method495(int arg0, class91 arg1, boolean arg2) {
        field1252++;
        int var4 = this.field1244[arg0];
        class114 var5 = class108.method900((byte) -99, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method788(true);
        }
        if (!arg2) {
            this.method491(98, null);
        }
        class114 var7 = null;
        int var8 = 0;
        if (this.field1238 != null && this.field1238.length > arg0) {
            int var9 = this.field1238[arg0];
            var7 = class108.method900((byte) -99, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class91 var11 = arg1.method788(!var5.method941(var6, 126));
            var11.method796(var5, var6);
            return var11;
        } else {
            class91 var10 = arg1.method788(!var5.method941(var6, 121) & !var7.method941(var8, 123));
            var10.method796(var5, var6);
            var10.method796(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(ILpa;Z)Lpa;", line = 531)
    public final class91 method496(int arg0, class91 arg1, boolean arg2) {
        if (arg2) {
            this.method488((byte) -78);
        }
        int var4 = this.field1244[arg0];
        field1230++;
        class114 var5 = class108.method900((byte) -99, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method788(true);
        } else {
            class91 var7 = arg1.method788(!var5.method941(var6, 126));
            var7.method796(var5, var6);
            return var7;
        }
    }
}
