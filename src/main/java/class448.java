import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class448 extends class65 {

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field6535;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lpl;")
    public static class616 field6531 = new class616(8);

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Ltm;")
    public static class334 field6536 = new class334(105, 10);

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field6538 = -1;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "Z")
    public static boolean field6537 = true;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "[I")
    public static int[] field6539 = new int[13];

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public int field6534;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V")
    public static void method2756(boolean arg0) {
        if (arg0) {
            field6539 = null;
        }
        field6531 = null;
        field6539 = null;
        field6536 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public abstract void method1132(OggPacket arg0, byte arg1);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILofa;)Lfw;")
    public static final class214 method2757(int arg0, class301 arg1) {
        arg1.method1987(-32);
        field6532++;
        int var2 = -9 % ((39 - arg0) / 41);
        int var3 = arg1.method1987(-65);
        class214 var4 = class243.method1684(var3, (byte) -1);
        var4.field3534 = arg1.method1987(-86);
        int var5 = arg1.method1987(-38);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.method1987(-122);
            var4.method59(110, arg1, var7);
        }
        var4.method65(58);
        return var4;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method2758(OggPacket arg0, byte arg1) {
        field6533++;
        this.method1132(arg0, (byte) -5);
        if (arg1 >= 10) {
            this.field6534++;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public abstract void method1134(int arg0);

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class448(OggStreamState arg0) {
        this.field6535 = arg0;
    }
}
