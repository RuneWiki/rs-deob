import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class608 extends class353 {

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/lang/String;")
    public static String field8638 = null;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Ldh;")
    public static class320 field8637 = new class320(7, 6);

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "[I")
    public static int[] field8640 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)Ltc;")
    public abstract class351 method2889(int arg0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lsn;I)Z")
    public static final boolean method3444(class629 arg0, int arg1) {
        field8639++;
        int var2 = 40 / ((arg1 - 22) / 35);
        return class58.field592 == arg0 || class672.field9534 == arg0 || class465.field6661 == arg0 || class109.field1159 == arg0;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public static final void method3445(int arg0) {
        field8635++;
        for (int var1 = 0; var1 < 5; var1++) {
            class320.field4080[var1] = false;
        }
        class687.field9703 = 0;
        if (arg0 > -36) {
            method3444(null, -106);
        }
        class242.field2882 = -1;
        class125.field1312 = -1;
        class406.field5556 = -1;
        class16.field147 = -1;
        class711.field10016 = 0;
        class496.field7014 = 1;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
    public static void method3446(int arg0) {
        field8640 = null;
        if (arg0 == 0) {
            field8638 = null;
            field8637 = null;
        }
    }
}
