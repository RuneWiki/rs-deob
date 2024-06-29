import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class490 extends class503 {

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    private int field7047;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    private int field7044;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    private int field7048;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    private int field7041;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lgu;")
    public static class412 field7042 = new class412(8);

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field7043 = 0;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field7052 = 0;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[J")
    public static long[] field7045;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method2914(byte arg0) {
        field7045 = null;
        field7042 = null;
        if (arg0 < 18) {
            method2914((byte) 100);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V")
    public final void method748(int arg0, byte arg1, int arg2) {
        ++field7050;
        if (arg1 != 25) {
            field7046 = -119;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)V")
    public final void method747(int arg0, int arg1, byte arg2) {
        if (arg2 != 39) {
            this.method749(60, 71, -39);
        }
        ++field7049;
        int var4 = this.field7048 * arg1 >> 12;
        int var5 = this.field7044 * arg1 >> 12;
        int var6 = this.field7047 * arg0 >> 12;
        int var7 = this.field7041 * arg0 >> 12;
        class359.method2256(super.field7257, -1, super.field7259, var4, var6, var7, var5, super.field7261);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V")
    public final void method749(int arg0, int arg1, int arg2) {
        ++field7051;
        int var4 = this.field7048 * arg1 >> 12;
        int var5 = this.field7044 * arg1 >> 12;
        if (arg0 != -19475) {
            this.field7047 = -120;
        }
        int var6 = this.field7047 * arg2 >> 12;
        int var7 = this.field7041 * arg2 >> 12;
        class271.method1793(var6, var4, var5, super.field7257, var7, 5);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIII)V")
    public class490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7047 = arg1;
        this.field7044 = arg2;
        this.field7048 = arg0;
        this.field7041 = arg3;
    }
}
