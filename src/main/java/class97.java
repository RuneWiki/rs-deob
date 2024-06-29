import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class97 {

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lwg;")
    public class254 field1467 = new class254();

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    public static int[] field1465 = new int[2];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lwg;")
    private class254 field1473;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public final void method647(byte arg0) {
        while (true) {
            class254 var2 = this.field1467.field3859;
            if (this.field1467 == var2) {
                field1462++;
                if (arg0 != -70) {
                    return;
                }
                this.field1473 = null;
                return;
            }
            var2.method1706(-104);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Lik;")
    public static final class225 method648(int arg0, int arg1, int arg2) {
        field1470++;
        for (class225 var3 = (class225) class14.field216.method656(arg0 + 101); var3 != null; var3 = (class225) class14.field216.method650(126)) {
            if (var3.field3384 && var3.method1471(arg1, arg2, arg0 ^ 0xFFFFFFF3)) {
                return var3;
            }
        }
        if (arg0 == 9) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Lwg;")
    public final class254 method649(int arg0) {
        if (arg0 < 78) {
            this.field1467 = null;
        }
        field1463++;
        class254 var2 = this.field1467.field3860;
        if (this.field1467 == var2) {
            this.field1473 = null;
            return null;
        } else {
            this.field1473 = var2.field3860;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)Lwg;")
    public final class254 method650(int arg0) {
        class254 var2 = this.field1473;
        field1466++;
        if (arg0 < 123) {
            method648(-83, -81, -104);
        }
        if (this.field1467 == var2) {
            this.field1473 = null;
            return null;
        } else {
            this.field1473 = var2.field3859;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Lwg;")
    public final class254 method651(boolean arg0) {
        field1471++;
        class254 var2 = this.field1473;
        if (arg0) {
            this.field1473 = null;
        }
        if (this.field1467 == var2) {
            this.field1473 = null;
            return null;
        } else {
            this.field1473 = var2.field3860;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILwg;)V")
    public final void method652(int arg0, class254 arg1) {
        field1460++;
        if (arg1.field3860 != null) {
            arg1.method1706(-73);
        }
        arg1.field3860 = this.field1467.field3860;
        arg1.field3859 = this.field1467;
        arg1.field3860.field3859 = arg1;
        if (arg0 <= 49) {
            this.field1473 = null;
        }
        arg1.field3859.field3860 = arg1;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Lwg;")
    public final class254 method653(byte arg0) {
        field1468++;
        class254 var2 = this.field1467.field3859;
        if (this.field1467 == var2) {
            return null;
        }
        if (arg0 < 100) {
            this.method647((byte) -24);
        }
        var2.method1706(-103);
        return var2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLve;)V")
    public static final void method654(byte arg0, class233 arg1) {
        if (arg0 > -119) {
            method655(-23);
        }
        class57.field875 = arg1;
        field1461++;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public static void method655(int arg0) {
        if (arg0 == 5) {
            field1465 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)Lwg;")
    public final class254 method656(int arg0) {
        field1464++;
        class254 var2 = this.field1467.field3859;
        if (this.field1467 == var2) {
            this.field1473 = null;
            return null;
        } else {
            this.field1473 = var2.field3859;
            return arg0 < 92 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lwg;B)V")
    public final void method657(class254 arg0, byte arg1) {
        field1472++;
        if (arg0.field3860 != null) {
            arg0.method1706(-76);
        }
        if (arg1 > 111) {
            arg0.field3860 = this.field1467;
            arg0.field3859 = this.field1467.field3859;
            arg0.field3860.field3859 = arg0;
            arg0.field3859.field3860 = arg0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public static final void method658(int arg0, int arg1) {
        class54.method361(false);
        field1469++;
        class62.method438(arg0 - 7272);
        int var2 = class20.method156(arg0 ^ 0x675B, arg1).field1558;
        if (var2 == 0) {
            return;
        }
        int var3 = class20.field276[arg1];
        if (var2 == 5) {
            class250.field3787 = var3;
        }
        if (var2 == 6) {
            class237.field3575 = var3;
        }
        if (var2 == 9) {
            class121.field1764 = var3;
        }
        if (arg0 != 7272) {
            field1465 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class97() {
        this.field1467.field3860 = this.field1467;
        this.field1467.field3859 = this.field1467;
    }
}
