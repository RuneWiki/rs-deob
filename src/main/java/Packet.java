import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MFMVIYHT")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "client!MFMVIYHT", name = "h", descriptor = "Z")
    private boolean field1261 = false;

    @OriginalMember(owner = "client!MFMVIYHT", name = "i", descriptor = "I")
    private int field1262 = 8;

    @OriginalMember(owner = "client!MFMVIYHT", name = "j", descriptor = "Z")
    private boolean field1263 = false;

    @OriginalMember(owner = "client!MFMVIYHT", name = "k", descriptor = "Z")
    private boolean field1264 = true;

    @OriginalMember(owner = "client!MFMVIYHT", name = "l", descriptor = "B")
    private byte field1265 = 5;

    @OriginalMember(owner = "client!MFMVIYHT", name = "m", descriptor = "I")
    private int field1266 = -29290;

    @OriginalMember(owner = "client!MFMVIYHT", name = "n", descriptor = "Z")
    private boolean field1267 = false;

    @OriginalMember(owner = "client!MFMVIYHT", name = "o", descriptor = "I")
    private int field1268 = 217;

    @OriginalMember(owner = "client!MFMVIYHT", name = "p", descriptor = "I")
    private int field1269 = 236;

    @OriginalMember(owner = "client!MFMVIYHT", name = "q", descriptor = "Z")
    private boolean field1270 = false;

    @OriginalMember(owner = "client!MFMVIYHT", name = "t", descriptor = "B")
    private byte field1273 = 17;

    @OriginalMember(owner = "client!MFMVIYHT", name = "u", descriptor = "B")
    private byte field1274 = 89;

    @OriginalMember(owner = "client!MFMVIYHT", name = "v", descriptor = "B")
    private byte field1275 = -16;

    @OriginalMember(owner = "client!MFMVIYHT", name = "w", descriptor = "Z")
    private boolean field1276 = false;

    @OriginalMember(owner = "client!MFMVIYHT", name = "y", descriptor = "I")
    private int field1278 = 1;

    @OriginalMember(owner = "client!MFMVIYHT", name = "z", descriptor = "[B")
    public byte[] data;

    @OriginalMember(owner = "client!MFMVIYHT", name = "A", descriptor = "I")
    public int pos;

    @OriginalMember(owner = "client!MFMVIYHT", name = "x", descriptor = "Z")
    private static boolean field1277 = true;

    @OriginalMember(owner = "client!MFMVIYHT", name = "C", descriptor = "[I")
    private static int[] crctable = new int[256];

    @OriginalMember(owner = "client!MFMVIYHT", name = "D", descriptor = "[I")
    private static final int[] bitmask;

    @OriginalMember(owner = "client!MFMVIYHT", name = "I", descriptor = "LBOHLFXVX;")
    private static LinkList cacheMin;

    @OriginalMember(owner = "client!MFMVIYHT", name = "J", descriptor = "LBOHLFXVX;")
    private static LinkList cacheMid;

    @OriginalMember(owner = "client!MFMVIYHT", name = "K", descriptor = "LBOHLFXVX;")
    private static LinkList cacheMax;

    @OriginalMember(owner = "client!MFMVIYHT", name = "L", descriptor = "[C")
    private static char[] charset;

    @OriginalMember(owner = "client!MFMVIYHT", name = "B", descriptor = "I")
    public int bitPos;

    @OriginalMember(owner = "client!MFMVIYHT", name = "H", descriptor = "I")
    private static int cacheMaxCount;

    @OriginalMember(owner = "client!MFMVIYHT", name = "G", descriptor = "I")
    private static int cacheMidCount;

    @OriginalMember(owner = "client!MFMVIYHT", name = "F", descriptor = "I")
    private static int cacheMinCount;

    @OriginalMember(owner = "client!MFMVIYHT", name = "r", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!MFMVIYHT", name = "s", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!MFMVIYHT", name = "E", descriptor = "LKRGHNEZN;")
    public Isaac random;

    @OriginalMember(owner = "client!MFMVIYHT", name = "M", descriptor = "Z")
    public static boolean field1292;

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(BI)LMFMVIYHT;")
    public static Packet alloc(byte arg0, int arg1) {
        LinkList var2 = cacheMid;
        synchronized (cacheMid) {
            Packet var3 = null;
            if (arg1 == 0 && cacheMinCount > 0) {
                cacheMinCount--;
                var3 = (Packet) cacheMin.method5();
            } else if (arg1 == 1 && cacheMidCount > 0) {
                cacheMidCount--;
                var3 = (Packet) cacheMid.method5();
            } else if (arg1 == 2 && cacheMaxCount > 0) {
                cacheMaxCount--;
                var3 = (Packet) cacheMax.method5();
            }
            if (var3 != null) {
                var3.pos = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(-211);
        if (arg0 != 0) {
            field1277 = !field1277;
        }
        var5.pos = 0;
        if (arg1 == 0) {
            var5.data = new byte[100];
        } else if (arg1 == 1) {
            var5.data = new byte[5000];
        } else {
            var5.data = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "<init>", descriptor = "(Z[B)V")
    public Packet(boolean arg0, byte[] arg1) {
        this.data = arg1;
        this.pos = 0;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(BI)V")
    public void p1isaac(byte arg0, int arg1) {
        this.data[this.pos++] = (byte) (arg1 + this.random.method329());
        if (arg0 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(I)V")
    public void p1(int arg0) {
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(I)V")
    public void p2(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(IZ)V")
    public void ip2(int arg0, boolean arg1) {
        this.data[this.pos++] = (byte) arg0;
        if (!arg1) {
            this.data[this.pos++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(I)V")
    public void p3(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "d", descriptor = "(I)V")
    public void p4(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 24);
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(IZ)V")
    public void ip4(int arg0, boolean arg1) {
        this.data[this.pos++] = (byte) arg0;
        this.data[this.pos++] = (byte) (arg0 >> 8);
        if (arg1) {
            this.field1262 = 306;
        }
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(JZ)V")
    public void p8(long arg0, boolean arg1) {
        this.data[this.pos++] = (byte) (arg0 >> 56);
        this.data[this.pos++] = (byte) (arg0 >> 48);
        this.data[this.pos++] = (byte) (arg0 >> 40);
        this.data[this.pos++] = (byte) (arg0 >> 32);
        this.data[this.pos++] = (byte) (arg0 >> 24);
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) arg0;
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void pjstr(String arg0) {
        arg0.getBytes(0, arg0.length(), this.data, this.pos);
        this.pos += arg0.length();
        this.data[this.pos++] = 10;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "([BIII)V")
    public void pdata(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field1277 = !field1277;
        }
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            this.data[this.pos++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(II)V")
    public void psize1(int arg0, int arg1) {
        this.data[this.pos - arg0 - 1] = (byte) arg0;
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "()I")
    public int g1() {
        return this.data[this.pos++] & 0xFF;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "d", descriptor = "()B")
    public byte g1b() {
        return this.data[this.pos++];
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "e", descriptor = "()I")
    public int g2() {
        this.pos += 2;
        return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "f", descriptor = "()I")
    public int g2b() {
        this.pos += 2;
        int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "g", descriptor = "()I")
    public int g3() {
        this.pos += 3;
        return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "h", descriptor = "()I")
    public int g4() {
        this.pos += 4;
        return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "e", descriptor = "(I)J")
    public long g8(int arg0) {
        long var2 = (long) this.g4() & 0xFFFFFFFFL;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        long var4 = (long) this.g4() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "i", descriptor = "()Ljava/lang/String;")
    public String gjstr() {
        int var1 = this.pos;
        while (this.data[this.pos++] != 10) {
        }
        return new String(this.data, var1, this.pos - var1 - 1);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "f", descriptor = "(I)[B")
    public byte[] gjstrraw(int arg0) {
        int var2 = this.pos;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        while (this.data[this.pos++] != 10) {
        }
        byte[] var3 = new byte[this.pos - var2 - 1];
        for (int var4 = var2; var4 < this.pos - 1; var4++) {
            var3[var4 - var2] = this.data[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(III[B)V")
    public void gdata(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 >= 0) {
            this.field1264 = !this.field1264;
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            arg3[var5] = this.data[this.pos++];
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(B)V")
    public void accessBits(byte arg0) {
        this.bitPos = this.pos * 8;
        if (arg0 == 6) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(II)I")
    public int gBit(int arg0, int arg1) {
        int var3 = this.bitPos >> 3;
        int var4 = 8 - (this.bitPos & 0x7);
        int var5 = 0;
        this.bitPos += arg1;
        if (arg0 <= 0) {
            return this.field1278;
        }
        while (arg1 > var4) {
            var5 += (this.data[var3++] & bitmask[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.data[var3] & bitmask[var4]) + var5;
        } else {
            var6 = (this.data[var3] >> var4 - arg1 & bitmask[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "g", descriptor = "(I)V")
    public void accessBytes(int arg0) {
        if (this.field1266 != arg0) {
            this.field1266 = -448;
        }
        this.pos = (this.bitPos + 7) / 8;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "j", descriptor = "()I")
    public int gsmart() {
        int var1 = this.data[this.pos] & 0xFF;
        return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "k", descriptor = "()I")
    public int gsmarts() {
        int var1 = this.data[this.pos] & 0xFF;
        return var1 < 128 ? this.g1() : this.g2() - 32768;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void rsaenc(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.pos;
        this.pos = 0;
        byte[] var5 = new byte[var4];
        this.gdata(var4, 0, -21, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        if (arg0 >= 0 && arg0 <= 0) {
            this.pos = 0;
            this.p1(var8.length);
            this.pdata(var8, 0, var8.length, 0);
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(ZI)V")
    public void p1_alt1(boolean arg0, int arg1) {
        this.data[this.pos++] = (byte) (arg1 + 128);
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(BI)V")
    public void p1_alt2(byte arg0, int arg1) {
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.data[this.pos++] = (byte) -arg1;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(II)V")
    public void p1_alt3(int arg0, int arg1) {
        if (arg1 == 1) {
            this.data[this.pos++] = (byte) (128 - arg0);
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "h", descriptor = "(I)I")
    public int g1_alt1(int arg0) {
        return this.field1271 == arg0 ? this.data[this.pos++] - 128 & 0xFF : this.field1268;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "i", descriptor = "(I)I")
    public int g1_alt2(int arg0) {
        return arg0 == -34545 ? -this.data[this.pos++] & 0xFF : this.field1262;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "j", descriptor = "(I)I")
    public int g1_alt3(int arg0) {
        int var2 = 77 / arg0;
        return 128 - this.data[this.pos++] & 0xFF;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "k", descriptor = "(I)B")
    public byte g1b_alt1(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (this.data[this.pos++] - 128);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "l", descriptor = "(I)B")
    public byte g1b_alt2(int arg0) {
        if (arg0 != 0) {
            this.field1278 = 54;
        }
        return (byte) -this.data[this.pos++];
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "m", descriptor = "(I)B")
    public byte g1b_alt3(int arg0) {
        if (arg0 != 43428) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (128 - this.data[this.pos++]);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "d", descriptor = "(II)V")
    public void p2_alt1(int arg0, int arg1) {
        this.data[this.pos++] = (byte) arg1;
        this.data[this.pos++] = (byte) (arg1 >> 8);
        if (arg0 != 0) {
            this.field1272 = 403;
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "e", descriptor = "(II)V")
    public void p2_alt2(int arg0, int arg1) {
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) (arg0 + 128);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "f", descriptor = "(II)V")
    public void p2_alt3(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            this.field1261 = !this.field1261;
        }
        this.data[this.pos++] = (byte) (arg1 + 128);
        this.data[this.pos++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "n", descriptor = "(I)I")
    public int g2_alt1(int arg0) {
        this.pos += 2;
        return arg0 >= 0 ? 3 : ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(B)I")
    public int g2_alt2(byte arg0) {
        this.pos += 2;
        return arg0 == 9 ? ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF) : this.field1272;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "o", descriptor = "(I)I")
    public int g2_alt3(int arg0) {
        this.pos += 2;
        if (arg0 >= 0) {
            this.field1272 = 68;
        }
        return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "p", descriptor = "(I)I")
    public int g2b_alt1(int arg0) {
        this.pos += 2;
        int var2 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(B)I")
    public int g2b_alt2(byte arg0) {
        this.pos += 2;
        if (this.field1273 != arg0) {
            this.field1267 = !this.field1267;
        }
        int var2 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "q", descriptor = "(I)I")
    public int g3_alt2(int arg0) {
        this.pos += 3;
        return arg0 >= 0 ? 1 : (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "r", descriptor = "(I)I")
    public int g4_alt1(int arg0) {
        if (arg0 <= 0) {
            this.field1272 = -453;
        }
        this.pos += 4;
        return (this.data[this.pos - 4] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "s", descriptor = "(I)I")
    public int g4_alt2(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field1272 = -258;
        }
        this.pos += 4;
        return (this.data[this.pos - 3] & 0xFF) + ((this.data[this.pos - 4] & 0xFF) << 8) + ((this.data[this.pos - 2] & 0xFF) << 24) + ((this.data[this.pos - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(Z)I")
    public int g4_alt3(boolean arg0) {
        this.pos += 4;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8) + ((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(B[BII)V")
    public void gdata_alt1(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 == -73) {
            for (int var5 = arg2 + arg3 - 1; var5 >= arg3; var5--) {
                arg1[var5] = this.data[this.pos++];
            }
        }
    }

    @OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "([BIII)V")
    public void gdata_alt2(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field1264 = !this.field1264;
        }
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            arg0[var5] = (byte) (this.data[this.pos++] - 128);
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
            crctable[var0] = var1;
        }
        bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        cacheMin = new LinkList(true);
        cacheMid = new LinkList(true);
        cacheMax = new LinkList(true);
        charset = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
