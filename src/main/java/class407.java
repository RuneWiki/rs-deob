import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class407 extends class747 implements class26 {

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
    private int field5952;

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    private int field5957;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
    private int field5955;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lbga;Lwq;III[B)V")
    public class407(class358 arg0, class169 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class523.field7249, arg2 * arg4 * arg3, false);
        this.field5952 = arg4;
        this.field5957 = arg2;
        this.field5955 = arg3;
        super.field10335.method4097((byte) 86, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field10346, 0, this.method4164(105), this.field5957, this.field5955, this.field5952, 0, class175.method1310(109, super.field10337), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Ldh;")
    public static final class322 method2531(int arg0) {
        ++field5958;
        class470 var1 = null;
        class322 var2 = new class322(class582.field7970, 0);
        try {
            class622 var3 = class689.field9299.method1207((byte) -46, "", true);
            while (var3.field8462 == 0) {
                class700.method3916((byte) -85, 1L);
            }
            if (~var3.field8462 == -2) {
                var1 = (class470) var3.field8463;
                byte[] var4 = new byte[(int) var1.method2774((byte) -46)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var1.method2768(var4, var5, (byte) -49, var4.length + -var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class322(new class215(var4), class582.field7970, 0);
            }
        } catch (Exception var8) {
        }
        if (arg0 != 24916) {
            return null;
        } else {
            try {
                if (var1 != null) {
                    var1.method2769(false);
                }
            } catch (Exception var7) {
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)[Lmu;")
    public static final class303[] method2532(int arg0) {
        ++field5950;
        if (arg0 != -11271) {
            method2533(39);
        }
        return new class303[] { class730.field9875, class67.field1258, class705.field9563, class213.field3030, class691.field9340, class413.field6003, class118.field2008, class212.field3011, class398.field5841, class587.field8007, class422.field6092, class404.field5928, class601.field8254, class753.field10516, class671.field9152, class207.field2974, class641.field8812, class394.field5787, class422.field6091, class66.field1255, class405.field5943, class240.field3499, class570.field7827, class705.field9544, class145.field2396, class445.field6320, class282.field3952, class482.field6721, class630.field8670, class302.field4205, class608.field8349, class547.field7536, class85.field1537, class697.field9420, class107.field1882, class356.field5047, class19.field293, class505.field7023, class461.field6491, class106.field1859, class633.field8702, class94.field1650, class82.field1490, class350.field4883, class137.field2296, class126.field2134, class339.field4764, class681.field9223, class20.field296, class559.field7736, class304.field4243, class425.field6125, class473.field6618, class565.field7791, class737.field9926, class639.field8787, class680.field9213, class558.field7730, class605.field8305, class133.field2239, class584.field7986, class76.field1368, class564.field7786, class231.field3339, class656.field8999, class103.field1825, class439.field6254, class488.field6757, class256.field3709, class656.field8998, class207.field2963, class696.field9401, class21.field332, class98.field1694, class32.field804, class508.field7069, class192.field2847, class742.field9987, class565.field7794, class504.field7019, class530.field7316, class205.field2955, class733.field9891, class208.field2982, class405.field5940, class435.field6217, class432.field6183, class488.field6754, class575.field7896, class677.field9203, class346.field4841, class333.field4636, class250.field3606, class277.field3915, class201.field2918, class66.field1253, class376.field5330, class410.field5966, class510.field7097, class445.field6327, class275.field3868, class19.field292, class98.field1697, class79.field1421, class459.field6462, class376.field5329, class754.field10533, class494.field6844, class212.field3003, class21.field330, class678.field9205, class534.field7344, class231.field3336, class471.field6599, class181.field2747, class448.field6333, class467.field6557, class654.field8977, class287.field3999, class81.field1482, class530.field7312 };
    }

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "(I)V")
    public static final void method2533(int arg0) {
        ++field5953;
        class23.field723 = new String[500];
        class135.field2268 = class140.field2316.field8160 + class140.field2316.field8155 + 2;
        class523.field7254 = class308.field4276.field8155 - (-class308.field4276.field8160 - arg0);
        for (int var1 = 0; ~class23.field723.length < ~var1; ++var1) {
            class23.field723[var1] = "";
        }
        class355.method2228(class497.field6891.method2936(class607.field8336, 544), 67);
    }
}
