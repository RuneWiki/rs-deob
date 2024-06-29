import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class8 {

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lgp;")
    private class349 field118 = new class349();

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
    public static int[] field108 = new int[32];

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field110 = "scroll:";

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field114 = null;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field111 = -2;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field106 = "Please wait...";

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Lgp;")
    private class349 field121;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method46(byte arg0) {
        field114 = null;
        field108 = null;
        field110 = null;
        if (arg0 != 60) {
            method51(-45);
        }
        field106 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z")
    public final boolean method47(boolean arg0) {
        field119++;
        if (arg0) {
            this.method53((byte) -110);
        }
        return this.field118.field5193 == this.field118;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        field109++;
        while (true) {
            class349 var2 = this.field118.field5193;
            if (this.field118 == var2) {
                this.field121 = null;
                if (arg0 == 22754) {
                    return;
                } else {
                    method55(-70);
                    return;
                }
            }
            var2.method2308(-33);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method49(int arg0) {
        field113++;
        int var2 = arg0;
        for (class349 var3 = this.field118.field5193; var3 != this.field118; var3 = var3.field5193) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lgp;B)V")
    public final void method50(class349 arg0, byte arg1) {
        int var3 = -113 % ((arg1 - 3) / 60);
        if (arg0.field5194 != null) {
            arg0.method2308(-92);
        }
        field107++;
        arg0.field5194 = this.field118.field5194;
        arg0.field5193 = this.field118;
        arg0.field5194.field5193 = arg0;
        arg0.field5193.field5194 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public static final void method51(int arg0) {
        class51 var1 = class239.field3357;
        synchronized (class239.field3357) {
            class239.field3357.method366(-79);
        }
        int var2 = -58 / ((39 - arg0) / 50);
        field123++;
        class51 var3 = class390.field5701;
        synchronized (class390.field5701) {
            class390.field5701.method366(-81);
        }
        class216 var4 = class444.field6413;
        synchronized (class444.field6413) {
            class444.field6413.method1427(15477);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)Lgp;")
    public final class349 method52(byte arg0) {
        field117++;
        class349 var2 = this.field118.field5193;
        if (this.field118 == var2) {
            return null;
        }
        var2.method2308(-104);
        if (arg0 != -58) {
            field112 = -89;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Lgp;")
    public final class349 method53(byte arg0) {
        field122++;
        class349 var2 = this.field121;
        if (this.field118 == var2) {
            this.field121 = null;
            return null;
        }
        this.field121 = var2.field5193;
        if (arg0 <= 120) {
            this.method47(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Lgp;")
    public final class349 method54(byte arg0) {
        if (arg0 != 18) {
            this.field118 = null;
        }
        field115++;
        class349 var2 = this.field118.field5193;
        if (this.field118 == var2) {
            this.field121 = null;
            return null;
        } else {
            this.field121 = var2.field5193;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Ljr;")
    public static final class440 method55(int arg0) {
        field116++;
        if (arg0 != 0) {
            method46((byte) 31);
        }
        class440 var1 = (class440) class203.field2801.method1157(arg0 ^ 0x7A);
        if (var1 != null) {
            var1.method2632(true);
            var1.method2764((byte) 119);
            return var1;
        }
        class440 var2;
        do {
            var2 = (class440) class122.field1581.method1157(arg0 + 125);
            if (var2 == null) {
                return null;
            }
            if (var2.method2754(false) > class98.method768((byte) -87)) {
                return null;
            }
            var2.method2632(true);
            var2.method2764((byte) 119);
        } while ((Long.MIN_VALUE & var2.field6404) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class8() {
        this.field118.field5193 = this.field118;
        this.field118.field5194 = this.field118;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)Lgp;")
    public final class349 method56(int arg0) {
        field120++;
        if (arg0 != -30010) {
            return null;
        }
        class349 var2 = this.field118.field5194;
        if (this.field118 == var2) {
            this.field121 = null;
            return null;
        } else {
            this.field121 = var2.field5194;
            return var2;
        }
    }
}
