import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class7 extends class291 {

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public int field116 = 0;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public int field113 = 12800;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public int field117 = 12800;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "Z")
    public boolean field123 = true;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    public int field120 = 0;

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
    public int field125 = -1;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "Leg;")
    public class37 field114;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "Leg;")
    public class37 field115;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "Lid;")
    public class226 field118;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public static int field121 = -1;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "Leg;")
    private static class37 field124 = class174.method1167("Loaded update list", -49);

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "Leg;")
    public static class37 field122 = field124;

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "Leg;")
    public static class37 field127 = class174.method1167("name_icons", -73);

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "Lnc;")
    public static class11 field119;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Lhj;")
    public static class221 field108;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
    public final void method41(int arg0) {
        field128++;
        this.field117 = 12800;
        this.field116 = 0;
        if (arg0 < 125) {
            return;
        }
        this.field113 = 12800;
        this.field120 = 0;
        for (class259 var2 = (class259) this.field118.method1566(-3); var2 != null; var2 = (class259) this.field118.method1570(3)) {
            if (var2.field4592 < this.field113) {
                this.field113 = var2.field4592;
            }
            if (var2.field4581 < this.field117) {
                this.field117 = var2.field4581;
            }
            if (this.field116 < var2.field4587) {
                this.field116 = var2.field4587;
            }
            if (var2.field4577 > this.field120) {
                this.field120 = var2.field4577;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZII)Z")
    public final boolean method42(boolean arg0, int arg1, int arg2) {
        field107++;
        if (this.field113 > arg1 || this.field120 < arg1 || arg2 < this.field117 || this.field116 < arg2) {
            return false;
        }
        class259 var4 = (class259) this.field118.method1566(-3);
        if (!arg0) {
            this.field126 = 25;
        }
        while (var4 != null) {
            if (var4.method1753(arg2, -25393, arg1)) {
                return true;
            }
            var4 = (class259) this.field118.method1570(3);
        }
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)I")
    public static final int method43(int arg0, int arg1, byte arg2) {
        field111++;
        if (arg0 == -1) {
            return 12345678;
        }
        if (arg2 > -65) {
            field109 = 1;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
    public static void method44(int arg0) {
        field127 = null;
        field108 = null;
        field124 = null;
        if (arg0 != 5721) {
            method43(-105, 123, (byte) 70);
        }
        field119 = null;
        field122 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Leg;Leg;IIIZ)V")
    public class7(class37 arg0, class37 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field114 = arg0;
        this.field110 = arg3;
        this.field126 = arg2;
        this.field125 = arg4;
        this.field115 = arg1;
        this.field123 = arg5;
        this.field118 = new class226();
    }
}
