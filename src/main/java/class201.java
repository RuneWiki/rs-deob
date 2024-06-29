import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class201 {

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field3192 = 0;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "B")
    public static byte field3191 = 0;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lma;")
    public static class5 field3190 = class12.method119("cookieprefix", (byte) 108);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lma;")
    public static class5 field3193 = class12.method119(":assistreq:", (byte) 106);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lni;")
    public static class202 field3196;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lfl;")
    public static class299 field3197;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lii;II)V", line = 9)
    private final void method1318(class221 arg0, int arg1, int arg2) {
        if (arg1 == -7417) {
            if (arg2 == 5) {
                this.field3192 = arg0.method1524((byte) 121);
            }
            field3189++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLii;)V", line = 28)
    public final void method1319(boolean arg0, class221 arg1) {
        field3186++;
        while (true) {
            int var3 = arg1.method1509(arg0);
            if (var3 == 0) {
                if (!arg0) {
                    this.field3192 = 94;
                }
                return;
            }
            this.method1318(arg1, -7417, var3);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 59)
    public static void method1320(byte arg0) {
        field3193 = null;
        field3197 = null;
        field3196 = null;
        field3190 = null;
        if (arg0 < 69) {
            field3191 = -38;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 73)
    public static final void method1321(int arg0, int arg1) {
        field3187++;
        if (!class186.method1226(arg1, 0)) {
            return;
        }
        class253[] var2 = class256.field4376[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class253 var4 = var2[var3];
            if (var4 != null) {
                var4.field4336 = 0;
                var4.field4191 = 0;
            }
        }
    }
}
