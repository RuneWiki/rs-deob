import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class177 extends class381 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lu;")
    public class53 field2476;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lba;")
    public static class108 field2474;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lf;")
    public static class256 field2473;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lqi;")
    public static class621 field2477;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method1206(byte arg0) {
        field2472++;
        class568 var1 = null;
        try {
            var1 = class226.method1409("2", arg0 ^ 0xFFFFFF91);
            class540 var2 = new class540((class401.field6041 * 6) + 3);
            var2.method3110(1, 56);
            var2.method3162(arg0 - 2003712584, class401.field6041);
            for (int var3 = 0; var3 < class653.field9351.length; var3++) {
                if (class338.field4914[var3]) {
                    var2.method3162(-2003712696, var3);
                    var2.method3146(class653.field9351[var3], -62);
                }
            }
            var1.method3273(0, var2.field7956, var2.field7952, true);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3271((byte) -94);
            }
        } catch (Exception var4) {
        }
        class624.field9017 = class60.method371(false);
        if (arg0 == -112) {
            class347.field5135 = false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field2473 = null;
        field2477 = null;
        if (arg0 != -29208) {
            field2477 = null;
        }
        field2474 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILmv;I)Lak;")
    public static final class677 method1208(int arg0, int arg1, class295 arg2, int arg3) {
        field2471++;
        byte[] var4 = arg2.method1844(arg1, 31330, arg3);
        if (arg0 != -29831) {
            field2474 = null;
        }
        return var4 == null ? null : new class677(var4);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lu;)V")
    public class177(class53 arg0) {
        this.field2476 = arg0;
    }
}
