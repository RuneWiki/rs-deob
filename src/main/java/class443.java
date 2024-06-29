import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class443 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lmia;")
    public static class63 field6588 = new class63(57, 0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2750(boolean arg0) {
        if (!arg0) {
            field6588 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BJ)V", line = 20)
    public static final void method2751(byte arg0, long arg1) {
        if (arg0 != -55) {
            return;
        }
        field6587++;
        int var3 = class189.field2869;
        int var4 = class537.field7685;
        if (class383.field5783 != var3) {
            int var5 = var3 - class383.field5783;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class383.field5783 += var6;
        }
        class255.field3659 += (float) arg1 * class32.field330 / 40.0F * 8.0F;
        if (class398.field5951 != var4) {
            int var7 = var4 - class398.field5951;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class398.field5951 += var8;
        }
        class418.field6261 += (float) arg1 * class724.field10112 / 40.0F * 8.0F;
        class378.method2444(false);
    }
}
