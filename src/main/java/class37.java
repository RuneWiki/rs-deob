import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MNKDCXXG")
public class class37 extends class42 {

    @OriginalMember(owner = "client!MNKDCXXG", name = "h", descriptor = "Z")
    private boolean field1198 = false;

    @OriginalMember(owner = "client!MNKDCXXG", name = "i", descriptor = "Z")
    private boolean field1199 = false;

    @OriginalMember(owner = "client!MNKDCXXG", name = "l", descriptor = "B")
    private byte field1202 = -100;

    @OriginalMember(owner = "client!MNKDCXXG", name = "m", descriptor = "B")
    private byte field1203 = -70;

    @OriginalMember(owner = "client!MNKDCXXG", name = "n", descriptor = "I")
    private int field1204 = -352;

    @OriginalMember(owner = "client!MNKDCXXG", name = "p", descriptor = "B")
    private byte field1206 = 80;

    @OriginalMember(owner = "client!MNKDCXXG", name = "q", descriptor = "I")
    private int field1207 = 237;

    @OriginalMember(owner = "client!MNKDCXXG", name = "r", descriptor = "I")
    private int field1208 = 766;

    @OriginalMember(owner = "client!MNKDCXXG", name = "s", descriptor = "Z")
    private boolean field1209 = false;

    @OriginalMember(owner = "client!MNKDCXXG", name = "u", descriptor = "[B")
    public byte[] field1211;

