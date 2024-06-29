import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class127 {

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2215 = -2;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Leb;")
    public static class230 field2217 = class68.method589(0, "showVideoAd");

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Leb;")
    public static class230 field2221 = class68.method589(0, "ul");

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    public static boolean field2228 = true;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Leb;")
    public static class230 field2231 = class68.method589(0, "leuchten2:");

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Loh;")
    public static class261 field2223;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[[[B")
    public static byte[][][] field2220;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
    public static final void method990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2230++;
        if (arg2 != 17544) {
            method992(32, 123, -50);
        }
        if (class78.field1404 <= arg0 && arg0 <= class42.field769) {
            int var5 = class106.method882(class15.field345, 1, class259.field4587, arg1);
            int var6 = class106.method882(class15.field345, arg2 ^ 0x4489, class259.field4587, arg4);
            class41.method359(arg3, 118, var6, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILhj;JZ)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3, class70 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class56 var8 = new class56();
        var8.field1026 = arg4;
        var8.field1029 = arg1 * 128 + 64;
        var8.field1024 = arg2 * 128 + 64;
        var8.field1028 = arg3;
        var8.field1031 = arg5;
        if (class53.field916[arg0][arg1][arg2] == null) {
            class53.field916[arg0][arg1][arg2] = new class233(arg0, arg1, arg2);
        }
        class53.field916[arg0][arg1][arg2].field4052 = var8;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I")
    public static final int method992(int arg0, int arg1, int arg2) {
        field2222++;
        if (arg1 == -1) {
            return 12345678;
        } else if (arg2 == 128) {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        } else {
            return -83;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V")
    public static final void method993(boolean arg0, byte arg1) {
        if (arg0) {
            if (class263.field4679 != -1) {
                class115.method915(true, class263.field4679);
            }
            for (class150 var2 = (class150) client.field2708.method392(0); var2 != null; var2 = (class150) client.field2708.method390(arg1 ^ 0x4)) {
                class265.method1835(false, var2, true);
            }
            class263.field4679 = -1;
            client.field2708 = new class46(8);
            class264.method1832((byte) -44);
            class263.field4679 = class110.field1977;
            class175.method1279(false, (byte) 108);
            class229.method1580(-98);
            class219.method1504(class263.field4679, 66);
        }
        class56.field1033 = new class260();
        field2218++;
        class56.field1033.field2300 = 3000;
        class56.field1033.field2274 = 3000;
        class229.method1581((byte) 50, class97.field1781);
        if (arg1 == -5) {
            class26.method260(arg1 ^ 0xE, 10);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)Ltg;")
    public static final class176 method994(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class176 var4 = var3.field4063;
            var3.field4063 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILbf;IBI)V")
    public static final void method995(int arg0, class194 arg1, int arg2, byte arg3, int arg4) {
        field2229++;
        for (class66 var5 = (class66) class230.field3972.method839(128); var5 != null; var5 = (class66) class230.field3972.method834((byte) 82)) {
            if (var5.field1259 == arg4 && (arg0 * 128) == var5.field1233 && arg2 * 128 == var5.field1231 && var5.field1256.field3480 == arg1.field3480) {
                if (var5.field1235 != null) {
                    class117.field2096.method1682(var5.field1235);
                    var5.field1235 = null;
                }
                if (var5.field1250 != null) {
                    class117.field2096.method1682(var5.field1250);
                    var5.field1250 = null;
                }
                var5.method518(92);
                return;
            }
        }
        if (arg3 != 34) {
            method996(14);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method996(int arg0) {
        if (arg0 != 22134) {
            field2221 = null;
        }
        field2216++;
        class102.field1866.method1124(0);
        class173.field3049.method1124(0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method997(boolean arg0) {
        field2220 = null;
        field2217 = null;
        if (arg0) {
            field2220 = null;
        }
        field2231 = null;
        field2221 = null;
        field2223 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILkk;)I")
    public static final int method998(int arg0, class223 arg1) {
        field2225++;
        int var2 = 0;
        if (arg0 != 23453) {
            field2217 = null;
        }
        if (arg1.method1550(class60.field1144, 25648)) {
            var2++;
        }
        if (arg1.method1550(class259.field4576, 25648)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static final void method999(byte arg0) {
        if (arg0 != 97) {
            return;
        }
        int var1 = class156.method1190(-25146);
        if (var1 == 0) {
            class12.field176 = null;
            class136.method1048(-694336564, 0);
        } else if (var1 == 1) {
            class37.method332((byte) 49, (byte) 0);
            class136.method1048(-694336564, 512);
            class92.method775(-128);
        } else {
            class37.method332((byte) 49, (byte) (class150.field2676 - 4 & 0xFF));
            class136.method1048(arg0 - 694336661, 2);
        }
        field2232++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Llb;)V")
    public class127(class127 arg0) {
        this.field2226 = arg0.field2226;
        this.field2214 = arg0.field2214;
        this.field2224 = arg0.field2224;
        this.field2227 = arg0.field2227;
    }
}
