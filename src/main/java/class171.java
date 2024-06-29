import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class171 extends class151 {

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lwj;")
    public static class277 field2961 = null;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lbd;")
    public static class162 field2963 = class17.method142(0, "0(U");

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lbd;")
    public static class162 field2968 = class17.method142(0, " GMT");

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lob;")
    public static class78 field2970 = null;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Lbd;")
    private static class162 field2976 = class17.method142(0, "scroll:");

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lbd;")
    public static class162 field2967 = field2976;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lbd;")
    public static class162 field2972 = field2976;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "B")
    public byte field2974;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lbd;")
    public class162 field2964;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lbd;")
    public class162 field2965;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBIII)V", line = 5)
    public static final void method1313(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class63 var5 = class46.method332(10, arg3, -12770);
        if (arg1 < 114) {
            return;
        }
        var5.method430(false);
        var5.field980 = arg4;
        var5.field976 = arg0;
        field2973++;
        var5.field971 = arg2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZ)I", line = 33)
    public static final int method1314(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return 33;
        }
        field2971++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 72)
    public static void method1315(int arg0) {
        field2963 = null;
        if (arg0 != -2) {
            method1314(-67, 39, true);
        }
        field2970 = null;
        field2967 = null;
        field2972 = null;
        field2968 = null;
        field2976 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lob;III)V", line = 128)
    public static final void method1316(class78 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field1254 == 0) {
            arg0.field1377 = arg0.field1375;
        } else if (arg0.field1254 == 1) {
            arg0.field1377 = (arg3 - arg0.field1340) / 2 + arg0.field1375;
        } else if (arg0.field1254 == 2) {
            arg0.field1377 = arg3 - (arg0.field1375 + arg0.field1340);
        } else if (arg0.field1254 == 3) {
            arg0.field1377 = arg0.field1375 * arg3 >> 14;
        } else if (arg0.field1254 == 4) {
            arg0.field1377 = (arg0.field1375 * arg3 >> 14) + (arg3 - arg0.field1340) / 2;
        } else {
            arg0.field1377 = arg3 - ((arg0.field1375 * arg3 >> 14) + arg0.field1340);
        }
        field2977++;
        if (arg0.field1244 == 0) {
            arg0.field1289 = arg0.field1239;
        } else if (arg0.field1244 == 1) {
            arg0.field1289 = (arg1 - arg0.field1367) / 2 + arg0.field1239;
        } else if (arg0.field1244 == 2) {
            arg0.field1289 = arg1 - arg0.field1367 - arg0.field1239;
        } else if (arg0.field1244 == 3) {
            arg0.field1289 = arg0.field1239 * arg1 >> 14;
        } else if (arg0.field1244 == 4) {
            arg0.field1289 = (arg0.field1239 * arg1 >> 14) + (arg1 - arg0.field1367) / 2;
        } else {
            arg0.field1289 = arg1 - arg0.field1367 - (arg0.field1239 * arg1 >> 14);
        }
        if (arg2 != -30241 || !class255.field4223 || !(client.method861(arg0) != 0 || arg0.field1231 == 0)) {
            return;
        }
        if (arg0.field1377 < 0) {
            arg0.field1377 = 0;
        } else if (arg0.field1377 + arg0.field1340 > arg3) {
            arg0.field1377 = arg3 - arg0.field1340;
        }
        if (arg0.field1289 < 0) {
            arg0.field1289 = 0;
        } else if (arg1 < arg0.field1367 + arg0.field1289) {
            arg0.field1289 = arg1 - arg0.field1367;
        }
    }
}
