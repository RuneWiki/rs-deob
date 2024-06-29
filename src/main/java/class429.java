import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class429 {

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public int field6315 = 0;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "Z")
    public static boolean field6316 = false;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "Lbg;")
    public static class324 field6313 = new class324(46, -1);

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field6317 = 12;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "[I")
    public static int[] field6319 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field6320 = 0;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "Lfa;")
    public static class156 field6321 = new class156(10);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
    public static final void method2610(int arg0, int arg1, int arg2) {
        boolean var3 = class422.field6240[0][arg1][arg2] != null && class422.field6240[0][arg1][arg2].field2091 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class422.field6240[var4][arg1][arg2] == null) {
                class148 var5 = class422.field6240[var4][arg1][arg2] = new class148(var4, arg1, arg2);
                if (var3) {
                    var5.field2100++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Liv;Z)V")
    public final void method2611(class65 arg0, boolean arg1) {
        if (!arg1) {
            this.method2612(null, 61, -27);
        }
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                field6314++;
                return;
            }
            this.method2612(arg0, var3, -75);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Liv;II)V")
    private final void method2612(class65 arg0, int arg1, int arg2) {
        if (arg1 == 5) {
            this.field6315 = arg0.method623((byte) -106);
        }
        field6312++;
        int var4 = -22 / ((arg2 - 41) / 54);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)I")
    public static int method2613(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method2614(int arg0) {
        field6319 = null;
        field6313 = null;
        field6321 = null;
        if (arg0 != 13815) {
            field6316 = true;
        }
    }
}
