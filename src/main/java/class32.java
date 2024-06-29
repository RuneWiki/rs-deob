import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class32 {

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Lua;")
    public static class41 field420 = class16.method86("details)3dat", true);

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lua;")
    public static class41 field418 = class16.method86("Loading", true);

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lua;")
    public static class41 field422 = class16.method86("Suchen", true);

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Z")
    public static boolean field421 = false;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "Lua;")
    public static class41 field424 = class16.method86("Pet Shop", true);

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "B")
    public byte field423;

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field417;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "[B")
    public byte[] field419;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 8)
    public static void method193(int arg0) {
        if (arg0 != 0) {
            method193(-99);
        }
        field422 = null;
        field420 = null;
        field418 = null;
        field424 = null;
        field417 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 22)
    public final void method194(byte arg0) {
        if (arg0 != -125) {
            return;
        }
        boolean var2 = true;
        if (this.field419 == null) {
            return;
        }
        this.field423 = this.field419[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field419[var3] != this.field423) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field419 = null;
        }
    }
}
