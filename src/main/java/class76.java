import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class76 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljf;")
    public static class229 field1418 = class212.method1457((byte) 76, "clignotant2:");

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1421 = 2;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Ljf;")
    public static class229 field1417 = class212.method1457((byte) 91, "document)3cookie=(R");

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[Lkb;")
    public static class35[] field1422;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V", line = 4)
    public static final void method545(int arg0, int arg1) {
        field1415++;
        class122 var2 = class323.method2175(8, arg1, -25873);
        var2.method865(-54);
        if (arg0 <= 49) {
            field1418 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 18)
    public static final int method546(int arg0) {
        if (arg0 > -98) {
            field1421 = -48;
        }
        field1419++;
        return class46.field851;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I", line = 33)
    public static final int method547(int arg0) {
        field1416++;
        if (arg0 != 16) {
            method550((byte) -128);
        }
        return 16;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 51)
    public static void method548(boolean arg0) {
        field1422 = null;
        field1417 = null;
        if (!arg0) {
            field1418 = (class229) null;
        }
        field1418 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)I", line = 63)
    public static final int method549(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            method546(106);
        }
        int var4 = arg3 & 0x3;
        field1414++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I", line = 94)
    public static final int method550(byte arg0) {
        field1420++;
        if (arg0 > -14) {
            method545(87, 30);
        }
        return 2;
    }
}
