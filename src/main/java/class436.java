import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class436 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
    public static int[] field5488 = new int[256];

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
    public static boolean field5484 = false;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
    public static int[] field5489 = new int[13];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "F")
    public static float field5483;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lqe;")
    public class436 field5485;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lwda;")
    public class597 field5486;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method2397(byte arg0) {
        int var1 = 42 / ((-arg0 - 65) / 42);
        field5489 = null;
        field5488 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public final void method2398(int arg0) {
        if (arg0 != 735366030) {
            return;
        }
        field5487++;
        if (class47.field635 >= 500) {
            return;
        }
        this.field5485 = class178.field2082;
        this.field5486 = null;
        this.field5491 = 0;
        class178.field2082 = this;
        class47.field635++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    public static final void method2399(int arg0, int arg1, int arg2) {
        field5482++;
        if (arg1 > -116) {
            method2399(-79, -127, 7);
        }
        class284 var3 = class367.field4732[arg2][arg0];
        if (var3 != null) {
            class197.field2313 = var3.field3602;
            class206.field2387 = var3.field3599;
            class196.field2307 = var3.field3606;
        }
        class99.method725((byte) -42);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5490++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class558.field6982 - class687.field9428) * var8 / 100 + class687.field9428;
        int var10 = arg3 * var9 >> 8;
        int var11 = 16384 - arg4 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = arg0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class243.field3129[var11] * -var10 >> 14;
            var15 = class243.field3128[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class243.field3129[var12] * var15 >> 14;
            var15 = class243.field3128[var12] * var15 >> 14;
        }
        client.field3568 = arg4;
        class613.field8340 = 0;
        class710.field9924 = arg5 - var15;
        class238.field3071 = arg6 - var13;
        class177.field2068 = arg7;
        class455.field5688 = arg1 - var14;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5488[var0] = var1;
        }
    }
}
