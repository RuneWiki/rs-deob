import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class734 {

    @OriginalMember(owner = "client!it", name = "h", descriptor = "J")
    private long field10275;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    private int field10268;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Lnha;")
    public static class501 field10269 = new class501("", 17);

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Lon;")
    public static class727 field10272 = class407.method2412((byte) -40);

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field10270;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field10271;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field10273;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field10274;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field10277;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
    public final int method4105(int arg0) {
        field10274++;
        if (arg0 >= -76) {
            field10269 = null;
        }
        return this.field10268;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I[Lac;)V")
    public static final void method4106(int arg0, class712[] arg1) {
        field10276++;
        class502.field7071 = arg1.length;
        if (arg0 != 12) {
            return;
        }
        class289.field3681 = new class712[class502.field7071 + 10];
        class367.field5193 = new int[class502.field7071 + 10];
        class617.method3390(arg1, 0, class289.field3681, 0, class502.field7071);
        for (int var2 = 0; var2 < class502.field7071; var2++) {
            class367.field5193[var2] = class289.field3681[var2].method1882();
        }
        for (int var3 = class502.field7071; var3 < class289.field3681.length; var3++) {
            class367.field5193[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public static void method4107(int arg0) {
        field10272 = null;
        field10269 = null;
        if (arg0 != 0) {
            field10272 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lug;Z)V")
    private final void method4108(class453 arg0, boolean arg1) {
        field10270++;
        if (!arg1) {
            this.field10275 |= (arg0.field6347 << class453.field6356 * this.field10268++);
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lug;)V")
    public class734(class453 arg0) {
        this.field10275 = arg0.field6347;
        this.field10268 = 1;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "([Lug;)V")
    public class734(class453[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method4108(arg0[var2], false);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I")
    private final int method4109(int arg0, byte arg1) {
        if (arg1 < 21) {
            field10272 = null;
        }
        field10273++;
        return (int) (this.field10275 >> class453.field6356 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method4110(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field10271++;
        if ((arg2 - arg4) >= class108.field1334 && (arg2 + arg4) <= class592.field8242 && arg6 - arg4 >= class112.field1386 && (arg4 + arg6) <= class328.field4190) {
            class49.method404(arg1, arg4, arg0, arg2, arg3, arg6, -10673);
        } else {
            class657.method3567(-1, arg3, arg0, arg4, arg1, arg6, arg2);
        }
        if (arg5) {
            method4110(-46, 32, 43, 92, 105, true, 81);
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(IB)Lug;")
    public final class453 method4111(int arg0, byte arg1) {
        if (arg1 >= -42) {
            this.field10268 = 93;
        }
        field10277++;
        return class453.method2656((byte) -66, this.method4109(arg0, (byte) 102));
    }
}
