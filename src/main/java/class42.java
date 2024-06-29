import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class42 extends class209 {

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[Z")
    public static boolean[] field584 = new boolean[200];

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Z")
    public static boolean field595 = true;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Led;")
    public static class187 field590 = new class187();

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method316(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field587;
        if (~arg2 <= -129 && arg6 >= 128 && arg2 <= 13056 && arg6 <= 13056) {
            if (arg3 <= -90) {
                int var8 = -arg7 + class129.method930(arg6, arg2, 81, class58.field826);
                int var9 = arg2 - class50.field736;
                int var10 = arg6 - class196.field3177;
                int var11 = class47.field679[class67.field988];
                int var12 = var8 - class185.field2986;
                int var13 = class47.field695[class218.field3485];
                int var14 = class47.field679[class218.field3485];
                int var15 = class47.field695[class67.field988];
                int var16 = var10 * var14 - -(var9 * var13) >> 16;
                int var17 = var10 * var13 + -(var9 * var14) >> 16;
                int var19 = var12 * var15 + -(var11 * var17) >> 16;
                int var20 = var11 * var12 + var15 * var17 >> 16;
                if (~var20 > -51) {
                    class297.field4697 = -1;
                    class268.field4332 = -1;
                } else {
                    class297.field4697 = arg5 - -((var19 << 9) / var20);
                    class268.field4332 = (var16 << 9) / var20 + arg1;
                }
            }
        } else {
            class268.field4332 = -1;
            class297.field4697 = -1;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static void method317(int arg0) {
        field590 = null;
        field584 = null;
        if (arg0 != 200) {
            field582 = -101;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)V")
    public final void method318(int arg0, int arg1, int arg2) {
        ++field588;
        int var4 = this.field583 * arg1 >> 12;
        int var5 = 63 % ((-72 - arg0) / 54);
        int var6 = this.field585 * arg1 >> 12;
        int var7 = this.field581 * arg2 >> 12;
        int var8 = this.field586 * arg2 >> 12;
        class45.method340(var6, 0, super.field3349, var7, super.field3353, var8, var4, super.field3348);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(III)V")
    public final void method319(int arg0, int arg1, int arg2) {
        ++field589;
        if (arg1 == -1) {
            int var4 = this.field585 * arg0 >> 12;
            int var5 = this.field583 * arg0 >> 12;
            int var6 = this.field586 * arg2 >> 12;
            int var7 = this.field581 * arg2 >> 12;
            class154.method1144(super.field3349, var5, super.field3353, var7, var4, 119, var6);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLlc;Llc;Lg;)V")
    public static final void method320(byte arg0, class86 arg1, class86 arg2, class284 arg3) {
        class36.field444 = arg3;
        ++field593;
        class34.field428 = arg2;
        class183.field2947 = arg1;
        if (arg0 != -5) {
            field582 = 53;
        }
        if (class183.field2947 != null) {
            class270.field4363 = class183.field2947.method617((byte) 47, 1);
        }
        if (class34.field428 != null) {
            class252.field4169 = class34.field428.method617((byte) 123, 1);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIII)V")
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field585 = arg0;
        this.field581 = arg3;
        this.field583 = arg2;
        this.field586 = arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;BIISJLjava/lang/String;I)V")
    public static final void method321(String arg0, byte arg1, int arg2, int arg3, short arg4, long arg5, String arg6, int arg7) {
        if (arg1 != 72) {
            method316(85, -31, 7, (byte) -50, 106, 123, -79, -34);
        }
        ++field592;
        if (!class206.field3315) {
            if (class243.field3890 < 500) {
                class226.field3632[class243.field3890] = arg0;
                class243.field3927[class243.field3890] = arg6;
                class82.field1186[class243.field3890] = arg2 == -1 ? class221.field3536 : arg2;
                class207.field3318[class243.field3890] = arg4;
                class49.field710[class243.field3890] = arg5;
                class276.field4425[class243.field3890] = arg7;
                class77.field1108[class243.field3890] = arg3;
                ++class243.field3890;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)V")
    public final void method322(int arg0, int arg1, byte arg2) {
        int var4 = -79 % ((arg2 - -55) / 60);
        ++field591;
        int var5 = this.field585 * arg0 >> 12;
        int var6 = this.field583 * arg0 >> 12;
        int var7 = this.field586 * arg1 >> 12;
        int var8 = this.field581 * arg1 >> 12;
        class290.method1969(var6, super.field3348, var8, 4, var5, var7);
    }
}
