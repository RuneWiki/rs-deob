import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class574 extends class388 {

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lut;")
    public class688 field8267;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public int field8269;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lsl;Z)Lnaa;")
    public static final class629 method3409(class479 arg0, boolean arg1) {
        field8270++;
        if (!arg1) {
            return null;
        }
        class390 var2 = class13.method67(0, arg0);
        int var3 = arg0.method2882(-1);
        int var4 = arg0.method2882(-1);
        int var5 = arg0.method2882(-1);
        int var6 = arg0.method2882(-1);
        int var7 = arg0.method2882(-1);
        int var8 = arg0.method2882(-1);
        return new class629(var2.field5625, var2.field5623, var2.field5620, var2.field5622, var2.field5617, var2.field5613, var2.field5614, var2.field5616, var2.field5624, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)Z")
    public abstract boolean method3116(byte arg0);

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method3121(int arg0);

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Luea;")
    public static final class241 method3410(int arg0) {
        if (arg0 != -14893) {
            field8268 = 86;
        }
        field8266++;
        if (class664.field9495 == null || class372.field5400 == null) {
            return null;
        }
        for (class241 var1 = (class241) class372.field5400.method3452(57); var1 != null; var1 = (class241) class372.field5400.method3452(46)) {
            class463 var2 = class664.field9482.method2687(var1.field3562, 36);
            if (var2 != null && var2.field6588 && var2.method2811(class664.field9484, (byte) 92)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lut;I)V")
    public class574(class688 arg0, int arg1) {
        this.field8267 = arg0;
        this.field8269 = arg1;
    }
}
