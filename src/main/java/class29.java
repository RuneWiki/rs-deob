import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public abstract class class29 {

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lt;")
    public static class31 field322 = class11.method64(93, "(U");

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Lt;")
    public static class31 field325 = class11.method64(-60, "Guide");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "[I")
    public static int[] field326 = new int[128];

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field324;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "[I")
    public int[] field321;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 11)
    public final void method156(byte arg0) {
        class23.method114(this.field321, this.field323, this.field320);
        if (arg0 > -90) {
            method158((byte) -4);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Lv;Lt;BLt;)[Lka;", line = 27)
    public static final class21[] method157(class33 arg0, class31 arg1, byte arg2, class31 arg3) {
        int var4 = -92 / ((-arg2 - 42) / 33);
        int var5 = arg0.method193(arg3, -79);
        int var6 = arg0.method197(arg1, var5, (byte) 15);
        return class4.method44(arg0, 46, var6, var5);
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(B)V", line = 59)
    public static void method158(byte arg0) {
        field325 = null;
        field322 = null;
        if (arg0 == 108) {
            field326 = null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "()V", line = 92)
    protected class29() {
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public abstract void method38(Graphics arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method40(int arg0, Component arg1, int arg2, int arg3);
}
