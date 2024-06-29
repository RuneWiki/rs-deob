import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 extends class448 {

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field532;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Lnq;")
    public static class125 field530 = new class125();

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "[I")
    public static int[] field539 = new int[13];

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field540;

    static {
        new class368("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        new class368("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 4)
    public final Object method350(int arg0) {
        field538++;
        if (arg0 != 29265) {
            method353(-128);
        }
        return this.field532;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lm;Ljava/lang/Object;)V", line = 16)
    public class41(class181 arg0, Object arg1) {
        super(arg0);
        this.field532 = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V", line = 26)
    public static final void method351(int arg0) {
        field540++;
        class408 var1 = class22.field282;
        synchronized (class22.field282) {
            class22.field282.method2530((byte) -116);
        }
        class408 var2 = class269.field3683;
        synchronized (class269.field3683) {
            class269.field3683.method2530((byte) -90);
        }
        if (arg0 != 64) {
            field530 = null;
        }
        class146 var3 = class431.field6035;
        synchronized (class431.field6035) {
            class431.field6035.method1057(0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)Z", line = 52)
    public final boolean method352(byte arg0) {
        if (arg0 != 90) {
            field539 = null;
        }
        field528++;
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V", line = 63)
    public static void method353(int arg0) {
        if (arg0 == 256) {
            field530 = null;
            field539 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILok;Lea;ZII)V", line = 74)
    public static final void method354(int arg0, int arg1, class61 arg2, class58 arg3, boolean arg4, int arg5, int arg6) {
        int var7 = 81 % ((arg0 - 79) / 38);
        if (arg4) {
            class300.field4105.method616((class373.field5174 - class300.field4105.method632()) / 2, (class396.field5493 - class300.field4105.method619()) / 2);
            class211.field2967.method616((class373.field5174 - class211.field2967.method632()) / 2, 18);
        }
        field529++;
        arg2.method484(-1, ~class133.field1986 == -2 ? class268.field3668.method2313((byte) -128, class445.field6241) : class320.field4359.method2313((byte) -95, class445.field6241), arg1, class373.field5174 / 2, class396.field5493 / 2 - 26, 89);
        int var8 = class396.field5493 / 2 - 18;
        arg3.method190(class373.field5174 / 2 - 152, var8, 304, 34, arg6, 0);
        arg3.method190(class373.field5174 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg3.method245(class373.field5174 / 2 - 150, var8 + 2, class341.field4610 * 3, 30, arg5, 0);
        arg3.method245(class341.field4610 * 3 + class373.field5174 / 2 - 150, var8 - -2, 300 - class341.field4610 * 3, 30, 0, 0);
        arg2.method484(-1, class116.field1763, arg1, class373.field5174 / 2, class396.field5493 / 2 + 4, -61);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILvg;)V", line = 108)
    public static final void method355(int arg0, class108 arg1) {
        if (arg0 <= 113) {
            field539 = null;
        }
        field533++;
        int var2 = arg1.field1660;
        if (var2 == 327) {
            arg1.field1527 = 150;
            arg1.field1671 = (int) (Math.sin((double) class246.field3467 / 40.0D) * 256.0D) & 0x3FFF;
            arg1.field1661 = 5;
            arg1.field1578 = -1;
        } else if (var2 == 328) {
            if (class359.field4970.field5869 == null) {
                arg1.field1578 = 0;
                arg1.field1619 = 0;
            } else {
                arg1.field1527 = 150;
                arg1.field1671 = (int) (Math.sin((double) class246.field3467 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1661 = 5;
                arg1.field1578 = 2047;
                arg1.field1619 = class260.method1680(class359.field4970.field5869, (byte) 94);
                arg1.field1607 = class359.field4970.field2587;
                arg1.field1648 = class359.field4970.field2620;
                arg1.field1539 = class359.field4970.field2621;
                arg1.field1620 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V", line = 152)
    public static final void method356(int arg0) {
        field537++;
        if (!class397.method2461(-57) && class367.field5096 != class343.field4623) {
            class90.method716(class343.field4623, class359.field4970.field2662[0], false, false, class133.field1988, -121, class26.field335, class359.field4970.field2659[0]);
        } else if (arg0 <= -107) {
            class80.method649(4, class354.field4765);
            if (class51.field649 != class343.field4623) {
                class236.method1544(0);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjq;)I", line = 173)
    public static final int method357(byte arg0, class185 arg1) {
        field534++;
        if (arg1.field2629 == 0) {
            return 0;
        }
        if (arg1.field2590 != -1 && arg1.field2590 < 32768) {
            class419 var2 = class428.field5951[arg1.field2590];
            if (var2 != null) {
                int var3 = arg1.field40 - var2.field40;
                int var4 = arg1.field44 - var2.field44;
                if (var3 != 0 || var4 != 0) {
                    arg1.method1289((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, true);
                }
            }
        }
        if (arg1.field2590 >= 32768) {
            int var5 = arg1.field2590 - 32768;
            if (class217.field3030 == var5) {
                var5 = 2047;
            }
            class423 var6 = class87.field1227[var5];
            if (var6 != null) {
                int var7 = arg1.field40 - var6.field40;
                int var8 = arg1.field44 - var6.field44;
                if (var7 != 0 || var8 != 0) {
                    arg1.method1289((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, true);
                }
            }
        }
        if ((arg1.field2613 != 0 || arg1.field2615 != 0) && (arg1.field2654 == 0 || arg1.field2664 > 0)) {
            int var9 = arg1.field40 - ((arg1.field2613 - class6.field65 - class6.field65) * 64);
            int var10 = arg1.field44 - ((arg1.field2615 - class371.field5148 - class371.field5148) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.method1289((int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF, true);
            }
            arg1.field2615 = 0;
            arg1.field2613 = 0;
        }
        int var11 = arg1.method1288(true);
        if (arg0 <= 112) {
            field536 = 90;
        }
        return var11;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/String;)V", line = 249)
    public static final void method358(byte arg0, String arg1) {
        field531++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class68.method547((byte) 46, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class42.field541; var3++) {
            String var4 = class32.field443[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class68.method547((byte) 46, var4);
            if (var5 != null && var5.equals(var2)) {
                class42.field541--;
                for (int var6 = var3; var6 < class42.field541; var6++) {
                    class32.field443[var6] = class32.field443[var6 + 1];
                    class263.field3612[var6] = class263.field3612[var6 + 1];
                    class394.field5478[var6] = class394.field5478[var6 + 1];
                    class341.field4605[var6] = class341.field4605[var6 + 1];
                    class258.field3579[var6] = class258.field3579[var6 + 1];
                }
                class418.field5784 = class260.field3595;
                class215.field3014++;
                class88.field1232.method1151(142, (byte) 121);
                class88.field1232.method2280(class82.method662(12189, arg1), 1537846408);
                class88.field1232.method2285(arg1, (byte) -97);
                break;
            }
        }
        if (arg0 != 99) {
            method358((byte) -53, (String) null);
        }
    }
}
