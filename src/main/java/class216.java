import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class216 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field3214 = -1;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Ltl;")
    public static class400 field3215 = new class400(64);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILuh;)V")
    public static final void method1436(int arg0, class375 arg1) {
        if (arg1.field5605 != null) {
            arg1.field5605.field2119 = 0;
        }
        field3213++;
        arg1.field5606 = false;
        class375 var2 = arg1.method86();
        if (arg0 < 23) {
            method1436(48, (class375) null);
        }
        while (var2 != null) {
            method1436(87, var2);
            var2 = arg1.method85();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ltq;)V")
    public static final void method1437(class63 arg0) {
        for (int var1 = class426.field6093; var1 < class344.field5192; var1++) {
            for (int var2 = 0; var2 < class412.field5957; var2++) {
                for (int var3 = 0; var3 < class315.field4743; var3++) {
                    class337 var4 = class170.field2427[var1][var2][var3];
                    if (var4 != null) {
                        class100 var5 = var4.field5044;
                        class100 var6 = var4.field5047;
                        if (var5 != null && var5.method253(-16)) {
                            class324.method1995(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method253(-40)) {
                                class324.method1995(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method245((byte) -120, false, arg0, var5, 0, 0, 0);
                                var6.method249(94);
                            }
                            var5.method249(94);
                        }
                        for (class448 var7 = var4.field5054; var7 != null; var7 = var7.field6340) {
                            class305 var9 = var7.field6343;
                            if (var9 != null && var9.method253(-24)) {
                                class324.method1995(arg0, var9, var1, var2, var3, var9.field4541 + 1 - var9.field4542, var9.field4552 - var9.field4547 + 1);
                                var9.method249(116);
                            }
                        }
                        class47 var8 = var4.field5063;
                        if (var8 != null && var8.method253(-110)) {
                            class493.method2888(arg0, var8, var1, var2, var3);
                            var8.method249(103);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method1438(int arg0, int arg1) {
        field3216++;
        class186 var2 = class275.method1789(arg0, (byte) 123, 2);
        var2.method1279((byte) -65);
        if (arg1 != 0) {
            field3214 = -106;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method1439(int arg0) {
        if (arg0 != 1) {
            method1439(-32);
        }
        field3215 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIIIII)I")
    public static final int method1440(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg1;
            arg1 = var7;
        }
        int var8 = arg2 & 0x3;
        field3212++;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 1 + 7 - arg4 - arg6;
        } else {
            if (arg0 <= 9) {
                method1438(-44, 98);
            }
            return var8 == 2 ? 1 + 7 - arg1 - arg5 : arg6;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method1441(byte arg0) {
        if (arg0 > -109) {
            method1436(-38, (class375) null);
        }
        field3217++;
        class184.field2744.method2299((byte) -33);
        class106.field1484.method2299((byte) -120);
    }
}
