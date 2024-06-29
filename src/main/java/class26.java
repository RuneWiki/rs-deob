import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public abstract class class26 {

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "Z")
    private boolean field402;

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "Z")
    public boolean field404;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "Lv;")
    public static class40 field386 = class24.method170("Water Source", (byte) -106);

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Lv;")
    public static class40 field390 = class24.method170("Platebody Shop", (byte) 24);

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "Lv;")
    public static class40 field399 = class24.method170("sprites", (byte) -102);

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "Lv;")
    public static class40 field400 = class24.method170("map", (byte) 29);

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "Lv;")
    public static class40 field405 = class24.method170("???", (byte) 78);

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "Lv;")
    public static class40 field403 = class24.method170("Tannery", (byte) 32);

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Z")
    public static boolean field389 = false;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Lna;")
    private class25 field391;

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "[I")
    private int[] field395;

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "[I")
    public int[] field398;

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "[I")
    private int[] field401;

    @OriginalMember(owner = "mapview!o", name = "u", descriptor = "[I")
    private int[] field406;

    @OriginalMember(owner = "mapview!o", name = "w", descriptor = "[I")
    private int[] field408;

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "[Lna;")
    private class25[] field396;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field388;

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "[[I")
    private int[][] field394;

    @OriginalMember(owner = "mapview!o", name = "v", descriptor = "[[I")
    private int[][] field407;

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field393;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IB[I)Z", line = 11)
    private final boolean method179(int arg0, byte arg1, int[] arg2) {
        if (arg1 != -104) {
            return false;
        } else if (this.field388[arg0] == null) {
            return false;
        } else {
            int var4 = this.field395[arg0];
            int[] var5 = this.field407[arg0];
            Object[] var6 = this.field393[arg0];
            boolean var7 = true;
            for (int var8 = 0; var8 < var4; var8++) {
                if (var6[var5[var8]] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var9;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var9 = mapview.method168(false, (byte) -109, this.field388[arg0]);
            } else {
                var9 = mapview.method168(true, (byte) -102, this.field388[arg0]);
                class5 var10 = new class5(var9);
                var10.method30((byte) 58, var10.field66.length, arg2, 5);
            }
            byte[] var11;
            try {
                var11 = class19.method114(-118, var9);
            } catch (RuntimeException var28) {
                throw class1.method2(var28, "T3 - " + (arg2 != null) + "," + arg0 + "," + var9.length + "," + mapview.method165(var9.length, var9, (byte) -104) + "," + mapview.method165(var9.length - 2, var9, (byte) -104) + "," + this.field408[arg0] + "," + this.field397);
            }
            if (this.field404) {
                this.field388[arg0] = null;
            }
            if (var4 > 1) {
                int var13 = var11.length;
                int var29 = var13 - 1;
                int var14 = var11[var29] & 0xFF;
                int var15 = var29 - var4 * var14 * 4;
                int[] var16 = new int[var4];
                class5 var17 = new class5(var11);
                var17.field64 = var15;
                for (int var18 = 0; var18 < var14; var18++) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var4; var20++) {
                        var19 += var17.method33(arg1 - 16307);
                        var16[var20] += var19;
                    }
                }
                byte[][] var21 = new byte[var4][];
                for (int var22 = 0; var22 < var4; var22++) {
                    var21[var22] = new byte[var16[var22]];
                    var16[var22] = 0;
                }
                var17.field64 = var15;
                int var23 = 0;
                for (int var24 = 0; var24 < var14; var24++) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < var4; var26++) {
                        var25 += var17.method33(arg1 ^ 0x407D);
                        class28.method192(var11, var23, var21[var26], var16[var26], var25);
                        var16[var26] += var25;
                        var23 += var25;
                    }
                }
                for (int var27 = 0; var27 < var4; var27++) {
                    if (this.field402) {
                        var6[var5[var27]] = var21[var27];
                    } else {
                        var6[var5[var27]] = class16.method84(false, var21[var27], (byte) 12);
                    }
                }
            } else if (this.field402) {
                var6[var5[0]] = var11;
            } else {
                var6[var5[0]] = class16.method84(false, var11, (byte) 12);
            }
            return true;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(III)[B", line = 174)
    public final byte[] method180(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            this.method183(null, null, 7);
        }
        return this.method187(arg1, null, arg2, (byte) -84);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IB)V", line = 198)
    private final void method181(int arg0, byte arg1) {
        if (arg1 > -111) {
            this.field392 = 20;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 207)
    public static void method182(int arg0) {
        field399 = null;
        field386 = null;
        field390 = null;
        field405 = null;
        field400 = null;
        if (arg0 != 0) {
            method182(111);
        }
        field403 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lv;Lv;I)[B", line = 224)
    public final byte[] method183(class40 arg0, class40 arg1, int arg2) {
        class40 var4 = arg1.method256((byte) 116);
        class40 var5 = arg0.method256((byte) 116);
        int var6 = this.field391.method175(20792, var4.method253(false));
        if (arg2 != -5541) {
            field386 = null;
        }
        int var7 = this.field396[var6].method175(20792, var5.method253(false));
        return this.method180(1, var7, var6);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lv;I)I", line = 250)
    public final int method184(class40 arg0, int arg1) {
        class40 var3 = arg0.method256((byte) 116);
        if (arg1 != -20310) {
            field400 = null;
        }
        return this.field391.method175(20792, var3.method253(false));
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IBLv;)I", line = 279)
    public final int method185(int arg0, byte arg1, class40 arg2) {
        if (arg1 != 98) {
            this.method188(-126, null);
        }
        class40 var4 = arg2.method256((byte) 116);
        return this.field396[arg0].method175(20792, var4.method253(false));
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(III)V", line = 327)
    public static final void method186(int arg0, int arg1, int arg2) {
        class8.field107 = arg0 & 0x3F;
        class12.field125 = arg2 & arg1;
        class20.field213 = (class12.field125 << 6) + class8.field107;
        class40.field514 = arg1 >> 6;
        class40.field520 = arg0 >> 6;
        mapview.method150(13);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I[IIB)[B", line = 348)
    private final byte[] method187(int arg0, int[] arg1, int arg2, byte arg3) {
        if (arg2 < 0 || arg2 >= this.field393.length || this.field393[arg2] == null || arg0 < 0 || arg0 >= this.field393[arg2].length) {
            return null;
        }
        if (arg3 != -84) {
            this.method184(null, -105);
        }
        if (this.field393[arg2][arg0] == null) {
            boolean var5 = this.method179(arg2, (byte) -104, arg1);
            if (!var5) {
                this.method181(arg2, (byte) -125);
                boolean var6 = this.method179(arg2, (byte) -104, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = mapview.method168(false, (byte) -61, this.field393[arg2][arg0]);
        if (this.field402) {
            this.field393[arg2][arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "(ZZ)V", line = 391)
    public class26(boolean arg0, boolean arg1) {
        this.field402 = arg1;
        this.field404 = arg0;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I[B)V", line = 405)
    public final void method188(int arg0, byte[] arg1) {
        this.field397 = mapview.method165(arg1.length, arg1, (byte) -104);
        class5 var3 = new class5(class19.method114(-51, arg1));
        int var4 = var3.method28(arg0 - 124);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method33(-16411);
        }
        int var5 = var3.method28(93);
        int var6 = arg0;
        int var7 = 0;
        this.field392 = var3.method31(-14467);
        this.field398 = new int[this.field392];
        for (int var8 = 0; var8 < this.field392; var8++) {
            this.field398[var8] = var7 += var3.method31(-14467);
            if (var6 < this.field398[var8]) {
                var6 = this.field398[var8];
            }
        }
        this.field406 = new int[var6 + 1];
        this.field408 = new int[var6 + 1];
        this.field388 = new Object[var6 + 1];
        this.field395 = new int[var6 + 1];
        this.field393 = new Object[var6 + 1][];
        this.field407 = new int[var6 + 1][];
        if (var5 != 0) {
            this.field401 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field401[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field392; var10++) {
                this.field401[this.field398[var10]] = var3.method33(-16411);
            }
            this.field391 = new class25(this.field401);
        }
        for (int var11 = 0; var11 < this.field392; var11++) {
            this.field408[this.field398[var11]] = var3.method33(class36.method219(arg0, 16410));
        }
        for (int var12 = 0; var12 < this.field392; var12++) {
            this.field406[this.field398[var12]] = var3.method33(-16411);
        }
        for (int var13 = 0; var13 < this.field392; var13++) {
            this.field395[this.field398[var13]] = var3.method31(arg0 - 14466);
        }
        for (int var14 = 0; var14 < this.field392; var14++) {
            int var15 = 0;
            int var16 = this.field398[var14];
            int var17 = -1;
            int var18 = this.field395[var16];
            this.field407[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field407[var16][var19] = var15 += var3.method31(arg0 - 14466);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field393[var16] = new Object[var17 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field394 = new int[var6 + 1][];
        this.field396 = new class25[var6 + 1];
        for (int var21 = 0; var21 < this.field392; var21++) {
            int var22 = this.field398[var21];
            int var23 = this.field395[var22];
            this.field394[var22] = new int[this.field393[var22].length];
            for (int var24 = 0; var24 < this.field393[var22].length; var24++) {
                this.field394[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                this.field394[var22][this.field407[var22][var25]] = var3.method33(-16411);
            }
            this.field396[var22] = new class25(this.field394[var22]);
        }
    }
}
