import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class382 extends class522 {

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    private int field5830 = 0;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "Lco;")
    private class442 field5819 = new class442();

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "Z")
    public static boolean field5817 = false;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "Lat;")
    public static class106 field5821;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Ldr;B)V")
    public final void method545(class420 arg0, byte arg1) {
        super.field7719[super.field7716] = 20;
        ++field5820;
        super.field7714[super.field7716] = arg0;
        ++super.field7716;
        if (arg1 != -13) {
            field5821 = null;
        }
        if (~super.field7716 <= -5001) {
            super.field7716 = 0;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)I")
    public static final int method2369(int arg0, int arg1, int arg2, int arg3) {
        ++field5823;
        int var4 = arg2 / arg3;
        int var5 = arg2 & arg3 - 1;
        int var6 = arg0 / arg3;
        int var7 = arg0 & arg3 + -1;
        int var8 = class112.method735(var4, arg1 + 2113, var6);
        int var9 = class112.method735(var4 + 1, 118, var6);
        int var10 = class112.method735(var4, 122, var6 + 1);
        if (arg1 != -2210) {
            method2371((int[]) null, (long[]) null, -38);
        }
        int var11 = class112.method735(var4 + 1, arg1 ^ -2292, var6 + 1);
        int var12 = class157.method1024(arg1 ^ 13046, arg3, var5, var8, var9);
        int var13 = class157.method1024(arg1 ^ 13046, arg3, var5, var10, var11);
        return class157.method1024(arg1 + -12726, arg3, var7, var12, var13);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lna;ZFIZ)V")
    public final void method542(class206 arg0, boolean arg1, float arg2, int arg3, boolean arg4) {
        ++field5831;
        super.field7719[super.field7716] = (byte) (!arg4 ? arg3 + 30 : arg3 + 40);
        super.field7714[super.field7716] = arg0;
        super.field7722[super.field7716] = arg2;
        ++super.field7716;
        if (!arg1) {
            method2372(-43);
        }
        if (~super.field7716 <= -5001) {
            super.field7716 = 0;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public final void method546(int arg0) {
        while (super.field7718 != super.field7716) {
            this.method2373(1);
        }
        if (arg0 != 0) {
            this.field5830 = 93;
        }
        ++field5827;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public static final void method2370(int arg0) {
        class325.field4993.method1015((byte) 95);
        if (arg0 != 0) {
            method2372(25);
        }
        ++field5825;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ldr;B)V")
    public final void method549(class420 arg0, byte arg1) {
        ++field5828;
        if (arg1 < -31) {
            --super.field7718;
            if (~super.field7718 > -1) {
                super.field7718 = 4999;
            }
            super.field7719[super.field7718] = 21;
            super.field7714[super.field7718] = arg0;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([I[JI)V")
    public static final void method2371(int[] arg0, long[] arg1, int arg2) {
        ++field5824;
        class242.method1618(arg1.length + -1, arg1, arg0, -19154, 0);
        if (arg2 != -15744) {
            method2370(46);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILdr;)V")
    public final void method541(int arg0, class420 arg1) {
        if (arg0 == -2) {
            super.field7719[super.field7716] = 21;
            ++field5826;
            super.field7714[super.field7716] = arg1;
            ++super.field7716;
            if (super.field7716 >= 5000) {
                super.field7716 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
    public static void method2372(int arg0) {
        if (arg0 == -5001) {
            field5821 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
    public final void method551(byte arg0) {
        int var2 = -109 / ((-9 - arg0) / 58);
        ++field5818;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V")
    private final void method2373(int arg0) {
        ++field5832;
        int var2 = super.field7718++;
        if (super.field7718 >= 5000) {
            super.field7718 = 0;
        }
        this.field5830 = super.field7719[var2];
        if (arg0 != 1) {
            field5821 = null;
        }
        Object var3 = super.field7714[var2];
        super.field7714[var2] = null;
        if (~this.field5830 == -22) {
            class156.method1010(this.field5819, (class420) var3);
        } else if (this.field5830 != 20) {
            if (~this.field5830 <= -31 && ~this.field5830 >= -34) {
                class351.field5447.method1087(3000.0F, super.field7722[var2] * 1.5F);
                ((class206) var3).method858(class10.field149, class29.field458, class75.field1021, class11.field171, this.field5830 + -30 == 0);
            } else if (this.field5830 >= 40 && this.field5830 <= 43) {
                class351.field5447.method1087(3000.0F, super.field7722[var2] * 1.5F);
                ((class206) var3).method858(class10.field149, class29.field458, class75.field1021, class25.field408, this.field5830 + -40 == 0);
            } else if (this.field5830 == 22) {
                class351.field5447.method1103(-1, 1583160, 40, 127);
            } else {
                if (this.field5830 != 23) {
                    if (~this.field5830 == -25) {
                        class351.field5447.method1106(0, (class471[]) null);
                        return;
                    }
                } else {
                    class351.field5447.method1044();
                }
            }
        } else {
            class420 var4 = (class420) var3;
            if (var4.field6261 != null) {
                var4.field6261.method62((byte) -126, class351.field5447);
            }
            if (var4.field6271 != null) {
                var4.field6271.method62((byte) -126, class351.field5447);
            }
            if (var4.field6277 != null) {
                var4.field6277.method62((byte) -126, class351.field5447);
            }
            if (var4.field6283 != null) {
                var4.field6283.method62((byte) -126, class351.field5447);
            }
            if (var4.field6260 != null) {
                var4.field6260.method62((byte) -126, class351.field5447);
            }
            for (class115 var5 = var4.field6273; var5 != null; var5 = var5.field1600) {
                var5.field1594.method62((byte) -126, class351.field5447);
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)V")
    public final void method547(int arg0, int arg1) {
        ++field5822;
        if (arg0 != 5754) {
            this.field5830 = 34;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZI)V")
    public final void method543(boolean arg0, int arg1) {
        super.field7719[super.field7716] = (byte) arg1;
        ++field5829;
        ++super.field7716;
        if (~super.field7716 <= -5001) {
            super.field7716 = 0;
        }
        if (arg0) {
            this.method547(112, -127);
        }
    }
}
