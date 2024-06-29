import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class716 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Ldaa;")
    public static class12 field9938;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public static void method4019(byte arg0) {
        field9938 = null;
        if (arg0 != 61) {
            field9938 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZBLjava/lang/String;I)V")
    public static final void method4020(boolean arg0, byte arg1, String arg2, int arg3) {
        field9939++;
        class337.method2142((byte) -58);
        if (arg3 == 0) {
            class37.field491 = class774.method4267((byte) 99, 0, class48.field610, class204.field3175, class629.field8819, class21.field353.field10070.method1629(-71) * 2);
            if (arg2 != null) {
                class37.field491.method509(0);
                class6 var13 = class121.method924(class124.field1928, (byte) -73, 0, class502.field7113);
                class66 var14 = class37.field491.method437(var13, class1.method14(class152.field2163, class502.field7113, 0), true);
                class33.method270(0);
                class66.method569(-113, var14, true, class37.field491, arg2, var13);
            }
        } else {
            class65 var4 = null;
            if (arg2 != null) {
                var4 = class774.method4267((byte) 112, 0, class48.field610, class204.field3175, class629.field8819, 0);
                var4.method509(0);
                class6 var5 = class121.method924(class124.field1928, (byte) -77, 0, class502.field7113);
                class66 var6 = var4.method437(var5, class1.method14(class152.field2163, class502.field7113, 0), true);
                class33.method270(0);
                class66.method569(-96, var6, true, var4, arg2, var5);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class37.field491 = class774.method4267((byte) 117, arg3, class48.field610, class204.field3175, class629.field8819, class21.field353.field10070.method1629(-107) * 2);
                    if (arg2 != null) {
                        var4.method509(0);
                        class6 var7 = class121.method924(class124.field1928, (byte) -58, 0, class502.field7113);
                        class66 var8 = var4.method437(var7, class1.method14(class152.field2163, class502.field7113, 0), true);
                        class33.method270(arg1 ^ 0x2F);
                        class66.method569(-111, var8, true, var4, arg2, var7);
                    }
                    if (class37.field491.method432()) {
                        boolean var9 = true;
                        try {
                            var9 = field9938.field249 > 256;
                        } catch (Throwable var28) {
                        }
                        class434 var10;
                        if (var9) {
                            var10 = class37.field491.method444(146800640);
                        } else {
                            var10 = class37.field491.method444(104857600);
                        }
                        class37.field491.method501(var10);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var11 = class21.field353.field10098.method1588(-99);
                    if (var11 == 2) {
                        class678.field9431 = true;
                    }
                    class21.field353.method4080(true, class21.field353.field10098, 0);
                    method4020(arg0, (byte) 47, arg2, var11);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var4 != null) {
                            try {
                                var4.method533(103);
                            } catch (Throwable var25) {
                            }
                        }
                    }
                }
                if (var4 != null) {
                    try {
                        var4.method533(103);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var4 != null) {
                try {
                    var4.method533(103);
                } catch (Throwable var27) {
                }
            }
        }
        class21.field353.field10098.method1590(!arg0, 0);
        if (arg1 != 47) {
            return;
        }
        class21.field353.method4080(true, class21.field353.field10098, arg3);
        class668.method3801((byte) 65);
        class37.field491.method524(10000);
        class37.field491.method523(32);
        class494.field7044 = class37.field491.method505();
        class500.field7104 = class37.field491.method505();
        class74.method590(false);
        class37.field491.method473(class21.field353.field10092.method3103(arg1 - 173) == 1);
        if (class37.field491.method534()) {
            class338.method2145((byte) -73, class21.field353.field10090.method2426(-89) == 1);
        }
        class154.method1054(arg1 - 47, class768.field10571 >> 3, class37.field491, class350.field4898 >> 3);
        class37.method289((byte) 68);
        class308.field4414 = null;
        class446.field6088 = true;
        class768.field10567 = false;
        class83.method627(arg1 + 761);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(CII)I")
    public static final int method4021(char arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            return 96;
        }
        field9937++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }
}
