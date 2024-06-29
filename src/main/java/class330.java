import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class330 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public int field5616;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
    public int[] field5621;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[B")
    public byte[] field5615;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[S")
    public short[] field5622;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "[S")
    public short[] field5625;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "[Ljf;")
    public class229[] field5618;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Ljf;")
    public static class229 field5612 = class212.method1457((byte) 110, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ljf;")
    public static class229 field5614 = class212.method1457((byte) 74, "::replacecanvas");

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Ljf;")
    public static class229 field5623 = class212.method1457((byte) 108, " s(West connect-B)3");

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Ljf;")
    public static class229 field5619 = class212.method1457((byte) 125, ": ");

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Ljf;")
    public static class229 field5620 = class212.method1457((byte) 112, "(Y<)4col>");

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Ljf;")
    public static class229 field5626 = class212.method1457((byte) 101, "Interfaces charg-Bes");

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 8)
    public static void method2248(byte arg0) {
        field5626 = null;
        field5614 = null;
        if (arg0 != -96) {
            field5623 = (class229) null;
        }
        field5619 = null;
        field5620 = null;
        field5623 = null;
        field5612 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 35)
    public static final void method2249(int arg0) {
        field5627++;
        if (arg0 <= -98) {
            class305.field5161.method226((byte) -115);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)Z", line = 61)
    public final boolean method2250(int arg0, boolean arg1) {
        field5611++;
        if (arg1) {
            return false;
        } else {
            return (this.field5615[arg0] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IZ)V", line = 81)
    public static final void method2251(int arg0, boolean arg1) {
        field5617++;
        if (class162.field2747 == arg1) {
            return;
        }
        class162.field2747 = arg1;
        class293.method2032(30000);
        if (arg0 != 3) {
            field5619 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)I", line = 100)
    public final int method2252(boolean arg0, int arg1) {
        if (arg0) {
            this.field5621 = (int[]) null;
        }
        field5624++;
        return this.field5615[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIII)V", line = 112)
    public static final void method2253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class89 var10 = null;
        field5613++;
        for (class89 var11 = (class89) class83.field1532.method2078(-109); var11 != null; var11 = (class89) class83.field1532.method2080(5)) {
            if (var11.field1635 == arg3 && var11.field1641 == arg2 && var11.field1633 == arg0 && var11.field1628 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (arg9 > -95) {
            return;
        }
        if (var10 == null) {
            var10 = new class89();
            var10.field1633 = arg0;
            var10.field1635 = arg3;
            var10.field1641 = arg2;
            var10.field1628 = arg8;
            class277.method1950(18315, var10);
            class83.field1532.method2079(var10, 65);
        }
        var10.field1624 = arg5;
        var10.field1632 = arg7;
        var10.field1626 = arg6;
        var10.field1638 = arg4;
        var10.field1634 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V", line = 163)
    public class330(int arg0) {
        this.field5616 = arg0;
        this.field5621 = new int[this.field5616];
        this.field5615 = new byte[this.field5616];
        this.field5622 = new short[this.field5616];
        this.field5625 = new short[this.field5616];
        this.field5618 = new class229[this.field5616];
    }
}
