import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class147 extends class129 {

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Lvh;")
    public static class108 field2506;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "Li;")
    private class112 field2496;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Z")
    public static final boolean method1012(int arg0, int arg1) {
        field2507++;
        class198.field3199 = arg0 + arg1 & 0xFFFF;
        class46.field799 = true;
        return true;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
    public final int method1013(int arg0, int arg1, int arg2) {
        field2500++;
        if (this.field2496 == null) {
            return arg1;
        }
        if (arg2 <= 30) {
            this.method1018(93, (class101) null, 127);
        }
        class69 var4 = (class69) this.field2496.method779(-118, (long) arg0);
        return var4 == null ? arg1 : var4.field1127;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILtb;JLtb;Ltb;)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, class184 arg4, long arg5, class184 arg6, class184 arg7) {
        class20 var9 = new class20();
        var9.field316 = arg4;
        var9.field321 = arg1 * 128 + 64;
        var9.field322 = arg2 * 128 + 64;
        var9.field318 = arg3;
        var9.field319 = arg5;
        var9.field317 = arg6;
        var9.field315 = arg7;
        int var10 = 0;
        class109 var11 = class79.field1367[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1968; var12++) {
                class173 var13 = var11.field1961[var12];
                if ((var13.field2850 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2842.method110();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field314 = -var10;
        if (class79.field1367[arg0][arg1][arg2] == null) {
            class79.field1367[arg0][arg1][arg2] = new class109(arg0, arg1, arg2);
        }
        class79.field1367[arg0][arg1][arg2].field1982 = var9;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static void method1015(int arg0) {
        field2506 = null;
        if (arg0 != 65535) {
            field2499 = -77;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIII)V")
    public static final void method1016(int arg0, int arg1, int arg2, int arg3) {
        field2501++;
        if (arg3 >= 33) {
            class55 var4 = class62.method395(11, arg2, (byte) -66);
            var4.method340((byte) -110);
            var4.field953 = arg1;
            var4.field947 = arg0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLeh;)V")
    public final void method1017(byte arg0, class101 arg1) {
        while (true) {
            int var3 = arg1.method669((byte) 36);
            if (var3 == 0) {
                if (arg0 != -9) {
                    return;
                }
                field2503++;
                return;
            }
            this.method1018(-28235, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILeh;I)V")
    private final void method1018(int arg0, class101 arg1, int arg2) {
        if (arg0 != -28235) {
            method1012(33, 14);
        }
        field2504++;
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method669((byte) 36);
        if (this.field2496 == null) {
            int var5 = class6.method33(var4, (byte) -103);
            this.field2496 = new class112(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method669((byte) 36) == 1;
            int var8 = arg1.method658(arg0 + 50527);
            class83 var9;
            if (var7) {
                var9 = new class292(arg1.method662((byte) 1));
            } else {
                var9 = new class69(arg1.method655((byte) 71));
            }
            this.field2496.method780((byte) -78, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
    public final String method1019(int arg0, String arg1, byte arg2) {
        field2502++;
        if (arg2 <= 111) {
            this.method1013(-94, -102, 36);
        }
        if (this.field2496 == null) {
            return arg1;
        } else {
            class292 var4 = (class292) this.field2496.method779(-107, (long) arg0);
            return var4 == null ? arg1 : var4.field4667;
        }
    }
}
