import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class688 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BZ)I", line = 5)
    public static final int method3878(byte arg0, boolean arg1) {
        field9808++;
        if (class523.field7103 == null) {
            return 0;
        } else if (arg1 || class558.field7522 == null) {
            int var2 = 0;
            if (arg0 <= 115) {
                return 18;
            }
            for (int var3 = 0; var3 < class523.field7103.length; var3++) {
                int var4 = class523.field7103[var3];
                if (class587.field8255.method3623(-101, var4)) {
                    var2++;
                }
                if (class417.field5891.method3623(-119, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class523.field7103.length * 2;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BI)V", line = 48)
    public static final void method3879(byte arg0, int arg1) {
        field9806++;
        class51 var2 = class703.method3938(-1989279584, arg1, 1);
        var2.method404(69);
        if (arg0 < -59) {
            ;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILin;)V", line = 65)
    public static final void method3880(int arg0, class78 arg1) {
        field9807++;
        class78 var2 = class474.method2673((byte) -61, arg1);
        if (arg0 != 12304) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class222.field3096;
            var4 = class340.field4553;
        } else {
            var4 = var2.field1050;
            var3 = var2.field1104;
        }
        class393.method2298(var4, -111, arg1, false, var3);
        class80.method626(-3159, var3, arg1, var4);
    }
}
