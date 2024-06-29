import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class200 extends class18 {

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "Luk;")
    private static class100 field3134 = new class100(64);

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field3137 = -1;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field3136 = new String[100];

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "C")
    private char field3135;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Ljava/lang/String;")
    public String field3133;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "[I")
    public static int[] field3139;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILai;)V")
    private final void method1352(int arg0, int arg1, class88 arg2) {
        if (arg0 == arg1) {
            this.field3135 = class190.method1279(14210, arg2.method656(-252));
        } else if (arg1 == 2) {
            this.field3132 = arg2.method641(-1);
        } else if (arg1 == 5) {
            this.field3133 = arg2.method675((byte) 16);
        }
        field3140++;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)Lpg;")
    public static final class77 method1353(int arg0, int arg1) {
        field3143++;
        class77 var2 = (class77) field3134.method728((long) arg1, (byte) -113);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class250.field4030.method1590(arg1, (byte) -25, arg0);
        class77 var4 = new class77();
        if (var3 != null) {
            var4.method549(new class88(var3), 82);
        }
        field3134.method737((long) arg1, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
    public static final void method1354(int arg0, byte arg1) {
        class115.field1872.method1897(true, arg0);
        field3141++;
        class269.field4300.method1897(true, arg0);
        if (arg1 != -46) {
            method1353(30, 35);
        }
        class231.field3670.method1897(true, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILai;)V")
    public final void method1355(int arg0, class88 arg1) {
        field3138++;
        if (arg0 != 0) {
            field3137 = -83;
        }
        while (true) {
            int var3 = arg1.method633(106);
            if (var3 == 0) {
                return;
            }
            this.method1352(1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)Z")
    public final boolean method1356(boolean arg0) {
        field3142++;
        if (!arg0) {
            method1353(-107, 1);
        }
        return this.field3135 == 's';
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
    public static void method1357(byte arg0) {
        field3136 = null;
        field3134 = null;
        field3139 = null;
        if (arg0 <= 31) {
            method1357((byte) 124);
        }
    }
}
