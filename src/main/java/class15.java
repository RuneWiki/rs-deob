import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ldv;")
    public static class566 field206 = new class566(17, 2);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBII)I")
    public static final int method176(int arg0, byte arg1, int arg2, int arg3) {
        field203++;
        if (arg1 != -59) {
            field206 = null;
        }
        int var4 = 255 - arg3;
        int var5 = ((arg2 & 0xFF00FF) * arg3 & 0xFF00FF00 | (arg2 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
        return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)[Lcba;")
    public static final class471[] method177(int arg0) {
        if (arg0 != 127) {
            method178(98, -6, -86);
        }
        field205++;
        return new class471[] { class632.field9246, class552.field7620, class227.field3249, class533.field7463, class478.field6751, class431.field6128, class426.field6052, class126.field2046, class77.field1234, class487.field6833, class236.field3306, class630.field9208, class253.field3517, class346.field4654, class220.field3150, class139.field2174, class394.field5556, class453.field6405, class10.field112, class300.field4115, class443.field6312, class285.field3915, class549.field7601, class593.field8591, class340.field4578, class214.field3047, class404.field5745, class252.field3490, class286.field3933, class489.field6852, class562.field7786, class267.field3742, class246.field3420, class58.field1055, class621.field8957, class226.field3235, class193.field2732, class412.field5793, class185.field2598, class503.field7003, class39.field795, class274.field3796, class122.field1985, client.field3456, class283.field3914, class358.field4819, class63.field1091, class393.field5549, class57.field1013, class124.field2027, class425.field6046, class312.field4211, class319.field4324, class253.field3515, class459.field6462, class393.field5543, class202.field2831, class524.field7367, class130.field2080, class345.field4640, class374.field5038, class541.field7535, class622.field8978, class470.field6613, class480.field6763, class202.field2829, class304.field4146, class266.field3716, class140.field2180, class207.field2911, class164.field2367, class623.field8991, class160.field2346, class99.field1513, class215.field3069, class191.field2701, class75.field1195, class324.field4369, class526.field7396, class85.field1369, class644.field9359, class311.field4188, class10.field108, class326.field4378, class86.field1374, class314.field4233, class353.field4772, class451.field6371, class498.field6953, class456.field6426, class451.field6373, class565.field7817, class19.field230, class258.field3592, class569.field7856, class297.field4074, class71.field1179, class336.field4489, class312.field4197, class434.field6184, class35.field745, class387.field5193, class268.field3752, class414.field5845, class51.field974, class210.field2959, class1.field18, class306.field4162, class405.field5754, class426.field6049, class63.field1087, class439.field6239, class212.field2993, class64.field1098 };
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
    public static final boolean method178(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method178(108, -46, -126);
        }
        field207++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method179(int arg0) {
        field206 = null;
        if (arg0 != 1) {
            method177(-69);
        }
    }
}
