import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class143 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    public boolean field1691 = false;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lgg;")
    private class114 field1702 = new class114(64);

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lgg;")
    public class114 field1705 = new class114(500);

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lgg;")
    public class114 field1707 = new class114(30);

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lgg;")
    public class114 field1708 = new class114(50);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lkha;")
    private class687 field1695;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
    public boolean field1693;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lkha;")
    public class687 field1703;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field1700 = -1;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Ltha;")
    public static class486 field1692;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method880(int arg0, boolean arg1) {
        field1696++;
        if (this.field1693 == arg1) {
            return;
        }
        if (arg0 != 0) {
            this.field1693 = false;
        }
        this.field1693 = arg1;
        this.method887(1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lha;II)Lac;", line = 19)
    public static final class712 method881(class454 arg0, int arg1, int arg2) {
        field1690++;
        if (arg1 != -1) {
            method884((byte) -56);
        }
        class303 var3 = (class303) class274.field3460.method3248((long) arg2, 0);
        if (var3 != null) {
            class563 var4 = var3.field3898.method1822(7531);
            var3.field3894 = true;
            if (var4 != null) {
                return var4.method3174(arg0, (byte) -113);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 46)
    public final void method882(int arg0) {
        class114 var2 = this.field1702;
        synchronized (this.field1702) {
            this.field1702.method781((byte) 47);
        }
        if (arg0 != 0) {
            return;
        }
        field1694++;
        class114 var3 = this.field1705;
        synchronized (this.field1705) {
            this.field1705.method781((byte) 47);
        }
        class114 var4 = this.field1707;
        synchronized (this.field1707) {
            this.field1707.method781((byte) 47);
        }
        class114 var5 = this.field1708;
        synchronized (this.field1708) {
            this.field1708.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V", line = 68)
    public static final void method883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1699++;
        class328.field4190 = arg2;
        class592.field8242 = arg1;
        class112.field1386 = arg0;
        class108.field1334 = arg4;
        if (arg3 != 50) {
            field1700 = 52;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 82)
    public static void method884(byte arg0) {
        field1692 = null;
        if (arg0 != 20) {
            method883(-27, 37, -9, 102, 2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V", line = 93)
    public final void method885(int arg0, byte arg1) {
        int var3 = -106 % ((arg1 - 9) / 44);
        this.field1702 = new class114(arg0);
        field1698++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)V", line = 105)
    public final void method886(boolean arg0, int arg1) {
        field1701++;
        if (arg0 != this.field1691) {
            this.field1691 = arg0;
            if (arg1 == -1) {
                this.method887(arg1 + 2);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 122)
    public final void method887(int arg0) {
        field1706++;
        class114 var2 = this.field1702;
        synchronized (this.field1702) {
            this.field1702.method776((byte) -70);
        }
        class114 var3 = this.field1705;
        synchronized (this.field1705) {
            if (arg0 != 1) {
                return;
            }
            this.field1705.method776((byte) 51);
        }
        class114 var4 = this.field1707;
        synchronized (this.field1707) {
            this.field1707.method776((byte) -77);
        }
        class114 var5 = this.field1708;
        synchronized (this.field1708) {
            this.field1708.method776((byte) 64);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ldh;IZLkha;Lkha;)V", line = 269)
    public class143(class286 arg0, int arg1, boolean arg2, class687 arg3, class687 arg4) {
        this.field1695 = arg3;
        this.field1693 = arg2;
        this.field1703 = arg4;
        if (this.field1695 != null) {
            int var6 = this.field1695.method3816(-125) - 1;
            this.field1695.method3812(0, var6);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 153)
    public final void method888(int arg0, int arg1) {
        field1704++;
        class114 var3 = this.field1702;
        synchronized (this.field1702) {
            this.field1702.method775(1, arg1);
        }
        class114 var4 = this.field1705;
        synchronized (this.field1705) {
            this.field1705.method775(1, arg1);
        }
        class114 var5 = this.field1707;
        synchronized (this.field1707) {
            this.field1707.method775(1, arg1);
        }
        if (arg0 != 30) {
            this.method890(44, true);
        }
        class114 var6 = this.field1708;
        synchronized (this.field1708) {
            this.field1708.method775(arg0 - 29, arg1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V", line = 177)
    public final void method889(int arg0, int arg1) {
        if (arg0 <= 123) {
            this.field1702 = null;
        }
        field1697++;
        this.field1709 = arg1;
        class114 var3 = this.field1705;
        synchronized (this.field1705) {
            this.field1705.method776((byte) 103);
        }
        class114 var4 = this.field1707;
        synchronized (this.field1707) {
            this.field1707.method776((byte) 117);
        }
        class114 var5 = this.field1708;
        synchronized (this.field1708) {
            this.field1708.method776((byte) -48);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZ)Lqg;", line = 201)
    public final class290 method890(int arg0, boolean arg1) {
        field1689++;
        if (arg1) {
            this.method886(false, 3);
        }
        class114 var3 = this.field1702;
        class290 var4;
        synchronized (this.field1702) {
            var4 = (class290) this.field1702.method778((long) arg0, -53);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field1695;
        byte[] var6;
        synchronized (this.field1695) {
            var6 = this.field1695.method3810(class746.method4172(466793768, arg0), -23360, class604.method3320(arg0, 22348));
        }
        class290 var7 = new class290();
        var7.field3771 = arg0;
        var7.field3765 = this;
        if (var6 != null) {
            var7.method1735(1, new class179(var6));
        }
        var7.method1744(29639);
        if (!this.field1693 && var7.field3710) {
            var7.field3734 = null;
            var7.field3722 = null;
        }
        if (var7.field3723) {
            var7.field3776 = 0;
            var7.field3701 = false;
        }
        class114 var8 = this.field1702;
        synchronized (this.field1702) {
            this.field1702.method774((long) arg0, -38, var7);
            return var7;
        }
    }
}
