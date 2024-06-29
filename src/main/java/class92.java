import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class92 {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lme;")
    private class136 field1723 = new class136();

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lsf;")
    private class202 field1728 = new class202();

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lob;")
    private class154 field1729;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
    public static int[] field1721 = new int[4096];

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
    public static int[] field1732;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1733;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Li;")
    public static class88 field1734;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
    public static int[] field1735;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JLme;Z)V")
    public final void method664(long arg0, class136 arg1, boolean arg2) {
        field1719++;
        if (this.field1731 == 0) {
            class136 var5 = this.field1728.method1384(0);
            var5.method460(true);
            var5.method909(192);
            if (this.field1723 == var5) {
                class136 var6 = this.field1728.method1384(0);
                var6.method460(true);
                var6.method909(192);
            }
        } else {
            this.field1731--;
        }
        this.field1729.method1054(arg0, arg1, -1);
        this.field1728.method1389(-20038, arg1);
        if (arg2) {
            this.method672(true);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lg;")
    public final class67 method665(int arg0) {
        if (arg0 == 0) {
            field1718++;
            return this.field1729.method1050((byte) -73);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)Lme;")
    public final class136 method666(long arg0, int arg1) {
        field1720++;
        if (arg1 != 0) {
            return null;
        }
        class136 var4 = (class136) this.field1729.method1051(~arg1, arg0);
        if (var4 != null) {
            this.field1728.method1389(-20038, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZJ)V")
    public final void method667(boolean arg0, long arg1) {
        field1722++;
        if (!arg0) {
            return;
        }
        class136 var4 = (class136) this.field1729.method1051(-1, arg1);
        if (var4 != null) {
            var4.method460(true);
            var4.method909(192);
            this.field1731++;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLea;)Ltj;")
    public static final class217 method668(byte arg0, class46 arg1) {
        field1724++;
        if (arg0 != -15) {
            method669(-7, -118, -106, 60);
        }
        class217 var2 = new class217();
        var2.field4060 = arg1.method301(79);
        var2.field4067 = class168.method1152((byte) 62, var2.field4060);
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
    public static final void method669(int arg0, int arg1, int arg2, int arg3) {
        field1726++;
        if (class119.field2174 == arg3 || arg0 == 0 || class174.field3447 >= 50 || arg2 == -1) {
            return;
        }
        class25.field397[class174.field3447] = arg2;
        class110.field2018[class174.field3447] = arg0;
        class8.field116[class174.field3447] = arg1;
        class237.field4419[class174.field3447] = null;
        class145.field2728[class174.field3447] = 0;
        class174.field3447++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method670(byte arg0) {
        field1721 = null;
        field1735 = null;
        field1732 = null;
        if (arg0 >= -67) {
            method669(47, -52, 18, -28);
        }
        field1734 = null;
        field1733 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method671(int arg0) {
        if (arg0 <= 1) {
            return;
        }
        while (true) {
            class136 var2 = this.field1728.method1384(0);
            if (var2 == null) {
                this.field1731 = this.field1730;
                field1725++;
                return;
            }
            var2.method460(true);
            var2.method909(192);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Lg;")
    public final class67 method672(boolean arg0) {
        if (!arg0) {
            field1735 = null;
        }
        field1727++;
        return this.field1729.method1049(0);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
    public class92(int arg0) {
        this.field1730 = arg0;
        this.field1731 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1729 = new class154(var2);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1721[var0] = class54.method394(var0, -123);
        }
        field1732 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
        field1733 = new CRC32();
        field1734 = class208.method1425(105, "title_mute");
    }
}
