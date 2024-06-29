import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class430 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "S")
    public static short field5384 = 256;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIIIIII)Z", line = 7)
    public static final boolean method2271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5389++;
        if (!class442.method2369(arg4, arg7, arg9, 12524)) {
            return false;
        }
        int var10 = class378.field4789[0];
        int var11 = class378.field4789[1];
        int var12 = class378.field4789[2];
        if (arg3 != 26403) {
            return true;
        } else if (class442.method2369(arg5, arg1, arg6, 12524)) {
            int var13 = class378.field4789[1];
            int var14 = class378.field4789[2];
            int var15 = class378.field4789[0];
            if (class442.method2369(arg2, arg0, arg8, 12524)) {
                int var16 = class378.field4789[0];
                int var17 = class378.field4789[1];
                int var18 = class378.field4789[2];
                return class188.method1151(var10, var18, var15, arg3 - 26403, var17, var13, var16, var12, var14, var11);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 43)
    public static final void method2272(int arg0) {
        field5388++;
        class516.field7044 = false;
        if (arg0 != -4) {
            method2274(-76);
        }
        class544.method2941(arg0 + 4);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 55)
    public static final void method2273(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg1 != 18365) {
            return;
        }
        field5386++;
        class507 var5 = class138.method795(arg4, arg0, (byte) 44);
        if (var5 == null) {
            return;
        }
        if (var5.field6868 != null) {
            class71 var6 = new class71();
            var6.field967 = arg2;
            var6.field952 = var5;
            var6.field963 = var5.field6868;
            var6.field960 = arg3;
            class197.method1191(var6);
        }
        if (class504.field6675 != 10 || !client.method3819(var5).method2021(arg2 - 1, (byte) 91)) {
            return;
        }
        if (arg2 == 1) {
            class295.field3650++;
            class704 var7 = class314.method1820(class393.field4947, class400.field5014, (byte) -101);
            class203.method1227(arg0, var5.field6832, 15, arg4, var7);
            class122.method654(var7, (byte) -36);
        }
        if (arg2 == 2) {
            class593.field8334++;
            class704 var8 = class314.method1820(class584.field8152, class400.field5014, (byte) -62);
            class203.method1227(arg0, var5.field6832, 15, arg4, var8);
            class122.method654(var8, (byte) -36);
        }
        if (arg2 == 3) {
            class123.field1550++;
            class704 var9 = class314.method1820(class101.field1363, class400.field5014, (byte) -119);
            class203.method1227(arg0, var5.field6832, 15, arg4, var9);
            class122.method654(var9, (byte) -36);
        }
        if (arg2 == 4) {
            class344.field4413++;
            class704 var10 = class314.method1820(class349.field4461, class400.field5014, (byte) -112);
            class203.method1227(arg0, var5.field6832, 15, arg4, var10);
            class122.method654(var10, (byte) -36);
        }
        if (arg2 == 5) {
            class111.field1459++;
            class704 var11 = class314.method1820(class51.field773, class400.field5014, (byte) -111);
            class203.method1227(arg0, var5.field6832, arg1 ^ 0x47B2, arg4, var11);
            class122.method654(var11, (byte) -36);
        }
        if (arg2 == 6) {
            class377.field4753++;
            class704 var12 = class314.method1820(class289.field3593, class400.field5014, (byte) -113);
            class203.method1227(arg0, var5.field6832, 15, arg4, var12);
            class122.method654(var12, (byte) -36);
        }
        if (arg2 == 7) {
            class153.field1976++;
            class704 var13 = class314.method1820(class653.field9219, class400.field5014, (byte) 119);
            class203.method1227(arg0, var5.field6832, 15, arg4, var13);
            class122.method654(var13, (byte) -36);
        }
        if (arg2 == 8) {
            class591.field8294++;
            class704 var14 = class314.method1820(class657.field9281, class400.field5014, (byte) 122);
            class203.method1227(arg0, var5.field6832, 15, arg4, var14);
            class122.method654(var14, (byte) -36);
        }
        if (arg2 == 9) {
            class505.field6680++;
            class704 var15 = class314.method1820(class80.field1083, class400.field5014, (byte) 99);
            class203.method1227(arg0, var5.field6832, arg1 ^ 0x47B2, arg4, var15);
            class122.method654(var15, (byte) -36);
        }
        if (arg2 == 10) {
            class546.field7268++;
            class704 var16 = class314.method1820(class57.field804, class400.field5014, (byte) -90);
            class203.method1227(arg0, var5.field6832, 15, arg4, var16);
            class122.method654(var16, (byte) -36);
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)I", line = 192)
    public static final int method2274(int arg0) {
        field5390++;
        if ((double) class656.field9248 == 3.0D) {
            return 37;
        } else if ((double) class656.field9248 == 4.0D) {
            return 50;
        } else if ((double) class656.field9248 == 6.0D) {
            return 75;
        } else if ((double) class656.field9248 == 8.0D) {
            return 100;
        } else if (arg0 == 3411) {
            return 200;
        } else {
            return 100;
        }
    }
}
