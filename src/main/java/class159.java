import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class159 {

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public int field2957 = -1;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
    private boolean field2949 = false;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public int field2958 = -1;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Z")
    public boolean field2961 = false;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public int field2963 = 2;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public int field2970 = -1;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public int field2965 = -1;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public int field2954 = 5;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public int field2969 = 99;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public int field2943 = -1;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lhj;")
    public static class69 field2955 = class181.method1318(" loggt sich ein)3", (byte) -107);

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Lhj;")
    public static class69 field2953 = class181.method1318("gr-Un:", (byte) -115);

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "[J")
    public static long[] field2959 = new long[100];

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "S")
    public static short field2944 = 256;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2952 = -2;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Lhj;")
    public static class69 field2966 = class181.method1318("W-=hlen Sie eine Option", (byte) -109);

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lhj;")
    public static class69 field2951 = class181.method1318(")2", (byte) -119);

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Lhj;")
    public static class69 field2972 = class181.method1318("Schlie-8en", (byte) -118);

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "J")
    public static long field2974 = 0L;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Lta;")
    public static class241 field2960 = new class241(200);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[I")
    public int[] field2941;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "[I")
    private int[] field2956;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "[I")
    public int[] field2962;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "[I")
    private int[] field2971;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[[I")
    public int[][] field2946;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lsf;BII)Lsf;")
    public final class92 method1193(class92 arg0, byte arg1, int arg2, int arg3) {
        int var5 = this.field2962[arg2];
        class151 var6 = class167.method1236(-88, var5 >> 16);
        field2947++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method662(true, true);
        }
        class92 var8 = arg0.method662(!var6.method1133(var7, -19747), !this.field2949);
        int var9 = arg3 & 0x3;
        if (var9 == 1) {
            var8.method655();
        } else if (var9 == 2) {
            var8.method656();
        } else if (var9 == 3) {
            var8.method653();
        }
        var8.method669(var6, var7, this.field2949);
        if (arg1 >= -2) {
            return null;
        }
        if (var9 == 1) {
            var8.method653();
        } else if (var9 == 2) {
            var8.method656();
        } else if (var9 == 3) {
            var8.method655();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method1194(int arg0) {
        field2972 = null;
        field2960 = null;
        field2966 = null;
        field2959 = null;
        field2955 = null;
        field2953 = null;
        if (arg0 > -34) {
            method1194(50);
        }
        field2951 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1195(int arg0, boolean arg1) {
        field2942++;
        if (!arg1) {
            method1195(-110, true);
        }
        return (arg0 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILfh;)V")
    public final void method1196(int arg0, class128 arg1) {
        field2948++;
        while (true) {
            int var3 = arg1.method937(false);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    method1194(1);
                    return;
                }
            }
            this.method1200(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method1197(int arg0) {
        field2950++;
        if (this.field2965 == -1) {
            if (this.field2971 == null) {
                this.field2965 = 0;
            } else {
                this.field2965 = 2;
            }
        }
        if (this.field2970 != arg0) {
            return;
        }
        if (this.field2971 == null) {
            this.field2970 = 0;
        } else {
            this.field2970 = 2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIILek;Lsf;)Lsf;")
    public final class92 method1198(int arg0, int arg1, int arg2, class159 arg3, class92 arg4) {
        int var6 = this.field2962[arg1];
        class151 var7 = class167.method1236(arg2 ^ 0xFFAC, var6 >> 16);
        field2940++;
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method1201(arg4, false, arg0);
        }
        int var9 = arg3.field2962[arg0];
        class151 var10 = class167.method1236(-103, var9 >> 16);
        int var11 = var9 & arg2;
        if (var10 == null) {
            class92 var12 = arg4.method662(!var7.method1133(var8, -19747), !this.field2949);
            var12.method669(var7, var8, this.field2949);
            return var12;
        } else {
            class92 var13 = arg4.method662(!var7.method1133(var8, -19747) & !var10.method1133(var11, -19747), !this.field2949 & !arg3.field2949);
            var13.method659(var7, var8, var10, var11, this.field2971, this.field2949 | arg3.field2949);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILsf;I)Lsf;")
    public final class92 method1199(int arg0, class92 arg1, int arg2) {
        int var4 = this.field2962[arg2];
        field2968++;
        class151 var5 = class167.method1236(90, var4 >> 16);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg1.method654(true, true);
        } else {
            class92 var7 = arg1.method654(!var5.method1133(var6, -19747), !this.field2949);
            var7.method669(var5, var6, this.field2949);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILfh;)V")
    private final void method1200(int arg0, int arg1, class128 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            int var13 = arg2.method912(arg1 - 112);
            this.field2941 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2941[var14] = arg2.method912(-128);
            }
            this.field2962 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2962[var15] = arg2.method912(-122);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2962[var16] = (arg2.method912(-124) << 16) + this.field2962[var16];
            }
        } else if (arg0 == 2) {
            this.field2943 = arg2.method912(42);
        } else if (arg0 == 3) {
            int var11 = arg2.method937(false);
            this.field2971 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2971[var12] = arg2.method937(false);
            }
            this.field2971[var11] = 9999999;
        } else if (arg0 == 4) {
            this.field2961 = true;
        } else if (arg0 == 5) {
            this.field2954 = arg2.method937(false);
        } else if (arg0 == 6) {
            this.field2957 = arg2.method912(arg1 ^ 0xFFFFFF81);
        } else if (arg0 == 7) {
            this.field2958 = arg2.method912(111);
        } else if (arg0 == 8) {
            this.field2969 = arg2.method937(false);
        } else if (arg0 == 9) {
            this.field2965 = arg2.method937(false);
        } else if (arg0 == 10) {
            this.field2970 = arg2.method937(false);
        } else if (arg0 == 11) {
            this.field2963 = arg2.method937(false);
        } else if (arg0 == 12) {
            int var4 = arg2.method937(false);
            this.field2956 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2956[var5] = arg2.method912(50);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2956[var6] = (arg2.method912(-126) << 16) + this.field2956[var6];
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method912(-79);
            this.field2946 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method937(false);
                if (var9 > 0) {
                    this.field2946[var8] = new int[var9];
                    this.field2946[var8][0] = arg2.method952((byte) -128);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field2946[var8][var10] = arg2.method912(66);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2949 = true;
        }
        field2967++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lsf;ZI)Lsf;")
    public final class92 method1201(class92 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1196(124, (class128) null);
        }
        field2964++;
        int var4 = this.field2962[arg2];
        class151 var5 = class167.method1236(-20, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method662(true, true);
        } else {
            class92 var7 = arg0.method662(!var5.method1133(var6, -19747), !this.field2949);
            var7.method669(var5, var6, this.field2949);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(ILsf;I)Lsf;")
    public final class92 method1202(int arg0, class92 arg1, int arg2) {
        field2973++;
        int var4 = this.field2962[arg2];
        class151 var5 = class167.method1236(-53, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method662(true, true);
        }
        int var7 = 0;
        class151 var8 = null;
        if (this.field2956 != null && this.field2956.length > arg2) {
            int var9 = this.field2956[arg2];
            var8 = class167.method1236(101, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        int var10 = 26 % ((arg0 - 62) / 58);
        if (var8 == null || var7 == 65535) {
            class92 var12 = arg1.method662(!var5.method1133(var6, -19747), !this.field2949);
            var12.method669(var5, var6, this.field2949);
            return var12;
        } else {
            class92 var11 = arg1.method662(!var5.method1133(var6, -19747) & !var8.method1133(var7, -19747), !this.field2949);
            var11.method669(var5, var6, this.field2949);
            var11.method669(var8, var7, this.field2949);
            return var11;
        }
    }
}
