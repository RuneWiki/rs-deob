import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class552 extends class95 {

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field7449;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Lgca;")
    public static class227 field7451 = new class227();

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "Llh;")
    public static class487 field7453 = new class487(4, -1);

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field7454 = -1;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
    public static void method3097(int arg0) {
        field7451 = null;
        if (arg0 != -22545) {
            field7451 = null;
        }
        field7453 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILac;)Lcca;")
    public static final class224 method3098(int arg0, class501 arg1) {
        field7452++;
        String var2 = arg1.method2851((byte) -126);
        class594 var3 = class154.method1103((byte) 124)[arg1.method2874((byte) -75)];
        class12 var4 = class568.method3248(-1)[arg1.method2874((byte) -75)];
        int var5 = arg1.method2875(false);
        int var6 = arg1.method2875(false);
        int var7 = arg1.method2874((byte) -75);
        int var8 = arg1.method2874((byte) -75);
        int var9 = arg1.method2874((byte) -75);
        int var10 = arg1.method2845(-1);
        int var11 = arg1.method2845(-1);
        int var12 = arg1.method2840(false);
        int var13 = arg1.method2840(false);
        if (arg0 != -16094) {
            field7453 = null;
        }
        int var14 = arg1.method2840(false);
        return new class224(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method692(int arg0) {
        int var2 = -102 / ((-arg0 - 10) / 33);
        field7450++;
        return this.field7449;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class552(Object arg0, int arg1) {
        super(arg1);
        this.field7449 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public static final void method3099(int arg0, int arg1) {
        class390 var2 = class295.field4051[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class390 var4 = class295.field4051[var3][arg0][arg1] = class295.field4051[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class467 var5 = var4.field5536; var5 != null; var5 = var5.field6421) {
                    class210 var6 = var5.field6419;
                    if (var6.field2972 == arg0 && var6.field2963 == arg1) {
                        var6.field4053--;
                    }
                }
                if (var4.field5524 != null) {
                    var4.field5524.field4053--;
                }
                if (var4.field5525 != null) {
                    var4.field5525.field4053--;
                }
                if (var4.field5529 != null) {
                    var4.field5529.field4053--;
                }
                if (var4.field5533 != null) {
                    var4.field5533.field4053--;
                }
                if (var4.field5532 != null) {
                    var4.field5532.field4053--;
                }
            }
        }
        if (class295.field4051[0][arg0][arg1] == null) {
            class295.field4051[0][arg0][arg1] = new class390(0);
            class295.field4051[0][arg0][arg1].field5530 = 1;
        }
        class295.field4051[0][arg0][arg1].field5534 = var2;
        class295.field4051[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)Z")
    public final boolean method696(byte arg0) {
        field7448++;
        if (arg0 <= 72) {
            field7453 = null;
        }
        return false;
    }
}
