import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 extends class12 {

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field2918 = -1;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lpe;")
    public static class109 field2921 = class141.method1120("Bitte warten Sie)3)3)3", 0);

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Ljb;")
    public static class64 field2916 = new class64(8);

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Lpe;")
    public static class109 field2931 = class141.method1120("Nehmen", 0);

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "Lpe;")
    public static class109 field2930 = class141.method1120(" Sekunde(Xn(Y -Ubertragen)3", 0);

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Lpe;")
    public static class109 field2933 = class141.method1120("::errortest", 0);

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "Lpe;")
    private static class109 field2927 = class141.method1120("Checking for updates )2 ", 0);

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Lpe;")
    public static class109 field2928 = field2927;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Lre;")
    public class123 field2926;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lfb;")
    public class38 field2925;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[B")
    public byte[] field2923;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "[Lk;")
    public static class69[] field2929;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1068(byte[] arg0, int arg1) {
        class13 var2 = new class13(arg0);
        int var3 = var2.method142(27467);
        if (arg1 <= 16) {
            method1069(54, (byte) -104);
        }
        int var4 = var2.method112(false);
        field2919++;
        if (var4 < 0 || class42.field868 != 0 && var4 > class42.field868) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method119(var5, (byte) -122, var4, 0);
            return var5;
        } else {
            int var6 = var2.method112(false);
            if (var6 < 0 || class42.field868 != 0 && var6 > class42.field868) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class39.method374(var7, var6, arg0, var4, 9);
            } else {
                class77.field1601.method235(var7, var2, 10);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Lda;")
    public static final class23 method1069(int arg0, byte arg1) {
        field2920++;
        class23 var2 = (class23) class122.field2691.method93((byte) 103, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class32.field692.method742(arg0, -38, 1);
        class23 var4 = new class23();
        if (arg1 != 79) {
            field2933 = null;
        }
        if (var3 != null) {
            var4.method218((byte) 102, arg0, new class13(var3));
        }
        var4.method217((byte) 105);
        class122.field2691.method97((long) arg0, (byte) 80, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1070(boolean arg0) {
        field2931 = null;
        field2929 = null;
        field2927 = null;
        field2933 = null;
        field2921 = null;
        field2928 = null;
        field2930 = null;
        if (!arg0) {
            field2930 = null;
        }
        field2916 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)I")
    public static final int method1071(boolean arg0) {
        if (!arg0) {
            method1068(null, 112);
        }
        field2924++;
        return class12.field277++;
    }
}
