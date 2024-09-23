import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    private int field723 = -307;

    @OriginalMember(owner = "mb", name = "j", descriptor = "Z")
    private boolean field724 = true;

    @OriginalMember(owner = "mb", name = "k", descriptor = "Z")
    private boolean field725 = false;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    private int field726 = 1;

    @OriginalMember(owner = "mb", name = "m", descriptor = "Z")
    private boolean field727 = true;

    @OriginalMember(owner = "mb", name = "n", descriptor = "I")
    private int field728 = -911;

    @OriginalMember(owner = "mb", name = "o", descriptor = "I")
    private int field729 = 593;

    @OriginalMember(owner = "mb", name = "p", descriptor = "I")
    private int field730 = 868;

    @OriginalMember(owner = "mb", name = "r", descriptor = "Z")
    private boolean field732 = true;

    @OriginalMember(owner = "mb", name = "s", descriptor = "I")
    private int field733 = 17979;

    @OriginalMember(owner = "mb", name = "t", descriptor = "Z")
    private boolean field734 = true;

    @OriginalMember(owner = "mb", name = "G", descriptor = "[C")
    private char[] field747 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

    @OriginalMember(owner = "mb", name = "u", descriptor = "[B")
    public byte[] field735;

    @OriginalMember(owner = "mb", name = "v", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "mb", name = "q", descriptor = "Z")
    private static boolean field731 = true;

    @OriginalMember(owner = "mb", name = "x", descriptor = "[I")
    private static int[] field738 = new int[256];

    @OriginalMember(owner = "mb", name = "y", descriptor = "[I")
    private static final int[] field739;

    @OriginalMember(owner = "mb", name = "D", descriptor = "Lpb;")
    private static LinkList field744;

    @OriginalMember(owner = "mb", name = "E", descriptor = "Lpb;")
    private static LinkList field745;

    @OriginalMember(owner = "mb", name = "F", descriptor = "Lpb;")
    private static LinkList field746;

    @OriginalMember(owner = "mb", name = "w", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "mb", name = "A", descriptor = "I")
    private static int field741;

    @OriginalMember(owner = "mb", name = "B", descriptor = "I")
    private static int field742;

    @OriginalMember(owner = "mb", name = "C", descriptor = "I")
    private static int field743;

    @OriginalMember(owner = "mb", name = "H", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "mb", name = "z", descriptor = "Lxb;")
    public Isaac field740;

    @OriginalMember(owner = "mb", name = "a", descriptor = "(II)Lmb;")
    public static Packet method226(int arg0, int arg1) {
        LinkList var2 = field745;
        synchronized (field745) {
            Packet var3 = null;
            if (arg1 == 0 && field741 > 0) {
                field741--;
                var3 = (Packet) field744.method257();
            } else if (arg1 == 1 && field742 > 0) {
                field742--;
                var3 = (Packet) field745.method257();
            } else if (arg1 == 2 && field743 > 0) {
                field743--;
                var3 = (Packet) field746.method257();
            }
            if (var3 != null) {
                var3.field736 = 0;
                return var3;
            }
        }
        Packet var5 = new Packet((byte) 2);
        var5.field736 = 0;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        if (arg1 == 0) {
            var5.field735 = new byte[100];
        } else if (arg1 == 1) {
            var5.field735 = new byte[5000];
        } else {
            var5.field735 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(B)V")
    public void method227(byte arg0) {
        if (arg0 != 1) {
            this.field730 = -376;
        }
        LinkList var2 = field745;
        synchronized (field745) {
            this.field736 = 0;
            if (this.field735.length == 100 && field741 < 1000) {
                field744.method255(this);
                field741++;
            } else if (this.field735.length == 5000 && field742 < 250) {
                field745.method255(this);
                field742++;
            } else if (this.field735.length == 30000 && field743 < 50) {
                field746.method255(this);
                field743++;
            }
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(B)V")
    private Packet(byte arg0) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "(I[B)V")
    public Packet(int arg0, byte[] arg1) {
        this.field735 = arg1;
        this.field736 = 0;
        if (arg0 != 45427) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(II)V")
    public void method228(int arg0, int arg1) {
        if (arg1 == 0) {
            this.field735[this.field736++] = (byte) (arg0 + this.field740.method305());
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public void method229(int arg0) {
        this.field735[this.field736++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public void method230(int arg0) {
        this.field735[this.field736++] = (byte) (arg0 >> 8);
        this.field735[this.field736++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(II)V")
    public void method231(int arg0, int arg1) {
        this.field735[this.field736++] = (byte) arg0;
        if (arg1 == 0) {
            this.field735[this.field736++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(I)V")
    public void method232(int arg0) {
        this.field735[this.field736++] = (byte) (arg0 >> 16);
        this.field735[this.field736++] = (byte) (arg0 >> 8);
        this.field735[this.field736++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(I)V")
    public void method233(int arg0) {
        this.field735[this.field736++] = (byte) (arg0 >> 24);
        this.field735[this.field736++] = (byte) (arg0 >> 16);
        this.field735[this.field736++] = (byte) (arg0 >> 8);
        this.field735[this.field736++] = (byte) arg0;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "(II)V")
    public void method234(int arg0, int arg1) {
        this.field735[this.field736++] = (byte) arg0;
        this.field735[this.field736++] = (byte) (arg0 >> 8);
        this.field735[this.field736++] = (byte) (arg0 >> 16);
        if (arg1 != 1) {
            this.field729 = -126;
        }
        this.field735[this.field736++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(JI)V")
    public void method235(long arg0, int arg1) {
        this.field735[this.field736++] = (byte) (arg0 >> 56);
        if (arg1 != 0) {
            this.field732 = !this.field732;
        }
        this.field735[this.field736++] = (byte) (arg0 >> 48);
        this.field735[this.field736++] = (byte) (arg0 >> 40);
        this.field735[this.field736++] = (byte) (arg0 >> 32);
        this.field735[this.field736++] = (byte) (arg0 >> 24);
        this.field735[this.field736++] = (byte) (arg0 >> 16);
        this.field735[this.field736++] = (byte) (arg0 >> 8);
        this.field735[this.field736++] = (byte) arg0;
        if (Linkable.field393) {
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method236(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field735, this.field736);
        this.field736 += arg0.length();
        this.field735[this.field736++] = 10;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "([BIII)V")
    public void method237(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            this.field729 = -299;
        }
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            this.field735[this.field736++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(II)V")
    public void method238(int arg0, int arg1) {
        this.field735[this.field736 - arg0 - 1] = (byte) arg0;
        int var3 = 35 / arg1;
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "()I")
    public int method239() {
        return this.field735[this.field736++] & 0xFF;
    }

    @OriginalMember(owner = "mb", name = "d", descriptor = "()B")
    public byte method240() {
        return this.field735[this.field736++];
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "()I")
    public int method241() {
        this.field736 += 2;
        return ((this.field735[this.field736 - 2] & 0xFF) << 8) + (this.field735[this.field736 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "()I")
    public int method242() {
        this.field736 += 2;
        int var1 = ((this.field735[this.field736 - 2] & 0xFF) << 8) + (this.field735[this.field736 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "()I")
    public int method243() {
        this.field736 += 3;
        return (this.field735[this.field736 - 1] & 0xFF) + ((this.field735[this.field736 - 3] & 0xFF) << 16) + ((this.field735[this.field736 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mb", name = "h", descriptor = "()I")
    public int method244() {
        this.field736 += 4;
        return (this.field735[this.field736 - 1] & 0xFF) + ((this.field735[this.field736 - 2] & 0xFF) << 8) + ((this.field735[this.field736 - 4] & 0xFF) << 24) + ((this.field735[this.field736 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mb", name = "e", descriptor = "(I)J")
    public long method245(int arg0) {
        long var2 = (long) this.method244() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            this.field734 = !this.field734;
        }
        long var4 = (long) this.method244() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "mb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method246() {
        int var1 = this.field736;
        while (this.field735[this.field736++] != 10) {
        }
        return new String(this.field735, var1, this.field736 - var1 - 1);
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(Z)[B")
    public byte[] method247(boolean arg0) {
        int var2 = this.field736;
        if (!arg0) {
            throw new NullPointerException();
        }
        while (this.field735[this.field736++] != 10) {
        }
        byte[] var3 = new byte[this.field736 - var2 - 1];
        for (int var4 = var2; var4 < this.field736 - 1; var4++) {
            var3[var4 - var2] = this.field735[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I[BII)V")
    public void method248(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 15021) {
            this.field729 = -381;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg1[var5] = this.field735[this.field736++];
        }
    }

    @OriginalMember(owner = "mb", name = "f", descriptor = "(I)V")
    public void method249(int arg0) {
        if (arg0 != 9) {
            this.field729 = -154;
        }
        this.field737 = this.field736 * 8;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(ZI)I")
    public int method250(boolean arg0, int arg1) {
        if (arg0) {
            this.field733 = 444;
        }
        int var3 = this.field737 >> 3;
        int var4 = 8 - (this.field737 & 0x7);
        int var5 = 0;
        this.field737 += arg1;
        while (arg1 > var4) {
            var5 += (this.field735[var3++] & field739[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field735[var3] & field739[var4]) + var5;
        } else {
            var6 = (this.field735[var3] >> var4 - arg1 & field739[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "mb", name = "g", descriptor = "(I)V")
    public void method251(int arg0) {
        if (this.field726 != arg0) {
            this.field725 = !this.field725;
        }
        this.field736 = (this.field737 + 7) / 8;
    }

    @OriginalMember(owner = "mb", name = "j", descriptor = "()I")
    public int method252() {
        int var1 = this.field735[this.field736] & 0xFF;
        return var1 < 128 ? this.method239() - 64 : this.method241() - 49152;
    }

    @OriginalMember(owner = "mb", name = "k", descriptor = "()I")
    public int method253() {
        int var1 = this.field735[this.field736] & 0xFF;
        return var1 < 128 ? this.method239() : this.method241() - 32768;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method254(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field736;
        this.field736 = 0;
        byte[] var5 = new byte[var4];
        this.method248(0, var5, var4, 15021);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        if (arg0 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field736 = 0;
        this.method229(var8.length);
        this.method237(var8, 0, var8.length, 568);
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
            field738[var0] = var1;
        }
        field739 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field744 = new LinkList(field731);
        field745 = new LinkList(field731);
        field746 = new LinkList(field731);
    }
}
