import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class322 extends class65 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lmga;")
    public static class666 field4481 = new class666(32);

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lbi;B)V", line = 4)
    public static final void method1953(class449 arg0, byte arg1) {
        int var2 = -41 / ((arg1 - 15) / 56);
        ++field4484;
        class362.field4881 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIF)V", line = 18)
    public class322(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)[Ldb;", line = 23)
    public static final class298[] method1954(int arg0) {
        ++field4487;
        if (arg0 != 26241) {
            method1956((byte) 34);
        }
        return new class298[] { class177.field2722, class669.field9497, class124.field2081, class691.field9732, class209.field2992, class670.field9500, class664.field9425, class18.field310, class693.field9748, class624.field8270, class29.field482, class450.field6175, class383.field5115, class141.field2259, class467.field6282, class164.field2560, class548.field7310, class5.field127, class540.field7114, class683.field9611, class685.field9629, class508.field6777, class599.field7948, class205.field2963, class29.field475, class691.field9733, class492.field6632, class164.field2571, class615.field8131, class16.field258, class26.field436, class122.field2035, class51.field712, class101.field1516, class693.field9750, class460.field6236, class615.field8138, class619.field8216, class78.field1224, class627.field8459, class51.field717, class318.field4364, class445.field6087, class112.field1949, class301.field4202, class355.field4818, class617.field8191, class110.field1621, class243.field3396, class313.field4303, class128.field2147, class244.field3414, class189.field2792, class602.field7997, class18.field308, class371.field5009, class504.field6725, class490.field6608, class11.field204, class28.field455, class502.field6712, class340.field4696, class235.field3312, class208.field2983, class80.field1262, class395.field5204, class476.field6344, class179.field2742, class416.field5692, class561.field7442, class615.field8133, class244.field3409, class477.field6358, class112.field1943, class44.field632, class207.field2978, class655.field8873, class663.field9418, class332.field4547, class595.field7862, class527.field7024, class143.field2315, class534.field7089, class317.field4361, class415.field5677, class381.field5094, class443.field6075, class488.field6598, class233.field3261, class366.field4955, class438.field6033, class615.field8123, class538.field7098, class565.field7472, client.field3875, class547.field7296, class87.field1324, class684.field9624, class503.field6721, class425.field5848, class61.field921, class449.field6127, class356.field4833, class551.field7336, class561.field7443, class602.field8001, class119.field2014, class138.field2237, class405.field5435, class333.field4561, class355.field4829, class267.field3707, class84.field1297, class526.field7005, class64.field982, class6.field183, class597.field7934, class62.field944 };
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)V", line = 35)
    public static void method1955(int arg0) {
        field4481 = null;
        if (arg0 != -6411) {
            method1954(50);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIII)V", line = 46)
    public final void method524(byte arg0, int arg1, int arg2, int arg3) {
        ++field4485;
        super.field1000 = arg2;
        super.field994 = arg1;
        if (arg0 != -116) {
            method1957((byte[]) null, (String) null, 87, -88);
        }
        super.field998 = arg3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(FB)V", line = 61)
    public final void method525(float arg0, byte arg1) {
        super.field987 = arg0;
        if (arg1 != -10) {
            this.method525(-0.005287015F, (byte) 92);
        }
        ++field4482;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)Lfr;", line = 72)
    public static final class382 method1956(byte arg0) {
        ++field4483;
        int var1 = -59 % ((-12 - arg0) / 61);
        class382 var2 = (class382) class80.field1259.method3390((byte) 111);
        if (var2 != null) {
            var2.method2797(98);
            var2.method131(126);
            return var2;
        } else {
            class382 var3;
            do {
                var3 = (class382) class462.field6256.method3390((byte) 90);
                if (var3 == null) {
                    return null;
                }
                if (var3.method2230(1024) > class681.method3802(-23600)) {
                    return null;
                }
                var3.method2797(-123);
                var3.method131(124);
            } while ((Long.MIN_VALUE & var3.field207) == 0L);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BLjava/lang/String;II)I", line = 118)
    public static final int method1957(byte[] arg0, String arg1, int arg2, int arg3) {
        ++field4486;
        int var4 = arg3;
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class138.method1020(-21218, arg1.charAt(var6));
            int var8 = ~(var6 + 1) > ~var5 ? class138.method1020(-21218, arg1.charAt(var6 + 1)) : -1;
            int var9 = ~(var6 + 2) > ~var5 ? class138.method1020(-21218, arg1.charAt(var6 + 2)) : -1;
            int var10 = var5 <= var6 + 3 ? -1 : class138.method1020(-21218, arg1.charAt(var6 + 3));
            arg0[arg3++] = (byte) class220.method1393(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class220.method1393(var9 >>> 2, class571.method3139(var8 << 4, 240));
            if (var10 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class220.method1393(class571.method3139(3, var9) << 6, var10);
        }
        return arg2 > -85 ? -118 : -var4 + arg3;
    }
}
