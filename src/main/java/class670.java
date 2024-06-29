import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class670 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lni;")
    private class522 field9316;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public int field9311;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
    public static boolean field9312 = false;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
    public static boolean field9313 = false;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field9317 = 999999;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field9315 = 1401;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field9318 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 8) {
            method3773(-3, 122, -57, -125, 9, -70, 106);
        }
        if (arg5 != 8 && arg5 != 16) {
            class624 var7 = class77.field947[arg1][arg0][arg2];
            if (var7 == null) {
                var7 = new class624(arg1);
            }
            if (arg5 == 1) {
                var7.field8739 = (short) arg4;
                var7.field8733 = (short) arg3;
            } else if (arg5 == 2) {
                var7.field8732 = (short) arg4;
                var7.field8727 = (short) arg3;
            }
            if (class414.field5853) {
                class112.method753(-44);
            }
        } else if (arg5 == 8) {
            int var14 = arg0 << class443.field6172;
            int var15 = class601.field8373 + var14;
            int var16 = arg2 << class443.field6172;
            int var17 = var16 + class601.field8373;
            int var18 = class86.field1182[arg1].method1685(arg2, -12639, arg0);
            int var19 = class86.field1182[arg1].method1685(arg2 + 1, -12639, arg0 + 1);
            class393.field5575[class60.field631++] = new class620(arg5, arg1, var14, var15, var15, var14, var18, var19, var19 - arg4, -arg4 + var18, var16, var17, var17, var16);
        } else {
            int var8 = (arg0 << class443.field6172) + class601.field8373;
            int var9 = var8 - class601.field8373;
            int var10 = arg2 << class443.field6172;
            int var11 = class601.field8373 + var10;
            int var12 = class86.field1182[arg1].method1685(arg2, arg6 ^ 0xFFFFCEA9, arg0 + 1);
            int var13 = class86.field1182[arg1].method1685(arg2 + 1, -12639, arg0);
            class393.field5575[class60.field631++] = new class620(arg5, arg1, var8, var9, var9, var8, var12, var13, var13 - arg4, var12 - arg4, var10, var11, var11, var10);
        }
        field9314++;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class670(class242 arg0, int arg1, class522 arg2) {
        new class262(64);
        this.field9316 = arg2;
        this.field9311 = this.field9316.method2901(0, 15);
    }
}
