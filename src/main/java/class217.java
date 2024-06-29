import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class217 {

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lvs;")
    public class470 field3178 = new class470();

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
    public boolean field3181 = false;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3182 = new String[] { method1843(method1842("\u00126]*\u0014")), method1843(method1842("\u00126]UU\f6\u0007W\u0014")), method1843(method1842("\u0019q]GA")), method1843(method1842("\f*\u001f\u0005")), method1843(method1842("\u00126]-\u0014")), method1843(method1842("\u00126],\u0014")), method1843(method1842("\u00126](\u0014")) };

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Ldfa;")
    public static class477 field3175 = new class477(16);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Llga;")
    public static class47 field3180;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
    public static final void method1837() {
        if (class596.field8568 != null) {
            for (int var0 = 0; var0 < class596.field8568.length; var0++) {
                for (int var1 = 0; var1 < class508.field7455; var1++) {
                    for (int var2 = 0; var2 < class700.field9795; var2++) {
                        if (class596.field8568[var0][var1][var2] != null) {
                            class596.field8568[var0][var1][var2].method4567(126);
                        }
                        class596.field8568[var0][var1][var2] = null;
                    }
                }
            }
        }
        class596.field8568 = null;
        class213.field3124 = null;
        if (class105.field1377 != null) {
            for (int var3 = 0; var3 < class105.field1377.length; var3++) {
                for (int var4 = 0; var4 < class508.field7455; var4++) {
                    for (int var5 = 0; var5 < class700.field9795; var5++) {
                        if (class105.field1377[var3][var4][var5] != null) {
                            class105.field1377[var3][var4][var5].method4567(114);
                        }
                        class105.field1377[var3][var4][var5] = null;
                    }
                }
            }
        }
        class105.field1377 = null;
        class677.field9474 = null;
        class608.field8715 = null;
        class107.field1413 = null;
        class30.field385 = null;
        class261.field3705 = null;
        class285.field4010 = null;
        class173.field2290 = null;
        class725.field10313 = null;
        class228.method1898(false);
        if (class640.field9121 != null) {
            for (int var6 = 0; var6 < class433.field6273; var6++) {
                class640.field9121[var6] = null;
            }
            class433.field6273 = 0;
        }
        class563.field8239 = null;
        class210.field3050 = null;
        class391.field5707 = null;
        if (class723.field10288 != null) {
            for (int var7 = 0; var7 < class723.field10288.length; var7++) {
                class723.field10288[var7] = null;
            }
            class643.field9160 = 0;
        }
        if (class457.field6672 != null) {
            for (int var8 = 0; var8 < class457.field6672.length; var8++) {
                class457.field6672[var8] = null;
            }
            class98.field1329 = 0;
        }
        if (class678.field9526 != null) {
            for (int var9 = 0; var9 < class156.field1988; var9++) {
                class678.field9526[var9] = null;
            }
            for (int var10 = 0; var10 < class293.field4121; var10++) {
                for (int var11 = 0; var11 < class508.field7455; var11++) {
                    for (int var12 = 0; var12 < class700.field9795; var12++) {
                        class502.field7334[var10][var11][var12] = 0L;
                    }
                }
            }
            class156.field1988 = 0;
        }
        class220.method1854(77);
        class80.field1125 = class80.field1124;
        class80.field1125.method1840((byte) 77);
        class492.field7207 = null;
        class787.field11366 = null;
        class727.field10425 = null;
        if (class650.field9243 != null) {
            class177.method1485();
            class531.field7699.method203(1);
            class531.field7699.method205(0);
        }
        if (class658.field9320 != null) {
            class658.field9320 = null;
        }
        class531.field7699 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public static void method1838(byte arg0) {
        try {
            field3180 = null;
            field3175 = null;
            int var1 = 73 % ((arg0 - 35) / 37);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3182[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILrs;)V")
    public final void method1839(int arg0, class297 arg1) {
        try {
            field3177++;
            class202 var3 = arg1.field4150;
            boolean var4 = true;
            class535[] var5 = arg1.field4153;
            for (int var6 = arg0; var6 < var5.length; var6++) {
                if (var5[var6].field7769) {
                    var4 = false;
                    break;
                }
            }
            if (!var4) {
                if (this.field3181) {
                    for (class297 var7 = (class297) this.field3178.method3617(false); var7 != null; var7 = (class297) this.field3178.method3612(3)) {
                        if (var7.field4150 == var3) {
                            var7.method4736(arg0);
                            class228.method1899(arg0 - 201, var7);
                        }
                    }
                }
                for (class297 var8 = (class297) this.field3178.method3617(false); var8 != null; var8 = (class297) this.field3178.method3612(3)) {
                    if (var8.field4150.field2970 <= var3.field2970) {
                        class389.method3045(var8, (byte) 105, arg1);
                        return;
                    }
                }
                this.field3178.method3618(arg1, 81);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3182[5] + arg0 + ',' + (arg1 == null ? field3182[3] : field3182[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method1840(byte arg0) {
        try {
            while (true) {
                class297 var2 = (class297) this.field3178.method3611(-127);
                if (var2 == null) {
                    if (arg0 != 77) {
                        field3180 = null;
                    }
                    field3176++;
                    return;
                }
                var2.method4736(0);
                class228.method1899(-201, var2);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3182[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjc;)Lvaa;")
    public static final class543 method1841(int arg0, class711 arg1) {
        try {
            field3179++;
            if (arg0 != -23780) {
                field3175 = null;
            }
            int var2 = arg1.method5113(18443);
            return new class543(var2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3182[4] + arg0 + ',' + (arg1 == null ? field3182[3] : field3182[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Z)V")
    public class217(boolean arg0) {
        try {
            this.field3181 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3182[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1842(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1843(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
