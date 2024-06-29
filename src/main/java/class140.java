import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 implements class67 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lwd;")
    private class157 field3229 = new class157();

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "D")
    private double field3231 = 1.0D;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    private int field3234 = 128;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    private int field3233 = 0;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Lea;")
    private class30 field3236;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[Lvb;")
    private class148[] field3228;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3219 = 0;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lec;")
    public static class32 field3226 = class73.method594("Texturen geladen)3", true);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lec;")
    public static class32 field3225 = class73.method594("::rect_debug", true);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lec;")
    private static class32 field3224 = class73.method594("Sorry invited players only)3", true);

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3235 = 0;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lec;")
    public static class32 field3217 = field3224;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "[[S")
    public static short[][] field3220;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ID)V")
    public final void method1050(int arg0, double arg1) {
        field3227++;
        this.field3231 = arg1;
        if (arg0 > -109) {
            this.field3234 = -68;
        }
        this.method1052(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
    public final void method1051(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field3228.length; var3++) {
            class148 var4 = this.field3228[var3];
            if (var4 != null && var4.field3358 != 0 && var4.field3367) {
                var4.method1104(arg1);
                var4.field3367 = false;
            }
        }
        field3223++;
        if (arg0 < 50) {
            this.method1050(80, -1.988483212553894D);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)Z")
    public final boolean method560(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1050(84, 1.3356680705686792D);
        }
        field3222++;
        return this.field3234 == 64;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public final void method1052(int arg0) {
        field3215++;
        for (int var2 = 0; var2 < this.field3228.length; var2++) {
            if (this.field3228[var2] != null) {
                this.field3228[var2].method1105();
            }
        }
        this.field3229 = new class157();
        this.field3233 = this.field3232;
        if (arg0 != 0) {
            this.method559(36, false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
    public final boolean method562(int arg0, int arg1) {
        if (arg0 == 17912) {
            field3221++;
            return this.field3228[arg1].field3361;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)I")
    public final int method559(int arg0, boolean arg1) {
        if (arg1) {
            field3226 = null;
        }
        field3216++;
        return this.field3228[arg0] == null ? 0 : this.field3228[arg0].field3362;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1053(byte arg0) {
        field3217 = null;
        field3226 = null;
        field3220 = null;
        if (arg0 != 11) {
            method1053((byte) 23);
        }
        field3224 = null;
        field3225 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
    public final int[] method561(int arg0, int arg1) {
        if (arg0 < 108) {
            field3219 = 127;
        }
        field3230++;
        class148 var3 = this.field3228[arg1];
        if (var3 != null) {
            if (var3.field3363 != null) {
                this.field3229.method1209(-94, var3);
                var3.field3367 = true;
                return var3.field3363;
            }
            boolean var4 = var3.method1107(this.field3231, this.field3234, this.field3236);
            if (var4) {
                if (this.field3233 == 0) {
                    class148 var5 = (class148) this.field3229.method1208((byte) 118);
                    var5.method1105();
                } else {
                    this.field3233--;
                }
                this.field3229.method1209(-19, var3);
                var3.field3367 = true;
                return var3.field3363;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lea;Lea;IDI)V")
    public class140(class30 arg0, class30 arg1, int arg2, double arg3, int arg4) {
        this.field3234 = arg4;
        this.field3231 = arg3;
        this.field3236 = arg1;
        this.field3232 = arg2;
        this.field3233 = this.field3232;
        int[] var7 = arg0.method207(0, 62);
        int var8 = var7.length;
        this.field3228 = new class148[arg0.method200((byte) 53, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class66 var10 = new class66(arg0.method206(0, var7[var9], -70));
            this.field3228[var7[var9]] = new class148(var10);
        }
    }
}
