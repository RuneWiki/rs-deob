import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class321 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field5489 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field5492 = 0;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lce;")
    public static class126 field5494 = class206.method1445(-7923, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lce;")
    public static class126 field5493 = class206.method1445(-7923, ":assistreq:");

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lcc;")
    public static class313 field5495;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)[Lvj;", line = 25)
    public static final class184[] method2232(byte arg0) {
        class184[] var1 = new class184[class185.field3205];
        field5491++;
        for (int var2 = 0; var2 < class185.field3205; var2++) {
            byte[] var3 = class190.field3255[var2];
            int var4 = class279.field4643[var2] * class263.field4389[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class241.field4062[class47.method289(255, var3[var6])];
            }
            var1[var2] = new class184(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], var5);
        }
        if (arg0 <= 81) {
            field5492 = -19;
        }
        class197.method1395((byte) 127);
        return var1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 63)
    public static void method2233(int arg0) {
        if (arg0 != -6204) {
            method2233(41);
        }
        field5495 = null;
        field5493 = null;
        field5494 = null;
    }
}
