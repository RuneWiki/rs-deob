import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class127 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[Lva;")
    public volatile class239[] field2112 = new class239[2];

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Z")
    public volatile boolean field2122 = false;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    public volatile boolean field2111 = false;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field2124 = 0;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lpf;")
    public static class17 field2118 = new class17(64);

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lci;")
    public class83 field2113;

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
    public final void run() {
        field2119++;
        this.field2111 = true;
        try {
            while (!this.field2122) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class239 var2 = this.field2112[var1];
                    if (var2 != null) {
                        var2.method1717(-6);
                    }
                }
                class28.method182(10L, true);
                class180.method1310((Object) null, this.field2113, 29616);
            }
        } catch (Exception var9) {
            class84.method595(14117, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field2111 = false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[B)Luk;")
    public static final class87 method940(byte arg0, byte[] arg1) {
        field2117++;
        if (arg0 != -115) {
            method944((byte[]) null, 7, (byte) 81, 9);
        }
        class87 var2 = new class87();
        class249 var3 = new class249(arg1);
        var3.field4160 = var3.field4182.length - 2;
        int var4 = var3.method1821((byte) 51);
        int var5 = var3.field4182.length - var4 - 2 - 12;
        var3.field4160 = var5;
        int var6 = var3.method1800(-63);
        var2.field1451 = var3.method1821((byte) 51);
        var2.field1446 = var3.method1821((byte) 51);
        var2.field1432 = var3.method1821((byte) 51);
        var2.field1439 = var3.method1821((byte) 51);
        int var7 = var3.method1802((byte) -110);
        if (var7 > 0) {
            var2.field1438 = new class132[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1821((byte) 51);
                class132 var10 = new class132(class91.method633(var9, (byte) 52));
                var2.field1438[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1800(85);
                    int var12 = var3.method1800(116);
                    var10.method986((long) var11, true, new class113(var12));
                }
            }
        }
        var3.field4160 = 0;
        int var13 = 0;
        var2.field1437 = var3.method1816(-11);
        var2.field1441 = new int[var6];
        var2.field1440 = new String[var6];
        var2.field1444 = new int[var6];
        while (var5 > var3.field4160) {
            int var14 = var3.method1821((byte) 51);
            if (var14 == 3) {
                var2.field1440[var13] = var3.method1769(1).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1444[var13] = var3.method1802((byte) 87);
            } else {
                var2.field1444[var13] = var3.method1800(-51);
            }
            var2.field1441[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static final void method941(byte arg0) {
        if (arg0 == 74) {
            class149.field2467.method94(34);
            field2116++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public static void method942(byte arg0) {
        int var1 = 58 % ((arg0 - 10) / 46);
        field2118 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method943(int arg0, String arg1) {
        field2123++;
        if (arg1 == null) {
            return;
        }
        String var2 = class207.method1458(arg0 ^ 0xFFFFBC8F, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class76.field1296; var3++) {
            String var4 = class207.method1458(-77, class190.field3040[var3]);
            if (var4 != null && var4.equals(var2)) {
                class64.field1082++;
                class76.field1296--;
                for (int var5 = var3; var5 < class76.field1296; var5++) {
                    class190.field3040[var5] = class190.field3040[var5 + 1];
                    class94.field1537[var5] = class94.field1537[var5 + 1];
                    class217.field3659[var5] = class217.field3659[var5 + 1];
                    class108.field1784[var5] = class108.field1784[var5 + 1];
                    class5.field123[var5] = class5.field123[var5 + 1];
                    class283.field4675[var5] = class283.field4675[var5 + 1];
                }
                class293.field4824 = class196.field3162;
                class236.field3980.method640((byte) 97, 30);
                class236.field3980.method1780(class73.method517(-1, arg1), arg0 - 17108);
                class236.field3980.method1786(-25149, arg1);
                break;
            }
        }
        if (arg0 != 17160) {
            field2115 = -28;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([BIBI)I")
    public static final int method944(byte[] arg0, int arg1, byte arg2, int arg3) {
        field2121++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class282.field4666[(arg0[var5] ^ var4) & 0xFF];
        }
        if (arg2 <= 81) {
            field2118 = null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method945(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2120++;
        if (arg0 != 1) {
            field2115 = 24;
        }
        for (int var6 = arg1; var6 < arg3; var6++) {
            for (int var7 = arg5; var7 < arg2; var7++) {
                if (class95.field1541[var6][var7] == arg4 && class294.field4829[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
