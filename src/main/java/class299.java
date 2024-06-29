import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class299 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field4801 = 0;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "[Leb;")
    public static class7[] field4807 = new class7[6];

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Z")
    public static boolean field4804 = true;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lo;")
    public static class138 field4800;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lqs;")
    public static class496 field4805;

    static {
        new class306("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field4808 = 0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lia;I)V", line = 4)
    public final void method1917(class23 arg0, int arg1) {
        if (arg1 >= -33) {
            field4804 = true;
        }
        field4803++;
        while (true) {
            int var3 = arg0.method126((byte) -109);
            if (var3 == 0) {
                return;
            }
            this.method1920(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 26)
    public static void method1918(int arg0) {
        field4800 = null;
        field4807 = null;
        if (arg0 < -9) {
            field4805 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBII)I", line = 41)
    public static final int method1919(int arg0, byte arg1, int arg2, int arg3) {
        field4802++;
        if (arg1 > -102) {
            return 39;
        } else {
            int var4 = 255 - arg0;
            int var5 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
            return (((arg3 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg3 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLia;I)V", line = 55)
    private final void method1920(boolean arg0, class23 arg1, int arg2) {
        field4806++;
        if (arg2 == 5) {
            this.field4801 = arg1.method132(65);
        }
        if (!arg0) {
            this.method1917(null, 122);
        }
    }
}
