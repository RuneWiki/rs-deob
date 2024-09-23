import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "i", descriptor = "B")
    private byte field705 = 103;

    @OriginalMember(owner = "mb", name = "j", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "mb", name = "k", descriptor = "Z")
    private boolean field707 = true;

    @OriginalMember(owner = "mb", name = "l", descriptor = "B")
    private byte field708 = 2;

    @OriginalMember(owner = "mb", name = "m", descriptor = "I")
    private int field709 = 980;

    @OriginalMember(owner = "mb", name = "n", descriptor = "I")
    private int field710 = 3520;

    @OriginalMember(owner = "mb", name = "o", descriptor = "B")
    private byte field711 = -116;

    @OriginalMember(owner = "mb", name = "p", descriptor = "I")
    private int field712 = 530;

    @OriginalMember(owner = "mb", name = "r", descriptor = "I")
    private int field714 = -171;

    @OriginalMember(owner = "mb", name = "s", descriptor = "Z")
    private boolean field715 = false;

    @OriginalMember(owner = "mb", name = "F", descriptor = "[C")
    private char[] field728 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "mb", name = "t", descriptor = "[B")
    public byte[] field716;

    @OriginalMember(owner = "mb", name = "u", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "mb", name = "q", descriptor = "I")
    private static int field713 = -24461;

    @OriginalMember(owner = "mb", name = "w", descriptor = "[I")
    private static int[] field719 = new int[256];

    @OriginalMember(owner = "mb", name = "x", descriptor = "[I")
    private static final int[] field720;

    @OriginalMember(owner = "mb", name = "C", descriptor = "Lpb;")
    private static LinkList field725;

    @OriginalMember(owner = "mb", name = "D", descriptor = "Lpb;")
    private static LinkList field726;

    @OriginalMember(owner = "mb", name = "E", descriptor = "Lpb;")
    private static LinkList field727;

    @OriginalMember(owner = "mb", name = "v", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "mb", name = "z", descriptor = "I")
    private static int field722;

    @OriginalMember(owner = "mb", name = "A", descriptor = "I")
    private static int field723;

    @OriginalMember(owner = "mb", name = "B", descriptor = "I")
    private static int field724;

    @OriginalMember(owner = "mb", name = "G", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "mb", name = "y", descriptor = "Lxb;")
    public Isaac field721;

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IZ)Lmb;")
    public static Packet method226(int arg0, boolean arg1) {
        if (arg1) {
            field713 = 422;
        }
        LinkList var2 = field726;
        synchronized (field726) {
            Packet var3 = null;
            if (arg0 == 0 && field722 > 0) {
                field722--;
                var3 = (Packet) field725.method257();
            } else if (arg0 == 1 && field723 > 0) {
                field723--;
                var3 = (Packet) field726.method257();
            } else if (arg0 == 2 && field724 > 0) {
                field724--;
                var3 = (Packet) field727.method257();
            }
            if (var3 != null) {
                var3.field717 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet((byte) 103);
        var5.field717 = 0;
        if (arg0 == 0) {
            var5.field716 = new byte[100];
        } else if (arg0 == 1) {
            var5.field716 = new byte[5000];
        } else {
            var5.field716 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public void method227(int arg0) {
        if (arg0 != 0) {
            this.field715 = !this.field715;
        }
        LinkList var2 = field726;
        synchronized (field726) {
            this.field717 = 0;
            if (this.field716.length == 100 && field722 < 1000) {
                field725.method255(this);
                field722++;
            } else if (this.field716.length == 5000 && field723 < 250) {
                field726.method255(this);
                field723++;
            } else if (this.field716.length == 30000 && field724 < 50) {
                field727.method255(this);
                field724++;
            }
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(B)V")
    private Packet(byte arg0) {
        if (this.field705 != arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        this.field716 = arg1;
        int var3 = 49 / arg0;
        this.field717 = 0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II)V")
    public void method228(int arg0, int arg1) {
        if (arg1 == 0) {
            this.field716[this.field717++] = (byte) (arg0 + this.field721.method305());
        }
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public void method229(int arg0) {
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(I)V")
    public void method230(int arg0) {
        this.field716[this.field717++] = (byte) (arg0 >> 8);
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(ZI)V")
    public void method231(boolean arg0, int arg1) {
        this.field716[this.field717++] = (byte) arg1;
        this.field716[this.field717++] = (byte) (arg1 >> 8);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(I)V")
    public void method232(int arg0) {
        this.field716[this.field717++] = (byte) (arg0 >> 16);
        this.field716[this.field717++] = (byte) (arg0 >> 8);
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(I)V")
    public void method233(int arg0) {
        this.field716[this.field717++] = (byte) (arg0 >> 24);
        this.field716[this.field717++] = (byte) (arg0 >> 16);
        this.field716[this.field717++] = (byte) (arg0 >> 8);
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(II)V")
    public void method234(int arg0, int arg1) {
        this.field716[this.field717++] = (byte) arg1;
        this.field716[this.field717++] = (byte) (arg1 >> 8);
        this.field716[this.field717++] = (byte) (arg1 >> 16);
        int var3 = 30 / arg0;
        this.field716[this.field717++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(BJ)V")
    public void method235(byte arg0, long arg1) {
        this.field716[this.field717++] = (byte) (arg1 >> 56);
        this.field716[this.field717++] = (byte) (arg1 >> 48);
        this.field716[this.field717++] = (byte) (arg1 >> 40);
        this.field716[this.field717++] = (byte) (arg1 >> 32);
        this.field716[this.field717++] = (byte) (arg1 >> 24);
        this.field716[this.field717++] = (byte) (arg1 >> 16);
        this.field716[this.field717++] = (byte) (arg1 >> 8);
        this.field716[this.field717++] = (byte) arg1;
        if (arg0 != -58) {
            this.field706 = !this.field706;
        } else if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method236(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field716, this.field717);
        this.field717 += arg0.length();
        this.field716[this.field717++] = 10;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IIZ[B)V")
    public void method237(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0; var6 < arg0 + arg1; var6++) {
            this.field716[this.field717++] = arg3[var6];
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IB)V")
    public void method238(int arg0, byte arg1) {
        if (arg1 == 7) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field716[this.field717 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "()I")
    public int method239() {
        return this.field716[this.field717++] & 0xFF;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "()B")
    public byte method240() {
        return this.field716[this.field717++];
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "()I")
    public int method241() {
        this.field717 += 2;
        return ((this.field716[this.field717 - 2] & 0xFF) << 8) + (this.field716[this.field717 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "()I")
    public int method242() {
        this.field717 += 2;
        int var1 = ((this.field716[this.field717 - 2] & 0xFF) << 8) + (this.field716[this.field717 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "()I")
    public int method243() {
        this.field717 += 3;
        return (this.field716[this.field717 - 1] & 0xFF) + ((this.field716[this.field717 - 3] & 0xFF) << 16) + ((this.field716[this.field717 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "()I")
    public int method244() {
        this.field717 += 4;
        return (this.field716[this.field717 - 1] & 0xFF) + ((this.field716[this.field717 - 2] & 0xFF) << 8) + ((this.field716[this.field717 - 4] & 0xFF) << 24) + ((this.field716[this.field717 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "(I)J")
    public long method245(int arg0) {
        long var2 = (long) this.method244() & 0xFFFFFFFFL;
        if (arg0 < 6 || arg0 > 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        long var5 = (long) this.method244() & 0xFFFFFFFFL;
        return (var2 << 32) + var5;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method246() {
        int var1 = this.field717;
        while (this.field716[this.field717++] != 10) {
        }
        return new String(this.field716, var1, this.field717 - var1 - 1);
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "(I)[B")
    public byte[] method247(int arg0) {
        if (arg0 != -34736) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = this.field717;
        while (this.field716[this.field717++] != 10) {
        }
        byte[] var4 = new byte[this.field717 - var3 - 1];
        for (int var5 = var3; var5 < this.field717 - 1; var5++) {
            var4[var5 - var3] = this.field716[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I[BII)V")
    public void method248(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 == -22245) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                arg1[var5] = this.field716[this.field717++];
            }
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(B)V")
    public void method249(byte arg0) {
        if (this.field708 == arg0) {
            this.field718 = this.field717 * 8;
        }
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(IB)I")
    public int method250(int arg0, byte arg1) {
        int var3 = this.field718 >> 3;
        int var4 = 8 - (this.field718 & 0x7);
        int var5 = 0;
        if (arg1 != -20) {
            return this.field714;
        }
        this.field718 += arg0;
        while (arg0 > var4) {
            var5 += (this.field716[var3++] & field720[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field716[var3] & field720[var4]) + var5;
        } else {
            var6 = (this.field716[var3] >> var4 - arg0 & field720[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "(I)V")
    public void method251(int arg0) {
        if (arg0 <= 0) {
            this.field714 = 315;
        }
        this.field717 = (this.field718 + 7) / 8;
    }

    @OriginalMember(owner = "mb", name = "j", descriptor = "()I")
    public int method252() {
        int var1 = this.field716[this.field717] & 0xFF;
        return var1 < 128 ? this.method239() - 64 : this.method241() - 49152;
    }

    @OriginalMember(owner = "mb", name = "k", descriptor = "()I")
    public int method253() {
        int var1 = this.field716[this.field717] & 0xFF;
        return var1 < 128 ? this.method239() : this.method241() - 32768;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method254(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field717;
        this.field717 = 0;
        byte[] var5 = new byte[var4];
        int var6 = 28 / arg2;
        this.method248(var4, var5, 0, -22245);
        BigInteger var7 = new BigInteger(var5);
        BigInteger var8 = var7.modPow(arg0, arg1);
        byte[] var9 = var8.toByteArray();
        this.field717 = 0;
        this.method229(var9.length);
        this.method237(0, var9.length, false, var9);
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
            field719[var0] = var1;
        }
        field720 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field725 = new LinkList((byte) -118);
        field726 = new LinkList((byte) -118);
        field727 = new LinkList((byte) -118);
    }
}
