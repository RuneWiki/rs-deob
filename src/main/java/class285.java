import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class285 {

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
    public static int[] field3986 = new int[200];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3981 = 0;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lh;")
    public static class572 field3984 = new class572("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lh;")
    public static class572 field3988 = new class572("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLvp;)Lvp;")
    public static final class162 method1770(byte arg0, class162 arg1) {
        field3987++;
        if (arg0 < 29) {
            field3988 = null;
        }
        class162 var2 = client.method1621(arg1);
        if (var2 == null) {
            var2 = arg1.field2431;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILkda;B)Llg;")
    public static final class352 method1771(int arg0, class328 arg1, byte arg2) {
        field3985++;
        if (arg2 != 54) {
            method1770((byte) 32, null);
        }
        byte[] var3 = arg1.method1984(arg2 + 1616, arg0);
        return var3 == null ? null : new class352(var3);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1772(byte arg0) {
        field3984 = null;
        field3988 = null;
        int var1 = -73 % ((-arg0 - 4) / 35);
        field3986 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static final void method1773(byte arg0) {
        if (arg0 <= 31) {
            return;
        }
        class60.field756 = 0;
        class57.field715 = 0;
        class568.field8374 = 0;
        class5.field47 = 0;
        field3982++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII)I")
    public static final int method1774(byte arg0, int arg1, int arg2) {
        if (arg0 <= 60) {
            field3984 = null;
        }
        field3983++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }
}
