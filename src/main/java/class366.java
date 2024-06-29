import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class366 extends class328 {

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    private int field5291;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    private int field5287;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    private int field5298;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    private int field5296;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    private int field5293;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    private int field5288;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    private int field5299;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    private int field5297;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "Lvq;")
    public static class24 field5294 = new class24(9, 8);

    @OriginalMember(owner = "client!it", name = "C", descriptor = "Lvq;")
    public static class24 field5300 = new class24(70, -1);

    @OriginalMember(owner = "client!it", name = "D", descriptor = "Lbn;")
    public static class160 field5301 = new class160(5, 8);

    @OriginalMember(owner = "client!it", name = "E", descriptor = "I")
    public static int field5302 = 503;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5291 = arg6;
        this.field5287 = arg5;
        this.field5298 = arg2;
        this.field5296 = arg3;
        this.field5293 = arg1;
        this.field5288 = arg4;
        this.field5299 = arg7;
        this.field5297 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public final void method325(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            ++field5290;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public static void method2334(int arg0) {
        field5300 = null;
        if (arg0 == -38688852) {
            field5301 = null;
            field5294 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BII)V")
    public final void method328(byte arg0, int arg1, int arg2) {
        ++field5292;
        if (arg0 != 20) {
            this.method328((byte) 120, -44, 70);
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(III)V")
    public final void method330(int arg0, int arg1, int arg2) {
        ++field5295;
        int var4 = this.field5297 * arg1 >> 12;
        int var5 = this.field5293 * arg0 >> 12;
        int var6 = this.field5298 * arg1 >> 12;
        int var7 = this.field5296 * arg0 >> 12;
        int var8 = this.field5288 * arg1 >> 12;
        if (arg2 == 0) {
            int var9 = this.field5287 * arg0 >> 12;
            int var10 = this.field5291 * arg1 >> 12;
            int var11 = this.field5299 * arg0 >> 12;
            class135.method901(false, super.field4884, var6, var11, var8, var9, var4, var5, var7, var10);
        }
    }
}
