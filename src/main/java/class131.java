import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class131 extends class288 {

    @OriginalMember(owner = "client!va", name = "I", descriptor = "S")
    public static short field2188 = 256;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    private int field2192;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    private int field2194;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    private int field2197;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Ljj;")
    public static class134 field2193;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Ljg;")
    public static class271 field2184;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "[I")
    public static int[] field2187;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "[I")
    public static int[] field2189;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    public static void method905(int arg0) {
        field2184 = null;
        field2187 = null;
        if (arg0 != -1) {
            field2187 = null;
        }
        field2193 = null;
        field2189 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            method907(-45, (byte) 117);
        }
        ++field2186;
        if (arg2 == 0) {
            this.method906(arg0.method1732(-35), (byte) 23);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
    private final void method906(int arg0, byte arg1) {
        this.field2192 = 4080 & arg0 >> 12;
        this.field2197 = 4080 & arg0 >> 4;
        ++field2190;
        this.field2194 = 4080 & arg0 << 4;
        if (arg1 < 13) {
            method905(-77);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)I")
    public static final int method907(int arg0, byte arg1) {
        int var2 = 96 / ((22 - arg1) / 37);
        ++field2182;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZII)V")
    public static final void method908(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = arg1;
        ++field2183;
        int var7 = -1;
        int var8 = -arg1;
        int var9 = class18.method125(-24914, arg0 - -arg1, class121.field2042, class58.field817);
        int var10 = class18.method125(-24914, -arg1 + arg0, class121.field2042, class58.field817);
        class168.method1184(128, var9, var10, arg4, class85.field1162[arg3]);
        if (!arg2) {
            while (~var5 > ~var6) {
                var7 += 2;
                var8 += var7;
                if (var8 > 0) {
                    --var6;
                    var8 -= var6 << 1;
                    int var11 = -var6 + arg3;
                    int var12 = arg3 - -var6;
                    if (class156.field2507 <= var12 && client.field3617 >= var11) {
                        int var13 = class18.method125(-24914, arg0 + var5, class121.field2042, class58.field817);
                        int var14 = class18.method125(-24914, -var5 + arg0, class121.field2042, class58.field817);
                        if (client.field3617 >= var12) {
                            class168.method1184(128, var13, var14, arg4, class85.field1162[var12]);
                        }
                        if (class156.field2507 <= var11) {
                            class168.method1184(128, var13, var14, arg4, class85.field1162[var11]);
                        }
                    }
                }
                ++var5;
                int var15 = -var5 + arg3;
                int var16 = arg3 - -var5;
                if (~var16 <= ~class156.field2507 && ~client.field3617 <= ~var15) {
                    int var17 = class18.method125(-24914, arg0 + var6, class121.field2042, class58.field817);
                    int var18 = class18.method125(-24914, -var6 + arg0, class121.field2042, class58.field817);
                    if (client.field3617 >= var16) {
                        class168.method1184(128, var17, var18, arg4, class85.field1162[var16]);
                    }
                    if (class156.field2507 <= var15) {
                        class168.method1184(128, var17, var18, arg4, class85.field1162[var15]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLjj;)Z")
    public static final boolean method909(boolean arg0, class134 arg1) {
        ++field2195;
        if (arg1.method935((byte) 31, class129.field2161)) {
            return true;
        } else {
            if (arg0) {
                method908(-124, -98, false, -61, -111);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class131() {
        this(0);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
    private class131(int arg0) {
        super(0, false);
        this.method906(arg0, (byte) 104);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method20((class264) null, (byte) 18, 20);
        }
        ++field2196;
        int[][] var3 = super.field4598.method812(arg1, arg0 ^ 65534);
        if (super.field4598.field1954) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class186.field2986 > var7; ++var7) {
                var4[var7] = this.field2192;
                var5[var7] = this.field2197;
                var6[var7] = this.field2194;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
    public static final void method910(int arg0, boolean arg1) {
        ++field2185;
        class283 var2 = class46.method360(12, -69, arg0);
        var2.method1900(arg1);
    }
}
