import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "h", descriptor = "Z")
    private boolean field705 = true;

    @OriginalMember(owner = "lb", name = "i", descriptor = "Z")
    private boolean field706 = false;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    private int field707 = 3;

    @OriginalMember(owner = "lb", name = "k", descriptor = "Z")
    private boolean field708 = true;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field709 = -161;

    @OriginalMember(owner = "lb", name = "m", descriptor = "I")
    private int field710 = -161;

    @OriginalMember(owner = "lb", name = "n", descriptor = "Z")
    private boolean field711 = true;

    @OriginalMember(owner = "lb", name = "o", descriptor = "I")
    private int field712 = 320;

    @OriginalMember(owner = "lb", name = "p", descriptor = "Z")
    private boolean field713 = true;

    @OriginalMember(owner = "lb", name = "q", descriptor = "Z")
    private boolean field714 = false;

    @OriginalMember(owner = "lb", name = "s", descriptor = "[B")
    public byte[] field716;

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "lb", name = "r", descriptor = "I")
    private static int field715 = 663;

    @OriginalMember(owner = "lb", name = "v", descriptor = "[I")
    private static int[] field719 = new int[256];

    @OriginalMember(owner = "lb", name = "w", descriptor = "[I")
    private static final int[] field720;

    @OriginalMember(owner = "lb", name = "B", descriptor = "Lob;")
    private static LinkList field725;

    @OriginalMember(owner = "lb", name = "C", descriptor = "Lob;")
    private static LinkList field726;

    @OriginalMember(owner = "lb", name = "D", descriptor = "Lob;")
    private static LinkList field727;

    @OriginalMember(owner = "lb", name = "E", descriptor = "[C")
    private static char[] field728;

    @OriginalMember(owner = "lb", name = "u", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private static int field722;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private static int field723;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private static int field724;

    @OriginalMember(owner = "lb", name = "F", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "lb", name = "x", descriptor = "Lwb;")
    public Isaac field721;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZ)Llb;")
    public static Packet method217(int arg0, boolean arg1) {
        LinkList var2 = field726;
        synchronized (field726) {
            Packet var3 = null;
            if (arg0 == 0 && field722 > 0) {
                field722--;
                var3 = (Packet) field725.method247();
            } else if (arg0 == 1 && field723 > 0) {
                field723--;
                var3 = (Packet) field726.method247();
            } else if (arg0 == 2 && field724 > 0) {
                field724--;
                var3 = (Packet) field727.method247();
            }
            if (var3 != null) {
                var3.field717 = 0;
                return var3;
            }
        }
        if (arg1) {
            field715 = -68;
        }
        Packet var5 = new Packet(true);
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

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(Z)V")
    private Packet(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        this.field716 = arg0;
        if (arg1 != -26728) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field717 = 0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZI)V")
    public void method218(boolean arg0, int arg1) {
        this.field716[this.field717++] = (byte) (arg1 + this.field721.method295());
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field716[this.field717++] = (byte) (arg0 >> 8);
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)V")
    public void method221(int arg0, int arg1) {
        this.field716[this.field717++] = (byte) arg0;
        if (arg1 != 0) {
            field715 = -12;
        }
        this.field716[this.field717++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field716[this.field717++] = (byte) (arg0 >> 16);
        this.field716[this.field717++] = (byte) (arg0 >> 8);
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method223(int arg0) {
        this.field716[this.field717++] = (byte) (arg0 >> 24);
        this.field716[this.field717++] = (byte) (arg0 >> 16);
        this.field716[this.field717++] = (byte) (arg0 >> 8);
        this.field716[this.field717++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(BI)V")
    public void method224(byte arg0, int arg1) {
        this.field716[this.field717++] = (byte) arg1;
        this.field716[this.field717++] = (byte) (arg1 >> 8);
        this.field716[this.field717++] = (byte) (arg1 >> 16);
        if (arg0 == 5) {
            this.field716[this.field717++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IJ)V")
    public void method225(int arg0, long arg1) {
        this.field716[this.field717++] = (byte) (arg1 >> 56);
        this.field716[this.field717++] = (byte) (arg1 >> 48);
        this.field716[this.field717++] = (byte) (arg1 >> 40);
        if (arg0 != -13398) {
            this.field705 = !this.field705;
        }
        this.field716[this.field717++] = (byte) (arg1 >> 32);
        this.field716[this.field717++] = (byte) (arg1 >> 24);
        this.field716[this.field717++] = (byte) (arg1 >> 16);
        this.field716[this.field717++] = (byte) (arg1 >> 8);
        this.field716[this.field717++] = (byte) arg1;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method226(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field716, this.field717);
        this.field717 += arg0.length();
        this.field716[this.field717++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II[BI)V")
    public void method227(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 0) {
            this.field705 = !this.field705;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            this.field716[this.field717++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method228(int arg0, int arg1) {
        this.field716[this.field717 - arg1 - 1] = (byte) arg1;
        if (arg0 != -28191) {
            this.field706 = !this.field706;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method229() {
        return this.field716[this.field717++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method230() {
        return this.field716[this.field717++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method231() {
        this.field717 += 2;
        return ((this.field716[this.field717 - 2] & 0xFF) << 8) + (this.field716[this.field717 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method232() {
        this.field717 += 2;
        int var1 = ((this.field716[this.field717 - 2] & 0xFF) << 8) + (this.field716[this.field717 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method233() {
        this.field717 += 3;
        return (this.field716[this.field717 - 1] & 0xFF) + ((this.field716[this.field717 - 3] & 0xFF) << 16) + ((this.field716[this.field717 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method234() {
        this.field717 += 4;
        return (this.field716[this.field717 - 1] & 0xFF) + ((this.field716[this.field717 - 2] & 0xFF) << 8) + ((this.field716[this.field717 - 4] & 0xFF) << 24) + ((this.field716[this.field717 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)J")
    public long method235(int arg0) {
        long var2 = (long) this.method234() & 0xFFFFFFFFL;
        long var4 = (long) this.method234() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method236() {
        int var1 = this.field717;
        while (this.field716[this.field717++] != 10) {
        }
        return new String(this.field716, var1, this.field717 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B)[B")
    public byte[] method237(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field717;
        while (this.field716[this.field717++] != 10) {
        }
        byte[] var5 = new byte[this.field717 - var4 - 1];
        for (int var6 = var4; var6 < this.field717 - 1; var6++) {
            var5[var6 - var4] = this.field716[var6];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II[BB)V")
    public void method238(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 == 121) {
            for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
                arg2[var5] = this.field716[this.field717++];
            }
        }
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(I)V")
    public void method239(int arg0) {
        this.field718 = this.field717 * 8;
        if (arg0 != 0) {
            this.field706 = !this.field706;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)I")
    public int method240(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field705 = !this.field705;
        }
        int var3 = this.field718 >> 3;
        int var4 = 8 - (this.field718 & 0x7);
        int var5 = 0;
        this.field718 += arg1;
        while (arg1 > var4) {
            var5 += (this.field716[var3++] & field720[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field716[var3] & field720[var4]) + var5;
        } else {
            var6 = (this.field716[var3] >> var4 - arg1 & field720[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "(I)V")
    public void method241(int arg0) {
        this.field717 = (this.field718 + 7) / 8;
        int var2 = 74 / arg0;
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method242() {
        int var1 = this.field716[this.field717] & 0xFF;
        return var1 < 128 ? this.method229() - 64 : this.method231() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method243() {
        int var1 = this.field716[this.field717] & 0xFF;
        return var1 < 128 ? this.method229() : this.method231() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method244(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field717;
        this.field717 = 0;
        byte[] var5 = new byte[var4];
        this.method238(var4, 0, var5, (byte) 121);
        BigInteger var6 = new BigInteger(var5);
        if (arg0 < 0 || arg0 > 0) {
            return;
        }
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field717 = 0;
        this.method219(var8.length);
        this.method227(0, var8.length, var8, 0);
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
        field725 = new LinkList(6);
        field726 = new LinkList(6);
        field727 = new LinkList(6);
        field728 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
