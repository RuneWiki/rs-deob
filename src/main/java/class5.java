import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class17 {

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lmb;")
    public static class84 field72 = null;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "[I")
    public static int[] field71 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Lmb;")
    public static class84 field73 = class79.method672(true, "Duell akzeptieren");

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Lmb;")
    private static class84 field85 = class79.method672(true, "skill)2");

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lmb;")
    public static class84 field77 = field85;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "[Lpa;")
    public static class101[] field95 = new class101[4];

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Ld;")
    public class22 field91;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Le;")
    public class29 field92;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "Lie;")
    public class61 field101;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "Lkb;")
    public class71 field87;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
    public static final void method28(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field71 = null;
        }
        field70++;
        if (class1.field3 == null) {
            return;
        }
        try {
            class51 var2 = new class51(4);
            var2.method393(arg0 ? 2 : 3, -17343);
            var2.method386(-29267, 0);
            class1.field3.method45(0, 4, (byte) 87, var2.field1084);
        } catch (IOException var4) {
            try {
                class1.field3.method38((byte) 61);
            } catch (Exception var3) {
            }
            class58.field1450++;
            class1.field3 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
    public static final void method29(byte arg0, int arg1, int arg2) {
        field89++;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 2) {
            method28(false, -97);
        }
        while (var4 < 100) {
            if (class74.field1792[var4] != null) {
                int var5 = class57.field1353 + 4 + 70 - var3 * 14;
                int var6 = class17.field377[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class84 var7 = class49.field1048[var4];
                if (var7 != null && var7.method703(class75.field1857, 0)) {
                    var7 = var7.method697(77, 5);
                }
                if (var7 != null && var7.method703(class24.field566, 0)) {
                    var7 = var7.method697(arg0 ^ 0x78, 5);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class88.field2214 == 0 || class88.field2214 == 1 && class88.method752(0, var7))) {
                    var3++;
                    if (var5 - 14 < arg2 && arg2 <= var5 && !var7.method720(-1, class40.field925.field1535)) {
                        client.field484++;
                        if (class102.field2478 >= 1) {
                            class129.method1051(0, 10, class51.method408(new class84[] { class51.field1093, var7 }, -99), 16711680, 0, 0, class49.field1053);
                            class93.field2318++;
                        }
                        class24.field550++;
                        class129.method1051(0, 46, class51.method408(new class84[] { class51.field1093, var7 }, 111), 16711680, 0, 0, class40.field916);
                        class129.method1051(0, 13, class51.method408(new class84[] { class51.field1093, var7 }, arg0 - 13), 16711680, 0, 0, client.field464);
                    }
                }
                if ((var6 == 3 || var6 == 7) && class118.field2827 == 0 && (var6 == 7 || class47.field1028 == 0 || class47.field1028 == 1 && class88.method752(arg0 - 2, var7))) {
                    var3++;
                    if (arg2 > var5 - 14 && arg2 <= var5) {
                        class24.field550++;
                        if (class102.field2478 >= 1) {
                            class93.field2318++;
                            class129.method1051(0, 10, class51.method408(new class84[] { class51.field1093, var7 }, arg0 + 104), arg0 ^ 0xFF0002, 0, 0, class49.field1053);
                        }
                        class129.method1051(0, 46, class51.method408(new class84[] { class51.field1093, var7 }, arg0 - 35), 16711680, 0, 0, class40.field916);
                        class129.method1051(0, 13, class51.method408(new class84[] { class51.field1093, var7 }, -75), 16711680, 0, 0, client.field464);
                        client.field484++;
                    }
                }
                if (var6 == 4 && (class87.field2176 == 0 || class87.field2176 == 1 && class88.method752(arg0 ^ 0x2, var7))) {
                    if (arg2 > var5 - 14 && var5 >= arg2) {
                        class129.method1051(0, 38, class51.method408(new class84[] { class51.field1093, var7 }, 3), arg0 + 16711678, 0, 0, class22.field516);
                        class72.field1770++;
                    }
                    var3++;
                }
                if ((var6 == 5 || var6 == 6) && class118.field2827 == 0 && class47.field1028 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class87.field2176 == 0 || class87.field2176 == 1 && class88.method752(0, var7))) {
                    if (arg2 > var5 - 14 && arg2 <= var5) {
                        class129.method1051(0, 9, class51.method408(new class84[] { class51.field1093, var7 }, -23), 16711680, 0, 0, class91.field2272);
                        class8.field149++;
                    }
                    var3++;
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lhb;ILmb;)I")
    public static final int method30(class51 arg0, int arg1, class84 arg2) {
        field78++;
        if (arg1 == 0) {
            int var3 = arg0.field1128;
            arg0.method404((byte) 69, arg2.field2062);
            arg0.field1128 += class63.field1556.method770(0, arg2.field2058, arg0.field1084, false, arg2.field2062, arg0.field1128);
            return arg0.field1128 - var3;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public final void method31(byte arg0) {
        this.field92 = null;
        this.field87 = null;
        field93++;
        this.field91 = null;
        this.field101 = null;
        if (arg0 < 37) {
            method29((byte) 75, 48, 94);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lsd;ZLsd;)I")
    public static final int method32(class122 arg0, boolean arg1, class122 arg2) {
        if (!arg1) {
            return 100;
        }
        field83++;
        int var3 = 0;
        if (arg0.method988((byte) 113, class52.field1171, class17.field366)) {
            var3++;
        }
        if (arg2.method988((byte) 117, class52.field1171, class8.field126)) {
            var3++;
        }
        if (arg2.method988((byte) 126, class52.field1171, class108.field2614)) {
            var3++;
        }
        if (arg2.method988((byte) 102, class52.field1171, class106.field2575)) {
            var3++;
        }
        if (arg2.method988((byte) 120, class52.field1171, client.field461)) {
            var3++;
        }
        if (arg2.method988((byte) 104, class52.field1171, class122.field2950)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[BIZ)I")
    public static final int method33(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field75++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class40.field923[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        if (arg3) {
            method32(null, true, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public static void method34(byte arg0) {
        field73 = null;
        field85 = null;
        if (arg0 != -107) {
            method29((byte) -36, -107, 117);
        }
        field95 = null;
        field77 = null;
        field72 = null;
        field71 = null;
    }
}
