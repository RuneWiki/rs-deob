import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class131 {

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "Luaa;")
    private class395 field2123 = new class395(128);

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "Lgp;")
    private class561 field2122;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2124 = new BigInteger("9a597da960c5a73334b2eec21f6ee46c67171fdb3e0fce31d740dbc2b72af2be1a367dd846911478224bd36e59709b294b8bcd5db6ed826468d080b3e8d47cd71d04755da4b20179876cb3c1ec069ba231d4c529101a2d462733bd91d866a461a3bb781a0dc551590917906b7f5aa3b6553006ca8472108e371b76fe56a7ce2724525e787156a7e1902864fb7128eb294e06d93dd4afd513d09293d4ad062f9062de383eda2f1173c784304db607bc00e41cd9547f652899d4d15cc1f7701272ed46b826abf141985a94af3380e0c603f911a8e131f81ee988a519b83c607c9d628f6705e38f471fce518997f540e74d56fb8aac54087dd778cd39dfd4285defa986e7f22b2f226223335aefd9ca8553ab7bd48291e582d463a23f294666c0fd769d745c743e419c20c3c1553ea921300b5462f25c23d674e1093fea56469044f5f92f1aa199dacf6fa52d42741acba53308891cfb5293d8320c79c74ba7cf4f3622be7a355b37566a40276af01f70f2c9e1a701783a59a7ecd575928f62d81d29c56113adc76c900afb86862e067bb75c7950690755a94c41071f6451af723319889e959f656549933de2e07af2a9aaa8f9fc2c13c6c498d2f59a5dcefdc5947a72592f819fdcaed936bfb725f756503715f9e35b62a6398fbb78a9f34a96ba428219c2c01ac549cb4ebb24b16856ec265a8271f6681c447ab4cefde4050eab", 16);

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V", line = 9)
    public static void method1018(int arg0) {
        if (arg0 != 17584) {
            method1020(-0.3356611F, 126, -1.3127861F, -0.008595051F);
        }
        field2124 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZ)Lrh;", line = 24)
    public final class44 method1019(int arg0, boolean arg1) {
        field2120++;
        class395 var3 = this.field2123;
        class44 var4;
        synchronized (this.field2123) {
            var4 = (class44) this.field2123.method2407(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2122.method3175(class172.method1186(255, arg0), (byte) -53, class158.method1122(arg0, 1812914344));
        class44 var6 = new class44();
        if (var5 != null) {
            var6.method390(-1, new class268(var5));
        }
        class395 var7 = this.field2123;
        synchronized (this.field2123) {
            if (!arg1) {
                field2124 = null;
            }
            this.field2123.method2408(var6, (long) arg0, -115);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FIFF)I", line = 56)
    public static final int method1020(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 != 1) {
            method1018(-58);
        }
        field2121++;
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        float var5 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var6 < var5) {
            return (arg3 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg0 > 0.0F ? 2 : 3;
        } else if (arg2 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 106)
    public class131(class584 arg0, int arg1, class561 arg2) {
        this.field2122 = arg2;
        if (this.field2122 != null) {
            int var4 = this.field2122.method3185(-31) - 1;
            this.field2122.method3164(var4, true);
        }
    }
}
