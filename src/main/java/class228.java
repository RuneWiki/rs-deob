import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class228 extends class257 {

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "Lub;")
    private static class62 field3251;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 3)
    public final void method763(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field3251.method418(arg0, this.field3252, 111);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V", line = 9)
    public final void method767() {
        field3251.method416((byte) 123, this.field3252);
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "()V", line = 12)
    public static void method1593() {
        field3251 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()I", line = 16)
    public final int method768() {
        return field3251.method414(this.field3252, -16609);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V", line = 19)
    public final void method764() {
        field3251.method415(29759, this.field3252);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()V", line = 22)
    public final void method766() {
        field3251.method419(this.field3252, this.field3775);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lwa;I)V", line = 25)
    public class228(class80 arg0, int arg1) {
        field3251 = arg0.method611((byte) 122);
        this.field3252 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public final void method765(Component arg0) throws Exception {
        field3251.method417((byte) 42, class273.field4085, class10.field93, arg0);
    }
}
