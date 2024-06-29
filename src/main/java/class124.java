import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class124 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[[I")
    public static int[][] field1923 = new int[104][104];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public static int[] field1926 = new int[1000];

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lih;")
    public static class32 field1925 = new class32();

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1933 = -1;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    public static int[] field1924;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 5)
    public static final void method847(int arg0) {
        if (arg0 < 98) {
            method848(55, (class266) null);
        }
        if (class207.field3217 == 10 && class255.field4184) {
            class193.method1302(28, 5);
        }
        field1927++;
        if (class207.field3217 == 30) {
            class193.method1302(25, 5);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILve;)V", line = 29)
    public static final void method848(int arg0, class266 arg1) {
        field1929++;
        class252.field4149 = class133.method899((byte) 65, class324.field5598, arg1);
        class209.field3251 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var3 = (class12.field176[var2 + 1] & 0xFF0000) >> 16;
            float var4 = (float) ((class12.field176[var2] & 0xFF0000) >> 16);
            float var5 = (float) (class12.field176[var2] >> 8 & 0xFF);
            float var6 = (float) (class12.field176[var2] & 0xFF);
            float var7 = ((float) var3 - var4) / 64.0F;
            int var8 = (class12.field176[var2 + 1] & 0xFF00) >> 8;
            float var9 = ((float) var8 - var5) / 64.0F;
            int var10 = class12.field176[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var6) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class209.field3251[var2 * 64 + var12] = class240.method1652((int) var6, class240.method1652((int) var5 << 8, (int) var4 << 16));
                var5 += var9;
                var6 += var11;
                var4 += var7;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class209.field3251[var13] = class12.field176[3];
        }
        int var14 = -35 / ((-arg0 - 51) / 42);
        class154.field2400 = new int[32768];
        class262.field4284 = new int[32768];
        class198.method1334((byte) -89, (class183) null);
        class214.field3340 = new int[32768];
        class68.field1063 = new int[32768];
        class314.field5383 = new class256(128, 254);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 94)
    public static final void method849(int arg0) {
        int var1 = class315.field5395;
        field1931++;
        int var2 = class66.field1034;
        int var3 = class150.field2342;
        int var4 = 6116423;
        int var5 = class118.field1861;
        if (class255.field4184) {
            class326.method2278(var3, var1, var2, var5, var4);
            class326.method2278(var3 + 1, var1 + 1, var2 - 2, 16, 0);
            class326.method2271(var3 + 1, var1 + 18, var2 - 2, var5 + -19, 0);
        } else {
            class34.method286(var3, var1, var2, var5, var4);
            class34.method286(var3 + 1, var1 + 1, var2 - 2, 16, 0);
            class34.method274(var3 + 1, var1 + 18, var2 - 2, var5 + -19, 0);
        }
        class89.field1474.method1198(class196.field3046, var3 + 3, var1 + 14, var4, -1);
        int var6 = class259.field4235;
        int var7 = class136.field2090;
        if (arg0 >= -113) {
            field1923 = (int[][]) ((int[][]) null);
        }
        for (int var8 = 0; var8 < class126.field1955; var8++) {
            int var9 = (class126.field1955 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var3 < var7 && var7 < (var3 + var2) && var9 - 13 < var6 && var6 < (var9 + 3)) {
                var10 = 16776960;
            }
            class89.field1474.method1198(class82.method641(var8, true), var3 + 3, var9, var10, 0);
        }
        class299.method2109(class150.field2342, (byte) 107, class315.field5395, class118.field1861, class66.field1034);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIB)V", line = 167)
    public static final void method850(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1930++;
        class120 var5 = class293.method2059(4, 10, arg0);
        var5.method833((byte) 33);
        var5.field1876 = arg2;
        var5.field1877 = arg3;
        var5.field1875 = arg1;
        if (arg4 >= -35) {
            field1933 = 86;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I", line = 183)
    public static final int method851(int arg0) {
        if (arg0 != -2) {
            method852((byte) 26);
        }
        field1932++;
        return ((class303.field5227 ? 1 : 0) << 19) + (((class45.field707 ? 1 : 0) << 16) + ((class244.field4012 ? 1 : 0) << 15) + ((class25.field360 ? 1 : 0) << 13) + ((class319.field5471 ? 1 : 0) << 10) + ((class268.field4435 ? 1 : 0) << 9) + ((class297.field5041 ? 1 : 0) << 7) + ((class39.field643 ? 1 : 0) << 6) + ((class22.field307 ? 1 : 0) << 5) + (((class133.field2035 ? 1 : 0) << 3) + (class57.field923 & 0x7) - (-((class8.field95 ? 1 : 0) << 4) + -((class166.field2574 ? 1 : 0) << 8)) - (-(class295.field4918 & 0x3 << 11) + -((class263.field4311 == 0 ? 0 : 1) << 20) - (((class92.field1499 == 0 ? 0 : 1) << 21) + ((class42.field696 == 0 ? 0 : 1) << 22)))) + (class19.method126() << 23));
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 199)
    public static void method852(byte arg0) {
        field1923 = (int[][]) null;
        field1924 = null;
        field1925 = null;
        field1926 = null;
        if (arg0 != 24) {
            method850(-74, 65, 51, 91, (byte) -26);
        }
    }
}
