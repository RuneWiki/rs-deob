import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class145 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lbj;")
    public static class162 field2438 = new class162(28, -1);

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2441 = 0;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lms;IZ)V")
    public static final void method1076(class535 arg0, int arg1, boolean arg2) {
        field2439++;
        class166 var3 = arg0.method3169((byte) 23);
        if (arg0.field7863 == 0) {
            class166.field2688 = 0;
            arg0.field7872 = 0;
            class183.field2946 = -1;
            return;
        }
        if (arg0.field7768 != -1 && arg0.field7815 == 0) {
            class57 var4 = class422.field6355.method236(arg0.field7768, (byte) -65);
            if (arg0.field7873 > 0 && var4.field1209 == 0) {
                class183.field2946 = -1;
                class166.field2688 = 0;
                arg0.field7872++;
                return;
            }
            if (arg0.field7873 <= 0 && var4.field1200 == 0) {
                arg0.field7872++;
                class166.field2688 = 0;
                class183.field2946 = -1;
                return;
            }
        }
        if (arg0.field7843 != -1 && class62.field1268 >= arg0.field7803) {
            class533 var5 = class514.field7469.method595(-12186, arg0.field7843);
            if (var5.field7738 && var5.field7734 != -1) {
                class57 var6 = class422.field6355.method236(var5.field7734, (byte) -119);
                if (arg0.field7873 > 0 && var6.field1209 == 0) {
                    class183.field2946 = -1;
                    class166.field2688 = 0;
                    arg0.field7872++;
                    return;
                }
                if (arg0.field7873 <= 0 && var6.field1200 == 0) {
                    arg0.field7872++;
                    class166.field2688 = 0;
                    class183.field2946 = -1;
                    return;
                }
            }
        }
        if (arg0.field7843 != -1 && class62.field1268 >= arg0.field7803) {
            class533 var7 = class514.field7469.method595(-12186, arg0.field7843);
            if (var7.field7738 && var7.field7734 != -1) {
                class57 var8 = class422.field6355.method236(var7.field7734, (byte) -108);
                if (arg0.field7873 > 0 && var8.field1209 == 0) {
                    arg0.field7872++;
                    class183.field2946 = -1;
                    class166.field2688 = 0;
                    return;
                }
                if (arg0.field7873 <= 0 && var8.field1200 == 0) {
                    arg0.field7872++;
                    class166.field2688 = 0;
                    class183.field2946 = -1;
                    return;
                }
            }
        }
        int var9 = arg0.field6073;
        int var10 = arg0.field6078;
        int var11 = arg0.field7866[arg0.field7863 - 1] * 128 + arg0.method2241(-16) * 64;
        int var12 = arg0.field7870[arg0.field7863 - 1] * 128 + arg0.method2241(-24) * 64;
        if (var9 < var11) {
            if (var12 > var10) {
                arg0.method3166(0, 10240);
            } else if (var12 >= var10) {
                arg0.method3166(0, 12288);
            } else {
                arg0.method3166(0, 14336);
            }
        } else if (var9 > var11) {
            if (var12 > var10) {
                arg0.method3166(0, 6144);
            } else if (var12 >= var10) {
                arg0.method3166(0, 4096);
            } else {
                arg0.method3166(0, 2048);
            }
        } else if (var10 < var12) {
            arg0.method3166(0, 8192);
        } else if (var12 < var10) {
            arg0.method3166(0, 0);
        }
        if (arg1 > -127) {
            return;
        }
        byte var13 = arg0.field7864[arg0.field7863 - 1];
        if (!arg2 && ((var11 - var9) > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || (var12 - var10) < -256)) {
            arg0.field6073 = var11;
            arg0.field6078 = var12;
            arg0.method3156(false, 122, arg0.field7806);
            class166.field2688 = 0;
            class183.field2946 = -1;
            arg0.field7863--;
            if (arg0.field7873 > 0) {
                arg0.field7873--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class163) {
            var15 = ((class163) arg0).field2613.field1060;
        }
        if (var15) {
            int var16 = arg0.field7806 - arg0.field7814.field7625;
            if (var16 != 0 && arg0.field7804 == -1 && arg0.field7778 != 0) {
                var14 = 2;
            }
            if (!arg2 && arg0.field7863 > 2) {
                var14 = 6;
            }
            if (!arg2 && arg0.field7863 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg2 && arg0.field7863 > 1) {
                var14 = 6;
            }
            if (!arg2 && arg0.field7863 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field7872 > 0 && arg0.field7863 > 1) {
            var14 = 8;
            arg0.field7872--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field2667 != -1) {
            int var17 = var14 << 7;
            if (arg0.field7863 == 1) {
                int var18 = arg0.field7869 * arg0.field7869;
                int var19 = (var11 >= arg0.field6073 ? var11 - arg0.field6073 : -var11 + arg0.field6073) << 7;
                int var20 = (arg0.field6078 <= var12 ? var12 - arg0.field6078 : -var12 + arg0.field6078) << 7;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field2667 * 2 * var21;
                if (var22 < var18) {
                    arg0.field7869 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg0.field7869 -= var3.field2667;
                    if (arg0.field7869 < 0) {
                        arg0.field7869 = 0;
                    }
                } else if (var17 > arg0.field7869) {
                    arg0.field7869 += var3.field2667;
                    if (var17 < arg0.field7869) {
                        arg0.field7869 = var17;
                    }
                }
            } else if (arg0.field7869 < var17) {
                arg0.field7869 += var3.field2667;
                if (var17 < arg0.field7869) {
                    arg0.field7869 = var17;
                }
            } else if (arg0.field7869 > 0) {
                arg0.field7869 -= var3.field2667;
                if (arg0.field7869 < 0) {
                    arg0.field7869 = 0;
                }
            }
            var14 = arg0.field7869 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class166.field2688 = 0;
        if (var11 > var9) {
            class166.field2688 |= 0x4;
            arg0.field6073 += var14;
            if (var11 < arg0.field6073) {
                arg0.field6073 = var11;
            }
        } else if (var11 < var9) {
            class166.field2688 |= 0x8;
            arg0.field6073 -= var14;
            if (var11 > arg0.field6073) {
                arg0.field6073 = var11;
            }
        }
        if (var12 > var10) {
            class166.field2688 |= 0x1;
            arg0.field6078 += var14;
            if (var12 < arg0.field6078) {
                arg0.field6078 = var12;
            }
        } else if (var12 < var10) {
            arg0.field6078 -= var14;
            class166.field2688 |= 0x2;
            if (var12 > arg0.field6078) {
                arg0.field6078 = var12;
            }
        }
        if (var14 >= 8) {
            class183.field2946 = 2;
        } else {
            class183.field2946 = var13;
        }
        if (arg0.field6073 != var11 || arg0.field6078 != var12) {
            return;
        }
        arg0.field7863--;
        if (arg0.field7873 > 0) {
            arg0.field7873--;
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
    public static final boolean method1077(int arg0) {
        field2440++;
        if (arg0 == -17638) {
            return class9.field137 != class522.field7582 || class239.field3706 >= 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method1078(byte arg0) {
        field2438 = null;
        if (arg0 <= 36) {
            field2438 = null;
        }
    }
}
