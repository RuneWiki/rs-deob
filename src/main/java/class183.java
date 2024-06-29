import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class183 {

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Lwm;")
    private class399 field2952 = new class399(128);

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lwm;")
    public class399 field2956 = new class399(64);

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lph;")
    public class459 field2944;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lph;")
    private class459 field2953;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Los;")
    public static class309 field2942 = new class309("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V", line = 5)
    public static final void method1245(int arg0, byte arg1, int arg2) {
        field2950++;
        if (arg1 != -18) {
            method1252(null, -74, -97, null, 116);
        }
        if (class12.field214 == 1) {
            class421.method2571(class513.field7452, arg2, arg0, (byte) 69);
        } else if (class12.field214 == 2) {
            class194.method1311(arg0, arg2, 2);
        }
        class513.field7452 = null;
        class12.field214 = 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 28)
    public final void method1246(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method1247(false, -38);
        }
        class399 var3 = this.field2952;
        synchronized (this.field2952) {
            this.field2952.method2471((byte) 98, arg1);
        }
        field2949++;
        class399 var4 = this.field2956;
        synchronized (this.field2956) {
            this.field2956.method2471((byte) 98, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Lrk;", line = 44)
    public final class25 method1247(boolean arg0, int arg1) {
        field2947++;
        class399 var3 = this.field2952;
        class25 var4;
        synchronized (this.field2952) {
            var4 = (class25) this.field2952.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field2953;
        byte[] var6;
        synchronized (this.field2953) {
            var6 = this.field2953.method2757(36, arg1, (byte) -123);
        }
        class25 var7 = new class25();
        var7.field357 = arg1;
        var7.field348 = this;
        if (arg0) {
            return null;
        }
        if (var6 != null) {
            var7.method173(new class289(var6), (byte) 97);
        }
        var7.method170((byte) 118);
        class399 var8 = this.field2952;
        synchronized (this.field2952) {
            this.field2952.method2472(-123, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 77)
    public final void method1248(boolean arg0) {
        class399 var2 = this.field2952;
        synchronized (this.field2952) {
            this.field2952.method2475((byte) 67);
        }
        field2951++;
        if (!arg0) {
            method1253(-6);
        }
        class399 var3 = this.field2956;
        synchronized (this.field2956) {
            this.field2956.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V", line = 93)
    public final void method1249(int arg0, int arg1, int arg2) {
        field2943++;
        if (arg1 <= -102) {
            this.field2952 = new class399(arg2);
            this.field2956 = new class399(arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 106)
    public static void method1250(int arg0) {
        if (arg0 == 0) {
            field2942 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 123)
    public final void method1251(byte arg0) {
        field2954++;
        class399 var2 = this.field2952;
        synchronized (this.field2952) {
            int var3 = 116 % ((47 - arg0) / 59);
            this.field2952.method2477(20);
        }
        class399 var4 = this.field2956;
        synchronized (this.field2956) {
            this.field2956.method2477(75);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lza;IILgh;I)V", line = 139)
    public static final void method1252(class288 arg0, int arg1, int arg2, class388 arg3, int arg4) {
        field2945++;
        class144 var5 = arg3.method2389(arg0, true);
        if (var5 == null) {
            return;
        }
        if (arg2 != 32) {
            field2946 = -19;
        }
        arg0.method371(arg4, arg1, arg3.field5745 + arg4, arg3.field5712 + arg1);
        if (class419.field6312 == 2 || class419.field6312 == 5 || class88.field1792 == null) {
            arg0.method373(-16777216, var5, arg4, arg1);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class510.field7435 == 4) {
            var6 = class388.field5798;
            var7 = (int) (-class525.field7631) & 0x3FFF;
            var8 = class344.field5142;
            var9 = 4096;
        } else {
            var6 = class15.field266.field6078;
            var8 = class15.field266.field6073;
            var7 = (int) (-class525.field7631) + class1.field49 & 0x3FFF;
            var9 = 4096 - class60.field1242 * 16;
        }
        int var10 = var8 / 32 + 48 - ((class339.field5099 - 104) * 2);
        int var11 = class484.field7129 * 4 + (-(class484.field7129 * 2) - -208) + 48 - var6 / 32;
        class88.field1792.method149((float) arg3.field5745 / 2.0F + (float) arg4, (float) arg3.field5712 / 2.0F + (float) arg1, (float) var10, (float) var11, var9, var7 << 2, var5, arg4, arg1);
        for (class100 var12 = (class100) class373.field5471.method1892(90); var12 != null; var12 = (class100) class373.field5471.method1893((byte) -2)) {
            int var58 = var12.field1923;
            int var59 = (class256.field3933.field5149[var58] >> 14 & 0x3FFF) - class496.field7292;
            int var60 = (class256.field3933.field5149[var58] & 0x3FFF) - class212.field3378;
            int var61 = var59 * 4 + 2 - (var8 / 32);
            int var62 = var60 * 4 + 2 - (var6 / 32);
            class478.method2854(var62, 23308, arg4, arg1, var61, var5, arg0, arg3, class256.field3933.field5148[var58]);
        }
        for (int var13 = 0; var13 < class50.field1000; var13++) {
            int var55 = class341.field5129[var13] * 4 + 2 - var8 / 32;
            int var56 = class436.field6493[var13] * 4 + 2 - (var6 / 32);
            class306 var57 = class123.field2142.method1530((byte) -32, class517.field7505[var13]);
            if (var57.field4593 != null) {
                var57 = var57.method1951(class402.field6080, 0);
                if (var57 == null || var57.field4615 == -1) {
                    continue;
                }
            }
            class478.method2854(var56, 23308, arg4, arg1, var55, var5, arg0, arg3, var57.field4615);
        }
        for (class354 var14 = (class354) class169.field2757.method1615(0); var14 != null; var14 = (class354) class169.field2757.method1621((byte) -97)) {
            int var50 = (int) (var14.field3977 >> 28 & 0x3L);
            if (class372.field5446 == var50) {
                int var51 = (int) (var14.field3977 & 0x3FFFL) - class496.field7292;
                int var52 = (int) (var14.field3977 >> 14 & 0x3FFFL) - class212.field3378;
                int var53 = var51 * 4 + 2 - (var8 / 32);
                int var54 = var52 * 4 + 2 - var6 / 32;
                class358.method2206(arg3, arg1, arg4, (byte) -54, var54, var53, class46.field963[0], var5);
            }
        }
        for (int var15 = 0; var15 < class341.field5128; var15++) {
            class435 var45 = (class435) class209.field3337.method1622((long) class515.field7477[var15], -112);
            if (var45 != null) {
                class163 var46 = var45.field6471;
                if (var46.method1157(88) && class15.field266.field6084 == var46.field6084) {
                    class51 var47 = var46.field2613;
                    if (var47 != null && var47.field1038 != null) {
                        var47 = var47.method475(class402.field6080, arg2 ^ 0xFFFFFFDF);
                    }
                    if (var47 != null && var47.field1051 && var47.field1062) {
                        int var48 = var46.field6073 / 32 - var8 / 32;
                        int var49 = var46.field6078 / 32 - (var6 / 32);
                        if (var47.field1023 == -1) {
                            class358.method2206(arg3, arg1, arg4, (byte) -54, var49, var48, class46.field963[1], var5);
                        } else {
                            class478.method2854(var49, arg2 + 23276, arg4, arg1, var48, var5, arg0, arg3, var47.field1023);
                        }
                    }
                }
            }
        }
        int var16 = class229.field3560;
        int[] var17 = class316.field4782;
        for (int var18 = 0; var18 < var16; var18++) {
            class366 var37 = class73.field1444[var17[var18]];
            if (var37 != null && var37.method2236(106) && class15.field266 != var37 && class15.field266.field6084 == var37.field6084) {
                int var38 = var37.field6073 / 32 - (var8 / 32);
                int var39 = var37.field6078 / 32 - (var6 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class513.field7453; var41++) {
                    if (var37.field5381.equals(class330.field5008[var41]) && class207.field3317[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class332.field5047; var43++) {
                    if (var37.field5381.equals(class384.field5610[var43].field6261)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class15.field266.field5379 != 0 && var37.field5379 != 0 && class15.field266.field5379 == var37.field5379) {
                    var44 = true;
                }
                if (var37.field5354) {
                    class358.method2206(arg3, arg1, arg4, (byte) -54, var39, var38, class46.field963[6], var5);
                } else if (var40) {
                    class358.method2206(arg3, arg1, arg4, (byte) -54, var39, var38, class46.field963[3], var5);
                } else if (var42) {
                    class358.method2206(arg3, arg1, arg4, (byte) -54, var39, var38, class46.field963[5], var5);
                } else if (var44) {
                    class358.method2206(arg3, arg1, arg4, (byte) -54, var39, var38, class46.field963[4], var5);
                } else {
                    class358.method2206(arg3, arg1, arg4, (byte) -54, var39, var38, class46.field963[2], var5);
                }
            }
        }
        class481[] var19 = class139.field2328;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class481 var23 = var19[var20];
            if (var23 != null && var23.field7094 != 0 && class62.field1268 % 20 < 10) {
                if (var23.field7094 == 1) {
                    class435 var24 = (class435) class209.field3337.method1622((long) var23.field7100, -105);
                    if (var24 != null) {
                        class163 var25 = var24.field6471;
                        int var26 = var25.field6073 / 32 - var8 / 32;
                        int var27 = var25.field6078 / 32 - (var6 / 32);
                        class78.method698(360000L, arg4, arg3, 256, var23.field7098, var5, arg1, var26, var27);
                    }
                }
                if (var23.field7094 == 2) {
                    int var28 = var23.field7099 / 32 - (var8 / 32);
                    int var29 = var23.field7104 / 32 - (var6 / 32);
                    long var30 = (long) (var23.field7096 << 5);
                    long var32 = var30 * var30;
                    class78.method698(var32, arg4, arg3, 256, var23.field7098, var5, arg1, var28, var29);
                }
                if (var23.field7094 == 10 && var23.field7100 >= 0 && class73.field1444.length > var23.field7100) {
                    class366 var34 = class73.field1444[var23.field7100];
                    if (var34 != null) {
                        int var35 = var34.field6073 / 32 - (var8 / 32);
                        int var36 = var34.field6078 / 32 - (var6 / 32);
                        class78.method698(360000L, arg4, arg3, 256, var23.field7098, var5, arg1, var35, var36);
                    }
                }
            }
        }
        if (class510.field7435 == 4) {
            return;
        }
        if (class127.field2172 != 0) {
            int var21 = class127.field2172 * 4 + (-(var8 / 32) - -((class15.field266.method2241(arg2 + -70) + -1) * 2)) + 2;
            int var22 = class205.field3284 * 4 + 2 - var6 / 32 - (-(class15.field266.method2241(-66) * 2) - -2);
            class358.method2206(arg3, arg1, arg4, (byte) -54, var22, var21, class174.field2797[class471.field6986 ? 1 : 0], var5);
        }
        arg0.method1809(arg3.field5712 / 2 + arg1 - 1, arg4 + -1 - -(arg3.field5745 / 2), -1, 3, 3, -7456);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 451)
    public static final void method1253(int arg0) {
        field2948++;
        if (class387.field5662 != null) {
            return;
        }
        int var1 = class376.field5503;
        if (arg0 <= 118) {
            field2942 = null;
        }
        int var2 = class75.field1536;
        int var3 = class322.field4917 - class71.field1415 - var1;
        int var4 = class456.field6771 - class65.field1330 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class97.field1889 == null) {
                var5 = class497.field7305.field7072;
            } else {
                var5 = class97.field1889;
            }
            int var6 = 0;
            int var7 = 0;
            if (class97.field1889 == var5) {
                Insets var8 = class97.field1889.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class456.field6771);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class322.field4917, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class322.field4917 - var3, var7, var3, class456.field6771);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class456.field6771 + var7 - var4, class322.field4917, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lkp;ILph;Lph;)V", line = 534)
    public class183(class341 arg0, int arg1, class459 arg2, class459 arg3) {
        this.field2944 = arg3;
        this.field2953 = arg2;
        this.field2953.method2763(36, -3);
    }
}
