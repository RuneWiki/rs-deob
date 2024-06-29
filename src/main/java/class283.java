import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class283 {

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Z")
    public boolean field3901 = false;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Ldv;")
    public static class566 field3904 = new class566(18, -1);

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "[[I")
    public static int[][] field3911 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "[I")
    public static int[] field3910 = new int[2048];

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Lfca;")
    public static class74 field3912 = new class74("", 12);

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "Lcba;")
    public static class471 field3914 = new class471(44, 28);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lua;")
    public class572 field3902;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "Z")
    public static boolean field3913;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IF)F")
    public static final float method1818(int arg0, float arg1) {
        if (arg0 != 9) {
            method1822((byte) 71);
        }
        field3908++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ldaa;B)V")
    public final void method1819(class11 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method110((byte) 58);
            if (var3 == 0) {
                field3905++;
                if (arg1 != -79) {
                    field3914 = null;
                    return;
                }
                return;
            }
            this.method1820(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZILdaa;)V")
    private final void method1820(boolean arg0, int arg1, class11 arg2) {
        if (arg1 == 1) {
            this.field3906 = arg2.method93((byte) 83);
        } else if (arg1 == 2) {
            this.field3903 = arg2.method89((byte) -105);
        } else if (arg1 == 3) {
            this.field3901 = true;
        } else if (arg1 == 4) {
            this.field3906 = -1;
        }
        field3907++;
        if (!arg0) {
            this.method1823(true);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZLqa;)Lha;")
    public final class52 method1821(int arg0, int arg1, boolean arg2, class207 arg3) {
        field3909++;
        long var5 = (long) (arg3.field2923 << 19 | (arg2 ? 262144 : 0) | this.field3906 | arg1 << 16);
        class52 var7 = (class52) this.field3902.field7895.method3252(var5, (byte) 36);
        if (var7 != null) {
            return var7;
        } else if (this.field3902.field7892.method221(this.field3906, (byte) -72)) {
            class38 var8 = class38.method399(this.field3902.field7892, this.field3906, arg0);
            if (var8 != null) {
                var8.field788 = var8.field787 = var8.field789 = var8.field786 = 0;
                if (arg2) {
                    var8.method406();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method401();
                }
            }
            class52 var10 = arg3.method1332(var8, true);
            if (var10 != null) {
                this.field3902.field7895.method3243(var10, var5, 84);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method1822(byte arg0) {
        field3904 = null;
        field3912 = null;
        field3910 = null;
        field3914 = null;
        field3911 = null;
        if (arg0 < 40) {
            method1822((byte) -73);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Z")
    public final boolean method1823(boolean arg0) {
        field3900++;
        if (!arg0) {
            method1818(-81, -1.4782442F);
        }
        return this.field3902.field7892.method221(this.field3906, (byte) 73);
    }
}
