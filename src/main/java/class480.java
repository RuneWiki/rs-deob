import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class480 {

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[Luh;")
    private class114[] field7092;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    private int field7087;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[Lrk;")
    public static class24[] field7090 = new class24[1024];

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field7091 = 1401;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "J")
    private long field7088;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Luh;")
    private class114 field7085;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lwt;")
    public static class206 field7082;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Luh;", line = 6)
    public final class114 method2848(long arg0, int arg1) {
        this.field7088 = arg0;
        field7089++;
        class114 var4 = this.field7092[(int) ((long) (this.field7087 - 1) & arg0)];
        if (arg1 != 28059) {
            this.method2852(42);
        }
        for (this.field7085 = var4.field1580; this.field7085 != var4; this.field7085 = this.field7085.field1580) {
            if (this.field7085.field1579 == arg0) {
                class114 var5 = this.field7085;
                this.field7085 = this.field7085.field1580;
                return var5;
            }
        }
        this.field7085 = null;
        return null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 36)
    public static void method2849(int arg0) {
        field7090 = null;
        field7082 = null;
        if (arg0 != -30452) {
            field7082 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Luh;IJ)V", line = 48)
    public final void method2850(class114 arg0, int arg1, long arg2) {
        if (arg0.field1582 != null) {
            arg0.method705(6511);
        }
        field7081++;
        class114 var5 = this.field7092[(int) ((long) (this.field7087 - 1) & arg2)];
        arg0.field1580 = var5;
        arg0.field1582 = var5.field1582;
        arg0.field1582.field1580 = arg0;
        arg0.field1579 = arg2;
        arg0.field1580.field1582 = arg0;
        if (arg1 >= -37) {
            this.method2848(-68L, 50);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLqa;Lga;)V", line = 70)
    public static final void method2851(byte arg0, class165 arg1, class282 arg2) {
        int var3 = 18 / ((arg0 - 17) / 49);
        field7084++;
        boolean var4 = class103.field1489.method1598(arg2.field4042, 106, arg2.field4034 ? class56.field800.field1401 : null, arg2.field4012, arg2.field4021, arg1, arg2.field4102, arg2.field4060 | 0xFF000000) == null;
        if (var4) {
            class129.field1739.method453((byte) 107, new class316(arg2.field4012, arg2.field4042, arg2.field4021, arg2.field4060 | 0xFF000000, arg2.field4102, arg2.field4034));
            class206.method1385(2, arg2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Luh;", line = 102)
    public final class114 method2852(int arg0) {
        if (arg0 != -26849) {
            this.field7087 = -44;
        }
        field7093++;
        if (this.field7085 == null) {
            return null;
        }
        class114 var2 = this.field7092[(int) (this.field7088 & (long) (this.field7087 - 1))];
        while (this.field7085 != var2) {
            if (this.field7085.field1579 == this.field7088) {
                class114 var3 = this.field7085;
                this.field7085 = this.field7085.field1580;
                return var3;
            }
            this.field7085 = this.field7085.field1580;
        }
        this.field7085 = null;
        return null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)V", line = 137)
    public static final void method2853(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2851((byte) -42, null, null);
        }
        field7086++;
        if (class86.method587(-111, arg1)) {
            class276.method1780((byte) -45, class263.field3690[arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 155)
    public class480(int arg0) {
        this.field7092 = new class114[arg0];
        this.field7087 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class114 var3 = this.field7092[var2] = new class114();
            var3.field1582 = var3;
            var3.field1580 = var3;
        }
    }
}
