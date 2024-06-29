import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class166 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Leg;")
    public static class188 field2555 = new class188(4);

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lba;")
    public static class118 field2556 = new class118();

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Ljf;")
    public static class227 field2557 = new class227(8);

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lwf;")
    public static class306 field2550;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1130(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class86.field1304[var1] = false;
        }
        class90.field1364 = arg0;
        class219.field3489 = 5;
        class88.field1349 = -1;
        class27.field348 = 0;
        class253.field3939 = -1;
        field2551++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 32)
    public static void method1131(int arg0) {
        field2550 = null;
        field2557 = null;
        field2556 = null;
        field2555 = null;
        if (arg0 != 3) {
            field2550 = (class306) null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)I", line = 46)
    public static final int method1132(boolean arg0) {
        field2549++;
        if (arg0) {
            method1135(-28, 14, true, -111, -56);
        }
        if (class63.field919 != null) {
            return 3;
        } else if (class333.field5166 && class233.field3735) {
            return 2;
        } else if (class333.field5166 && !class233.field3735) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I", line = 67)
    public static final int method1133(int arg0, int arg1) {
        if (arg1 == 161862696) {
            field2554++;
            return arg0 >>> 8;
        } else {
            return -74;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIZIZI)V", line = 80)
    public static final void method1134(int arg0, byte arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field2553++;
        if (arg1 < 93) {
            field2556 = (class118) null;
        }
        if (arg4 <= arg0) {
            return;
        }
        int var7 = arg0;
        int var8 = (arg0 + arg4) / 2;
        class130 var9 = class266.field4108[var8];
        class266.field4108[var8] = class266.field4108[arg4];
        class266.field4108[arg4] = var9;
        for (int var10 = arg0; var10 < arg4; var10++) {
            if (class95.method651(class266.field4108[var10], false, var9, arg5, arg3, arg2, arg6) <= 0) {
                class130 var11 = class266.field4108[var10];
                class266.field4108[var10] = class266.field4108[var7];
                class266.field4108[var7++] = var11;
            }
        }
        class266.field4108[arg4] = class266.field4108[var7];
        class266.field4108[var7] = var9;
        method1134(arg0, (byte) 103, arg2, arg3, var7 - 1, arg5, arg6);
        method1134(var7 + 1, (byte) 119, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIZII)V", line = 130)
    public static final void method1135(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2552++;
        if (class183.method1263(arg0 ^ arg0, arg1)) {
            class177.method1201(arg2, -1, (byte) 73, arg4, class219.field3487[arg1], arg3);
        }
    }
}
