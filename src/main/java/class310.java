import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class310 {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lsga;")
    private class76 field4608 = new class76();

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lofa;")
    public static class345 field4609 = new class345(1);

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Lks;")
    public static class460 field4612 = new class460("", 13);

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Lrm;")
    public static class428 field4615 = new class428();

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Lsga;")
    private class76 field4611;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 3)
    public final void method2024(byte arg0) {
        if (arg0 > -92) {
            this.method2032(-37);
        }
        field4602++;
        while (true) {
            class76 var2 = this.field4608.field1019;
            if (this.field4608 == var2) {
                this.field4611 = null;
                return;
            }
            var2.method592(2);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)Lsga;", line = 28)
    public final class76 method2025(byte arg0) {
        field4614++;
        class76 var2 = this.field4611;
        if (this.field4608 == var2) {
            this.field4611 = null;
            return null;
        }
        if (arg0 != -88) {
            method2028((byte) -48);
        }
        this.field4611 = var2.field1019;
        return var2;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLsga;)V", line = 52)
    public final void method2026(byte arg0, class76 arg1) {
        if (arg0 != 51) {
            return;
        }
        if (arg1.field1023 != null) {
            arg1.method592(arg0 ^ 0x31);
        }
        field4605++;
        arg1.field1019 = this.field4608;
        arg1.field1023 = this.field4608.field1023;
        arg1.field1023.field1019 = arg1;
        arg1.field1019.field1023 = arg1;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I", line = 73)
    public final int method2027(int arg0) {
        field4610++;
        if (arg0 > -27) {
            this.field4611 = null;
        }
        int var2 = 0;
        for (class76 var3 = this.field4608.field1019; var3 != this.field4608; var3 = var3.field1019) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V", line = 95)
    public static void method2028(byte arg0) {
        field4615 = null;
        field4609 = null;
        field4612 = null;
        if (arg0 != 92) {
            method2028((byte) 90);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Lsga;", line = 107)
    public final class76 method2029(int arg0) {
        field4606++;
        if (arg0 != 13) {
            field4616 = 11;
        }
        class76 var2 = this.field4608.field1019;
        if (this.field4608 == var2) {
            return null;
        } else {
            var2.method592(2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)Z", line = 127)
    public final boolean method2030(byte arg0) {
        int var2 = 109 / ((arg0 - 51) / 32);
        field4607++;
        return this.field4608.field1019 == this.field4608;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Z", line = 137)
    public static final boolean method2031(int arg0, int arg1, int arg2) {
        field4603++;
        if (arg0 != 2048) {
            field4616 = -83;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 207)
    public class310() {
        this.field4608.field1023 = this.field4608;
        this.field4608.field1019 = this.field4608;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)Lsga;", line = 155)
    public final class76 method2032(int arg0) {
        field4613++;
        class76 var2 = this.field4608.field1023;
        if (this.field4608 == var2) {
            this.field4611 = null;
            return null;
        }
        this.field4611 = var2.field1023;
        if (arg0 < 36) {
            field4612 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Lsga;", line = 185)
    public final class76 method2033(int arg0) {
        if (arg0 != 0) {
            this.method2026((byte) 5, null);
        }
        field4604++;
        class76 var2 = this.field4608.field1019;
        if (this.field4608 == var2) {
            this.field4611 = null;
            return null;
        } else {
            this.field4611 = var2.field1019;
            return var2;
        }
    }
}
