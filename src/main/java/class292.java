import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class292 {

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lcf;")
    public class562 field4393;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field4385 = 0;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lqfa;")
    public static class85 field4384 = new class85(11, -1);

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
    public static boolean field4392 = true;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lom;")
    public static class344 field4390;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZB)V")
    public abstract void method602(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public void method1327(int arg0) {
        if (arg0 > 105) {
            field4388++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZB)V")
    public abstract void method599(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static final void method1946(byte arg0) {
        field4387++;
        if (class361.field5368 == -1) {
            return;
        }
        int var1 = class410.field5945.method1931(-23081);
        if (arg0 > -19) {
            field4389 = 32;
        }
        int var2 = class410.field5945.method1936(127);
        class441 var3 = (class441) class488.field6985.method1224(-2);
        if (var3 != null) {
            var1 = var3.method1092(-127);
            var2 = var3.method1093(5);
        }
        class359.method2296(class506.field7173, (byte) -115, class310.field4626, 0, 0, 0, 0, var2, var1, class361.field5368);
        if (class36.field1037 != null) {
            class650.method3712(false, var1, var2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILhw;)V")
    public abstract void method603(byte arg0, int arg1, class116 arg2);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public void method1326(byte arg0) {
        field4381++;
        if (arg0 > -81) {
            this.method600(19, -84, -99);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public abstract void method601(int arg0);

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method1947(byte arg0) {
        if (arg0 == 116) {
            field4390 = null;
            field4384 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public void method759(int arg0) {
        field4379++;
        if (arg0 != -1) {
            this.method601(76);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public abstract void method600(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z")
    public abstract boolean method604(int arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public void method1323(boolean arg0) {
        field4391++;
        if (!arg0) {
            this.field4393 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg0 >= class704.field9911 && class379.field5612 >= arg4 && arg6 >= class309.field4556 && arg2 <= client.field4115) {
            class192.method1389(arg0, arg2, (byte) 12, arg6, arg5, arg4, arg3, arg1);
        } else {
            class703.method3926(arg0, arg2, arg7 - 6579, arg1, arg5, arg4, arg6, arg3);
        }
        field4386++;
        if (arg7 != 99) {
            method1949(26, -121, 113, -46, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIB)V")
    public static final void method1949(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -58) {
            return;
        }
        field4382++;
        if (arg3 != 8 && arg3 != 16) {
            class370 var5 = class257.field3792[arg0][arg2][arg1];
            if (var5 != null) {
                if (arg3 == 1) {
                    var5.field5498 = 0;
                } else if (arg3 == 2) {
                    var5.field5502 = 0;
                }
            }
            client.method1808(-78);
            return;
        }
        for (int var6 = 0; var6 < class78.field1569; var6++) {
            class185 var7 = class649.field9365[var6];
            if (var7.field2981 == arg3 && var7.field2979 == arg2 && var7.field2978 == arg1 || var7.field2969 == arg2 && var7.field2978 == arg1) {
                if (class78.field1569 != var6) {
                    class692.method3875(class649.field9365, var6 + 1, class649.field9365, var6, class649.field9365.length - var6 - 1);
                }
                class78.field1569--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Z")
    public static final boolean method1950(int arg0, int arg1, int arg2) {
        if (arg1 != 7492) {
            field4392 = true;
        }
        field4383++;
        return class381.method2373(arg0, arg2, 3164) & class103.method958(arg0, arg2, 42);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public void method1322(int arg0) {
        if (arg0 == 0) {
            field4380++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lcf;)V")
    public class292(class562 arg0) {
        this.field4393 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public void method1325(byte arg0) {
        field4378++;
        if (arg0 > -108) {
            this.method1323(false);
        }
    }
}
