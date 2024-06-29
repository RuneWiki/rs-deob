import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class361 {

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field5368 = -1;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "F")
    public static float field5371;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lf;")
    public static class702 field5364;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field5363;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "[B")
    public byte[] field5365;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[S")
    public short[] field5366;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "[S")
    public short[] field5367;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[S")
    public short[] field5369;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method2304(int arg0) {
        field5363 = null;
        if (arg0 != -1) {
            field5371 = -0.92749804F;
        }
        field5364 = null;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public static final void method2305(int arg0) {
        class178.field2895++;
        if (arg0 < -27) {
            field5370++;
            class275 var1 = class185.method1355(0, class293.field4395, class395.field5772);
            var1.field4103.method745(class130.field2351, 128);
            class140.method1141(var1, 19321);
        }
    }
}
