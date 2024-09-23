import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    private int field682 = -203;

    @OriginalMember(owner = "mb", name = "j", descriptor = "B")
    private byte field683 = 9;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    private int field684 = -139;

    @OriginalMember(owner = "mb", name = "l", descriptor = "Z")
    private boolean field685 = false;

    @OriginalMember(owner = "mb", name = "m", descriptor = "Z")
    private boolean field686 = false;

    @OriginalMember(owner = "mb", name = "n", descriptor = "I")
    private int field687 = 8;

    @OriginalMember(owner = "mb", name = "o", descriptor = "Z")
    private boolean field688 = false;

    @OriginalMember(owner = "mb", name = "p", descriptor = "Z")
    private boolean field689 = false;

    @OriginalMember(owner = "mb", name = "q", descriptor = "Z")
    private boolean field690 = true;

    @OriginalMember(owner = "mb", name = "s", descriptor = "Z")
    private boolean field692 = false;

    @OriginalMember(owner = "mb", name = "t", descriptor = "[B")
    public byte[] field693;

    @OriginalMember(owner = "mb", name = "u", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "mb", name = "h", descriptor = "I")
    private static int field681 = 7;

    @OriginalMember(owner = "mb", name = "w", descriptor = "[I")
    private static int[] field696 = new int[256];

    @OriginalMember(owner = "mb", name = "x", descriptor = "[I")
    private static final int[] field697;

    @OriginalMember(owner = "mb", name = "C", descriptor = "Lpb;")
    private static LinkList field702;

    @OriginalMember(owner = "mb", name = "D", descriptor = "Lpb;")
    private static LinkList field703;

    @OriginalMember(owner = "mb", name = "E", descriptor = "Lpb;")
    private static LinkList field704;

    @OriginalMember(owner = "mb", name = "r", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "mb", name = "v", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "mb", name = "z", descriptor = "I")
    private static int field699;

    @OriginalMember(owner = "mb", name = "A", descriptor = "I")
    private static int field700;

    @OriginalMember(owner = "mb", name = "B", descriptor = "I")
    private static int field701;

    @OriginalMember(owner = "mb", name = "F", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "mb", name = "y", descriptor = "Lxb;")
    public Isaac field698;

    @OriginalMember(owner = "mb", name = "a", descriptor = "(ZI)Lmb;")
    public static Packet method218(boolean arg0, int arg1) {
        LinkList var2 = field703;
        synchronized (field703) {
            Packet var3 = null;
            if (arg1 == 0 && field699 > 0) {
                field699--;
                var3 = (Packet) field702.method249();
            } else if (arg1 == 1 && field700 > 0) {
                field700--;
                var3 = (Packet) field703.method249();
            } else if (arg1 == 2 && field701 > 0) {
                field701--;
                var3 = (Packet) field704.method249();
            }
            if (var3 != null) {
                var3.field694 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(field681);
        if (arg0) {
            throw new NullPointerException();
        }
        var5.field694 = 0;
        if (arg1 == 0) {
            var5.field693 = new byte[100];
        } else if (arg1 == 1) {
            var5.field693 = new byte[5000];
        } else {
            var5.field693 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        LinkList var2 = field703;
        synchronized (field703) {
            this.field694 = 0;
            if (this.field693.length == 100 && field699 < 1000) {
                field702.method247(this);
                field699++;
                return;
            }
            if (this.field693.length == 5000 && field700 < 250) {
                field703.method247(this);
                field700++;
                return;
            }
            if (this.field693.length == 30000 && field701 < 50) {
                field704.method247(this);
                field701++;
                return;
            }
        }
        if (arg0 != 0) {
            this.field691 = -402;
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        this.field693 = arg1;
        this.field694 = 0;
        int var3 = 87 / arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II)V")
    public void method220(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field682 = 474;
        }
        this.field693[this.field694++] = (byte) (arg1 + this.field698.method291());
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public void method221(int arg0) {
        this.field693[this.field694++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field693[this.field694++] = (byte) (arg0 >> 8);
        this.field693[this.field694++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(BI)V")
    public void method223(byte arg0, int arg1) {
        if (arg0 == 4) {
            boolean var3 = false;
            this.field693[this.field694++] = (byte) arg1;
            this.field693[this.field694++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(I)V")
    public void method224(int arg0) {
        this.field693[this.field694++] = (byte) (arg0 >> 16);
        this.field693[this.field694++] = (byte) (arg0 >> 8);
        this.field693[this.field694++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(I)V")
    public void method225(int arg0) {
        this.field693[this.field694++] = (byte) (arg0 >> 24);
        this.field693[this.field694++] = (byte) (arg0 >> 16);
        this.field693[this.field694++] = (byte) (arg0 >> 8);
        this.field693[this.field694++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(II)V")
    public void method226(int arg0, int arg1) {
        this.field693[this.field694++] = (byte) arg0;
        if (arg1 < 6 || arg1 > 6) {
            this.field682 = -351;
        }
        this.field693[this.field694++] = (byte) (arg0 >> 8);
        this.field693[this.field694++] = (byte) (arg0 >> 16);
        this.field693[this.field694++] = (byte) (arg0 >> 24);
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(JZ)V")
    public void method227(long arg0, boolean arg1) {
        this.field693[this.field694++] = (byte) (arg0 >> 56);
        if (!arg1) {
            return;
        }
        this.field693[this.field694++] = (byte) (arg0 >> 48);
        this.field693[this.field694++] = (byte) (arg0 >> 40);
        this.field693[this.field694++] = (byte) (arg0 >> 32);
        this.field693[this.field694++] = (byte) (arg0 >> 24);
        this.field693[this.field694++] = (byte) (arg0 >> 16);
        this.field693[this.field694++] = (byte) (arg0 >> 8);
        this.field693[this.field694++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method228(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field693, this.field694);
        this.field694 += arg0.length();
        this.field693[this.field694++] = 10;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "([BIIZ)V")
    public void method229(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
                this.field693[this.field694++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IB)V")
    public void method230(int arg0, byte arg1) {
        this.field693[this.field694 - arg0 - 1] = (byte) arg0;
        if (this.field683 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "()I")
    public int method231() {
        return this.field693[this.field694++] & 0xFF;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "()B")
    public byte method232() {
        return this.field693[this.field694++];
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "()I")
    public int method233() {
        this.field694 += 2;
        return ((this.field693[this.field694 - 2] & 0xFF) << 8) + (this.field693[this.field694 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "()I")
    public int method234() {
        this.field694 += 2;
        int var1 = ((this.field693[this.field694 - 2] & 0xFF) << 8) + (this.field693[this.field694 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "()I")
    public int method235() {
        this.field694 += 3;
        return (this.field693[this.field694 - 1] & 0xFF) + ((this.field693[this.field694 - 3] & 0xFF) << 16) + ((this.field693[this.field694 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "()I")
    public int method236() {
        this.field694 += 4;
        return (this.field693[this.field694 - 1] & 0xFF) + ((this.field693[this.field694 - 2] & 0xFF) << 8) + ((this.field693[this.field694 - 4] & 0xFF) << 24) + ((this.field693[this.field694 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "(I)J")
    public long method237(int arg0) {
        long var2 = (long) this.method236() & 0xFFFFFFFFL;
        long var4 = (long) this.method236() & 0xFFFFFFFFL;
        if (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method238() {
        int var1 = this.field694;
        while (this.field693[this.field694++] != 10) {
        }
        return new String(this.field693, var1, this.field694 - var1 - 1);
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "(I)[B")
    public byte[] method239(int arg0) {
        int var2 = this.field694;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (this.field693[this.field694++] != 10) {
        }
        byte[] var4 = new byte[this.field694 - var2 - 1];
        for (int var5 = var2; var5 < this.field694 - 1; var5++) {
            var4[var5 - var2] = this.field693[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II[BI)V")
    public void method240(int arg0, int arg1, byte[] arg2, int arg3) {
        while (arg3 >= 0) {
            this.field684 = 194;
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            arg2[var5] = this.field693[this.field694++];
        }
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "(I)V")
    public void method241(int arg0) {
        if (arg0 >= 0) {
            this.field682 = -20;
        }
        this.field695 = this.field694 * 8;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IZ)I")
    public int method242(int arg0, boolean arg1) {
        int var3 = this.field695 >> 3;
        int var4 = 8 - (this.field695 & 0x7);
        int var5 = 0;
        if (arg1) {
            return this.field682;
        }
        this.field695 += arg0;
        while (arg0 > var4) {
            var5 += (this.field693[var3++] & field697[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field693[var3] & field697[var4]) + var5;
        } else {
            var6 = (this.field693[var3] >> var4 - arg0 & field697[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "(I)V")
    public void method243(int arg0) {
        int var2 = 82 / arg0;
        this.field694 = (this.field695 + 7) / 8;
    }

    @OriginalMember(owner = "mb", name = "j", descriptor = "()I")
    public int method244() {
        int var1 = this.field693[this.field694] & 0xFF;
        return var1 < 128 ? this.method231() - 64 : this.method233() - 49152;
    }

    @OriginalMember(owner = "mb", name = "k", descriptor = "()I")
    public int method245() {
        int var1 = this.field693[this.field694] & 0xFF;
        return var1 < 128 ? this.method231() : this.method233() - 32768;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public void method246(BigInteger arg0, BigInteger arg1, boolean arg2) {
        int var4 = this.field694;
        this.field694 = 0;
        byte[] var5 = new byte[var4];
        this.method240(var4, 0, var5, -162);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field694 = 0;
        if (arg2) {
            this.field690 = !this.field690;
        }
        this.method221(var8.length);
        this.method229(var8, var8.length, 0, false);
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
            field696[var0] = var1;
        }
        field697 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field702 = new LinkList(-740);
        field703 = new LinkList(-740);
        field704 = new LinkList(-740);
    }
}
