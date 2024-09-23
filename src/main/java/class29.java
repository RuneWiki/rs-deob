import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("INLHDAGO")
public class class29 extends class41 {

    @OriginalMember(owner = "INLHDAGO", name = "h", descriptor = "I")
    private int field1088 = 2;

    @OriginalMember(owner = "INLHDAGO", name = "i", descriptor = "I")
    private int field1089 = 8;

    @OriginalMember(owner = "INLHDAGO", name = "j", descriptor = "Z")
    private boolean field1090 = false;

    @OriginalMember(owner = "INLHDAGO", name = "k", descriptor = "I")
    private int field1091 = -457;

    @OriginalMember(owner = "INLHDAGO", name = "l", descriptor = "I")
    private int field1092 = -226;

    @OriginalMember(owner = "INLHDAGO", name = "m", descriptor = "I")
    private int field1093 = 1;

    @OriginalMember(owner = "INLHDAGO", name = "n", descriptor = "I")
    private int field1094 = -628;

    @OriginalMember(owner = "INLHDAGO", name = "o", descriptor = "I")
    private int field1095 = -1221;

    @OriginalMember(owner = "INLHDAGO", name = "p", descriptor = "Z")
    private boolean field1096 = false;

    @OriginalMember(owner = "INLHDAGO", name = "q", descriptor = "Z")
    private boolean field1097 = true;

    @OriginalMember(owner = "INLHDAGO", name = "r", descriptor = "B")
    private byte field1098 = 1;

    @OriginalMember(owner = "INLHDAGO", name = "s", descriptor = "I")
    private int field1099 = 870;

    @OriginalMember(owner = "INLHDAGO", name = "t", descriptor = "I")
    private int field1100 = -210;

    @OriginalMember(owner = "INLHDAGO", name = "u", descriptor = "Z")
    private boolean field1101 = true;

    @OriginalMember(owner = "INLHDAGO", name = "v", descriptor = "I")
    private int field1102 = -26495;

    @OriginalMember(owner = "INLHDAGO", name = "w", descriptor = "B")
    private byte field1103 = 115;

    @OriginalMember(owner = "INLHDAGO", name = "x", descriptor = "I")
    private int field1104 = -562;

    @OriginalMember(owner = "INLHDAGO", name = "y", descriptor = "Z")
    private boolean field1105 = true;

    @OriginalMember(owner = "INLHDAGO", name = "z", descriptor = "[B")
    public byte[] field1106;

    @OriginalMember(owner = "INLHDAGO", name = "A", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "INLHDAGO", name = "C", descriptor = "[I")
    private static int[] field1109 = new int[256];

    @OriginalMember(owner = "INLHDAGO", name = "D", descriptor = "[I")
    private static final int[] field1110;

    @OriginalMember(owner = "INLHDAGO", name = "I", descriptor = "LROXEPOUC;")
    private static class51 field1115;

    @OriginalMember(owner = "INLHDAGO", name = "J", descriptor = "LROXEPOUC;")
    private static class51 field1116;

    @OriginalMember(owner = "INLHDAGO", name = "K", descriptor = "LROXEPOUC;")
    private static class51 field1117;

    @OriginalMember(owner = "INLHDAGO", name = "L", descriptor = "[C")
    private static char[] field1118;

    @OriginalMember(owner = "INLHDAGO", name = "B", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "INLHDAGO", name = "F", descriptor = "I")
    private static int field1112;

    @OriginalMember(owner = "INLHDAGO", name = "G", descriptor = "I")
    private static int field1113;

    @OriginalMember(owner = "INLHDAGO", name = "H", descriptor = "I")
    private static int field1114;

    @OriginalMember(owner = "INLHDAGO", name = "E", descriptor = "LSKDZZMVP;")
    public class59 field1111;

