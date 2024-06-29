import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class54 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
    private boolean field612 = false;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    private int field614 = -1;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field610 = new String[0];

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Lbd;")
    public static class60 field623 = new class60(10, 2);

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
    public static int[] field624 = new int[8];

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Loia;")
    public static class88 field622;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field625;

    @OriginalMember(owner = "client!mk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field619++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field614; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field610[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method330(String arg0, int arg1) {
        this.method331(-16808, this.field614 + 1, arg0);
        if (arg1 <= -28) {
            field618++;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method331(int arg0, int arg1, String arg2) {
        if (this.field614 < arg1) {
            this.field614 = arg1;
        }
        if (arg0 != -16808) {
            this.field613 = 15;
        }
        field611++;
        if (this.field610.length <= arg1) {
            this.method337(arg1, -30686);
        }
        this.field610[arg1] = arg2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I")
    private final int method332(int arg0, int arg1) {
        field620++;
        int var3 = this.field610.length;
        while (var3 <= arg1) {
            if (!this.field612) {
                var3 += this.field613;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field613 * var3;
            }
        }
        if (arg0 != -26048) {
            this.field614 = -17;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method333(int arg0) {
        field616++;
        String[] var2 = new String[this.field614 + arg0];
        class255.method1693(this.field610, 0, var2, 0, this.field614 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method334(int arg0) {
        field624 = null;
        if (arg0 > 54) {
            field622 = null;
            field625 = null;
            field623 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBII)I")
    public static final int method335(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 103) {
            method336(-16, 23, 47, -100, null, -47);
        }
        field621++;
        int var5 = 65536 - class164.field2252[arg0 * 8192 / arg1] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILha;I)V")
    public static final void method336(int arg0, int arg1, int arg2, int arg3, class58 arg4, int arg5) {
        class263.field3799 = arg4;
        field615++;
        class210.field2759 = class263.field3799.method427();
        class363.field5149 = class263.field3799.method427();
        class274.field3912 = class263.field3799.method427();
        class221.field2883 = 0;
        class335.field4673 = arg1;
        class378.field5372 = arg2;
        class518.field7371 = null;
        class448.field6358 = null;
        class492.method2930(arg3, ~arg5, arg0);
        class407.field5772 = -1;
        class473.field6702 = -1;
        class650.field8925 = arg5;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V")
    private final void method337(int arg0, int arg1) {
        field617++;
        String[] var3 = new String[this.method332(-26048, arg0)];
        if (arg1 == -30686) {
            class255.method1693(this.field610, 0, var3, 0, this.field610.length);
            this.field610 = var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IZ)V")
    public class54(int arg0, boolean arg1) {
        this.field613 = arg0;
        this.field612 = arg1;
    }
}
