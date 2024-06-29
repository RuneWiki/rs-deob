import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class355 extends class194 {

    @OriginalMember(owner = "client!vu", name = "C", descriptor = "[B")
    public byte[] field5469;

    @OriginalMember(owner = "client!vu", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field5471 = new String[] { method2914(method2913("i%^&\u001e")), method2914(method2913("d~^DK")), method2914(method2913("|~\u001cd")), method2914(method2913("d~^4\n|b\u00046K")), method2914(method2913("d~^CK")), method2914(method2913("d~^EK")), method2914(method2913("d~^GK")), method2914(method2913("d~^BK")), method2914(method2913("d~^FK")), method2914(method2913("d~^AK")) };

    @OriginalMember(owner = "client!vu", name = "H", descriptor = "[F")
    public static float[] field5470 = new float[2];

    @OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
    public int field5459;

    @OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!vu", name = "F", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!vu", name = "D", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!vu", name = "y", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)V")
    public final void method2906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field5461++;
            int var8 = 0;
            if (arg3 != arg4) {
                var8 = (arg6 - arg2 << 16) / (arg3 - arg4);
            }
            if (arg5 <= 67) {
                method2910(-115);
            }
            int var9 = 0;
            if (arg1 != arg3) {
                var9 = (arg0 - arg6 << 16) / (arg1 - arg3);
            }
            int var10 = 0;
            if (arg1 != arg4) {
                var10 = (arg2 - arg0 << 16) / (arg4 - arg1);
            }
            if (arg4 <= arg3 && arg1 >= arg4) {
                if (arg3 >= arg1) {
                    arg6 = arg2 <<= 0x10;
                    arg0 <<= 0x10;
                    if (arg4 < 0) {
                        arg6 -= arg4 * var10;
                        arg2 -= arg4 * var8;
                        arg4 = 0;
                    }
                    if (arg1 < 0) {
                        arg0 -= arg1 * var9;
                        arg1 = 0;
                    }
                    if (arg1 != arg4 && var10 < var8 || arg1 == arg4 && var9 > var8) {
                        arg3 -= arg1;
                        arg1 -= arg4;
                        arg4 = this.field5459 * arg4;
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg4, this.field5469, arg2 >> 16, arg0 >> 16, false, 0);
                                    arg4 += this.field5459;
                                    arg0 += var9;
                                    arg2 += var8;
                                }
                            }
                            class166.method1481(arg4, this.field5469, arg2 >> 16, arg6 >> 16, false, 0);
                            arg4 += this.field5459;
                            arg6 += var10;
                            arg2 += var8;
                        }
                    } else {
                        arg3 -= arg1;
                        arg1 -= arg4;
                        arg4 = this.field5459 * arg4;
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg4, this.field5469, arg0 >> 16, arg2 >> 16, false, 0);
                                    arg2 += var8;
                                    arg4 += this.field5459;
                                    arg0 += var9;
                                }
                            }
                            class166.method1481(arg4, this.field5469, arg6 >> 16, arg2 >> 16, false, 0);
                            arg4 += this.field5459;
                            arg6 += var10;
                            arg2 += var8;
                        }
                    }
                } else {
                    arg0 = arg2 <<= 0x10;
                    if (arg4 < 0) {
                        arg2 -= arg4 * var8;
                        arg0 -= arg4 * var10;
                        arg4 = 0;
                    }
                    arg6 <<= 0x10;
                    if (arg3 < 0) {
                        arg6 -= arg3 * var9;
                        arg3 = 0;
                    }
                    if (arg3 != arg4 && var8 > var10 || arg3 == arg4 && var9 < var10) {
                        arg1 -= arg3;
                        arg3 -= arg4;
                        arg4 = this.field5459 * arg4;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg4, this.field5469, arg6 >> 16, arg0 >> 16, false, 0);
                                    arg0 += var10;
                                    arg6 += var9;
                                    arg4 += this.field5459;
                                }
                            }
                            class166.method1481(arg4, this.field5469, arg2 >> 16, arg0 >> 16, false, 0);
                            arg2 += var8;
                            arg0 += var10;
                            arg4 += this.field5459;
                        }
                    } else {
                        arg1 -= arg3;
                        arg3 -= arg4;
                        arg4 = this.field5459 * arg4;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg4, this.field5469, arg0 >> 16, arg6 >> 16, false, 0);
                                    arg0 += var10;
                                    arg4 += this.field5459;
                                    arg6 += var9;
                                }
                            }
                            class166.method1481(arg4, this.field5469, arg0 >> 16, arg2 >> 16, false, 0);
                            arg0 += var10;
                            arg4 += this.field5459;
                            arg2 += var8;
                        }
                    }
                }
            } else if (arg3 > arg1) {
                if (arg4 < arg3) {
                    arg6 = arg0 <<= 0x10;
                    if (arg1 < 0) {
                        arg0 -= arg1 * var10;
                        arg6 -= arg1 * var9;
                        arg1 = 0;
                    }
                    arg2 <<= 0x10;
                    if (arg4 < 0) {
                        arg2 -= arg4 * var8;
                        arg4 = 0;
                    }
                    if (var10 <= var9) {
                        arg3 -= arg4;
                        arg4 -= arg1;
                        arg1 = this.field5459 * arg1;
                        while (true) {
                            arg4--;
                            if (arg4 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg1, this.field5469, arg6 >> 16, arg2 >> 16, false, 0);
                                    arg1 += this.field5459;
                                    arg2 += var8;
                                    arg6 += var9;
                                }
                            }
                            class166.method1481(arg1, this.field5469, arg6 >> 16, arg0 >> 16, false, 0);
                            arg0 += var10;
                            arg6 += var9;
                            arg1 += this.field5459;
                        }
                    } else {
                        arg3 -= arg4;
                        arg4 -= arg1;
                        arg1 = this.field5459 * arg1;
                        while (true) {
                            arg4--;
                            if (arg4 < 0) {
                                while (true) {
                                    arg3--;
                                    if (arg3 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg1, this.field5469, arg2 >> 16, arg6 >> 16, false, 0);
                                    arg1 += this.field5459;
                                    arg6 += var9;
                                    arg2 += var8;
                                }
                            }
                            class166.method1481(arg1, this.field5469, arg0 >> 16, arg6 >> 16, false, 0);
                            arg1 += this.field5459;
                            arg6 += var9;
                            arg0 += var10;
                        }
                    }
                } else {
                    arg2 = arg0 <<= 0x10;
                    if (arg1 < 0) {
                        arg2 -= arg1 * var9;
                        arg0 -= arg1 * var10;
                        arg1 = 0;
                    }
                    arg6 <<= 0x10;
                    if (arg3 < 0) {
                        arg6 -= arg3 * var8;
                        arg3 = 0;
                    }
                    if (var10 <= var9) {
                        arg4 -= arg3;
                        arg3 -= arg1;
                        arg1 = this.field5459 * arg1;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg4--;
                                    if (arg4 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg1, this.field5469, arg6 >> 16, arg0 >> 16, false, 0);
                                    arg6 += var8;
                                    arg0 += var10;
                                    arg1 += this.field5459;
                                }
                            }
                            class166.method1481(arg1, this.field5469, arg2 >> 16, arg0 >> 16, false, 0);
                            arg0 += var10;
                            arg2 += var9;
                            arg1 += this.field5459;
                        }
                    } else {
                        arg4 -= arg3;
                        arg3 -= arg1;
                        arg1 = this.field5459 * arg1;
                        while (true) {
                            arg3--;
                            if (arg3 < 0) {
                                while (true) {
                                    arg4--;
                                    if (arg4 < 0) {
                                        return;
                                    }
                                    class166.method1481(arg1, this.field5469, arg0 >> 16, arg6 >> 16, false, 0);
                                    arg1 += this.field5459;
                                    arg6 += var8;
                                    arg0 += var10;
                                }
                            }
                            class166.method1481(arg1, this.field5469, arg0 >> 16, arg2 >> 16, false, 0);
                            arg0 += var10;
                            arg1 += this.field5459;
                            arg2 += var9;
                        }
                    }
                }
            } else if (arg4 > arg1) {
                arg2 = arg6 <<= 0x10;
                arg0 <<= 0x10;
                if (arg3 < 0) {
                    arg6 -= arg3 * var9;
                    arg2 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg1 < 0) {
                    arg0 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg1 != arg3 && var9 > var8 || arg1 == arg3 && var10 < var8) {
                    arg4 -= arg1;
                    arg1 -= arg3;
                    arg3 = this.field5459 * arg3;
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg4--;
                                if (arg4 < 0) {
                                    return;
                                }
                                class166.method1481(arg3, this.field5469, arg0 >> 16, arg2 >> 16, false, 0);
                                arg0 += var10;
                                arg2 += var8;
                                arg3 += this.field5459;
                            }
                        }
                        class166.method1481(arg3, this.field5469, arg6 >> 16, arg2 >> 16, false, 0);
                        arg3 += this.field5459;
                        arg6 += var9;
                        arg2 += var8;
                    }
                } else {
                    arg4 -= arg1;
                    arg1 -= arg3;
                    arg3 = this.field5459 * arg3;
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg4--;
                                if (arg4 < 0) {
                                    return;
                                }
                                class166.method1481(arg3, this.field5469, arg2 >> 16, arg0 >> 16, false, 0);
                                arg0 += var10;
                                arg3 += this.field5459;
                                arg2 += var8;
                            }
                        }
                        class166.method1481(arg3, this.field5469, arg2 >> 16, arg6 >> 16, false, 0);
                        arg2 += var8;
                        arg6 += var9;
                        arg3 += this.field5459;
                    }
                }
            } else {
                arg0 = arg6 <<= 0x10;
                if (arg3 < 0) {
                    arg6 -= arg3 * var9;
                    arg0 -= arg3 * var8;
                    arg3 = 0;
                }
                arg2 <<= 0x10;
                if (arg4 < 0) {
                    arg2 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var8 >= var9) {
                    arg1 -= arg4;
                    arg4 -= arg3;
                    arg3 = this.field5459 * arg3;
                    while (true) {
                        arg4--;
                        if (arg4 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                class166.method1481(arg3, this.field5469, arg2 >> 16, arg6 >> 16, false, 0);
                                arg2 += var10;
                                arg3 += this.field5459;
                                arg6 += var9;
                            }
                        }
                        class166.method1481(arg3, this.field5469, arg0 >> 16, arg6 >> 16, false, 0);
                        arg0 += var8;
                        arg3 += this.field5459;
                        arg6 += var9;
                    }
                } else {
                    arg1 -= arg4;
                    arg4 -= arg3;
                    arg3 = this.field5459 * arg3;
                    while (true) {
                        arg4--;
                        if (arg4 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                class166.method1481(arg3, this.field5469, arg6 >> 16, arg2 >> 16, false, 0);
                                arg2 += var10;
                                arg6 += var9;
                                arg3 += this.field5459;
                            }
                        }
                        class166.method1481(arg3, this.field5469, arg6 >> 16, arg0 >> 16, false, 0);
                        arg3 += this.field5459;
                        arg0 += var8;
                        arg6 += var9;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field5471[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lcn;BLcn;)V")
    public static final void method2907(class541 arg0, byte arg1, class541 arg2) {
        try {
            class778.field11299++;
            field5462++;
            class280 var3 = class610.method4508(class269.field4098, class279.field4190, (byte) -114);
            var3.field4197.method1412(true, arg0.field8034);
            var3.field4197.method1418((byte) -124, arg0.field7999);
            var3.field4197.method1440(arg2.field8100, (byte) -35);
            var3.field4197.method1446(arg0.field8100, (byte) 98);
            int var4 = 119 % ((arg1 - 21) / 43);
            var3.field4197.method1416(-2804, arg2.field8034);
            var3.field4197.method1440(arg2.field7999, (byte) -35);
            class106.method934((byte) 53, var3);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5471[1] + (arg0 == null ? field5471[2] : field5471[0]) + ',' + arg1 + ',' + (arg2 == null ? field5471[2] : field5471[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "(B)V")
    public static void method2908(byte arg0) {
        try {
            field5470 = null;
            if (arg0 < 86) {
                field5470 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5471[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)Z")
    public final boolean method2909(int arg0, int arg1, int arg2) {
        try {
            field5467++;
            if (arg0 != -810) {
                this.field5459 = -30;
            }
            return arg1 * arg2 <= this.field5469.length;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5471[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V")
    public static final void method2910(int arg0) {
        try {
            field5464++;
            int var1 = class3.field34;
            int[] var2 = class358.field5483;
            for (int var3 = arg0; var3 < var1; var3++) {
                class726 var4 = class197.field2685[var2[var3]];
                if (var4 != null) {
                    class661.method4850((byte) -89, var4.method2101(31463), var4);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5471[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public final void method2911(int arg0) {
        try {
            field5463++;
            int var2 = 82 % ((-arg0 - 5) / 34);
            int var3 = -1;
            int var4 = this.field5469.length - 8;
            while (var3 < var4) {
                var3++;
                this.field5469[var3] = 0;
                var3++;
                this.field5469[var3] = 0;
                var3++;
                this.field5469[var3] = 0;
                var3++;
                this.field5469[var3] = 0;
                var3++;
                this.field5469[var3] = 0;
                var3++;
                this.field5469[var3] = 0;
                var3++;
                this.field5469[var3] = 0;
                var3++;
                this.field5469[var3] = 0;
            }
            while (this.field5469.length - 1 > var3) {
                var3++;
                this.field5469[var3] = 0;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5471[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIII)V")
    public final void method2912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field5460++;
            this.field5465 = arg1;
            this.field5468 = arg2;
            this.field5466 = arg0 - arg2;
            if (arg4 != -8823) {
                this.field5466 = 111;
            }
            this.field5459 = arg3 - arg1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5471[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lkd;II)V")
    public class355(class296 arg0, int arg1, int arg2) {
        try {
            this.field5469 = new byte[arg1 * arg2];
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5471[3] + (arg0 == null ? field5471[2] : field5471[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2913(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2914(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
