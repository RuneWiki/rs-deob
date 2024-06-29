import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class22 extends class225 {

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "[B")
    public byte[] field288;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "Z")
    public static volatile boolean field286 = false;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "Lcr;")
    public static class189 field285 = new class189(30);

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "Lar;")
    public static class47 field291 = new class47();

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class286 var7 = (class286) class419.field6205.method1005(arg1 ^ 0xFFFFFFCB); var7 != null; var7 = (class286) class419.field6205.method1009(false)) {
            if (var7.field4150 <= class28.field418) {
                var7.method686(121);
            } else {
                class323.method2173((var7.field4149 << 7) + 64, arg3, arg2 >> 1, 0, arg4, arg0 >> 1, var7.field4141 * 2, (var7.field4146 << 7) + 64);
                class422.field6227.method1881(class375.field5458[0] + arg6, var7.field4152, class375.field5458[1] + arg5, 0, var7.field4147 | 0xFF000000, 116);
            }
        }
        if (arg1 != 64) {
            field286 = false;
        }
        field290++;
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
    public static void method148(int arg0) {
        field291 = null;
        if (arg0 == -338092991) {
            field285 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
    public static final void method149(int arg0) {
        if (arg0 < -29) {
            field287++;
            class93.field1329.method1141(256);
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "([B)V")
    public class22(byte[] arg0) {
        this.field288 = arg0;
    }
}
