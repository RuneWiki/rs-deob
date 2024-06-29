import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class235 {

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field3093 = -1;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "S")
    public static short field3096 = 32767;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "F")
    public static float field3095;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "Lmv;")
    public static class295 field3097;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        if (arg0 == -124) {
            field3097 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
    public static final void method1447(int arg0) {
        field3094++;
        for (class562 var1 = (class562) class118.field1765.method2371(121); var1 != null; var1 = (class562) class118.field1765.method2371(-104)) {
            class326.method2018(-109, var1);
        }
        if (arg0 != 3) {
            field3096 = 79;
        }
        int var2;
        int var3;
        if (class335.field4872.method3439(class62.field996, false)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class432.field6276;
            var3 = class432.field6276;
        }
        client.method574();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method577();
            client.method563(var4);
            client.method582(var4);
        }
        client.method581();
        client.method562();
    }
}
