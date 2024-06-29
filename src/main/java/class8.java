import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class134 {

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Z")
    public static boolean field81 = false;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "[[B")
    public static byte[][] field83;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Llc;B)V")
    public static final void method56(class86 arg0, byte arg1) {
        class60.field842 = arg0;
        if (arg1 != 58) {
            method56((class86) null, (byte) -6);
        }
        field82++;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static void method57(int arg0) {
        if (arg0 == 3) {
            field83 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
    public static final void method58(int arg0) {
        if (arg0 != 1) {
            return;
        }
        while (true) {
            class111 var1;
            class128 var3;
            do {
                var1 = (class111) class283.field4507.method1389((byte) 47);
                if (var1 == null) {
                    field80++;
                    return;
                }
                if (var1.field1607 < 0) {
                    int var2 = -var1.field1607 - 1;
                    if (class40.field569 == var2) {
                        var3 = class186.field2993;
                    } else {
                        var3 = class92.field1374[var2];
                    }
                } else {
                    int var4 = var1.field1607 - 1;
                    var3 = class169.field2730[var4];
                }
            } while (var3 == null);
            class36 var5 = class134.method970(var1.field1595, 0);
            int var6;
            int var7;
            if (var1.field1600 == 1 || var1.field1600 == 3) {
                var7 = var5.field487;
                var6 = var5.field501;
            } else {
                var6 = var5.field487;
                var7 = var5.field501;
            }
            int var8 = (var6 + 1 >> 1) + var1.field1604;
            int var9 = (var7 >> 1) + var1.field1592;
            int var10 = var1.field1592 + (var7 + 1 >> 1);
            int[][] var11 = class220.field3533[class58.field826];
            int var12 = (var6 >> 1) + var1.field1604;
            int var13 = var11[var8][var9] + var11[var12][var10] + var11[var12][var9] + var11[var8][var10] >> 2;
            class178 var14 = null;
            int var15 = class247.field4123[var1.field1601];
            if (var15 == 0) {
                class99 var16 = class73.method538(class58.field826, var1.field1604, var1.field1592);
                if (var16 != null) {
                    var14 = var16.field1466;
                }
            } else if (var15 == 1) {
                class156 var19 = class272.method1882(class58.field826, var1.field1604, var1.field1592);
                if (var19 != null) {
                    var14 = var19.field2560;
                }
            } else if (var15 == 2) {
                class166 var17 = class105.method782(class58.field826, var1.field1604, var1.field1592);
                if (var17 != null) {
                    var14 = var17.field2681;
                }
            } else if (var15 == 3) {
                class159 var18 = class78.method571(class58.field826, var1.field1604, var1.field1592);
                if (var18 != null) {
                    var14 = var18.field2601;
                }
            }
            if (var14 != null) {
                class287.method1947(0, var1.field1592, true, var1.field1609 + 1, var1.field1597 + 1, class58.field826, -1, var15, var1.field1604, 0);
                var3.field1931 = var14;
                var3.field1973 = var13;
                var3.field1877 = var1.field1604 * 128 + var6 * 64;
                var3.field1949 = var1.field1592 * 128 + (var7 * 64);
                var3.field1946 = class264.field4290 + var1.field1597;
                int var20 = var1.field1596;
                int var21 = var1.field1593;
                int var22 = var1.field1602;
                if (var20 < var21) {
                    int var23 = var21;
                    var21 = var20;
                    var20 = var23;
                }
                var3.field1967 = var1.field1604 + var20;
                var3.field1880 = var1.field1604 + var21;
                var3.field1945 = class264.field4290 + var1.field1609;
                int var24 = var1.field1598;
                if (var24 < var22) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field1939 = var1.field1592 + var24;
                var3.field1876 = var1.field1592 + var22;
            }
        }
    }
}
