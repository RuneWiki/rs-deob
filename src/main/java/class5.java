import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public abstract class class5 {

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Z")
    public boolean field41;

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "Z")
    private boolean field47;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "Lf;")
    public static class10 field30 = class23.method139("Platebody Shop", (byte) -123);

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Lf;")
    public static class10 field43 = class23.method139("Loading", (byte) -72);

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "Lf;")
    public static class10 field37 = class23.method139("Transportation", (byte) -61);

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "Lf;")
    public static class10 field46 = class23.method139("_", (byte) -103);

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "mapview!c", name = "w", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "Lm;")
    public static class24 field36;

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "Lqa;")
    private class33 field40;

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "Lw;")
    public static class41 field45;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "[I")
    private int[] field31;

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "[I")
    public int[] field32;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "[I")
    private int[] field33;

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "[I")
    private int[] field39;

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "[I")
    private int[] field48;

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "[I")
    private int[] field49;

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "[Lqa;")
    private class33[] field34;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field35;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "[[I")
    private int[][] field44;

    @OriginalMember(owner = "mapview!c", name = "x", descriptor = "[[I")
    private int[][] field53;

    @OriginalMember(owner = "mapview!c", name = "v", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field51;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([IIZ)Z", line = 9)
    private final boolean method22(int[] arg0, int arg1, boolean arg2) {
        if (!this.method34(73, arg1)) {
            return false;
        } else if (this.field35[arg1] == null) {
            return false;
        } else {
            if (arg2) {
                this.field35 = null;
            }
            int var4 = this.field31[arg1];
            boolean var5 = true;
            int[] var6 = this.field44[arg1];
            if (this.field51[arg1] == null) {
                this.field51[arg1] = new Object[this.field48[arg1]];
            }
            Object[] var7 = this.field51[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var6 == null) {
                    var9 = var8;
                } else {
                    var9 = var6[var8];
                }
                if (var7[var9] == null) {
                    var5 = false;
                    break;
                }
            }
            if (var5) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class11.method84(false, this.field35[arg1], 127);
            } else {
                var10 = class11.method84(true, this.field35[arg1], 106);
                class28 var11 = new class28(var10);
                var11.method188(5, arg0, var11.field392.length, 1279876192);
            }
            byte[] var12;
            try {
                var12 = class21.method132(var10, -96);
            } catch (RuntimeException var31) {
                throw class6.method35(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class31.method196(-20838, var10.length, var10) + "," + class31.method196(-20838, var10.length - 2, var10) + "," + this.field49[arg1] + "," + this.field42);
            }
            if (this.field41) {
                this.field35[arg1] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var6 == null) {
                    var14 = 0;
                } else {
                    var14 = var6[0];
                }
                if (this.field47) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class31.method199(var12, false, 89);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                class28 var17 = new class28(var12);
                int var18 = var32 - var4 * 4 * var16;
                var17.field389 = var18;
                int[] var19 = new int[var4];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var17.method181(-9110);
                        if (var6 != null) {
                        }
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var17.field389 = var18;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var17.method181(-9110);
                        class40.method253(var12, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field47) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class31.method199(var23[var29], false, 105);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 209)
    public static final void method23(int arg0) {
        class2 var1 = class7.field65;
        synchronized (class7.field65) {
            class30.field418 = class19.field177;
            class15.field144 = class27.field381;
            class15.field143 = class25.field278;
            class25.field280 = class6.field63;
            class25.field272 = class2.field18;
            class18.field173 = class30.field406;
            class6.field63 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIB[I)[B", line = 237)
    private final byte[] method24(int arg0, int arg1, byte arg2, int[] arg3) {
        if (!this.method26(arg0, 22335, arg1)) {
            return null;
        }
        if (this.field51[arg1] == null || this.field51[arg1][arg0] == null) {
            boolean var5 = this.method22(arg3, arg1, false);
            if (!var5) {
                this.method27((byte) -127, arg1);
                boolean var6 = this.method22(arg3, arg1, false);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg2 != 117) {
            return (byte[]) null;
        }
        byte[] var7 = class11.method84(false, this.field51[arg1][arg0], 73);
        if (this.field47) {
            this.field51[arg1][arg0] = null;
            if (this.field48[arg1] == 1) {
                this.field51[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)[Ln;", line = 279)
    public static final class26[] method25(byte arg0) {
        class26[] var1 = new class26[class21.field239];
        int var2 = 0;
        if (arg0 != -48) {
            field30 = null;
        }
        while (class21.field239 > var2) {
            class26 var3 = new class26();
            var3.field374 = class17.field153;
            var3.field373 = class18.field168;
            var3.field375 = class19.field180[var2];
            var3.field378 = class31.field425[var2];
            var3.field380 = class33.field470[var2];
            var3.field377 = class1.field10[var2];
            var3.field376 = class41.field539;
            var3.field379 = class35.field490[var2];
            var1[var2] = var3;
            var2++;
        }
        class18.method113(-1);
        return var1;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)Z", line = 319)
    private final boolean method26(int arg0, int arg1, int arg2) {
        if (arg1 != 22335) {
            this.method27((byte) -43, -70);
        }
        if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field48.length && this.field48[arg2] > arg0) {
            return true;
        } else if (class10.field102) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BI)V", line = 348)
    private final void method27(byte arg0, int arg1) {
        if (arg0 > -123) {
            field30 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILf;I)I", line = 367)
    public final int method28(int arg0, class10 arg1, int arg2) {
        if (!this.method34(-105, arg2)) {
            return -1;
        }
        class10 var4 = arg1.method55(-12290);
        int var5 = this.field34[arg2].method217(var4.method66(false), false);
        if (arg0 >= -108) {
            method25((byte) -49);
        }
        return this.method26(var5, 22335, arg2) ? var5 : -1;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(III)[B", line = 394)
    public final byte[] method29(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.method24(36, -64, (byte) 65, null);
        }
        return this.method24(arg2, arg1, (byte) 117, null);
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)V", line = 423)
    public static void method30(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field45 = null;
        field30 = null;
        field37 = null;
        field36 = null;
        field43 = null;
        field46 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lf;I)I", line = 443)
    public final int method31(class10 arg0, int arg1) {
        class10 var3 = arg0.method55(-12290);
        if (arg1 >= -101) {
            field52 = -84;
        }
        int var4 = this.field40.method217(var3.method66(false), false);
        return this.method34(103, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BB)V", line = 463)
    public final void method32(byte[] arg0, byte arg1) {
        this.field42 = class31.method196(-20838, arg0.length, arg0);
        class28 var3 = new class28(class21.method132(arg0, -128));
        int var4 = var3.method182(-112);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method181(-9110);
        }
        int var5 = -1;
        int var6 = var3.method182(-110);
        int var7 = 0;
        this.field50 = var3.method184(-2);
        if (arg1 < 123) {
            this.method34(99, -125);
        }
        this.field32 = new int[this.field50];
        for (int var8 = 0; var8 < this.field50; var8++) {
            this.field32[var8] = var7 += var3.method184(-2);
            if (var5 < this.field32[var8]) {
                var5 = this.field32[var8];
            }
        }
        this.field49 = new int[var5 + 1];
        this.field33 = new int[var5 + 1];
        this.field48 = new int[var5 + 1];
        this.field51 = new Object[var5 + 1][];
        this.field31 = new int[var5 + 1];
        this.field35 = new Object[var5 + 1];
        this.field44 = new int[var5 + 1][];
        if (var6 != 0) {
            this.field39 = new int[var5 + 1];
            for (int var9 = 0; var9 < var5 + 1; var9++) {
                this.field39[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field50; var10++) {
                this.field39[this.field32[var10]] = var3.method181(-9110);
            }
            this.field40 = new class33(this.field39);
        }
        for (int var11 = 0; var11 < this.field50; var11++) {
            this.field49[this.field32[var11]] = var3.method181(-9110);
        }
        for (int var12 = 0; var12 < this.field50; var12++) {
            this.field33[this.field32[var12]] = var3.method181(-9110);
        }
        for (int var13 = 0; var13 < this.field50; var13++) {
            this.field31[this.field32[var13]] = var3.method184(-2);
        }
        for (int var14 = 0; var14 < this.field50; var14++) {
            int var15 = this.field32[var14];
            int var16 = 0;
            int var17 = this.field31[var15];
            this.field44[var15] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field44[var15][var19] = var16 += var3.method184(-2);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field48[var15] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field44[var15] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field34 = new class33[var5 + 1];
        this.field53 = new int[var5 + 1][];
        for (int var21 = 0; var21 < this.field50; var21++) {
            int var22 = this.field32[var21];
            int var23 = this.field31[var22];
            this.field53[var22] = new int[this.field48[var22]];
            for (int var24 = 0; var24 < this.field48[var22]; var24++) {
                this.field53[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field44[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field44[var22][var25];
                }
                this.field53[var22][var26] = var3.method181(-9110);
            }
            this.field34[var22] = new class33(this.field53[var22]);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILf;Lf;)[B", line = 651)
    public final byte[] method33(int arg0, class10 arg1, class10 arg2) {
        class10 var4 = arg2.method55(-12290);
        class10 var5 = arg1.method55(-12290);
        int var6 = this.field40.method217(var4.method66(false), false);
        if (arg0 >= -8) {
            return (byte[]) null;
        } else if (this.method34(-100, var6)) {
            int var7 = this.field34[var6].method217(var5.method66(false), false);
            return this.method29(-1, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II)Z", line = 672)
    private final boolean method34(int arg0, int arg1) {
        int var3 = -37 % ((-arg0 - 53) / 33);
        if (arg1 >= 0 && arg1 < this.field48.length && this.field48[arg1] != 0) {
            return true;
        } else if (class10.field102) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(ZZ)V", line = 692)
    public class5(boolean arg0, boolean arg1) {
        this.field41 = arg0;
        this.field47 = arg1;
    }
}
