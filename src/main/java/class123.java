import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class123 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lp;")
    public static class280 field2164 = class18.method140((byte) -120, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[I")
    public static int[] field2161 = new int[500];

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2160 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lp;")
    public static class280 field2163 = class18.method140((byte) -120, "b12_full");

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Ltg;")
    public static class180 field2159;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method468(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
    public abstract int method467(int arg0);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method861(int arg0) {
        field2164 = null;
        field2159 = null;
        field2163 = null;
        if (arg0 == -10518) {
            field2161 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method466(int arg0, Component arg1);
}
