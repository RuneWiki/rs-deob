import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class334 extends class410 {

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "Lcga;")
    public static class449 field4133 = new class449(25, 3);

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4137 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "Lpfa;")
    public static class275 field4134;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)V")
    public static void method1917(byte arg0) {
        field4137 = null;
        field4134 = null;
        field4133 = null;
        if (arg0 != -53) {
            field4137 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public static final void method1918(int arg0) {
        if (arg0 > -123) {
            method1917((byte) 22);
        }
        for (int var1 = 0; var1 < class141.field1697; var1++) {
            class175 var3 = class266.field3358[var1];
            boolean var4 = false;
            if (var3.field2057 == null) {
                var3.field2064--;
                if (var3.field2064 >= (var3.method1047(4) ? -1500 : -10)) {
                    if (var3.field2059 == 1 && var3.field2055 == null) {
                        var3.field2055 = class547.method2930(class202.field2352, var3.field2052, 0);
                        if (var3.field2055 == null) {
                            continue;
                        }
                        var3.field2064 += var3.field2055.method2933();
                    } else if (var3.method1047(4) && (var3.field2058 == null || var3.field2053 == null)) {
                        if (var3.field2058 == null) {
                            var3.field2058 = class494.method2683(class431.field5439, var3.field2052);
                        }
                        if (var3.field2058 == null) {
                            continue;
                        }
                        if (var3.field2053 == null) {
                            var3.field2053 = var3.field2058.method2675(new int[] { 22050 });
                            if (var3.field2053 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field2064 < 0) {
                        int var12;
                        if (var3.field2051 == 0) {
                            var12 = (var3.field2059 == 3 ? class611.field8310.field8681 : class611.field8310.field8689) * var3.field2047 >> 8;
                        } else {
                            int var5 = (var3.field2051 & 0x3587F9A) >> 24;
                            if (class67.field815.field8010 == var5) {
                                int var6 = var3.field2051 & 0xFF << 9;
                                int var7 = var3.field2051 >> 16 & 0xFF;
                                int var8 = (var7 << 9) + 256 - class67.field815.field8018;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var3.field2051 >> 8 & 0xFF;
                                int var10 = (var9 << 9) + 256 - class67.field815.field8011;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 512;
                                if (var11 > var6) {
                                    var3.field2064 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var12 = (var6 - var11) * class611.field8310.field8701 * var3.field2047 / var6 >> 8;
                            } else {
                                var12 = 0;
                            }
                        }
                        if (var12 > 0) {
                            class4 var13 = null;
                            if (var3.field2059 == 1) {
                                var13 = var3.field2055.method2932().method12(class690.field9575);
                            } else if (var3.method1047(4)) {
                                var13 = var3.field2053;
                            }
                            class609 var14 = var3.field2057 = class609.method3396(var13, 100, var12);
                            var14.method3394(var3.field2060 - 1);
                            class314.field3941.method1485(var14);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field2057.method1565((byte) 121)) {
                var4 = true;
            }
            if (var4) {
                class141.field1697--;
                for (int var15 = var1; var15 < class141.field1697; var15++) {
                    class266.field3358[var15] = class266.field3358[var15 + 1];
                }
                var1--;
            }
        }
        field4135++;
        if (class89.field1160 && !class534.method2877(true)) {
            if (class611.field8310.field8684 != 0 && class640.field8675 != -1) {
                class571.method3024(class640.field8675, 0, false, class611.field8310.field8684, class353.field4567, -144);
            }
            class89.field1160 = false;
        } else if (class611.field8310.field8684 != 0 && class640.field8675 != -1 && !class534.method2877(true)) {
            class325.field4058++;
            class124 var2 = class336.method1924(class275.field3503, class636.field8620, (byte) 121);
            var2.field1516.method3061(class640.field8675, (byte) 115);
            class197.method1156((byte) 126, var2);
            class640.field8675 = -1;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Ljd;")
    public final class216 method20(byte arg0) {
        field4136++;
        int var2 = 95 % ((arg0 + 27) / 42);
        return class613.field8335;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ltl;Lpd;IIIIIIIIIIIIII)V")
    public class334(class580 arg0, class241 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field4138 = arg15;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V")
    public static final void method1919(int arg0, int arg1) {
        if (arg0 != -14732) {
            method1919(-120, 126);
        }
        field4132++;
        class243 var2 = class546.method2926(arg1, 5, true);
        var2.method1455(true);
    }
}
