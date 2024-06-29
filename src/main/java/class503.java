import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class503 {

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Z")
    private boolean field7216 = false;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field7221 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field7210 = 0;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "[Lfda;")
    public static class319[] field7212 = new class319[50];

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public int field7211;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field7213;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field7214;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field7215;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field7217;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field7219;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field7220;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field7226;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    private int field7227;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "J")
    public long field7218;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljba;")
    public static class398 field7209;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 6)
    public static void method2982(byte arg0) {
        field7209 = null;
        field7212 = null;
        if (arg0 != 103) {
            method2982((byte) -88);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I", line = 18)
    public static final int method2983(int arg0, int arg1, int arg2) {
        field7229++;
        int var3 = arg2 >>> 24;
        int var4 = 34 / ((arg1 - 34) / 47);
        int var5 = 255 - var3;
        int var6 = ((arg2 & 0xFF00) * var3 & 0xFF0000 | (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var6;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLee;)V", line = 36)
    public final void method2984(byte arg0, class675 arg1) {
        if (arg0 >= -13) {
            field7223 = -102;
        }
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                field7224++;
                return;
            }
            this.method2986((byte) 119, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V", line = 57)
    public final void method2985(byte arg0) {
        field7228++;
        this.field7213 = class164.field2252[this.field7227 << 3];
        long var2 = (long) this.field7219;
        long var4 = (long) this.field7215;
        long var6 = (long) this.field7226;
        this.field7220 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (this.field7217 == 0) {
            this.field7217 = 1;
        }
        if (this.field7222 == 0) {
            this.field7218 = 2147483647L;
        } else if (this.field7222 == 1) {
            this.field7218 = (this.field7220 * 8 / this.field7217);
            this.field7218 *= this.field7218;
        } else if (this.field7222 == 2) {
            this.field7218 = (this.field7220 * 8 / this.field7217);
        }
        if (this.field7216) {
            this.field7220 *= -1;
        }
        if (arg0 < 53) {
            this.field7219 = -27;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BILee;)V", line = 130)
    private final void method2986(byte arg0, int arg1, class675 arg2) {
        field7225++;
        if (arg1 == 1) {
            this.field7227 = arg2.method3757((byte) -65);
        } else if (arg1 == 2) {
            arg2.method3750((byte) 35);
        } else if (arg1 == 3) {
            this.field7219 = arg2.method3703(96);
            this.field7215 = arg2.method3703(103);
            this.field7226 = arg2.method3703(99);
        } else if (arg1 == 4) {
            this.field7222 = arg2.method3750((byte) 35);
            this.field7217 = arg2.method3703(122);
        } else if (arg1 == 6) {
            this.field7211 = arg2.method3750((byte) 35);
        } else if (arg1 == 8) {
            this.field7221 = 1;
        } else if (arg1 == 9) {
            this.field7210 = 1;
        } else if (arg1 == 10) {
            this.field7216 = true;
        }
        if (arg0 <= 83) {
            field7212 = null;
        }
    }
}
