import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class448 extends class207 implements class416 {

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    private int field6603;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Ldp;")
    public static class347 field6605 = new class347("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field6608 = 10;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field6610 = 0;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "[Lgk;")
    public static class468[] field6609 = new class468[2048];

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "Ldp;")
    public static class347 field6607 = new class347("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field6611 = 104;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)I", line = 3)
    public final int method1199(int arg0) {
        ++field6604;
        if (arg0 != 30995) {
            this.method1199(62);
        }
        return this.field6603;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)J", line = 15)
    public final long method1200(int arg0) {
        ++field6602;
        return arg0 != -21691 ? -47L : super.field2996.method2846();
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lvd;I[BI)V", line = 33)
    public class448(class258 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6603 = arg1;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)I", line = 41)
    public final int method1204(int arg0) {
        ++field6606;
        return arg0 != -1124 ? 104 : 0;
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)V", line = 52)
    public static void method2621(int arg0) {
        if (arg0 != 3118) {
            field6607 = null;
        }
        field6605 = null;
        field6607 = null;
        field6609 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BII[B)V", line = 64)
    public final void method1201(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field6600;
        this.method1350(arg3, arg2);
        if (arg0 >= -8) {
            this.method1200(-83);
        }
        this.field6603 = arg1;
    }

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)V", line = 87)
    public static final void method2622(int arg0) {
        ++field6601;
        if (arg0 != 9492) {
            method2622(120);
        }
        class61.field832 = 0;
        int var1 = (class410.field6198.field7681 >> 7) + class267.field3979;
        int var2 = (class410.field6198.field7671 >> 7) + class241.field3358;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && ~var2 >= -3137) {
            class61.field832 = 1;
        }
        if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class61.field832 = 1;
        }
        if (~class61.field832 == -2 && ~var1 <= -3140 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            class61.field832 = 0;
        }
    }
}
