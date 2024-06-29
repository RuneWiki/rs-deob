import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class292 extends class237 {

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    private int field4590;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    private int field4591;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field4593 = 20;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field4589 = 0;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field4605 = 0;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    private int field4596;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    private int field4604;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "[B")
    private byte[] field4594;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 4)
    public final void method1643(byte arg0) {
        if (arg0 != 12) {
            this.method2083(-83, (byte) 67);
        }
        this.field4596 = 0;
        field4592++;
        this.field4604 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)Z", line = 17)
    public static final boolean method2080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class231.field3495[arg0][var8][var9] == -class262.field4160) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class72.field902[arg0][arg1][arg3] + arg5;
            if (!class186.method1282(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class186.method1282(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class186.method1282(var10, var12, var14)) {
                return false;
            } else if (class186.method1282(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class355.method2451(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class186.method1282(var6 + 1, class72.field902[arg0][arg1][arg3] + arg5, var7 + 1) && class186.method1282(var6 + 128 - 1, class72.field902[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class186.method1282(var6 + 128 - 1, class72.field902[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class186.method1282(var6 + 1, class72.field902[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V", line = 80)
    public final void method1641(byte arg0, int arg1, int arg2) {
        field4587++;
        if (arg0 > -19) {
            return;
        }
        if (arg2 == 0) {
            this.field4606 = this.field4590 - (arg1 >= 0 ? arg1 : -arg1);
            this.field4606 = this.field4606 * this.field4606 >> 12;
            this.field4604 = this.field4606;
            this.field4603 = 4096;
            return;
        }
        this.field4603 = this.field4606 * this.field4602 >> 12;
        this.field4606 = this.field4590 - (arg1 >= 0 ? arg1 : -arg1);
        if (this.field4603 < 0) {
            this.field4603 = 0;
        } else if (this.field4603 > 4096) {
            this.field4603 = 4096;
        }
        this.field4606 = this.field4606 * this.field4606 >> 12;
        this.field4606 = this.field4606 * this.field4603 >> 12;
        this.field4604 += this.field4606 * this.field4591 >> 12;
        this.field4591 = this.field4595 * this.field4591 >> 12;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 115)
    public final void method1637(int arg0) {
        if (arg0 > -124) {
            return;
        }
        this.field4604 >>= 0x4;
        if (this.field4604 < 0) {
            this.field4604 = 0;
        } else if (this.field4604 > 255) {
            this.field4604 = 255;
        }
        field4598++;
        this.field4591 = this.field4595;
        this.method2083(this.field4596++, (byte) this.field4604);
        this.field4604 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZLnk;)Lpa;", line = 138)
    public static final class2 method2081(int arg0, boolean arg1, class16 arg2) {
        field4597++;
        if (class313.method2208(arg2, (byte) -92, arg0)) {
            return arg1 ? class17.method129(-125) : (class2) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIFFF)V", line = 166)
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4590 = (int) (arg6 * 4096.0F);
        this.field4602 = (int) (arg7 * 4096.0F);
        this.field4591 = this.field4595 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V", line = 185)
    public static final void method2082(int arg0, byte arg1) {
        field4588++;
        class279 var2 = class147.method1085(arg0, -19443, 7);
        if (arg1 == 35) {
            var2.method1996(true);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)V", line = 198)
    public void method2083(int arg0, byte arg1) {
        this.field4594[arg0] = arg1;
        field4599++;
    }
}
