import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class42 {

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field597 = 0;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "[Z")
    public static boolean[] field595 = new boolean[100];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lnk;")
    public static class464 field601 = null;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[B")
    public byte[] field594;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[B")
    public byte[] field600;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method284(int arg0) {
        if (arg0 != 25981) {
            method285(71);
        }
        for (int var1 = 0; var1 < class177.field2408.length; var1++) {
            for (int var2 = 0; var2 < class177.field2408[var1].length; var2++) {
                class177.field2408[var1][var2] = class274.field3630;
            }
        }
        field593++;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 36)
    public static void method285(int arg0) {
        if (arg0 == 0) {
            field601 = null;
            field595 = null;
        }
    }
}
