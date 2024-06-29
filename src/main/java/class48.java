import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class48 extends class151 {

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "Lbd;")
    private static class162 field775 = class17.method142(0, "flash1:");

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Lbd;")
    public static class162 field771 = field775;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lbd;")
    public static class162 field772 = field775;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "Lbd;")
    public static class162 field774 = class17.method142(0, "<col=ff7000>");

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "Lbd;")
    public static class162 field776 = class17.method142(0, "<img=0>");

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Lhb;")
    public static class280 field764;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Lob;")
    public static class78 field765;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z", line = 12)
    public final boolean method354(int arg0, int arg1, int arg2) {
        field773++;
        if (arg2 == 23638) {
            return arg0 >= this.field770 && arg0 <= this.field766 && this.field769 <= arg1 && this.field768 >= arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 28)
    public static void method355(int arg0) {
        field774 = null;
        field775 = null;
        field771 = null;
        field765 = null;
        field764 = null;
        if (arg0 != 31323) {
            method356((byte) -37, (class78) null);
        }
        field776 = null;
        field772 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLob;)V", line = 50)
    public static final void method356(byte arg0, class78 arg1) {
        field767++;
        class78 var2 = class170.method1312(arg1, 0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class251.field4201;
            var4 = class252.field4205;
        } else {
            var3 = var2.field1340;
            var4 = var2.field1367;
        }
        class87.method658(var3, false, 1, var4, arg1);
        class171.method1316(arg1, var4, -30241, var3);
        if (arg0 != 50) {
            field764 = (class280) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IIII)V", line = 75)
    public class48(int arg0, int arg1, int arg2, int arg3) {
        this.field769 = arg1;
        this.field770 = arg0;
        this.field766 = arg2;
        this.field768 = arg3;
    }
}
