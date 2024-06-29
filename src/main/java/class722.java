import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class722 {

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "[Led;")
    public static class702[] field10086 = new class702[2048];

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "Lpba;")
    public static class331 field10088 = new class331(0, -1);

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "Lqaa;")
    public static class27 field10089 = new class27(70, 5);

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "Leq;")
    public static class209 field10091;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "Lda;")
    public static class59 field10090;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V", line = 10)
    public static void method4020(boolean arg0) {
        field10091 = null;
        field10089 = null;
        if (arg0) {
            field10091 = null;
        }
        field10090 = null;
        field10088 = null;
        field10086 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIILha;Luw;)V", line = 34)
    public static final void method4021(int arg0, boolean arg1, int arg2, int arg3, class58 arg4, class414 arg5) {
        if (!arg1) {
            method4021(4, true, 109, -84, null, null);
        }
        field10087++;
        class720 var6 = class93.field1631.method797(arg5.field5755, false);
        if (var6.field10085 == -1) {
            return;
        }
        int var7;
        if (arg5.field5787) {
            int var8 = arg5.field5794 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class743 var9 = var6.method4014(var7, 101, arg4, arg5.field5780);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field5800;
        int var11 = arg5.field5732;
        if ((var7 & 0x1) == 1) {
            var11 = arg5.field5800;
            var10 = arg5.field5732;
        }
        int var12 = var9.method82();
        int var13 = var9.method83();
        if (var6.field10078) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field10081 == 0) {
            var9.method4136(arg0, arg3 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method4143(arg0, arg3 - (var11 * 4 - 4), var12, var13, 0, var6.field10081 | 0xFF000000, 1);
        }
    }
}
