import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class187 extends class276 {

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    private int field3026 = 0;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    private int field3027 = 0;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "I")
    private int field3033 = 1365;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    private int field3035 = 20;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field3029 = 0;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "Ldl;")
    public static class46 field3030 = null;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field3028 = (int) (33.0D * Math.random()) + -16;

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "Lvh;")
    public static class108 field3023;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 < 39) {
            this.method23(-85, 57);
        }
        ++field3025;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            for (int var4 = 0; ~class53.field929 < ~var4; ++var4) {
                int var5 = (class206.field3389[arg1] << 12) / this.field3033 + this.field3027;
                int var6 = var5;
                int var7 = (class175.field2883[var4] << 12) / this.field3033 + this.field3026;
                int var8 = var7;
                int var9 = var7;
                int var10 = var7 * var7 >> 12;
                int var11 = 0;
                int var12 = var5;
                int var13 = var5 * var5 >> 12;
                while (~(var10 + var13) > -16385 && ~var11 > ~this.field3035) {
                    ++var11;
                    var12 = (var8 * var12 >> 12) * 2 + var6;
                    var8 = -var13 + var10 - -var9;
                    var13 = var12 * var12 >> 12;
                    var10 = var8 * var8 >> 12;
                }
                var3[var4] = ~var11 <= ~(this.field3035 + -1) ? 0 : (var11 << 12) / this.field3035;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class187() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)V")
    public static final void method1224(int arg0) {
        if (arg0 >= -56) {
            field3023 = null;
        }
        class268.method1765(false, 78);
        System.gc();
        class217.method1441(25, -31239);
        ++field3038;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lbd;II)V")
    public static final void method1225(class81 arg0, int arg1, int arg2) {
        ++field3032;
        if (~arg0.field1435 >= ~class266.field4301) {
            if (arg0.field1469 >= class266.field4301) {
                class252.method1672(true, arg0);
            } else {
                class140.method982(arg0, -1);
            }
        } else {
            class103.method704(243087714, arg0);
        }
        if (arg1 != 0) {
            field3030 = null;
        }
        if (~arg0.field1397 > -129 || arg0.field1458 < 128 || ~arg0.field1397 <= -13185 || ~arg0.field1458 <= -13185) {
            arg0.field1396 = -1;
            arg0.field1384 = -1;
            arg0.field1435 = 0;
            arg0.field1469 = 0;
            arg0.field1397 = arg0.field1464[0] * 128 - -(arg0.method528(122) * 64);
            arg0.field1458 = arg0.field1486[0] * 128 + arg0.method528(120) * 64;
            arg0.method525(0);
        }
        if (class273.field4378 == arg0 && (arg0.field1397 < 1536 || ~arg0.field1458 > -1537 || ~arg0.field1397 <= -11777 || arg0.field1458 >= 11776)) {
            arg0.field1469 = 0;
            arg0.field1384 = -1;
            arg0.field1396 = -1;
            arg0.field1435 = 0;
            arg0.field1397 = arg0.field1464[0] * 128 + 64 * arg0.method528(-112);
            arg0.field1458 = arg0.field1486[0] * 128 - -(64 * arg0.method528(125));
            arg0.method525(arg1);
        }
        class59.method365(arg0, -13994);
        class31.method212(arg0, (byte) -94);
    }

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)V")
    public static void method1226(int arg0) {
        field3030 = null;
        int var1 = 94 / ((-20 - arg0) / 36);
        field3023 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field3036;
        if (arg2 != -1) {
            field3023 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field3027 = arg1.method677(false);
                    }
                } else {
                    this.field3026 = arg1.method677(false);
                }
            } else {
                this.field3035 = arg1.method677(false);
            }
        } else {
            this.field3033 = arg1.method677(false);
        }
    }
}
