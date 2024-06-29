import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class289 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILfa;Lfa;)V", line = 4)
    public static final void method1883(int arg0, class312 arg1, class312 arg2) {
        if (arg0 != -3932) {
            return;
        }
        field4421++;
        if (arg1.field4936 != null) {
            arg1.method2143((byte) 125);
        }
        arg1.field4944 = arg2.field4944;
        arg1.field4936 = arg2;
        arg1.field4936.field4944 = arg1;
        arg1.field4944.field4936 = arg1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lwf;I)V", line = 23)
    public static final void method1884(class306 arg0, int arg1) {
        class269.field4153 = arg0;
        if (arg1 <= -63) {
            field4420++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIB)V", line = 39)
    public static final void method1885(int arg0, int arg1, byte arg2) {
        field4423++;
        short var3 = 256;
        if (class122.field1906 > 0) {
            class71.method513(class122.field1906, (byte) -95);
            class122.field1906 = 0;
        }
        int var4 = 0;
        int var5 = class57.field798 * arg1;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class96.field1476[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class57.field797[arg0 + (var5++)];
                int var11 = class237.field3801[var4++];
                if (var11 == 0) {
                    class220.field3501.field2734[var6++] = var10;
                } else {
                    int var12 = var11 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 238 - var11;
                    int var14 = client.field2047[var11];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class220.field3501.field2734[var6++] = class311.method2135(class311.method2135(65280, var14) * var12 + var13 * class311.method2135(65280, var10), 16711680) + class311.method2135(var13 * class311.method2135(var10, 16711935) + class311.method2135(var14, 16711935) * var12, -16711936) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class220.field3501.field2734[var6++] = class57.field797[arg0 + var5++];
            }
            var5 += class57.field798 - 128;
        }
        if (class333.field5166) {
            class238.method1623(class220.field3501.field2734, arg0, arg1, class220.field3501.field3847, class220.field3501.field3844);
        } else {
            class220.field3501.method917(arg0, arg1);
        }
        if (arg2 == 17) {
            ;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[Ljh;I)V", line = 127)
    public static final void method1886(byte arg0, class207[] arg1, int arg2) {
        field4419++;
        if (arg0 != -62) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class207 var4 = arg1[var3];
            if (var4 != null && var4.field3232 == arg2 && (!var4.field3267 || !client.method889(var4))) {
                if (var4.field3273 == 0) {
                    if (!var4.field3267 && client.method889(var4) && class168.field2575 != var4) {
                        continue;
                    }
                    method1886((byte) -62, arg1, var4.field3250);
                    if (var4.field3253 != null) {
                        method1886((byte) -62, var4.field3253, var4.field3250);
                    }
                    class45 var5 = (class45) class166.field2557.method1558((long) var4.field3250, false);
                    if (var5 != null) {
                        class264.method1748(var5.field640, arg0 ^ 0xFFFFFFA8);
                    }
                }
                if (var4.field3273 == 6) {
                    if (var4.field3243 != -1 || var4.field3226 != -1) {
                        boolean var6 = class248.method1686((byte) -18, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3226;
                        } else {
                            var7 = var4.field3243;
                        }
                        if (var7 != -1) {
                            class222 var8 = class118.method809((byte) 96, var7);
                            if (var8 != null) {
                                var4.field3275 += class81.field1208;
                                while (var8.field3522[var4.field3289] < var4.field3275) {
                                    var4.field3275 -= var8.field3522[var4.field3289];
                                    var4.field3289++;
                                    if (var4.field3289 >= var8.field3529.length) {
                                        var4.field3289 -= var8.field3540;
                                        if (var4.field3289 < 0 || var4.field3289 >= var8.field3529.length) {
                                            var4.field3289 = 0;
                                        }
                                    }
                                    var4.field3210 = var4.field3289 + 1;
                                    if (var8.field3529.length <= var4.field3210) {
                                        var4.field3210 -= var8.field3540;
                                        if (var4.field3210 < 0 || var8.field3529.length <= var4.field3210) {
                                            var4.field3210 = -1;
                                        }
                                    }
                                    class277.method1822(4096, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3185 != 0 && !var4.field3267) {
                        int var9 = var4.field3185 >> 16;
                        int var10 = class81.field1208 * var9;
                        var4.field3247 = var4.field3247 + var10 & 0x7FF;
                        int var11 = var4.field3185 << 16 >> 16;
                        int var12 = class81.field1208 * var11;
                        var4.field3215 = var4.field3215 + var12 & 0x7FF;
                        class277.method1822(4096, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I", line = 245)
    public static final int method1887(int arg0, int arg1) {
        field4424++;
        int var2 = 110 / ((arg0 + 54) / 43);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)I", line = 255)
    public static final int method1888(int arg0, byte arg1, int arg2) {
        field4422++;
        if (arg1 == -47) {
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg0 - var3;
        } else {
            return 69;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBI)I", line = 270)
    public static final int method1889(int arg0, int arg1, byte arg2, int arg3) {
        field4418++;
        if (arg0 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg1;
        int var5 = -15 % ((-arg2 - 17) / 36);
        int var6 = (arg0 & 0xFF00FF) * arg1 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00;
        int var7 = ((arg0 & 0xFF00FF00) >>> 7) * arg1 + (arg3 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        return (var6 >> 7) + var7;
    }
}
