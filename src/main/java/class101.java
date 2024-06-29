import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class101 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lve;")
    public static class255 field1702 = class87.method607(25, "Weiter");

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lwl;")
    public static class81 field1708 = new class81(32);

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    public static int[] field1711 = new int[32];

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lbf;")
    public static class315 field1706;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lrg;")
    public static class88 field1707;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lrg;")
    public static class88 field1712;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method782(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1701++;
        class53 var5 = class303.method2112(-1155040160, arg0, 8);
        var5.method325((byte) -57);
        int var6 = -12 / ((arg4 - 49) / 51);
        var5.field825 = arg1;
        var5.field824 = arg2;
        var5.field819 = arg3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)[B", line = 24)
    public static final synchronized byte[] method783(int arg0, byte arg1) {
        if (arg1 <= 24) {
            return (byte[]) null;
        }
        field1709++;
        if (arg0 == 100 && class160.field2703 > 0) {
            byte[] var2 = class192.field3123[--class160.field2703];
            class192.field3123[class160.field2703] = null;
            return var2;
        } else if (arg0 == 5000 && class237.field3944 > 0) {
            byte[] var3 = class187.field3019[--class237.field3944];
            class187.field3019[class237.field3944] = null;
            return var3;
        } else if (arg0 == 30000 && class266.field4516 > 0) {
            byte[] var4 = class231.field3830[--class266.field4516];
            class231.field3830[class266.field4516] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrg;II)Lpc;", line = 60)
    public static final class83 method784(class88 arg0, int arg1, int arg2) {
        field1710++;
        if (arg1 != -2838) {
            method784((class88) null, -103, 31);
        }
        return class305.method2119(arg2, arg0, arg1 + 2880) ? class271.method1890(0) : null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLpb;I)Lve;", line = 81)
    public static final class255 method785(byte arg0, class70 arg1, int arg2) {
        if (arg0 <= 4) {
            field1712 = (class88) null;
        }
        field1704++;
        try {
            class255 var3 = new class255();
            var3.field4343 = arg1.method486((byte) 112);
            if (var3.field4343 > arg2) {
                var3.field4343 = arg2;
            }
            var3.field4297 = new byte[var3.field4343];
            arg1.field1068 += class232.field3852.method187(var3.field4297, arg1.field1066, (byte) -111, 0, arg1.field1068, var3.field4343);
            return var3;
        } catch (Exception var5) {
            return class7.field108;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Ljf;", line = 108)
    public static final class216 method786(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4192;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 116)
    public static void method787(int arg0) {
        field1706 = null;
        field1707 = null;
        field1708 = null;
        field1711 = null;
        if (arg0 <= 51) {
            method783(106, (byte) -39);
        }
        field1712 = null;
        field1702 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1711[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
