import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class314 extends class629 {

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "Lbg;")
    public class464 field4338 = new class464();

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "Lcl;")
    public class265 field4349 = new class265();

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "Lem;")
    private class223 field4343;

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "S")
    public static short field4350 = 256;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(III)I", line = 10)
    public static final int method2026(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return 46;
        }
        field4347++;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "()Lpda;", line = 39)
    public final class629 method1361() {
        field4341++;
        class405 var1 = (class405) this.field4338.method2765(-12261);
        if (var1 == null) {
            return null;
        } else if (var1.field5724 == null) {
            return this.method1400();
        } else {
            return var1.field5724;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILqba;I)V", line = 56)
    private final void method2027(int arg0, class405 arg1, int arg2) {
        field4346++;
        if ((this.field4343.field2943[arg1.field5747] & 0x4) != 0 && arg1.field5742 < 0) {
            int var4 = this.field4343.field2922[arg1.field5747] / class68.field831;
            int var5 = (var4 + 1048575 - arg1.field5727) / var4;
            arg1.field5727 = arg1.field5727 + (arg2 * var4) & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field4343.field2947[arg1.field5747] == 0) {
                    arg1.field5724 = class379.method2389(arg1.field5743, arg1.field5724.method2395(), arg1.field5724.method2410(), arg1.field5724.method2415());
                } else {
                    arg1.field5724 = class379.method2389(arg1.field5743, arg1.field5724.method2395(), 0, arg1.field5724.method2415());
                    this.field4343.method1376(false, arg1, arg1.field5735.field2370[arg1.field5733] < 0);
                }
                if (arg1.field5735.field2370[arg1.field5733] < 0) {
                    arg1.field5724.method2383(-1);
                }
                arg2 = arg1.field5727 / var4;
            }
        }
        if (arg0 >= 7) {
            arg1.field5724.method1401(arg2);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I[IIILqba;I)V", line = 97)
    private final void method2028(int arg0, int[] arg1, int arg2, int arg3, class405 arg4, int arg5) {
        field4344++;
        if (arg0 > -108) {
            this.field4349 = null;
        }
        if ((this.field4343.field2943[arg4.field5747] & 0x4) != 0 && arg4.field5742 < 0) {
            int var7 = this.field4343.field2922[arg4.field5747] / class68.field831;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field5727) / var7;
                if (arg2 < var8) {
                    arg4.field5727 += arg2 * var7;
                    break;
                }
                arg4.field5724.method1378(arg1, arg3, var8);
                arg4.field5727 += var7 * var8 - 1048576;
                arg2 -= var8;
                arg3 += var8;
                int var9 = class68.field831 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class379 var11 = arg4.field5724;
                if (this.field4343.field2947[arg4.field5747] == 0) {
                    arg4.field5724 = class379.method2389(arg4.field5743, var11.method2395(), var11.method2410(), var11.method2415());
                } else {
                    arg4.field5724 = class379.method2389(arg4.field5743, var11.method2395(), 0, var11.method2415());
                    this.field4343.method1376(false, arg4, arg4.field5735.field2370[arg4.field5733] < 0);
                    arg4.field5724.method2396(var9, var11.method2410());
                }
                if (arg4.field5735.field2370[arg4.field5733] < 0) {
                    arg4.field5724.method2383(-1);
                }
                var11.method2388(var9);
                var11.method1378(arg1, arg3, arg5 - arg3);
                if (var11.method2378()) {
                    this.field4349.method1728(var11);
                }
            }
        }
        arg4.field5724.method1378(arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIII)V", line = 164)
    public static final void method2029(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class557.field7812.field6547.method3029(false) * arg3 >> 8;
        if (arg1 < 100) {
            method2026(-122, 26, 120);
        }
        field4342++;
        if (arg2 == -1 && !class105.field1268) {
            class105.method743(125);
        } else if (arg2 != -1 && (class118.field1431 != arg2 || !class70.method576(-21552)) && var4 != 0 && !class105.field1268) {
            class677.method3769(arg2, -99, var4, class587.field8276, arg0, 0, false);
            class64.method540(-1);
        }
        if (class118.field1431 != arg2) {
            class79.field1006 = null;
        }
        class118.field1431 = arg2;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lem;)V", line = 305)
    public class314(class223 arg0) {
        this.field4343 = arg0;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "()Lpda;", line = 198)
    public final class629 method1400() {
        field4351++;
        class405 var1;
        do {
            var1 = (class405) this.field4338.method2759(-15361);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5724 == null);
        return var1.field5724;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([III)V", line = 220)
    public final void method1378(int[] arg0, int arg1, int arg2) {
        field4340++;
        this.field4349.method1378(arg0, arg1, arg2);
        for (class405 var4 = (class405) this.field4338.method2765(-12261); var4 != null; var4 = (class405) this.field4338.method2759(-15361)) {
            if (!this.field4343.method1380((byte) 98, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field5746) {
                        this.method2028(-117, arg0, var5, var6, var4, var5 + var6);
                        var4.field5746 -= var5;
                        break;
                    }
                    this.method2028(-123, arg0, var4.field5746, var6, var4, var5 + var6);
                    var6 += var4.field5746;
                    var5 -= var4.field5746;
                } while (!this.field4343.method1377(128, var6, arg0, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "()I", line = 262)
    public final int method1382() {
        field4345++;
        return 0;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 270)
    public final void method1401(int arg0) {
        field4348++;
        this.field4349.method1401(arg0);
        for (class405 var2 = (class405) this.field4338.method2765(-12261); var2 != null; var2 = (class405) this.field4338.method2759(-15361)) {
            if (!this.field4343.method1380((byte) 98, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field5746) {
                        this.method2027(101, var2, var3);
                        var2.field5746 -= var3;
                        break;
                    }
                    this.method2027(82, var2, var2.field5746);
                    var3 -= var2.field5746;
                } while (!this.field4343.method1377(128, 0, null, var3, var2));
            }
        }
    }
}
