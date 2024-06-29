import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class256 extends class61 {

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field4410 = 0;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "Lwm;")
    public static class152 field4419 = class157.method1048("glissement:", 92);

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "Lwm;")
    public static class152 field4416 = class157.method1048(":clanreq:", 114);

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "Z")
    public static boolean field4418 = false;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Lwm;")
    public class152 field4414;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lah;")
    public static class205 field4407;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "Lah;")
    public static class205 field4415;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "[I")
    public int[] field4403;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "[I")
    public int[] field4409;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
    public int[] field4412;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "[I")
    public int[] field4417;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 6)
    public final void method1785(int arg0) {
        field4408++;
        if (arg0 != 32768) {
            method1788((class205) null, (class205) null, true, (class205) null);
        }
        if (this.field4412 != null) {
            for (int var2 = 0; var2 < this.field4412.length; var2++) {
                this.field4412[var2] = class72.method493(this.field4412[var2], 32768);
            }
        }
        if (this.field4409 != null) {
            for (int var3 = 0; var3 < this.field4409.length; var3++) {
                this.field4409[var3] = class72.method493(this.field4409[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lhi;I)V", line = 39)
    public final void method1786(class291 arg0, int arg1) {
        if (arg1 < 7) {
            field4407 = (class205) null;
        }
        while (true) {
            int var3 = arg0.method2011(-44);
            if (var3 == 0) {
                field4400++;
                return;
            }
            this.method1787(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZILhi;)V", line = 64)
    private final void method1787(boolean arg0, int arg1, class291 arg2) {
        if (arg0) {
            return;
        }
        if (arg1 == 1) {
            this.field4414 = arg2.method2017(true);
        } else if (arg1 == 2) {
            int var4 = arg2.method2011(-23);
            this.field4409 = new int[var4];
            this.field4417 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4409[var5] = arg2.method2021((byte) 74);
                this.field4417[var5] = class198.method1326(arg2.method1962(arg0), (byte) -83);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method2011(-67);
            this.field4412 = new int[var6];
            this.field4403 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4412[var7] = arg2.method2021((byte) 74);
                this.field4403[var7] = class198.method1326(arg2.method1962(arg0), (byte) -47);
            }
        } else if (arg1 == 4) {
        }
        field4402++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lah;Lah;ZLah;)V", line = 124)
    public static final void method1788(class205 arg0, class205 arg1, boolean arg2, class205 arg3) {
        if (!arg2) {
            field4416 = (class152) null;
        }
        field4404++;
        class6.field88 = arg3;
        class11.field145 = arg0;
        class81.field1138 = arg1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILdi;II)Ljava/awt/Frame;", line = 156)
    public static final Frame method1789(int arg0, int arg1, int arg2, class151 arg3, int arg4, int arg5) {
        field4413++;
        if (!arg3.method953(-6801)) {
            return null;
        }
        if (arg2 == 0) {
            class210[] var6 = class185.method1229(arg3, 114);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3412 == arg4 && var6[var8].field3411 == arg1 && (arg0 == 0 || var6[var8].field3413 == arg0) && (!var7 || arg2 < var6[var8].field3414)) {
                    var7 = true;
                    arg2 = var6[var8].field3414;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg5 <= 94) {
            return (Frame) null;
        }
        class188 var9 = arg3.method968(arg4, arg0, arg2, arg1, (byte) -70);
        while (var9.field2980 == 0) {
            class4.method19(0, 10L);
        }
        Frame var10 = (Frame) var9.field2977;
        if (var10 == null) {
            return null;
        } else if (var9.field2980 == 2) {
            class117.method773(false, arg3, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)I", line = 230)
    public final int method1790(boolean arg0, int arg1) {
        field4405++;
        if (this.field4409 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0) {
            field4410 = -32;
        }
        while (this.field4409.length > var3) {
            if (this.field4417[var3] == arg1) {
                return this.field4409[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)I", line = 255)
    public final int method1791(int arg0, byte arg1) {
        field4406++;
        if (this.field4412 == null) {
            return -1;
        }
        if (arg1 != 2) {
            field4418 = false;
        }
        for (int var3 = 0; var3 < this.field4412.length; var3++) {
            if (this.field4403[var3] == arg0) {
                return this.field4412[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lah;I)V", line = 295)
    public static final void method1792(class205 arg0, int arg1) {
        class183.field2918 = arg0;
        field4411++;
        if (arg1 > -69) {
            method1788((class205) null, (class205) null, false, (class205) null);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIII)V", line = 306)
    public static final void method1793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4401++;
        int var6 = arg1 - arg0;
        int var7 = arg5 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class282.method1913(arg1, arg0, arg4, arg3, 0);
            }
        } else if (var6 == 0) {
            class140.method880(arg3, arg0, true, arg4, arg5);
        } else {
            if (arg2 != -740560532) {
                field4415 = (class205) null;
            }
            int var8 = (var6 << 12) / var7;
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class308.field5283) {
                var10 = (class308.field5283 * var8 >> 12) + var9;
                var11 = class308.field5283;
            } else if (class238.field3902 >= arg5) {
                var11 = arg5;
                var10 = arg1;
            } else {
                var11 = class238.field3902;
                var10 = (class238.field3902 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg4 < class308.field5283) {
                var12 = var9 + (class308.field5283 * var8 >> 12);
                var13 = class308.field5283;
            } else if (class238.field3902 < arg4) {
                var12 = (class238.field3902 * var8 >> 12) + var9;
                var13 = class238.field3902;
            } else {
                var13 = arg4;
                var12 = arg0;
            }
            if (var12 < class157.field2505) {
                var12 = class157.field2505;
                var13 = (class157.field2505 - var9 << 12) / var8;
            } else if (class110.field1553 < var12) {
                var13 = (class110.field1553 - var9 << 12) / var8;
                var12 = class110.field1553;
            }
            if (class157.field2505 > var10) {
                var11 = (class157.field2505 - var9 << 12) / var8;
                var10 = class157.field2505;
            } else if (class110.field1553 < var10) {
                var11 = (class110.field1553 - var9 << 12) / var8;
                var10 = class110.field1553;
            }
            class212.method1425(arg2 + 740560532, arg3, var12, var13, var11, var10);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 419)
    public static void method1794(byte arg0) {
        field4407 = null;
        int var1 = 122 % ((58 - arg0) / 53);
        field4419 = null;
        field4416 = null;
        field4415 = null;
    }
}
