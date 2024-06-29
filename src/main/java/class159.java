import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class159 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2706 = new BigInteger("b3ef7c4209353f32686979c665a7927d64365acf947a9dc83e57495437d289399304b4447a6fa44031c5431b7908e27b39eb61042b6eaec3cd40248fb8b682d3ed38cb7aef49d08d9b14f080635a40e70ada924ad8178d5eaaa2f1257b4b5e768f3f7b381b46de26e777ad28cd965f67e407a8034dfce1eaf42b2cc3b78a7f9fb4a54d53d296e354999baab483f8f64a9d13d2ea516af9ef836a8359315fc71d76171ce24471b381181bebfb38d328b22bee8f3c3630e74e18e728c615e86a45419b93c0955c43dcd9e63a47288e190cd27d9c93f8c7186f734a71b8f1afd6f73fe3a73da97341cccf50a5c44831278a76aa924884bb130fab93808d3984782784901a919cea48722a280d362dc68cabd1f0256b7cf03d9cd348758f99060510006b33efbbcc90f7cb9c712f37349ed879cc62d0c74e29ad31890cb8b16235cc97740b5a0e5704d7c99244a5e017a7c83fc2e344360f9f9e182eea3a900a5fa4ec009f6ce3d2943f5d64314097757f5b1db4777ec0f6fa85772adb4e6b93f2f47cbf647163dbf8b744d30bfa5baeb52605ea327f06707daa2c49dacae05c4e038a2584d39a2d4930d97211d0b879cb9d1de617135d05e7e9b76e6615d3c008f0d64f8c7643d2c3d2248f62d2703bb8b761f07c73929417acff771cf6843a172a70a14b458ad4976470e86650508bffc9e6ea1600b20930bef5f2532db899b87d", 16);

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[I")
    public static int[] field2710 = new int[8];

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method1233(byte arg0) {
        class287 var1 = class395.field5768;
        synchronized (class395.field5768) {
            if (arg0 != 16) {
                return;
            }
            class395.field5768.method1913(true);
        }
        field2707++;
        class287 var2 = class319.field4696;
        synchronized (class319.field4696) {
            class319.field4696.method1913(true);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static final void method1234(int arg0) {
        field2709++;
        if (arg0 != 0) {
            return;
        }
        for (class616 var1 = (class616) class81.field1588.method1224(-2); var1 != null; var1 = (class616) class81.field1588.method1232(-2)) {
            if (var1.field8951 == -1) {
                var1.field8947 = 0;
                if (var1.field8953 >= 0 && var1.field8949 >= 0 && class675.field9604 > var1.field8953 && var1.field8949 < class218.field3316) {
                    class446.method2681((byte) -15, var1);
                }
            } else {
                var1.method2588(300);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public static void method1235(byte arg0) {
        field2710 = null;
        if (arg0 != -123) {
            method1233((byte) 64);
        }
        field2706 = null;
    }
}
