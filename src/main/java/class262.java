import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public abstract class class262 {

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lifa;")
    public class393 field3601;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "Liv;")
    public static class82 field3605 = new class82(10, 8);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1592(int arg0, int arg1, int arg2) {
        int var3 = -59 % ((-arg1 - 41) / 34);
        field3603++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILn;I)V", line = 15)
    public static final void method1593(int arg0, int arg1, class17 arg2, int arg3) {
        field3609++;
        if (arg3 != 14575) {
            return;
        }
        class616 var4 = arg2.method192(class68.field1045, (byte) 89);
        if (var4 == null) {
            return;
        }
        class68.field1045.method292(arg1, arg0, arg1 + arg2.field414, arg0 - -arg2.field402);
        if (class301.field4043 >= 3) {
            class68.field1045.method245(-16777216, var4, arg1, arg0);
        } else {
            class489.field6829.method3931((float) arg2.field414 / 2.0F + (float) arg1, (float) arg2.field402 / 2.0F + (float) arg0, 4096, ((int) (-class115.field1495) & 0x3FFF) << 2, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V", line = 40)
    public void method593(int arg0) {
        int var2 = -122 / ((arg0 + 41) / 52);
        field3607++;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lun;I)Lat;", line = 49)
    public static final class346 method1594(class389 arg0, int arg1) {
        if (arg1 != 0) {
            field3605 = null;
        }
        field3610++;
        return new class346(arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2258(-3), arg0.method2258(arg1 - 3), arg0.method2229(arg1 + 255));
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lifa;)V", line = 62)
    public class262(class393 arg0) {
        this.field3601 = arg0;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B[IILkfa;)V", line = 70)
    public static final void method1595(byte arg0, int[] arg1, int arg2, class557 arg3) {
        field3600++;
        if (arg3.field2655 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field2655.length; var5++) {
                if (arg3.field2655[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field2637 != -1) {
                class282 var6 = class195.field2367.method3273(arg3.field2637, 0);
                int var7 = var6.field3828;
                if (var7 == 1) {
                    arg3.field2662 = 0;
                    arg3.field2665 = 0;
                    arg3.field2613 = 0;
                    arg3.field2596 = arg2;
                    arg3.field2585 = 1;
                    if (!arg3.field2597) {
                        class563.method3294((byte) 111, var6, arg3, arg3.field2613);
                    }
                }
                if (var7 == 2) {
                    arg3.field2665 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg0 != 124) {
            method1597((byte) 96);
        }
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg3.field2655 == null || arg3.field2655[var9] == -1 || class195.field2367.method3273(arg1[var9], 0).field3823 >= class195.field2367.method3273(arg3.field2655[var9], 0).field3823) {
                arg3.field2655 = arg1;
                arg3.field2680 = arg3.field2683;
                arg3.field2596 = arg2;
            }
        }
        if (var8) {
            arg3.field2655 = arg1;
            arg3.field2596 = arg2;
            arg3.field2680 = arg3.field2683;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "(I)V", line = 159)
    public static void method1596(int arg0) {
        field3605 = null;
        if (arg0 != 1) {
            method1595((byte) 23, null, -55, null);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)[Lpe;", line = 170)
    public static final class564[] method1597(byte arg0) {
        field3604++;
        if (arg0 < 26) {
            method1594(null, -61);
        }
        return new class564[] { class81.field1167, class323.field4274, class33.field669 };
    }

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)V", line = 182)
    public void method882(int arg0) {
        if (arg0 > -34) {
            method1596(-23);
        }
        field3608++;
    }

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "(I)V", line = 194)
    public void method594(int arg0) {
        field3606++;
        if (arg0 != 3) {
            this.method597(68);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V", line = 216)
    public void method596(byte arg0) {
        if (arg0 <= 9) {
            method1593(85, -102, null, 114);
        }
        field3602++;
    }

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)V", line = 226)
    public void method597(int arg0) {
        if (arg0 != 16383) {
            this.field3601 = null;
        }
        field3598++;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V", line = 236)
    public void method595(byte arg0) {
        if (arg0 != 47) {
            field3605 = null;
        }
        field3599++;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Z")
    public abstract boolean method375(int arg0);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZI)V")
    public abstract void method372(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZI)V")
    public abstract void method373(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V")
    public abstract void method374(int arg0);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZ)V")
    public abstract void method377(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILoa;B)V")
    public abstract void method371(int arg0, class644 arg1, byte arg2);
}
