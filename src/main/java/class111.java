import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class111 extends class151 {

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "[I")
    public int[] field2103;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "[Z")
    private boolean[] field2104;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "[[I")
    public int[][] field2114;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "[I")
    public static int[] field2097 = new int[500];

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lmb;")
    public static class132 field2099 = class166.method1092("Lade Sprites )2 ", 118);

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field2113 = 0;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lmb;")
    public static class132 field2109;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lii;")
    public static class96 field2101;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Z")
    public static boolean field2100;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "[[[I")
    public static int[][][] field2107;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lua;")
    public static final class215 method700(int arg0) {
        if (arg0 != -1024) {
            method701((byte) -63, null, -115, -34, null);
        }
        field2111++;
        if (class12.field157 == null) {
            class12.field157 = new class215();
        }
        return class12.field157;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLjava/awt/Component;IILhf;)Ln;")
    public static final class141 method701(byte arg0, Component arg1, int arg2, int arg3, class83 arg4) {
        field2116++;
        if (class96.field1728 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class141 var5 = (class141) Class.forName("ab").getDeclaredConstructor().newInstance();
                var5.field2651 = new int[(client.field533 ? 2 : 1) * 256];
                var5.field2657 = arg2;
                var5.method16(arg1);
                var5.field2669 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field2669 > 16384) {
                    var5.field2669 = 16384;
                }
                var5.method13(var5.field2669);
                if (class145.field2697 > 0 && class149.field2738 == null) {
                    class149.field2738 = new class194();
                    class149.field2738.field3604 = arg4;
                    arg4.method505(class149.field2738, class145.field2697, -4263);
                }
                if (class149.field2738 != null) {
                    if (class149.field2738.field3614[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class149.field2738.field3614[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class5 var6 = new class5(arg4, arg3);
                    if (arg0 != 36) {
                        method705(null, 113, null, -57);
                    }
                    var6.field2657 = arg2;
                    var6.field2651 = new int[(client.field533 ? 2 : 1) * 256];
                    var6.method16(arg1);
                    var6.field2669 = 16384;
                    var6.method13(var6.field2669);
                    if (class145.field2697 > 0 && class149.field2738 == null) {
                        class149.field2738 = new class194();
                        class149.field2738.field3604 = arg4;
                        arg4.method505(class149.field2738, class145.field2697, -4263);
                    }
                    if (class149.field2738 != null) {
                        if (class149.field2738.field3614[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class149.field2738.field3614[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class141();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B[Lmb;[SII)V")
    public static final void method702(byte arg0, class132[] arg1, short[] arg2, int arg3, int arg4) {
        field2110++;
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            class132 var6 = arg1[var5];
            arg1[var5] = arg1[arg3];
            int var7 = arg4;
            arg1[arg3] = var6;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var6 == null || arg1[var9] != null && arg1[var9].method871(var6, -1) < (var9 & 0x1)) {
                    class132 var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg1[arg3] = arg1[var7];
            arg1[var7] = var6;
            arg2[arg3] = arg2[var7];
            arg2[var7] = var8;
            method702((byte) -119, arg1, arg2, var7 - 1, arg4);
            method702((byte) 89, arg1, arg2, arg3, var7 + 1);
        }
        int var12 = 2 % ((arg0 + 42) / 60);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI)I")
    public static final int method703(int arg0, byte arg1, int arg2) {
        field2117++;
        class219 var3 = (class219) class231.field4166.method806(-1, (long) arg0);
        if (arg1 > -88) {
            field2109 = null;
        }
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field3998.length > arg2) {
            return var3.field3998[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZII)V")
    public static final void method704(int arg0, boolean arg1, int arg2, int arg3) {
        class96 var4 = class102.method631((byte) 72, arg0, arg3);
        if (arg1) {
            field2113 = 15;
        }
        field2096++;
        if (var4 != null && var4.field1841 != null) {
            class123 var5 = new class123();
            var5.field2299 = var4;
            var5.field2310 = var4.field1841;
            class155.method1010(var5, 200000);
        }
        class38.field621 = arg2;
        class231.field4172 = arg0;
        class166.field3033 = arg3;
        class10.field116 = true;
        class183.method1174(var4, 16235);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Loc;ILu;I)V")
    public static final void method705(class155 arg0, int arg1, class214 arg2, int arg3) {
        class231 var4 = new class231();
        var4.field4162 = arg0;
        field2108++;
        var4.field4161 = arg1;
        var4.field2760 = arg3;
        var4.field4160 = arg2;
        class19 var5 = class128.field2370;
        synchronized (class128.field2370) {
            class128.field2370.method120(0, var4);
        }
        class155.method1015(-21568);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I[B)V")
    public class111(int arg0, byte[] arg1) {
        this.field2112 = arg0;
        class112 var3 = new class112(arg1);
        this.field2098 = var3.method716(-1308);
        this.field2103 = new int[this.field2098];
        this.field2104 = new boolean[this.field2098];
        this.field2114 = new int[this.field2098][];
        for (int var4 = 0; var4 < this.field2098; var4++) {
            this.field2103[var4] = var3.method716(-1308);
        }
        for (int var5 = 0; var5 < this.field2098; var5++) {
            this.field2104[var5] = var3.method716(-1308) == 1;
        }
        for (int var6 = 0; var6 < this.field2098; var6++) {
            this.field2114[var6] = new int[var3.method716(-1308)];
        }
        for (int var7 = 0; var7 < this.field2098; var7++) {
            for (int var8 = 0; var8 < this.field2114[var7].length; var8++) {
                this.field2114[var7][var8] = var3.method716(-1308);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public static final void method706(int arg0, int arg1) {
        field2115++;
        class210.field3862 = -1;
        class157.field2858 = arg1;
        class196.field3641 = -1;
        class31.method222(110);
        if (arg0 != -14422) {
            method708(99);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(JB)V")
    public static final void method707(long arg0, byte arg1) {
        field2105++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < client.field537; var3++) {
            if (class137.field2575[var3] == arg0) {
                class39.field640++;
                client.field537--;
                for (int var4 = var3; var4 < client.field537; var4++) {
                    class68.field1136[var4] = class68.field1136[var4 + 1];
                    class39.field637[var4] = class39.field637[var4 + 1];
                    class88.field1542[var4] = class88.field1542[var4 + 1];
                    class137.field2575[var4] = class137.field2575[var4 + 1];
                    class60.field1019[var4] = class60.field1019[var4 + 1];
                }
                class113.field2183 = class13.field167;
                class64.field1054.method660(30, 3);
                class64.field1054.method709(-27341, arg0);
                break;
            }
        }
        if (arg1 > -24) {
            field2100 = false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static void method708(int arg0) {
        field2109 = null;
        field2097 = null;
        field2101 = null;
        if (arg0 >= -89) {
            method702((byte) 30, null, null, -43, -111);
        }
        field2099 = null;
        field2107 = null;
    }
}
