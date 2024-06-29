import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class210 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lwu;")
    private class557 field2983;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Lwu;")
    private class557 field2989;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Lwj;")
    public static class121 field2984 = null;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field2985 = 0;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lvf;")
    private class459 field2980;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Lwu;")
    public static class557 field2987;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
    public static final String[] method1392(String[] arg0, boolean arg1) {
        field2981++;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg1) {
            method1392(null, false);
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method1393(int arg0) {
        if (arg0 != -6) {
            method1393(-80);
        }
        field2987 = null;
        field2984 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lvb;Z)Lkd;")
    public final class100 method1394(class630 arg0, boolean arg1) {
        field2986++;
        if (arg0 == null) {
            return null;
        }
        class214 var3 = arg0.method210(7288);
        if (class523.field7343 == var3) {
            return new class132((class29) arg0);
        } else if (class179.field2532 == var3) {
            return new class237(this.method1395(-24248), (class271) arg0);
        } else if (class491.field6597 == var3) {
            return new class401(this.field2983, (class104) arg0);
        } else if (class395.field5485 == var3) {
            return new class235(this.field2983, (class32) arg0);
        } else if (class749.field10433 == var3) {
            return new class388(this.field2983, this.field2989, (class597) arg0);
        } else if (arg1) {
            return null;
        } else if (class540.field7551 == var3) {
            return new class151(this.field2983, this.field2989, (class751) arg0);
        } else if (class550.field7766 == var3) {
            return new class575(this.field2983, this.field2989, (class555) arg0);
        } else if (class399.field5523 == var3) {
            return new class626(this.field2983, this.field2989, (class548) arg0);
        } else if (class526.field7362 == var3) {
            return new class312(this.field2983, (class691) arg0);
        } else if (class140.field1917 == var3) {
            return new class682(this.field2983, this.field2989, (class621) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Lvf;")
    private final class459 method1395(int arg0) {
        if (arg0 != -24248) {
            field2987 = null;
        }
        if (this.field2980 == null) {
            this.field2980 = new class459();
        }
        field2982++;
        return this.field2980;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lwu;Lwu;)V")
    public class210(class557 arg0, class557 arg1) {
        this.field2983 = arg0;
        this.field2989 = arg1;
    }
}
