import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class361 {

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Lwd;")
    public static class357 field4843 = new class357(15, 0, 1, 0);

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Z")
    public static boolean field4845 = false;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field4847 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Ltf;")
    public static class701 field4839;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "[I")
    public static int[] field4842;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lnj;B)V")
    public static final void method2118(class529 arg0, byte arg1) {
        arg0.field7450 = false;
        if (arg0.field7449 != null) {
            arg0.field7449.field3266 = 0;
        }
        field4844++;
        for (class529 var2 = arg0.method505(); var2 != null; var2 = arg0.method521()) {
            method2118(var2, (byte) -123);
        }
        int var3 = 102 / ((-arg1 - 53) / 38);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)V")
    public static final void method2119(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4840++;
        if (arg4 == 8 || arg4 == 16) {
            for (int var6 = 0; var6 < class120.field1341; var6++) {
                class603 var7 = class389.field5262[var6];
                if (var7.field8488 == arg4 && var7.field8477 == arg1 && var7.field8483 == arg0 || var7.field8489 == arg1 && var7.field8483 == arg0) {
                    if (class120.field1341 != var6) {
                        class567.method3216(class389.field5262, var6 + 1, class389.field5262, var6, class389.field5262.length - var6 - 1);
                    }
                    class120.field1341--;
                    return;
                }
            }
        } else {
            class499 var5 = class487.field7044[arg2][arg1][arg0];
            if (var5 != null) {
                if (arg4 == 1) {
                    var5.field7232 = 0;
                } else if (arg4 == 2) {
                    var5.field7216 = 0;
                }
            }
            class113.method602(false);
        }
        if (arg3 != 126) {
            field4847 = -66;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method2120(int arg0) {
        field4843 = null;
        field4842 = null;
        if (arg0 != 0) {
            field4847 = -54;
        }
        field4839 = null;
    }
}
