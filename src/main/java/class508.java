import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class508 extends InputStream {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[J")
    public static long[] field7066 = new long[11];

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "[[J")
    public static long[][] field7065 = new long[8][256];

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lej;")
    public static class124 field7067;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Lmu;")
    public static class303 field7069;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field7064;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field7065[0][var0] = class39.method477(var14, class39.method477(var6 << 8, class39.method477(var10 << 16, class39.method477(var12 << 24, class39.method477(var4 << 32, class39.method477(class39.method477(var4 << 56, var4 << 48), var8 << 40))))));
            for (int var16 = 1; var16 < 8; var16++) {
                field7065[var16][var0] = class39.method477(field7065[var16 - 1][var0] >>> 8, field7065[var16 - 1][var0] << 56);
            }
        }
        field7066[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field7066[var1] = class557.method3203(class557.method3203(class272.method1799(field7065[6][var2 + 6], 65280L), class557.method3203(class272.method1799(field7065[5][var2 + 5], 16711680L), class557.method3203(class557.method3203(class557.method3203(class272.method1799(field7065[2][var2 + 2], 280375465082880L), class557.method3203(class272.method1799(71776119061217280L, field7065[1][var2 + 1]), class272.method1799(field7065[0][var2], -72057594037927936L))), class272.method1799(1095216660480L, field7065[3][var2 + 3])), class272.method1799(field7065[4][var2 + 4], 4278190080L)))), class272.method1799(field7065[7][var2 + 7], 255L));
        }
        field7067 = new class124(8, 1);
        field7068 = 0;
        field7069 = new class303(75, 6);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 3)
    public static void method2983(int arg0) {
        field7065 = null;
        if (arg0 == 2) {
            field7067 = null;
            field7066 = null;
            field7069 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIILqfa;B)Z", line = 17)
    public static final boolean method2984(int arg0, int arg1, int arg2, class100 arg3, byte arg4) {
        field7062++;
        if (!class728.field9848 || !class151.field2492) {
            return false;
        } else if (class399.field5890 < 100) {
            return false;
        } else if (class393.method2471(arg2, arg1, (byte) -97, arg0)) {
            int var5 = arg1 << class130.field2185;
            int var6 = arg0 << class130.field2185;
            if (arg4 != 120) {
                return false;
            }
            int var7 = class683.field9250[arg2].method1851((byte) -86, arg0, arg1) - 1;
            int var8 = var7 + arg3.method38(true);
            if (arg3.field1800 == 1) {
                if (!class87.method829(var5, var5, var6, var5, class1.field3 + var6, var8, var8, var7, var6, false)) {
                    return false;
                } else if (class87.method829(var5, var5, var6, var5, class1.field3 + var6, var7, var8, var7, class1.field3 + var6, false)) {
                    class553.field7607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1800 == 2) {
                if (!class87.method829(var5, var5 + class1.field3, var6 - -class1.field3, var5, class1.field3 + var6, var8, var8, var7, var6 + class1.field3, false)) {
                    return false;
                } else if (class87.method829(var5, class1.field3 + var5, class1.field3 + var6, class1.field3 + var5, class1.field3 + var6, var8, var7, var7, var6 + class1.field3, false)) {
                    class553.field7607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1800 == 4) {
                if (!class87.method829(class1.field3 + var5, class1.field3 + var5, var6, class1.field3 + var5, var6 - -class1.field3, var8, var8, var7, var6, false)) {
                    return false;
                } else if (class87.method829(class1.field3 + var5, var5 - -class1.field3, var6, class1.field3 + var5, var6 - -class1.field3, var7, var8, var7, class1.field3 + var6, false)) {
                    class553.field7607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1800 == 8) {
                if (!class87.method829(var5, class1.field3 + var5, var6, var5, var6, var8, var8, var7, var6, false)) {
                    return false;
                } else if (class87.method829(var5, class1.field3 + var5, var6, class1.field3 + var5, var6, var8, var7, var7, var6, false)) {
                    class553.field7607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1800 == 16) {
                if (class343.method2166(var8, class72.field1328, class72.field1328 + var6, var5, var7, class72.field1328, 18507)) {
                    class553.field7607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1800 == 32) {
                if (class343.method2166(var8, class72.field1328, class72.field1328 + var6, class72.field1328 + var5, var7, class72.field1328, 18507)) {
                    class553.field7607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1800 == 64) {
                if (class343.method2166(var8, class72.field1328, var6, class72.field1328 + var5, var7, class72.field1328, 18507)) {
                    class553.field7607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field1800 != 128) {
                return true;
            } else if (class343.method2166(var8, class72.field1328, var6, var5, var7, class72.field1328, 18507)) {
                class553.field7607++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "read", descriptor = "()I", line = 146)
    public final int read() {
        field7064++;
        class700.method3916((byte) 31, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 160)
    public static final void method2985(int arg0) {
        class390.method2454();
        field7063++;
        for (int var1 = 0; var1 < 4; var1++) {
            class19.field295[var1].method3298(700);
        }
        if (arg0 != -16203) {
            method2984(125, -95, 109, null, (byte) -52);
        }
        class748.method4175(-1);
        class340.method2149((byte) 98);
        class640.method3632(28);
        System.gc();
        class272.field3822.method324();
    }
}
