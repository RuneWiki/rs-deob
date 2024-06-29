import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class class368 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Z")
    public static boolean field5291 = false;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lcb;")
    public static class544 field5295;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2283(int arg0) {
        class542 var1 = (class542) class622.field8773.method382(0);
        if (arg0 != -1) {
            return;
        }
        while (var1 != null) {
            if (var1.field7597.method4259(-27418)) {
                class770.method4236(var1.field7594, 1);
            } else {
                var1.field7597.method1518(-96);
                try {
                    var1.field7597.method4256(arg0 + 1576);
                } catch (Exception var5) {
                    class329.method2129("TV: " + var1.field7594, false, var5);
                    class770.method4236(var1.field7594, arg0 ^ 0xFFFFFFFE);
                }
                if (!var1.field7593 && !var1.field7595) {
                    class255 var3 = var1.field7597.method4258((byte) -99);
                    if (var3 != null) {
                        class430 var4 = var3.method1680(2);
                        if (var4 != null) {
                            var4.method2592(var1.field7592, -12484);
                            class229.field3307.method3443(var4);
                            var1.field7593 = true;
                        }
                    }
                }
            }
            var1 = (class542) class622.field8773.method391(37);
        }
        field5296++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 66)
    public static final void method2284(byte arg0) {
        field5292++;
        if (arg0 != -82) {
            method2285(44, (byte) 124, null, 49, null, 19, -76, -92, -63, -18, 90, 126);
        }
        int var1 = class2.field21 * 512 + 256;
        int var2 = class717.field10088 * 512 + 256;
        int var3 = class580.method3366(class410.field5771, (byte) -95, var2, var1) - class12.field251;
        if (class222.field3179 < 100) {
            if (var1 > class277.field3866) {
                class277.field3866 += class219.field3129 + ((var1 - class277.field3866) * class222.field3179 / 1000);
                if (var1 < class277.field3866) {
                    class277.field3866 = var1;
                }
            }
            if (class277.field3866 > var1) {
                class277.field3866 -= (class277.field3866 - var1) * class222.field3179 / 1000 + class219.field3129;
                if (var1 > class277.field3866) {
                    class277.field3866 = var1;
                }
            }
            if (var3 > class655.field9241) {
                class655.field9241 += (var3 - class655.field9241) * class222.field3179 / 1000 + class219.field3129;
                if (class655.field9241 > var3) {
                    class655.field9241 = var3;
                }
            }
            if (var2 > class359.field5216) {
                class359.field5216 += (var2 - class359.field5216) * class222.field3179 / 1000 + class219.field3129;
                if (class359.field5216 > var2) {
                    class359.field5216 = var2;
                }
            }
            if (class655.field9241 > var3) {
                class655.field9241 -= (class655.field9241 - var3) * class222.field3179 / 1000 + class219.field3129;
                if (var3 > class655.field9241) {
                    class655.field9241 = var3;
                }
            }
            if (var2 < class359.field5216) {
                class359.field5216 -= (class359.field5216 - var2) * class222.field3179 / 1000 + class219.field3129;
                if (var2 > class359.field5216) {
                    class359.field5216 = var2;
                }
            }
        } else {
            class359.field5216 = class717.field10088 * 512 + 256;
            class277.field3866 = class2.field21 * 512 + 256;
            class655.field9241 = class580.method3366(class410.field5771, (byte) -95, class359.field5216, class277.field3866) - class12.field251;
        }
        int var4 = class719.field10104 * 512 + 256;
        int var5 = class785.field10789 * 512 + 256;
        int var6 = class580.method3366(class410.field5771, (byte) -95, var4, var5) - class200.field2942;
        int var7 = var5 - class277.field3866;
        int var8 = var6 - class655.field9241;
        int var9 = var4 - class359.field5216;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class689.field9757) {
            class689.field9757 += (var11 - class689.field9757 >> 3) * class367.field5290 / 1000 + class777.field10720 << 3;
            if (var11 < class689.field9757) {
                class689.field9757 = var11;
            }
        }
        if (class689.field9757 > var11) {
            class689.field9757 -= (class689.field9757 - var11 >> 3) * class367.field5290 / 1000 + class777.field10720 << 3;
            if (class689.field9757 < var11) {
                class689.field9757 = var11;
            }
        }
        int var13 = var12 - class118.field1478;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class118.field1478 += class367.field5290 * var14 / 1000 + class777.field10720 << 3;
            class118.field1478 &= 0x3FFF;
        }
        if (var14 < 0) {
            class118.field1478 -= -var14 * class367.field5290 / 1000 + class777.field10720 << 3;
            class118.field1478 &= 0x3FFF;
        }
        int var15 = var12 - class118.field1478;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class666.field9380 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class118.field1478 = var12;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBLaba;ILfda;IIIIIII)V", line = 228)
    public static final void method2285(int arg0, byte arg1, class185 arg2, int arg3, class336 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class115.field1447 = arg7;
        class224.field3220 = arg2;
        class241.field3465 = arg4;
        class52.field743 = arg8;
        if (arg1 <= 27) {
            method2284((byte) -74);
        }
        class421.field5945 = arg9;
        field5293++;
        class476.field6770 = arg5;
        class758.field10462 = null;
        class304.field4552 = arg6;
        class656.field9248 = arg3;
        class397.field5652 = arg11;
        class164.field2414 = arg10;
        class419.field5901 = null;
        class238.field3432 = arg0;
        class134.field1742 = null;
        class659.method3764((byte) -121);
        class780.field10754 = true;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V", line = 256)
    public static void method2287(byte arg0) {
        field5295 = null;
        if (arg0 != 25) {
            field5291 = false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V", line = 267)
    public static final void method2288(int arg0) {
        if (arg0 >= 117) {
            field5294++;
            class595.method3447((byte) -30, -1, 255);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ldha;B)Ldha;")
    public abstract class85 method2286(class85 arg0, byte arg1);
}
