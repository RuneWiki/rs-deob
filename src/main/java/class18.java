import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public abstract class class18 {

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "Lna;")
    public static class26 field232 = class30.method205((byte) 55, "Find");

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Lna;")
    public static class26 field231 = class30.method205((byte) 116, "Switch to ");

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lna;")
    public static class26 field230 = class30.method205((byte) 38, "Fishing Shop");

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Lna;")
    public static class26 field234 = class30.method205((byte) 97, "Mace Shop");

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "Lna;")
    public static class26 field229 = class30.method205((byte) 52, "fonts");

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Lna;")
    public static class26 field238 = class30.method205((byte) 34, "???");

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field228;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "[I")
    public int[] field227;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 7)
    public static void method113(int arg0) {
        field238 = null;
        field231 = null;
        if (arg0 < 37) {
            field230 = null;
        }
        field232 = null;
        field229 = null;
        field234 = null;
        field230 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V", line = 34)
    public final void method114(byte arg0) {
        if (arg0 != 110) {
            method115(null, 98);
        }
        class21.method130(this.field227, this.field233, this.field235);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([BI)Laa;", line = 51)
    public static final class2 method115(byte[] arg0, int arg1) {
        if (arg0 == null) {
            return null;
        } else {
            class2 var2 = new class2(arg0, class17.field224, class13.field192, class31.field408, class37.field479, class29.field385, class30.field396);
            class19.method119((byte) 25);
            return arg1 <= 83 ? (class2) null : var2;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "()V", line = 79)
    protected class18() {
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
    public abstract void method116(Graphics arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/awt/Component;BII)V")
    public abstract void method117(Component arg0, byte arg1, int arg2, int arg3);
}
