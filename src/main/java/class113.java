import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class113 {

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "[J")
    private long[] field1417 = new long[8];

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "[J")
    private long[] field1421 = new long[8];

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    private int field1427 = 0;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "[B")
    private byte[] field1422 = new byte[32];

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    private int field1430 = 0;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "[J")
    private long[] field1429 = new long[8];

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "[B")
    private byte[] field1431 = new byte[64];

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "[J")
    private long[] field1416 = new long[8];

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "[J")
    private long[] field1433 = new long[8];

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "[I")
    public static int[] field1415 = new int[1000];

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "[I")
    public static int[] field1418 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "[I")
    public static int[] field1432;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    private final void method802(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field1429[var2] = class234.method1616(class638.method3630(255L, (long) this.field1431[var3 + 7]), class234.method1616(class638.method3630(255L, (long) this.field1431[var3 + 6]) << 8, class234.method1616(class234.method1616(class234.method1616(class234.method1616(class638.method3630((long) this.field1431[var3 + 2], 255L) << 40, class234.method1616(class638.method3630((long) this.field1431[var3 + 1], 255L) << 48, (long) this.field1431[var3] << 56)), class638.method3630(255L, (long) this.field1431[var3 + 3]) << 32), class638.method3630(0xFFL << 24, (long) this.field1431[var3 + 4] << 24)), class638.method3630(0xFFL << 16, (long) this.field1431[var3 + 5] << 16))));
            var3 += 8;
            var2++;
        }
        field1420++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field1416[var4] = class234.method1616(this.field1429[var4], this.field1433[var4] = this.field1417[var4]);
        }
        if (arg0 <= 100) {
            field1415 = null;
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field1421[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field1421[var7] = class234.method1616(this.field1421[var7], class394.field5584[var13][class111.method773((int) (this.field1433[class111.method773(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1433[var8] = this.field1421[var8];
            }
            this.field1433[0] = class234.method1616(this.field1433[0], class394.field5583[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field1421[var9] = this.field1433[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field1421[var9] = class234.method1616(this.field1421[var9], class394.field5584[var11][class111.method773(255, (int) (this.field1416[class111.method773(7, var9 - var11)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field1416[var10] = this.field1421[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field1417[var6] = class234.method1616(this.field1417[var6], class234.method1616(this.field1429[var6], this.field1416[var6]));
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILwq;IILha;Laa;II)V")
    public static final void method803(int arg0, int arg1, class176 arg2, int arg3, int arg4, class66 arg5, class510 arg6, int arg7, int arg8) {
        field1419++;
        class665 var9 = class247.field3521.method3711((byte) -84, arg8);
        if (arg4 != 8) {
            field1415 = null;
        }
        if (var9 == null || !var9.field9363 || !var9.method3789(class271.field3796, 0)) {
            return;
        }
        if (var9.field9351 != null) {
            int[] var10 = new int[var9.field9351.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var28;
                if (class763.field10510 == 4) {
                    var28 = (int) class562.field8001 & 0x3FFF;
                } else {
                    var28 = (int) class562.field8001 + class77.field1042 & 0x3FFF;
                }
                int var29 = class601.field8476[var28];
                int var30 = class601.field8473[var28];
                if (class763.field10510 != 4) {
                    var29 = var29 * 256 / (class611.field8630 + 256);
                    var30 = var30 * 256 / (class611.field8630 + 256);
                }
                var10[var11 * 2] = arg2.field2673 / 2 + ((var9.field9351[var11 * 2 + 1] * 4 + arg0) * var29 + ((arg7 + (var9.field9351[var11 * 2] * 4)) * var30) >> 14) + arg1;
                var10[var11 * 2 + 1] = arg3 - (((var9.field9351[var11 * 2 + 1] * 4 + arg0) * var30 - (var9.field9351[var11 * 2] * 4 + arg7) * var29 >> 14) - (arg2.field2664 / 2));
            }
            class560.method3256(arg5, var10, var9.field9327, arg2.field2625, arg2.field2509);
            if (var9.field9348 > 0) {
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[(var12 + 1) * 2];
                    int var23 = var10[(var12 + 1) * 2 + 1];
                    if (var22 < var20) {
                        int var24 = var20;
                        var20 = var22;
                        int var25 = var21;
                        var22 = var24;
                        var21 = var23;
                        var23 = var25;
                    } else if (var20 == var22 && var21 > var23) {
                        int var26 = var21;
                        var21 = var23;
                        var23 = var26;
                    }
                    arg5.method479(var20, var21, var22, var23, var9.field9342[var9.field9364[var12] & 0xFF], 1, arg6, arg1, arg3, var9.field9348, var9.field9372, var9.field9373);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var13 > var15) {
                    int var17 = var13;
                    var13 = var15;
                    int var18 = var14;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var14 > var16) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg5.method479(var13, var14, var15, var16, var9.field9342[var9.field9364[var9.field9364.length - 1] & 0xFF], 1, arg6, arg1, arg3, var9.field9348, var9.field9372, var9.field9373);
            } else {
                for (int var27 = 0; var27 < (var10.length / 2 - 1); var27++) {
                    arg5.method414(var10[var27 * 2], var10[var27 * 2 + 1], var10[var27 * 2 + 2], var10[(var27 + 1) * 2 + 1], var9.field9342[var9.field9364[var27] & 0xFF], 1, arg6, arg1, arg3);
                }
                arg5.method414(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field9342[var9.field9364[var9.field9364.length - 1] & 0xFF], 1, arg6, arg1, arg3);
            }
        }
        class112 var31 = null;
        if (var9.field9354 != -1) {
            var31 = var9.method3788(arg5, false, 123);
            if (var31 != null) {
                class395.method2411(arg6, arg0, arg3, var31, arg7, arg1, 1, arg2);
            }
        }
        if (var9.field9326 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method789();
        }
        class67 var33 = class79.field1047;
        class263 var34 = class408.field5763;
        if (var9.field9347 == 1) {
            var34 = class157.field2343;
            var33 = class564.field8008;
        }
        if (var9.field9347 == 2) {
            var33 = class546.field7704;
            var34 = class33.field439;
        }
        class728.method4088(arg6, arg7, arg2, arg1, var32, -30850, var9.field9341, arg0, var34, var9.field9326, var33, arg3);
        return;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[B)V")
    public final void method804(int arg0, int arg1, byte[] arg2) {
        this.field1431[this.field1430] = (byte) class281.method1904(this.field1431[this.field1430], 0x80 >>> class111.method773(7, this.field1427));
        field1426++;
        this.field1430++;
        if (this.field1430 > 32) {
            while (true) {
                if (this.field1430 >= 64) {
                    this.method802((byte) 108);
                    this.field1430 = 0;
                    break;
                }
                this.field1431[this.field1430++] = 0;
            }
        }
        while (this.field1430 < 32) {
            this.field1431[this.field1430++] = 0;
        }
        class42.method288(this.field1422, 0, this.field1431, 32, 32);
        this.method802((byte) 116);
        if (arg0 <= 44) {
            method808(83);
        }
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field1417[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILeha;)V")
    public static final void method805(int arg0, class98 arg1) {
        arg1.field1251 = false;
        if (arg1.field1254 != null) {
            arg1.field1254.field868 = 0;
        }
        field1425++;
        if (arg0 != 23190) {
            method807(47);
        }
        for (class98 var2 = arg1.method687(); var2 != null; var2 = arg1.method688()) {
            method805(23190, var2);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    public final void method806(boolean arg0) {
        field1424++;
        if (!arg0) {
            method805(-10, null);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            this.field1422[var2] = 0;
        }
        this.field1431[0] = 0;
        this.field1427 = this.field1430 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field1417[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static void method807(int arg0) {
        if (arg0 != 4) {
            method803(126, 32, null, -94, -84, null, null, -125, 114);
        }
        field1432 = null;
        field1418 = null;
        field1415 = null;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
    public static final void method808(int arg0) {
        field1428++;
        if (arg0 < 95) {
            field1432 = null;
        }
        if (class262.field3703 != null) {
            class262.field3703.method1652(6000);
        }
        if (class405.field5708 != null) {
            class405.field5708.method1652(6000);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(J[BI)V")
    public final void method809(long arg0, byte[] arg1, int arg2) {
        field1414++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field1427 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field1422[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field1422[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        if (arg2 < 21) {
            field1432 = null;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field1431[this.field1430] = (byte) class281.method1904(this.field1431[this.field1430], var15 >>> var7);
            this.field1427 += 8 - var7;
            this.field1430++;
            if (this.field1427 == 512) {
                this.method802((byte) 114);
                this.field1427 = this.field1430 = 0;
            }
            this.field1431[this.field1430] = (byte) class111.method773(var15 << 8 - var7, 255);
            this.field1427 += var7;
            arg0 -= 8L;
            var5++;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field1431[this.field1430] = (byte) class281.method1904(this.field1431[this.field1430], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field1427 = (int) ((long) this.field1427 + arg0);
            return;
        }
        this.field1427 += 8 - var7;
        long var13 = arg0 - (long) (8 - var7);
        this.field1430++;
        if (this.field1427 == 512) {
            this.method802((byte) 114);
            this.field1427 = this.field1430 = 0;
        }
        this.field1431[this.field1430] = (byte) class111.method773(255, var12 << 8 - var7);
        this.field1427 += (int) var13;
    }
}
