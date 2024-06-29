import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    private int[] field1875;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Z")
    public static boolean field1872 = false;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Llc;")
    public static class69 field1877 = class69.method470((byte) -97, "@whi@ )4 ");

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1873 = -1;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Llc;")
    public static class69 field1874 = class69.method470((byte) -117, "Contact Details Last Set:*6n@gre@");

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Llc;")
    public static class69 field1866 = class69.method470((byte) -117, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Llc;")
    public static class69 field1881 = class69.method470((byte) -115, ": ");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lcb;")
    public static class15 field1870;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lkc;")
    public static class63 field1869;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Ljava/awt/Component;")
    public static final Component method597(byte arg0) {
        if (arg0 != -51) {
            return null;
        }
        field1879++;
        if (class47.field982 == null) {
            return class64.field1358 == null ? null : class64.field1358.field2178;
        } else {
            return class47.field982;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method598(Component arg0, byte arg1) {
        arg0.addMouseListener(class69.field1526);
        field1880++;
        int var2 = 124 / ((arg1 - 50) / 50);
        arg0.addMouseMotionListener(class69.field1526);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1874 = null;
        if (arg0 != 1) {
            field1874 = null;
        }
        field1881 = null;
        field1877 = null;
        field1869 = null;
        field1870 = null;
        field1866 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)I")
    public final int method600(byte arg0, int arg1) {
        if (arg0 < 37) {
            field1870 = null;
        }
        field1876++;
        int var3 = this.field1875.length - 2;
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field1875[var4];
            if (arg1 == var5) {
                return this.field1875[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static final void method601(int arg0) {
        if (arg0 == 9763) {
            class129.field2780 = true;
            class13.field264 = true;
            field1878++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
    public static final int method602(int arg0, int arg1, int arg2) {
        field1867++;
        if (arg2 == -1) {
            return 12345678;
        } else if (arg1 == 2) {
            int var3 = (arg2 & 0x7F) * arg0 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([I)V")
    public class83(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1875 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1875[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1875[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1875[var5 + var5] = arg0[var4];
            this.field1875[var5 + var5 + 1] = var4++;
        }
    }
}
