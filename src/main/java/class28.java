import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public abstract class class28 {

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "[J")
    public static long[] field375 = new long[32];

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Lua;")
    public static class41 field379 = class16.method86("Find", true);

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Lua;")
    public static class41 field377 = class16.method86("Loading )3)3)3", true);

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Lua;")
    public static class41 field378 = class16.method86("Farming shop", true);

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "Lua;")
    public static class41 field380 = class16.method86("Requesting", true);

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field376;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "[I")
    public int[] field374;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 6)
    public static void method174(byte arg0) {
        field379 = null;
        field380 = null;
        if (arg0 > 25) {
            field377 = null;
            field378 = null;
            field375 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Z)V", line = 36)
    public final void method176(boolean arg0) {
        if (!arg0) {
            method174((byte) -80);
        }
        class12.method67(this.field374, this.field372, this.field373);
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "()V", line = 56)
    protected class28() {
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method175(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method177(int arg0, Component arg1, int arg2, int arg3);
}
