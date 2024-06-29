import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class16 extends class352 {

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "[I")
    public static int[] field254 = new int[1000];

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "[I")
    public static int[] field255 = new int[13];

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "Lcm;")
    public static class449 field259 = new class449(13, 5);

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "F")
    public static float field265;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)V")
    public final void method132(int arg0, byte arg1, int arg2) {
        ++field256;
        if (arg1 <= -43) {
            int var4 = this.field261 * arg0 >> 12;
            int var5 = this.field258 * arg0 >> 12;
            int var6 = this.field253 * arg2 >> 12;
            int var7 = this.field263 * arg2 >> 12;
            class422.method2543(var7, var4, var6, var5, -1, super.field5452);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public static final void method133(byte arg0) {
        int var1 = -70 % ((arg0 - 23) / 52);
        ++field260;
        class509.field7563 = new class306();
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIII)V")
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field253 = arg1;
        this.field263 = arg3;
        this.field258 = arg2;
        this.field261 = arg0;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public static void method134(int arg0) {
        field254 = null;
        field259 = null;
        if (arg0 == -10950) {
            field255 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Z")
    public static final boolean method135(int arg0) {
        ++field262;
        return arg0 != -8337 ? false : class181.field2582;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)V")
    public final void method136(int arg0, int arg1, int arg2) {
        ++field264;
        if (arg0 == 1244456711) {
            int var4 = this.field261 * arg1 >> 12;
            int var5 = this.field258 * arg1 >> 12;
            int var6 = this.field253 * arg2 >> 12;
            int var7 = this.field263 * arg2 >> 12;
            class112.method736(super.field5453, var7, super.field5451, (byte) 77, var6, var5, var4);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
    public final void method137(int arg0, int arg1, int arg2) {
        ++field257;
        int var4 = this.field261 * arg2 >> 12;
        if (arg1 != -2) {
            this.method137(30, -104, 67);
        }
        int var5 = this.field258 * arg2 >> 12;
        int var6 = this.field253 * arg0 >> 12;
        int var7 = this.field263 * arg0 >> 12;
        class27.method206(var6, var4, super.field5453, var5, super.field5451, super.field5452, true, var7);
    }
}
