import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class52 extends class276 {

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "Lnk;")
    public static class326 field840 = new class326(14, 6);

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "Llo;")
    public static class306 field844 = new class306("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "[I")
    public static int[] field847 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public static int field846 = -60;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "[[I")
    public static int[][] field845;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lia;I)Lpm;")
    public static final class416 method365(class23 arg0, int arg1) {
        field842++;
        if (arg1 > -81) {
            method365(null, 40);
        }
        class416 var2 = new class416();
        var2.field6310 = arg0.method132(95);
        var2.field6307 = class313.field4936.method2586(var2.field6310, false);
        return var2;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method366(int arg0) {
        field844 = null;
        field840 = null;
        field847 = null;
        if (arg0 <= 50) {
            method365(null, -22);
        }
        field845 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIBI)I")
    public static final int method367(int arg0, int arg1, byte arg2, int arg3) {
        field839++;
        int var4 = -113 / ((arg2 - 58) / 41);
        if (arg3 <= arg0) {
            return arg0 <= arg1 ? arg0 : arg1;
        } else {
            return arg3;
        }
    }
}
