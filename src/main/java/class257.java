import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class257 extends class5 {

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "Lhj;")
    public static class69 field4610 = class181.method1318("Starte 3D)2Softwarebibliothek)3", (byte) -120);

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "Lhj;")
    private static class69 field4607 = class181.method1318("Loading textures )2 ", (byte) -110);

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Lhj;")
    public static class69 field4612 = field4607;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4614 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    private int field4615;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Lhj;")
    public class69 field4609;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    public static final void method1773(int arg0) {
        class14.method73((byte) -70, 5);
        field4606++;
        class61.method367(arg0 ^ 0xFA, 5);
        class76.method548((byte) 94, 5);
        class78.method562(5, (byte) -115);
        class235.method1663((byte) -123, arg0);
        class81.method575(5, arg0 + 99999994);
        class133.method991(5, false);
        class64.method420(5, true);
        class55.method327(5, arg0 - 6);
        class27.method156(5, (byte) 90);
        class45.method253(5, 109);
        class200.method1456(50, 9423);
        class79.method563(5, (byte) 104);
        class61.method370(arg0 + 94, 5);
        class227.field4133.method1708(-1009973721, 5);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)V")
    public static void method1774(byte arg0) {
        field4610 = null;
        field4607 = null;
        field4612 = null;
        field4614 = null;
        if (arg0 <= 91) {
            method1774((byte) -109);
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)Z")
    public final boolean method1775(int arg0) {
        if (arg0 == 21824) {
            field4608++;
            return this.field4615 == 115;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILfh;)V")
    private final void method1776(int arg0, int arg1, class128 arg2) {
        if (arg1 == 1) {
            this.field4615 = arg2.method937(false);
        } else if (arg1 == 2) {
            this.field4616 = arg2.method923(true);
        } else if (arg1 == 5) {
            this.field4609 = arg2.method963(false);
        }
        field4605++;
        if (arg0 != 5) {
            this.field4609 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLfh;)V")
    public final void method1777(boolean arg0, class128 arg1) {
        field4611++;
        while (true) {
            int var3 = arg1.method937(false);
            if (var3 == 0) {
                if (arg0) {
                    this.field4609 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1776(5, var3, arg1);
        }
    }
}
