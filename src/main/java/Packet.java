import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "kb", name = "h", descriptor = "Z")
    private boolean field610 = false;

    @OriginalMember(owner = "kb", name = "i", descriptor = "I")
    private int field611 = 958;

    @OriginalMember(owner = "kb", name = "j", descriptor = "I")
    private int field612 = 958;

    @OriginalMember(owner = "kb", name = "k", descriptor = "I")
    private int field613 = -278;

    @OriginalMember(owner = "kb", name = "m", descriptor = "I")
    private int field615 = 2;

    @OriginalMember(owner = "kb", name = "n", descriptor = "I")
    private int field616 = -17143;

    @OriginalMember(owner = "kb", name = "o", descriptor = "I")
    private int field617 = -17143;

    @OriginalMember(owner = "kb", name = "p", descriptor = "Z")
    private boolean field618 = false;

    @OriginalMember(owner = "kb", name = "q", descriptor = "I")
    private int field619 = 4;

    @OriginalMember(owner = "kb", name = "r", descriptor = "[B")
    public byte[] field620;

    @OriginalMember(owner = "kb", name = "s", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "kb", name = "u", descriptor = "[I")
    private static int[] field623 = new int[256];

    @OriginalMember(owner = "kb", name = "v", descriptor = "[I")
    private static final int[] field624;

    @OriginalMember(owner = "kb", name = "A", descriptor = "Lob;")
    private static LinkList field629;

    @OriginalMember(owner = "kb", name = "B", descriptor = "Lob;")
    private static LinkList field630;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Lob;")
    private static LinkList field631;

    @OriginalMember(owner = "kb", name = "t", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private static int field626;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private static int field627;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private static int field628;

    @OriginalMember(owner = "kb", name = "w", descriptor = "Ltb;")
    public Isaac field625;

    @OriginalMember(owner = "kb", name = "l", descriptor = "Z")
    private static boolean field614;

    @OriginalMember(owner = "kb", name = "D", descriptor = "Z")
    public static boolean field632;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BI)Lkb;")
    public static Packet method196(byte arg0, int arg1) {
        LinkList var2 = field630;
        synchronized (field630) {
            Packet var3 = null;
            if (arg1 == 0 && field626 > 0) {
                field626--;
                var3 = (Packet) field629.method227();
            } else if (arg1 == 1 && field627 > 0) {
                field627--;
                var3 = (Packet) field630.method227();
            } else if (arg1 == 2 && field628 > 0) {
                field628--;
                var3 = (Packet) field631.method227();
            }
            if (var3 != null) {
                var3.field621 = 0;
                return var3;
            }
        }
        if (arg0 == 2) {
            boolean var5 = false;
        } else {
            field614 = !field614;
        }
        Packet var6 = new Packet(-25549);
        var6.field621 = 0;
        if (arg1 == 0) {
            var6.field620 = new byte[100];
        } else if (arg1 == 1) {
            var6.field620 = new byte[5000];
        } else {
            var6.field620 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method197(int arg0) {
        LinkList var2 = field630;
        synchronized (field630) {
            this.field621 = 0;
            if (this.field620.length == 100 && field626 < 1000) {
                field629.method225(this);
                field626++;
                return;
            }
            if (this.field620.length == 5000 && field627 < 250) {
                field630.method225(this);
                field627++;
                return;
            }
            if (this.field620.length == 30000 && field628 < 50) {
                field631.method225(this);
                field628++;
                return;
            }
        }
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 != -25549) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        if (arg0 != 0) {
            field614 = !field614;
        }
        this.field620 = arg1;
        this.field621 = 0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II)V")
    public void method198(int arg0, int arg1) {
        if (arg0 == 0) {
            this.field620[this.field621++] = (byte) (arg1 + this.field625.method246());
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method199(int arg0) {
        this.field620[this.field621++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method200(int arg0) {
        this.field620[this.field621++] = (byte) (arg0 >> 8);
        this.field620[this.field621++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(BI)V")
    public void method201(byte arg0, int arg1) {
        this.field620[this.field621++] = (byte) arg1;
        this.field620[this.field621++] = (byte) (arg1 >> 8);
        if (arg0 != 29) {
            this.field619 = 185;
        }
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method202(int arg0) {
        this.field620[this.field621++] = (byte) (arg0 >> 16);
        this.field620[this.field621++] = (byte) (arg0 >> 8);
        this.field620[this.field621++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)V")
    public void method203(int arg0) {
        this.field620[this.field621++] = (byte) (arg0 >> 24);
        this.field620[this.field621++] = (byte) (arg0 >> 16);
        this.field620[this.field621++] = (byte) (arg0 >> 8);
        this.field620[this.field621++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(BI)V")
    public void method204(byte arg0, int arg1) {
        this.field620[this.field621++] = (byte) arg1;
        this.field620[this.field621++] = (byte) (arg1 >> 8);
        this.field620[this.field621++] = (byte) (arg1 >> 16);
        if (arg0 != 114) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field620[this.field621++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IJ)V")
    public void method205(int arg0, long arg1) {
        if (arg0 != 6) {
            return;
        }
        this.field620[this.field621++] = (byte) (arg1 >> 56);
        this.field620[this.field621++] = (byte) (arg1 >> 48);
        this.field620[this.field621++] = (byte) (arg1 >> 40);
        this.field620[this.field621++] = (byte) (arg1 >> 32);
        this.field620[this.field621++] = (byte) (arg1 >> 24);
        this.field620[this.field621++] = (byte) (arg1 >> 16);
        this.field620[this.field621++] = (byte) (arg1 >> 8);
        this.field620[this.field621++] = (byte) arg1;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method206(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field620, this.field621);
        this.field621 += arg0.length();
        this.field620[this.field621++] = 10;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BII)V")
    public void method207(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 3 / arg2;
        for (int var6 = arg3; var6 < arg0 + arg3; var6++) {
            this.field620[this.field621++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZ)V")
    public void method208(int arg0, boolean arg1) {
        if (!arg1) {
            this.field620[this.field621 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "()I")
    public int method209() {
        return this.field620[this.field621++] & 0xFF;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "()B")
    public byte method210() {
        return this.field620[this.field621++];
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "()I")
    public int method211() {
        this.field621 += 2;
        return ((this.field620[this.field621 - 2] & 0xFF) << 8) + (this.field620[this.field621 - 1] & 0xFF);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "()I")
    public int method212() {
        this.field621 += 2;
        int var1 = ((this.field620[this.field621 - 2] & 0xFF) << 8) + (this.field620[this.field621 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "()I")
    public int method213() {
        this.field621 += 3;
        return (this.field620[this.field621 - 1] & 0xFF) + ((this.field620[this.field621 - 3] & 0xFF) << 16) + ((this.field620[this.field621 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "()I")
    public int method214() {
        this.field621 += 4;
        return (this.field620[this.field621 - 1] & 0xFF) + ((this.field620[this.field621 - 2] & 0xFF) << 8) + ((this.field620[this.field621 - 4] & 0xFF) << 24) + ((this.field620[this.field621 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)J")
    public long method215(byte arg0) {
        long var2 = (long) this.method214() & 0xFFFFFFFFL;
        if (arg0 != -79) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        long var5 = (long) this.method214() & 0xFFFFFFFFL;
        return (var2 << 32) + var5;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method216() {
        int var1 = this.field621;
        while (this.field620[this.field621++] != 10) {
        }
        return new String(this.field620, var1, this.field621 - var1 - 1);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "(I)[B")
    public byte[] method217(int arg0) {
        int var2 = this.field621;
        while (this.field620[this.field621++] != 10) {
        }
        byte[] var3 = new byte[this.field621 - var2 - 1];
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = var2; var5 < this.field621 - 1; var5++) {
            var3[var5 - var2] = this.field620[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BIZ)V")
    public void method218(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field612 = 480;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg1[var5] = this.field620[this.field621++];
        }
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "(I)V")
    public void method219(int arg0) {
        if (arg0 < this.field615 || arg0 > this.field615) {
            this.field615 = 123;
        }
        this.field622 = this.field621 * 8;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(II)I")
    public int method220(int arg0, int arg1) {
        int var3 = this.field622 >> 3;
        int var4 = 8 - (this.field622 & 0x7);
        int var5 = 0;
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field622 += arg0;
        while (arg0 > var4) {
            var5 += (this.field620[var3++] & field624[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg0 == var4) {
            var7 = (this.field620[var3] & field624[var4]) + var5;
        } else {
            var7 = (this.field620[var3] >> var4 - arg0 & field624[arg0]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "(I)V")
    public void method221(int arg0) {
        if (arg0 < 0) {
            this.field621 = (this.field622 + 7) / 8;
        }
    }

    @OriginalMember(owner = "kb", name = "j", descriptor = "()I")
    public int method222() {
        int var1 = this.field620[this.field621] & 0xFF;
        return var1 < 128 ? this.method209() - 64 : this.method211() - 49152;
    }

    @OriginalMember(owner = "kb", name = "k", descriptor = "()I")
    public int method223() {
        int var1 = this.field620[this.field621] & 0xFF;
        return var1 < 128 ? this.method209() : this.method211() - 32768;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method224(byte arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field621;
        this.field621 = 0;
        byte[] var5 = new byte[var4];
        this.method218(0, var5, var4, false);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field621 = 0;
        this.method199(var8.length);
        this.method207(var8.length, var8, this.field611, 0);
        if (arg0 == -56) {
            ;
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
            field623[var0] = var1;
        }
        field624 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field629 = new LinkList(2);
        field630 = new LinkList(2);
        field631 = new LinkList(2);
    }
}
