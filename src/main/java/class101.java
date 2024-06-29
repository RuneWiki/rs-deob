import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class101 extends class259 {

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[I")
    public int[] field1713 = new int[1];

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "[I")
    public int[] field1717 = new int[] { -1 };

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "[I")
    public static int[] field1714 = new int[50];

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1708 = "glow3:";

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
    public static boolean field1710 = false;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Lie;")
    public static class2 field1715;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public static void method790(int arg0) {
        field1715 = null;
        field1708 = null;
        field1714 = null;
        if (arg0 != 1326) {
            method792(true, -12);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Llc;ZIILlc;)Lmm;")
    public static final class114 method791(class270 arg0, boolean arg1, int arg2, int arg3, class270 arg4) {
        field1711++;
        int[] var5 = arg4.method1866((byte) -69, arg3);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg4.method1893(var5[var7], true, arg3);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method1893(var9, true, 0);
                } else {
                    var10 = arg0.method1893(0, true, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        if (arg2 <= 58) {
            field1714 = null;
        }
        try {
            return new class114(arg4, arg0, arg3, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)Z")
    public static final boolean method792(boolean arg0, int arg1) {
        field1712++;
        if (!arg0) {
            method790(126);
        }
        return (arg1 & -arg1) == arg1;
    }
}
