import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class9 extends class180 {

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Z")
    public boolean field177;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "Lcs;")
    public static class351 field179 = new class351(41, 4);

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "Lfn;")
    public static class52 field182 = new class52(58, 10);

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "Z")
    public static boolean field185 = false;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "Lmq;")
    public static class104 field184 = new class104(50);

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Lpc;")
    public static class141 field186;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
    public static void method97(int arg0) {
        field182 = null;
        field184 = null;
        field186 = null;
        if (arg0 != 41) {
            method97(-98);
        }
        field179 = null;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIIZ)V")
    public class9(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field181 = arg1;
        this.field177 = arg5;
        this.field180 = arg3;
        this.field176 = arg2;
        this.field175 = arg4;
        this.field178 = arg0;
    }
}
