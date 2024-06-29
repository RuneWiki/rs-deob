import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class45 implements class415 {

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Lpq;")
    private class159 field602;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lpu;")
    public class422 field597;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Ljv;")
    public static class606 field601 = new class606(0, 1);

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lnj;")
    public static class436 field608 = new class436(8);

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Lxa;")
    public class424 field596;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Loa;")
    public static class689 field603;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public static final void method275(int arg0) {
        class572.method3231(class9.field103, true, (long) class430.field5984);
        field607++;
        if (class316.field4599 != -1) {
            class296.method1768(true, class316.field4599);
        }
        if (arg0 > -111) {
            return;
        }
        for (int var1 = 0; var1 < class264.field3629; var1++) {
            if (class200.field2630[var1]) {
                class224.field2912[var1] = true;
            }
            class643.field9112[var1] = class200.field2630[var1];
            class200.field2630[var1] = false;
        }
        class431.field5989 = class430.field5984;
        if (class9.field103.method1791()) {
            class187.field2296 = true;
        }
        if (class316.field4599 != -1) {
            class264.field3629 = 0;
            class267.method1650((byte) -66);
        }
        class9.field103.method1984();
        class373.method2278(2048, class9.field103);
        int var2 = class559.method3128((byte) 42);
        if (var2 == -1) {
            var2 = class664.field9413;
        }
        if (var2 == -1) {
            var2 = class141.field1802;
        }
        class87.method489(102, var2);
        class323.field4732 = 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        this.field596 = class506.method2866(this.field602.method1082((byte) 33, this.field597.field5883), (byte) 124);
        field598++;
        this.method277(true, (byte) -76);
        if (arg0 >= -5) {
            this.field596 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
    public final boolean method193(int arg0) {
        field606++;
        if (arg0 != -29581) {
            method276((byte) 96);
        }
        return this.field602.method1086((byte) 123, this.field597.field5883);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lpq;Lpu;)V")
    public class45(class159 arg0, class422 arg1) {
        this.field602 = arg0;
        this.field597 = arg1;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public static void method276(byte arg0) {
        field601 = null;
        field603 = null;
        if (arg0 > -66) {
            field603 = null;
        }
        field608 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V")
    public void method277(boolean arg0, byte arg1) {
        if (arg1 >= -13) {
            this.method191((byte) 119);
        }
        field604++;
        if (arg0) {
            int var3 = this.field597.field5881.method2304(class432.field5995, this.field596.method1160(), 65535) + this.field597.field5877;
            int var4 = this.field597.field5884.method536(class384.field5582, -26620, this.field596.method1157()) + this.field597.field5880;
            this.field596.method2450(var3, var4);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ldda;I)Z")
    public static final boolean method278(class289 arg0, int arg1) {
        field605++;
        int var2 = 118 / ((-arg1 - 23) / 37);
        class252 var3 = class578.field7980.method1746(arg0.method130(-5582), (byte) 84);
        if (var3.field3398 == -1) {
            return true;
        } else {
            class677 var4 = class70.field916.method1013(var3.field3398, (byte) -86);
            return var4.field9599 == -1 ? true : var4.method3741(-107);
        }
    }
}
