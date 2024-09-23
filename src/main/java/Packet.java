import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "lb", name = "i", descriptor = "B")
    private byte field705 = 25;

    @OriginalMember(owner = "lb", name = "j", descriptor = "Z")
    private boolean field706 = true;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    private int field707 = -325;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    private int field708 = -31740;

    @OriginalMember(owner = "lb", name = "m", descriptor = "Z")
    private boolean field709 = false;

    @OriginalMember(owner = "lb", name = "n", descriptor = "I")
    private int field710 = 362;

    @OriginalMember(owner = "lb", name = "o", descriptor = "I")
    private int field711 = 49266;

    @OriginalMember(owner = "lb", name = "q", descriptor = "Z")
    private boolean field713 = false;

    @OriginalMember(owner = "lb", name = "r", descriptor = "Z")
    private boolean field714 = false;

    @OriginalMember(owner = "lb", name = "s", descriptor = "[B")
    public byte[] field715;

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "lb", name = "p", descriptor = "I")
    private static int field712 = 888;

    @OriginalMember(owner = "lb", name = "v", descriptor = "[I")
    private static int[] field718 = new int[256];

    @OriginalMember(owner = "lb", name = "w", descriptor = "[I")
    private static final int[] field719;

    @OriginalMember(owner = "lb", name = "B", descriptor = "Lob;")
    private static LinkList field724;

    @OriginalMember(owner = "lb", name = "C", descriptor = "Lob;")
    private static LinkList field725;

    @OriginalMember(owner = "lb", name = "D", descriptor = "Lob;")
    private static LinkList field726;

    @OriginalMember(owner = "lb", name = "E", descriptor = "[C")
    private static char[] field727;

    @OriginalMember(owner = "lb", name = "u", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    private static int field721;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    private static int field722;

    @OriginalMember(owner = "lb", name = "A", descriptor = "I")
    private static int field723;

    @OriginalMember(owner = "lb", name = "F", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "lb", name = "x", descriptor = "Lwb;")
    public Isaac field720;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(II)Llb;")
    public static Packet method217(int arg0, int arg1) {
        LinkList var2 = field725;
        synchronized (field725) {
            Packet var3 = null;
            if (arg1 == 0 && field721 > 0) {
                field721--;
                var3 = (Packet) field724.method247();
            } else if (arg1 == 1 && field722 > 0) {
                field722--;
                var3 = (Packet) field725.method247();
            } else if (arg1 == 2 && field723 > 0) {
                field723--;
                var3 = (Packet) field726.method247();
            }
            if (var3 != null) {
                var3.field716 = 0;
                return var3;
            }
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        Packet var5 = new Packet(-440);
        var5.field716 = 0;
        if (arg1 == 0) {
            var5.field715 = new byte[100];
        } else if (arg1 == 1) {
            var5.field715 = new byte[5000];
        } else {
            var5.field715 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(I)V")
    private Packet(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(Z[B)V")
    public Packet(boolean arg0, byte[] arg1) {
        if (arg0) {
            this.field713 = !this.field713;
        }
        this.field715 = arg1;
        this.field716 = 0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IB)V")
    public void method218(int arg0, byte arg1) {
        this.field715[this.field716++] = (byte) (arg0 + this.field720.method295());
        if (arg1 == 19) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I)V")
    public void method219(int arg0) {
        this.field715[this.field716++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(I)V")
    public void method220(int arg0) {
        this.field715[this.field716++] = (byte) (arg0 >> 8);
        this.field715[this.field716++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZ)V")
    public void method221(int arg0, boolean arg1) {
        this.field715[this.field716++] = (byte) arg0;
        this.field715[this.field716++] = (byte) (arg0 >> 8);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(I)V")
    public void method222(int arg0) {
        this.field715[this.field716++] = (byte) (arg0 >> 16);
        this.field715[this.field716++] = (byte) (arg0 >> 8);
        this.field715[this.field716++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "(I)V")
    public void method223(int arg0) {
        this.field715[this.field716++] = (byte) (arg0 >> 24);
        this.field715[this.field716++] = (byte) (arg0 >> 16);
        this.field715[this.field716++] = (byte) (arg0 >> 8);
        this.field715[this.field716++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(II)V")
    public void method224(int arg0, int arg1) {
        this.field715[this.field716++] = (byte) arg1;
        this.field715[this.field716++] = (byte) (arg1 >> 8);
        this.field715[this.field716++] = (byte) (arg1 >> 16);
        if (arg0 < 0) {
            this.field715[this.field716++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JI)V")
    public void method225(long arg0, int arg1) {
        this.field715[this.field716++] = (byte) (arg0 >> 56);
        this.field715[this.field716++] = (byte) (arg0 >> 48);
        this.field715[this.field716++] = (byte) (arg0 >> 40);
        this.field715[this.field716++] = (byte) (arg0 >> 32);
        if (arg1 != -40349) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field715[this.field716++] = (byte) (arg0 >> 24);
        this.field715[this.field716++] = (byte) (arg0 >> 16);
        this.field715[this.field716++] = (byte) (arg0 >> 8);
        this.field715[this.field716++] = (byte) arg0;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method226(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field715, this.field716);
        this.field716 += arg0.length();
        this.field715[this.field716++] = 10;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(I[BBI)V")
    public void method227(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 == 0) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = arg0; var7 < arg0 + arg3; var7++) {
            this.field715[this.field716++] = arg1[var7];
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(IB)V")
    public void method228(int arg0, byte arg1) {
        if (arg1 == 22) {
            this.field715[this.field716 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "()I")
    public int method229() {
        return this.field715[this.field716++] & 0xFF;
    }

    @OriginalMember(owner = "lb", name = "d", descriptor = "()B")
    public byte method230() {
        return this.field715[this.field716++];
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "()I")
    public int method231() {
        this.field716 += 2;
        return ((this.field715[this.field716 - 2] & 0xFF) << 8) + (this.field715[this.field716 - 1] & 0xFF);
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "()I")
    public int method232() {
        this.field716 += 2;
        int var1 = ((this.field715[this.field716 - 2] & 0xFF) << 8) + (this.field715[this.field716 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "lb", name = "g", descriptor = "()I")
    public int method233() {
        this.field716 += 3;
        return (this.field715[this.field716 - 1] & 0xFF) + ((this.field715[this.field716 - 3] & 0xFF) << 16) + ((this.field715[this.field716 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "lb", name = "h", descriptor = "()I")
    public int method234() {
        this.field716 += 4;
        return (this.field715[this.field716 - 1] & 0xFF) + ((this.field715[this.field716 - 2] & 0xFF) << 8) + ((this.field715[this.field716 - 4] & 0xFF) << 24) + ((this.field715[this.field716 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(B)J")
    public long method235(byte arg0) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        long var3 = (long) this.method234() & 0xFFFFFFFFL;
        long var5 = (long) this.method234() & 0xFFFFFFFFL;
        return (var3 << 32) + var5;
    }

    @OriginalMember(owner = "lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method236() {
        int var1 = this.field716;
        while (this.field715[this.field716++] != 10) {
        }
        return new String(this.field715, var1, this.field716 - var1 - 1);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)[B")
    public byte[] method237(boolean arg0) {
        int var2 = this.field716;
        while (this.field715[this.field716++] != 10) {
        }
        byte[] var3 = new byte[this.field716 - var2 - 1];
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var4 = var2; var4 < this.field716 - 1; var4++) {
            var3[var4 - var2] = this.field715[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(III[B)V")
    public void method238(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 == 0) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                arg3[var5] = this.field715[this.field716++];
            }
        }
    }

    @OriginalMember(owner = "lb", name = "e", descriptor = "(I)V")
    public void method239(int arg0) {
        if (arg0 != -35838) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field717 = this.field716 * 8;
    }

    @OriginalMember(owner = "lb", name = "c", descriptor = "(II)I")
    public int method240(int arg0, int arg1) {
        if (arg1 != 0) {
            return field712;
        }
        int var3 = this.field717 >> 3;
        int var4 = 8 - (this.field717 & 0x7);
        int var5 = 0;
        this.field717 += arg0;
        while (arg0 > var4) {
            var5 += (this.field715[var3++] & field719[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field715[var3] & field719[var4]) + var5;
        } else {
            var6 = (this.field715[var3] >> var4 - arg0 & field719[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "lb", name = "f", descriptor = "(I)V")
    public void method241(int arg0) {
        this.field716 = (this.field717 + 7) / 8;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "lb", name = "j", descriptor = "()I")
    public int method242() {
        int var1 = this.field715[this.field716] & 0xFF;
        return var1 < 128 ? this.method229() - 64 : this.method231() - 49152;
    }

    @OriginalMember(owner = "lb", name = "k", descriptor = "()I")
    public int method243() {
        int var1 = this.field715[this.field716] & 0xFF;
        return var1 < 128 ? this.method229() : this.method231() - 32768;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method244(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field716;
        this.field716 = 0;
        byte[] var5 = new byte[var4];
        this.method238(var4, 0, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        if (arg0 != 8) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        BigInteger var8 = var6.modPow(arg1, arg2);
        byte[] var9 = var8.toByteArray();
        this.field716 = 0;
        this.method219(var9.length);
        this.method227(0, var9, (byte) 0, var9.length);
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
            field718[var0] = var1;
        }
        field719 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field724 = new LinkList(field712);
        field725 = new LinkList(field712);
        field726 = new LinkList(field712);
        field727 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
