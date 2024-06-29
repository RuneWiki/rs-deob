import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class131 extends class279 {

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Z")
    public static boolean field2163 = true;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "[I")
    public static int[] field2164 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Ltl;")
    public static class59 field2165 = class85.method639("Konfig geladen)3", 9588);

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "J")
    public static long field2167 = 0L;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "Loj;")
    public static class260 field2168;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[Lsb;")
    public static class165[] field2171;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "[[[B")
    public static byte[][][] field2169;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)I", line = 15)
    private final int method961(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method963(47, -117, -18);
        }
        field2162++;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V", line = 30)
    public static void method962(int arg0) {
        if (arg0 != 0) {
            field2171 = (class165[]) null;
        }
        field2168 = null;
        field2164 = null;
        field2169 = (byte[][][]) null;
        field2165 = null;
        field2171 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)[I", line = 47)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            return (int[]) null;
        }
        if (this.field4781.field354) {
            int var4 = class71.field1104[arg1];
            for (int var5 = 0; var5 < class56.field835; var5++) {
                var3[var5] = this.method961(class31.field430[var5], var4, 1) % 4096;
            }
        }
        field2161++;
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 79)
    public class131() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(III)V", line = 83)
    public static final void method963(int arg0, int arg1, int arg2) {
        if (arg2 == 4 && !class193.field3216) {
            arg2 = 2;
            arg1 = 2;
        }
        field2166++;
        if (arg0 != -12390) {
            field2164 = (int[]) null;
        }
        if (class111.field1813 != arg2) {
            if (class14.field199) {
                return;
            }
            if (class111.field1813 != 0) {
                class275.field4729[class111.field1813].method12();
            }
            if (arg2 != 0) {
                class203 var3 = class275.field4729[arg2];
                var3.method13();
                var3.method11(arg1);
            }
            class108.field1805 = arg1;
            class111.field1813 = arg2;
        } else if (arg2 != 0 && class108.field1805 != arg1) {
            class275.field4729[arg2].method11(arg1);
            class108.field1805 = arg1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ls;I)V", line = 140)
    public static final void method964(class170 arg0, int arg1) {
        field2172++;
        int var2 = 121 % ((12 - arg1) / 46);
        while (true) {
            while (arg0.field2787 < arg0.field2758.length) {
                int var3 = 0;
                boolean var4 = false;
                int var5 = 0;
                if (arg0.method1221(89) == 1) {
                    var3 = arg0.method1221(93);
                    var4 = true;
                    var5 = arg0.method1221(108);
                }
                int var6 = arg0.method1221(120);
                int var7 = arg0.method1221(83);
                int var8 = class216.field3532 - (var7 * 64 + 1 - class155.field2540);
                int var9 = var6 * 64 - class140.field2304;
                if (var9 >= 0 && var8 - 63 >= 0 && (var9 + 63) < class62.field966 && var8 < class216.field3532) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var4 || var3 * 8 <= var12 && (var3 * 8 + 8) > var12 && (var5 * 8) <= var13 && var13 < (var5 * 8 + 8)) {
                                byte var14 = arg0.method1205(-1);
                                if (var14 != 0) {
                                    if (field2169[var10][var11] == null) {
                                        field2169[var10][var11] = new byte[4096];
                                    }
                                    field2169[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method1205(-1);
                                    if (class183.field3062[var10][var11] == null) {
                                        class183.field3062[var10][var11] = new byte[4096];
                                    }
                                    class183.field3062[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var4 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method1205(-1);
                        if (var17 != 0) {
                            arg0.field2787++;
                        }
                    }
                }
            }
            return;
        }
    }
}
