import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class13 extends class45 {

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "Ldg;")
    private static class322 field151;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()V", line = 3)
    public final void method78() {
        field151.method2168(-6964, this.field150);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 8)
    public final void method79(Component arg0) throws Exception {
        field151.method2166(class128.field2292, arg0, class22.field363, -32005);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 11)
    public final void method80() {
        field151.method2165(this.field150, (byte) 53);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lkn;I)V", line = 13)
    public class13(class198 arg0, int arg1) {
        field151 = arg0.method1387(-2014543856);
        this.field150 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V", line = 18)
    public final void method81() {
        field151.method2167(this.field150, this.field836);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 21)
    public final void method82(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field151.method2169(arg0, this.field150, 118);
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "()I", line = 27)
    public final int method83() {
        return field151.method2170(16715, this.field150);
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "()V", line = 30)
    public static void method84() {
        field151 = null;
    }
}
