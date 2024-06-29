import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class148 extends class308 {

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Z")
    public boolean field2376 = false;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public int field2378 = -1;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Z")
    public boolean field2380 = false;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Lui;")
    public static class98 field2390 = new class98(64);

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Z")
    public static boolean field2397 = false;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Lnm;")
    public static class221 field2384;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "Luo;")
    public static class274 field2394;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lsk;")
    public static class297 field2395;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "[[[B")
    public static byte[][][] field2392;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLnm;)V", line = 10)
    public static final void method1050(byte arg0, class221 arg1) {
        if (arg0 != -52) {
            method1051(31, 48);
        }
        field2387++;
        class278.field4589 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)I", line = 25)
    public static final int method1051(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V", line = 42)
    public static final void method1052(int arg0) {
        class39.field583.method644((byte) -103);
        class23.field342.method644((byte) -121);
        field2385++;
        if (arg0 == 128) {
            class268.field4422.method644((byte) -100);
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V", line = 55)
    public static void method1053(int arg0) {
        field2394 = null;
        field2392 = (byte[][][]) null;
        field2384 = null;
        field2390 = null;
        field2395 = null;
        if (arg0 != 12119) {
            method1052(-124);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)Z", line = 74)
    public static final boolean method1054(int arg0, int arg1, int arg2) {
        int var3 = class140.field2257[arg0][arg1][arg2];
        if (-class141.field2268 == var3) {
            return false;
        } else if (class141.field2268 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class353.method2467(var4 + 1, class101.field1457[arg0][arg1][arg2], var5 + 1) && class353.method2467(var4 + 128 - 1, class101.field1457[arg0][arg1 + 1][arg2], var5 + 1) && class353.method2467(var4 + 128 - 1, class101.field1457[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class353.method2467(var4 + 1, class101.field1457[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class140.field2257[arg0][arg1][arg2] = class141.field2268;
                return true;
            } else {
                class140.field2257[arg0][arg1][arg2] = -class141.field2268;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ)V", line = 101)
    public static final void method1055(int arg0, int arg1, boolean arg2) {
        class150 var3 = class171.field2668[class120.field1779][arg0][arg1];
        field2388++;
        if (var3 == null) {
            class121.method786(class120.field1779, arg0, arg1);
            return;
        }
        class192 var4 = (class192) var3.method1081(95);
        int var5 = -99999999;
        class192 var6 = null;
        while (var4 != null) {
            class109 var7 = class322.method2311(var4.field2976.field1687, -111);
            int var8 = var7.field1558;
            if (var7.field1565 == 1) {
                var8 = (var4.field2976.field1684 + 1) * var8;
            }
            if (var8 > var5) {
                var6 = var4;
                var5 = var8;
            }
            var4 = (class192) var3.method1083((byte) 113);
        }
        if (var6 == null) {
            class121.method786(class120.field1779, arg0, arg1);
            return;
        }
        var3.method1078(var6, (byte) 105);
        class192 var9 = (class192) var3.method1081(108);
        class115 var10 = null;
        if (!arg2) {
            method1051(-55, 92);
        }
        class115 var11 = null;
        while (var9 != null) {
            class115 var12 = var9.field2976;
            if (var6.field2976.field1687 != var12.field1687) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1687 != var12.field1687 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class192) var3.method1083((byte) 113);
        }
        long var13 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class203.method1385(class120.field1779, arg0, arg1, client.method889(arg0 * 128 + 64, class120.field1779, arg1 * 128 + 64, -106), var6.field2976, var13, var10, var11);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZILre;)V", line = 179)
    public static final void method1056(boolean arg0, int arg1, class287 arg2) {
        if (arg2.field4799 > class58.field875) {
            class273.method1937(arg2, 0);
        } else if (arg2.field4726 >= class58.field875) {
            class246.method1748(!arg0, arg2);
        } else {
            class100.method657(false, arg2);
        }
        if (arg2.field4796 < 128 || arg2.field4783 < 128 || arg2.field4796 >= 13184 || arg2.field4783 >= 13184) {
            arg2.field4726 = 0;
            arg2.field4799 = 0;
            arg2.field4795 = -1;
            arg2.field4784 = -1;
            arg2.field4796 = arg2.field4762[0] * 128 + (arg2.method312(-115) * 64);
            arg2.field4783 = arg2.field4757[0] * 128 + arg2.method312(23) * 64;
            arg2.method2032((byte) -11);
        }
        if (class329.field5388 == arg2 && (arg2.field4796 < 1536 || arg2.field4783 < 1536 || arg2.field4796 >= 11776 || arg2.field4783 >= 11776)) {
            arg2.field4784 = -1;
            arg2.field4795 = -1;
            arg2.field4799 = 0;
            arg2.field4726 = 0;
            arg2.field4796 = arg2.field4762[0] * 128 + arg2.method312(28) * 64;
            arg2.field4783 = arg2.field4757[0] * 128 + (arg2.method312(-108) * 64);
            arg2.method2032((byte) 71);
        }
        field2393++;
        class142.method1006(arg2, -1);
        if (!arg0) {
            method1052(19);
        }
        class285.method2016(arg2, 57);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 236)
    public static final void method1057(byte arg0) {
        field2377++;
        class143.field2297.method644((byte) -104);
        if (arg0 != 30) {
            method1053(-26);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBIIIIII)V", line = 256)
    public static final void method1058(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2383++;
        if (arg3 == arg7) {
            class25.method219(arg3, 101, arg2, arg5, arg4, arg6, arg0);
            return;
        }
        if (class341.field5494 <= arg4 - arg3 && class196.field3001 >= arg3 + arg4 && class33.field505 <= (arg0 - arg7) && (arg0 + arg7) <= class278.field4586) {
            class34.method286(125, arg7, arg3, arg6, arg0, arg4, arg2, arg5);
        } else {
            class282.method1997(arg2, arg0, arg5, arg3, 103, arg4, arg7, arg6);
        }
        if (arg1 > -113) {
            field2394 = (class274) null;
        }
    }
}
