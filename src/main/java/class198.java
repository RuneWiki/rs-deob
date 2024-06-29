import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class198 extends class60 {

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "Llf;")
    public static class251 field2358 = new class251(7, 2);

    @OriginalMember(owner = "client!qga", name = "r", descriptor = "Ltja;")
    public static class288 field2363 = new class288(128, 4);

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!qga", name = "o", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!qga", name = "p", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!qga", name = "s", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2366;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public static void method1288(int arg0) {
        if (arg0 == 3) {
            field2363 = null;
            field2366 = null;
            field2358 = null;
        }
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(B)Z")
    public final boolean method1289(byte arg0) {
        ++field2359;
        if (arg0 >= -61) {
            return false;
        } else {
            return !super.field798.method4287((byte) 62);
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)I")
    public final int method1290(int arg0) {
        ++field2362;
        return arg0 != 0 ? -82 : super.field799;
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lhd;)V")
    public class198(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field2365;
        if (arg0 != 0) {
            field2363 = null;
        }
        return super.field798.method4287((byte) 63) ? 3 : 1;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILkq;)V")
    public static final void method1291(int arg0, class620 arg1) {
        ++field2356;
        if (class104.field1336) {
            if (arg0 == 128) {
                ++class368.field4583;
                if (arg1.field8493 != null) {
                    class620 var2 = class481.method2859(class351.field4370, class215.field2531, arg0 ^ 16255);
                    if (var2 != null) {
                        class529 var3 = new class529();
                        var3.field7473 = arg1;
                        var3.field7472 = var2;
                        var3.field7477 = arg1.field8493;
                        class142.method1045(var3);
                    }
                }
                class336 var4 = class512.method3076(class576.field7870, class591.field8030, (byte) 96);
                var4.field4150.method2391(-105, arg1.field8515);
                var4.field4150.method2407(class351.field4370, (byte) -124);
                var4.field4150.method2391(arg0 ^ -141, class215.field2531);
                var4.field4150.method2422(29933, arg1.field8445);
                var4.field4150.method2422(arg0 ^ 29805, arg1.field8438);
                var4.field4150.method2422(29933, class520.field7344);
                class578.method3334(4, var4);
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(ILhd;)V")
    public class198(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        ++field2360;
        if (arg0 < -27) {
            if (super.field798.method4287((byte) 54)) {
                super.field799 = 2;
            }
            if (super.field799 < 0 || super.field799 > 2) {
                super.field799 = this.method405(false);
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        super.field799 = arg1;
        int var3 = 17 % ((arg0 - 28) / 50);
        ++field2357;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Les;B)Llh;")
    public static final class553 method1292(class403 arg0, byte arg1) {
        ++field2361;
        class105 var2 = class625.method3549((byte) 88)[arg0.method2396((byte) -107)];
        class4 var3 = class716.method4046((byte) 127)[arg0.method2396((byte) -112)];
        int var4 = -124 / ((arg1 - 20) / 37);
        int var5 = arg0.method2365(true);
        int var6 = arg0.method2365(true);
        int var7 = arg0.method2390((byte) 19);
        int var8 = arg0.method2390((byte) -98);
        int var9 = arg0.method2365(true);
        int var10 = arg0.method2381((byte) 42);
        int var11 = arg0.method2381((byte) 99);
        return new class553(var2, var3, var5, var6, var7, var8, var9, var10, var11);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        if (arg0) {
            return 15;
        } else {
            ++field2364;
            if (super.field798.method4287((byte) 57)) {
                return 2;
            } else {
                return super.field798.field10665.method1905(14784) && class62.method537(super.field798.field10665.method1903(0), 2) ? 1 : 0;
            }
        }
    }
}
