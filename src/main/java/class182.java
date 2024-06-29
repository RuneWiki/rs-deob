import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class182 {

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Llga;")
    private class663 field2628 = new class663(256);

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "Lsea;")
    private class648 field2627;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "[[I")
    public static int[][] field2634 = new int[128][128];

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lem;")
    public static class206 field2629 = new class206(20, 2);

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)Lqaa;")
    public final class26 method1250(int arg0, int arg1) {
        field2633++;
        class663 var3 = this.field2628;
        class26 var4;
        synchronized (this.field2628) {
            var4 = (class26) this.field2628.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 > -75) {
            this.method1250(127, 92);
        }
        class648 var5 = this.field2627;
        byte[] var6;
        synchronized (this.field2627) {
            var6 = this.field2627.method3654(-15615, 26, arg0);
        }
        class26 var7 = new class26();
        if (var6 != null) {
            var7.method250((byte) -51, new class501(var6));
        }
        class663 var8 = this.field2628;
        synchronized (this.field2628) {
            this.field2628.method3748((long) arg0, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public final void method1251(int arg0) {
        field2635++;
        if (arg0 == -2) {
            class663 var2 = this.field2628;
            synchronized (this.field2628) {
                this.field2628.method3749(7648);
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
    public final void method1252(byte arg0) {
        field2636++;
        int var2 = 88 % ((arg0 - 79) / 44);
        class663 var3 = this.field2628;
        synchronized (this.field2628) {
            this.field2628.method3755(19713);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IB)V")
    public final void method1253(int arg0, byte arg1) {
        class663 var3 = this.field2628;
        synchronized (this.field2628) {
            this.field2628.method3754(arg0, true);
        }
        field2632++;
        if (arg1 != -87) {
            this.method1253(117, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)Z")
    public static final boolean method1254(int arg0, int arg1) {
        field2631++;
        if (arg1 != -20103) {
            method1254(9, -33);
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class182(class414 arg0, int arg1, class648 arg2) {
        this.field2627 = arg2;
        this.field2627.method3653(26, true);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)V")
    public static void method1255(boolean arg0) {
        field2634 = null;
        field2629 = null;
        if (!arg0) {
            field2637 = 126;
        }
    }
}
