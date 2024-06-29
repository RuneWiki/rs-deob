import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class103 extends class113 {

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lma;")
    private static class73 field2627;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 3)
    public final void method91(int arg0) throws Exception {
        field2627.method605(-93, arg0);
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "()V", line = 6)
    public static void method857() {
        field2627 = null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V", line = 9)
    public final void method90() {
        field2627.method609(class113.field2853);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V", line = 12)
    public final void method89() {
        field2627.method606(25466);
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()I", line = 15)
    public final int method92() {
        return field2627.method607((byte) 27);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lvb;Ljava/awt/Component;)V", line = 18)
    public class103(class124 arg0, Component arg1) throws Exception {
        super(22050);
        field2627 = arg0.method988((byte) -47);
        field2627.method608(arg1, -19922);
        this.method915(arg0, 16384);
    }
}
