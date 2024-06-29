import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class WorldmapOverlay {

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Lv;")
    public static JagString field366 = class1.method2(255, "Pub)4Bar");

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Lv;")
    public static JagString field371 = class1.method2(255, "sprites");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Lv;")
    public static JagString field372 = class1.method2(255, "Hunter Store");

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "Lv;")
    public static JagString field376 = class1.method2(255, "map");

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lv;")
    public static JagString field368 = class1.method2(255, "Silver Shop");

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lv;")
    public static JagString field373 = class1.method2(255, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "Lv;")
    public static JagString field374 = class1.method2(255, "Next page");

    @OriginalMember(owner = "mapview!q", name = "n", descriptor = "Lv;")
    public static JagString field379 = class1.method2(255, "Fishing Spot");

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "Lv;")
    public static JagString field377 = class1.method2(255, "Anvil");

    @OriginalMember(owner = "mapview!q", name = "o", descriptor = "Lv;")
    public static JagString field380 = class1.method2(255, "Overview");

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "B")
    public byte field367;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lj;")
    public static Js5 field370;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field369;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "[B")
    public byte[] field375;

    @OriginalMember(owner = "mapview!q", name = "m", descriptor = "[B")
    public static byte[] field378;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 17)
    public static void method174(int arg0) {
        field372 = null;
        field377 = null;
        field370 = null;
        field368 = null;
        field376 = null;
        field379 = null;
        field380 = null;
        field373 = null;
        field378 = null;
        field371 = null;
        if (arg0 != 0) {
            method174(-122);
        }
        field369 = null;
        field374 = null;
        field366 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 51)
    public final void method175(byte arg0) {
        if (arg0 != 3) {
            return;
        }
        boolean var2 = true;
        if (this.field375 == null) {
            return;
        }
        this.field367 = this.field375[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field375[var3] != this.field367) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field375 = null;
        }
    }
}
