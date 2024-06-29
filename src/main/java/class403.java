import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class403 {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljk;")
    private class449 field5740 = new class449(64);

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public int field5742 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lqn;")
    private class47 field5733;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public int field5736;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public static int[] field5735 = new int[1024];

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lw;", line = 6)
    public final class196 method2381(int arg0, int arg1) {
        field5739++;
        class449 var3 = this.field5740;
        class196 var4;
        synchronized (this.field5740) {
            var4 = (class196) this.field5740.method2647(-106, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field5733;
        byte[] var6;
        synchronized (this.field5733) {
            var6 = this.field5733.method481(arg0, arg1, -82);
        }
        class196 var7 = new class196();
        var7.field2542 = this;
        var7.field2539 = arg1;
        if (var6 != null) {
            var7.method1215(new class463(var6), -1);
        }
        var7.method1213((byte) -73);
        class449 var8 = this.field5740;
        synchronized (this.field5740) {
            this.field5740.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 41)
    public final void method2382(byte arg0) {
        if (arg0 < 103) {
            this.method2387(0, -53);
        }
        class449 var2 = this.field5740;
        synchronized (this.field5740) {
            this.field5740.method2642(0);
        }
        field5741++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 57)
    public final void method2383(boolean arg0) {
        field5738++;
        class449 var2 = this.field5740;
        synchronized (this.field5740) {
            if (!arg0) {
                method2386(null, (byte) 69);
            }
            this.field5740.method2640(103);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)Z", line = 70)
    public static final boolean method2384(int arg0, int arg1, int arg2, int arg3) {
        if (class452.method2698(arg0, arg1, arg2)) {
            int var4 = arg1 << class94.field1144;
            int var5 = arg2 << class94.field1144;
            return class145.method973(var4 + 1, class520.field7520[arg0].method399(arg1, arg2) + arg3, var5 + 1) && class145.method973(class376.field4951 + var4 - 1, class520.field7520[arg0].method399(arg1 + 1, arg2) + arg3, var5 + 1) && class145.method973(class376.field4951 + var4 - 1, class520.field7520[arg0].method399(arg1 + 1, arg2 + 1) + arg3, class376.field4951 + var5 - 1) && class145.method973(var4 + 1, class520.field7520[arg0].method399(arg1, arg2 + 1) + arg3, class376.field4951 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 83)
    public static void method2385(int arg0) {
        field5735 = null;
        if (arg0 != -5597) {
            method2386(null, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lhd;B)Ljava/lang/String;", line = 95)
    public static final String method2386(class523 arg0, byte arg1) {
        field5734++;
        if (client.method1226(arg0).method644((byte) 51) == 0) {
            return null;
        } else if (arg0.field7570 == null || arg0.field7570.trim().length() == 0) {
            return class191.field2480 ? "Hidden-use" : null;
        } else {
            if (arg1 != 84) {
                field5735 = null;
            }
            return arg0.field7570;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V", line = 117)
    public final void method2387(int arg0, int arg1) {
        if (arg0 > -17) {
            return;
        }
        field5737++;
        class449 var3 = this.field5740;
        synchronized (this.field5740) {
            this.field5740.method2648(false, arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 137)
    public class403(class165 arg0, int arg1, class47 arg2) {
        this.field5733 = arg2;
        this.field5736 = this.field5733.method469(30322, 4);
    }
}
