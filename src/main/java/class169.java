import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class169 {

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Ltf;")
    public class165 field2793 = new class165();

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2786 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2792 = " from your friend list first.";

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lhh;")
    public static class169 field2790 = new class169();

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
    public static int[] field2800 = new int[1000];

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Ldb;")
    public static class102 field2799 = new class102(50);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Ltf;")
    private class165 field2796;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method1230(byte arg0) {
        int var2 = 55 / ((arg0 - 10) / 36);
        field2787++;
        return this.field2793.field2747 == this.field2793;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILtf;)V", line = 19)
    public final void method1231(int arg0, class165 arg1) {
        field2794++;
        if (arg1.field2749 != null) {
            arg1.method1212((byte) 100);
        }
        arg1.field2747 = this.field2793.field2747;
        arg1.field2749 = this.field2793;
        arg1.field2749.field2747 = arg1;
        arg1.field2747.field2749 = arg1;
        if (arg0 >= -18) {
            this.method1232(52, (class165) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(ILtf;)V", line = 41)
    public final void method1232(int arg0, class165 arg1) {
        if (arg1.field2749 != null) {
            arg1.method1212((byte) 98);
        }
        arg1.field2747 = this.field2793;
        arg1.field2749 = this.field2793.field2749;
        field2791++;
        if (arg0 < 86) {
            this.method1234((byte) -38);
        }
        arg1.field2749.field2747 = arg1;
        arg1.field2747.field2749 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 62)
    public final void method1233(int arg0) {
        if (arg0 != 30602) {
            field2799 = (class102) null;
        }
        field2784++;
        while (true) {
            class165 var2 = this.field2793.field2747;
            if (this.field2793 == var2) {
                this.field2796 = null;
                return;
            }
            var2.method1212((byte) 95);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Ltf;", line = 93)
    public final class165 method1234(byte arg0) {
        field2783++;
        class165 var2 = this.field2793.field2747;
        if (this.field2793 == var2) {
            return null;
        } else {
            var2.method1212((byte) 109);
            return arg0 <= 12 ? (class165) null : var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Ltf;", line = 113)
    public final class165 method1235(boolean arg0) {
        field2788++;
        if (arg0) {
            field2799 = (class102) null;
        }
        class165 var2 = this.field2796;
        if (this.field2793 == var2) {
            this.field2796 = null;
            return null;
        } else {
            this.field2796 = var2.field2747;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)Ltf;", line = 135)
    public final class165 method1236(byte arg0) {
        class165 var2 = this.field2793.field2749;
        field2798++;
        if (this.field2793 == var2) {
            this.field2796 = null;
            return null;
        } else if (arg0 >= -16) {
            return (class165) null;
        } else {
            this.field2796 = var2.field2749;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Log;B)Z", line = 156)
    public static final boolean method1237(class157 arg0, byte arg1) {
        if (arg1 <= 67) {
            method1241(-35);
        }
        field2797++;
        if (arg0.field2467 == 205) {
            class103.field1511 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 274)
    public class169() {
        this.field2793.field2747 = this.field2793;
        this.field2793.field2749 = this.field2793;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIII)I", line = 190)
    public static final int method1238(byte arg0, int arg1, int arg2, int arg3) {
        field2789++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (arg0 >= -118) {
            return 90;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Ltf;", line = 219)
    public final class165 method1239(int arg0) {
        if (arg0 >= -38) {
            this.method1230((byte) 49);
        }
        class165 var2 = this.field2796;
        field2795++;
        if (this.field2793 == var2) {
            this.field2796 = null;
            return null;
        } else {
            this.field2796 = var2.field2749;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Ltf;", line = 239)
    public final class165 method1240(int arg0) {
        field2785++;
        if (arg0 != 3) {
            method1241(-26);
        }
        class165 var2 = this.field2793.field2747;
        if (this.field2793 == var2) {
            this.field2796 = null;
            return null;
        } else {
            this.field2796 = var2.field2747;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 262)
    public static void method1241(int arg0) {
        field2792 = null;
        field2800 = null;
        field2786 = null;
        field2790 = null;
        field2799 = null;
        int var1 = 75 % ((65 - arg0) / 50);
    }
}
