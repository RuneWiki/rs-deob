import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class313 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    private int[] field5418 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Z")
    public boolean field5426 = false;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public int field5433 = -1;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lwm;")
    public static class152 field5419 = class157.method1048("Chargement du module texte )2 ", 127);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lah;")
    public static class205 field5421;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    private int[] field5417;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[S")
    private short[] field5428;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[S")
    private short[] field5430;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[S")
    private short[] field5434;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[S")
    private short[] field5436;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIIB)V", line = 4)
    public static final void method2179(boolean arg0, int arg1, int arg2, byte arg3) {
        field5414++;
        if (arg3 <= 71) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class252.field4337 = arg2;
        class226.field3664 = arg1;
        class314.field5440 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIILv;JZ)V", line = 24)
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, class73 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class120 var8 = new class120();
        var8.field1684 = arg4;
        var8.field1688 = arg1 * 128 + 64;
        var8.field1690 = arg2 * 128 + 64;
        var8.field1696 = arg3;
        var8.field1685 = arg5;
        var8.field1689 = arg6;
        if (class287.field4857[arg0][arg1][arg2] == null) {
            class287.field4857[arg0][arg1][arg2] = new class34(arg0, arg1, arg2);
        }
        class287.field4857[arg0][arg1][arg2].field558 = var8;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V", line = 45)
    public static final void method2181(boolean arg0, int arg1) {
        field5429++;
        class123 var2 = (class123) class225.field3655.method1586((long) arg1, -67);
        if (!arg0) {
            method2180(26, 49, -20, 50, (class73) null, -8L, true);
        }
        if (var2 != null) {
            var2.method1880(-25368);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIBII)V", line = 72)
    public static final void method2182(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 >= -49) {
            method2187(108, (byte[]) null);
        }
        for (int var6 = arg4; var6 <= arg1; var6++) {
            class275.method1885(arg2, class179.field2843[var6], arg5, arg0, -2611);
        }
        field5420++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z", line = 90)
    public final boolean method2183(byte arg0) {
        boolean var2 = true;
        int var3 = -61 % ((arg0 - 7) / 52);
        field5425++;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field5418[var4] != -1 && !class256.field4415.method1369(0, (byte) -27, this.field5418[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILqc;IILr;Lse;II)V", line = 115)
    public static final void method2184(int arg0, class4 arg1, int arg2, int arg3, class270 arg4, class12 arg5, int arg6, int arg7) {
        class172 var8 = new class172();
        var8.field2755 = arg3;
        int var9 = -114 % ((33 - arg0) / 45);
        var8.field2730 = arg6 * 128;
        var8.field2735 = arg7 * 128;
        field5422++;
        if (arg4 != null) {
            var8.field2754 = arg4;
            var8.field2731 = arg4.field4584 * 128;
            var8.field2737 = arg4.field4572;
            var8.field2729 = arg4.field4559;
            var8.field2756 = arg4.field4588;
            int var10 = arg4.field4618;
            var8.field2740 = arg4.field4614;
            int var11 = arg4.field4562;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg4.field4562;
                var11 = arg4.field4618;
            }
            var8.field2728 = (arg6 + var10) * 128;
            var8.field2734 = (arg7 + var11) * 128;
            if (arg4.field4592 != null) {
                var8.field2749 = true;
                var8.method1155((byte) 86);
            }
            if (var8.field2737 != null) {
                var8.field2748 = (int) ((double) (var8.field2756 - var8.field2740) * Math.random()) + var8.field2740;
            }
            class94.field1334.method1214(false, var8);
        } else if (arg1 != null) {
            var8.field2742 = arg1;
            class242 var12 = arg1.field72;
            if (var12.field4011 != null) {
                var8.field2749 = true;
                var12 = var12.method1650(4);
            }
            if (var12 != null) {
                var8.field2728 = (var12.field3984 + arg6) * 128;
                var8.field2734 = (var12.field3984 + arg7) * 128;
                var8.field2729 = class162.method1085(false, arg1);
                var8.field2731 = var12.field4017 * 128;
            }
            class17.field240.method1214(false, var8);
        } else if (arg5 != null) {
            var8.field2736 = arg5;
            var8.field2728 = (arg5.method67(-4391) + arg6) * 128;
            var8.field2734 = (arg5.method67(-4391) + arg7) * 128;
            var8.field2729 = class117.method774(arg5, true);
            var8.field2731 = arg5.field150 * 128;
            class57.field877.method1593(arg5.field146.method1013(-18674), var8, 27497);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[Laj;)V", line = 203)
    public static final void method2185(int arg0, class1[] arg1) {
        class65.field983[arg0] = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILhi;)V", line = 207)
    private final void method2186(byte arg0, int arg1, class291 arg2) {
        if (arg1 == 1) {
            this.field5433 = arg2.method2011(-25);
        } else if (arg1 == 2) {
            int var8 = arg2.method2011(-40);
            this.field5417 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5417[var9] = arg2.method2021((byte) 74);
            }
        } else if (arg1 == 3) {
            this.field5426 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method2011(-64);
            this.field5434 = new short[var4];
            this.field5428 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5428[var5] = (short) arg2.method2021((byte) 74);
                this.field5434[var5] = (short) arg2.method2021((byte) 74);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method2011(-62);
            this.field5436 = new short[var6];
            this.field5430 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5430[var7] = (short) arg2.method2021((byte) 74);
                this.field5436[var7] = (short) arg2.method2021((byte) 74);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field5418[arg1 - 60] = arg2.method2021((byte) 74);
        }
        field5432++;
        if (arg0 < 2) {
            method2180(1, -117, 40, 32, (class73) null, 44L, false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[B)[B", line = 286)
    public static final byte[] method2187(int arg0, byte[] arg1) {
        field5424++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -1) {
            byte[] var2 = new byte[arg1.length];
            class187.method1243(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 314)
    public static void method2188(int arg0) {
        if (arg0 != -1) {
            field5421 = (class205) null;
        }
        field5419 = null;
        field5421 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z", line = 325)
    public final boolean method2189(int arg0) {
        if (arg0 != 128) {
            field5435 = 116;
        }
        field5413++;
        if (this.field5417 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field5417.length; var3++) {
            if (!class256.field4415.method1369(0, (byte) -45, this.field5417[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lhi;I)V", line = 358)
    public final void method2190(class291 arg0, int arg1) {
        if (arg1 != 0) {
            field5421 = (class205) null;
        }
        while (true) {
            int var3 = arg0.method2011(-56);
            if (var3 == 0) {
                field5423++;
                return;
            }
            this.method2186((byte) 24, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lrb;", line = 382)
    public final class220 method2191(byte arg0) {
        int var2 = 84 / ((-arg0 - 35) / 55);
        field5416++;
        class220[] var3 = new class220[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field5418[var5] != -1) {
                var3[var4++] = class220.method1514(class256.field4415, this.field5418[var5], 0);
            }
        }
        class220 var6 = new class220(var3, var4);
        if (this.field5428 != null) {
            for (int var7 = 0; var7 < this.field5428.length; var7++) {
                var6.method1511(this.field5428[var7], this.field5434[var7]);
            }
        }
        if (this.field5430 != null) {
            for (int var8 = 0; var8 < this.field5430.length; var8++) {
                var6.method1510(this.field5430[var8], this.field5436[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Lrb;", line = 444)
    public final class220 method2192(byte arg0) {
        field5431++;
        if (this.field5417 == null) {
            return null;
        }
        class220[] var2 = new class220[this.field5417.length];
        for (int var3 = 0; var3 < this.field5417.length; var3++) {
            var2[var3] = class220.method1514(class256.field4415, this.field5417[var3], 0);
        }
        class220 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class220(var2, var2.length);
        }
        if (this.field5428 != null) {
            for (int var5 = 0; var5 < this.field5428.length; var5++) {
                var4.method1511(this.field5428[var5], this.field5434[var5]);
            }
        }
        if (arg0 < 114) {
            this.field5428 = (short[]) null;
        }
        if (this.field5430 != null) {
            for (int var6 = 0; var6 < this.field5430.length; var6++) {
                var4.method1510(this.field5430[var6], this.field5436[var6]);
            }
        }
        return var4;
    }
}
