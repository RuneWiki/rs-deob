import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class76 extends class305 {

    @OriginalMember(owner = "client!kk", name = "Lc", descriptor = "Ljava/lang/String;")
    public static String field1112 = "Select";

    @OriginalMember(owner = "client!kk", name = "Ic", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!kk", name = "Ec", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!kk", name = "Mc", descriptor = "Z")
    public static boolean field1113 = false;

    @OriginalMember(owner = "client!kk", name = "Hc", descriptor = "S")
    public static short field1108 = 1;

    @OriginalMember(owner = "client!kk", name = "uc", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kk", name = "vc", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!kk", name = "xc", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!kk", name = "yc", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!kk", name = "zc", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!kk", name = "Ac", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!kk", name = "Bc", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!kk", name = "Cc", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!kk", name = "Fc", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!kk", name = "Gc", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!kk", name = "Jc", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!kk", name = "Kc", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!kk", name = "Nc", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!kk", name = "wc", descriptor = "Lrj;")
    public static class269 field1097;

    @OriginalMember(owner = "client!kk", name = "Dc", descriptor = "Lcm;")
    public class332 field1104;

    @OriginalMember(owner = "client!kk", name = "Oc", descriptor = "Ljd;")
    public static class95 field1115;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()I", line = 4)
    public final int method565() {
        field1103++;
        return this.field4722;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIIIJILnl;)V", line = 12)
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        field1102++;
        if (this.field1104 == null) {
            return;
        }
        class28 var13 = this.field4707 != -1 && this.field4684 == 0 ? client.method1010(this.field4707, (byte) 119) : null;
        class28 var14 = this.field4765 == -1 || this.field4765 == this.method2099(83).field3988 && var13 != null ? null : client.method1010(this.field4765, (byte) 121);
        class74 var15 = this.field1104.method2318(var14, this.field4700, var13, 26706, this.field4685, this.field4743, this.field4727, this.field4699, this.field4672, this.field4695);
        if (var15 == null) {
            return;
        }
        this.field4722 = var15.method565();
        class332 var16 = this.field1104;
        if (var16.field5162 != null) {
            var16 = var16.method2324((byte) -118);
        }
        if (class134.field2036 && var16.field5122) {
            class74 var17 = class343.method2374(3, this.field1104.field5168, this.field4731, this.field1104.field5146, var15, var14 == null ? var13 : var14, var14 == null ? this.field4727 : this.field4743, this.field4713, this.field4683, this.field1104.field5169, this.field1104.field5181, arg0, this.field4732, this.field1104.field5137);
            if (class73.field1058) {
                float var18 = class73.method529();
                float var19 = class73.method515();
                class73.method538();
                class73.method524(var18, var19 - 150.0F);
                var17.method576(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4693);
                class73.method525();
                class73.method524(var18, var19);
            } else {
                var17.method576(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4693);
            }
        }
        this.method2090((byte) -100, var15);
        this.method2100((byte) -65, var15, arg0);
        class74 var20 = null;
        if (this.field4750 != -1 && this.field4754 != -1) {
            class38 var21 = class265.method1866(this.field4750, 11273);
            var20 = var21.method292(this.field4692, this.field4769, 90, this.field4754);
            if (var20 != null) {
                var20.method567(0, -this.field4759, 0);
                if (var21.field555) {
                    if (class163.field2644 != 0) {
                        var20.method559(class163.field2644);
                    }
                    if (class172.field2787 != 0) {
                        var20.method578(class172.field2787);
                    }
                    if (class203.field3116 != 0) {
                        var20.method567(0, class203.field3116, 0);
                    }
                }
            }
        }
        if (!class73.field1058) {
            if (var20 != null) {
                var15 = ((class113) var15).method870(var20);
            }
            if (this.field1104.field5181 == 1) {
                var15.field1085 = true;
            }
            var15.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4693);
            return;
        }
        if (this.field1104.field5181 == 1) {
            var15.field1085 = true;
        }
        var15.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4693);
        if (var20 != null) {
            if (this.field1104.field5181 == 1) {
                var20.field1085 = true;
            }
            var20.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4693);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLt;)V", line = 127)
    public static final void method595(boolean arg0, class305 arg1) {
        class258 var2 = arg1.method2099(106);
        arg1.field4765 = var2.field3988;
        if (arg0) {
            return;
        }
        field1110++;
        if (arg1.field4716 == 0) {
            arg1.field4764 = 0;
            return;
        }
        if (arg1.field4707 != -1 && arg1.field4684 == 0) {
            class28 var3 = client.method1010(arg1.field4707, (byte) 107);
            if (arg1.field4694 > 0 && var3.field342 == 0) {
                arg1.field4764++;
                return;
            }
            if (arg1.field4694 <= 0 && var3.field319 == 0) {
                arg1.field4764++;
                return;
            }
        }
        if (arg1.field4750 != -1 && class233.field3542 >= arg1.field4734) {
            class38 var4 = class265.method1866(arg1.field4750, 11273);
            if (var4.field563 && var4.field547 != -1) {
                class28 var5 = client.method1010(var4.field547, (byte) 125);
                if (arg1.field4694 > 0 && var5.field342 == 0) {
                    arg1.field4764++;
                    return;
                }
                if (arg1.field4694 <= 0 && var5.field319 == 0) {
                    arg1.field4764++;
                    return;
                }
            }
        }
        int var6 = arg1.field4713;
        int var7 = arg1.field4731;
        int var8 = arg1.field4676[arg1.field4716 - 1] * 128 + (arg1.method1897(8) * 64);
        int var9 = arg1.field4744[arg1.field4716 - 1] * 128 + arg1.method1897(8) * 64;
        if ((var8 - var6) > 256 || var8 - var6 < -256 || (var9 - var7) > 256 || (var9 - var7) < -256) {
            arg1.field4731 = var9;
            arg1.field4713 = var8;
            return;
        }
        if (var6 < var8) {
            if (var7 < var9) {
                arg1.field4674 = 1280;
            } else if (var7 > var9) {
                arg1.field4674 = 1792;
            } else {
                arg1.field4674 = 1536;
            }
        } else if (var6 > var8) {
            if (var7 < var9) {
                arg1.field4674 = 768;
            } else if (var9 < var7) {
                arg1.field4674 = 256;
            } else {
                arg1.field4674 = 512;
            }
        } else if (var7 < var9) {
            arg1.field4674 = 1024;
        } else if (var7 > var9) {
            arg1.field4674 = 0;
        }
        int var10 = arg1.field4674 - arg1.field4682 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        int var11 = var2.field3963;
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field3958;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field3972;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field3987;
        }
        int var12 = 4;
        boolean var13 = true;
        byte var14 = 1;
        if (var11 == -1) {
            var11 = var2.field3958;
        }
        arg1.field4765 = var11;
        if (arg1 instanceof class76) {
            var13 = ((class76) arg1).field1104.field5131;
        }
        if (var13) {
            if (arg1.field4682 != arg1.field4674 && arg1.field4671 == -1 && arg1.field4758 != 0) {
                var12 = 2;
            }
            if (arg1.field4716 > 2) {
                var12 = 6;
            }
            if (arg1.field4716 > 3) {
                var12 = 8;
            }
            if (arg1.field4764 > 0 && arg1.field4716 > 1) {
                arg1.field4764--;
                var12 = 8;
            }
        } else {
            if (arg1.field4716 > 1) {
                var12 = 6;
            }
            if (arg1.field4716 > 2) {
                var12 = 8;
            }
            if (arg1.field4764 > 0 && arg1.field4716 > 1) {
                arg1.field4764--;
                var12 = 8;
            }
        }
        if (arg1.field4741[arg1.field4716 - 1] == 2) {
            var12 <<= 0x1;
            var14 = 2;
        } else if (arg1.field4741[arg1.field4716 - 1] == 0) {
            var12 >>= 0x1;
            var14 = 0;
        }
        if (var12 < 8 || var2.field3956 == -1) {
            if (var2.field3957 != -1 && var14 == 0) {
                if (arg1.field4765 == var2.field3963 && var2.field3974 != -1) {
                    arg1.field4765 = var2.field3974;
                } else if (arg1.field4765 == var2.field3987 && var2.field3986 != -1) {
                    arg1.field4765 = var2.field3986;
                } else if (arg1.field4765 == var2.field3972 && var2.field3953 != -1) {
                    arg1.field4765 = var2.field3953;
                } else {
                    arg1.field4765 = var2.field3957;
                }
            }
        } else if (arg1.field4765 == var2.field3963 && var2.field3977 != -1) {
            arg1.field4765 = var2.field3977;
        } else if (arg1.field4765 == var2.field3987 && var2.field3967 != -1) {
            arg1.field4765 = var2.field3967;
        } else if (arg1.field4765 == var2.field3972 && var2.field3952 != -1) {
            arg1.field4765 = var2.field3952;
        } else {
            arg1.field4765 = var2.field3956;
        }
        if (var2.field3949 != -1) {
            int var15 = var12 << 7;
            if (arg1.field4716 == 1) {
                int var16 = arg1.field4708 * arg1.field4708;
                int var17 = (arg1.field4713 <= var8 ? var8 - arg1.field4713 : -var8 + arg1.field4713) << 7;
                int var18 = (var9 < arg1.field4731 ? arg1.field4731 - var9 : -arg1.field4731 + var9) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var2.field3949 * var19 * 2;
                if (var20 < var16) {
                    arg1.field4708 /= 2;
                } else if (var19 < var16 / 2) {
                    arg1.field4708 -= var2.field3949;
                    if (arg1.field4708 < 0) {
                        arg1.field4708 = 0;
                    }
                } else if (var15 > arg1.field4708) {
                    arg1.field4708 += var2.field3949;
                    if (arg1.field4708 > var15) {
                        arg1.field4708 = var15;
                    }
                }
            } else if (arg1.field4708 < var15) {
                arg1.field4708 += var2.field3949;
                if (var15 < arg1.field4708) {
                    arg1.field4708 = var15;
                }
            } else if (arg1.field4708 > 0) {
                arg1.field4708 -= var2.field3949;
                if (arg1.field4708 < 0) {
                    arg1.field4708 = 0;
                }
            }
            var12 = arg1.field4708 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var9 > var7) {
            arg1.field4731 += var12;
            if (var9 < arg1.field4731) {
                arg1.field4731 = var9;
            }
        } else if (var7 > var9) {
            arg1.field4731 -= var12;
            if (var9 > arg1.field4731) {
                arg1.field4731 = var9;
            }
        }
        if (var6 < var8) {
            arg1.field4713 += var12;
            if (var8 < arg1.field4713) {
                arg1.field4713 = var8;
            }
        } else if (var6 > var8) {
            arg1.field4713 -= var12;
            if (var8 > arg1.field4713) {
                arg1.field4713 = var8;
            }
        }
        if (arg1.field4713 == var8 && arg1.field4731 == var9) {
            arg1.field4716--;
            if (arg1.field4694 > 0) {
                arg1.field4694--;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(B)V", line = 474)
    public static void method596(byte arg0) {
        if (arg0 > -7) {
            method600(80, -82);
        }
        field1115 = null;
        field1097 = null;
        field1112 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLcm;)V", line = 486)
    public final void method597(byte arg0, class332 arg1) {
        field1098++;
        this.field1104 = arg1;
        if (this.field4693 != null) {
            this.field4693.method1702();
        }
        if (arg0 > -13) {
            this.method598(36);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)Z", line = 504)
    public final boolean method598(int arg0) {
        if (arg0 > -30) {
            return true;
        } else {
            field1095++;
            return this.field1104 != null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V", line = 522)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1101++;
        if (this.field1104 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V", line = 539)
    protected final void finalize() {
        field1100++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 547)
    public static final boolean method599(int arg0, String arg1, String arg2) {
        int var3 = arg1.length();
        field1111++;
        int var4 = arg2.length();
        if (var4 > var3) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        int var8 = 46 % ((arg0 - 64) / 36);
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(II)Lg;", line = 586)
    public static final class68 method600(int arg0, int arg1) {
        field1114++;
        class68 var2 = (class68) class235.field3587.method747((long) arg1, (byte) 106);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class250.field3766.method696(0, (byte) 109, arg1);
        class68 var4 = new class68(var3);
        if (arg0 != 6) {
            field1115 = (class95) null;
        }
        var4.method2277(class241.field3676, (int[]) null);
        class235.field3587.method744(var4, arg0 - 15698, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)I", line = 614)
    public final int method601(byte arg0) {
        if (arg0 >= -9) {
            method599(95, (String) null, (String) null);
        }
        field1096++;
        if (this.field1104.field5162 != null) {
            class332 var2 = this.field1104.method2324((byte) -121);
            if (var2 != null && var2.field5138 != -1) {
                return var2.field5138;
            }
        }
        return this.field4767;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)I", line = 644)
    public static final int method602(int arg0, int arg1, int arg2) {
        class130 var3 = (class130) class29.field355.method1716(-1, (long) arg2);
        field1107++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = arg0;
            for (int var5 = 0; var5 < var3.field1998.length; var5++) {
                if (var3.field1995[var5] == arg1) {
                    var4 += var3.field1998[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 673)
    public static final String method603(boolean arg0, int arg1, int arg2, int arg3) {
        field1106++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            int var7 = -31 % ((arg3) / 44);
            for (int var8 = var4 - 1; var8 > 0; var8--) {
                int var9 = arg2;
                arg2 /= arg1;
                int var10 = var9 - (arg1 * arg2);
                if (var10 < 10) {
                    var6[var8] = (char) (var10 + 48);
                } else {
                    var6[var8] = (char) (var10 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }
}
