import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class214 {

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field3549 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lij;")
    public static class50 field3547 = class78.method578(122, "welle:");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Laa;")
    public class16 field3543;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lda;")
    public static class22 field3546;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method1421(int arg0) {
        class235.field3929.method762((byte) 117);
        field3548++;
        if (arg0 != 1) {
            method1422((class93) null, 42);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lrj;I)V")
    public static final void method1422(class93 arg0, int arg1) {
        if (arg1 != -15181) {
            method1422((class93) null, -70);
        }
        class208.method1397(arg0, 14245, 200000);
        field3545++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method1423(byte arg0) {
        field3547 = null;
        field3546 = null;
        if (arg0 != -68) {
            field3546 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 1441) {
            return;
        }
        class99 var5 = (class99) class90.field1716.method443((long) arg3, (byte) -34);
        field3542++;
        if (var5 == null) {
            var5 = new class99();
            class90.field1716.method445(arg1 - 1371, (long) arg3, var5);
        }
        if (var5.field1829.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field1829.length; var8++) {
                var6[var8] = var5.field1829[var8];
                var7[var8] = var5.field1822[var8];
            }
            for (int var9 = var5.field1829.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1822 = var7;
            var5.field1829 = var6;
        }
        var5.field1829[arg0] = arg4;
        var5.field1822[arg0] = arg2;
    }
}
