import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class54 extends class362 {

    @OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!gda", name = "v", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!gda", name = "x", descriptor = "Z")
    public boolean field1109;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "Lsia;")
    public static class732 field1103 = new class732();

    @OriginalMember(owner = "client!gda", name = "y", descriptor = "J")
    public static long field1110 = -1L;

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!gda", name = "t", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "Lrh;")
    public static class267 field1102;

    @OriginalMember(owner = "client!gda", name = "A", descriptor = "Liba;")
    public static class529 field1112;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)V")
    public static final void method603(int arg0, byte arg1) {
        field1100++;
        if (!class722.method4007(arg0, (byte) 84) || arg1 <= 105) {
            return;
        }
        class378[] var2 = class396.field5798[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class378 var4 = var2[var3];
            if (var4 != null) {
                var4.field5471 = 0;
                var4.field5406 = 1;
                var4.field5517 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method604(int arg0) {
        field1102 = null;
        field1103 = null;
        if (arg0 == 0) {
            field1112 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIIIIZ)V")
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1106 = arg3;
        this.field1104 = arg2;
        this.field1107 = arg1;
        this.field1109 = arg5;
        this.field1101 = arg4;
        this.field1108 = arg0;
    }
}
