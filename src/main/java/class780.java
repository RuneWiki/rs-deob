import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class780 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Loo;")
    private class652 field10704 = new class652(64);

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lwia;")
    private class791 field10706;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public int field10709;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lfba;")
    public static class27 field10703 = new class27(90, -1);

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lbu;")
    public static class21 field10708 = new class21(72, 6);

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field10707;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field10710;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "Ltga;")
    public static class63 field10705;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 8)
    public static void method4287(boolean arg0) {
        field10708 = null;
        if (arg0) {
            field10708 = null;
        }
        field10705 = null;
        field10703 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Lkc;", line = 22)
    public final class143 method4288(int arg0, int arg1) {
        field10707++;
        class652 var3 = this.field10704;
        class143 var4;
        synchronized (this.field10704) {
            var4 = (class143) this.field10704.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field10706;
        byte[] var6;
        synchronized (this.field10706) {
            var6 = this.field10706.method4339(arg0, 0, 19);
        }
        class143 var7 = new class143();
        if (var6 != null) {
            var7.method1021(new class494(var6), 126);
        }
        class652 var8 = this.field10704;
        synchronized (this.field10704) {
            this.field10704.method3739((long) arg0, (byte) 42, var7);
            if (arg1 != 9381) {
                this.field10704 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 63)
    public static final void method4289(int arg0) {
        field10710++;
        try {
            if (class90.field1011 == 1) {
                int var1 = class686.field9533.method2744(-16384);
                if (var1 > 0 && class686.field9533.method2747(114)) {
                    int var2 = var1 - class353.field4975;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class686.field9533.method2776((byte) 62, var2);
                    return;
                }
                class686.field9533.method2771(127);
                class686.field9533.method2778(-94);
                class252.field3717 = null;
                class354.field4981 = null;
                if (class106.field1241 == null) {
                    class90.field1011 = 0;
                } else {
                    class90.field1011 = 2;
                }
            }
            if (class90.field1011 == 3) {
                int var3 = class686.field9533.method2744(-16384);
                if (var3 < class14.field279 && class686.field9533.method2747(114)) {
                    int var4 = class562.field7991 + var3;
                    if (var4 > class14.field279) {
                        var4 = class14.field279;
                    }
                    class686.field9533.method2776((byte) -100, var4);
                    return;
                }
                class90.field1011 = 0;
                class562.field7991 = 0;
            }
            if (arg0 <= 19) {
                field10708 = null;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class686.field9533.method2771(127);
            class354.field4981 = null;
            class90.field1011 = 0;
            class252.field3717 = null;
            class161.field2559 = null;
            class106.field1241 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ldt;ILwia;)V", line = 135)
    public class780(class252 arg0, int arg1, class791 arg2) {
        this.field10706 = arg2;
        this.field10709 = this.field10706.method4353(19, true);
    }
}
