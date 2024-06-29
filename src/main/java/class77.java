import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 extends class116 {

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[B")
    public byte[] field1891;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lic;")
    public static class59 field1880 = class59.method433(0, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Lic;")
    public static class59 field1882 = class59.method433(0, "T");

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lic;")
    private static class59 field1879 = class59.method433(0, "Please wait)3)3)3");

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1887 = 0;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "[I")
    public static int[] field1886 = new int[1000];

    @OriginalMember(owner = "client!la", name = "C", descriptor = "Lic;")
    public static class59 field1888 = class59.method433(0, "::fpson");

    @OriginalMember(owner = "client!la", name = "I", descriptor = "Lic;")
    public static class59 field1893 = field1879;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field1890 = 10;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "Lmd;")
    public static class87 field1892;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1879 = null;
        field1893 = null;
        field1892 = null;
        field1880 = null;
        field1882 = null;
        field1886 = null;
        if (arg0 == 0) {
            field1888 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;III)Lse;")
    public static final class130 method634(Component arg0, int arg1, int arg2, int arg3) {
        field1885++;
        try {
            Class var4 = Class.forName("pe");
            if (arg1 != 1375517917) {
                method636(-80, true, 120);
            }
            class130 var5 = (class130) var4.getDeclaredConstructor().newInstance();
            var5.method856(arg3, arg0, arg2, (byte) 88);
            return var5;
        } catch (Throwable var7) {
            class154 var6 = new class154();
            var6.method856(arg3, arg0, arg2, (byte) 86);
            return var6;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static final void method635(boolean arg0) {
        class35.field922 = new int[151];
        field1883++;
        class9.field200 = new int[33];
        class27.field698 = new int[33];
        class142.field3123 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class24.field587.field437[class24.field587.field440 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class27.field698[var1] = var6;
            class9.field200[var1] = var7 - var6;
        }
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class24.field587.field437[var5 + class24.field587.field440 * var2] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class142.field3123[var2 - 5] = var3 - 25;
            class35.field922[var2 - 5] = var4 - var3;
        }
        if (!arg0) {
            method634(null, 6, -18, -94);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)I")
    public static final int method636(int arg0, boolean arg1, int arg2) {
        field1884++;
        if (arg2 < 2) {
            if (arg1) {
                field1886 = null;
            }
            return arg2 == 1 ? arg0 : 1;
        }
        int var3 = method636(arg0 * arg0, false, arg2 >> 1);
        if ((arg2 & 0x1) != 0) {
            var3 = arg0 * var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
    public class77(byte[] arg0) {
        this.field1891 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
    public static final boolean method637(int arg0, int arg1) {
        field1878++;
        if (arg0 != 1375517917) {
            method635(false);
        }
        return (arg1 >> 30 & 0x1) != 0;
    }
}
