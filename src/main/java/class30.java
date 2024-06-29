import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class30 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
    public static boolean field375 = false;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field373 = new String[200];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[Lbd;")
    public static class20[] field371;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 14)
    public static void method226(byte arg0) {
        if (arg0 > -57) {
            method226((byte) -101);
        }
        field373 = null;
        field371 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)I", line = 42)
    public static final int method229(int arg0, int arg1, int arg2, int arg3) {
        field377++;
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        if (arg3 != 4138) {
            field371 = (class20[]) null;
        }
        return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V", line = 67)
    public class30(int arg0, int arg1, int arg2) {
        this.field370 = arg1;
        this.field369 = arg0;
        this.field376 = arg2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public abstract void method225(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public abstract void method227(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
    public abstract void method228(int arg0, int arg1, byte arg2);
}
