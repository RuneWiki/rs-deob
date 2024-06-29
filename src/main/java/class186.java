import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class186 extends class199 {

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    private int field2549 = 32768;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "Lgl;")
    public static class281 field2554;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "Llo;")
    public static class325 field2548;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILvg;IIBII)Lvg;", line = 7)
    public static final class81 method1346(int arg0, class81 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2543++;
        if (arg4 >= -74) {
            method1348(96, 45, 101, 59, -98, 60);
        }
        long var7 = (long) arg3;
        class81 var9 = (class81) class255.field3729.method2265(var7, (byte) -98);
        if (var9 == null) {
            class197 var10 = class197.method1430(class262.field3790, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1439(64, 768, -50, -10, -50);
            class255.field3729.method2257(-125, var9, var7);
        }
        int var11 = arg1.method588();
        int var12 = arg1.method597();
        int var13 = arg1.method575();
        int var14 = arg1.method600();
        class81 var15 = var9.method595(true, true, true);
        if (arg0 != 0) {
            var15.method571(arg0);
        }
        if (class47.field623) {
            class128 var18 = (class128) var15;
            if (class271.method1847(arg2 + var13, true, arg6 + var11, class56.field724) != arg5 || arg5 != class271.method1847(arg2 + var14, true, arg6 + var12, class56.field724)) {
                for (int var19 = 0; var19 < var18.field1716; var19++) {
                    var18.field1710[var19] += class271.method1847(var18.field1699[var19] + arg2, true, var18.field1732[var19] + arg6, class56.field724) - arg5;
                }
                var18.field1724.field5221 = false;
                var18.field1701.field5506 = false;
            }
        } else {
            class332 var16 = (class332) var15;
            if (arg5 != class271.method1847(arg2 + var13, true, arg6 + var11, class56.field724) || class271.method1847(arg2 + var14, true, arg6 + var12, class56.field724) != arg5) {
                for (int var17 = 0; var17 < var16.field4982; var17++) {
                    var16.field4964[var17] += class271.method1847(var16.field4953[var17] + arg2, true, var16.field4973[var17] + arg6, class56.field724) - arg5;
                }
                var16.field4944 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(B)V", line = 89)
    public static void method1347(byte arg0) {
        if (arg0 >= -81) {
            field2553 = 63;
        }
        field2548 = null;
        field2554 = null;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V", line = 101)
    public final void method189(byte arg0) {
        class177.method1304((byte) -29);
        field2552++;
        int var2 = 2 / ((arg0 - 36) / 44);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I", line = 117)
    public final int[] method190(int arg0, int arg1) {
        field2545++;
        int[] var3 = this.field2802.method2502(arg1, arg0 + 1674);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, arg1, 1);
            int[] var5 = this.method1467(-7764, arg1, 2);
            for (int var6 = 0; var6 < class95.field1235; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field2549 >> 12;
                int var9 = class109.field1420[var7] * var8 >> 12;
                int var10 = class156.field2165 & (var9 >> 12) + arg1;
                int var11 = class112.field1446[var7] * var8 >> 12;
                int var12 = class245.field3573 & (var11 >> 12) + var6;
                int[] var13 = this.method1467(-7764, var10, 0);
                var3[var6] = var13[var12];
            }
        }
        if (arg0 != -1735) {
            field2548 = (class325) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(IIIIII)V", line = 167)
    public static final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 2453) {
            field2554 = (class281) null;
        }
        if (class245.field3574 <= arg0 && arg2 <= class321.field4722 && class207.field2937 <= arg4 && arg1 <= class25.field292) {
            class179.method1319(arg4, arg0, 0, arg1, arg5, arg2);
        } else {
            class199.method1468(arg0, arg2, arg4, arg3 - 2449, arg5, arg1);
        }
        field2546++;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 188)
    public class186() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V", line = 196)
    public static final void method1349(int arg0) {
        field2547++;
        int var1 = class242.field3508;
        int var2 = class66.field834;
        int var3 = class125.field1665 - (class192.field2660 + var2);
        int var4 = class95.field1246 - var1 - class163.field2314;
        if (arg0 != -30965) {
            method1349(-27);
        }
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class117.field1519 != null) {
                var5 = class117.field1519;
            } else if (class288.field4173 == null) {
                var5 = class157.field2216.field883;
            } else {
                var5 = class288.field4173;
            }
            int var6 = 0;
            int var7 = 0;
            if (class288.field4173 == var5) {
                Insets var8 = class288.field4173.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class125.field1665);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class95.field1246, var2);
            }
            if (var4 > 0) {
                var9.fillRect(var6 - (var4 - class95.field1246), var7, var4, class125.field1665);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class125.field1665 + var7 - var3, class95.field1246, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLfd;I)V", line = 265)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            return;
        }
        if (arg2 == 0) {
            this.field2549 = arg1.method2083((byte) -91) << 4;
        } else if (arg2 == 1) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        field2544++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[[I", line = 300)
    public final int[][] method215(int arg0, int arg1) {
        int[][] var3 = this.field2796.method2187(arg0, -90);
        if (this.field2796.field4667) {
            int[] var4 = this.method1467(-7764, arg0, 1);
            int[] var5 = this.method1467(-7764, arg0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class95.field1235; var9++) {
                int var10 = var5[var9] * this.field2549 >> 12;
                int var11 = var4[var9] * 255 >> 12 & 0xFF;
                int var12 = class109.field1420[var11] * var10 >> 12;
                int var13 = class112.field1446[var11] * var10 >> 12;
                int var14 = class245.field3573 & (var13 >> 12) + var9;
                int var15 = (var12 >> 12) + arg0 & class156.field2165;
                int[][] var16 = this.method1459(0, var15, (byte) -51);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        field2550++;
        if (arg1 != -29869) {
            field2554 = (class281) null;
        }
        return var3;
    }
}
