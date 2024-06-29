import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field248 = -1;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lsd;")
    public static class166 field250 = class135.method935("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 0);

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lb;")
    public static class11 field252 = new class11(260);

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lsd;")
    public static class166 field255 = class135.method935("<col=40ff00>", 0);

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lsd;")
    public static class166 field254 = null;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lsd;")
    private static class166 field256 = class135.method935("Connecting to server)3)3)3", 0);

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lsd;")
    public static class166 field257 = field256;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Z")
    public static volatile boolean field259 = true;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field258 = new Random();

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lce;")
    public static final class25 method79(byte arg0, int arg1) {
        field253++;
        class25 var2 = (class25) class182.field3457.method64((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class41.field733.method353(8, arg1, -107);
        class25 var4 = new class25();
        int var5 = -23 / ((arg0 + 29) / 32);
        if (var3 != null) {
            var4.method194(-5, new class53(var3));
        }
        class182.field3457.method67(var4, 15266, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method80(int arg0) {
        field250 = null;
        field255 = null;
        if (arg0 != 8) {
            method79((byte) 118, 53);
        }
        field254 = null;
        field257 = null;
        field252 = null;
        field258 = null;
        field256 = null;
    }
}
