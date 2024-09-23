import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "jb", name = "h", descriptor = "Z")
    private boolean field578 = false;

    @OriginalMember(owner = "jb", name = "i", descriptor = "I")
    private int field579 = -95;

    @OriginalMember(owner = "jb", name = "k", descriptor = "Z")
    private boolean field581 = false;

    @OriginalMember(owner = "jb", name = "l", descriptor = "B")
    private byte field582 = 61;

    @OriginalMember(owner = "jb", name = "m", descriptor = "B")
    private byte field583 = 61;

    @OriginalMember(owner = "jb", name = "n", descriptor = "Z")
    private boolean field584 = true;

    @OriginalMember(owner = "jb", name = "o", descriptor = "[B")
    public byte[] field585;

    @OriginalMember(owner = "jb", name = "p", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "jb", name = "j", descriptor = "I")
    private static int field580 = -836;

    @OriginalMember(owner = "jb", name = "r", descriptor = "[I")
    private static int[] field588 = new int[256];

    @OriginalMember(owner = "jb", name = "s", descriptor = "[I")
    private static final int[] field589;

    @OriginalMember(owner = "jb", name = "x", descriptor = "Lnb;")
    private static LinkList field594;

    @OriginalMember(owner = "jb", name = "y", descriptor = "Lnb;")
    private static LinkList field595;

    @OriginalMember(owner = "jb", name = "z", descriptor = "Lnb;")
    private static LinkList field596;

    @OriginalMember(owner = "jb", name = "q", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "jb", name = "u", descriptor = "I")
    private static int field591;

    @OriginalMember(owner = "jb", name = "v", descriptor = "I")
    private static int field592;

    @OriginalMember(owner = "jb", name = "w", descriptor = "I")
    private static int field593;

    @OriginalMember(owner = "jb", name = "t", descriptor = "Lsb;")
    public Isaac field590;

    @OriginalMember(owner = "jb", name = "A", descriptor = "Z")
    public static boolean field597;

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II)Ljb;")
    public static Packet method176(int arg0, int arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        LinkList var2 = field595;
        synchronized (field595) {
            Packet var3 = null;
            if (arg1 == 0 && field591 > 0) {
                field591--;
                var3 = (Packet) field594.method202();
            } else if (arg1 == 1 && field592 > 0) {
                field592--;
                var3 = (Packet) field595.method202();
            } else if (arg1 == 2 && field593 > 0) {
                field593--;
                var3 = (Packet) field596.method202();
            }
            if (var3 != null) {
                var3.field586 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(false);
        var5.field586 = 0;
        if (arg1 == 0) {
            var5.field585 = new byte[100];
        } else if (arg1 == 1) {
            var5.field585 = new byte[5000];
        } else {
            var5.field585 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Z)V")
    private Packet(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "([BB)V")
    public Packet(byte[] arg0, byte arg1) {
        this.field585 = arg0;
        this.field586 = 0;
        if (arg1 != 63) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(ZI)V")
    public void method177(boolean arg0, int arg1) {
        if (!arg0) {
            this.field585[this.field586++] = (byte) (arg1 + this.field590.method221());
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I)V")
    public void method178(int arg0) {
        this.field585[this.field586++] = (byte) arg0;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public void method179(int arg0) {
        this.field585[this.field586++] = (byte) (arg0 >> 8);
        this.field585[this.field586++] = (byte) arg0;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public void method180(int arg0) {
        this.field585[this.field586++] = (byte) (arg0 >> 24);
        this.field585[this.field586++] = (byte) (arg0 >> 16);
        this.field585[this.field586++] = (byte) (arg0 >> 8);
        this.field585[this.field586++] = (byte) arg0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(JI)V")
    public void method181(long arg0, int arg1) {
        this.field585[this.field586++] = (byte) (arg0 >> 56);
        this.field585[this.field586++] = (byte) (arg0 >> 48);
        this.field585[this.field586++] = (byte) (arg0 >> 40);
        this.field585[this.field586++] = (byte) (arg0 >> 32);
        while (arg1 >= 0) {
            field580 = -185;
        }
        this.field585[this.field586++] = (byte) (arg0 >> 24);
        this.field585[this.field586++] = (byte) (arg0 >> 16);
        this.field585[this.field586++] = (byte) (arg0 >> 8);
        this.field585[this.field586++] = (byte) arg0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method182(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field585, this.field586);
        this.field586 += arg0.length();
        this.field585[this.field586++] = 10;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(IZI[B)V")
    public void method183(int arg0, boolean arg1, int arg2, byte[] arg3) {
        if (arg1) {
            field580 = -195;
        }
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            this.field585[this.field586++] = arg3[var5];
        }
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(II)V")
    public void method184(int arg0, int arg1) {
        this.field585[this.field586 - arg1 - 1] = (byte) arg1;
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "()I")
    public int method185() {
        return this.field585[this.field586++] & 0xFF;
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "()B")
    public byte method186() {
        return this.field585[this.field586++];
    }

    @OriginalMember(owner = "jb", name = "e", descriptor = "()I")
    public int method187() {
        this.field586 += 2;
        return ((this.field585[this.field586 - 2] & 0xFF) << 8) + (this.field585[this.field586 - 1] & 0xFF);
    }

    @OriginalMember(owner = "jb", name = "f", descriptor = "()I")
    public int method188() {
        this.field586 += 2;
        int var1 = ((this.field585[this.field586 - 2] & 0xFF) << 8) + (this.field585[this.field586 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "jb", name = "g", descriptor = "()I")
    public int method189() {
        this.field586 += 3;
        return (this.field585[this.field586 - 1] & 0xFF) + ((this.field585[this.field586 - 3] & 0xFF) << 16) + ((this.field585[this.field586 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "jb", name = "h", descriptor = "()I")
    public int method190() {
        this.field586 += 4;
        return (this.field585[this.field586 - 1] & 0xFF) + ((this.field585[this.field586 - 2] & 0xFF) << 8) + ((this.field585[this.field586 - 4] & 0xFF) << 24) + ((this.field585[this.field586 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(I)J")
    public long method191(int arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method190() & 0xFFFFFFFFL;
        long var4 = (long) this.method190() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "jb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method192() {
        int var1 = this.field586;
        while (this.field585[this.field586++] != 10) {
        }
        return new String(this.field585, var1, this.field586 - var1 - 1);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(B)[B")
    public byte[] method193(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field578 = !this.field578;
        }
        int var3 = this.field586;
        while (this.field585[this.field586++] != 10) {
        }
        byte[] var4 = new byte[this.field586 - var3 - 1];
        for (int var5 = var3; var5 < this.field586 - 1; var5++) {
            var4[var5 - var3] = this.field585[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[BZ)V")
    public void method194(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (arg3) {
            this.field579 = 301;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            arg2[var5] = this.field585[this.field586++];
        }
    }

    @OriginalMember(owner = "jb", name = "e", descriptor = "(I)V")
    public void method195(int arg0) {
        this.field587 = this.field586 * 8;
        if (arg0 != 0) {
            this.field579 = -441;
        }
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(II)I")
    public int method196(int arg0, int arg1) {
        int var3 = this.field587 >> 3;
        int var4 = 8 - (this.field587 & 0x7);
        int var5 = 0;
        int var6 = 94 / arg0;
        this.field587 += arg1;
        while (arg1 > var4) {
            var5 += (this.field585[var3++] & field589[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field585[var3] & field589[var4]) + var5;
        } else {
            var7 = (this.field585[var3] >> var4 - arg1 & field589[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "jb", name = "f", descriptor = "(I)V")
    public void method197(int arg0) {
        this.field586 = (this.field587 + 7) / 8;
        if (arg0 != 0) {
            field580 = 406;
        }
    }

    @OriginalMember(owner = "jb", name = "j", descriptor = "()I")
    public int method198() {
        int var1 = this.field585[this.field586] & 0xFF;
        return var1 < 128 ? this.method185() - 64 : this.method187() - 49152;
    }

    @OriginalMember(owner = "jb", name = "k", descriptor = "()I")
    public int method199() {
        int var1 = this.field585[this.field586] & 0xFF;
        return var1 < 128 ? this.method185() : this.method187() - 32768;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
    public void method200(BigInteger arg0, boolean arg1, BigInteger arg2) {
        int var4 = this.field586;
        this.field586 = 0;
        byte[] var5 = new byte[var4];
        this.method194(0, var4, var5, false);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field586 = 0;
        this.method178(var8.length);
        if (!arg1) {
            this.field579 = 440;
        }
        this.method183(var8.length, false, 0, var8);
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
            field588[var0] = var1;
        }
        field589 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field594 = new LinkList(845);
        field595 = new LinkList(845);
        field596 = new LinkList(845);
    }
}
