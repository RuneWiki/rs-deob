import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class564 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    private int field7906;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "[Lld;")
    private class561[] field7911;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "J")
    private long field7915;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lld;")
    private class561 field7912;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)V")
    public static final void method3162(int arg0, int arg1, int arg2) {
        if (arg0 >= 99) {
            field7908++;
            class632 var3 = class641.method3699(-125, 1, arg1);
            var3.method3656(0);
            var3.field9198 = arg2;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static final void method3163(int arg0) {
        if (class478.field6718 <= 0) {
            class21.field303 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class14.field143.length; var2++) {
                if (class14.field143[var2].startsWith("--> ")) {
                    var1++;
                    if (class478.field6718 == var1) {
                        class21.field303 = class14.field143[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (arg0 != 24266) {
            method3168(true, 118, -73);
        }
        field7917++;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lld;")
    public final class561 method3164(byte arg0) {
        field7907++;
        if (arg0 != -38) {
            this.field7912 = null;
        }
        if (this.field7912 == null) {
            return null;
        }
        class561 var2 = this.field7911[(int) ((long) (this.field7906 - 1) & this.field7915)];
        while (this.field7912 != var2) {
            if (this.field7912.field7830 == this.field7915) {
                class561 var3 = this.field7912;
                this.field7912 = this.field7912.field7831;
                return var3;
            }
            this.field7912 = this.field7912.field7831;
        }
        this.field7912 = null;
        return null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(JLld;Z)V")
    public final void method3165(long arg0, class561 arg1, boolean arg2) {
        field7910++;
        if (arg2) {
            this.method3165(125L, null, false);
        }
        if (arg1.field7834 != null) {
            arg1.method3149(-18724);
        }
        class561 var5 = this.field7911[(int) ((long) (this.field7906 - 1) & arg0)];
        arg1.field7834 = var5.field7834;
        arg1.field7831 = var5;
        arg1.field7834.field7831 = arg1;
        arg1.field7831.field7834 = arg1;
        arg1.field7830 = arg0;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
    public static final void method3166(byte arg0) {
        class251.field3138.method315(1);
        int var1 = -124 / ((arg0 - 74) / 52);
        field7909++;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IJ)Lld;")
    public final class561 method3167(int arg0, long arg1) {
        field7913++;
        this.field7915 = arg1;
        int var4 = -69 / ((arg0 - 9) / 43);
        class561 var5 = this.field7911[(int) (arg1 & (long) (this.field7906 - 1))];
        for (this.field7912 = var5.field7831; this.field7912 != var5; this.field7912 = this.field7912.field7831) {
            if (this.field7912.field7830 == arg1) {
                class561 var6 = this.field7912;
                this.field7912 = this.field7912.field7831;
                return var6;
            }
        }
        this.field7912 = null;
        return null;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(I)V")
    public class564(int arg0) {
        this.field7906 = arg0;
        this.field7911 = new class561[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class561 var3 = this.field7911[var2] = new class561();
            var3.field7831 = var3;
            var3.field7834 = var3;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZII)B")
    public static final byte method3168(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return -68;
        }
        field7916++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
