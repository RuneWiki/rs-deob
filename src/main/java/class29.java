import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class29 extends class80 {

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lph;")
    private static class229 field474 = class266.method1858("K", 0);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Lph;")
    public static class229 field472 = field474;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Lph;")
    public static class229 field475 = class266.method1858(" )4 ", 0);

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Lph;")
    public static class229 field476 = field474;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Lri;")
    public static class301 field477 = null;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Lph;")
    public static class229 field478 = class266.method1858("Prendre", 0);

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "J")
    public long field468;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljj;")
    public class29 field467;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljj;")
    public class29 field473;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V", line = 5)
    public final void method224(int arg0) {
        field466++;
        if (this.field473 == null) {
            return;
        }
        if (arg0 != 128) {
            method225(114, (class229) null, -81, (class229) null);
        }
        this.field473.field467 = this.field467;
        this.field467.field473 = this.field473;
        this.field473 = null;
        this.field467 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILph;ILph;)V", line = 32)
    public static final void method225(int arg0, class229 arg1, int arg2, class229 arg3) {
        class134.field2186 = arg3;
        class296.field4832 = arg0;
        field471++;
        class134.field2181 = arg1;
        if (class134.field2186.method1618(false, class134.field2172) || class134.field2181.method1618(false, class134.field2172)) {
            class332.field5661 = 3;
        } else if (class209.field3457 == -1) {
            class282.field4675 = 0;
            class181.field2965 = 1;
            class112.field1909 = 0;
            class332.field5661 = -3;
            class164 var4 = new class164(128);
            var4.method1188(-94, 10);
            var4.method1155(-1640531527, (int) (Math.random() * 99999.0D));
            var4.method1155(-1640531527, 525);
            var4.method1208((byte) -6, class134.field2186.method1634(false));
            var4.method1168((int) (Math.random() * 9.9999999E7D), (byte) -122);
            var4.method1194(-11504, class134.field2181);
            var4.method1168((int) (Math.random() * 9.9999999E7D), (byte) -78);
            var4.method1205(class236.field3884, class230.field3822, (byte) -122);
            if (arg2 >= -27) {
                field475 = (class229) null;
            }
            class121.field2033.field2670 = 0;
            class121.field2033.method1188(-108, 69);
            class121.field2033.method1188(-86, var4.field2670);
            class121.field2033.method1164(0, var4.field2670, true, var4.field2668);
        } else {
            class116.method878(26666);
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 79)
    public static void method226(int arg0) {
        field477 = null;
        if (arg0 != -1570) {
            field476 = (class229) null;
        }
        field474 = null;
        field476 = null;
        field475 = null;
        field478 = null;
        field472 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)Z", line = 106)
    public final boolean method227(boolean arg0) {
        if (arg0) {
            this.method224(-72);
        }
        field469++;
        return this.field473 != null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BZ)I", line = 124)
    public static final int method228(byte arg0, boolean arg1) {
        long var2 = class130.method935(false);
        field480++;
        if (arg0 != -40) {
            return 125;
        }
        for (class266 var4 = arg1 ? (class266) class179.field2941.method711(0) : (class266) class179.field2941.method718(27263); var4 != null; var4 = (class266) class179.field2941.method718(27263)) {
            if ((var4.field4477 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4477 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1325;
                    class166.field2711[var5] = class85.field1454[var5];
                    var4.method598(70);
                    return var5;
                }
                var4.method598(121);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)I", line = 182)
    public static final int method229(int arg0, boolean arg1) {
        if (arg1) {
            method229(-53, false);
        }
        field470++;
        return arg0 & 0x7F;
    }
}
