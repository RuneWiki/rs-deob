import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class122 extends class85 {

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "Loi;")
    public static class169 field1702 = new class169("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "[I")
    public static int[] field1707 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "Ljr;")
    private class357 field1700;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILbt;)V", line = 3)
    private final void method775(int arg0, int arg1, class88 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method617(2);
            if (this.field1700 == null) {
                int var5 = class124.method788(var4, -125);
                this.field1700 = new class357(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method617(2) == 1;
                int var8 = arg2.method584(arg1 - 6465);
                class508 var9;
                if (var7) {
                    var9 = new class372(arg2.method591(20557));
                } else {
                    var9 = new class206(arg2.method578(arg1 - 6606));
                }
                this.field1700.method2096((long) var8, var9, (byte) 76);
            }
        }
        if (arg1 == 6720) {
            field1701++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 52)
    public static void method776(int arg0) {
        field1707 = null;
        if (arg0 != 99) {
            field1703 = -127;
        }
        field1702 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 64)
    public final String method777(int arg0, String arg1, int arg2) {
        field1705++;
        if (this.field1700 == null) {
            return arg1;
        }
        if (arg0 != 99) {
            this.field1700 = null;
        }
        class372 var4 = (class372) this.field1700.method2085((long) arg2, -5423);
        return var4 == null ? arg1 : var4.field4830;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I", line = 86)
    public final int method778(int arg0, int arg1, int arg2) {
        field1704++;
        int var4 = -45 / ((arg0 - 44) / 47);
        if (this.field1700 == null) {
            return arg2;
        } else {
            class206 var5 = (class206) this.field1700.method2085((long) arg1, -5423);
            return var5 == null ? arg2 : var5.field2681;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Loh;)V", line = 114)
    public static final void method779(class448 arg0) {
        for (int var1 = arg0.field6238; var1 <= arg0.field6229; var1++) {
            for (int var2 = arg0.field6228; var2 <= arg0.field6221; var2++) {
                class510 var3 = class470.field6877[arg0.field6220][var1][var2];
                if (var3 != null) {
                    class319 var4 = var3.field7494;
                    class319 var5 = null;
                    while (var4 != null) {
                        if (var4.field4107 == arg0) {
                            if (var5 == null) {
                                var3.field7494 = var4.field4102;
                            } else {
                                var5.field4102 = var4.field4102;
                            }
                            var4.method1898(0);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4102;
                    }
                    var3.field7489 = 0;
                    for (class319 var6 = var3.field7494; var6 != null; var6 = var6.field4102) {
                        var3.field7489 = (byte) (var3.field7489 | var6.field4104);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLbt;)V", line = 165)
    public final void method780(byte arg0, class88 arg1) {
        if (arg0 != 77) {
            return;
        }
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                field1706++;
                return;
            }
            this.method775(var3, 6720, arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BIIII)V", line = 189)
    public static final void method781(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 76) {
            method781((byte) 118, -26, -35, 102, -90);
        }
        field1699++;
        if (class421.field5647.field7704 != 0 && arg4 != 0 && class405.field5433 < 50 && arg1 != -1) {
            class46.field673[class405.field5433++] = new class449((byte) 2, arg1, arg4, arg2, arg3, 0);
        }
    }
}
