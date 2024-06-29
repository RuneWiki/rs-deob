import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class242 extends class662 {

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "[[B")
    public static byte[][] field3120 = new byte[50][];

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)Z")
    public static final boolean method1446(byte arg0, int arg1, int arg2) {
        if (arg0 != -72) {
            method1451(-16, true);
        }
        field3121++;
        return false;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V")
    public static void method1447(boolean arg0) {
        if (!arg0) {
            field3120 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)V")
    public static final void method1448(int arg0, int arg1) {
        field3126++;
        int var2 = class665.field9027 - class301.field3830;
        if (var2 >= 100) {
            class385.field4946 = 1;
            return;
        }
        int var3 = (int) class23.field266;
        if ((class300.field3817 >> 8) > var3) {
            var3 = class300.field3817 >> 8;
        }
        if (class642.field8705[4] && var3 < (class491.field6123[4] + 128)) {
            var3 = class491.field6123[4] + 128;
        }
        int var4 = (int) class689.field9561 + class491.field6125 & 0x3FFF;
        class436.method2400(0, class514.method2798(class67.field815.field8011, class67.field815.field8018, class675.field9219, (byte) 101) - 200, arg1, (var3 >> 3) * 3 + 600 << 2, var3, class305.field3862, class415.field5323, var4);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class710.field9924 = (int) ((float) (class710.field9924 - class41.field583) * var5 + (float) class41.field583);
        class455.field5688 = (int) ((float) (class455.field5688 - class631.field8556) * var5 + (float) class631.field8556);
        client.field3568 = (int) ((float) (client.field3568 - class424.field5364) * var5 + (float) class424.field5364);
        class238.field3071 = (int) ((float) (class238.field3071 - class102.field1298) * var5 + (float) class102.field1298);
        int var6 = class177.field2068 - class221.field2562;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class177.field2068 = (int) ((float) var6 * var5 + (float) class221.field2562);
        if (arg0 == -24377) {
            class177.field2068 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I")
    public static final int method1449(byte arg0) {
        if (arg0 < 33) {
            field3120 = null;
        }
        field3125++;
        return class461.field5749;
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)V")
    public static final void method1450(int arg0, int arg1) {
        class139.field1674 = arg0;
        class628.field8531 = 2;
        field3122++;
        if (arg1 != 24643) {
            return;
        }
        long var2 = 0L;
        if (class109.field1356 == null) {
            class29.method177(35, 32768);
        } else {
            class572 var4 = new class572(class290.method1742((byte) -16, class93.method687(false, class109.field1356)));
            long var5 = var4.method3046(false);
            class125.field1522 = var4.method3046(false);
            class22.method144(class182.method1086(var5, -30150), "", true, -211631871);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ)V")
    public static final void method1451(int arg0, boolean arg1) {
        field3127++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class477.field5949 = arg0;
        class701.field9808 = new class18[class1.field2[class477.field5949] + 1];
        if (!arg1) {
            field3119 = 100;
        }
        class191.field2268 = 0;
        class130.field1568 = 0;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)Z")
    public static final boolean method1452(int arg0) {
        field3124++;
        boolean var1 = true;
        if (class379.field4871 == null) {
            if (class136.field1656.method1669((byte) -90, class95.field1237)) {
                class379.field4871 = class495.method2696(class136.field1656, class95.field1237);
            } else {
                var1 = false;
            }
        }
        if (class151.field1798 == null) {
            if (class136.field1656.method1669((byte) -100, class361.field4631)) {
                class151.field1798 = class495.method2696(class136.field1656, class361.field4631);
            } else {
                var1 = false;
            }
        }
        if (class221.field2567 == null) {
            if (class136.field1656.method1669((byte) 103, class432.field5455)) {
                class221.field2567 = class495.method2696(class136.field1656, class432.field5455);
            } else {
                var1 = false;
            }
        }
        if (arg0 != -943154398) {
            return true;
        }
        if (class151.field1800 == null) {
            if (class329.field4095.method1669((byte) -80, class637.field8628)) {
                class151.field1800 = class267.method1587((byte) -124, class637.field8628, class329.field4095);
            } else {
                var1 = false;
            }
        }
        if (class558.field6984 == null) {
            if (class136.field1656.method1669((byte) 114, class637.field8628)) {
                class558.field6984 = class495.method2690(class136.field1656, class637.field8628);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "([B[I[I[[BBI[[BI)I")
    public static final int method1453(byte[] arg0, int[] arg1, int[] arg2, byte[][] arg3, byte arg4, int arg5, byte[][] arg6, int arg7) {
        field3123++;
        int var8 = arg1[arg5];
        int var9 = var8 + arg2[arg5];
        if (arg4 != -45) {
            return 6;
        }
        int var10 = arg1[arg7];
        int var11 = var10 + arg2[arg7];
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg0[arg5] & 0xFF;
        if (var14 > (arg0[arg7] & 0xFF)) {
            var14 = arg0[arg7] & 0xFF;
        }
        byte[] var15 = arg6[arg5];
        byte[] var16 = arg3[arg7];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)Lqca;")
    public abstract class105 method1454(int arg0);
}
