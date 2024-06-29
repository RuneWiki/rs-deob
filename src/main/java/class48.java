import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lrd;")
    public static class114 field992 = class84.method656("welle2:", (byte) 121);

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field993 = -1;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lrd;")
    private static class114 field991 = class84.method656("To create a new account you need to", (byte) 124);

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lrd;")
    public static class114 field990 = field991;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Ldd;")
    public static class26 field994 = new class26(50);

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lrd;")
    private static class114 field1002 = class84.method656("Classic", (byte) 118);

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field1004 = 0;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lrd;")
    private static class114 field1000 = class84.method656("shake:", (byte) 119);

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lrd;")
    private static class114 field1006 = class84.method656("Loading friend list", (byte) 119);

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lrd;")
    public static class114 field1001 = field1006;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Lrd;")
    private static class114 field1007 = class84.method656("The server is being updated)3", (byte) 126);

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lrd;")
    public static class114 field999 = field1000;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lrd;")
    public static class114 field1003 = field1002;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Lrd;")
    public static class114 field1009 = field1007;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lke;")
    public static class73 field989;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method347(byte arg0) {
        class66.field1423 = -1;
        class88.field1964 = 0;
        field996++;
        class61.field1303.field1227 = 0;
        class24.field462 = -1;
        class116.field2714 = false;
        class60.field1263 = 0;
        class137.field3311 = -1;
        class64.field1371 = 0;
        class79.field1805 = 0;
        class123.field2882 = -1;
        int var1 = -39 % ((26 - arg0) / 56);
        class100.field2259 = 0;
        class74.field1697 = 0;
        class77.field1752.field1227 = 0;
        for (int var2 = 0; var2 < class36.field762.length; var2++) {
            if (class36.field762[var2] != null) {
                class36.field762[var2].field709 = -1;
            }
        }
        for (int var3 = 0; var3 < class123.field2894.length; var3++) {
            if (class123.field2894[var3] != null) {
                class123.field2894[var3].field709 = -1;
            }
        }
        class118.method915(-1);
        class12.method101(false, 30);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method348(byte arg0) {
        field990 = null;
        field1002 = null;
        field1000 = null;
        if (arg0 != -60) {
            field1009 = null;
        }
        field991 = null;
        field999 = null;
        field989 = null;
        field1003 = null;
        field1001 = null;
        field992 = null;
        field1007 = null;
        field1009 = null;
        field994 = null;
        field1006 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method349(Object arg0, boolean arg1, byte arg2) {
        field998++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class121.method946(var3, -16044) : var3;
        } else if (arg0 instanceof class14) {
            class14 var4 = (class14) arg0;
            return var4.method117((byte) 120);
        } else if (arg2 == -55) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }
}
