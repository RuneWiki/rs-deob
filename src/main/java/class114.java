import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class114 {

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Lna;")
    private class279 field1761;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "Luc;")
    private class228 field1760;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lpj;")
    private class99 field1753;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lug;")
    private class25 field1749;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Lie;")
    public static class330 field1754;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "[Lon;")
    private class148[] field1759;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 6)
    public static void method980(int arg0) {
        if (arg0 > -71) {
            method980(-69);
        }
        field1754 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIZII)V", line = 18)
    public static final void method981(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1762++;
        if (arg2 == arg7) {
            class222.method1671((byte) -123, arg1, arg6, arg4, arg0, arg3, arg2);
            return;
        }
        if (arg5) {
            field1754 = (class330) null;
        }
        if ((arg1 - arg2) >= class43.field693 && class128.field2130 >= (arg1 + arg2) && class328.field5042 <= arg4 - arg7 && (arg4 + arg7) <= class284.field4385) {
            class168.method1335(arg4, arg2, arg1, arg7, arg0, arg3, arg6, (byte) 32);
        } else {
            class67.method663(arg7, arg6, arg1, true, arg3, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZZIZI)Lrn;", line = 49)
    public static final class18 method982(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != 1000000) {
            return (class18) null;
        }
        field1756++;
        class153 var5 = null;
        if (class167.field2651 != null) {
            var5 = new class153(arg2, class167.field2651, class309.field4777[arg2], 1000000);
        }
        class90.field1280[arg2] = class191.field3010.method985((byte) 11, var5, arg2, class165.field2627);
        if (arg0) {
            class90.field1280[arg2].method1232(0);
        }
        return new class18(class90.field1280[arg2], arg1, arg3);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZLth;Lth;)Lon;", line = 71)
    private final class148 method983(int arg0, int arg1, boolean arg2, class153 arg3, class153 arg4) {
        field1763++;
        if (this.field1749 == null) {
            throw new RuntimeException();
        }
        this.field1749.field397 = arg0 * 8 + 5;
        if (this.field1749.field448.length <= this.field1749.field397) {
            throw new RuntimeException();
        } else if (this.field1759[arg0] == null) {
            int var6 = this.field1749.method262((byte) 23);
            if (arg1 > -17) {
                this.field1753 = (class99) null;
            }
            int var7 = this.field1749.method262((byte) 115);
            class148 var8 = new class148(arg0, arg4, arg3, this.field1760, this.field1761, var6, var7, arg2);
            this.field1759[arg0] = var8;
            return var8;
        } else {
            return this.field1759[arg0];
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V", line = 114)
    public static final void method984(boolean arg0) {
        if (!arg0) {
            class211.method1562(0, 0, -75);
            field1752++;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLth;ILth;)Lon;", line = 129)
    private final class148 method985(byte arg0, class153 arg1, int arg2, class153 arg3) {
        field1750++;
        if (arg0 != 11) {
            this.field1753 = (class99) null;
        }
        return this.method983(arg2, -33, true, arg3, arg1);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z", line = 143)
    public final boolean method986(byte arg0) {
        field1748++;
        if (this.field1749 != null) {
            return true;
        }
        if (this.field1753 == null) {
            if (this.field1760.method1706(100)) {
                return false;
            }
            this.field1753 = this.field1760.method1721(true, 255, 255, (byte) 0, arg0 ^ 0xFFFF910E);
        }
        if (this.field1753.field4435) {
            return false;
        }
        this.field1749 = new class25(this.field1753.method871((byte) -97));
        if (arg0 != -39) {
            field1754 = (class330) null;
        }
        this.field1759 = new class148[(this.field1749.field448.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 172)
    public final void method987(int arg0) {
        field1755++;
        if (this.field1759 == null) {
            return;
        }
        if (arg0 != 5883) {
            field1754 = (class330) null;
        }
        for (int var2 = 0; var2 < this.field1759.length; var2++) {
            if (this.field1759[var2] != null) {
                this.field1759[var2].method1235((byte) 99);
            }
        }
        for (int var3 = 0; var3 < this.field1759.length; var3++) {
            if (this.field1759[var3] != null) {
                this.field1759[var3].method1227(arg0 - 5884);
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Luc;Lna;)V", line = 206)
    public class114(class228 arg0, class279 arg1) {
        this.field1761 = arg1;
        this.field1760 = arg0;
        if (!this.field1760.method1706(109)) {
            this.field1753 = this.field1760.method1721(true, 255, 255, (byte) 0, 28375);
        }
    }
}
