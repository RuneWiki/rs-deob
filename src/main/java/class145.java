import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class145 extends class334 {

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    private int field2339 = 0;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "I")
    private int field2348 = 10;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
    private int field2351 = 2048;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "Z")
    public static boolean field2345 = false;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "[I")
    public static int[] field2349 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "Lbn;")
    public static class517 field2353;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "[I")
    private int[] field2342;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "[I")
    private int[] field2350;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V", line = 6)
    private final void method1154(byte arg0) {
        ++field2344;
        this.field2350 = new int[this.field2348 + 1];
        int var2 = 0;
        this.field2342 = new int[this.field2348 + 1];
        int var3 = 4096 / this.field2348;
        int var4 = this.field2351 * var3 >> 12;
        if (arg0 == -2) {
            for (int var5 = 0; this.field2348 > var5; ++var5) {
                this.field2350[var5] = var2;
                this.field2342[var5] = var2 + var4;
                var2 += var3;
            }
            this.field2350[this.field2348] = 4096;
            this.field2342[this.field2348] = this.field2342[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V", line = 376)
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "(B)V", line = 46)
    public static void method1155(byte arg0) {
        field2349 = null;
        if (arg0 != 85) {
            field2353 = null;
        }
        field2353 = null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V", line = 57)
    public final void method27(byte arg0) {
        ++field2343;
        if (arg0 < -27) {
            this.method1154((byte) -2);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZLol;)V", line = 68)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            method1156((byte) 71, (byte[]) null, (byte[][]) null, (int[]) null, 0, (int[]) null, -102, (byte[][]) null);
        }
        ++field2340;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field2339 = arg2.method2557(14929);
                }
            } else {
                this.field2351 = arg2.method2565((byte) -96);
            }
        } else {
            this.field2348 = arg2.method2557(14929);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B[B[[B[II[II[[B)I", line = 117)
    public static final int method1156(byte arg0, byte[] arg1, byte[][] arg2, int[] arg3, int arg4, int[] arg5, int arg6, byte[][] arg7) {
        ++field2346;
        if (arg0 > -27) {
            return -120;
        } else {
            int var8 = arg5[arg6];
            int var9 = var8 - -arg3[arg6];
            int var10 = arg5[arg4];
            int var11 = arg3[arg4] + var10;
            int var12 = var8;
            if (~var8 > ~var10) {
                var12 = var10;
            }
            int var13 = var9;
            if (~var9 < ~var11) {
                var13 = var11;
            }
            int var14 = arg1[arg6] & 255;
            if (~(arg1[arg4] & 255) > ~var14) {
                var14 = arg1[arg4] & 255;
            }
            byte[] var15 = arg7[arg6];
            byte[] var16 = arg2[arg4];
            int var17 = -var8 + var12;
            int var18 = var12 - var10;
            for (int var19 = var12; var13 > var19; ++var19) {
                int var20 = var16[var18++] + var15[var17++];
                if (~var14 < ~var20) {
                    var14 = var20;
                }
            }
            return -var14;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILje;IIIIIIILha;ILka;)Lka;", line = 179)
    public static final class233 method1157(int arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class475 arg11, int arg12, class233 arg13) {
        ++field2341;
        if (arg13 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg3 != null) {
                int var15 = var14 | arg3.method812(false, -1, false, arg4);
                var14 = var15 & -513;
            }
            long var16 = ((long) arg2 << 32) + (long) ((arg12 << 16) + arg6 - -(arg9 << 24)) - -((long) arg10 << 48);
            class494 var18 = class729.field10165;
            class233 var19;
            synchronized (class729.field10165) {
                var19 = (class233) class729.field10165.method2882(var16, (byte) -28);
            }
            if (var19 == null || arg11.method497(var19.method591(), var14) != 0) {
                if (var19 != null) {
                    var14 = arg11.method426(var14, var19.method591());
                }
                byte var20;
                if (arg6 == 1) {
                    var20 = 9;
                } else if (~arg6 != -3) {
                    if (arg6 == 3) {
                        var20 = 15;
                    } else if (arg6 == 4) {
                        var20 = 18;
                    } else {
                        var20 = 21;
                    }
                } else {
                    var20 = 12;
                }
                byte var21 = 3;
                int[] var22 = new int[] { 64, 96, 128 };
                class678 var23 = new class678(var20 * var21 + 1, var20 * 2 * var21 + -var20, 0);
                int var24 = var23.method3814(0, 0, 0, 0);
                int[][] var25 = new int[var21][var20];
                for (int var26 = 0; var26 < var21; ++var26) {
                    int var27 = var22[var26];
                    int var28 = var22[var26];
                    for (int var29 = 0; var29 < var20; ++var29) {
                        int var30 = (var29 << 14) / var20;
                        int var31 = class253.field3634[var30] * var27 >> 14;
                        int var32 = class253.field3633[var30] * var28 >> 14;
                        var25[var26][var29] = var23.method3814(var32, 0, 0, var31);
                    }
                }
                for (int var33 = 0; var21 > var33; ++var33) {
                    int var34 = (var33 * 256 + 128) / var21;
                    int var35 = -var34 + 256;
                    byte var36 = (byte) (arg9 * var34 + arg12 * var35 >> 8);
                    short var37 = (short) ((32512 & (arg2 & 127) * var35 + (127 & arg10) * var34) + ((896 & arg2) * var35 + (arg10 & 896) * var34 & 229376) + ((arg2 & 64512) * var35 + (arg10 & 64512) * var34 & 16515072) >> 8);
                    for (int var38 = 0; ~var20 < ~var38; ++var38) {
                        if (~var33 != -1) {
                            var23.method3815(var25[var33 + -1][var38], var25[var33 + -1][(var38 - -1) % var20], (byte) 1, (byte) -1, false, var25[var33][(var38 + 1) % var20], (short) -1, var37, var36);
                            var23.method3815(var25[var33 + -1][var38], var25[var33][(var38 + 1) % var20], (byte) 1, (byte) -1, false, var25[var33][var38], (short) -1, var37, var36);
                        } else {
                            var23.method3815(var24, var25[0][(var38 + 1) % var20], (byte) 1, (byte) -1, false, var25[0][var38], (short) -1, var37, var36);
                        }
                    }
                }
                var19 = arg11.method514(var23, var14, class343.field4880, 64, 768);
                class494 var39 = class729.field10165;
                synchronized (class729.field10165) {
                    class729.field10165.method2890(-7307, var16, var19);
                }
            }
            int var40 = arg13.method566();
            int var41 = arg13.method527();
            int var42 = arg13.method525();
            int var43 = arg13.method572();
            class495 var44 = null;
            if (arg3 != null) {
                int var45 = arg3.field1402[arg4];
                var44 = class168.field2552.method3284(var45 >> 16, (byte) -123);
                arg4 = var45 & 65535;
            }
            class233 var46;
            if (var44 == null) {
                var46 = var19.method585((byte) 3, var14, true);
                var46.method564(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                var46.method568(var40 - -var41 >> 1, 0, var42 + var43 >> 1);
            } else {
                var46 = var19.method585((byte) 3, var14, true);
                var46.method564(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                var46.method568(var40 - -var41 >> 1, 0, var42 + var43 >> 1);
                var46.method1580(var44, arg4, (byte) 51);
            }
            if (arg0 != 0) {
                var46.method550(arg0);
            }
            if (~arg1 != arg5) {
                var46.method543(arg1);
            }
            if (~arg8 != -1) {
                var46.method568(0, arg8, 0);
            }
            return var46;
        }
    }

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)V", line = 346)
    public static final void method1158(int arg0) {
        ++field2352;
        if (!class686.field9702.method454()) {
            class636.method3625(false, class420.field5820.field9482.method2338(arg0 ^ -17538), arg0 + 115);
        } else {
            class686.field9702.method492(class213.field3128);
            class743.method4102(-1);
            if (!class593.field8489) {
                Dimension var1 = class213.field3128.getSize();
                class686.field9702.method437(class213.field3128, var1.width, var1.height);
            } else {
                class141.method1142(class213.field3128, arg0 ^ -3);
            }
            class686.field9702.method428(class213.field3128);
        }
        class31.method262((byte) -26);
        if (arg0 != -3) {
            field2345 = true;
        }
        class87.field1297 = true;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)[I", line = 382)
    public final int[] method28(int arg0, int arg1) {
        ++field2347;
        if (arg1 != -22563988) {
            this.field2350 = null;
        }
        int[] var3 = super.field4743.method1027((byte) -106, arg0);
        if (super.field4743.field1993) {
            int var4 = class527.field7361[arg0];
            if (this.field2339 != 0) {
                for (int var5 = 0; class439.field6099 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class295.field4296[var5];
                    int var9 = this.field2339;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field2348 < ~var10; ++var10) {
                        if (var6 >= this.field2350[var10] && ~this.field2350[var10 + 1] < ~var6) {
                            if (~var6 > ~this.field2342[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field2348; ++var12) {
                    if (var4 >= this.field2350[var12] && var4 < this.field2350[var12 + 1]) {
                        if (var4 < this.field2342[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class171.method1264(var3, 0, class439.field6099, var11);
            }
        }
        return var3;
    }
}
