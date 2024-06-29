import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class38 extends class21 {

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    private int field733 = 20;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    private int field737 = 0;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    private int field739 = 1365;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    private int field738 = 0;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field730 = 0;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "[[Z")
    public static boolean[][] field735 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Ljava/lang/String;")
    public static String field736 = "Loading title screen - ";

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static volatile int field740 = 0;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(FIIIZIII)[I", line = 4)
    public static final int[] method295(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field729++;
        int[] var8 = new int[arg7];
        class157 var9 = new class157();
        int var10 = 2 % ((arg2 + 51) / 37);
        var9.field2560 = arg1;
        var9.field2557 = (int) (arg0 * 4096.0F);
        var9.field2561 = arg3;
        var9.field2552 = arg6;
        var9.field2566 = arg5;
        var9.field2556 = arg4;
        var9.method183((byte) 117);
        class234.method1553(true, 1, arg7);
        var9.method1018(var8, -29163, 0);
        return var8;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 26)
    public class38() {
        super(0, true);
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)Lpb;", line = 30)
    public static final class2 method296(int arg0) {
        field743++;
        class2 var1 = (class2) class260.field4052.method576((byte) -98);
        if (var1 != null) {
            var1.method278((byte) -105);
            var1.method2024(0);
            return var1;
        }
        if (arg0 >= -88) {
            method297(false);
        }
        class2 var2;
        do {
            var2 = (class2) class37.field714.method576((byte) -83);
            if (var2 == null) {
                return null;
            }
            if (var2.method9(89) > class338.method2339((byte) -120)) {
                return null;
            }
            var2.method278((byte) -105);
            var2.method2024(0);
        } while ((var2.field4610 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILag;)V", line = 74)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            field740 = -56;
        }
        field745++;
        if (arg1 == 0) {
            this.field739 = arg2.method1315(arg0 + 14607);
        } else if (arg1 == 1) {
            this.field733 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field738 = arg2.method1315(14289);
        } else if (arg1 == 3) {
            this.field737 = arg2.method1315(14289);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)V", line = 126)
    public static void method297(boolean arg0) {
        field735 = (boolean[][]) null;
        if (!arg0) {
            method297(true);
        }
        field736 = null;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V", line = 137)
    public static final void method298(int arg0) {
        class190.field3082.method77(0);
        field744++;
        int var1 = class190.field3082.method81(7, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class190.field3082.method81(arg0, 2);
        if (var2 == 0) {
            class130.field2206[class248.field3865++] = 2047;
        } else if (var2 == 1) {
            int var3 = class190.field3082.method81(7, 3);
            class66.field1265.method705((byte) -92, 1, var3);
            int var4 = class190.field3082.method81(7, 1);
            if (var4 == 1) {
                class130.field2206[class248.field3865++] = 2047;
            }
        } else if (var2 == 2) {
            if (class190.field3082.method81(7, 1) == 1) {
                int var10 = class190.field3082.method81(arg0, 3);
                class66.field1265.method705((byte) -107, 2, var10);
                int var11 = class190.field3082.method81(7, 3);
                class66.field1265.method705((byte) -109, 2, var11);
            } else {
                int var9 = class190.field3082.method81(arg0, 3);
                class66.field1265.method705((byte) -111, 0, var9);
            }
            int var12 = class190.field3082.method81(7, 1);
            if (var12 == 1) {
                class130.field2206[class248.field3865++] = 2047;
            }
        } else if (var2 == 3) {
            class289.field4438 = class190.field3082.method81(7, 2);
            int var5 = class190.field3082.method81(7, 7);
            int var6 = class190.field3082.method81(7, 1);
            int var7 = class190.field3082.method81(7, 7);
            int var8 = class190.field3082.method81(7, 1);
            if (var8 == 1) {
                class130.field2206[class248.field3865++] = 2047;
            }
            class66.field1265.method1870(65535, var5, var6 == 1, var7);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 222)
    public static final boolean method299(String arg0, String arg1, int arg2) {
        int var3 = arg0.length();
        field741++;
        int var4 = arg1.length();
        if (var3 < var4) {
            return false;
        }
        for (int var5 = arg2; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg1.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I", line = 298)
    public final int[] method177(int arg0, int arg1) {
        field732++;
        int var3 = -120 % ((33 - arg0) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            for (int var5 = 0; var5 < class294.field4489; var5++) {
                int var6 = (class51.field1027[var5] << 12) / this.field739 + this.field738;
                int var7 = (class330.field5058[arg1] << 12) / this.field739 + this.field737;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14 = 0;
                while (var12 + var13 < 16384 && this.field733 > var14) {
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = var12 + var8 - var13;
                    var12 = var10 * var10 >> 12;
                    var14++;
                    var13 = var11 * var11 >> 12;
                }
                var4[var5] = var14 >= this.field733 - 1 ? 0 : (var14 << 12) / this.field733;
            }
        }
        return var4;
    }
}
