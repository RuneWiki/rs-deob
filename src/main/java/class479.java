import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class479 {

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lwf;")
    private class117 field6814 = new class117(256);

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Ln;")
    private class17 field6810;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lcb;")
    private class444 field6805;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "[S")
    public static short[] field6809 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field6804 = 500;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static void method2882(int arg0) {
        if (arg0 == 1) {
            field6809 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)I")
    public static final int method2883(int arg0) {
        field6811++;
        int var1 = 57 % ((40 - arg0) / 39);
        class117 var2 = class236.field3411;
        synchronized (class236.field3411) {
            return class236.field3411.method838(true);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public final void method2884(int arg0) {
        field6812++;
        this.field6814.method834(5, arg0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([SI)[S")
    public static final short[] method2885(short[] arg0, int arg1) {
        field6808++;
        if (arg0 == null) {
            return null;
        } else if (arg1 < 26) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class648.method3733(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static final void method2886(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (class599.field8841 == 1 || class599.field8841 == 3 || class599.field8841 != class448.field6280 && (class599.field8841 == 0 || class448.field6280 == 0)) {
            class527.field7717 = 0;
            class599.field8840 = 0;
            class510.field7260.method2800(0);
        }
        field6807++;
        class448.field6280 = class599.field8841;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Ljb;")
    public final class422 method2887(byte arg0, int arg1) {
        field6806++;
        Object var3 = this.field6814.method842(0, (long) arg1);
        if (var3 != null) {
            return (class422) var3;
        } else if (this.field6810.method109(arg1, 1680)) {
            class471 var4 = this.field6810.method110(arg1, (byte) 101);
            int var5 = var4.field6651 ? 64 : this.field6805.field6189;
            class422 var7;
            if (var4.field6644 && this.field6805.method423()) {
                float[] var6 = this.field6810.method108(arg1, 0.7F, var5, false, false, var5);
                var7 = this.field6805.method2685(126, var5, class488.field6956, var6, var5, var4.field6647 != 0);
            } else {
                int[] var8 = var4.field6645 ? this.field6810.method111(var5, false, var5, 6925, arg1, 0.7F) : this.field6810.method113(var5, true, -4074, var5, 0.7F, arg1);
                var7 = this.field6805.method2631(var5, var8, var4.field6647 != 0, false, var5);
            }
            var7.method1648(var4.field6655, var4.field6654, true);
            this.field6814.method835((byte) 122, (long) arg1, var7);
            if (arg0 > -91) {
                this.field6810 = null;
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lcb;Ln;)V")
    public class479(class444 arg0, class17 arg1) {
        this.field6810 = arg1;
        this.field6805 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public final void method2888(byte arg0) {
        if (arg0 == -106) {
            this.field6814.method837(arg0 ^ 0xFFFFFFE9);
            field6813++;
        }
    }
}
