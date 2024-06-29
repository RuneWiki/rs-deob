import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class256 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3549 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "S")
    public static short field3550 = 32767;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lcu;")
    public static class206 field3546 = new class206(62, 7);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
    public static int[] field3551 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)B")
    public static final byte method1571(int arg0, int arg1, int arg2) {
        field3542++;
        if (arg2 == 9) {
            return (byte) ((arg1 & arg0) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method1572(int arg0) {
        field3544++;
        if (class344.field4718.method1568((byte) -128, class571.field7587) != 2) {
            return;
        }
        byte var1 = (byte) (class20.field321 - 4 & 0xFF);
        int var2 = class20.field321 % class34.field530;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class34.field531; var18++) {
                class431.field5903[var3][var2][var18] = var1;
            }
        }
        if (class29.field476 == 3) {
            return;
        }
        if (arg0 != 10696) {
            field3549 = 50;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class405.field5463[var4] = -1000000;
            class235.field3314[var4] = 1000000;
            class267.field3709[var4] = 0;
            class693.field9749[var4] = 1000000;
            class11.field206[var4] = 0;
        }
        int var5 = class199.field2897.field8620;
        int var6 = class199.field2897.field8612;
        if (class140.field2254 != 1 && class376.field5068 == -1) {
            int var7 = class315.method1878(class259.field3563, 2921, class29.field476, class643.field8632);
            if ((var7 - class553.field7350) < 3200 && (class477.field6362[class29.field476][class259.field3563 >> 9][class643.field8632 >> 9] & 0x4) != 0) {
                class333.method1975(class703.field9899, 1, class643.field8632 >> 9, false, false, class259.field3563 >> 9);
                return;
            }
            return;
        }
        if (class140.field2254 != 1) {
            var5 = class376.field5068;
            var6 = class173.field2668;
        }
        if ((class477.field6362[class29.field476][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class333.method1975(class703.field9899, 0, var6 >> 9, false, false, var5 >> 9);
        }
        if (class510.field6806 >= 2560) {
            return;
        }
        int var8 = class259.field3563 >> 9;
        int var9 = class643.field8632 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 >= var10) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var11 <= var9) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if (var12 == 0 && var13 == 0 || var12 <= (-class34.field530) || class34.field530 <= var12 || var13 <= (-class34.field531) || class34.field531 <= var13) {
            class259.method1586(null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class473.field6334 + "," + class233.field3269, (byte) 8);
            return;
        }
        if (var12 > var13) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class477.field6362[class29.field476][var8][var9] & 0x4) != 0) {
                    class333.method1975(class703.field9899, 1, var9, false, false, var8);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var9 < var11) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    var15 -= 65536;
                    if ((class477.field6362[class29.field476][var8][var9] & 0x4) != 0) {
                        class333.method1975(class703.field9899, 1, var9, false, false, var8);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var9 < var11) {
                var9++;
            } else if (var9 > var11) {
                var9--;
            }
            if ((class477.field6362[class29.field476][var8][var9] & 0x4) != 0) {
                class333.method1975(class703.field9899, 1, var9, false, false, var8);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                var17 -= 65536;
                if ((class477.field6362[class29.field476][var8][var9] & 0x4) != 0) {
                    class333.method1975(class703.field9899, 1, var9, false, false, var8);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method1573(int arg0) {
        if (arg0 >= -67) {
            field3546 = null;
        }
        field3551 = null;
        field3546 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method1574(boolean arg0, int arg1, int arg2, int arg3) {
        field3547++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            int var7 = var4 - 1;
            if (arg1 != -1873) {
                return null;
            }
            while (var7 > 0) {
                int var8 = arg3;
                arg3 /= arg2;
                int var9 = var8 - (arg2 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
                var7--;
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!gf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3543++;
        throw new IllegalStateException();
    }
}
