import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class729 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lmga;")
    public static class739 field10118 = new class739(15, 1);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[Lkb;")
    public static class720[] field10120 = new class720[50];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field10119 = 0;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lor;")
    public static class668 field10122 = null;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field10121 = 0;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lur;")
    public static class564 field10123 = new class564();

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lha;I)V", line = 3)
    public static final void method4051(class65 arg0, int arg1) {
        field10117++;
        int var2 = 0;
        int var3 = 0;
        if (class130.field1934) {
            var2 = class550.method3117(99);
            var3 = class621.method3410(-2);
        }
        arg0.method456(var2, var3, class593.field8019 + var2, var3 + 350);
        arg0.method563(var2, var3, class593.field8019, 350, class583.field7786 << 24 | 0x332277, 1);
        class716.method4001(var2 + class593.field8019, (byte) -102, var3 + 350, var3, var2);
        int var4 = 120 % ((-arg1 - 68) / 52);
        int var5 = 350 / class588.field7848;
        if (class332.field4784 > 0) {
            int var6 = 346 - class588.field7848 - 4;
            int var7 = var5 * var6 / (class332.field4784 + var5 - 1);
            int var8 = 4;
            if (class332.field4784 > 1) {
                var8 += (class332.field4784 - class700.field9809 - 1) * (var6 - var7) / (class332.field4784 - 1);
            }
            arg0.method563(var2 + class593.field8019 - 16, var3 - -var8, 12, var7, class583.field7786 << 24 | 0x332277, 2);
            for (int var9 = class700.field9809; var9 < class700.field9809 + var5 && class332.field4784 > var9; var9++) {
                String[] var10 = class46.method355(class257.field3837[var9], 0, '\b');
                int var11 = (class593.field8019 - 16 - 8) / var10.length;
                for (int var12 = 0; var12 < var10.length; var12++) {
                    int var13 = var11 * var12 + 8;
                    arg0.method456(var2 + var13, var3, var2 + var13 + var11 - 8, var3 + 350);
                    class105.field1452.method583((byte) 56, var3 + 350 - class360.field5267 - (class7.field76.field3807 - -((-class700.field9809 + var9) * class588.field7848)) - 2, -16777216, class648.method3620(0, var10[var12]), -1, var2 + var13);
                }
            }
        }
        class541.field7353.method569(-1, "Build: 649", -16777216, var2 + class593.field8019 - 25, var3 - 20 + 350, -1);
        arg0.method456(var2, var3, class593.field8019 + var2, var3 + 350);
        arg0.method514(var3 + 350 - class360.field5267, var2, -1, class593.field8019, (byte) -89);
        class251.field3716.method583((byte) 56, var3 + 350 - class548.field7413.field3807 - 1, -16777216, "--> " + class648.method3620(0, class704.field9864), -1, var2 + 10);
        if (!class59.field807) {
            return;
        }
        int var14 = -1;
        if ((class100.field1401 % 30) > 15) {
            var14 = 16777215;
        }
        arg0.method502(12, -92, var2 + class548.field7413.method1696("--> " + class648.method3620(0, class704.field9864).substring(0, class643.field8926), 0) + 10, var3 + -11 - (class548.field7413.field3807 + -350), var14);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 85)
    public static void method4052(boolean arg0) {
        if (!arg0) {
            field10122 = null;
        }
        field10123 = null;
        field10122 = null;
        field10120 = null;
        field10118 = null;
    }
}
