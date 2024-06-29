import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class171 extends class415 {

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field2737 = 0;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "Llo;")
    public static class306 field2736 = new class306("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "B")
    public byte field2741;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Lia;")
    public class23 field2734;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "Lit;")
    public static class514 field2740;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)[B")
    public final byte[] method88(byte arg0) {
        if (arg0 != 32) {
            method1160(-1);
        }
        ++field2744;
        if (!super.field6303 && this.field2734.field302.length - this.field2741 <= this.field2734.field301) {
            return this.field2734.field302;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
    public static final void method1157(int arg0, boolean arg1) {
        class241.field4156 = arg0;
        ++field2743;
        if (arg1) {
            field2737 = -9;
        }
        class231 var2 = class302.field4836;
        synchronized (class302.field4836) {
            class302.field4836.method1604(4);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1158(String arg0, int arg1) {
        ++field2738;
        int var2 = arg0.length();
        long var3 = (long) arg1;
        for (int var5 = 0; var2 > var5; ++var5) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public static void method1159(int arg0) {
        field2736 = null;
        int var1 = -53 % ((-25 - arg0) / 62);
        field2740 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
    public final int method90(int arg0) {
        ++field2742;
        if (arg0 != 0) {
            method1159(-57);
        }
        return this.field2734 == null ? 0 : this.field2734.field301 * 100 / (this.field2734.field302.length + -this.field2741);
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
    public static final void method1160(int arg0) {
        ++field2739;
        if (arg0 != -19854) {
            method1160(-11);
        }
        class508.field7387 = true;
    }
}
