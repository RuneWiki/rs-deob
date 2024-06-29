import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class660 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Llga;")
    private class663 field9180 = new class663(128);

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Llga;")
    public class663 field9186 = new class663(64);

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lsea;")
    private class648 field9179;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lsea;")
    public class648 field9175;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lmw;")
    public static class455 field9184 = new class455(7500);

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
    public static int[] field9176;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 7)
    public final void method3704(int arg0) {
        field9178++;
        class663 var2 = this.field9180;
        synchronized (this.field9180) {
            int var3 = -99 / ((arg0 + 8) / 44);
            this.field9180.method3749(7648);
        }
        class663 var4 = this.field9186;
        synchronized (this.field9186) {
            this.field9186.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 23)
    public final void method3705(int arg0) {
        if (arg0 != 4) {
            this.method3707((byte) -7, 53, -111);
        }
        class663 var2 = this.field9180;
        synchronized (this.field9180) {
            this.field9180.method3755(19713);
        }
        field9177++;
        class663 var3 = this.field9186;
        synchronized (this.field9186) {
            this.field9186.method3755(19713);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 42)
    public static final void method3706(boolean arg0, String arg1, int arg2) {
        field9185++;
        if (arg1 == null) {
            return;
        }
        if (class165.field2390 >= 100) {
            class114.method819((byte) -71, 4, class65.field827.method555(class697.field9900, true));
            return;
        }
        String var3 = class430.method2473(15570, arg1);
        if (var3 == null) {
            return;
        }
        if (arg2 < 1) {
            field9176 = null;
        }
        for (int var4 = 0; var4 < class165.field2390; var4++) {
            String var9 = class430.method2473(15570, class356.field4722[var4]);
            if (var9 != null && var9.equals(var3)) {
                class114.method819((byte) -77, 4, arg1 + class65.field828.method555(class697.field9900, true));
                return;
            }
            if (class238.field3258[var4] != null) {
                String var10 = class430.method2473(15570, class238.field3258[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class114.method819((byte) -98, 4, arg1 + class65.field828.method555(class697.field9900, true));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class671.field9419; var5++) {
            String var7 = class430.method2473(15570, class696.field9891[var5]);
            if (var7 != null && var7.equals(var3)) {
                class114.method819((byte) -58, 4, class65.field833.method555(class697.field9900, true) + arg1 + class65.field834.method555(class697.field9900, true));
                return;
            }
            if (class287.field3952[var5] != null) {
                String var8 = class430.method2473(15570, class287.field3952[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class114.method819((byte) -65, 4, class65.field833.method555(class697.field9900, true) + arg1 + class65.field834.method555(class697.field9900, true));
                    return;
                }
            }
        }
        if (class430.method2473(15570, class143.field2063.field9693).equals(var3)) {
            class114.method819((byte) -84, 4, class65.field830.method555(class697.field9900, true));
            return;
        }
        class419.field5913++;
        class352 var6 = class290.method1786(98, class199.field2836, class378.field5048);
        var6.field4686.method2817(class705.method3947((byte) -47, arg1) + 1, true);
        var6.field4686.method2820(-95, arg1);
        var6.field4686.method2817(arg0 ? 1 : 0, true);
        class602.method3388(var6, (byte) 28);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)V", line = 140)
    public final void method3707(byte arg0, int arg1, int arg2) {
        if (arg0 >= -14) {
            method3706(false, null, -79);
        }
        field9183++;
        this.field9180 = new class663(arg2);
        this.field9186 = new class663(arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 156)
    public final void method3708(int arg0, int arg1) {
        class663 var3 = this.field9180;
        synchronized (this.field9180) {
            if (arg0 >= -113) {
                return;
            }
            this.field9180.method3754(arg1, true);
        }
        field9182++;
        class663 var4 = this.field9186;
        synchronized (this.field9186) {
            this.field9186.method3754(arg1, true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lvda;", line = 172)
    public final class165 method3709(byte arg0, int arg1) {
        field9181++;
        class663 var3 = this.field9180;
        class165 var4;
        synchronized (this.field9180) {
            var4 = (class165) this.field9180.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field9179;
        byte[] var6;
        synchronized (this.field9179) {
            var6 = this.field9179.method3654(-15615, 36, arg1);
        }
        class165 var7 = new class165();
        var7.field2400 = arg1;
        var7.field2378 = this;
        if (var6 != null) {
            var7.method1162(new class501(var6), (byte) 79);
        }
        var7.method1160(0);
        class663 var8 = this.field9180;
        synchronized (this.field9180) {
            this.field9180.method3748((long) arg1, var7, 12537);
            if (arg0 < 40) {
                field9184 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 207)
    public static void method3710(int arg0) {
        field9184 = null;
        if (arg0 != 6518) {
            field9184 = null;
        }
        field9176 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lci;ILsea;Lsea;)V", line = 230)
    public class660(class414 arg0, int arg1, class648 arg2, class648 arg3) {
        this.field9179 = arg2;
        this.field9175 = arg3;
        this.field9179.method3653(36, true);
    }
}
