import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class378 {

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lkg;")
    public static class275 field4830 = new class275(68, 6);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
    public static int[] field4833 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lsf;")
    public static class526 field4832 = new class526("", 14);

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[C")
    public static char[] field4835 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field4836 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public int field4828;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public int field4829;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public int field4834;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method2159(byte arg0) {
        int var1 = -29 % ((arg0 - 24) / 62);
        field4835 = null;
        field4830 = null;
        field4832 = null;
        field4833 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILsl;)V")
    public final void method2160(int arg0, class461 arg1) {
        field4827++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method2600((byte) -126);
            if (var3 == 0) {
                return;
            }
            this.method2162(arg1, 1, var3);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2161(String arg0, byte arg1) {
        field4825++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        if (arg1 != -17) {
            method2161(null, (byte) -91);
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lsl;II)V")
    private final void method2162(class461 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field4834 = arg0.method2566(-2);
            this.field4829 = arg0.method2600((byte) -126);
            this.field4828 = arg0.method2600((byte) -124);
        }
        field4831++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBZLjava/lang/String;)V")
    public static final void method2163(int arg0, byte arg1, boolean arg2, String arg3) {
        class151.method1063(-9732);
        field4826++;
        if (arg0 == 0) {
            class386.field4930 = class139.method1018(-117, 0, class262.field3311, class124.field1793, class748.field10451.field10409.method3020((byte) -91) * 2, class168.field2329);
            if (arg3 != null) {
                class386.field4930.method462(0);
                class274 var4 = class739.method4118(class235.field3069, 0, class445.field5928, -1072);
                class61 var5 = class386.field4930.method500(var4, class728.method4067(class268.field3369, class235.field3069, 0), true);
                class759.method4224(0);
                class163.method1139(var5, class386.field4930, 97, true, var4, arg3);
            }
        } else {
            class60 var6 = null;
            if (arg3 != null) {
                var6 = class139.method1018(-117, 0, class262.field3311, class124.field1793, 0, class168.field2329);
                var6.method462(0);
                class274 var7 = class739.method4118(class235.field3069, 0, class445.field5928, -1072);
                class61 var8 = var6.method500(var7, class728.method4067(class268.field3369, class235.field3069, 0), true);
                class759.method4224(0);
                class163.method1139(var8, var6, 113, true, var7, arg3);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class386.field4930 = class139.method1018(-62, arg0, class262.field3311, class124.field1793, class748.field10451.field10409.method3020((byte) 111) * 2, class168.field2329);
                    if (arg3 != null) {
                        var6.method462(0);
                        class274 var9 = class739.method4118(class235.field3069, 0, class445.field5928, -1072);
                        class61 var10 = var6.method500(var9, class728.method4067(class268.field3369, class235.field3069, 0), true);
                        class759.method4224(0);
                        class163.method1139(var10, var6, 127, true, var9, arg3);
                    }
                    if (class386.field4930.method513()) {
                        boolean var11 = true;
                        try {
                            var11 = class323.field4162.field367 > 256;
                        } catch (Throwable var28) {
                        }
                        class416 var12;
                        if (var11) {
                            var12 = class386.field4930.method541(146800640);
                        } else {
                            var12 = class386.field4930.method541(104857600);
                        }
                        class386.field4930.method536(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var13 = class748.field10451.field10399.method1924((byte) -48);
                    if (var13 == 2) {
                        class583.field8154 = true;
                    }
                    class748.field10451.method4150(class748.field10451.field10399, 0, -5);
                    method2163(var13, (byte) -31, arg2, arg3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method478((byte) 95);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method478((byte) 95);
                    } catch (Throwable var25) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method478((byte) 95);
                } catch (Throwable var27) {
                }
            }
        }
        class748.field10451.field10399.method1923(0, !arg2);
        class748.field10451.method4150(class748.field10451.field10399, arg0, -5);
        class330.method1913((byte) 120);
        class386.field4930.method461(10000);
        class386.field4930.method510(32);
        class651.field9066 = class386.field4930.method502();
        class14.field271 = class386.field4930.method502();
        class443.method2511(-29079);
        class386.field4930.method449(class748.field10451.field10419.method3424((byte) 95) == 1);
        if (class386.field4930.method490()) {
            class631.method3544(class748.field10451.field10416.method3100((byte) -63) == 1, (byte) 13);
        }
        class391.method2214(class386.field4930, class543.field7597 >> 3, class409.field5183 >> 3, -6723);
        if (arg1 >= -4) {
            field4836 = 18;
        }
        class421.method2347((byte) -47);
        class742.field10361 = null;
        class508.field7164 = true;
        class332.field4236 = false;
        class427.method2450(0);
    }
}
