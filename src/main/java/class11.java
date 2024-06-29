import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class176 {

    @OriginalMember(owner = "client!daa", name = "mb", descriptor = "I")
    public int field165 = 0;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "[B")
    public byte[] field138;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "[Loe;")
    public static class170[] field120 = new class170[100];

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!daa", name = "J", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!daa", name = "Q", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!daa", name = "R", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!daa", name = "S", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!daa", name = "T", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!daa", name = "U", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!daa", name = "V", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!daa", name = "W", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!daa", name = "X", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!daa", name = "Y", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!daa", name = "Z", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!daa", name = "ab", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!daa", name = "bb", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!daa", name = "cb", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!daa", name = "db", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!daa", name = "eb", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!daa", name = "fb", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!daa", name = "gb", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!daa", name = "hb", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!daa", name = "ib", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!daa", name = "jb", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!daa", name = "kb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!daa", name = "lb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!daa", name = "nb", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!daa", name = "ob", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!daa", name = "pb", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!daa", name = "qb", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!daa", name = "rb", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!daa", name = "sb", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!daa", name = "tb", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!daa", name = "ub", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!daa", name = "vb", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!daa", name = "wb", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!daa", name = "xb", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!daa", name = "yb", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!daa", name = "zb", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!daa", name = "Ab", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!daa", name = "Bb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!daa", name = "Cb", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)I")
    public final int method60(int arg0) {
        this.field165 += 3;
        field169++;
        if (arg0 != -2097152) {
            field120 = null;
        }
        int var2 = (this.field138[this.field165 - 3] & 0xFF << 16) - (-(this.field138[this.field165 - 2] & 0xFF << 8) - (this.field138[this.field165 - 1] & 0xFF));
        if (var2 > 8388607) {
            var2 -= 16777216;
        }
        return var2;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)V")
    public final void method61(byte arg0, int arg1) {
        if (arg0 >= 12) {
            field155++;
            this.field138[this.field165++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)B")
    public final byte method62(byte arg0) {
        field154++;
        if (arg0 >= -39) {
            this.method122(70, null, -8, 41);
        }
        return (byte) (-this.field138[this.field165++]);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public final String method63(boolean arg0) {
        field139++;
        byte var2 = this.field138[this.field165++];
        if (var2 != 0) {
            throw new IllegalStateException("Bad version number in gjstr2");
        }
        if (!arg0) {
            this.method78(-77);
        }
        int var3 = this.field165;
        while (this.field138[this.field165++] != 0) {
        }
        int var4 = this.field165 - var3 - 1;
        return var4 == 0 ? "" : class231.method1465(var3, 55, var4, this.field138);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public final void method64(BigInteger arg0, BigInteger arg1, int arg2) {
        field124++;
        int var4 = this.field165;
        this.field165 = 0;
        byte[] var5 = new byte[var4];
        this.method75(0, var4, (byte) 124, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field165 = arg2;
        this.method84(var8.length, (byte) -104);
        this.method87(var8, 0, var8.length, 18278);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method65(byte arg0, String arg1) {
        field140++;
        int var3 = -2 / ((arg0 - 25) / 52);
        int var4 = class439.method2588((byte) 52, arg1);
        this.field138[this.field165++] = 0;
        this.method69(var4, 128);
        this.field165 += class347.method2093(this.field138, -112, this.field165, arg1);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V")
    public final void method66(int arg0, boolean arg1) {
        this.field138[this.field165 - arg0 - 1] = (byte) arg0;
        field167++;
        if (arg1) {
            this.field165 = -34;
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)B")
    public final byte method67(int arg0) {
        field134++;
        return arg0 == 65280 ? this.field138[this.field165++] : -105;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
    public final void method68(int arg0, int arg1) {
        field125++;
        this.field138[this.field165++] = (byte) arg1;
        if (arg0 <= 88) {
            this.method100((byte) 26);
        }
        this.field138[this.field165++] = (byte) (arg1 >> 8);
        this.field138[this.field165++] = (byte) (arg1 >> 16);
        this.field138[this.field165++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method108((byte) -128, arg0 >>> 28 | 0x80);
                    }
                    this.method108((byte) -128, arg0 >>> 21 | 0x80);
                }
                this.method108((byte) -128, arg0 >>> 14 | 0x80);
            }
            this.method108((byte) -128, (arg0 | 0x407C) >>> 7);
        }
        if (arg1 == 128) {
            field159++;
            this.method108((byte) -128, arg0 & 0x7F);
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)V")
    public static void method70(byte arg0) {
        if (arg0 >= -15) {
            method70((byte) 28);
        }
        field120 = null;
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(B)I")
    public final int method71(byte arg0) {
        field146++;
        if (arg0 >= -29) {
            this.method113(33, 73);
        }
        return 128 - this.field138[this.field165++] & 0xFF;
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(II)V")
    public final void method72(int arg0, int arg1) {
        this.field138[this.field165++] = (byte) (128 - arg1);
        if (arg0 != -1875) {
            field120 = null;
        }
        field128++;
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(II)V")
    public final void method73(int arg0, int arg1) {
        this.field138[this.field165 - arg0 - 4] = (byte) (arg0 >> 24);
        field181++;
        this.field138[this.field165 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field138[this.field165 - arg0 - 2] = (byte) (arg0 >> 8);
        if (arg1 < 105) {
            this.method63(false);
        }
        this.field138[this.field165 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method74(String arg0, int arg1) {
        field118++;
        int var3 = arg0.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("NUL character at " + var3 + " - cannot pjstr");
        }
        this.field165 += class197.method1215(arg1, arg0.length(), this.field165, this.field138, arg0, -8226);
        this.field138[this.field165++] = 0;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIB[B)V")
    public final void method75(int arg0, int arg1, byte arg2, byte[] arg3) {
        field173++;
        if (arg2 > 101) {
            for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
                arg3[var5] = this.field138[this.field165++];
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IB)V")
    public final void method76(int arg0, byte arg1) {
        this.field138[this.field165++] = (byte) (arg0 >> 8);
        if (arg1 <= 47) {
            this.method116((byte) -7);
        }
        field119++;
        this.field138[this.field165++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "(II)V")
    public final void method77(int arg0, int arg1) {
        if (arg1 != 866399271) {
            this.field138 = null;
        }
        field147++;
        this.field138[this.field165++] = (byte) (arg0 >> 16);
        this.field138[this.field165++] = (byte) (arg0 >> 24);
        this.field138[this.field165++] = (byte) arg0;
        this.field138[this.field165++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)I")
    public final int method78(int arg0) {
        if (arg0 == -8388608) {
            field161++;
            return -this.field138[this.field165++] & 0xFF;
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method79(int arg0) {
        field121++;
        byte var2 = this.field138[this.field165++];
        if (arg0 != var2) {
            throw new IllegalStateException("Bad version number in gUTF8");
        }
        int var3 = this.method123(arg0 ^ 0xFFFFFF8C);
        if (this.field138.length < this.field165 + var3) {
            throw new IllegalStateException("Length of string is longer than available data");
        }
        String var4 = class560.method3189(this.field165, -20962, this.field138, var3);
        this.field165 += var3;
        return var4;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(Z)I")
    public final int method80(boolean arg0) {
        if (!arg0) {
            this.method106(true);
        }
        field157++;
        this.field165 += 4;
        return (this.field138[this.field165 - 2] & 0xFF) + (this.field138[this.field165 - 4] & 0xFF << 16) + ((this.field138[this.field165 + -1] & 0xFF) << 8) + (this.field138[this.field165 + -3] & 0xFF << 24);
    }

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method81(int arg0) {
        field135++;
        if (arg0 != 32767) {
            field120 = null;
        }
        if (this.field138[this.field165] == 0) {
            this.field165++;
            return null;
        } else {
            return this.method100((byte) 118);
        }
    }

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "(I)I")
    public final int method82(int arg0) {
        field145++;
        int var2 = 0;
        int var3 = this.method112(-8838);
        int var4 = 65 % ((-arg0 - 52) / 44);
        while (var3 == 32767) {
            var3 = this.method112(-8838);
            var2 += 32767;
        }
        return var2 + var3;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(IB)J")
    public final long method83(int arg0, byte arg1) {
        int var3 = -22 % ((arg1 - 38) / 44);
        field141++;
        int var7 = arg0 - 1;
        if (var7 < 0 || var7 > 7) {
            throw new IllegalArgumentException();
        }
        int var4 = var7 * 8;
        long var5 = 0L;
        while (var4 >= 0) {
            var5 |= ((long) this.field138[this.field165++] & 0xFFL) << var4;
            var4 -= 8;
        }
        return var5;
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(IB)V")
    public final void method84(int arg0, byte arg1) {
        this.field138[this.field165++] = (byte) (arg0 >> 8);
        field122++;
        if (arg1 <= -89) {
            this.field138[this.field165++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "(I)J")
    public final long method85(int arg0) {
        field170++;
        long var2 = (long) this.method119(-57) & 0xFFFFFFFFL;
        long var4 = (long) this.method119(-32) & 0xFFFFFFFFL;
        if (arg0 >= -92) {
            this.field165 = 0;
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IJZ)V")
    public final void method86(int arg0, long arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        int var6 = arg0 - 1;
        field172++;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        for (int var5 = var6 * 8; var5 >= 0; var5 -= 8) {
            this.field138[this.field165++] = (byte) ((int) (arg1 >> var5));
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([BIII)V")
    public final void method87(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg1; var5 < (arg1 + arg2); var5++) {
            this.field138[this.field165++] = arg0[var5];
        }
        if (arg3 != 18278) {
            this.field138 = null;
        }
        field131++;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
    public final void method88(boolean arg0, int arg1) {
        field151++;
        this.field138[this.field165++] = (byte) (arg1 >> 16);
        if (arg0) {
            this.field138[this.field165++] = (byte) (arg1 >> 8);
            this.field138[this.field165++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(B)I")
    public final int method89(byte arg0) {
        if (arg0 >= -11) {
            return 51;
        } else {
            field152++;
            this.field165 += 3;
            return ((this.field138[this.field165 - 3] & 0xFF) << 16) + (this.field138[this.field165 - 2] & 0xFF << 8) + (this.field138[this.field165 + -1] & 0xFF);
        }
    }

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "(II)V")
    public final void method90(int arg0, int arg1) {
        this.field138[this.field165 - arg1 - 2] = (byte) (arg1 >> 8);
        field150++;
        this.field138[this.field165 - (arg1 + 1)] = (byte) arg1;
        int var3 = -97 / ((-arg0 - 78) / 42);
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(BI)V")
    public final void method91(byte arg0, int arg1) {
        if (arg0 != 88) {
            this.method73(59, 10);
        }
        field153++;
        this.field138[this.field165++] = (byte) arg1;
        this.field138[this.field165++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "(I)I")
    public final int method92(int arg0) {
        this.field165 += 2;
        if (arg0 == 1) {
            field162++;
            return (this.field138[this.field165 - 2] & 0xFF << 8) + (this.field138[this.field165 - 1] - 128 & 0xFF);
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "(B)I")
    public final int method93(byte arg0) {
        if (arg0 <= 71) {
            this.field138 = null;
        }
        field117++;
        this.field165 += 2;
        return ((this.field138[this.field165 - 2] & 0xFF) << 8) + (this.field138[this.field165 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "(I)I")
    public final int method94(int arg0) {
        if (arg0 != 255) {
            method70((byte) 120);
        }
        field133++;
        int var2 = class278.method1793(0, (byte) 121, this.field138, this.field165);
        this.method117(-66, var2);
        return var2;
    }

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "(II)V")
    public final void method95(int arg0, int arg1) {
        if (arg0 != 1412209512) {
            this.method102(-74L, false);
        }
        field142++;
        this.field138[this.field165++] = (byte) arg1;
        this.field138[this.field165++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(Z)I")
    public final int method96(boolean arg0) {
        if (arg0) {
            this.method69(82, 118);
        }
        field144++;
        return this.field138[this.field165++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "(I)I")
    public final int method97(int arg0) {
        field149++;
        int var2 = this.field138[this.field165] & 0xFF;
        if (arg0 != 30570) {
            method70((byte) 109);
        }
        return var2 >= 128 ? this.method93((byte) 75) - 49152 : this.method110((byte) 119) - 64;
    }

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "(I)I")
    public final int method98(int arg0) {
        this.field165 += 2;
        field174++;
        if (arg0 != 25356) {
            this.method95(66, -109);
        }
        return (this.field138[this.field165 - 1] & 0xFF << 8) + (this.field138[this.field165 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(JB)V")
    public static final void method99(long arg0, byte arg1) {
        field163++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 >= -49) {
            field120 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "(B)Ljava/lang/String;")
    public final String method100(byte arg0) {
        field132++;
        int var2 = this.field165;
        while (this.field138[this.field165++] != 0) {
        }
        int var3 = this.field165 - var2 - 1;
        if (arg0 <= 48) {
            this.method62((byte) -87);
        }
        return var3 == 0 ? "" : class231.method1465(var2, 55, var3, this.field138);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IB[II)V")
    public final void method101(int arg0, byte arg1, int[] arg2, int arg3) {
        field123++;
        int var5 = this.field165;
        this.field165 = arg3;
        if (arg1 >= -30) {
            this.field165 = 30;
        }
        int var6 = (arg0 - arg3) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method119(-44);
            int var9 = this.method119(-93);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg2[(var10 & 0x1804) >>> 11] + var10;
                var10 -= var11;
                var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ arg2[var10 & 0x3] + var10;
            }
            this.field165 -= 8;
            this.method117(-110, var8);
            this.method117(81, var9);
        }
        this.field165 = var5;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(JZ)V")
    public final void method102(long arg0, boolean arg1) {
        this.field138[this.field165++] = (byte) ((int) (arg0 >> 56));
        field179++;
        this.field138[this.field165++] = (byte) ((int) (arg0 >> 48));
        this.field138[this.field165++] = (byte) ((int) (arg0 >> 40));
        if (arg1) {
            this.method103((byte) 31);
        }
        this.field138[this.field165++] = (byte) ((int) (arg0 >> 32));
        this.field138[this.field165++] = (byte) ((int) (arg0 >> 24));
        this.field138[this.field165++] = (byte) ((int) (arg0 >> 16));
        this.field138[this.field165++] = (byte) ((int) (arg0 >> 8));
        this.field138[this.field165++] = (byte) ((int) arg0);
    }

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "(B)B")
    public final byte method103(byte arg0) {
        field114++;
        if (arg0 > -10) {
            this.method109(-36, -3);
        }
        return (byte) (128 - this.field138[this.field165++]);
    }

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "(I)I")
    public final int method104(int arg0) {
        field171++;
        this.field165 += 2;
        int var2 = -111 % ((arg0 - 1) / 38);
        return (this.field138[this.field165 - 1] & 0xFF << 8) + (this.field138[this.field165 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "(I)Z")
    public final boolean method105(int arg0) {
        this.field165 -= 4;
        field136++;
        int var2 = class278.method1793(0, (byte) -24, this.field138, this.field165);
        int var3 = this.method119(-26);
        if (var2 == var3) {
            return true;
        } else {
            if (arg0 > -16) {
                this.field138 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(Z)I")
    public final int method106(boolean arg0) {
        this.field165 += 3;
        field160++;
        if (arg0) {
            this.method116((byte) -32);
        }
        return (this.field138[this.field165 - 1] & 0xFF << 16) - (-((this.field138[this.field165 - 2] & 0xFF) << 8) - (this.field138[this.field165 - 3] & 0xFF));
    }

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "(I)I")
    public final int method107(int arg0) {
        if (arg0 != 255) {
            field120 = null;
        }
        field156++;
        this.field165 += 4;
        return ((this.field138[this.field165 - 2] & 0xFF) << 24) + ((this.field138[this.field165 - 1] & 0xFF) << 16) - (-((this.field138[this.field165 + -4] & 0xFF) << 8) - (this.field138[this.field165 + -3] & 0xFF));
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(BI)V")
    public final void method108(byte arg0, int arg1) {
        field164++;
        if (arg0 != -128) {
            this.field138 = null;
        }
        this.field138[this.field165++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "(II)V")
    public final void method109(int arg0, int arg1) {
        field129++;
        this.field138[this.field165++] = (byte) (arg0 + 128);
        this.field138[this.field165++] = (byte) (arg0 >> 8);
        if (arg1 != 255) {
            this.method65((byte) 85, null);
        }
    }

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "(B)I")
    public final int method110(byte arg0) {
        field168++;
        return arg0 <= 22 ? -9 : this.field138[this.field165++] & 0xFF;
    }

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "(I)I")
    public final int method111(int arg0) {
        if (arg0 >= -118) {
            this.field165 = 20;
        }
        this.field165 += 2;
        field143++;
        int var2 = (this.field138[this.field165 - 2] & 0xFF << 8) + (this.field138[this.field165 - 1] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "(I)I")
    public final int method112(int arg0) {
        field180++;
        if (arg0 == -8838) {
            int var2 = this.field138[this.field165] & 0xFF;
            return var2 < 128 ? this.method110((byte) 38) : this.method93((byte) 117) - 32768;
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        field130++;
        if (arg0 >= 0 && arg0 < 128) {
            this.method108((byte) -128, arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method84(arg0 + 32768, (byte) -96);
        } else {
            if (arg1 != 4) {
                this.field138 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/net/Socket;II)Lsq;")
    public static final class153 method114(Socket arg0, int arg1, int arg2) throws IOException {
        field137++;
        return arg2 == Integer.MAX_VALUE ? new class457(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(BI)I")
    public final int method115(byte arg0, int arg1) {
        field177++;
        int var3 = class278.method1793(arg1, (byte) 72, this.field138, this.field165);
        if (arg0 != 0) {
            this.field165 = 45;
        }
        this.method117(-99, var3);
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "(B)B")
    public final byte method116(byte arg0) {
        field148++;
        int var2 = -43 / ((arg0 + 87) / 37);
        return (byte) (this.field138[this.field165++] - 128);
    }

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "(II)V")
    public final void method117(int arg0, int arg1) {
        this.field138[this.field165++] = (byte) (arg1 >> 24);
        field178++;
        this.field138[this.field165++] = (byte) (arg1 >> 16);
        this.field138[this.field165++] = (byte) (arg1 >> 8);
        int var3 = 34 % ((arg0 - 27) / 48);
        this.field138[this.field165++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "(BI)V")
    public final void method118(byte arg0, int arg1) {
        field127++;
        if (arg0 != 74) {
            this.field138 = null;
        }
        this.field138[this.field165++] = (byte) (arg1 >> 8);
        this.field138[this.field165++] = (byte) arg1;
        this.field138[this.field165++] = (byte) (arg1 >> 24);
        this.field138[this.field165++] = (byte) (arg1 >> 16);
    }

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "(I)I")
    public final int method119(int arg0) {
        this.field165 += 4;
        field175++;
        if (arg0 > -22) {
            this.method119(-41);
        }
        return (this.field138[this.field165 - 1] & 0xFF) + (((this.field138[this.field165 - 4] & 0xFF) << 24) + ((this.field138[this.field165 - 3] & 0xFF) << 16) + (this.field138[this.field165 + -2] & 0xFF << 8));
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        this.field138 = class315.method1963(1, arg0);
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "([B)V")
    public class11(byte[] arg0) {
        this.field138 = arg0;
    }

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "(B)I")
    public final int method120(byte arg0) {
        field115++;
        this.field165 += 4;
        int var2 = -35 % ((44 - arg0) / 51);
        return (this.field138[this.field165 - 4] & 0xFF) + ((this.field138[this.field165 - 2] & 0xFF) << 16) + ((this.field138[this.field165 + -1] & 0xFF) << 24) + (this.field138[this.field165 - 3] & 0xFF << 8);
    }

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "(B)I")
    public final int method121(byte arg0) {
        field166++;
        if (arg0 > -68) {
            this.method91((byte) -24, 73);
        }
        this.field165 += 2;
        int var2 = (this.field138[this.field165 - 1] & 0xFF << 8) + (this.field138[this.field165 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I[BII)V")
    public final void method122(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            arg1[var5] = (byte) (this.field138[this.field165++] - 128);
        }
        field158++;
        if (arg0 != -128) {
            this.method116((byte) -88);
        }
    }

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "(I)I")
    public final int method123(int arg0) {
        field176++;
        byte var2 = this.field138[this.field165++];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 0x7F) << 7;
            var2 = this.field138[this.field165++];
        }
        if (arg0 >= -76) {
            this.field165 = 119;
        }
        return var3 | var2;
    }

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "(II)V")
    public final void method124(int arg0, int arg1) {
        field116++;
        this.field138[this.field165++] = (byte) (-arg0);
        if (arg1 <= 102) {
            this.method117(91, 59);
        }
    }

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "(BI)V")
    public final void method125(byte arg0, int arg1) {
        if (arg0 != -31) {
            this.method102(101L, true);
        }
        this.field138[this.field165++] = (byte) arg1;
        field126++;
        this.field138[this.field165++] = (byte) (arg1 >> 8);
        this.field138[this.field165++] = (byte) (arg1 >> 16);
        this.field138[this.field165++] = (byte) (arg1 >> 24);
    }
}
