import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class83 {

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private int field1492 = 0;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Loe;")
    private class79 field1484;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1479 = 0;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1478 = 0;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lgd;")
    private class141 field1488;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "[I")
    public static int[] field1486;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Lgd;", line = 8)
    public final class141 method578(int arg0) {
        field1490++;
        if (~this.field1492 < arg0 && this.field1484.field1343[this.field1492 - 1] != this.field1488) {
            class141 var2 = this.field1488;
            this.field1488 = var2.field2423;
            return var2;
        }
        class141 var3;
        do {
            if (this.field1484.field1336 <= this.field1492) {
                return null;
            }
            var3 = this.field1484.field1343[this.field1492++].field2423;
        } while (this.field1484.field1343[this.field1492 - 1] == var3);
        this.field1488 = var3.field2423;
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 50)
    public static void method579(int arg0) {
        if (arg0 != 0) {
            field1479 = 24;
        }
        field1486 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Lgd;", line = 61)
    public final class141 method580(byte arg0) {
        field1491++;
        if (arg0 != 0) {
            this.field1488 = (class141) null;
        }
        this.field1492 = 0;
        return this.method578(~arg0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lom;IZII)V", line = 90)
    public static final void method581(class157 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1482++;
        if (!arg2) {
            field1489 = 81;
        }
        for (class241 var5 = (class241) class164.field2871.method1936(16173); var5 != null; var5 = (class241) class164.field2871.method1926((byte) 90)) {
            if (var5.field4180 == arg3 && arg4 * 128 == var5.field4192 && (arg1 * 128) == var5.field4196 && var5.field4183.field2676 == arg0.field2676) {
                if (var5.field4181 != null) {
                    class219.field3803.method882(var5.field4181);
                    var5.field4181 = null;
                }
                if (var5.field4187 != null) {
                    class219.field3803.method882(var5.field4187);
                    var5.field4187 = null;
                }
                var5.method961((byte) 108);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 138)
    public static final int method582(int arg0, int arg1) {
        if (arg1 > -108) {
            field1478 = 103;
        }
        field1487++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V", line = 149)
    public static final void method583(int arg0, int arg1, int arg2) {
        field1485++;
        class227 var3 = class215.method1531(arg0, 13, arg1);
        var3.method1616(64);
        var3.field3923 = arg2;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Loe;)V", line = 166)
    public class83(class79 arg0) {
        this.field1484 = arg0;
    }
}
