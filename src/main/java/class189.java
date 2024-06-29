import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class189 extends class129 {

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "[I")
    private final int[] field3014 = new int[this.field2116];

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "[Lmb;")
    public static class133[] field3012 = new class133[4];

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[B")
    private byte[] field3003;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class189(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field2116; var7++) {
            this.field3014[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Lvf;", line = 26)
    public static final class31 method1319(int arg0, byte arg1) {
        field3013++;
        if (arg1 != -8) {
            method1322(69, -61, true, -39, 121, 50, 53);
        }
        class31 var2 = (class31) class127.field2100.method263(2013, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class260.field4370.method157(arg0, 5, (byte) 19);
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method205((byte) 127, new class92(var3));
        }
        class127.field2100.method257(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lk;", line = 53)
    public static final class37 method1320(int arg0, int arg1) {
        field3011++;
        class37 var2 = (class37) class42.field636.method1396(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class251.field4250.method157(class187.method1316(arg1, arg0 + 255), class15.method57(arg1, 22321), (byte) 19);
        class37 var4 = new class37();
        var4.field557 = arg1;
        if (var3 != null) {
            var4.method255(new class92(var3), false);
        }
        var4.method248(128);
        if (~var4.field509 != arg0) {
            var4.method238(method1320(0, var4.field509), (byte) 99, method1320(arg0, var4.field576));
        }
        if (var4.field556 != -1) {
            var4.method247(method1320(0, var4.field556), arg0 - 77, method1320(0, var4.field546));
        }
        if (!class111.field1825 && var4.field526) {
            var4.field533 = false;
            var4.field539 = 0;
            var4.field520 = null;
            var4.field541 = class104.field1709;
            var4.field512 = null;
        }
        class42.field636.method1397((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V", line = 94)
    public static final void method1321(byte arg0) {
        field3006++;
        class170.field2772.method1693(36, false);
        class170.field2772.method738((byte) 99, class221.field3803);
        class133.field2155++;
        int var1 = -53 % ((arg0 - 53) / 43);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZIIII)V", line = 111)
    public static final void method1322(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3001++;
        if (class2.field30 == arg5 && class237.field4066 == arg3 && class190.field3028 == arg4 || class149.method1073((byte) 36)) {
            return;
        }
        class2.field30 = arg5;
        class190.field3028 = arg4;
        class237.field4066 = arg3;
        if (class149.method1073((byte) 89)) {
            class190.field3028 = 0;
        }
        if (arg2) {
            class276.method1889(-128, 28);
        } else {
            class276.method1889(-128, 25);
        }
        class17.method67(class74.field1139, true, 10);
        int var7 = class290.field4936;
        class290.field4936 = (arg3 - 6) * 8;
        int var8 = class120.field2006;
        class120.field2006 = (arg5 - 6) * 8;
        class144.field2296 = class101.method801(class237.field4066 * 8, -1322541556, class2.field30 * 8);
        int var9 = class120.field2006 - var8;
        int var10 = class290.field4936 - var7;
        int var11 = class290.field4936;
        int var12 = class120.field2006;
        if (arg2) {
            class133.field2163 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class204 var17 = class301.field5186[var16];
                if (var17 != null) {
                    var17.field3814 -= var10 * 128;
                    var17.field3821 -= var9 * 128;
                    if (var17.field3821 >= 0 && var17.field3821 <= 13184 && var17.field3814 >= 0 && var17.field3814 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field3828[var18] -= var9;
                            var17.field3846[var18] -= var10;
                        }
                        class288.field4914[class133.field2163++] = var16;
                    } else {
                        class301.field5186[var16].field3435 = null;
                        class301.field5186[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class204 var14 = class301.field5186[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field3828[var15] -= var9;
                        var14.field3846[var15] -= var10;
                    }
                    var14.field3821 -= var9 * 128;
                    var14.field3814 -= var10 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class153 var20 = class5.field50[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field3828[var21] -= var9;
                    var20.field3846[var21] -= var10;
                }
                var20.field3814 -= var10 * 128;
                var20.field3821 -= var9 * 128;
            }
        }
        class7.field85 = arg4;
        if (arg1 <= 9) {
            method1323(-89);
        }
        class268.field4551.method1096(arg0, arg6, false, (byte) -124);
        byte var22 = 104;
        byte var23 = 0;
        byte var24 = 104;
        byte var25 = 1;
        byte var26 = 0;
        if (var9 < 0) {
            var22 = -1;
            var25 = -1;
            var23 = 103;
        }
        byte var27 = 1;
        if (var10 < 0) {
            var24 = -1;
            var26 = 103;
            var27 = -1;
        }
        for (int var28 = var23; var28 != var22; var28 += var25) {
            for (int var29 = var26; var29 != var24; var29 += var27) {
                int var30 = var9 + var28;
                int var31 = var29 + var10;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class7.field72[var32][var28][var29] = class7.field72[var32][var30][var31];
                    } else {
                        class7.field72[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class148 var33 = (class148) class68.field1053.method334(-18673); var33 != null; var33 = (class148) class68.field1053.method335((byte) 94)) {
            var33.field2342 -= var10;
            var33.field2341 -= var9;
            if (var33.field2341 < 0 || var33.field2342 < 0 || var33.field2341 >= 104 || var33.field2342 >= 104) {
                var33.method1444((byte) 89);
            }
        }
        class39.field603 = 0;
        if (arg2) {
            class259.field4361 -= var9;
            class153.field2453 -= var10;
            class21.field221 -= var9;
            class106.field1727 -= var10;
        } else {
            class21.field220 = 1;
        }
        if (class152.field2398 != 0) {
            class152.field2398 -= var9;
            class236.field4062 -= var10;
        }
        if (arg2 && (Math.abs(var9) > 104 || Math.abs(var10) > 104)) {
            class246.method1717(-61);
        }
        class149.field2349 = -1;
        class241.field4113.method328(false);
        class38.field580.method328(false);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 353)
    public static void method1323(int arg0) {
        if (arg0 == 2048) {
            field3012 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IB)V", line = 364)
    public void method1231(int arg0, byte arg1) {
        field3007++;
        this.field3003[this.field3000++] = (byte) (class234.method1648(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 373)
    public final void method600(boolean arg0) {
        this.field3000 = 0;
        field3008++;
        if (arg0) {
            method1321((byte) -113);
        }
        this.field3010 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V", line = 395)
    public final void method603(byte arg0) {
        if (arg0 != -87) {
            return;
        }
        field3002++;
        this.field3010 = Math.abs(this.field3010);
        if (this.field3010 >= 4096) {
            this.field3010 = 4095;
        }
        this.method1231(this.field3000++, (byte) (this.field3010 >> 4));
        this.field3010 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 412)
    public final void method599(int arg0, int arg1, int arg2) {
        this.field3010 += this.field3014[arg1] * arg2 >> 12;
        field3004++;
        if (arg0 != -1816054708) {
            method1320(102, -17);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)I", line = 441)
    public static final int method1324(int arg0, int arg1) {
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        int var5 = -6 % ((38 - arg0) / 58);
        field3009++;
        return var2 * var4 >> 12;
    }
}
