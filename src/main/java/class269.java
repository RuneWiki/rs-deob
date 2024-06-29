import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class269 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4341 = 0;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[I")
    public static int[] field4343 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4346 = 0;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4344 = 1;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "J")
    public static long field4342 = 0L;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4340 = 0;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Z")
    public static boolean field4350 = false;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)Lmk;")
    public static final class109 method1792(int arg0, int arg1, int arg2, int arg3) {
        class109 var4 = new class109();
        var4.field1689 = arg2;
        var4.field1693 = arg0;
        field4345++;
        class74.field1192.method368((long) arg3, var4, -107);
        class152.method1035(false, arg2);
        class248 var5 = class281.method1913(arg3, (byte) 113);
        if (var5 != null) {
            class111.method776(var5, (byte) 25);
        }
        if (class221.field3485 != null) {
            class111.method776(class221.field3485, (byte) 25);
            class221.field3485 = null;
        }
        if (arg1 != 26) {
            field4346 = 0;
        }
        int var6 = class291.field4776;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class146.method1000(50, class26.field478[var7])) {
                class188.method1330(var7, arg1 - 8328);
            }
        }
        if (class291.field4776 == 1) {
            class41.field633 = false;
            class110.method773(true, class229.field3597, class128.field2059, class159.field2596, class120.field1904);
        } else {
            class110.method773(true, class229.field3597, class128.field2059, class159.field2596, class120.field1904);
            int var8 = class170.field2792.method527(class123.field1958);
            for (int var9 = 0; var9 < class291.field4776; var9++) {
                int var10 = class170.field2792.method527(class292.method2016(var9, 43));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class120.field1904 = (class248.field3903 ? 26 : 22) + class291.field4776 * 15;
            class159.field2596 = var8 + 8;
        }
        if (var5 != null) {
            class255.method1725((byte) -10, var5, false);
        }
        class273.method1807(arg2, arg1 - 1754690474);
        if (class68.field1089 != -1) {
            class297.method2035((byte) 82, class68.field1089, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1793(int arg0) {
        if (arg0 == 0) {
            field4343 = null;
        }
    }
}
