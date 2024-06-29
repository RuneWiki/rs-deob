import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class207 {

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lhb;")
    private class28 field3731 = new class28();

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lhh;")
    private class177 field3742 = new class177();

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    private int field3739;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lak;")
    private class269 field3741;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lgk;")
    public static class6 field3722 = null;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lvf;")
    public static class265 field3727 = class87.method582(-46, "brillant3:");

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lvf;")
    public static class265 field3728 = class87.method582(-46, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lvf;")
    public static class265 field3734 = class87.method582(-46, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lnd;")
    public static class272 field3730 = new class272(5000);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
    public static int[] field3737;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[[[I")
    public static int[][][] field3721;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method1416(int arg0) {
        field3724++;
        this.field3742.method1155((byte) -103);
        if (arg0 != -2136869688) {
            method1417((byte) -62);
        }
        this.field3741.method1844((byte) -112);
        this.field3731 = new class28();
        this.field3739 = this.field3740;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
    public static final int method1417(byte arg0) {
        int var1 = -124 / ((-arg0 - 23) / 40);
        field3738++;
        return ((class105.field1868 == 0 ? 0 : 1) << 21) + ((class43.field959 == 0 ? 0 : 1) << 20) + (class107.field1895 & 0x3 << 11) + ((class196.field3505 ? 1 : 0) << 9) + ((class19.field498 ? 1 : 0) << 6) + ((class68.field1304 ? 1 : 0) << 3) + (class124.field2227 & 0x7) + ((class117.field2077 ? 1 : 0) << 4) + ((client.field3855 ? 1 : 0) << 5) + ((class61.field1219 ? 1 : 0) << 7) + ((class70.field1360 ? 1 : 0) << 8) + ((class214.field3830 ? 1 : 0) << 10) + ((class258.field4428 ? 1 : 0) << 13) + ((class23.field688 ? 1 : 0) << 15) + (((class245.field4270 ? 1 : 0) << 16) - -((class127.field2273 ? 1 : 0) << 19) - -((class172.field3095 == 0 ? 0 : 1) << 22) - -(class255.method1677() << 23));
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Lkh;")
    public final class12 method1418(byte arg0) {
        field3732++;
        if (arg0 > -46) {
            this.field3741 = null;
        }
        return this.field3741.method1851(false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJLhb;)V")
    public final void method1419(int arg0, long arg1, class28 arg2) {
        if (this.field3739 == arg0) {
            class28 var5 = this.field3742.method1147(false);
            var5.method97(158);
            var5.method238((byte) 35);
            if (this.field3731 == var5) {
                class28 var6 = this.field3742.method1147(false);
                var6.method97(158);
                var6.method238((byte) 107);
            }
        } else {
            this.field3739--;
        }
        field3736++;
        this.field3741.method1838(arg1, arg2, (byte) 8);
        this.field3742.method1154(arg2, arg0 ^ 0xFFFF8397);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1420(Component arg0, int arg1) {
        field3725++;
        arg0.addMouseListener(class232.field4089);
        arg0.addMouseMotionListener(class232.field4089);
        if (arg1 != 25691) {
            method1423(80, -119);
        }
        arg0.addFocusListener(class232.field4089);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLng;)Lsj;")
    public static final class45 method1421(byte arg0, class135 arg1) {
        field3733++;
        if (arg0 != 21) {
            method1421((byte) 35, (class135) null);
        }
        return new class45(arg1.method894(-109), arg1.method894(-119), arg1.method894(-120), arg1.method894(-99), arg1.method909(-917770352), arg1.method909(arg0 - 917770373), arg1.method920((byte) 45));
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Lkh;")
    public final class12 method1422(int arg0) {
        if (arg0 >= -41) {
            return null;
        } else {
            field3735++;
            return this.field3741.method1847(false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
    public static final int method1423(int arg0, int arg1) {
        field3723++;
        if (arg1 <= 109) {
            field3721 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(JB)Lhb;")
    public final class28 method1424(long arg0, byte arg1) {
        field3726++;
        if (arg1 != 98) {
            this.method1424(94L, (byte) 62);
        }
        class28 var4 = (class28) this.field3741.method1842(-1, arg0);
        if (var4 != null) {
            this.field3742.method1154(var4, -31849);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public static void method1425(int arg0) {
        field3730 = null;
        field3722 = null;
        field3734 = null;
        if (arg0 != -241816892) {
            field3734 = null;
        }
        field3727 = null;
        field3721 = null;
        field3737 = null;
        field3728 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
    public class207(int arg0) {
        this.field3739 = arg0;
        this.field3740 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3741 = new class269(var2);
    }
}
