import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class72 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lfp;")
    private class323 field963;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Z", line = 7)
    public static final boolean method593(byte arg0) {
        field962++;
        class361 var1 = (class361) class103.field1219.method2765(arg0 - 12146);
        if (var1 == null) {
            return false;
        }
        if (arg0 != -115) {
            field961 = 64;
        }
        for (int var2 = 0; var2 < var1.field5119; var2++) {
            if (var1.field5118[var2] != null && var1.field5118[var2].field3310 == 0) {
                return false;
            }
            if (var1.field5121[var2] != null && var1.field5121[var2].field3310 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 58)
    public class72(class326 arg0, int arg1, class323 arg2) {
        new class714(64);
        this.field963 = arg2;
        this.field964 = this.field963.method2084(15, 0);
    }
}
