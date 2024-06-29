import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class class719 extends class513 {

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field10153;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "Z")
    public static boolean field10152 = false;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
    public int field10155;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)Ljava/lang/String;", line = 6)
    public static final String method4035(int arg0, int arg1) {
        field10150++;
        String var2 = Integer.toString(arg0);
        int var3 = var2.length() - 3;
        if (arg1 != -10353) {
            field10152 = true;
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class138.field1869.method891(-2041650704, class369.field4721) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class138.field1871.method891(-2041650704, class369.field4721) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 39)
    public final void method4036(OggPacket arg0, byte arg1) {
        field10154++;
        if (arg1 != 111) {
            this.method940(60);
        }
        this.method938(arg0, (byte) -63);
        this.field10155++;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 52)
    public static final void method4037(String arg0, int arg1) {
        field10151++;
        System.exit(1);
        if (arg1 != -20702) {
            field10152 = false;
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 67)
    public class719(OggStreamState arg0) {
        this.field10153 = arg0;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public abstract void method938(OggPacket arg0, byte arg1);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public abstract void method940(int arg0);
}
