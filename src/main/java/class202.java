import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class202 extends class68 {

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lce;")
    public static class126 field3448 = class206.method1445(-7923, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Z")
    public static boolean field3453 = false;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "Lce;")
    public static class126 field3459 = class206.method1445(-7923, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field3465 = -1;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Luj;")
    public static class157 field3466;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Lsg;")
    public static class164 field3456;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[I")
    public int[] field3451;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "[I")
    public int[] field3457;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "[I")
    public int[] field3464;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[Ld;")
    public class60[] field3454;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[Ld;")
    public class60[] field3455;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "[[[B")
    public byte[][][] field3458;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lte;IIIB)V", line = 6)
    public static final void method1423(class265 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3462++;
        if (arg4 != -54) {
            method1423((class265) null, -84, 71, 24, (byte) 118);
        }
        for (class314 var5 = (class314) class185.field3202.method898((byte) -55); var5 != null; var5 = (class314) class185.field3202.method893((byte) -86)) {
            if (var5.field5384 == arg1 && (arg3 * 128) == var5.field5402 && arg2 * 128 == var5.field5400 && var5.field5383.field4481 == arg0.field4481) {
                if (var5.field5382 != null) {
                    class278.field4633.method562(var5.field5382);
                    var5.field5382 = null;
                }
                if (var5.field5398 != null) {
                    class278.field4633.method562(var5.field5398);
                    var5.field5398 = null;
                }
                var5.method499((byte) 64);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)I", line = 44)
    public static final int method1424(byte arg0, int arg1) {
        field3463++;
        int var2 = -33 % ((arg0 - 74) / 38);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIII)V", line = 68)
    public static final void method1425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3450++;
        int var9 = arg2 - arg6;
        int var10 = arg1 - arg8;
        int var11 = (arg3 - arg0 << 16) / var9;
        if (arg4 != -1717555696) {
            method1423((class265) null, 64, 116, -11, (byte) 26);
        }
        int var12 = (arg5 - arg7 << 16) / var10;
        class16.method91(arg4 + 1717555695, arg1, arg7, arg2, 0, var12, arg6, var11, arg8, arg0, 0);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)Lce;", line = 98)
    public static final class126 method1426(int arg0, int arg1) {
        if (arg0 == 22247) {
            field3467++;
            return class214.field3636[arg1].method878((byte) 88) <= 0 ? class296.field4932[arg1] : class12.method69(new class126[] { class296.field4932[arg1], class307.field5188, class214.field3636[arg1] }, (byte) 116);
        } else {
            return (class126) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(BI)V", line = 128)
    public static final void method1427(byte arg0, int arg1) {
        class235.method1602(class235.field3967, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class235.method1603(-50.0F, -60.0F, -50.0F);
        class235.method1601(class235.field3964, 0);
        field3452++;
        if (arg0 > -37) {
            method1423((class265) null, -72, 89, -114, (byte) -30);
        }
        class235.method1594();
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 148)
    public static void method1428(int arg0) {
        field3448 = null;
        field3456 = null;
        field3466 = null;
        field3459 = null;
        int var1 = -108 / ((arg0 - 4) / 51);
    }
}
