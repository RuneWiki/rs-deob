import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class23 {

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Lnfa;")
    private class681 field425 = new class681();

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field427 = -1;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "Lnfa;")
    private class681 field429;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lnfa;")
    public final class681 method157(byte arg0) {
        field419++;
        class681 var2 = this.field425.field9500;
        if (this.field425 == var2) {
            return null;
        } else {
            int var3 = -29 % ((arg0 - 2) / 35);
            var2.method3835(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)Lnfa;")
    public final class681 method158(boolean arg0) {
        field420++;
        class681 var2 = this.field429;
        if (this.field425 == var2) {
            this.field429 = null;
            return null;
        } else {
            this.field429 = var2.field9500;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)Lnfa;")
    public final class681 method159(byte arg0) {
        field421++;
        class681 var2 = this.field425.field9501;
        if (this.field425 == var2) {
            this.field429 = null;
            return null;
        } else {
            this.field429 = var2.field9501;
            int var3 = -21 / ((arg0 - 18) / 60);
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V")
    public static final void method160(boolean arg0) {
        field426++;
        int var1 = class416.field5303;
        int[] var2 = class657.field9155;
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class724 var4 = class5.field49[var2[var3]];
            if (var4 != null) {
                class203.method1314(var4, var4.method82((byte) 49), 105);
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
    public final int method161(int arg0) {
        if (arg0 != -13282) {
            this.method166(105, null);
        }
        field422++;
        int var2 = 0;
        for (class681 var3 = this.field425.field9500; var3 != this.field425; var3 = var3.field9500) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lnfa;")
    public final class681 method162(int arg0) {
        if (arg0 != -22305) {
            return null;
        }
        field424++;
        class681 var2 = this.field425.field9500;
        if (this.field425 == var2) {
            this.field429 = null;
            return null;
        } else {
            this.field429 = var2.field9500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZB)V")
    public static final void method163(boolean arg0, boolean arg1, byte arg2) {
        field423++;
        if (arg2 < 73) {
            method160(true);
        }
        if (arg1) {
            class100.field1383--;
            if (class100.field1383 == 0) {
                class267.field3365 = null;
            }
        }
        if (!arg0) {
            return;
        }
        class692.field9624--;
        if (class692.field9624 == 0) {
            class22.field415 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Z")
    public final boolean method164(byte arg0) {
        field430++;
        int var2 = 119 / ((40 - arg0) / 42);
        return this.field425.field9500 == this.field425;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
    public final void method165(int arg0) {
        while (true) {
            class681 var2 = this.field425.field9500;
            if (this.field425 == var2) {
                field431++;
                if (arg0 > -118) {
                    return;
                }
                this.field429 = null;
                return;
            }
            var2.method3835(0);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILnfa;)V")
    public final void method166(int arg0, class681 arg1) {
        field428++;
        if (arg1.field9501 != null) {
            arg1.method3835(arg0 ^ 0xFFFFDD79);
        }
        if (arg0 != -8839) {
            this.field429 = null;
        }
        arg1.field9501 = this.field425.field9501;
        arg1.field9500 = this.field425;
        arg1.field9501.field9500 = arg1;
        arg1.field9500.field9501 = arg1;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
    public class23() {
        this.field425.field9500 = this.field425;
        this.field425.field9501 = this.field425;
    }
}
