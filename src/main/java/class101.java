import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class101 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lrd;")
    private static class173 field1848 = class133.method843("You are standing in a members)2only area)3", 101);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lrd;")
    public static class173 field1846 = class133.method843("Texturen geladen)3", 43);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lrd;")
    public static class173 field1852 = class133.method843("blinken2:", -127);

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lrd;")
    public static class173 field1854 = field1848;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[S")
    public static short[] field1849 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lrd;")
    public static class173 field1847 = null;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "[I")
    public static int[] field1855;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method617(int arg0) {
        field1855 = null;
        field1847 = null;
        field1848 = null;
        field1846 = null;
        field1854 = null;
        field1852 = null;
        if (arg0 != 29530) {
            field1854 = null;
        }
        field1849 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method618(byte arg0) {
        field1850++;
        class92.field1739.method53(-51);
        int var1 = -19 / ((arg0 - 49) / 62);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static final void method619(byte arg0) {
        class208.field4054 = new byte[4][104][104];
        class217.field4198 = new int[104];
        field1853++;
        class126.field2384 = new byte[4][104][104];
        class15.field351 = 99;
        class158.field2962 = new int[104];
        class79.field1570 = new int[4][105][105];
        class194.field3771 = new int[104];
        class45.field938 = new byte[4][104][104];
        int var1 = 57 % ((arg0 - 90) / 32);
        class140.field2602 = new byte[4][105][105];
        class171.field3311 = new int[104];
        class23.field502 = new byte[4][104][104];
        class57.field1125 = new int[104];
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI[Lrh;IIIII)V")
    public static final void method620(int arg0, int arg1, byte[] arg2, int arg3, class177[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1851++;
        if (arg5 != -17837) {
            method619((byte) -5);
        }
        int var10 = -1;
        class121 var11 = new class121(arg2);
        while (true) {
            int var12 = var11.method734(-1);
            if (var12 == 0) {
                return;
            }
            var10 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var11.method734(-1);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var11.method751((byte) -107);
                int var18 = var17 >> 2;
                int var19 = var13 >> 12;
                int var20 = var17 & 0x3;
                if (arg1 == var19 && var16 >= arg3 && var16 < arg3 + 8 && arg8 <= var15 && var15 < arg8 + 8) {
                    class4 var21 = class182.method1237(true, var10);
                    int var22 = arg9 + class188.method1259(-85, var16 & 0x7, var15 & 0x7, var21.field67, var21.field61, arg0, var20);
                    int var23 = class40.method293(var16 & 0x7, var20, arg0, var21.field67, var15 & 0x7, 67, var21.field61) + arg6;
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        class177 var24 = null;
                        int var25 = arg7;
                        if ((class21.field462[1][var22][var23] & 0x2) == 2) {
                            var25 = arg7 - 1;
                        }
                        if (var25 >= 0) {
                            var24 = arg4[var25];
                        }
                        class89.method568(var24, var18, arg0 + var20 & 0x3, var23, var10, (byte) -9, arg7, var22);
                    }
                }
            }
        }
    }
}
