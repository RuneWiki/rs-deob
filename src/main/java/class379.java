import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class379 extends class101 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
    private int[] field5542 = new int[512];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5543 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(FIIFIIBFIF[F)V")
    public final void method892(float arg0, int arg1, int arg2, float arg3, int arg4, int arg5, byte arg6, float arg7, int arg8, float arg9, float[] arg10) {
        field5547++;
        int var12 = (int) ((float) arg8 * arg3 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg2 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg9;
        if (arg6 > -40) {
            this.field5542 = null;
        }
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class196.method1317(var21, (byte) 59);
        int var25 = var20 & var17;
        int var26 = this.field5542[var23];
        int var27 = this.field5542[var25];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class196.method1317(var32, (byte) 59);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field5542[var26 + var36];
            int var38 = this.field5542[var26 + var35];
            int var39 = this.field5542[var27 + var36];
            int var40 = this.field5542[var35 + var27];
            for (int var41 = 0; var41 < arg8; var41++) {
                float var42 = (float) var41 * arg3;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class196.method1317(var45, (byte) 59);
                arg10[arg4++] = arg7 * client.method1354((byte) 59, client.method1354((byte) 59, client.method1354((byte) 59, class292.method1898(var22, class490.method2960(7, this.field5542[var37 + var48]), var46, var33, 88), class292.method1898(var22, class490.method2960(this.field5542[var37 + var47], 7), var45, var33, 122), var49), client.method1354((byte) 59, class292.method1898(var22, class490.method2960(this.field5542[var48 + var38], 7), var46, var32, -27), class292.method1898(var22, class490.method2960(this.field5542[var38 + var47], 7), var45, var32, -32), var49), var34), client.method1354((byte) 59, client.method1354((byte) 59, class292.method1898(var21, class490.method2960(7, this.field5542[var39 + var48]), var46, var33, -125), class292.method1898(var21, class490.method2960(7, this.field5542[var39 + var47]), var45, var33, -89), var49), client.method1354((byte) 59, class292.method1898(var21, class490.method2960(this.field5542[var48 + var40], 7), var46, var32, 98), class292.method1898(var21, class490.method2960(this.field5542[var47 + var40], 7), var45, var32, -19), var49), var34), var24);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method2330(int arg0) {
        field5543 = null;
        if (arg0 != 0) {
            field5549 = 41;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZILgh;)V")
    public static final void method2331(boolean arg0, int arg1, class388 arg2) {
        field5545++;
        int var3 = 46 / ((-arg1 - 19) / 45);
        int var4 = arg2.field5721 == 0 ? arg2.field5745 : arg2.field5721;
        int var5 = arg2.field5758 == 0 ? arg2.field5712 : arg2.field5758;
        class195.method1314(var5, -115, arg2.field5700, arg0, class419.field6326[arg2.field5700 >> 16], var4);
        if (arg2.field5819 != null) {
            class195.method1314(var5, -116, arg2.field5700, arg0, arg2.field5819, var4);
        }
        class141 var6 = (class141) class470.field6975.method1622((long) arg2.field5700, 48);
        if (var6 != null) {
            class106.method912((byte) 104, var4, arg0, var5, var6.field2342);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z")
    public static final boolean method2332(int arg0, int arg1, int arg2) {
        field5546++;
        return arg2 < 125 ? true : class160.method1145(arg1, 89, arg0) & class321.method2058(2048, arg1, arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZIIII)V")
    public static final void method2333(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5548++;
        if (!arg0 && class49.field995 == arg4 && class266.field4039 == arg3 && class419.field6303 == class211.field3371 || class186.field2990.method1783(-1, class133.field2236)) {
            return;
        }
        class49.field995 = arg4;
        class266.field4039 = arg3;
        class419.field6303 = class211.field3371;
        if (class186.field2990.method1783(-1, class133.field2236)) {
            class419.field6303 = 0;
        }
        class253.method1639(arg1, -16646);
        class361.method2216((byte) -59, true, class470.field6980, class166.field2685.method1977(class146.field2452, 92));
        int var5 = class496.field7292;
        int var6 = class212.field3378;
        class496.field7292 = (class49.field995 - (class339.field5099 >> 4)) * 8;
        class212.field3378 = (class266.field4039 - (class484.field7129 >> 4)) * 8;
        class434.field6468 = class319.method2033(class49.field995 * 8, class266.field4039 * 8);
        class256.field3933 = null;
        int var7 = class496.field7292 - var5;
        int var8 = class212.field3378 - var6;
        if (arg1 == 10) {
            for (int var17 = 0; var17 < class334.field5054; var17++) {
                class435 var30 = class525.field7636[var17];
                if (var30 != null) {
                    class163 var31 = var30.field6471;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field7866[var32] -= var7;
                        var31.field7870[var32] -= var8;
                    }
                    var31.field6073 -= var7 * 128;
                    var31.field6078 -= var8 * 128;
                }
            }
        } else {
            class341.field5128 = 0;
            boolean var9 = false;
            int var10 = (class339.field5099 - 1) * 128;
            int var11 = (class484.field7129 - 1) * 128;
            for (int var12 = 0; var12 < class334.field5054; var12++) {
                class435 var13 = class525.field7636[var12];
                if (var13 != null) {
                    class163 var14 = var13.field6471;
                    var14.field6078 -= var8 * 128;
                    var14.field6073 -= var7 * 128;
                    if (var14.field6073 >= 0 && var10 >= var14.field6073 && var14.field6078 >= 0 && var14.field6078 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field7866[var16] -= var7;
                            var14.field7870[var16] -= var8;
                            if (var14.field7866[var16] < 0 || class339.field5099 <= var14.field7866[var16] || var14.field7870[var16] < 0 || var14.field7870[var16] >= class484.field7129) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class515.field7477[class341.field5128++] = var14.field7789;
                        } else {
                            var14.method1159(arg2 ^ 0x1, null);
                            var9 = true;
                            var13.method1676(true);
                        }
                    } else {
                        var14.method1159(0, null);
                        var13.method1676(true);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class334.field5054 = class209.field3337.method1611((byte) -21);
                class209.field3337.method1616(arg2 - 32438, class525.field7636);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class366 var28 = class73.field1444[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field7866[var29] -= var7;
                    var28.field7870[var29] -= var8;
                }
                var28.field6078 -= var8 * 128;
                var28.field6073 -= var7 * 128;
            }
        }
        class481[] var19 = class139.field2328;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class481 var27 = var19[var20];
            if (var27 != null) {
                var27.field7104 -= var8 * 128;
                var27.field7099 -= var7 * 128;
            }
        }
        for (class169 var21 = (class169) class378.field5541.method1892(115); var21 != null; var21 = (class169) class378.field5541.method1893((byte) -2)) {
            var21.field2756 -= var8;
            var21.field2747 -= var7;
            if (class506.field7382 != 4 && (var21.field2747 < 0 || var21.field2756 < 0 || class339.field5099 <= var21.field2747 || class484.field7129 <= var21.field2756)) {
                var21.method1676(true);
            }
        }
        if (arg2 != 1) {
            return;
        }
        if (class506.field7382 != 4) {
            for (class354 var22 = (class354) class169.field2757.method1615(arg2 ^ 0x1); var22 != null; var22 = (class354) class169.field2757.method1621((byte) -112)) {
                int var23 = (int) (var22.field3977 & 0x3FFFL);
                int var24 = var23 - class496.field7292;
                int var25 = (int) (var22.field3977 >> 14 & 0x3FFFL);
                int var26 = var25 - class212.field3378;
                if (var24 < 0 || var26 < 0 || var24 >= class339.field5099 || var26 >= class484.field7129) {
                    var22.method1676(true);
                }
            }
        }
        if (class127.field2172 != 0) {
            class205.field3284 -= var8;
            class127.field2172 -= var7;
        }
        class10.method60(arg2 - 73);
        if (arg1 != 10) {
            class239.field3715 -= var8;
            class522.field7579 -= var8;
            class432.field6435 -= var8 * 128;
            class457.field6778 -= var7;
            class268.field4063 -= var7;
            class509.field7427 -= var7 * 128;
            if (Math.abs(var7) > class339.field5099 || Math.abs(var8) > class484.field7129) {
                class237.method1550((byte) 37);
            }
        } else if (class510.field7435 == 4) {
            class344.field5142 -= var7 * 128;
            class388.field5798 -= var8 * 128;
            class376.field5501 -= var7 * 128;
            class215.field3402 -= var8 * 128;
        } else {
            class510.field7435 = 1;
        }
        class433.method2601(0);
        class312.method1984(arg2 - 2);
        class244.field3781.method1891(-3);
        class450.field6685.method1891(arg2 ^ 0xFFFFFFFC);
        class4.field81.method538(false);
        class208.method1426(true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method2334(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field5544++;
        class388 var5 = class447.method2677(arg4, 0, arg1);
        if (var5 == null) {
            return;
        }
        if (arg3 != -12689) {
            method2334(-25, -115, null, 65, 16);
        }
        if (var5.field5686 != null) {
            class322 var6 = new class322();
            var6.field4911 = var5.field5686;
            var6.field4918 = var5;
            var6.field4921 = arg2;
            var6.field4908 = arg0;
            class495.method2982(var6);
        }
        if (class466.field6932 != 9) {
            return;
        }
        boolean var7 = true;
        if (var5.field5765 != 0) {
            var7 = class500.method3012(var5, arg3 + 12939);
        }
        if (!var7 || !client.method1371(var5).method887(arg0 - 1, -87)) {
            return;
        }
        if (arg0 == 1) {
            class66.field1357++;
            class459.method2765(class332.field5038, (byte) 87);
            class235.method1543(var5.field5688, arg4, arg1, (byte) 9);
        }
        if (arg0 == 2) {
            class459.method2765(class327.field4968, (byte) 87);
            class444.field6604++;
            class235.method1543(var5.field5688, arg4, arg1, (byte) 45);
        }
        if (arg0 == 3) {
            class459.method2765(class280.field4226, (byte) 87);
            class25.field349++;
            class235.method1543(var5.field5688, arg4, arg1, (byte) 77);
        }
        if (arg0 == 4) {
            class459.method2765(class422.field6349, (byte) 87);
            class332.field5040++;
            class235.method1543(var5.field5688, arg4, arg1, (byte) 127);
        }
        if (arg0 == 5) {
            class477.field7055++;
            class459.method2765(class377.field5511, (byte) 87);
            class235.method1543(var5.field5688, arg4, arg1, (byte) 18);
        }
        if (arg0 == 6) {
            class459.method2765(class120.field2112, (byte) 87);
            class382.field5586++;
            class235.method1543(var5.field5688, arg4, arg1, (byte) 27);
        }
        if (arg0 == 7) {
            class459.method2765(class292.field4476, (byte) 87);
            class11.field147++;
            class235.method1543(var5.field5688, arg4, arg1, (byte) 79);
        }
        if (arg0 == 8) {
            class266.field4042++;
            class459.method2765(class70.field1400, (byte) 87);
            class235.method1543(var5.field5688, arg4, arg1, (byte) 116);
        }
        if (arg0 == 9) {
            class459.method2765(class517.field7502, (byte) 87);
            class327.field4952++;
            class235.method1543(var5.field5688, arg4, arg1, (byte) 65);
        }
        if (arg0 == 10) {
            class459.method2765(class273.field4132, (byte) 87);
            class13.field242++;
            class235.method1543(var5.field5688, arg4, arg1, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
    public class379(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field5542[var3] = this.field5542[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field5542[var5];
            this.field5542[var5] = this.field5542[var5 + 256] = this.field5542[var4];
            this.field5542[var4] = this.field5542[var4 + 256] = var6;
        }
    }
}
