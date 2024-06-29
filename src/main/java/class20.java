import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 {

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field395 = 2301979;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field385 = 0;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Ldd;")
    public static class35 field396 = class180.method1196((byte) 127, "m");

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Ldd;")
    public static class35 field387 = class180.method1196((byte) 126, "");

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Ldd;")
    public static class35 field397 = field387;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Ldd;")
    public static class35 field402 = class180.method1196((byte) 127, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Ldd;")
    public static class35 field400 = class180.method1196((byte) 126, "(U(Y");

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Ldd;")
    private static class35 field412 = class180.method1196((byte) 127, "Loaded input handler");

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Ldd;")
    public static class35 field403 = field412;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "J")
    private long field390;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "J")
    private long field411;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "Z")
    public boolean field410;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
    private int[] field382;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "[I")
    private int[] field398;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "[Lid;")
    public static class84[] field399;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
    public static final int method175(int arg0, int arg1) {
        field389++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != 8237) {
            field412 = null;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        this.field382[arg0] = arg1;
        this.method186(false);
        field401++;
        if (arg2 != 5271) {
            this.method187(6, 86, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)V")
    public final void method177(boolean arg0, boolean arg1) {
        field393++;
        if (this.field410 != arg0) {
            this.method185((byte) -78, -1, null, arg0, this.field382);
            if (!arg1) {
                field397 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLfa;I)Lia;")
    public final class81 method178(byte arg0, class52 arg1, int arg2) {
        field409++;
        if (this.field408 != -1) {
            return class184.method1222(-20643, this.field408).method1214(arg1, arg2, true);
        }
        int var4 = 121 % ((arg0 - 30) / 36);
        class81 var5 = (class81) class71.field1689.method817(true, this.field390);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < 12; var7++) {
                int var16 = this.field398[var7];
                if ((var16 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var16) != 0 && !class178.method1185(true, var16 & 0x3FFFFFFF).method977((byte) -90)) {
                        var6 = true;
                    }
                } else if (!class207.method1370((byte) -73, var16 & 0x3FFFFFFF).method410(this.field410, 112)) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            class16[] var8 = new class16[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var13 = this.field398[var10];
                if ((var13 & 0x40000000) != 0) {
                    class16 var15 = class207.method1370((byte) -73, var13 & 0x3FFFFFFF).method415((byte) 127, this.field410);
                    if (var15 != null) {
                        var8[var9++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class16 var14 = class178.method1185(true, var13 & 0x3FFFFFFF).method975((byte) 32);
                    if (var14 != null) {
                        var8[var9++] = var14;
                    }
                }
            }
            class16 var11 = new class16(var8, var9);
            for (int var12 = 0; var12 < 5; var12++) {
                if (class70.field1678[var12].length > this.field382[var12]) {
                    var11.method144(class179.field3678[var12], class70.field1678[var12][this.field382[var12]]);
                }
                if (client.field613[var12].length > this.field382[var12]) {
                    var11.method144(class15.field275[var12], client.field613[var12][this.field382[var12]]);
                }
            }
            var5 = var11.method142(64, 768, -50, -10, -50, true, true);
            class71.field1689.method816(var5, this.field390, 16);
        }
        if (arg1 != null) {
            var5 = arg1.method462(-2, arg2, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfa;ILfa;BI)Lia;")
    public final class81 method179(class52 arg0, int arg1, class52 arg2, byte arg3, int arg4) {
        field386++;
        if (this.field408 != -1) {
            return class184.method1222(-20643, this.field408).method1207(27337, arg4, arg2, arg0, arg1);
        }
        long var6 = this.field390;
        int[] var8 = this.field398;
        if (arg3 <= 95) {
            this.method187(-85, -71, true);
        }
        if (arg0 != null && (arg0.field1162 >= 0 || arg0.field1167 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field398[var9];
            }
            if (arg0.field1162 >= 0) {
                if (arg0.field1162 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class152.method1027(arg0.field1162, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg0.field1167 >= 0) {
                if (arg0.field1167 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class152.method1027(1073741824, arg0.field1167);
                    var6 ^= var8[3];
                }
            }
        }
        class81 var10 = (class81) class31.field639.method817(true, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((var21 & Integer.MIN_VALUE) != 0 && !class178.method1185(true, var21 & 0x3FFFFFFF).method974(true)) {
                        var11 = true;
                    }
                } else if (!class207.method1370((byte) -73, var21 & 0x3FFFFFFF).method414(this.field410, 0)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field411 != -1L) {
                    var10 = (class81) class31.field639.method817(true, this.field411);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class16[] var13 = new class16[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class16 var20 = class207.method1370((byte) -73, var18 & 0x3FFFFFFF).method411(this.field410, -4122);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class16 var19 = class178.method1185(true, var18 & 0x3FFFFFFF).method979(0);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                class16 var16 = new class16(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field382[var17] < class70.field1678[var17].length) {
                        var16.method144(class179.field3678[var17], class70.field1678[var17][this.field382[var17]]);
                    }
                    if (client.field613[var17].length > this.field382[var17]) {
                        var16.method144(class15.field275[var17], client.field613[var17][this.field382[var17]]);
                    }
                }
                var10 = var16.method142(64, 850, -30, -50, -30, true, true);
                class31.field639.method816(var10, var6, 16);
                this.field411 = var6;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var10;
        }
        class81 var22;
        if (arg0 != null && arg2 != null) {
            var22 = arg0.method463(arg1, var10, 104, arg4, arg2);
        } else if (arg0 == null) {
            var22 = arg2.method460(arg1, var10, 113);
        } else {
            var22 = arg0.method460(arg4, var10, 123);
        }
        return var22;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static void method180(boolean arg0) {
        if (arg0) {
            field399 = null;
        }
        field412 = null;
        field403 = null;
        field396 = null;
        field387 = null;
        field397 = null;
        field399 = null;
        field400 = null;
        field402 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
    public final void method181(byte arg0, boolean arg1) {
        if (arg0 > 0) {
            field399 = null;
        }
        field391++;
        this.field410 = arg1;
        this.method186(false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZB)V")
    public final void method182(int arg0, boolean arg1, byte arg2) {
        field404++;
        if (arg0 == 1 && this.field410) {
            return;
        }
        int var4 = this.field398[class210.field4158[arg0]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        class141 var6;
        do {
            if (arg1) {
                var5++;
                if (var5 >= class58.field1442) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class58.field1442 - 1;
                }
            }
            var6 = class178.method1185(true, var5);
        } while (var6 == null || var6.field2971 || (this.field410 ? 7 : 0) + arg0 != var6.field2976);
        this.field398[class210.field4158[arg0]] = class152.method1027(Integer.MIN_VALUE, var5);
        if (arg2 > -123) {
            field403 = null;
        }
        this.method186(false);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)I")
    public final int method183(boolean arg0) {
        if (arg0) {
            this.method188((byte) 10, null);
        }
        field388++;
        return this.field408 == -1 ? (this.field398[0] << 15) + (this.field398[8] << 10) + (this.field398[11] << 5) + this.field398[1] + (this.field382[4] << 20) + (this.field382[0] << 25) : class184.method1222(-20643, this.field408).field3752 + 305419896;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
    public final void method184(int arg0, int arg1, int arg2) {
        field406++;
        int var4 = class210.field4158[arg0];
        if (this.field398[var4] != 0 && class178.method1185(true, arg2) != null) {
            this.field398[var4] = class152.method1027(arg2, Integer.MIN_VALUE);
            int var5 = -5 / ((arg1 + 56) / 51);
            this.method186(false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI[IZ[I)V")
    public final void method185(byte arg0, int arg1, int[] arg2, boolean arg3, int[] arg4) {
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class58.field1442; var7++) {
                    class141 var8 = class178.method1185(true, var7);
                    if (var8 != null && !var8.field2971 && var6 + (arg3 ? 7 : 0) == var8.field2976) {
                        arg2[class210.field4158[var6]] = class152.method1027(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field382 = arg4;
        if (arg0 != -78) {
            this.field398 = null;
        }
        this.field410 = arg3;
        field392++;
        this.field408 = arg1;
        this.field398 = arg2;
        this.method186(false);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
    private final void method186(boolean arg0) {
        if (arg0) {
            this.method177(false, true);
        }
        long var2 = this.field390;
        field384++;
        long[] var4 = class121.field2665;
        this.field390 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field390 = this.field390 >>> 8 ^ var4[(int) ((this.field390 ^ (long) (this.field398[var5] >> 24)) & 0xFFL)];
            this.field390 = this.field390 >>> 8 ^ var4[(int) ((this.field390 ^ (long) (this.field398[var5] >> 16)) & 0xFFL)];
            this.field390 = this.field390 >>> 8 ^ var4[(int) ((this.field390 ^ (long) (this.field398[var5] >> 8)) & 0xFFL)];
            this.field390 = this.field390 >>> 8 ^ var4[(int) (((long) this.field398[var5] ^ this.field390) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field390 = this.field390 >>> 8 ^ var4[(int) ((this.field390 ^ (long) this.field382[var6]) & 0xFFL)];
        }
        this.field390 = this.field390 >>> 8 ^ var4[(int) ((this.field390 ^ (long) (this.field410 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field390 != var2) {
            class31.field639.method811((byte) 127, var2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ)V")
    public final void method187(int arg0, int arg1, boolean arg2) {
        field407++;
        int var4 = this.field382[arg0];
        if (arg2) {
            var4++;
            if (class70.field1678[arg0].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class70.field1678[arg0].length - 1;
            }
        }
        this.field382[arg0] = var4;
        if (arg1 == -1) {
            this.method186(false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLce;)V")
    public final void method188(byte arg0, class26 arg1) {
        field383++;
        arg1.method257((byte) 126, this.field410 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field398[class210.field4158[var3]];
            if ((Integer.MIN_VALUE & var5) == 0) {
                arg1.method264(65535, -103);
            } else {
                arg1.method264(var5 & 0x3FFFFFFF, -112);
            }
        }
        if (arg0 != 57) {
            this.method183(false);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method257((byte) 126, this.field382[var4]);
        }
    }
}
