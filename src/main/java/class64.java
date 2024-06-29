import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class64 {

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "[I")
    public static int[] field784 = new int[50];

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lqfa;")
    public static class98 field783 = new class98(76, -1);

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "[I")
    public static int[] field790 = new int[1];

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Z")
    public static boolean field792 = false;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "Lgda;")
    public static class53 field789 = new class53(29, 8);

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([BI)V")
    public static final synchronized void method539(byte[] arg0, int arg1) {
        field788++;
        if (arg0.length == arg1 && class219.field2863 < 1000) {
            class363.field5148[class219.field2863++] = arg0;
        } else if (arg0.length == 5000 && class645.field8833 < 250) {
            class2.field17[class645.field8833++] = arg0;
        } else if (arg0.length == 30000 && class364.field5151 < 50) {
            class310.field4317[class364.field5151++] = arg0;
        } else if (class140.field2023 != null) {
            for (int var2 = 0; var2 < class33.field435.length; var2++) {
                if (class33.field435[var2] == arg0.length && class140.field2023[var2].length > class95.field1110[var2]) {
                    class140.field2023[var2][class95.field1110[var2]++] = arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static final void method540(int arg0) {
        field791++;
        class123.method834(0, arg0, 255);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V")
    public static final void method541(int arg0, int arg1, int arg2, int arg3) {
        field787++;
        int var4 = arg1 + class228.field3063;
        int var5 = arg0 + class3.field30;
        if (class553.field7776 == null || arg1 < 0 || arg0 < 0 || class336.field4683 <= arg1 || arg0 >= class700.field9768 || class557.field7812.field6532.method1419(false) == 0 && class660.field9039.field1266 != arg3) {
            return;
        }
        long var6 = (long) (var4 | arg3 << 28 | var5 << 14);
        class338 var8 = (class338) class178.field2391.method1180((byte) 26, var6);
        if (arg2 != -10615) {
            field790 = null;
        }
        if (var8 == null) {
            class473.method2824(arg3, arg1, arg0);
            return;
        }
        class446 var9 = (class446) var8.field4698.method2765(-12261);
        if (var9 == null) {
            class473.method2824(arg3, arg1, arg0);
            return;
        }
        class716 var10 = (class716) class473.method2824(arg3, arg1, arg0);
        if (var10 == null) {
            var10 = new class716(arg1 << 9, class459.field6474[arg3].method1816((byte) 126, arg0, arg1), arg0 << 9, arg3, arg3);
        } else {
            var10.field9967 = var10.field9949 = -1;
        }
        var10.field9957 = var9.field6322;
        var10.field9964 = var9.field6325;
        label61: while (true) {
            class446 var11 = (class446) var8.field4698.method2759(-15361);
            if (var11 == null) {
                break;
            }
            if (var10.field9964 != var11.field6325) {
                var10.field9967 = var11.field6325;
                var10.field9966 = var11.field6322;
                while (true) {
                    class446 var12 = (class446) var8.field4698.method2759(-15361);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field9964 != var12.field6325 && var10.field9967 != var12.field6325) {
                        var10.field9958 = var12.field6322;
                        var10.field9949 = var12.field6325;
                    }
                }
            }
        }
        int var13 = class469.method2798(96, (arg0 << 9) + 256, arg3, (arg1 << 9) + 256);
        var10.field9960 = 0;
        var10.field1266 = (byte) arg3;
        var10.field1264 = arg1 << 9;
        var10.field1255 = var13;
        var10.field1258 = (byte) arg3;
        var10.field1250 = arg0 << 9;
        if (class364.method2319((byte) -115, arg1, arg0)) {
            var10.field1258++;
        }
        class457.method2718(arg3, arg1, arg0, var13, var10);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public static void method542(int arg0) {
        field784 = null;
        field783 = null;
        if (arg0 == 30000) {
            field789 = null;
            field790 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method543(int arg0, int arg1) {
        field786++;
        if (arg1 == 100 && class219.field2863 > 0) {
            byte[] var2 = class363.field5148[--class219.field2863];
            class363.field5148[class219.field2863] = null;
            return var2;
        } else if (arg0 != -7251) {
            return null;
        } else if (arg1 == 5000 && class645.field8833 > 0) {
            byte[] var3 = class2.field17[--class645.field8833];
            class2.field17[class645.field8833] = null;
            return var3;
        } else if (arg1 == 30000 && class364.field5151 > 0) {
            byte[] var4 = class310.field4317[--class364.field5151];
            class310.field4317[class364.field5151] = null;
            return var4;
        } else {
            if (class140.field2023 != null) {
                for (int var5 = 0; var5 < class33.field435.length; var5++) {
                    if (class33.field435[var5] == arg1 && class95.field1110[var5] > 0) {
                        byte[] var6 = class140.field2023[var5][--class95.field1110[var5]];
                        class140.field2023[var5][class95.field1110[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }
}
