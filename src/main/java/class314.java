import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class314 extends class117 {

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Lao;")
    public class288 field4257;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Lsm;")
    public static class249 field4256 = new class249();

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "[[B")
    public static byte[][] field4263;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static void method1894(boolean arg0) {
        field4256 = null;
        field4263 = null;
        if (!arg0) {
            field4256 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILfc;ZLjava/lang/String;)Lnf;")
    public static final class107 method1895(int arg0, class343 arg1, boolean arg2, String arg3) {
        if (arg0 > -57) {
            method1898(90, 123, (String) null);
        }
        field4260++;
        int var4 = arg1.method2042(100, arg3);
        if (var4 == -1) {
            return new class107(0);
        }
        int[] var5 = arg1.method2026(var4, -98);
        class107 var6 = new class107(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field1533 > var7) {
                class425 var9 = new class425(arg1.method2029(var4, var5[var8++], 0));
                int var10 = var9.method2502((byte) -86);
                int var11 = var9.method2508(true);
                int var12 = var9.method2503(true);
                if (!arg2 && var12 == 1) {
                    var6.field1533--;
                } else {
                    var6.field1531[var7] = var10;
                    var6.field1532[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIILkm;)V")
    public static final void method1896(int arg0, int arg1, int arg2, int arg3, int arg4, class487 arg5) {
        field4261++;
        if (arg3 != -22653) {
            return;
        }
        arg5.method1094(arg1, arg0, arg1 + arg2, arg0 + arg4);
        arg5.method2860(arg4, arg2, arg1, -16777216, arg0, 1);
        if (class430.field5926 < 100) {
            return;
        }
        float var6 = (float) class379.field5384 / (float) class379.field5389;
        int var7 = arg2;
        int var8 = arg4;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg4 - var8) / 2 + arg0;
        int var10 = (arg2 - var7) / 2 + arg1;
        if (class334.field4585 == null || class334.field4585.method388() != arg2 || arg4 != class334.field4585.method394()) {
            class379.method2263(class379.field5393, class379.field5384 + class379.field5379, class379.field5393 + class379.field5389, class379.field5379, var10, var9, var7 + var10, var8 + var9);
            class379.method2266(arg5);
            class334.field4585 = arg5.method1133(var10, var9, var7, var8, false);
        }
        class334.field4585.method2301(var10, var9);
        int var11 = class445.field6150 * var7 / class379.field5389;
        int var12 = class343.field4665 * var8 / class379.field5384;
        int var13 = var10 + (class90.field1340 * var7 / class379.field5389);
        int var14 = var9 + var8 - (class75.field1135 * var8 / class379.field5384) - var12;
        int var15 = -1996554240;
        if (class307.field4208 == class172.field2553) {
            var15 = -1996488705;
        }
        arg5.method1107(var13, var14, var11, var12, var15, 1);
        arg5.method1076(var13, var14, var11, var12, var15, 0);
        if (class175.field2588 <= 0) {
            return;
        }
        int var16;
        if (class3.field29 <= 50) {
            var16 = class3.field29 * 5;
        } else {
            var16 = (100 - class3.field29) * 5;
        }
        for (class163 var17 = (class163) class379.field5366.method1544(-121); var17 != null; var17 = (class163) class379.field5366.method1546((byte) -42)) {
            class442 var18 = class379.field5358.method85(var17.field2342, true);
            if (class153.method922((byte) -91, var18)) {
                if (class446.field6163 == var17.field2342) {
                    int var21 = var17.field2339 * var7 / class379.field5389 + var10;
                    int var22 = (class379.field5384 - var17.field2343) * var8 / class379.field5384 + var9;
                    arg5.method2860(4, 4, var21 - 2, var16 << 24 | 0xFFFF00, var22 - 2, 1);
                } else if (class283.field3887 != -1 && class283.field3887 == var18.field6073) {
                    int var19 = var17.field2339 * var7 / class379.field5389 + var10;
                    int var20 = (class379.field5384 - var17.field2343) * var8 / class379.field5384 + var9;
                    arg5.method2860(4, 4, var19 - 2, var16 << 24 | 0xFFFF00, var20 - 2, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lao;)V")
    public class314(class288 arg0) {
        this.field4257 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)S")
    public static final short method1897(int arg0, int arg1) {
        field4259++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x382) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        if (arg0 != -1433933209) {
            return -125;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1898(int arg0, int arg1, String arg2) {
        class131.method793(class210.field2966, 125);
        if (arg1 != -1380671224) {
            field4256 = null;
        }
        field4258++;
        class302.field4142++;
        class366.field5214.method2470((byte) -74, class42.method349(arg2, 1) + 1);
        class366.field5214.method2493((byte) -120, arg2);
        class366.field5214.method2499(arg0, 14584);
    }

    static {
        new class112("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field4262 = 1;
    }
}
