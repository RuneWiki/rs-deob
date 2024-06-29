import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class88 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lea;")
    public static class547 field1203 = new class547(23, 0);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lf;IIIIILha;IIIII)V", line = 5)
    public static final void method635(class756 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class60 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg5 < arg2 && arg2 < arg5 + arg10 && arg4 > arg7 - 13 && arg4 < arg7 + 3) {
            arg1 = arg8;
        }
        field1204++;
        String var12 = class245.method1473(arg0, (byte) 36);
        class214.field2575.method477(arg7, class385.field5414, arg9, var12, arg1, arg5 + 3, (byte) 18, class587.field8211);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 19)
    public static void method636(int arg0) {
        field1203 = null;
        if (arg0 != 5989) {
            field1203 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLjava/lang/String;IZ)V", line = 29)
    public static final void method637(byte arg0, String arg1, int arg2, boolean arg3) {
        class237.method1431((byte) -51);
        field1202++;
        if (arg2 == 0) {
            class21.field142 = class144.method897(class11.field68.field5520.method1958((byte) 120) * 2, class725.field10121, arg0 ^ 0x27, class15.field116, 0, class491.field6707);
            if (arg1 != null) {
                class21.field142.method402(0);
                class377 var4 = class581.method3247((byte) 120, 0, class476.field6584, class641.field8923);
                class61 var5 = class21.field142.method425(var4, class204.method1124(class97.field1282, class476.field6584, 0), true);
                class105.method713(14059);
                class396.method2303(-127, var4, var5, true, class21.field142, arg1);
            }
        } else {
            class60 var6 = null;
            if (arg1 != null) {
                var6 = class144.method897(0, class725.field10121, arg0 - 21, class15.field116, 0, class491.field6707);
                var6.method402(0);
                class377 var7 = class581.method3247((byte) 115, 0, class476.field6584, class641.field8923);
                class61 var8 = var6.method425(var7, class204.method1124(class97.field1282, class476.field6584, 0), true);
                class105.method713(14059);
                class396.method2303(-99, var7, var8, true, var6, arg1);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class21.field142 = class144.method897(class11.field68.field5520.method1958((byte) 127) * 2, class725.field10121, 79, class15.field116, arg2, class491.field6707);
                    if (arg1 != null) {
                        var6.method402(0);
                        class377 var9 = class581.method3247((byte) 124, 0, class476.field6584, class641.field8923);
                        class61 var10 = var6.method425(var9, class204.method1124(class97.field1282, class476.field6584, 0), true);
                        class105.method713(14059);
                        class396.method2303(-127, var9, var10, true, var6, arg1);
                    }
                    if (class21.field142.method457()) {
                        boolean var11 = true;
                        try {
                            var11 = class353.field4715.field10203 > 256;
                        } catch (Throwable var28) {
                        }
                        class416 var12;
                        if (var11) {
                            var12 = class21.field142.method371(146800640);
                        } else {
                            var12 = class21.field142.method371(104857600);
                        }
                        class21.field142.method432(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var13 = class11.field68.field5503.method741((byte) 120);
                    if (var13 == 2) {
                        class598.field8329 = true;
                    }
                    class11.field68.method2276((byte) -13, 0, class11.field68.field5503);
                    method637((byte) 69, arg1, var13, arg3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method342(-1);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method342(-1);
                    } catch (Throwable var25) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method342(-1);
                } catch (Throwable var27) {
                }
            }
        }
        class11.field68.field5503.method740(!arg3, false);
        class11.field68.method2276((byte) -13, arg2, class11.field68.field5503);
        class516.method2849((byte) -79);
        class21.field142.method416(10000);
        class21.field142.method438(32);
        class736.field10270 = class21.field142.method454();
        class161.field2025 = class21.field142.method454();
        class214.method1191(110);
        if (arg0 != 69) {
            method636(-5);
        }
        class21.field142.method352(class11.field68.field5538.method2692((byte) 122) == 1);
        if (class21.field142.method376()) {
            class557.method3155(29089, class11.field68.field5536.method2257((byte) 122) == 1);
        }
        class357.method2055(class272.field3589 >> 3, class3.field26 >> 3, (byte) -50, class21.field142);
        class723.method4058((byte) 125);
        class139.field1786 = true;
        class244.field3171 = null;
        class257.field3353 = false;
        class339.method2002(arg0 - 134);
    }
}
