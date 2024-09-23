import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "i", descriptor = "Z")
    private boolean field694 = true;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    private int field695 = -179;

    @OriginalMember(owner = "mb", name = "l", descriptor = "[B")
    public byte[] field697;

    @OriginalMember(owner = "mb", name = "m", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "mb", name = "o", descriptor = "[I")
    private static int[] field700 = new int[256];

    @OriginalMember(owner = "mb", name = "p", descriptor = "[I")
    private static final int[] field701;

    @OriginalMember(owner = "mb", name = "u", descriptor = "Lpb;")
    private static LinkList field706;

    @OriginalMember(owner = "mb", name = "v", descriptor = "Lpb;")
    private static LinkList field707;

    @OriginalMember(owner = "mb", name = "w", descriptor = "Lpb;")
    private static LinkList field708;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "mb", name = "n", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "mb", name = "r", descriptor = "I")
    private static int field703;

    @OriginalMember(owner = "mb", name = "s", descriptor = "I")
    private static int field704;

    @OriginalMember(owner = "mb", name = "t", descriptor = "I")
    private static int field705;

    @OriginalMember(owner = "mb", name = "x", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "mb", name = "q", descriptor = "Lxb;")
    public Isaac field702;

    @OriginalMember(owner = "mb", name = "h", descriptor = "Z")
    private static boolean field693;

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II)Lmb;")
    public static Packet method218(int arg0, int arg1) {
        LinkList var2 = field707;
        synchronized (field707) {
            Packet var3 = null;
            if (arg1 == 0 && field703 > 0) {
                field703--;
                var3 = (Packet) field706.method249();
            } else if (arg1 == 1 && field704 > 0) {
                field704--;
                var3 = (Packet) field707.method249();
            } else if (arg1 == 2 && field705 > 0) {
                field705--;
                var3 = (Packet) field708.method249();
            }
            if (var3 != null) {
                var3.field698 = 0;
                return var3;
            }
        }
        if (arg0 != 527) {
            field693 = !field693;
        }
        Packet var5 = new Packet(false);
        var5.field698 = 0;
        if (arg1 == 0) {
            var5.field697 = new byte[100];
        } else if (arg1 == 1) {
            var5.field697 = new byte[5000];
        } else {
            var5.field697 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        if (arg0 != -42845) {
            this.field695 = 126;
        }
        LinkList var2 = field707;
        synchronized (field707) {
            this.field698 = 0;
            if (this.field697.length == 100 && field703 < 1000) {
                field706.method247(this);
                field703++;
            } else if (this.field697.length == 5000 && field704 < 250) {
                field707.method247(this);
                field704++;
            } else if (this.field697.length == 30000 && field705 < 50) {
                field708.method247(this);
                field705++;
            }
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(Z)V")
    private Packet(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "([BZ)V")
    public Packet(byte[] arg0, boolean arg1) {
        this.field697 = arg0;
        if (!arg1) {
            throw new NullPointerException();
        }
        this.field698 = 0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(BI)V")
    public void method220(byte arg0, int arg1) {
        if (arg0 == 78) {
            this.field697[this.field698++] = (byte) (arg1 + this.field702.method295());
        }
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public void method221(int arg0) {
        this.field697[this.field698++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field697[this.field698++] = (byte) (arg0 >> 8);
        this.field697[this.field698++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(II)V")
    public void method223(int arg0, int arg1) {
        this.field697[this.field698++] = (byte) arg0;
        if (arg1 != 20776) {
            this.field696 = 422;
        }
        this.field697[this.field698++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(I)V")
    public void method224(int arg0) {
        this.field697[this.field698++] = (byte) (arg0 >> 16);
        this.field697[this.field698++] = (byte) (arg0 >> 8);
        this.field697[this.field698++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(I)V")
    public void method225(int arg0) {
        this.field697[this.field698++] = (byte) (arg0 >> 24);
        this.field697[this.field698++] = (byte) (arg0 >> 16);
        this.field697[this.field698++] = (byte) (arg0 >> 8);
        this.field697[this.field698++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(ZI)V")
    public void method226(boolean arg0, int arg1) {
        if (arg0) {
            this.field694 = !this.field694;
        }
        this.field697[this.field698++] = (byte) arg1;
        this.field697[this.field698++] = (byte) (arg1 >> 8);
        this.field697[this.field698++] = (byte) (arg1 >> 16);
        this.field697[this.field698++] = (byte) (arg1 >> 24);
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(JZ)V")
    public void method227(long arg0, boolean arg1) {
        this.field697[this.field698++] = (byte) (arg0 >> 56);
        this.field697[this.field698++] = (byte) (arg0 >> 48);
        this.field697[this.field698++] = (byte) (arg0 >> 40);
        if (arg1) {
            return;
        }
        this.field697[this.field698++] = (byte) (arg0 >> 32);
        this.field697[this.field698++] = (byte) (arg0 >> 24);
        this.field697[this.field698++] = (byte) (arg0 >> 16);
        this.field697[this.field698++] = (byte) (arg0 >> 8);
        this.field697[this.field698++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method228(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field697, this.field698);
        this.field698 += arg0.length();
        this.field697[this.field698++] = 10;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I[BBI)V")
    public void method229(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 == -66) {
            for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
                this.field697[this.field698++] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(II)V")
    public void method230(int arg0, int arg1) {
        this.field697[this.field698 - arg0 - 1] = (byte) arg0;
        int var3 = 62 / arg1;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "()I")
    public int method231() {
        return this.field697[this.field698++] & 0xFF;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "()B")
    public byte method232() {
        return this.field697[this.field698++];
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "()I")
    public int method233() {
        this.field698 += 2;
        return ((this.field697[this.field698 - 2] & 0xFF) << 8) + (this.field697[this.field698 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "()I")
    public int method234() {
        this.field698 += 2;
        int var1 = ((this.field697[this.field698 - 2] & 0xFF) << 8) + (this.field697[this.field698 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "()I")
    public int method235() {
        this.field698 += 3;
        return (this.field697[this.field698 - 1] & 0xFF) + ((this.field697[this.field698 - 3] & 0xFF) << 16) + ((this.field697[this.field698 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "()I")
    public int method236() {
        this.field698 += 4;
        return (this.field697[this.field698 - 1] & 0xFF) + ((this.field697[this.field698 - 2] & 0xFF) << 8) + ((this.field697[this.field698 - 4] & 0xFF) << 24) + ((this.field697[this.field698 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "(I)J")
    public long method237(int arg0) {
        long var2 = (long) this.method236() & 0xFFFFFFFFL;
        long var4 = (long) this.method236() & 0xFFFFFFFFL;
        int var6 = 78 / arg0;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method238() {
        int var1 = this.field698;
        while (this.field697[this.field698++] != 10) {
        }
        return new String(this.field697, var1, this.field698 - var1 - 1);
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Z)[B")
    public byte[] method239(boolean arg0) {
        int var2 = this.field698;
        if (!arg0) {
            this.field694 = !this.field694;
        }
        while (this.field697[this.field698++] != 10) {
        }
        byte[] var3 = new byte[this.field698 - var2 - 1];
        for (int var4 = var2; var4 < this.field698 - 1; var4++) {
            var3[var4 - var2] = this.field697[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I[BIZ)V")
    public void method240(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field693 = !field693;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg1[var5] = this.field697[this.field698++];
        }
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "(I)V")
    public void method241(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field699 = this.field698 * 8;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(II)I")
    public int method242(int arg0, int arg1) {
        int var3 = this.field699 >> 3;
        int var4 = 8 - (this.field699 & 0x7);
        int var5 = 0;
        if (arg0 < 6 || arg0 > 6) {
            this.field695 = 52;
        }
        this.field699 += arg1;
        while (arg1 > var4) {
            var5 += (this.field697[var3++] & field701[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field697[var3] & field701[var4]) + var5;
        } else {
            var6 = (this.field697[var3] >> var4 - arg1 & field701[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(B)V")
    public void method243(byte arg0) {
        this.field698 = (this.field699 + 7) / 8;
        if (arg0 == 0) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "mb", name = "j", descriptor = "()I")
    public int method244() {
        int var1 = this.field697[this.field698] & 0xFF;
        return var1 < 128 ? this.method231() - 64 : this.method233() - 49152;
    }

    @OriginalMember(owner = "mb", name = "k", descriptor = "()I")
    public int method245() {
        int var1 = this.field697[this.field698] & 0xFF;
        return var1 < 128 ? this.method231() : this.method233() - 32768;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method246(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field698;
        this.field698 = 0;
        byte[] var5 = new byte[var4];
        this.method240(0, var5, var4, true);
        BigInteger var6 = new BigInteger(var5);
        if (arg1 != 0) {
            return;
        }
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field698 = 0;
        this.method221(var8.length);
        this.method229(0, var8, (byte) -66, var8.length);
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
            field700[var0] = var1;
        }
        field701 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field706 = new LinkList((byte) 115);
        field707 = new LinkList((byte) 115);
        field708 = new LinkList((byte) 115);
    }
}
