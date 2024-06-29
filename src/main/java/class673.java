import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class673 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9560 = "";

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
    public static int[] field9564 = new int[500];

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lpr;")
    public static class407 field9563 = new class407(11, 8);

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
    public static final void method3773(int arg0) {
        field9562++;
        int var1 = class11.field111;
        int[] var2 = class79.field827;
        for (int var3 = 0; var3 < var1; var3++) {
            class455 var9 = class362.field4726[var2[var3]];
            if (var9 != null && var9.field3816 > 0) {
                var9.field3816--;
                if (var9.field3816 == 0) {
                    var9.field3757 = null;
                }
            }
        }
        if (arg0 != -8028) {
            field9560 = null;
        }
        for (int var4 = 0; var4 < class118.field1356; var4++) {
            long var5 = (long) class664.field9449[var4];
            class443 var7 = (class443) class392.field5223.method3234((byte) -36, var5);
            if (var7 != null) {
                class625 var8 = var7.field6107;
                if (var8.field3816 > 0) {
                    var8.field3816--;
                    if (var8.field3816 == 0) {
                        var8.field3757 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public abstract void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILoa;I)Z")
    public abstract boolean method457(int arg0, int arg1, class635 arg2, int arg3);

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)Z")
    public abstract boolean method449(byte arg0);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILoa;)Lgr;")
    public abstract class396 method450(int arg0, class635 arg1);

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
    public abstract void method448(int arg0);

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)V")
    public static void method3774(byte arg0) {
        if (arg0 <= 111) {
            field9564 = null;
        }
        field9564 = null;
        field9560 = null;
        field9563 = null;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Loa;I)Lok;")
    public abstract class231 method442(class635 arg0, int arg1);

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(Loa;I)V")
    public abstract void method451(class635 arg0, int arg1);
}
