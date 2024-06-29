import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class527 extends class409 {

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    private int field7720;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    private int field7719;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    private int field7713;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    private int field7725;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Ljp;")
    public static class55 field7718 = new class55(19, 6);

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lpu;")
    public static class179 field7723 = new class179("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Ljp;")
    public static class55 field7716;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Lum;")
    public static class83 field7724;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 4)
    public static void method3125(byte arg0) {
        int var1 = -35 / ((arg0 - 82) / 32);
        field7724 = null;
        field7718 = null;
        field7716 = null;
        field7723 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I", line = 18)
    public static final int method3126(int arg0, int arg1) {
        ++field7721;
        return arg1 <= 91 ? -79 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 29)
    public static final void method3127(int arg0) {
        ++field7722;
        if (arg0 != 21851) {
            method3125((byte) 9);
        }
        if (class114.field1750 == 6) {
            class114.field1750 = 7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(IBI)V", line = 47)
    public final void method1852(int arg0, byte arg1, int arg2) {
        if (arg1 == 88) {
            ++field7715;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBI)V", line = 59)
    public final void method1855(int arg0, byte arg1, int arg2) {
        ++field7717;
        if (arg1 < -8) {
            int var4 = this.field7720 * arg2 >> 12;
            int var5 = this.field7719 * arg2 >> 12;
            int var6 = this.field7713 * arg0 >> 12;
            int var7 = this.field7725 * arg0 >> 12;
            class23.method146(super.field6043, var7, var6, var4, (byte) 125, var5);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V", line = 85)
    public final void method1850(int arg0, int arg1, int arg2) {
        ++field7714;
        if (arg2 <= 120) {
            method3126(-58, 112);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIIIII)V", line = 96)
    public class527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7720 = arg0;
        this.field7719 = arg2;
        this.field7713 = arg1;
        this.field7725 = arg3;
    }
}
