import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class372 extends class333 {

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "[B")
    public byte[] field5074;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lsb;")
    public static class305 field5071 = new class305(78, -1);

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public static int field5073 = 999999;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "Lgk;")
    public static class616 field5072 = new class616();

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "[I")
    public static int[] field5075 = new int[2];

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2164(int arg0, int arg1, int arg2) {
        field5070++;
        if (arg2 != 0) {
            method2165(-119, 31, -121, -52, 116, 33, 105, 69, 19, 81);
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIIII)V", line = 14)
    public static final void method2165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5068++;
        if (arg4 < 512 || arg7 < 512 || arg4 > (class142.field1574 - 2) * 512 || arg7 > (class140.field1550 * 512 - 1024)) {
            class703.field9873[0] = class703.field9873[1] = -1;
            return;
        }
        int var10 = class593.method3335(arg7, arg1, 27648, arg4) - arg8;
        class499.field7213.method30(arg9, 0, 0);
        class701.field9813.method992(class499.field7213);
        class701.field9813.method1019(arg4, var10, arg7, class703.field9873);
        class499.field7213.method30(-arg9, 0, 0);
        class701.field9813.method992(class499.field7213);
        if (arg2 >= -94) {
            method2167((byte) 124);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V", line = 45)
    public static void method2166(int arg0) {
        field5071 = null;
        field5075 = null;
        field5072 = null;
        if (arg0 != 0) {
            field5075 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V", line = 60)
    public static final void method2167(byte arg0) {
        class285.field3550.method88(67);
        int var1 = 57 / ((-arg0 - 75) / 38);
        field5069++;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "([B)V", line = 80)
    public class372(byte[] arg0) {
        this.field5074 = arg0;
    }
}
