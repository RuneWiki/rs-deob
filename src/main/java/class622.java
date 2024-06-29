import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class622 extends class134 {

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "[[[I")
    public static int[][][] field8916 = new int[2][][];

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public int field8905;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
    public int field8906;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public int field8909;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    public int field8910;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    public int field8913;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
    public int field8914;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "Ltp;")
    public class532 field8907;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "Ltp;")
    public class532 field8908;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "Ljava/lang/String;")
    public String field8915;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "Z")
    public boolean field8917;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "[Ljava/lang/Object;")
    public Object[] field8904;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V", line = 8)
    public static void method3557(int arg0) {
        int var1 = 60 % ((27 - arg0) / 53);
        field8916 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V", line = 17)
    public static final void method3558(byte arg0) {
        for (int var1 = 0; var1 < class122.field1285; var1++) {
            class431.field6321[var1] = null;
        }
        if (arg0 <= 83) {
            method3559(49, null);
        }
        field8912++;
        class122.field1285 = 0;
        for (int var2 = 0; var2 < class723.field10134; var2++) {
            for (int var42 = 0; var42 < class284.field3473; var42++) {
                for (int var43 = 0; var43 < class151.field1664; var43++) {
                    class691 var44 = class638.field9170[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field9734 > 0) {
                            var44.field9734 = (short) (var44.field9734 * -1);
                        }
                        if (var44.field9724 > 0) {
                            var44.field9724 = (short) (var44.field9724 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class723.field10134; var3++) {
            for (int var4 = 0; var4 < class284.field3473; var4++) {
                for (int var5 = 0; var5 < class151.field1664; var5++) {
                    class691 var6 = class638.field9170[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class638.field9170[0][var5][var4] != null && class638.field9170[0][var5][var4].field9737 != null;
                        if (var6.field9724 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class691 var12 = class638.field9170[var3][var5][var4 - 1];
                            int var13 = class11.field88[var3].method1671(var4, var5, (byte) 122);
                            while (var8 > 0 && var12 != null && var12.field9724 < 0 && var6.field9724 == var12.field9724 && var6.field9726 == var12.field9726 && class11.field88[var3].method1671(var8 - 1, var5, (byte) -92) == var13 && (var8 - 1 <= 0 || class11.field88[var3].method1671(var8 - 2, var5, (byte) -98) == var13)) {
                                var8--;
                                var12 = class638.field9170[var3][var5][var8 - 1];
                            }
                            for (class691 var14 = class638.field9170[var3][var5][var4 + 1]; class151.field1664 > var9 && var14 != null && var14.field9724 < 0 && var6.field9724 == var14.field9724 && var6.field9726 == var14.field9726 && class11.field88[var3].method1671(var9 + 1, var5, (byte) -71) == var13 && (class151.field1664 <= var9 + 1 || var13 == class11.field88[var3].method1671(var9 + 2, var5, (byte) 72)); var14 = class638.field9170[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class11.field88[var7 ? var3 + 1 : var3].method1671(var8, var5, (byte) -76);
                            int var17 = var6.field9724 * var15 + var16;
                            int var18 = class11.field88[var7 ? var3 + 1 : var3].method1671(var9 + 1, var5, (byte) -122);
                            int var19 = var6.field9724 * var15 + var18;
                            int var20 = var5 << class748.field10430;
                            int var21 = var8 << class748.field10430;
                            int var22 = (var9 << class748.field10430) + class559.field7987;
                            class431.field6321[class122.field1285++] = new class464(1, var3, var6.field9726 + var20, var20 - -var6.field9726, var6.field9726 + var20, var6.field9726 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class638.field9170[var23][var5][var24].field9724 = (short) (class638.field9170[var23][var5][var24].field9724 * -1);
                                }
                            }
                        }
                        if (var6.field9734 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class691 var29 = class638.field9170[var3][var5 - 1][var4];
                            int var30 = class11.field88[var3].method1671(var4, var5, (byte) -106);
                            while (var25 > 0 && var29 != null && var29.field9734 < 0 && var6.field9734 == var29.field9734 && var6.field9730 == var29.field9730 && class11.field88[var3].method1671(var4, var25 - 1, (byte) -87) == var30 && (var25 - 1 <= 0 || var30 == class11.field88[var3].method1671(var4, var25 - 2, (byte) -71))) {
                                var25--;
                                var29 = class638.field9170[var3][var25 - 1][var4];
                            }
                            for (class691 var31 = class638.field9170[var3][var5 + 1][var4]; class284.field3473 > var26 && var31 != null && var31.field9734 < 0 && var6.field9734 == var31.field9734 && var6.field9730 == var31.field9730 && class11.field88[var3].method1671(var4, var26 + 1, (byte) -105) == var30 && (var26 + 1 >= class284.field3473 || var30 == class11.field88[var3].method1671(var4, var26 + 2, (byte) 61)); var31 = class638.field9170[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class11.field88[var7 ? var3 + 1 : var3].method1671(var4, var25, (byte) -101);
                            int var34 = var6.field9734 * var32 + var33;
                            int var35 = class11.field88[var7 ? var3 + 1 : var3].method1671(var4, var26 + 1, (byte) -80);
                            int var36 = var35 + (var6.field9734 * var32);
                            int var37 = var25 << class748.field10430;
                            int var38 = (var26 << class748.field10430) + class559.field7987;
                            int var39 = var4 << class748.field10430;
                            class431.field6321[class122.field1285++] = new class464(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field9730 + var39, var39 - -var6.field9730, var6.field9730 + var39, var6.field9730 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class638.field9170[var40][var41][var4].field9734 = (short) (class638.field9170[var40][var41][var4].field9734 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class119.field1229 = true;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILega;)V", line = 258)
    public static final void method3559(int arg0, class709 arg1) {
        arg1.field9990 = null;
        if (arg0 != 2) {
            field8916 = null;
        }
        field8911++;
        if (class164.field1836 < 20) {
            class289.field3569.method2792((byte) -13, arg1);
            class164.field1836++;
        }
    }
}
