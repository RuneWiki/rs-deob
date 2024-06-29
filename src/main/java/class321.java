import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class321 {

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lk;")
    private class233 field5517;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Ljb;")
    private class28 field5513;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lpm;")
    private class103 field5510;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field5520 = 0;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Lna;")
    public static class26 field5525 = class69.method505("showVideoAd", (byte) -125);

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Lve;")
    public static class266 field5524;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lwa;")
    private class82 field5508;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "[Lbg;")
    private class203[] field5526;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 5)
    public static void method2229(int arg0) {
        field5524 = null;
        if (arg0 > -10) {
            method2236(-80, (class82) null);
        }
        field5525 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z", line = 16)
    public final boolean method2230(int arg0) {
        field5509++;
        if (this.field5508 != null) {
            return true;
        }
        if (arg0 != 255) {
            field5520 = 119;
        }
        if (this.field5510 == null) {
            if (this.field5513.method229((byte) 89)) {
                return false;
            }
            this.field5510 = this.field5513.method233(123, 255, (byte) 0, 255, true);
        }
        if (this.field5510.field930) {
            return false;
        } else {
            this.field5508 = new class82(this.field5510.method415(false));
            this.field5526 = new class203[(this.field5508.field1280.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 45)
    public final void method2231(byte arg0) {
        field5518++;
        if (this.field5526 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5526.length; var2++) {
            if (this.field5526[var2] != null) {
                this.field5526[var2].method1374(0);
            }
        }
        for (int var3 = 0; var3 < this.field5526.length; var3++) {
            if (this.field5526[var3] != null) {
                this.field5526[var3].method1371(true);
            }
        }
        if (arg0 >= -56) {
            this.field5510 = (class103) null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILge;Lge;)Lbg;", line = 87)
    private final class203 method2232(int arg0, int arg1, class153 arg2, class153 arg3) {
        if (arg0 != -1824885439) {
            method2235(true, false, false, -22, true);
        }
        field5515++;
        return this.method2240(arg3, -125, arg1, true, arg2);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lpb;BIIIIIII)V", line = 100)
    public static final void method2233(class78 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg3 & 0x3;
        field5522++;
        if (arg1 >= -1) {
            field5525 = (class26) null;
        }
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg0.field1178;
            var10 = arg0.field1171;
        } else {
            var10 = arg0.field1178;
            var11 = arg0.field1171;
        }
        int var12;
        int var13;
        if ((arg7 + var10) > 104) {
            var12 = arg7 + 1;
            var13 = arg7;
        } else {
            var13 = arg7 + (var10 >> 1);
            var12 = arg7 + (var10 + 1 >> 1);
        }
        int var14 = (arg6 << 7) + (var11 << 6);
        int var15 = (arg7 << 7) + (var10 << 6);
        int var16;
        int var17;
        if (arg6 + var11 > 104) {
            var16 = arg6;
            var17 = arg6 + 1;
        } else {
            var16 = (var11 >> 1) + arg6;
            var17 = (var11 + 1 >> 1) + arg6;
        }
        int[][] var18 = class229.field3635[arg8];
        int var19 = 0;
        int var20 = var18[var16][var12] + var18[var16][var13] + var18[var17][var13] + var18[var17][var12] >> 2;
        if (arg8 != 0) {
            int[][] var21 = class229.field3635[0];
            var19 = var20 - (var21[var16][var13] + var21[var17][var12] + var21[var16][var12] + var21[var17][var13] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg8 < 3) {
            var22 = class229.field3635[arg8 + 1];
        }
        class157 var23 = arg0.method563(arg3, var14, var18, arg5, var20, var22, false, (class183) null, (byte) -69, true, var15);
        class179.method1244(var23.field2445, var14 - arg4, var19, var15 - arg2);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 177)
    public static final void method2234(boolean arg0) {
        field5521++;
        class86.field1419 = null;
        class114.method796(-101, class250.field4095, 0, class38.field622, 0, -1, class141.field2153, 0, 0);
        if (class86.field1419 != null) {
            class5.method31(0, class233.field3691, class8.field92, class86.field1419, class38.field622, -1412584499, 0, class141.field2153, (byte) 73, class163.field2540.field5103);
            class86.field1419 = null;
        }
        if (!arg0) {
            method2237((byte) -24);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZZZIZ)Lve;", line = 210)
    public static final class266 method2235(boolean arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        if (!arg4) {
            return (class266) null;
        }
        class153 var5 = null;
        field5511++;
        if (class225.field3569 != null) {
            var5 = new class153(arg3, class225.field3569, class211.field3275[arg3], 1000000);
        }
        class82.field1338[arg3] = class73.field1127.method2232(-1824885439, arg3, class218.field3483, var5);
        if (arg1) {
            class82.field1338[arg3].method1365(true);
        }
        return new class266(class82.field1338[arg3], arg0, arg2);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILwa;)Lci;", line = 233)
    public static final class199 method2236(int arg0, class82 arg1) {
        field5516++;
        return arg0 == -5232 ? new class199(arg1.method626((byte) 46), arg1.method626((byte) 109), arg1.method626((byte) 68), arg1.method626((byte) 127), arg1.method633((byte) 91), arg1.method642((byte) -124)) : (class199) null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 245)
    public static final void method2237(byte arg0) {
        field5514++;
        if (arg0 != -9) {
            field5525 = (class26) null;
        }
        if (class74.field1143 != null && class36.field586 != null) {
            return;
        }
        class74.field1143 = new int[256];
        class36.field586 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class74.field1143[var1] = (int) (Math.sin(var2) * 4096.0D);
            class36.field586[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V", line = 276)
    public static final void method2238(boolean arg0, int arg1) {
        field5519++;
        if (arg0 == class312.field5339) {
            return;
        }
        class312.field5339 = arg0;
        if (arg1 != 255) {
            field5525 = (class26) null;
        }
        class290.method2040((byte) -126);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z", line = 295)
    public static final boolean method2239(int arg0, int arg1, int arg2) {
        int var3 = class138.field2117[arg0][arg1][arg2];
        if (-class118.field1863 == var3) {
            return false;
        } else if (class118.field1863 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class144.method959(var4 + 1, class229.field3635[arg0][arg1][arg2], var5 + 1) && class144.method959(var4 + 128 - 1, class229.field3635[arg0][arg1 + 1][arg2], var5 + 1) && class144.method959(var4 + 128 - 1, class229.field3635[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class144.method959(var4 + 1, class229.field3635[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class138.field2117[arg0][arg1][arg2] = class118.field1863;
                return true;
            } else {
                class138.field2117[arg0][arg1][arg2] = -class118.field1863;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lge;IIZLge;)Lbg;", line = 333)
    private final class203 method2240(class153 arg0, int arg1, int arg2, boolean arg3, class153 arg4) {
        field5523++;
        if (this.field5508 == null) {
            throw new RuntimeException();
        }
        this.field5508.field1301 = arg2 * 8 + 5;
        if (arg1 >= -1) {
            return (class203) null;
        } else if (this.field5508.field1280.length <= this.field5508.field1301) {
            throw new RuntimeException();
        } else if (this.field5526[arg2] == null) {
            int var6 = this.field5508.method587(-502942936);
            int var7 = this.field5508.method587(-502942936);
            class203 var8 = new class203(arg2, arg0, arg4, this.field5513, this.field5517, var6, var7, arg3);
            this.field5526[arg2] = var8;
            return var8;
        } else {
            return this.field5526[arg2];
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljb;Lk;)V", line = 378)
    public class321(class28 arg0, class233 arg1) {
        this.field5517 = arg1;
        this.field5513 = arg0;
        if (!this.field5513.method229((byte) 111)) {
            this.field5510 = this.field5513.method233(110, 255, (byte) 0, 255, true);
        }
    }
}
