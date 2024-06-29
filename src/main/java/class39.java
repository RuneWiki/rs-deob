import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class39 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Lbg;")
    public static class324 field442 = new class324(25, -1);

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lsl;")
    public static class318 field448 = new class318(31, 3);

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Lpk;")
    public static class133 field449 = new class133();

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "F")
    public static float field453 = 0.25F;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lbg;")
    public static class324 field452 = new class324(75, 14);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[B")
    public byte[] field440;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[B")
    public byte[] field443;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method398(int arg0) {
        if (arg0 == 8) {
            field452 = null;
            field449 = null;
            field448 = null;
            field442 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method399(int arg0, int arg1) {
        field447++;
        if (arg0 < 79) {
            field452 = null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class203.field2941.method2031(true, class377.field5585) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class418.field6170.method2031(true, class377.field5585) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
