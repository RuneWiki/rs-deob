import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class705 {

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[I")
    public int[] field9952;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
    public int[] field9958;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "[I")
    public int[] field9957;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[[F")
    public float[][] field9953;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
    public static int[] field9951 = new int[1000];

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field9955 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field9950;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
    public static int[] field9954;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3912(int arg0) {
        class14 var1 = class599.field8488;
        synchronized (class599.field8488) {
            if (arg0 != 0) {
                field9954 = null;
            }
            class599.field8488.method71((byte) 44);
        }
        field9949++;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 17)
    public static final void method3913(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class512.field7443[var1] = null;
        }
        field9948++;
        class316.field4737 = 0;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 34)
    public static void method3914(int arg0) {
        field9954 = null;
        if (arg0 != 6376) {
            field9951 = null;
        }
        field9951 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZIIII)V", line = 45)
    public static final void method3915(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field9956++;
        int var7 = class487.method2955(class76.field1126, class461.field6699, (byte) -118, arg4);
        int var8 = class487.method2955(class76.field1126, class461.field6699, (byte) 42, arg6);
        if (!arg2) {
            method3915(-39, 118, false, 122, -57, 117, 43);
        }
        int var9 = class487.method2955(class184.field3102, class657.field9347, (byte) -115, arg5);
        int var10 = class487.method2955(class184.field3102, class657.field9347, (byte) 30, arg3);
        int var11 = class487.method2955(class76.field1126, class461.field6699, (byte) -102, arg0 + arg4);
        int var12 = class487.method2955(class76.field1126, class461.field6699, (byte) 55, arg6 - arg0);
        for (int var13 = var7; var13 < var11; var13++) {
            class608.method3484(class77.field1131[var13], var9, -7, arg1, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class608.method3484(class77.field1131[var14], var9, -7, arg1, var10);
        }
        int var15 = class487.method2955(class184.field3102, class657.field9347, (byte) 73, arg0 + arg5);
        int var16 = class487.method2955(class184.field3102, class657.field9347, (byte) -86, arg3 - arg0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class77.field1131[var17];
            class608.method3484(var18, var9, -7, arg1, var15);
            class608.method3484(var18, var16, -7, arg1, var10);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)[Ltm;", line = 108)
    public static final class334[] method3916(int arg0) {
        field9950++;
        if (arg0 != 0) {
            field9954 = null;
        }
        return new class334[] { class526.field7566, class59.field923, class33.field312, class574.field8158, class616.field8687, class75.field1110, class91.field1368, class595.field8365, class630.field8858, class402.field5981, class463.field6736, class532.field7654, class713.field10022, class336.field4922, class180.field3058, class374.field5650, class439.field6397, class258.field4047, class501.field7281, class521.field7525, class554.field7898, class139.field2174, class310.field4680, class449.field6542, class380.field5710, class328.field4836, class632.field8877, class155.field2397, class544.field7776, class540.field7706, class677.field9549, class474.field6878, class37.field370, class701.field9912, class341.field4999, class617.field8703, class204.field3434, class440.field6413, class33.field309, class223.field3616, class395.field5893, class629.field8835, class424.field6235, class31.field297, class16.field158, class493.field7142, class89.field1363, class583.field8237, class183.field3090, class165.field2534, class552.field7868, class5.field35, class702.field9938, class3.field9, class343.field5089, class424.field6231, class286.field4403, class756.field10534, class185.field3107, class116.field1797, class559.field7932, class189.field3181, class100.field1478, class377.field5671, class45.field769, class526.field7573, class402.field5982, class82.field1194, class707.field9970, class425.field6239, class371.field5625, class100.field1482, class603.field8524, class740.field10379, class73.field1099, class60.field933, class348.field5126, class393.field5871, class15.field153, class620.field8722, class252.field4006, class666.field9461, class732.field10291, class231.field3717, class402.field5979, class271.field4160, class186.field3116, class522.field7532, class46.field775, class724.field10169, class618.field8710, class673.field9525, class679.field9570, class398.field5917, class114.field1778, class335.field4913, class210.field3496, class430.field6293, class268.field4140, class569.field8075, class484.field6994, class461.field6685, class45.field768, class713.field10027, class56.field890, class448.field6536, class268.field4137, class675.field9536, class29.field281, class604.field8540, class47.field785, class620.field8719, class672.field9511, class662.field9422, class63.field983, class120.field1838, class372.field5637, class735.field10357, class356.field5388, class486.field7029, class367.field5585 };
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([I[I[I[[F)V", line = 121)
    public class705(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field9952 = arg1;
        this.field9958 = arg2;
        this.field9957 = arg0;
        this.field9953 = arg3;
    }
}
