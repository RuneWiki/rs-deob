import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class220 extends class207 {

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[[[I")
    public static int[][][] field3955 = new int[2][][];

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Ljd;")
    public static class86 field3954 = class122.method868("(U(Y", true);

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Ljd;")
    public static class86 field3958 = class122.method868(" )2> <col=ffff00>", true);

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljd;")
    public static class86 field3959 = class122.method868("<col=80ff00>", true);

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Ljd;")
    public static class86 field3956 = class122.method868("Schlie-8en", true);

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3961 = 0;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field3962 = 2301979;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Lbj;")
    public static class151 field3964;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[Lmk;")
    public static class101[] field3951;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIII)V")
    public static final void method1552(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class49.field1044 <= arg0 && arg0 <= class129.field2473) {
            int var5 = class171.method1221(class56.field1143, class50.field1050, 21419, arg3);
            int var6 = class171.method1221(class56.field1143, class50.field1050, 21419, arg2);
            class137.method978(var5, arg0, var6, (byte) 96, arg4);
        }
        if (arg1 >= -11) {
            field3956 = null;
        }
        field3963++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
    public static final int method1553(int arg0, int arg1) {
        field3950++;
        if (arg1 <= 96) {
            method1554((byte) -58);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method1554(byte arg0) {
        field3958 = null;
        field3954 = null;
        field3959 = null;
        field3964 = null;
        field3951 = null;
        field3955 = null;
        field3956 = null;
        if (arg0 != 105) {
            method1554((byte) -9);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
    public static final void method1555(int arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class51.field1073;
        if (arg0 != 16775690) {
            method1555(-77, false);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class7.method51(21966);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class181.field3257[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3670C13) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFFA0A) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class168.field3103.length; var13++) {
                                if (class168.field3103[var13] == var12 && var3[var13] != null) {
                                    class203.method1455(arg0 ^ 0xFFFA35, var8, var9, (var11 & 0x7) * 8, class122.field2388, var6 * 8, var3[var13], (var10 & 0x7) * 8, var4, var5 * 8, arg1);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field3960++;
    }
}