    @OriginalMember(owner = "client!MNKDCXXG", name = "v", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!MNKDCXXG", name = "x", descriptor = "[I")
    private static int[] field1214 = new int[256];

    @OriginalMember(owner = "client!MNKDCXXG", name = "y", descriptor = "[I")
    private static final int[] field1215;

    @OriginalMember(owner = "client!MNKDCXXG", name = "D", descriptor = "LWOVRPCGT;")
    private static class61 field1220;

    @OriginalMember(owner = "client!MNKDCXXG", name = "E", descriptor = "LWOVRPCGT;")
    private static class61 field1221;

    @OriginalMember(owner = "client!MNKDCXXG", name = "F", descriptor = "LWOVRPCGT;")
    private static class61 field1222;

    @OriginalMember(owner = "client!MNKDCXXG", name = "G", descriptor = "[C")
    private static char[] field1223;

    @OriginalMember(owner = "client!MNKDCXXG", name = "j", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!MNKDCXXG", name = "k", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!MNKDCXXG", name = "o", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!MNKDCXXG", name = "t", descriptor = "I")
    private static int field1210;

    @OriginalMember(owner = "client!MNKDCXXG", name = "w", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!MNKDCXXG", name = "A", descriptor = "I")
    private static int field1217;

    @OriginalMember(owner = "client!MNKDCXXG", name = "B", descriptor = "I")
    private static int field1218;

    @OriginalMember(owner = "client!MNKDCXXG", name = "C", descriptor = "I")
    private static int field1219;

    @OriginalMember(owner = "client!MNKDCXXG", name = "z", descriptor = "LUVSYUCDF;")
    public class55 field1216;

    @OriginalMember(owner = "client!MNKDCXXG", name = "H", descriptor = "Z")
    public static boolean field1224;

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(BI)LMNKDCXXG;")
    public static class37 method374(byte arg0, int arg1) {
        class61 var2 = field1221;
        synchronized (field1221) {
            class37 var3 = null;
            if (arg1 == 0 && field1217 > 0) {
                field1217--;
                var3 = (class37) field1220.method542();
            } else if (arg1 == 1 && field1218 > 0) {
                field1218--;
                var3 = (class37) field1221.method542();
            } else if (arg1 == 2 && field1219 > 0) {
                field1219--;
                var3 = (class37) field1222.method542();
            }
            if (var3 != null) {
                var3.field1212 = 0;
                return var3;
            }
        }
        class37 var5 = new class37((byte) -71);
        if (arg0 != 4) {
            field1210 = 54;
        }
        var5.field1212 = 0;
        if (arg1 == 0) {
            var5.field1211 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1211 = new byte[5000];
        } else {
            var5.field1211 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "<init>", descriptor = "(B)V")
    private class37(byte arg0) {
        if (arg0 != -71) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "<init>", descriptor = "([BI)V")
    public class37(byte[] arg0, int arg1) {
        this.field1211 = arg0;
        this.field1212 = 0;
        if (arg1 >= 0) {
            this.field1198 = !this.field1198;
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(II)V")
    public void method375(int arg0, int arg1) {
        if (arg1 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1211[this.field1212++] = (byte) (arg0 + this.field1216.method514());
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(I)V")
    public void method376(int arg0) {
        this.field1211[this.field1212++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(I)V")
    public void method377(int arg0) {
        this.field1211[this.field1212++] = (byte) (arg0 >> 8);
        this.field1211[this.field1212++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(II)V")
    public void method378(int arg0, int arg1) {
        if (arg0 != 27823) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1211[this.field1212++] = (byte) arg1;
        this.field1211[this.field1212++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(I)V")
    public void method379(int arg0) {
        this.field1211[this.field1212++] = (byte) (arg0 >> 16);
        this.field1211[this.field1212++] = (byte) (arg0 >> 8);
        this.field1211[this.field1212++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "(I)V")
    public void method380(int arg0) {
        this.field1211[this.field1212++] = (byte) (arg0 >> 24);
        this.field1211[this.field1212++] = (byte) (arg0 >> 16);
        this.field1211[this.field1212++] = (byte) (arg0 >> 8);
        this.field1211[this.field1212++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(II)V")
    public void method381(int arg0, int arg1) {
        this.field1211[this.field1212++] = (byte) arg1;
        this.field1211[this.field1212++] = (byte) (arg1 >> 8);
        this.field1211[this.field1212++] = (byte) (arg1 >> 16);
        if (arg0 == 0) {
            this.field1211[this.field1212++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(JI)V")
    public void method382(long arg0, int arg1) {
        this.field1211[this.field1212++] = (byte) (arg0 >> 56);
        this.field1211[this.field1212++] = (byte) (arg0 >> 48);
        if (arg1 >= 0) {
            this.field1208 = 416;
        }
        this.field1211[this.field1212++] = (byte) (arg0 >> 40);
        this.field1211[this.field1212++] = (byte) (arg0 >> 32);
        this.field1211[this.field1212++] = (byte) (arg0 >> 24);
        this.field1211[this.field1212++] = (byte) (arg0 >> 16);
        this.field1211[this.field1212++] = (byte) (arg0 >> 8);
        this.field1211[this.field1212++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method383(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1211, this.field1212);
        this.field1212 += arg0.length();
        this.field1211[this.field1212++] = 10;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(III[B)V")
    public void method384(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 < 0) {
            for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
                this.field1211[this.field1212++] = arg3[var5];
            }
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(ZI)V")
    public void method385(boolean arg0, int arg1) {
        this.field1211[this.field1212 - arg1 - 1] = (byte) arg1;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "()I")
    public int method386() {
        return this.field1211[this.field1212++] & 0xFF;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "()B")
    public byte method387() {
        return this.field1211[this.field1212++];
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "()I")
    public int method388() {
        this.field1212 += 2;
        return ((this.field1211[this.field1212 - 2] & 0xFF) << 8) + (this.field1211[this.field1212 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "f", descriptor = "()I")
    public int method389() {
        this.field1212 += 2;
        int var1 = ((this.field1211[this.field1212 - 2] & 0xFF) << 8) + (this.field1211[this.field1212 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "g", descriptor = "()I")
    public int method390() {
        this.field1212 += 3;
        return (this.field1211[this.field1212 - 1] & 0xFF) + ((this.field1211[this.field1212 - 3] & 0xFF) << 16) + ((this.field1211[this.field1212 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "h", descriptor = "()I")
    public int method391() {
        this.field1212 += 4;
        return (this.field1211[this.field1212 - 1] & 0xFF) + ((this.field1211[this.field1212 - 2] & 0xFF) << 8) + ((this.field1211[this.field1212 - 4] & 0xFF) << 24) + ((this.field1211[this.field1212 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(B)J")
    public long method392(byte arg0) {
        long var2 = (long) this.method391() & 0xFFFFFFFFL;
        if (this.field1202 != arg0) {
            throw new NullPointerException();
        }
        long var4 = (long) this.method391() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "i", descriptor = "()Ljava/lang/String;")
    public String method393() {
        int var1 = this.field1212;
        while (this.field1211[this.field1212++] != 10) {
        }
        return new String(this.field1211, var1, this.field1212 - var1 - 1);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "(I)[B")
    public byte[] method394(int arg0) {
        int var2 = this.field1212;
        while (this.field1211[this.field1212++] != 10) {
        }
        byte[] var3 = new byte[this.field1212 - var2 - 1];
        if (arg0 != 1927) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = var2; var5 < this.field1212 - 1; var5++) {
            var3[var5 - var2] = this.field1211[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "([BIII)V")
    public void method395(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 31 / arg1;
        for (int var6 = arg3; var6 < arg2 + arg3; var6++) {
            arg0[var6] = this.field1211[this.field1212++];
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(B)V")
    public void method396(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
            this.field1213 = this.field1212 * 8;
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "(II)I")
    public int method397(int arg0, int arg1) {
        int var3 = this.field1213 >> 3;
        int var4 = 8 - (this.field1213 & 0x7);
        int var5 = 0;
        if (arg1 < 4 || arg1 > 4) {
            return 3;
        }
        this.field1213 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1211[var3++] & field1215[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1211[var3] & field1215[var4]) + var5;
        } else {
            var6 = (this.field1211[var3] >> var4 - arg0 & field1215[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "f", descriptor = "(I)V")
    public void method398(int arg0) {
        this.field1212 = (this.field1213 + 7) / 8;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "j", descriptor = "()I")
    public int method399() {
        int var1 = this.field1211[this.field1212] & 0xFF;
        return var1 < 128 ? this.method386() - 64 : this.method388() - 49152;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "k", descriptor = "()I")
    public int method400() {
        int var1 = this.field1211[this.field1212] & 0xFF;
        return var1 < 128 ? this.method386() : this.method388() - 32768;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method401(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field1212;
        this.field1212 = 0;
        byte[] var5 = new byte[var4];
        this.method395(var5, 432, var4, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg2);
        byte[] var8 = var7.toByteArray();
        this.field1212 = 0;
        this.method376(var8.length);
        this.method384(0, -249, var8.length, var8);
        if (arg1 <= 0) {
            this.field1201 = -460;
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(BI)V")
    public void method402(byte arg0, int arg1) {
        if (arg0 != -60) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1211[this.field1212++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(BI)V")
    public void method403(byte arg0, int arg1) {
        if (arg0 != 117) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1211[this.field1212++] = (byte) -arg1;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(ZI)V")
    public void method404(boolean arg0, int arg1) {
        this.field1211[this.field1212++] = (byte) (128 - arg1);
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "g", descriptor = "(I)I")
    public int method405(int arg0) {
        while (arg0 >= 0) {
            this.field1204 = -441;
        }
        return this.field1211[this.field1212++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "h", descriptor = "(I)I")
    public int method406(int arg0) {
        if (arg0 >= 0) {
            this.field1205 = -225;
        }
        return -this.field1211[this.field1212++] & 0xFF;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(B)I")
    public int method407(byte arg0) {
        return arg0 == 2 ? 128 - this.field1211[this.field1212++] & 0xFF : 4;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(Z)B")
    public byte method408(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1211[this.field1212++] - 128);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "(B)B")
    public byte method409(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return (byte) (128 - this.field1211[this.field1212++]);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(IZ)V")
    public void method410(int arg0, boolean arg1) {
        if (arg1) {
            this.field1198 = !this.field1198;
        }
        this.field1211[this.field1212++] = (byte) arg0;
        this.field1211[this.field1212++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(IZ)V")
    public void method411(int arg0, boolean arg1) {
        this.field1211[this.field1212++] = (byte) (arg0 >> 8);
        if (!arg1) {
            this.field1211[this.field1212++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "(II)V")
    public void method412(int arg0, int arg1) {
        this.field1211[this.field1212++] = (byte) (arg1 + 128);
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1211[this.field1212++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "i", descriptor = "(I)I")
    public int method413(int arg0) {
        if (arg0 >= 0) {
            this.field1199 = !this.field1199;
        }
        this.field1212 += 2;
        return ((this.field1211[this.field1212 - 1] & 0xFF) << 8) + (this.field1211[this.field1212 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "j", descriptor = "(I)I")
    public int method414(int arg0) {
        while (arg0 >= 0) {
            this.field1198 = !this.field1198;
        }
        this.field1212 += 2;
        return ((this.field1211[this.field1212 - 2] & 0xFF) << 8) + (this.field1211[this.field1212 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "(B)I")
    public int method415(byte arg0) {
        if (arg0 == -98) {
            this.field1212 += 2;
            return ((this.field1211[this.field1212 - 1] & 0xFF) << 8) + (this.field1211[this.field1212 - 2] - 128 & 0xFF);
        } else {
            return this.field1200;
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(Z)I")
    public int method416(boolean arg0) {
        this.field1212 += 2;
        int var2 = ((this.field1211[this.field1212 - 1] & 0xFF) << 8) + (this.field1211[this.field1212 - 2] & 0xFF);
        if (arg0) {
            return 4;
        } else {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "k", descriptor = "(I)I")
    public int method417(int arg0) {
        this.field1212 += 2;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = ((this.field1211[this.field1212 - 2] & 0xFF) << 8) + (this.field1211[this.field1212 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "l", descriptor = "(I)I")
    public int method418(int arg0) {
        this.field1212 += 2;
        while (arg0 >= 0) {
            this.field1198 = !this.field1198;
        }
        int var2 = ((this.field1211[this.field1212 - 1] & 0xFF) << 8) + (this.field1211[this.field1212 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "m", descriptor = "(I)I")
    public int method419(int arg0) {
        this.field1212 += 3;
        if (arg0 >= 0) {
            this.field1198 = !this.field1198;
        }
        return (this.field1211[this.field1212 - 2] & 0xFF) + ((this.field1211[this.field1212 - 3] & 0xFF) << 16) + ((this.field1211[this.field1212 - 1] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(IB)V")
    public void method420(int arg0, byte arg1) {
        this.field1211[this.field1212++] = (byte) (arg0 >> 16);
        this.field1211[this.field1212++] = (byte) (arg0 >> 24);
        this.field1211[this.field1212++] = (byte) arg0;
        if (arg1 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1211[this.field1212++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "n", descriptor = "(I)I")
    public int method421(int arg0) {
        if (arg0 == -273) {
            this.field1212 += 4;
            return (this.field1211[this.field1212 - 4] & 0xFF) + ((this.field1211[this.field1212 - 3] & 0xFF) << 8) + ((this.field1211[this.field1212 - 1] & 0xFF) << 24) + ((this.field1211[this.field1212 - 2] & 0xFF) << 16);
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "o", descriptor = "(I)I")
    public int method422(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            field1210 = 236;
        }
        this.field1212 += 4;
        return (this.field1211[this.field1212 - 3] & 0xFF) + ((this.field1211[this.field1212 - 4] & 0xFF) << 8) + ((this.field1211[this.field1212 - 2] & 0xFF) << 24) + ((this.field1211[this.field1212 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(Z)I")
    public int method423(boolean arg0) {
        this.field1212 += 4;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1211[this.field1212 - 2] & 0xFF) + ((this.field1211[this.field1212 - 1] & 0xFF) << 8) + ((this.field1211[this.field1212 - 3] & 0xFF) << 24) + ((this.field1211[this.field1212 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "([BIII)V")
    public void method424(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -46257) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg2 + arg3; var6++) {
            arg0[var6] = (byte) (this.field1211[this.field1212++] - 128);
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
            field1214[var0] = var1;
        }
        field1215 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1220 = new class61(-270);
        field1221 = new class61(-270);
        field1222 = new class61(-270);
        field1223 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