    @OriginalMember(owner = "INLHDAGO", name = "M", descriptor = "Z")
    public static boolean field1119;

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(II)LINLHDAGO;")
    public static class29 method296(int arg0, int arg1) {
        class51 var2 = field1116;
        synchronized (field1116) {
            class29 var3 = null;
            if (arg0 == 0 && field1112 > 0) {
                field1112--;
                var3 = (class29) field1115.method426();
            } else if (arg0 == 1 && field1113 > 0) {
                field1113--;
                var3 = (class29) field1116.method426();
            } else if (arg0 == 2 && field1114 > 0) {
                field1114--;
                var3 = (class29) field1117.method426();
            }
            if (var3 != null) {
                var3.field1107 = 0;
                return var3;
            }
        }
        class29 var5 = new class29((byte) 1);
        int var6 = 43 / arg1;
        var5.field1107 = 0;
        if (arg0 == 0) {
            var5.field1106 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1106 = new byte[5000];
        } else {
            var5.field1106 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "INLHDAGO", name = "<init>", descriptor = "(B)V")
    private class29(byte arg0) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "<init>", descriptor = "(B[B)V")
    public class29(byte arg0, byte[] arg1) {
        if (arg0 != -28) {
            throw new NullPointerException();
        }
        this.field1106 = arg1;
        this.field1107 = 0;
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(IZ)V")
    public void method297(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1106[this.field1107++] = (byte) (arg0 + this.field1111.method481());
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(I)V")
    public void method298(int arg0) {
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "INLHDAGO", name = "b", descriptor = "(I)V")
    public void method299(int arg0) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "INLHDAGO", name = "b", descriptor = "(II)V")
    public void method300(int arg0, int arg1) {
        this.field1106[this.field1107++] = (byte) arg0;
        if (arg1 != 41963) {
            this.field1105 = !this.field1105;
        }
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "INLHDAGO", name = "c", descriptor = "(I)V")
    public void method301(int arg0) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 16);
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "INLHDAGO", name = "d", descriptor = "(I)V")
    public void method302(int arg0) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 24);
        this.field1106[this.field1107++] = (byte) (arg0 >> 16);
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "INLHDAGO", name = "c", descriptor = "(II)V")
    public void method303(int arg0, int arg1) {
        this.field1106[this.field1107++] = (byte) arg0;
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) (arg0 >> 16);
        if (arg1 == 5) {
            this.field1106[this.field1107++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(IJ)V")
    public void method304(int arg0, long arg1) {
        this.field1106[this.field1107++] = (byte) (arg1 >> 56);
        this.field1106[this.field1107++] = (byte) (arg1 >> 48);
        this.field1106[this.field1107++] = (byte) (arg1 >> 40);
        this.field1106[this.field1107++] = (byte) (arg1 >> 32);
        this.field1106[this.field1107++] = (byte) (arg1 >> 24);
        this.field1106[this.field1107++] = (byte) (arg1 >> 16);
        this.field1106[this.field1107++] = (byte) (arg1 >> 8);
        this.field1106[this.field1107++] = (byte) arg1;
        if (this.field1089 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method305(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1106, this.field1107);
        this.field1107 += arg0.length();
        this.field1106[this.field1107++] = 10;
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(III[B)V")
    public void method306(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg1 + arg2; var6++) {
            this.field1106[this.field1107++] = arg3[var6];
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(IB)V")
    public void method307(int arg0, byte arg1) {
        this.field1106[this.field1107 - arg0 - 1] = (byte) arg0;
        if (arg1 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "c", descriptor = "()I")
    public int method308() {
        return this.field1106[this.field1107++] & 0xFF;
    }

    @OriginalMember(owner = "INLHDAGO", name = "d", descriptor = "()B")
    public byte method309() {
        return this.field1106[this.field1107++];
    }

    @OriginalMember(owner = "INLHDAGO", name = "e", descriptor = "()I")
    public int method310() {
        this.field1107 += 2;
        return ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] & 0xFF);
    }

    @OriginalMember(owner = "INLHDAGO", name = "f", descriptor = "()I")
    public int method311() {
        this.field1107 += 2;
        int var1 = ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "INLHDAGO", name = "g", descriptor = "()I")
    public int method312() {
        this.field1107 += 3;
        return (this.field1106[this.field1107 - 1] & 0xFF) + ((this.field1106[this.field1107 - 3] & 0xFF) << 16) + ((this.field1106[this.field1107 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "INLHDAGO", name = "h", descriptor = "()I")
    public int method313() {
        this.field1107 += 4;
        return (this.field1106[this.field1107 - 1] & 0xFF) + ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + ((this.field1106[this.field1107 - 4] & 0xFF) << 24) + ((this.field1106[this.field1107 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(B)J")
    public long method314(byte arg0) {
        if (arg0 != -119) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method313() & 0xFFFFFFFFL;
        long var4 = (long) this.method313() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "INLHDAGO", name = "i", descriptor = "()Ljava/lang/String;")
    public String method315() {
        int var1 = this.field1107;
        while (this.field1106[this.field1107++] != 10) {
        }
        return new String(this.field1106, var1, this.field1107 - var1 - 1);
    }

    @OriginalMember(owner = "INLHDAGO", name = "e", descriptor = "(I)[B")
    public byte[] method316(int arg0) {
        int var2 = this.field1107;
        while (this.field1106[this.field1107++] != 10) {
        }
        byte[] var3 = new byte[this.field1107 - var2 - 1];
        if (arg0 != 10453) {
            this.field1091 = -454;
        }
        for (int var4 = var2; var4 < this.field1107 - 1; var4++) {
            var3[var4 - var2] = this.field1106[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(II[BI)V")
    public void method317(int arg0, int arg1, byte[] arg2, int arg3) {
        while (arg1 >= 0) {
            this.field1093 = -320;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg2[var5] = this.field1106[this.field1107++];
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "f", descriptor = "(I)V")
    public void method318(int arg0) {
        this.field1108 = this.field1107 * 8;
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "d", descriptor = "(II)I")
    public int method319(int arg0, int arg1) {
        if (arg0 <= 0) {
            return 4;
        }
        int var3 = this.field1108 >> 3;
        int var4 = 8 - (this.field1108 & 0x7);
        int var5 = 0;
        this.field1108 += arg1;
        while (arg1 > var4) {
            var5 += (this.field1106[var3++] & field1110[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1106[var3] & field1110[var4]) + var5;
        } else {
            var6 = (this.field1106[var3] >> var4 - arg1 & field1110[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(Z)V")
    public void method320(boolean arg0) {
        this.field1107 = (this.field1108 + 7) / 8;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "j", descriptor = "()I")
    public int method321() {
        int var1 = this.field1106[this.field1107] & 0xFF;
        return var1 < 128 ? this.method308() - 64 : this.method310() - 49152;
    }

    @OriginalMember(owner = "INLHDAGO", name = "k", descriptor = "()I")
    public int method322() {
        int var1 = this.field1106[this.field1107] & 0xFF;
        return var1 < 128 ? this.method308() : this.method310() - 32768;
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method323(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field1107;
        this.field1107 = 0;
        if (arg2 <= 0) {
            return;
        }
        byte[] var5 = new byte[var4];
        this.method317(var4, -843, var5, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1107 = 0;
        this.method298(var8.length);
        this.method306(3, var8.length, 0, var8);
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "(BI)V")
    public void method324(byte arg0, int arg1) {
        this.field1106[this.field1107++] = (byte) (128 - arg1);
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "g", descriptor = "(I)I")
    public int method325(int arg0) {
        while (arg0 >= 0) {
            this.field1095 = -249;
        }
        return this.field1106[this.field1107++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "INLHDAGO", name = "b", descriptor = "(B)I")
    public int method326(byte arg0) {
        if (arg0 != -115) {
            this.field1097 = !this.field1097;
        }
        return -this.field1106[this.field1107++] & 0xFF;
    }

    @OriginalMember(owner = "INLHDAGO", name = "h", descriptor = "(I)I")
    public int method327(int arg0) {
        if (arg0 != -41963) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field1106[this.field1107++] & 0xFF;
    }

    @OriginalMember(owner = "INLHDAGO", name = "i", descriptor = "(I)B")
    public byte method328(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1106[this.field1107++] - 128);
    }

    @OriginalMember(owner = "INLHDAGO", name = "j", descriptor = "(I)B")
    public byte method329(int arg0) {
        if (arg0 != -48151) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field1106[this.field1107++];
    }

    @OriginalMember(owner = "INLHDAGO", name = "e", descriptor = "(II)V")
    public void method330(int arg0, int arg1) {
        this.field1106[this.field1107++] = (byte) arg0;
        if (arg1 < 0) {
            this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "b", descriptor = "(IB)V")
    public void method331(int arg0, byte arg1) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) (arg0 + 128);
        if (this.field1098 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "b", descriptor = "(BI)V")
    public void method332(byte arg0, int arg1) {
        if (arg0 == -51) {
            this.field1106[this.field1107++] = (byte) (arg1 + 128);
            this.field1106[this.field1107++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "k", descriptor = "(I)I")
    public int method333(int arg0) {
        if (arg0 <= 0) {
            return 2;
        } else {
            this.field1107 += 2;
            return ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + (this.field1106[this.field1107 - 2] & 0xFF);
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "c", descriptor = "(B)I")
    public int method334(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
            this.field1107 += 2;
            return ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] - 128 & 0xFF);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "l", descriptor = "(I)I")
    public int method335(int arg0) {
        this.field1107 += 2;
        while (arg0 >= 0) {
            this.field1099 = -111;
        }
        return ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + (this.field1106[this.field1107 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "INLHDAGO", name = "m", descriptor = "(I)I")
    public int method336(int arg0) {
        if (arg0 <= 0) {
            this.field1095 = 445;
        }
        this.field1107 += 2;
        int var2 = ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + (this.field1106[this.field1107 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "INLHDAGO", name = "n", descriptor = "(I)I")
    public int method337(int arg0) {
        this.field1107 += 2;
        int var2 = ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] - 128 & 0xFF);
        if (arg0 != 0) {
            this.field1100 = 364;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "INLHDAGO", name = "d", descriptor = "(B)I")
    public int method338(byte arg0) {
        if (this.field1103 == arg0) {
            this.field1107 += 4;
            return (this.field1106[this.field1107 - 4] & 0xFF) + ((this.field1106[this.field1107 - 3] & 0xFF) << 8) + ((this.field1106[this.field1107 - 1] & 0xFF) << 24) + ((this.field1106[this.field1107 - 2] & 0xFF) << 16);
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "b", descriptor = "(Z)I")
    public int method339(boolean arg0) {
        this.field1107 += 4;
        if (arg0) {
            this.field1095 = 246;
        }
        return (this.field1106[this.field1107 - 2] & 0xFF) + ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + ((this.field1106[this.field1107 - 3] & 0xFF) << 24) + ((this.field1106[this.field1107 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "INLHDAGO", name = "b", descriptor = "(III[B)V")
    public void method340(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 == 0) {
            for (int var5 = arg1 + arg2 - 1; var5 >= arg2; var5--) {
                this.field1106[this.field1107++] = (byte) (arg3[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "c", descriptor = "(III[B)V")
    public void method341(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 > 0) {
            for (int var5 = arg0 + arg1 - 1; var5 >= arg0; var5--) {
                arg3[var5] = this.field1106[this.field1107++];
            }
        }
    }

    @OriginalMember(owner = "INLHDAGO", name = "a", descriptor = "([BIZI)V")
    public void method342(byte[] arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field1105 = !this.field1105;
        }
        for (int var5 = arg1 + arg3 - 1; var5 >= arg1; var5--) {
            arg0[var5] = (byte) (this.field1106[this.field1107++] - 128);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1109[var0] = var1;
        }
        field1110 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1115 = new class51(0);
        field1116 = new class51(0);
        field1117 = new class51(0);
        field1118 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
