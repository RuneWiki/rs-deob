import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class120 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lqe;")
    public static class179 field2243 = class206.method1380("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", (byte) 29);

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public static int[] field2247 = new int[4000];

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lqe;")
    private static class179 field2248 = class206.method1380("Examine", (byte) -126);

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lae;")
    public static class6 field2249 = null;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lqe;")
    public static class179 field2246 = field2248;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lqe;")
    public static class179 field2252 = class206.method1380("p11_full", (byte) 38);

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Ls;")
    public static class194 field2251 = new class194(64);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method769(byte arg0, int arg1) {
        int var2 = -125 / ((arg0 + 14) / 43);
        field2250++;
        if (arg1 == 100 && class175.field3188 > 0) {
            byte[] var3 = class146.field2646[--class175.field3188];
            class146.field2646[class175.field3188] = null;
            return var3;
        } else if (arg1 == 5000 && class180.field3310 > 0) {
            byte[] var4 = class42.field882[--class180.field3310];
            class42.field882[class180.field3310] = null;
            return var4;
        } else if (arg1 == 30000 && class56.field1238 > 0) {
            byte[] var5 = class186.field3460[--class56.field1238];
            class186.field3460[class56.field1238] = null;
            return var5;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
    public static final void method770(int arg0, byte arg1) {
        if (arg1 < 41) {
            method769((byte) 22, 49);
        }
        class49.field1064 = 1000 / arg0;
        field2245++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static final void method771(boolean arg0) {
        field2244++;
        class236.field4342 &= 0x7FF;
        if (class175.field3145 < 128) {
            class175.field3145 = 128;
        }
        if (class175.field3145 > 383) {
            class175.field3145 = 383;
        }
        int var1 = class230.field4253 >> 7;
        if (arg0) {
            method769((byte) -42, -57);
        }
        int var2 = class234.field4321 >> 7;
        int var3 = class202.method1341(-121, class230.field4253, class49.field1038, class234.field4321);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class49.field1038;
                    if (var7 < 3 && (class9.field265[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class194.field3619[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class128.field2336 < var9) {
            class128.field2336 += (var9 - class128.field2336) / 24;
        } else if (var9 < class128.field2336) {
            class128.field2336 += (var9 - class128.field2336) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method772(int arg0) {
        field2246 = null;
        field2249 = null;
        field2243 = null;
        field2248 = null;
        field2251 = null;
        if (arg0 != -1001) {
            field2243 = null;
        }
        field2252 = null;
        field2247 = null;
    }
}
