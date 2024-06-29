import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class287 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lob;")
    public static class521 field4342 = new class521(0, -1);

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field4348 = -1;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lhn;")
    public static class509 field4350 = new class509(95, 2);

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lhn;")
    public static class509 field4351 = new class509(56, 6);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field4339;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1850(int arg0) {
        field4344++;
        if (arg0 == 6) {
            return (this.field4339 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 18)
    public static void method1851(byte arg0) {
        field4342 = null;
        field4350 = null;
        field4351 = null;
        if (arg0 >= -50) {
            method1852(null, null, true);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lcf;Lcf;Z)V", line = 34)
    public static final void method1852(class431 arg0, class431 arg1, boolean arg2) {
        field4346++;
        if (!arg2) {
            field4351 = null;
        }
        if (arg0.field6389 != null) {
            arg0.method2677(-22491);
        }
        arg0.field6389 = arg1.field6389;
        arg0.field6384 = arg1;
        arg0.field6389.field6384 = arg0;
        arg0.field6384.field6389 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z", line = 51)
    public final boolean method1853(int arg0) {
        field4340++;
        if (arg0 != 8) {
            field4350 = null;
        }
        return (this.field4339 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z", line = 69)
    public final boolean method1854(byte arg0) {
        if (arg0 != -81) {
            this.field4339 = -82;
        }
        field4349++;
        return (this.field4339 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILag;)V", line = 81)
    public static final void method1855(int arg0, class484 arg1) {
        field4345++;
        arg1.field6960 = null;
        int var2 = arg1.field6964.length;
        for (int var3 = arg0; var3 < var2; var3++) {
            arg1.field6964[var3].field1201 = false;
        }
        class305[] var4 = class153.field2278;
        synchronized (class153.field2278) {
            if (var2 < class153.field2278.length && class116.field1761[var2] < 200) {
                class153.field2278[var2].method1957(127, arg1);
                int var10002 = class116.field1761[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)Z", line = 122)
    public final boolean method1856(boolean arg0) {
        if (!arg0) {
            this.method1853(-36);
        }
        field4341++;
        return (this.field4339 & 0x1) != 0;
    }
}
