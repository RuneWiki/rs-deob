import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class266 {

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3866 = "";

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
    public static final void method1738(int arg0) {
        field3870++;
        class523 var1 = null;
        try {
            class344 var2 = class129.field1674.method4243((byte) -121, true, "");
            while (var2.field4970 == 0) {
                class730.method4066((byte) -45, 1L);
            }
            if (var2.field4970 == 1) {
                var1 = (class523) var2.field4975;
                class511 var3 = class688.field9602.method3508(24);
                var1.method3116(0, 1, var3.field6962, var3.field6979);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method3121((byte) 60);
            }
        } catch (Exception var5) {
        }
        int var4 = -101 % ((5 - arg0) / 62);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
    public static void method1739(byte arg0) {
        field3866 = null;
        if (arg0 != -31) {
            field3869 = -18;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
    public static final void method1740(boolean arg0) {
        class296.method1944();
        field3873++;
        for (int var1 = 0; var1 < 4; var1++) {
            client.field1305[var1].method4089(-1);
        }
        class604.method3489((byte) 56);
        class106.method750(!arg0);
        class607.method3500(arg0);
        System.gc();
        class111.field1332.method226();
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
    public static final void method1741(int arg0, int arg1) {
        class585.field8268 = arg0;
        if (arg1 == -10561) {
            field3872++;
            class482.field6661.method314(arg1 ^ 0x2941);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLlp;)Llp;")
    public static final class82 method1742(byte arg0, class82 arg1) {
        field3868++;
        class82 var2 = arg1 == null ? new class82() : new class82(arg1);
        if (arg0 >= -61) {
            method1742((byte) 103, null);
        }
        var2.method622(9, 128, (byte) 98);
        return var2;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lha;BLvs;I)V")
    public static final void method1743(class473 arg0, byte arg1, class532 arg2, int arg3) {
        field3867++;
        if (class206.field2893 != null && arg3 <= arg2.field7333) {
            for (int var4 = 0; var4 < class206.field2893.length; var4++) {
                if (class206.field2893[var4] != -1000000 && (class206.field2893[var4] >= arg2.field7322[0] || class206.field2893[var4] >= arg2.field7322[1] || arg2.field7322[2] <= class206.field2893[var4] || class206.field2893[var4] >= arg2.field7322[3]) && (arg2.field7325[0] <= class472.field6535[var4] || arg2.field7325[1] <= class472.field6535[var4] || class472.field6535[var4] >= arg2.field7325[2] || class472.field6535[var4] >= arg2.field7325[3]) && (class250.field3724[var4] <= arg2.field7325[0] || arg2.field7325[1] >= class250.field3724[var4] || class250.field3724[var4] <= arg2.field7325[2] || class250.field3724[var4] <= arg2.field7325[3]) && (class490.field6734[var4] >= arg2.field7318[0] || arg2.field7318[1] <= class490.field6734[var4] || arg2.field7318[2] <= class490.field6734[var4] || class490.field6734[var4] >= arg2.field7318[3]) && (class114.field1373[var4] <= arg2.field7318[0] || arg2.field7318[1] >= class114.field1373[var4] || arg2.field7318[2] >= class114.field1373[var4] || class114.field1373[var4] <= arg2.field7318[3])) {
                    return;
                }
            }
        }
        if (arg2.field7319 == 1) {
            int var5 = arg2.field7332 + class270.field3904 - class591.field8336;
            if (var5 >= 0 && var5 <= (class270.field3904 + class270.field3904)) {
                int var6 = arg2.field7324 + class270.field3904 - class112.field1363;
                if (var6 < 0) {
                    var6 = 0;
                } else if (class270.field3904 + class270.field3904 < var6) {
                    return;
                }
                int var7 = arg2.field7327 + class270.field3904 - class112.field1363;
                if (var7 > class270.field3904 + class270.field3904) {
                    var7 = class270.field3904 + class270.field3904;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var7 >= var6) {
                    if (class592.field8338[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class722.field9958 - arg2.field7325[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class60.field690 > var9) && class389.method2414((byte) -98, arg2, 0) && class389.method2414((byte) -97, arg2, 1) && class389.method2414((byte) -56, arg2, 2) && class389.method2414((byte) -107, arg2, 3)) {
                        class356.field5133[class197.field2782++] = arg2;
                    }
                }
            }
        } else if (arg2.field7319 == 2) {
            int var10 = class270.field3904 + arg2.field7324 - class112.field1363;
            if (var10 >= 0 && var10 <= (class270.field3904 + class270.field3904)) {
                int var11 = arg2.field7332 + class270.field3904 - class591.field8336;
                if (var11 < 0) {
                    var11 = 0;
                } else if (class270.field3904 + class270.field3904 < var11) {
                    return;
                }
                int var12 = arg2.field7329 + class270.field3904 - class591.field8336;
                if (var12 > class270.field3904 + class270.field3904) {
                    var12 = class270.field3904 + class270.field3904;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class592.field8338[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class537.field7427 - arg2.field7318[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class60.field690) && class389.method2414((byte) -121, arg2, 0) && class389.method2414((byte) -44, arg2, 1) && class389.method2414((byte) -128, arg2, 2) && class389.method2414((byte) -98, arg2, 3)) {
                        class356.field5133[class197.field2782++] = arg2;
                    }
                }
            }
        } else {
            if (arg1 < 88) {
                field3866 = null;
            }
            if (arg2.field7319 == 16 || arg2.field7319 == 8) {
                int var23 = class270.field3904 + arg2.field7332 - class591.field8336;
                if (var23 >= 0 && (class270.field3904 + class270.field3904) >= var23) {
                    int var24 = arg2.field7324 + class270.field3904 - class112.field1363;
                    if (var24 >= 0 && class270.field3904 + class270.field3904 >= var24 && class592.field8338[var23][var24]) {
                        float var25 = (float) (class722.field9958 - arg2.field7325[0]);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class537.field7427 - arg2.field7318[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!(var25 < (float) class60.field690) || !((float) class60.field690 > var26) && class389.method2414((byte) -62, arg2, 0) && class389.method2414((byte) -90, arg2, 1) && class389.method2414((byte) -88, arg2, 2) && class389.method2414((byte) -113, arg2, 3)) {
                            class356.field5133[class197.field2782++] = arg2;
                        }
                    }
                }
            } else if (arg2.field7319 == 4) {
                float var15 = (float) (arg2.field7322[0] - class134.field1716);
                if (!((float) class169.field2153 >= var15)) {
                    int var16 = class270.field3904 + arg2.field7324 - class112.field1363;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class270.field3904 + class270.field3904) {
                        return;
                    }
                    int var17 = arg2.field7327 + class270.field3904 - class112.field1363;
                    if (class270.field3904 + class270.field3904 < var17) {
                        var17 = class270.field3904 + class270.field3904;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = arg2.field7332 + class270.field3904 - class591.field8336;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if ((class270.field3904 + class270.field3904) < var18) {
                        return;
                    }
                    int var19 = arg2.field7329 + class270.field3904 - class591.field8336;
                    if (var19 > class270.field3904 + class270.field3904) {
                        var19 = class270.field3904 + class270.field3904;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label293: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class592.field8338[var21][var22]) {
                                var20 = true;
                                break label293;
                            }
                        }
                    }
                    if (var20 && class389.method2414((byte) -50, arg2, 0) && class389.method2414((byte) -53, arg2, 1) && class389.method2414((byte) -96, arg2, 2) && class389.method2414((byte) -123, arg2, 3)) {
                        class356.field5133[class197.field2782++] = arg2;
                    }
                }
            }
        }
    }
}
