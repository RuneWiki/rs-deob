import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class646 {

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "Lno;")
    public class71 field8670 = new class71();

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "Lst;")
    public static class335 field8659 = new class335(69, 2);

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "Z")
    public static boolean field8676 = false;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "Lno;")
    private class71 field8677;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BB)V", line = 6)
    public static final void method3608(byte arg0, byte arg1) {
        if (class343.field4884 == null) {
            class343.field4884 = new byte[4][class277.field4036][class667.field9202];
        }
        field8668++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class277.field4036; var3++) {
                for (int var4 = 0; var4 < class667.field9202; var4++) {
                    class343.field4884[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 126) {
            method3613(null, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILuu;BZJIII)V", line = 42)
    public static final void method3609(int arg0, class237 arg1, byte arg2, boolean arg3, long arg4, int arg5, int arg6, int arg7) {
        if (arg2 > -84) {
            return;
        }
        class202.field2679 = arg3;
        class401.field5751 = arg5;
        field8661++;
        class438.field6107 = arg7;
        class517.field7221 = arg0;
        class217.field2826 = 1;
        class720.field10022 = arg6;
        class524.field7281 = arg1;
        class48.field726 = arg4;
        class123.field1689 = null;
        class459.field6373 = 10000;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILno;)V", line = 66)
    public final void method3610(int arg0, class71 arg1) {
        if (arg1.field1075 != null) {
            arg1.method549(6410);
        }
        field8675++;
        arg1.field1075 = this.field8670.field1075;
        arg1.field1077 = this.field8670;
        arg1.field1075.field1077 = arg1;
        arg1.field1077.field1075 = arg1;
        if (arg0 != 9289) {
            this.method3623(9);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lmba;BLno;)V", line = 84)
    private final void method3611(class646 arg0, byte arg1, class71 arg2) {
        field8678++;
        class71 var4 = this.field8670.field1075;
        int var5 = 50 / ((-arg1 - 22) / 54);
        this.field8670.field1075 = arg2.field1075;
        arg2.field1075.field1077 = this.field8670;
        if (this.field8670 != arg2) {
            arg2.field1075 = arg0.field8670.field1075;
            arg2.field1075.field1077 = arg2;
            arg0.field8670.field1075 = var4;
            var4.field1077 = arg0.field8670;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lmba;I)V", line = 118)
    public final void method3612(class646 arg0, int arg1) {
        field8669++;
        if (arg1 == 2) {
            this.method3611(arg0, (byte) 85, this.field8670.field1077);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 129)
    public static final void method3613(String arg0, byte arg1) {
        field8673++;
        if (class623.field8402 == null) {
            return;
        }
        if (arg1 != -30) {
            field8659 = null;
        }
        class724.field10050++;
        class583 var2 = class54.method400(class213.field2800, (byte) -118, class444.field6166);
        var2.field7963.method444(class712.method4007(arg0, 4927), arg1 + 158);
        var2.field7963.method510(arg0, (byte) 61);
        class463.method2838(var2, (byte) 119);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lno;I)V", line = 156)
    public final void method3614(class71 arg0, int arg1) {
        if (arg0.field1075 != null) {
            arg0.method549(arg1 + 5365);
        }
        if (arg1 != 1045) {
            this.method3612(null, -122);
        }
        field8665++;
        arg0.field1075 = this.field8670;
        arg0.field1077 = this.field8670.field1077;
        arg0.field1075.field1077 = arg0;
        arg0.field1077.field1075 = arg0;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 174)
    public final void method3615(byte arg0) {
        field8663++;
        while (true) {
            class71 var2 = this.field8670.field1077;
            if (this.field8670 == var2) {
                this.field8677 = null;
                int var3 = 16 / ((29 - arg0) / 56);
                return;
            }
            var2.method549(6410);
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(B)Z", line = 195)
    public final boolean method3616(byte arg0) {
        if (arg0 <= 10) {
            return false;
        } else {
            field8666++;
            return this.field8670.field1077 == this.field8670;
        }
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(B)Lno;", line = 211)
    public final class71 method3617(byte arg0) {
        int var2 = 2 % ((arg0 - 59) / 34);
        field8667++;
        class71 var3 = this.field8670.field1075;
        if (this.field8670 == var3) {
            this.field8677 = null;
            return null;
        } else {
            this.field8677 = var3.field1075;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)Lno;", line = 230)
    public final class71 method3618(int arg0) {
        field8662++;
        int var2 = -120 / ((18 - arg0) / 53);
        class71 var3 = this.field8670.field1077;
        if (this.field8670 == var3) {
            this.field8677 = null;
            return null;
        } else {
            this.field8677 = var3.field1077;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)Lno;", line = 252)
    public final class71 method3619(int arg0) {
        field8674++;
        if (arg0 != 0) {
            method3609(-108, null, (byte) -20, true, -13L, -96, 27, -1);
        }
        class71 var2 = this.field8677;
        if (this.field8670 == var2) {
            this.field8677 = null;
            return null;
        } else {
            this.field8677 = var2.field1077;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)Lno;", line = 274)
    public final class71 method3620(boolean arg0) {
        field8671++;
        if (arg0) {
            return null;
        }
        class71 var2 = this.field8677;
        if (this.field8670 == var2) {
            this.field8677 = null;
            return null;
        } else {
            this.field8677 = var2.field1075;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)I", line = 297)
    public final int method3621(int arg0) {
        field8660++;
        int var2 = arg0;
        for (class71 var3 = this.field8670.field1077; var3 != this.field8670; var3 = var3.field1077) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(B)V", line = 317)
    public static void method3622(byte arg0) {
        if (arg0 != 5) {
            method3622((byte) -98);
        }
        field8659 = null;
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)Lno;", line = 327)
    public final class71 method3623(int arg0) {
        field8672++;
        if (arg0 != 0) {
            this.field8670 = null;
        }
        class71 var2 = this.field8670.field1077;
        if (this.field8670 == var2) {
            return null;
        } else {
            var2.method549(6410);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V", line = 356)
    public class646() {
        this.field8670.field1075 = this.field8670;
        this.field8670.field1077 = this.field8670;
    }
}
