import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class98 extends class226 {

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    private int field1698 = -32768;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Z")
    public boolean field1699 = false;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    private int field1696 = 0;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    private int field1692 = 0;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    private int field1705;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Laj;")
    private class1 field1687;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Ls;")
    public static class261 field1694 = new class261(50);

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field1702 = 0;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lmh;")
    public static class128 field1708 = class22.method156(126, "T");

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field1710 = -1;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "Lmh;")
    public static class128 field1706 = class22.method156(123, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Lfm;")
    public static class42 field1697;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()I", line = 14)
    public final int method204() {
        field1707++;
        return this.field1698;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 29)
    public final void method614(int arg0, int arg1) {
        field1703++;
        if (this.field1699) {
            return;
        }
        this.field1696 += arg0;
        while (this.field1696 > this.field1687.field7[this.field1692]) {
            this.field1696 -= this.field1687.field7[this.field1692];
            this.field1692++;
            if (this.field1687.field8.length <= this.field1692) {
                this.field1699 = true;
                break;
            }
        }
        if (arg1 != 0) {
            field1710 = 34;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIJ)V", line = 56)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1690++;
        class60 var11 = this.method616(74);
        if (var11 != null) {
            var11.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1698 = var11.method204();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 70)
    public static void method615(byte arg0) {
        field1694 = null;
        field1708 = null;
        field1706 = null;
        if (arg0 == 72) {
            field1697 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lja;", line = 89)
    private final class60 method616(int arg0) {
        if (arg0 < 68) {
            this.method614(50, 6);
        }
        class133 var2 = class169.method1134(2, this.field1705);
        field1709++;
        class60 var3;
        if (this.field1699) {
            var3 = var2.method887(-1, (byte) 118);
        } else {
            var3 = var2.method887(this.field1692, (byte) 118);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 113)
    public static final void method617(int arg0) {
        class71.field1320.method570(22, -1);
        if (arg0 != -14451) {
            field1708 = (class128) null;
        }
        class71.field1320.method1324(class298.field5082, 15803);
        class185.field3226++;
        field1689++;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIII)V", line = 169)
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1700 = arg3;
        this.field1688 = arg4;
        this.field1693 = arg5 + arg6;
        this.field1705 = arg0;
        this.field1695 = arg1;
        this.field1691 = arg2;
        int var8 = class169.method1134(2, this.field1705).field2303;
        if (var8 == -1) {
            this.field1699 = true;
        } else {
            this.field1699 = false;
            this.field1687 = class167.method1091(-98, var8);
        }
    }
}
