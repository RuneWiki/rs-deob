import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class51 extends class285 {

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "Lve;")
    private class255 field772 = class274.field4701;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "Lve;")
    public static class255 field773 = class87.method607(62, ": ");

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Lve;")
    public static class255 field764 = class87.method607(112, "<img=0>");

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "Lve;")
    public static class255 field770 = class87.method607(73, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "Lve;")
    public static class255 field774 = class87.method607(116, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "Lve;")
    public static class255 field780 = class87.method607(59, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "Ltl;")
    public static class197 field767;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "Ldg;")
    public static class307 field775;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "Lff;")
    private class47 field762;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "Lff;")
    public class47 field766;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method297(int arg0, int arg1) {
        field776++;
        if (this.field766 == null) {
            return false;
        }
        if (this.field762 == null) {
            this.method302(true);
        }
        class172 var3 = (class172) this.field762.method280((long) arg1, 29153);
        if (arg0 != -3) {
            method301((byte[]) null, 3);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLve;)Z", line = 30)
    public final boolean method298(boolean arg0, class255 arg1) {
        field777++;
        if (this.field766 == null) {
            return false;
        }
        if (this.field762 == null) {
            this.method304(754);
        }
        if (arg0) {
            this.method297(117, -14);
        }
        for (class165 var3 = (class165) this.field762.method280(arg1.method1745(65), 29153); var3 != null; var3 = (class165) this.field762.method277(105)) {
            if (var3.field2787.method1752(true, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)I", line = 59)
    public final int method299(int arg0, int arg1) {
        field761++;
        if (this.field766 == null) {
            return this.field760;
        }
        class172 var3 = (class172) this.field766.method280((long) arg1, 29153);
        if (var3 == null) {
            return this.field760;
        } else if (arg0 == -9487) {
            return var3.field2849;
        } else {
            return -97;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILrg;I)Lud;", line = 82)
    public static final class269 method300(int arg0, class88 arg1, int arg2) {
        field771++;
        int var3 = 101 % ((arg0 - 19) / 58);
        return class305.method2119(arg2, arg1, -74) ? class280.method1946(113) : null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BI)V", line = 96)
    public static final void method301(byte[] arg0, int arg1) {
        field763++;
        class70 var2 = new class70(arg0);
        var2.field1068 += arg1;
        int var3 = var2.method481(arg1 - 2);
        if (var3 != 1) {
            return;
        }
        boolean var4 = var2.method481(0) == 1;
        if (var4) {
            class198.method1426(arg1 ^ 0x2, var2);
        }
        class232.method1607((byte) -118, var2);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 120)
    private final void method302(boolean arg0) {
        this.field762 = new class47(this.field766.method276(65280));
        for (class172 var2 = (class172) this.field766.method288((byte) -42); var2 != null; var2 = (class172) this.field766.method289(112)) {
            class172 var3 = new class172((int) var2.field3568);
            this.field762.method284(true, (long) var2.field2849, var3);
        }
        if (arg0) {
            field758++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lpb;B)V", line = 144)
    public final void method303(class70 arg0, byte arg1) {
        field769++;
        while (true) {
            int var3 = arg0.method481(0);
            if (var3 == 0) {
                if (arg1 != 13) {
                    this.method304(-62);
                }
                return;
            }
            this.method306(var3, (byte) -127, arg0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 178)
    private final void method304(int arg0) {
        this.field762 = new class47(this.field766.method276(65280));
        field768++;
        class50 var2 = (class50) this.field766.method288((byte) -42);
        if (arg0 != 754) {
            this.method302(false);
        }
        while (var2 != null) {
            class165 var3 = new class165(var2.field751, (int) var2.field3568);
            this.field762.method284(true, var2.field751.method1745(65), var3);
            var2 = (class50) this.field766.method289(79);
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V", line = 200)
    public static void method305(byte arg0) {
        field774 = null;
        field775 = null;
        field767 = null;
        field773 = null;
        field780 = null;
        field770 = null;
        field764 = null;
        if (arg0 != 118) {
            method300(-69, (class88) null, -17);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLpb;)V", line = 216)
    private final void method306(int arg0, byte arg1, class70 arg2) {
        if (arg0 == 1) {
            this.field778 = arg2.method481(0);
        } else if (arg0 == 2) {
            this.field779 = arg2.method481(0);
        } else if (arg0 == 3) {
            this.field772 = arg2.method479(-1);
        } else if (arg0 == 4) {
            this.field760 = arg2.method469(121);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method423(255);
            this.field766 = new class47(class287.method2033(var4, -1410546649));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method469(97);
                class208 var7;
                if (arg0 == 5) {
                    var7 = new class50(arg2.method479(-1));
                } else {
                    var7 = new class172(arg2.method469(123));
                }
                this.field766.method284(true, (long) var6, var7);
            }
        }
        field759++;
        if (arg1 > -34) {
            this.field779 = 126;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IB)Lve;", line = 304)
    public final class255 method307(int arg0, byte arg1) {
        field765++;
        if (arg1 >= -37) {
            return (class255) null;
        } else if (this.field766 == null) {
            return this.field772;
        } else {
            class50 var3 = (class50) this.field766.method280((long) arg0, 29153);
            return var3 == null ? this.field772 : var3.field751;
        }
    }
}
