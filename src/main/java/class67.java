import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class67 extends class440 {

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
    private int field1228 = 1;

    @OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
    private int field1236 = 1;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
    private int field1233 = 204;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "Lnea;")
    public static class664 field1227 = new class664(77, -2);

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
    public static int field1231 = 0;

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gea", name = "L", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!gea", name = "M", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "Z")
    public static boolean field1229;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field1232;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lda;IILrk;IIIIIIILr;II)Lda;")
    public static final class55 method674(class55 arg0, int arg1, int arg2, class30 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class166 arg11, int arg12, int arg13) {
        ++field1234;
        if (arg0 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg3 != null) {
                int var15 = var14 | arg3.method344(false, -1, -128, arg8);
                var14 = var15 & -513;
            }
            long var16 = ((long) arg4 << 48) + ((long) arg6 << 32) + (long) ((arg5 << 16) + (arg7 << 24) + arg2);
            class382 var18 = class513.field7222;
            class55 var19;
            synchronized (class513.field7222) {
                var19 = (class55) class513.field7222.method2287(1, var16);
            }
            if (var19 == null || ~arg11.method172(var19.method517(), var14) != -1) {
                if (var19 != null) {
                    var14 = arg11.method160(var14, var19.method517());
                }
                byte var20;
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        var20 = 12;
                    } else if (~arg2 == -4) {
                        var20 = 15;
                    } else if (arg2 == 4) {
                        var20 = 18;
                    } else {
                        var20 = 21;
                    }
                } else {
                    var20 = 9;
                }
                byte var21 = 3;
                int[] var22 = new int[] { 64, 96, 128 };
                class461 var23 = new class461(var20 * var21 + 1, var20 * var21 * 2 - var20, 0);
                int var24 = var23.method2719((byte) 74, 0, 0, 0);
                int[][] var25 = new int[var21][var20];
                for (int var26 = 0; ~var21 < ~var26; ++var26) {
                    int var27 = var22[var26];
                    int var28 = var22[var26];
                    for (int var29 = 0; ~var29 > ~var20; ++var29) {
                        int var30 = (var29 << 14) / var20;
                        int var31 = class189.field2719[var30] * var27 >> 14;
                        int var32 = class189.field2721[var30] * var28 >> 14;
                        var25[var26][var29] = var23.method2719((byte) 21, var31, 0, var32);
                    }
                }
                for (int var33 = 0; var21 > var33; ++var33) {
                    int var34 = (var33 * 256 + 128) / var21;
                    int var35 = -var34 + 256;
                    byte var36 = (byte) (arg5 * var35 + arg7 * var34 >> 8);
                    short var37 = (short) ((229376 & (arg4 & 896) * var34 + (arg6 & 896) * var35) + ((64512 & arg4) * var34 + (64512 & arg6) * var35 & 16515072) + ((127 & arg4) * var34 + (arg6 & 127) * var35 & 32512) >> 8);
                    for (int var38 = 0; var38 < var20; ++var38) {
                        if (~var33 != -1) {
                            var23.method2713((short) -1, var25[var33 - 1][(var38 - -1) % var20], (byte) -1, var25[var33][(var38 + 1) % var20], (byte) 100, var37, var36, var25[var33 - 1][var38], (byte) 1);
                            var23.method2713((short) -1, var25[var33][(var38 - -1) % var20], (byte) -1, var25[var33][var38], (byte) 65, var37, var36, var25[var33 + -1][var38], (byte) 1);
                        } else {
                            var23.method2713((short) -1, var25[0][(var38 + 1) % var20], (byte) -1, var25[0][var38], (byte) 118, var37, var36, var24, (byte) 1);
                        }
                    }
                }
                var19 = arg11.method171(var23, var14, class671.field9490, 64, 768);
                class382 var39 = class513.field7222;
                synchronized (class513.field7222) {
                    class513.field7222.method2291(var19, var16, 1);
                }
            }
            int var40 = arg0.method512();
            int var41 = arg0.method544();
            int var42 = arg0.method531();
            int var43 = arg0.method524();
            class98 var44 = null;
            if (arg3 != null) {
                int var45 = arg3.field456[arg8];
                var44 = class188.field2708.method2135(-64, var45 >> 16);
                arg8 = var45 & 65535;
            }
            class55 var46;
            if (var44 == null) {
                var46 = var19.method532((byte) 3, var14, true);
                var46.method499(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                var46.method548(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            } else {
                var46 = var19.method532((byte) 3, var14, true);
                var46.method499(var41 - var40 >> 1, 128, -var42 + var43 >> 1);
                var46.method548(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                var46.method600(arg8, arg9 + 83, var44);
            }
            if (~arg1 != -1) {
                var46.method522(arg1);
            }
            if (~arg13 != arg9) {
                var46.method494(arg13);
            }
            if (~arg12 != -1) {
                var46.method548(0, arg12, 0);
            }
            return var46;
        }
    }

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "(I)V")
    public static void method675(int arg0) {
        field1232 = null;
        field1227 = null;
        if (arg0 != 0) {
            method676(-4, -100, -36, -91, 58);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIII)I")
    public static final int method676(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 770344752) {
            method676(86, -117, -91, -109, 67);
        }
        ++field1235;
        int var5 = -class189.field2721[arg0 * 8192 / arg1] + 65536 >> 1;
        return ((-var5 + 65536) * arg3 >> 16) - -(arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field1230;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            for (int var4 = 0; ~var4 > ~class549.field7715; ++var4) {
                int var5 = class499.field7073[var4];
                int var6 = class418.field6099[arg1];
                int var7 = this.field1236 * var5 >> 12;
                int var8 = this.field1228 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1236) * this.field1236;
                int var10 = var6 % (4096 / this.field1228) * this.field1228;
                if (~this.field1233 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field1233) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field1233) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        int var12 = 93 % ((arg0 - -56) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field1226;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1233 = arg1.method3847((byte) 118);
                }
            } else {
                this.field1228 = arg1.method3826(false);
            }
        } else {
            this.field1236 = arg1.method3826(false);
        }
        if (arg0 != 5) {
            this.field1228 = -7;
        }
    }
}
