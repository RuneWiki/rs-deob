import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class38 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lhh;")
    public static class163 field634 = null;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
    public static volatile boolean field637 = true;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field638 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lhh;")
    private static class163 field641 = class137.method1065("Loaded fonts", 17);

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lhh;")
    public static class163 field642 = class137.method1065(" (X", 17);

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lhh;")
    public static class163 field644 = class137.method1065("mapdots", 17);

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lhh;")
    public static class163 field643 = field641;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lv;")
    public static class22 field640;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[[S")
    public static short[][] field636;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[[[B")
    public static byte[][][] field633;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILta;JLta;Lta;)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3, class165 arg4, long arg5, class165 arg6, class165 arg7) {
        class125 var9 = new class125();
        var9.field2421 = arg4;
        var9.field2405 = arg1 * 128 + 64;
        var9.field2409 = arg2 * 128 + 64;
        var9.field2407 = arg3;
        var9.field2417 = arg5;
        var9.field2413 = arg6;
        var9.field2418 = arg7;
        int var10 = 0;
        class144 var11 = class259.field4542[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2741; var12++) {
                class132 var13 = var11.field2746[var12];
                if ((var13.field2568 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2558.method21();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2420 = -var10;
        if (class259.field4542[arg0][arg1][arg2] == null) {
            class259.field4542[arg0][arg1][arg2] = new class144(arg0, arg1, arg2);
        }
        class259.field4542[arg0][arg1][arg2].field2729 = var9;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method272(int arg0) {
        field634 = null;
        field638 = null;
        field642 = null;
        field643 = null;
        field641 = null;
        if (arg0 < 65) {
            method272(4);
        }
        field633 = null;
        field636 = null;
        field644 = null;
        field640 = null;
    }
}
