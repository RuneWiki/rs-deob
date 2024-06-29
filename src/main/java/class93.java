import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class93 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    private static int field1369 = 0;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Z")
    private static boolean field1370 = false;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lps;")
    private static class63 field1371 = new class63();

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public static final synchronized void method624(boolean arg0) {
        field1369--;
        if (!arg0) {
            method625(-122);
        }
        if (field1369 == 0) {
            method625(0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static final synchronized void method625(int arg0) {
        while (true) {
            class3 var1 = (class3) field1371.method447(arg0 + 8);
            if (var1 == null) {
                if (arg0 != 0) {
                    field1371 = null;
                    return;
                }
                return;
            }
            var1.field19.method304();
            var1.method25(-13489);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lv;I)V")
    public static final synchronized void method626(class415 arg0, int arg1) {
        if (field1370) {
            return;
        }
        if (arg1 >= field1369) {
            arg0.method304();
        } else {
            class3 var2 = new class3();
            var2.field19 = arg0;
            field1371.method453((byte) 126, var2);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method627(int arg0, boolean arg1) {
        field1370 = arg1;
        if (arg0 != 1176) {
            method624(true);
        }
    }
}
