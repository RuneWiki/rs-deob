import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class483 {

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lqv;")
    public static class316 field7010 = new class316(101, 28);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field7012 = new int[1024];

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Ll;")
    public static class16 field7009;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Lrj;", line = 3)
    public static final class430 method2848(int arg0, int arg1) {
        field7007++;
        class430[] var2 = class469.method2780(false);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class430 var4 = var2[var3];
            if (var4.field6186 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILki;IB)V", line = 28)
    public static final void method2849(int arg0, class510 arg1, int arg2, byte arg3) {
        field7011++;
        if (arg1.field274 == arg0 && arg0 != -1) {
            class183 var4 = class96.field1526.method2717(-108, arg0);
            int var5 = var4.field2687;
            if (var5 == 1) {
                arg1.field320 = 0;
                arg1.field269 = 0;
                arg1.field251 = 1;
                arg1.field261 = arg2;
                arg1.field243 = 0;
                class511.method2983(arg1.field6961, arg1.field320, arg1.field6965, -64, class364.field5293 == arg1, var4, arg1.field6956);
            }
            if (var5 == 2) {
                arg1.field269 = 0;
            }
        } else if (arg0 == -1 || arg1.field274 == -1 || class96.field1526.method2717(-108, arg0).field2688 >= class96.field1526.method2717(-120, arg1.field274).field2688) {
            arg1.field335 = arg1.field333;
            arg1.field251 = 1;
            arg1.field320 = 0;
            arg1.field243 = 0;
            arg1.field269 = 0;
            arg1.field274 = arg0;
            arg1.field261 = arg2;
            if (arg1.field274 != -1) {
                class511.method2983(arg1.field6961, arg1.field320, arg1.field6965, -64, class364.field5293 == arg1, class96.field1526.method2717(-95, arg1.field274), arg1.field6956);
            }
        }
        if (arg3 > -57) {
            field7010 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 81)
    public static final void method2850(byte arg0) {
        field7006++;
        int var1 = 0;
        if (arg0 != 101) {
            return;
        }
        for (int var2 = 0; var2 < class69.field1139; var2++) {
            for (int var3 = 0; var3 < class255.field3763; var3++) {
                if (class438.method2577(var1, class461.field6675, (byte) -127, true, var3, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 123)
    public static void method2851(int arg0) {
        field7010 = null;
        field7009 = null;
        int var1 = -126 % ((-arg0 - 48) / 36);
        field7012 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V", line = 138)
    public static final void method2852(int arg0, boolean arg1) {
        class228.method1528(true, class484.field7020);
        class110.field1631++;
        if (arg0 != 0) {
            return;
        }
        field7008++;
        for (class541 var2 = (class541) class220.field3370.method2285(arg0 ^ 0x5D); var2 != null; var2 = (class541) class220.field3370.method2283((byte) 11)) {
            if (!var2.method416((byte) -80)) {
                var2 = (class541) class220.field3370.method2285(77);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field7956 == 0) {
                class126.method937(true, var2, true, arg1);
            }
        }
        if (class65.field1112 != null) {
            class284.method1832(-17067, class65.field1112);
            class65.field1112 = null;
        }
    }
}
