import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class31 {

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lv;")
    public class122 field485;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
    public static int[] field479 = new int[2];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "[Lhg;")
    public static class162[] field478 = new class162[14];

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Ljava/lang/String;")
    public static String field483 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field480 = 0;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[Lqg;")
    public static class316[] field484 = new class316[0];

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "Z")
    public static boolean field492 = true;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Lsf;")
    public static class139 field491;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIBIIIII)V", line = 10)
    public static final void method334(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field487++;
        if (class328.method2321(0, arg0)) {
            client.method1037(class334.field5108[arg0], -1, arg7, arg6, arg5, arg4, arg1, arg3);
            int var8 = 6 % ((arg2 - 50) / 52);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lrn;BLrn;)V", line = 33)
    public static final void method335(class18 arg0, byte arg1, class18 arg2) {
        field488++;
        if (arg1 >= -62) {
            method338(111);
        }
        class184.field2889 = arg2;
        class147.field2394 = arg0;
        class147.field2394.method197((byte) -45, 36);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)[B", line = 49)
    public static final byte[] method336(boolean arg0, int arg1) {
        if (arg0) {
            return (byte[]) null;
        }
        class298 var2 = (class298) class292.field4542.method1386(-1, (long) arg1);
        field482++;
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class67.method659(var7, var4, true);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class298(var3);
            class292.field4542.method1385(var2, (byte) -30, (long) arg1);
        }
        return var2.field4626;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIIIII)V", line = 99)
    public static final void method337(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1) {
            field492 = false;
        }
        field481++;
        if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
            return;
        }
        if (!class158.method1282(false) && (class146.field2386[0][arg6][arg2] & 0x2) == 0) {
            int var8 = arg4;
            if ((class146.field2386[arg4][arg6][arg2] & 0x8) != 0) {
                var8 = 0;
            }
            if (class68.field1046 != var8) {
                return;
            }
        }
        int var9 = arg4;
        if (arg4 < 3 && (class146.field2386[1][arg6][arg2] & 0x2) == 2) {
            var9 = arg4 + 1;
        }
        class148.method1233((byte) -100, arg4, arg6, var9, class57.field905[arg4], arg0, arg2);
        if (arg7 >= 0) {
            boolean var10 = class327.field5034;
            class327.field5034 = true;
            class204.method1525(19330, arg7, arg3, false, arg2, var9, arg4, arg6, false, arg5, class57.field905[arg4]);
            class327.field5034 = var10;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 152)
    public static void method338(int arg0) {
        field479 = null;
        if (arg0 < -9) {
            field483 = null;
            field484 = null;
            field478 = null;
            field491 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(II)V", line = 169)
    public class31(int arg0, int arg1) {
        this.field485 = class79.method727(-57, arg0);
        this.field486 = arg1;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lv;I)V", line = 177)
    public class31(class122 arg0, int arg1) {
        this.field485 = arg0;
        this.field486 = arg1;
    }
}
