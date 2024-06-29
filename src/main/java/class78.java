import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class78 extends class313 {

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Z")
    private boolean field970 = false;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    public boolean field973 = false;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field968 = 0;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Llc;")
    private class385 field969 = new class385();

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    private int field977 = 0;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Lbd;")
    public class37 field978 = new class37();

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    private int field982 = 0;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Z")
    private boolean field984 = false;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Ljp;")
    public class198 field981 = new class198();

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[Lvf;")
    public class83[] field972 = new class83[8192];

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "J")
    private long field971;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "J")
    private long field976;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[Z")
    private static boolean[] field974 = new boolean[8];

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[Z")
    private static boolean[] field975 = new boolean[8];

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    private final void method485() {
        this.field970 = false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([Ljc;Z)V")
    private final void method486(class252[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field975[var3] = false;
        }
        label73: for (class297 var4 = (class297) this.field978.method253((byte) -6); var4 != null; var4 = (class297) this.field978.method247((byte) -128)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4726 || arg0[var7].field4109 == var4.field4726) {
                        field975[var7] = true;
                        var4.method2004(-122);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1120(57);
                this.field982--;
                if (var4.method87(true)) {
                    var4.method90((byte) -53);
                    class448.field6536--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field982 != 8; var5++) {
            if (!field975[var5]) {
                class297 var6 = null;
                if (class180.method1235(-30827, arg0[var5].field4110).field3258 == 1 && class448.field6536 < 32) {
                    var6 = new class297(arg0[var5], this);
                    class221.field3660.method2535(var6, 64, (long) arg0[var5].field4110);
                    class448.field6536++;
                }
                if (var6 == null) {
                    var6 = new class297(arg0[var5], this);
                }
                this.field978.method245(500, var6);
                this.field982++;
                field975[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Le;[Lkh;Z)V")
    private final void method487(class312 arg0, class11[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field974[var4] = false;
        }
        label64: for (class158 var5 = (class158) this.field969.method2430(67); var5 != null; var5 = (class158) this.field969.method2435(-224)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2493 || arg1[var8].field156 == var5.field2493) {
                        field974[var8] = true;
                        var5.method1110(true);
                        var5.field2495 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2524 == 0) {
                    var5.method2100(101);
                    this.field977--;
                } else {
                    var5.field2495 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field977 != 8; var6++) {
            if (!field974[var6]) {
                class158 var7 = new class158(arg0, arg1[var6], this, this.field971);
                this.field969.method2442(var7, (byte) 113);
                this.field977++;
                field974[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Le;J[Lkh;[Ljc;Z)V")
    public final void method488(class312 arg0, long arg1, class11[] arg2, class252[] arg3, boolean arg4) {
        if (!this.field973) {
            this.method487(arg0, arg2, arg4);
            this.method486(arg3, arg4);
            this.field971 = arg1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()Ljp;")
    public final class198 method489() {
        return this.field981;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()V")
    public static void method490() {
        field974 = null;
        field975 = null;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "()V")
    public final void method491() {
        this.field984 = true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field980 = arg0;
        this.field983 = arg1;
        this.field985 = arg3;
        this.field979 = arg4;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "()V")
    public final void method493() {
        this.field981.field3189.method2184(64);
        for (class158 var1 = (class158) this.field969.method2430(67); var1 != null; var1 = (class158) this.field969.method2435(-224)) {
            var1.method1111(true, this.field976);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(J)V")
    public final void method494(long arg0) {
        this.field971 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "()V")
    public final void method495() {
        this.field973 = true;
        for (class297 var1 = (class297) this.field978.method253((byte) -6); var1 != null; var1 = (class297) this.field978.method247((byte) -127)) {
            if (var1.field4716.field3258 == 1) {
                var1.method90((byte) -53);
            }
        }
        this.field972 = new class83[8192];
        this.field968 = 0;
        this.field969 = new class385();
        this.field977 = 0;
        this.field978 = new class37();
        this.field982 = 0;
        this.method2100(99);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Le;J)Z")
    public final boolean method496(class312 arg0, long arg1) {
        if (this.field976 == this.field971) {
            this.method485();
        } else {
            this.method497();
        }
        if (arg1 - this.field971 > 750L) {
            this.method495();
            return false;
        }
        int var4 = (int) (arg1 - this.field976);
        if (this.field984) {
            for (class158 var5 = (class158) this.field969.method2430(67); var5 != null; var5 = (class158) this.field969.method2435(-224)) {
                for (int var6 = 0; var6 < var5.field2486.field1713; var6++) {
                    var5.method1113(arg1, arg0, !this.field970, -125, 1);
                }
            }
            this.field984 = false;
        }
        for (class158 var7 = (class158) this.field969.method2430(67); var7 != null; var7 = (class158) this.field969.method2435(-224)) {
            var7.method1113(arg1, arg0, !this.field970, -126, var4);
        }
        this.field976 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "()V")
    public final void method497() {
        this.field970 = true;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        class43.field535.method2442(this, (byte) 125);
        this.field971 = (long) arg0;
        this.field976 = (long) arg0;
        this.field984 = true;
    }
}
