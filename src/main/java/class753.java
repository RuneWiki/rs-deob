import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class753 extends class65 {

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field10494 = -1;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public static int field10491 = -1;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public int field10486;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public int field10487;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public int field10489;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
    public int field10492;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public int field10493;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    public int field10495;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    public int field10496;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public int field10497;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public static int field10498;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "I")
    public int field10499;

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
    public static int field10501;

    @OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
    public int field10502;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
    public static int field10503;

    @OriginalMember(owner = "client!gfa", name = "C", descriptor = "I")
    public int field10504;

    @OriginalMember(owner = "client!gfa", name = "D", descriptor = "I")
    public int field10505;

    @OriginalMember(owner = "client!gfa", name = "E", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!gfa", name = "F", descriptor = "I")
    public int field10507;

    @OriginalMember(owner = "client!gfa", name = "G", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!gfa", name = "H", descriptor = "I")
    public int field10509;

    @OriginalMember(owner = "client!gfa", name = "I", descriptor = "I")
    public int field10510;

    @OriginalMember(owner = "client!gfa", name = "L", descriptor = "I")
    public int field10513;

    @OriginalMember(owner = "client!gfa", name = "M", descriptor = "I")
    public int field10514;

    @OriginalMember(owner = "client!gfa", name = "J", descriptor = "Luh;")
    public class413 field10511;

    @OriginalMember(owner = "client!gfa", name = "K", descriptor = "Lso;")
    public class538 field10512;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "Lsv;")
    public class57 field10500;

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "Lcaa;")
    public class637 field10488;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIBI)Z", line = 4)
    public static final boolean method4195(int arg0, int arg1, byte arg2, int arg3) {
        class410.field6048.method665(arg1, arg0, arg3, client.field6497);
        field10498++;
        int var4 = client.field6497[2];
        if (arg2 < 90) {
            method4198(-104, -98);
        }
        if (var4 < 50) {
            return false;
        } else {
            client.field6497[2] = var4;
            client.field6497[0] = class378.field5682 + (client.field6497[0] * class247.field3961 / var4);
            client.field6497[1] = client.field6497[1] * class330.field4872 / var4 + class324.field4787;
            return true;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lbg;II)Z", line = 33)
    public static final boolean method4196(class328 arg0, int arg1, int arg2) {
        class410.field6048.method665(arg0.field4839[arg1], arg0.field4832[arg1], arg0.field4835[arg1], client.field6497);
        field10506++;
        int var3 = client.field6497[2];
        int var4 = 56 % ((arg2 + 33) / 61);
        if (var3 < 50) {
            return false;
        } else {
            arg0.field4829[arg1] = (short) (client.field6497[0] * class247.field3961 / var3 + class378.field5682);
            arg0.field4841[arg1] = (short) (client.field6497[1] * class330.field4872 / var3 + class324.field4787);
            arg0.field4840[arg1] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V", line = 62)
    public final void method4197(int arg0) {
        this.field10500 = null;
        this.field10488 = null;
        int var2 = -112 % ((arg0 - 48) / 58);
        field10508++;
        this.field10511 = null;
        this.field10512 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(II)V", line = 81)
    public static final void method4198(int arg0, int arg1) {
        if (arg0 < 62) {
            field10491 = -82;
        }
        field10503++;
        class440.field6417 = arg1;
        class145.field2239.method76(-115);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BLla;)V", line = 99)
    public static final void method4199(byte arg0, class422 arg1) {
        class721.field10107 = 0;
        class430.field6292 = 0;
        field10501++;
        class494.field7152 = new class564();
        class15.field154 = new class653[1024];
        class44.field747 = new class627[class648.field9214[class630.field8864] + 1];
        class329.field4860 = 0;
        class258.field4048 = 0;
        int var2 = -24 % ((arg0 + 70) / 52);
        class145.method1116((byte) -15, arg1);
        class79.method719(0, arg1);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)I", line = 118)
    public static final int method4200(boolean arg0) {
        if (arg0) {
            field10494 = -11;
        }
        field10490++;
        return class316.field4737;
    }
}
