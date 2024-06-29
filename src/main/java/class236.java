import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class236 extends class406 {

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!dg", name = "Eb", descriptor = "[B")
    public byte[] field3364;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "[I")
    public static int[] field3326 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!dg", name = "pb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!dg", name = "qb", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!dg", name = "rb", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!dg", name = "sb", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!dg", name = "tb", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!dg", name = "ub", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!dg", name = "vb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!dg", name = "wb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!dg", name = "xb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!dg", name = "yb", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!dg", name = "zb", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!dg", name = "Ab", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!dg", name = "Bb", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!dg", name = "Cb", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!dg", name = "Db", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Ltq;")
    public static class376 field3334;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)I", line = 9)
    public final int method1556(byte arg0) {
        int var2 = -108 % ((arg0 - 57) / 41);
        field3311++;
        return 128 - this.field3364[this.field3320++] & 0xFF;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V", line = 19)
    public final void method1557(int arg0, int arg1) {
        if (arg0 == 301673864) {
            field3313++;
            this.field3364[this.field3320++] = (byte) (-arg1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V", line = 31)
    public final void method1558(boolean arg0, BigInteger arg1, BigInteger arg2) {
        field3300++;
        int var4 = this.field3320;
        this.field3320 = 0;
        byte[] var5 = new byte[var4];
        this.method1570(var5, var4, 0, -1);
        BigInteger var6 = new BigInteger(var5);
        if (!arg0) {
            this.method1600(-13);
        }
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field3320 = 0;
        this.method1583(var8.length, (byte) -107);
        this.method1571(var8, 105, var8.length, 0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[I)V", line = 58)
    public final void method1559(int arg0, int[] arg1) {
        field3339++;
        int var3 = this.field3320 / 8;
        this.field3320 = 0;
        for (int var4 = arg0; var4 < var3; var4++) {
            int var5 = this.method1597(arg0 ^ 0xE39);
            int var6 = this.method1597(3641);
            int var7 = 0;
            int var8 = -1640531527;
            int var9 = 32;
            while ((var9--) > 0) {
                var5 += (var6 >>> 5 ^ var6 << 4) + var6 ^ var7 - -arg1[var7 & 0x3];
                var7 += var8;
                var6 += (var5 >>> 5 ^ var5 << 4) + var5 ^ var7 - -arg1[(var7 & 0x1F9A) >>> 11];
            }
            this.field3320 -= 8;
            this.method1603(var5, 871);
            this.method1603(var6, 871);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V", line = 96)
    public final void method1560(int arg0, int arg1) {
        field3328++;
        if (arg0 >= 0 && arg0 < 128) {
            this.method1583(arg0, (byte) -70);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method1605(arg0 + 32768, false);
        } else {
            if (arg1 >= -103) {
                field3334 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)Ljava/lang/String;", line = 124)
    public final String method1561(byte arg0) {
        field3345++;
        byte var2 = this.field3364[this.field3320++];
        if (var2 != 0) {
            throw new IllegalStateException("Bad version number in gjstr2");
        }
        int var3 = this.field3320;
        while (this.field3364[this.field3320++] != 0) {
        }
        if (arg0 == -121) {
            int var4 = this.field3320 - var3 - 1;
            return var4 == 0 ? "" : class180.method1218(arg0 ^ 0xFFFFC36A, var4, var3, this.field3364);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 151)
    public final String method1562(boolean arg0) {
        field3299++;
        int var2 = this.field3320;
        while (this.field3364[this.field3320++] != 0) {
        }
        int var3 = this.field3320 - var2 - 1;
        if (var3 == 0) {
            return "";
        } else {
            if (arg0) {
                this.method1594(8);
            }
            return class180.method1218(15597, var3, var2, this.field3364);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V", line = 176)
    public final void method1563(int arg0, int arg1) {
        this.field3364[this.field3320++] = (byte) (arg1 >> 8);
        field3350++;
        this.field3364[this.field3320++] = (byte) (arg1 + 128);
        if (arg0 != -2) {
            this.method1600(87);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)V", line = 188)
    public final void method1564(int arg0, int arg1) {
        this.field3364[this.field3320++] = (byte) (arg0 >> 16);
        field3358++;
        this.field3364[this.field3320++] = (byte) (arg0 >> 24);
        this.field3364[this.field3320++] = (byte) arg0;
        if (arg1 >= 104) {
            this.field3364[this.field3320++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V", line = 202)
    public final void method1565(byte arg0, int arg1) {
        if ((arg1 & 0xFFFFFF80) != 0) {
            if ((arg1 & 0xFFFFC000) != 0) {
                if ((arg1 & 0xFFE00000) != 0) {
                    if ((arg1 & 0xF0000000) != 0) {
                        this.method1583(arg1 >>> 28 | 0x80, (byte) -76);
                    }
                    this.method1583(arg1 >>> 21 | 0x80, (byte) -106);
                }
                this.method1583(arg1 >>> 14 | 0x80, (byte) -64);
            }
            this.method1583((arg1 | 0x4044) >>> 7, (byte) -57);
        }
        if (arg0 <= 47) {
            this.field3320 = 60;
        }
        field3316++;
        this.method1583(arg1 & 0x7F, (byte) -71);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I", line = 235)
    public final int method1566(int arg0) {
        if (arg0 != -3451) {
            field3334 = null;
        }
        this.field3320 += 2;
        field3344++;
        return (this.field3364[this.field3320 - 1] & 0xFF << 8) + (this.field3364[this.field3320 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)I", line = 248)
    public final int method1567(int arg0) {
        if (arg0 != 65280) {
            field3334 = null;
        }
        field3333++;
        return this.field3364[this.field3320++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)Ljava/lang/String;", line = 259)
    public final String method1568(byte arg0) {
        field3303++;
        if (arg0 != -47) {
            this.method1575((byte) 38);
        }
        if (this.field3364[this.field3320] == 0) {
            this.field3320++;
            return null;
        } else {
            return this.method1562(false);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)I", line = 276)
    public final int method1569(int arg0) {
        field3321++;
        this.field3320 += 4;
        return arg0 == -1 ? ((this.field3364[this.field3320 - 3] & 0xFF) << 24) + (this.field3364[this.field3320 - 2] & 0xFF) + ((this.field3364[this.field3320 + -4] & 0xFF) << 16) + ((this.field3364[this.field3320 + -1] & 0xFF) << 8) : -122;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BIII)V", line = 290)
    public final void method1570(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -1) {
            field3361++;
            for (int var5 = arg2; var5 < (arg1 + arg2); var5++) {
                arg0[var5] = this.field3364[this.field3320++];
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "([BIII)V", line = 307)
    public final void method1571(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 46) {
            for (int var5 = arg3; var5 < (arg2 + arg3); var5++) {
                this.field3364[this.field3320++] = arg0[var5];
            }
            field3310++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)J", line = 325)
    public final long method1572(byte arg0, int arg1) {
        field3323++;
        if (arg0 != 85) {
            field3301 = 21;
        }
        int var6 = arg1 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        int var3 = var6 * 8;
        long var4 = 0L;
        while (var3 >= 0) {
            var4 |= ((long) this.field3364[this.field3320++] & 0xFFL) << var3;
            var3 -= 8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)B", line = 361)
    public final byte method1573(int arg0) {
        field3346++;
        return arg0 == 0 ? (byte) (-this.field3364[this.field3320++]) : 53;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I", line = 372)
    public final int method1574(int arg0) {
        if (arg0 > -2) {
            field3301 = 120;
        }
        field3307++;
        return this.field3364[this.field3320++] & 0xFF;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(B)I", line = 392)
    public final int method1575(byte arg0) {
        if (arg0 <= 92) {
            return -22;
        } else {
            field3302++;
            return -this.field3364[this.field3320++] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[I)V", line = 408)
    public final void method1576(int arg0, int arg1, int arg2, int[] arg3) {
        field3354++;
        if (arg1 < 56) {
            return;
        }
        int var5 = this.field3320;
        this.field3320 = arg0;
        int var6 = (arg2 - arg0) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method1597(3641);
            int var9 = this.method1597(3641);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while ((var12--) > 0) {
                var9 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg3[(var10 & 0x1932) >>> 11] + var10;
                var10 -= var11;
                var8 -= arg3[var10 & 0x3] + var10 ^ (var9 >>> 5 ^ var9 << 4) + var9;
            }
            this.field3320 -= 8;
            this.method1603(var8, 871);
            this.method1603(var9, 871);
        }
        this.field3320 = var5;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)I", line = 454)
    public final int method1577(int arg0) {
        if (arg0 != -1640531527) {
            this.method1569(60);
        }
        field3317++;
        int var2 = this.field3364[this.field3320] & 0xFF;
        return var2 < 128 ? this.method1574(-16) - 64 : this.method1617((byte) 48) + -49152;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)I", line = 481)
    public final int method1578(boolean arg0) {
        if (!arg0) {
            field3301 = -23;
        }
        field3357++;
        this.field3320 += 2;
        int var2 = ((this.field3364[this.field3320 - 2] & 0xFF) << 8) + (this.field3364[this.field3320 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII[B)V", line = 498)
    public final void method1579(byte arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = arg1 + arg2 - 1; var5 >= arg2; var5--) {
            arg3[var5] = this.field3364[this.field3320++];
        }
        if (arg0 <= 21) {
            field3334 = null;
        }
        field3304++;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(B)I", line = 515)
    public final int method1580(byte arg0) {
        if (arg0 > -23) {
            this.method1563(-115, 50);
        }
        this.field3320 += 4;
        field3314++;
        return (this.field3364[this.field3320 - 4] & 0xFF) + ((this.field3364[this.field3320 - 2] & 0xFF) << 16) + ((this.field3364[this.field3320 - 1] & 0xFF << 24) - -((this.field3364[this.field3320 + -3] & 0xFF) << 8));
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lae;I)V", line = 531)
    public static final void method1581(class134 arg0, int arg1) {
        field3352++;
        arg0.method660(0, 0, class330.field4671, 350);
        if (arg1 != 8) {
            method1607(-10);
        }
        arg0.method653(0, 0, class330.field4671, 350, class405.field5843 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class255.field3673[var2];
            int var14 = class210.field2989[var2];
            arg0.method653(var13, var14, 2, 2, class202.field2908[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class22.field276;
        if (class345.field4888 > 0) {
            int var4 = 342 - class22.field276;
            int var5 = var3 * var4 / (class345.field4888 + var3 - 1);
            int var6 = 4;
            if (class345.field4888 > 1) {
                var6 += (class345.field4888 - class101.field1235 - 1) * (var4 - var5) / (class345.field4888 - 1);
            }
            arg0.method653(class330.field4671 - 16, var6, 12, var5, class405.field5843 << 24 | 0x332277, 2);
            for (int var7 = class101.field1235; class101.field1235 + var3 > var7 && var7 < class345.field4888; var7++) {
                String[] var8 = class409.method2618(1, class411.field5899[var7], '\b');
                int var9 = (class330.field4671 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg0.method660(var11, 0, var9 + var11 - 8, 350);
                    class73.field874.method1767(-16777216, var11, -1, var8[var10], 350 - class294.field4099 - (class130.field1582.field4997 - -((-class101.field1235 + var7) * class22.field276)) - 2, 4);
                }
            }
        }
        arg0.method660(0, 0, class330.field4671, 350);
        arg0.method826((byte) -82, class330.field4671, 0, 350 - class294.field4099, -1);
        class174.field2391.method1767(-16777216, 10, -1, "--> " + class377.field5318, 350 - class371.field5232.field4997 - 1, 4);
        int var12 = -1;
        if (class189.field2726 % 30 > 15) {
            var12 = 16777215;
        }
        arg0.method821(-127, 350 - class371.field5232.field4997 - 11, class371.field5232.method2264("--> " + class377.field5318.substring(0, class18.field209), arg1 + 116) + 10, 12, var12);
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)I", line = 606)
    public final int method1582(int arg0) {
        field3332++;
        byte var2 = this.field3364[this.field3320++];
        if (arg0 != -7745) {
            return 30;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 0x7F | var3) << 7;
            var2 = this.field3364[this.field3320++];
        }
        return var3 | var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 628)
    public final void method1583(int arg0, byte arg1) {
        this.field3364[this.field3320++] = (byte) arg0;
        if (arg1 <= -44) {
            field3351++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(II)V", line = 642)
    public final void method1584(int arg0, int arg1) {
        if (arg0 != 12299) {
            this.field3320 = 20;
        }
        this.field3364[this.field3320 - arg1 - 1] = (byte) arg1;
        field3353++;
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)I", line = 653)
    public final int method1585(int arg0) {
        int var2 = 2 / ((arg0 - 48) / 55);
        this.field3320 += 2;
        field3337++;
        return ((this.field3364[this.field3320 - 1] & 0xFF) << 8) + (this.field3364[this.field3320 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(B)I", line = 683)
    public final int method1586(byte arg0) {
        this.field3320 += 2;
        if (arg0 <= 68) {
            return -107;
        }
        field3360++;
        int var2 = (this.field3364[this.field3320 - 1] & 0xFF << 8) + (this.field3364[this.field3320 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V", line = 701)
    public final void method1587(int arg0, boolean arg1) {
        this.field3364[this.field3320++] = (byte) arg0;
        field3324++;
        this.field3364[this.field3320++] = (byte) (arg0 >> 8);
        if (!arg1) {
            field3326 = null;
        }
        this.field3364[this.field3320++] = (byte) (arg0 >> 16);
        this.field3364[this.field3320++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(II)V", line = 717)
    public final void method1588(int arg0, int arg1) {
        field3319++;
        this.field3364[this.field3320++] = (byte) arg1;
        if (arg0 != 128) {
            this.method1611(95, -95);
        }
        this.field3364[this.field3320++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(Z)B", line = 729)
    public final byte method1589(boolean arg0) {
        if (arg0) {
            return 95;
        } else {
            field3335++;
            return this.field3364[this.field3320++];
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(Z)I", line = 740)
    public final int method1590(boolean arg0) {
        field3343++;
        this.field3320 += 2;
        if (arg0) {
            this.method1606(-68, (byte) 98);
        }
        return (this.field3364[this.field3320 - 2] & 0xFF << 8) + (this.field3364[this.field3320 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "(I)V", line = 757)
    public static final void method1591(int arg0) {
        field3341++;
        if (class29.field360 > 0) {
            class71.method407(0);
            return;
        }
        class450.field6450 = class146.field1798;
        class146.field1798 = null;
        class178.method1210(40, -105);
        if (arg0 != 1045632600) {
            method1591(-52);
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(Z)Z", line = 777)
    public final boolean method1592(boolean arg0) {
        field3330++;
        this.field3320 -= 4;
        if (arg0) {
            return false;
        } else {
            int var2 = class225.method1500(this.field3320, (byte) 5, 0, this.field3364);
            int var3 = this.method1597(3641);
            return var2 == var3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "(I)V", line = 796)
    public static void method1593(int arg0) {
        field3334 = null;
        field3326 = null;
        if (arg0 >= -123) {
            field3326 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "(I)I", line = 807)
    public final int method1594(int arg0) {
        if (arg0 > -10) {
            this.method1588(3, 19);
        }
        field3327++;
        int var2 = this.field3364[this.field3320] & 0xFF;
        return var2 >= 128 ? this.method1617((byte) 48) - 32768 : this.method1574(-41);
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(II)I", line = 826)
    public final int method1595(int arg0, int arg1) {
        field3347++;
        int var3 = class225.method1500(this.field3320, (byte) 127, arg1, this.field3364);
        this.method1603(var3, 871);
        int var4 = -80 / ((arg0 + 20) / 50);
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 842)
    public final void method1596(String arg0, boolean arg1) {
        if (arg1) {
            this.method1569(-100);
        }
        field3325++;
        int var3 = arg0.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("NUL character at " + var3 + " - cannot pjstr");
        }
        this.field3320 += class331.method2135(arg0, this.field3320, 0, -57, this.field3364, arg0.length());
        this.field3364[this.field3320++] = 0;
    }

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "(I)I", line = 864)
    public final int method1597(int arg0) {
        field3340++;
        if (arg0 != 3641) {
            this.method1603(120, -57);
        }
        this.field3320 += 4;
        return ((this.field3364[this.field3320 - 2] & 0xFF) << 8) + ((this.field3364[this.field3320 - 3] & 0xFF << 16) + (this.field3364[this.field3320 - 4] & 0xFF << 24) + (this.field3364[this.field3320 - 1] & 0xFF));
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IB)V", line = 876)
    public final void method1598(int arg0, byte arg1) {
        this.field3364[this.field3320++] = (byte) (arg0 >> 16);
        field3308++;
        this.field3364[this.field3320++] = (byte) (arg0 >> 8);
        this.field3364[this.field3320++] = (byte) arg0;
        if (arg1 != 56) {
            this.field3320 = 88;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IZ)V", line = 890)
    public final void method1599(int arg0, boolean arg1) {
        this.field3364[this.field3320++] = (byte) arg0;
        if (arg1) {
            field3362++;
            this.field3364[this.field3320++] = (byte) (arg0 >> 8);
            this.field3364[this.field3320++] = (byte) (arg0 >> 16);
            this.field3364[this.field3320++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "(I)J", line = 905)
    public final long method1600(int arg0) {
        field3322++;
        long var2 = (long) this.method1597(3641) & 0xFFFFFFFFL;
        long var4 = (long) this.method1597(3641) & 0xFFFFFFFFL;
        if (arg0 != -1) {
            this.method1576(75, 29, 111, (int[]) null);
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(Z)I", line = 920)
    public final int method1601(boolean arg0) {
        if (!arg0) {
            this.field3364 = null;
        }
        field3331++;
        int var2 = 0;
        int var3;
        for (var3 = this.method1594(-40); var3 == 32767; var3 = this.method1594(-72)) {
            var2 += 32767;
        }
        return var2 + var3;
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(Z)I", line = 946)
    public final int method1602(boolean arg0) {
        field3336++;
        this.field3320 += 4;
        return arg0 ? (-16777216 & this.field3364[this.field3320 - 2] << 24) + ((this.field3364[this.field3320 - 1] & 0xFF) << 16) + (this.field3364[this.field3320 + -4] & 0xFF << 8) + (this.field3364[this.field3320 - 3] & 0xFF) : -69;
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(II)V", line = 958)
    public final void method1603(int arg0, int arg1) {
        this.field3364[this.field3320++] = (byte) (arg0 >> 24);
        field3355++;
        if (arg1 != 871) {
            this.method1608(93, 51, 16L);
        }
        this.field3364[this.field3320++] = (byte) (arg0 >> 16);
        this.field3364[this.field3320++] = (byte) (arg0 >> 8);
        this.field3364[this.field3320++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(BI)V", line = 981)
    public final void method1604(byte arg0, int arg1) {
        field3359++;
        if (arg0 != -105) {
            this.method1578(true);
        }
        this.field3364[this.field3320 - arg1 - 4] = (byte) (arg1 >> 24);
        this.field3364[this.field3320 - arg1 - 3] = (byte) (arg1 >> 16);
        this.field3364[this.field3320 - arg1 - 2] = (byte) (arg1 >> 8);
        this.field3364[this.field3320 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(IZ)V", line = 995)
    public final void method1605(int arg0, boolean arg1) {
        field3363++;
        this.field3364[this.field3320++] = (byte) (arg0 >> 8);
        this.field3364[this.field3320++] = (byte) arg0;
        if (arg1) {
            this.method1567(-35);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(IB)V", line = 1010)
    public final void method1606(int arg0, byte arg1) {
        this.field3364[this.field3320++] = (byte) (128 - arg0);
        if (arg1 != -48) {
            this.method1575((byte) -32);
        }
        field3356++;
    }

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "(I)I", line = 1021)
    public static final int method1607(int arg0) {
        field3329++;
        try {
            if (class72.field870 == arg0) {
                if ((class175.method1195(arg0 + 71) - 5000L) < class113.field1392) {
                    return 0;
                }
                class399.field5703 = class14.field185.method1268(class253.field3616, (byte) -84, class99.field1207);
                class123.field1519 = class175.method1195(arg0 ^ 0x6E);
                class72.field870 = 1;
            }
            if (class175.method1195(arg0 ^ 0x4E) > class123.field1519 + 30000L) {
                return class244.method1657(1000, arg0 - 5);
            }
            if (class72.field870 == 1) {
                if (class399.field5703.field4498 == 2) {
                    return class244.method1657(1001, -5);
                }
                if (class399.field5703.field4498 != 1) {
                    return -1;
                }
                class146.field1798 = new class202((Socket) class399.field5703.field4497, class14.field185);
                class399.field5703 = null;
                int var1 = 0;
                if (class141.field1741) {
                    var1 = class448.field6439;
                }
                class62.field718.field3320 = 0;
                class62.field718.method1583(23, (byte) -92);
                class62.field718.method1603(var1, 871);
                class146.field1798.method1337(class62.field718.field3320, (byte) -61, 0, class62.field718.field3364);
                if (class81.field942 != null) {
                    class81.field942.method137(-15326);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(arg0 - 15326);
                }
                int var2 = class146.field1798.method1344((byte) -103);
                if (class81.field942 != null) {
                    class81.field942.method137(-15326);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(-15326);
                }
                if (var2 != 0) {
                    return class244.method1657(var2, -5);
                }
                class72.field870 = 2;
            }
            if (class72.field870 == 2) {
                if (class146.field1798.method1340(0) < 2) {
                    return -1;
                }
                class406.field5857 = class146.field1798.method1344((byte) -103);
                class406.field5857 <<= 0x8;
                class406.field5857 += class146.field1798.method1344((byte) -103);
                class72.field870 = 3;
                class43.field539 = 0;
                class346.field4891 = new byte[class406.field5857];
            }
            if (class72.field870 != 3) {
                return -1;
            }
            int var3 = class146.field1798.method1340(0);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class406.field5857 - class43.field539) {
                var3 = class406.field5857 - class43.field539;
            }
            class146.field1798.method1336((byte) 125, class346.field4891, class43.field539, var3);
            class43.field539 += var3;
            if (class406.field5857 > class43.field539) {
                return -1;
            } else if (class217.method1455(class346.field4891, -116)) {
                class355.field5009 = new class130[class338.field4801];
                int var4 = 0;
                for (int var5 = class86.field977; var5 <= class180.field2462; var5++) {
                    class130 var6 = class106.method586((byte) 60, var5);
                    if (var6 != null) {
                        class355.field5009[var4++] = var6;
                    }
                }
                class385.field5435 = 0;
                class101.field1234 = null;
                class146.field1798.method1343((byte) -111);
                class72.field870 = 0;
                class346.field4891 = null;
                class146.field1798 = null;
                class210.field2991 = 0;
                class113.field1392 = class175.method1195(120);
                return 0;
            } else {
                return class244.method1657(1002, -5);
            }
        } catch (IOException var7) {
            return class244.method1657(1003, -5);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIJ)V", line = 1158)
    public final void method1608(int arg0, int arg1, long arg2) {
        field3318++;
        int var7 = arg1 - 1;
        if (var7 < 0 || var7 > 7) {
            throw new IllegalArgumentException();
        }
        int var5 = -105 / ((81 - arg0) / 35);
        for (int var6 = var7 * 8; var6 >= 0; var6 -= 8) {
            this.field3364[this.field3320++] = (byte) ((int) (arg2 >> var6));
        }
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(II)V", line = 1189)
    public final void method1609(int arg0, int arg1) {
        if (arg1 == 5544) {
            field3309++;
            this.field3364[this.field3320++] = (byte) arg0;
            this.field3364[this.field3320++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "(II)V", line = 1202)
    public final void method1610(int arg0, int arg1) {
        this.field3364[this.field3320++] = (byte) (arg0 >> 8);
        field3349++;
        this.field3364[this.field3320++] = (byte) arg0;
        this.field3364[this.field3320++] = (byte) (arg0 >> 24);
        this.field3364[this.field3320++] = (byte) (arg0 >> 16);
        if (arg1 <= 12) {
            this.field3364 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "(II)V", line = 1218)
    public final void method1611(int arg0, int arg1) {
        field3315++;
        this.field3364[this.field3320++] = (byte) (arg1 + 128);
        if (arg0 > -28) {
            this.method1594(-32);
        }
    }

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "(II)V", line = 1235)
    public final void method1612(int arg0, int arg1) {
        field3306++;
        this.field3364[this.field3320++] = (byte) (arg0 + 128);
        if (arg1 != -17029) {
            this.method1577(-112);
        }
        this.field3364[this.field3320++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "(I)I", line = 1253)
    public final int method1613(int arg0) {
        field3305++;
        if (arg0 <= 42) {
            return 82;
        }
        this.field3320 += 2;
        int var2 = ((this.field3364[this.field3320 - 2] & 0xFF) << 8) + (this.field3364[this.field3320 - 1] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(B)Z", line = 1271)
    public static final boolean method1614(byte arg0) {
        field3312++;
        if (class217.field3066) {
            try {
                class368.method2348(class14.field185.field2685, 18, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == -105 ? false : false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(JI)V", line = 1294)
    public final void method1615(long arg0, int arg1) {
        this.field3364[this.field3320++] = (byte) ((int) (arg0 >> 56));
        field3348++;
        this.field3364[this.field3320++] = (byte) ((int) (arg0 >> 48));
        this.field3364[this.field3320++] = (byte) ((int) (arg0 >> 40));
        this.field3364[this.field3320++] = (byte) ((int) (arg0 >> 32));
        this.field3364[this.field3320++] = (byte) ((int) (arg0 >> 24));
        this.field3364[this.field3320++] = (byte) ((int) (arg0 >> 16));
        this.field3364[this.field3320++] = (byte) ((int) (arg0 >> 8));
        if (arg1 < 28) {
            this.method1603(-67, -104);
        }
        this.field3364[this.field3320++] = (byte) ((int) arg0);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V", line = 1314)
    public class236(int arg0) {
        this.field3320 = 0;
        this.field3364 = class129.method799(arg0, true);
    }

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "(Z)I", line = 1323)
    public final int method1616(boolean arg0) {
        field3338++;
        this.field3320 += 3;
        return arg0 ? -13 : (this.field3364[this.field3320 - 3] & 0xFF << 16) - (-(this.field3364[this.field3320 - 2] & 0xFF << 8) - (this.field3364[this.field3320 - 1] & 0xFF));
    }

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "(B)I", line = 1337)
    public final int method1617(byte arg0) {
        this.field3320 += 2;
        field3342++;
        if (arg0 != 48) {
            this.method1596((String) null, true);
        }
        return (this.field3364[this.field3320 - 2] & 0xFF << 8) + (this.field3364[this.field3320 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B)V", line = 1348)
    public class236(byte[] arg0) {
        this.field3364 = arg0;
        this.field3320 = 0;
    }
}
