import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class167 {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lfa;")
    private class156 field2364 = new class156(64);

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lfa;")
    public class156 field2372 = new class156(2);

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lfs;")
    public class387 field2369;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lfs;")
    private class387 field2363;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lbg;")
    public static class324 field2368 = new class324(56, 4);

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lbg;")
    public static class324 field2373 = new class324(51, 14);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "F")
    public static float field2374;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[Lic;")
    public static class491[] field2366;

    static {
        new class331("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lfn;", line = 6)
    public final class92 method1176(int arg0, int arg1) {
        field2370++;
        class156 var3 = this.field2364;
        class92 var4;
        synchronized (this.field2364) {
            var4 = (class92) this.field2364.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -100 % ((-arg1 - 62) / 37);
        byte[] var6 = this.field2363.method2363(arg0, 33, 87);
        class92 var7 = new class92();
        var7.field1262 = this;
        if (var6 != null) {
            var7.method815(new class65(var6), 27223);
        }
        class156 var8 = this.field2364;
        synchronized (this.field2364) {
            this.field2364.method1107(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 38)
    public final void method1177(boolean arg0) {
        class156 var2 = this.field2364;
        synchronized (this.field2364) {
            this.field2364.method1105(false);
        }
        if (!arg0) {
            this.method1180(51, 124);
        }
        field2365++;
        class156 var3 = this.field2372;
        synchronized (this.field2372) {
            this.field2372.method1105(false);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 55)
    public final void method1178(int arg0) {
        class156 var2 = this.field2364;
        synchronized (this.field2364) {
            if (arg0 != 64) {
                field2366 = null;
            }
            this.field2364.method1119(73);
        }
        field2361++;
        class156 var3 = this.field2372;
        synchronized (this.field2372) {
            this.field2372.method1119(96);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIIII)V", line = 71)
    public static final void method1179(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < arg2) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                class141.field1996[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg2; var6 < arg1; var6++) {
                class141.field1996[var6][arg3] = arg4;
            }
        }
        if (arg0 == -17) {
            field2371++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V", line = 108)
    public final void method1180(int arg0, int arg1) {
        class156 var3 = this.field2364;
        synchronized (this.field2364) {
            this.field2364.method1116(arg0, arg1 + 24555);
        }
        field2367++;
        class156 var4 = this.field2372;
        synchronized (this.field2372) {
            this.field2372.method1116(arg0, -50);
        }
        if (arg1 != -24605) {
            this.field2369 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljk;ILfs;Lfs;)V", line = 150)
    public class167(class446 arg0, int arg1, class387 arg2, class387 arg3) {
        this.field2369 = arg3;
        this.field2363 = arg2;
        this.field2363.method2367(33, 28724);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 130)
    public static void method1181(int arg0) {
        if (arg0 == 56) {
            field2366 = null;
            field2373 = null;
            field2368 = null;
        }
    }
}
