import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class14 extends class182 {

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public int field430 = 0;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "Ldb;")
    public static class36 field435 = new class36();

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lkh;")
    private static class117 field439 = class224.method1450((byte) -46, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Lkh;")
    public static class117 field441 = class224.method1450((byte) -18, ")3runescape)3com");

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Lkh;")
    public static class117 field440 = field439;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static void method127(int arg0) {
        field441 = null;
        field440 = null;
        field435 = null;
        field439 = null;
        if (arg0 != 64) {
            field441 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLve;)V")
    public static final void method128(byte arg0, class234 arg1) {
        field436++;
        if (class44.field966 == arg1.field4252 || arg1.field4213 == -1 || arg1.field4225 != 0 || arg1.field4216 + 1 > class81.method555(arg1.field4213, (byte) -83).field3148[arg1.field4274]) {
            int var2 = class44.field966 - arg1.field4278;
            int var3 = arg1.field4256 * 64 + arg1.field4239 * 128;
            int var4 = arg1.field4254 * 128 + arg1.field4256 * 64;
            int var5 = arg1.field4256 * 64 + arg1.field4227 * 128;
            int var6 = arg1.field4271 * 128 + arg1.field4256 * 64;
            int var7 = arg1.field4252 - arg1.field4278;
            arg1.field4221 = ((var7 - var2) * var5 + var2 * var4) / var7;
            arg1.field4244 = ((var7 - var2) * var3 + var2 * var6) / var7;
        }
        arg1.field4260 = 0;
        if (arg1.field4264 == 0) {
            arg1.field4249 = 1024;
        }
        if (arg1.field4264 == 1) {
            arg1.field4249 = 1536;
        }
        if (arg1.field4264 == 2) {
            arg1.field4249 = 0;
        }
        if (arg0 != -99) {
            method127(4);
        }
        if (arg1.field4264 == 3) {
            arg1.field4249 = 512;
        }
        arg1.field4232 = arg1.field4249;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lkh;Lkh;II)V")
    public static final void method129(class117 arg0, class117 arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            class151.method1078(-1, (byte) 119, arg3, arg0, null, arg1);
            field434++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILnc;)V")
    private final void method130(boolean arg0, int arg1, class145 arg2) {
        field433++;
        if (arg0 && arg1 == 5) {
            this.field430 = arg2.method1049((byte) 93);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLnc;)V")
    public final void method131(boolean arg0, class145 arg1) {
        field437++;
        if (!arg0) {
            this.field430 = 95;
        }
        while (true) {
            int var3 = arg1.method998(69);
            if (var3 == 0) {
                return;
            }
            this.method130(true, var3, arg1);
        }
    }
}
