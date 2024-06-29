import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class248 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lal;")
    public static class52 field4056 = new class52(64);

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field4063 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[Lgl;")
    public static class356[] field4062;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1715(int arg0) {
        field4066++;
        if (arg0 == 1) {
            return (this.field4055 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Z", line = 24)
    public final boolean method1716(boolean arg0) {
        field4065++;
        if (arg0) {
            return true;
        } else {
            return (this.field4055 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Z", line = 38)
    public final boolean method1717(int arg0) {
        int var2 = 124 % ((28 - arg0) / 52);
        field4059++;
        return (this.field4055 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 49)
    public static void method1718(int arg0) {
        if (arg0 > 75) {
            field4056 = null;
            field4062 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BI)Z", line = 60)
    public static final boolean method1719(byte[] arg0, int arg1) {
        field4057++;
        class186 var2 = new class186(arg0);
        int var3 = 65 % ((arg1 - 30) / 36);
        int var4 = var2.method1322(false);
        if (var4 != 1) {
            return false;
        }
        boolean var5 = var2.method1322(false) == 1;
        if (var5) {
            class155.method1094((byte) -123, var2);
        }
        class89.method536(var2, false);
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z", line = 86)
    public final boolean method1720(byte arg0) {
        field4061++;
        int var2 = -45 % ((arg0 + 77) / 32);
        return (this.field4055 & 0x8) != 0;
    }
}
