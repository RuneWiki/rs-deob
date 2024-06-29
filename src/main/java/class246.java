import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class246 {

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field4419 = -1;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Llc;")
    public static class143 field4413 = class66.method374("", -1);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Llc;")
    public static class143 field4416 = class66.method374(")3)3)3", -1);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Llc;")
    public static class143 field4420 = class66.method374("Choisir une option", -1);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Llc;")
    private static class143 field4422 = class66.method374("Attack", -1);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Llc;")
    public static class143 field4423 = class66.method374("welle2:", -1);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Llc;")
    public static class143 field4425 = field4422;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lei;")
    public static class169 field4421;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lhh;")
    public class182 field4418;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[I")
    public int[] field4414;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[Llc;")
    public class143[] field4424;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z")
    public static final boolean method1632(byte arg0, int arg1) {
        field4415++;
        if (arg0 <= 8) {
            field4413 = null;
        }
        return ((arg1 & 0x1A2247EB) >> 28) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
    public static final void method1633(byte[] arg0, int arg1) {
        field4417++;
        class190 var2 = new class190(arg0);
        var2.field3487 = arg0.length - 2;
        class167.field2986 = var2.method1275(128);
        class44.field900 = new boolean[class167.field2986];
        class282.field4961 = new byte[class167.field2986][];
        class32.field546 = new byte[class167.field2986][];
        class153.field2766 = new int[class167.field2986];
        class126.field2226 = new int[class167.field2986];
        class41.field697 = new int[class167.field2986];
        class32.field536 = new int[class167.field2986];
        var2.field3487 = arg0.length - (class167.field2986 * arg1) - 7;
        class257.field4628 = var2.method1275(128);
        class70.field1332 = var2.method1275(128);
        int var3 = (var2.method1265(121) & 0xFF) + 1;
        for (int var4 = 0; var4 < class167.field2986; var4++) {
            class126.field2226[var4] = var2.method1275(arg1 + 120);
        }
        for (int var5 = 0; var5 < class167.field2986; var5++) {
            class32.field536[var5] = var2.method1275(128);
        }
        for (int var6 = 0; var6 < class167.field2986; var6++) {
            class41.field697[var6] = var2.method1275(128);
        }
        for (int var7 = 0; var7 < class167.field2986; var7++) {
            class153.field2766[var7] = var2.method1275(128);
        }
        var2.field3487 = arg0.length - class167.field2986 * 8 - (var3 * 3 + -3) - 7;
        class111.field1961 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class111.field1961[var8] = var2.method1282(116);
            if (class111.field1961[var8] == 0) {
                class111.field1961[var8] = 1;
            }
        }
        var2.field3487 = 0;
        for (int var9 = 0; var9 < class167.field2986; var9++) {
            int var10 = class41.field697[var9];
            int var11 = class153.field2766[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class282.field4961[var9] = var13;
            byte[] var14 = new byte[var12];
            class32.field546[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method1265(arg1 ^ 0x75);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1234(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method1234(false);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label88: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var18 >= var10) {
                                break label88;
                            }
                            for (int var19 = 0; var19 < var11; var19++) {
                                byte var20 = var14[var18 + (var10 * var19)] = var2.method1234(false);
                                var15 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var10 * var21 + var17] = var2.method1234(false);
                    }
                    var17++;
                }
            }
            class44.field900[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method1634(int arg0) {
        if (arg0 != -14798) {
            return;
        }
        field4421 = null;
        field4413 = null;
        field4422 = null;
        field4416 = null;
        field4420 = null;
        field4425 = null;
        field4423 = null;
    }
}
