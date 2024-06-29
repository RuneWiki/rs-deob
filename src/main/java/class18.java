import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 {

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Lwd;")
    public class210 field464 = new class210();

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public static int[] field453 = new int[128];

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Ljd;")
    public static class92 field457 = class202.method1325((byte) 90, "Hidden)2");

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Ljd;")
    private static class92 field467 = class202.method1325((byte) 90, "Ok");

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Ljd;")
    public static class92 field465 = field467;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lud;")
    public static class192 field450;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lud;")
    public static class192 field459;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Lwd;")
    private class210 field470;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lfd;")
    public static class55 field452;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        field450 = null;
        field459 = null;
        field467 = null;
        field465 = null;
        field453 = null;
        field457 = null;
        if (arg0 == 0) {
            field452 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lwd;Lwd;B)V")
    public final void method99(class210 arg0, class210 arg1, byte arg2) {
        field455++;
        if (arg1.field4071 != null) {
            arg1.method1370(-26);
        }
        arg1.field4078 = arg0;
        arg1.field4071 = arg0.field4071;
        if (arg2 >= -51) {
            this.method103(25);
        }
        arg1.field4071.field4078 = arg1;
        arg1.field4078.field4071 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lwd;")
    public final class210 method100(int arg0) {
        field463++;
        if (arg0 != -49) {
            this.field470 = null;
        }
        class210 var2 = this.field470;
        if (this.field464 == var2) {
            this.field470 = null;
            return null;
        } else {
            this.field470 = var2.field4078;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lwd;B)V")
    public final void method101(class210 arg0, byte arg1) {
        field468++;
        if (arg0.field4071 != null) {
            arg0.method1370(120);
        }
        arg0.field4071 = this.field464.field4071;
        arg0.field4078 = this.field464;
        arg0.field4071.field4078 = arg0;
        int var3 = -112 % ((76 - arg1) / 39);
        arg0.field4078.field4071 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLwd;)V")
    public final void method102(byte arg0, class210 arg1) {
        if (arg0 <= 73) {
            return;
        }
        if (arg1.field4071 != null) {
            arg1.method1370(15);
        }
        arg1.field4078 = this.field464.field4078;
        field469++;
        arg1.field4071 = this.field464;
        arg1.field4071.field4078 = arg1;
        arg1.field4078.field4071 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lwd;")
    public final class210 method103(int arg0) {
        field466++;
        class210 var2 = this.field464.field4078;
        if (arg0 != 57) {
            return null;
        } else if (this.field464 == var2) {
            this.field470 = null;
            return null;
        } else {
            this.field470 = var2.field4078;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lwd;")
    public final class210 method104(boolean arg0) {
        class210 var2 = this.field464.field4071;
        field461++;
        if (this.field464 == var2) {
            this.field470 = null;
            return null;
        } else if (arg0) {
            return null;
        } else {
            this.field470 = var2.field4071;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lwd;")
    public final class210 method105(int arg0) {
        class210 var2 = this.field464.field4078;
        if (arg0 != -123) {
            field467 = null;
        }
        field454++;
        if (this.field464 == var2) {
            return null;
        } else {
            var2.method1370(-68);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
    public static final void method106(boolean arg0) {
        for (int var1 = -1; var1 < class140.field2811; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class190.field3678[var1];
            }
            class91 var6 = class172.field3347[var5];
            if (var6 != null && var6.field239 > 0) {
                var6.field239--;
                if (var6.field239 == 0) {
                    var6.field223 = null;
                }
            }
        }
        if (!arg0) {
            field459 = null;
        }
        for (int var2 = 0; var2 < class96.field1928; var2++) {
            int var3 = class39.field893[var2];
            class129 var4 = class107.field2187[var3];
            if (var4 != null && var4.field239 > 0) {
                var4.field239--;
                if (var4.field239 == 0) {
                    var4.field223 = null;
                }
            }
        }
        field462++;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Lwd;")
    public final class210 method107(int arg0) {
        if (arg0 < 80) {
            field453 = null;
        }
        field449++;
        class210 var2 = this.field470;
        if (this.field464 == var2) {
            this.field470 = null;
            return null;
        } else {
            this.field470 = var2.field4071;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method108(int arg0, boolean arg1) {
        field460++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (arg1) {
            method98(-14);
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
    public final void method109(int arg0) {
        field456++;
        if (arg0 != 65) {
            field465 = null;
        }
        while (true) {
            class210 var2 = this.field464.field4078;
            if (this.field464 == var2) {
                return;
            }
            var2.method1370(125);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class18() {
        this.field464.field4078 = this.field464;
        this.field464.field4071 = this.field464;
    }
}
