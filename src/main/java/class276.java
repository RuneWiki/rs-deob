import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class276 {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "J")
    public static volatile long field4335 = 0L;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[I")
    public static int[] field4336 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field4338 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lpn;")
    public static class49 field4329 = new class49(52, -1);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "F")
    public static float field4330;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lo;")
    public static class363 field4341;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "[I")
    public static int[] field4342;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 4)
    public static void method1880(int arg0) {
        field4341 = null;
        field4329 = null;
        if (arg0 != 40) {
            method1880(41);
        }
        field4342 = null;
        field4336 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I", line = 19)
    public final int method1881(boolean arg0) {
        if (arg0) {
            this.method1882(-9, false, -15, 87);
        }
        field4331++;
        return this.field4337 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZII)Z", line = 30)
    public final boolean method1882(int arg0, boolean arg1, int arg2, int arg3) {
        field4340++;
        int var5 = this.field4334;
        if (this.field4337 == arg0 && this.field4334 == 0) {
            return false;
        }
        boolean var8;
        if (this.field4334 == 0) {
            if (arg0 > this.field4337 && arg0 <= this.field4337 + arg3 || arg0 < this.field4337 && arg0 >= (this.field4337 - arg3)) {
                this.field4337 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field4334 > 0 && arg0 > this.field4337) {
            int var6 = this.field4334 * this.field4334 / (arg3 * 2);
            int var7 = this.field4337 + var6;
            if (arg0 > var7 && this.field4337 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field4334 < 0 && arg0 < this.field4337) {
            int var9 = this.field4334 * this.field4334 / (arg3 * 2);
            int var10 = this.field4337 - var9;
            if (var10 > arg0 && this.field4337 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg0 <= this.field4337) {
                this.field4334 -= arg3;
                if (arg2 != 0 && this.field4334 < (-arg2)) {
                    this.field4334 = -arg2;
                }
            } else {
                this.field4334 += arg3;
                if (arg2 != 0 && arg2 < this.field4334) {
                    this.field4334 = arg2;
                }
            }
            if (this.field4334 != var5) {
                int var11 = this.field4334 * this.field4334 / (arg3 * 2);
                if (arg0 > this.field4337) {
                    if ((this.field4337 + var11) > arg0) {
                        this.field4334 = var5;
                    }
                } else if (this.field4337 > arg0 && arg0 > this.field4337 - var11) {
                    this.field4334 = var5;
                }
            }
        } else if (this.field4334 <= 0) {
            this.field4334 += arg3;
            if (this.field4334 > 0) {
                this.field4334 = 0;
            }
        } else {
            this.field4334 -= arg3;
            if (this.field4334 < 0) {
                this.field4334 = 0;
            }
        }
        if (!arg1) {
            this.method1882(70, false, -45, -73);
        }
        this.field4337 += this.field4334 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 169)
    public final void method1883(int arg0) {
        field4332++;
        this.field4337 &= 0x3FFF;
        int var2 = 124 / ((arg0 + 71) / 45);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lza;Lps;III)V", line = 180)
    public static final void method1884(class299 arg0, class352 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class474.field6947) {
            class281 var5 = class348.field5192[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field4371 != null && var5.field4371.method107((byte) -88)) {
                arg1.method102(arg0, 0, class90.field1454, -750, var5.field4371, 0, true);
            }
        }
        if (arg4 < class474.field6947) {
            class281 var6 = class348.field5192[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field4371 != null && var6.field4371.method107((byte) -88)) {
                arg1.method102(arg0, 0, 0, -750, var6.field4371, class90.field1454, true);
            }
        }
        if (arg3 < class474.field6947 && arg4 < class443.field6603) {
            class281 var7 = class348.field5192[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field4371 != null && var7.field4371.method107((byte) -88)) {
                arg1.method102(arg0, 0, class90.field1454, -750, var7.field4371, class90.field1454, true);
            }
        }
        if (arg3 < class474.field6947 && arg4 > 0) {
            class281 var8 = class348.field5192[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field4371 != null && var8.field4371.method107((byte) -88)) {
                arg1.method102(arg0, 0, class90.field1454, -750, var8.field4371, -class90.field1454, true);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 229)
    public static final void method1885(int arg0) {
        field4339++;
        if (arg0 <= 51) {
            field4338 = -7;
        }
        for (class382 var1 = (class382) class73.field1251.method1076((byte) 100); var1 != null; var1 = (class382) class73.field1251.method1077(-1)) {
            var1.method2420();
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V", line = 257)
    public final void method1886(boolean arg0, int arg1) {
        if (arg0) {
            this.method1883(48);
        }
        field4333++;
        this.field4334 = 0;
        this.field4337 = arg1;
    }
}
