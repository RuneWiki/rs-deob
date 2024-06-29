import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class238 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lcf;")
    public static class93 field4253 = class147.method1066("showingVideoAd", -48);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[S")
    public static short[] field4254 = new short[] { 57, 49, 51, 9, 31, 29, 23, 50 };

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static volatile int field4259 = -1;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lnh;")
    public static class54 field4255 = new class54(50);

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4264 = -1;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lnf;")
    public static class158 field4266;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lhg;")
    public static class177 field4251;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field4256;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Ljava/awt/Image;")
    public static Image field4261;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
    public int[] field4262;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method46(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method44(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIJI)Lcf;")
    public static final class93 method1622(int[] arg0, int arg1, long arg2, int arg3) {
        field4252++;
        if (class285.field5104 != null) {
            class93 var5 = class285.field5104.method1625(arg1, (byte) -56, arg0, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        int var6 = -27 % ((arg3 + 47) / 46);
        return class245.method1668((byte) -54, arg2);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method45(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public final void method1623(int arg0) {
        if (arg0 < 47) {
            this.method44(-45, (Component) null, 15, -100);
        }
        class75.method516(this.field4262, this.field4260, this.field4263);
        field4257++;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method1624(int arg0) {
        if (arg0 != -1019) {
            return;
        }
        field4254 = null;
        field4255 = null;
        field4261 = null;
        field4266 = null;
        field4253 = null;
        field4251 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    protected class238() {
    }
}
