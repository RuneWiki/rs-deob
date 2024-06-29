import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class423 {

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public int field5710 = 43594;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "Z")
    public boolean field5712 = false;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
    public int field5711 = 443;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "Lada;")
    public static class144 field5706 = new class144(105, 7);

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public static int field5716 = 0;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "Z")
    public static boolean field5717 = false;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "S")
    public static short field5718 = 32767;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "Ljava/lang/String;")
    public String field5719;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "[I")
    public static int[] field5715;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIBI)I")
    public static final int method2482(int arg0, int arg1, byte arg2, int arg3) {
        field5713++;
        if (arg2 < 92) {
            return -27;
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        return (arg3 >> 1) + ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 5 << 7);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)I")
    public final int method2483(int arg0) {
        field5708++;
        if (this.field5712) {
            return this.field5711;
        } else {
            if (arg0 > -70) {
                field5706 = null;
            }
            return this.field5710;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
    public static void method2484(byte arg0) {
        int var1 = 13 / ((arg0 - 74) / 38);
        field5715 = null;
        field5706 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BZLfaa;)V")
    public static final void method2485(byte arg0, boolean arg1, class136 arg2) {
        int var3 = 109 / ((arg0 + 54) / 33);
        field5714++;
        class226 var4 = arg2.method947(false);
        if (arg2.field1953 == 0) {
            arg2.field1952 = 0;
            class346.field4754 = -1;
            class511.field7277 = 0;
            return;
        }
        if (arg2.field1872 != -1 && arg2.field1882 == 0) {
            class78 var5 = class463.field6521.method2983(arg2.field1872, -124);
            if (arg2.field1947 > 0 && var5.field1059 == 0) {
                class346.field4754 = -1;
                class511.field7277 = 0;
                arg2.field1952++;
                return;
            }
            if (arg2.field1947 <= 0 && var5.field1060 == 0) {
                class346.field4754 = -1;
                class511.field7277 = 0;
                arg2.field1952++;
                return;
            }
        }
        if (arg2.field1912 != -1 && arg2.field1890 <= class617.field9123) {
            class389 var6 = class59.field742.method863(arg2.field1912, (byte) -121);
            if (var6.field5352 && var6.field5357 != -1) {
                class78 var7 = class463.field6521.method2983(var6.field5357, -104);
                if (arg2.field1947 > 0 && var7.field1059 == 0) {
                    class346.field4754 = -1;
                    class511.field7277 = 0;
                    arg2.field1952++;
                    return;
                }
                if (arg2.field1947 <= 0 && var7.field1060 == 0) {
                    arg2.field1952++;
                    class511.field7277 = 0;
                    class346.field4754 = -1;
                    return;
                }
            }
        }
        if (arg2.field1912 != -1 && class617.field9123 >= arg2.field1890) {
            class389 var8 = class59.field742.method863(arg2.field1912, (byte) -124);
            if (var8.field5352 && var8.field5357 != -1) {
                class78 var9 = class463.field6521.method2983(var8.field5357, -103);
                if (arg2.field1947 > 0 && var9.field1059 == 0) {
                    class511.field7277 = 0;
                    arg2.field1952++;
                    class346.field4754 = -1;
                    return;
                }
                if (arg2.field1947 <= 0 && var9.field1060 == 0) {
                    class346.field4754 = -1;
                    arg2.field1952++;
                    class511.field7277 = 0;
                    return;
                }
            }
        }
        int var10 = arg2.field8496;
        int var11 = arg2.field8500;
        int var12 = arg2.field1957[arg2.field1953 - 1] * 128 + arg2.method940(-1) * 64;
        int var13 = arg2.field1955[arg2.field1953 - 1] * 128 + arg2.method940(-1) * 64;
        if (var12 <= var10) {
            if (var12 < var10) {
                if (var13 > var11) {
                    arg2.method955(6144, -78);
                } else if (var11 > var13) {
                    arg2.method955(2048, -87);
                } else {
                    arg2.method955(4096, 105);
                }
            } else if (var11 < var13) {
                arg2.method955(8192, 85);
            } else if (var11 > var13) {
                arg2.method955(0, -76);
            }
        } else if (var13 > var11) {
            arg2.method955(10240, -88);
        } else if (var13 >= var11) {
            arg2.method955(12288, 61);
        } else {
            arg2.method955(14336, 90);
        }
        byte var14 = arg2.field1948[arg2.field1953 - 1];
        if (!arg1 && var12 - var10 > 256 || var12 - var10 < -256 || var13 - var11 > 256 || (var13 - var11) < -256) {
            arg2.field8496 = var12;
            arg2.field8500 = var13;
            arg2.method941(false, arg2.field1896, (byte) 66);
            if (arg2.field1947 > 0) {
                arg2.field1947--;
            }
            arg2.field1953--;
            class511.field7277 = 0;
            class346.field4754 = -1;
            return;
        }
        int var15 = 4;
        boolean var16 = true;
        if (arg2 instanceof class571) {
            var16 = ((class571) arg2).field8405.field1308;
        }
        if (var16) {
            int var17 = arg2.field1896 - arg2.field1927.field2891;
            if (var17 != 0 && arg2.field1923 == -1 && arg2.field1851 != 0) {
                var15 = 2;
            }
            if (!arg1 && arg2.field1953 > 2) {
                var15 = 6;
            }
            if (!arg1 && arg2.field1953 > 3) {
                var15 = 8;
            }
        } else {
            if (!arg1 && arg2.field1953 > 1) {
                var15 = 6;
            }
            if (!arg1 && arg2.field1953 > 2) {
                var15 = 8;
            }
        }
        if (arg2.field1952 > 0 && arg2.field1953 > 1) {
            arg2.field1952--;
            var15 = 8;
        }
        if (var14 == 2) {
            var15 <<= 0x1;
        } else if (var14 == 0) {
            var15 >>= 0x1;
        }
        class511.field7277 = 0;
        if (var4.field3285 != -1) {
            int var18 = var15 << 7;
            if (arg2.field1953 == 1) {
                int var19 = arg2.field1956 * arg2.field1956;
                int var20 = (arg2.field8496 > var12 ? arg2.field8496 - var12 : var12 - arg2.field8496) << 7;
                int var21 = (var13 >= arg2.field8500 ? var13 - arg2.field8500 : -var13 + arg2.field8500) << 7;
                int var22 = var20 <= var21 ? var21 : var20;
                int var23 = var4.field3285 * 2 * var22;
                if (var23 < var19) {
                    arg2.field1956 /= 2;
                } else if ((var19 / 2) > var22) {
                    arg2.field1956 -= var4.field3285;
                    if (arg2.field1956 < 0) {
                        arg2.field1956 = 0;
                    }
                } else if (var18 > arg2.field1956) {
                    arg2.field1956 += var4.field3285;
                    if (arg2.field1956 > var18) {
                        arg2.field1956 = var18;
                    }
                }
            } else if (var18 > arg2.field1956) {
                arg2.field1956 += var4.field3285;
                if (arg2.field1956 > var18) {
                    arg2.field1956 = var18;
                }
            } else if (arg2.field1956 > 0) {
                arg2.field1956 -= var4.field3285;
                if (arg2.field1956 < 0) {
                    arg2.field1956 = 0;
                }
            }
            var15 = arg2.field1956 >> 7;
            if (var15 < 1) {
                var15 = 1;
            }
        }
        if (var10 == var12 && var11 == var13) {
            class346.field4754 = -1;
        } else {
            if (var12 > var10) {
                class511.field7277 |= 0x4;
                arg2.field8496 += var15;
                if (arg2.field8496 > var12) {
                    arg2.field8496 = var12;
                }
            } else if (var10 > var12) {
                arg2.field8496 -= var15;
                class511.field7277 |= 0x8;
                if (arg2.field8496 < var12) {
                    arg2.field8496 = var12;
                }
            }
            if (var13 > var11) {
                arg2.field8500 += var15;
                class511.field7277 |= 0x1;
                if (var13 < arg2.field8500) {
                    arg2.field8500 = var13;
                }
            } else if (var13 < var11) {
                arg2.field8500 -= var15;
                class511.field7277 |= 0x2;
                if (var13 > arg2.field8500) {
                    arg2.field8500 = var13;
                }
            }
            if (var15 >= 8) {
                class346.field4754 = 2;
            } else {
                class346.field4754 = var14;
            }
        }
        if (arg2.field8496 == var12 && arg2.field8500 == var13) {
            if (arg2.field1947 > 0) {
                arg2.field1947--;
            }
            arg2.field1953--;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILiaa;)Z")
    public final boolean method2486(int arg0, class423 arg1) {
        field5707++;
        if (arg0 != 0) {
            return true;
        } else if (arg1 == null) {
            return false;
        } else {
            return this.field5709 == arg1.field5709 && this.field5719.equals(arg1.field5719);
        }
    }
}
