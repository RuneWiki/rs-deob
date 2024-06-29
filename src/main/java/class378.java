import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class378 extends class425 {

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Llk;")
    public static class351 field5380;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method2410(int arg0) {
        field5380 = null;
        if (arg0 >= -2) {
            method2411((byte) 45, false);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)I")
    public abstract int method476(int arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
    public static final void method2411(byte arg0, boolean arg1) {
        class125.method750(arg1, -1, class265.field3898, class24.field307, class316.field4643);
        field5381++;
        if (arg0 < 54) {
            method2414((class129) null, -33, -67, false);
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
    public static final void method2412(int arg0) {
        class284.field4138 = null;
        class336.field4877 = null;
        class296.field4284 = null;
        field5383++;
        class267.field3914 = null;
        class207.field2975 = null;
        class415.field5929 = null;
        class10.field130 = null;
        class209.field2993 = null;
        class246.field3678 = null;
        class247.field3701 = null;
        class214.field3049 = null;
        class127.field1762 = null;
        int var1 = 0 % ((arg0 + 88) / 35);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)I")
    public abstract int method474(byte arg0);

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)I")
    public abstract int method471(byte arg0);

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)J")
    public abstract long method473(byte arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V")
    public static final void method2413(boolean arg0, byte arg1) {
        field5384++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class377.field5378;
        } else {
            var2 = 4;
            var3 = class2.field12;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var12 = null;
            byte[] var13 = var3[var5];
            int var14 = class199.field2844[var5] >> 8;
            int var15 = class199.field2844[var5] & 0xFF;
            int var16 = var14 * 64 - class306.field4459;
            int var17 = var15 * 64 - class342.field4959;
            if (var13 != null) {
                class127.method769(0);
                var12 = class79.method469(var17, class306.field4459, var16, var13, class342.field4959, var2, 81, arg0, class59.field786, class85.field1090);
            }
            if (!arg0 && class327.field4741 / 8 == var14 && (class171.field2415 / 8) == var15) {
                if (var12 == null) {
                    class429.field6097 = null;
                } else {
                    class429.field6097 = class220.method1549(var12[1], var12[2], var12[3], -128, var12[0]);
                    class105.field1352 = var12[4];
                }
            }
        }
        int var6 = -89 / ((arg1 - 40) / 56);
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = (class199.field2844[var7] >> 8) * 64 - class306.field4459;
            int var9 = (class199.field2844[var7] & 0xFF) * 64 - class342.field4959;
            byte[] var10 = var3[var7];
            if (var10 == null && class171.field2415 < 800) {
                class127.method769(0);
                for (int var11 = 0; var11 < var2; var11++) {
                    class191.method1377(64, 64, var11, var9, var8, -121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lec;IIZ)V")
    public static final void method2414(class129 arg0, int arg1, int arg2, boolean arg3) {
        class148.field2215[arg2][arg1] = arg0;
        if (arg3) {
            field5380 = null;
        }
        field5382++;
    }
}
