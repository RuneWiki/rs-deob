import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class92 {

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public int field1127 = 1;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Ldq;")
    public static class493 field1123 = new class493(102, 12);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "C")
    public char field1121;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lfw;I)Z")
    public static final boolean method714(class41 arg0, int arg1) {
        field1122++;
        if (arg1 > -123) {
            return false;
        }
        class102 var2 = class315.field4017.method1958(-10091, arg0.method187(21067));
        if (var2.field1295 == -1) {
            return true;
        } else {
            class250 var3 = class72.field931.method951(-68, var2.field1295);
            return var3.field3199 == -1 ? true : var3.method1521(109);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static void method715(byte arg0) {
        int var1 = -52 / ((arg0 + 17) / 41);
        field1123 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lfh;B)V")
    public final void method716(class463 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                if (arg1 >= -33) {
                    field1125 = -26;
                }
                field1124++;
                return;
            }
            this.method717(var3, arg0, -128);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILfh;I)V")
    private final void method717(int arg0, class463 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1121 = class511.method3054(arg1.method2793(32767), true);
        } else if (arg0 == 2) {
            this.field1127 = 0;
        }
        field1128++;
        int var4 = -125 / ((arg2 + 86) / 36);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILhd;ZI)V")
    public static final void method718(int arg0, int arg1, class523 arg2, boolean arg3, int arg4) {
        field1120++;
        int var5 = arg2.field7617;
        int var6 = arg2.field7574;
        if (arg2.field7702 == 0) {
            arg2.field7617 = arg2.field7604;
        } else if (arg2.field7702 == 1) {
            arg2.field7617 = arg4 - arg2.field7604;
        } else if (arg2.field7702 == 2) {
            arg2.field7617 = arg2.field7604 * arg4 >> 14;
        }
        if (arg1 > -38) {
            return;
        }
        if (arg2.field7579 == 0) {
            arg2.field7574 = arg2.field7664;
        } else if (arg2.field7579 == 1) {
            arg2.field7574 = arg0 - arg2.field7664;
        } else if (arg2.field7579 == 2) {
            arg2.field7574 = arg2.field7664 * arg0 >> 14;
        }
        if (arg2.field7702 == 4) {
            arg2.field7617 = arg2.field7666 * arg2.field7574 / arg2.field7606;
        }
        if (arg2.field7579 == 4) {
            arg2.field7574 = arg2.field7617 * arg2.field7606 / arg2.field7666;
        }
        if (class191.field2480 && (client.method1226(arg2).field942 != 0 || arg2.field7632 == 0)) {
            if (arg2.field7574 < 5 && arg2.field7617 < 5) {
                arg2.field7574 = 5;
                arg2.field7617 = 5;
            } else {
                if (arg2.field7574 <= 0) {
                    arg2.field7574 = 5;
                }
                if (arg2.field7617 <= 0) {
                    arg2.field7617 = 5;
                }
            }
        }
        if (class256.field3257 == arg2.field7650) {
            class46.field561 = arg2;
        }
        if (arg3 && arg2.field7598 != null && arg2.field7617 != var5 || arg2.field7574 != var6) {
            class170 var7 = new class170();
            var7.field2179 = arg2;
            var7.field2178 = arg2.field7598;
            class434.field6164.method163(var7, 0);
        }
    }
}
