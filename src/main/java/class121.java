import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class121 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
    private int[] field2329;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
    private int[] field2330;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[B")
    private byte[] field2322;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lai;")
    public static class10 field2323 = class44.method278("Keine Antwort vom Anmelde)2Server)3", -76);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lai;")
    public static class10 field2321 = class44.method278("rect_debug=", 94);

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lai;")
    private static class10 field2331 = class44.method278("Invalid username or password)3", 117);

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lai;")
    public static class10 field2332 = class44.method278("(Z", 127);

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lai;")
    public static class10 field2328 = field2331;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lai;")
    public static class10 field2336 = class44.method278("_", -48);

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lai;")
    private static class10 field2334 = class44.method278("Location", 100);

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lai;")
    public static class10 field2333 = field2334;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[S")
    public static short[] field2335;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI[BI[B)I")
    public final int method851(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        int var7 = arg0 + arg4;
        field2327++;
        int var8 = 0;
        if (!arg1) {
            field2334 = null;
        }
        int var9 = arg2 << 3;
        while (var7 > arg4) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field2330[var10];
            byte var12 = this.field2322[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            var9 += var12;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg3[var15] = (byte) (var8 = class66.method434(var14, var11 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg3[var15] = (byte) (var8 = var11 >>> var13);
                if (var16 > var15) {
                    var13 -= 8;
                    var15++;
                    arg3[var15] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var15) {
                        var15++;
                        var13 -= 8;
                        arg3[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var13 -= 8;
                            var15++;
                            arg3[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBI)I")
    public static final int method852(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2325++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            if (arg2 < 1) {
                method854((byte) -105, -51L);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[BIIII)I")
    public final int method853(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field2337++;
        if (arg2 <= 4) {
            return -120;
        } else if (arg3 == 0) {
            return 0;
        } else {
            int var7 = 0;
            int var8 = arg3 + arg4;
            int var9 = arg5;
            while (true) {
                byte var10 = arg1[var9];
                if (var10 < 0) {
                    var7 = this.field2329[var7];
                } else {
                    var7++;
                }
                int var11;
                if ((var11 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var11;
                    if (arg4 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field2329[var7];
                }
                int var12;
                if ((var12 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var12;
                    if (var8 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field2329[var7];
                }
                int var13;
                if ((var13 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var13;
                    if (var8 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field2329[var7];
                }
                int var14;
                if ((var14 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var14;
                    if (var8 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field2329[var7];
                }
                int var15;
                if ((var15 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var15;
                    if (var8 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field2329[var7];
                }
                int var16;
                if ((var16 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var16;
                    if (arg4 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field2329[var7];
                }
                int var17;
                if ((var17 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var17;
                    if (var8 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field2329[var7];
                }
                int var18;
                if ((var18 = this.field2329[var7]) < 0) {
                    arg0[arg4++] = (byte) ~var18;
                    if (var8 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg5;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BJ)V")
    public static final void method854(byte arg0, long arg1) {
        field2320++;
        if (arg1 == 0L) {
            return;
        }
        class76.field1323.method635((byte) -107, 9);
        if (arg0 >= 98) {
            class76.field1323.method783(arg1, -48);
            class56.field988++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    public static final int method855(int arg0) {
        if (arg0 == -1) {
            field2326++;
            return class141.field2655++;
        } else {
            return -32;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method856(boolean arg0) {
        field2333 = null;
        field2323 = null;
        field2328 = null;
        field2336 = null;
        if (!arg0) {
            return;
        }
        field2334 = null;
        field2335 = null;
        field2331 = null;
        field2332 = null;
        field2321 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
    public class121(byte[] arg0) {
        int var2 = arg0.length;
        this.field2329 = new int[8];
        int[] var3 = new int[33];
        this.field2330 = new int[var2];
        int var4 = 0;
        this.field2322 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2330[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class66.method434(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field2329[var14] == 0) {
                            this.field2329[var14] = var4;
                        }
                        var14 = this.field2329[var14];
                    }
                    if (this.field2329.length <= var14) {
                        int[] var17 = new int[this.field2329.length * 2];
                        for (int var18 = 0; var18 < this.field2329.length; var18++) {
                            var17[var18] = this.field2329[var18];
                        }
                        this.field2329 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2329[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
