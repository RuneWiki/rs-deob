import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "kb", name = "i", descriptor = "I")
    private int field602 = 575;

    @OriginalMember(owner = "kb", name = "j", descriptor = "Z")
    private boolean field603 = false;

    @OriginalMember(owner = "kb", name = "k", descriptor = "I")
    private int field604 = 1;

    @OriginalMember(owner = "kb", name = "l", descriptor = "I")
    private int field605 = 33724;

    @OriginalMember(owner = "kb", name = "m", descriptor = "I")
    private int field606 = -104;

    @OriginalMember(owner = "kb", name = "n", descriptor = "B")
    private byte field607 = 105;

    @OriginalMember(owner = "kb", name = "q", descriptor = "I")
    private int field610 = 42815;

    @OriginalMember(owner = "kb", name = "r", descriptor = "[B")
    public byte[] field611;

    @OriginalMember(owner = "kb", name = "s", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "kb", name = "o", descriptor = "Z")
    private static boolean field608 = true;

    @OriginalMember(owner = "kb", name = "u", descriptor = "[I")
    private static int[] field614 = new int[256];

    @OriginalMember(owner = "kb", name = "v", descriptor = "[I")
    private static final int[] field615;

    @OriginalMember(owner = "kb", name = "A", descriptor = "Lob;")
    private static LinkList field620;

    @OriginalMember(owner = "kb", name = "B", descriptor = "Lob;")
    private static LinkList field621;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Lob;")
    private static LinkList field622;

    @OriginalMember(owner = "kb", name = "p", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "kb", name = "t", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private static int field617;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private static int field618;

    @OriginalMember(owner = "kb", name = "z", descriptor = "I")
    private static int field619;

    @OriginalMember(owner = "kb", name = "w", descriptor = "Ltb;")
    public Isaac field616;

    @OriginalMember(owner = "kb", name = "D", descriptor = "Z")
    public static boolean field623;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IZ)Lkb;")
    public static Packet method196(int arg0, boolean arg1) {
        LinkList var2 = field621;
        synchronized (field621) {
            Packet var3 = null;
            if (arg0 == 0 && field617 > 0) {
                field617--;
                var3 = (Packet) field620.method227();
            } else if (arg0 == 1 && field618 > 0) {
                field618--;
                var3 = (Packet) field621.method227();
            } else if (arg0 == 2 && field619 > 0) {
                field619--;
                var3 = (Packet) field622.method227();
            }
            if (var3 != null) {
                var3.field612 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(false);
        var5.field612 = 0;
        if (!arg1) {
            field608 = !field608;
        }
        if (arg0 == 0) {
            var5.field611 = new byte[100];
        } else if (arg0 == 1) {
            var5.field611 = new byte[5000];
        } else {
            var5.field611 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Z)V")
    public void method197(boolean arg0) {
        if (arg0) {
            this.field610 = -91;
        }
        LinkList var2 = field621;
        synchronized (field621) {
            this.field612 = 0;
            if (this.field611.length == 100 && field617 < 1000) {
                field620.method225(this);
                field617++;
            } else if (this.field611.length == 5000 && field618 < 250) {
                field621.method225(this);
                field618++;
            } else if (this.field611.length == 30000 && field619 < 50) {
                field622.method225(this);
                field619++;
            }
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Z)V")
    private Packet(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        this.field611 = arg1;
        this.field612 = 0;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ZI)V")
    public void method198(boolean arg0, int arg1) {
        this.field611[this.field612++] = (byte) (arg1 + this.field616.method246());
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method199(int arg0) {
        this.field611[this.field612++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method200(int arg0) {
        this.field611[this.field612++] = (byte) (arg0 >> 8);
        this.field611[this.field612++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II)V")
    public void method201(int arg0, int arg1) {
        this.field611[this.field612++] = (byte) arg0;
        if (arg1 > 0) {
            this.field611[this.field612++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method202(int arg0) {
        this.field611[this.field612++] = (byte) (arg0 >> 16);
        this.field611[this.field612++] = (byte) (arg0 >> 8);
        this.field611[this.field612++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method203(int arg0) {
        this.field611[this.field612++] = (byte) (arg0 >> 24);
        this.field611[this.field612++] = (byte) (arg0 >> 16);
        this.field611[this.field612++] = (byte) (arg0 >> 8);
        this.field611[this.field612++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(ZI)V")
    public void method204(boolean arg0, int arg1) {
        this.field611[this.field612++] = (byte) arg1;
        if (arg0) {
            this.field609 = -18;
        }
        this.field611[this.field612++] = (byte) (arg1 >> 8);
        this.field611[this.field612++] = (byte) (arg1 >> 16);
        this.field611[this.field612++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(JI)V")
    public void method205(long arg0, int arg1) {
        this.field611[this.field612++] = (byte) (arg0 >> 56);
        this.field611[this.field612++] = (byte) (arg0 >> 48);
        this.field611[this.field612++] = (byte) (arg0 >> 40);
        this.field611[this.field612++] = (byte) (arg0 >> 32);
        this.field611[this.field612++] = (byte) (arg0 >> 24);
        if (arg1 == 0) {
            this.field611[this.field612++] = (byte) (arg0 >> 16);
            this.field611[this.field612++] = (byte) (arg0 >> 8);
            this.field611[this.field612++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method206(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field611, this.field612);
        this.field612 += arg0.length();
        this.field611[this.field612++] = 10;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BII)V")
    public void method207(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 25772) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg3; var6 < arg0 + arg3; var6++) {
            this.field611[this.field612++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(II)V")
    public void method208(int arg0, int arg1) {
        if (this.field604 != arg1) {
            this.field603 = !this.field603;
        }
        this.field611[this.field612 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "()I")
    public int method209() {
        return this.field611[this.field612++] & 0xFF;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "()B")
    public byte method210() {
        return this.field611[this.field612++];
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "()I")
    public int method211() {
        this.field612 += 2;
        return ((this.field611[this.field612 - 2] & 0xFF) << 8) + (this.field611[this.field612 - 1] & 0xFF);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "()I")
    public int method212() {
        this.field612 += 2;
        int var1 = ((this.field611[this.field612 - 2] & 0xFF) << 8) + (this.field611[this.field612 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "()I")
    public int method213() {
        this.field612 += 3;
        return (this.field611[this.field612 - 1] & 0xFF) + ((this.field611[this.field612 - 3] & 0xFF) << 16) + ((this.field611[this.field612 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "()I")
    public int method214() {
        this.field612 += 4;
        return (this.field611[this.field612 - 1] & 0xFF) + ((this.field611[this.field612 - 2] & 0xFF) << 8) + ((this.field611[this.field612 - 4] & 0xFF) << 24) + ((this.field611[this.field612 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)J")
    public long method215(int arg0) {
        long var2 = (long) this.method214() & 0xFFFFFFFFL;
        long var4 = (long) this.method214() & 0xFFFFFFFFL;
        if (arg0 != 6) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method216() {
        int var1 = this.field612;
        while (this.field611[this.field612++] != 10) {
        }
        return new String(this.field611, var1, this.field612 - var1 - 1);
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(Z)[B")
    public byte[] method217(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = this.field612;
        while (this.field611[this.field612++] != 10) {
        }
        byte[] var4 = new byte[this.field612 - var3 - 1];
        for (int var5 = var3; var5 < this.field612 - 1; var5++) {
            var4[var5 - var3] = this.field611[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BI[BI)V")
    public void method218(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == 6) {
            boolean var5 = false;
            for (int var6 = arg3; var6 < arg1 + arg3; var6++) {
                arg2[var6] = this.field611[this.field612++];
            }
        }
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field613 = this.field612 * 8;
        if (this.field605 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(ZI)I")
    public int method220(boolean arg0, int arg1) {
        int var3 = this.field613 >> 3;
        int var4 = 8 - (this.field613 & 0x7);
        int var5 = 0;
        this.field613 += arg1;
        if (arg0) {
            return 1;
        }
        while (arg1 > var4) {
            var5 += (this.field611[var3++] & field615[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field611[var3] & field615[var4]) + var5;
        } else {
            var6 = (this.field611[var3] >> var4 - arg1 & field615[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method221(byte arg0) {
        this.field612 = (this.field613 + 7) / 8;
        if (arg0 != 53) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "j", descriptor = "()I")
    public int method222() {
        int var1 = this.field611[this.field612] & 0xFF;
        return var1 < 128 ? this.method209() - 64 : this.method211() - 49152;
    }

    @OriginalMember(owner = "kb", name = "k", descriptor = "()I")
    public int method223() {
        int var1 = this.field611[this.field612] & 0xFF;
        return var1 < 128 ? this.method209() : this.method211() - 32768;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method224(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field612;
        this.field612 = 0;
        byte[] var5 = new byte[var4];
        this.method218((byte) 6, var4, var5, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        if (arg0 != -44053) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        byte[] var9 = var7.toByteArray();
        this.field612 = 0;
        this.method199(var9.length);
        this.method207(var9.length, var9, 25772, 0);
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
            field614[var0] = var1;
        }
        field615 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field620 = new LinkList((byte) 5);
        field621 = new LinkList((byte) 5);
        field622 = new LinkList((byte) 5);
    }
}
