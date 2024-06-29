import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 extends class148 {

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "[I")
    public int[] field2094;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "[[I")
    public int[][] field2090;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Lja;")
    private static class62 field2080 = class30.method243(43, " more options");

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Lja;")
    public static class62 field2078 = class30.method243(43, "(U2");

    @OriginalMember(owner = "client!me", name = "D", descriptor = "Lja;")
    public static class62 field2083 = class30.method243(43, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lja;")
    private static class62 field2088 = class30.method243(43, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Lja;")
    public static class62 field2089 = field2088;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Lja;")
    private static class62 field2087 = class30.method243(43, "Members only world");

    @OriginalMember(owner = "client!me", name = "C", descriptor = "[I")
    public static int[] field2082 = new int[128];

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field2081 = -1;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field2093 = 0;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lja;")
    public static class62 field2084 = field2080;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "Lja;")
    public static class62 field2092 = field2087;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field2096 = 0;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "J")
    public static long field2097 = 0L;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field2098 = 0;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Lea;")
    public static class29 field2086;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method675(int arg0) {
        field2087 = null;
        field2089 = null;
        field2080 = null;
        field2092 = null;
        field2083 = null;
        field2088 = null;
        field2084 = null;
        field2086 = null;
        field2082 = null;
        int var1 = -61 % ((arg0 + 44) / 36);
        field2078 = null;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static final void method676(int arg0) {
        field2085++;
        if (arg0 != -28890) {
            method675(112);
        }
        for (int var1 = 0; var1 < class146.field3436; var1++) {
            int var10002 = class80.field1947[var1]--;
            if (class80.field1947[var1] >= -10) {
                class109 var3 = class15.field367[var1];
                if (var3 == null) {
                    var3 = class109.method887(field2086, class35.field834[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class80.field1947[var1] += var3.method886();
                    class15.field367[var1] = var3;
                }
                if (class80.field1947[var1] < 0) {
                    int var4;
                    if (class34.field816[var1] == 0) {
                        var4 = class82.field1977;
                    } else {
                        int var5 = class34.field816[var1] >> 16 & 0xFF;
                        int var6 = (class34.field816[var1] & 0xFF) * 128;
                        int var7 = class34.field816[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class40.field936.field134;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var5 * 128 + 64 - class40.field936.field136;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var9 + var8 - 128;
                        if (var10 > var6) {
                            class80.field1947[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var6 - var10) * class83.field1993 / var6;
                    }
                    if (var4 > 0) {
                        class74 var11 = var3.method885().method613(class100.field2316);
                        class99 var12 = class99.method779(var11, 100, var4);
                        var12.method781(class97.field2256[var1] - 1);
                        class98.field2293.method198(var12);
                    }
                    class80.field1947[var1] = -100;
                }
            } else {
                class146.field3436--;
                for (int var2 = var1; var2 < class146.field3436; var2++) {
                    class35.field834[var2] = class35.field834[var2 + 1];
                    class15.field367[var2] = class15.field367[var2 + 1];
                    class97.field2256[var2] = class97.field2256[var2 + 1];
                    class80.field1947[var2] = class80.field1947[var2 + 1];
                    class34.field816[var2] = class34.field816[var2 + 1];
                }
                var1--;
            }
        }
        if (class56.field1383 && !class6.method63(-34)) {
            if (class141.field3308 != 0 && client.field497 != -1) {
                class83.method645(class141.field3308, class31.field761, (byte) 87, false, 0, client.field497);
            }
            class56.field1383 = false;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I[B)V")
    public class88(int arg0, byte[] arg1) {
        this.field2079 = arg0;
        class128 var3 = new class128(arg1);
        this.field2095 = var3.method1025(255);
        this.field2094 = new int[this.field2095];
        this.field2090 = new int[this.field2095][];
        for (int var4 = 0; var4 < this.field2095; var4++) {
            this.field2094[var4] = var3.method1025(255);
        }
        for (int var5 = 0; var5 < this.field2095; var5++) {
            this.field2090[var5] = new int[var3.method1025(255)];
        }
        for (int var6 = 0; var6 < this.field2095; var6++) {
            for (int var7 = 0; var7 < this.field2090[var6].length; var7++) {
                this.field2090[var6][var7] = var3.method1025(255);
            }
        }
    }
}
