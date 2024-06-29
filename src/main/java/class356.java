import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class356 {

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5677 = 0;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static volatile int field5672 = 0;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[[I")
    public static int[][] field5674 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lek;ILek;)V", line = 18)
    public static final void method2523(class206 arg0, int arg1, class206 arg2) {
        class147.field2509 = arg0;
        class325.field5249 = arg2;
        if (arg1 != 21501) {
            field5677 = 13;
        }
        field5676++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 32)
    public static final void method2524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5675++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var8 << 2;
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = var9 << 2;
        if (arg1 != -25564) {
            return;
        }
        int var17 = ((arg3 << 1) - 3) * var11;
        int var18 = (arg3 - 1) * var14;
        int var19 = (var6 + 1) * var16;
        int var20 = ((var6 << 1) + 3) * var10;
        if (class87.field1520 <= arg0 && class177.field2930 >= arg0) {
            int var21 = class114.method842(class190.field3224, (byte) -69, arg5 + arg2, class289.field4704);
            int var22 = class114.method842(class190.field3224, (byte) -96, arg5 - arg2, class289.field4704);
            class344.method2417(class232.field3799[arg0], var22, var21, arg4, (byte) -124);
        }
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var19;
                    var19 += var16;
                    var13 += var20;
                    var6++;
                    var20 += var16;
                }
            }
            if (var15 < 0) {
                var15 += var19;
                var19 += var16;
                var13 += var20;
                var6++;
                var20 += var16;
            }
            var15 += -var17;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            var17 -= var14;
            if (var24 >= class87.field1520 && class177.field2930 >= var23) {
                int var25 = class114.method842(class190.field3224, (byte) -112, arg5 + var6, class289.field4704);
                int var26 = class114.method842(class190.field3224, (byte) -114, arg5 - var6, class289.field4704);
                if (var23 >= class87.field1520) {
                    class344.method2417(class232.field3799[var23], var26, var25, arg4, (byte) -122);
                }
                if (class177.field2930 >= var24) {
                    class344.method2417(class232.field3799[var24], var26, var25, arg4, (byte) -121);
                }
            }
            var13 += -var18;
            var18 -= var14;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IIIIII)V", line = 138)
    public static final void method2525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5678++;
        class6.field208 = arg4;
        class278.field4533 = arg3;
        class282.field4621 = arg0;
        if (arg5 > -116) {
            field5674 = (int[][]) ((int[][]) null);
        }
        class251.field4122 = arg2;
        class227.field3735 = arg1;
        if (class251.field4122 >= 100) {
            int var6 = class227.field3735 * 128 + 64;
            int var7 = class282.field4621 * 128 + 64;
            int var8 = class21.method189((byte) 40, var7, var6, class276.field4506) - class278.field4533;
            int var9 = var7 - class16.field462;
            int var10 = var6 - class223.field3693;
            int var11 = var8 - class141.field2380;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class298.field4847 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class18.field500 = (int) (Math.atan2((double) var10, (double) var9) * -325.949D) & 0x7FF;
            if (class298.field4847 < 128) {
                class298.field4847 = 128;
            }
            if (class298.field4847 > 383) {
                class298.field4847 = 383;
            }
        }
        class69.field1280 = 2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V", line = 190)
    public static final void method2526(int arg0, boolean arg1) {
        class177.field2933 = -1;
        field5671++;
        class1.field37 = 3;
        if (arg1) {
            method2524(-72, 112, 81, -124, 127, -95);
        }
        class6.field169 = 100;
        class199.field3349 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 205)
    public static void method2527(int arg0) {
        if (arg0 != 4183) {
            method2525(-50, -71, -108, -5, 37, -69);
        }
        field5674 = (int[][]) null;
    }
}
