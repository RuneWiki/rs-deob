import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class123 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lt;")
    private class200 field2180 = new class200();

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lri;")
    public static class189 field2181 = new class189(20);

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2184 = -1;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2188 = -1;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Ldj;")
    public static class44 field2187 = class89.method650(255, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ldj;")
    private static class44 field2190 = class89.method650(255, "FULL");

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Ldj;")
    public static class44 field2192 = field2190;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lh;")
    public static class77 field2193;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZII)I")
    public static final int method842(boolean arg0, int arg1, int arg2) {
        field2189++;
        if (arg0) {
            field2184 = -127;
        }
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLdj;)Lda;")
    public static final class35 method843(boolean arg0, class44 arg1) {
        field2179++;
        if (arg1.method340(3) == 0) {
            return null;
        }
        if (arg0) {
            method848(true);
        }
        for (class35 var2 = (class35) class186.field3217.method1189(0); var2 != null; var2 = (class35) class186.field3217.method1192((byte) -78)) {
            if (var2.field626.method300(arg1, false)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLdj;)V")
    public static final void method844(byte arg0, class44 arg1) {
        field2178++;
        if (class28.field496 == null) {
            return;
        }
        int var2 = 43 % ((arg0 + 19) / 34);
        int var3 = 0;
        long var4 = arg1.method306(-58);
        if (var4 == 0L) {
            return;
        }
        while (var3 < class28.field496.length && class28.field496[var3].field3186 != var4) {
            var3++;
        }
        if (var3 < class28.field496.length && class28.field496[var3] != null) {
            class200.field3542.method1170(187, (byte) -93);
            class200.field3542.method536(class28.field496[var3].field3186, 67);
            class202.field3630++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILt;)V")
    public final void method845(int arg0, class200 arg1) {
        field2185++;
        if (arg0 < 99) {
            this.method845(120, null);
        }
        if (arg1.field3531 != null) {
            arg1.method1288(false);
        }
        arg1.field3531 = this.field2180.field3531;
        arg1.field3529 = this.field2180;
        arg1.field3531.field3529 = arg1;
        arg1.field3529.field3531 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lt;I)V")
    public final void method846(class200 arg0, int arg1) {
        if (arg0.field3531 != null) {
            arg0.method1288(false);
        }
        int var3 = 39 / ((13 - arg1) / 33);
        field2186++;
        arg0.field3531 = this.field2180;
        arg0.field3529 = this.field2180.field3529;
        arg0.field3531.field3529 = arg0;
        arg0.field3529.field3531 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lt;")
    public final class200 method847(int arg0) {
        field2183++;
        class200 var2 = this.field2180.field3529;
        if (this.field2180 == var2) {
            return null;
        } else {
            if (arg0 != 15731) {
                this.field2180 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method848(boolean arg0) {
        field2181 = null;
        field2192 = null;
        if (arg0) {
            field2190 = null;
            field2193 = null;
            field2187 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method849(int arg0) {
        field2177++;
        class215.field3909.method676(0);
        if (arg0 != -1111898163) {
            method842(false, 67, -26);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lt;")
    public final class200 method850(int arg0) {
        field2191++;
        class200 var2 = this.field2180.field3529;
        if (arg0 != -1) {
            return null;
        } else if (this.field2180 == var2) {
            return null;
        } else {
            var2.method1288(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class123() {
        this.field2180.field3531 = this.field2180;
        this.field2180.field3529 = this.field2180;
    }
}
