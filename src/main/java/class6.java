import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public abstract class class6 {

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Lh;")
    public static class15 field125 = class26.method190(true, "Cooking Range");

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Z")
    public static boolean field128 = false;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "Lh;")
    public static class15 field135 = class26.method190(true, "Amulet Shop");

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "I")
    public static int field134 = 0;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Lh;")
    public static class15 field133;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field131;

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "[I")
    public int[] field127;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "[[B")
    public static byte[][] field130;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "[[[I")
    public static int[][][] field129;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B)V", line = 12)
    public final void method69(byte arg0) {
        class12.method92(this.field127, this.field132, this.field126);
        int var2 = -51 / ((-arg0 - 41) / 63);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V", line = 28)
    public static void method70(boolean arg0) {
        field125 = null;
        field130 = null;
        field135 = null;
        if (!arg0) {
            method70(false);
        }
        field133 = null;
        field129 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "()V", line = 70)
    protected class6() {
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public abstract void method71(int arg0, Graphics arg1, byte arg2, int arg3);

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method72(int arg0, Component arg1, int arg2, int arg3);
}
