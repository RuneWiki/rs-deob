import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class48 {

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Ldu;")
    public static class242 field548 = new class242(5, 14);

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "Lmt;")
    public static class276 field554 = new class276(13, 0, 1, 0);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Li;")
    public class31 field556;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Le;")
    public class377 field555;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field557;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method282(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method275(int arg0, String arg1) {
        System.exit(arg0);
        field551++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 15)
    public static final void method276(byte arg0, String arg1, boolean arg2) {
        field547++;
        class382.field5384.field662 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class344.field5000.field2223; var6++) {
            class395 var9 = class344.field5000.method993(var6, true);
            if ((!arg2 || var9.field5540) && var9.field5602 == -1 && var9.field5600 == -1 && var9.field5585 == 0 && var9.field5587.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class399.field5627 = null;
                    class377.field5352 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class399.field5627 = var4;
        class473.field6584 = 0;
        class377.field5352 = var5;
        String[] var7 = new String[class377.field5352];
        if (arg0 < 23) {
            method278(2, -78, -42, -57);
        }
        for (int var8 = 0; var8 < class377.field5352; var8++) {
            var7[var8] = class344.field5000.method993(var4[var8], true).field5587;
        }
        class88.method635(class399.field5627, (byte) -119, var7);
        class382.field5384.method447(true);
        class382.field5384.field662 = 2;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 93)
    public static void method277(int arg0) {
        field548 = null;
        field554 = null;
        if (arg0 != 2853) {
            method276((byte) 120, null, false);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V", line = 107)
    public static final void method278(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class4.field81.field1422 * arg2 >> 8;
        field549++;
        if (arg1 == arg3 && !class207.field3003) {
            class178.method1114(1);
        } else if (arg1 != -1 && (class467.field6521 != arg1 || !class116.method777((byte) 113)) && var4 != 0 && !class207.field3003) {
            class137.method858(class75.field927, 0, arg0, arg1, -2, var4, false);
        }
        class467.field6521 = arg1;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 129)
    public static final void method279(int arg0) {
        if (arg0 >= -12) {
            field554 = null;
        }
        for (int var1 = 0; var1 < class10.field140; var1++) {
            class78 var2 = class289.field4229[var1];
            boolean var3 = false;
            if (var2.field1014 == null) {
                var2.field1026--;
                if (var2.field1026 >= (var2.field1015 == 2 ? -1500 : -10)) {
                    if (var2.field1015 == 1 && var2.field1025 == null) {
                        var2.field1025 = class148.method924(class477.field6643, var2.field1019, 0);
                        if (var2.field1025 == null) {
                            continue;
                        }
                        var2.field1026 += var2.field1025.method925();
                    } else if (var2.field1015 == 2 && (var2.field1018 == null || var2.field1024 == null)) {
                        if (var2.field1018 == null) {
                            var2.field1018 = class42.method238(class39.field420, var2.field1019);
                        }
                        if (var2.field1018 == null) {
                            continue;
                        }
                        if (var2.field1024 == null) {
                            var2.field1024 = var2.field1018.method242(new int[] { 22050 });
                            if (var2.field1024 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field1026 < 0) {
                        int var11;
                        if (var2.field1020 == 0) {
                            var11 = class4.field81.field1423 * var2.field1013 >> 8;
                        } else {
                            int var4 = var2.field1020 >> 24 & 0x3;
                            if (class246.field3587.field1904 == var4) {
                                int var5 = var2.field1020 & 0xFF << 7;
                                int var6 = var2.field1020 >> 16 & 0xFF;
                                int var7 = (var6 << 7) + 64 - class246.field3587.field1896;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var2.field1020 >> 8 & 0xFF;
                                int var9 = (var8 << 7) + 64 - class246.field3587.field1899;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    var2.field1026 = -99999;
                                    continue;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var11 = class4.field81.field1418 * var2.field1013 * (var5 - var10) / var5 >> 8;
                            } else {
                                var11 = 0;
                            }
                        }
                        if (var11 > 0) {
                            class499 var12 = null;
                            if (var2.field1015 == 1) {
                                var12 = var2.field1025.method926().method2896(class338.field4882);
                            } else if (var2.field1015 == 2) {
                                var12 = var2.field1024;
                            }
                            class238 var13 = var2.field1014 = class238.method1499(var12, 100, var11);
                            var13.method1488(var2.field1021 - 1);
                            class138.field1810.method2309(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field1014.method2894(0)) {
                var3 = true;
            }
            if (var3) {
                class10.field140--;
                for (int var14 = var1; var14 < class10.field140; var14++) {
                    class289.field4229[var14] = class289.field4229[var14 + 1];
                }
                var1--;
            }
        }
        field552++;
        if (class207.field3003 && !class116.method777((byte) -128)) {
            if (class4.field81.field1422 != 0 && class467.field6521 != -1) {
                class503.method2976(class4.field81.field1422, true, class75.field927, false, class467.field6521, 0);
            }
            class207.field3003 = false;
        } else if (class4.field81.field1422 != 0 && class467.field6521 != -1 && !class116.method777((byte) -98)) {
            class61.method498(class186.field2681, 1);
            class124.field1682++;
            class30.field357.method2354(class467.field6521, false);
            class467.field6521 = -1;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I", line = 301)
    public static final int method280(int arg0, int arg1, String arg2, String arg3) {
        field550++;
        int var4 = arg3.length();
        if (arg0 != -16282) {
            method281(-16, 104, -12, 107, 11, -108, 7, false);
        }
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class265.method1683(0, var22);
            var9 = class265.method1683(0, var24);
            char var26 = class513.method3056(var22, arg1, true);
            char var27 = class513.method3056(var24, arg1, true);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class485.method2799((byte) -75, var28, arg1) - class485.method2799((byte) 127, var29, arg1);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg3.charAt(var16);
            char var19 = arg2.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class485.method2799((byte) -30, var20, arg1) - class485.method2799((byte) 122, var21, arg1);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class485.method2799((byte) 121, var14, arg1) - class485.method2799((byte) -72, var15, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIZ)V", line = 428)
    public static final void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg7) {
            field548 = null;
        }
        field553++;
        if (arg0 < 0 || arg2 < 0 || (class43.field494 - 1) <= arg0 || (class500.field7068 - 1) <= arg2) {
            return;
        }
        if (class268.field3910 == null) {
            return;
        }
        if (arg6 == 0) {
            class21 var8 = (class21) class38.method211(arg4, arg0, arg2);
            class21 var9 = (class21) class85.method615(arg4, arg0, arg2);
            if (var8 != null && arg3 != 2) {
                if (var8 instanceof class355) {
                    ((class355) var8).field5100.method660(98, arg5);
                } else {
                    class447.method2607(arg3, arg4, arg2, arg7, arg1, arg0, var8.method110((byte) 118), arg6, arg5);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class355) {
                    ((class355) var9).field5100.method660(100, arg5);
                    return;
                }
                class447.method2607(arg3, arg4, arg2, false, arg1, arg0, var9.method110((byte) 114), arg6, arg5);
                return;
            }
            return;
        }
        if (arg6 != 1) {
            if (arg6 == 2) {
                class21 var10 = (class21) class248.method1622(arg4, arg0, arg2, field557 == null ? (field557 = method282("nc")) : field557);
                if (var10 != null) {
                    if (arg3 == 11) {
                        arg3 = 10;
                    }
                    if (var10 instanceof class295) {
                        ((class295) var10).field4323.method660(47, arg5);
                        return;
                    }
                    class447.method2607(arg3, arg4, arg2, false, arg1, arg0, var10.method110((byte) 119), arg6, arg5);
                    return;
                }
            } else if (arg6 == 3) {
                class21 var11 = (class21) class87.method628(arg4, arg0, arg2);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class494) {
                    ((class494) var11).field6993.method660(108, arg5);
                    return;
                }
                class447.method2607(arg3, arg4, arg2, false, arg1, arg0, var11.method110((byte) 110), arg6, arg5);
            } else {
                return;
            }
            return;
        }
        class21 var12 = (class21) class335.method2002(arg4, arg0, arg2);
        if (var12 == null) {
            return;
        }
        if (!(var12 instanceof class475)) {
            int var13 = var12.method110((byte) 112);
            if (arg3 != 4 && arg3 != 5) {
                if (arg3 == 6) {
                    class447.method2607(4, arg4, arg2, false, arg1 + 4, arg0, var13, arg6, arg5);
                    return;
                }
                if (arg3 == 7) {
                    class447.method2607(4, arg4, arg2, false, (arg1 + 2 & 0x3) + 4, arg0, var13, arg6, arg5);
                } else if (arg3 == 8) {
                    class447.method2607(4, arg4, arg2, false, arg1 + 4, arg0, var13, arg6, arg5);
                    class447.method2607(4, arg4, arg2, false, (arg1 + 2 & 0x3) + 4, arg0, var13, arg6, arg5);
                    return;
                }
                return;
            }
            class447.method2607(4, arg4, arg2, false, arg1, arg0, var13, arg6, arg5);
            return;
        }
        ((class475) var12).field6616.method660(108, arg5);
        return;
    }
}
