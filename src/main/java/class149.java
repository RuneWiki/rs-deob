import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class149 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lai;")
    public static class10 field2864 = class44.method278("Lade Texturen )2 ", 123);

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2866 = 0;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2867 = 500;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Ldd;")
    public static class34 field2865 = new class34(5);

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field2871 = new Object();

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
    public static int[] field2874 = new int[] { 0, 6, 14, 0, 0, 0, 0, 2, 0, 3, 0, 15, 0, 11, 0, -1, 0, 0, 6, 6, 0, 5, 0, 0, 0, 2, 0, 0, 1, 4, 0, 0, 6, 0, 2, 0, 6, 0, -2, 0, 0, 6, 0, 0, 0, 10, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, -2, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 6, 0, 0, 0, 0, 10, -1, 0, 0, 6, 5, 0, 0, 0, 0, 0, 0, 0, -2, 6, 6, 0, 8, 20, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 12, -2, 0, 0, 0, 0, 0, -2, 0, -2, 11, 6, 0, 0, 4, 0, 6, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, -1, 1, -1, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 3, 0, 0, 2, 0, 0, 7, 0, 4, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 8, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 24, 0, 0, 0, 4, 0, 0, 0 };

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field2875 = 0;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Z")
    public static final boolean method1022(int arg0, int arg1, int arg2) {
        if (arg2 > -110) {
            method1022(80, 32, 60);
        }
        field2869++;
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method1023(int arg0) {
        class136.method925((byte) 18);
        field2868++;
        class124.method862(arg0 + 31879);
        class34.method231((byte) -120);
        class109.method702(-70);
        class207.method1343(1);
        class74.method461(true);
        class123.method859(false);
        class140.method952(82);
        class57.method390(81);
        class49.method348(0);
        class68.method445((byte) -109);
        class34.method230((byte) 118);
        ((class117) class113.field2122).method838(arg0 + 31919);
        class43.field704.method226((byte) -90);
        class192.field3655.method144(-19894);
        class169.field3271.method144(-19894);
        class101.field1903.method144(arg0 + 12090);
        class151.field2912.method144(-19894);
        if (arg0 != -31984) {
            field2875 = 66;
        }
        class186.field3538.method144(-19894);
        class5.field67.method144(-19894);
        class67.field1183.method144(-19894);
        class146.field2800.method144(-19894);
        class6.field75.method144(arg0 ^ 0x315A);
        class200.field3892.method144(-19894);
        class137.field2581.method144(-19894);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIII)Lai;")
    public static final class10 method1024(boolean arg0, int arg1, int arg2, int arg3) {
        field2870++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg2 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        if (arg3 < 25) {
            return null;
        } else {
            class10 var9 = new class10();
            var9.field118 = var6;
            var9.field160 = var7;
            return var9;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method1025(boolean arg0) {
        field2864 = null;
        field2865 = null;
        field2871 = null;
        field2874 = null;
        if (!arg0) {
            method1022(91, -56, 25);
        }
    }
}
