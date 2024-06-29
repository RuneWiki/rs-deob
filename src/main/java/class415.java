import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class415 {

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field5913 = 5;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field5909 = -1;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field5910 = -1;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Z")
    public boolean field5907 = false;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public int field5923 = -1;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public int field5922 = 99;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Z")
    public boolean field5916 = false;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Z")
    public boolean field5914 = false;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Z")
    public boolean field5908 = false;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public int field5929 = -1;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public int field5925 = -1;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public int field5931 = 2;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[I")
    public static int[] field5918 = new int[32];

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field5926 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field5901;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lin;")
    public class60 field5905;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
    private int[] field5902;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "[I")
    public int[] field5915;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "[I")
    public int[] field5927;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[Z")
    public boolean[] field5906;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[[I")
    public int[][] field5903;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lug;IIBII)Lnq;", line = 7)
    public static final class322 method2448(class395 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5917++;
        if (arg3 != 6) {
            return null;
        } else if (!arg0.field5591 && (!class351.method2014(10, arg1) || !class351.method2014(arg3 + 4, arg5))) {
            return arg0.field5624 ? new class322(arg0, 34037, arg4, arg2, arg1, arg5, true) : new class322(arg0, arg4, arg2, arg1, arg5, class60.method550(106, arg1), class60.method550(arg3 ^ 0x68, arg5), true);
        } else {
            return new class322(arg0, 3553, arg4, arg2, arg1, arg5, true);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V", line = 28)
    public static final void method2449(byte arg0, int arg1) {
        class344.field4411 = arg1;
        field5921++;
        if (arg0 == -11) {
            class290.field3702.method2642(0);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILt;IIII)Lt;", line = 42)
    public final class474 method2450(int arg0, class474 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5919++;
        int var7 = this.field5915[arg4];
        int var8 = this.field5927[arg4];
        class513 var9 = this.field5905.method551(var8 >> 16, 23968);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method416((byte) 1, arg5, true);
        }
        class513 var11 = null;
        if (arg3 != 1024) {
            this.method2458(-105);
        }
        if ((this.field5916 || class279.field3533) && arg0 != -1 && arg0 < this.field5927.length) {
            int var12 = this.field5927[arg0];
            var11 = this.field5905.method551(var12 >> 16, arg3 ^ 0x59A0);
            arg0 = var12 & 0xFFFF;
        }
        class513 var13 = null;
        class513 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field5902 != null) {
            if (this.field5902.length > arg4) {
                var15 = this.field5902[arg4];
                if (var15 != 65535) {
                    var13 = this.field5905.method551(var15 >> 16, arg3 ^ 0x59A0);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5916 || class279.field3533) && arg0 != -1 && this.field5902.length > arg0) {
                var16 = this.field5902[arg0];
                if (var16 != 65535) {
                    var14 = this.field5905.method551(var16 >> 16, 23968);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field5914) {
            arg5 |= 0x200;
        }
        if (var9.method3066(var10, (byte) 35)) {
            arg5 |= 0x80;
        }
        if (var9.method3064(arg3 ^ 0xFFFFFB9D, var10)) {
            arg5 |= 0x100;
        }
        if (var9.method3063(-12216, var10)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3066(var15, (byte) 35)) {
                arg5 |= 0x80;
            }
            if (var13.method3064(-114, var15)) {
                arg5 |= 0x100;
            }
            if (var13.method3063(-12216, var15)) {
                arg5 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3066(arg0, (byte) 35)) {
                arg5 |= 0x80;
            }
            if (var11.method3064(-101, arg0)) {
                arg5 |= 0x100;
            }
            if (var11.method3063(arg3 ^ 0xFFFFD448, arg0)) {
                arg5 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3066(var16, (byte) 35)) {
                arg5 |= 0x80;
            }
            if (var14.method3064(-121, var16)) {
                arg5 |= 0x100;
            }
            if (var14.method3063(-12216, var16)) {
                arg5 |= 0x400;
            }
        }
        int var17 = arg5 | 0x20;
        class474 var18 = arg1.method416((byte) 1, var17, true);
        var18.method2855(this.field5914, var9, arg2 - 1, 65535, var11, arg0, 0, var10, var7);
        if (var13 != null) {
            var18.method2855(this.field5914, var13, arg2 - 1, 65535, var14, var16, 0, var15, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 180)
    public static final void method2451(int arg0) {
        field5930++;
        class494 var1 = (class494) class53.field706.method153(0);
        boolean var2 = class233.field2985 != null || class446.field6396 > 0;
        int var3 = -17 % ((arg0 - 31) / 58);
        if (var2) {
            class165.field2105 = 1;
        }
        if (class56.field744 && class343.field4392.method834(false, 81) && class2.field24 > 2) {
            if (var2) {
                class533.field7844 = (class520) class201.field2616.field268.field5047.field5047;
            } else {
                class249.method1510((class520) class201.field2616.field268.field5047.field5047, var1.method2151(-108), (byte) 2, var1.method2155((byte) -62));
            }
        } else if (var2) {
            class533.field7844 = (class520) class201.field2616.field268.field5047;
        } else {
            class249.method1510((class520) class201.field2616.field268.field5047, var1.method2151(-99), (byte) 2, var1.method2155((byte) -125));
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)I", line = 229)
    public static final int method2452(int arg0, int arg1, byte arg2) {
        int var3 = 114 % ((arg2 + 3) / 45);
        field5924++;
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILfh;)V", line = 255)
    public final void method2453(int arg0, class463 arg1) {
        field5911++;
        if (arg0 != -1) {
            this.field5923 = 118;
        }
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                return;
            }
            this.method2454(-7, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILfh;I)V", line = 278)
    private final void method2454(int arg0, class463 arg1, int arg2) {
        field5900++;
        if (arg0 != -7) {
            return;
        }
        if (arg2 == 1) {
            int var13 = arg1.method2758((byte) 113);
            this.field5915 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5915[var14] = arg1.method2758((byte) 96);
            }
            this.field5927 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field5927[var15] = arg1.method2758((byte) 77);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field5927[var16] = (arg1.method2758((byte) 76) << 16) + this.field5927[var16];
            }
        } else if (arg2 == 2) {
            this.field5909 = arg1.method2758((byte) 78);
        } else if (arg2 == 3) {
            this.field5906 = new boolean[256];
            int var4 = arg1.method2737(false);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5906[arg1.method2737(false)] = true;
            }
        } else if (arg2 == 4) {
            this.field5908 = true;
        } else if (arg2 == 5) {
            this.field5913 = arg1.method2737(false);
        } else if (arg2 == 6) {
            this.field5923 = arg1.method2758((byte) 105);
        } else if (arg2 == 7) {
            this.field5910 = arg1.method2758((byte) 125);
        } else if (arg2 == 8) {
            this.field5922 = arg1.method2737(false);
        } else if (arg2 == 9) {
            this.field5929 = arg1.method2737(false);
        } else if (arg2 == 10) {
            this.field5925 = arg1.method2737(false);
        } else if (arg2 == 11) {
            this.field5931 = arg1.method2737(false);
        } else if (arg2 == 12) {
            int var10 = arg1.method2737(false);
            this.field5902 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field5902[var11] = arg1.method2758((byte) 84);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field5902[var12] = (arg1.method2758((byte) 125) << 16) + this.field5902[var12];
            }
        } else if (arg2 == 13) {
            int var6 = arg1.method2758((byte) 115);
            this.field5903 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method2737(false);
                if (var8 > 0) {
                    this.field5903[var7] = new int[var8];
                    this.field5903[var7][0] = arg1.method2738(-100);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field5903[var7][var9] = arg1.method2758((byte) 123);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field5914 = true;
            return;
        } else if (arg2 == 15) {
            this.field5916 = true;
            return;
        } else if (arg2 == 16) {
            this.field5907 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIII)I", line = 436)
    public final int method2455(boolean arg0, int arg1, int arg2, int arg3) {
        field5920++;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 128) {
            this.field5907 = true;
        }
        int var7 = this.field5927[arg2];
        class513 var8 = null;
        class513 var9 = this.field5905.method551(var7 >> 16, 23968);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field5916 || class279.field3533) && arg3 != -1 && this.field5927.length > arg3) {
            int var11 = this.field5927[arg3];
            var8 = this.field5905.method551(var11 >> 16, arg1 + 23840);
            var6 = var11 & 0xFFFF;
        }
        if (this.field5914) {
            var5 |= 0x200;
        }
        if (var9.method3066(var10, (byte) 35)) {
            var5 |= 0x80;
        }
        if (var9.method3064(arg1 - 194, var10)) {
            var5 |= 0x100;
        }
        if (var9.method3063(-12216, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3066(var6, (byte) 35)) {
                var5 |= 0x80;
            }
            if (var8.method3064(arg1 - 189, var6)) {
                var5 |= 0x100;
            }
            if (var8.method3063(arg1 - 12344, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field5902 != null && arg0) {
            if (arg2 < this.field5902.length) {
                int var12 = this.field5902[arg2];
                if (var12 != 65535) {
                    class513 var13 = this.field5905.method551(var12 >> 16, arg1 ^ 0x5D20);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3066(var14, (byte) 35)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3064(arg1 ^ 0xFFFFFF0D, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3063(-12216, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field5916 || class279.field3533) && arg3 != -1 && this.field5902.length > arg3) {
                int var15 = this.field5902[arg3];
                if (var15 != 65535) {
                    class513 var16 = this.field5905.method551(var15 >> 16, arg1 ^ 0x5D20);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3066(var17, (byte) 35)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3064(-75, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3063(-12216, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 564)
    public static void method2456(byte arg0) {
        field5918 = null;
        if (arg0 != -18) {
            method2456((byte) -44);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BIIBIIILt;)Lt;", line = 596)
    public final class474 method2457(byte arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class474 arg7) {
        int var9 = 87 % ((-arg0 - 35) / 32);
        field5904++;
        int var10 = this.field5915[arg5];
        int var11 = this.field5927[arg5];
        class513 var12 = this.field5905.method551(var11 >> 16, 23968);
        int var13 = var11 & 0xFFFF;
        if (var12 == null) {
            return arg7.method416(arg3, arg2, true);
        }
        class513 var14 = null;
        if ((this.field5916 || class279.field3533) && arg4 != -1 && this.field5927.length > arg4) {
            int var15 = this.field5927[arg4];
            var14 = this.field5905.method551(var15 >> 16, 23968);
            arg4 = var15 & 0xFFFF;
        }
        if (this.field5914) {
            arg2 |= 0x200;
        }
        if (var12.method3066(var13, (byte) 35)) {
            arg2 |= 0x80;
        }
        if (var12.method3064(-88, var13)) {
            arg2 |= 0x100;
        }
        if (var12.method3063(-12216, var13)) {
            arg2 |= 0x400;
        }
        if (var14 != null) {
            if (var14.method3066(arg4, (byte) 35)) {
                arg2 |= 0x80;
            }
            if (var14.method3064(-93, arg4)) {
                arg2 |= 0x100;
            }
            if (var14.method3063(-12216, arg4)) {
                arg2 |= 0x400;
            }
        }
        int var16 = arg2 | 0x20;
        class474 var17 = arg7.method416(arg3, var16, true);
        var17.method2855(this.field5914, var12, arg6 - 1, 65535, var14, arg4, arg1, var13, var10);
        return var17;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 659)
    public final void method2458(int arg0) {
        if (arg0 != 2038) {
            this.field5902 = null;
        }
        if (this.field5925 == -1) {
            if (this.field5906 == null) {
                this.field5925 = 0;
            } else {
                this.field5925 = 2;
            }
        }
        field5928++;
        if (this.field5929 != -1) {
            return;
        }
        if (this.field5906 == null) {
            this.field5929 = 0;
        } else {
            this.field5929 = 2;
        }
    }
}
