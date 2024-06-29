import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class130 extends class345 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1801 = 100;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lm;")
    public static class165 field1800;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lci;")
    public abstract class384 method909(int arg0);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII[BB)V")
    public static final void method910(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field1799++;
        if (arg2 >= arg0) {
            return;
        }
        int var6 = arg0 - arg2 >> 2;
        if (arg5 <= 111) {
            field1800 = null;
        }
        int var7 = arg1 + arg2;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg0 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var7++] = 1;
                }
            }
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method911(int arg0) {
        field1800 = null;
        if (arg0 != 100) {
            method912(10, false);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
    public static final void method912(int arg0, boolean arg1) {
        class495.field7048 = arg0;
        field1802++;
        class131.field1806.method837(125);
        if (arg1) {
            field1800 = null;
        }
    }
}
