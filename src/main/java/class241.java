import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class241 {

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field3791 = 0;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lnh;")
    public static class305 field3783;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field3790;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[I")
    public int[] field3793;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method1583(int arg0) {
        field3783 = null;
        if (arg0 != 3491) {
            method1584((byte) 71, (class305) null);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLnh;)V")
    public static final void method1584(byte arg0, class305 arg1) {
        field3785++;
        if (arg0 != -61) {
            method1583(-84);
        }
        class271.field4323 = arg1;
        class306.field4923 = class271.field4323.method2067(4, (byte) 51);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public abstract void method176(byte arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method1585(int arg0) {
        field3787++;
        client.method2041();
        client.method2029();
        client.method2040();
        if (arg0 != 0) {
            method1584((byte) -76, (class305) null);
        }
        client.method2034();
        client.method2033();
        client.method2036();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method179(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public final void method1586(byte arg0) {
        if (arg0 < 83) {
            this.field3784 = 124;
        }
        field3792++;
        class266.method1746(this.field3793, this.field3784, this.field3788);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public abstract void method180(Graphics arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BZ)V")
    public static final void method1587(byte arg0, boolean arg1) {
        if (arg0 > 104) {
            field3782++;
            class8.method46(arg1, class218.field3386, class104.field1499, class174.field2460, -81);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    protected class241() {
    }
}
