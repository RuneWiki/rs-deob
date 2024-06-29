import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class123 {

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    private int field2371 = 0;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    private int field2360;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[Lvd;")
    private class213[] field2361;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lob;")
    public static class141 field2369 = class175.method1195(40, "blinken2:");

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lob;")
    public static class141 field2357 = class175.method1195(40, "gelb:");

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lob;")
    public static class141 field2374 = class175.method1195(40, "<col=ffb000>");

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lob;")
    private static class141 field2373 = class175.method1195(40, "yellow:");

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static volatile int field2358 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lob;")
    public static class141 field2351 = field2373;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lob;")
    public static class141 field2376 = class175.method1195(40, "title_mute");

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lob;")
    public static class141 field2364 = field2373;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field2355 = new Object();

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "J")
    private long field2362;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lpe;")
    public static class154 field2356;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lvd;")
    private class213 field2359;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lvd;")
    private class213 field2368;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method791(int arg0) {
        field2355 = null;
        field2374 = null;
        field2369 = null;
        field2357 = null;
        field2364 = null;
        field2351 = null;
        if (arg0 < 80) {
            field2358 = 64;
        }
        field2373 = null;
        field2356 = null;
        field2376 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)Lvd;")
    public final class213 method792(long arg0, int arg1) {
        this.field2362 = arg0;
        class213 var4 = this.field2361[(int) (arg0 & (long) (this.field2360 - 1))];
        this.field2359 = var4.field4072;
        field2375++;
        while (this.field2359 != var4) {
            if (this.field2359.field4067 == arg0) {
                class213 var5 = this.field2359;
                this.field2359 = this.field2359.field4072;
                return var5;
            }
            this.field2359 = this.field2359.field4072;
        }
        if (arg1 != 22346) {
            this.method793(90);
        }
        this.field2359 = null;
        return null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Lvd;")
    public final class213 method793(int arg0) {
        field2372++;
        if (this.field2359 == null) {
            return null;
        }
        class213 var2 = this.field2361[(int) ((long) (this.field2360 - 1) & this.field2362)];
        while (this.field2359 != var2) {
            if (this.field2359.field4067 == this.field2362) {
                class213 var3 = this.field2359;
                this.field2359 = this.field2359.field4072;
                return var3;
            }
            this.field2359 = this.field2359.field4072;
        }
        this.field2359 = null;
        if (arg0 > -33) {
            method798(-48, 53L, 93, 112);
        }
        return null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)I")
    public static final int method794(byte arg0, int arg1) {
        if (arg0 == -112) {
            field2365++;
            return arg1 >>> 7;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBIII)V")
    public static final void method795(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2366++;
        if (class30.field570 == arg5 && class177.field3504 == arg1 && (class54.field1055 == arg0 || !class8.field128)) {
            return;
        }
        class177.field3504 = arg1;
        class30.field570 = arg5;
        class54.field1055 = arg0;
        if (!class8.field128) {
            class54.field1055 = 0;
        }
        class156.method1086(25, (byte) -89);
        class53.method357(-31122, true, class182.field3574);
        int var6 = class83.field1644;
        class83.field1644 = arg1 * 8 - 48;
        int var7 = class83.field1649;
        class83.field1649 = arg5 * 8 - 48;
        int var8 = class83.field1649 - var7;
        int var9 = class83.field1649;
        int var10 = class83.field1644 - var6;
        int var11 = class83.field1644;
        for (int var12 = 0; var12 < 32768; var12++) {
            class131 var28 = class10.field172[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3870[var29] -= var8;
                    var28.field3892[var29] -= var10;
                }
                var28.field3889 -= var8 * 128;
                var28.field3854 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class38 var26 = class116.field2231[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3870[var27] -= var8;
                    var26.field3892[var27] -= var10;
                }
                var26.field3889 -= var8 * 128;
                var26.field3854 -= var10 * 128;
            }
        }
        byte var14 = 0;
        byte var15 = 104;
        class66.field1287 = arg0;
        byte var16 = 0;
        byte var17 = 104;
        byte var18 = 1;
        if (var8 < 0) {
            var14 = 103;
            var18 = -1;
            var15 = -1;
        }
        class114.field2176.method1344(arg3, arg4, -1, false);
        byte var19 = 1;
        if (var10 < 0) {
            var17 = -1;
            var16 = 103;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var18) {
            for (int var22 = var16; var22 != var17; var22 += var19) {
                int var23 = var10 + var22;
                int var24 = var20 + var8;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class76.field1559[var25][var20][var22] = class76.field1559[var25][var24][var23];
                    } else {
                        class76.field1559[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class66 var21 = (class66) class216.field4115.method1103((byte) -9); var21 != null; var21 = (class66) class216.field4115.method1106((byte) 107)) {
            var21.field1290 -= var10;
            var21.field1285 -= var8;
            if (var21.field1285 < 0 || var21.field1290 < 0 || var21.field1285 >= 104 || var21.field1290 >= 104) {
                var21.method1392(128);
            }
        }
        class177.field3505 = -1;
        class39.field786 = 0;
        if (class224.field4233 != 0) {
            class224.field4233 -= var8;
            class221.field4194 -= var10;
        }
        client.field597 = false;
        class135.field2576.method1102(109);
        if (arg2 > -46) {
            field2374 = null;
        }
        class30.field575.method1102(-77);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lvd;")
    public final class213 method796(byte arg0) {
        field2370++;
        if (this.field2371 > 0 && this.field2361[this.field2371 - 1] != this.field2368) {
            class213 var2 = this.field2368;
            this.field2368 = var2.field4072;
            return var2;
        }
        while (this.field2371 < this.field2360) {
            class213 var3 = this.field2361[this.field2371++].field4072;
            if (this.field2361[this.field2371 - 1] != var3) {
                this.field2368 = var3.field4072;
                return var3;
            }
        }
        if (arg0 != -33) {
            this.field2371 = -78;
        }
        return null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
    public class123(int arg0) {
        this.field2360 = arg0;
        this.field2361 = new class213[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class213 var3 = this.field2361[var2] = new class213();
            var3.field4070 = var3;
            var3.field4072 = var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lvd;JZ)V")
    public final void method797(class213 arg0, long arg1, boolean arg2) {
        if (!arg2) {
            field2369 = null;
        }
        if (arg0.field4070 != null) {
            arg0.method1392(128);
        }
        class213 var5 = this.field2361[(int) (arg1 & (long) (this.field2360 - 1))];
        arg0.field4067 = arg1;
        arg0.field4070 = var5.field4070;
        arg0.field4072 = var5;
        arg0.field4070.field4072 = arg0;
        field2363++;
        arg0.field4072.field4070 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IJII)Z")
    public static final boolean method798(int arg0, long arg1, int arg2, int arg3) {
        field2367++;
        if (arg2 != 11) {
            method794((byte) -52, -62);
        }
        int var5 = (int) arg1 >> 20 & 0x3;
        int var6 = (int) arg1 >> 14 & 0x1F;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class54 var8 = class175.method1198(arg2 ^ 0xFFFFC8E5, var7);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var9 = var8.field1079;
                var10 = var8.field1073;
            } else {
                var9 = var8.field1073;
                var10 = var8.field1079;
            }
            int var11 = var8.field1065;
            if (var5 != 0) {
                var11 = (var11 >> 4 - var5) + (var11 << var5 & 0xF);
            }
            class162.method1130(2, var10, arg0, arg3, (byte) -114, true, class114.field2176.field3870[0], var11, 0, 0, class114.field2176.field3892[0], var9);
        } else {
            class162.method1130(2, 0, arg0, arg3, (byte) 22, true, class114.field2176.field3870[0], 0, var5, var6 + 1, class114.field2176.field3892[0], 0);
        }
        class10.field208 = 0;
        class7.field98 = class195.field3737;
        class92.field1852 = 2;
        class97.field1921 = class81.field1630;
        return true;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lvd;")
    public final class213 method799(byte arg0) {
        field2354++;
        this.field2371 = 0;
        if (arg0 != 117) {
            this.field2371 = -93;
        }
        return this.method796((byte) -33);
    }
}
