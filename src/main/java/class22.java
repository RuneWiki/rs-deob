import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IDBAHLFM")
public class class22 {

    @OriginalMember(owner = "client!IDBAHLFM", name = "f", descriptor = "I")
    public int field916 = -1;

    @OriginalMember(owner = "client!IDBAHLFM", name = "h", descriptor = "[I")
    public int[] field918 = new int[6];

    @OriginalMember(owner = "client!IDBAHLFM", name = "i", descriptor = "[I")
    public int[] field919 = new int[6];

    @OriginalMember(owner = "client!IDBAHLFM", name = "j", descriptor = "I")
    public int field920 = 128;

    @OriginalMember(owner = "client!IDBAHLFM", name = "k", descriptor = "I")
    public int field921 = 128;

    @OriginalMember(owner = "client!IDBAHLFM", name = "o", descriptor = "LTUCAQTOR;")
    public static class58 field925 = new class58(-37, 30);

    @OriginalMember(owner = "client!IDBAHLFM", name = "a", descriptor = "I")
    private static int field911;

    @OriginalMember(owner = "client!IDBAHLFM", name = "b", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!IDBAHLFM", name = "d", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!IDBAHLFM", name = "e", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!IDBAHLFM", name = "l", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!IDBAHLFM", name = "m", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!IDBAHLFM", name = "n", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!IDBAHLFM", name = "g", descriptor = "LEJHGNUGE;")
    public class9 field917;

    @OriginalMember(owner = "client!IDBAHLFM", name = "c", descriptor = "[LIDBAHLFM;")
    public static class22[] field913;

    @OriginalMember(owner = "client!IDBAHLFM", name = "a", descriptor = "(ILSYUGXMZF;)V")
    public static void method321(int arg0, class55 arg1) {
        class30 var2 = new class30(arg1.method551("spotanim.dat", null), -982);
        while (arg0 >= 0) {
            field911 = -206;
        }
        field912 = var2.method351();
        if (field913 == null) {
            field913 = new class22[field912];
        }
        for (int var3 = 0; var3 < field912; var3++) {
            if (field913[var3] == null) {
                field913[var3] = new class22();
            }
            field913[var3].field914 = var3;
            field913[var3].method322(var2, 1);
        }
    }

    @OriginalMember(owner = "client!IDBAHLFM", name = "a", descriptor = "(LKHOMSBHW;I)V")
    public void method322(class30 arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method349();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field915 = arg0.method351();
                } else if (var3 == 2) {
                    this.field916 = arg0.method351();
                    if (class9.field682 != null) {
                        this.field917 = class9.field682[this.field916];
                    }
                } else if (var3 == 4) {
                    this.field920 = arg0.method351();
                } else if (var3 == 5) {
                    this.field921 = arg0.method351();
                } else if (var3 == 6) {
                    this.field922 = arg0.method351();
                } else if (var3 == 7) {
                    this.field923 = arg0.method349();
                } else if (var3 == 8) {
                    this.field924 = arg0.method349();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field918[var3 - 40] = arg0.method351();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field919[var3 - 50] = arg0.method351();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!IDBAHLFM", name = "a", descriptor = "()LGEUHTGZJ;")
    public class17 method323() {
        class17 var1 = (class17) field925.method566((long) this.field914);
        if (var1 != null) {
            return var1;
        }
        class17 var2 = class17.method285(this.field915, 8);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field918[0] != 0) {
                var2.method299(this.field918[var3], this.field919[var3]);
            }
        }
        field925.method567(true, var2, (long) this.field914);
        return var2;
    }
}
