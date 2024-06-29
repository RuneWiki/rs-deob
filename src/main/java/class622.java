import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class622 extends class766 {

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public int field8785;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Ldq;")
    public class578 field8775;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "Z")
    public boolean field8782;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public int field8778;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field8777 = -1;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "[I")
    public static int[] field8776 = new int[8];

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "[Lida;")
    public static class678[] field8784 = new class678[4];

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "Z")
    public boolean field8779;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "Z")
    public boolean field8780;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Z")
    public boolean field8783;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static void method3561(byte arg0) {
        field8776 = null;
        if (arg0 > -71) {
            method3561((byte) -125);
        }
        field8784 = null;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILdq;IZ)V")
    public class622(int arg0, class578 arg1, int arg2, boolean arg3) {
        this.field8785 = arg2;
        this.field8775 = arg1;
        this.field8782 = arg3;
        this.field8778 = arg0;
    }
}
