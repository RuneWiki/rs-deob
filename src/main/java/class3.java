import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class3 extends class757 {

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Lrn;")
    public static class633 field16 = new class633(32, -1);

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBI)V")
    public final void method6(int arg0, int arg1, byte arg2, int arg3) {
        super.field10332 = arg0;
        ++field15;
        super.field10317 = arg3;
        if (arg2 <= -127) {
            super.field10314 = arg1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method7(String arg0, int arg1) {
        ++field18;
        int var2 = 59 % ((arg1 - 5) / 56);
        for (int var3 = 0; ~class206.field2833.length < ~var3; ++var3) {
            if (class206.field2833[var3].equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V")
    public static void method8(byte arg0) {
        int var1 = -85 % ((-84 - arg0) / 34);
        field16 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
    public static final void method9(int arg0, boolean arg1) {
        if (arg1 && class402.field5326 != null) {
            class224.field3041 = class402.field5326.field4973;
        } else {
            class224.field3041 = -1;
        }
        ++field17;
        class562.field7147 = 0;
        class565.field7168 = null;
        class402.field5326 = null;
        class558.field7088 = null;
        class402.method2333();
        class402.field5329.method3594(124);
        class490.field6304 = -1;
        class773.field10539 = null;
        class381.field4749 = null;
        class202.field2805 = null;
        class774.field10556 = -1;
        class249.field3418 = null;
        class266.field3530 = null;
        class402.field5330 = null;
        class588.field7467 = null;
        class596.field7570 = null;
        class372.field4555 = null;
        class190.field2647 = null;
        if (class402.field5322 != null) {
            class402.field5322.method2324(-128);
            class402.field5322.method2322(false, 128, 64);
        }
        if (class402.field5324 != null) {
            class402.field5324.method2690(64, -1, 64);
        }
        if (class402.field5320 != null) {
            class402.field5320.method4287(64, -97);
        }
        class229.field3089.method220(true, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIIIIF)V")
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(FI)V")
    public final void method10(float arg0, int arg1) {
        ++field14;
        if (arg1 != 10) {
            field16 = null;
        }
        super.field10325 = arg0;
    }
}
