import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class306 extends class425 {

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    private int field4543;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    private int field4532;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
    public static int[] field4542 = new int[32];

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZ)V")
    public static final void method2003(byte arg0, boolean arg1) {
        field4528++;
        if (class677.field9614.length() == 0) {
            return;
        }
        class686.method3857("--> " + class677.field9614, 97);
        class97.method917(arg1, class677.field9614, false, false);
        if (arg0 <= -42) {
            class10.field553 = 0;
            class677.field9614 = "";
            class316.field4654 = 0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Z")
    public final boolean method2004(int arg0, int arg1, int arg2) {
        field4536++;
        if (arg1 != 8470) {
            this.field4541 = 97;
        }
        return this.field4535 <= arg0 && this.field4527 >= arg0 && this.field4537 <= arg2 && arg2 <= this.field4531;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method2005(byte arg0) {
        field4542 = null;
        if (arg0 != 4) {
            field4542 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[III)V")
    public final void method2006(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = arg3 + this.field4534 - this.field4535;
        field4530++;
        arg1[2] = this.field4541 + arg0 - this.field4537;
        arg1[0] = this.field4529;
        if (arg2 != 12493) {
            method2009(44);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[I)V")
    public final void method2007(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = arg1 + this.field4537 - this.field4541;
        field4539++;
        arg3[1] = this.field4535 + arg2 - this.field4534;
        arg3[arg0] = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)Z")
    public final boolean method2008(int arg0, byte arg1, int arg2) {
        field4538++;
        if (arg1 < 22) {
            return true;
        } else {
            return arg2 >= this.field4534 && arg2 <= this.field4543 && arg0 >= this.field4541 && arg0 <= this.field4532;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)[Lkj;")
    public static final class527[] method2009(int arg0) {
        if (arg0 == 0) {
            field4540++;
            return new class527[] { class519.field7341, class11.field577, class70.field1473, class43.field1089, class14.field740, class5.field482, class532.field7457, class393.field5753, class5.field475, class373.field5550, class502.field7144, class666.field9548, class103.field1837, class305.field4520, class35.field1006 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZI)Z")
    public final boolean method2010(int arg0, int arg1, boolean arg2, int arg3) {
        field4533++;
        if (arg2) {
            return this.field4529 == arg1 && this.field4534 <= arg3 && this.field4543 >= arg3 && arg0 >= this.field4541 && arg0 <= this.field4532;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4543 = arg3;
        this.field4534 = arg1;
        this.field4535 = arg5;
        this.field4532 = arg4;
        this.field4541 = arg2;
        this.field4537 = arg6;
        this.field4527 = arg7;
        this.field4531 = arg8;
        this.field4529 = arg0;
    }
}
