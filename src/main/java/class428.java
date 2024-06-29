import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class428 extends class496 {

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "[B")
    public byte[] field6162;

    @OriginalMember(owner = "client!ps", name = "pb", descriptor = "I")
    public int field6221;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ps", name = "S", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ps", name = "U", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!ps", name = "V", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ps", name = "W", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ps", name = "X", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!ps", name = "Y", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!ps", name = "Z", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ps", name = "ab", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!ps", name = "bb", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ps", name = "cb", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!ps", name = "db", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!ps", name = "eb", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!ps", name = "fb", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!ps", name = "gb", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!ps", name = "hb", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!ps", name = "ib", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!ps", name = "jb", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!ps", name = "kb", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!ps", name = "lb", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ps", name = "mb", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ps", name = "nb", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!ps", name = "ob", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!ps", name = "qb", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!ps", name = "rb", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!ps", name = "sb", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!ps", name = "tb", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!ps", name = "ub", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!ps", name = "vb", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!ps", name = "wb", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!ps", name = "xb", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!ps", name = "yb", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[BI)V")
    public final void method2560(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = arg3;
        if (arg1 >= -126) {
            return;
        }
        while ((arg3 + arg0) > var5) {
            arg2[var5] = (byte) (this.field6162[this.field6221++] - 128);
            var5++;
        }
        field6217++;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I")
    public final int method2561(byte arg0) {
        int var2 = 68 % ((arg0 - 47) / 60);
        field6218++;
        return this.field6162[this.field6221++] & 0xFF;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Z")
    public final boolean method2562(int arg0) {
        this.field6221 -= 4;
        field6224++;
        int var2 = class220.method1450(this.field6221, 0, this.field6162, 0);
        if (arg0 >= 0) {
            return false;
        } else {
            int var3 = this.method2589(-11179);
            return var2 == var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
    public final void method2563(int arg0, int arg1) {
        if (arg0 != -13021) {
            this.field6162 = null;
        }
        field6181++;
        this.field6162[this.field6221++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
    public final int method2564(byte arg0) {
        if (arg0 < 1) {
            this.field6221 = 19;
        }
        field6182++;
        this.field6221 += 4;
        return (this.field6162[this.field6221 - 2] & 0xFF << 24) + ((this.field6162[this.field6221 - 1] & 0xFF) << 16) + ((this.field6162[this.field6221 + -4] & 0xFF) << 8) + (this.field6162[this.field6221 - 3] & 0xFF);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ)I")
    public final int method2565(int arg0, boolean arg1) {
        if (arg1) {
            return 40;
        } else {
            field6204++;
            int var3 = class220.method1450(this.field6221, 0, this.field6162, arg0);
            this.method2576(true, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
    public final void method2566(int arg0, int arg1) {
        field6180++;
        this.field6162[this.field6221++] = (byte) (arg1 >> 8);
        this.field6162[this.field6221++] = (byte) arg1;
        this.field6162[this.field6221++] = (byte) (arg1 >> 24);
        if (arg0 > -13) {
            this.field6221 = 30;
        }
        this.field6162[this.field6221++] = (byte) (arg1 >> 16);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public final String method2567(boolean arg0) {
        field6169++;
        byte var2 = this.field6162[this.field6221++];
        if (var2 != 0) {
            throw new IllegalStateException("Bad version number in gjstr2");
        }
        int var3 = this.field6221;
        if (!arg0) {
            this.method2583(false, -66L);
        }
        while (this.field6162[this.field6221++] != 0) {
        }
        int var4 = this.field6221 - var3 - 1;
        return var4 == 0 ? "" : class66.method405(var4, var3, this.field6162, 14569);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)I")
    public final int method2568(boolean arg0) {
        field6212++;
        byte var2 = this.field6162[this.field6221++];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 0x7F) << 7;
            var2 = this.field6162[this.field6221++];
        }
        return arg0 ? -115 : var2 | var3;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(II)V")
    public final void method2569(int arg0, int arg1) {
        field6202++;
        this.field6162[this.field6221++] = (byte) (arg1 >> 16);
        this.field6162[this.field6221++] = (byte) (arg1 >> 8);
        this.field6162[this.field6221++] = (byte) arg1;
        if (arg0 > -110) {
            this.field6221 = -30;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)B")
    public final byte method2570(byte arg0) {
        if (arg0 != 57) {
            this.field6221 = 56;
        }
        field6191++;
        return this.field6162[this.field6221++];
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(Z)I")
    public final int method2571(boolean arg0) {
        this.field6221 += 4;
        field6213++;
        return arg0 ? 73 : (this.field6162[this.field6221 - 2] & 0xFF) + ((this.field6162[this.field6221 - 3] & 0xFF << 24) - (-(this.field6162[this.field6221 - 4] & 0xFF << 16) - ((this.field6162[this.field6221 - 1] & 0xFF) << 8)));
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(II)V")
    public final void method2572(int arg0, int arg1) {
        field6223++;
        this.field6162[this.field6221 - arg1 - 1] = (byte) arg1;
        if (arg0 != -19419) {
            this.method2580(null, -49);
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
    public final int method2573(int arg0) {
        field6199++;
        if (arg0 != -14319) {
            this.field6162 = null;
        }
        int var2 = this.field6162[this.field6221] & 0xFF;
        return var2 >= 128 ? this.method2620(arg0 ^ -14279) - 32768 : this.method2561((byte) 109);
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)I")
    public final int method2574(byte arg0) {
        field6171++;
        int var2 = 49 % ((23 - arg0) / 61);
        return 128 - this.field6162[this.field6221++] & 0xFF;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II[BI)V")
    public final void method2575(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 28637) {
            this.field6221 = -70;
        }
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            arg2[var5] = this.field6162[this.field6221++];
        }
        field6230++;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)V")
    public final void method2576(boolean arg0, int arg1) {
        this.field6162[this.field6221++] = (byte) (arg1 >> 24);
        field6185++;
        this.field6162[this.field6221++] = (byte) (arg1 >> 16);
        this.field6162[this.field6221++] = (byte) (arg1 >> 8);
        this.field6162[this.field6221++] = (byte) arg1;
        if (!arg0) {
            this.field6221 = 63;
        }
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(II)V")
    public final void method2577(int arg0, int arg1) {
        this.field6162[this.field6221++] = (byte) (arg0 + 128);
        field6193++;
        this.field6162[this.field6221++] = (byte) (arg0 >> 8);
        if (arg1 != -45066936) {
            this.method2572(101, 16);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BII)V")
    public final void method2578(int arg0, byte[] arg1, int arg2, int arg3) {
        field6175++;
        for (int var5 = arg2 + arg3 + arg0; var5 >= arg2; var5--) {
            arg1[var5] = (byte) (this.field6162[this.field6221++] - 128);
        }
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(II)V")
    public final void method2579(int arg0, int arg1) {
        field6186++;
        if (arg0 >= -26) {
            this.field6162 = null;
        }
        this.field6162[this.field6221++] = (byte) arg1;
        this.field6162[this.field6221++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2580(String arg0, int arg1) {
        if (arg1 != 30127) {
            this.method2596(-14);
        }
        field6172++;
        int var3 = arg0.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("NUL character at " + var3 + " - cannot pjstr");
        }
        this.field6221 += class554.method3240(0, this.field6162, 16855, this.field6221, arg0.length(), arg0);
        this.field6162[this.field6221++] = 0;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(ZI)V")
    public final void method2581(boolean arg0, int arg1) {
        field6177++;
        if (arg1 >= 0 && arg1 < 128) {
            this.method2563(-13021, arg1);
        } else if (arg1 >= 0 && arg1 < 32768) {
            this.method2608(arg1 + 32768, (byte) 81);
        } else {
            if (!arg0) {
                this.field6221 = 58;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(II)V")
    public final void method2582(int arg0, int arg1) {
        if (arg1 != -24025) {
            this.method2581(true, 105);
        }
        field6228++;
        this.field6162[this.field6221++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZJ)V")
    public final void method2583(boolean arg0, long arg1) {
        field6229++;
        this.field6162[this.field6221++] = (byte) ((int) (arg1 >> 56));
        this.field6162[this.field6221++] = (byte) ((int) (arg1 >> 48));
        this.field6162[this.field6221++] = (byte) ((int) (arg1 >> 40));
        this.field6162[this.field6221++] = (byte) ((int) (arg1 >> 32));
        this.field6162[this.field6221++] = (byte) ((int) (arg1 >> 24));
        this.field6162[this.field6221++] = (byte) ((int) (arg1 >> 16));
        this.field6162[this.field6221++] = (byte) ((int) (arg1 >> 8));
        if (arg0) {
            this.method2573(-123);
        }
        this.field6162[this.field6221++] = (byte) ((int) arg1);
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method2584(int arg0) {
        field6225++;
        byte var2 = this.field6162[this.field6221++];
        if (arg0 != 0) {
            this.field6221 = -66;
        }
        if (var2 != 0) {
            throw new IllegalStateException("Bad version number in gUTF8");
        }
        int var3 = this.method2568(false);
        if (this.field6162.length < var3 + this.field6221) {
            throw new IllegalStateException("Length of string is longer than available data");
        }
        String var4 = class180.method1204(this.field6162, var3, 23706, this.field6221);
        this.field6221 += var3;
        return var4;
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method2585(int arg0) {
        field6194++;
        int var2 = this.field6221;
        while (this.field6162[this.field6221++] != 0) {
        }
        int var3 = -64 % ((arg0 - 47) / 58);
        int var4 = this.field6221 - var2 - 1;
        return var4 == 0 ? "" : class66.method405(var4, var2, this.field6162, 14569);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public final void method2586(BigInteger arg0, byte arg1, BigInteger arg2) {
        field6206++;
        int var4 = this.field6221;
        this.field6221 = 0;
        if (arg1 != -116) {
            this.method2601(-106);
        }
        byte[] var5 = new byte[var4];
        this.method2575(28637, var4, var5, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg2);
        byte[] var8 = var7.toByteArray();
        this.field6221 = 0;
        this.method2608(var8.length, (byte) 124);
        this.method2612(23958, var8.length, var8, 0);
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)I")
    public final int method2587(int arg0) {
        if (arg0 != 11615) {
            this.method2599(96, 12);
        }
        field6189++;
        this.field6221 += 2;
        return ((this.field6162[this.field6221 - 2] & 0xFF) << 8) + (this.field6162[this.field6221 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "(I)I")
    public final int method2588(int arg0) {
        if (arg0 > -77) {
            this.method2599(-5, 20);
        }
        this.field6221 += 4;
        field6227++;
        return ((this.field6162[this.field6221 - 3] & 0xFF) << 8) + (this.field6162[this.field6221 - 4] & 0xFF) + ((this.field6162[this.field6221 - 1] & 0xFF) << 24) + (this.field6162[this.field6221 + -2] & 0xFF << 16);
    }

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "(I)I")
    public final int method2589(int arg0) {
        if (arg0 != -11179) {
            this.field6221 = 72;
        }
        field6174++;
        this.field6221 += 4;
        return ((this.field6162[this.field6221 - 4] & 0xFF) << 24) + (this.field6162[this.field6221 - 3] & 0xFF << 16) - (-((this.field6162[this.field6221 + -2] & 0xFF) << 8) + -(this.field6162[this.field6221 - 1] & 0xFF));
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
    public final void method2590(int arg0, byte arg1) {
        field6200++;
        if (arg1 >= -2) {
            this.field6221 = 15;
        }
        this.field6162[this.field6221++] = (byte) arg0;
        this.field6162[this.field6221++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "(I)I")
    public final int method2591(int arg0) {
        if (arg0 == -4) {
            field6184++;
            int var2 = class220.method1450(this.field6221, 0, this.field6162, 0);
            this.method2576(true, var2);
            return var2;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(IB)Z")
    public static final boolean method2592(int arg0, byte arg1) {
        field6173++;
        if (arg1 != 6) {
            method2624(-33, 76L);
        }
        for (class548 var2 = (class548) class272.field4014.method2496((byte) -128); var2 != null; var2 = (class548) class272.field4014.method2494(arg1 ^ 0x32)) {
            if (class555.method3242(var2.field8163, (byte) 124) && (long) arg0 == var2.field8171) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(Z)I")
    public final int method2593(boolean arg0) {
        field6211++;
        this.field6221 += 2;
        int var2 = ((this.field6162[this.field6221 - 2] & 0xFF) << 8) + (this.field6162[this.field6221 - 1] - 128 & 0xFF);
        if (arg0) {
            return 59;
        } else {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(B)I")
    public final int method2594(byte arg0) {
        field6208++;
        if (arg0 == -21) {
            int var2 = this.field6162[this.field6221] & 0xFF;
            return var2 < 128 ? this.method2561((byte) 110) - 64 : this.method2620(94) + -49152;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(II)V")
    public final void method2595(int arg0, int arg1) {
        this.field6162[this.field6221++] = (byte) arg0;
        field6190++;
        this.field6162[this.field6221++] = (byte) (arg0 >> 8);
        this.field6162[this.field6221++] = (byte) (arg0 >> 16);
        this.field6162[this.field6221++] = (byte) (arg0 >> 24);
        if (arg1 <= 35) {
            this.field6221 = 27;
        }
    }

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "(I)Ljava/lang/String;")
    public final String method2596(int arg0) {
        field6187++;
        if (this.field6162[this.field6221] == arg0) {
            this.field6221++;
            return null;
        } else {
            return this.method2585(arg0 + 113);
        }
    }

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "(II)V")
    public final void method2597(int arg0, int arg1) {
        this.field6162[this.field6221++] = (byte) arg1;
        if (arg0 == 255) {
            field6164++;
            this.field6162[this.field6221++] = (byte) (arg1 >> 8);
            this.field6162[this.field6221++] = (byte) (arg1 >> 16);
            this.field6162[this.field6221++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(Z)B")
    public final byte method2598(boolean arg0) {
        field6163++;
        if (!arg0) {
            this.field6162 = null;
        }
        return (byte) (-this.field6162[this.field6221++]);
    }

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "(II)V")
    public final void method2599(int arg0, int arg1) {
        if (arg1 != -19) {
            method2613(null, -13, 17);
        }
        this.field6162[this.field6221 - arg0 - 2] = (byte) (arg0 >> 8);
        field6178++;
        this.field6162[this.field6221 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "(I)I")
    public final int method2600(int arg0) {
        field6167++;
        int var2 = -104 / ((73 - arg0) / 38);
        return this.field6162[this.field6221++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "(I)I")
    public final int method2601(int arg0) {
        field6219++;
        if (arg0 < 16) {
            return 15;
        } else {
            this.field6221 += 3;
            return ((this.field6162[this.field6221 - 3] & 0xFF) << 16) + ((this.field6162[this.field6221 - 2] & 0xFF) << 8) + (this.field6162[this.field6221 + -1] & 0xFF);
        }
    }

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "(I)I")
    public final int method2602(int arg0) {
        field6166++;
        int var2 = 0;
        int var3 = this.method2573(-14319);
        while (var3 == 32767) {
            var3 = this.method2573(-14319);
            var2 += 32767;
        }
        int var4 = var2 + var3;
        int var5 = 127 % ((arg0 + 58) / 47);
        return var4;
    }

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "(II)V")
    public final void method2603(int arg0, int arg1) {
        field6203++;
        if (arg1 != 1812160144) {
            this.method2576(false, 27);
        }
        this.field6162[this.field6221++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "(I)B")
    public final byte method2604(int arg0) {
        if (arg0 != 27700) {
            this.field6221 = -38;
        }
        field6207++;
        return (byte) (128 - this.field6162[this.field6221++]);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V")
    public final void method2605(byte arg0, int arg1) {
        field6179++;
        this.field6162[this.field6221 - arg1 - 4] = (byte) (arg1 >> 24);
        int var3 = 74 % ((arg0 + 64) / 53);
        this.field6162[this.field6221 - arg1 - 3] = (byte) (arg1 >> 16);
        this.field6162[this.field6221 - (arg1 + 2)] = (byte) (arg1 >> 8);
        this.field6162[this.field6221 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([IBII)V")
    public final void method2606(int[] arg0, byte arg1, int arg2, int arg3) {
        field6197++;
        int var5 = this.field6221;
        this.field6221 = arg2;
        int var6 = (arg3 - arg2) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var9 = this.method2589(-11179);
            int var10 = this.method2589(-11179);
            int var11 = -957401312;
            int var12 = -1640531527;
            int var13 = 32;
            while ((var13--) > 0) {
                var10 -= arg0[(var11 & 0x1C82) >>> 11] + var11 ^ (var9 << 4 ^ var9 >>> 5) + var9;
                var11 -= var12;
                var9 -= arg0[var11 & 0x3] + var11 ^ (var10 >>> 5 ^ var10 << 4) + var10;
            }
            this.field6221 -= 8;
            this.method2576(true, var9);
            this.method2576(true, var10);
        }
        this.field6221 = var5;
        int var8 = 56 / ((16 - arg1) / 58);
    }

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "(I)I")
    public final int method2607(int arg0) {
        field6210++;
        this.field6221 += 3;
        if (arg0 < 69) {
            this.field6221 = -36;
        }
        int var2 = (this.field6162[this.field6221 - 1] & 0xFF) + ((this.field6162[this.field6221 - 2] & 0xFF) << 8) + ((this.field6162[this.field6221 + -3] & 0xFF) << 16);
        if (var2 > 8388607) {
            var2 -= 16777216;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(IB)V")
    public final void method2608(int arg0, byte arg1) {
        field6216++;
        this.field6162[this.field6221++] = (byte) (arg0 >> 8);
        if (arg1 > 42) {
            this.field6162[this.field6221++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)J")
    public final long method2609(byte arg0) {
        if (arg0 != -103) {
            this.field6221 = 81;
        }
        field6168++;
        long var2 = (long) this.method2589(-11179) & 0xFFFFFFFFL;
        long var4 = (long) this.method2589(-11179) & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(IB)V")
    public final void method2610(int arg0, byte arg1) {
        if (arg1 <= 76) {
            return;
        }
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2563(-13021, arg0 >>> 28 | 0x80);
                    }
                    this.method2563(-13021, arg0 >>> 21 | 0x80);
                }
                this.method2563(-13021, arg0 >>> 14 | 0x80);
            }
            this.method2563(-13021, (arg0 | 0x4035) >>> 7);
        }
        field6183++;
        this.method2563(-13021, arg0 & 0x7F);
    }

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "(II)V")
    public final void method2611(int arg0, int arg1) {
        field6165++;
        this.field6162[this.field6221++] = (byte) (-arg1);
        if (arg0 != -29133) {
            method2592(-21, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(II[BI)V")
    public final void method2612(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 23958) {
            this.field6221 = -29;
        }
        field6220++;
        for (int var5 = arg3; var5 < (arg3 + arg1); var5++) {
            this.field6162[this.field6221++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lno;II)V")
    public static final void method2613(class483 arg0, int arg1, int arg2) {
        if (arg2 != -10) {
            return;
        }
        field6209++;
        while (true) {
            class117 var3 = (class117) class625.field9166.method2496((byte) -126);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1534; var5++) {
                if (var3.field1527[var5] != null) {
                    if (var3.field1527[var5].field4208 == 2) {
                        var3.field1539[var5] = -5;
                    }
                    if (var3.field1527[var5].field4208 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1536[var5] != null) {
                    if (var3.field1536[var5].field4208 == 2) {
                        var3.field1539[var5] = -6;
                    }
                    if (var3.field1536[var5].field4208 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method2926(8, arg1);
            arg0.method2563(arg2 ^ 0x32D5, 0);
            int var6 = arg0.field6221;
            arg0.method2576(true, var3.field1538);
            for (int var7 = 0; var7 < var3.field1534; var7++) {
                if (var3.field1539[var7] == 0) {
                    try {
                        int var8 = var3.field1530[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1527[var7].field4213;
                            int var10 = var9.getInt(null);
                            arg0.method2563(-13021, 0);
                            arg0.method2576(true, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field1527[var7].field4213;
                            var13.setInt(null, var3.field1537[var7]);
                            arg0.method2563(-13021, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field1527[var7].field4213;
                            int var12 = var11.getModifiers();
                            arg0.method2563(-13021, 0);
                            arg0.method2576(true, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1536[var7].field4213;
                            byte[][] var15 = var3.field1533[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method2563(-13021, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method2563(-13021, 1);
                                arg0.method2583(false, ((Number) var19).longValue());
                            } else if ((var19 instanceof String)) {
                                arg0.method2563(-13021, 2);
                                arg0.method2580((String) var19, 30127);
                            } else {
                                arg0.method2563(-13021, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1536[var7].field4213;
                            int var21 = var20.getModifiers();
                            arg0.method2563(arg2 - 13011, 0);
                            arg0.method2576(true, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method2563(arg2 ^ 0x32D5, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method2563(-13021, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method2563(-13021, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method2563(-13021, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method2563(arg2 - 13011, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method2563(-13021, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method2563(-13021, -16);
                    } catch (SecurityException var29) {
                        arg0.method2563(-13021, -17);
                    } catch (IOException var30) {
                        arg0.method2563(-13021, -18);
                    } catch (NullPointerException var31) {
                        arg0.method2563(-13021, -19);
                    } catch (Exception var32) {
                        arg0.method2563(-13021, -20);
                    } catch (Throwable var33) {
                        arg0.method2563(-13021, -21);
                    }
                } else {
                    arg0.method2563(arg2 - 13011, var3.field1539[var7]);
                }
            }
            arg0.method2565(var6, false);
            arg0.method2572(-19419, arg0.field6221 - var6);
            var3.method2997(1);
        }
    }

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "(II)J")
    public final long method2614(int arg0, int arg1) {
        int var6 = arg1 - 1;
        field6192++;
        if (arg0 != -17373) {
            method2624(-25, 119L);
        }
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        int var3 = var6 * 8;
        long var4 = 0L;
        while (var3 >= 0) {
            var4 |= ((long) this.field6162[this.field6221++] & 0xFFL) << var3;
            var3 -= 8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "(I)I")
    public final int method2615(int arg0) {
        if (arg0 != 255) {
            this.method2570((byte) 51);
        }
        field6198++;
        return -this.field6162[this.field6221++] & 0xFF;
    }

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "(I)I")
    public final int method2616(int arg0) {
        field6215++;
        this.field6221 += 2;
        if (arg0 <= 13) {
            this.method2566(-91, -73);
        }
        return ((this.field6162[this.field6221 - 1] & 0xFF) << 8) + (this.field6162[this.field6221 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(B)I")
    public final int method2617(byte arg0) {
        field6176++;
        if (arg0 > -4) {
            this.method2614(91, -39);
        }
        this.field6221 += 2;
        int var2 = (this.field6162[this.field6221 - 1] & 0xFF << 8) + (this.field6162[this.field6221 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
    public class428(int arg0) {
        this.field6162 = class207.method1349(-30001, arg0);
        this.field6221 = 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBJ)V")
    public final void method2618(int arg0, byte arg1, long arg2) {
        field6196++;
        int var6 = arg0 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        } else if (arg1 > 48) {
            for (int var5 = var6 * 8; var5 >= 0; var5 -= 8) {
                this.field6162[this.field6221++] = (byte) ((int) (arg2 >> var5));
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "(II)V")
    public final void method2619(int arg0, int arg1) {
        if (arg1 == 1420669333) {
            field6205++;
            this.field6162[this.field6221++] = (byte) (arg0 >> 8);
            this.field6162[this.field6221++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "(I)I")
    public final int method2620(int arg0) {
        this.field6221 += 2;
        field6201++;
        if (arg0 <= 14) {
            this.method2568(true);
        }
        return (this.field6162[this.field6221 - 2] & 0xFF << 8) + (this.field6162[this.field6221 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "(I)I")
    public final int method2621(int arg0) {
        this.field6221 += 2;
        if (arg0 == -18757) {
            field6188++;
            return ((this.field6162[this.field6221 - 1] & 0xFF) << 8) + (this.field6162[this.field6221 - 2] - 128 & 0xFF);
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([B)V")
    public class428(byte[] arg0) {
        this.field6162 = arg0;
        this.field6221 = 0;
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(B)I")
    public final int method2622(byte arg0) {
        if (arg0 < 122) {
            this.field6162 = null;
        }
        field6170++;
        this.field6221 += 2;
        int var2 = (this.field6162[this.field6221 - 2] & 0xFF << 8) + (this.field6162[this.field6221 - 1] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "(II)V")
    public final void method2623(int arg0, int arg1) {
        field6214++;
        this.field6162[this.field6221++] = (byte) (arg0 >> 16);
        this.field6162[this.field6221++] = (byte) (arg0 >> 24);
        this.field6162[this.field6221++] = (byte) arg0;
        this.field6162[this.field6221++] = (byte) (arg0 >> 8);
        if (arg1 != 1323018352) {
            this.field6221 = -72;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IJ)V")
    public static final void method2624(int arg0, long arg1) {
        field6222++;
        if (arg0 != 1) {
            method2592(-41, (byte) -44);
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class404.method2419(arg1 - 1L, -100);
            class404.method2419(1L, -75);
        } else {
            class404.method2419(arg1, arg0 - 128);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method2625(String arg0, boolean arg1) {
        if (!arg1) {
            this.method2610(112, (byte) -123);
        }
        field6226++;
        int var3 = class442.method2693(2048, arg0);
        this.field6162[this.field6221++] = 0;
        this.method2610(var3, (byte) 106);
        this.field6221 += class634.method3682(this.field6162, arg0, (byte) 85, this.field6221);
    }

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "(I)B")
    public final byte method2626(int arg0) {
        field6195++;
        return arg0 == -128 ? (byte) (this.field6162[this.field6221++] - 128) : -14;
    }
}
