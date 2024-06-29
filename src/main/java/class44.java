import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class44 {

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[I")
    public static int[] field655 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[[B")
    public static byte[][] field653 = new byte[250][];

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
    public static boolean field650 = false;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field658 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[J")
    public static long[] field651 = new long[200];

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field654 = 255;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Ltl;")
    public static class69 field659;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[[[I")
    public static int[][][] field657;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lrg;III)V")
    public static final void method293(class248 arg0, int arg1, int arg2, int arg3) {
        field661++;
        if (class291.field4776 < 2 && class45.field669 == 0 && !class101.field1579) {
            return;
        }
        String var4 = class74.method533(708);
        if (arg1 < 69) {
            method295(37);
        }
        if (arg0 == null) {
            int var5 = class170.field2792.method523(var4, arg2 + 4, arg3 + 15, 16777215, 0, class170.field2783, class164.field2727);
            class110.method773(true, arg3, arg2 + 4, class170.field2792.method527(var4) + var5, 15);
            return;
        }
        class73 var6 = arg0.method1691(class197.field3174, -97);
        if (var6 == null) {
            var6 = class170.field2792;
        }
        var6.method530(var4, arg2, arg3, arg0.field4016, arg0.field4057, arg0.field3976, arg0.field3921, arg0.field3987, arg0.field3963, class170.field2783, class164.field2727, class263.field4299);
        class110.method773(true, class263.field4299[1], class263.field4299[0], class263.field4299[2], class263.field4299[3]);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static final void method294(int arg0) {
        class97.field1538 = 0;
        field656++;
        class57.field830 = 0;
        class28.method219(arg0 - 12793);
        class186.method1309(30945);
        if (arg0 != 12794) {
            field659 = null;
        }
        class291.method2012(arg0 - 12444);
        for (int var1 = 0; var1 < class97.field1538; var1++) {
            int var3 = class75.field1214[var1];
            if (class274.field4472 != class131.field2113[var3].field907) {
                if (class131.field2113[var3].field1645.method1647((byte) -102)) {
                    class123.method848(class131.field2113[var3], (byte) 127);
                }
                class131.field2113[var3].method743((class242) null, (byte) -123);
                class131.field2113[var3] = null;
            }
        }
        if (class271.field4366 != class229.field3584.field4458) {
            throw new RuntimeException("gnp1 pos:" + class229.field3584.field4458 + " psize:" + class271.field4366);
        }
        for (int var2 = 0; var2 < class91.field1439; var2++) {
            if (class131.field2113[class34.field556[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class91.field1439);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static void method295(int arg0) {
        field655 = null;
        if (arg0 < 44) {
            field655 = null;
        }
        field653 = null;
        field657 = null;
        field651 = null;
        field659 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field660++;
        int var8 = arg1 - 334;
        int var9 = 2048 - arg5 & 0x7FF;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var10 = class152.field2441 + ((class248.field4069 - class152.field2441) * var8 / 100);
        int var11 = arg2 * var10 >> 8;
        int var12 = 0;
        int var13 = var11;
        int var14 = 0;
        int var15 = 2048 - arg7 & arg0;
        if (var15 != 0) {
            int var16 = class136.field2191[var15];
            int var17 = class136.field2193[var15];
            var12 = -var11 * var16 >> 16;
            var13 = var11 * var17 >> 16;
        }
        if (var9 != 0) {
            int var18 = class136.field2191[var9];
            var14 = var13 * var18 >> 16;
            int var19 = class136.field2193[var9];
            var13 = var13 * var19 >> 16;
        }
        class211.field3361 = arg5;
        class123.field1960 = arg6 - var13;
        class182.field3028 = arg3 - var12;
        class95.field1506 = arg7;
        class135.field2184 = arg4 - var14;
    }
}
