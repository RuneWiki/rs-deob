import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class299 {

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Ljava/lang/String;")
    private String field3850 = "null";

    @OriginalMember(owner = "client!st", name = "e", descriptor = "C")
    public char field3847;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "C")
    public char field3851;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "F")
    public static float field3854;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    private int field3856;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Lek;")
    public class352 field3848;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "Lek;")
    private class352 field3855;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "Lkc;")
    public static class87 field3853;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static void method1764(int arg0) {
        field3853 = null;
        if (arg0 != -3078) {
            field3853 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method1765(int arg0, byte arg1) {
        field3843++;
        if (this.field3848 == null) {
            return this.field3850;
        }
        class441 var3 = (class441) this.field3848.method2022(-1, (long) arg0);
        if (arg1 == -108) {
            return var3 == null ? this.field3850 : var3.field6312;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(IB)I")
    public final int method1766(int arg0, byte arg1) {
        field3852++;
        if (this.field3848 == null) {
            return this.field3856;
        }
        if (arg1 < 100) {
            this.method1765(-66, (byte) 119);
        }
        class101 var3 = (class101) this.field3848.method2022(-1, (long) arg0);
        return var3 == null ? this.field3856 : var3.field1222;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method1767(boolean arg0, String arg1) {
        field3857++;
        if (this.field3848 == null) {
            return false;
        } else if (arg0) {
            return false;
        } else {
            if (this.field3855 == null) {
                this.method1771(118);
            }
            for (class82 var3 = (class82) this.field3855.method2022(-1, class175.method1119((byte) -80, arg1)); var3 != null; var3 = (class82) this.field3855.method2020((byte) -19)) {
                if (var3.field1043.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IILfh;)V")
    private final void method1768(int arg0, int arg1, class463 arg2) {
        if (arg0 == 1) {
            this.field3847 = class511.method3054(arg2.method2793(arg1 + 32771), true);
        } else if (arg0 == 2) {
            this.field3851 = class511.method3054(arg2.method2793(arg1 ^ 0xFFFF8003), true);
        } else if (arg0 == 3) {
            this.field3850 = arg2.method2768((byte) -63);
        } else if (arg0 == 4) {
            this.field3856 = arg2.method2727(arg1 - 122);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method2758((byte) 92);
            this.field3848 = new class352(class60.method550(110, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2727(-91);
                class383 var7;
                if (arg0 == 5) {
                    var7 = new class441(arg2.method2768((byte) -116));
                } else {
                    var7 = new class101(arg2.method2727(-75));
                }
                this.field3848.method2019((byte) -79, var7, (long) var6);
            }
        }
        if (arg1 != -4) {
            this.field3848 = null;
        }
        field3844++;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
    private final void method1769(int arg0) {
        field3845++;
        this.field3855 = new class352(this.field3848.method2023(false));
        class101 var2 = (class101) this.field3848.method2021(72);
        if (arg0 >= -55) {
            return;
        }
        while (var2 != null) {
            class101 var3 = new class101((int) var2.field5043);
            this.field3855.method2019((byte) -58, var3, (long) var2.field1222);
            var2 = (class101) this.field3848.method2017(-31);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lfh;Z)V")
    public final void method1770(class463 arg0, boolean arg1) {
        if (arg1) {
            this.method1767(true, null);
        }
        field3858++;
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                return;
            }
            this.method1768(var3, -4, arg0);
        }
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
    private final void method1771(int arg0) {
        this.field3855 = new class352(this.field3848.method2023(false));
        field3849++;
        for (class441 var2 = (class441) this.field3848.method2021(-80); var2 != null; var2 = (class441) this.field3848.method2017(107)) {
            class82 var4 = new class82(var2.field6312, (int) var2.field5043);
            this.field3855.method2019((byte) -38, var4, class175.method1119((byte) -80, var2.field6312));
        }
        int var3 = -91 % ((arg0 - 33) / 57);
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(IB)Z")
    public final boolean method1772(int arg0, byte arg1) {
        field3846++;
        if (this.field3848 == null) {
            return false;
        }
        if (arg1 != 13) {
            method1764(-116);
        }
        if (this.field3855 == null) {
            this.method1769(-87);
        }
        class101 var3 = (class101) this.field3855.method2022(-1, (long) arg0);
        return var3 != null;
    }
}
