import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class179 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[Z")
    public static boolean[] field2891 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1335(int arg0) {
        class113.field1630 = arg0;
        for (int var1 = 0; var1 < class106.field1537; var1++) {
            for (int var2 = 0; var2 < class232.field3724; var2++) {
                if (class220.field3525[arg0][var1][var2] == null) {
                    class220.field3525[arg0][var1][var2] = new class286(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method1336(int arg0) {
        if (arg0 >= -81) {
            field2889 = -114;
        }
        field2891 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public static int method1337(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
    public static final void method1338(boolean arg0, int arg1) {
        field2888++;
        byte var2 = 4;
        byte[][] var3 = class206.field3311;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class286.field4548[var5] & 0xFF;
            int var14 = var13 * 64 - class99.field1465;
            int var15 = class286.field4548[var5] >> 8;
            int var16 = var15 * 64 - class282.field4487;
            if (var12 != null) {
                class126.method908(125);
                var11 = class220.method1576(var16, var14, (byte) 122, class138.field2237, class282.field4487, class99.field1465, var12, arg0);
            }
            if (!arg0 && (class245.field4024 / 8) == var15 && class44.field647 / 8 == var13) {
                if (var11 == null) {
                    class57.field820 = -1;
                } else {
                    class131.field2029 = var11[3];
                    class277.field4443 = var11[4];
                    class287.field4562 = var11[1];
                    class229.field3701 = var11[2];
                    class57.field820 = var11[0];
                }
            }
        }
        for (int var6 = arg1; var6 < var4; var6++) {
            int var7 = (class286.field4548[var6] >> 8) * 64 - class282.field4487;
            int var8 = (class286.field4548[var6] & 0xFF) * 64 - class99.field1465;
            byte[] var9 = var3[var6];
            if (var9 == null && class44.field647 < 800) {
                class126.method908(arg1 + 125);
                for (int var10 = 0; var10 < var2; var10++) {
                    class168.method1238(var7, var8, var10, true, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
