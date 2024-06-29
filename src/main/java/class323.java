import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class323 extends class429 {

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    private int field4201;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    private int field4208;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field4204 = -2;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "[I")
    public static int[] field4207 = new int[1000];

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Lkfa;")
    public static class549 field4198 = new class549(2, 7);

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 6)
    public static void method1824(int arg0) {
        field4207 = null;
        if (arg0 == 2) {
            field4198 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method1825(int arg0, int arg1, int arg2) {
        ++field4199;
        if (arg1 != 16) {
            method1824(62);
        }
        return (arg0 & 16) != 0;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IBI)V", line = 34)
    public final void method57(int arg0, byte arg1, int arg2) {
        ++field4202;
        if (arg1 != -122) {
            method1825(-74, 58, 106);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB)V", line = 49)
    public final void method55(int arg0, int arg1, byte arg2) {
        ++field4196;
        int var4 = this.field4203 * arg0 >> 12;
        int var5 = this.field4197 * arg1 >> 12;
        int var6 = this.field4206 * arg0 >> 12;
        int var7 = this.field4195 * arg1 >> 12;
        if (arg2 < 108) {
            field4204 = -34;
        }
        int var8 = this.field4208 * arg0 >> 12;
        int var9 = this.field4205 * arg1 >> 12;
        int var10 = this.field4200 * arg0 >> 12;
        int var11 = this.field4201 * arg1 >> 12;
        class629.method3524(4, var4, var11, var5, var6, var10, var9, var7, var8, super.field5688);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(IBI)V", line = 76)
    public final void method54(int arg0, byte arg1, int arg2) {
        ++field4194;
        if (arg1 < 62) {
            this.field4208 = -36;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 89)
    public class323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4205 = arg5;
        this.field4195 = arg3;
        this.field4206 = arg2;
        this.field4203 = arg0;
        this.field4201 = arg7;
        this.field4197 = arg1;
        this.field4200 = arg6;
        this.field4208 = arg4;
    }
}
