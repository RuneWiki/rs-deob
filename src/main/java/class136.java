import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class136 extends class173 {

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    private int field2116;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "Lod;")
    private static class95 field2117;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method907(Component arg0) throws Exception {
        field2117.method613(arg0, -76, class131.field2018, class287.field4787);
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "()V")
    public static void method908() {
        field2117 = null;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "()I")
    public final int method909() {
        return field2117.method609(this.field2116, (byte) -109);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public final void method910(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2117.method608(this.field2116, arg0, true);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lgj;I)V")
    public class136(class255 arg0, int arg1) {
        field2117 = arg0.method1771(true);
        this.field2116 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
    public final void method911() {
        field2117.method612(this.field2116, false);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
    public final void method912() {
        field2117.method611(29204, this.field2116);
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()V")
    public final void method913() {
        field2117.method610(this.field2116, super.field2695);
    }
}
