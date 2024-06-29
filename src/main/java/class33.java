import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class33 extends class12 {

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "Lkh;")
    public class117 field768;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Lkh;")
    private static class117 field765 = class224.method1450((byte) 9, "Loading fonts )2 ");

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Lkh;")
    public static class117 field766 = field765;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field764 = -1;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field770 = 99;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "Lai;")
    public static class10 field771;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
    public static void method283(byte arg0) {
        if (arg0 < -22) {
            field771 = null;
            field766 = null;
            field765 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lai;I)V")
    public static final void method284(class10 arg0, int arg1) {
        class157.field2858 = arg0;
        field772++;
        if (arg1 >= -25) {
            method286(null, -78);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILai;ZI)[Lch;")
    public static final class31[] method285(int arg0, class10 arg1, boolean arg2, int arg3) {
        if (arg2) {
            return null;
        } else {
            field767++;
            return class96.method654(arg0, -2158, arg3, arg1) ? class12.method119(23757) : null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lnc;I)Lpc;")
    public static final class167 method286(class145 arg0, int arg1) {
        field763++;
        if (arg1 != -1) {
            method284(null, -14);
        }
        arg0.method998(94);
        int var2 = arg0.method998(122);
        class167 var3 = class77.method540(var2, -109);
        var3.field3031 = arg0.method998(arg1 + 75);
        int var4 = arg0.method998(arg1 + 106);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method998(115);
            var3.method51(arg0, false, var6);
        }
        var3.method262(59);
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static final void method287(int arg0) {
        class25.field624 = false;
        field769++;
        class167.field3021 = false;
        if (arg0 != 8088) {
            method284(null, 21);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class33() {
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lkh;)V")
    public class33(class117 arg0) {
        this.field768 = arg0;
    }
}
