import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class340 {

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "Luu;")
    private class237 field4811;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "Luu;")
    private class237 field4808;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "Lcp;")
    private class325 field4809;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)Lcp;", line = 5)
    private final class325 method2165(boolean arg0) {
        field4810++;
        if (this.field4809 == null) {
            this.field4809 = new class325();
        }
        if (arg0) {
            this.field4811 = null;
        }
        return this.field4809;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lsa;I)Lvd;", line = 23)
    public final class37 method2166(class205 arg0, int arg1) {
        field4807++;
        if (arg0 == null) {
            return null;
        }
        class288 var3 = arg0.method1206(false);
        if (class731.field10160 == var3) {
            return new class371((class415) arg0);
        } else if (class757.field10565 == var3) {
            return new class146(this.method2165(false), (class197) arg0);
        } else {
            if (arg1 != 14032) {
                this.field4809 = null;
            }
            if (class550.field7651 == var3) {
                return new class710(this.field4811, (class549) arg0);
            } else if (class687.field9560 == var3) {
                return new class43(this.field4811, (class754) arg0);
            } else if (class498.field6963 == var3) {
                return new class757(this.field4811, this.field4808, (class275) arg0);
            } else if (class220.field2975 == var3) {
                return new class236(this.field4811, this.field4808, (class204) arg0);
            } else if (class63.field991 == var3) {
                return new class85(this.field4811, this.field4808, (class504) arg0);
            } else if (class588.field8005 == var3) {
                return new class181(this.field4811, this.field4808, (class667) arg0);
            } else if (class318.field4422 == var3) {
                return new class414(this.field4811, (class691) arg0);
            } else if (class548.field7624 == var3) {
                return new class462(this.field4811, this.field4808, (class472) arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZZ)Z", line = 76)
    public static boolean method2167(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Luu;Luu;)V", line = 84)
    public class340(class237 arg0, class237 arg1) {
        this.field4811 = arg0;
        this.field4808 = arg1;
    }
}
