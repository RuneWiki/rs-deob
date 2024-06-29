import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class548 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lhj;")
    public static class596 field7642 = new class596(93, -2);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    public static int[] field7643;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method3222(int arg0) {
        if (arg0 >= -36) {
            method3224(null, false);
        }
        field7642 = null;
        field7643 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V")
    public static final void method3223(boolean arg0, int arg1) {
        field7644++;
        if (arg0) {
            field7642 = null;
        }
        class714 var2 = class350.method2072((long) arg1, 8, (byte) 125);
        var2.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lrk;Z)V")
    public static final void method3224(class35 arg0, boolean arg1) {
        arg0.field535 = null;
        if (arg1) {
            method3222(-71);
        }
        field7641++;
        int var2 = arg0.field537.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field537[var3].field3137 = false;
        }
        class408[] var4 = class731.field10237;
        synchronized (class731.field10237) {
            if (var2 < class731.field10237.length && class772.field10618[var2] < 200) {
                class731.field10237[var2].method2444(11586, arg0);
                int var10002 = class772.field10618[var2]++;
            }
        }
    }
}
