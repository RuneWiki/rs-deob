import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class102 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lsk;")
    public static class423 field1819 = new class423("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lhi;")
    public static class131 field1821 = new class131(8, 0, 4, 1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZILta;)V")
    public static final void method757(boolean arg0, int arg1, class135 arg2) {
        field1820++;
        class14 var3 = arg2.method892((byte) -110);
        if (arg2.field2231 == 0) {
            class265.field4014 = 0;
            arg2.field2233 = 0;
            class245.field3686 = -1;
            return;
        }
        if (arg2.field2174 != -1 && arg2.field2188 == 0) {
            class87 var4 = class429.field6302.method106(-87, arg2.field2174);
            if (arg2.field2230 > 0 && var4.field1519 == 0) {
                class245.field3686 = -1;
                arg2.field2233++;
                class265.field4014 = 0;
                return;
            }
            if (arg2.field2230 <= 0 && var4.field1525 == 0) {
                class245.field3686 = -1;
                arg2.field2233++;
                class265.field4014 = 0;
                return;
            }
        }
        if (arg2.field2172 != -1 && arg2.field2218 <= class369.field5424) {
            class29 var5 = class201.field3192.method1250(arg2.field2172, 97);
            if (var5.field382 && var5.field373 != -1) {
                class87 var6 = class429.field6302.method106(-98, var5.field373);
                if (arg2.field2230 > 0 && var6.field1519 == 0) {
                    class265.field4014 = 0;
                    class245.field3686 = -1;
                    arg2.field2233++;
                    return;
                }
                if (arg2.field2230 <= 0 && var6.field1525 == 0) {
                    arg2.field2233++;
                    class265.field4014 = 0;
                    class245.field3686 = -1;
                    return;
                }
            }
        }
        if (arg2.field2172 != -1 && class369.field5424 >= arg2.field2218) {
            class29 var7 = class201.field3192.method1250(arg2.field2172, -77);
            if (var7.field382 && var7.field373 != -1) {
                class87 var8 = class429.field6302.method106(-113, var7.field373);
                if (arg2.field2230 > 0 && var8.field1519 == 0) {
                    class265.field4014 = 0;
                    arg2.field2233++;
                    class245.field3686 = -1;
                    return;
                }
                if (arg2.field2230 <= 0 && var8.field1525 == 0) {
                    class265.field4014 = 0;
                    arg2.field2233++;
                    class245.field3686 = -1;
                    return;
                }
            }
        }
        if (arg1 < 120) {
            return;
        }
        int var9 = arg2.field3218;
        int var10 = arg2.field3222;
        int var11 = arg2.field2232[arg2.field2231 - 1] * 128 + (arg2.method337(0) * 64);
        int var12 = arg2.field2239[arg2.field2231 - 1] * 128 + (arg2.method337(0) * 64);
        if (var11 > var9) {
            if (var12 > var10) {
                arg2.method896((byte) 13, 10240);
            } else if (var12 >= var10) {
                arg2.method896((byte) 13, 12288);
            } else {
                arg2.method896((byte) 13, 14336);
            }
        } else if (var9 > var11) {
            if (var12 > var10) {
                arg2.method896((byte) 13, 6144);
            } else if (var10 > var12) {
                arg2.method896((byte) 13, 2048);
            } else {
                arg2.method896((byte) 13, 4096);
            }
        } else if (var10 < var12) {
            arg2.method896((byte) 13, 8192);
        } else if (var12 < var10) {
            arg2.method896((byte) 13, 0);
        }
        byte var13 = arg2.field2234[arg2.field2231 - 1];
        if (!arg0 && (var11 - var9 > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || (var12 - var10) < -256)) {
            arg2.field3218 = var11;
            arg2.field3222 = var12;
            arg2.method902(arg2.field2146, (byte) 104);
            class245.field3686 = -1;
            class265.field4014 = 0;
            arg2.field2231--;
            if (arg2.field2230 > 0) {
                arg2.field2230--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg2 instanceof class249) {
            var15 = ((class249) arg2).field3819.field3732;
        }
        if (var15) {
            int var16 = arg2.field2146 - arg2.field2211.field3297;
            if (var16 != 0 && arg2.field2148 == -1 && arg2.field2136 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg2.field2231 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg2.field2231 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg2.field2231 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg2.field2231 > 2) {
                var14 = 8;
            }
        }
        if (arg2.field2233 > 0 && arg2.field2231 > 1) {
            arg2.field2233--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field153 != -1) {
            int var17 = var14 << 7;
            if (arg2.field2231 == 1) {
                int var18 = arg2.field2229 * arg2.field2229;
                int var19 = (arg2.field3218 <= var11 ? var11 - arg2.field3218 : arg2.field3218 - var11) << 7;
                int var20 = (arg2.field3222 <= var12 ? var12 - arg2.field3222 : -var12 + arg2.field3222) << 7;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var3.field153 * var21 * 2;
                if (var22 < var18) {
                    arg2.field2229 /= 2;
                } else if (var21 < var18 / 2) {
                    arg2.field2229 -= var3.field153;
                    if (arg2.field2229 < 0) {
                        arg2.field2229 = 0;
                    }
                } else if (var17 > arg2.field2229) {
                    arg2.field2229 += var3.field153;
                    if (var17 < arg2.field2229) {
                        arg2.field2229 = var17;
                    }
                }
            } else if (var17 > arg2.field2229) {
                arg2.field2229 += var3.field153;
                if (var17 < arg2.field2229) {
                    arg2.field2229 = var17;
                }
            } else if (arg2.field2229 > 0) {
                arg2.field2229 -= var3.field153;
                if (arg2.field2229 < 0) {
                    arg2.field2229 = 0;
                }
            }
            var14 = arg2.field2229 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class265.field4014 = 0;
        if (var11 > var9) {
            class265.field4014 |= 0x4;
            arg2.field3218 += var14;
            if (arg2.field3218 > var11) {
                arg2.field3218 = var11;
            }
        } else if (var11 < var9) {
            arg2.field3218 -= var14;
            class265.field4014 |= 0x8;
            if (arg2.field3218 < var11) {
                arg2.field3218 = var11;
            }
        }
        if (var12 > var10) {
            arg2.field3222 += var14;
            class265.field4014 |= 0x1;
            if (var12 < arg2.field3222) {
                arg2.field3222 = var12;
            }
        } else if (var12 < var10) {
            arg2.field3222 -= var14;
            class265.field4014 |= 0x2;
            if (var12 > arg2.field3222) {
                arg2.field3222 = var12;
            }
        }
        if (var14 >= 8) {
            class245.field3686 = 2;
        } else {
            class245.field3686 = var13;
        }
        if (arg2.field3218 != var11 || arg2.field3222 != var12) {
            return;
        }
        arg2.field2231--;
        if (arg2.field2230 > 0) {
            arg2.field2230--;
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field1818++;
        if (!class376.method2264((byte) -117, arg2)) {
            return;
        }
        if (class332.field4972[arg2] == null) {
            client.method1187(class409.field5933[arg2], -1, arg8, arg4, arg5, arg7, arg0, arg3, arg9, arg1);
        } else {
            client.method1187(class332.field4972[arg2], -1, arg8, arg4, arg5, arg7, arg0, arg3, arg9, arg1);
        }
        if (arg6) {
            field1819 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static void method759(boolean arg0) {
        field1819 = null;
        if (arg0) {
            field1821 = null;
        }
    }
}
