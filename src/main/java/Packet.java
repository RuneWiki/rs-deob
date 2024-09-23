import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "kb", name = "k", descriptor = "I")
    private int field614 = -626;

    @OriginalMember(owner = "kb", name = "l", descriptor = "Z")
    private boolean field615 = true;

    @OriginalMember(owner = "kb", name = "m", descriptor = "B")
    private byte field616 = 6;

    @OriginalMember(owner = "kb", name = "n", descriptor = "I")
    private int field617 = 5;

    @OriginalMember(owner = "kb", name = "o", descriptor = "B")
    private byte field618 = -51;

    @OriginalMember(owner = "kb", name = "p", descriptor = "Z")
    private boolean field619 = false;

    @OriginalMember(owner = "kb", name = "q", descriptor = "Z")
    private boolean field620 = true;

    @OriginalMember(owner = "kb", name = "r", descriptor = "[B")
    public byte[] field621;

    @OriginalMember(owner = "kb", name = "s", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "kb", name = "j", descriptor = "I")
    private static int field613 = -626;

    @OriginalMember(owner = "kb", name = "u", descriptor = "[I")
    private static int[] field624 = new int[256];

    @OriginalMember(owner = "kb", name = "v", descriptor = "[I")
    private static final int[] field625;

    @OriginalMember(owner = "kb", name = "A", descriptor = "Lob;")
    private static LinkList field630;

    @OriginalMember(owner = "kb", name = "B", descriptor = "Lob;")
    private static LinkList field631;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Lob;")
    private static LinkList field632;

    @OriginalMember(owner = "kb", name = "i", descriptor = "I")
    private static int field612;

    @OriginalMember(owner = "kb", name = "t", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private static int field627;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private static int field628;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private static int field629;

    @OriginalMember(owner = "kb", name = "w", descriptor = "Ltb;")
    public Isaac field626;

    @OriginalMember(owner = "kb", name = "D", descriptor = "Z")
    public static boolean field633;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II)Lkb;")
    public static Packet method195(int arg0, int arg1) {
        if (arg1 != 0) {
            field612 = -156;
        }
        LinkList var2 = field631;
        synchronized (field631) {
            Packet var3 = null;
            if (arg0 == 0 && field627 > 0) {
                field627--;
                var3 = (Packet) field630.method226();
            } else if (arg0 == 1 && field628 > 0) {
                field628--;
                var3 = (Packet) field631.method226();
            } else if (arg0 == 2 && field629 > 0) {
                field629--;
                var3 = (Packet) field632.method226();
            }
            if (var3 != null) {
                var3.field622 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(field613);
        var5.field622 = 0;
        if (arg0 == 0) {
            var5.field621 = new byte[100];
        } else if (arg0 == 1) {
            var5.field621 = new byte[5000];
        } else {
            var5.field621 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method196(int arg0) {
        LinkList var2 = field631;
        synchronized (field631) {
            this.field622 = 0;
            if (this.field621.length == 100 && field627 < 1000) {
                field630.method224(this);
                field627++;
                return;
            }
            if (this.field621.length == 5000 && field628 < 250) {
                field631.method224(this);
                field628++;
                return;
            }
            if (this.field621.length == 30000 && field629 < 50) {
                field632.method224(this);
                field629++;
                return;
            }
        }
        int var3 = 66 / arg0;
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "([BZ)V")
    public Packet(byte[] arg0, boolean arg1) {
        this.field621 = arg0;
        this.field622 = 0;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(II)V")
    public void method197(int arg0, int arg1) {
        this.field621[this.field622++] = (byte) (arg1 + this.field626.method245());
        if (arg0 < 4 || arg0 > 4) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method198(int arg0) {
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method199(int arg0) {
        this.field621[this.field622++] = (byte) (arg0 >> 8);
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(II)V")
    public void method200(int arg0, int arg1) {
        this.field621[this.field622++] = (byte) arg1;
        this.field621[this.field622++] = (byte) (arg1 >> 8);
        if (arg0 <= 0) {
            this.field619 = !this.field619;
        }
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method201(int arg0) {
        this.field621[this.field622++] = (byte) (arg0 >> 16);
        this.field621[this.field622++] = (byte) (arg0 >> 8);
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)V")
    public void method202(int arg0) {
        this.field621[this.field622++] = (byte) (arg0 >> 24);
        this.field621[this.field622++] = (byte) (arg0 >> 16);
        this.field621[this.field622++] = (byte) (arg0 >> 8);
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(II)V")
    public void method203(int arg0, int arg1) {
        this.field621[this.field622++] = (byte) arg0;
        this.field621[this.field622++] = (byte) (arg0 >> 8);
        this.field621[this.field622++] = (byte) (arg0 >> 16);
        this.field621[this.field622++] = (byte) (arg0 >> 24);
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IJ)V")
    public void method204(int arg0, long arg1) {
        this.field621[this.field622++] = (byte) (arg1 >> 56);
        this.field621[this.field622++] = (byte) (arg1 >> 48);
        if (arg0 < 8 || arg0 > 8) {
            return;
        }
        this.field621[this.field622++] = (byte) (arg1 >> 40);
        this.field621[this.field622++] = (byte) (arg1 >> 32);
        this.field621[this.field622++] = (byte) (arg1 >> 24);
        this.field621[this.field622++] = (byte) (arg1 >> 16);
        this.field621[this.field622++] = (byte) (arg1 >> 8);
        this.field621[this.field622++] = (byte) arg1;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method205(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field621, this.field622);
        this.field622 += arg0.length();
        this.field621[this.field622++] = 10;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BI[BI)V")
    public void method206(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == 4) {
            boolean var5 = false;
            for (int var6 = arg3; var6 < arg1 + arg3; var6++) {
                this.field621[this.field622++] = arg2[var6];
            }
        }
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(II)V")
    public void method207(int arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field621[this.field622 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "()I")
    public int method208() {
        return this.field621[this.field622++] & 0xFF;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "()B")
    public byte method209() {
        return this.field621[this.field622++];
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "()I")
    public int method210() {
        this.field622 += 2;
        return ((this.field621[this.field622 - 2] & 0xFF) << 8) + (this.field621[this.field622 - 1] & 0xFF);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "()I")
    public int method211() {
        this.field622 += 2;
        int var1 = ((this.field621[this.field622 - 2] & 0xFF) << 8) + (this.field621[this.field622 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "()I")
    public int method212() {
        this.field622 += 3;
        return (this.field621[this.field622 - 1] & 0xFF) + ((this.field621[this.field622 - 3] & 0xFF) << 16) + ((this.field621[this.field622 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "()I")
    public int method213() {
        this.field622 += 4;
        return (this.field621[this.field622 - 1] & 0xFF) + ((this.field621[this.field622 - 2] & 0xFF) << 8) + ((this.field621[this.field622 - 4] & 0xFF) << 24) + ((this.field621[this.field622 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "(I)J")
    public long method214(int arg0) {
        long var2 = (long) this.method213() & 0xFFFFFFFFL;
        long var4 = (long) this.method213() & 0xFFFFFFFFL;
        if (arg0 != -29068) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method215() {
        int var1 = this.field622;
        while (this.field621[this.field622++] != 10) {
        }
        return new String(this.field621, var1, this.field622 - var1 - 1);
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "(I)[B")
    public byte[] method216(int arg0) {
        int var2 = this.field622;
        int var3 = 84 / arg0;
        while (this.field621[this.field622++] != 10) {
        }
        byte[] var4 = new byte[this.field622 - var2 - 1];
        for (int var5 = var2; var5 < this.field622 - 1; var5++) {
            var4[var5 - var2] = this.field621[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIII)V")
    public void method217(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field619 = !this.field619;
        }
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            arg0[var5] = this.field621[this.field622++];
        }
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "(I)V")
    public void method218(int arg0) {
        this.field623 = this.field622 * 8;
        int var2 = 67 / arg0;
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "(II)I")
    public int method219(int arg0, int arg1) {
        int var3 = this.field623 >> 3;
        int var4 = 8 - (this.field623 & 0x7);
        int var5 = 0;
        if (arg0 != 7) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field623 += arg1;
        while (arg1 > var4) {
            var5 += (this.field621[var3++] & field625[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field621[var3] & field625[var4]) + var5;
        } else {
            var7 = (this.field621[var3] >> var4 - arg1 & field625[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field622 = (this.field623 + 7) / 8;
        if (arg0 >= 0) {
            field612 = -70;
        }
    }

    @OriginalMember(owner = "kb", name = "j", descriptor = "()I")
    public int method221() {
        int var1 = this.field621[this.field622] & 0xFF;
        return var1 < 128 ? this.method208() - 64 : this.method210() - 49152;
    }

    @OriginalMember(owner = "kb", name = "k", descriptor = "()I")
    public int method222() {
        int var1 = this.field621[this.field622] & 0xFF;
        return var1 < 128 ? this.method208() : this.method210() - 32768;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method223(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field622;
        this.field622 = 0;
        byte[] var5 = new byte[var4];
        this.method217(var5, var4, 0, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field622 = 0;
        this.method198(var8.length);
        if (arg1 >= this.field617 && arg1 <= this.field617) {
            this.method206((byte) 4, var8.length, var8, 0);
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
            field624[var0] = var1;
        }
        field625 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field630 = new LinkList((byte) 3);
        field631 = new LinkList((byte) 3);
        field632 = new LinkList((byte) 3);
    }
}
