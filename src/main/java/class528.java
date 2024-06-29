import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class528 extends class297 {

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "Luh;")
    public static class168 field7301 = new class168();

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "Ld;")
    public static class152 field7303;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "Lbca;")
    public static class661 field7304;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)[I", line = 6)
    public final int[] method15(int arg0, int arg1) {
        ++field7305;
        if (arg1 != 255) {
            field7301 = null;
        }
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            class363.method2321(var3, 0, class525.field7275, class620.field8445[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 33)
    public static void method3054(byte arg0) {
        if (arg0 > -32) {
            method3055(-76, 25, -12);
        }
        field7304 = null;
        field7301 = null;
        field7303 = null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 46)
    public class528() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(III)V", line = 55)
    public static final void method3055(int arg0, int arg1, int arg2) {
        class384 var3 = class649.field8928[arg0][arg1][arg2];
        if (var3 != null) {
            class468.method2749(var3.field5577);
            class468.method2749(var3.field5574);
            if (var3.field5577 != null) {
                var3.field5577 = null;
            }
            if (var3.field5574 != null) {
                var3.field5574 = null;
            }
        }
    }
}
