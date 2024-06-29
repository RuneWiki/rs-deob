import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class59 extends class294 {

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public int field814 = 0;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "Z")
    public boolean field819 = false;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Z")
    private boolean field812 = false;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "Lsc;")
    private class250 field816 = new class250();

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    private int field822 = 0;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Lat;")
    public class412 field821 = new class412();

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "Z")
    private boolean field826 = false;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    private int field829 = 0;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "Lim;")
    public class268 field825 = new class268();

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "[Lwk;")
    public class300[] field818 = new class300[8192];

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "J")
    private long field820;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "J")
    private long field817;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "[Z")
    private static boolean[] field815 = new boolean[8];

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[Z")
    private static boolean[] field813 = new boolean[8];

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([Lam;Z)V")
    private final void method455(class493[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field815[var3] = false;
        }
        label73: for (class71 var4 = (class71) this.field821.method2456(32101); var4 != null; var4 = (class71) this.field821.method2461(301)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field960 || arg0[var7].field6946 == var4.field960) {
                        field815[var7] = true;
                        var4.method616(0);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method283(2);
                this.field829--;
                if (var4.method700(108)) {
                    var4.method701(-124);
                    class303.field4506--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field829 != 8; var5++) {
            if (!field815[var5]) {
                class71 var6 = null;
                if (class25.method217(true, arg0[var5].field6943).field6425 == 1 && class303.field4506 < 32) {
                    var6 = new class71(arg0[var5], this);
                    class81.field1143.method2291((long) arg0[var5].field6943, false, var6);
                    class303.field4506++;
                }
                if (var6 == null) {
                    var6 = new class71(arg0[var5], this);
                }
                this.field821.method2453((byte) -88, var6);
                this.field829++;
                field815[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "()V")
    public final void method456() {
        this.field812 = true;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "()V")
    public final void method457() {
        this.field825.field3965.method2410(8);
        for (class38 var1 = (class38) this.field816.method1594(16); var1 != null; var1 = (class38) this.field816.method1596(true)) {
            var1.method297(this.field817, -5430);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "()V")
    public final void method458() {
        this.field826 = true;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "()Lim;")
    public final class268 method459() {
        return this.field825;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ltq;J)Z")
    public final boolean method460(class63 arg0, long arg1) {
        if (this.field820 == this.field817) {
            this.method467();
        } else {
            this.method456();
        }
        if (arg1 - this.field820 > 750L) {
            this.method465();
            return false;
        }
        int var4 = (int) (arg1 - this.field817);
        if (this.field826) {
            for (class38 var5 = (class38) this.field816.method1594(16); var5 != null; var5 = (class38) this.field816.method1596(true)) {
                for (int var6 = 0; var6 < var5.field511.field4339; var6++) {
                    var5.method296(1, arg0, true, arg1, !this.field812);
                }
            }
            this.field826 = false;
        }
        for (class38 var7 = (class38) this.field816.method1594(16); var7 != null; var7 = (class38) this.field816.method1596(true)) {
            var7.method296(var4, arg0, true, arg1, !this.field812);
        }
        this.field817 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "()V")
    public static void method461() {
        field813 = null;
        field815 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ltq;[Lqt;Z)V")
    private final void method462(class63 arg0, class275[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field813[var4] = false;
        }
        label64: for (class38 var5 = (class38) this.field816.method1594(16); var5 != null; var5 = (class38) this.field816.method1596(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field506 || arg1[var8].field4177 == var5.field506) {
                        field813[var8] = true;
                        var5.method294(178526416);
                        var5.field495 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field500 == 0) {
                    var5.method1847(true);
                    this.field822--;
                } else {
                    var5.field495 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field822 != 8; var6++) {
            if (!field813[var6]) {
                class38 var7 = new class38(arg0, arg1[var6], this, this.field820);
                this.field816.method1597(var7, (byte) 109);
                this.field822++;
                field813[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIIII)V")
    public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field824 = arg0;
        this.field830 = arg1;
        this.field823 = arg2;
        this.field828 = arg3;
        this.field827 = arg4;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(J)V")
    public final void method464(long arg0) {
        this.field820 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "()V")
    public final void method465() {
        this.field819 = true;
        for (class71 var1 = (class71) this.field821.method2456(32101); var1 != null; var1 = (class71) this.field821.method2461(301)) {
            if (var1.field956.field6425 == 1) {
                var1.method701(-50);
            }
        }
        this.field818 = new class300[8192];
        this.field814 = 0;
        this.field816 = new class250();
        this.field822 = 0;
        this.field821 = new class412();
        this.field829 = 0;
        this.method1847(true);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ltq;J[Lqt;[Lam;Z)V")
    public final void method466(class63 arg0, long arg1, class275[] arg2, class493[] arg3, boolean arg4) {
        if (!this.field819) {
            this.method462(arg0, arg2, arg4);
            this.method455(arg3, arg4);
            this.field820 = arg1;
        }
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "()V")
    private final void method467() {
        this.field812 = false;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V")
    public class59(int arg0) {
        class10.field153.method1597(this, (byte) 82);
        this.field820 = (long) arg0;
        this.field817 = (long) arg0;
        this.field826 = true;
    }
}
