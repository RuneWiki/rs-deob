import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class462 extends class321 {

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    private int field6361;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    private int field6367;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    private int field6365;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    private int field6366;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    private int field6363;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    private int field6359;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Lnv;")
    private class382 field6364;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Llga;")
    public static class663 field6369 = new class663(50);

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Lhea;")
    private class388 field6362;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 16)
    public static void method2617(int arg0) {
        if (arg0 > -107) {
            field6369 = null;
        }
        field6369 = null;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lnv;IIIIII)V", line = 25)
    public class462(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6361 = arg2;
        this.field6367 = arg5;
        this.field6365 = arg6;
        this.field6366 = arg3;
        this.field6363 = arg4;
        this.field6359 = arg1;
        this.field6364 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Lhea;", line = 39)
    public final class388 method1926(byte arg0) {
        if (arg0 <= 15) {
            return null;
        }
        field6360++;
        if (this.field6362 == null) {
            class203.field2860[5] = this.field6365;
            class203.field2860[1] = this.field6361;
            class212 var2 = this.field6364.field2418;
            class203.field2860[0] = this.field6359;
            class203.field2860[4] = this.field6367;
            class203.field2860[3] = this.field6363;
            class203.field2860[2] = this.field6366;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1367(class203.field2860[var5], false)) {
                    return null;
                }
                class686 var7 = var2.method1365(-17951, class203.field2860[var5]);
                int var8 = var7.field9795 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field9780 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class34.field417[var6] = var2.method1366(false, class203.field2860[var6], var4, 1.0F, var4, (byte) -109);
            }
            this.field6362 = this.field6364.method1028(var3 != 0, class34.field417, var4, 92);
        }
        return this.field6362;
    }
}
