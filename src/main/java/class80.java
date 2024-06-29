import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class80 extends class300 implements class530 {

    @OriginalMember(owner = "client!haa", name = "y", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!haa", name = "C", descriptor = "[I")
    public static int[] field939 = new int[64];

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!haa", name = "A", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!haa", name = "B", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V", line = 5)
    public static void method428(int arg0) {
        field939 = null;
        if (arg0 != -4124) {
            method430((byte) -120);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([BII)[B", line = 22)
    public static final byte[] method429(byte[] arg0, int arg1, int arg2) {
        ++field938;
        if (arg2 >= -87) {
            method428(-2);
        }
        byte[] var3 = new byte[arg1];
        class2.method9(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V", line = 38)
    public static final void method430(byte arg0) {
        class37.field501.method1292((byte) 59);
        ++field937;
        class35.field492.method584((byte) 105);
        class516.field7170.method3900((byte) -53);
        class118.field1510.method3923(123);
        class440.field5847.method503(2651);
        class87.field1058.method1395((byte) -121);
        class423.field5620.method1709(64);
        class24.field291.method2944(-120);
        class632.field8745.method2760(53);
        class624.field8643.method2522((byte) -104);
        class159.field2282.method3596(-42);
        class291.field3852.method1014(64);
        class506.field6989.method2152((byte) 57);
        class258.field3383.method2765((byte) 94);
        class15.field198.method3458((byte) -105);
        class579.field7919.method2378(-1176);
        class400.field5313.method1451(1033704076);
        class400.field5311.method19(-1718294864);
        class130.field1802.method2429((byte) -51);
        class554.field7565.method573(-51);
        class590.method3264((byte) 52);
        class143.method820((byte) -114);
        class592.method3273(false);
        class693.method3907((byte) 108);
        int var1 = -100 % ((arg0 - -26) / 55);
        if (class480.field6673 != class180.field2522) {
            for (int var2 = 0; ~class389.field5218.length < ~var2; ++var2) {
                class389.field5218[var2] = null;
            }
            class228.field2956 = 0;
        }
        class322.method1865(5088);
        class348.method2068(true);
        class565.method3133(4096);
        class448.method2524(95);
        class27.method163(82);
        class656.field9352.method2168((byte) -102);
        class146.field1963.method1125();
        class396.method2272(-128);
        class630.method3488(0);
        class567.field7726.method1951(71);
        class219.field2868.method1951(-73);
        class82.field947.method1951(101);
        class542.field7425.method1951(-61);
        class3.field8.method1951(105);
        class543.field7433.method1951(62);
        class654.field9309.method1951(79);
        class94.field1139.method1951(-76);
        class390.field5228.method1951(-88);
        class329.field4420.method1951(95);
        class13.field164.method1951(-119);
        class165.field2366.method1951(-93);
        class614.field8506.method1951(-88);
        class208.field2785.method1951(-113);
        class56.field728.method1951(-84);
        class537.field7372.method1951(-64);
        class361.field4786.method1951(-86);
        class89.field1084.method1951(-64);
        class651.field9100.method1951(127);
        class411.field5404.method1951(89);
        class219.field2867.method1951(-82);
        class630.field8722.method1951(67);
        class426.field5748.method1951(104);
        class688.field9713.method1951(63);
        class33.field461.method1951(69);
        class85.field1045.method1951(-78);
        class200.field2708.method1951(-104);
        class102.field1219.method1951(71);
        class417.field5481.method1951(125);
        class311.field4196.method1951(68);
        class529.field7313.method1951(-73);
        class329.field4418.method1951(-127);
        class230.field2981.method2168((byte) -96);
        class436.field5815.method2168((byte) -105);
        class643.field8895.method2168((byte) -75);
        class704.field9925.method2168((byte) -90);
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lqi;IZ[[I)V", line = 131)
    public class80(class510 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class480.field6686, class404.field5338, arg1 * 6 * arg1, arg2);
        super.field3985.method3613((byte) 109, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method1770(arg1, arg3[var5], arg1, (byte) 67, var5 + 34069);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method1776(true), arg1, arg1, 0, class400.method2292(-27762, super.field3989), super.field3985.field7126, arg3[var6], 0);
            }
        }
    }
}
