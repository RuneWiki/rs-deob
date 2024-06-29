import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class272 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[[[B")
    public static byte[][][] field4263;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1938(int arg0) {
        class107.field1758 = 1;
        class344.field5340 = false;
        class284.field4424 = 0;
        field4262++;
        int var1 = -117 % ((33 - arg0) / 37);
        class157.field2572 = -1;
        class49.field744 = 0;
        class311.field4917 = 0;
        class133.field2117 = -3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lpk;II)Lul;", line = 22)
    public static final class49 method1939(class120 arg0, int arg1, int arg2) {
        field4257++;
        if (arg1 != -12389) {
            method1938(-128);
        }
        byte[] var3 = arg0.method950(-1516, arg2);
        return var3 == null ? null : new class49(var3);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(JZ)V", line = 40)
    public static final void method1940(long arg0, boolean arg1) {
        field4259++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class172.field2763 < 100 || class89.field1427) || class172.field2763 >= 200) {
            class129.method1003(0, class225.field3482, "", 103);
            return;
        }
        String var3 = class150.method1134(122, arg0);
        for (int var4 = 0; var4 < class172.field2763; var4++) {
            if (class130.field2080[var4] == arg0) {
                class129.method1003(0, var3 + class180.field2870, "", -127);
                return;
            }
        }
        for (int var5 = 0; var5 < class321.field5024; var5++) {
            if (class158.field2587[var5] == arg0) {
                class129.method1003(0, class183.field2901 + var3 + class37.field551, "", -127);
                return;
            }
        }
        if (var3.equals(class345.field5363.field1486)) {
            class129.method1003(0, class90.field1434, "", 50);
            return;
        }
        class62.field902++;
        class129.field2066[class172.field2763] = var3;
        class130.field2080[class172.field2763] = arg0;
        class296.field4725[class172.field2763] = 0;
        class172.field2759[class172.field2763] = "";
        if (!arg1) {
            return;
        }
        class227.field3506[class172.field2763] = 0;
        class301.field4799[class172.field2763] = false;
        class11.field254 = class200.field3060;
        class172.field2763++;
        class209.field3305.method1808((byte) -74, 132);
        class209.field3305.method59(arg0, false);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 108)
    public static final void method1941(int arg0, int arg1) {
        field4261++;
        class170 var2 = class221.method1613(10, arg1, arg0 ^ 0xFFFFA659);
        if (arg0 == 31103) {
            var2.method1267(-101);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 127)
    public static void method1942(byte arg0) {
        field4263 = (byte[][][]) null;
        if (arg0 > -6) {
            field4263 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)V", line = 139)
    public static final void method1943(byte arg0, boolean arg1) {
        field4260++;
        if (arg0 <= 104) {
            return;
        }
        byte[][] var2;
        byte var3;
        if (class162.field2623 && arg1) {
            var2 = class338.field5222;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class115.field1862;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class178.method1310(16);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class174.field2795[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3DFE003) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFD) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class338.field5218.length; var13++) {
                                if (class338.field5218[var13] == var12 && var2[var13] != null) {
                                    class304.method2162(var4, (var10 & 0x7) * 8, (var11 & 0x7) * 8, var8, var2[var13], class166.field2686, var9, var5 * 8, 25199, arg1, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B[Ljava/lang/String;[S)V", line = 223)
    public static final void method1944(byte arg0, String[] arg1, short[] arg2) {
        field4258++;
        class105.method846(arg1, 2, arg2, arg1.length - 1, 0);
        if (arg0 != 21) {
            method1942((byte) 59);
        }
    }
}
