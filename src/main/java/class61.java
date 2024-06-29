import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class61 {

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[[I")
    private int[][] field1061;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    public static int[] field1060 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Z")
    public static boolean field1069 = true;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field1071 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lwe;")
    public static class82 field1070;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
    public static int[] field1057;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[[B")
    public static byte[][] field1059;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public final int method381(int arg0, int arg1) {
        if (this.field1061 != null) {
            arg1 = (int) ((long) this.field1068 * (long) arg1 / (long) this.field1067);
        }
        if (arg0 != 2) {
            this.method385((byte) 98, -46);
        }
        field1056++;
        return arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZIB)V")
    public static final void method382(int arg0, boolean arg1, int arg2, byte arg3) {
        field1062++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class177.field2925 = arg0;
        class81.field1478 = arg2;
        if (arg3 != 9) {
            method382(-48, true, -90, (byte) 64);
        }
        class74.field1215 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method383(byte arg0) {
        field1059 = null;
        field1060 = null;
        field1057 = null;
        field1070 = null;
        int var1 = -28 % ((arg0 + 51) / 63);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZZ)V")
    public static final void method384(boolean arg0, boolean arg1) {
        if (!arg1) {
            method384(true, false);
        }
        field1053++;
        class168.method1132(class4.field38, class267.field4324, arg0, client.field4545, (byte) -127);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)I")
    public final int method385(byte arg0, int arg1) {
        if (arg0 >= -18) {
            this.field1068 = 19;
        }
        if (this.field1061 != null) {
            arg1 = (int) ((long) this.field1068 * (long) arg1 / (long) this.field1067) + 6;
        }
        field1064++;
        return arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B[B)[B")
    public final byte[] method386(byte arg0, byte[] arg1) {
        if (arg0 != 127) {
            return null;
        }
        field1066++;
        if (this.field1061 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field1068 / (long) this.field1067) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field1061[var3];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field1068 + var3;
                int var14 = var13 / this.field1067;
                var6 += var14;
                var3 = var13 - this.field1067 * var14;
            }
            arg1 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
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

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lvb;I)V")
    public static final void method387(class131 arg0, int arg1) {
        class8 var2 = null;
        class286.field4518 = arg1;
        class151.method1038((byte) 5, true);
        class139.field2403 = 0;
        class239.field3932 = true;
        class10.field121 = 127;
        class50.field872 = 255;
        field1069 = true;
        class172.field2820 = 0;
        class87.field1560 = 0;
        class188.field3051 = true;
        class196.field3167 = 127;
        class24.field379 = 2;
        class255.field4168 = true;
        class11.field156 = true;
        class22.field338 = true;
        class11.field164 = true;
        class77.field1245 = 0;
        class103.field1816 = true;
        field1058++;
        class49.field848 = true;
        class172.field2828 = true;
        class280.field4459 = true;
        if (class56.field982 >= 96) {
            class32.method214(2);
        } else {
            class32.method214(0);
        }
        class165.field2711 = false;
        class173.field2852 = false;
        class103.field1818 = 0;
        class159.field2660 = false;
        class52.field912 = 0;
        class157.field2627 = 0;
        class261.field4256 = true;
        try {
            class174 var3 = arg0.method905(false, "runescape");
            while (var3.field2857 == 0) {
                class245.method1636(false, 1L);
            }
            if (var3.field2857 == 1) {
                var2 = (class8) var3.field2859;
                byte[] var4 = new byte[(int) var2.method50(55)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method48((byte) 97, var4, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class254.method1683(new class101(var4), false);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method51(arg1 - 119);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V")
    public static final void method388(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1054++;
        if (arg4 <= arg0) {
            class93.method598(-7, arg0, arg4, class167.field2735[arg1], arg2);
        } else {
            class93.method598(-7, arg4, arg0, class167.field2735[arg1], arg2);
        }
        int var5 = -95 % ((22 - arg3) / 35);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    public static final void method389(int arg0, int arg1) {
        class55 var2 = class62.method395(1, arg0, (byte) -66);
        var2.method341((byte) 62);
        field1065++;
        if (arg1 >= -123) {
            method388(-51, -62, 76, (byte) -67, 62);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
    public class61(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class203.method1341(arg0, arg1, 84);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1068 = var4;
            this.field1061 = new int[var5][14];
            this.field1067 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field1061[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
