import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "kb", name = "i", descriptor = "Z")
    private boolean field611 = false;

    @OriginalMember(owner = "kb", name = "j", descriptor = "I")
    private int field612 = 43539;

    @OriginalMember(owner = "kb", name = "k", descriptor = "Z")
    private boolean field613 = true;

    @OriginalMember(owner = "kb", name = "l", descriptor = "Z")
    private boolean field614 = false;

    @OriginalMember(owner = "kb", name = "m", descriptor = "I")
    private int field615 = -780;

    @OriginalMember(owner = "kb", name = "n", descriptor = "B")
    private byte field616 = 9;

    @OriginalMember(owner = "kb", name = "q", descriptor = "Z")
    private boolean field619 = false;

    @OriginalMember(owner = "kb", name = "r", descriptor = "I")
    private int field620 = 710;

    @OriginalMember(owner = "kb", name = "s", descriptor = "I")
    private int field621 = 3;

    @OriginalMember(owner = "kb", name = "t", descriptor = "[B")
    public byte[] field622;

    @OriginalMember(owner = "kb", name = "u", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "kb", name = "w", descriptor = "[I")
    private static int[] field625 = new int[256];

    @OriginalMember(owner = "kb", name = "x", descriptor = "[I")
    private static final int[] field626;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Lob;")
    private static LinkList field631;

    @OriginalMember(owner = "kb", name = "D", descriptor = "Lob;")
    private static LinkList field632;

    @OriginalMember(owner = "kb", name = "E", descriptor = "Lob;")
    private static LinkList field633;

    @OriginalMember(owner = "kb", name = "o", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "kb", name = "v", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private static int field628;

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private static int field629;

    @OriginalMember(owner = "kb", name = "B", descriptor = "I")
    private static int field630;

    @OriginalMember(owner = "kb", name = "y", descriptor = "Ltb;")
    public Isaac field627;

    @OriginalMember(owner = "kb", name = "p", descriptor = "Z")
    private static boolean field618;

    @OriginalMember(owner = "kb", name = "F", descriptor = "Z")
    public static boolean field634;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZI)Lkb;")
    public static Packet method196(boolean arg0, int arg1) {
        LinkList var2 = field632;
        synchronized (field632) {
            Packet var3 = null;
            if (arg1 == 0 && field628 > 0) {
                field628--;
                var3 = (Packet) field631.method227();
            } else if (arg1 == 1 && field629 > 0) {
                field629--;
                var3 = (Packet) field632.method227();
            } else if (arg1 == 2 && field630 > 0) {
                field630--;
                var3 = (Packet) field633.method227();
            }
            if (var3 != null) {
                var3.field623 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(0);
        if (arg0) {
            field618 = !field618;
        }
        var5.field623 = 0;
        if (arg1 == 0) {
            var5.field622 = new byte[100];
        } else if (arg1 == 1) {
            var5.field622 = new byte[5000];
        } else {
            var5.field622 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method197(int arg0) {
        LinkList var2 = field632;
        synchronized (field632) {
            this.field623 = 0;
            if (this.field622.length == 100 && field628 < 1000) {
                field631.method225(this);
                field628++;
                return;
            }
            if (this.field622.length == 5000 && field629 < 250) {
                field632.method225(this);
                field629++;
                return;
            }
            if (this.field622.length == 30000 && field630 < 50) {
                field633.method225(this);
                field630++;
                return;
            }
        }
        if (arg0 != -10196) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        this.field622 = arg0;
        this.field623 = 0;
        if (arg1 != 0) {
            this.field621 = -451;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II)V")
    public void method198(int arg0, int arg1) {
        if (arg0 < 9 || arg0 > 9) {
            this.field619 = !this.field619;
        }
        this.field622[this.field623++] = (byte) (arg1 + this.field627.method246());
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method199(int arg0) {
        this.field622[this.field623++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method200(int arg0) {
        this.field622[this.field623++] = (byte) (arg0 >> 8);
        this.field622[this.field623++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZ)V")
    public void method201(int arg0, boolean arg1) {
        this.field622[this.field623++] = (byte) arg0;
        this.field622[this.field623++] = (byte) (arg0 >> 8);
        if (arg1) {
            this.field611 = !this.field611;
        }
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method202(int arg0) {
        this.field622[this.field623++] = (byte) (arg0 >> 16);
        this.field622[this.field623++] = (byte) (arg0 >> 8);
        this.field622[this.field623++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)V")
    public void method203(int arg0) {
        this.field622[this.field623++] = (byte) (arg0 >> 24);
        this.field622[this.field623++] = (byte) (arg0 >> 16);
        this.field622[this.field623++] = (byte) (arg0 >> 8);
        this.field622[this.field623++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(II)V")
    public void method204(int arg0, int arg1) {
        this.field622[this.field623++] = (byte) arg1;
        if (arg0 == 0) {
            this.field622[this.field623++] = (byte) (arg1 >> 8);
            this.field622[this.field623++] = (byte) (arg1 >> 16);
            this.field622[this.field623++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(JZ)V")
    public void method205(long arg0, boolean arg1) {
        this.field622[this.field623++] = (byte) (arg0 >> 56);
        this.field622[this.field623++] = (byte) (arg0 >> 48);
        this.field622[this.field623++] = (byte) (arg0 >> 40);
        this.field622[this.field623++] = (byte) (arg0 >> 32);
        this.field622[this.field623++] = (byte) (arg0 >> 24);
        this.field622[this.field623++] = (byte) (arg0 >> 16);
        if (!arg1) {
            this.field620 = 310;
        }
        this.field622[this.field623++] = (byte) (arg0 >> 8);
        this.field622[this.field623++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method206(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field622, this.field623);
        this.field623 += arg0.length();
        this.field622[this.field623++] = 10;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIII)V")
    public void method207(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field612 == arg3) {
            for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
                this.field622[this.field623++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(II)V")
    public void method208(int arg0, int arg1) {
        if (arg1 != 9026) {
            this.field613 = !this.field613;
        }
        this.field622[this.field623 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "()I")
    public int method209() {
        return this.field622[this.field623++] & 0xFF;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "()B")
    public byte method210() {
        return this.field622[this.field623++];
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "()I")
    public int method211() {
        this.field623 += 2;
        return ((this.field622[this.field623 - 2] & 0xFF) << 8) + (this.field622[this.field623 - 1] & 0xFF);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "()I")
    public int method212() {
        this.field623 += 2;
        int var1 = ((this.field622[this.field623 - 2] & 0xFF) << 8) + (this.field622[this.field623 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "()I")
    public int method213() {
        this.field623 += 3;
        return (this.field622[this.field623 - 1] & 0xFF) + ((this.field622[this.field623 - 3] & 0xFF) << 16) + ((this.field622[this.field623 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "()I")
    public int method214() {
        this.field623 += 4;
        return (this.field622[this.field623 - 1] & 0xFF) + ((this.field622[this.field623 - 2] & 0xFF) << 8) + ((this.field622[this.field623 - 4] & 0xFF) << 24) + ((this.field622[this.field623 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)J")
    public long method215(byte arg0) {
        long var2 = (long) this.method214() & 0xFFFFFFFFL;
        long var4 = (long) this.method214() & 0xFFFFFFFFL;
        if (arg0 != 2) {
            this.field617 = -236;
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method216() {
        int var1 = this.field623;
        while (this.field622[this.field623++] != 10) {
        }
        return new String(this.field622, var1, this.field623 - var1 - 1);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "(I)[B")
    public byte[] method217(int arg0) {
        if (arg0 != 0) {
            field618 = !field618;
        }
        int var2 = this.field623;
        while (this.field622[this.field623++] != 10) {
        }
        byte[] var3 = new byte[this.field623 - var2 - 1];
        for (int var4 = var2; var4 < this.field623 - 1; var4++) {
            var3[var4 - var2] = this.field622[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II[BZ)V")
    public void method218(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (arg3) {
            this.field619 = !this.field619;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            arg2[var5] = this.field622[this.field623++];
        }
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "(I)V")
    public void method219(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field624 = this.field623 * 8;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IB)I")
    public int method220(int arg0, byte arg1) {
        int var3 = this.field624 >> 3;
        int var4 = 8 - (this.field624 & 0x7);
        int var5 = 0;
        if (arg1 != 27) {
            field618 = !field618;
        }
        this.field624 += arg0;
        while (arg0 > var4) {
            var5 += (this.field622[var3++] & field626[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field622[var3] & field626[var4]) + var5;
        } else {
            var6 = (this.field622[var3] >> var4 - arg0 & field626[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "(I)V")
    public void method221(int arg0) {
        this.field623 = (this.field624 + 7) / 8;
        if (arg0 != -37106) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "j", descriptor = "()I")
    public int method222() {
        int var1 = this.field622[this.field623] & 0xFF;
        return var1 < 128 ? this.method209() - 64 : this.method211() - 49152;
    }

    @OriginalMember(owner = "kb", name = "k", descriptor = "()I")
    public int method223() {
        int var1 = this.field622[this.field623] & 0xFF;
        return var1 < 128 ? this.method209() : this.method211() - 32768;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method224(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field623;
        this.field623 = 0;
        int var5 = 2 / arg2;
        byte[] var6 = new byte[var4];
        this.method218(0, var4, var6, this.field614);
        BigInteger var7 = new BigInteger(var6);
        BigInteger var8 = var7.modPow(arg0, arg1);
        byte[] var9 = var8.toByteArray();
        this.field623 = 0;
        this.method199(var9.length);
        this.method207(var9, var9.length, 0, 43539);
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
            field625[var0] = var1;
        }
        field626 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field631 = new LinkList((byte) -47);
        field632 = new LinkList((byte) -47);
        field633 = new LinkList((byte) -47);
    }
}
