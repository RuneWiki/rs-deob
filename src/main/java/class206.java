import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class206 extends class392 {

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lao;")
    public static class188 field2964 = new class188(59, 8);

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field2969 = Boolean.FALSE;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 4)
    public static void method1378(int arg0) {
        field2969 = null;
        if (arg0 != 0) {
            field2964 = null;
        }
        field2964 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 17)
    public static final void method1379(byte arg0) {
        field2965++;
        if (arg0 != -53) {
            field2969 = null;
        }
        if (class17.field266 == 10 || class17.field266 == 28) {
            class5.method41(5000, class291.field4175 >> 10, (byte) 55, class430.field6262 >> 10);
        } else {
            int var1 = class95.field1558.field409[0] >> 3;
            int var2 = class95.field1558.field416[0] >> 3;
            if (var1 >= 0 && var1 < class237.field3436 >> 3 && var2 >= 0 && (class83.field1366 >> 3) > var2) {
                class5.method41(5000, var2, (byte) 55, var1);
            } else {
                class5.method41(0, class83.field1366 >> 4, (byte) 55, class237.field3436 >> 4);
            }
        }
        class443.method2691(false);
        class310.method1943(arg0 + 54);
        class110.method812((byte) -127);
        class335.method2203(1693);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V", line = 48)
    public static final void method1380(byte arg0) {
        field2963++;
        class139.method1027(class13.field221, false);
        class393.field5817++;
        if (arg0 > -34) {
            field2969 = null;
        }
        if (class83.field1363 && class216.field3101) {
            int var1 = class481.field7063.method713(116);
            int var2 = class481.field7063.method712(-31039);
            int var3 = var2 - class442.field6484;
            int var4 = var1 - class95.field1556;
            if (var4 < class436.field6327) {
                var4 = class436.field6327;
            }
            if (class414.field6085 > var3) {
                var3 = class414.field6085;
            }
            if (class436.field6327 + class216.field3103.field925 < class13.field221.field925 + var4) {
                var4 = class436.field6327 + class216.field3103.field925 - class13.field221.field925;
            }
            if (var3 + class13.field221.field896 > class414.field6085 + class216.field3103.field896) {
                var3 = class414.field6085 + class216.field3103.field896 - class13.field221.field896;
            }
            int var5 = var4 + class216.field3103.field885 - class436.field6327;
            int var6 = var3 + class216.field3103.field855 - class414.field6085;
            if (class481.field7063.method1715((byte) 126)) {
                if (class393.field5817 > class13.field221.field887) {
                    int var7 = var4 - class56.field819;
                    int var8 = var3 - class189.field2792;
                    if (var7 > class13.field221.field934 || (-class13.field221.field934) > var7 || var8 > class13.field221.field934 || -class13.field221.field934 > var8) {
                        class516.field7584 = true;
                    }
                }
                if (class13.field221.field836 != null && class516.field7584) {
                    class519 var9 = new class519();
                    var9.field7625 = class13.field221;
                    var9.field7624 = var6;
                    var9.field7627 = class13.field221.field836;
                    var9.field7629 = var5;
                    class150.method1086(var9);
                    return;
                }
            } else {
                if (class516.field7584) {
                    class105.method798(-28860);
                    if (class13.field221.field921 != null) {
                        class519 var10 = new class519();
                        var10.field7627 = class13.field221.field921;
                        var10.field7624 = var6;
                        var10.field7622 = class427.field6247;
                        var10.field7625 = class13.field221;
                        var10.field7629 = var5;
                        class150.method1086(var10);
                    }
                    if (class427.field6247 != null && client.method1353(class13.field221) != null) {
                        class354.method2289(-107, class427.field6247, class13.field221);
                    }
                } else if ((class369.field5525 == 1 || class365.method2351(126)) && class106.field1669 > 2) {
                    class173.method1240(class95.field1556 + class56.field819, class442.field6484 + class189.field2792, 0);
                } else if (class241.method1563((byte) 89)) {
                    class173.method1240(class95.field1556 + class56.field819, class442.field6484 + class189.field2792, 0);
                }
                class13.field221 = null;
            }
        } else if (class393.field5817 > 1) {
            class13.field221 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 171)
    public static final void method1381(boolean arg0, String arg1) {
        field2966++;
        if (!class301.field4287) {
            return;
        }
        boolean var2 = false;
        int var3 = class333.field5117;
        int[] var4 = class459.field6766;
        for (int var5 = 0; var5 < var3; var5++) {
            class62 var6 = class390.field5783[var4[var5]];
            if (var6 != null && class95.field1558 != var6 && var6.field1094 != null && var6.field1094.equalsIgnoreCase(arg1)) {
                class230.field3357++;
                class114.method841(false, class143.field2121);
                class86.field1436.method1905(var4[var5], -66);
                class86.field1436.method1919(class114.field1817, -121);
                class86.field1436.method1874(class153.field2343, (byte) -110);
                class86.field1436.method1875(class135.field2070, (byte) -91);
                class86.field1436.method1924((byte) -102, 0);
                class303.method1925(var6.field409[0], var6.field416[0], 0, -2, true, var6.method184(1), arg0, 0, var6.method184(1));
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class460.method2756(class447.field6545.method1273(arg0, class370.field5530) + arg1, false);
        }
        if (class301.field4287) {
            class105.method798(-28860);
        }
        if (!arg0) {
            method1381(false, null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)V", line = 223)
    public static final void method1382(boolean arg0, int arg1) {
        field2967++;
        if (!arg0) {
            method1384();
        }
        class434 var2 = class483.method2888(arg1, 127, 7);
        var2.method2628(87);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V", line = 240)
    public static final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class520.field7637 = arg3;
        class438.field6389 = arg2;
        field2968++;
        if (arg0 != -19442) {
            method1381(false, null);
        }
        class497.field7234 = arg1;
        class131.field2025 = arg5;
        class303.field4339 = arg4;
        if (class497.field7234 >= 100) {
            int var6 = class303.field4339 * 128 + 64;
            int var7 = class520.field7637 * 128 + 64;
            int var8 = class259.method1646(var7, var6, arg0 ^ 0xCD3C5929, class434.field6317) - class438.field6389;
            int var9 = var6 - class430.field6262;
            int var10 = var8 - class207.field2983;
            int var11 = var7 - class291.field4175;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class310.field4446 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class320.field4578 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class103.field1642 = 0;
            if (class310.field4446 < 1024) {
                class310.field4446 = 1024;
            }
            if (class310.field4446 > 3072) {
                class310.field4446 = 3072;
            }
        }
        class403.field5944 = 2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V", line = 289)
    public static final void method1384() {
        class272.method1743(1, class334.field5130);
    }
}
