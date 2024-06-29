import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class344 {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lof;")
    private class328 field5353 = new class328(64);

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lmn;")
    private class162 field5357;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lmn;")
    private class162 field5352;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Lqm;")
    public final class336 method2276(int arg0, int arg1) {
        field5355++;
        class336 var3 = (class336) this.field5353.method2191((byte) -73, (long) arg0);
        if (arg1 < 6) {
            method2279(73, -75, true);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field5352.method1004(0, false, arg0);
        } else {
            var4 = this.field5357.method1004(0, false, arg0 & 0x7FFF);
        }
        class336 var5 = new class336();
        if (var4 != null) {
            var5.method2234(new class208(var4), -1666);
        }
        if (arg0 >= 32768) {
            var5.method2236(true);
        }
        this.field5353.method2188(-125, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZIIZI)Lmn;")
    public static final class162 method2277(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5354++;
        if (arg4 != -6) {
            method2277(false, -69, 124, true, 92);
        }
        class307 var5 = null;
        if (class77.field1151 != null) {
            var5 = new class307(arg2, class77.field1151, class93.field1359[arg2], 1000000);
        }
        class102.field1484[arg2] = class319.field4975.method579(arg2, class460.field7102, var5, -20485);
        if (arg0) {
            class102.field1484[arg2].method2155(2);
        }
        return new class162(class102.field1484[arg2], arg3, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBI)V")
    public static final void method2278(int arg0, byte arg1, int arg2) {
        field5358++;
        class456 var3 = class233.method1654(arg2, 1, 125);
        var3.method2858(10250);
        if (arg1 != -4) {
            method2279(-112, 81, true);
        }
        var3.field7042 = arg0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZ)I")
    public static final int method2279(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field5356++;
            return arg0 == 4 || arg0 == 5 ? class233.field3848[arg1 & 0x3] : 256;
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(ILmn;Lmn;)V")
    public class344(int arg0, class162 arg1, class162 arg2) {
        this.field5357 = arg2;
        this.field5352 = arg1;
        if (this.field5352 != null) {
            this.field5352.method1008(0, (byte) -21);
        }
        if (this.field5357 != null) {
            this.field5357.method1008(0, (byte) -21);
        }
    }
}
