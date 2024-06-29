import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class165 {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lsja;")
    public class69 field2103 = new class69();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "F")
    public static float field2100;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "F")
    public static float field2110;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lsja;")
    private class69 field2113;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
    public static int[] field2105;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lsja;", line = 6)
    public final class69 method1033(int arg0) {
        if (arg0 != -1) {
            return null;
        }
        field2101++;
        class69 var2 = this.field2113;
        if (this.field2103 == var2) {
            this.field2113 = null;
            return null;
        } else {
            this.field2113 = var2.field767;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lsja;", line = 33)
    public final class69 method1034(int arg0) {
        field2115++;
        class69 var2 = this.field2103.field767;
        if (this.field2103 == var2) {
            return null;
        } else if (arg0 == 20791) {
            var2.method527(-11229);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 260)
    public class165() {
        this.field2103.field767 = this.field2103;
        this.field2103.field760 = this.field2103;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Lsja;", line = 60)
    public final class69 method1035(byte arg0) {
        field2107++;
        class69 var2 = this.field2113;
        if (arg0 != 91) {
            field2117 = 110;
        }
        if (this.field2103 == var2) {
            this.field2113 = null;
            return null;
        } else {
            this.field2113 = var2.field760;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)I", line = 81)
    public final int method1036(byte arg0) {
        field2108++;
        int var2 = 0;
        class69 var3 = this.field2103.field767;
        while (this.field2103 != var3) {
            var3 = var3.field767;
            var2++;
        }
        int var4 = 96 % ((arg0 - 63) / 34);
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 104)
    public static void method1037(int arg0) {
        if (arg0 < 19) {
            method1043((byte) -115, 64, 63);
        }
        field2105 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;ILsja;)V", line = 117)
    private final void method1038(class165 arg0, int arg1, class69 arg2) {
        field2114++;
        class69 var4 = this.field2103.field760;
        this.field2103.field760 = arg2.field760;
        arg2.field760.field767 = this.field2103;
        if (arg1 > -101) {
            field2105 = null;
        }
        if (this.field2103 != arg2) {
            arg2.field760 = arg0.field2103.field760;
            arg2.field760.field767 = arg2;
            arg0.field2103.field760 = var4;
            var4.field767 = arg0.field2103;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lsja;I)V", line = 140)
    public final void method1039(class69 arg0, int arg1) {
        if (arg1 != 0) {
            method1043((byte) 80, -86, -128);
        }
        field2102++;
        if (arg0.field760 != null) {
            arg0.method527(-11229);
        }
        arg0.field767 = this.field2103;
        arg0.field760 = this.field2103.field760;
        arg0.field760.field767 = arg0;
        arg0.field767.field760 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;I)V", line = 158)
    public final void method1040(class165 arg0, int arg1) {
        field2116++;
        this.method1038(arg0, -111, this.field2103.field767);
        if (arg1 != 11656) {
            this.method1042(null, -20);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lsja;", line = 169)
    public final class69 method1041(int arg0) {
        field2106++;
        class69 var2 = this.field2103.field767;
        if (arg0 != 1048832) {
            field2117 = 100;
        }
        if (this.field2103 == var2) {
            this.field2113 = null;
            return null;
        } else {
            this.field2113 = var2.field767;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lsja;I)V", line = 189)
    public final void method1042(class69 arg0, int arg1) {
        field2111++;
        if (arg0.field760 != null) {
            arg0.method527(-11229);
        }
        arg0.field760 = this.field2103;
        arg0.field767 = this.field2103.field767;
        if (arg1 != 1048832) {
            field2117 = -104;
        }
        arg0.field760.field767 = arg0;
        arg0.field767.field760 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)Z", line = 206)
    public static final boolean method1043(byte arg0, int arg1, int arg2) {
        if (arg0 >= -82) {
            field2100 = 4.0516295F;
        }
        field2104++;
        return (arg1 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Z", line = 217)
    public final boolean method1044(int arg0) {
        field2099++;
        if (arg0 == 21972) {
            return this.field2103.field767 == this.field2103;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lsja;", line = 234)
    public final class69 method1045(byte arg0) {
        field2109++;
        class69 var2 = this.field2103.field760;
        if (this.field2103 == var2) {
            this.field2113 = null;
            return null;
        }
        if (arg0 != -128) {
            this.method1035((byte) -17);
        }
        this.field2113 = var2.field760;
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V", line = 269)
    public final void method1046(byte arg0) {
        while (true) {
            class69 var2 = this.field2103.field767;
            if (this.field2103 == var2) {
                field2112++;
                int var3 = 16 / ((70 - arg0) / 55);
                this.field2113 = null;
                return;
            }
            var2.method527(-11229);
        }
    }
}
