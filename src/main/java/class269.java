import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class269 {

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lid;")
    public static class149 field4850 = class60.method382(")4p=", (byte) 37);

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lid;")
    public static class149 field4852 = class60.method382("<)4col>", (byte) 107);

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lid;")
    public static class149 field4854 = class60.method382("Sprites geladen)3", (byte) 8);

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field4849 = 0;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Z")
    public static boolean field4855 = false;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lal;")
    public static class230 field4841;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lal;")
    public static class230 field4851;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lgh;")
    public static class24 field4848;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method1871(byte arg0) {
        field4843++;
        if (!class136.field2503) {
            return;
        }
        class251.field4408 = null;
        class86.field1574 = null;
        class136.field2503 = false;
        if (arg0 >= -31) {
            method1875(-81);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILpb;)V")
    public static final void method1872(int arg0, int arg1, int arg2, class127 arg3) {
        if (arg0 > -13) {
            return;
        }
        if (arg3.field2349 == arg1 && arg1 != -1) {
            class164 var4 = class69.method436(arg1, -32);
            int var5 = var4.field3030;
            if (var5 == 1) {
                arg3.field2405 = 0;
                arg3.field2397 = 0;
                arg3.field2318 = 1;
                arg3.field2406 = arg2;
                arg3.field2355 = 0;
                class94.method686(var4, arg3.field2340, -109, arg3.field2347, class77.field1449 == arg3, arg3.field2397);
            }
            if (var5 == 2) {
                arg3.field2405 = 0;
            }
        } else if (arg1 == -1 || arg3.field2349 == -1 || class69.method436(arg1, -32).field3036 >= class69.method436(arg3.field2349, -32).field3036) {
            arg3.field2405 = 0;
            arg3.field2355 = 0;
            arg3.field2406 = arg2;
            arg3.field2318 = 1;
            arg3.field2341 = arg3.field2327;
            arg3.field2349 = arg1;
            arg3.field2397 = 0;
            if (arg3.field2349 != -1) {
                class94.method686(class69.method436(arg3.field2349, -32), arg3.field2340, -108, arg3.field2347, class77.field1449 == arg3, arg3.field2397);
            }
        }
        field4846++;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Lsi;")
    public static final class198 method1873(byte arg0) {
        field4847++;
        class282 var1 = new class282(class251.field4406, class286.field5082, class147.field2651[0], class18.field259[0], class283.field5005[0], class55.field991[0], class73.field1276[0], class108.field1865);
        class103.method731(false);
        if (arg0 <= 118) {
            field4844 = -77;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLob;)V")
    public static final void method1874(byte arg0, class131 arg1) {
        if (arg0 != 32) {
            method1872(-59, 122, -80, (class127) null);
        }
        field4845++;
        if (class118.field2022 == arg1.field2348 || arg1.field2349 == -1 || arg1.field2406 != 0 || (arg1.field2355 + 1) > class69.method436(arg1.field2349, -32).field3060[arg1.field2397]) {
            int var2 = class118.field2022 - arg1.field2328;
            int var3 = arg1.field2348 - arg1.field2328;
            int var4 = arg1.field2395 * 128 + (arg1.method885((byte) -49) * 64);
            int var5 = arg1.field2380 * 128 + arg1.method885((byte) -34) * 64;
            int var6 = arg1.field2310 * 128 + (arg1.method885((byte) -70) * 64);
            int var7 = arg1.field2332 * 128 + arg1.method885((byte) -40) * 64;
            arg1.field2347 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field2340 = ((var3 - var2) * var5 + (var2 * var7)) / var3;
        }
        arg1.field2401 = 0;
        if (arg1.field2379 == 0) {
            arg1.field2335 = 1024;
        }
        if (arg1.field2379 == 1) {
            arg1.field2335 = 1536;
        }
        if (arg1.field2379 == 2) {
            arg1.field2335 = 0;
        }
        if (arg1.field2379 == 3) {
            arg1.field2335 = 512;
        }
        arg1.field2354 = arg1.field2335;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1875(int arg0) {
        field4850 = null;
        field4841 = null;
        field4852 = null;
        field4848 = null;
        field4854 = null;
        if (arg0 != -8317) {
            method1873((byte) -86);
        }
        field4851 = null;
    }
}
