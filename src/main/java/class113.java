import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class113 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
    private int[] field2135;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    private int[] field2132;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Loi;")
    private class89 field2134;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Loi;")
    private class89 field2139;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[Loi;")
    private class89[] field2138;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Laa;")
    public static class39 field2133 = new class39();

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lha;")
    public static class46 field2142 = class271.method1828("Spieler kann nicht gefunden werden: ", -46);

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[Lha;")
    public static class46[] field2148 = new class46[100];

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field2150 = -1;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lha;")
    public static class46 field2147 = class271.method1828("unzap", -46);

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lha;")
    public static class46 field2151 = class271.method1828(":assist:", -46);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Ljava/awt/Image;")
    public static Image field2145;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "[Lhi;")
    public static class24[] field2144;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[[[B")
    public static byte[][][] field2146;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
    public static final int method917(int arg0, int arg1) {
        if (arg1 >= -41) {
            return -6;
        } else {
            field2136++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lpi;ILlk;)Z")
    public final boolean method918(class181 arg0, int arg1, class164 arg2) {
        field2137++;
        for (int var4 = arg1; var4 < this.field2135.length; var4++) {
            if (!arg0.method1307((byte) -14, this.field2135[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field2132.length; var5++) {
            if (!arg2.method722(this.field2132[var5], (byte) -97)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lpi;ZIIZDILlk;)[I")
    public final int[] method919(class181 arg0, boolean arg1, int arg2, int arg3, boolean arg4, double arg5, int arg6, class164 arg7) {
        if (arg6 > -83) {
            field2146 = null;
        }
        int[] var10 = new int[arg2 * arg3];
        class168.method1195(arg5, (byte) 104);
        client.field4698 = arg0;
        field2143++;
        class10.field174 = arg7;
        class45.method299(arg2, 8388, arg3);
        for (int var11 = 0; var11 < this.field2138.length; var11++) {
            this.field2138[var11].method692(arg2, 3, arg3);
        }
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var12 = -1;
            var13 = arg3 - 1;
            var14 = -1;
        } else {
            var14 = 1;
            var12 = arg3;
            var13 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2134.field1683) {
                int[] var22 = this.field2134.method12(var16, (byte) 103);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2134.method30(var16, (byte) 25);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            if (arg1) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var20[var23] >> 4;
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var19[var23] >> 4;
                int var27 = class127.field2332[var25];
                int var28 = class127.field2332[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class127.field2332[var26];
                var10[var15++] = (var28 << 16) + (var27 << 8) + var29;
                if (arg1) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2138.length; var17++) {
            this.field2138[var17].method695(82);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method920(int arg0) {
        field2140++;
        if (class242.field4293 != null) {
            class242.field4293.method1139(arg0 + 50);
        }
        if (class152.field2702 != null) {
            class152.field2702.method1139(arg0 ^ 0x32);
        }
        class38.method258(2, class42.field715, 22050, -113);
        class242.field4293 = class230.method1564(22050, class258.field4508, arg0, false, class8.field130);
        class242.field4293.method1142(-113, class157.field2801);
        class152.field2702 = class230.method1564(2048, class258.field4508, 1, false, class8.field130);
        class152.field2702.method1142(-83, class236.field4116);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field2145 = null;
        field2133 = null;
        field2151 = null;
        field2146 = null;
        field2148 = null;
        field2147 = null;
        field2144 = null;
        field2142 = null;
        if (arg0 > -49) {
            field2141 = 117;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLhi;I)V")
    public static final void method922(boolean arg0, class24 arg1, int arg2) {
        field2131++;
        int var3 = arg1.field377 == 0 ? arg1.field468 : arg1.field377;
        int var4 = arg1.field350 == 0 ? arg1.field341 : arg1.field350;
        class66.method456(var3, -31258, arg1.field374, var4, arg0, class215.field3809[arg1.field374 >> 16]);
        if (arg1.field503 != null) {
            class66.method456(var3, -31258, arg1.field374, var4, arg0, arg1.field503);
        }
        class31 var5 = (class31) class93.field1727.method1601(38, (long) arg1.field374);
        if (var5 != null) {
            class50.method368(var5.field582, -1, arg0, var4, var3);
        }
        if (arg2 > -32) {
            field2145 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class113() {
        this.field2135 = new int[0];
        this.field2132 = new int[0];
        this.field2134 = new class175();
        this.field2134.field1681 = 1;
        this.field2139 = new class175();
        this.field2139.field1681 = 1;
        this.field2138 = new class89[] { this.field2134, this.field2139 };
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lwe;)V")
    public class113(class75 arg0) {
        int var2 = arg0.method558(1);
        this.field2138 = new class89[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class89 var16 = class155.method1138((byte) -32, arg0);
            if (var16.method688(-27946) >= 0) {
                var3++;
            }
            if (var16.method686((byte) 118) >= 0) {
                var4++;
            }
            int var17 = var16.field1675.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method558(1);
            }
            this.field2138[var6] = var16;
        }
        this.field2132 = new int[var4];
        int var7 = 0;
        this.field2135 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class89 var11 = this.field2138[var9];
            int var12 = var11.field1675.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1675[var13] = this.field2138[var5[var9][var13]];
            }
            int var14 = var11.method688(-27946);
            int var15 = var11.method686((byte) 32);
            if (var14 > 0) {
                this.field2135[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2132[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field2134 = this.field2138[arg0.method558(1)];
        Object var10 = null;
        this.field2139 = this.field2138[arg0.method558(1)];
    }
}
