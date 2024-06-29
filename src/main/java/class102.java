import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class102 extends class64 {

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    private int field2170 = 4096;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    private int field2175 = 4096;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[I")
    private int[] field2180 = new int[3];

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    private int field2174 = 4096;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
    private int field2187 = 409;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lcd;")
    private static class23 field2171 = class54.method414("Account locked as we suspect it has been stolen)3", -1);

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "Lcd;")
    private static class23 field2182 = class54.method414("Press (Wchange your password(W on front page)3", -1);

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lcd;")
    public static class23 field2179 = field2171;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "[I")
    public static int[] field2177 = new int[] { 0, 0, 0, 0, 2, 7, 0, 0, 0, 15, 0, 7, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 14, 0, 0, -2, 0, -2, 0, 0, 0, 1, 6, 0, 0, -2, 0, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 4, 0, 0, 0, 0, 0, 8, -1, 6, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 24, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 5, 2, 0, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 6, 0, 12, 11, 1, 3, 0, 0, 0, 6, 0, 0, 3, -2, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 6, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 20, 11, 0, 0, 0, 4, 0, 0, 0, 0, -2, 0, 10, 4, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 10, 0, 0, 0, 0, 1, 4, 0, -1, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 6, 4, 0, 0, -2, 0, 0, -2, 0, 0, 2, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0 };

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "Lcd;")
    public static class23 field2184 = field2182;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "I")
    public static int field2186 = 2;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "Z")
    public static boolean field2185;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        ++field2178;
        if (!arg1) {
            this.field2175 = -124;
        }
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757) {
            int[][] var4 = this.method482(0, arg0, (byte) -124);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class168.field3367; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field2180[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field2187) {
                    var7[var11] = var12;
                    var9[var11] = var8[var11];
                    var10[var11] = var5[var11];
                } else {
                    int var14 = var8[var11];
                    int var15 = var14 - this.field2180[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2187) {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var5[var11];
                    } else {
                        int var16 = var5[var11];
                        int var17 = -this.field2180[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field2187) {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field2170 * var12 >> 12;
                            var9[var11] = this.field2174 * var14 >> 12;
                            var10[var11] = this.field2175 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method674(int arg0, byte[] arg1, boolean arg2) {
        ++field2172;
        if (arg0 != -2439) {
            method676(1);
        }
        if (arg1 == null) {
            return null;
        } else {
            if (~arg1.length < -137 && !class190.field3773) {
                try {
                    class70 var3 = (class70) Class.forName("qe").newInstance();
                    var3.method506(0, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class190.field3773 = true;
                }
            }
            return arg2 ? class145.method919(-120, arg1) : arg1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lre;")
    public static final class157 method675(byte arg0, int arg1) {
        ++field2183;
        class157 var2 = (class157) client.field577.method995(-25, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class59.field1377.method651(4, arg1, 3);
            if (arg0 <= 97) {
                return null;
            } else {
                class157 var4 = new class157();
                if (var3 != null) {
                    var4.method964(new class189(var3), -18413);
                }
                client.field577.method990(var4, (long) arg1, -124);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 113 / ((arg0 - 7) / 43);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var6 = arg2.method1177(true);
                            this.field2180[1] = class27.method198(var6, 65280) >> 4;
                            this.field2180[0] = class27.method198(16711680, var6) << 4;
                            this.field2180[2] = class27.method198(var6 >> 12, 0);
                        }
                    } else {
                        this.field2170 = arg2.method1197(-1);
                    }
                } else {
                    this.field2174 = arg2.method1197(-1);
                }
            } else {
                this.field2175 = arg2.method1197(-1);
            }
        } else {
            this.field2187 = arg2.method1197(-1);
        }
        ++field2173;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public static void method676(int arg0) {
        field2182 = null;
        int var1 = -46 / ((arg0 - -30) / 51);
        field2184 = null;
        field2177 = null;
        field2171 = null;
        field2179 = null;
    }
}
