import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 extends Canvas {

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field193;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Ln;")
    public static class26 field192 = class9.method82(255, "Farming shop");

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Ln;")
    public static class26 field194 = class9.method82(255, "Hair Dressers");

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Ln;")
    public static class26 field191 = class9.method82(255, "details)3dat");

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "I")
    public static int field196 = -1;

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "mapview!ea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void paint(Graphics arg0) {
        this.field193.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILjava/awt/Component;II)Lba;", line = 29)
    public static final class4 method86(int arg0, Component arg1, int arg2, int arg3) {
        if (arg0 != -31295) {
            return (class4) null;
        }
        try {
            Class var4 = Class.forName("pa");
            class4 var5 = (class4) var4.getDeclaredConstructor().newInstance();
            var5.method58(arg3, arg1, arg2, (byte) 112);
            return var5;
        } catch (Throwable var8) {
            class21 var7 = new class21();
            var7.method58(arg3, arg1, arg2, (byte) 60);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IILla;B)[Lq;", line = 54)
    public static final class32[] method87(int arg0, int arg1, class23 arg2, byte arg3) {
        if (class9.method84(arg0, (byte) -9, arg1, arg2)) {
            if (arg3 >= -43) {
                field194 = null;
            }
            return class11.method90((byte) 4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 70)
    public static void method88(int arg0) {
        if (arg0 != -1) {
            method89(110, -52, null, 83);
        }
        field192 = null;
        field194 = null;
        field191 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 89)
    public class10(Component arg0) {
        this.field193 = arg0;
    }

    @OriginalMember(owner = "mapview!ea", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 99)
    public final void update(Graphics arg0) {
        this.field193.update(arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IILla;I)[Lg;", line = 119)
    public static final class13[] method89(int arg0, int arg1, class23 arg2, int arg3) {
        if (arg3 == 0) {
            return class9.method84(arg1, (byte) -9, arg0, arg2) ? class30.method211(81) : null;
        } else {
            return (class13[]) null;
        }
    }
}
