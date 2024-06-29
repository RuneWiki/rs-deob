import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class180 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[Ldb;")
    public class296[] field2916 = null;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Ljba;")
    public class368 field2920 = null;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljba;")
    public class368 field2915 = null;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljba;")
    public class368 field2917 = null;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[Ldb;")
    public class296[] field2918 = null;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
    public boolean field2912;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2919 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Ldh;")
    public static class295 field2911;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1328(int arg0) {
        if (arg0 != 128) {
            method1331(-72);
        }
        field2911 = null;
        field2919 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static final void method1329(int arg0) {
        if (arg0 != 6409) {
            field2919 = null;
        }
        field2914++;
        if (class183.field2942 == 6) {
            class183.field2942 = 7;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method1330(byte arg0) {
        if (class495.field7061 != null) {
            class516[] var1 = class495.field7061;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class516 var3 = var1[var2];
                var3.method1766(32363);
            }
        }
        if (arg0 >= -64) {
            method1331(-78);
        }
        field2910++;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
    public static final int method1331(int arg0) {
        field2913++;
        int var1 = 81 % ((-arg0 - 6) / 62);
        return 46;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lus;)V")
    public class180(class1 arg0) {
        this.field2912 = arg0.field345;
        class441.method2657(arg0, (byte) -102);
        if (this.field2912) {
            byte[] var6 = class682.method3830(false, -127, class471.field6680);
            this.field2917 = new class368(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class682.method3830(false, -127, class634.field9113);
            this.field2915 = new class368(arg0, 6410, 128, 128, 16, var7, 6410);
            class343 var8 = arg0.field213;
            if (var8.method2207(118)) {
                byte[] var9 = class682.method3830(false, -126, class38.field1054);
                this.field2920 = new class368(arg0, 6408, 128, 128, 16);
                class368 var10 = new class368(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2206(this.field2920, (byte) -36, var10, 2.0F)) {
                    this.field2920.method2940((byte) 108);
                } else {
                    this.field2920.method2938(-23054);
                    this.field2920 = null;
                }
                var10.method2938(-23054);
            }
        } else {
            this.field2916 = new class296[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class575.method3299((byte) -112, var2 * 128 * 128 * 2, class471.field6680, 32768);
                this.field2916[var2] = new class296(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field2918 = new class296[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class575.method3299((byte) -92, var3 * 128 * 128 * 2, class634.field9113, 32768);
                this.field2918[var3] = new class296(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
