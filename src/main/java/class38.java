import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public abstract class class38 {

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Lf;")
    public static class10 field520 = class23.method139("Food Shop", (byte) -74);

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "Lf;")
    public static class10 field523 = class23.method139("Summoning Obelisk", (byte) -82);

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "Lf;")
    public static class10 field522 = class23.method139("Magic Shop", (byte) -75);

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Lf;")
    public static class10 field521 = class23.method139("Hunter Training", (byte) -83);

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "Lf;")
    public static class10 field524 = class23.method139("Axe Shop", (byte) -112);

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "Z")
    public static boolean field526 = true;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "[[[[B")
    public static byte[][][][] field527 = new byte[5][][][];

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 28)
    public static final void method244(int arg0) {
        if (++class36.field508 >= 64) {
            class25.field276++;
            class36.field508 = 0;
            if (class25.field276 < class11.field124 >> 6) {
                class36.method237(arg0 ^ 0x1D6);
            }
        }
        if (arg0 != 466) {
            field524 = null;
        }
        class41.field538 = (class36.field508 << 6) + class36.field506;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 66)
    public static final void method245(Component arg0, byte arg1) {
        arg0.removeKeyListener(class21.field235);
        arg0.removeFocusListener(class21.field235);
        int var2 = -86 % ((arg1 - 12) / 46);
        class17.field148 = -1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([BZII)I", line = 88)
    public static final int method246(byte[] arg0, boolean arg1, int arg2, int arg3) {
        int var4 = -1;
        if (!arg1) {
            method246(null, true, -81, -5);
        }
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class33.field473[(var4 ^ arg0[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 124)
    public static void method247(int arg0) {
        field521 = null;
        field523 = null;
        field522 = null;
        field524 = null;
        field527 = null;
        field520 = null;
        if (arg0 != 0) {
            field520 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIZ)I")
    public abstract int method235(int arg0, int arg1, boolean arg2);
}
