import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class618 extends class26 {

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "[Lrd;")
    public class357[] field8332;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Ljw;")
    public static class581 field8336 = new class581(43, 3);

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "[I")
    public static int[] field8334;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3393(int arg0, boolean arg1, int arg2) {
        field8333++;
        if (!arg1) {
            field8334 = null;
        }
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "([Lrd;)V")
    public class618(class357[] arg0) {
        this.field8332 = arg0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public static void method3394(byte arg0) {
        field8336 = null;
        if (arg0 != -105) {
            field8334 = null;
        }
        field8334 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Lgs;")
    public static final class48 method3395(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3272;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
    public static final void method3396(int arg0) {
        field8335++;
        if (!class589.field7912 && arg0 == -1) {
            class281.field4142 += (12.0F - class281.field4142) / 2.0F;
            class757.field10501 = true;
            class589.field7912 = true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZZLqb;I)V")
    public static final void method3397(boolean arg0, boolean arg1, class237 arg2, int arg3) {
        field8339++;
        int var4 = arg2.field3202;
        int var5 = (int) arg2.field1409;
        arg2.method792((byte) -98);
        if (arg1) {
            class506.method2929(arg3 ^ 0xFAD4EC8B, var4);
        }
        class583.method3246(var4, 0);
        class668 var6 = class536.method3067(var5, 0);
        if (var6 != null) {
            class763.method4242(var6, true);
        }
        class599.method3329(true);
        if (!arg0 && class69.field968 != -1) {
            class274.method1782((byte) -47, 1, class69.field968);
        }
        if (arg3 != -86709072) {
            method3397(false, true, null, -26);
        }
        class394 var7 = new class394(class609.field8283);
        for (class237 var8 = (class237) var7.method2490(51); var8 != null; var8 = (class237) var7.method2486((byte) -121)) {
            if (!var8.method790(1)) {
                var8 = (class237) var7.method2490(arg3 + 86709125);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field3196 == 3) {
                int var9 = (int) var8.field1409;
                if ((var9 >>> 16) == var4) {
                    method3397(arg0, true, var8, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)V")
    public static final void method3398(int arg0, byte arg1) {
        class232.field3167 = -1;
        field8337++;
        if (arg1 != 77) {
            method3397(true, true, null, 94);
        }
        class66.field947 = arg0;
        class232.field3167 = -1;
        class155.method1131((byte) 96);
    }
}
