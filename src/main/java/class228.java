import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class228 extends class287 implements class218 {

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "Lco;")
    public class201 field3330;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "Z")
    private boolean field3346;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "[S")
    public static short[] field3334 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!rn", name = "S", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!rn", name = "U", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V", line = 3)
    public final void method247(boolean arg0) {
        if (arg0) {
            this.method256((byte) -65, (class63) null);
        }
        ++field3347;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ltq;Lvc;IIIIIZIIIIII)V", line = 13)
    public class228(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class355.method2186(arg12, (byte) 79, arg11));
        this.field3330 = new class201(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field3346 = ~arg1.field4053 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ltq;I)V", line = 25)
    public final void method258(class63 arg0, int arg1) {
        this.field3330.method1363(-1, arg0);
        if (arg1 == -22360) {
            ++field3338;
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(B)Lda;", line = 36)
    public static final class325 method1481(byte arg0) {
        ++field3332;
        try {
            return new class93();
        } catch (Throwable var2) {
            if (arg0 != -89) {
                field3334 = null;
            }
            try {
                return (class325) Class.forName("ua").newInstance();
            } catch (Throwable var1) {
                return new class272();
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BILtq;)Lns;", line = 60)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        ++field3329;
        if (arg0 < 108) {
            field3334 = null;
        }
        return this.field3330.method1369(false, 0, arg2, -12, false, 0, arg1);
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(B)V", line = 80)
    public static final void method1482(byte arg0) {
        int var1 = -78 / ((arg0 - 48) / 37);
        ++field3336;
        class186 var2 = class275.method1789(0, (byte) 123, 15);
        var2.method1279((byte) -65);
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(Z)I", line = 92)
    public final int method257(boolean arg0) {
        ++field3342;
        if (arg0) {
            field3334 = null;
        }
        return this.field3330.field3063;
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V", line = 104)
    public static void method1483(int arg0) {
        field3334 = null;
        if (arg0 != 137) {
            method1483(52);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLtq;)V", line = 114)
    public final void method256(byte arg0, class63 arg1) {
        this.field3330.method1368((byte) -100, arg1);
        ++field3333;
        if (arg0 != 82) {
            this.field3330 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "(B)Z", line = 126)
    public static final boolean method1484(byte arg0) {
        if (arg0 <= 42) {
            method1485((Component) null, 17);
        }
        ++field3344;
        return class150.field2114 != class103.field1445 || ~class465.field6556 <= -3;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Ltq;I)Lcj;", line = 138)
    public final class123 method252(class63 arg0, int arg1) {
        ++field3337;
        class57 var3 = this.field3330.method1369(true, super.field4387, arg0, arg1 + -14, false, super.field4392, 1024);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 2) {
                method1482((byte) 106);
            }
            class315 var4 = arg0.method565();
            var4.method482(super.field4392 + super.field4378, super.field4377, super.field4387 + super.field4385);
            class123 var5 = null;
            if (this.field3346) {
                var5 = class225.method1462(1, -99);
            }
            if (this.field3330.field3055 != null) {
                class268 var6 = this.field3330.field3055.method459();
                arg0.method552(var3, var6, var4, var5 == null ? null : var5.field1695[0], 0);
            } else {
                var3.method404(var4, var5 == null ? null : var5.field1695[0], 0);
            }
            this.field3330.method1364(arg0, var3, super.field4387 >> 7, super.field4392 >> 7, super.field4387 >> 7, super.field4392 >> 7, true, -16777216);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I", line = 178)
    public final int method250(byte arg0) {
        int var2 = -111 / ((-49 - arg0) / 60);
        ++field3340;
        return this.field3330.field3064;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILtq;)V", line = 188)
    public final void method260(int arg0, class63 arg1) {
        ++field3335;
        class57 var3 = this.field3330.method1369(true, super.field4387, arg1, arg0 ^ -12, false, super.field4392, 131072);
        if (var3 != null) {
            this.field3330.method1364(arg1, var3, super.field4387 >> 7, super.field4392 >> 7, super.field4387 >> 7, super.field4392 >> 7, false, arg0 + -16777216);
        }
        if (arg0 != 0) {
            field3341 = -8;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)Z", line = 203)
    public final boolean method254(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field3345;
            return this.field3330.method1370(119);
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)I", line = 217)
    public final int method286(byte arg0) {
        int var2 = 87 % ((63 - arg0) / 63);
        ++field3348;
        return this.field3330.method1371(1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/awt/Component;I)Lmg;", line = 227)
    public static final class488 method1485(Component arg0, int arg1) {
        if (arg1 != 103333031) {
            method1481((byte) -16);
        }
        ++field3339;
        return new class162(arg0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ltq;III)Z", line = 238)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field3331;
        class57 var5 = this.field3330.method1369(false, super.field4387, arg0, -12, false, super.field4392, 65536);
        if (var5 == null) {
            return false;
        } else {
            int var6 = 117 % ((-59 - arg2) / 58);
            class315 var7 = arg0.method565();
            var7.method482(super.field4392 + super.field4378, super.field4377, super.field4387 + super.field4385);
            return var5.method423(arg1, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)I", line = 257)
    public final int method244(byte arg0) {
        if (arg0 >= -8) {
            return 98;
        } else {
            ++field3343;
            return this.field3330.field3065;
        }
    }
}
