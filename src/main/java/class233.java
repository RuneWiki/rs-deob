import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class233 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    private int field3015;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[[I")
    private int[][] field3017;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lhaa;")
    public static class82 field3019 = new class82();

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field3023 = -1;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
    public static int[] field3024 = new int[3];

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3026 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1387(int arg0, int arg1) {
        field3020++;
        if (arg0 != -14982) {
            field3019 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I", line = 14)
    public final int method1388(int arg0, int arg1) {
        field3021++;
        if (this.field3017 != null) {
            arg1 = (int) ((long) this.field3015 * (long) arg1 / (long) this.field3022) + 6;
        }
        if (arg0 != 6) {
            this.method1392(false, null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 30)
    public static final void method1389(int arg0, String arg1, boolean arg2) {
        field3018++;
        int var3 = class427.field6032;
        int[] var4 = class619.field8682;
        boolean var5 = arg2;
        for (int var6 = 0; var6 < var3; var6++) {
            class83 var7 = class361.field4793[var4[var6]];
            if (var7 != null && class653.field9086 != var7 && var7.field1148 != null && var7.field1148.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg0 == 1) {
                    class452.field6300++;
                    class103 var8 = class752.method4186(260, class110.field1466, class449.field6285);
                    var8.field1379.method3394(var4[var6], 17624);
                    var8.field1379.method3405(0, -65);
                    class27.method104(false, var8);
                } else if (arg0 == 4) {
                    class488.field6685++;
                    class103 var9 = class752.method4186(260, class735.field10257, class449.field6285);
                    var9.field1379.method3405(0, -24);
                    var9.field1379.method3423(var4[var6], 1571862888);
                    class27.method104(false, var9);
                } else if (arg0 == 5) {
                    class617.field8653++;
                    class103 var12 = class752.method4186(260, class519.field6980, class449.field6285);
                    var12.field1379.method3437(var4[var6], 128);
                    var12.field1379.method3430(0, (byte) 110);
                    class27.method104(false, var12);
                } else if (arg0 == 6) {
                    class340.field4581++;
                    class103 var11 = class752.method4186(260, class414.field5852, class449.field6285);
                    var11.field1379.method3443(0, (byte) 112);
                    var11.field1379.method3423(var4[var6], 1571862888);
                    class27.method104(false, var11);
                } else if (arg0 == 7) {
                    class68.field742++;
                    class103 var10 = class752.method4186(260, class201.field2389, class449.field6285);
                    var10.field1379.method3405(0, -105);
                    var10.field1379.method3423(var4[var6], 1571862888);
                    class27.method104(false, var10);
                }
                break;
            }
        }
        if (!var5) {
            class247.method1484(class755.field10501.method4201(class723.field10095, (byte) 25) + arg1, 4, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 119)
    public static void method1390(int arg0) {
        field3024 = null;
        field3019 = null;
        if (arg0 != 0) {
            field3023 = -4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[S)[S", line = 131)
    public final short[] method1391(int arg0, short[] arg1) {
        if (arg0 != 6) {
            field3019 = null;
        }
        field3025++;
        if (this.field3017 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3015 / (long) this.field3022) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field3017[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field3015 + var6;
                int var14 = var13 / this.field3022;
                var5 += var14;
                var6 = var13 - this.field3022 * var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 <= 32767) {
                    arg1[var8] = (short) var9;
                } else {
                    arg1[var8] = 32767;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z[B)[B", line = 198)
    public final byte[] method1392(boolean arg0, byte[] arg1) {
        field3014++;
        if (!arg0) {
            this.method1391(-23, null);
        }
        if (this.field3017 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3015 / (long) this.field3022) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3017[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3015 + var6;
                int var14 = var13 / this.field3022;
                var5 += var14;
                var6 = var13 - this.field3022 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)I", line = 268)
    public final int method1393(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field3015 = -77;
        }
        field3016++;
        if (this.field3017 != null) {
            arg0 = (int) ((long) this.field3015 * (long) arg0 / (long) this.field3022);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(II)V", line = 284)
    public static final void method1394(int arg0, int arg1) {
        class184 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class281 var4 = class86.field1182[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class480.field6629; var5++) {
                    for (int var6 = 0; var6 < class68.field743; var6++) {
                        var2 = var4.method1540(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class443.field6172;
                            int var8 = var5 << class443.field6172;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class281 var10 = class86.field1182[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1685(var5, -12639, var6) - var10.method1685(var5, -12639, var6);
                                    int var12 = var4.method1685(var5, -12639, var6 + 1) - var10.method1685(var5, -12639, var6 + 1);
                                    int var13 = var4.method1685(var5 + 1, -12639, var6 + 1) - var10.method1685(var5 + 1, -12639, var6 + 1);
                                    int var14 = var4.method1685(var5 + 1, -12639, var6) - var10.method1685(var5 + 1, -12639, var6);
                                    var10.method1535(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(II)V", line = 349)
    public class233(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class89.method638(arg0, 111, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3015 = var4;
            this.field3017 = new int[var5][14];
            this.field3022 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3017[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
