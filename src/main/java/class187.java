import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class187 extends class210 {

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Ljd;")
    public static class92 field3530 = class202.method1325((byte) 90, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Ljd;")
    public static class92 field3538 = class202.method1325((byte) 90, "::autoshadow off");

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Ljd;")
    private static class92 field3527 = class202.method1325((byte) 90, "Loaded textures");

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Ljd;")
    public static class92 field3536 = class202.method1325((byte) 90, "Die Verbindung konnte");

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Ljd;")
    public static class92 field3546 = field3527;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "Lwh;")
    public class214 field3540;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Lha;")
    public class71 field3528;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lha;")
    public class71 field3545;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Ljava/awt/Frame;")
    public static Frame field3539;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "[I")
    public static int[] field3534;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "[I")
    public int[] field3543;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field3534 = null;
        field3538 = null;
        field3539 = null;
        field3530 = null;
        field3527 = null;
        if (arg0 != -14789) {
            field3546 = null;
        }
        field3546 = null;
        field3536 = null;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    public final void method1208(int arg0) {
        int var2 = this.field3541;
        int var3 = 52 % ((-arg0 - 5) / 56);
        field3529++;
        class214 var4 = this.field3540.method1391((byte) 124);
        if (var4 == null) {
            this.field3532 = 0;
            this.field3543 = null;
            this.field3523 = 0;
            this.field3541 = -1;
            this.field3522 = 0;
        } else {
            this.field3523 = var4.field4180;
            this.field3522 = var4.field4178;
            this.field3532 = var4.field4141 * 128;
            this.field3541 = var4.field4157;
            this.field3543 = var4.field4187;
        }
        if (this.field3541 != var2 && this.field3528 != null) {
            class55.field1136.method373(this.field3528);
            this.field3528 = null;
        }
    }
}
