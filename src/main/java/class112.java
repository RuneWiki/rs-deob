import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class112 extends class146 {

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Z")
    public static boolean field1731 = true;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1732 = "flash2:";

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field1735 = 2;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "J")
    public long field1727;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lgd;")
    public class112 field1726;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lgd;")
    public class112 field1733;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lwi;")
    public static class231 field1730;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V")
    public static void method826(boolean arg0) {
        field1730 = null;
        field1732 = null;
        if (arg0) {
            method830((byte) -126);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public final void method827(byte arg0) {
        field1729++;
        if (this.field1726 == null) {
            return;
        }
        this.field1726.field1733 = this.field1733;
        if (arg0 != -98) {
            field1731 = false;
        }
        this.field1733.field1726 = this.field1726;
        this.field1733 = null;
        this.field1726 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
    public static final void method828(int arg0, int arg1, int arg2, int arg3) {
        field1725++;
        class23 var4 = class91.method694(arg2, 9, 105);
        if (arg0 == -1) {
            var4.method190(0);
            var4.field361 = arg1;
            var4.field349 = arg3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lne;I)V")
    public static final void method829(class78 arg0, int arg1) {
        class39 var2 = null;
        try {
            if (arg1 != 16751) {
                field1731 = false;
            }
            class115 var3 = arg0.method635((byte) 126, "runescape");
            while (var3.field1937 == 0) {
                class234.method1550(-28773, 1L);
            }
            if (var3.field1937 == 1) {
                var2 = (class39) var3.field1936;
                class136 var4 = class270.method1841(1);
                var2.method321(var4.field2263, 0, arg1 - 21689, var4.field2231);
            }
        } catch (Exception var6) {
        }
        field1728++;
        try {
            if (var2 != null) {
                var2.method325((byte) -96);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public static final void method830(byte arg0) {
        if (arg0 == 96) {
            class184.field3031.method1156(arg0 - 186);
            field1734++;
        }
    }
}
