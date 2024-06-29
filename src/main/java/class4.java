import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lng;")
    private class156 field48;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Ldi;")
    private class147 field44;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lvj;")
    private class103 field35;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lok;")
    public static class146 field32 = class235.method1724(-12908, "www)2wtqa");

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lok;")
    public static class146 field40 = class235.method1724(-12908, "settings");

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lok;")
    public static class146 field47 = class235.method1724(-12908, "Fps:");

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lhf;")
    public static class195 field45 = new class195(16);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Loh;")
    public static class15 field46;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lwe;")
    private class47 field31;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[Lhb;")
    private class32[] field41;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILgm;IIIIIILfg;IIIZZ)Lfg;", line = 13)
    public static final class208 method12(int arg0, class287 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class208 arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        long var14 = ((long) arg11 << 48) + ((long) arg9 << 32) + (long) ((arg3 << 16) + arg7 - -(arg5 << 24));
        field36++;
        class208 var16 = (class208) class22.field414.method799((byte) 52, var14);
        if (var16 == null) {
            byte var17;
            if (arg7 == 1) {
                var17 = 9;
            } else if (arg7 == 2) {
                var17 = 12;
            } else if (arg7 == 3) {
                var17 = 15;
            } else if (arg7 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class130 var20 = new class130(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int var21 = var20.method943(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class109.field1757[var27] * var25 + arg10 >> 16;
                    int var29 = class109.field1750[var27] * var24 + arg0 >> 16;
                    var22[var23][var26] = var20.method943(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg3 * var32 + arg5 * var31 >> 8);
                short var34 = (short) (((arg9 & 0x380) * var32 + (arg11 & 0x380) * var31 & 0x38000) + ((arg9 & 0x7F) * var32 + (arg11 & 0x7F) * var31 & 0x7F00) + ((arg9 & 0xFC00) * var32 + (arg11 & 0xFC00) * var31 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method954(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method954(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method954(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method961(64, 768, -50, -10, -50);
            class22.field414.method797(var16, 0, var14);
        }
        int var36 = arg7 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        if (!arg13) {
            return (class208) null;
        }
        int var39 = arg8.method1360();
        int var40 = var36;
        int var41 = var36;
        int var42 = arg8.method1382();
        if (arg12) {
            if (arg2 > 1152 && arg2 < 1920) {
                var41 = var36 + 128;
            }
            if (arg2 > 128 && arg2 < 896) {
                var38 -= 128;
            }
            if (arg2 > 640 && arg2 < 1408) {
                var40 = var36 + 128;
            }
            if (arg2 > 1664 || arg2 < 384) {
                var37 -= 128;
            }
        }
        int var43 = arg8.method1372();
        if (var37 > var43) {
            var43 = var37;
        }
        if (var39 < var38) {
            var39 = var38;
        }
        int var44 = arg8.method1391();
        if (var41 < var42) {
            var42 = var41;
        }
        if (var40 < var44) {
            var44 = var40;
        }
        class72 var45 = null;
        if (arg1 != null) {
            int var46 = arg1.field4904[arg4];
            var45 = class87.method605(97, var46 >> 16);
            arg4 = var46 & 0xFFFF;
        }
        class208 var47;
        if (var45 == null) {
            var47 = var16.method1367(true, true);
            var47.method1357((var42 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method1374((var39 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method1367(!var45.method530((byte) -119, arg4), true);
            var47.method1357((var42 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method1374((var39 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method1376(var45, arg4);
        }
        if (arg2 != 0) {
            var47.method1398(arg2);
        }
        if (class271.field4640) {
            class176 var50 = (class176) var47;
            if (arg6 != class19.method141(arg0 + var39, class203.field3387, arg10 + var43, 122) || arg6 != class19.method141(arg0 + var42, class203.field3387, arg10 + var44, 123)) {
                for (int var51 = 0; var51 < var50.field2962; var51++) {
                    var50.field2960[var51] += class19.method141(var50.field2940[var51] + arg0, class203.field3387, var50.field2973[var51] + arg10, 121) - arg6;
                }
                var50.field2967.field1419 = false;
                var50.field2950.field974 = false;
            }
        } else {
            class220 var48 = (class220) var47;
            if (class19.method141(arg0 + var39, class203.field3387, arg10 + var43, 119) != arg6 || arg6 != class19.method141(arg0 + var42, class203.field3387, arg10 + var44, 125)) {
                for (int var49 = 0; var49 < var48.field3625; var49++) {
                    var48.field3655[var49] += class19.method141(var48.field3653[var49] + arg0, class203.field3387, var48.field3636[var49] + arg10, 126) - arg6;
                }
                var48.field3637 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Z", line = 255)
    public final boolean method13(int arg0) {
        field38++;
        if (this.field31 != null) {
            return true;
        }
        if (this.field35 == null) {
            if (this.field48.method1227(arg0 + 2460)) {
                return false;
            }
            this.field35 = this.field48.method1225((byte) -93, 255, true, 255, (byte) 0);
        }
        if (this.field35.field1856) {
            return false;
        }
        this.field31 = new class47(this.field35.method706(100));
        if (arg0 != 16) {
            this.method20(91, (class245) null, (class245) null, (byte) -77);
        }
        this.field41 = new class32[(this.field31.field860.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 288)
    public static void method14(int arg0) {
        field40 = null;
        field46 = null;
        field45 = null;
        field32 = null;
        if (arg0 != 22496) {
            method15((byte) 94, -20, (int[]) null, (long[]) null, -1);
        }
        field47 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI[I[JI)V", line = 305)
    public static final void method15(byte arg0, int arg1, int[] arg2, long[] arg3, int arg4) {
        field34++;
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            long var6 = arg3[var5];
            int var8 = arg1;
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var6;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var9;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (arg3[var10] < (long) (var10 & 0x1) + var6) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var8];
                    arg3[var8] = var11;
                    int var13 = arg2[var10];
                    arg2[var10] = arg2[var8];
                    arg2[var8++] = var13;
                }
            }
            arg3[arg4] = arg3[var8];
            arg3[var8] = var6;
            arg2[arg4] = arg2[var8];
            arg2[var8] = var9;
            method15((byte) -108, arg1, arg2, arg3, var8 - 1);
            method15((byte) -83, var8 + 1, arg2, arg3, arg4);
        }
        if (arg0 > -47) {
            method18(true);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V", line = 365)
    public final void method16(int arg0) {
        field43++;
        if (this.field41 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field41.length; var2++) {
            if (this.field41[var2] != null) {
                this.field41[var2].method230((byte) -67);
            }
        }
        int var3 = 65 / ((arg0 - 29) / 42);
        for (int var4 = 0; var4 < this.field41.length; var4++) {
            if (this.field41[var4] != null) {
                this.field41[var4].method237((byte) 85);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILr;)I", line = 407)
    public static final int method17(int arg0, int arg1, class264 arg2) {
        field37++;
        if (!class98.method676(arg0, 65535, client.method1789(arg2)) && arg2.field4471 == null) {
            return -1;
        } else if (arg1 == 0) {
            return arg2.field4446 == null || arg2.field4446.length <= arg0 ? -1 : arg2.field4446[arg0];
        } else {
            return 50;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 421)
    public static final void method18(boolean arg0) {
        field33++;
        if (class236.field3943 != -1) {
            class274.method2000(class236.field3943, false);
        }
        for (int var1 = 0; var1 < class227.field3783; var1++) {
            if (class14.field264[var1]) {
                class269.field4623[var1] = true;
            }
            class79.field1270[var1] = class14.field264[var1];
            class14.field264[var1] = false;
        }
        class51.field927 = null;
        if (class271.field4640) {
            class189.field3125 = true;
        }
        class190.field3141 = -1;
        class7.field167 = class203.field3385;
        class25.field437 = -1;
        if (class236.field3943 != -1) {
            class227.field3783 = 0;
            class278.method2023(-1, 0, -1412584499, 0, 0, class148.field2518, class236.field3943, 0, class56.field997);
        }
        if (class271.field4640) {
            class131.method976();
        } else {
            class181.method1422();
        }
        if (arg0) {
            field46 = (class15) null;
        }
        class214.field3534 = 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZLmd;ILmd;)Lhb;", line = 470)
    private final class32 method19(int arg0, boolean arg1, class245 arg2, int arg3, class245 arg4) {
        field42++;
        if (this.field31 == null) {
            throw new RuntimeException();
        }
        if (arg0 != -1) {
            field45 = (class195) null;
        }
        this.field31.field857 = arg3 * 8 + 5;
        if (this.field31.field857 >= this.field31.field860.length) {
            throw new RuntimeException();
        } else if (this.field41[arg3] == null) {
            int var6 = this.field31.method373((byte) 36);
            int var7 = this.field31.method373((byte) 36);
            class32 var8 = new class32(arg3, arg4, arg2, this.field48, this.field44, var6, var7, arg1);
            this.field41[arg3] = var8;
            return var8;
        } else {
            return this.field41[arg3];
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILmd;Lmd;B)Lhb;", line = 510)
    public final class32 method20(int arg0, class245 arg1, class245 arg2, byte arg3) {
        field30++;
        return arg3 == -29 ? this.method19(-1, true, arg2, arg0, arg1) : (class32) null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lng;Ldi;)V", line = 527)
    public class4(class156 arg0, class147 arg1) {
        this.field48 = arg0;
        this.field44 = arg1;
        if (!this.field48.method1227(2476)) {
            this.field35 = this.field48.method1225((byte) 87, 255, true, 255, (byte) 0);
        }
    }
}
