import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class570 {

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field8115 = 0;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BILjava/lang/String;)V", line = 4)
    public static final void method3327(byte arg0, int arg1, String arg2) {
        field8112++;
        class541.method3185("", "", arg2, 0, arg1, 6642, "");
        if (arg0 < 36) {
            field8115 = 79;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[B)[B", line = 15)
    public static final byte[] method3328(int arg0, byte[] arg1) {
        field8114++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class622.method3597(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lha;B)V", line = 31)
    public static final void method3329(class58 arg0, byte arg1) {
        class478.field6826 = new class435[class417.field5862.length];
        field8113++;
        if (arg1 < 90) {
            return;
        }
        for (int var2 = 0; var2 < class417.field5862.length; var2++) {
            int var3 = class417.field5862[var2];
            class323 var4 = class251.method1709(class19.field244, 1, var3);
            class59 var5 = arg0.method632(var4, class55.method505(class571.field8117, var3), true);
            class478.field6826[var2] = new class435(var5, var4);
        }
    }
}
