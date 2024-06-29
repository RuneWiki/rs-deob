import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class99 extends class79 {

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    private final int field1722;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    private final int field1725;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    private final int field1711;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    private final int field1724;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Lmh;")
    public static class128 field1718 = class22.method156(122, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "[I")
    public static int[] field1721 = new int[32];

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Ls;")
    public static class261 field1713 = new class261(5);

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "[I")
    public static int[] field1727 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Lmh;")
    public static class128 field1728 = class22.method156(123, "Card:");

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V", line = 4)
    public final void method151(int arg0, int arg1, int arg2) {
        field1717++;
        int var4 = this.field1724 * arg0 >> 12;
        int var5 = this.field1722 * arg2 >> 12;
        int var6 = this.field1725 * arg2 >> 12;
        if (arg1 != 0) {
            this.method155(107, 28, 12);
        }
        int var7 = this.field1711 * arg0 >> 12;
        class193.method1291(this.field1437, var5, var7, this.field1436, (byte) 69, var6, var4);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z", line = 24)
    public static final boolean method618(int arg0) {
        field1719++;
        if (arg0 != -5952) {
            method618(-66);
        }
        if (class289.field4949) {
            try {
                class140.field2395.method843(true, class288.field4925.field4677);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZI)V", line = 49)
    public final void method154(int arg0, boolean arg1, int arg2) {
        int var4 = this.field1722 * arg2 >> 12;
        field1723++;
        int var5 = this.field1725 * arg2 >> 12;
        if (arg1) {
            field1728 = (class128) null;
        }
        int var6 = this.field1711 * arg0 >> 12;
        int var7 = this.field1724 * arg0 >> 12;
        class194.method1301(var6, this.field1436, this.field1435, (byte) -95, this.field1437, var4, var7, var5);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 74)
    public static final void method619(int arg0) {
        if (arg0 != 46) {
            field1728 = (class128) null;
        }
        class246.field4195.method1832((byte) 68);
        class264.field4573.method1832((byte) 114);
        field1716++;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IB)I", line = 88)
    public static final int method620(int arg0, byte arg1) {
        field1720++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg1 == -68) {
            return arg0 == 156 ? 140 : arg0;
        } else {
            return 93;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IS)Z", line = 108)
    public static final boolean method621(int arg0, short arg1) {
        if (arg0 != 4089) {
            return true;
        }
        field1726++;
        if (arg1 == 30 || arg1 == 49 || arg1 == 57 || arg1 == 35 || arg1 == 32 || arg1 == 31 || arg1 == 6 || arg1 == 24) {
            return true;
        } else if (arg1 == 34 || arg1 == 45 || arg1 == 1005 || arg1 == 1006) {
            return true;
        } else if (arg1 == 12 || arg1 == 50 || arg1 == 28 || arg1 == 8 || arg1 == 38) {
            return true;
        } else {
            return arg1 == 39 || arg1 == 21 || arg1 == 47 || arg1 == 46 || arg1 == 5 || arg1 == 25;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V", line = 137)
    public final void method155(int arg0, int arg1, int arg2) {
        int var4 = this.field1725 * arg1 >> 12;
        field1714++;
        if (arg2 != -231) {
            method621(48, (short) 110);
        }
        int var5 = this.field1722 * arg1 >> 12;
        int var6 = this.field1724 * arg0 >> 12;
        int var7 = this.field1711 * arg0 >> 12;
        class57.method378(var4, var5, (byte) 106, this.field1435, var7, var6);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIIII)V", line = 155)
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1722 = arg2;
        this.field1725 = arg0;
        this.field1711 = arg3;
        this.field1724 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 175)
    public static void method622(byte arg0) {
        field1727 = null;
        if (arg0 == -119) {
            field1721 = null;
            field1718 = null;
            field1713 = null;
            field1728 = null;
        }
    }
}
