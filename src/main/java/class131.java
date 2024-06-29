import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class131 {

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Ltq;")
    private class536 field1747 = new class536(64);

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Ltq;")
    public class536 field1751 = new class536(50);

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Ltq;")
    public class536 field1752 = new class536(5);

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Z")
    public boolean field1742;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lega;")
    public class473 field1740;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Lwm;")
    private class30 field1748;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lwm;")
    public class30 field1744;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1737 = 1338;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)Lgj;", line = 3)
    public final class240 method765(byte arg0, int arg1) {
        field1738++;
        class536 var3 = this.field1747;
        class240 var4;
        synchronized (this.field1747) {
            var4 = (class240) this.field1747.method2931((long) arg1, (byte) -110);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field1748;
        byte[] var6;
        synchronized (this.field1748) {
            var6 = this.field1748.method139(class720.method3863(arg0 ^ 0x4D, arg1), (byte) -94, class43.method260(arg1, 103));
        }
        class240 var7 = new class240();
        var7.field3256 = arg1;
        if (arg0 != -53) {
            this.method769(97);
        }
        var7.field3284 = this;
        if (var6 != null) {
            var7.method1577(-1, new class234(var6));
        }
        var7.method1582(false);
        class536 var8 = this.field1747;
        synchronized (this.field1747) {
            this.field1747.method2918((long) arg1, var7, 106);
            return var7;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 44)
    public final void method766(int arg0, int arg1) {
        class536 var3 = this.field1747;
        synchronized (this.field1747) {
            this.field1747.method2928(true, arg1);
        }
        if (arg0 != -31655) {
            this.method772(-92);
        }
        field1736++;
        class536 var4 = this.field1751;
        synchronized (this.field1751) {
            this.field1751.method2928(true, arg1);
        }
        class536 var5 = this.field1752;
        synchronized (this.field1752) {
            this.field1752.method2928(true, arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V", line = 63)
    public final void method767(int arg0, int arg1) {
        field1743++;
        this.field1753 = arg0;
        class536 var3 = this.field1751;
        synchronized (this.field1751) {
            this.field1751.method2919(0);
        }
        class536 var4 = this.field1752;
        synchronized (this.field1752) {
            this.field1752.method2919(arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 80)
    public final void method768(int arg0) {
        field1750++;
        class536 var2 = this.field1751;
        synchronized (this.field1751) {
            this.field1751.method2919(0);
            if (arg0 <= 103) {
                method771(14, true, 0);
            }
        }
        class536 var3 = this.field1752;
        synchronized (this.field1752) {
            this.field1752.method2919(0);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 100)
    public final void method769(int arg0) {
        class536 var2 = this.field1747;
        synchronized (this.field1747) {
            if (arg0 != 50) {
                field1741 = -68;
            }
            this.field1747.method2919(0);
        }
        field1746++;
        class536 var3 = this.field1751;
        synchronized (this.field1751) {
            this.field1751.method2919(0);
        }
        class536 var4 = this.field1752;
        synchronized (this.field1752) {
            this.field1752.method2919(0);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V", line = 120)
    public final void method770(int arg0, boolean arg1) {
        field1745++;
        if (arg1 != this.field1742 && arg0 == -1) {
            this.field1742 = arg1;
            this.method769(50);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI)Z", line = 137)
    public static final boolean method771(int arg0, boolean arg1, int arg2) {
        field1749++;
        if (arg1) {
            return class325.method1880(arg0, arg2, -2) | (arg0 & 0x40000) != 0 || class92.method554(arg0, (byte) 114, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 153)
    public final void method772(int arg0) {
        field1739++;
        class536 var2 = this.field1747;
        synchronized (this.field1747) {
            this.field1747.method2932((byte) 80);
        }
        class536 var3 = this.field1751;
        synchronized (this.field1751) {
            if (arg0 != 5) {
                this.field1747 = null;
            }
            this.field1751.method2932((byte) 80);
        }
        class536 var4 = this.field1752;
        synchronized (this.field1752) {
            this.field1752.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lega;IZLwm;Lwm;)V", line = 184)
    public class131(class473 arg0, int arg1, boolean arg2, class30 arg3, class30 arg4) {
        this.field1742 = arg2;
        this.field1740 = arg0;
        this.field1748 = arg3;
        this.field1744 = arg4;
        if (this.field1748 != null) {
            int var6 = this.field1748.method143((byte) 106) - 1;
            this.field1748.method138(0, var6);
        }
    }
}
