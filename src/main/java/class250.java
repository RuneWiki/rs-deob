import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class250 {

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lpi;")
    private class203 field4239 = new class203();

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lmh;")
    public static class62 field4243 = class201.method1405(true, "Angreifen");

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[Lwc;")
    public static class218[] field4244 = new class218[4];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lpi;")
    private class203 field4245;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 21)
    public final void method1735(int arg0) {
        if (arg0 != -3739) {
            method1741((class26) null, 97, 108, -111);
        }
        while (true) {
            class203 var2 = this.field4239.field3425;
            if (this.field4239 == var2) {
                field4237++;
                this.field4245 = null;
                return;
            }
            var2.method1421(-95);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)Lmh;", line = 48)
    public static final class62 method1736(byte arg0, int arg1) {
        field4240++;
        return arg0 > -105 ? (class62) null : class254.method1772(new class62[] { class42.method284(arg1 >> 24 & 0xFF, -121), class151.field2373, class42.method284(arg1 >> 16 & 0xFF, -118), class151.field2373, class42.method284(arg1 >> 8 & 0xFF, -123), class151.field2373, class42.method284(arg1 & 0xFF, -119) }, 0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lpi;I)V", line = 71)
    public final void method1737(class203 arg0, int arg1) {
        field4242++;
        if (arg0.field3431 != null) {
            arg0.method1421(36);
        }
        arg0.field3425 = this.field4239;
        arg0.field3431 = this.field4239.field3431;
        arg0.field3431.field3425 = arg0;
        int var3 = 109 / ((49 - arg1) / 45);
        arg0.field3425.field3431 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 88)
    public static void method1738(byte arg0) {
        field4244 = null;
        field4243 = null;
        int var1 = 123 / ((-arg0 - 25) / 49);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 189)
    public class250() {
        this.field4239.field3431 = this.field4239;
        this.field4239.field3425 = this.field4239;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Lpi;", line = 106)
    public final class203 method1739(byte arg0) {
        field4234++;
        if (arg0 <= 25) {
            this.method1739((byte) 11);
        }
        class203 var2 = this.field4245;
        if (this.field4239 == var2) {
            this.field4245 = null;
            return null;
        } else {
            this.field4245 = var2.field3425;
            return var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Lpi;", line = 131)
    public final class203 method1740(byte arg0) {
        if (arg0 > -104) {
            field4246 = 113;
        }
        class203 var2 = this.field4239.field3425;
        field4236++;
        if (this.field4239 == var2) {
            return null;
        } else {
            var2.method1421(-115);
            return var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhi;III)[Lfd;", line = 151)
    public static final class61[] method1741(class26 arg0, int arg1, int arg2, int arg3) {
        int var4 = 33 / ((arg1 + 25) / 55);
        field4233++;
        return class127.method951(arg0, arg2, 83, arg3) ? class75.method570(21823) : null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Lpi;", line = 164)
    public final class203 method1742(int arg0) {
        if (arg0 != 255) {
            this.method1737((class203) null, 47);
        }
        field4241++;
        class203 var2 = this.field4239.field3425;
        if (this.field4239 == var2) {
            this.field4245 = null;
            return null;
        } else {
            this.field4245 = var2.field3425;
            return var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 198)
    public static final void method1743(boolean arg0) {
        if (arg0) {
            class37.field569 = class41.field632;
            class256.field4320 = class84.field1378;
            class101.field1662 = class173.field2790;
        } else {
            class37.field569 = class72.field1106;
            class256.field4320 = class43.field658;
            class101.field1662 = class73.field1124;
        }
        class164.field2669 = class256.field4320.length;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lsg;B)V", line = 217)
    public static final void method1744(class191 arg0, byte arg1) {
        field4235++;
        if (class150.field2368 == arg0.field3094) {
            class220.field3784[arg0.field3207] = true;
        }
        int var2 = -36 / ((14 - arg1) / 57);
    }
}
