import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class691 {

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "[I")
    public static int[] field9707 = new int[14];

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "F")
    public static float field9708;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "[I")
    public static int[] field9704;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)I", line = 8)
    public static final int method3801(byte arg0, int arg1, String arg2, String arg3) {
        field9705++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > (var7 - var9)) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
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
            var8 = class226.method1446(arg0 ^ 0x275C, var22);
            var9 = class226.method1446(10006, var24);
            char var26 = class641.method3574((byte) 110, var22, arg1);
            char var27 = class641.method3574((byte) 118, var24, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class402.method2294(var28, arg1, arg0 - 185) - class402.method2294(var29, arg1, arg0 ^ 0xFFFFFFCE);
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
                    return class402.method2294(var20, arg1, -120) - class402.method2294(var21, arg1, arg0 - 199);
                }
            }
        }
        if (arg0 != 74) {
            field9707 = null;
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class402.method2294(var14, arg1, -118) - class402.method2294(var15, arg1, -107);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 137)
    public static void method3802(int arg0) {
        field9704 = null;
        int var1 = -12 / ((arg0 - 20) / 56);
        field9707 = null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZLva;)V", line = 151)
    public static final void method3803(int arg0, boolean arg1, class457 arg2) {
        field9706++;
        class308 var3 = arg2.method2636((byte) 69);
        if (arg2.field6485 == 0) {
            arg2.field6479 = 0;
            class326.field4811 = 0;
            class308.field4576 = -1;
            return;
        }
        if (arg2.field6398 != -1 && arg2.field6427 == 0) {
            class131 var4 = class301.field4465.method2763(arg2.field6398, 31696);
            if (arg2.field6484 > 0 && var4.field1804 == 0) {
                class326.field4811 = 0;
                class308.field4576 = -1;
                arg2.field6479++;
                return;
            }
            if (arg2.field6484 <= 0 && var4.field1809 == 0) {
                class326.field4811 = 0;
                arg2.field6479++;
                class308.field4576 = -1;
                return;
            }
        }
        if (arg2.field6417 != -1 && arg2.field6424 <= class239.field3440) {
            class586 var5 = class569.field7652.method2128(arg2.field6417, -1);
            if (var5.field8178 && var5.field8185 != -1) {
                class131 var6 = class301.field4465.method2763(var5.field8185, 31696);
                if (arg2.field6484 > 0 && var6.field1804 == 0) {
                    class308.field4576 = -1;
                    class326.field4811 = 0;
                    arg2.field6479++;
                    return;
                }
                if (arg2.field6484 <= 0 && var6.field1809 == 0) {
                    arg2.field6479++;
                    class308.field4576 = -1;
                    class326.field4811 = 0;
                    return;
                }
            }
        }
        if (arg2.field6417 != -1 && class239.field3440 >= arg2.field6424) {
            class586 var7 = class569.field7652.method2128(arg2.field6417, -1);
            if (var7.field8178 && var7.field8185 != -1) {
                class131 var8 = class301.field4465.method2763(var7.field8185, 31696);
                if (arg2.field6484 > 0 && var8.field1804 == 0) {
                    arg2.field6479++;
                    class326.field4811 = 0;
                    class308.field4576 = -1;
                    return;
                }
                if (arg2.field6484 <= 0 && var8.field1809 == 0) {
                    class308.field4576 = -1;
                    class326.field4811 = 0;
                    arg2.field6479++;
                    return;
                }
            }
        }
        int var9 = arg2.field509;
        int var10 = arg2.field514;
        int var11 = arg2.field6483[arg2.field6485 - 1] * 512 + (arg2.method1722((byte) -121) * 256);
        int var12 = arg2.field6477[arg2.field6485 - 1] * 512 + (arg2.method1722((byte) -120) * 256);
        if (var11 <= var9) {
            if (var11 >= var9) {
                if (var12 > var10) {
                    arg2.method2630(false, 8192);
                } else if (var12 < var10) {
                    arg2.method2630(false, 0);
                }
            } else if (var12 > var10) {
                arg2.method2630(false, 6144);
            } else if (var12 >= var10) {
                arg2.method2630(false, 4096);
            } else {
                arg2.method2630(false, 2048);
            }
        } else if (var10 < var12) {
            arg2.method2630(false, 10240);
        } else if (var12 < var10) {
            arg2.method2630(false, 14336);
        } else {
            arg2.method2630(false, 12288);
        }
        byte var13 = arg2.field6482[arg2.field6485 - 1];
        if (!arg1 && (var11 - var9) > 1024 || (var11 - var9) < -1024 || var12 - var10 > 1024 || var12 - var10 < -1024) {
            arg2.field509 = var11;
            arg2.field514 = var12;
            arg2.method2644(-112, arg2.field6469, false);
            class308.field4576 = -1;
            if (arg2.field6484 > 0) {
                arg2.field6484--;
            }
            class326.field4811 = 0;
            arg2.field6485--;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg2 instanceof class225) {
            var15 = ((class225) arg2).field3245.field2431;
        }
        if (var15) {
            int var16 = arg2.field6469 - arg2.field6395.field9162;
            if (var16 != 0 && arg2.field6391 == -1 && arg2.field6394 != 0) {
                var14 = 8;
            }
            if (!arg1 && arg2.field6485 > 2) {
                var14 = 24;
            }
            if (!arg1 && arg2.field6485 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg1 && arg2.field6485 > 1) {
                var14 = 24;
            }
            if (!arg1 && arg2.field6485 > 2) {
                var14 = 32;
            }
        }
        if (arg0 <= 125) {
            return;
        }
        if (arg2.field6479 > 0 && arg2.field6485 > 1) {
            arg2.field6479--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field4555 != -1) {
            int var17 = var14 << 9;
            if (arg2.field6485 == 1) {
                int var18 = arg2.field6481 * arg2.field6481;
                int var19 = (var11 < arg2.field509 ? arg2.field509 - var11 : var11 - arg2.field509) << 9;
                int var20 = (arg2.field514 <= var12 ? var12 - arg2.field514 : arg2.field514 - var12) << 9;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field4555 * var21 * 2;
                if (var22 < var18) {
                    arg2.field6481 /= 2;
                } else if (var21 < var18 / 2) {
                    arg2.field6481 -= var3.field4555;
                    if (arg2.field6481 < 0) {
                        arg2.field6481 = 0;
                    }
                } else if (var17 > arg2.field6481) {
                    arg2.field6481 += var3.field4555;
                    if (var17 < arg2.field6481) {
                        arg2.field6481 = var17;
                    }
                }
            } else if (arg2.field6481 < var17) {
                arg2.field6481 += var3.field4555;
                if (var17 < arg2.field6481) {
                    arg2.field6481 = var17;
                }
            } else if (arg2.field6481 > 0) {
                arg2.field6481 -= var3.field4555;
                if (arg2.field6481 < 0) {
                    arg2.field6481 = 0;
                }
            }
            var14 = arg2.field6481 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class326.field4811 = 0;
        if (var9 == var11 && var10 == var12) {
            class308.field4576 = -1;
        } else {
            if (var11 > var9) {
                class326.field4811 |= 0x4;
                arg2.field509 += var14;
                if (var11 < arg2.field509) {
                    arg2.field509 = var11;
                }
            } else if (var9 > var11) {
                class326.field4811 |= 0x8;
                arg2.field509 -= var14;
                if (var11 > arg2.field509) {
                    arg2.field509 = var11;
                }
            }
            if (var10 < var12) {
                arg2.field514 += var14;
                class326.field4811 |= 0x1;
                if (arg2.field514 > var12) {
                    arg2.field514 = var12;
                }
            } else if (var10 > var12) {
                arg2.field514 -= var14;
                class326.field4811 |= 0x2;
                if (arg2.field514 < var12) {
                    arg2.field514 = var12;
                }
            }
            if (var14 < 32) {
                class308.field4576 = var13;
            } else {
                class308.field4576 = 2;
            }
        }
        if (arg2.field509 != var11 || arg2.field514 != var12) {
            return;
        }
        arg2.field6485--;
        if (arg2.field6484 > 0) {
            arg2.field6484--;
            return;
        }
    }
}
