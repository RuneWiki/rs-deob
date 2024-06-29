import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class111 extends class280 {

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Llc;")
    public static class86 field1605;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Ljava/awt/Image;")
    public static Image field1606;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static final void method814(byte arg0) {
        field1603++;
        if (class168.field2705 == -1 || class121.field1765 == -1) {
            return;
        }
        int var1 = ((class297.field4695 - class227.field3638) * class126.field1845 >> 16) + class227.field3638;
        class126.field1845 += var1;
        if (class126.field1845 < 65535) {
            class135.field2215 = false;
            class99.field1461 = false;
        } else {
            if (class135.field2215) {
                class99.field1461 = false;
            } else {
                class99.field1461 = true;
            }
            class135.field2215 = true;
            class126.field1845 = 65535;
        }
        float var2 = (float) class126.field1845 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class93.field1395 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class250.field4151[class168.field2705][var4 + 1][var5] * 3;
            int var22 = class250.field4151[class168.field2705][var4][var5] * 3;
            int var23 = (class250.field4151[class168.field2705][var4 + 2][var5] + class250.field4151[class168.field2705][var4 + 2][var5] - class250.field4151[class168.field2705][var4 + 3][var5]) * 3;
            int var24 = class250.field4151[class168.field2705][var4][var5];
            int var25 = var23 + var22 - (var21 * 2);
            int var26 = var21 - var22;
            int var27 = class250.field4151[class168.field2705][var4 + 2][var5] + var21 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var25) * var2 + (float) var26) * var2 + (float) var24;
        }
        class185.field2986 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        class196.field3177 = (int) var3[2] - class99.field1465 * 128;
        class50.field736 = (int) var3[0] - (class282.field4487 * 128);
        int var7 = class85.field1243 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class250.field4151[class121.field1765][var7][var8] * 3;
            int var15 = class250.field4151[class121.field1765][var7 + 1][var8] * 3;
            int var16 = (class250.field4151[class121.field1765][var7 + 2][var8] - (class250.field4151[class121.field1765][var7 + 3][var8] - class250.field4151[class121.field1765][var7 + 2][var8])) * 3;
            int var17 = class250.field4151[class121.field1765][var7][var8];
            int var18 = var14 + var16 - (var15 * 2);
            int var19 = class250.field4151[class121.field1765][var7 + 2][var8] + var15 - var16 - var17;
            int var20 = var15 - var14;
            var6[var8] = (((float) var19 * var2 + (float) var18) * var2 + (float) var20) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class207.field3323 = (float) Math.atan2((double) var10, var12);
        if (arg0 <= -64) {
            class82.field1180 = -((float) Math.atan2((double) var9, (double) var11));
            class67.field988 = (int) ((double) class207.field3323 * 325.949D) & 0x7FF;
            class218.field3485 = (int) ((double) class82.field1180 * 325.949D) & 0x7FF;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static void method815(int arg0) {
        int var1 = -84 / ((arg0 - 30) / 39);
        field1605 = null;
        field1606 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
    public static final void method816(int arg0, int arg1, int arg2) {
        field1591++;
        class187 var3 = class43.field627[class58.field826][arg2][arg0];
        if (var3 == null) {
            class19.method129(class58.field826, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class109 var5 = null;
        class109 var6 = (class109) var3.method1384(2);
        if (arg1 != 0) {
            method814((byte) 76);
        }
        while (var6 != null) {
            class62 var13 = class254.method1800(var6.field1578.field4172, 15017);
            int var14 = var13.field911;
            if (var13.field909 == 1) {
                var14 = (var6.field1578.field4175 + 1) * var14;
            }
            if (var4 < var14) {
                var5 = var6;
                var4 = var14;
            }
            var6 = (class109) var3.method1388((byte) 91);
        }
        if (var5 == null) {
            class19.method129(class58.field826, arg2, arg0);
            return;
        }
        var3.method1391(2, var5);
        class253 var7 = null;
        class109 var8 = (class109) var3.method1384(arg1 ^ 0x2);
        class253 var9 = null;
        while (var8 != null) {
            class253 var12 = var8.field1578;
            if (var5.field1578.field4172 != var12.field4172) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field4172 != var12.field4172 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class109) var3.method1388((byte) 72);
        }
        long var10 = (long) (arg2 + (arg0 << 7) + 1610612736);
        class175.method1315(class58.field826, arg2, arg0, class129.method930(arg0 * 128 + 64, arg2 * 128 + 64, 115, class58.field826), var5.field1578, var10, var7, var9);
    }
}
