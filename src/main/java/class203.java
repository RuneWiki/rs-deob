import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class203 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ltq;")
    private class536 field2809 = new class536(64);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lwm;")
    private class30 field2813;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lwm;")
    private class30 field2811;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field2814 = -1;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Luw;")
    public static class208 field2810 = new class208(102, 28);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field2816 = 0;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 6)
    public static void method1381(byte arg0) {
        field2810 = null;
        if (arg0 < 46) {
            field2816 = -28;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lwaa;", line = 16)
    public final class647 method1382(int arg0, int arg1) {
        field2815++;
        class647 var3 = (class647) this.field2809.method2931((long) arg0, (byte) -119);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field2811.method139(0, (byte) -94, arg0);
        } else {
            var4 = this.field2813.method139(0, (byte) -94, arg0 & 0x7FFF);
        }
        class647 var5 = new class647();
        if (var4 != null) {
            var5.method3492(new class234(var4), true);
        }
        if (arg0 >= arg1) {
            var5.method3495(59);
        }
        this.field2809.method2918((long) arg0, var5, 103);
        return var5;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V", line = 48)
    public static final void method1383(int arg0, int arg1, byte arg2) {
        field2812++;
        if (class699.field9263 == null) {
            return;
        }
        int var3 = 112 / ((arg2 + 35) / 45);
        int var4 = class66.field867;
        int var5 = class449.field5867;
        class738.method4010(arg0, -114, arg1);
        if (class596.field7567 == 0) {
            class264.field3511 = null;
            class264.field3511 = class699.field9263.method878(class699.field9263.method1001(class669.field8694, class386.field4933), class699.field9263.method938(class669.field8694, class386.field4933));
        } else if (class596.field7567 == 1 && (class465.field6034 == null || class66.field867 != var4 || class449.field5867 != var5)) {
            class465.field6034 = new class649[class66.field867 * class449.field5867];
            for (int var6 = 0; var6 < class465.field6034.length; var6++) {
                class465.field6034[var6] = class699.field9263.method878(class699.field9263.method1001(class65.field852, class422.field5550), class699.field9263.method938(class65.field852, class422.field5550));
            }
            class398.field5255 = 1;
            class212.field2921 = new int[class66.field867 * class449.field5867];
        }
        class689.field8852 = true;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILwm;Lwm;)V", line = 125)
    public class203(int arg0, class30 arg1, class30 arg2) {
        this.field2813 = arg2;
        this.field2811 = arg1;
        if (this.field2811 != null) {
            this.field2811.method138(0, 0);
        }
        if (this.field2813 != null) {
            this.field2813.method138(0, 0);
        }
    }
}
