import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class129 extends class80 {

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "S")
    public static short field2115 = 256;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field2125 = 1;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILcl;)V", line = 11)
    public static final void method932(int arg0, class32 arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class316.field5374.length; var3++) {
            class316.field5374[var3] = 0;
        }
        field2116++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class316.field5374[var5] = (int) (Math.random() * 284.0D);
        }
        if (arg0 >= -34) {
            method932(-10, (class32) null);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class241.field3991[var9] = (class316.field5374[var9 - 1] + class316.field5374[var9 + 1] + class316.field5374[var9 + -128] + class316.field5374[var9 + 128]) / 4;
                }
            }
            int[] var10 = class316.field5374;
            class316.field5374 = class241.field3991;
            class241.field3991 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field3615; var12++) {
            for (int var13 = 0; var13 < arg1.field3621; var13++) {
                if (arg1.field541[var11++] != 0) {
                    int var14 = var12 + arg1.field3619 + 16;
                    int var15 = var13 - (-arg1.field3614 - 16);
                    int var16 = var15 + (var14 << 7);
                    class316.field5374[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)V", line = 111)
    public static final void method933(int arg0, boolean arg1) {
        if (arg0 != -3) {
            method932(28, (class32) null);
        }
        if (arg1) {
            if (class198.field3292 != -1) {
                class76.method576(class198.field3292, 0);
            }
            for (class48 var2 = (class48) class251.field4176.method711(0); var2 != null; var2 = (class48) class251.field4176.method718(27263)) {
                class69.method544(var2, true, arg0 + 13);
            }
            class198.field3292 = -1;
            class251.field4176 = new class97(8);
            class186.method1310((byte) -107);
            class198.field3292 = class307.field5180;
            class304.method2052(arg0 ^ 0xFFFFFF90, false);
            class229.method1632((byte) -128);
            class6.method42((byte) 127, class198.field3292);
        }
        class230.field3820 = new class209();
        class230.field3820.field5147 = 3000;
        field2118++;
        class230.field3820.field5168 = 3000;
        if (!class99.field1675) {
            class279.method1918(class209.field3442, false);
            class80.method595(10, (byte) -128);
            return;
        }
        if (class217.field3565 == 2) {
            class192.field3177 = class306.field5174 << 7;
            class167.field2725 = class48.field698 << 7;
        } else {
            class40.method305(96);
        }
        class101.method778((byte) -88);
        class82.method603((byte) 125);
        class80.method595(28, (byte) -126);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)I", line = 175)
    public static final int method934(boolean arg0, int arg1) {
        if (!arg0) {
            field2125 = -35;
        }
        field2117++;
        return arg1 >>> 8;
    }
}
