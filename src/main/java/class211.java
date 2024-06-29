import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class211 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lne;")
    public static class235 field3425 = new class235(100);

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
    public static boolean field3427 = true;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3429 = 0;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
    public static boolean field3431 = false;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    public static int[] field3426 = new int[2000];

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[[B")
    public static byte[][] field3430;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1418(int arg0) {
        field3423++;
        if (class265.field4477 != null) {
            class265.field4477.method1239((byte) -49);
            class265.field4477 = null;
        }
        class41.method289(false);
        class58.method384();
        for (int var1 = 0; var1 < 4; var1++) {
            class135.field2076[var1].method167(-89);
        }
        class92.method607(true, false);
        System.gc();
        class160.method1081(2, (byte) 88);
        class40.field653 = -1;
        class111.field1571 = false;
        class229.method1574((byte) -126, true);
        class110.field1555 = 0;
        class323.field5638 = false;
        class199.field3226 = 0;
        class121.field1713 = 0;
        class272.field4670 = 0;
        if (arg0 != 2130) {
            method1421((byte) -17, -71, -83, 120);
        }
        for (int var2 = 0; var2 < class194.field3094.length; var2++) {
            class194.field3094[var2] = null;
        }
        class194.field3114 = 0;
        class233.field3826 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class22.field380[var3] = null;
            class120.field1701[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class40.field649[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class205.field3353[var5][var6][var7] = null;
                }
            }
        }
        class222.method1538(-105);
        class270.field4628 = 0;
        class235.method1611(0);
        class48.method328(true, 103);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z", line = 120)
    public static final boolean method1419(int arg0, int arg1) {
        int var2 = 49 % ((arg1 + 63) / 60);
        field3422++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 130)
    public static void method1420(byte arg0) {
        if (arg0 >= 69) {
            field3425 = null;
            field3426 = null;
            field3430 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BIII)I", line = 143)
    public static final int method1421(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 11) {
            return 118;
        }
        field3424++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg2;
        }
    }
}
