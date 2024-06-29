import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class444 extends class147 {

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "Lqe;")
    public static class465 field6175 = new class465(27, -1);

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "F")
    public static float field6172;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "Leq;")
    public static class209 field6177;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "Lnaa;")
    public static class71 field6178;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "[I")
    public static int[] field6176;

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class444(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public static void method2659(boolean arg0) {
        field6178 = null;
        field6176 = null;
        if (arg0) {
            field6177 = null;
            field6175 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        field6171++;
        if (arg0 != 0) {
            field6177 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ID)V")
    public static final void method2660(int arg0, double arg1) {
        if (arg0 != -32415) {
            method2660(-66, -1.8257597465044795D);
        }
        field6173++;
        if (class110.field1787 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class754.field10503[var3] = var4 > 255 ? 255 : var4;
        }
        class110.field1787 = arg1;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLjagtheora/ogg/OggPacket;)V")
    public final void method9(boolean arg0, OggPacket arg1) {
        field6174++;
        if (arg0) {
            field6178 = null;
        }
    }
}
