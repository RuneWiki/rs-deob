import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class135 {

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[I")
    private int[] field2365;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    private int[] field2363;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lbc;")
    private class115 field2357;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lbc;")
    private class115 field2362;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[Lbc;")
    private class115[] field2364;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field2367 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lrd;")
    public static class207 field2356;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "[I")
    public static int[] field2360;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method908(boolean arg0) {
        if (arg0) {
            method909(null, (byte) 77, null);
        }
        field2356 = null;
        field2360 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Loe;BLoe;)V")
    public static final void method909(class256 arg0, byte arg1, class256 arg2) {
        client.field535 = arg2;
        if (arg1 < 76) {
            field2356 = null;
        }
        field2358++;
        class26.field319 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLnh;)V")
    public static final void method910(byte arg0, class112 arg1) {
        byte[] var2 = new byte[24];
        field2366++;
        if (class34.field423 != null) {
            try {
                class34.field423.method437(-16099, 0L);
                int var3 = 0;
                class34.field423.method427(var2, (byte) 83);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 < 68) {
            field2367 = -58;
        }
        arg1.method725(0, 24, var2, 1926268184);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lvf;ILoe;)Z")
    public final boolean method911(class250 arg0, int arg1, class256 arg2) {
        if (arg1 != 255) {
            method914(107);
        }
        field2355++;
        for (int var4 = 0; var4 < this.field2363.length; var4++) {
            if (!arg2.method1692(this.field2363[var4], arg1 ^ 0xFF)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field2365.length; var5++) {
            if (!arg0.method676(26874, this.field2365[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBIZ)Lqe;")
    public static final class168 method912(int arg0, byte arg1, int arg2, boolean arg3) {
        field2354++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = arg0 / arg2;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg2;
            var5++;
        }
        int var6 = var5;
        if (arg0 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg0 % arg2;
            arg0 /= arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class168 var9 = new class168();
        var9.field2904 = var7;
        var9.field2870 = var6;
        if (arg1 != 45) {
            field2361 = -43;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)Lqe;")
    public static final class168 method913(long arg0, int arg1) {
        int var3 = -16 % ((arg1 - 14) / 50);
        class92.field1443.setTime(new Date(arg0));
        field2369++;
        int var4 = class92.field1443.get(7);
        int var5 = class92.field1443.get(5);
        int var6 = class92.field1443.get(2);
        int var7 = class92.field1443.get(1);
        int var8 = class92.field1443.get(11);
        int var9 = class92.field1443.get(12);
        int var10 = class92.field1443.get(13);
        return class50.method347(2, new class168[] { class169.field2943[var4 - 1], class92.field1444, class128.method867((byte) 94, var5 / 10), class128.method867((byte) 111, var5 % 10), class138.field2427, class173.field2996[var6], class138.field2427, class128.method867((byte) 80, var7), class90.field1402, class128.method867((byte) 124, var8 / 10), class128.method867((byte) 95, var8 % 10), class74.field1130, class128.method867((byte) 96, var9 / 10), class128.method867((byte) 86, var9 % 10), class74.field1130, class128.method867((byte) 81, var10 / 10), class128.method867((byte) 92, var10 % 10), class234.field3981 });
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static final void method914(int arg0) {
        field2368++;
        if (arg0 != -2260) {
            field2361 = -84;
        }
        class129.field2159 = 0;
        int var1 = (class7.field85.field190 >> 7) + class246.field4261;
        int var2 = (class7.field85.field166 >> 7) + class125.field2060;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class129.field2159 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class129.field2159 = 1;
        }
        if (class129.field2159 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class129.field2159 = 0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLoe;ILvf;BIDZ)[I")
    public final int[] method915(boolean arg0, class256 arg1, int arg2, class250 arg3, byte arg4, int arg5, double arg6, boolean arg7) {
        class42.method282(arg6, 255);
        field2359++;
        class158.field2735 = arg3;
        int var10 = -116 / ((arg4 - 22) / 34);
        int[] var11 = new int[arg2 * arg5];
        class240.field4112 = arg1;
        class100.method658(arg2, arg5, (byte) -78);
        for (int var12 = 0; var12 < this.field2364.length; var12++) {
            this.field2364[var12].method791(126, arg2, arg5);
        }
        byte var13;
        int var14;
        int var15;
        if (arg7) {
            var13 = -1;
            var14 = arg2 - 1;
            var15 = -1;
        } else {
            var15 = arg2;
            var14 = 0;
            var13 = 1;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg5; var17++) {
            if (arg0) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field2357.field1879) {
                int[] var23 = this.field2357.method5(var17, (byte) 69);
                var22 = var23;
                var21 = var23;
                var20 = var23;
            } else {
                int[][] var19 = this.field2357.method1(var17, 86);
                var20 = var19[2];
                var21 = var19[0];
                var22 = var19[1];
            }
            for (int var24 = var14; var24 != var15; var24 += var13) {
                int var25 = var22[var24] >> 4;
                int var26 = var21[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class190.field3321[var26];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class190.field3321[var25];
                int var29 = var20[var24] >> 4;
                if (var29 > 255) {
                    var29 = 255;
                }
                if (var29 < 0) {
                    var29 = 0;
                }
                int var30 = class190.field3321[var29];
                var11[var16++] = (var27 << 16) + var30 + (var28 << 8);
                if (arg0) {
                    var16 += arg2 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field2364.length; var18++) {
            this.field2364[var18].method208(12801);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class135() {
        this.field2365 = new int[0];
        this.field2363 = new int[0];
        this.field2357 = new class211();
        this.field2357.field1874 = 1;
        this.field2362 = new class211();
        this.field2364 = new class115[] { this.field2357, this.field2362 };
        this.field2362.field1874 = 1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lnh;)V")
    public class135(class112 arg0) {
        int var2 = 0;
        int var3 = arg0.method758(true);
        this.field2364 = new class115[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class115 var16 = class63.method425(arg0, 40000);
            if (var16.method207(-1) >= 0) {
                var2++;
            }
            if (var16.method387(-28800) >= 0) {
                var4++;
            }
            int var17 = var16.field1871.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method758(true);
            }
            this.field2364[var6] = var16;
        }
        this.field2363 = new int[var2];
        int var7 = 0;
        this.field2365 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class115 var11 = this.field2364[var9];
            int var12 = var11.field1871.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1871[var13] = this.field2364[var5[var9][var13]];
            }
            int var14 = var11.method207(-1);
            int var15 = var11.method387(-28800);
            if (var14 > 0) {
                this.field2363[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2365[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field2357 = this.field2364[arg0.method758(true)];
        this.field2362 = this.field2364[arg0.method758(true)];
    }
}
