import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class465 implements class759 {

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Ljava/lang/String;")
    private String field6511;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Loh;")
    public static class425 field6513 = new class425("", 19);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Z")
    private boolean field6514;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I", line = 5)
    public final int method230(int arg0) {
        field6507++;
        int var2 = class27.method263(this.field6511, -112);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        this.field6514 = true;
        if (arg0 != -6635) {
            this.field6511 = null;
        }
        return 100;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Lsg;", line = 23)
    public final class418 method231(int arg0) {
        if (arg0 == -27990) {
            field6508++;
            return class418.field5452;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)Z", line = 34)
    public final boolean method2790(int arg0) {
        if (arg0 >= -83) {
            return true;
        } else {
            field6509++;
            return this.field6514;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLha;Lkq;)V", line = 46)
    public static final void method2791(boolean arg0, class66 arg1, class620 arg2) {
        field6510++;
        boolean var3 = class121.field1555.method2879(arg1, arg2.field8499, arg2.field8480 | 0xFF000000, arg2.field8463, arg2.field8502, arg2.field8476 ? class300.field3596.field7387 : null, arg2.field8438, (byte) 127) == null;
        if (arg0 && var3) {
            class718.field10089.method2732(new class514(arg2.field8438, arg2.field8499, arg2.field8463, arg2.field8480 | 0xFF000000, arg2.field8502, arg2.field8476), 21939);
            class576.method3330(arg2, -1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V", line = 66)
    public static void method2792(int arg0) {
        field6513 = null;
        if (arg0 > -36) {
            method2791(false, null, null);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 78)
    public class465(String arg0) {
        this.field6511 = arg0;
    }
}
