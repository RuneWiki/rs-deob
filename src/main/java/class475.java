import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class475 {

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Lac;")
    private class376 field6996 = new class376();

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "Ltn;")
    private class59 field7000 = new class59();

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    private int field7002;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    private int field7001;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "Lib;")
    private class106 field7003;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Lbg;")
    public static class324 field6998 = new class324(2, -2);

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "Lbg;")
    public static class324 field6999 = new class324(23, 8);

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 7)
    public static final void method2866(String arg0, boolean arg1) {
        field6993++;
        if (arg0 == null) {
            return;
        }
        if (!(class91.field1257 < 100 || class40.field454) || class91.field1257 >= 200) {
            class407.method2497((byte) -99, class265.field3911.method2031(true, class377.field5585));
            return;
        }
        String var2 = class499.method2994(arg0, (byte) -93);
        if (var2 == null) {
            return;
        }
        if (arg1) {
            field6998 = null;
        }
        for (int var3 = 0; var3 < class91.field1257; var3++) {
            String var7 = class499.method2994(class353.field4943[var3], (byte) -72);
            if (var7 != null && var7.equals(var2)) {
                class407.method2497((byte) -99, arg0 + class306.field4341.method2031(true, class377.field5585));
                return;
            }
            if (class326.field4578[var3] != null) {
                String var8 = class499.method2994(class326.field4578[var3], (byte) -42);
                if (var8 != null && var8.equals(var2)) {
                    class407.method2497((byte) -99, arg0 + class306.field4341.method2031(true, class377.field5585));
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class188.field2696; var4++) {
            String var5 = class499.method2994(class397.field5820[var4], (byte) -83);
            if (var5 != null && var5.equals(var2)) {
                class407.method2497((byte) -99, class328.field4586.method2031(!arg1, class377.field5585) + arg0 + class241.field3567.method2031(true, class377.field5585));
                return;
            }
            if (class367.field5467[var4] != null) {
                String var6 = class499.method2994(class367.field5467[var4], (byte) -85);
                if (var6 != null && var6.equals(var2)) {
                    class407.method2497((byte) -99, class328.field4586.method2031(true, class377.field5585) + arg0 + class241.field3567.method2031(true, class377.field5585));
                    return;
                }
            }
        }
        if (class499.method2994(class435.field6375.field5074, (byte) -84).equals(var2)) {
            class407.method2497((byte) -99, class111.field1568.method2031(true, class377.field5585));
        } else {
            class76.field1030++;
            class32.method258(-96, class519.field7636);
            class472.field6970.method638(255, class494.method2962(arg0, (byte) -102));
            class472.field6970.method605(93, arg0);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IBII)I", line = 100)
    public static final int method2867(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 52) {
            return -115;
        }
        field6992++;
        if ((class238.field3497[arg2][arg3][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class238.field3497[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(JLac;I)V", line = 121)
    public final void method2868(long arg0, class376 arg1, int arg2) {
        field6995++;
        if (this.field7001 == 0) {
            class376 var5 = this.field7000.method539((byte) -87);
            var5.method1525((byte) 103);
            var5.method2307((byte) -79);
            if (this.field6996 == var5) {
                class376 var6 = this.field7000.method539((byte) -95);
                var6.method1525((byte) -98);
                var6.method2307((byte) 23);
            }
        } else {
            this.field7001--;
        }
        if (arg2 != -8869) {
            this.method2871(77L, (byte) -99);
        }
        this.field7003.method878(arg0, arg2 ^ 0x2A58, arg1);
        this.field7000.method536(arg2 ^ 0x22DD, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(CI)Z", line = 151)
    public static final boolean method2869(char arg0, int arg1) {
        field6994++;
        if (arg1 < 15) {
            field6998 = null;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 163)
    public static void method2870(int arg0) {
        field6998 = null;
        field6999 = null;
        int var1 = 108 / ((-arg0 - 9) / 61);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(JB)Lac;", line = 174)
    public final class376 method2871(long arg0, byte arg1) {
        field6997++;
        class376 var4 = (class376) this.field7003.method875(arg0, 125);
        if (arg1 <= 40) {
            this.field7000 = null;
        }
        if (var4 != null) {
            this.field7000.method536(-123, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 199)
    public final void method2872(byte arg0) {
        field6991++;
        this.field7000.method535((byte) 99);
        this.field7003.method874(0);
        this.field6996 = new class376();
        this.field7001 = this.field7002;
        if (arg0 != -63) {
            this.field6996 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V", line = 248)
    public class475(int arg0) {
        this.field7002 = arg0;
        this.field7001 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field7003 = new class106(var2);
    }
}
