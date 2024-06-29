import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class182 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field2679 = 0;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field2677 = 0;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field2684 = -1;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lvn;")
    public class209 field2681;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lci;Ll;I)V")
    public static final void method1259(class320 arg0, class16 arg1, int arg2) {
        class483.field7009 = arg1;
        if (arg2 == -6) {
            field2686++;
            class83.field1320 = arg0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILwn;)Lom;")
    public static final class258 method1260(int arg0, class519 arg1) {
        if (arg0 != 0) {
            field2677 = 105;
        }
        field2680++;
        class258 var2 = new class258();
        var2.field3822 = arg1.method3018(566990904);
        var2.field3824 = class363.field5277.method3120(-93, var2.field3822);
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BZ)V")
    public static final void method1261(byte arg0, boolean arg1) {
        class132.field2064 = 0;
        field2678++;
        class162.field2458 = 0;
        class41.method410((byte) 81);
        class451.method2688(112, arg1);
        class533.method3156(arg0 ^ 0x6D14);
        boolean var2 = false;
        for (int var3 = 0; var3 < class132.field2064; var3++) {
            int var5 = class202.field3122[var3];
            class193 var6 = (class193) class390.field5539.method2284(true, (long) var5);
            class279 var7 = var6.field2805;
            if (class248.field3714 && class267.method1720(var5, (byte) 117)) {
                class287.method1838(true);
            }
            if (class24.field349 != var7.field237) {
                if (var7.field4157.method1976(-55)) {
                    class173.method1217((byte) 108, var7);
                }
                var7.method1793(null, arg0 ^ 0x9);
                var6.method421(22071);
                var2 = true;
            }
        }
        if (var2) {
            class329.field4838 = class390.field5539.method2294((byte) 76);
            class390.field5539.method2287((byte) 103, class221.field3375);
        }
        if (class305.field4527 != class336.field4966.field7558) {
            throw new RuntimeException("gnp1 pos:" + class336.field4966.field7558 + " psize:" + class305.field4527);
        }
        for (int var4 = 0; var4 < class477.field6952; var4++) {
            if (class390.field5539.method2284(true, (long) class483.field7012[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class477.field6952);
            }
        }
        if (arg0 != -116) {
            method1265(null, 48);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        field2676++;
        if (arg0 != -16 || class141.field2180) {
            return;
        }
        class472.field6873 = true;
        class141.field2180 = true;
        if (class220.field3371.field2554) {
            class524.field7655 = ((int) class524.field7655 - 17 & 0xFFFFFFF0);
        } else {
            class294.field4384 += (-class294.field4384 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILki;)I")
    public static final int method1263(int arg0, class510 arg1) {
        if (arg0 != 2048) {
            method1261((byte) 71, true);
        }
        field2683++;
        int var2 = arg1.field7378;
        class236 var3 = arg1.method139((byte) -62);
        if (arg1.field240) {
            var2 = arg1.field7384;
        } else if (arg1.field248 == var3.field3515 || arg1.field248 == var3.field3554 || arg1.field248 == var3.field3524 || arg1.field248 == var3.field3533) {
            var2 = arg1.field7358;
        } else if (arg1.field248 == var3.field3553 || arg1.field248 == var3.field3544 || arg1.field248 == var3.field3522 || arg1.field248 == var3.field3542) {
            var2 = arg1.field7391;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILtf;)V")
    public static final void method1264(int arg0, class198 arg1) {
        field2685++;
        class198 var2 = class3.method10(arg1, (byte) -34);
        if (arg0 != 18837) {
            field2684 = -59;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class50.field927;
            var4 = class76.field1247;
        } else {
            var4 = var2.field2988;
            var3 = var2.field3008;
        }
        class472.method2799(arg1, var4, (byte) 127, var3, false);
        class112.method794(var3, var4, arg1, (byte) -80);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ltf;I)V")
    public static final void method1265(class198 arg0, int arg1) {
        if (~arg0.field2941 == arg1 && arg0.field2952 != -1) {
            class471.method2790(class76.field1256, (byte) -122, arg0);
        }
        field2675++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static final void method1266(byte arg0) {
        if (arg0 != 57) {
            return;
        }
        if (class76.field1256 != null) {
            class302.field4481.method901(-1);
            class101.method745();
            class322.method2064(false);
            class47.method440(14490);
            class66.method531(false);
            class371.method2271(arg0 ^ 0xFFFFFFC5);
            if (class391.field5551 != null) {
                class391.field5551.method2075(-29545);
            }
            class545.method3201(18621);
            class501.method2928(false);
            class417.method2492((byte) 123);
            class275.method1776(arg0 - 30253, false);
            class421.method2503(false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class510 var5 = class494.field7143[var1];
                if (var5 != null) {
                    var5.field341 = null;
                    for (int var6 = 0; var6 < var5.field334.length; var6++) {
                        var5.field334[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class329.field4838; var2++) {
                class279 var3 = class221.field3375[var2].field2805;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field334.length; var4++) {
                        var3.field334[var4] = null;
                    }
                }
            }
            class289.field4283 = null;
            class94.field1503 = null;
            class76.field1256.method1197((byte) -48);
            class76.field1256 = null;
        }
        field2682++;
    }
}
