import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class54 {

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Llc;")
    private class122 field909 = new class122(256);

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Llc;")
    private class122 field922 = new class122(256);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lpb;")
    private class165 field906;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Lpb;")
    private class165 field915;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lmb;")
    public static class132 field910 = class166.method1092("<col=80ff00>", 127);

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lmb;")
    public static class132 field919 = class166.method1092("bevor Sie den Vorgang wiederholen)3", 114);

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Lmb;")
    public static class132 field921 = class166.method1092("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 125);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([IIB)Lqc;")
    public final class177 method365(int[] arg0, int arg1, byte arg2) {
        field916++;
        if (this.field906.method1084(104) == 1) {
            return this.method373(arg1, 0, arg0, (byte) 107);
        } else if (this.field906.method1068(arg1, arg2 + 91) == 1) {
            return this.method373(0, arg1, arg0, (byte) 107);
        } else {
            if (arg2 != -91) {
                method367(null, null, -71, null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[IIB)Lqc;")
    private final class177 method366(int arg0, int[] arg1, int arg2, byte arg3) {
        field911++;
        int var5 = ((arg0 & 0xFFF) << 4 | arg0 >>> 12) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class177 var9 = (class177) this.field922.method806(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class197 var10 = (class197) this.field909.method806(arg3 ^ 0x2F, var7);
            if (var10 == null) {
                var10 = class197.method1253(this.field915, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field909.method810(var10, var7, arg3 - 18226);
            }
            class177 var11 = var10.method1250(arg1);
            if (var11 == null) {
                return null;
            }
            if (arg3 != -48) {
                method368(95, -74, 14, 79, -73, -58, 54);
            }
            var10.method995((byte) -32);
            this.field922.method810(var11, var7, -18274);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lmb;Lmb;ILpb;)Lvi;")
    public static final class233 method367(class132 arg0, class132 arg1, int arg2, class165 arg3) {
        field917++;
        if (arg2 != 1024) {
            method370((byte) 79, null);
        }
        int var4 = arg3.method1065(arg0, -1);
        int var5 = arg3.method1090(-1, arg1, var4);
        return class10.method51(var5, var4, arg3, (byte) -114);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIII)V")
    public static final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field920++;
        int var7 = arg4 + arg6;
        int var8 = arg2 - arg6;
        int var9 = arg5 + arg6;
        int var10 = arg1 - arg6;
        for (int var11 = arg4; var11 < var7; var11++) {
            class23.method153(arg3, class61.field1033[var11], true, arg5, arg1);
        }
        if (arg0 >= -12) {
            method368(-82, 84, -20, -95, 73, 2, 107);
        }
        for (int var12 = arg2; var12 > var8; var12--) {
            class23.method153(arg3, class61.field1033[var12], true, arg5, arg1);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class61.field1033[var13];
            class23.method153(arg3, var14, true, arg5, var9);
            class23.method153(arg3, var14, true, var10, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB[I)Lqc;")
    public final class177 method369(int arg0, byte arg1, int[] arg2) {
        field913++;
        if (this.field915.method1084(17) == 1) {
            return this.method366(0, arg2, arg0, (byte) -48);
        } else if (this.field915.method1068(arg0, 0) == 1) {
            return this.method366(arg0, arg2, 0, (byte) -48);
        } else {
            if (arg1 != -51) {
                this.field915 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLdh;)V")
    public static final void method370(byte arg0, class42 arg1) {
        if (arg0 != 115) {
            return;
        }
        field914++;
        if (class30.field460 == arg1.field741 || arg1.field695 == -1 || arg1.field713 != 0 || arg1.field688 + 1 > class99.method619(arg1.field695, 4).field4253[arg1.field699]) {
            int var2 = arg1.field741 - arg1.field704;
            int var3 = class30.field460 - arg1.field704;
            int var4 = arg1.field714 * 128 + arg1.field679 * 64;
            int var5 = arg1.field679 * 64 + arg1.field678 * 128;
            int var6 = arg1.field691 * 128 + arg1.field679 * 64;
            int var7 = arg1.field692 * 128 + arg1.field679 * 64;
            arg1.field673 = ((var2 - var3) * var4 + var3 * var7) / var2;
            arg1.field723 = ((var2 - var3) * var5 + var3 * var6) / var2;
        }
        arg1.field722 = 0;
        if (arg1.field694 == 0) {
            arg1.field739 = 1024;
        }
        if (arg1.field694 == 1) {
            arg1.field739 = 1536;
        }
        if (arg1.field694 == 2) {
            arg1.field739 = 0;
        }
        if (arg1.field694 == 3) {
            arg1.field739 = 512;
        }
        arg1.field707 = arg1.field739;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)V")
    public static final void method371(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 86 % ((-arg3 - 73) / 49);
        field912++;
        int var6 = arg0;
        int var7 = 0;
        int var8 = -arg0;
        int var9 = -1;
        int var10 = class159.method1034(arg1 + arg0, (byte) 111, class135.field2542, class168.field3083);
        int var11 = class159.method1034(arg1 - arg0, (byte) 119, class135.field2542, class168.field3083);
        class23.method153(arg4, class61.field1033[arg2], true, var11, var10);
        while (var6 > var7) {
            var9 += 2;
            var8 += var9;
            if (var8 > 0) {
                var6--;
                var8 -= var6 << 1;
                int var12 = arg2 - var6;
                int var13 = arg2 + var6;
                if (var13 >= class169.field3161 && var12 <= class17.field254) {
                    int var14 = class159.method1034(arg1 + var7, (byte) 28, class135.field2542, class168.field3083);
                    int var15 = class159.method1034(arg1 - var7, (byte) 77, class135.field2542, class168.field3083);
                    if (var13 <= class17.field254) {
                        class23.method153(arg4, class61.field1033[var13], true, var15, var14);
                    }
                    if (var12 >= class169.field3161) {
                        class23.method153(arg4, class61.field1033[var12], true, var15, var14);
                    }
                }
            }
            var7++;
            int var16 = arg2 + var7;
            int var17 = arg2 - var7;
            if (class169.field3161 <= var16 && var17 <= class17.field254) {
                int var18 = class159.method1034(arg1 + var6, (byte) 55, class135.field2542, class168.field3083);
                int var19 = class159.method1034(arg1 - var6, (byte) 18, class135.field2542, class168.field3083);
                if (var16 <= class17.field254) {
                    class23.method153(arg4, class61.field1033[var16], true, var19, var18);
                }
                if (var17 >= class169.field3161) {
                    class23.method153(arg4, class61.field1033[var17], true, var19, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method372(byte arg0) {
        int var1 = -119 % ((arg0 - 81) / 43);
        field910 = null;
        field921 = null;
        field919 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II[IB)Lqc;")
    private final class177 method373(int arg0, int arg1, int[] arg2, byte arg3) {
        field908++;
        int var5 = arg0 ^ (arg1 << 4 & 0xFFF9 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class177 var9 = (class177) this.field922.method806(-1, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg3 != 107) {
            field918 = 99;
        }
        if (arg2 != null && arg2[0] <= 0) {
            return null;
        }
        class51 var10 = class51.method348(this.field906, arg1, arg0);
        if (var10 == null) {
            return null;
        }
        class177 var11 = var10.method349();
        this.field922.method810(var11, var7, arg3 ^ 0xFFFFB8F5);
        if (arg2 != null) {
            arg2[0] -= var11.field3271.length;
        }
        return var11;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lpb;Lpb;)V")
    public class54(class165 arg0, class165 arg1) {
        this.field906 = arg0;
        this.field915 = arg1;
    }
}
