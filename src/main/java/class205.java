import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class205 {

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Luj;")
    public class155 field3025 = new class155();

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[Lmm;")
    public static class114[] field3028 = new class114[14];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Luj;")
    private class155 field3027;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static void method1447(boolean arg0) {
        field3028 = null;
        if (arg0) {
            field3028 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)Luj;")
    public final class155 method1448(boolean arg0) {
        if (arg0) {
            this.field3025 = null;
        }
        class155 var2 = this.field3027;
        field3020++;
        if (this.field3025 == var2) {
            this.field3027 = null;
            return null;
        } else {
            this.field3027 = var2.field2420;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method1449(int arg0) {
        field3024++;
        if (arg0 != -12452) {
            this.field3025 = null;
        }
        while (true) {
            class155 var2 = this.field3025.field2420;
            if (this.field3025 == var2) {
                this.field3027 = null;
                return;
            }
            var2.method1135(false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(Z)Luj;")
    public final class155 method1450(boolean arg0) {
        field3021++;
        if (arg0) {
            return null;
        }
        class155 var2 = this.field3025.field2420;
        if (this.field3025 == var2) {
            this.field3027 = null;
            return null;
        } else {
            this.field3027 = var2.field2420;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(Z)I")
    public final int method1451(boolean arg0) {
        field3029++;
        int var2 = 0;
        if (!arg0) {
            return -108;
        }
        class155 var3 = this.field3025.field2420;
        while (this.field3025 != var3) {
            var3 = var3.field2420;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Luj;")
    public final class155 method1452(byte arg0) {
        if (arg0 != 23) {
            field3028 = null;
        }
        field3019++;
        class155 var2 = this.field3025.field2420;
        if (this.field3025 == var2) {
            return null;
        } else {
            var2.method1135(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILuj;)V")
    public final void method1453(int arg0, class155 arg1) {
        field3022++;
        if (arg1.field2424 != null) {
            arg1.method1135(false);
        }
        arg1.field2424 = this.field3025.field2424;
        arg1.field2420 = this.field3025;
        arg1.field2424.field2420 = arg1;
        int var3 = -10 % ((arg0 + 11) / 44);
        arg1.field2420.field2424 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class205() {
        this.field3025.field2424 = this.field3025;
        this.field3025.field2420 = this.field3025;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Z")
    public static final boolean method1454(int arg0) {
        field3023++;
        try {
            if (arg0 != 0) {
                field3028 = null;
            }
            return class251.method1734(-3);
        } catch (IOException var4) {
            class6.method35(arg0 - 72);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class45.field592 + "," + class304.field4926 + "," + class274.field4433 + " - " + class162.field2510 + "," + (class213.field3139.field3761[0] + class163.field2520) + "," + (class213.field3139.field3686[0] + class149.field2390) + " - ";
            for (int var3 = 0; var3 < class162.field2510 && var3 < 50; var3++) {
                var2 = var2 + class92.field1488.field758[var3] + ",";
            }
            class5.method27(110, var2, var5);
            class115.method861(arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)J")
    public static final long method1455(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        return var3 == null || var3.field5012 == null ? 0L : var3.field5012.field3393;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLjava/lang/String;)I")
    public static final int method1456(int arg0, byte arg1, String arg2) {
        field3026++;
        if (arg1 != -56) {
            method1454(-84);
        }
        return class57.method401(arg2, arg0, arg1 ^ 0xFFFFFFA4, true);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(Z)Ljava/lang/String;")
    public static final String method1457(boolean arg0) {
        field3018++;
        String var1;
        if (class165.field2539 == 1 && class147.field2360 < 2) {
            var1 = class260.field4026 + class62.field945 + class221.field3221 + " ->";
        } else if (class6.field57 && class147.field2360 < 2) {
            var1 = class169.field2567 + class62.field945 + class136.field2220 + " ->";
        } else if (class225.field3307 && class82.field1326[81] && class147.field2360 > 2) {
            var1 = class207.method1462(class147.field2360 - 2, -1);
        } else {
            var1 = class207.method1462(class147.field2360 - 1, -1);
        }
        if (class147.field2360 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class147.field2360 - 2) + class107.field1821;
        }
        if (arg0) {
            field3028 = null;
        }
        return var1;
    }
}
