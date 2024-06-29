import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class262 {

    @OriginalMember(owner = "client!re", name = "j", descriptor = "[I")
    public static int[] field4452 = new int[32];

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lbe;")
    public static class283 field4451 = class153.method941(127, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!re", name = "v", descriptor = "[J")
    public static long[] field4464 = new long[1000];

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lwc;")
    public static class96 field4462 = new class96(5000);

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Lbe;")
    public static class283 field4469 = class153.method941(125, "hitbar_default");

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "J")
    private long field4461;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "J")
    private long field4467;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Lek;")
    public static class172 field4465;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Lek;")
    public static class172 field4468;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Z")
    public boolean field4460;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "[I")
    private int[] field4453;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "[I")
    private int[] field4459;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 4)
    public static void method1768(int arg0) {
        field4465 = null;
        field4464 = null;
        field4452 = null;
        field4451 = null;
        field4462 = null;
        field4468 = null;
        int var1 = -20 / ((arg0 - 59) / 37);
        field4469 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V", line = 28)
    public final void method1769(boolean arg0, int arg1) {
        field4449++;
        this.field4460 = arg0;
        this.method1771(-31839);
        if (arg1 != 14543) {
            this.field4461 = -42L;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZ)V", line = 40)
    public final void method1770(int arg0, int arg1, boolean arg2) {
        field4448++;
        int var4 = class74.field1299[arg0];
        if (this.field4453[var4] != 0 && class119.method767(arg1, (byte) -88) != null && !arg2) {
            this.field4453[var4] = class53.method337(arg1, Integer.MIN_VALUE);
            this.method1771(-31839);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 62)
    private final void method1771(int arg0) {
        if (arg0 != -31839) {
            field4447 = -5;
        }
        field4457++;
        long var2 = this.field4467;
        this.field4467 = -1L;
        long[] var4 = class284.field4856;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4467 = var4[(int) ((this.field4467 ^ (long) (this.field4453[var5] >> 24)) & 0xFFL)] ^ this.field4467 >>> 8;
            this.field4467 = var4[(int) (((long) (this.field4453[var5] >> 16) ^ this.field4467) & 0xFFL)] ^ this.field4467 >>> 8;
            this.field4467 = var4[(int) (((long) (this.field4453[var5] >> 8) ^ this.field4467) & 0xFFL)] ^ this.field4467 >>> 8;
            this.field4467 = var4[(int) ((this.field4467 ^ (long) this.field4453[var5]) & 0xFFL)] ^ this.field4467 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4467 = this.field4467 >>> 8 ^ var4[(int) (((long) this.field4459[var6] ^ this.field4467) & 0xFFL)];
        }
        this.field4467 = this.field4467 >>> 8 ^ var4[(int) (((long) (this.field4460 ? 1 : 0) ^ this.field4467) & 0xFFL)];
        if (var2 != 0L && this.field4467 != var2) {
            class180.field3091.method1627(var2, true);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([BIZIBI[Lpk;I)V", line = 104)
    public static final void method1772(byte[] arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class104[] arg6, int arg7) {
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field4463++;
        if (arg4 < 107) {
            field4462 = (class96) null;
        }
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg1 + var10) > 0 && (arg1 + var10) < 103 && (arg3 + var11) > 0 && arg3 + var11 < 103) {
                            arg6[var9].field1765[arg1 + var10][arg3 + var11] = class178.method1174(arg6[var9].field1765[arg1 + var10][arg3 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class229 var12 = new class229(arg0);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class210.method1384(arg5, arg2, var12, arg7, var13, -26634, arg3 + var15, 0, arg1 + var14);
                }
            }
        }
        if (arg2) {
            return;
        }
        class149 var16 = null;
        label117: while (true) {
            int var18;
            label110: do {
                while (var12.field3879.length > var12.field3905) {
                    int var17 = var12.method1535((byte) 107);
                    if (var17 != 0) {
                        if (var17 != 1) {
                            throw new IllegalStateException();
                        }
                        var18 = var12.method1535((byte) 126);
                        continue label110;
                    }
                    var16 = new class149(var12);
                }
                if (var16 == null) {
                    var16 = new class149();
                }
                for (int var23 = 0; var23 < 8; var23++) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        int var25 = (arg3 >> 3) + var24;
                        int var26 = (arg1 >> 3) + var23;
                        if (var26 >= 0 && var26 < 13 && var25 >= 0 && var25 < 13) {
                            class197.field3370[var26][var25] = var16;
                        }
                    }
                }
                break label117;
            } while (var18 <= 0);
            for (int var19 = 0; var19 < var18; var19++) {
                class115 var20 = new class115(var12);
                var20.field1947 += arg3 << 7;
                var20.field1936 += arg1 << 7;
                int var21 = var20.field1936 >> 7;
                int var22 = var20.field1947 >> 7;
                if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                    var20.field1923 = class65.field890[var20.field1944][var21][var22] - var20.field1923;
                    class17.method104(var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I", line = 261)
    public static final int method1773(byte arg0) {
        field4446++;
        if (arg0 != 99) {
            field4452 = (int[]) null;
        }
        if (class1.field2 == null) {
            return class71.field1230 ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILui;)[Lhd;", line = 284)
    public static final class113[] method1774(int arg0, class251 arg1) {
        field4456++;
        if (!arg1.method1708((byte) -128)) {
            return new class113[0];
        }
        class310 var2 = arg1.method1705((byte) 96);
        while (var2.field5293 == 0) {
            class2.method11((byte) -20, 10L);
        }
        if (arg0 != 4863) {
            return (class113[]) null;
        } else if (var2.field5293 == 2) {
            return new class113[0];
        } else {
            int[] var3 = (int[]) ((int[]) var2.field5296);
            class113[] var4 = new class113[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class113 var6 = new class113();
                var4[var5] = var6;
                var6.field1906 = var3[var5 << 2];
                var6.field1899 = var3[(var5 << 2) + 1];
                var6.field1908 = var3[(var5 << 2) + 2];
                var6.field1902 = var3[(var5 << 2) + 3];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)V", line = 326)
    public final void method1775(byte arg0, int arg1, int arg2) {
        this.field4459[arg2] = arg1;
        field4454++;
        this.method1771(-31839);
        if (arg0 != -64) {
            field4451 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lek;B)V", line = 339)
    public static final void method1776(class172 arg0, byte arg1) {
        field4458++;
        if (arg1 > -107) {
            method1772((byte[]) null, -25, false, 8, (byte) 107, 119, (class104[]) null, -33);
        }
        class291.field4928 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILdh;II)Lhk;", line = 350)
    public final class289 method1777(int arg0, int arg1, class157 arg2, int arg3, int arg4) {
        field4466++;
        long var6 = (long) (arg3 << 16) | (long) arg1 << 32 | (long) arg1;
        class289 var8 = (class289) class294.field4970.method1629(122, var6);
        if (var8 == null) {
            class165[] var9 = new class165[2];
            int var10 = 0;
            if (!class119.method767(arg1, (byte) -88).method572((byte) 23) || !class119.method767(arg3, (byte) -88).method572((byte) 23)) {
                return null;
            }
            class165 var11 = class119.method767(arg1, (byte) -88).method568((byte) -127);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class165 var12 = class119.method767(arg3, (byte) -88).method568((byte) -127);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class165 var13 = new class165(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class184.field3169[var14].length > this.field4459[var14]) {
                    var13.method1003(class213.field3628[var14], class184.field3169[var14][this.field4459[var14]]);
                }
                if (class30.field447[var14].length > this.field4459[var14]) {
                    var13.method1003(class104.field1803[var14], class30.field447[var14][this.field4459[var14]]);
                }
            }
            var8 = var13.method1012(64, 768, -50, -10, -50);
            class294.field4970.method1630(true, var6, var8);
        }
        if (arg2 != null) {
            var8 = arg2.method959((byte) -66, arg4, var8);
        }
        if (arg0 == 23132) {
            return var8;
        } else {
            return (class289) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I", line = 432)
    public final int method1778(int arg0) {
        field4455++;
        if (arg0 != -921327751) {
            this.method1769(true, -56);
        }
        return this.field4450 == -1 ? (this.field4453[11] << 5) + (this.field4453[8] << 10) + (this.field4453[0] << 15) + (this.field4459[4] << 20) + (this.field4459[0] << 25) + this.field4453[1] : class207.method1379(-63, this.field4450).field2174 + 305419896;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ldh;ILdh;II)Lhk;", line = 447)
    public final class289 method1779(class157 arg0, int arg1, class157 arg2, int arg3, int arg4) {
        field4444++;
        if (this.field4450 != arg4) {
            return class207.method1379(arg4 ^ 0x3E, this.field4450).method802(arg2, arg1, (byte) 111, arg0, arg3);
        }
        int[] var6 = this.field4453;
        long var7 = this.field4467;
        if (arg0 != null && (arg0.field2584 >= 0 || arg0.field2594 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field4453[var9];
            }
            if (arg0.field2584 >= 0) {
                if (arg0.field2584 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class53.method337(arg0.field2584, 1073741824);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg0.field2594 >= 0) {
                if (arg0.field2594 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class53.method337(1073741824, arg0.field2594);
                    var7 ^= (long) var6[3];
                }
            }
        }
        class289 var10 = (class289) class180.field3091.method1629(-42, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var6[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class119.method767(var13 & 0x3FFFFFFF, (byte) -88).method567((byte) 94)) {
                        var11 = true;
                    }
                } else if (!class103.method676(var13 & 0x3FFFFFFF, -1).method2052(this.field4460, (byte) -25)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field4461 != -1L) {
                    var10 = (class289) class180.field3091.method1629(99, this.field4461);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var14 = 0;
                class165[] var15 = new class165[12];
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var6[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class165 var19 = class103.method676(var17 & 0x3FFFFFFF, -1).method2068((byte) -121, this.field4460);
                        if (var19 != null) {
                            var15[var14++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class165 var18 = class119.method767(var17 & 0x3FFFFFFF, (byte) -88).method570(118);
                        if (var18 != null) {
                            var15[var14++] = var18;
                        }
                    }
                }
                int var20 = var6[0];
                if ((var20 & 0x40000000) != 0) {
                    class304 var21 = class103.method676(var20 & 0x3FFFFFFF, -1);
                    if (var21.field5165 != null) {
                        for (int var22 = 0; var22 < var21.field5165.length; var22++) {
                            if (var21.field5165[var22] != null && var15[var22 + 1] != null) {
                                int var23 = var21.field5165[var22][0];
                                int var24 = var21.field5165[var22][1];
                                int var25 = var21.field5165[var22][3];
                                int var26 = var21.field5165[var22][2];
                                int var27 = var21.field5165[var22][4];
                                int var28 = var21.field5165[var22][5];
                                var15[var22 + 1].method1005(var23, var24, var26);
                                var15[var22 + 1].method1015(var25, var27, var28);
                            }
                        }
                    }
                }
                class165 var29 = new class165(var15, var14);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field4459[var30] < class184.field3169[var30].length) {
                        var29.method1003(class213.field3628[var30], class184.field3169[var30][this.field4459[var30]]);
                    }
                    if (this.field4459[var30] < class30.field447[var30].length) {
                        var29.method1003(class104.field1803[var30], class30.field447[var30][this.field4459[var30]]);
                    }
                }
                var10 = var29.method1012(64, 850, -30, -50, -30);
                ((class206) var10).method1335(false, false, true, true, false, false, true);
                class180.field3091.method1630(true, var7, var10);
                this.field4461 = var7;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var10;
        }
        class289 var31;
        if (arg0 != null && arg2 != null) {
            var31 = arg0.method965(var10, (byte) 3, arg2, arg1, arg3);
        } else if (arg0 == null) {
            var31 = arg2.method968((byte) 93, arg3, var10);
        } else {
            var31 = arg0.method968((byte) 111, arg1, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([IIZI[I)V", line = 670)
    public final void method1780(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        field4445++;
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class12.field114; var7++) {
                    class88 var8 = class119.method767(var7, (byte) -88);
                    if (var8 != null && !var8.field1491 && (var6 + (arg2 ? 7 : 0)) == var8.field1493) {
                        arg4[class74.field1299[var6]] = class53.method337(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field4453 = arg4;
        if (arg1 != 0) {
            this.field4459 = (int[]) null;
        }
        this.field4450 = arg3;
        this.field4459 = arg0;
        this.field4460 = arg2;
        this.method1771(-31839);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ldh;II)Lhk;", line = 725)
    public final class289 method1781(class157 arg0, int arg1, int arg2) {
        field4443++;
        if (this.field4450 != -1) {
            return class207.method1379(-63, this.field4450).method808(arg0, arg1, (byte) -100);
        }
        class289 var4 = (class289) class294.field4970.method1629(-70, this.field4467);
        if (arg2 != 0) {
            this.field4461 = 87L;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field4453[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((var7 & Integer.MIN_VALUE) != 0 && !class119.method767(var7 & 0x3FFFFFFF, (byte) -88).method572((byte) 23)) {
                        var5 = true;
                    }
                } else if (!class103.method676(var7 & 0x3FFFFFFF, -1).method2054(this.field4460, -31568)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class165[] var8 = new class165[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field4453[var10];
                if ((var11 & 0x40000000) != 0) {
                    class165 var13 = class103.method676(var11 & 0x3FFFFFFF, -1).method2051(-2655, this.field4460);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                } else if ((var11 & Integer.MIN_VALUE) != 0) {
                    class165 var12 = class119.method767(var11 & 0x3FFFFFFF, (byte) -88).method568((byte) -128);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                }
            }
            class165 var14 = new class165(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class184.field3169[var15].length > this.field4459[var15]) {
                    var14.method1003(class213.field3628[var15], class184.field3169[var15][this.field4459[var15]]);
                }
                if (class30.field447[var15].length > this.field4459[var15]) {
                    var14.method1003(class104.field1803[var15], class30.field447[var15][this.field4459[var15]]);
                }
            }
            var4 = var14.method1012(64, 768, -50, -10, -50);
            class294.field4970.method1630(true, this.field4467, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method959((byte) -36, arg1, var4);
        }
        return var4;
    }
}
