import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class198 extends class219 {

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Lqb;")
    public static class209 field3365 = new class209(64);

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "Z")
    public static boolean field3369 = true;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Lbd;")
    public static class162 field3368 = class17.method142(0, "showVideoAd");

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "[Lq;")
    private class317[] field3359;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIB)V", line = 8)
    public static final void method1479(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3361++;
        if (class117.field2159) {
            class16.method133(arg1, arg3, arg0 + arg1, arg2 + arg3);
            class16.method124(arg1, arg3, arg0, arg2, 0);
        } else {
            class316.method2168(arg1, arg3, arg1 + arg0, arg3 - -arg2);
            class316.method2174(arg1, arg3, arg0, arg2, 0);
        }
        if (class123.field2234 < 100) {
            return;
        }
        if (class229.field3806 == null || class229.field3806.field1131 != arg0 || class229.field3806.field1135 != arg2) {
            class79 var5 = new class79(arg0, arg2);
            class316.method2154(var5.field1384, arg0, arg2);
            class258.method1782(0, 0, class304.field5132, arg2, 0, (byte) -82, 0, arg0, class9.field114);
            if (class117.field2159) {
                class229.field3806 = new class140(var5);
            } else {
                class229.field3806 = var5;
            }
            if (class117.field2159) {
                class316.field5328 = null;
            } else {
                class139.field2484.method654(false);
            }
        }
        class229.field3806.method286(arg1, arg3);
        int var6 = class291.field4900 * arg0 / class304.field5132 + arg1;
        int var7 = arg3 + (class119.field2182 * arg2 / class9.field114);
        int var8 = class151.field2705 * arg0 / class304.field5132;
        if (arg4 > -121) {
            method1480(-124);
        }
        int var9 = class229.field3805 * arg2 / class9.field114;
        if (class117.field2159) {
            class16.method135(var6, var7, var8, var9, 16711680, 128);
            class16.method128(var6, var7, var8, var9, 16711680);
        } else {
            class316.method2157(var6, var7, var8, var9, 16711680, 128);
            class316.method2160(var6, var7, var8, var9, 16711680);
        }
        if (class255.field4226 <= 0 || class255.field4226 % 10 >= 5) {
            return;
        }
        for (class133 var10 = (class133) class106.field1924.method169(-122); var10 != null; var10 = (class133) class106.field1924.method165((byte) -101)) {
            if (class172.field2984 == var10.field2384) {
                int var11 = var10.field2382 * arg0 / class304.field5132 + arg1;
                int var12 = var10.field2379 * arg2 / class9.field114 + arg3;
                if (class117.field2159) {
                    class16.method124(var11 - 2, var12 - 2, 4, 4, 16776960);
                } else {
                    class316.method2174(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)[I", line = 101)
    public final int[] method41(boolean arg0, int arg1) {
        int[] var3 = this.field3654.method2032(3, arg1);
        field3360++;
        if (!arg0) {
            this.field3359 = (class317[]) null;
        }
        if (this.field3654.field4967) {
            this.method1483((byte) 32, this.field3654.method2030(2595));
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 124)
    public class198() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 130)
    public static void method1480(int arg0) {
        if (arg0 != -17909) {
            field3369 = false;
        }
        field3365 = null;
        field3368 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILbe;Lef;)Lba;", line = 142)
    public static final class26 method1481(int arg0, class235 arg1, class266 arg2) {
        field3362++;
        if (arg0 != -1311374240) {
            return (class26) null;
        }
        long var3 = ((long) arg2.field4429 << 32) + ((long) arg2.field4424 << 56) - (long) (-(arg2.field4439 + 1 << 16) + -arg2.field4425);
        class26 var5 = (class26) arg1.method1672(var3, 19760);
        if (var5 == null) {
            var5 = new class26(arg2.field4439, (float) arg2.field4425, true, false, arg2.field4429);
            arg1.method1674(var5, false, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(ZI)V", line = 167)
    public static final void method1482(boolean arg0, int arg1) {
        if (arg1 != -65) {
            method1479(55, -64, 46, -34, (byte) -35);
        }
        for (int var2 = 0; var2 < class31.field520; var2++) {
            class60 var3 = class204.field3446[class278.field4674[var2]];
            long var4 = (long) class278.field4674[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method289(-10662) && arg0 == var3.field926.field1456 && var3.field926.method638((byte) 55)) {
                int var6 = var3.field5013 >> 7;
                int var7 = var3.field5047 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method293((byte) 25) == 1 && (var3.field5013 & 0x7F) == 64 && (var3.field5047 & 0x7F) == 64) {
                        if (class218.field3640[var6][var7] == class279.field4702) {
                            continue;
                        }
                        class218.field3640[var6][var7] = class279.field4702;
                    }
                    if (!var3.field926.field1494) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field5058 = class3.method15(var3.field5013, class157.field2765, var3.field5047, false);
                    class238.method1684(class157.field2765, var3.field5013, var3.field5047, var3.field5058, (var3.method293((byte) 25) - 1) * 64 + 60, var3, var3.field5018, var4, var3.field5069);
                }
            }
        }
        field3364++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILb;)V", line = 216)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == arg1) {
            this.field3359 = new class317[arg2.method756(915905888)];
            for (int var4 = 0; var4 < this.field3359.length; var4++) {
                int var5 = arg2.method756(915905888);
                if (var5 == 0) {
                    this.field3359[var4] = class98.method783(7, arg2);
                } else if (var5 == 1) {
                    this.field3359[var4] = class270.method1846(arg2, -118);
                } else if (var5 == 2) {
                    this.field3359[var4] = class81.method621(arg2, false);
                } else if (var5 == 3) {
                    this.field3359[var4] = class4.method22((byte) 69, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        field3366++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[[I", line = 290)
    public final int[][] method219(int arg0, byte arg1) {
        field3358++;
        if (arg1 != 83) {
            method1479(85, -80, -9, 62, (byte) -124);
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int var4 = class128.field2326;
            int var5 = class47.field749;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field3651.method403(1);
            this.method1483((byte) 32, var6);
            for (int var8 = 0; var8 < class47.field749; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class128.field2326; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class92.method695(var15 << 4, 4080);
                    var13[var14] = class92.method695(var15 >> 4, 4080);
                    var11[var14] = class92.method695(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[[I)V", line = 357)
    private final void method1483(byte arg0, int[][] arg1) {
        field3363++;
        int var3 = class128.field2326;
        int var4 = class47.field749;
        class284.method1964(arg0 + 87, arg1);
        class97.method777(class60.field927, 0, (byte) -91, class252.field4208, 0);
        if (this.field3359 != null) {
            for (int var5 = 0; var5 < this.field3359.length; var5++) {
                class317 var6 = this.field3359[var5];
                int var7 = var6.field5347;
                int var8 = var6.field5345;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method422(var3, var4, 4);
                    }
                } else if (var8 >= 0) {
                    var6.method421(0, var3, var4);
                } else {
                    var6.method424(var4, var3, arg0 ^ 0x12);
                }
            }
        }
        if (arg0 != 32) {
            method1481(-46, (class235) null, (class266) null);
        }
    }
}
