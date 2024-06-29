import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RSWRPCHR")
public class class50 extends class21 {

    @OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "Z")
    private boolean field1205 = false;

    @OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "I")
    private int field1206 = -12199;

    @OriginalMember(owner = "client!RSWRPCHR", name = "j", descriptor = "B")
    private byte field1207 = -96;

    @OriginalMember(owner = "client!RSWRPCHR", name = "k", descriptor = "Z")
    private boolean field1208 = false;

    @OriginalMember(owner = "client!RSWRPCHR", name = "m", descriptor = "Z")
    private boolean field1210 = false;

    @OriginalMember(owner = "client!RSWRPCHR", name = "n", descriptor = "I")
    private int field1211 = 1798;

    @OriginalMember(owner = "client!RSWRPCHR", name = "o", descriptor = "Z")
    private boolean field1212 = true;

    @OriginalMember(owner = "client!RSWRPCHR", name = "p", descriptor = "Z")
    private boolean field1213 = true;

    @OriginalMember(owner = "client!RSWRPCHR", name = "q", descriptor = "I")
    private int field1214 = 804;

    @OriginalMember(owner = "client!RSWRPCHR", name = "r", descriptor = "I")
    private int field1215 = 65;

    @OriginalMember(owner = "client!RSWRPCHR", name = "s", descriptor = "I")
    private int field1216 = -227;

    @OriginalMember(owner = "client!RSWRPCHR", name = "t", descriptor = "B")
    private byte field1217 = 3;

    @OriginalMember(owner = "client!RSWRPCHR", name = "u", descriptor = "I")
    private int field1218 = 3;

    @OriginalMember(owner = "client!RSWRPCHR", name = "v", descriptor = "Z")
    private boolean field1219 = true;

    @OriginalMember(owner = "client!RSWRPCHR", name = "z", descriptor = "I")
    private int field1223 = 37900;

    @OriginalMember(owner = "client!RSWRPCHR", name = "A", descriptor = "[B")
    public byte[] field1224;

    @OriginalMember(owner = "client!RSWRPCHR", name = "x", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!RSWRPCHR", name = "B", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!RSWRPCHR", name = "D", descriptor = "[I")
    private static int[] field1227 = new int[256];

    @OriginalMember(owner = "client!RSWRPCHR", name = "E", descriptor = "[I")
    private static final int[] field1228;

    @OriginalMember(owner = "client!RSWRPCHR", name = "J", descriptor = "LEZXKBAZY;")
    private static class17 field1233;

    @OriginalMember(owner = "client!RSWRPCHR", name = "K", descriptor = "LEZXKBAZY;")
    private static class17 field1234;

    @OriginalMember(owner = "client!RSWRPCHR", name = "L", descriptor = "LEZXKBAZY;")
    private static class17 field1235;

    @OriginalMember(owner = "client!RSWRPCHR", name = "M", descriptor = "[C")
    private static char[] field1236;

    @OriginalMember(owner = "client!RSWRPCHR", name = "l", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!RSWRPCHR", name = "w", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!RSWRPCHR", name = "y", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!RSWRPCHR", name = "C", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!RSWRPCHR", name = "G", descriptor = "I")
    private static int field1230;

    @OriginalMember(owner = "client!RSWRPCHR", name = "H", descriptor = "I")
    private static int field1231;

    @OriginalMember(owner = "client!RSWRPCHR", name = "I", descriptor = "I")
    private static int field1232;

    @OriginalMember(owner = "client!RSWRPCHR", name = "F", descriptor = "LNERZSWTZ;")
    public class37 field1229;

    @OriginalMember(owner = "client!RSWRPCHR", name = "N", descriptor = "Z")
    public static boolean field1237;

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(II)LRSWRPCHR;")
    public static class50 method376(int arg0, int arg1) {
        class17 var2 = field1234;
        synchronized (field1234) {
            class50 var3 = null;
            if (arg0 == 0 && field1230 > 0) {
                field1230--;
                var3 = (class50) field1233.method205();
            } else if (arg0 == 1 && field1231 > 0) {
                field1231--;
                var3 = (class50) field1234.method205();
            } else if (arg0 == 2 && field1232 > 0) {
                field1232--;
                var3 = (class50) field1235.method205();
            }
            if (var3 != null) {
                var3.field1225 = 0;
                return var3;
            }
        }
        class50 var5 = new class50(523);
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        var5.field1225 = 0;
        if (arg0 == 0) {
            var5.field1224 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1224 = new byte[5000];
        } else {
            var5.field1224 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "<init>", descriptor = "(I)V")
    private class50(int arg0) {
        int var2 = 58 / arg0;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "<init>", descriptor = "([BI)V")
    public class50(byte[] arg0, int arg1) {
        this.field1224 = arg0;
        if (arg1 != -46859) {
            this.field1221 = -93;
        }
        this.field1225 = 0;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(II)V")
    public void method377(int arg0, int arg1) {
        this.field1224[this.field1225++] = (byte) (arg1 + this.field1229.method312());
        if (arg0 < 8 || arg0 > 8) {
            this.field1222 = 118;
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(I)V")
    public void method378(int arg0) {
        this.field1224[this.field1225++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(I)V")
    public void method379(int arg0) {
        this.field1224[this.field1225++] = (byte) (arg0 >> 8);
        this.field1224[this.field1225++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(II)V")
    public void method380(int arg0, int arg1) {
        this.field1224[this.field1225++] = (byte) arg1;
        this.field1224[this.field1225++] = (byte) (arg1 >> 8);
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(I)V")
    public void method381(int arg0) {
        this.field1224[this.field1225++] = (byte) (arg0 >> 16);
        this.field1224[this.field1225++] = (byte) (arg0 >> 8);
        this.field1224[this.field1225++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "(I)V")
    public void method382(int arg0) {
        this.field1224[this.field1225++] = (byte) (arg0 >> 24);
        this.field1224[this.field1225++] = (byte) (arg0 >> 16);
        this.field1224[this.field1225++] = (byte) (arg0 >> 8);
        this.field1224[this.field1225++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "(II)V")
    public void method383(int arg0, int arg1) {
        this.field1224[this.field1225++] = (byte) arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1224[this.field1225++] = (byte) (arg1 >> 8);
        this.field1224[this.field1225++] = (byte) (arg1 >> 16);
        this.field1224[this.field1225++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(JI)V")
    public void method384(long arg0, int arg1) {
        this.field1224[this.field1225++] = (byte) (arg0 >> 56);
        this.field1224[this.field1225++] = (byte) (arg0 >> 48);
        this.field1224[this.field1225++] = (byte) (arg0 >> 40);
        this.field1224[this.field1225++] = (byte) (arg0 >> 32);
        if (this.field1206 != arg1) {
            return;
        }
        this.field1224[this.field1225++] = (byte) (arg0 >> 24);
        this.field1224[this.field1225++] = (byte) (arg0 >> 16);
        this.field1224[this.field1225++] = (byte) (arg0 >> 8);
        this.field1224[this.field1225++] = (byte) arg0;
        if (class8.field113) {
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method385(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1224, this.field1225);
        this.field1225 += arg0.length();
        this.field1224[this.field1225++] = 10;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(I[BBI)V")
    public void method386(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 != -83) {
            this.field1222 = -409;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            this.field1224[this.field1225++] = arg1[var5];
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(IZ)V")
    public void method387(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1224[this.field1225 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "()I")
    public int method388() {
        return this.field1224[this.field1225++] & 0xFF;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "()B")
    public byte method389() {
        return this.field1224[this.field1225++];
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "e", descriptor = "()I")
    public int method390() {
        this.field1225 += 2;
        return ((this.field1224[this.field1225 - 2] & 0xFF) << 8) + (this.field1224[this.field1225 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "f", descriptor = "()I")
    public int method391() {
        this.field1225 += 2;
        int var1 = ((this.field1224[this.field1225 - 2] & 0xFF) << 8) + (this.field1224[this.field1225 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "g", descriptor = "()I")
    public int method392() {
        this.field1225 += 3;
        return (this.field1224[this.field1225 - 1] & 0xFF) + ((this.field1224[this.field1225 - 3] & 0xFF) << 16) + ((this.field1224[this.field1225 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "()I")
    public int method393() {
        this.field1225 += 4;
        return (this.field1224[this.field1225 - 1] & 0xFF) + ((this.field1224[this.field1225 - 2] & 0xFF) << 8) + ((this.field1224[this.field1225 - 4] & 0xFF) << 24) + ((this.field1224[this.field1225 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Z)J")
    public long method394(boolean arg0) {
        long var2 = (long) this.method393() & 0xFFFFFFFFL;
        if (arg0) {
            throw new NullPointerException();
        }
        long var4 = (long) this.method393() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "()Ljava/lang/String;")
    public String method395() {
        int var1 = this.field1225;
        while (this.field1224[this.field1225++] != 10) {
        }
        return new String(this.field1224, var1, this.field1225 - var1 - 1);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(Z)[B")
    public byte[] method396(boolean arg0) {
        int var2 = this.field1225;
        if (!arg0) {
            this.field1223 = -425;
        }
        while (this.field1224[this.field1225++] != 10) {
        }
        byte[] var3 = new byte[this.field1225 - var2 - 1];
        for (int var4 = var2; var4 < this.field1225 - 1; var4++) {
            var3[var4 - var2] = this.field1224[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Z[BII)V")
    public void method397(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
                arg1[var5] = this.field1224[this.field1225++];
            }
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "e", descriptor = "(I)V")
    public void method398(int arg0) {
        this.field1226 = this.field1225 * 8;
        while (arg0 >= 0) {
            this.field1205 = !this.field1205;
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "e", descriptor = "(II)I")
    public int method399(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1226 >> 3;
        int var5 = 8 - (this.field1226 & 0x7);
        int var6 = 0;
        this.field1226 += arg1;
        while (arg1 > var5) {
            var6 += (this.field1224[var4++] & field1228[var5]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 == var5) {
            var7 = (this.field1224[var4] & field1228[var5]) + var6;
        } else {
            var7 = (this.field1224[var4] >> var5 - arg1 & field1228[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(B)V")
    public void method400(byte arg0) {
        this.field1225 = (this.field1226 + 7) / 8;
        if (arg0 == -67) {
            ;
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "j", descriptor = "()I")
    public int method401() {
        int var1 = this.field1224[this.field1225] & 0xFF;
        return var1 < 128 ? this.method388() - 64 : this.method390() - 49152;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "k", descriptor = "()I")
    public int method402() {
        int var1 = this.field1224[this.field1225] & 0xFF;
        return var1 < 128 ? this.method388() : this.method390() - 32768;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method403(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field1225;
        this.field1225 = 0;
        byte[] var5 = new byte[var4];
        this.method397(true, var5, var4, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1225 = 0;
        if (arg1 != 0) {
            this.field1222 = -175;
        }
        this.method378(var8.length);
        this.method386(var8.length, var8, (byte) -83, 0);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(IZ)V")
    public void method404(int arg0, boolean arg1) {
        this.field1224[this.field1225++] = (byte) (arg0 + 128);
        if (!arg1) {
            this.field1212 = !this.field1212;
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "f", descriptor = "(II)V")
    public void method405(int arg0, int arg1) {
        if (arg1 != 574) {
            this.field1213 = !this.field1213;
        }
        this.field1224[this.field1225++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "f", descriptor = "(I)I")
    public int method406(int arg0) {
        return arg0 == 41312 ? this.field1224[this.field1225++] - 128 & 0xFF : this.field1209;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "g", descriptor = "(I)I")
    public int method407(int arg0) {
        return arg0 <= 0 ? 3 : -this.field1224[this.field1225++] & 0xFF;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "(I)I")
    public int method408(int arg0) {
        int var2 = 66 / arg0;
        return 128 - this.field1224[this.field1225++] & 0xFF;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "(I)B")
    public byte method409(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1224[this.field1225++] - 128);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "j", descriptor = "(I)B")
    public byte method410(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return (byte) -this.field1224[this.field1225++];
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "g", descriptor = "(II)V")
    public void method411(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1210 = !this.field1210;
        }
        this.field1224[this.field1225++] = (byte) arg0;
        this.field1224[this.field1225++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "(II)V")
    public void method412(int arg0, int arg1) {
        if (arg0 > 0) {
            this.field1224[this.field1225++] = (byte) (arg1 >> 8);
            this.field1224[this.field1225++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(ZI)V")
    public void method413(boolean arg0, int arg1) {
        this.field1224[this.field1225++] = (byte) (arg1 + 128);
        if (!arg0) {
            this.field1224[this.field1225++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "k", descriptor = "(I)I")
    public int method414(int arg0) {
        this.field1225 += 2;
        if (arg0 < 6 || arg0 > 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field1224[this.field1225 - 1] & 0xFF) << 8) + (this.field1224[this.field1225 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "l", descriptor = "(I)I")
    public int method415(int arg0) {
        this.field1225 += 2;
        int var2 = 47 / arg0;
        return ((this.field1224[this.field1225 - 2] & 0xFF) << 8) + (this.field1224[this.field1225 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "m", descriptor = "(I)I")
    public int method416(int arg0) {
        while (arg0 >= 0) {
            this.field1222 = -294;
        }
        this.field1225 += 2;
        return ((this.field1224[this.field1225 - 1] & 0xFF) << 8) + (this.field1224[this.field1225 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "n", descriptor = "(I)I")
    public int method417(int arg0) {
        this.field1225 += 2;
        int var2 = ((this.field1224[this.field1225 - 1] & 0xFF) << 8) + (this.field1224[this.field1225 - 2] & 0xFF);
        if (arg0 >= 0) {
            this.field1208 = !this.field1208;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "o", descriptor = "(I)I")
    public int method418(int arg0) {
        this.field1225 += 2;
        int var2 = 89 / arg0;
        int var3 = ((this.field1224[this.field1225 - 2] & 0xFF) << 8) + (this.field1224[this.field1225 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(Z)I")
    public int method419(boolean arg0) {
        this.field1225 += 2;
        int var2 = ((this.field1224[this.field1225 - 1] & 0xFF) << 8) + (this.field1224[this.field1225 - 2] - 128 & 0xFF);
        if (arg0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(B)I")
    public int method420(byte arg0) {
        this.field1225 += 3;
        return arg0 == 34 ? (this.field1224[this.field1225 - 1] & 0xFF) + ((this.field1224[this.field1225 - 2] & 0xFF) << 16) + ((this.field1224[this.field1225 - 3] & 0xFF) << 8) : 3;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "(II)V")
    public void method421(int arg0, int arg1) {
        this.field1224[this.field1225++] = (byte) (arg1 >> 16);
        this.field1224[this.field1225++] = (byte) (arg1 >> 24);
        this.field1224[this.field1225++] = (byte) arg1;
        if (arg0 < 0) {
            this.field1224[this.field1225++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "p", descriptor = "(I)I")
    public int method422(int arg0) {
        int var2 = 5 / arg0;
        this.field1225 += 4;
        return (this.field1224[this.field1225 - 4] & 0xFF) + ((this.field1224[this.field1225 - 3] & 0xFF) << 8) + ((this.field1224[this.field1225 - 1] & 0xFF) << 24) + ((this.field1224[this.field1225 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(B)I")
    public int method423(byte arg0) {
        this.field1225 += 4;
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1205 = !this.field1205;
        }
        return (this.field1224[this.field1225 - 3] & 0xFF) + ((this.field1224[this.field1225 - 4] & 0xFF) << 8) + ((this.field1224[this.field1225 - 2] & 0xFF) << 24) + ((this.field1224[this.field1225 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "(Z)I")
    public int method424(boolean arg0) {
        this.field1225 += 4;
        return arg0 ? (this.field1224[this.field1225 - 2] & 0xFF) + ((this.field1224[this.field1225 - 1] & 0xFF) << 8) + ((this.field1224[this.field1225 - 3] & 0xFF) << 24) + ((this.field1224[this.field1225 - 4] & 0xFF) << 16) : this.field1216;
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(III[B)V")
    public void method425(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != 0) {
            this.field1220 = 49;
        }
        for (int var5 = arg0 + arg2 - 1; var5 >= arg0; var5--) {
            this.field1224[this.field1225++] = arg3[var5];
        }
    }

    @OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(II[BI)V")
    public void method426(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 < 0) {
            for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
                arg2[var5] = (byte) (this.field1224[this.field1225++] - 128);
            }
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
            field1227[var0] = var1;
        }
        field1228 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1233 = new class17(false);
        field1234 = new class17(false);
        field1235 = new class17(false);
        field1236 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
