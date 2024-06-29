import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class154 extends class117 {

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "[I")
    private int[] field2209;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "[I")
    private int[] field2214;

    @OriginalMember(owner = "client!rq", name = "U", descriptor = "Lcl;")
    private class214 field2226;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "Lcl;")
    private class214 field2218;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "Lcl;")
    private class214 field2210;

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "[Lcl;")
    private class214[] field2222;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "Lcs;")
    public static class351 field2213 = new class351(45, 3);

    @OriginalMember(owner = "client!rq", name = "V", descriptor = "I")
    public static int field2227 = 64;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "F")
    public static float field2215;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!rq", name = "S", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!rq", name = "W", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "Luq;")
    public static class115 field2208;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rq", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field2229;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "[Laq;")
    public static class385[] field2221;

    @OriginalMember(owner = "client!rq", name = "T", descriptor = "[Laq;")
    public static class385[] field2225;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILbc;DILfc;ZI)[I")
    public final int[] method931(int arg0, class187 arg1, double arg2, int arg3, class343 arg4, boolean arg5, int arg6) {
        class422.field5813 = arg1;
        field2217++;
        class350.field4794 = arg4;
        for (int var9 = 0; var9 < this.field2222.length; var9++) {
            this.field2222[var9].method1353(arg3, arg0, -1);
        }
        class366.method2214(arg2, (byte) 16);
        class382.method2291(arg0, 68, arg3);
        int[] var10 = new int[arg0 * 4 * arg3];
        int var11 = 0;
        if (arg6 != 27330) {
            this.field2209 = null;
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2218.field3032) {
                int[] var18 = this.field2218.method14((byte) 123, var12);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field2218.method11(var12, (byte) 92);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field2210.field3032) {
                var19 = this.field2210.method14((byte) 123, var12);
            } else {
                var19 = this.field2210.method11(var12, (byte) 92)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class425.field5852[var21];
                int var25 = class425.field5852[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class425.field5852[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg5) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2222.length; var13++) {
            this.field2222[var13].method1295(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lfc;BLbc;ZII)[F")
    public final float[] method932(class343 arg0, byte arg1, class187 arg2, boolean arg3, int arg4, int arg5) {
        class422.field5813 = arg2;
        field2211++;
        class350.field4794 = arg0;
        for (int var7 = 0; var7 < this.field2222.length; var7++) {
            this.field2222[var7].method1353(arg5, arg4, arg1 ^ 0x6C);
        }
        class382.method2291(arg4, 91, arg5);
        float[] var8 = new float[arg5 * 4 * arg4];
        int var9 = 0;
        int var10 = 0;
        if (arg1 != -109) {
            this.method938((class343) null, (class187) null, 105);
        }
        while (arg4 > var10) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2218.field3032) {
                int[] var12 = this.field2218.method14((byte) 123, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field2218.method11(var10, (byte) 92);
                var13 = var16[0];
                var14 = var16[1];
                var15 = var16[2];
            }
            int[] var17;
            if (this.field2210.field3032) {
                var17 = this.field2210.method14((byte) 123, var10);
            } else {
                var17 = this.field2210.method11(var10, (byte) 92)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field2226.field3032) {
                var18 = this.field2226.method14((byte) 123, var10);
            } else {
                var18 = this.field2226.method11(var10, (byte) 92)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg5 << 2) - 4;
                }
            }
            var10++;
        }
        for (int var11 = 0; var11 < this.field2222.length; var11++) {
            this.field2222[var11].method1295(true);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
    public static final void method933(int arg0, int arg1, int arg2) {
        field2216++;
        int var3 = class2.field21.field1144[0];
        if (arg2 != 17499) {
            return;
        }
        int var4 = class2.field21.field1140[0];
        if (class307.field4208 == class172.field2553) {
            if (!class425.method2469(1, false, 0, 12914, var4, arg0, 1, var3, arg1, -2, 0)) {
                class425.method2469(1, false, 0, 12914, var4, arg0, 1, var3, arg1, -3, 0);
            }
        } else if (!class425.method2469(1, false, 0, 12914, var4, arg0, 1, var3, arg1, -3, 0)) {
            class425.method2469(1, false, 0, arg2 - 4585, var4, arg0, 1, var3, arg1, -2, 0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lfc;ZZIDILbc;B)[I")
    public final int[] method934(class343 arg0, boolean arg1, boolean arg2, int arg3, double arg4, int arg5, class187 arg6, byte arg7) {
        if (arg7 != -28) {
            field2227 = -63;
        }
        class422.field5813 = arg6;
        class350.field4794 = arg0;
        field2224++;
        for (int var10 = 0; var10 < this.field2222.length; var10++) {
            this.field2222[var10].method1353(arg3, arg5, -1);
        }
        class366.method2214(arg4, (byte) 16);
        class382.method2291(arg5, 98, arg3);
        int[] var11 = new int[arg3 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var13 = arg3 - 1;
            var12 = -1;
            var14 = -1;
        } else {
            var12 = arg3;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2218.field3032) {
                int[] var22 = this.field2218.method14((byte) 123, var16);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field2218.method11(var16, (byte) 92);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class425.field5852[var24];
                int var28 = class425.field5852[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class425.field5852[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2222.length; var17++) {
            this.field2222[var17].method1295(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method935(int arg0, String arg1) {
        field2219++;
        if (arg1 == null) {
            return;
        }
        if (!(class205.field2934 < 100 || class9.field185) || class205.field2934 >= 200) {
            class465.method2743(class3.field32.method695(-115, class487.field6867), -32);
            return;
        }
        String var2 = class33.method257(118, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class205.field2934; var3++) {
            String var7 = class33.method257(-111, class321.field4403[var3]);
            if (var7 != null && var7.equals(var2)) {
                class465.method2743(arg1 + class59.field931.method695(-118, class487.field6867), arg0 - 105);
                return;
            }
            if (class160.field2301[var3] != null) {
                String var8 = class33.method257(-21, class160.field2301[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class465.method2743(arg1 + class59.field931.method695(-126, class487.field6867), -91);
                    return;
                }
            }
        }
        for (int var4 = arg0; var4 < class161.field2315; var4++) {
            String var5 = class33.method257(-105, class181.field2624[var4]);
            if (var5 != null && var5.equals(var2)) {
                class465.method2743(class325.field4477.method695(arg0 - 122, class487.field6867) + arg1 + class393.field5524.method695(-123, class487.field6867), arg0 ^ 0xFFFFFF81);
                return;
            }
            if (class20.field353[var4] != null) {
                String var6 = class33.method257(-107, class20.field353[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class465.method2743(class325.field4477.method695(-125, class487.field6867) + arg1 + class393.field5524.method695(-128, class487.field6867), -127);
                    return;
                }
            }
        }
        if (class33.method257(-102, class2.field21.field407).equals(var2)) {
            class465.method2743(class8.field168.method695(-123, class487.field6867), arg0 - 38);
        } else {
            class13.field218++;
            class131.method793(class129.field1826, -109);
            class366.field5214.method2470((byte) -74, class42.method349(arg1, arg0 + 1));
            class366.field5214.method2493((byte) 50, arg1);
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)V")
    public static final void method936(byte arg0) {
        field2220++;
        if (arg0 >= -46) {
            return;
        }
        try {
            Method var1 = (field2229 == null ? (field2229 = method940("java.lang.Runtime")) : field2229).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class251.field3519 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
    public static void method937(boolean arg0) {
        field2221 = null;
        if (!arg0) {
            field2208 = null;
            field2213 = null;
            field2225 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lfc;Lbc;I)Z")
    public final boolean method938(class343 arg0, class187 arg1, int arg2) {
        field2223++;
        if (class225.field3189 >= 0) {
            for (int var4 = 0; var4 < this.field2209.length; var4++) {
                if (!arg0.method2035(class225.field3189, this.field2209[var4], -5657)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2209.length; var5++) {
                if (!arg0.method2034(this.field2209[var5], -28758)) {
                    return false;
                }
            }
        }
        if (arg2 != -9377) {
            return false;
        }
        for (int var6 = 0; var6 < this.field2214.length; var6++) {
            if (!arg1.method1215(14455, this.field2214[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLfc;Lkm;)V")
    public static final void method939(byte arg0, class343 arg1, class487 arg2) {
        if (arg0 != -75) {
            method937(false);
        }
        field2212++;
        if (class472.field6618) {
            return;
        }
        arg2.method1060(0);
        class320.field4372 = arg2.method1139(class140.method866(arg1, class446.field6167), true);
        class320.field4372.method2301((class67.field987 - class320.field4372.method382()) / 2, (class371.field5248 - class320.field4372.method389()) / 2);
        class78.field1181 = arg2.method1139(class140.method866(arg1, class239.field3369), true);
        class78.field1181.method2301((class67.field987 - class78.field1181.method382()) / 2, 18);
        class472.field6618 = true;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
    public class154() {
        this.field2209 = new int[0];
        this.field2214 = new int[0];
        this.field2226 = new class341(0);
        this.field2226.field3023 = 1;
        this.field2218 = new class341();
        this.field2218.field3023 = 1;
        this.field2210 = new class341();
        this.field2210.field3023 = 1;
        this.field2222 = new class214[] { this.field2218, this.field2210, this.field2226 };
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Llk;)V")
    public class154(class425 arg0) {
        int var2 = arg0.method2503(true);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2222 = new class214[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class214 var16 = class292.method1808(-100, arg0);
            if (var16.method1297(false) >= 0) {
                var3++;
            }
            if (var16.method1351(-5070) >= 0) {
                var4++;
            }
            int var17 = var16.field3026.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2503(true);
            }
            this.field2222[var6] = var16;
        }
        this.field2209 = new int[var3];
        int var7 = 0;
        this.field2214 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class214 var11 = this.field2222[var9];
            int var12 = var11.field3026.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3026[var13] = this.field2222[var5[var9][var13]];
            }
            int var14 = var11.method1297(false);
            int var15 = var11.method1351(-5070);
            if (var14 > 0) {
                this.field2209[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2214[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2218 = this.field2222[arg0.method2503(true)];
        this.field2210 = this.field2222[arg0.method2503(true)];
        this.field2226 = this.field2222[arg0.method2503(true)];
        Object var10 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method940(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
