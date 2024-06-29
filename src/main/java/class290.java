import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class290 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[Lae;")
    public static class156[] field4144 = new class156[2048];

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public int field4145;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    private int field4152;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lfu;")
    public class254 field4150;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4155;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IC)C")
    public static final char method1751(int arg0, char arg1) {
        field4148++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg0 != 3) {
            return 'M';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILae;)V")
    public final void method1752(int arg0, class156 arg1) {
        if (arg0 != -26114) {
            this.method1752(-117, null);
        }
        field4151++;
        while (true) {
            int var3 = arg1.method941((byte) 126);
            if (var3 == 0) {
                return;
            }
            this.method1753(arg1, (byte) -96, var3);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lae;BI)V")
    private final void method1753(class156 arg0, byte arg1, int arg2) {
        field4153++;
        int var4 = 49 / ((-arg1 - 4) / 34);
        if (arg2 == 1) {
            this.field4152 = arg0.method993((byte) -102);
        } else if (arg2 == 2) {
            this.field4147 = arg0.method941((byte) 125);
            this.field4145 = arg0.method941((byte) 124);
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lll;Z)V")
    public static final void method1754(class234 arg0, boolean arg1) {
        field4154++;
        if (class358.field5312 == null) {
            return;
        }
        class113 var2 = null;
        if (arg0.field3284 == 0) {
            var2 = (class113) class478.method2795(arg0.field3276, arg0.field3283, arg0.field3280);
        }
        if (arg0.field3284 == 1) {
            var2 = (class113) class305.method1832(arg0.field3276, arg0.field3283, arg0.field3280);
        }
        if (arg0.field3284 == 2) {
            var2 = (class113) class124.method701(arg0.field3276, arg0.field3283, arg0.field3280, field4155 == null ? (field4155 = method1758("sq")) : field4155);
        }
        if (arg0.field3284 == 3) {
            var2 = (class113) class79.method515(arg0.field3276, arg0.field3283, arg0.field3280);
        }
        if (!arg1) {
            method1754(null, false);
        }
        if (var2 == null) {
            arg0.field3285 = 0;
            arg0.field3282 = -1;
            arg0.field3278 = 0;
        } else {
            arg0.field3282 = var2.method369((byte) 49);
            arg0.field3278 = var2.method362((byte) -72);
            arg0.field3285 = var2.method359(13228);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
    public static final void method1755(int arg0, byte arg1) {
        field4149++;
        class221.field3113 = arg0;
        class5 var2 = class124.field1607;
        synchronized (class124.field1607) {
            class124.field1607.method38((byte) -112);
        }
        class5 var3 = class151.field1951;
        synchronized (class151.field1951) {
            class151.field1951.method38((byte) -74);
        }
        int var4 = -15 / ((arg1 + 70) / 54);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1756(int arg0) {
        int var1 = -91 / ((arg0 - 53) / 58);
        field4144 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Lpi;")
    public final synchronized class328 method1757(int arg0) {
        field4146++;
        class328 var2 = (class328) this.field4150.field3672.method40(0, (long) this.field4152);
        if (var2 != null) {
            return var2;
        }
        class328 var3 = class328.method1978(this.field4150.field3671, this.field4152, 0);
        if (arg0 != 21512) {
            this.method1757(-20);
        }
        if (var3 != null) {
            this.field4150.field3672.method36(-20960, var3, (long) this.field4152);
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1758(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
