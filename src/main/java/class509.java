import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class509 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Ltt;")
    public class249 field7409;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
    public static int[] field7408 = new int[2];

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field7411 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILfh;)V")
    public static final void method3028(int arg0, class194 arg1) {
        field7412++;
        for (int var2 = 0; var2 < class275.field4311; var2++) {
            int var3 = arg1.method1340(-35);
            int var4 = arg1.method1396(-105);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class247.field3701[var3] != null) {
                class247.field3701[var3].field2206 = var4;
            }
        }
        if (arg0 != 2) {
            method3032(null, (byte) -17, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public abstract void method121(byte arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
    public abstract void method122(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILin;)V")
    public abstract void method125(byte arg0, int arg1, class169 arg2);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    public static final int method3029(int arg0, int arg1) {
        return class341.field5093 == null ? 0 : class341.field5093[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method3030(int arg0) {
        field7408 = null;
        if (arg0 != -26237) {
            method3028(-128, null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public static final void method3031(int arg0, int arg1) {
        class240.field3593 = -1;
        field7407++;
        if (arg0 == 37) {
            class362.field5337 = 3.0F;
        } else if (arg0 == 50) {
            class362.field5337 = 4.0F;
        } else if (arg0 == 75) {
            class362.field5337 = 6.0F;
        } else if (arg0 == 100) {
            class362.field5337 = 8.0F;
        } else if (arg0 == 200) {
            class362.field5337 = 16.0F;
        }
        class240.field3593 = -1;
        if (arg1 <= 126) {
            method3029(-83, 43);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
    public abstract boolean method124(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZ)V")
    public abstract void method123(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ltt;)V")
    public class509(class249 arg0) {
        this.field7409 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lwl;BZ)V")
    public static final void method3032(class521 arg0, byte arg1, boolean arg2) {
        field7410++;
        class477 var3 = arg0.method3101(-1);
        if (arg0.field7658 == 0) {
            class504.field7325 = 0;
            arg0.field7655 = 0;
            class441.field6570 = -1;
            return;
        }
        if (arg0.field7644 != -1 && arg0.field7588 == 0) {
            class61 var4 = class393.field5735.method1538(-4031, arg0.field7644);
            if (arg0.field7652 > 0 && var4.field975 == 0) {
                class441.field6570 = -1;
                class504.field7325 = 0;
                arg0.field7655++;
                return;
            }
            if (arg0.field7652 <= 0 && var4.field951 == 0) {
                class504.field7325 = 0;
                class441.field6570 = -1;
                arg0.field7655++;
                return;
            }
        }
        if (arg0.field7561 != -1 && arg0.field7595 <= class446.field6625) {
            class434 var5 = class232.field3490.method2625((byte) 116, arg0.field7561);
            if (var5.field6446 && var5.field6450 != -1) {
                class61 var6 = class393.field5735.method1538(-4031, var5.field6450);
                if (arg0.field7652 > 0 && var6.field975 == 0) {
                    arg0.field7655++;
                    class504.field7325 = 0;
                    class441.field6570 = -1;
                    return;
                }
                if (arg0.field7652 <= 0 && var6.field951 == 0) {
                    class441.field6570 = -1;
                    arg0.field7655++;
                    class504.field7325 = 0;
                    return;
                }
            }
        }
        if (arg0.field7561 != -1 && arg0.field7595 <= class446.field6625) {
            class434 var7 = class232.field3490.method2625((byte) 116, arg0.field7561);
            if (var7.field6446 && var7.field6450 != -1) {
                class61 var8 = class393.field5735.method1538(-4031, var7.field6450);
                if (arg0.field7652 > 0 && var8.field975 == 0) {
                    class441.field6570 = -1;
                    class504.field7325 = 0;
                    arg0.field7655++;
                    return;
                }
                if (arg0.field7652 <= 0 && var8.field951 == 0) {
                    class441.field6570 = -1;
                    class504.field7325 = 0;
                    arg0.field7655++;
                    return;
                }
            }
        }
        int var9 = arg0.field1275;
        int var10 = arg0.field1279;
        int var11 = arg0.field7654[arg0.field7658 - 1] * 128 + (arg0.method3045(0) * 64);
        int var12 = arg0.field7653[arg0.field7658 - 1] * 128 + arg0.method3045(0) * 64;
        if (var9 < var11) {
            if (var12 > var10) {
                arg0.method3104(89, 10240);
            } else if (var12 >= var10) {
                arg0.method3104(105, 12288);
            } else {
                arg0.method3104(arg1 ^ 0x16, 14336);
            }
        } else if (var9 > var11) {
            if (var10 < var12) {
                arg0.method3104(-60, 6144);
            } else if (var10 > var12) {
                arg0.method3104(-73, 2048);
            } else {
                arg0.method3104(-49, 4096);
            }
        } else if (var10 < var12) {
            arg0.method3104(-23, 8192);
        } else if (var12 < var10) {
            arg0.method3104(122, 0);
        }
        byte var13 = arg0.field7649[arg0.field7658 - 1];
        if (!arg2 && (var11 - var9) > 256 || var11 - var9 < -256 || var12 - var10 > 256 || var12 - var10 < -256) {
            arg0.field1279 = var12;
            arg0.field1275 = var11;
            arg0.method3100(0, arg0.field7612, false);
            class441.field6570 = -1;
            if (arg0.field7652 > 0) {
                arg0.field7652--;
            }
            arg0.field7658--;
            class504.field7325 = 0;
            return;
        }
        int var14 = 4;
        if (arg1 != -108) {
            method3028(10, null);
        }
        boolean var15 = true;
        if (arg0 instanceof class46) {
            var15 = ((class46) arg0).field718.field2589;
        }
        if (var15) {
            int var16 = arg0.field7612 - arg0.field7592.field4337;
            if (var16 != 0 && arg0.field7624 == -1 && arg0.field7572 != 0) {
                var14 = 2;
            }
            if (!arg2 && arg0.field7658 > 2) {
                var14 = 6;
            }
            if (!arg2 && arg0.field7658 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg2 && arg0.field7658 > 1) {
                var14 = 6;
            }
            if (!arg2 && arg0.field7658 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field7655 > 0 && arg0.field7658 > 1) {
            var14 = 8;
            arg0.field7655--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field6982 != -1) {
            int var17 = var14 << 7;
            if (arg0.field7658 == 1) {
                int var18 = arg0.field7656 * arg0.field7656;
                int var19 = (var11 >= arg0.field1275 ? var11 - arg0.field1275 : arg0.field1275 - var11) << 7;
                int var20 = (arg0.field1279 > var12 ? arg0.field1279 - var12 : -arg0.field1279 + var12) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field6982 * var21 * 2;
                if (var22 < var18) {
                    arg0.field7656 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg0.field7656 -= var3.field6982;
                    if (arg0.field7656 < 0) {
                        arg0.field7656 = 0;
                    }
                } else if (arg0.field7656 < var17) {
                    arg0.field7656 += var3.field6982;
                    if (var17 < arg0.field7656) {
                        arg0.field7656 = var17;
                    }
                }
            } else if (arg0.field7656 < var17) {
                arg0.field7656 += var3.field6982;
                if (arg0.field7656 > var17) {
                    arg0.field7656 = var17;
                }
            } else if (arg0.field7656 > 0) {
                arg0.field7656 -= var3.field6982;
                if (arg0.field7656 < 0) {
                    arg0.field7656 = 0;
                }
            }
            var14 = arg0.field7656 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class504.field7325 = 0;
        if (var9 == var11 && var10 == var12) {
            class441.field6570 = -1;
        } else {
            if (var11 > var9) {
                arg0.field1275 += var14;
                class504.field7325 |= 0x4;
                if (arg0.field1275 > var11) {
                    arg0.field1275 = var11;
                }
            } else if (var11 < var9) {
                class504.field7325 |= 0x8;
                arg0.field1275 -= var14;
                if (var11 > arg0.field1275) {
                    arg0.field1275 = var11;
                }
            }
            if (var12 > var10) {
                class504.field7325 |= 0x1;
                arg0.field1279 += var14;
                if (arg0.field1279 > var12) {
                    arg0.field1279 = var12;
                }
            } else if (var10 > var12) {
                arg0.field1279 -= var14;
                class504.field7325 |= 0x2;
                if (arg0.field1279 < var12) {
                    arg0.field1279 = var12;
                }
            }
            if (var14 < 8) {
                class441.field6570 = var13;
            } else {
                class441.field6570 = 2;
            }
        }
        if (arg0.field1275 == var11 && arg0.field1279 == var12) {
            if (arg0.field7652 > 0) {
                arg0.field7652--;
            }
            arg0.field7658--;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V")
    public abstract void method128(byte arg0, boolean arg1);
}
