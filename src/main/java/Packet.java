import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "h", descriptor = "Z")
    private boolean field704 = true;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    private int field705 = 8;

    @OriginalMember(owner = "mb", name = "j", descriptor = "B")
    private byte field706 = 9;

    @OriginalMember(owner = "mb", name = "k", descriptor = "Z")
    private boolean field707 = true;

    @OriginalMember(owner = "mb", name = "l", descriptor = "Z")
    private boolean field708 = false;

    @OriginalMember(owner = "mb", name = "m", descriptor = "Z")
    private boolean field709 = false;

    @OriginalMember(owner = "mb", name = "n", descriptor = "I")
    private int field710 = 27016;

    @OriginalMember(owner = "mb", name = "o", descriptor = "Z")
    private boolean field711 = false;

    @OriginalMember(owner = "mb", name = "p", descriptor = "[B")
    public byte[] field712;

    @OriginalMember(owner = "mb", name = "q", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "mb", name = "s", descriptor = "[I")
    private static int[] field715 = new int[256];

    @OriginalMember(owner = "mb", name = "t", descriptor = "[I")
    private static final int[] field716;

    @OriginalMember(owner = "mb", name = "y", descriptor = "Lpb;")
    private static LinkList field721;

    @OriginalMember(owner = "mb", name = "z", descriptor = "Lpb;")
    private static LinkList field722;

    @OriginalMember(owner = "mb", name = "A", descriptor = "Lpb;")
    private static LinkList field723;

    @OriginalMember(owner = "mb", name = "r", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "mb", name = "v", descriptor = "I")
    private static int field718;

    @OriginalMember(owner = "mb", name = "w", descriptor = "I")
    private static int field719;

    @OriginalMember(owner = "mb", name = "x", descriptor = "I")
    private static int field720;

    @OriginalMember(owner = "mb", name = "u", descriptor = "Lxb;")
    public Isaac field717;

    @OriginalMember(owner = "mb", name = "B", descriptor = "Z")
    public static boolean field724;

    @OriginalMember(owner = "mb", name = "a", descriptor = "(ZI)Lmb;")
    public static Packet method225(boolean arg0, int arg1) {
        LinkList var2 = field722;
        synchronized (field722) {
            Packet var3 = null;
            if (arg1 == 0 && field718 > 0) {
                field718--;
                var3 = (Packet) field721.method256();
            } else if (arg1 == 1 && field719 > 0) {
                field719--;
                var3 = (Packet) field722.method256();
            } else if (arg1 == 2 && field720 > 0) {
                field720--;
                var3 = (Packet) field723.method256();
            }
            if (var3 != null) {
                var3.field713 = 0;
                return var3;
            }
        }
        if (arg0) {
            throw new NullPointerException();
        }
        Packet var5 = new Packet((byte) 115);
        var5.field713 = 0;
        if (arg1 == 0) {
            var5.field712 = new byte[100];
        } else if (arg1 == 1) {
            var5.field712 = new byte[5000];
        } else {
            var5.field712 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Z)V")
    public void method226(boolean arg0) {
        LinkList var2 = field722;
        synchronized (field722) {
            this.field713 = 0;
            if (this.field712.length == 100 && field718 < 1000) {
                field721.method254(this);
                field718++;
                return;
            }
            if (this.field712.length == 5000 && field719 < 250) {
                field722.method254(this);
                field719++;
                return;
            }
            if (this.field712.length == 30000 && field720 < 50) {
                field723.method254(this);
                field720++;
                return;
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(B)V")
    private Packet(byte arg0) {
        if (arg0 != 115) {
            this.field711 = !this.field711;
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "([BZ)V")
    public Packet(byte[] arg0, boolean arg1) {
        this.field712 = arg0;
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field713 = 0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II)V")
    public void method227(int arg0, int arg1) {
        this.field712[this.field713++] = (byte) (arg1 + this.field717.method304());
        if (arg0 < 9 || arg0 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public void method228(int arg0) {
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public void method229(int arg0) {
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(II)V")
    public void method230(int arg0, int arg1) {
        this.field712[this.field713++] = (byte) arg0;
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(I)V")
    public void method231(int arg0) {
        this.field712[this.field713++] = (byte) (arg0 >> 16);
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(I)V")
    public void method232(int arg0) {
        this.field712[this.field713++] = (byte) (arg0 >> 24);
        this.field712[this.field713++] = (byte) (arg0 >> 16);
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IB)V")
    public void method233(int arg0, byte arg1) {
        this.field712[this.field713++] = (byte) arg0;
        this.field712[this.field713++] = (byte) (arg0 >> 8);
        this.field712[this.field713++] = (byte) (arg0 >> 16);
        this.field712[this.field713++] = (byte) (arg0 >> 24);
        if (arg1 == 127) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IJ)V")
    public void method234(int arg0, long arg1) {
        this.field712[this.field713++] = (byte) (arg1 >> 56);
        this.field712[this.field713++] = (byte) (arg1 >> 48);
        this.field712[this.field713++] = (byte) (arg1 >> 40);
        this.field712[this.field713++] = (byte) (arg1 >> 32);
        this.field712[this.field713++] = (byte) (arg1 >> 24);
        this.field712[this.field713++] = (byte) (arg1 >> 16);
        this.field712[this.field713++] = (byte) (arg1 >> 8);
        int var4 = 63 / arg0;
        this.field712[this.field713++] = (byte) arg1;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method235(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field712, this.field713);
        this.field713 += arg0.length();
        this.field712[this.field713++] = 10;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "([BIII)V")
    public void method236(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -37074) {
            this.field711 = !this.field711;
        }
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            this.field712[this.field713++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IZ)V")
    public void method237(int arg0, boolean arg1) {
        this.field712[this.field713 - arg0 - 1] = (byte) arg0;
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "()I")
    public int method238() {
        return this.field712[this.field713++] & 0xFF;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "()B")
    public byte method239() {
        return this.field712[this.field713++];
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "()I")
    public int method240() {
        this.field713 += 2;
        return ((this.field712[this.field713 - 2] & 0xFF) << 8) + (this.field712[this.field713 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "()I")
    public int method241() {
        this.field713 += 2;
        int var1 = ((this.field712[this.field713 - 2] & 0xFF) << 8) + (this.field712[this.field713 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "()I")
    public int method242() {
        this.field713 += 3;
        return (this.field712[this.field713 - 1] & 0xFF) + ((this.field712[this.field713 - 3] & 0xFF) << 16) + ((this.field712[this.field713 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "()I")
    public int method243() {
        this.field713 += 4;
        return (this.field712[this.field713 - 1] & 0xFF) + ((this.field712[this.field713 - 2] & 0xFF) << 8) + ((this.field712[this.field713 - 4] & 0xFF) << 24) + ((this.field712[this.field713 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(Z)J")
    public long method244(boolean arg0) {
        long var2 = (long) this.method243() & 0xFFFFFFFFL;
        long var4 = (long) this.method243() & 0xFFFFFFFFL;
        if (!arg0) {
            this.field711 = !this.field711;
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method245() {
        int var1 = this.field713;
        while (this.field712[this.field713++] != 10) {
        }
        return new String(this.field712, var1, this.field713 - var1 - 1);
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(I)[B")
    public byte[] method246(int arg0) {
        int var2 = this.field713;
        while (this.field712[this.field713++] != 10) {
        }
        byte[] var3 = new byte[this.field713 - var2 - 1];
        if (this.field705 != arg0) {
            this.field711 = !this.field711;
        }
        for (int var4 = var2; var4 < this.field713 - 1; var4++) {
            var3[var4 - var2] = this.field712[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II[BI)V")
    public void method247(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 <= 0) {
            this.field704 = !this.field704;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg2[var5] = this.field712[this.field713++];
        }
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "(I)V")
    public void method248(int arg0) {
        if (arg0 == -15529) {
            this.field714 = this.field713 * 8;
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(II)I")
    public int method249(int arg0, int arg1) {
        int var3 = this.field714 >> 3;
        int var4 = 8 - (this.field714 & 0x7);
        int var5 = 0;
        if (arg1 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field714 += arg0;
        while (arg0 > var4) {
            var5 += (this.field712[var3++] & field716[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg0 == var4) {
            var7 = (this.field712[var3] & field716[var4]) + var5;
        } else {
            var7 = (this.field712[var3] >> var4 - arg0 & field716[arg0]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "(I)V")
    public void method250(int arg0) {
        if (arg0 != 37124) {
            this.field709 = !this.field709;
        }
        this.field713 = (this.field714 + 7) / 8;
    }

    @OriginalMember(owner = "mb", name = "j", descriptor = "()I")
    public int method251() {
        int var1 = this.field712[this.field713] & 0xFF;
        return var1 < 128 ? this.method238() - 64 : this.method240() - 49152;
    }

    @OriginalMember(owner = "mb", name = "k", descriptor = "()I")
    public int method252() {
        int var1 = this.field712[this.field713] & 0xFF;
        return var1 < 128 ? this.method238() : this.method240() - 32768;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method253(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field713;
        this.field713 = 0;
        byte[] var5 = new byte[var4];
        this.method247(var4, 768, var5, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field713 = 0;
        this.method228(var8.length);
        this.method236(var8, -37074, var8.length, 0);
        if (arg2 != 4) {
            for (int var9 = 1; var9 > 0; var9++) {
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
            field715[var0] = var1;
        }
        field716 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field721 = new LinkList(false);
        field722 = new LinkList(false);
        field723 = new LinkList(false);
    }
}
