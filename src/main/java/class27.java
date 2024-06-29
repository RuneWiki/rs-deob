import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public abstract class class27 {

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "La;")
    public static class1 field375 = class3.method36("Farming patch", -119);

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "La;")
    public static class1 field377 = class3.method36("Mini)2Game", -107);

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "La;")
    public static class1 field379 = class3.method36("Spinning Wheel", -122);

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "I")
    public static volatile int field380 = 0;

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "La;")
    public static class1 field384 = class3.method36("Gem Shop", -111);

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "La;")
    public static class1 field386 = class3.method36("map", -106);

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "La;")
    public static class1 field382 = class3.method36("Find", -97);

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field376;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "[I")
    public static int[] field378;

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "[I")
    public int[] field385;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 13)
    public final void method176(byte arg0) {
        if (arg0 != 126) {
            this.field376 = null;
        }
        class32.method213(this.field385, this.field374, this.field383);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 35)
    public static void method177(int arg0) {
        field382 = null;
        field377 = null;
        field384 = null;
        field375 = null;
        field379 = null;
        field378 = null;
        field386 = null;
        if (arg0 != -1) {
            method177(-97);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 79)
    public static final int method178(KeyEvent arg0, int arg1) {
        if (arg1 > -58) {
            return -113;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "()V", line = 108)
    protected class27() {
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(I)B", line = 115)
    public static final byte method179(int arg0) {
        if (arg0 != 0) {
            field380 = -118;
        }
        return class3.field33 == null ? 0 : class3.field33[class5.field47];
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/awt/Component;III)Lo;", line = 136)
    public static final class27 method180(Component arg0, int arg1, int arg2, int arg3) {
        try {
            Class var4 = Class.forName("j");
            class27 var5 = (class27) var4.getDeclaredConstructor().newInstance();
            var5.method46(-257, arg0, arg3, arg2);
            return arg1 == 0 ? var5 : (class27) null;
        } catch (Throwable var8) {
            class5 var7 = new class5();
            var7.method46(-257, arg0, arg3, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method44(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method46(int arg0, Component arg1, int arg2, int arg3);
}
