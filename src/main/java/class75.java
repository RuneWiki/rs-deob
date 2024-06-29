import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
    private static boolean field866 = false;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    private static int field867 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lrk;")
    private static class419 field865 = new class419();

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static final synchronized void method434(boolean arg0) {
        field867--;
        if (!arg0) {
            field866 = true;
        }
        if (field867 == 0) {
            method436(-1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final synchronized void method435(int arg0) {
        if (arg0 == 11309) {
            field867++;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static final synchronized void method436(int arg0) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            class344 var1 = (class344) field865.method2498((byte) 55);
            if (var1 == null) {
                return;
            }
            var1.field5019.method530(true);
            var1.method2997(arg0 + 2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lo;I)V")
    public static final synchronized void method437(class439 arg0, int arg1) {
        if (field866) {
            return;
        }
        if (~field867 >= arg1) {
            arg0.method530(false);
        } else {
            class344 var2 = new class344();
            var2.field5019 = arg0;
            field865.method2492(var2, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method438(int arg0, boolean arg1) {
        field866 = arg1;
        if (arg0 != -21406) {
            field867 = 109;
        }
    }
}
