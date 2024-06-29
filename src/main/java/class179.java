import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class179 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Z")
    public static boolean field2627 = false;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field2629 = -14475237;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field2633 = 2;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public static int[] field2631 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1323(int arg0) {
        field2630++;
        if (class348.field4723) {
            class442.field6361 = null;
            int var1 = 18 % ((-arg0 - 1) / 48);
            class348.field4723 = false;
            class96.field1391 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B[BZII[Loa;Lpe;)V", line = 22)
    public static final void method1324(byte arg0, byte[] arg1, boolean arg2, int arg3, int arg4, class151[] arg5, class391 arg6) {
        field2632++;
        if (arg0 != 124) {
            field2631 = null;
        }
        class289 var7 = new class289(arg1);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1881(32767);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1821(-107);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = (var10 & 0xFEA) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1861((byte) -72);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = var13 + arg3;
                int var19 = var12 + arg4;
                if (var18 > 0 && var19 > 0 && var18 < class116.field1621 - 1 && var19 < (class385.field5425 - 1)) {
                    class151 var20 = null;
                    if (!arg2) {
                        int var21 = var14;
                        if ((class7.field57[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg5[var21];
                        }
                    }
                    class42.method401(arg0 - 31, var14, var20, var14, arg2, arg6, var17, var19, var16, var8, -1, true, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 113)
    public static void method1325(int arg0) {
        if (arg0 != 21488) {
            method1323(-71);
        }
        field2631 = null;
    }
}
