import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class112 extends class91 {

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    private int field1729;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Z")
    public static boolean field1734 = false;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "[I")
    public static int[] field1730 = new int[50];

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lij;")
    public static class316 field1726;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "[S")
    public static short[] field1731;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V", line = 11)
    public final void method367(int arg0, int arg1, int arg2) {
        ++field1728;
        int var4 = this.field1736 * arg2 >> 12;
        if (arg1 <= 59) {
            this.method363(-76, 24, -96);
        }
        int var5 = this.field1729 * arg2 >> 12;
        int var6 = this.field1725 * arg0 >> 12;
        int var7 = this.field1735 * arg0 >> 12;
        class81.method657(64, var6, var5, var7, var4, super.field1275);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 32)
    public static void method857(int arg0) {
        field1730 = null;
        field1731 = null;
        field1726 = null;
        if (arg0 != 26832) {
            field1727 = -75;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V", line = 49)
    public final void method363(int arg0, int arg1, int arg2) {
        if (arg0 == 4) {
            ++field1733;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIII)V", line = 60)
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1725 = arg1;
        this.field1736 = arg0;
        this.field1735 = arg3;
        this.field1729 = arg2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZII)V", line = 74)
    public final void method362(boolean arg0, int arg1, int arg2) {
        ++field1732;
        if (arg0) {
            this.field1735 = 73;
        }
        int var4 = this.field1736 * arg1 >> 12;
        int var5 = this.field1729 * arg1 >> 12;
        int var6 = this.field1725 * arg2 >> 12;
        int var7 = this.field1735 * arg2 >> 12;
        class63.method506(super.field1271, 256, super.field1270, var5, var4, super.field1275, var7, var6);
    }
}
