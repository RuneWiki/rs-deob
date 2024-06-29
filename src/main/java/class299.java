import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class299 {

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field4856 = 0;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Ljk;")
    public static class101 field4857;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lg;")
    public static class181 field4852;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lnk;", line = 5)
    public static final class16 method2137(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class16 var4 = var3.field5102;
            var3.field5102 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V", line = 22)
    public static final void method2138(int arg0, byte arg1) {
        class170.field2809 = -1;
        class170.field2809 = -1;
        field4854++;
        class206.field3449 = arg0;
        class146.method999(475249384);
        if (arg1 != 20) {
            method2142(-39, -78, 88, 59, -41, 105, -71, 14);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IB)I", line = 43)
    public static final int method2139(int arg0, byte arg1) {
        if (class127.field2224 != null) {
            class127.field2224.method1646((byte) 92);
            class127.field2224 = null;
        }
        class341.field5410++;
        field4858++;
        if (class341.field5410 > 4) {
            class341.field5410 = 0;
            class79.field1407 = 0;
            return arg0;
        }
        class79.field1407 = 0;
        if (arg1 > -68) {
            field4856 = -99;
        }
        if (class46.field932 == class129.field2238) {
            class129.field2238 = class293.field4746;
        } else {
            class129.field2238 = class46.field932;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILoe;)V", line = 80)
    public static final void method2140(int arg0, class146 arg1) {
        field4853++;
        int var2 = arg1.method1020(true);
        class339.field5377 = new class194[var2];
        if (arg0 != -20874) {
            field4856 = -53;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class339.field5377[var3] = new class194();
            class339.field5377[var3].field3259 = arg1.method1020(true);
            class339.field5377[var3].field3269 = arg1.method1019((byte) 85);
        }
        class310.field5057 = arg1.method1020(true);
        class282.field4619 = arg1.method1020(true);
        class351.field5615 = arg1.method1020(true);
        class212.field3509 = new class191[class282.field4619 + 1 - class310.field5057];
        for (int var4 = 0; var4 < class351.field5615; var4++) {
            int var5 = arg1.method1020(true);
            class191 var6 = class212.field3509[var5] = new class191();
            var6.field3614 = arg1.method1005((byte) 122);
            var6.field3625 = arg1.method1004(3);
            var6.field3237 = class310.field5057 + var5;
            var6.field3240 = arg1.method1019((byte) 85);
            var6.field3235 = arg1.method1019((byte) 85);
        }
        class76.field1375 = arg1.method1004(3);
        class205.field3416 = true;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 130)
    public static void method2141(byte arg0) {
        int var1 = 93 % ((arg0 - 17) / 48);
        field4852 = null;
        field4857 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIII)V", line = 144)
    public static final void method2142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4855++;
        class223.method1563(arg7, arg1, arg4, arg3, arg0, arg6, arg5, arg2, -13663);
    }
}
