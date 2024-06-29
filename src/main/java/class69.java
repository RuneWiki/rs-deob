import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class69 extends class62 {

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public int field832 = 0;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
    private boolean field835 = false;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Z")
    public boolean field828 = false;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "Lwp;")
    private class288 field836 = new class288();

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
    private int field837 = 0;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "Lbb;")
    public class270 field838 = new class270();

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "Z")
    private boolean field843 = false;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
    private int field840 = 0;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "Lsk;")
    public class291 field839 = new class291();

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "[Lcd;")
    public class58[] field829 = new class58[8192];

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "J")
    private long field833;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "J")
    private long field830;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "[Z")
    private static boolean[] field834 = new boolean[8];

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "[Z")
    private static boolean[] field831 = new boolean[8];

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Luo;J[Lun;[Lkh;Z)V", line = 3)
    public final void method396(class118 arg0, long arg1, class103[] arg2, class345[] arg3, boolean arg4) {
        if (!this.field828) {
            this.method408(arg0, arg2, arg4);
            this.method403(arg3, arg4);
            this.field833 = arg1;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V", line = 11)
    public static void method397() {
        field834 = null;
        field831 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()V", line = 15)
    public final void method398() {
        this.field843 = true;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()V", line = 18)
    public final void method399() {
        this.field839.field3847.method426((byte) -107);
        for (class213 var1 = (class213) this.field836.method1838(-6325); var1 != null; var1 = (class213) this.field836.method1834((byte) 85)) {
            var1.method1302(-21799, this.field830);
        }
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "()V", line = 31)
    private final void method400() {
        this.field835 = false;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Luo;J)Z", line = 34)
    public final boolean method401(class118 arg0, long arg1) {
        if (this.field833 == this.field830) {
            this.method400();
        } else {
            this.method405();
        }
        if (arg1 - this.field833 > 750L) {
            this.method407();
            return false;
        }
        int var4 = (int) (arg1 - this.field830);
        if (this.field843) {
            for (class213 var5 = (class213) this.field836.method1838(-6325); var5 != null; var5 = (class213) this.field836.method1834((byte) 35)) {
                for (int var6 = 0; var6 < var5.field2605.field3929; var6++) {
                    var5.method1305(!this.field835, arg0, arg1, 1, -120);
                }
            }
            this.field843 = false;
        }
        for (class213 var7 = (class213) this.field836.method1838(-6325); var7 != null; var7 = (class213) this.field836.method1834((byte) 68)) {
            var7.method1305(!this.field835, arg0, arg1, var4, -115);
        }
        this.field830 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(J)V", line = 82)
    public final void method402(long arg0) {
        this.field833 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([Lkh;Z)V", line = 88)
    private final void method403(class345[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field831[var3] = false;
        }
        label73: for (class169 var4 = (class169) this.field838.method1690((byte) -128); var4 != null; var4 = (class169) this.field838.method1699((byte) 83)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1980 || arg0[var7].field4687 == var4.field1980) {
                        field831[var7] = true;
                        var4.method1078((byte) -126);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method263(false);
                this.field840--;
                if (var4.method1121((byte) -103)) {
                    var4.method1123((byte) -31);
                    class136.field1547--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field840 != 8; var5++) {
            if (!field831[var5]) {
                class169 var6 = null;
                if (class104.method619(arg0[var5].field4692, (byte) -69).field2520 == 1 && class136.field1547 < 32) {
                    var6 = new class169(arg0[var5], this);
                    class345.field4691.method1174((long) arg0[var5].field4692, var6, 30059);
                    class136.field1547++;
                }
                if (var6 == null) {
                    var6 = new class169(arg0[var5], this);
                }
                this.field838.method1696(false, var6);
                this.field840++;
                field831[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "()Lsk;", line = 175)
    public final class291 method404() {
        return this.field839;
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "()V", line = 178)
    public final void method405() {
        this.field835 = true;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V", line = 332)
    public class69(int arg0) {
        class220.field2722.method1833(this, 10209);
        this.field833 = (long) arg0;
        this.field830 = (long) arg0;
        this.field843 = true;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V", line = 189)
    public final void method406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field842 = arg0;
        this.field845 = arg1;
        this.field841 = arg3;
        this.field844 = arg4;
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "()V", line = 197)
    public final void method407() {
        this.field828 = true;
        for (class169 var1 = (class169) this.field838.method1690((byte) -111); var1 != null; var1 = (class169) this.field838.method1699((byte) 91)) {
            if (var1.field1976.field2520 == 1) {
                var1.method1123((byte) -31);
            }
        }
        this.field829 = new class58[8192];
        this.field832 = 0;
        this.field836 = new class288();
        this.field837 = 0;
        this.field838 = new class270();
        this.field840 = 0;
        this.method358(42);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Luo;[Lun;Z)V", line = 229)
    private final void method408(class118 arg0, class103[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field834[var4] = false;
        }
        label64: for (class213 var5 = (class213) this.field836.method1838(-6325); var5 != null; var5 = (class213) this.field836.method1834((byte) 90)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2616 || arg1[var8].field1204 == var5.field2616) {
                        field834[var8] = true;
                        var5.method1304((byte) -124);
                        var5.field2610 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2608 == 0) {
                    var5.method358(42);
                    this.field837--;
                } else {
                    var5.field2610 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field837 != 8; var6++) {
            if (!field834[var6]) {
                class213 var7 = new class213(arg0, arg1[var6], this, this.field833);
                this.field836.method1833(var7, 10209);
                this.field837++;
                field834[var6] = true;
            }
        }
    }
}
