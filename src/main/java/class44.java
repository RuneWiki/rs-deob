import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 extends class297 {

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Lqj;")
    private class548 field592;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "Lkp;")
    public static class507 field591 = null;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
    public static int[] field590 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lwaa;")
    private class33 field577;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field593;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Ljava/lang/Thread;")
    public static Thread field581;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method271(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 5)
    public static final void method265(int arg0) {
        field589++;
        if (arg0 <= ~class687.field9736) {
            class163.field2141 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class329.field4194.length; var2++) {
            if (class329.field4194[var2].indexOf("--> ") != -1) {
                var1++;
                if (class687.field9736 == var1) {
                    class163.field2141 = class329.field4194[var2].substring(class329.field4194[var2].indexOf(">") + 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Lwaa;", line = 36)
    public final class33 method266(byte arg0) {
        field588++;
        if (this.field577 == null) {
            class433.field5413[2] = this.field582;
            class526 var2 = this.field592.field7898;
            class433.field5413[5] = this.field586;
            class433.field5413[3] = this.field580;
            class433.field5413[1] = this.field585;
            class433.field5413[0] = this.field587;
            class433.field5413[4] = this.field578;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2480(false, class433.field5413[var5])) {
                    return null;
                }
                class13 var7 = var2.method2486(class433.field5413[var5], (byte) 86);
                int var8 = var7.field241 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field232 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class347.field4450[var6] = var2.method2481(class433.field5413[var6], 1.0F, false, var4, -5969, var4);
            }
            this.field577 = new class33(this.field592, 6407, var4, var3, class347.field4450);
        }
        return arg0 == 37 ? this.field577 : null;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)Z", line = 103)
    public static final boolean method267(int arg0) {
        if (arg0 != -8908) {
            method265(-13);
        }
        field583++;
        return class516.field7044;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 114)
    public static void method268(boolean arg0) {
        field591 = null;
        field590 = null;
        field581 = null;
        if (arg0) {
            field590 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 126)
    public static final void method269(int arg0, String arg1) {
        field579++;
        if (arg1 == null) {
            return;
        }
        if (!(class66.field904 < 200 || class162.field2138) || class66.field904 >= 200) {
            class250.method1468(4, false, class83.field1118.method476((byte) -109, class250.field3068));
            String var2 = class83.field1119.method476((byte) -113, class250.field3068);
            if (var2 != null) {
                class250.method1468(4, false, var2);
            }
        } else if (arg0 < -100) {
            String var3 = class158.method900(arg1, true);
            if (var3 != null) {
                for (int var4 = 0; var4 < class66.field904; var4++) {
                    String var9 = class158.method900(class50.field708[var4], true);
                    if (var9 != null && var9.equals(var3)) {
                        class250.method1468(4, false, arg1 + class83.field1146.method476((byte) 114, class250.field3068));
                        return;
                    }
                    if (class531.field7172[var4] != null) {
                        String var10 = class158.method900(class531.field7172[var4], true);
                        if (var10 != null && var10.equals(var3)) {
                            class250.method1468(4, false, arg1 + class83.field1146.method476((byte) -51, class250.field3068));
                            return;
                        }
                    }
                }
                for (int var5 = 0; var5 < class238.field2980; var5++) {
                    String var7 = class158.method900(class680.field9564[var5], true);
                    if (var7 != null && var7.equals(var3)) {
                        class250.method1468(4, false, class83.field1151.method476((byte) -52, class250.field3068) + arg1 + class83.field1152.method476((byte) 90, class250.field3068));
                        return;
                    }
                    if (class215.field2669[var5] != null) {
                        String var8 = class158.method900(class215.field2669[var5], true);
                        if (var8 != null && var8.equals(var3)) {
                            class250.method1468(4, false, class83.field1151.method476((byte) -35, class250.field3068) + arg1 + class83.field1152.method476((byte) 127, class250.field3068));
                            return;
                        }
                    }
                }
                if (class158.method900(class376.field4748.field7017, true).equals(var3)) {
                    class250.method1468(4, false, class83.field1149.method476((byte) -127, class250.field3068));
                } else {
                    class320.field4086++;
                    class704 var6 = class314.method1820(class225.field2813, class400.field5014, (byte) 102);
                    var6.field9929.method3509(class109.method611(arg1, (byte) 2), (byte) -110);
                    var6.field9929.method3489(arg1, -117);
                    class122.method654(var6, (byte) -36);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lnv;I)V", line = 227)
    public static final void method270(class62 arg0, int arg1) {
        field584++;
        if (class270.field3423 == null) {
            return;
        }
        if (arg1 > -122) {
            method270(null, 70);
        }
        class339 var2 = null;
        if (arg0.field839 == 0) {
            var2 = (class339) class312.method1803(arg0.field844, arg0.field845, arg0.field835);
        }
        if (arg0.field839 == 1) {
            var2 = (class339) class480.method2615(arg0.field844, arg0.field845, arg0.field835);
        }
        if (arg0.field839 == 2) {
            var2 = (class339) class700.method3933(arg0.field844, arg0.field845, arg0.field835, field593 == null ? (field593 = method271("vda")) : field593);
        }
        if (arg0.field839 == 3) {
            var2 = (class339) class279.method1586(arg0.field844, arg0.field845, arg0.field835);
        }
        if (var2 == null) {
            arg0.field842 = 0;
            arg0.field840 = -1;
            arg0.field841 = 0;
        } else {
            arg0.field840 = var2.method65((byte) 127);
            arg0.field842 = var2.method74((byte) 42);
            arg0.field841 = var2.method78((byte) -66);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lqj;IIIIII)V", line = 285)
    public class44(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field586 = arg6;
        this.field585 = arg2;
        this.field587 = arg1;
        this.field578 = arg5;
        this.field592 = arg0;
        this.field582 = arg3;
        this.field580 = arg4;
    }
}
