import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class170 extends class101 {

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "Z")
    public boolean field3219 = false;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "[I")
    private int[] field3213 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public int field3218 = -1;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lnd;")
    public static class127 field3227 = new class127(64);

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Ltg;")
    private static class184 field3228 = class135.method812("RuneScape has been updated(Q", 3);

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field3230 = 127;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "Ltg;")
    public static class184 field3239 = class135.method812("<)4col>", 3);

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "Ltg;")
    public static class184 field3241 = field3228;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "Ltg;")
    public static class184 field3242 = class135.method812("", 3);

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "Ltg;")
    public static class184 field3237 = field3242;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "[Lud;")
    public static class190[] field3232 = new class190[256];

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "Lnd;")
    public static class127 field3240 = new class127(500);

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Ltg;")
    public static class184 field3243 = class135.method812("Ung-Ultiger Benutzername", 3);

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Z")
    public static boolean field3244 = false;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "Ltg;")
    public static class184 field3245 = class135.method812("Freie Welt", 3);

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lud;")
    public static class190 field3229;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "Lvb;")
    public static class197 field3235;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3238;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "[I")
    private int[] field3224;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "[I")
    public static int[] field3234;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "[S")
    private short[] field3212;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "[S")
    private short[] field3217;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "[S")
    private short[] field3221;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "[S")
    private short[] field3236;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILka;)V")
    public final void method1054(int arg0, class97 arg1) {
        if (arg0 != -1) {
            method1056(-70);
        }
        while (true) {
            int var3 = arg1.method588((byte) -103);
            if (var3 == 0) {
                field3226++;
                return;
            }
            this.method1059(arg1, (byte) 108, var3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Z")
    public final boolean method1055(int arg0) {
        field3216++;
        if (this.field3224 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 <= 112) {
            return true;
        }
        for (int var3 = 0; var3 < this.field3224.length; var3++) {
            if (!class45.field863.method1251(0, this.field3224[var3], 23947)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static void method1056(int arg0) {
        field3234 = null;
        field3238 = null;
        field3241 = null;
        field3243 = null;
        field3228 = null;
        field3237 = null;
        field3240 = null;
        if (arg0 != 127) {
            method1056(-46);
        }
        field3235 = null;
        field3239 = null;
        field3229 = null;
        field3227 = null;
        field3242 = null;
        field3232 = null;
        field3245 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z")
    public final boolean method1057(boolean arg0) {
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3213[var3] != -1 && !class45.field863.method1251(0, this.field3213[var3], 23947)) {
                var2 = false;
            }
        }
        field3222++;
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Ltd;")
    public final class181 method1058(int arg0) {
        field3215++;
        class181[] var2 = new class181[5];
        int var3 = 0;
        if (arg0 > -124) {
            method1060(113, -109);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3213[var4] != -1) {
                var2[var3++] = class181.method1124(class45.field863, this.field3213[var4], 0);
            }
        }
        class181 var5 = new class181(var2, var3);
        if (this.field3236 != null) {
            for (int var6 = 0; var6 < this.field3236.length; var6++) {
                var5.method1109(this.field3236[var6], this.field3221[var6]);
            }
        }
        if (this.field3217 != null) {
            for (int var7 = 0; var7 < this.field3217.length; var7++) {
                var5.method1113(this.field3217[var7], this.field3212[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lka;BI)V")
    private final void method1059(class97 arg0, byte arg1, int arg2) {
        field3225++;
        if (arg2 == 1) {
            this.field3218 = arg0.method588((byte) -34);
        } else if (arg2 == 2) {
            int var4 = arg0.method588((byte) -71);
            this.field3224 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3224[var5] = arg0.method611(false);
            }
        } else if (arg2 == 3) {
            this.field3219 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method588((byte) -99);
            this.field3221 = new short[var6];
            this.field3236 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3236[var7] = (short) arg0.method611(false);
                this.field3221[var7] = (short) arg0.method611(false);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method588((byte) -44);
            this.field3212 = new short[var8];
            this.field3217 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3217[var9] = (short) arg0.method611(false);
                this.field3212[var9] = (short) arg0.method611(false);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3213[arg2 - 60] = arg0.method611(false);
        }
        if (arg1 < 63) {
            method1060(-89, 48);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Ltg;")
    public static final class184 method1060(int arg0, int arg1) {
        field3220++;
        if (arg1 > -100) {
            method1060(-117, 0);
        }
        return class105.method656(false, (byte) 127, 10, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)Ltd;")
    public final class181 method1061(int arg0) {
        field3214++;
        if (this.field3224 == null) {
            return null;
        }
        class181[] var2 = new class181[this.field3224.length];
        int var3 = 0;
        if (arg0 > -74) {
            this.method1057(false);
        }
        while (var3 < this.field3224.length) {
            var2[var3] = class181.method1124(class45.field863, this.field3224[var3], 0);
            var3++;
        }
        class181 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class181(var2, var2.length);
        }
        if (this.field3236 != null) {
            for (int var5 = 0; var5 < this.field3236.length; var5++) {
                var4.method1109(this.field3236[var5], this.field3221[var5]);
            }
        }
        if (this.field3217 != null) {
            for (int var6 = 0; var6 < this.field3217.length; var6++) {
                var4.method1113(this.field3217[var6], this.field3212[var6]);
            }
        }
        return var4;
    }
}
