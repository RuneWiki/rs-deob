import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public abstract class class19 {

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Z")
    public boolean field233;

    @OriginalMember(owner = "mapview!k", name = "o", descriptor = "Z")
    private boolean field239;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "Lt;")
    public static class36 field225 = class3.method8(13631, "uitext has incorrect number of strings");

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "Lt;")
    public static class36 field228 = class3.method8(13631, "Dungeon");

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "Z")
    public static boolean field232 = false;

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "Lt;")
    public static class36 field237 = class3.method8(13631, "Achievement Start");

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "Lt;")
    public static class36 field238 = class3.method8(13631, "Rare Trees");

    @OriginalMember(owner = "mapview!k", name = "q", descriptor = "Lt;")
    public static class36 field241 = class3.method8(13631, "labels)3dat");

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "mapview!k", name = "u", descriptor = "Lsa;")
    private class35 field245;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "[I")
    public int[] field226;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "[I")
    private int[] field227;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "[I")
    private int[] field230;

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "[I")
    private int[] field235;

    @OriginalMember(owner = "mapview!k", name = "r", descriptor = "[I")
    private int[] field242;

    @OriginalMember(owner = "mapview!k", name = "s", descriptor = "[I")
    private int[] field243;

    @OriginalMember(owner = "mapview!k", name = "v", descriptor = "[Lsa;")
    private class35[] field246;

    @OriginalMember(owner = "mapview!k", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field247;

    @OriginalMember(owner = "mapview!k", name = "p", descriptor = "[[I")
    private int[][] field240;

    @OriginalMember(owner = "mapview!k", name = "t", descriptor = "[[I")
    private int[][] field244;

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field234;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B[Lt;)Lt;", line = 7)
    public static final class36 method94(byte arg0, class36[] arg1) {
        if (arg0 != -52) {
            method98(-76, null, 33, (byte) -104);
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class14.method78((byte) 100, arg1, arg1.length, 0);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IB)V", line = 32)
    private final void method95(int arg0, byte arg1) {
        if (arg1 > -39) {
            this.field227 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V", line = 48)
    public static void method96(int arg0) {
        field237 = null;
        field225 = null;
        field238 = null;
        field241 = null;
        int var1 = -85 / ((-arg0 - 10) / 41);
        field228 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II)I", line = 62)
    public static int method97(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILk;IB)[Lqa;", line = 71)
    public static final class31[] method98(int arg0, class19 arg1, int arg2, byte arg3) {
        if (class41.method265(arg0, arg2, (byte) 75, arg1)) {
            int var4 = 6 % ((arg3 + 11) / 55);
            return class28.method164(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Lt;II)I", line = 84)
    public final int method99(class36 arg0, int arg1, int arg2) {
        if (!this.method100(arg1 ^ 0xFFFFDA71, arg2)) {
            return -1;
        }
        if (arg1 != 0) {
            this.field244 = null;
        }
        class36 var4 = arg0.method201(arg1 + 29876);
        int var5 = this.field246[arg2].method193(var4.method202((byte) 0), false);
        return this.method104(arg2, var5, -6) ? var5 : -1;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(II)Z", line = 127)
    private final boolean method100(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field230.length && this.field230[arg1] != 0) {
            if (arg0 != -9615) {
                this.method95(-127, (byte) 116);
            }
            return true;
        } else if (class6.field67) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILt;Lt;)[B", line = 164)
    public final byte[] method101(int arg0, class36 arg1, class36 arg2) {
        if (arg0 != 0) {
            this.field242 = null;
        }
        class36 var4 = arg1.method201(29876);
        class36 var5 = arg2.method201(arg0 + 29876);
        int var6 = this.field245.method193(var4.method202((byte) 0), false);
        if (this.method100(-9615, var6)) {
            int var7 = this.field246[var6].method193(var5.method202((byte) 0), false);
            return this.method103(var6, var7, (byte) -81);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILt;)I", line = 188)
    public final int method102(int arg0, class36 arg1) {
        class36 var3 = arg1.method201(29876);
        int var4 = this.field245.method193(var3.method202((byte) 0), false);
        if (arg0 != -1) {
            this.field239 = true;
        }
        return this.method100(-9615, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IIB)[B", line = 214)
    public final byte[] method103(int arg0, int arg1, byte arg2) {
        return arg2 > -12 ? (byte[]) null : this.method106(false, null, arg0, arg1);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(III)Z", line = 224)
    private final boolean method104(int arg0, int arg1, int arg2) {
        if (arg0 >= 0 && arg1 >= 0 && this.field230.length > arg0 && arg1 < this.field230[arg0]) {
            return arg2 < 0;
        } else if (class6.field67) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([IIB)Z", line = 253)
    private final boolean method105(int[] arg0, int arg1, byte arg2) {
        if (arg2 < 102) {
            this.method100(-18, -73);
        }
        if (!this.method100(-9615, arg1)) {
            return false;
        } else if (this.field247[arg1] == null) {
            return false;
        } else {
            int[] var4 = this.field244[arg1];
            int var5 = this.field243[arg1];
            if (this.field234[arg1] == null) {
                this.field234[arg1] = new Object[this.field230[arg1]];
            }
            Object[] var6 = this.field234[arg1];
            boolean var7 = true;
            for (int var8 = 0; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class9.method36(false, this.field247[arg1], (byte) 100);
            } else {
                var10 = class9.method36(true, this.field247[arg1], (byte) 121);
                class39 var11 = new class39(var10);
                var11.method247(5, -71, arg0, var11.field514.length);
            }
            byte[] var12;
            try {
                var12 = class41.method264(var10, (byte) 69);
            } catch (RuntimeException var31) {
                throw class14.method83(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class32.method183(false, var10, var10.length) + "," + class32.method183(false, var10, var10.length - 2) + "," + this.field242[arg1] + "," + this.field236);
            }
            if (this.field233) {
                this.field247[arg1] = null;
            }
            if (var5 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var15 * 4 * var5;
                int[] var17 = new int[var5];
                class39 var18 = new class39(var12);
                var18.field519 = var16;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var5; var21++) {
                        var20 += var18.method255(8080);
                        if (var4 == null) {
                        }
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var5][];
                for (int var23 = 0; var23 < var5; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var18.field519 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var5; var27++) {
                        var26 += var18.method255(8080);
                        class16.method89(var12, var24, var22[var27], var17[var27], var26);
                        var24 += var26;
                        var17[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var5; var28++) {
                    int var29;
                    if (var4 == null) {
                        var29 = var28;
                    } else {
                        var29 = var4[var28];
                    }
                    if (this.field239) {
                        var6[var29] = var22[var28];
                    } else {
                        var6[var29] = class41.method268(var22[var28], (byte) 70, false);
                    }
                }
            } else {
                int var30;
                if (var4 == null) {
                    var30 = 0;
                } else {
                    var30 = var4[0];
                }
                if (this.field239) {
                    var6[var30] = var12;
                } else {
                    var6[var30] = class41.method268(var12, (byte) 81, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z[III)[B", line = 460)
    private final byte[] method106(boolean arg0, int[] arg1, int arg2, int arg3) {
        if (!this.method104(arg2, arg3, -56)) {
            return null;
        }
        if (this.field234[arg2] == null || this.field234[arg2][arg3] == null) {
            boolean var5 = this.method105(arg1, arg2, (byte) 108);
            if (!var5) {
                this.method95(arg2, (byte) -50);
                boolean var6 = this.method105(arg1, arg2, (byte) 112);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class9.method36(arg0, this.field234[arg2][arg3], (byte) 79);
        if (this.field239) {
            this.field234[arg2][arg3] = null;
            if (this.field230[arg2] == 1) {
                this.field234[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)V", line = 509)
    public static final void method107(int arg0) {
        if (++class6.field60 >= 64) {
            class1.field7++;
            class6.field60 = 0;
            if (class1.field7 < class6.field66 >> 6) {
                class20.method112(-4);
            }
        }
        if (arg0 != 0) {
            method94((byte) -60, null);
        }
        class6.field65 = (class6.field60 << 6) + class33.field461;
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(ZZ)V", line = 532)
    public class19(boolean arg0, boolean arg1) {
        this.field233 = arg0;
        this.field239 = arg1;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I[B)V", line = 543)
    public final void method108(int arg0, byte[] arg1) {
        this.field236 = class32.method183(false, arg1, arg1.length);
        class39 var3 = new class39(class41.method264(arg1, (byte) 81));
        int var4 = var3.method256(1795441960);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method255(8080);
        }
        int var5 = arg0;
        int var6 = var3.method256(1795441960);
        this.field229 = var3.method254(65280);
        int var7 = 0;
        this.field226 = new int[this.field229];
        for (int var8 = 0; var8 < this.field229; var8++) {
            this.field226[var8] = var7 += var3.method254(65280);
            if (this.field226[var8] > var5) {
                var5 = this.field226[var8];
            }
        }
        this.field230 = new int[var5 + 1];
        this.field247 = new Object[var5 + 1];
        this.field243 = new int[var5 + 1];
        this.field227 = new int[var5 + 1];
        this.field244 = new int[var5 + 1][];
        this.field242 = new int[var5 + 1];
        this.field234 = new Object[var5 + 1][];
        if (var6 != 0) {
            this.field235 = new int[var5 + 1];
            for (int var9 = 0; var9 < var5 + 1; var9++) {
                this.field235[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field229; var10++) {
                this.field235[this.field226[var10]] = var3.method255(8080);
            }
            this.field245 = new class35(this.field235);
        }
        for (int var11 = 0; var11 < this.field229; var11++) {
            this.field242[this.field226[var11]] = var3.method255(8080);
        }
        for (int var12 = 0; var12 < this.field229; var12++) {
            this.field227[this.field226[var12]] = var3.method255(8080);
        }
        for (int var13 = 0; var13 < this.field229; var13++) {
            this.field243[this.field226[var13]] = var3.method254(65280);
        }
        for (int var14 = 0; var14 < this.field229; var14++) {
            int var15 = 0;
            int var16 = this.field226[var14];
            int var17 = this.field243[var16];
            int var18 = -1;
            this.field244[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field244[var16][var19] = var15 += var3.method254(arg0 + 65281);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field230[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field244[var16] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field246 = new class35[var5 + 1];
        this.field240 = new int[var5 + 1][];
        for (int var21 = 0; var21 < this.field229; var21++) {
            int var22 = this.field226[var21];
            int var23 = this.field243[var22];
            this.field240[var22] = new int[this.field230[var22]];
            for (int var24 = 0; var24 < this.field230[var22]; var24++) {
                this.field240[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field244[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field244[var22][var25];
                }
                this.field240[var22][var26] = var3.method255(8080);
            }
            this.field246[var22] = new class35(this.field240[var22]);
        }
    }
}
