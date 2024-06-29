import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class137 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lsi;")
    public class398 field1827 = new class398();

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Z")
    public boolean field1829 = false;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lla;")
    public static class319 field1825;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Lof;")
    public static class446 field1828;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[Lok;")
    public static class170[] field1832;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Lbc;")
    public static class251 field1834;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method922(int arg0) {
        if (arg0 != -481) {
            return;
        }
        field1824++;
        int var1 = class20.field310;
        int[] var2 = class55.field778;
        for (int var3 = 0; var3 < var1; var3++) {
            class96 var4 = class241.field3398[var2[var3]];
            if (var4 != null) {
                class215.method1478(var4.method637((byte) -118), var4, (byte) -115);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public static final void method923(int arg0) {
        field1822++;
        class330 var1 = class112.field1560;
        synchronized (class112.field1560) {
            class112.field1560.method2127((byte) -14);
        }
        if (arg0 > 77) {
            class330 var2 = class491.field7249;
            synchronized (class491.field7249) {
                class491.field7249.method2127((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V")
    public static void method924(int arg0) {
        field1832 = null;
        if (arg0 != 128) {
            method922(49);
        }
        field1825 = null;
        field1834 = null;
        field1828 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 87 % ((36 - arg7) / 59);
        field1826++;
        if (arg2 == arg3 && arg5 == arg9 && arg4 == arg8 && arg0 == arg6) {
            class101.method664(true, arg4, arg3, arg5, arg0, arg1);
            return;
        }
        int var11 = arg3;
        int var12 = arg5;
        int var13 = arg3 * 3;
        int var14 = arg5 * 3;
        int var15 = arg2 * 3;
        int var16 = arg9 * 3;
        int var17 = arg8 * 3;
        int var18 = arg6 * 3;
        int var19 = arg4 + var15 - arg3 - var17;
        int var20 = arg0 - (arg5 - var16) - var18;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var18 + var14 - var16 - var16;
        int var23 = var15 - var13;
        int var24 = var16 - var14;
        for (int var25 = 128; var25 <= 4096; var25 += 128) {
            int var26 = var25 * var25 >> 12;
            int var27 = var25 * var26 >> 12;
            int var28 = var19 * var27;
            int var29 = var20 * var27;
            int var30 = var21 * var26;
            int var31 = var22 * var26;
            int var32 = var23 * var25;
            int var33 = var24 * var25;
            int var34 = (var28 + var30 + var32 >> 12) + arg3;
            int var35 = (var29 + var33 + var31 >> 12) + arg5;
            class101.method664(true, var34, var11, var12, var35, arg1);
            var12 = var35;
            var11 = var34;
        }
    }

    static {
        new class446("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field1825 = new class319(10, 5);
        field1828 = new class446("green:", "grün:", "vert:", "verde:");
        field1831 = 0;
        field1832 = new class170[30];
    }
}
