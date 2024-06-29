import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class331 {

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Z")
    public static boolean field4688 = false;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "[F")
    public static float[] field4691 = new float[4];

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "Lri;")
    public static class73 field4687 = new class73(78, -1);

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field4692 = -1;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lic;")
    public static class491 field4690;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[I")
    public static int[] field4689;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIILub;)V")
    public static final void method2025(int arg0, int arg1, int arg2, int arg3, class18 arg4) {
        class518 var5 = class110.method674(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field201 = (arg1 << class192.field2815) + class143.field2134;
        arg4.field189 = arg3;
        arg4.field199 = (arg2 << class192.field2815) + class143.field2134;
        for (class284 var7 = var5.field7569; var7 != null; var7 = var7.field4087) {
            if (var7.field4083.field1772) {
                int var8 = var7.field4083.method283(16490);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field189 += var6;
            arg4.field190 = true;
        }
        var5.field7563 = arg4;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method2026(int arg0) {
        field4690 = null;
        field4691 = null;
        field4689 = null;
        if (arg0 == 0) {
            field4687 = null;
        }
    }
}
