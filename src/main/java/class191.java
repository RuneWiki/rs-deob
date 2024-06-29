import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class191 extends class540 {

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "Z")
    public static boolean field2476 = false;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "Ljb;")
    public static class519 field2479 = new class519(1, 2);

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "D")
    public static double field2480;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "Ltd;")
    public static class478 field2474;

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Luq;Luq;Lpca;)V")
    public class191(class172 arg0, class172 arg1, class744 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZIII)V")
    public final void method1265(boolean arg0, int arg1, int arg2, int arg3) {
        ++field2481;
        if (arg1 != 10) {
            this.method1265(false, 78, -112, -101);
        }
        int var5 = this.method3129(8324) * super.field7476.field4708 / 10000;
        class375.field5490.method434(arg2, arg3 + 2, var5, super.field7476.field4710 + -2, ((class744) super.field7476).field10054, 0);
        class375.field5490.method434(arg2 + var5, arg3 - -2, -var5 + super.field7476.field4708, super.field7476.field4710 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
    public static void method1266(int arg0) {
        field2479 = null;
        if (arg0 == 10) {
            field2474 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZI)V")
    public final void method1267(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 != -19726) {
            this.method1265(false, 45, 106, 90);
        }
        ++field2478;
        class375.field5490.method539(arg0 - 2, arg3, super.field7476.field4708 + 4, super.field7476.field4710 + 2, ((class744) super.field7476).field10057, 0);
        class375.field5490.method539(arg0 + -1, arg3 + 1, super.field7476.field4708 + 2, super.field7476.field4710, 0, 0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)Z")
    public static final boolean method1268(int arg0, byte arg1) {
        ++field2475;
        if (arg1 >= -38) {
            field2479 = null;
        }
        return arg0 == 3 || arg0 == 4 || arg0 == 13 || arg0 == 49 || arg0 == 30 || ~arg0 == -11 || ~arg0 == -58;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1269(int arg0, long arg1) {
        ++field2477;
        class791.field10861.setTime(new Date(arg1));
        int var3 = class791.field10861.get(7);
        int var4 = class791.field10861.get(5);
        int var5 = class791.field10861.get(2);
        if (arg0 != 10) {
            method1269(62, 20L);
        }
        int var6 = class791.field10861.get(1);
        int var7 = class791.field10861.get(11);
        int var8 = class791.field10861.get(12);
        int var9 = class791.field10861.get(13);
        return class652.field8792[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class651.field8786[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
