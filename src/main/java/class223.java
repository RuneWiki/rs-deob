import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class223 extends class289 {

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[S")
    public static short[] field3714 = new short[256];

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    private int field3723;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    private int field3727;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "[B")
    private byte[] field3726;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 9)
    public static void method1626(int arg0) {
        field3714 = null;
        if (arg0 != 1721085095) {
            field3714 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V", line = 24)
    public final void method1236(int arg0, int arg1, int arg2) {
        if (arg0 != 255) {
            this.method1237(56);
        }
        if (arg1 == 0) {
            this.field3727 = this.field3731 - (arg2 >= 0 ? arg2 : -arg2);
            this.field3723 = 4096;
            this.field3727 = this.field3727 * this.field3727 >> 12;
            this.field3718 = this.field3727;
        } else {
            this.field3723 = this.field3727 * this.field3717 >> 12;
            this.field3727 = this.field3731 - (arg2 >= 0 ? arg2 : -arg2);
            this.field3727 = this.field3727 * this.field3727 >> 12;
            if (this.field3723 < 0) {
                this.field3723 = 0;
            } else if (this.field3723 > 4096) {
                this.field3723 = 4096;
            }
            this.field3727 = this.field3727 * this.field3723 >> 12;
            this.field3718 += this.field3727 * this.field3721 >> 12;
            this.field3721 = this.field3721 * this.field3713 >> 12;
        }
        field3720++;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 59)
    public final void method1234(int arg0) {
        this.field3718 >>= 0x4;
        this.field3721 = this.field3713;
        if (this.field3718 < 0) {
            this.field3718 = 0;
        } else if (this.field3718 > 255) {
            this.field3718 = 255;
        }
        field3716++;
        if (arg0 == 1740188684) {
            this.method1628(this.field3725++, (byte) this.field3718);
            this.field3718 = 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIII)I", line = 83)
    public static final int method1627(byte arg0, int arg1, int arg2, int arg3) {
        field3730++;
        if (class137.field2487 == null) {
            return 0;
        } else if (arg0 >= -119) {
            return 80;
        } else {
            int var4 = arg1 >> 7;
            int var5 = arg2 >> 7;
            if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
                return 0;
            }
            int var6 = arg3;
            int var7 = arg1 & 0x7F;
            int var8 = arg2 & 0x7F;
            if (arg3 < 3 && (class152.field2683[1][var5][var4] & 0x2) == 2) {
                var6 = arg3 + 1;
            }
            int var9 = (128 - var8) * class137.field2487[var6][var5][var4 + 1] + class137.field2487[var6][var5 + 1][var4 + 1] * var8 >> 7;
            int var10 = (128 - var8) * class137.field2487[var6][var5][var4] + (class137.field2487[var6][var5 + 1][var4] * var8) >> 7;
            return (128 - var7) * var10 + (var7 * var9) >> 7;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V", line = 127)
    public void method1628(int arg0, byte arg1) {
        field3719++;
        this.field3726[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIBI)V", line = 139)
    public static final void method1629(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3724++;
        int var6 = arg3 - arg5;
        int var7 = arg2 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class248.method1743(arg3, arg0, arg4 ^ 0xFFFFFFB7, arg1, arg5);
            }
        } else if (var6 == 0) {
            class248.method1740(0, arg5, arg2, arg1, arg0);
        } else if (arg4 == -62) {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg3;
                int var10 = arg1;
                arg1 = arg5;
                arg5 = var10;
                arg3 = var9;
            }
            if (arg1 > arg2) {
                int var11 = arg1;
                arg1 = arg2;
                int var12 = arg5;
                arg2 = var11;
                arg5 = arg3;
                arg3 = var12;
            }
            int var13 = arg5;
            int var14 = arg2 - arg1;
            int var15 = arg3 - arg5;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg5 >= arg3 ? -1 : 1;
            if (var8) {
                for (int var18 = arg1; var18 <= arg2; var18++) {
                    class64.field1007[var18][var13] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg2; var19++) {
                    class64.field1007[var13][var19] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([III[Ljava/lang/Object;I)V", line = 256)
    public static final void method1630(int[] arg0, int arg1, int arg2, Object[] arg3, int arg4) {
        if (arg1 != -1) {
            method1631(32, 118);
        }
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg0[var5];
            int var7 = arg2;
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var6;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (((var9 & 0x1) + var6) > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7++] = var11;
                }
            }
            arg0[arg4] = arg0[var7];
            arg0[var7] = var6;
            arg3[arg4] = arg3[var7];
            arg3[var7] = var8;
            method1630(arg0, -1, arg2, arg3, var7 - 1);
            method1630(arg0, -1, var7 + 1, arg3, arg4);
        }
        field3729++;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIFFF)V", line = 315)
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3731 = (int) (arg6 * 4096.0F);
        this.field3717 = (int) (arg7 * 4096.0F);
        this.field3721 = this.field3713 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lfk;", line = 328)
    public static final class53 method1631(int arg0, int arg1) {
        field3722++;
        class53 var2 = (class53) class289.field4612.method2400((long) arg0, arg1 ^ 0x68);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class209.field3545.method441(false, arg1, arg0);
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method480(63, new class336(var3));
        }
        class289.field4612.method2396(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ)V", line = 348)
    public static final void method1632(byte arg0, boolean arg1) {
        field3728++;
        if (arg0 >= -79) {
            field3714 = (short[]) null;
        }
        if (arg1) {
            if (class311.field4933 != -1) {
                class329.method2281(1023, class311.field4933);
            }
            for (class228 var2 = (class228) class172.field2972.method736(2); var2 != null; var2 = (class228) class172.field2972.method727((byte) -110)) {
                class58.method529(true, var2, 50);
            }
            class311.field4933 = -1;
            class172.field2972 = new class79(8);
            class67.method641((byte) -115);
            class311.field4933 = class197.field3371;
            class84.method762(false, 28406);
            class220.method1614(-106);
            class86.method769(class311.field4933, (byte) 65);
        }
        class321.field5075 = -1;
        class239.method1683(-20083, class254.field4101);
        class218.field3632 = new class205();
        class218.field3632.field1985 = 3000;
        class218.field3632.field2036 = 3000;
        if (!class43.field680 && class72.field1199 == 0) {
            class272.method1868(class321.field5091, (byte) -102);
            class33.method302((byte) -72, 10);
            return;
        }
        if (class191.field3194 == 2) {
            class32.field454 = class215.field3613 << 7;
            class269.field4309 = class81.field1325 << 7;
        } else {
            class161.method1282(2);
        }
        if (class43.field680) {
            class351.method2446(13);
        }
        class348.method2436((byte) -27);
        class33.method302((byte) 85, 28);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 409)
    public final void method1237(int arg0) {
        if (arg0 != -25048) {
            this.field3713 = 25;
        }
        this.field3725 = 0;
        this.field3718 = 0;
        field3715++;
    }
}
