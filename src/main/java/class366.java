import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class366 {

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "Ltq;")
    public static class536 field4470 = new class536(4);

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4473 = new BigInteger("8de0175bb9d1477a608107933a5a2e9409f6f08caded9789a4202792fa218cf43ab96cdd8649597627a1cbacf7a9dc0776e1f1bc7c92ffde97679d3fbe022ae1", 16);

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "Lnr;")
    public static class161 field4469;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
    public static final void method2102(byte arg0) {
        field4474++;
        class776.method4255(class430.field5649, -1007);
        class369.field4527++;
        if (class757.field10331 && class553.field7004) {
            int var1 = 0;
            int var2 = 0;
            if (class602.field7657) {
                var1 = class498.method2765((byte) -108);
                var2 = class507.method2806((byte) -104);
            }
            int var3 = var1 + class737.field9980.method210(0);
            int var4 = class737.field9980.method208(-100) + var2;
            int var5 = var3 - class251.field3426;
            int var6 = var4 - class307.field3858;
            if (class72.field978 > var5) {
                var5 = class72.field978;
            }
            if ((var5 + class430.field5649.field5117) > (class72.field978 + class198.field2759.field5117)) {
                var5 = class72.field978 + class198.field2759.field5117 - class430.field5649.field5117;
            }
            if (var6 < class330.field4040) {
                var6 = class330.field4040;
            }
            if (class430.field5649.field5031 + var6 > class330.field4040 + class198.field2759.field5031) {
                var6 = class198.field2759.field5031 + class330.field4040 - class430.field5649.field5031;
            }
            int var7 = class198.field2759.field4994 + var5 - class72.field978;
            if (arg0 <= -18) {
                int var8 = var6 - (class330.field4040 - class198.field2759.field4984);
                if (class737.field9980.method3675(2)) {
                    if (class430.field5649.field5009 < class369.field4527) {
                        int var9 = var5 - class397.field5232;
                        int var10 = var6 - class499.field6396;
                        if (class430.field5649.field5124 < var9 || (-class430.field5649.field5124) > var9 || class430.field5649.field5124 < var10 || (-class430.field5649.field5124) > var10) {
                            class614.field7749 = true;
                        }
                    }
                    if (class430.field5649.field5050 != null && class614.field7749) {
                        class244 var11 = new class244();
                        var11.field3358 = var8;
                        var11.field3350 = class430.field5649;
                        var11.field3346 = var7;
                        var11.field3349 = class430.field5649.field5050;
                        class760.method4148(var11);
                        return;
                    }
                } else {
                    if (class614.field7749) {
                        class38.method230((byte) 83);
                        if (class430.field5649.field5023 != null) {
                            class244 var12 = new class244();
                            var12.field3352 = class652.field8356;
                            var12.field3349 = class430.field5649.field5023;
                            var12.field3350 = class430.field5649;
                            var12.field3346 = var7;
                            var12.field3358 = var8;
                            class760.method4148(var12);
                        }
                        if (class652.field8356 != null && client.method2631(class430.field5649) != null) {
                            class165.method1048(class652.field8356, 55, class430.field5649);
                        }
                    } else if ((class484.field6248 == 1 || class631.method3367(true)) && class628.field7982 > 2) {
                        class652.method3525(class499.field6396 + class307.field3858, (byte) -62, class397.field5232 + class251.field3426);
                    } else if (class675.method3638(0)) {
                        class652.method3525(class499.field6396 + class307.field3858, (byte) -103, class251.field3426 + class397.field5232);
                    }
                    class430.field5649 = null;
                }
            }
        } else if (class369.field4527 > 1) {
            class430.field5649 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lhd;Z)V")
    public static final void method2103(class620 arg0, boolean arg1) {
        for (int var2 = arg0.field7852; var2 <= arg0.field7849; var2++) {
            for (int var3 = arg0.field7844; var3 <= arg0.field7850; var3++) {
                class766 var4 = class28.field252[arg0.field2895][var2][var3];
                if (var4 != null) {
                    class569 var5 = var4.field10431;
                    class569 var6 = null;
                    while (var5 != null) {
                        if (var5.field7193 == arg0) {
                            if (var6 == null) {
                                var4.field10431 = var5.field7189;
                            } else {
                                var6.field7189 = var5.field7189;
                            }
                            var5.method3064((byte) -57);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field7189;
                    }
                }
            }
        }
        if (!arg1) {
            class733.method3911(arg0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lfi;IIIB)V")
    public static final void method2104(class13 arg0, int arg1, int arg2, int arg3, byte arg4) {
        arg0.field130.method1496(arg3, (byte) 30);
        field4471++;
        arg0.field130.method1507(-531697592, arg1);
        arg0.field130.method1502(arg2, 65280);
        int var5 = 40 % ((-arg4 - 8) / 56);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static final void method2105(int arg0) {
        class356.field4337.method4021((byte) 48);
        field4472++;
        int var1 = class356.field4337.method4023(true, 8);
        if (class349.field4271 > var1) {
            for (int var2 = var1; var2 < class349.field4271; var2++) {
                class523.field6665[class341.field4183++] = class88.field1224[var2];
            }
        }
        if (var1 > class349.field4271) {
            throw new RuntimeException("gnpov1");
        }
        class349.field4271 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class88.field1224[var3];
            class727 var5 = ((class232) class444.field5811.method2616((long) var4, (byte) -90)).field3125;
            int var6 = class356.field4337.method4023(true, 1);
            if (var6 == 0) {
                class88.field1224[class349.field4271++] = var4;
                var5.field4662 = class100.field1330;
            } else {
                int var7 = class356.field4337.method4023(true, 2);
                if (var7 == 0) {
                    class88.field1224[class349.field4271++] = var4;
                    var5.field4662 = class100.field1330;
                    class752.field10246[class338.field4123++] = var4;
                } else if (var7 == 1) {
                    class88.field1224[class349.field4271++] = var4;
                    var5.field4662 = class100.field1330;
                    int var8 = class356.field4337.method4023(true, 3);
                    var5.method3891(arg0 + 1, 1, var8);
                    int var9 = class356.field4337.method4023(true, 1);
                    if (var9 == 1) {
                        class752.field10246[class338.field4123++] = var4;
                    }
                } else if (var7 == 2) {
                    class88.field1224[class349.field4271++] = var4;
                    var5.field4662 = class100.field1330;
                    if (class356.field4337.method4023(true, 1) == 1) {
                        int var10 = class356.field4337.method4023(true, 3);
                        var5.method3891(1, 2, var10);
                        int var11 = class356.field4337.method4023(true, 3);
                        var5.method3891(1, 2, var11);
                    } else {
                        int var12 = class356.field4337.method4023(true, 3);
                        var5.method3891(1, 0, var12);
                    }
                    int var13 = class356.field4337.method4023(true, 1);
                    if (var13 == 1) {
                        class752.field10246[class338.field4123++] = var4;
                    }
                } else if (var7 == 3) {
                    class523.field6665[class341.field4183++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
    public static void method2106(int arg0) {
        field4470 = null;
        if (arg0 != 0) {
            method2104(null, -111, 11, 5, (byte) -6);
        }
        field4469 = null;
        field4473 = null;
    }
}
