import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class334 extends class310 {

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    private int field5289 = 3072;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    private int field5292 = 2048;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    private int field5293 = 1024;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIIIII)V", line = 4)
    public static final void method2337(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0 && arg5 >= 0 && arg0 < 103 && arg5 < 103) {
            if (arg3 == 0) {
                class338 var8 = class243.method1851(arg4, arg0, arg5);
                if (var8 != null) {
                    int var9 = (int) (var8.field5397 >>> 32) & Integer.MAX_VALUE;
                    if (arg6 == 2) {
                        var8.field5392 = new class56(var9, 2, arg1 + 4, arg4, arg0, arg5, arg7, false, var8.field5392);
                        var8.field5390 = new class56(var9, 2, arg1 + 1 & 0x3, arg4, arg0, arg5, arg7, false, var8.field5390);
                    } else {
                        var8.field5392 = new class56(var9, arg6, arg1, arg4, arg0, arg5, arg7, false, var8.field5392);
                    }
                }
            }
            if (arg3 == 1) {
                class339 var10 = class76.method633(arg4, arg0, arg5);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field5406 >>> 32);
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field5400 = new class56(var11, 4, arg1, arg4, arg0, arg5, arg7, false, var10.field5400);
                    } else if (arg6 == 6) {
                        var10.field5400 = new class56(var11, 4, arg1 + 4, arg4, arg0, arg5, arg7, false, var10.field5400);
                    } else if (arg6 == 7) {
                        var10.field5400 = new class56(var11, 4, (arg1 + 2 & 0x3) + 4, arg4, arg0, arg5, arg7, false, var10.field5400);
                    } else if (arg6 == 8) {
                        var10.field5400 = new class56(var11, 4, arg1 + 4, arg4, arg0, arg5, arg7, false, var10.field5400);
                        var10.field5410 = new class56(var11, 4, (arg1 + 2 & 0x3) + 4, arg4, arg0, arg5, arg7, false, var10.field5410);
                    }
                }
            }
            if (arg3 == 2) {
                if (arg6 == 11) {
                    arg6 = 10;
                }
                class209 var12 = class353.method2496(arg4, arg0, arg5);
                if (var12 != null) {
                    var12.field3287 = new class56((int) (var12.field3279 >>> 32) & Integer.MAX_VALUE, arg6, arg1, arg4, arg0, arg5, arg7, false, var12.field3287);
                }
            }
            if (arg3 == 3) {
                class184 var13 = class291.method2109(arg4, arg0, arg5);
                if (var13 != null) {
                    var13.field2968 = new class56((int) (var13.field2972 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg4, arg0, arg5, arg7, false, var13.field2968);
                }
            }
        }
        field5298++;
        if (arg2 > 101) {
            ;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 93)
    public class334() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I", line = 99)
    public final int[] method77(int arg0, int arg1) {
        field5294++;
        int[] var3 = this.field4950.method930(arg0, arg1 ^ arg1);
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                var3[var5] = this.field5293 + (var4[var5] * this.field5292 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIIIBLd;)V", line = 130)
    public static final void method2338(boolean arg0, int arg1, int arg2, int arg3, byte arg4, class43 arg5) {
        field5295++;
        if (class213.field3398 >= 50 || arg5 == null || arg5.field665 == null || arg5.field665.length <= arg3 || arg5.field665[arg3] == null || arg4 != -13) {
            return;
        }
        int var6 = arg5.field665[arg3][0];
        int var7 = var6 & 0x1F;
        int var8 = var6 >> 8;
        int var9 = (var6 & 0xE7) >> 5;
        if (arg5.field665[arg3].length > 1) {
            int var10 = (int) ((double) arg5.field665[arg3].length * Math.random());
            if (var10 > 0) {
                var8 = arg5.field665[arg3][var10];
            }
        }
        if (var7 == 0) {
            if (arg0) {
                class309.method2195(var8, 0, (byte) -126, 255, var9);
            }
        } else if (class272.field4520 != 0) {
            class252.field4269[class213.field3398] = var8;
            class76.field1323[class213.field3398] = var9;
            class240.field3962[class213.field3398] = 0;
            int var11 = (arg1 - 64) / 128;
            class94.field1584[class213.field3398] = null;
            class230.field3830[class213.field3398] = 255;
            int var12 = (arg2 - 64) / 128;
            class43.field662[class213.field3398] = (var11 << 16) + (var12 << 8) + var7;
            class213.field3398++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)[[I", line = 194)
    public final int[][] method391(int arg0, boolean arg1) {
        field5291++;
        if (!arg1) {
            this.field5289 = -119;
        }
        int[][] var3 = this.field4942.method10((byte) -119, arg0);
        if (this.field4942.field30) {
            int[][] var4 = this.method2199(21101, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class261.field4405; var11++) {
                var10[var11] = (var5[var11] * this.field5292 >> 12) + this.field5293;
                var8[var11] = (var7[var11] * this.field5292 >> 12) + this.field5293;
                var9[var11] = this.field5293 + (var6[var11] * this.field5292 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V", line = 246)
    public final void method553(byte arg0) {
        this.field5292 = this.field5289 - this.field5293;
        if (arg0 > -82) {
            this.field5289 = -66;
        }
        field5288++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB[I[I)V", line = 261)
    public static final void method2339(int arg0, int arg1, byte arg2, int[] arg3, int[] arg4) {
        if (arg2 != -106) {
            return;
        }
        if (arg0 < arg1) {
            int var5 = arg0;
            int var6 = (arg0 + arg1) / 2;
            int var7 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var7;
            int var8 = arg3[var6];
            arg3[var6] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (arg4[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg4[arg1] = arg4[var5];
            arg4[var5] = var7;
            arg3[arg1] = arg3[var5];
            arg3[var5] = var8;
            method2339(arg0, var5 - 1, (byte) -106, arg3, arg4);
            method2339(var5 + 1, arg1, (byte) -106, arg3, arg4);
        }
        field5297++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqm;II)V", line = 326)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field5293 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field5289 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field4940 = arg0.method1720((byte) -28) == 1;
        }
        if (arg1 != -2470) {
            method2338(false, -102, -27, 89, (byte) -47, (class43) null);
        }
        field5290++;
    }
}
