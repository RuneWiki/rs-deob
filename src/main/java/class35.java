import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class35 {

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Ltg;")
    private class295 field536 = new class295();

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Lbo;")
    private class355 field540 = new class355();

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Laj;")
    private class71 field541;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field537 = -1;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[I")
    public static int[] field534 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static void method356(byte arg0) {
        field534 = null;
        if (arg0 <= 103) {
            method358((class304) null, (Frame) null, -124);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public final void method357(int arg0) {
        this.field540.method2238(5);
        field538++;
        if (arg0 != 30371) {
            this.method360(true, (class295) null, -69L);
        }
        this.field541.method607(arg0 - 30371);
        this.field536 = new class295();
        this.field543 = this.field542;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lbd;Ljava/awt/Frame;I)V")
    public static final void method358(class304 arg0, Frame arg1, int arg2) {
        while (true) {
            class242 var3 = arg0.method1951(arg1, arg2);
            while (var3.field3345 == 0) {
                class229.method1541(89, 10L);
            }
            if (var3.field3345 == 1) {
                field532++;
                arg1.setVisible(false);
                arg1.dispose();
                if (arg2 != 0) {
                    field534 = null;
                    return;
                }
                return;
            }
            class229.method1541(104, 100L);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([BB)Z")
    public static final boolean method359(byte[] arg0, byte arg1) {
        if (arg1 > -13) {
            field534 = null;
        }
        field539++;
        class289 var2 = new class289(arg0);
        int var3 = var2.method1861((byte) -72);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1861((byte) -72) == 1;
        if (var4) {
            class73.method627(28586, var2);
        }
        class63.method562((byte) 10, var2);
        return true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLtg;J)V")
    public final void method360(boolean arg0, class295 arg1, long arg2) {
        if (arg0) {
            this.field540 = null;
        }
        field535++;
        if (this.field543 == 0) {
            class295 var5 = this.field540.method2243(0);
            var5.method2367(5);
            var5.method1902(32);
            if (this.field536 == var5) {
                class295 var6 = this.field540.method2243(0);
                var6.method2367(5);
                var6.method1902(32);
            }
        } else {
            this.field543--;
        }
        this.field541.method612(arg2, -1, arg1);
        this.field540.method2244(11310, arg1);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(JB)Ltg;")
    public final class295 method361(long arg0, byte arg1) {
        int var4 = 124 / ((-arg1 - 4) / 50);
        field531++;
        class295 var5 = (class295) this.field541.method614(-113, arg0);
        if (var5 != null) {
            this.field540.method2244(11310, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V")
    public class35(int arg0) {
        this.field543 = arg0;
        this.field542 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field541 = new class71(var2);
    }
}
