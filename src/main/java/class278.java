import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class278 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lce;")
    public static class126 field4629 = class206.method1445(-7923, "details");

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lce;")
    public static class126 field4634 = class206.method1445(-7923, ")4");

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lml;")
    public static class160 field4632 = new class160(20);

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lce;")
    private static class126 field4637 = class206.method1445(-7923, " is already on your ignore list)3");

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lce;")
    public static class126 field4638 = field4637;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lsa;")
    public static class79 field4633;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B)V", line = 7)
    public static final void method1865(int arg0, byte[] arg1) {
        field4635++;
        class134 var2 = new class134(arg1);
        var2.field2299 = arg1.length - 2;
        class185.field3205 = var2.method942(true);
        class63.field1032 = new int[class185.field3205];
        class279.field4643 = new int[class185.field3205];
        class303.field5044 = new byte[class185.field3205][];
        class31.field434 = new boolean[class185.field3205];
        class27.field386 = new int[class185.field3205];
        class190.field3255 = new byte[class185.field3205][];
        class263.field4389 = new int[class185.field3205];
        var2.field2299 = arg1.length - ((class185.field3205 * 8) + 7);
        class307.field5187 = var2.method942(true);
        class290.field4802 = var2.method942(true);
        int var3 = (var2.method948(-128) & 0xFF) + 1;
        for (int var4 = arg0; var4 < class185.field3205; var4++) {
            class27.field386[var4] = var2.method942(true);
        }
        for (int var5 = 0; var5 < class185.field3205; var5++) {
            class63.field1032[var5] = var2.method942(true);
        }
        for (int var6 = 0; var6 < class185.field3205; var6++) {
            class279.field4643[var6] = var2.method942(true);
        }
        for (int var7 = 0; var7 < class185.field3205; var7++) {
            class263.field4389[var7] = var2.method942(true);
        }
        var2.field2299 = arg1.length + 3 - var3 * 3 - (class185.field3205 * 8) - 7;
        class241.field4062 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class241.field4062[var8] = var2.method949(20732);
            if (class241.field4062[var8] == 0) {
                class241.field4062[var8] = 1;
            }
        }
        var2.field2299 = 0;
        for (int var9 = 0; var9 < class185.field3205; var9++) {
            int var10 = class279.field4643[var9];
            int var11 = class263.field4389[var9];
            int var12 = var10 * var11;
            boolean var13 = false;
            byte[] var14 = new byte[var12];
            byte[] var15 = new byte[var12];
            class190.field3255[var9] = var15;
            class303.field5044[var9] = var14;
            int var16 = var2.method948(arg0 ^ 0xFFFFFF87);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var15[var22] = var2.method977(19773);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method977(19773);
                        var13 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label87: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label87;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var14[var10 * var20 + var19] = var2.method977(19773);
                                var13 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var15[var17 + (var10 * var18)] = var2.method977(19773);
                    }
                    var17++;
                }
            }
            class31.field434[var9] = var13;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V", line = 169)
    private static final void method1866(int arg0, int arg1) {
        field4630++;
        if (arg0 != 0) {
            field4636 = 109;
        }
        class110.field1724.method1175(true, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 189)
    public static final void method1867(int arg0) {
        field4631++;
        class37.field549 = class36.method198(2, 35, 8, true, 0.4F, 4, 2048, 8);
        int var1 = -111 % ((arg0 - 48) / 61);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 205)
    public static final void method1868(int arg0) {
        class110.method722(111, 5);
        class15.method86(5, false);
        field4628++;
        method1866(0, 5);
        class279.method1870(5, false);
        class168.method1228(5, (byte) 124);
        class165.method1216(1, 5);
        class263.method1770(5, arg0 ^ 0xFFFF959B);
        class134.method943((byte) 85, 5);
        class129.method900(-1054795711, 5);
        class73.method531(5, (byte) 106);
        class259.method1752(115, 5);
        if (arg0 != -26307) {
            field4634 = (class126) null;
        }
        class48.method299((byte) 78, 5);
        class302.method2029(50, (byte) 12);
        class251.method1699(5, -73);
        class69.method505(5, (byte) 19);
        class29.field401.method1175(true, 5);
        class170.field3026.method1175(true, 5);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 241)
    public static void method1869(byte arg0) {
        field4634 = null;
        field4629 = null;
        field4632 = null;
        field4633 = null;
        field4638 = null;
        field4637 = null;
        if (arg0 != -86) {
            field4636 = -84;
        }
    }
}
