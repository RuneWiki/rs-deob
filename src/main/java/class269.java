import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class269 {

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Z")
    private boolean field4440 = false;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field4426 = 0;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public int field4444 = 0;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4430 = "purple:";

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field4438 = 0;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4431 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    private int field4429;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field4443;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public int field4445;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public int field4446;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "J")
    public long field4449;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lnm;")
    public static class221 field4434;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lfh;I)V", line = 4)
    public final void method1896(class313 arg0, int arg1) {
        if (arg1 >= -36) {
            return;
        }
        while (true) {
            int var3 = arg0.method2224(-122);
            if (var3 == 0) {
                field4442++;
                return;
            }
            this.method1901((byte) -84, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V", line = 27)
    public static final void method1897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class218.field3353 = arg3;
        class125.field1871 = arg0;
        class98.field1427 = arg5;
        if (arg2 >= -82) {
            method1900(26, 113, -26, 62, (class264) null, (byte) -11, (class187) null);
        }
        field4428++;
        class182.field2833 = arg4;
        class60.field919 = arg1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 45)
    public static void method1898(byte arg0) {
        if (arg0 > -6) {
            field4427 = 71;
        }
        field4434 = null;
        field4430 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 57)
    public static final void method1899(int arg0) {
        field4435++;
        class154.field2492.method651(0);
        if (arg0 > -123) {
            field4431 = -119;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILsi;BLoh;)V", line = 69)
    public static final void method1900(int arg0, int arg1, int arg2, int arg3, class264 arg4, byte arg5, class187 arg6) {
        field4433++;
        if (arg6 == null) {
            return;
        }
        int var7 = (int) class355.field5628 + class322.field5284 & 0x7FF;
        int var8 = arg0 * arg0 + arg1 * arg1;
        int var9 = Math.max(arg4.field4223 / 2, arg4.field4236 / 2) + 10;
        if (var8 > (var9 * var9) || arg5 < 70) {
            return;
        }
        int var10 = class272.field4470[var7];
        int var11 = var10 * 256 / (class196.field3008 + 256);
        int var12 = class272.field4480[var7];
        int var13 = var12 * 256 / (class196.field3008 + 256);
        int var14 = arg0 * var13 - arg1 * var11 >> 16;
        int var15 = arg0 * var11 + arg1 * var13 >> 16;
        if (class245.field3886) {
            ((class87) arg6).method567(arg4.field4223 / 2 + arg3 + var15 - (arg6.field2917 / 2), arg4.field4236 / 2 + arg2 + -var14 - arg6.field2909 / 2, (class232) arg4.method1859(-1, false));
        } else {
            ((class239) arg6).method1680(arg4.field4223 / 2 + arg3 + var15 - (arg6.field2917 / 2), arg4.field4236 / 2 + -var14 + -(arg6.field2909 / 2) + arg2, arg4.field4260, arg4.field4338);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BILfh;)V", line = 123)
    private final void method1901(byte arg0, int arg1, class313 arg2) {
        if (arg1 == 1) {
            this.field4429 = arg2.method2250(-1613178296);
        } else if (arg1 == 2) {
            arg2.method2224(-121);
        } else if (arg1 == 3) {
            this.field4424 = arg2.method2231((byte) -128);
            this.field4446 = arg2.method2231((byte) -128);
            this.field4443 = arg2.method2231((byte) -128);
        } else if (arg1 == 4) {
            this.field4445 = arg2.method2224(-124);
            this.field4437 = arg2.method2231((byte) -125);
        } else if (arg1 == 6) {
            this.field4439 = arg2.method2224(-126);
        } else if (arg1 == 8) {
            this.field4426 = 1;
        } else if (arg1 == 9) {
            this.field4444 = 1;
        } else if (arg1 == 10) {
            this.field4440 = true;
        }
        if (arg0 < -68) {
            field4441++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 186)
    public static final void method1902(boolean arg0) {
        class117.field1701 = 0;
        class259.field4099 = 0;
        class50.field738 = -1;
        class185.field2867 = -1;
        class201.field3091 = 0;
        class291.field4823 = -1;
        class195.field2992.field5137 = 0;
        class286.field4681 = false;
        class211.field3217 = 0;
        class159.field2552.field5137 = 0;
        class81.field1185 = -1;
        class161.method1140(0);
        field4448++;
        for (int var1 = 0; var1 < class130.field1984.length; var1++) {
            if (class130.field1984[var1] != null) {
                class130.field1984[var1].field4695 = -1;
            }
        }
        for (int var2 = 0; var2 < class329.field5377.length; var2++) {
            if (class329.field5377[var2] != null) {
                class329.field5377[var2].field4695 = -1;
            }
        }
        class293.method2068(arg0);
        field4427 = 1;
        class310.method2165(5, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class116.field1694[var3] = true;
        }
        class53.method385(59);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V", line = 244)
    public final void method1903(byte arg0) {
        if (arg0 != 8) {
            this.method1901((byte) 107, -91, (class313) null);
        }
        field4432++;
        this.field4425 = class272.field4480[this.field4429];
        this.field4447 = (int) Math.sqrt((double) (this.field4443 * this.field4443 + this.field4446 * this.field4446 + this.field4424 * this.field4424));
        if (this.field4437 == 0) {
            this.field4437 = 1;
        }
        if (this.field4445 == 0) {
            this.field4449 = 2147483647L;
        } else if (this.field4445 == 1) {
            this.field4449 = (long) (this.field4447 * 8 / this.field4437);
            this.field4449 *= this.field4449;
        } else if (this.field4445 == 2) {
            this.field4449 = (long) (this.field4447 * 8 / this.field4437);
        }
        if (this.field4440) {
            this.field4447 *= -1;
        }
    }
}
