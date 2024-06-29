import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class251 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field3437 = 0;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public int field3441 = 0;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field3439 = 2048;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field3438 = 2048;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "F")
    public static float field3446;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[Lf;")
    public static class701[] field3445;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILun;I)V")
    private final void method1533(int arg0, class389 arg1, int arg2) {
        field3444++;
        if (arg0 == 1) {
            this.field3437 = arg1.method2229(255);
        } else if (arg0 == 2) {
            this.field3439 = arg1.method2260(-111);
        } else if (arg0 == 3) {
            this.field3438 = arg1.method2260(-65);
        } else if (arg0 == 4) {
            this.field3441 = arg1.method2270((byte) 71);
        }
        if (arg2 >= -61) {
            method1538(null, -115);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1534(String arg0, byte arg1) {
        field3436++;
        return arg1 <= 94 ? 117 : arg0.length() + 1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljn;[IILjn;)V")
    public static final void method1535(class668 arg0, int[] arg1, int arg2, class668 arg3) {
        class660.field9374 = arg3;
        if (arg2 > -14) {
            field3445 = null;
        }
        if (arg1 != null) {
            class171.field2093 = arg1;
        }
        field3443++;
        class62.field1012 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1536(int arg0) {
        if (arg0 < 15) {
            field3446 = -0.27555358F;
        }
        field3445 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLun;)V")
    public final void method1537(byte arg0, class389 arg1) {
        if (arg0 != -96) {
            method1535(null, null, -43, null);
        }
        while (true) {
            int var3 = arg1.method2229(arg0 ^ 0xFFFFFF5F);
            if (var3 == 0) {
                field3447++;
                return;
            }
            this.method1533(var3, arg1, -98);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lec;I)V")
    public static final void method1538(class213 arg0, int arg1) {
        field3442++;
        boolean var2 = false;
        if (class543.field7882 == arg0.field2638 || arg0.field2637 == -1 || arg0.field2596 != 0) {
            var2 = true;
        } else {
            class282 var3 = class195.field2367.method3273(arg0.field2637, 0);
            if (var3.field3816 || var3.field3840[arg0.field2613] < (arg0.field2662 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field2638 - arg0.field2653;
            int var5 = class543.field7882 - arg0.field2653;
            int var6 = arg0.field2602 * 512 + (arg0.method1284((byte) -124) * 256);
            int var7 = arg0.field2650 * 512 + (arg0.method1284((byte) -124) * 256);
            int var8 = arg0.field2631 * 512 + arg0.method1284((byte) -124) * 256;
            int var9 = arg0.field2600 * 512 + arg0.method1284((byte) -124) * 256;
            arg0.field530 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field531 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field2688 = 0;
        if (arg0.field2622 == 0) {
            arg0.method1293((byte) -62, false, 8192);
        }
        if (arg0.field2622 == 1) {
            arg0.method1293((byte) -62, false, 12288);
        }
        if (arg1 != 256) {
            return;
        }
        if (arg0.field2622 == 2) {
            arg0.method1293((byte) -62, false, 0);
        }
        if (arg0.field2622 == 3) {
            arg0.method1293((byte) -62, false, 4096);
        }
    }
}
