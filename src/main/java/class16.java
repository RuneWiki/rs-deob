import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Z")
    public static boolean field295 = false;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lp;")
    public static class280 field299 = class18.method140((byte) -121, "welle:");

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lp;")
    public static class280 field305 = class18.method140((byte) -128, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lp;")
    public static class280 field302 = class18.method140((byte) -126, "Textures charg-Bes");

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Z")
    public static boolean field310 = false;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ltg;")
    public static class180 field293;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Ltg;")
    public static class180 field298;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "[I")
    public static int[] field309;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILtg;)V")
    public static final void method124(int arg0, class180 arg1) {
        field306++;
        class185.field3257 = class101.method716(-13521, arg1, class185.field3259);
        class241.field4227 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class45.field742[var2] >> 16 & 0xFF);
            int var5 = class45.field742[var2 + 1] >> 16 & 0xFF;
            int var6 = class45.field742[var2 + 1] >> 8 & 0xFF;
            float var7 = (float) (class45.field742[var2] & 0xFF);
            float var8 = ((float) var5 - var4) / 64.0F;
            float var9 = (float) (class45.field742[var2] >> 8 & 0xFF);
            int var10 = class45.field742[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var7) / 64.0F;
            float var12 = ((float) var6 - var9) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class241.field4227[var2 * 64 + var13] = class160.method1143((int) var7, class160.method1143((int) var4 << 16, (int) var9 << 8));
                var7 += var11;
                var9 += var12;
                var4 += var8;
            }
        }
        if (arg0 >= -58) {
            method125(true);
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class241.field4227[var3] = class45.field742[3];
        }
        class55.field907 = new int[32768];
        class58.field947 = new int[32768];
        class112.method779((class5) null, -16);
        class148.field2571 = new int[32768];
        class233.field4060 = new int[32768];
        class57.field930 = new class223(128, 254);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method125(boolean arg0) {
        field302 = null;
        field305 = null;
        field299 = null;
        field309 = null;
        if (arg0) {
            field293 = null;
            field298 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method126(int arg0) {
        field297++;
        int var1 = class54.field890.method528(class99.field1619);
        for (int var2 = 0; var2 < class157.field2745; var2++) {
            int var6 = class54.field890.method528(class199.method1366(var2, -1));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class157.field2745 * 15 + 21;
        int var4 = class30.field573 - var1 / 2;
        if ((var1 + var4) > class190.field3328) {
            var4 = class190.field3328 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class23.field416;
        if (var3 + var5 > class103.field1724) {
            var5 = class103.field1724 - var3;
        }
        if (var5 < arg0) {
            var5 = 0;
        }
        if (class60.field969 == 1) {
            if (class30.field573 == class225.field3887 && class58.field936 == class23.field416) {
                class78.field1270 = var1;
                class31.field582 = true;
                class246.field4322 = class157.field2745 * 15 + (class148.field2567 ? 26 : 22);
                class222.field3857 = var5;
                class59.field951 = var4;
                class60.field969 = 0;
            }
        } else if (class98.field1572 == class30.field573 && class23.field416 == class187.field3268) {
            class246.field4322 = class157.field2745 * 15 + (class148.field2567 ? 26 : 22);
            class59.field951 = var4;
            class222.field3857 = var5;
            class78.field1270 = var1;
            class31.field582 = true;
            class60.field969 = 0;
        } else {
            class58.field936 = class187.field3268;
            class225.field3887 = class98.field1572;
            class60.field969 = 1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLkj;Z)V")
    public static final void method127(byte arg0, class144 arg1, boolean arg2) {
        int var3 = arg1.field2517;
        field308++;
        int var4 = -44 / ((-arg0 - 53) / 53);
        int var5 = (int) arg1.field2827;
        arg1.method1146(26159);
        if (arg2) {
            class94.method664((byte) -73, var3);
        }
        class212.method1419(false, var3);
        class113 var6 = class233.method1569(65535, var5);
        if (var6 != null) {
            class242.method1642((byte) 78, var6);
        }
        int var7 = class157.field2745;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class49.method360(class275.field4765[var8], -48)) {
                class189.method1316((byte) -128, var8);
            }
        }
        if (class157.field2745 == 1) {
            class31.field582 = false;
            class49.method365(class222.field3857, class59.field951, (byte) -65, class78.field1270, class246.field4322);
        } else {
            class49.method365(class222.field3857, class59.field951, (byte) -65, class78.field1270, class246.field4322);
            int var9 = class54.field890.method528(class99.field1619);
            for (int var10 = 0; var10 < class157.field2745; var10++) {
                int var11 = class54.field890.method528(class199.method1366(var10, -1));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class246.field4322 = class157.field2745 * 15 + (class148.field2567 ? 26 : 22);
            class78.field1270 = var9 + 8;
        }
        if (class246.field4315 != -1) {
            class18.method138(class246.field4315, (byte) -121, 1);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static final void method128(int arg0) {
        for (int var1 = arg0; var1 < class204.field3543; var1++) {
            int var2 = class192.field3359[var1];
            class142 var3 = class280.field4940[var2];
            int var4 = class20.field367.method189((byte) -103);
            if ((var4 & 0x80) != 0) {
                var4 += class20.field367.method189((byte) -103) << 8;
            }
            class183.method1273(arg0 ^ 0x7E, var4, var2, var3);
        }
        field294++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBLtg;)Leg;")
    public static final class223 method129(int arg0, int arg1, byte arg2, class180 arg3) {
        field303++;
        if (class90.method648(arg0, arg1, arg3, -41)) {
            return arg2 == -98 ? class124.method863(-45) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Ln;)V")
    public class16(class16 arg0) {
        this.field307 = arg0.field307;
        this.field301 = arg0.field301;
        this.field300 = arg0.field300;
        this.field311 = arg0.field311;
    }
}
