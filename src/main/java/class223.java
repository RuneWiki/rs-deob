import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class223 {

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lr;")
    public class42 field3549;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3550 = 255;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lfa;")
    public static class273 field3554;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lfa;")
    public static class273 field3555;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1556(byte[] arg0, byte arg1) {
        if (arg1 != -101) {
            method1559((byte) -17);
        }
        field3552++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class158.method1051(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method1557(byte arg0) {
        field3555 = null;
        int var1 = -7 % ((-arg0 - 69) / 51);
        field3554 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BZ)Ljava/lang/String;")
    public static final String method1558(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field3556++;
        int var4 = 0;
        char[] var5 = new char[arg0];
        int var6 = 0;
        if (arg3) {
            method1558(111, -75, (byte[]) null, false);
        }
        while (arg0 > var6) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class50.field684[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
            var6++;
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public static final void method1559(byte arg0) {
        field3558++;
        int var1 = class248.field3950;
        int var2 = class307.field4997;
        int var3 = class120.field1847;
        int var4 = class307.field4990 - 3;
        byte var5 = 20;
        if (class301.field4936 == null || class220.field3515 == null) {
            if (class3.field22.method1874(class124.field1902, 3883) && class3.field22.method1874(class195.field3078, 3883)) {
                class301.field4936 = class149.method989(class3.field22, (byte) -25, 0, class124.field1902);
                class220.field3515 = class149.method989(class3.field22, (byte) -25, 0, class195.field3078);
            } else {
                class62.method395(var3, var1, var2, var5, class259.field4251, 256 - class48.field664);
            }
        }
        if (class301.field4936 != null && class220.field3515 != null) {
            int var6 = (var2 - (class220.field3515.field4830 * 2)) / class301.field4936.field4830;
            for (int var7 = 0; var7 < var6; var7++) {
                class301.field4936.method252(class301.field4936.field4830 * var7 + class220.field3515.field4830 + var3, var1);
            }
            class220.field3515.method252(var3, var1);
            class220.field3515.method251(var3 + var2 - class220.field3515.field4830, var1);
        }
        class202.field3227.method744(class262.field4333, var3 + 3, var1 + 14, class67.field981, -1);
        class62.method395(var3, var1 + var5, var2, var4 - var5, class259.field4251, 256 - class48.field664);
        int var8 = class60.field924;
        int var9 = class1.field1;
        for (int var10 = 0; var10 < class18.field251; var10++) {
            int var18 = (class18.field251 - var10 - 1) * 15 + var1 + var5 + 13;
            if (var3 < var9 && (var3 + var2) > var9 && var8 > var18 - 13 && var8 < (var18 + 3)) {
                class62.method395(var3, var18 - 12, var2, 15, class27.field344, 256 - class161.field2539);
            }
        }
        if (arg0 >= -75) {
            field3548 = -40;
        }
        if ((class121.field1853 == null || class258.field4244 == null || class18.field253 == null) && class3.field22.method1874(class59.field898, 3883) && class3.field22.method1874(class299.field4916, 3883) && class3.field22.method1874(class262.field4332, 3883)) {
            class121.field1853 = class149.method989(class3.field22, (byte) -25, 0, class59.field898);
            class258.field4244 = class149.method989(class3.field22, (byte) -25, 0, class299.field4916);
            class18.field253 = class149.method989(class3.field22, (byte) -25, 0, class262.field4332);
        }
        if (class121.field1853 != null && class258.field4244 != null && class18.field253 != null) {
            int var11 = (var2 - (class18.field253.field4830 * 2)) / class121.field1853.field4830;
            for (int var12 = 0; var12 < var11; var12++) {
                class121.field1853.method252(class121.field1853.field4830 * var12 + class18.field253.field4830 + var3, -class121.field1853.field4833 + var4 + var1);
            }
            int var13 = (var4 - var5 - class18.field253.field4833) / class258.field4244.field4833;
            for (int var14 = 0; var14 < var13; var14++) {
                class258.field4244.method252(var3, class258.field4244.field4833 * var14 + var1 + var5);
                class258.field4244.method251(var2 + var3 - class258.field4244.field4830, class258.field4244.field4833 * var14 + (var1 - -var5));
            }
            class18.field253.method252(var3, var1 - (class18.field253.field4833 - var4));
            class18.field253.method251(var2 + var3 - class18.field253.field4830, -class18.field253.field4833 + var1 - -var4);
        }
        for (int var15 = 0; var15 < class18.field251; var15++) {
            int var16 = class67.field981;
            int var17 = var1 + (class18.field251 - var15 - 1) * 15 + var5 + 13;
            if (var3 < var9 && var9 < var2 + var3 && var8 > (var17 - 13) && (var17 + 3) > var8) {
                var16 = class16.field230;
            }
            class202.field3227.method744(class11.method60(0, var15), var3 + 3, var17, var16, 0);
        }
        class311.method2112(class248.field3950, -126, class307.field4997, class307.field4990, class120.field1847);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIII)V")
    public class223(int arg0, int arg1, int arg2, int arg3) {
        class42 var5 = class298.method2068(arg0, 1);
        this.field3557 = arg1;
        this.field3547 = arg2;
        this.field3553 = arg3;
        if (var5.field587 == -1) {
            this.field3549 = var5;
        } else {
            this.field3549 = class298.method2068(var5.field587, 1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lr;III)V")
    public class223(class42 arg0, int arg1, int arg2, int arg3) {
        this.field3547 = arg2;
        this.field3553 = arg3;
        this.field3557 = arg1;
        this.field3549 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public static final void method1560(int arg0, int arg1, int arg2) {
        if (class92.field1402 == 2) {
            class100.field1514 = arg2;
            class132.field2037 = arg0;
        }
        class202.field3253 = (float) arg2;
        int var3 = 83 / ((arg1 + 48) / 54);
        field3551++;
        class79.field1255 = (float) arg0;
        class130.method862((byte) -7);
        class87.field1355 = true;
    }
}
