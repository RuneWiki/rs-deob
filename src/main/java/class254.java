import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class254 {

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "Lgs;")
    private class34 field3646 = new class34();

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "[I")
    public static int[] field3645 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Lgs;")
    private class34 field3650;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lj;III[Z)Z")
    public static final boolean method1633(class377 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class88.field1546 != class335.field5061) {
            int var6 = class43.field829[arg1].method371(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class35 var8 = class43.field829[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method371(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method369(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method364(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Lgs;")
    public final class34 method1634(int arg0) {
        field3644++;
        if (arg0 <= 64) {
            this.method1642((byte) -119);
        }
        class34 var2 = this.field3646.field670;
        if (this.field3646 == var2) {
            return null;
        } else {
            var2.method360(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)I")
    public final int method1635(boolean arg0) {
        field3648++;
        if (!arg0) {
            return -13;
        }
        int var2 = 0;
        class34 var3 = this.field3646.field670;
        while (this.field3646 != var3) {
            var3 = var3.field670;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILgs;)V")
    public final void method1636(int arg0, class34 arg1) {
        if (arg1.field667 != null) {
            arg1.method360(true);
        }
        if (arg0 != 9) {
            this.method1641(true);
        }
        field3652++;
        arg1.field667 = this.field3646.field667;
        arg1.field670 = this.field3646;
        arg1.field667.field670 = arg1;
        arg1.field670.field667 = arg1;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
    public final void method1637(int arg0) {
        while (true) {
            class34 var2 = this.field3646.field670;
            if (this.field3646 == var2) {
                field3649++;
                this.field3650 = null;
                if (arg0 != 25831) {
                    this.method1640(false);
                    return;
                }
                return;
            }
            var2.method360(true);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)Lgs;")
    public final class34 method1638(byte arg0) {
        field3643++;
        class34 var2 = this.field3646.field667;
        if (arg0 != -85) {
            method1633(null, -64, -7, -11, null);
        }
        if (this.field3646 == var2) {
            this.field3650 = null;
            return null;
        } else {
            this.field3650 = var2.field667;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public static void method1639(byte arg0) {
        field3645 = null;
        int var1 = 68 % ((arg0 + 20) / 50);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)Lgs;")
    public final class34 method1640(boolean arg0) {
        field3642++;
        class34 var2 = this.field3646.field670;
        if (this.field3646 == var2) {
            this.field3650 = null;
            return null;
        }
        if (arg0) {
            this.field3650 = null;
        }
        this.field3650 = var2.field670;
        return var2;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(Z)Lgs;")
    public final class34 method1641(boolean arg0) {
        field3651++;
        class34 var2 = this.field3650;
        if (!arg0) {
            return null;
        } else if (this.field3646 == var2) {
            this.field3650 = null;
            return null;
        } else {
            this.field3650 = var2.field670;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
    public class254() {
        this.field3646.field667 = this.field3646;
        this.field3646.field670 = this.field3646;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)Z")
    public final boolean method1642(byte arg0) {
        int var2 = -76 % ((arg0 + 20) / 50);
        field3647++;
        return this.field3646.field670 == this.field3646;
    }
}
