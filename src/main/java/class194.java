import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class194 extends class348 {

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "Z")
    public static boolean field2310 = false;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZLes;)Ljava/lang/String;")
    public static final String method1264(int arg0, boolean arg1, class403 arg2) {
        field2309++;
        try {
            int var3 = arg2.method2354((byte) -117);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            if (!arg1) {
                field2306 = 4;
            }
            arg2.field5262 += class37.field548.method302(arg2.field5262, (byte) -123, 0, var3, arg2.field5275, var4);
            return class260.method1555(var4, 0, 2000, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public static final void method1265(int arg0) {
        field2305++;
        int var1 = class308.field3822 * 512 + 256;
        int var2 = class486.field6791 * 512 + 256;
        int var3 = class483.method2867(class581.field7921, (byte) -42, var2, var1) - class671.field9213;
        if (class215.field2534 < 100) {
            if (var1 > class599.field8107) {
                class599.field8107 += (var1 - class599.field8107) * class215.field2534 / 1000 + class465.field6515;
                if (var1 < class599.field8107) {
                    class599.field8107 = var1;
                }
            }
            if (class599.field8107 > var1) {
                class599.field8107 -= (class599.field8107 - var1) * class215.field2534 / 1000 + class465.field6515;
                if (class599.field8107 < var1) {
                    class599.field8107 = var1;
                }
            }
            if (class303.field3622 < var3) {
                class303.field3622 += (var3 - class303.field3622) * class215.field2534 / 1000 + class465.field6515;
                if (var3 < class303.field3622) {
                    class303.field3622 = var3;
                }
            }
            if (class303.field3622 > var3) {
                class303.field3622 -= class465.field6515 + ((class303.field3622 - var3) * class215.field2534 / 1000);
                if (class303.field3622 < var3) {
                    class303.field3622 = var3;
                }
            }
            if (var2 > class350.field4366) {
                class350.field4366 += (var2 - class350.field4366) * class215.field2534 / 1000 + class465.field6515;
                if (var2 < class350.field4366) {
                    class350.field4366 = var2;
                }
            }
            if (class350.field4366 > var2) {
                class350.field4366 -= class465.field6515 + ((class350.field4366 - var2) * class215.field2534 / 1000);
                if (var2 > class350.field4366) {
                    class350.field4366 = var2;
                }
            }
        } else {
            class350.field4366 = class486.field6791 * 512 + 256;
            class599.field8107 = class308.field3822 * 512 + 256;
            class303.field3622 = class483.method2867(class581.field7921, (byte) -81, class350.field4366, class599.field8107) - class671.field9213;
        }
        int var4 = class99.field1298 * 512 + 256;
        int var5 = class540.field7598 * 512 + 256;
        int var6 = class483.method2867(class581.field7921, (byte) -46, var5, var4) - class320.field3968;
        int var7 = var4 - class599.field8107;
        if (arg0 < 115) {
            return;
        }
        int var8 = var6 - class303.field3622;
        int var9 = var5 - class350.field4366;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class793.field10893) {
            class793.field10893 += (var11 - class793.field10893 >> 3) * class404.field5329 / 1000 + class718.field10090 << 3;
            if (var11 < class793.field10893) {
                class793.field10893 = var11;
            }
        }
        if (class793.field10893 > var11) {
            class793.field10893 -= (class793.field10893 - var11 >> 3) * class404.field5329 / 1000 + class718.field10090 << 3;
            if (var11 > class793.field10893) {
                class793.field10893 = var11;
            }
        }
        int var13 = var12 - class111.field1405;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class111.field1405 += class718.field10090 + (class404.field5329 * var14 / 1000) << 3;
            class111.field1405 &= 0x3FFF;
        }
        if (var14 < 0) {
            class111.field1405 -= class718.field10090 + (-var14 * class404.field5329 / 1000) << 3;
            class111.field1405 &= 0x3FFF;
        }
        int var15 = var12 - class111.field1405;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class641.field8758 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class111.field1405 = var12;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Loba;I)Z")
    public static final boolean method1266(class276 arg0, int arg1) {
        field2307++;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1 != 16844) {
                method1266(null, -82);
            }
            return class770.method4271(arg0.field3239 - arg0.field3225, -arg0.field3234 + arg0.field3227, arg0.field3237, arg0.field3228 - arg0.field3237, 30000, arg0.field3234, arg0.field3225);
        }
    }
}
