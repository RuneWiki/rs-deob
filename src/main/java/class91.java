import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class91 extends class86 {

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public int field1537 = 0;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field1534 = -1;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lbe;")
    public static class283 field1543 = class153.method941(25, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Z")
    public static boolean field1541 = true;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Lbe;")
    public static class283 field1538 = class153.method941(126, "loc");

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lkg;")
    public static class69 field1530;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBIIILhk;)Lhk;", line = 18)
    public static final class289 method582(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class289 arg6) {
        field1546++;
        long var7 = (long) arg3;
        class289 var9 = (class289) class297.field5036.method1629(-91, var7);
        if (var9 == null) {
            class165 var10 = class165.method1018(class169.field2832, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1012(64, 768, -50, -10, -50);
            class297.field5036.method1630(true, var7, var9);
        }
        int var11 = arg6.method1346();
        int var12 = arg6.method1327();
        int var13 = arg6.method1358();
        int var14 = arg6.method1370();
        class289 var15 = var9.method1365(true, true);
        if (arg0 != 0) {
            var15.method1356(arg0);
        }
        int var16 = 120 % ((arg2 + 32) / 41);
        class206 var17 = (class206) var15;
        if (arg1 != class42.method254(class61.field850, arg4 + var13, arg5 + var11, -20341) || arg1 != class42.method254(class61.field850, arg4 + var14, arg5 - -var12, -20341)) {
            for (int var18 = 0; var18 < var17.field3511; var18++) {
                var17.field3508[var18] += class42.method254(class61.field850, var17.field3515[var18] + arg4, var17.field3532[var18] + arg5, -20341) - arg1;
            }
            var17.field3512.field340 = false;
            var17.field3537.field324 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I", line = 89)
    public static final int method583(int arg0, int arg1, int arg2) {
        int var3 = 0;
        field1533++;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        int var4 = -28 / ((arg1 + 79) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 124)
    public static void method584(int arg0) {
        if (arg0 != 12861) {
            field1543 = (class283) null;
        }
        field1538 = null;
        field1543 = null;
        field1530 = null;
    }
}
