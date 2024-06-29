import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class224 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Lli;")
    public static class185 field4103 = class245.method1649("null", -40);

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lli;")
    private static class185 field4108 = class245.method1649(" ", -25);

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lli;")
    public static class185 field4107 = field4108;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lli;")
    public static class185 field4110 = class245.method1649("", 123);

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field4111 = 0;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lli;")
    private static class185 field4112 = class245.method1649(" is already on your ignore list)3", -89);

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Lli;")
    public static class185 field4105 = field4112;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
    public static final void method1550(boolean arg0, int arg1) {
        if (arg0) {
            if (class275.field4877 != -1) {
                class226.method1563(arg1, class275.field4877);
            }
            for (class271 var2 = (class271) class87.field1715.method192(122); var2 != null; var2 = (class271) class87.field1715.method189(arg1)) {
                class58.method402((byte) 38, var2, true);
            }
            class275.field4877 = -1;
            class87.field1715 = new class31(8);
            class199.method1425((byte) 83);
            class275.field4877 = class68.field1205;
            class176.method1245(false, -1);
            class77.method503((byte) 43);
            class154.method1094(3, class275.field4877);
        }
        class158.field2986 = -1;
        class221.method1527(class191.field3537, true);
        if (arg1 != 0) {
            return;
        }
        class241.field4310 = new class188();
        field4104++;
        class241.field4310.field2687 = 3000;
        class241.field4310.field2694 = 3000;
        class272.method1865(class21.field365, 32768);
        class276.method1892((byte) -118, 10);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILhi;B)Z")
    public static final boolean method1551(int arg0, int arg1, class250 arg2, byte arg3) {
        field4109++;
        byte[] var4 = arg2.method1688(arg3 ^ 0xFFFFFFA2, arg0, arg1);
        if (var4 == null) {
            return false;
        } else {
            class183.method1290(var4, arg3 ^ 0xFFFFFFA2);
            return arg3 == -94 ? true : true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1552(int arg0) {
        field4105 = null;
        field4110 = null;
        field4107 = null;
        field4103 = null;
        field4112 = null;
        field4108 = null;
        if (arg0 != -128) {
            field4112 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
    public static final void method1553(int arg0) {
        class70.field1231 = arg0;
        for (int var1 = 0; var1 < class264.field4685; var1++) {
            for (int var2 = 0; var2 < class122.field2214; var2++) {
                if (class153.field2896[arg0][var1][var2] == null) {
                    class153.field2896[arg0][var1][var2] = new class198(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILcg;)V")
    public static final void method1554(int arg0, class34 arg1) {
        field4106++;
        short var2 = 256;
        for (int var3 = 0; var3 < class179.field3292.length; var3++) {
            class179.field3292[var3] = 0;
        }
        if (arg0 != 3000) {
            method1552(-94);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class179.field3292[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class52.field852[var15] = (class179.field3292[var15 + 1] + class179.field3292[var15 - 1] + class179.field3292[var15 + -128] + class179.field3292[var15 - -128]) / 4;
                }
            }
            int[] var13 = class179.field3292;
            class179.field3292 = class52.field852;
            class52.field852 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field202; var7++) {
            for (int var8 = 0; var8 < arg1.field200; var8++) {
                if (arg1.field553[var6++] != 0) {
                    int var9 = var7 + arg1.field196 + 16;
                    int var10 = var8 + arg1.field201 + 16;
                    int var11 = (var9 << 7) + var10;
                    class179.field3292[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)I")
    public static final int method1555(byte arg0) {
        if (arg0 != 53) {
            method1552(124);
        }
        field4101++;
        return class104.field1880;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZZ)V")
    public static final void method1556(boolean arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class149.field2815;
        if (!arg1) {
            field4110 = null;
        }
        field4102++;
        for (int var4 = 0; var4 < var2; var4++) {
            class125.method907((byte) -21);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class145.field2760[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0xFFD20C) >> 14;
                            int var11 = var8 >> 3 & 0x7FF;
                            int var12 = var8 >> 1 & 0x3;
                            int var13 = (var10 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class141.field2640.length; var14++) {
                                if (class141.field2640[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class132.method938(var9, var4, var5 * 8, arg0, arg1, (var10 & 0x7) * 8, var6 * 8, class165.field3090, var12, var3[var14], (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class274.method1879(var5 * 8, var4, -1, 8, var6 * 8, 8);
                    }
                }
            }
        }
    }
}
