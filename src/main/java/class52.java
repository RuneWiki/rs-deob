import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class52 {

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[I")
    public static int[] field882 = new int[256];

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field870;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "J")
    private long field865;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "J")
    private long field878;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Z")
    public boolean field869;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Z")
    public static boolean field888;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    private int[] field867;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[I")
    private int[] field875;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[[[I")
    public static int[][][] field886;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
    public final void method352(int arg0, int arg1, int arg2) {
        field872++;
        int var4 = class8.field76[arg0];
        if (~this.field867[var4] != arg2 && class2.method8(arg1, arg2 ^ 0x16C3) != null) {
            this.field867[var4] = class219.method1368(Integer.MIN_VALUE, arg1);
            this.method356((byte) 70);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BILwb;)Lug;")
    public final class221 method353(byte arg0, int arg1, class236 arg2) {
        if (arg0 <= 0) {
            return null;
        }
        field866++;
        if (this.field870 != -1) {
            return class189.method1209((byte) 113, this.field870).method1185(arg1, 3741, arg2);
        }
        class221 var4 = (class221) class241.field4321.method1138(this.field878, (byte) 118);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field867[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class2.method8(var15 & 0x3FFFFFFF, -5828).method439(0)) {
                        var5 = true;
                    }
                } else if (!class58.method389(0, var15 & 0x3FFFFFFF).method1555(this.field869, -125)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class76[] var7 = new class76[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field867[var9];
                if ((var12 & 0x40000000) != 0) {
                    class76 var13 = class58.method389(0, var12 & 0x3FFFFFFF).method1554((byte) -107, this.field869);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class76 var14 = class2.method8(var12 & 0x3FFFFFFF, -5828).method432((byte) 72);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class76 var10 = new class76(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class155.field2846[var11].length > this.field875[var11]) {
                    var10.method465(class151.field2758[var11], class155.field2846[var11][this.field875[var11]]);
                }
                if (this.field875[var11] < class166.field3025[var11].length) {
                    var10.method465(class181.field3319[var11], class166.field3025[var11][this.field875[var11]]);
                }
            }
            var4 = var10.method471(64, 768, -50, -10, -50);
            class241.field4321.method1135(this.field878, var4, true);
        }
        if (arg2 != null) {
            var4 = arg2.method1502(var4, 79, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILwb;Lwb;)Lug;")
    public final class221 method354(int arg0, int arg1, int arg2, class236 arg3, class236 arg4) {
        field871++;
        if (this.field870 != -1) {
            return class189.method1209((byte) 113, this.field870).method1182(arg2, arg3, (byte) 49, arg0, arg4);
        }
        int[] var6 = this.field867;
        long var7 = this.field878;
        if (arg1 > -12) {
            this.field875 = null;
        }
        if (arg3 != null && (arg3.field4257 >= 0 || arg3.field4263 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field867[var9];
            }
            if (arg3.field4257 >= 0) {
                if (arg3.field4257 == 65535) {
                    var7 ^= 0xFFFFFFFF00000000L;
                    var6[5] = 0;
                } else {
                    var6[5] = class219.method1368(1073741824, arg3.field4257);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg3.field4263 >= 0) {
                if (arg3.field4263 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class219.method1368(1073741824, arg3.field4263);
                    var7 ^= var6[3];
                }
            }
        }
        class221 var10 = (class221) class36.field590.method1138(var7, (byte) 105);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var21) != 0 && !class2.method8(var21 & 0x3FFFFFFF, -5828).method431(1664)) {
                        var11 = true;
                    }
                } else if (!class58.method389(0, var21 & 0x3FFFFFFF).method1560(-52, this.field869)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field865 != -1L) {
                    var10 = (class221) class36.field590.method1138(this.field865, (byte) 114);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class76[] var14 = new class76[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class76 var20 = class58.method389(0, var18 & 0x3FFFFFFF).method1566(this.field869, (byte) 89);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class76 var19 = class2.method8(var18 & 0x3FFFFFFF, -5828).method438((byte) -64);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    }
                }
                class76 var16 = new class76(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field875[var17] < class155.field2846[var17].length) {
                        var16.method465(class151.field2758[var17], class155.field2846[var17][this.field875[var17]]);
                    }
                    if (this.field875[var17] < class166.field3025[var17].length) {
                        var16.method465(class181.field3319[var17], class166.field3025[var17][this.field875[var17]]);
                    }
                }
                var10 = var16.method471(64, 850, -30, -50, -30);
                class36.field590.method1135(var7, var10, true);
                this.field865 = var7;
            }
        }
        if (arg3 == null && arg4 == null) {
            return var10;
        }
        class221 var22;
        if (arg3 != null && arg4 != null) {
            var22 = arg3.method1495(arg0, var10, arg4, (byte) 122, arg2);
        } else if (arg3 == null) {
            var22 = arg4.method1493(var10, arg2, (byte) -120);
        } else {
            var22 = arg3.method1493(var10, arg0, (byte) -120);
        }
        return var22;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)I")
    public final int method355(int arg0) {
        field873++;
        if (arg0 != -19243) {
            this.method357(null, false, null, -57, (byte) -76);
        }
        return this.field870 == -1 ? (this.field867[11] << 5) + (this.field867[0] << 15) + (this.field875[0] << 25) + (this.field875[4] << 20) + (this.field867[8] << 10) + this.field867[1] : class189.method1209((byte) 113, this.field870).field3431 + 305419896;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    private final void method356(byte arg0) {
        field874++;
        long[] var2 = class31.field485;
        long var3 = this.field878;
        this.field878 = -1L;
        if (arg0 != 70) {
            method358(97);
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field878 = this.field878 >>> 8 ^ var2[(int) ((this.field878 ^ (long) (this.field867[var5] >> 24)) & 0xFFL)];
            this.field878 = this.field878 >>> 8 ^ var2[(int) (((long) (this.field867[var5] >> 16) ^ this.field878) & 0xFFL)];
            this.field878 = var2[(int) (((long) (this.field867[var5] >> 8) ^ this.field878) & 0xFFL)] ^ this.field878 >>> 8;
            this.field878 = var2[(int) ((this.field878 ^ (long) this.field867[var5]) & 0xFFL)] ^ this.field878 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field878 = this.field878 >>> 8 ^ var2[(int) (((long) this.field875[var6] ^ this.field878) & 0xFFL)];
        }
        this.field878 = this.field878 >>> 8 ^ var2[(int) (((long) (this.field869 ? 1 : 0) ^ this.field878) & 0xFFL)];
        if (var3 != 0L && this.field878 != var3) {
            class36.field590.method1134(false, var3);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([IZ[IIB)V")
    public final void method357(int[] arg0, boolean arg1, int[] arg2, int arg3, byte arg4) {
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class205.field3747; var7++) {
                    class71 var8 = class2.method8(var7, -5828);
                    if (var8 != null && !var8.field1196 && var6 + (arg1 ? 7 : 0) == var8.field1187) {
                        arg2[class8.field76[var6]] = class219.method1368(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field867 = arg2;
        this.field875 = arg0;
        field880++;
        this.field870 = arg3;
        this.field869 = arg1;
        this.method356((byte) 70);
        if (arg4 >= -120) {
            method358(82);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static final void method358(int arg0) {
        int var1 = 0;
        if (arg0 != 64) {
            field886 = null;
        }
        while (class91.field1602 > var1) {
            int var10002 = class118.field2242[var1]--;
            if (class118.field2242[var1] >= -10) {
                label87: {
                    class51 var3 = class138.field2594[var1];
                    if (var3 == null) {
                        var3 = class51.method348(class139.field2600, class59.field1010[var1], 0);
                        if (var3 == null) {
                            break label87;
                        }
                        class118.field2242[var1] += var3.method350();
                        class138.field2594[var1] = var3;
                    }
                    if (class118.field2242[var1] < 0) {
                        label90: {
                            int var4;
                            if (class122.field2273[var1] == 0) {
                                var4 = class203.field3730;
                            } else {
                                int var5 = (class122.field2273[var1] & 0xFF) * 128;
                                int var6 = class122.field2273[var1] >> 16 & 0xFF;
                                int var7 = var6 * 128 + 64 - class210.field3854.field673;
                                int var8 = class122.field2273[var1] >> 8 & 0xFF;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var9 = var8 * 128 + 64 - class210.field3854.field723;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    class118.field2242[var1] = -100;
                                    break label90;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class89.field1567 / var5;
                            }
                            if (var4 > 0) {
                                class177 var11 = var3.method349().method1148(class144.field2683);
                                class223 var12 = class223.method1406(var11, 100, var4);
                                var12.method1430(class62.field1044[var1] - 1);
                                class36.field586.method1267(var12);
                            }
                            class118.field2242[var1] = -100;
                        }
                    }
                }
            } else {
                class91.field1602--;
                for (int var2 = var1; var2 < class91.field1602; var2++) {
                    class59.field1010[var2] = class59.field1010[var2 + 1];
                    class138.field2594[var2] = class138.field2594[var2 + 1];
                    class62.field1044[var2] = class62.field1044[var2 + 1];
                    class118.field2242[var2] = class118.field2242[var2 + 1];
                    class122.field2273[var2] = class122.field2273[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field877++;
        if (class182.field3345 && !class55.method375(true)) {
            if (class104.field1951 != 0 && class182.field3335 != -1) {
                class86.method538(0, class104.field1951, -59, class69.field1161, false, class182.field3335);
            }
            class182.field3345 = false;
        } else if (class104.field1951 != 0 && class182.field3335 != -1 && !class55.method375(true)) {
            class166.field3032++;
            class64.field1054.method660(240, 3);
            class64.field1054.method726((byte) 117, class182.field3335);
            class182.field3335 = -1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public static void method359(int arg0) {
        field882 = null;
        field886 = null;
        if (arg0 != 0) {
            field881 = -3;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
    public final void method360(int arg0, int arg1, int arg2) {
        this.field875[arg0] = arg2;
        if (arg1 > -107) {
            this.field865 = -122L;
        }
        this.method356((byte) 70);
        field879++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V")
    public final void method361(int arg0, boolean arg1) {
        this.field869 = arg1;
        this.method356((byte) 70);
        field883++;
        if (arg0 < 0) {
            field888 = false;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field882[var0] = var1;
        }
        field885 = -1;
    }
}
