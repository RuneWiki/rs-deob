import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class168 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
    public static boolean field2434 = false;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lwv;")
    public static class26 field2433 = new class26("LIVE", 0);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lbl;")
    public static class458 field2436;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[[[I")
    public static int[][][] field2437;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljs;Ljava/lang/Object;B)V", line = 3)
    public static final void method1126(class216 arg0, Object arg1, byte arg2) {
        field2431++;
        if (arg0.field2928 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2928.peekEvent() != null; var3++) {
            class94.method674(1L, 1);
        }
        int var4 = -35 / ((arg2 - 51) / 59);
        if (arg1 != null) {
            arg0.field2928.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)V", line = 27)
    public static final void method1127(int arg0, int arg1, boolean arg2) {
        field2432++;
        if (arg2) {
            field2436 = null;
        }
        if (class191.field2691 == class155.field2265) {
            if (!class279.method1654(-2, -1, 1, arg1, 0, 1, false, arg0, 0)) {
                class279.method1654(-3, -1, 1, arg1, 0, 1, false, arg0, 0);
            }
        } else if (!class279.method1654(-3, -1, 1, arg1, 0, 1, false, arg0, 0)) {
            class279.method1654(-2, -1, 1, arg1, 0, 1, false, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 52)
    public static final void method1128(byte arg0) {
        field2428++;
        class55.field872 = 0;
        int var1 = class481.field6632.method2233((byte) -112);
        int var2 = class481.field6632.method2245(255);
        if (arg0 != -121) {
            return;
        }
        boolean var3 = class481.field6632.method2217((byte) 125) == 1;
        int var4 = class481.field6632.method2222(arg0 - 7);
        class380.method2252(arg0 ^ 0xE, var4);
        int var5 = (class219.field2965 - class481.field6632.field5173) / 16;
        class380.field5194 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class380.field5194[var6][var10] = class481.field6632.method2232((byte) 127);
            }
        }
        class386.field5257 = new int[var5];
        class305.field4025 = new byte[var5][];
        class162.field2364 = new int[var5];
        class506.field6966 = new byte[var5][];
        class257.field3388 = new byte[var5][];
        class76.field1132 = new int[var5];
        class420.field5754 = new byte[var5][];
        class252.field3333 = null;
        class467.field6437 = new int[var5];
        class103.field1521 = null;
        class149.field2131 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class12.field251 >> 4)) / 8; var8 <= ((class12.field251 >> 4) + var2) / 8; var8++) {
            for (int var9 = (var1 - (class289.field3782 >> 4)) / 8; var9 <= (var1 + (class289.field3782 >> 4)) / 8; var9++) {
                class149.field2131[var7] = (var8 << 8) + var9;
                class76.field1132[var7] = class88.field1340.method2704("m" + var8 + "_" + var9, true);
                class467.field6437[var7] = class88.field1340.method2704("l" + var8 + "_" + var9, true);
                class386.field5257[var7] = class88.field1340.method2704("um" + var8 + "_" + var9, true);
                class162.field2364[var7] = class88.field1340.method2704("ul" + var8 + "_" + var9, true);
                var7++;
            }
        }
        class167.method1124(var2, var1, false, (byte) 104, var3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V", line = 128)
    public static final void method1129(int arg0, byte arg1) {
        field2430++;
        class253 var2 = class332.method1911(arg0, (byte) -127, 4);
        if (arg1 != 104) {
            method1131(-6);
        }
        var2.method1523((byte) -113);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;Lpc;ZB)Lqi;", line = 142)
    public static final class397 method1130(String arg0, class473 arg1, boolean arg2, byte arg3) {
        field2435++;
        int var4 = arg1.method2704(arg0, true);
        if (var4 == -1) {
            return new class397(0);
        }
        int[] var5 = arg1.method2719(var4, (byte) -79);
        class397 var6 = new class397(var5.length);
        if (arg3 >= -124) {
            return null;
        }
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field5356 > var7) {
                class379 var9 = new class379(arg1.method2708(var4, var5[var8++], (byte) 54));
                int var10 = var9.method2232((byte) 126);
                int var11 = var9.method2212((byte) 83);
                int var12 = var9.method2238(255);
                if (!arg2 && var12 == 1) {
                    var6.field5356--;
                } else {
                    var6.field5354[var7] = var10;
                    var6.field5357[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 199)
    public static void method1131(int arg0) {
        field2433 = null;
        field2436 = null;
        field2437 = null;
        if (arg0 != 9018) {
            field2436 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIIII)I", line = 218)
    public static final int method1132(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2429++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        if (arg1 != 48) {
            return -59;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 - (arg5 + arg0 - 1);
        } else {
            return 7 + 1 - arg3 - arg6;
        }
    }
}
