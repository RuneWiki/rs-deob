import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class273 {

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lq;")
    private class209 field4591 = new class209();

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field4590 = 0;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Luf;")
    private static class168 field4595 = class148.method1019(-1720, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729");

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field4588 = -2;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Luf;")
    public static class168 field4589 = field4595;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Luf;")
    private static class168 field4598 = class148.method1019(-1720, "Loaded fonts");

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Luf;")
    public static class168 field4592 = class148.method1019(-1720, " loggt sich aus)3");

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Luf;")
    public static class168 field4584 = field4598;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lq;")
    private class209 field4599;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "[[[Lsb;")
    public static class127[][][] field4594;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 6)
    public final void method1883(int arg0) {
        if (arg0 != 5) {
            this.method1884(-98);
        }
        field4587++;
        while (true) {
            class209 var2 = this.field4591.field3453;
            if (this.field4591 == var2) {
                this.field4599 = null;
                return;
            }
            var2.method1464((byte) 84);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)Lq;", line = 28)
    public final class209 method1884(int arg0) {
        field4585++;
        class209 var2 = this.field4591.field3453;
        if (arg0 != 11109) {
            field4592 = (class168) null;
        }
        if (this.field4591 == var2) {
            this.field4599 = null;
            return null;
        } else {
            this.field4599 = var2.field3453;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)Lq;", line = 51)
    public final class209 method1885(byte arg0) {
        class209 var2 = this.field4599;
        if (arg0 != 0) {
            return (class209) null;
        }
        field4600++;
        if (this.field4591 == var2) {
            this.field4599 = null;
            return null;
        } else {
            this.field4599 = var2.field3453;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)Lq;", line = 78)
    public final class209 method1886(int arg0) {
        class209 var2 = this.field4591.field3453;
        field4597++;
        if (this.field4591 == var2) {
            return null;
        } else if (arg0 >= -17) {
            return (class209) null;
        } else {
            var2.method1464((byte) 84);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 94)
    public static void method1887(int arg0) {
        field4594 = (class127[][][]) null;
        field4592 = null;
        field4598 = null;
        if (arg0 > 20) {
            field4589 = null;
            field4595 = null;
            field4584 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[Lvk;)V", line = 118)
    public static final void method1888(int arg0, class192[] arg1) {
        class216.field3514[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lq;I)V", line = 127)
    public final void method1889(class209 arg0, int arg1) {
        if (arg0.field3452 != null) {
            arg0.method1464((byte) 84);
        }
        arg0.field3453 = this.field4591.field3453;
        field4596++;
        arg0.field3452 = this.field4591;
        arg0.field3452.field3453 = arg0;
        arg0.field3453.field3452 = arg0;
        if (arg1 != -124) {
            this.method1883(112);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lq;Z)V", line = 165)
    public final void method1890(class209 arg0, boolean arg1) {
        field4593++;
        if (arg0.field3452 != null) {
            arg0.method1464((byte) 84);
        }
        if (!arg1) {
            arg0.field3452 = this.field4591.field3452;
            arg0.field3453 = this.field4591;
            arg0.field3452.field3453 = arg0;
            arg0.field3453.field3452 = arg0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 197)
    public class273() {
        this.field4591.field3453 = this.field4591;
        this.field4591.field3452 = this.field4591;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lfj;II)V", line = 215)
    public static final void method1891(class283 arg0, int arg1, int arg2) {
        field4586++;
        if (arg2 != 5) {
            method1887(121);
        }
        if (class114.field1779 == null) {
            class79.method485(0, true, (class283) null, (byte) 0, 255, 102, 255);
            class25.field305[arg1] = arg0;
        } else {
            class114.field1779.field2367 = arg1 * 8 + 5;
            int var3 = class114.field1779.method1089((byte) -14);
            int var4 = class114.field1779.method1089((byte) -14);
            arg0.method1957(var3, var4, (byte) 111);
        }
    }
}
