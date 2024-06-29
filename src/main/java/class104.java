import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class104 extends class449 {

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "F")
    public float field1460;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIIB)I", line = 5)
    public static final int method834(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -48) {
            return -40;
        } else {
            field1463++;
            int var4 = 255 - arg0;
            int var5 = ((arg1 & 0xFF00) * arg0 & 0xFF0000 | (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
            return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)V", line = 26)
    public static final void method835(int arg0, int arg1, int arg2) {
        class52 var3 = class385.field5285[arg0][arg1][arg2];
        if (var3 != null && var3.field758 != null) {
            var3.field758 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(IIIB)I", line = 36)
    public static final int method836(int arg0, int arg1, int arg2, byte arg3) {
        field1459++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            if (arg3 >= -72) {
                method836(98, -29, 20, (byte) 24);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V", line = 61)
    public static final void method837(int arg0, boolean arg1) {
        class61.field886++;
        field1462++;
        class336.method2111(class293.field4143, 96);
        for (class249 var2 = (class249) class310.field4399.method1097(64); var2 != null; var2 = (class249) class310.field4399.method1105(false)) {
            if (!var2.method2715(-89)) {
                var2 = (class249) class310.field4399.method1097(64);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field3591 == 0) {
                class365.method2240(var2, 9662, arg1, true);
            }
        }
        int var3 = 96 / ((32 - arg0) / 54);
        if (class315.field4453 != null) {
            class184.method1314(class315.field4453, 72);
            class315.field4453 = null;
        }
    }
}
