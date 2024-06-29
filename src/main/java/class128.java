import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class128 extends class23 {

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "I")
    private int field2272 = 32768;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field2252 = 0;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "S")
    public static short field2257 = 32767;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field2260 = 0;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Llc;")
    public static class143 field2262 = class66.method374("<col=00ff00>", -1);

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "[Z")
    public static boolean[] field2264 = new boolean[112];

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Llc;")
    public static class143 field2263 = class66.method374(":trade:", -1);

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "Llc;")
    public static class143 field2268 = class66.method374(" zuerst von Ihrer Ignorieren)2Liste(Q", -1);

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "[I")
    public static int[] field2269 = new int[500];

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Llc;")
    public static class143 field2259 = class66.method374("null", -1);

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "Llc;")
    public static class143 field2270 = class66.method374("Okay", -1);

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        int var2 = 33 / ((arg0 - 22) / 60);
        class12.method99(512);
        ++field2253;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field373 = ~arg0.method1265(126) == -2;
            }
        } else {
            this.field2272 = arg0.method1275(128) << 4;
        }
        ++field2261;
        if (!arg2) {
            field2257 = 75;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class128() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V")
    public static final void method773(int arg0, boolean arg1) {
        if (arg1) {
            field2271 = -40;
        }
        ++field2254;
        class166 var2 = class262.method1746(-118, arg0, 5);
        var2.method1098((byte) -122);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 >= -13) {
            return null;
        } else {
            ++field2255;
            int[] var3 = super.field369.method306(arg1, -23179);
            if (super.field369.field1005) {
                int[] var4 = this.method155(arg1, (byte) 86, 1);
                int[] var5 = this.method155(arg1, (byte) 118, 2);
                for (int var6 = 0; var6 < class72.field1359; ++var6) {
                    int var7 = (4088 & var4[var6]) >> 4;
                    int var8 = var5[var6] * this.field2272 >> 12;
                    int var9 = class279.field4922[var7] * var8 >> 12;
                    int var10 = class172.field3077 & (var9 >> 12) + var6;
                    int var11 = class51.field1016[var7] * var8 >> 12;
                    int var12 = class79.field1426 & (var11 >> 12) + arg1;
                    int[] var13 = this.method155(var12, (byte) 81, 0);
                    var3[var6] = var13[var10];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method774(boolean arg0) {
        field2269 = null;
        field2264 = null;
        if (!arg0) {
            method773(26, false);
        }
        field2262 = null;
        field2268 = null;
        field2259 = null;
        field2263 = null;
        field2270 = null;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)I")
    public static final int method775(byte arg0) {
        ++field2258;
        if (arg0 >= -108) {
            field2271 = 95;
        }
        return 2;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field2267;
        if (arg1 != 1) {
            this.method85((byte) -81);
        }
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int[] var4 = this.method155(arg0, (byte) 114, 1);
            int[] var5 = this.method155(arg0, (byte) 107, 2);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            for (int var9 = 0; ~class72.field1359 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1045145) >> 12;
                int var11 = var5[var9] * this.field2272 >> 12;
                int var12 = class279.field4922[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class172.field3077;
                int var14 = class51.field1016[var10] * var11 >> 12;
                int var15 = class79.field1426 & (var14 >> 12) + arg0;
                int[][] var16 = this.method161(var15, 0, 0);
                var8[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var7[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BZ)V")
    public static final void method776(byte arg0, boolean arg1) {
        ++field2265;
        class124 var2 = (class124) class57.field1103.method1294(false);
        if (arg0 != -45) {
            method775((byte) 67);
        }
        while (var2 != null) {
            if (var2.field2171 != null) {
                class86.field1578.method1000(var2.field2171);
                var2.field2171 = null;
            }
            if (var2.field2170 != null) {
                class86.field1578.method1000(var2.field2170);
                var2.field2170 = null;
            }
            var2.method349(0);
            var2 = (class124) class57.field1103.method1292((byte) 77);
        }
        if (arg1) {
            for (class124 var3 = (class124) class285.field5001.method1294(false); var3 != null; var3 = (class124) class285.field5001.method1292((byte) 68)) {
                if (var3.field2171 != null) {
                    class86.field1578.method1000(var3.field2171);
                    var3.field2171 = null;
                }
                var3.method349(0);
            }
            for (class124 var4 = (class124) class254.field4565.method1818(false); var4 != null; var4 = (class124) class254.field4565.method1834((byte) 107)) {
                if (var4.field2171 != null) {
                    class86.field1578.method1000(var4.field2171);
                    var4.field2171 = null;
                }
                var4.method349(0);
            }
        }
    }
}
