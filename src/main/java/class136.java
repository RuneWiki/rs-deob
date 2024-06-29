import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class136 extends class129 {

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "[I")
    private int[] field2373;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "[I")
    private int[] field2377;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Lfj;")
    private class276 field2374;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "Lfj;")
    private class276 field2370;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "Lfj;")
    private class276 field2381;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "[Lfj;")
    private class276[] field2380;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "[I")
    public static int[] field2378 = new int[100];

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2371 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "Lcj;")
    public static class74 field2376;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "Lcj;")
    public static class74 field2387;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)Z")
    public static final boolean method951(int arg0) {
        field2383++;
        try {
            if (class146.field2484 == 2) {
                if (class88.field1571 == null) {
                    class88.field1571 = class34.method225(class169.field2791, class82.field1503, class90.field1588);
                    if (class88.field1571 == null) {
                        return false;
                    }
                }
                if (class165.field2703 == null) {
                    class165.field2703 = new class185(class19.field299, class28.field421);
                }
                if (class248.field4083.method512(22050, class165.field2703, class253.field4144, arg0 + 7815, class88.field1571)) {
                    class248.field4083.method497(-15516);
                    class248.field4083.method498(class286.field4533, -107);
                    class248.field4083.method493(class88.field1571, 15006, class122.field2151);
                    class88.field1571 = null;
                    class165.field2703 = null;
                    class146.field2484 = 0;
                    class169.field2791 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class248.field4083.method473(32);
            class146.field2484 = 0;
            class88.field1571 = null;
            class165.field2703 = null;
            class169.field2791 = null;
        }
        return arg0 == -7713 ? false : false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method952(int arg0, int arg1) {
        field2388++;
        int var2 = -87 / ((arg0 + 12) / 51);
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFA9D9) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lvh;DIILuf;ZI)Lva;")
    public final class271 method953(class108 arg0, double arg1, int arg2, int arg3, class164 arg4, boolean arg5, int arg6) {
        class154.method1058(arg1, 256);
        field2375++;
        class133.field2310 = arg4;
        class11.field162 = arg0;
        class29.method192(arg2, (byte) -117, arg3);
        class271 var9 = new class271(arg3, arg2);
        for (int var10 = 0; var10 < this.field2380.length; var10++) {
            this.field2380[var10].method1809(arg2, -256, arg3);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg5) {
                var11 = var12 << 2;
            }
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field2370.field4408) {
                int[] var19 = this.field2370.method23(42, var12);
                var18 = var19;
                var16 = var19;
                var17 = var19;
            } else {
                int[][] var15 = this.field2370.method300(var12, -1);
                var16 = var15[0];
                var17 = var15[1];
                var18 = var15[2];
            }
            int[] var20;
            if (this.field2381.field4408) {
                var20 = this.field2381.method23(44, var12);
            } else {
                var20 = this.field2381.method300(var12, -1)[0];
            }
            for (int var21 = arg3 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                int var23 = var17[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var18[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var25 = class98.field1679[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class98.field1679[var22];
                int var27 = class98.field1679[var24];
                int var28;
                if (var26 == 0 && var25 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var9.field3189[var11++] = (var26 << 16) + (var28 << 24) - (-(var25 << 8) - var27);
                if (arg5) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2380.length; var13++) {
            this.field2380[var13].method1065((byte) 21);
        }
        int var14 = 48 % ((arg6 + 80) / 42);
        return var9;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/lang/String;I)I")
    public static final int method954(byte arg0, String arg1, int arg2) {
        field2379++;
        if (arg0 != -11) {
            field2386 = 6;
        }
        return class114.method800(arg1, arg2, (byte) -40, true);
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V")
    public static void method955(int arg0) {
        if (arg0 != 0) {
            field2378 = null;
        }
        field2376 = null;
        field2371 = null;
        field2387 = null;
        field2378 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILuf;ILvh;DZIZ)[I")
    public final int[] method956(int arg0, class164 arg1, int arg2, class108 arg3, double arg4, boolean arg5, int arg6, boolean arg7) {
        field2369++;
        int var10 = -75 % ((-arg2 - 36) / 62);
        class154.method1058(arg4, 256);
        class11.field162 = arg3;
        class133.field2310 = arg1;
        class29.method192(arg6, (byte) -109, arg0);
        for (int var11 = 0; var11 < this.field2380.length; var11++) {
            this.field2380[var11].method1809(arg6, -256, arg0);
        }
        int[] var12 = new int[arg0 * arg6];
        byte var13;
        int var14;
        int var15;
        if (arg5) {
            var13 = -1;
            var14 = arg0 - 1;
            var15 = -1;
        } else {
            var15 = arg0;
            var13 = 1;
            var14 = 0;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg6; var17++) {
            if (arg7) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field2370.field4408) {
                int[] var23 = this.field2370.method23(119, var17);
                var20 = var23;
                var21 = var23;
                var22 = var23;
            } else {
                int[][] var19 = this.field2370.method300(var17, -1);
                var20 = var19[1];
                var21 = var19[0];
                var22 = var19[2];
            }
            for (int var24 = var14; var24 != var15; var24 += var13) {
                int var25 = var21[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var20[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var22[var24] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class98.field1679[var26];
                int var29 = class98.field1679[var27];
                int var30 = class98.field1679[var25];
                var12[var16++] = (var28 << 8) + (var30 << 16) + var29;
                if (arg7) {
                    var16 += arg0 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field2380.length; var18++) {
            this.field2380[var18].method1065((byte) 21);
        }
        return var12;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Lvj;")
    public static final class173 method957(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1968; var4++) {
            class173 var5 = var3.field1961[var4];
            if ((var5.field2850 >> 29 & 0x3L) == 2L && var5.field2840 == arg1 && var5.field2839 == arg2) {
                class41.method271(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lvh;ZDIIILuf;)Lda;")
    public final class197 method958(class108 arg0, boolean arg1, double arg2, int arg3, int arg4, int arg5, class164 arg6) {
        class154.method1058(arg2, arg3 ^ 0x1FF);
        class11.field162 = arg0;
        field2384++;
        class133.field2310 = arg6;
        class29.method192(arg4, (byte) -115, arg5);
        class197 var9 = new class197(arg5, arg4);
        for (int var10 = 0; var10 < this.field2380.length; var10++) {
            this.field2380[var10].method1809(arg4, -256, arg5);
        }
        if (arg3 != 255) {
            return null;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg1) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2370.field4408) {
                int[] var14 = this.field2370.method23(78, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2370.method300(var12, -1);
                var17 = var18[0];
                var15 = var18[2];
                var16 = var18[1];
            }
            for (int var19 = 0; var19 != arg5; var19++) {
                int var20 = var17[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class98.field1679[var20];
                int var22 = var16[var19] >> 4;
                int var23 = var15[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class98.field1679[var22];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class98.field1679[var23];
                var9.field3189[var11++] = (var21 << 16) + (var24 << 8) + var25;
                if (arg1) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2380.length; var13++) {
            this.field2380[var13].method1065((byte) 21);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lvh;Luf;I)Z")
    public final boolean method959(class108 arg0, class164 arg1, int arg2) {
        field2382++;
        if (class144.field2462 <= 0) {
            for (int var4 = 0; var4 < this.field2373.length; var4++) {
                if (!arg0.method727(this.field2373[var4], (byte) -92)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2373.length; var5++) {
                if (!arg0.method737(-1, class144.field2462, this.field2373[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2377.length; var6++) {
            if (!arg1.method1106(this.field2377[var6], 8353)) {
                return false;
            }
        }
        if (arg2 <= 36) {
            this.field2373 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
    public static final int method960(boolean arg0) {
        field2372++;
        try {
            if (class280.field4463 == 0) {
                if ((class232.method1544((byte) -121) - 5000L) < class129.field2269) {
                    return 0;
                }
                class88.field1572 = class127.field2238.method910((byte) 100, class80.field1382, class153.field2556);
                class55.field949 = class232.method1544((byte) -91);
                class280.field4463 = 1;
            }
            if (!arg0) {
                method952(81, 124);
            }
            if (class232.method1544((byte) -121) > class55.field949 + 30000L) {
                return class114.method799(1000, false);
            }
            if (class280.field4463 == 1) {
                if (class88.field1572.field2857 == 2) {
                    return class114.method799(1001, false);
                }
                if (class88.field1572.field2857 != 1) {
                    return -1;
                }
                class194.field3131 = new class207((Socket) class88.field1572.field2859, class127.field2238);
                class88.field1572 = null;
                class168.field2778.field1762 = 0;
                int var1 = 0;
                if (class83.field1513) {
                    var1 = class253.field4146;
                }
                class168.field2778.method682(23, 22555);
                class168.field2778.method698(107, var1);
                class194.field3131.method1382(class168.field2778.field1730, class168.field2778.field1762, 0, (byte) -48);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                int var2 = class194.field3131.method1377(105);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                if (var2 != 0) {
                    return class114.method799(var2, false);
                }
                class280.field4463 = 2;
            }
            if (class280.field4463 == 2) {
                if (class194.field3131.method1386(arg0) < 2) {
                    return -1;
                }
                class127.field2234 = class194.field3131.method1377(112);
                class127.field2234 <<= 0x8;
                class127.field2234 += class194.field3131.method1377(113);
                class264.field4288 = 0;
                class225.field3782 = new byte[class127.field2234];
                class280.field4463 = 3;
            }
            if (class280.field4463 != 3) {
                return -1;
            }
            int var3 = class194.field3131.method1386(true);
            if (var3 < 1) {
                return -1;
            }
            if ((class127.field2234 - class264.field4288) < var3) {
                var3 = class127.field2234 - class264.field4288;
            }
            class194.field3131.method1390(var3, class264.field4288, class225.field3782, true);
            class264.field4288 += var3;
            if (class264.field4288 < class127.field2234) {
                return -1;
            } else if (class228.method1532(true, class225.field3782)) {
                class237.field3908 = new class236[class276.field4420];
                int var4 = 0;
                for (int var5 = class113.field2046; var5 <= class129.field2260; var5++) {
                    class236 var6 = class54.method338((byte) 118, var5);
                    if (var6 != null) {
                        class237.field3908[var4++] = var6;
                    }
                }
                class194.field3131.method1380(true);
                class115.field2064 = 0;
                class280.field4463 = 0;
                class194.field3131 = null;
                class225.field3782 = null;
                class129.field2269 = class232.method1544((byte) -81);
                return 0;
            } else {
                return class114.method799(1002, !arg0);
            }
        } catch (IOException var7) {
            return class114.method799(1003, !arg0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
    public class136() {
        this.field2373 = new int[0];
        this.field2377 = new int[0];
        this.field2374 = new class234(0);
        this.field2374.field4427 = 1;
        this.field2370 = new class234();
        this.field2370.field4427 = 1;
        this.field2381 = new class234();
        this.field2380 = new class276[] { this.field2370, this.field2381, this.field2374 };
        this.field2381.field4427 = 1;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Leh;)V")
    public class136(class101 arg0) {
        int var2 = 0;
        int var3 = arg0.method669((byte) 36);
        this.field2380 = new class276[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class276 var16 = class81.method535(arg0, (byte) -108);
            if (var16.method1061(-106) >= 0) {
                var2++;
            }
            if (var16.method1643((byte) 123) >= 0) {
                var4++;
            }
            int var17 = var16.field4419.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method669((byte) 36);
            }
            this.field2380[var6] = var16;
        }
        this.field2373 = new int[var2];
        this.field2377 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class276 var11 = this.field2380[var9];
            int var12 = var11.field4419.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4419[var13] = this.field2380[var5[var9][var13]];
            }
            int var14 = var11.method1061(-21);
            int var15 = var11.method1643((byte) 125);
            if (var14 > 0) {
                this.field2373[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2377[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field2370 = this.field2380[arg0.method669((byte) 36)];
        Object var10 = null;
        this.field2381 = this.field2380[arg0.method669((byte) 36)];
        this.field2374 = this.field2380[arg0.method669((byte) 36)];
    }
}
