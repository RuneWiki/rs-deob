import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public abstract class class354 extends class673 {

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "S")
    public short field4648;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "S")
    public short field4642;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public int field4647;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "S")
    public short field4639;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "B")
    public byte field4650;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "Z")
    public boolean field4649;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "S")
    public short field4645;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "B")
    public byte field4638;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Z")
    public static boolean field4637 = true;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "[B")
    public static byte[] field4640;

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "Lvw;")
    public static class274 field4652;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field4653;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
    public static int field4651;

    static {
        int var0 = 0;
        field4640 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4640[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4652 = new class274();
        field4653 = new String[100];
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method1956(int arg0, byte arg1, int arg2) {
        field4636++;
        if (arg1 >= -62) {
            field4640 = null;
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V", line = 15)
    public static void method1957(boolean arg0) {
        field4652 = null;
        if (!arg0) {
            method1959(-27, -49, 89);
        }
        field4653 = null;
        field4640 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIBI)I", line = 33)
    public static final int method1958(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        if (arg2 == -19) {
            field4651++;
            return (arg1 >> 5 << 7) + (((arg0 >> 2 & 0x3F) << 10) + (arg3 >> 1));
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V", line = 62)
    public void method1046(int arg0) {
        if (arg0 != -1) {
            this.field4650 = -7;
        }
        field4635++;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)Z", line = 73)
    public static final boolean method1959(int arg0, int arg1, int arg2) {
        if (arg0 == 759600449) {
            field4644++;
            return (method1956(arg2, (byte) -105, arg1) | class607.method3387(34, arg2, arg1) | class601.method3359(1, arg1, arg2)) & class113.method699(arg2, -72, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 116)
    public class354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field4648 = (short) arg6;
        this.field4641 = arg1;
        this.field4642 = (short) arg4;
        this.field4647 = arg3;
        this.field4639 = (short) arg7;
        this.field4650 = arg9;
        this.field4649 = arg8;
        this.field4645 = (short) arg5;
        this.field4646 = arg2;
        this.field4638 = (byte) arg0;
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)I")
    public abstract int method740(int arg0);
}
