import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class149 extends class53 {

    @OriginalMember(owner = "client!v", name = "M", descriptor = "[Lgk;")
    public class156[] field2584;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field2580 = 0;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "Lde;")
    public static class108 field2577;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public static final void method1030(int arg0) {
        field2583++;
        if (class221.field3837 != null || class57.field927 != null) {
            return;
        }
        if (arg0 != -49) {
            method1031(-102);
        }
        int var1 = class175.field3034;
        if (!class31.field582) {
            if (var1 == 1 && class157.field2745 > 0) {
                short var12 = class275.field4765[class157.field2745 - 1];
                if (var12 == 7 || var12 == 48 || var12 == 38 || var12 == 19 || var12 == 50 || var12 == 24 || var12 == 25 || var12 == 39 || var12 == 31 || var12 == 32 || var12 == 45 || var12 == 1004) {
                    int var13 = class242.field4235[class157.field2745 - 1];
                    int var14 = class227.field3917[class157.field2745 - 1];
                    class113 var15 = class233.method1569(65535, var14);
                    if (class169.method1173(client.method1099(var15), arg0 ^ 0x73F60173) || class254.method1711((byte) -34, client.method1099(var15))) {
                        class230.field3978 = 0;
                        class93.field1509 = false;
                        if (class221.field3837 != null) {
                            class242.method1642((byte) 29, class221.field3837);
                        }
                        class221.field3837 = class233.method1569(arg0 ^ 0xFFFF0030, var14);
                        class128.field2233 = class187.field3268;
                        class278.field4874 = class98.field1572;
                        class44.field732 = var13;
                        class242.method1642((byte) 94, class221.field3837);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class13.field269 == 1 && class157.field2745 > 2 || class236.method1587(class157.field2745 - 1, (byte) 95))) {
                var1 = 2;
            }
            if (var1 == 2 && class157.field2745 > 0 || class60.field969 == 1) {
                class16.method126(0);
            }
            if ((var1 != 1 || class157.field2745 <= 0) && class60.field969 != 2) {
                return;
            }
            class169.method1176((byte) 119);
            return;
        }
        if (var1 != 1) {
            int var2 = class229.field3957;
            int var3 = class154.field2673;
            if (class59.field951 - 10 > var2 || (class59.field951 + class78.field1270 + 10) < var2 || class222.field3857 - 10 > var3 || var3 > (class222.field3857 + class246.field4322 + 10)) {
                class31.field582 = false;
                class49.method365(class222.field3857, class59.field951, (byte) -65, class78.field1270, class246.field4322);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class59.field951;
        int var5 = class222.field3857;
        int var6 = class78.field1270;
        int var7 = class98.field1572;
        int var8 = class187.field3268;
        int var9 = -1;
        for (int var10 = 0; var10 < class157.field2745; var10++) {
            int var11;
            if (class148.field2567) {
                var11 = (class157.field2745 - var10 - 1) * 15 + var5 + 35;
            } else {
                var11 = var5 + ((-var10 + -1 + class157.field2745) * 15) + 31;
            }
            if (var7 > var4 && var4 + var6 > var7 && var8 > (var11 - 13) && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class3.method52(arg0 + 51, var9);
        }
        class31.field582 = false;
        class49.method365(class222.field3857, class59.field951, (byte) -65, class78.field1270, class246.field4322);
        return;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2577 = null;
        if (arg0 != 0) {
            field2577 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)Z")
    public final boolean method1032(int arg0, byte arg1) {
        field2575++;
        if (arg1 != 1) {
            field2577 = null;
        }
        return this.field2584[arg0].field2724;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZJIZ)Lp;")
    public static final class280 method1033(int arg0, boolean arg1, long arg2, int arg3, boolean arg4) {
        field2582++;
        class280 var6 = class52.method384((byte) 116, 0);
        if (arg2 < 0L) {
            arg2 = -arg2;
            var6.method1902(1, class53.field875);
        }
        class280 var7 = class37.field667;
        class280 var8 = class273.field4745;
        if (arg0 == 1) {
            var7 = class273.field4745;
            var8 = class37.field667;
        }
        if (arg0 == 2) {
            var7 = class68.field1124;
            var8 = class37.field667;
        }
        if (arg0 == 3) {
            var7 = class273.field4745;
            var8 = class37.field667;
        }
        class280 var9 = class52.method384((byte) -70, 0);
        class280 var10 = class52.method384((byte) -47, 0);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method1902(1, class249.method1685((byte) -97, (int) (arg2 % 10L)));
            arg2 /= 10L;
        }
        if (arg2 == 0L) {
            var9 = class227.field3932;
        }
        int var12 = 0;
        if (arg1) {
            field2580 = 83;
        }
        while (arg2 > 0L) {
            if (arg4 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1902(1, var7);
            }
            var12++;
            var9.method1902(1, class249.method1685((byte) -89, (int) (arg2 % 10L)));
            arg2 /= 10L;
        }
        if (var10.method1889(-1) > 0) {
            var10.method1902(1, var8);
        }
        return class30.method266(new class280[] { var6, var9.method1885((byte) 126), var10.method1885((byte) 127) }, (byte) -87);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ltg;Ltg;IZ)V")
    public class149(class180 arg0, class180 arg1, int arg2, boolean arg3) {
        class90 var5 = new class90();
        int var6 = arg0.method1259(arg2, 105);
        this.field2584 = new class156[var6];
        int[] var7 = arg0.method1237(arg2, -1);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1258(arg2, var7[var8], (byte) 110);
            int var10 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            class100 var11 = null;
            for (class100 var12 = (class100) var5.method651(12916); var12 != null; var12 = (class100) var5.method643(11066)) {
                if (var12.field1638 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1243(var10, 0, -22272);
                } else {
                    var13 = arg1.method1243(0, var10, -22272);
                }
                var11 = new class100(var10, var13);
                var5.method649(var11, (byte) 111);
            }
            this.field2584[var7[var8]] = new class156(var9, var11);
        }
    }
}
