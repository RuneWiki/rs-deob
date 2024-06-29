import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class584 {

    @OriginalMember(owner = "client!po", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8626 = new String[] { method4366(method4365("\u0012Cfrk")), method4366(method4365("\fY$]")), method4366(method4365("\u0019\u0002f\u001f>")), method4366(method4365("B\u0010!\\$_")), method4366(method4365("\u0012Cfpk")), method4366(method4365("\fH)")), method4366(method4365("\u0012Cfsk")) };

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field8622 = 0;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field8624;

    // $FF: synthetic field
    @OriginalMember(owner = "client!po", name = "b", descriptor = "Ljava/lang/Class;")
    public static Class field8625;

    // $FF: synthetic method
    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4364(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 4)
    public static final String method4361(int arg0, int[] arg1) {
        try {
            field8623++;
            StringBuffer var2 = new StringBuffer();
            if (arg0 != 13271) {
                method4361(-73, null);
            }
            int var3 = class588.field8655;
            for (int var4 = 0; var4 < arg1.length; var4++) {
                class102 var5 = class329.field5185.method2537(-117, arg1[var4]);
                if (var5.field1137 != -1) {
                    class581 var6 = (class581) class269.field4096.method1558((byte) 96, (long) var5.field1137);
                    if (var6 == null) {
                        class481 var7 = class481.method3675(class383.field5798, var5.field1137, 0);
                        if (var7 != null) {
                            var6 = class610.field8913.method487(var7, true);
                            class269.field4096.method1556((long) var5.field1137, var6, 1);
                        }
                    }
                    if (var6 != null) {
                        class106.field1221[var3] = var6;
                        var2.append(field8626[3]).append(var3).append(">");
                        var3++;
                    }
                }
            }
            return var2.toString();
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8626[4] + arg0 + ',' + (arg1 == null ? field8626[1] : field8626[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIBII)V", line = 54)
    public static final void method4362(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        try {
            if (arg5 >= 35) {
                field8624++;
                if (arg4 >= 0 && arg6 >= 0 && class648.field9378 - 1 > arg4 && class659.field9506 - 1 > arg6) {
                    if (class734.field10683 == null) {
                        return;
                    }
                    if (arg0 != 0) {
                        if (arg0 == 1) {
                            class583 var8 = (class583) class271.method2248(arg2, arg4, arg6);
                            if (var8 != null) {
                                if (var8 instanceof class125) {
                                    ((class125) var8).field1459.method173(false, arg7);
                                    return;
                                }
                                int var9 = var8.method1083((byte) -75);
                                if (arg3 == 4 || arg3 == 5) {
                                    class184.method1605(arg0, arg7, arg4, arg2, 4, arg6, arg1, var9, (byte) -76);
                                } else if (arg3 == 6) {
                                    class184.method1605(arg0, arg7, arg4, arg2, 4, arg6, arg1 + 4, var9, (byte) -65);
                                    return;
                                } else if (arg3 == 7) {
                                    class184.method1605(arg0, arg7, arg4, arg2, 4, arg6, (arg1 + 2 & 0x3) + 4, var9, (byte) -125);
                                    return;
                                } else if (arg3 == 8) {
                                    class184.method1605(arg0, arg7, arg4, arg2, 4, arg6, arg1 + 4, var9, (byte) -77);
                                    class184.method1605(arg0, arg7, arg4, arg2, 4, arg6, (arg1 + 2 & 0x3) + 4, var9, (byte) 102);
                                    return;
                                }
                                return;
                            }
                        } else if (arg0 == 2) {
                            class583 var10 = (class583) class261.method2196(arg2, arg4, arg6, field8625 == null ? (field8625 = method4364(field8626[5])) : field8625);
                            if (var10 != null) {
                                if (arg3 == 11) {
                                    arg3 = 10;
                                }
                                if (var10 instanceof class677) {
                                    ((class677) var10).field9835.method173(false, arg7);
                                    return;
                                }
                                class184.method1605(arg0, arg7, arg4, arg2, arg3, arg6, arg1, var10.method1083((byte) 116), (byte) 83);
                                return;
                            }
                        } else if (arg0 == 3) {
                            class583 var11 = (class583) class89.method766(arg2, arg4, arg6);
                            if (var11 == null) {
                                return;
                            }
                            if (!(var11 instanceof class362)) {
                                class184.method1605(arg0, arg7, arg4, arg2, arg3, arg6, arg1, var11.method1083((byte) -37), (byte) -63);
                                return;
                            }
                            ((class362) var11).field5536.method173(false, arg7);
                        } else {
                            return;
                        }
                        return;
                    }
                    class583 var12 = (class583) class599.method4456(arg2, arg4, arg6);
                    class583 var13 = (class583) class330.method2788(arg2, arg4, arg6);
                    if (var12 != null && arg3 != 2) {
                        if ((var12 instanceof class748)) {
                            ((class748) var12).field10871.method173(false, arg7);
                        } else {
                            class184.method1605(arg0, arg7, arg4, arg2, arg3, arg6, arg1, var12.method1083((byte) -4), (byte) 63);
                        }
                    }
                    if (var13 != null) {
                        if (var13 instanceof class748) {
                            ((class748) var13).field10871.method173(false, arg7);
                            return;
                        }
                        class184.method1605(arg0, arg7, arg4, arg2, arg3, arg6, arg1, var13.method1083((byte) -18), (byte) -111);
                        return;
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field8626[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 180)
    public static final void method4363(byte arg0) {
        try {
            field8621++;
            if (!class752.field10948) {
                class597.field8773 = true;
                if (arg0 != -86) {
                    field8622 = 82;
                }
                class752.field10948 = true;
                class459.field6688 += (24.0F - class459.field6688) / 2.0F;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8626[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!po", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4365(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!po", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4366(char[] arg0) {
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
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
