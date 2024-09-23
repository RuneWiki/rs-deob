import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "kb", name = "h", descriptor = "Z")
    private boolean field617 = true;

    @OriginalMember(owner = "kb", name = "i", descriptor = "I")
    private int field618 = 10434;

    @OriginalMember(owner = "kb", name = "j", descriptor = "B")
    private byte field619 = 2;

    @OriginalMember(owner = "kb", name = "k", descriptor = "I")
    private int field620 = -934;

    @OriginalMember(owner = "kb", name = "l", descriptor = "Z")
    private boolean field621 = true;

    @OriginalMember(owner = "kb", name = "m", descriptor = "I")
    private int field622 = 24924;

    @OriginalMember(owner = "kb", name = "n", descriptor = "[B")
    public byte[] field623;

    @OriginalMember(owner = "kb", name = "o", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "kb", name = "q", descriptor = "[I")
    private static int[] field626 = new int[256];

    @OriginalMember(owner = "kb", name = "r", descriptor = "[I")
    private static final int[] field627;

    @OriginalMember(owner = "kb", name = "w", descriptor = "Lob;")
    private static LinkList field632;

    @OriginalMember(owner = "kb", name = "x", descriptor = "Lob;")
    private static LinkList field633;

    @OriginalMember(owner = "kb", name = "y", descriptor = "Lob;")
    private static LinkList field634;

    @OriginalMember(owner = "kb", name = "p", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "kb", name = "t", descriptor = "I")
    private static int field629;

    @OriginalMember(owner = "kb", name = "u", descriptor = "I")
    private static int field630;

    @OriginalMember(owner = "kb", name = "v", descriptor = "I")
    private static int field631;

    @OriginalMember(owner = "kb", name = "s", descriptor = "Ltb;")
    public Isaac field628;

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    public static boolean field635;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II)Lkb;")
    public static Packet method203(int arg0, int arg1) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        LinkList var3 = field633;
        synchronized (field633) {
            Packet var4 = null;
            if (arg1 == 0 && field629 > 0) {
                field629--;
                var4 = (Packet) field632.method234();
            } else if (arg1 == 1 && field630 > 0) {
                field630--;
                var4 = (Packet) field633.method234();
            } else if (arg1 == 2 && field631 > 0) {
                field631--;
                var4 = (Packet) field634.method234();
            }
            if (var4 != null) {
                var4.field624 = 0;
                return var4;
            }
        }
        Packet var6 = new Packet(-301);
        var6.field624 = 0;
        if (arg1 == 0) {
            var6.field623 = new byte[100];
        } else if (arg1 == 1) {
            var6.field623 = new byte[5000];
        } else {
            var6.field623 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Z)V")
    public void method204(boolean arg0) {
        LinkList var2 = field633;
        synchronized (field633) {
            this.field624 = 0;
            if (this.field623.length == 100 && field629 < 1000) {
                field632.method232(this);
                field629++;
                return;
            }
            if (this.field623.length == 5000 && field630 < 250) {
                field633.method232(this);
                field630++;
                return;
            }
            if (this.field623.length == 30000 && field631 < 50) {
                field634.method232(this);
                field631++;
                return;
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(B[B)V")
    public Packet(byte arg0, byte[] arg1) {
        this.field623 = arg1;
        this.field624 = 0;
        if (arg0 != 64) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZI)V")
    public void method205(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field623[this.field624++] = (byte) (arg1 + this.field628.method253());
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method206(int arg0) {
        this.field623[this.field624++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method207(int arg0) {
        this.field623[this.field624++] = (byte) (arg0 >> 8);
        this.field623[this.field624++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(ZI)V")
    public void method208(boolean arg0, int arg1) {
        this.field623[this.field624++] = (byte) arg1;
        if (!arg0) {
            this.field620 = -196;
        }
        this.field623[this.field624++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method209(int arg0) {
        this.field623[this.field624++] = (byte) (arg0 >> 16);
        this.field623[this.field624++] = (byte) (arg0 >> 8);
        this.field623[this.field624++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method210(int arg0) {
        this.field623[this.field624++] = (byte) (arg0 >> 24);
        this.field623[this.field624++] = (byte) (arg0 >> 16);
        this.field623[this.field624++] = (byte) (arg0 >> 8);
        this.field623[this.field624++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BI)V")
    public void method211(byte arg0, int arg1) {
        this.field623[this.field624++] = (byte) arg1;
        this.field623[this.field624++] = (byte) (arg1 >> 8);
        this.field623[this.field624++] = (byte) (arg1 >> 16);
        if (arg0 == 86) {
            this.field623[this.field624++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IJ)V")
    public void method212(int arg0, long arg1) {
        this.field623[this.field624++] = (byte) (arg1 >> 56);
        if (arg0 != 0) {
            return;
        }
        this.field623[this.field624++] = (byte) (arg1 >> 48);
        this.field623[this.field624++] = (byte) (arg1 >> 40);
        this.field623[this.field624++] = (byte) (arg1 >> 32);
        this.field623[this.field624++] = (byte) (arg1 >> 24);
        this.field623[this.field624++] = (byte) (arg1 >> 16);
        this.field623[this.field624++] = (byte) (arg1 >> 8);
        this.field623[this.field624++] = (byte) arg1;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method213(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field623, this.field624);
        this.field624 += arg0.length();
        this.field623[this.field624++] = 10;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B[BII)V")
    public void method214(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != -41) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg3; var6 < arg2 + arg3; var6++) {
            this.field623[this.field624++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IB)V")
    public void method215(int arg0, byte arg1) {
        this.field623[this.field624 - arg0 - 1] = (byte) arg0;
        if (arg1 != 3) {
            this.field621 = !this.field621;
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "()I")
    public int method216() {
        return this.field623[this.field624++] & 0xFF;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "()B")
    public byte method217() {
        return this.field623[this.field624++];
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "()I")
    public int method218() {
        this.field624 += 2;
        return ((this.field623[this.field624 - 2] & 0xFF) << 8) + (this.field623[this.field624 - 1] & 0xFF);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "()I")
    public int method219() {
        this.field624 += 2;
        int var1 = ((this.field623[this.field624 - 2] & 0xFF) << 8) + (this.field623[this.field624 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "()I")
    public int method220() {
        this.field624 += 3;
        return (this.field623[this.field624 - 1] & 0xFF) + ((this.field623[this.field624 - 3] & 0xFF) << 16) + ((this.field623[this.field624 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "()I")
    public int method221() {
        this.field624 += 4;
        return (this.field623[this.field624 - 1] & 0xFF) + ((this.field623[this.field624 - 2] & 0xFF) << 8) + ((this.field623[this.field624 - 4] & 0xFF) << 24) + ((this.field623[this.field624 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)J")
    public long method222(byte arg0) {
        long var2 = (long) this.method221() & 0xFFFFFFFFL;
        long var4 = (long) this.method221() & 0xFFFFFFFFL;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method223() {
        int var1 = this.field624;
        while (this.field623[this.field624++] != 10) {
        }
        return new String(this.field623, var1, this.field624 - var1 - 1);
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(B)[B")
    public byte[] method224(byte arg0) {
        if (arg0 != -66) {
            this.field620 = 443;
        }
        int var2 = this.field624;
        while (this.field623[this.field624++] != 10) {
        }
        byte[] var3 = new byte[this.field624 - var2 - 1];
        for (int var4 = var2; var4 < this.field624 - 1; var4++) {
            var3[var4 - var2] = this.field623[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II[BI)V")
    public void method225(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 < 5 || arg1 > 5) {
            this.field621 = !this.field621;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg2[var5] = this.field623[this.field624++];
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(B)V")
    public void method226(byte arg0) {
        if (arg0 != -43) {
            this.field621 = !this.field621;
        }
        this.field625 = this.field624 * 8;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(IB)I")
    public int method227(int arg0, byte arg1) {
        if (arg1 != 6) {
            this.field621 = !this.field621;
        }
        int var3 = this.field625 >> 3;
        int var4 = 8 - (this.field625 & 0x7);
        int var5 = 0;
        this.field625 += arg0;
        while (arg0 > var4) {
            var5 += (this.field623[var3++] & field627[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field623[var3] & field627[var4]) + var5;
        } else {
            var6 = (this.field623[var3] >> var4 - arg0 & field627[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)V")
    public void method228(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field624 = (this.field625 + 7) / 8;
    }

    @OriginalMember(owner = "kb", name = "j", descriptor = "()I")
    public int method229() {
        int var1 = this.field623[this.field624] & 0xFF;
        return var1 < 128 ? this.method216() - 64 : this.method218() - 49152;
    }

    @OriginalMember(owner = "kb", name = "k", descriptor = "()I")
    public int method230() {
        int var1 = this.field623[this.field624] & 0xFF;
        return var1 < 128 ? this.method216() : this.method218() - 32768;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method231(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field624;
        this.field624 = 0;
        byte[] var5 = new byte[var4];
        this.method225(var4, 5, var5, 0);
        BigInteger var6 = new BigInteger(var5);
        if (arg2 <= 0) {
            this.field620 = 436;
        }
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field624 = 0;
        this.method206(var8.length);
        this.method214((byte) -41, var8, var8.length, 0);
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
            field626[var0] = var1;
        }
        field627 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field632 = new LinkList((byte) 30);
        field633 = new LinkList((byte) 30);
        field634 = new LinkList((byte) 30);
    }
}
