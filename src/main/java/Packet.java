import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "kb", name = "i", descriptor = "B")
    private byte field613 = -34;

    @OriginalMember(owner = "kb", name = "j", descriptor = "B")
    private byte field614 = -106;

    @OriginalMember(owner = "kb", name = "k", descriptor = "I")
    private int field615 = 3;

    @OriginalMember(owner = "kb", name = "l", descriptor = "I")
    private int field616 = -506;

    @OriginalMember(owner = "kb", name = "m", descriptor = "Z")
    private boolean field617 = true;

    @OriginalMember(owner = "kb", name = "n", descriptor = "I")
    private int field618 = 4277;

    @OriginalMember(owner = "kb", name = "p", descriptor = "I")
    private int field620 = -178;

    @OriginalMember(owner = "kb", name = "q", descriptor = "[B")
    public byte[] field621;

    @OriginalMember(owner = "kb", name = "r", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "kb", name = "h", descriptor = "I")
    private static int field612 = 40946;

    @OriginalMember(owner = "kb", name = "o", descriptor = "Z")
    private static boolean field619 = true;

    @OriginalMember(owner = "kb", name = "t", descriptor = "[I")
    private static int[] field624 = new int[256];

    @OriginalMember(owner = "kb", name = "u", descriptor = "[I")
    private static final int[] field625;

    @OriginalMember(owner = "kb", name = "z", descriptor = "Lob;")
    private static LinkList field630;

    @OriginalMember(owner = "kb", name = "A", descriptor = "Lob;")
    private static LinkList field631;

    @OriginalMember(owner = "kb", name = "B", descriptor = "Lob;")
    private static LinkList field632;

    @OriginalMember(owner = "kb", name = "s", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "kb", name = "w", descriptor = "I")
    private static int field627;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private static int field628;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private static int field629;

    @OriginalMember(owner = "kb", name = "v", descriptor = "Ltb;")
    public Isaac field626;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Z")
    public static boolean field633;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II)Lkb;")
    public static Packet method203(int arg0, int arg1) {
        LinkList var2 = field631;
        synchronized (field631) {
            Packet var3 = null;
            if (arg0 == 0 && field627 > 0) {
                field627--;
                var3 = (Packet) field630.method234();
            } else if (arg0 == 1 && field628 > 0) {
                field628--;
                var3 = (Packet) field631.method234();
            } else if (arg0 == 2 && field629 > 0) {
                field629--;
                var3 = (Packet) field632.method234();
            }
            if (var3 != null) {
                var3.field622 = 0;
                return var3;
            }
        }
        if (arg1 >= 0) {
            field619 = !field619;
        }
        Packet var5 = new Packet(field612);
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

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method204(byte arg0) {
        LinkList var2 = field631;
        synchronized (field631) {
            this.field622 = 0;
            if (this.field621.length == 100 && field627 < 1000) {
                field630.method232(this);
                field627++;
                return;
            }
            if (this.field621.length == 5000 && field628 < 250) {
                field631.method232(this);
                field628++;
                return;
            }
            if (this.field621.length == 30000 && field629 < 50) {
                field632.method232(this);
                field629++;
                return;
            }
        }
        if (arg0 != 8) {
            field612 = -173;
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 != 40946) {
            field619 = !field619;
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        this.field621 = arg1;
        this.field622 = 0;
        int var3 = 15 / arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BI)V")
    public void method205(byte arg0, int arg1) {
        this.field621[this.field622++] = (byte) (arg1 + this.field626.nextInt());
        if (this.field613 != arg0) {
            field619 = !field619;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method206(int arg0) {
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method207(int arg0) {
        this.field621[this.field622++] = (byte) (arg0 >> 8);
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZI)V")
    public void method208(boolean arg0, int arg1) {
        if (!arg0) {
            field619 = !field619;
        }
        this.field621[this.field622++] = (byte) arg1;
        this.field621[this.field622++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method209(int arg0) {
        this.field621[this.field622++] = (byte) (arg0 >> 16);
        this.field621[this.field622++] = (byte) (arg0 >> 8);
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method210(int arg0) {
        this.field621[this.field622++] = (byte) (arg0 >> 24);
        this.field621[this.field622++] = (byte) (arg0 >> 16);
        this.field621[this.field622++] = (byte) (arg0 >> 8);
        this.field621[this.field622++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(ZI)V")
    public void method211(boolean arg0, int arg1) {
        this.field621[this.field622++] = (byte) arg1;
        this.field621[this.field622++] = (byte) (arg1 >> 8);
        this.field621[this.field622++] = (byte) (arg1 >> 16);
        if (!arg0) {
            this.field621[this.field622++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZJ)V")
    public void method212(boolean arg0, long arg1) {
        this.field621[this.field622++] = (byte) (arg1 >> 56);
        this.field621[this.field622++] = (byte) (arg1 >> 48);
        this.field621[this.field622++] = (byte) (arg1 >> 40);
        this.field621[this.field622++] = (byte) (arg1 >> 32);
        this.field621[this.field622++] = (byte) (arg1 >> 24);
        this.field621[this.field622++] = (byte) (arg1 >> 16);
        this.field621[this.field622++] = (byte) (arg1 >> 8);
        if (arg0) {
            this.field621[this.field622++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method213(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field621, this.field622);
        this.field622 += arg0.length();
        this.field621[this.field622++] = 10;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIIB)V")
    public void method214(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (this.field614 != arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg1 + arg2; var6++) {
            this.field621[this.field622++] = arg0[var6];
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(II)V")
    public void method215(int arg0, int arg1) {
        if (arg0 != 0) {
            field619 = !field619;
        }
        this.field621[this.field622 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "()I")
    public int method216() {
        return this.field621[this.field622++] & 0xFF;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "()B")
    public byte method217() {
        return this.field621[this.field622++];
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "()I")
    public int method218() {
        this.field622 += 2;
        return ((this.field621[this.field622 - 2] & 0xFF) << 8) + (this.field621[this.field622 - 1] & 0xFF);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "()I")
    public int method219() {
        this.field622 += 2;
        int var1 = ((this.field621[this.field622 - 2] & 0xFF) << 8) + (this.field621[this.field622 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "()I")
    public int method220() {
        this.field622 += 3;
        return (this.field621[this.field622 - 1] & 0xFF) + ((this.field621[this.field622 - 3] & 0xFF) << 16) + ((this.field621[this.field622 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "()I")
    public int method221() {
        this.field622 += 4;
        return (this.field621[this.field622 - 1] & 0xFF) + ((this.field621[this.field622 - 2] & 0xFF) << 8) + ((this.field621[this.field622 - 4] & 0xFF) << 24) + ((this.field621[this.field622 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)J")
    public long method222(int arg0) {
        long var2 = (long) this.method221() & 0xFFFFFFFFL;
        int var4 = 87 / arg0;
        long var5 = (long) this.method221() & 0xFFFFFFFFL;
        return (var2 << 32) + var5;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method223() {
        int var1 = this.field622;
        while (this.field621[this.field622++] != 10) {
        }
        return new String(this.field621, var1, this.field622 - var1 - 1);
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(B)[B")
    public byte[] method224(byte arg0) {
        int var2 = this.field622;
        if (arg0 != 31) {
            throw new NullPointerException();
        }
        while (this.field621[this.field622++] != 10) {
        }
        byte[] var3 = new byte[this.field622 - var2 - 1];
        for (int var4 = var2; var4 < this.field622 - 1; var4++) {
            var3[var4 - var2] = this.field621[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III[B)V")
    public void method225(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 >= 0) {
            this.field616 = -432;
        }
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            arg3[var5] = this.field621[this.field622++];
        }
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "(I)V")
    public void method226(int arg0) {
        this.field623 = this.field622 * 8;
        if (arg0 <= 0) {
            this.field617 = !this.field617;
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(II)I")
    public int method227(int arg0, int arg1) {
        if (arg0 < 9 || arg0 > 9) {
            return this.field615;
        }
        int var3 = this.field623 >> 3;
        int var4 = 8 - (this.field623 & 0x7);
        int var5 = 0;
        this.field623 += arg1;
        while (arg1 > var4) {
            var5 += (this.field621[var3++] & field625[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field621[var3] & field625[var4]) + var5;
        } else {
            var6 = (this.field621[var3] >> var4 - arg1 & field625[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "(I)V")
    public void method228(int arg0) {
        if (this.field618 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field622 = (this.field623 + 7) / 8;
    }

    @OriginalMember(owner = "kb", name = "j", descriptor = "()I")
    public int method229() {
        int var1 = this.field621[this.field622] & 0xFF;
        return var1 < 128 ? this.method216() - 64 : this.method218() - 49152;
    }

    @OriginalMember(owner = "kb", name = "k", descriptor = "()I")
    public int method230() {
        int var1 = this.field621[this.field622] & 0xFF;
        return var1 < 128 ? this.method216() : this.method218() - 32768;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method231(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field622;
        this.field622 = 0;
        byte[] var5 = new byte[var4];
        this.method225(var4, -110, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field622 = 0;
        if (arg2 == 24676) {
            this.method206(var8.length);
            this.method214(var8, var8.length, 0, (byte) -106);
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
        field630 = new LinkList(0);
        field631 = new LinkList(0);
        field632 = new LinkList(0);
    }
}
