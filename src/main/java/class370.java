import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class370 extends class656 {

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field5157;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lhda;")
    public static class752 field5159 = new class752(110, 7);

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
    public static boolean field5161;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method2175(OggPacket arg0, int arg1) {
        field5158++;
        this.method1225(arg0, false);
        if (arg1 < 97) {
            field5159 = null;
        }
        this.field5162++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method2176(int arg0) {
        if (arg0 >= -74) {
            method2176(-105);
        }
        field5159 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILee;)Ljava/lang/String;")
    public static final String method2177(int arg0, int arg1, class677 arg2) {
        field5160++;
        try {
            int var3 = arg2.method3790((byte) 22);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field9419 += class210.field3096.method317(-87812127, arg1, arg2.field9399, arg2.field9419, var4, var3);
            return class318.method1930(0, var3, var4, -55);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public abstract void method1225(OggPacket arg0, boolean arg1);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public abstract void method1226(byte arg0);

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class370(OggStreamState arg0) {
        this.field5157 = arg0;
    }

    static {
        new class235("", 76);
        field5161 = false;
    }
}
