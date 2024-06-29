import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class12 extends class134 {

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field93;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field92 = 765;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[I")
    public static int[] field100 = new int[64];

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lpia;")
    public static class94 field99 = new class94(38, 7);

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "D")
    public static double field101;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lmf;")
    public static class418 field103;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 11)
    public static final void method51(int arg0) {
        field97++;
        class105.field1091.method3549(0);
        if (arg0 != 64) {
            method54(-77);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([[F[[SI)[[S", line = 31)
    public static final short[][] method52(float[][] arg0, short[][] arg1, int arg2) {
        field102++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
            }
        }
        if (arg2 != -24930) {
            method52(null, null, -115);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 59)
    public final void method53(byte arg0, OggPacket arg1) {
        field94++;
        this.method55(arg1, 95);
        this.field95++;
        if (arg0 != 1) {
            field100 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 71)
    public class12(OggStreamState arg0) {
        this.field93 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 85)
    public static void method54(int arg0) {
        field103 = null;
        field100 = null;
        if (arg0 != 17929) {
            method51(-109);
        }
        field99 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public abstract void method55(OggPacket arg0, int arg1);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    public abstract void method56(int arg0);
}
