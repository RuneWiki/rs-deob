import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class312 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lmc;")
    public static class78 field4108 = new class78(51, 0);

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "[Ltf;")
    public static class177[] field4112;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "[[S")
    public static short[][] field4111;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method731(int arg0, Component arg1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method730(byte arg0, Component arg1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I")
    public abstract int method732(int arg0);

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static void method1712(int arg0) {
        field4108 = null;
        if (arg0 != -21512) {
            field4108 = null;
        }
        field4112 = null;
        field4111 = null;
    }
}
