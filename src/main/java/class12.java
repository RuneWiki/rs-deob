import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public abstract class class12 {

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "I")
    public static int field120 = 0;

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "Lv;")
    public static class40 field128 = class24.method170("Estate Agent", (byte) -112);

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Lk;")
    public static class18 field121 = null;

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "I")
    public static int field130 = 20;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "Lv;")
    public static class40 field129 = class24.method170("Overview", (byte) -76);

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "J")
    public static long field122;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field127;

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "[I")
    public int[] field126;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)B", line = 15)
    public static final byte method70(byte arg0) {
        int var1 = 77 % ((arg0 - 92) / 34);
        return class24.field368 == null ? 0 : class24.field368[class20.field213];
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(B)V", line = 32)
    public static void method72(byte arg0) {
        if (arg0 != -11) {
            field121 = null;
        }
        field129 = null;
        field128 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "()V", line = 56)
    protected class12() {
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Z)V", line = 65)
    public final void method74(boolean arg0) {
        class2.method8(this.field126, this.field124, this.field123);
        if (!arg0) {
            field125 = -56;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method71(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public abstract void method73(int arg0, byte arg1, int arg2, Component arg3);
}
