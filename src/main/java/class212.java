import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class212 extends class12 {

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    private int field4108 = 4096;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    private int field4105 = 0;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "Lah;")
    public static class9 field4101 = new class9(32);

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "Ltg;")
    private static class184 field4104 = class135.method812("Unexpected loginserver response)3", 3);

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "Ltg;")
    public static class184 field4106 = class135.method812("null", 3);

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "Ltg;")
    public static class184 field4111 = class135.method812("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 3);

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "[[I")
    public static int[][] field4107 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Ltg;")
    public static class184 field4109 = class135.method812("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 3);

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Ltg;")
    public static class184 field4113 = field4104;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1370(boolean arg0, Component arg1) {
        ++field4110;
        arg1.removeKeyListener(class46.field866);
        arg1.removeFocusListener(class46.field866);
        if (arg0) {
            field4113 = null;
        }
        class38.field727 = -1;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    public static void method1371(int arg0) {
        field4109 = null;
        field4113 = null;
        field4107 = null;
        field4104 = null;
        field4111 = null;
        field4101 = null;
        field4106 = null;
        if (arg0 >= -109) {
            field4107 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field4115;
        int[] var3 = super.field224.method7((byte) 113, arg0);
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0, arg1 ^ -106);
            for (int var5 = 0; var5 < class201.field3889; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field4105 <= var6 && ~this.field4108 <= ~var6 ? 4096 : 0;
            }
        }
        if (arg1 != 17) {
            method1371(110);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class212() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field4114;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4108 = arg0.method611(arg2);
            }
        } else {
            this.field4105 = arg0.method611(arg2);
        }
        if (arg2) {
            this.field4108 = -81;
        }
    }
}
