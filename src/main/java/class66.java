import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class66 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Z")
    public static boolean field993 = false;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lrj;")
    public static class287 field995 = class114.method891(true);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)I", line = 6)
    public static final int method473(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != 23808) {
            field993 = false;
        }
        field994++;
        class272 var4 = (class272) class222.field3829.method311((byte) 114, (long) arg0);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4627.length; var6++) {
            if (var4.field4627[var6] >= 0 && class262.field4404 > var4.field4627[var6]) {
                class37 var7 = class189.method1320(0, var4.field4627[var6]);
                if (var7.field517 != null) {
                    class173 var8 = (class173) var7.field517.method311((byte) 114, (long) arg2);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field4625[var6] * var8.field2796;
                        } else {
                            var5 += var8.field2796;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 56)
    public static void method474(int arg0) {
        field995 = null;
        if (arg0 != 0) {
            method474(64);
        }
    }
}
