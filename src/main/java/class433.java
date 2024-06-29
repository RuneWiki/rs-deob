import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class433 implements class171 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Lwu;")
    private class557 field5942;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "[I")
    public static int[] field5947 = new int[1];

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Lcj;")
    public static class443 field5944;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "Lega;")
    public static class452 field5948;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lvm;")
    public final class75 method130(int arg0) {
        if (arg0 != 29067) {
            field5944 = null;
        }
        field5943++;
        return class75.field1030;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
    public final int method126(int arg0) {
        field5946++;
        if (arg0 != 23022) {
            this.method130(68);
        }
        return this.field5942.method3320((byte) 124) ? 100 : this.field5942.method3315(0);
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
    public static void method2611(int arg0) {
        field5944 = null;
        field5948 = null;
        if (arg0 == -4) {
            field5947 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lwu;)V")
    public class433(class557 arg0) {
        this.field5942 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILpaa;I)V")
    public static final void method2612(int arg0, int arg1, class712 arg2, int arg3) {
        field5945++;
        class571 var4 = arg2.method3996(122, class96.field1401);
        if (var4 == null) {
            return;
        }
        class96.field1401.method2097(arg1, arg3, arg2.field9966 + arg1, arg2.field10011 + arg3);
        if (arg0 < 33) {
            method2611(12);
        }
        if (class486.field6561 >= 3) {
            class96.field1401.method2093(-16777216, var4, arg1, arg3);
        } else {
            class101.field1452.method114((float) arg2.field9966 / 2.0F + (float) arg1, (float) arg2.field10011 / 2.0F + (float) arg3, 4096, (int) (-class403.field5597) & 0x3FFF << 2, var4, arg1, arg3);
        }
    }
}
