import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class306 {

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "Lvg;")
    public class467 field4498 = new class467();

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
    public static int[] field4495 = new int[64];

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "[F")
    public static float[] field4492 = new float[4];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "Lvg;")
    private class467 field4501;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lvr;BLvg;)V")
    private final void method1957(class306 arg0, byte arg1, class467 arg2) {
        field4491++;
        class467 var4 = this.field4498.field6803;
        if (arg1 > -37) {
            this.method1958(null, -119);
        }
        this.field4498.field6803 = arg2.field6803;
        arg2.field6803.field6797 = this.field4498;
        if (this.field4498 != arg2) {
            arg2.field6803 = arg0.field4498.field6803;
            arg2.field6803.field6797 = arg2;
            var4.field6797 = arg0.field4498;
            arg0.field4498.field6803 = var4;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lvg;I)V")
    public final void method1958(class467 arg0, int arg1) {
        if (arg0.field6803 != null) {
            arg0.method2785((byte) -120);
        }
        if (arg1 != 0) {
            field4495 = null;
        }
        field4490++;
        arg0.field6803 = this.field4498.field6803;
        arg0.field6797 = this.field4498;
        arg0.field6803.field6797 = arg0;
        arg0.field6797.field6803 = arg0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public final void method1959(byte arg0) {
        field4499++;
        while (true) {
            class467 var2 = this.field4498.field6797;
            if (this.field4498 == var2) {
                this.field4501 = null;
                if (arg0 == 113) {
                    return;
                } else {
                    this.method1966(null, -51);
                    return;
                }
            }
            var2.method2785((byte) -120);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lvg;")
    public final class467 method1960(int arg0) {
        if (arg0 != 24) {
            this.method1960(-124);
        }
        field4488++;
        class467 var2 = this.field4501;
        if (this.field4498 == var2) {
            this.field4501 = null;
            return null;
        } else {
            this.field4501 = var2.field6797;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lvg;I)V")
    public final void method1961(class467 arg0, int arg1) {
        if (arg0.field6803 != null) {
            arg0.method2785((byte) -120);
        }
        field4502++;
        arg0.field6797 = this.field4498.field6797;
        if (arg1 != 26413) {
            this.field4498 = null;
        }
        arg0.field6803 = this.field4498;
        arg0.field6803.field6797 = arg0;
        arg0.field6797.field6803 = arg0;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Lvg;")
    public final class467 method1962(int arg0) {
        field4500++;
        if (arg0 != 0) {
            return null;
        }
        class467 var2 = this.field4498.field6797;
        if (this.field4498 == var2) {
            return null;
        } else {
            var2.method2785((byte) -120);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBLtl;)V")
    public static final void method1963(int arg0, byte arg1, class91 arg2) {
        if (class518.field7679 != null) {
            try {
                class518.field7679.method570(0L, 0);
                class518.field7679.method571((byte) -123, arg0, arg2.field1277, 24);
            } catch (Exception var3) {
            }
        }
        field4493++;
        if (arg1 != -112) {
            field4492 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Lvg;")
    public final class467 method1964(boolean arg0) {
        field4489++;
        if (!arg0) {
            this.field4501 = null;
        }
        class467 var2 = this.field4501;
        if (this.field4498 == var2) {
            this.field4501 = null;
            return null;
        } else {
            this.field4501 = var2.field6803;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)Z")
    public final boolean method1965(int arg0) {
        if (arg0 != 64) {
            this.field4498 = null;
        }
        field4496++;
        return this.field4498.field6797 == this.field4498;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lvr;I)V")
    public final void method1966(class306 arg0, int arg1) {
        if (arg1 < 109) {
            field4495 = null;
        }
        field4497++;
        this.method1957(arg0, (byte) -74, this.field4498.field6797);
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)I")
    public final int method1967(int arg0) {
        int var2 = -80 % ((34 - arg0) / 61);
        field4487++;
        int var3 = 0;
        for (class467 var4 = this.field4498.field6797; var4 != this.field4498; var4 = var4.field6797) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)Lvg;")
    public final class467 method1968(int arg0) {
        field4486++;
        if (arg0 != -31872) {
            this.field4501 = null;
        }
        class467 var2 = this.field4498.field6803;
        if (this.field4498 == var2) {
            this.field4501 = null;
            return null;
        } else {
            this.field4501 = var2.field6803;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
    public static void method1969(byte arg0) {
        if (arg0 < -79) {
            field4495 = null;
            field4492 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)Lvg;")
    public final class467 method1970(int arg0) {
        field4485++;
        class467 var2 = this.field4498.field6797;
        if (this.field4498 == var2) {
            this.field4501 = null;
            return null;
        }
        this.field4501 = var2.field6797;
        if (arg0 != 64) {
            this.field4501 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Lbq;")
    public static final class483 method1971(int arg0) {
        if (arg0 != 16618) {
            field4495 = null;
        }
        field4484++;
        try {
            return (class483) Class.forName("du").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
    public class306() {
        this.field4498.field6803 = this.field4498;
        this.field4498.field6797 = this.field4498;
    }
}
