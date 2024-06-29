import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class1 implements class660 {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lpf;")
    public class759 field7;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Ldg;")
    public class20 field3;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
    public static int[] field4 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lof;")
    public static class10 field10;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 12)
    public static void method1(int arg0) {
        if (arg0 < 61) {
            field10 = null;
        }
        field4 = null;
        field10 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLsv;II)V", line = 23)
    public static final void method2(int arg0, boolean arg1, class64 arg2, int arg3, int arg4) {
        field5++;
        long var5 = (long) (arg4 | arg3 << 14 | arg0 << 28);
        class89 var7 = (class89) class407.field5401.method2616(var5, (byte) -105);
        if (var7 == null) {
            class89 var8 = new class89();
            class407.field5401.method2619(var8, var5, -1);
            var8.field1228.method3593(arg2, 15);
            return;
        }
        class48 var9 = class640.field8189.method705(arg2.field838, -11467);
        int var10 = var9.field574;
        if (var9.field632 == 1) {
            var10 = (arg2.field840 + 1) * var10;
        }
        for (class64 var11 = (class64) var7.field1228.method3591(0); var11 != null; var11 = (class64) var7.field1228.method3600((byte) 84)) {
            class48 var12 = class640.field8189.method705(var11.field838, -11467);
            int var13 = var12.field574;
            if (var12.field632 == 1) {
                var13 = (var11.field840 + 1) * var13;
            }
            if (var10 > var13) {
                class115.method670(1, var11, arg2);
                return;
            }
        }
        if (!arg1) {
            var7.field1228.method3593(arg2, 15);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Lgp;", line = 78)
    public class576 method3(byte arg0) {
        field8++;
        return arg0 >= -15 ? null : class448.field5845;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILkh;Lkh;)V", line = 89)
    public static final void method4(int arg0, class173 arg1, class173 arg2) {
        if (arg1.field2282 != null) {
            arg1.method1084((byte) 10);
        }
        if (arg0 != -2) {
            method2(29, false, null, 117, 119);
        }
        field13++;
        arg1.field2279 = arg2.field2279;
        arg1.field2282 = arg2;
        arg1.field2282.field2279 = arg1;
        arg1.field2279.field2282 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(ILpf;Ldg;II)V", line = 109)
    public class1(int arg0, class759 arg1, class20 arg2, int arg3, int arg4) {
        this.field11 = arg4;
        this.field1 = arg0;
        this.field12 = arg3;
        this.field7 = arg1;
        this.field3 = arg2;
    }
}
