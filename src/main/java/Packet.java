import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "k", descriptor = "B")
    private byte field715 = 9;

    @OriginalMember(owner = "lb", name = "m", descriptor = "Z")
    private boolean field717 = true;

    @OriginalMember(owner = "lb", name = "n", descriptor = "Z")
    private boolean field718 = true;

    @OriginalMember(owner = "lb", name = "o", descriptor = "Z")
    private boolean field719 = true;

    @OriginalMember(owner = "lb", name = "p", descriptor = "I")
    private int field720 = 6;

    @OriginalMember(owner = "lb", name = "q", descriptor = "[B")
    public byte[] field721;

    @OriginalMember(owner = "lb", name = "r", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private static int field714 = -31767;

    @OriginalMember(owner = "lb", name = "t", descriptor = "[I")
    private static int[] field724 = new int[256];

    @OriginalMember(owner = "lb", name = "u", descriptor = "[I")
    private static final int[] field725;

    @OriginalMember(owner = "lb", name = "z", descriptor = "Lob;")
    private static LinkList field730;

    @OriginalMember(owner = "lb", name = "A", descriptor = "Lob;")
    private static LinkList field731;

    @OriginalMember(owner = "lb", name = "B", descriptor = "Lob;")
    private static LinkList field732;

    @OriginalMember(owner = "lb", name = "C", descriptor = "[C")
    private static char[] field733;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "lb", name = "s", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "lb", name = "w", descriptor = "I")
    private static int field727;

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    private static int field728;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private static int field729;

    @OriginalMember(owner = "lb", name = "D", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "lb", name = "v", descriptor = "Lwb;")
    public Isaac field726;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IB)Llb;")
    public static Packet method217(int arg0, byte arg1) {
        LinkList var2 = field731;
        synchronized (field731) {
            Packet var3 = null;
            if (arg0 == 0 && field727 > 0) {
                field727--;
                var3 = (Packet) field730.method247();
            } else if (arg0 == 1 && field728 > 0) {
                field728--;
                var3 = (Packet) field731.method247();
            } else if (arg0 == 2 && field729 > 0) {
                field729--;
                var3 = (Packet) field732.method247();
            }
            if (var3 != null) {
                var3.field722 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet(field714);
        var5.field722 = 0;
        if (arg1 != 38) {
            throw new NullPointerException();
        }
        if (arg0 == 0) {
            var5.field721 = new byte[100];
        } else if (arg0 == 1) {
            var5.field721 = new byte[5000];
        } else {
            var5.field721 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 != -31767) {
            this.field720 = 425;
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        this.field721 = arg1;
        if (arg0 != -49365) {
            throw new NullPointerException();
        }
        this.field722 = 0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)V")
    public void method218(int arg0, int arg1) {
        if (arg1 < 0 || arg1 > 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field721[this.field722++] = (byte) (arg0 + this.field726.method295());
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field721[this.field722++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field721[this.field722++] = (byte) (arg0 >> 8);
        this.field721[this.field722++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BI)V")
    public void method221(byte arg0, int arg1) {
        this.field721[this.field722++] = (byte) arg1;
        this.field721[this.field722++] = (byte) (arg1 >> 8);
        if (arg0 != 37) {
            this.field719 = !this.field719;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field721[this.field722++] = (byte) (arg0 >> 16);
        this.field721[this.field722++] = (byte) (arg0 >> 8);
        this.field721[this.field722++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method223(int arg0) {
        this.field721[this.field722++] = (byte) (arg0 >> 24);
        this.field721[this.field722++] = (byte) (arg0 >> 16);
        this.field721[this.field722++] = (byte) (arg0 >> 8);
        this.field721[this.field722++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method224(int arg0, int arg1) {
        this.field721[this.field722++] = (byte) arg0;
        this.field721[this.field722++] = (byte) (arg0 >> 8);
        this.field721[this.field722++] = (byte) (arg0 >> 16);
        this.field721[this.field722++] = (byte) (arg0 >> 24);
        if (arg1 < 2 || arg1 > 2) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JI)V")
    public void method225(long arg0, int arg1) {
        this.field721[this.field722++] = (byte) (arg0 >> 56);
        this.field721[this.field722++] = (byte) (arg0 >> 48);
        this.field721[this.field722++] = (byte) (arg0 >> 40);
        this.field721[this.field722++] = (byte) (arg0 >> 32);
        int var4 = 69 / arg1;
        this.field721[this.field722++] = (byte) (arg0 >> 24);
        this.field721[this.field722++] = (byte) (arg0 >> 16);
        this.field721[this.field722++] = (byte) (arg0 >> 8);
        this.field721[this.field722++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method226(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field721, this.field722);
        this.field722 += arg0.length();
        this.field721[this.field722++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II[BI)V")
    public void method227(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 == 1) {
            for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
                this.field721[this.field722++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)V")
    public void method228(int arg0, int arg1) {
        if (arg1 == -486) {
            this.field721[this.field722 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method229() {
        return this.field721[this.field722++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method230() {
        return this.field721[this.field722++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method231() {
        this.field722 += 2;
        return ((this.field721[this.field722 - 2] & 0xFF) << 8) + (this.field721[this.field722 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method232() {
        this.field722 += 2;
        int var1 = ((this.field721[this.field722 - 2] & 0xFF) << 8) + (this.field721[this.field722 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method233() {
        this.field722 += 3;
        return (this.field721[this.field722 - 1] & 0xFF) + ((this.field721[this.field722 - 3] & 0xFF) << 16) + ((this.field721[this.field722 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method234() {
        this.field722 += 4;
        return (this.field721[this.field722 - 1] & 0xFF) + ((this.field721[this.field722 - 2] & 0xFF) << 8) + ((this.field721[this.field722 - 4] & 0xFF) << 24) + ((this.field721[this.field722 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)J")
    public long method235(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method234() & 0xFFFFFFFFL;
        long var4 = (long) this.method234() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method236() {
        int var1 = this.field722;
        while (this.field721[this.field722++] != 10) {
        }
        return new String(this.field721, var1, this.field722 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(Z)[B")
    public byte[] method237(boolean arg0) {
        int var2 = this.field722;
        while (this.field721[this.field722++] != 10) {
        }
        byte[] var3 = new byte[this.field722 - var2 - 1];
        if (!arg0) {
            this.field718 = !this.field718;
        }
        for (int var4 = var2; var4 < this.field722 - 1; var4++) {
            var3[var4 - var2] = this.field721[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[BII)V")
    public void method238(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 94 / arg3;
        for (int var6 = arg2; var6 < arg0 + arg2; var6++) {
            arg1[var6] = this.field721[this.field722++];
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B)V")
    public void method239(byte arg0) {
        this.field723 = this.field722 * 8;
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(IB)I")
    public int method240(int arg0, byte arg1) {
        int var3 = this.field723 >> 3;
        int var4 = 8 - (this.field723 & 0x7);
        int var5 = 0;
        if (this.field715 != arg1) {
            this.field717 = !this.field717;
        }
        this.field723 += arg0;
        while (arg0 > var4) {
            var5 += (this.field721[var3++] & field725[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field721[var3] & field725[var4]) + var5;
        } else {
            var6 = (this.field721[var3] >> var4 - arg0 & field725[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)V")
    public void method241(int arg0) {
        if (arg0 != -22602) {
            this.field716 = -19;
        }
        this.field722 = (this.field723 + 7) / 8;
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method242() {
        int var1 = this.field721[this.field722] & 0xFF;
        return var1 < 128 ? this.method229() - 64 : this.method231() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method243() {
        int var1 = this.field721[this.field722] & 0xFF;
        return var1 < 128 ? this.method229() : this.method231() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public void method244(BigInteger arg0, byte arg1, BigInteger arg2) {
        int var4 = this.field722;
        this.field722 = 0;
        byte[] var5 = new byte[var4];
        this.method238(var4, var5, 0, 36);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field722 = 0;
        if (arg1 == 7) {
            this.method219(var8.length);
            this.method227(0, 1, var8, var8.length);
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
            field724[var0] = var1;
        }
        field725 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field730 = new LinkList(464);
        field731 = new LinkList(464);
        field732 = new LinkList(464);
        field733 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
