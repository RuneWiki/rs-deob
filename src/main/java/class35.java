import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public abstract class class35 {

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "Lna;")
    public static class26 field451 = class6.method40("Switch to ", 48);

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "Lna;")
    public static class26 field450 = class6.method40("Find", 48);

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field456;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "[I")
    public int[] field449;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 6)
    public final void method247(int arg0) {
        int var2 = 123 / ((12 - arg0) / 59);
        class15.method92(this.field449, this.field454, this.field452);
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(III)B", line = 20)
    public static final byte method248(int arg0, int arg1, int arg2) {
        int var3 = arg1 >> 6;
        int var4 = 4 / ((-arg2 - 22) / 34);
        int var5 = arg0 >> 6;
        if (class34.field447[var5][var3] == null) {
            return 0;
        } else if (class34.field447[var5][var3].field49 == null) {
            return class34.field447[var5][var3].field43;
        } else {
            return class34.field447[var5][var3].field49[(arg0 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(B)V", line = 39)
    public static void method249(byte arg0) {
        field451 = null;
        field450 = null;
        if (arg0 <= 101) {
            field450 = null;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "(I)I", line = 70)
    public static final int method250(int arg0) {
        if (arg0 != -14583) {
            method249((byte) -28);
        }
        return class10.field111 == null ? 0 : class10.field111[class20.field213];
    }

    @OriginalMember(owner = "mapview!sa", name = "<init>", descriptor = "()V", line = 101)
    protected class35() {
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method130(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public abstract void method127(int arg0, boolean arg1, Component arg2, int arg3);
}
