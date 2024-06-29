import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class232 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public int field3267 = 0;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public int field3270 = 0;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public int field3282 = 2048;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public int field3281 = 2048;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Lwe;")
    public static class24 field3271 = new class24(16);

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "[I")
    public static int[] field3277 = new int[14];

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "Z")
    public static boolean field3276 = false;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field3280 = 1;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "Lvg;")
    public static class108 field3279 = new class108(5000);

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "Lkn;")
    public static class16 field3272;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "Ldr;")
    public static class213 field3275;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILil;I)V", line = 8)
    private final void method1430(int arg0, int arg1, class265 arg2, int arg3) {
        if (arg1 == 1) {
            this.field3267 = arg2.method1697(-10);
        } else if (arg1 == 2) {
            this.field3282 = arg2.method1685(8104);
        } else if (arg1 == 3) {
            this.field3281 = arg2.method1685(8104);
        } else if (arg1 == 4) {
            this.field3270 = arg2.method1698(1625554944);
        }
        if (arg0 == -4) {
            field3268++;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILil;)V", line = 40)
    public final void method1431(int arg0, int arg1, class265 arg2) {
        if (arg0 != 14) {
            return;
        }
        field3273++;
        while (true) {
            int var4 = arg2.method1697(arg0 ^ 0x30);
            if (var4 == 0) {
                return;
            }
            this.method1430(arg0 ^ 0xFFFFFFF2, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 84)
    public static void method1432(int arg0) {
        field3272 = null;
        field3279 = null;
        field3271 = null;
        field3277 = null;
        field3275 = null;
        if (arg0 != 2048) {
            method1432(-53);
        }
    }
}
