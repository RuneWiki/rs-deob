import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class451 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "F")
    public static float field6366 = 0.0F;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "F")
    public static float field6371;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
    public abstract int method434(int arg0, int arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Liv;IIII)V")
    public static final void method2687(class99 arg0, int arg1, int arg2, int arg3, int arg4) {
        field6368++;
        if (arg4 > -126) {
            field6369 = 15;
        }
        for (class397 var5 = (class397) class754.field10532.method1269(4); var5 != null; var5 = (class397) class754.field10532.method1264((byte) 123)) {
            if (var5.field5827 == arg3 && (arg1 << 9) == var5.field5812 && arg2 << 9 == var5.field5823 && var5.field5829.field1776 == arg0.field1776) {
                if (var5.field5810 != null) {
                    class326.field4510.method1321(var5.field5810);
                    var5.field5810 = null;
                }
                if (var5.field5807 != null) {
                    class326.field4510.method1321(var5.field5807);
                    var5.field5807 = null;
                }
                var5.method2314((byte) 125);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(FZFF)F")
    public static final float method2688(float arg0, boolean arg1, float arg2, float arg3) {
        if (!arg1) {
            method2688(-0.96692735F, false, 0.1946915F, -1.0497112F);
        }
        field6370++;
        return (arg2 - arg0) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
    public abstract void method430(byte arg0, int arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method428(int arg0, byte arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Lvw;")
    public abstract class307 method437(byte arg0);
}
