import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class50 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method337(byte arg0) {
        field703++;
        if (arg0 == 4) {
            return (this.field700 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 16)
    public static final byte[] method338(boolean arg0, Object arg1, int arg2) {
        if (arg2 != 15900) {
            return null;
        }
        field698++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class546.method3034(var3, arg2 ^ 0xFFFFC1E3) : var3;
        } else if (arg1 instanceof class711) {
            class711 var4 = (class711) arg1;
            return var4.method3066(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z", line = 53)
    public final boolean method339(int arg0) {
        field699++;
        if (arg0 == 14499) {
            return (this.field700 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)Z", line = 66)
    public final boolean method340(byte arg0) {
        if (arg0 != 98) {
            method342(true, false);
        }
        field707++;
        return (this.field700 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I", line = 82)
    public static final int method341(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0x55555555);
        field705++;
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        if (arg0 == -21515) {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZZ)V", line = 99)
    public static final void method342(boolean arg0, boolean arg1) {
        field701++;
        if (class656.field8914.length() == 0) {
            return;
        }
        class415.method2378(0, "--> " + class656.field8914);
        class375.method2209(126, class656.field8914, arg0, arg1);
        class577.field7661 = 0;
        class656.field8914 = "";
        class157.field2484 = 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Z", line = 118)
    public final boolean method343(boolean arg0) {
        field708++;
        if (!arg0) {
            this.field706 = -60;
        }
        return (this.field700 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I", line = 131)
    public static final int method344(int arg0, int arg1, int arg2) {
        field704++;
        if (arg0 != 256) {
            return 41;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBZII)V", line = 155)
    public static final void method345(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field702++;
        if (class703.field9899 == null) {
            class10.field197.method3567(arg0, arg1, arg5, arg4, -16777216, (byte) 117);
        } else if (class199.field2897.field8620 >= 0 && class199.field2897.field8620 < class34.field530 * 512 && class199.field2897.field8612 >= 0 && class199.field2897.field8612 < (class34.field531 * 512)) {
            class20.field321++;
            if (class199.field2897 != null && (class199.field2897.field8620 - (class199.field2897.method2317((byte) 40) * 256 - 256) >> 9) == class123.field2061 && class199.field2897.field8612 - (class199.field2897.method2317((byte) 40) * 256 - 256) >> 9 == class476.field6353) {
                class123.field2061 = -1;
                class476.field6353 = -1;
                class174.method1177(10);
            }
            class102.method777(16);
            if (!arg3) {
                class426.method2437((byte) -30);
            }
            class85.method694(-3299);
            class646.method3542(arg0, 125, arg4, arg1, arg5, true);
            int var6 = class688.field9670;
            int var7 = class672.field9516;
            int var8 = class39.field581;
            int var9 = class178.field2732;
            if (class140.field2254 == 1) {
                int var12 = (int) class463.field6263;
                if ((class619.field8214 >> 8) > var12) {
                    var12 = class619.field8214 >> 8;
                }
                if (class141.field2262[4] && var12 < (class198.field2883[4] + 128)) {
                    var12 = class198.field2883[4] + 128;
                }
                int var13 = (int) class42.field602 + class256.field3549 & 0x3FFF;
                class295.method1813(var13, var12, ((var12 >> 3) * 3) + 600 << 2, 127, var7, class338.field4683, class193.field2827, class315.method1878(class199.field2897.field8620, 2921, class29.field476, class199.field2897.field8612) - 200);
            } else if (class140.field2254 == 4) {
                int var10 = (int) class463.field6263;
                if (var10 < class619.field8214 >> 8) {
                    var10 = class619.field8214 >> 8;
                }
                if (class141.field2262[4] && (class198.field2883[4] + 128) > var10) {
                    var10 = class198.field2883[4] + 128;
                }
                int var11 = (int) class42.field602 & 0x3FFF;
                class295.method1813(var11, var10, ((var10 >> 3) * 3) + 600 << 2, 122, var7, class338.field4683, class193.field2827, class315.method1878(class247.field3443, 2921, class29.field476, class412.field5654) - 200);
            } else if (class140.field2254 == 5) {
                class63.method510(-3, var7);
            }
            int var14 = class259.field3563;
            int var15 = class553.field7350;
            int var16 = class643.field8632;
            int var17 = class510.field6806;
            int var18 = class331.field4539;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class141.field2262[var19]) {
                    int var22 = (int) (Math.random() * (double) (class480.field6412[var19] * 2 + 1) + Math.sin((double) class102.field1523[var19] / 100.0D * (double) class460.field6243[var19]) * (double) class198.field2883[var19] - (double) class480.field6412[var19]);
                    if (var19 == 1) {
                        class553.field7350 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class643.field8632 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class510.field6806 += var22;
                        if (class510.field6806 < 1024) {
                            class510.field6806 = 1024;
                        } else if (class510.field6806 > 3072) {
                            class510.field6806 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class331.field4539 = class331.field4539 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class259.field3563 += var22 << 2;
                    }
                }
            }
            if (class259.field3563 < 0) {
                class259.field3563 = 0;
            }
            if (((class657.field8966 << 9) - 1) < class259.field3563) {
                class259.field3563 = (class657.field8966 << 9) - 1;
            }
            if (class643.field8632 < 0) {
                class643.field8632 = 0;
            }
            if (class643.field8632 > ((class227.field3196 << 9) - 1)) {
                class643.field8632 = (class227.field3196 << 9) - 1;
            }
            class256.method1572(10696);
            class627.method3454(13133);
            class10.field197.method421(var6, var9, var6 + var8, var7 + var9);
            class10.field197.method38();
            int var20 = class127.field2137;
            if (class111.field1784 == null) {
                class10.field197.method87(var20);
            } else {
                class111.field1784.method1191(var6, class10.field197, -1, class292.field4124 << 3, var7, var9, class331.field4539, var20, class510.field6806, var8);
            }
            class381.method2226((byte) -82);
            class166.field2583.method557(class259.field3563, class553.field7350, class643.field8632, -class510.field6806 & 0x3FFF, -class331.field4539 & 0x3FFF, -class370.field4993 & 0x3FFF);
            class10.field197.method405(class166.field2583);
            class10.field197.method373(var6 + (var8 / 2), var7 / 2 + var9, class355.field4830 << 1, class355.field4830 << 1);
            class428.method2442(-1, class355.field4830 << 1, class355.field4830 << 1, var7 / 2 + var9, var8 / 2 + var6);
            class260.method1593(class553.field7350, (byte) 123, -class370.field4993 & 0x3FFF, -class510.field6806 & 0x3FFF, class643.field8632, -class331.field4539 & 0x3FFF, class259.field3563);
            byte var21 = class344.field4718.method1568((byte) -127, class571.field7587) == 2 ? (byte) class20.field321 : 1;
            class261.method1601(class10.field197, class642.field8626, class80.field1258, class166.field2583, class259.field3563, class553.field7350, class643.field8632, class431.field5903, class405.field5463, class235.field3314, class267.field3709, class11.field206, class693.field9749, class199.field2897.field8609 + 1, var21, class199.field2897.field8620 >> 9, class199.field2897.field8612 >> 9, !class344.field4718.field5427);
            class381.method2226((byte) 105);
            if (class32.field525 == 10) {
                class190.method1243(256, var9, 28779, 256, var7, var8, var6);
                class168.method1148(var6, (byte) 127, 256, var7, 256, var9, var8);
                class266.method1626(var8, var6, var7, 256, 256, (byte) -118, var9);
                class180.method1202(var6, var7, var9, var8, false);
            }
            class586.method3225();
            if (arg2 < -62) {
                class331.field4539 = var18;
                class259.field3563 = var14;
                class553.field7350 = var15;
                class643.field8632 = var16;
                class510.field6806 = var17;
                if (class262.field3639 && class315.field4343.method788(3) == 0) {
                    class262.field3639 = false;
                }
                if (class262.field3639) {
                    class10.field197.method3567(var8, var6, var7, var9, -16777216, (byte) 123);
                    class172.method1166((byte) -43, class72.field1076.method546(class516.field6892, (byte) -35), false, class10.field197, class188.field2788, class665.field9437);
                }
            }
        } else {
            class10.field197.method3567(arg0, arg1, arg5, arg4, -16777216, (byte) 116);
        }
    }
}
