import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class397 extends class52 {

    @OriginalMember(owner = "client!li", name = "s", descriptor = "[I")
    public static int[] field5041 = new int[4096];

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public static final void method2246(byte arg0) {
        field5040++;
        class33.method230(class611.field8310.field8714, 2, 22050, (byte) 106);
        class653.field8905 = new class345();
        class653.field8905.method1986(9, -97, 128);
        class506.field6334 = class520.method2815((byte) 83, class472.field5828, class386.field4955, 22050, 0);
        int var1 = 63 / ((arg0 + 9) / 32);
        class506.field6334.method1755(5221, class653.field8905);
        class402.method2263(84, class202.field2352, class431.field5439, class653.field8905, class292.field3712);
        class502.field6253 = class520.method2815((byte) -83, class472.field5828, class386.field4955, 2048, 1);
        class314.field3941 = new class249();
        class502.field6253.method1755(5221, class314.field3941);
        class690.field9575 = new class680(22050, class278.field3535);
        class583.field7837 = class353.field4567.method1651("scape main", (byte) 77);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II[S)[S")
    public static final short[] method2247(int arg0, int arg1, short[] arg2) {
        field5039++;
        short[] var3 = new short[arg0];
        class70.method552(arg2, 0, var3, arg1, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
    public static final int method2248(byte arg0, int arg1) {
        if (arg0 != -76) {
            method2248((byte) -48, -82);
        }
        field5038++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method2249(int arg0) {
        field5041 = null;
        int var1 = -34 % ((36 - arg0) / 57);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5041[var0] = class510.method2779(var0, (byte) -108);
        }
    }
}
