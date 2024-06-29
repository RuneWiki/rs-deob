import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public abstract class class17 {

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "[I")
    public static int[] field206 = new int[128];

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Lk;")
    public static class21 field205 = class14.method92((byte) 57, "100(U");

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lk;")
    public static class21 field212 = class14.method92((byte) 57, "Skirt Shop");

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Lk;")
    public static class21 field213 = class14.method92((byte) 57, "Sword Shop");

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Lk;")
    public static class21 field214 = class14.method92((byte) 57, "Bank");

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lma;")
    public static class26 field208;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field210;

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "[I")
    public int[] field217;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 27)
    public static void method96(byte arg0) {
        field208 = null;
        field212 = null;
        field205 = null;
        if (arg0 >= -119) {
            field214 = null;
        }
        field206 = null;
        field214 = null;
        field213 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)Lk;", line = 44)
    public static final class21 method97(int arg0, int arg1) {
        return arg0 == 10 ? class6.method57(arg1, 10, true, false) : (class21) null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)Z", line = 66)
    public static final boolean method99(int arg0) {
        class8 var1 = class15.field195;
        synchronized (class15.field195) {
            if (class32.field386 == class27.field334) {
                return false;
            }
            class29.field354 = class25.field318[class32.field386];
            if (arg0 != -2737) {
                field212 = null;
            }
            class32.field386 = class32.field386 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 88)
    public static final void method100(Component arg0, boolean arg1) {
        try {
            Method var2 = class18.field230;
            if (arg1) {
                field209 = 75;
            }
            if (var2 != null) {
                var2.invoke(arg0, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        arg0.addKeyListener(class15.field195);
        arg0.addFocusListener(class15.field195);
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(I)V", line = 125)
    public final void method101(int arg0) {
        if (arg0 != 128) {
            method99(67);
        }
        class20.method123(this.field217, this.field211, this.field215);
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "()V", line = 159)
    protected class17() {
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method95(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method98(int arg0, Component arg1, int arg2, int arg3);
}
