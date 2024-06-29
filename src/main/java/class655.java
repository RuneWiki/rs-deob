import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class655 {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
    public static int[] field9232 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lae;")
    public static class40 field9231 = new class40();

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field9233 = 0;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field9229;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
    public static final void method3666(int arg0, int arg1, int arg2) {
        int var3 = 101 / ((68 - arg2) / 40);
        class330.field4217 = arg0 - class656.field9264;
        class91.field1281 = arg1 - class656.field9265;
        field9230++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIILwr;)V")
    public static final void method3667(int arg0, int arg1, int arg2, int arg3, class699 arg4) {
        class75 var5 = class128.method683(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field6461 = (arg1 << class52.field775) + class238.field2979;
        arg4.field6458 = arg3;
        arg4.field6464 = (arg2 << class52.field775) + class238.field2979;
        if (var5.field1031 != null) {
            arg4.field6458 -= var5.field1031.field4919;
        }
        var5.field1021 = arg4;
        int var6 = class699.field9887 == class491.field6485 ? 1 : 0;
        if (arg4.method68((byte) 115)) {
            if (arg4.method83((byte) 23)) {
                class337.field4341[var6][class173.field2256[var6]++] = arg4;
                return;
            }
            class102.field1375[var6][class593.field8335[var6]++] = arg4;
            return;
        }
        class252.field3090[var6][class469.field5960[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method3668(int arg0) {
        if (arg0 == 5) {
            field9232 = null;
            field9229 = null;
            field9231 = null;
        }
    }
}
