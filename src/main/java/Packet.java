import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "kb", name = "i", descriptor = "Z")
    private boolean field597 = false;

    @OriginalMember(owner = "kb", name = "j", descriptor = "B")
    private byte field598 = -46;

    @OriginalMember(owner = "kb", name = "k", descriptor = "I")
    private int field599 = -494;

    @OriginalMember(owner = "kb", name = "l", descriptor = "I")
    private int field600 = -222;

    @OriginalMember(owner = "kb", name = "m", descriptor = "B")
    private byte field601 = -104;

    @OriginalMember(owner = "kb", name = "n", descriptor = "I")
    private int field602 = 553;

    @OriginalMember(owner = "kb", name = "o", descriptor = "Z")
    private boolean field603 = true;

    @OriginalMember(owner = "kb", name = "p", descriptor = "I")
    private int field604 = 6;

    @OriginalMember(owner = "kb", name = "q", descriptor = "[B")
    public byte[] field605;

    @OriginalMember(owner = "kb", name = "r", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "kb", name = "h", descriptor = "I")
    private static int field596 = -984;

    @OriginalMember(owner = "kb", name = "t", descriptor = "[I")
    private static int[] field608 = new int[256];

    @OriginalMember(owner = "kb", name = "u", descriptor = "[I")
    private static final int[] field609;

    @OriginalMember(owner = "kb", name = "z", descriptor = "Lob;")
    private static LinkList field614;

    @OriginalMember(owner = "kb", name = "A", descriptor = "Lob;")
    private static LinkList field615;

    @OriginalMember(owner = "kb", name = "B", descriptor = "Lob;")
    private static LinkList field616;

    @OriginalMember(owner = "kb", name = "s", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "kb", name = "w", descriptor = "I")
    private static int field611;

    @OriginalMember(owner = "kb", name = "x", descriptor = "I")
    private static int field612;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private static int field613;

    @OriginalMember(owner = "kb", name = "v", descriptor = "Ltb;")
    public Isaac field610;

    @OriginalMember(owner = "kb", name = "C", descriptor = "Z")
    public static boolean field617;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(II)Lkb;")
    public static Packet method190(int arg0, int arg1) {
        if (arg1 != 32206) {
            field596 = -21;
        }
        LinkList var2 = field615;
        synchronized (field615) {
            Packet var3 = null;
            if (arg0 == 0 && field611 > 0) {
                field611--;
                var3 = (Packet) field614.method219();
            } else if (arg0 == 1 && field612 > 0) {
                field612--;
                var3 = (Packet) field615.method219();
            } else if (arg0 == 2 && field613 > 0) {
                field613--;
                var3 = (Packet) field616.method219();
            }
            if (var3 != null) {
                var3.field606 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(false);
        var5.field606 = 0;
        if (arg0 == 0) {
            var5.field605 = new byte[100];
        } else if (arg0 == 1) {
            var5.field605 = new byte[5000];
        } else {
            var5.field605 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I)V")
    public void method191(int arg0) {
        LinkList var2 = field615;
        synchronized (field615) {
            this.field606 = 0;
            if (this.field605.length == 100 && field611 < 1000) {
                field614.method217(this);
                field611++;
                return;
            }
            if (this.field605.length == 5000 && field612 < 250) {
                field615.method217(this);
                field612++;
                return;
            }
            if (this.field605.length == 30000 && field613 < 50) {
                field616.method217(this);
                field613++;
                return;
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Z)V")
    private Packet(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            throw new NullPointerException();
        }
        this.field605 = arg0;
        this.field606 = 0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(II)V")
    public void method192(int arg0, int arg1) {
        this.field605[this.field606++] = (byte) (arg1 + this.field610.method238());
        int var3 = 15 / arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(I)V")
    public void method193(int arg0) {
        this.field605[this.field606++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method194(int arg0) {
        this.field605[this.field606++] = (byte) (arg0 >> 8);
        this.field605[this.field606++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method195(int arg0) {
        this.field605[this.field606++] = (byte) (arg0 >> 16);
        this.field605[this.field606++] = (byte) (arg0 >> 8);
        this.field605[this.field606++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "(I)V")
    public void method196(int arg0) {
        this.field605[this.field606++] = (byte) (arg0 >> 24);
        this.field605[this.field606++] = (byte) (arg0 >> 16);
        this.field605[this.field606++] = (byte) (arg0 >> 8);
        this.field605[this.field606++] = (byte) arg0;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(JI)V")
    public void method197(long arg0, int arg1) {
        this.field605[this.field606++] = (byte) (arg0 >> 56);
        this.field605[this.field606++] = (byte) (arg0 >> 48);
        this.field605[this.field606++] = (byte) (arg0 >> 40);
        this.field605[this.field606++] = (byte) (arg0 >> 32);
        this.field605[this.field606++] = (byte) (arg0 >> 24);
        this.field605[this.field606++] = (byte) (arg0 >> 16);
        this.field605[this.field606++] = (byte) (arg0 >> 8);
        this.field605[this.field606++] = (byte) arg0;
        if (arg1 == -13709) {
            ;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method198(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field605, this.field606);
        this.field606 += arg0.length();
        this.field605[this.field606++] = 10;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(I[BII)V")
    public void method199(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg2 + arg3; var6++) {
            this.field605[this.field606++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IB)V")
    public void method200(int arg0, byte arg1) {
        if (arg1 == -12) {
            this.field605[this.field606 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "()I")
    public int method201() {
        return this.field605[this.field606++] & 0xFF;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "()B")
    public byte method202() {
        return this.field605[this.field606++];
    }

    @OriginalMember(owner = "kb", name = "e", descriptor = "()I")
    public int method203() {
        this.field606 += 2;
        return ((this.field605[this.field606 - 2] & 0xFF) << 8) + (this.field605[this.field606 - 1] & 0xFF);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "()I")
    public int method204() {
        this.field606 += 2;
        int var1 = ((this.field605[this.field606 - 2] & 0xFF) << 8) + (this.field605[this.field606 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "()I")
    public int method205() {
        this.field606 += 3;
        return (this.field605[this.field606 - 1] & 0xFF) + ((this.field605[this.field606 - 3] & 0xFF) << 16) + ((this.field605[this.field606 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "kb", name = "h", descriptor = "()I")
    public int method206() {
        this.field606 += 4;
        return (this.field605[this.field606 - 1] & 0xFF) + ((this.field605[this.field606 - 2] & 0xFF) << 8) + ((this.field605[this.field606 - 4] & 0xFF) << 24) + ((this.field605[this.field606 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "kb", name = "f", descriptor = "(I)J")
    public long method207(int arg0) {
        long var2 = (long) this.method206() & 0xFFFFFFFFL;
        if (arg0 <= 0) {
            this.field603 = !this.field603;
        }
        long var4 = (long) this.method206() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "kb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method208() {
        int var1 = this.field606;
        while (this.field605[this.field606++] != 10) {
        }
        return new String(this.field605, var1, this.field606 - var1 - 1);
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Z)[B")
    public byte[] method209(boolean arg0) {
        int var2 = this.field606;
        if (!arg0) {
            throw new NullPointerException();
        }
        while (this.field605[this.field606++] != 10) {
        }
        byte[] var3 = new byte[this.field606 - var2 - 1];
        for (int var4 = var2; var4 < this.field606 - 1; var4++) {
            var3[var4 - var2] = this.field605[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([BIII)V")
    public void method210(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 7 && arg2 <= 7) {
            for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
                arg0[var5] = this.field605[this.field606++];
            }
        }
    }

    @OriginalMember(owner = "kb", name = "g", descriptor = "(I)V")
    public void method211(int arg0) {
        if (arg0 >= 7 && arg0 <= 7) {
            this.field607 = this.field606 * 8;
        }
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(IB)I")
    public int method212(int arg0, byte arg1) {
        if (this.field598 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field607 >> 3;
        int var5 = 8 - (this.field607 & 0x7);
        int var6 = 0;
        this.field607 += arg0;
        while (arg0 > var5) {
            var6 += (this.field605[var4++] & field609[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg0 == var5) {
            var7 = (this.field605[var4] & field609[var5]) + var6;
        } else {
            var7 = (this.field605[var4] >> var5 - arg0 & field609[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method213(byte arg0) {
        if (arg0 == 7) {
            this.field606 = (this.field607 + 7) / 8;
        }
    }

    @OriginalMember(owner = "kb", name = "j", descriptor = "()I")
    public int method214() {
        int var1 = this.field605[this.field606] & 0xFF;
        return var1 < 128 ? this.method201() - 64 : this.method203() - 49152;
    }

    @OriginalMember(owner = "kb", name = "k", descriptor = "()I")
    public int method215() {
        int var1 = this.field605[this.field606] & 0xFF;
        return var1 < 128 ? this.method201() : this.method203() - 32768;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method216(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field606;
        this.field606 = 0;
        while (arg2 >= 0) {
            field596 = 109;
        }
        byte[] var5 = new byte[var4];
        this.method210(var5, var4, 7, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field606 = 0;
        this.method193(var8.length);
        this.method199(2, var8, 0, var8.length);
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
            field608[var0] = var1;
        }
        field609 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field614 = new LinkList(5);
        field615 = new LinkList(5);
        field616 = new LinkList(5);
    }
}
