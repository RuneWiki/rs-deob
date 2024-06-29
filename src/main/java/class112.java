import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class112 extends class14 {

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Lvh;")
    public static class62 field1558 = new class62(100);

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field1564 = 1;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1565 = "yellow:";

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IB)V", line = 5)
    public static final void method726(int arg0, byte arg1) {
        field1569++;
        class279 var2 = class147.method1085(arg0, -19443, 9);
        var2.method1996(true);
        if (arg1 < 117) {
            method728(-52, 87, 30, -67);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V", line = 23)
    public final void method84(int arg0, int arg1, int arg2) {
        field1559++;
        int var4 = this.field1561 * arg1 >> 12;
        if (arg2 != 9432) {
            method726(108, (byte) 21);
        }
        int var5 = this.field1567 * arg0 >> 12;
        int var6 = this.field1560 * arg0 >> 12;
        int var7 = this.field1563 * arg1 >> 12;
        class321.method2237(this.field151, var7, var6, (byte) -14, var4, var5);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 43)
    public static final void method727(int arg0) {
        field1557++;
        for (class337 var1 = (class337) class250.field3968.method1812(arg0 + 1308766869); var1 != null; var1 = (class337) class250.field3968.method1809(128)) {
            if (var1.field5391) {
                var1.method2328(arg0 + 1308766996);
            }
        }
        if (arg0 != -1308766868) {
            field1564 = 102;
        }
        for (class337 var2 = (class337) class257.field4069.method1812(1); var2 != null; var2 = (class337) class257.field4069.method1809(128)) {
            if (var2.field5391) {
                var2.method2328(128);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIII)V", line = 78)
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1567 = arg1;
        this.field1563 = arg2;
        this.field1560 = arg3;
        this.field1561 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I", line = 105)
    public static final int method728(int arg0, int arg1, int arg2, int arg3) {
        field1555++;
        if (arg3 >= -23) {
            return -96;
        } else if (arg1 <= arg0) {
            return (arg2 >= arg0 ? arg0 : arg2);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 117)
    public static void method729(byte arg0) {
        field1558 = null;
        if (arg0 != -12) {
            field1568 = 16;
        }
        field1565 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(BII)V", line = 130)
    public final void method89(byte arg0, int arg1, int arg2) {
        int var4 = -55 % ((-arg0) / 32);
        field1566++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)V", line = 142)
    public final void method82(byte arg0, int arg1, int arg2) {
        field1562++;
        if (arg0 > -47) {
            method728(-45, 42, -89, -1);
        }
    }
}
