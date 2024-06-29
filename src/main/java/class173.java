import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class173 extends class202 {

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "[I")
    private int[] field3462 = new int[16];

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
    private int[] field3451 = new int[16];

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[I")
    private int[] field3460 = new int[16];

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "[I")
    private int[] field3475 = new int[16];

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "[I")
    private int[] field3487 = new int[16];

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "[I")
    private int[] field3465 = new int[16];

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "[[Lkc;")
    private class101[][] field3471 = new class101[16][128];

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "[I")
    private int[] field3486 = new int[16];

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "[I")
    private int[] field3464 = new int[16];

    @OriginalMember(owner = "client!sc", name = "kb", descriptor = "[I")
    private int[] field3493 = new int[16];

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "[I")
    private int[] field3488 = new int[16];

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    private int field3468 = 256;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    private int field3458 = 1000000;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "[I")
    private int[] field3484 = new int[16];

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "[I")
    public int[] field3453 = new int[16];

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "[I")
    private int[] field3477 = new int[16];

    @OriginalMember(owner = "client!sc", name = "pb", descriptor = "[[Lkc;")
    private class101[][] field3498 = new class101[16][128];

    @OriginalMember(owner = "client!sc", name = "xb", descriptor = "[I")
    public int[] field3506 = new int[16];

    @OriginalMember(owner = "client!sc", name = "tb", descriptor = "[I")
    public int[] field3502 = new int[16];

    @OriginalMember(owner = "client!sc", name = "mb", descriptor = "Luf;")
    private class194 field3495 = new class194();

    @OriginalMember(owner = "client!sc", name = "Ib", descriptor = "Lqc;")
    private class155 field3517 = new class155(this);

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "Ll;")
    private class107 field3481 = new class107(128);

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Ldd;")
    public static class35 field3461 = class180.method1196((byte) -119, "headicons_prayer");

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field3469 = 20;

    @OriginalMember(owner = "client!sc", name = "sb", descriptor = "Ldd;")
    private static class35 field3501 = class180.method1196((byte) -59, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Ldd;")
    public static class35 field3459 = field3501;

    @OriginalMember(owner = "client!sc", name = "yb", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "Ldd;")
    public static class35 field3490 = class180.method1196((byte) 127, "blinken3:");

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
    public static int field3491 = 0;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sc", name = "lb", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sc", name = "nb", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sc", name = "ob", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sc", name = "qb", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sc", name = "rb", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!sc", name = "ub", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!sc", name = "vb", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!sc", name = "wb", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!sc", name = "zb", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!sc", name = "Ab", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!sc", name = "Bb", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!sc", name = "Cb", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!sc", name = "Db", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!sc", name = "Eb", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!sc", name = "Fb", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!sc", name = "Gb", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!sc", name = "Hb", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!sc", name = "Mb", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!sc", name = "Nb", descriptor = "I")
    private int field3522;

    @OriginalMember(owner = "client!sc", name = "Jb", descriptor = "J")
    private long field3518;

    @OriginalMember(owner = "client!sc", name = "Lb", descriptor = "J")
    private long field3520;

    @OriginalMember(owner = "client!sc", name = "Kb", descriptor = "Z")
    private boolean field3519;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    private final void method1119(byte arg0) {
        this.method1149(0, -1);
        if (arg0 <= 45) {
            this.field3498 = null;
        }
        this.method1131(-27290, -1);
        field3452++;
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3493[var2] = this.field3477[var2];
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field3464[var3] = class208.method1372(this.field3477[var3], -128);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public final synchronized void method694(int arg0) {
        field3505++;
        if (this.field3495.method1268()) {
            int var2 = this.field3495.field3878 * this.field3458 / class150.field3136;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3520;
                if (this.field3518 - var3 >= 0L) {
                    this.field3520 = var3;
                    break;
                }
                int var5 = (int) ((this.field3518 + (long) var2 - this.field3520 - 1L) / (long) var2);
                arg0 -= var5;
                this.field3520 += (long) var2 * (long) var5;
                this.field3517.method694(var5);
                this.method1123(false);
            } while (this.field3495.method1268());
        }
        this.field3517.method694(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIII)V")
    private final void method1120(byte arg0, int arg1, int arg2, int arg3) {
        class101 var5 = this.field3471[arg3][arg2];
        field3466++;
        if (var5 == null) {
            return;
        }
        this.field3471[arg3][arg2] = null;
        if (arg0 != 123) {
            method1152(102, -28);
        }
        if ((this.field3453[arg3] & 0x2) == 0) {
            var5.field2246 = 0;
            return;
        }
        for (class101 var6 = (class101) this.field3517.field3188.method1232(25831); var6 != null; var6 = (class101) this.field3517.field3188.method1238(22622)) {
            if (var5.field2250 == var6.field2250 && var6.field2246 < 0 && var5 != var6) {
                var5.field2246 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lwh;ZLag;Lqf;I)Z")
    public final synchronized boolean method1121(class213 arg0, boolean arg1, class8 arg2, class158 arg3, int arg4) {
        field3450++;
        arg0.method1384();
        boolean var6 = arg1;
        int[] var7 = null;
        if (arg4 > 0) {
            var7 = new int[] { arg4 };
        }
        for (class186 var8 = (class186) arg0.field4170.method790(-119); var8 != null; var8 = (class186) arg0.field4170.method794((byte) 90)) {
            int var9 = (int) var8.field2416;
            class166 var10 = (class166) this.field3481.method796(true, (long) var9);
            if (var10 == null) {
                var10 = class32.method304((byte) -112, arg2, var9);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field3481.method789(var10, true, (long) var9);
            }
            if (!var10.method1095(var7, var8.field3790, 125, arg3)) {
                var6 = false;
            }
        }
        if (var6) {
            arg0.method1383();
        }
        return var6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method1122(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field3521 = 94;
        }
        this.method1129(arg1, arg0, (byte) 44);
        field3496++;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()Lve;")
    public final synchronized class202 method682() {
        field3449++;
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    private final void method1123(boolean arg0) {
        field3485++;
        int var2 = this.field3521;
        int var3 = this.field3522;
        long var4 = this.field3518;
        while (this.field3522 == var3) {
            while (this.field3495.field3876[var2] == var3) {
                this.field3495.method1267(var2);
                int var6 = this.field3495.method1274(var2);
                if (var6 == 1) {
                    this.field3495.method1266();
                    this.field3495.method1275(var2);
                    if (this.field3495.method1278()) {
                        if (!this.field3519 || var3 == 0) {
                            this.method1119((byte) 91);
                            this.field3495.method1272();
                            return;
                        }
                        this.field3495.method1269(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method1151(-13931, var6);
                }
                this.field3495.method1273(var2);
                this.field3495.method1275(var2);
            }
            var2 = this.field3495.method1270();
            var3 = this.field3495.field3876[var2];
            var4 = this.field3495.method1281(var3);
        }
        this.field3521 = var2;
        this.field3518 = var4;
        this.field3522 = var3;
        if (arg0) {
            this.field3462 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)V")
    private final void method1124(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method1125(-32, (byte) 39, 13);
        }
        field3494++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
    private final void method1125(int arg0, byte arg1, int arg2) {
        this.field3475[arg0] = arg2;
        int var4 = -47 % ((45 - arg1) / 51);
        field3516++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lkc;I)I")
    private final int method1126(class101 arg0, int arg1) {
        field3489++;
        class165 var3 = arg0.field2249;
        int var4 = this.field3488[arg0.field2250] * this.field3451[arg0.field2250] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg0.field2214 * var5 + 16384 >> 15;
        int var7 = this.field3468 * var6 - arg1 >> 8;
        if (var3.field3331 > 0) {
            var7 = (int) ((double) var7 * Math.pow(0.5D, (double) arg0.field2235 * 1.953125E-5D * (double) var3.field3331) + 0.5D);
        }
        if (var3.field3328 != null) {
            int var8 = arg0.field2233;
            int var9 = var3.field3328[arg0.field2248 + 1];
            if (arg0.field2248 < var3.field3328.length - 2) {
                int var10 = (var3.field3328[arg0.field2248 + 2] & 0xFF) << 8;
                int var11 = (var3.field3328[arg0.field2248] & 0xFF) << 8;
                var9 += (var3.field3328[arg0.field2248 + 3] - var9) * (var8 - var11) / (var10 - var11);
            }
            var7 = var7 * var9 + 32 >> 6;
        }
        if (arg0.field2246 > 0 && var3.field3324 != null) {
            int var12 = arg0.field2246;
            int var13 = var3.field3324[arg0.field2229 + 1];
            if (var3.field3324.length - 2 > arg0.field2229) {
                int var14 = (var3.field3324[arg0.field2229] & 0xFF) << 8;
                int var15 = (var3.field3324[arg0.field2229 + 2] & 0xFF) << 8;
                var13 += (var3.field3324[arg0.field2229 + 3] - var13) * (var12 - var14) / (var15 - var14);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    private final void method1127(int arg0, int arg1) {
        for (class101 var3 = (class101) this.field3517.field3188.method1232(arg1 ^ 0x64E7); var3 != null; var3 = (class101) this.field3517.field3188.method1238(22622)) {
            if ((arg0 < 0 || var3.field2250 == arg0) && var3.field2246 < 0) {
                this.field3471[var3.field2250][var3.field2241] = null;
                var3.field2246 = 0;
            }
        }
        if (arg1 != 0) {
            this.method1149(84, 105);
        }
        field3478++;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)I")
    public final int method1128(int arg0) {
        if (arg0 == -9028) {
            field3512++;
            return this.field3468;
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)V")
    private final void method1129(int arg0, int arg1, byte arg2) {
        this.field3477[arg0] = arg1;
        this.field3464[arg0] = class208.method1372(-128, arg1);
        field3510++;
        this.method1137(arg0, arg1, 686887528);
        int var4 = 118 % ((-arg2 - 42) / 46);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public static void method1130(int arg0) {
        field3490 = null;
        field3461 = null;
        if (arg0 < 114) {
            field3459 = null;
        }
        field3501 = null;
        field3459 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
    private final void method1131(int arg0, int arg1) {
        field3456++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method1131(-27290, var3);
            }
            return;
        }
        this.field3451[arg1] = 12800;
        this.field3487[arg1] = 8192;
        this.field3488[arg1] = 16383;
        this.field3475[arg1] = 8192;
        this.field3462[arg1] = 0;
        if (arg0 != -27290) {
            return;
        }
        this.field3486[arg1] = 8192;
        this.method1148(arg1, 113);
        this.method1147((byte) -116, arg1);
        this.field3453[arg1] = 0;
        this.field3465[arg1] = 32767;
        this.field3484[arg1] = 256;
        this.field3502[arg1] = 0;
        this.method1132(8192, arg1, 1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    private final void method1132(int arg0, int arg1, int arg2) {
        this.field3460[arg1] = arg0;
        field3500++;
        if (arg2 == 1) {
            this.field3506[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)V")
    private final void method1133(int arg0, int arg1, int arg2, int arg3) {
        field3497++;
        if (arg2 != -1366107225) {
            method1138(1, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZLkc;)V")
    public final void method1134(boolean arg0, boolean arg1, class101 arg2) {
        field3511++;
        if (arg1) {
            return;
        }
        int var4 = arg2.field2227.field193.length;
        int var7;
        if (arg0 && arg2.field2227.field192) {
            int var5 = var4 + var4 - arg2.field2227.field194;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field3502[arg2.field2250] * (long) var5 >> 6);
            if (var6 <= var7) {
                var7 = var6 + var6 - var7 - 1;
                arg2.field2217.method716(true);
            }
        } else {
            var7 = (int) ((long) this.field3502[arg2.field2250] * (long) var4 >> 6);
        }
        arg2.field2217.method718(var7);
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public final synchronized void method1135(int arg0) {
        class166 var2 = (class166) this.field3481.method790(-117);
        if (arg0 >= -61) {
            return;
        }
        while (var2 != null) {
            var2.method1096(128);
            var2 = (class166) this.field3481.method794((byte) 90);
        }
        field3480++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZBLwh;)V")
    public final synchronized void method1136(boolean arg0, byte arg1, class213 arg2) {
        this.method1150(8342426);
        field3503++;
        this.field3495.method1271(arg2.field4171);
        this.field3519 = arg0;
        this.field3520 = 0L;
        int var4 = this.field3495.method1276();
        int var5 = 64 % ((arg1 - 21) / 62);
        for (int var6 = 0; var6 < var4; var6++) {
            this.field3495.method1267(var6);
            this.field3495.method1273(var6);
            this.field3495.method1275(var6);
        }
        this.field3521 = this.field3495.method1270();
        this.field3522 = this.field3495.field3876[this.field3521];
        this.field3518 = this.field3495.method1281(this.field3522);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
    private final void method1137(int arg0, int arg1, int arg2) {
        field3479++;
        if (this.field3493[arg0] != arg1) {
            this.field3493[arg0] = arg1;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field3498[arg0][var4] = null;
            }
        }
        if (arg2 != 686887528) {
            field3470 = 124;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
    public static final void method1138(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        if (class54.field1204 == 0) {
            class83.field1920.method1140(120, arg0);
        } else {
            class28.field580 = arg0;
        }
        field3504++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[ILkc;)Z")
    public final boolean method1139(int arg0, int arg1, int arg2, int[] arg3, class101 arg4) {
        field3463++;
        arg4.field2226 = class150.field3136 / 100;
        if (arg4.field2246 >= 0 && (arg4.field2217 == null || arg4.field2217.method700())) {
            arg4.method757(0);
            arg4.method799(-24265);
            if (arg4.field2234 > 0 && this.field3498[arg4.field2250][arg4.field2234] == arg4) {
                this.field3498[arg4.field2250][arg4.field2234] = null;
            }
            return true;
        }
        int var6 = arg4.field2242;
        boolean var7 = false;
        if (var6 > 0) {
            int var8 = var6 - (int) (Math.pow(2.0D, (double) this.field3486[arg4.field2250] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var8 < 0) {
                var8 = 0;
            }
            arg4.field2242 = var8;
        }
        arg4.field2217.method719(this.method1144(2830, arg4));
        class165 var9 = arg4.field2249;
        arg4.field2220 += var9.field3338;
        arg4.field2245++;
        double var10 = (double) ((arg4.field2241 - 60 << 8) + (arg4.field2242 * arg4.field2239 >> 12)) * 5.086263020833333E-6D;
        if (var9.field3331 > 0) {
            if (var9.field3323 > 0) {
                arg4.field2235 += (int) (Math.pow(2.0D, (double) var9.field3323 * var10) * 128.0D + 0.5D);
            } else {
                arg4.field2235 += 128;
            }
            if (arg4.field2235 * var9.field3331 >= 819200) {
                var7 = true;
            }
        }
        if (var9.field3328 != null) {
            if (var9.field3345 > 0) {
                arg4.field2233 += (int) (Math.pow(2.0D, (double) var9.field3345 * var10) * 128.0D + 0.5D);
            } else {
                arg4.field2233 += 128;
            }
            while (var9.field3328.length - 2 > arg4.field2248 && arg4.field2233 > (var9.field3328[arg4.field2248 + 2] & 0xFF) << 8) {
                arg4.field2248 += 2;
            }
            if (var9.field3328.length - 2 == arg4.field2248 && var9.field3328[arg4.field2248 + 1] == 0) {
                var7 = true;
            }
        }
        if (arg4.field2246 >= 0 && var9.field3324 != null && (this.field3453[arg4.field2250] & 0x1) == 0 && (arg4.field2234 < 0 || this.field3498[arg4.field2250][arg4.field2234] != arg4)) {
            if (var9.field3339 <= 0) {
                arg4.field2246 += 128;
            } else {
                arg4.field2246 += (int) (Math.pow(2.0D, (double) var9.field3339 * var10) * 128.0D + 0.5D);
            }
            while (arg4.field2229 < var9.field3324.length - 2 && (var9.field3324[arg4.field2229 + 2] & 0xFF) << 8 < arg4.field2246) {
                arg4.field2229 += 2;
            }
            if (var9.field3324.length - 2 == arg4.field2229) {
                var7 = true;
            }
        }
        if (arg2 != 14473) {
            method1152(-97, -12);
        }
        if (!var7) {
            arg4.field2217.method691(arg4.field2226, this.method1126(arg4, -128), this.method1146((byte) 76, arg4));
            return false;
        }
        arg4.field2217.method690(arg4.field2226);
        if (arg3 == null) {
            arg4.field2217.method694(arg0);
        } else {
            arg4.field2217.method705(arg3, arg1, arg0);
        }
        if (arg4.field2217.method712()) {
            this.field3517.field3196.method984(arg4.field2217);
        }
        arg4.method757(0);
        if (arg4.field2246 >= 0) {
            arg4.method799(-24265);
            if (arg4.field2234 > 0 && this.field3498[arg4.field2250][arg4.field2234] == arg4) {
                this.field3498[arg4.field2250][arg4.field2234] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
    public final synchronized int method707() {
        field3472++;
        return 0;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(II)V")
    public final synchronized void method1140(int arg0, int arg1) {
        this.field3468 = arg1;
        field3515++;
        int var3 = -55 / ((82 - arg0) / 32);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lkc;I)Z")
    public final boolean method1141(class101 arg0, int arg1) {
        field3482++;
        if (arg0.field2217 != null) {
            if (arg1 > -18) {
                this.method1147((byte) 92, 86);
            }
            return false;
        }
        if (arg0.field2246 >= 0) {
            arg0.method799(-24265);
            if (arg0.field2234 > 0 && this.field3498[arg0.field2250][arg0.field2234] == arg0) {
                this.field3498[arg0.field2250][arg0.field2234] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(IIII)V")
    private final void method1142(int arg0, int arg1, int arg2, int arg3) {
        field3473++;
        this.method1120((byte) 123, 64, arg0, arg1);
        if ((this.field3453[arg1] & 0x2) != 0) {
            for (class101 var5 = (class101) this.field3517.field3188.method1241((byte) -125); var5 != null; var5 = (class101) this.field3517.field3188.method1231(-18652)) {
                if (var5.field2250 == arg1 && var5.field2246 < 0) {
                    this.field3471[arg1][var5.field2241] = null;
                    this.field3471[arg1][arg0] = var5;
                    int var6 = (var5.field2242 * var5.field2239 >> 12) + var5.field2244;
                    var5.field2244 += arg0 - var5.field2241 << 8;
                    var5.field2242 = 4096;
                    var5.field2241 = arg0;
                    var5.field2239 = var6 - var5.field2244;
                    return;
                }
            }
        }
        class166 var7 = (class166) this.field3481.method796(true, (long) this.field3493[arg1]);
        if (var7 == null) {
            return;
        }
        class10 var8 = var7.field3349[arg0];
        if (var8 == null) {
            return;
        }
        class101 var9 = new class101();
        var9.field2227 = var8;
        var9.field2221 = var7;
        var9.field2250 = arg1;
        var9.field2249 = var7.field3352[arg0];
        var9.field2234 = var7.field3359[arg0];
        var9.field2241 = arg0;
        var9.field2214 = var7.field3357 * arg2 * arg2 * var7.field3360[arg0] + 1024 >> 11;
        var9.field2243 = var7.field3368[arg0] & 0xFF;
        var9.field2244 = (arg0 << 8) - (var7.field3353[arg0] & 0x7FFF);
        if (arg3 != 312) {
            return;
        }
        var9.field2246 = -1;
        var9.field2235 = 0;
        var9.field2233 = 0;
        var9.field2229 = 0;
        var9.field2248 = 0;
        if (this.field3502[arg1] == 0) {
            var9.field2217 = class94.method695(var8, this.method1144(2830, var9), this.method1126(var9, -128), this.method1146((byte) 76, var9));
        } else {
            var9.field2217 = class94.method695(var8, this.method1144(2830, var9), 0, this.method1146((byte) 76, var9));
            this.method1134(var7.field3353[arg0] < 0, false, var9);
        }
        if (var7.field3353[arg0] < 0) {
            var9.field2217.method711(-1);
        }
        if (var9.field2234 >= 0) {
            class101 var10 = this.field3498[arg1][var9.field2234];
            if (var10 != null && var10.field2246 < 0) {
                this.field3471[arg1][var10.field2241] = null;
                var10.field2246 = 0;
            }
            this.field3498[arg1][var9.field2234] = var9;
        }
        this.field3517.field3188.method1236((byte) -79, var9);
        this.field3471[arg1][arg0] = var9;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public final synchronized void method1143(byte arg0) {
        for (class166 var2 = (class166) this.field3481.method790(-118); var2 != null; var2 = (class166) this.field3481.method794((byte) 90)) {
            var2.method799(-24265);
        }
        if (arg0 <= -58) {
            field3513++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILkc;)I")
    private final int method1144(int arg0, class101 arg1) {
        field3483++;
        int var3 = (arg1.field2242 * arg1.field2239 >> 12) + arg1.field2244;
        class165 var4 = arg1.field2249;
        int var5 = ((this.field3475[arg1.field2250] - 8192) * this.field3484[arg1.field2250] >> 12) + var3;
        if (var4.field3338 > 0 && (var4.field3341 > 0 || this.field3462[arg1.field2250] > 0)) {
            int var6 = var4.field3341 << 2;
            int var7 = var4.field3336 << 1;
            if (var7 > arg1.field2245) {
                var6 = arg1.field2245 * var6 / var7;
            }
            int var8 = (this.field3462[arg1.field2250] >> 7) + var6;
            double var9 = Math.sin((double) (arg1.field2220 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        if (arg0 != 2830) {
            this.method1150(1);
        }
        int var11 = (int) ((double) (arg1.field2227.field196 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class150.field3136 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1145(byte arg0, String arg1, Throwable arg2) {
        field3509++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class102.method760((byte) 118, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (arg0 == -65 && class205.field4102.field907 != null) {
                class76 var8 = class205.field4102.method388(3927, new URL(class205.field4102.field907.getCodeBase(), "clienterror.ws?c=" + class5.field91 + "&u=" + class148.field3104 + "&v1=" + class41.field899 + "&v2=" + class41.field905 + "&e=" + var7));
                while (var8.field1806 == 0) {
                    class204.method1347(1L, false);
                }
                if (var8.field1806 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1804;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLkc;)I")
    private final int method1146(byte arg0, class101 arg1) {
        field3492++;
        if (arg0 != 76) {
            this.method1122(-101, 111, false);
        }
        int var3 = this.field3487[arg1.field2250];
        return var3 < 8192 ? arg1.field2243 * var3 + 32 >> 6 : 16384 - ((128 - arg1.field2243) * (-var3 + 16384) + 32 >> 6);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
    private final void method1147(byte arg0, int arg1) {
        if ((this.field3453[arg1] & 0x4) != 0) {
            for (class101 var3 = (class101) this.field3517.field3188.method1232(25831); var3 != null; var3 = (class101) this.field3517.field3188.method1238(22622)) {
                if (var3.field2250 == arg1) {
                    var3.field2237 = 0;
                }
            }
        }
        field3455++;
        if (arg0 > -107) {
            this.method1134(true, true, null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([III)V")
    public final synchronized void method705(int[] arg0, int arg1, int arg2) {
        if (this.field3495.method1268()) {
            int var4 = this.field3495.field3878 * this.field3458 / class150.field3136;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3520;
                if (this.field3518 - var5 >= 0L) {
                    this.field3520 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field3518 - this.field3520 - 1L) / (long) var4);
                arg2 -= var7;
                this.field3520 += (long) var4 * (long) var7;
                this.field3517.method705(arg0, arg1, var7);
                arg1 += var7;
                this.method1123(false);
            } while (this.field3495.method1268());
        }
        field3514++;
        this.field3517.method705(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(II)V")
    private final void method1148(int arg0, int arg1) {
        if ((this.field3453[arg0] & 0x2) != 0) {
            for (class101 var3 = (class101) this.field3517.field3188.method1232(25831); var3 != null; var3 = (class101) this.field3517.field3188.method1238(22622)) {
                if (var3.field2250 == arg0 && this.field3471[arg0][var3.field2241] == null && var3.field2246 < 0) {
                    var3.field2246 = 0;
                }
            }
        }
        field3467++;
        if (arg1 < 109) {
            this.method1147((byte) -67, -94);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()Lve;")
    public final synchronized class202 method704() {
        field3476++;
        return this.field3517;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(II)V")
    private final void method1149(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        field3454++;
        for (class101 var3 = (class101) this.field3517.field3188.method1232(25831); var3 != null; var3 = (class101) this.field3517.field3188.method1238(22622)) {
            if (arg1 < 0 || var3.field2250 == arg1) {
                if (var3.field2217 != null) {
                    var3.field2217.method690(class150.field3136 / 100);
                    if (var3.field2217.method712()) {
                        this.field3517.field3196.method984(var3.field2217);
                    }
                    var3.method757(0);
                }
                if (var3.field2246 < 0) {
                    this.field3471[var3.field2250][var3.field2241] = null;
                }
                var3.method799(-24265);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public final synchronized void method1150(int arg0) {
        field3474++;
        this.field3495.method1272();
        if (arg0 != 8342426) {
            this.field3493 = null;
        }
        this.method1119((byte) 91);
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(II)V")
    private final void method1151(int arg0, int arg1) {
        field3499++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = arg1 >> 8 & 0x7F;
            int var6 = arg1 >> 16 & 0x7F;
            this.method1120((byte) 123, var6, var5, var4);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = arg1 >> 8 & 0x7F;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method1120((byte) 123, 64, var8, var7);
            } else {
                this.method1142(var8, var7, var9, 312);
            }
        } else if (var3 == 160) {
            int var10 = arg1 >> 8 & 0x7F;
            int var11 = arg1 & 0xF;
            int var12 = arg1 >> 16 & 0x7F;
            this.method1133(var11, var12, arg0 - 1366093294, var10);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = arg1 >> 8 & 0x7F;
            int var15 = arg1 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field3464[var13] = (var15 << 14) + class208.method1372(this.field3464[var13], -2080769);
            }
            if (var14 == 32) {
                this.field3464[var13] = (var15 << 7) + class208.method1372(this.field3464[var13], -16257);
            }
            if (var14 == 1) {
                this.field3462[var13] = class208.method1372(this.field3462[var13], -16257) + (var15 << 7);
            }
            if (var14 == 33) {
                this.field3462[var13] = var15 + class208.method1372(-128, this.field3462[var13]);
            }
            if (var14 == 5) {
                this.field3486[var13] = class208.method1372(-16257, this.field3486[var13]) + (var15 << 7);
            }
            if (var14 == 37) {
                this.field3486[var13] = class208.method1372(-128, this.field3486[var13]) + var15;
            }
            if (var14 == 7) {
                this.field3451[var13] = class208.method1372(this.field3451[var13], -16257) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field3451[var13] = class208.method1372(-128, this.field3451[var13]) + var15;
            }
            if (var14 == 10) {
                this.field3487[var13] = (var15 << 7) + class208.method1372(-16257, this.field3487[var13]);
            }
            if (var14 == 42) {
                this.field3487[var13] = class208.method1372(this.field3487[var13], -128) + var15;
            }
            if (var14 == 11) {
                this.field3488[var13] = (var15 << 7) + class208.method1372(-16257, this.field3488[var13]);
            }
            if (var14 == 43) {
                this.field3488[var13] = var15 + class208.method1372(-128, this.field3488[var13]);
            }
            if (var14 == 64) {
                if (var15 < 64) {
                    this.field3453[var13] = class208.method1372(this.field3453[var13], -2);
                } else {
                    this.field3453[var13] = class152.method1027(this.field3453[var13], 1);
                }
            }
            if (var14 == 65) {
                if (var15 >= 64) {
                    this.field3453[var13] = class152.method1027(this.field3453[var13], 2);
                } else {
                    this.method1148(var13, 118);
                    this.field3453[var13] = class208.method1372(this.field3453[var13], -3);
                }
            }
            if (var14 == 99) {
                this.field3465[var13] = (var15 << 7) + class208.method1372(127, this.field3465[var13]);
            }
            if (var14 == 98) {
                this.field3465[var13] = class208.method1372(16256, this.field3465[var13]) + var15;
            }
            if (var14 == 101) {
                this.field3465[var13] = (var15 << 7) + class208.method1372(127, this.field3465[var13]) + 16384;
            }
            if (var14 == 100) {
                this.field3465[var13] = class208.method1372(this.field3465[var13], 16256) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method1149(0, var13);
            }
            if (var14 == 121) {
                this.method1131(-27290, var13);
            }
            if (var14 == 123) {
                this.method1127(var13, 0);
            }
            if (var14 == 6) {
                int var16 = this.field3465[var13];
                if (var16 == 16384) {
                    this.field3484[var13] = class208.method1372(-16257, this.field3484[var13]) + (var15 << 7);
                }
            }
            if (var14 == 38) {
                int var17 = this.field3465[var13];
                if (var17 == 16384) {
                    this.field3484[var13] = class208.method1372(-128, this.field3484[var13]) + var15;
                }
            }
            if (var14 == 16) {
                this.field3502[var13] = class208.method1372(this.field3502[var13], -16257) + (var15 << 7);
            }
            if (var14 == 48) {
                this.field3502[var13] = class208.method1372(this.field3502[var13], -128) + var15;
            }
            if (var14 == 81) {
                if (var15 >= 64) {
                    this.field3453[var13] = class152.method1027(this.field3453[var13], 4);
                } else {
                    this.method1147((byte) -112, var13);
                    this.field3453[var13] = class208.method1372(this.field3453[var13], -5);
                }
            }
            if (var14 == 17) {
                this.method1132((var15 << 7) + (this.field3460[var13] & 0xFFFFC07F), var13, 1);
            }
            if (var14 == 49) {
                this.method1132((this.field3460[var13] & 0xFFFFFF80) + var15, var13, 1);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = arg1 >> 8 & 0x7F;
            this.method1137(var18, this.field3464[var18] + var19, 686887528);
        } else {
            if (arg0 != -13931) {
                this.method1120((byte) 22, -64, 61, -69);
            }
            if (var3 == 208) {
                int var20 = arg1 & 0xF;
                int var21 = arg1 >> 8 & 0x7F;
                this.method1124(var21, true, var20);
            } else if (var3 == 224) {
                int var22 = arg1 & 0xF;
                int var23 = (arg1 >> 8 & 0x7F) + ((arg1 & 0x7F013C) >> 9);
                this.method1125(var22, (byte) -56, var23);
            } else {
                int var24 = arg1 & 0xFF;
                if (var24 == 255) {
                    this.method1119((byte) 74);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(II)Z")
    public static final boolean method1152(int arg0, int arg1) {
        if (arg0 != -82) {
            field3470 = -22;
        }
        field3457++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Z")
    public final synchronized boolean method1153(byte arg0) {
        field3448++;
        if (arg0 != -85) {
            this.method1146((byte) 85, null);
        }
        return this.field3495.method1268();
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class173() {
        this.method1119((byte) 77);
    }
}
