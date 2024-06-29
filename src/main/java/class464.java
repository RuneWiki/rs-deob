import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class464 extends class337 {

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field6029;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field6030 = 0;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public int field6024;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lda;")
    public static class420 field6025;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field6026;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public abstract void method508(int arg0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2605(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6027++;
        if (arg4) {
            return;
        }
        int var5 = class357.field4365;
        int var6 = class332.field4066;
        if (class602.field7657) {
            var5 += class498.method2765((byte) -109);
            var6 += class507.method2806((byte) -121);
        }
        if (class793.field10872 == 1) {
            class772 var7 = class790.field10812[class244.field3357 / 100];
            var7.method4203(var5 - 8, var6 + -8);
            class548.method2967(var5 - 8, var7.method628() + var6 + -8, var6 - 8, (byte) -115, var7.method623() + (var5 - 8));
        }
        if (class793.field10872 == 2) {
            class772 var8 = class790.field10812[(class244.field3357 / 100) + 4];
            var8.method4203(var5 - 8, var6 + -8);
            class548.method2967(var5 - 8, var6 + -8 - -var8.method628(), var6 - 8, (byte) -94, var5 - (8 - var8.method623()));
        }
        class553.method3005(0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public abstract void method510(OggPacket arg0, boolean arg1);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLjagtheora/ogg/OggPacket;)V")
    public final void method2606(boolean arg0, OggPacket arg1) {
        field6028++;
        this.method510(arg1, arg0);
        this.field6024++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method2607(boolean arg0) {
        field6025 = null;
        if (arg0) {
            field6030 = 50;
        }
        field6026 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class464(OggStreamState arg0) {
        this.field6029 = arg0;
    }
}
