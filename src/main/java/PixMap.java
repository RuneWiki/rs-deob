import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public abstract class PixMap {

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "Ll;")
    public static class21 field223 = class28.method185(-20839, "Please wait)3)3)3 Loading maps");

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Ll;")
    public static class21 field225 = class28.method185(-20839, "Staff Shop");

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Ll;")
    public static class21 field221 = class28.method185(-20839, "Chainmail Shop");

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Ll;")
    public static class21 field220 = class28.method185(-20839, "Fishing Spot");

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "Ll;")
    public static class21 field228 = class28.method185(-20839, "Crafting Shop");

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "Ll;")
    public static class21 field227 = class28.method185(-20839, "codeversion");

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "[I")
    public static int[] field224 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!ma", name = "n", descriptor = "Ll;")
    public static class21 field232 = class28.method185(-20839, "Archery Shop");

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "Ll;")
    public static class21 field230 = class28.method185(-20839, "Fishing Shop");

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field231;

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field229;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "[I")
    public int[] field219;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 11)
    public static final void method137(int arg0) {
        class6 var1 = class5.field38;
        synchronized (class5.field38) {
            class28.field329 = mapview.field291;
            if (class10.field69 >= 0) {
                while (class10.field79 != class10.field69) {
                    int var3 = class4.field27[class10.field79];
                    class10.field79 = class10.field79 + 1 & 0x7F;
                    if (var3 < 0) {
                        class17.field153[~var3] = false;
                    } else {
                        class17.field153[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class17.field153[var2] = false;
                }
                class10.field69 = class10.field79;
            }
            mapview.field291 = class4.field30;
        }
        if (arg0 != 24657) {
            field231 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V", line = 54)
    public static void method138(int arg0) {
        field231 = null;
        field221 = null;
        field227 = null;
        field232 = null;
        if (arg0 != 11) {
            method137(60);
        }
        field220 = null;
        field230 = null;
        field224 = null;
        field225 = null;
        field223 = null;
        field228 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 83)
    public static final void method139(int arg0, Component arg1) {
        if (arg0 != -14688) {
            method137(-122);
        }
        arg1.addMouseListener(class29.field342);
        arg1.addMouseMotionListener(class29.field342);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(II)I", line = 108)
    public static int method140(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)V", line = 124)
    public final void bind(boolean arg0) {
        Draw2D.method173(this.field219, this.field222, this.field226);
        if (arg0) {
            field228 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "()V", line = 167)
    protected PixMap() {
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public abstract void method74(int arg0, int arg1, Graphics arg2, boolean arg3);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method78(int arg0, int arg1, int arg2, Component arg3);
}
