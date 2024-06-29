import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class209 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Z")
    public boolean field2895 = false;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field2896 = -1;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public int field2906 = 5;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Z")
    public boolean field2909 = false;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field2901 = -1;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Z")
    public boolean field2911 = false;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public int field2910 = 99;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public int field2916 = -1;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Z")
    public boolean field2913 = false;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field2905 = -1;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public int field2912 = -1;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public int field2917 = 2;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
    public static int[] field2891 = new int[1024];

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[[I")
    public static int[][] field2898 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lrk;")
    public static class427 field2904;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
    public int[] field2894;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
    private int[] field2907;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "[I")
    public int[] field2915;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[Z")
    public boolean[] field2897;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "[[I")
    public int[][] field2908;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILap;I)V", line = 29)
    private final void method1437(int arg0, class289 arg1, int arg2) {
        field2919++;
        if (arg0 == arg2) {
            int var13 = arg1.method1853(-26);
            this.field2894 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2894[var14] = arg1.method1853(109);
            }
            this.field2915 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2915[var15] = arg1.method1853(-21);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2915[var16] = (arg1.method1853(arg2 - 99) << 16) + this.field2915[var16];
            }
        } else if (arg0 == 2) {
            this.field2896 = arg1.method1853(-25);
        } else if (arg0 == 3) {
            this.field2897 = new boolean[256];
            int var4 = arg1.method1861((byte) -72);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2897[arg1.method1861((byte) -72)] = true;
            }
        } else if (arg0 == 4) {
            this.field2913 = true;
        } else if (arg0 == 5) {
            this.field2906 = arg1.method1861((byte) -72);
        } else if (arg0 == 6) {
            this.field2905 = arg1.method1853(114);
        } else if (arg0 == 7) {
            this.field2916 = arg1.method1853(-113);
        } else if (arg0 == 8) {
            this.field2910 = arg1.method1861((byte) -72);
        } else if (arg0 == 9) {
            this.field2912 = arg1.method1861((byte) -72);
        } else if (arg0 == 10) {
            this.field2901 = arg1.method1861((byte) -72);
        } else if (arg0 == 11) {
            this.field2917 = arg1.method1861((byte) -72);
        } else if (arg0 == 12) {
            int var10 = arg1.method1861((byte) -72);
            this.field2907 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2907[var11] = arg1.method1853(-75);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2907[var12] += arg1.method1853(arg2 + 119) << 16;
            }
        } else if (arg0 == 13) {
            int var6 = arg1.method1853(arg2 ^ 0xFFFFFFC4);
            this.field2908 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1861((byte) -72);
                if (var8 > 0) {
                    this.field2908[var7] = new int[var8];
                    this.field2908[var7][0] = arg1.method1880((byte) 66);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field2908[var7][var9] = arg1.method1853(111);
                    }
                }
            }
            return;
        } else if (arg0 == 14) {
            this.field2911 = true;
            return;
        } else if (arg0 == 15) {
            this.field2909 = true;
            return;
        } else if (arg0 == 16) {
            this.field2895 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIB)I", line = 185)
    public final int method1438(int arg0, boolean arg1, int arg2, byte arg3) {
        field2899++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2915[arg0];
        class61 var8 = null;
        class61 var9 = class166.method1254((byte) -127, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        } else if (arg3 > -43) {
            return 1;
        } else {
            if ((this.field2909 || class258.field3486) && arg2 != -1 && this.field2915.length > arg2) {
                int var11 = this.field2915[arg2];
                var8 = class166.method1254((byte) -127, var11 >> 16);
                var6 = var11 & 0xFFFF;
            }
            if (this.field2911) {
                var5 |= 0x200;
            }
            if (var9.method546(var10, (byte) 124)) {
                var5 |= 0x80;
            }
            if (var9.method551(0, var10)) {
                var5 |= 0x100;
            }
            if (var8 != null) {
                if (var8.method546(var6, (byte) 94)) {
                    var5 |= 0x80;
                }
                if (var8.method551(0, var6)) {
                    var5 |= 0x100;
                }
            }
            if (this.field2907 != null && arg1) {
                if (this.field2907.length > arg0) {
                    int var12 = this.field2907[arg0];
                    if (var12 != 65535) {
                        class61 var13 = class166.method1254((byte) -127, var12 >> 16);
                        int var14 = var12 & 0xFFFF;
                        if (var13 != null) {
                            if (var13.method546(var14, (byte) 124)) {
                                var5 |= 0x80;
                            }
                            if (var13.method551(0, var14)) {
                                var5 |= 0x100;
                            }
                        }
                    }
                }
                if ((this.field2909 || class258.field3486) && arg2 != -1 && this.field2907.length > arg2) {
                    int var15 = this.field2907[arg2];
                    if (var15 != 65535) {
                        class61 var16 = class166.method1254((byte) -127, var15 >> 16);
                        int var17 = var15 & 0xFFFF;
                        if (var16 != null) {
                            if (var16.method546(var17, (byte) 106)) {
                                var5 |= 0x80;
                            }
                            if (var16.method551(0, var17)) {
                                var5 |= 0x100;
                            }
                        }
                    }
                }
            }
            return var5 | 0x20;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V", line = 307)
    public static final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= class39.field595 && arg4 <= class134.field1917) {
            int var5 = class359.method2251(class69.field1047, arg1, 91, class433.field6144);
            int var6 = class359.method2251(class69.field1047, arg3, -98, class433.field6144);
            class77.method659(arg0, arg4, -13935, var6, var5);
        }
        field2892++;
        int var7 = -119 % ((49 - arg2) / 60);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIIIIIILsj;)Lsj;", line = 323)
    public final class73 method1440(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class73 arg7) {
        field2902++;
        int var9 = this.field2894[arg1];
        int var10 = this.field2915[arg1];
        class61 var11 = class166.method1254((byte) -127, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method440((byte) 1, arg6, true);
        }
        class61 var13 = null;
        if ((this.field2909 || class258.field3486) && arg2 != -1 && arg2 < this.field2915.length) {
            int var14 = this.field2915[arg2];
            var13 = class166.method1254((byte) -127, var14 >> 16);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field2911) {
            arg6 |= 0x200;
        }
        if (var11.method546(var12, (byte) 122)) {
            arg6 |= 0x80;
        }
        if (var11.method551(0, var12)) {
            arg6 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method546(arg2, (byte) 115)) {
                arg6 |= 0x80;
            }
            if (var13.method551(0, arg2)) {
                arg6 |= 0x100;
            }
        }
        int var15 = arg6 | 0x20;
        if (arg3 != -593) {
            this.field2905 = 52;
        }
        class73 var16 = arg7.method440(arg0, var15, true);
        var16.method628(arg5 - 1, var11, var9, (byte) 123, var13, arg2, var12, this.field2911, arg4);
        return var16;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 384)
    public static void method1441(byte arg0) {
        field2891 = null;
        field2898 = null;
        field2904 = null;
        int var1 = 52 / ((-arg0 - 49) / 54);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 410)
    public final void method1442(int arg0) {
        if (this.field2901 == -1) {
            if (this.field2897 == null) {
                this.field2901 = 0;
            } else {
                this.field2901 = 2;
            }
        }
        field2918++;
        if (arg0 != 9) {
            this.field2896 = 35;
        }
        if (this.field2912 != -1) {
            return;
        }
        if (this.field2897 == null) {
            this.field2912 = 0;
        } else {
            this.field2912 = 2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBILsj;I)Lsj;", line = 439)
    public final class73 method1443(int arg0, int arg1, byte arg2, int arg3, class73 arg4, int arg5) {
        field2903++;
        int var7 = this.field2894[arg1];
        int var8 = this.field2915[arg1];
        class61 var9 = class166.method1254((byte) -127, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method440((byte) 1, arg5, true);
        }
        class61 var11 = null;
        if ((this.field2909 || class258.field3486) && arg3 != -1 && this.field2915.length > arg3) {
            int var12 = this.field2915[arg3];
            var11 = class166.method1254((byte) -127, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class61 var13 = null;
        class61 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2907 != null) {
            if (arg1 < this.field2907.length) {
                var15 = this.field2907[arg1];
                if (var15 != 65535) {
                    var13 = class166.method1254((byte) -127, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2909 || class258.field3486) && arg3 != -1 && this.field2907.length > arg3) {
                var16 = this.field2907[arg3];
                if (var16 != 65535) {
                    var14 = class166.method1254((byte) -127, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2911) {
            arg5 |= 0x200;
        }
        if (arg2 < 90) {
            return null;
        }
        if (var9.method546(var10, (byte) -117)) {
            arg5 |= 0x80;
        }
        if (var9.method551(0, var10)) {
            arg5 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method546(var15, (byte) -35)) {
                arg5 |= 0x80;
            }
            if (var13.method551(0, var15)) {
                arg5 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method546(arg3, (byte) -116)) {
                arg5 |= 0x80;
            }
            if (var11.method551(0, arg3)) {
                arg5 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method546(var16, (byte) -97)) {
                arg5 |= 0x80;
            }
            if (var14.method551(0, var16)) {
                arg5 |= 0x100;
            }
        }
        int var17 = arg5 | 0x20;
        class73 var18 = arg4.method440((byte) 1, var17, true);
        var18.method628(arg0 - 1, var9, var7, (byte) 124, var11, arg3, var10, this.field2911, 0);
        if (var13 != null) {
            var18.method628(arg0 - 1, var13, var7, (byte) 126, var14, var16, var15, this.field2911, 0);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lap;I)V", line = 560)
    public final void method1444(class289 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1861((byte) -72);
            if (var3 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field2914++;
                return;
            }
            this.method1437(var3, arg0, 1);
        }
    }
}
