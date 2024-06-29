import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class54 extends class435 {

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Z")
    public boolean field864 = false;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public int field868 = 0;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "Z")
    private boolean field869 = false;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Ljl;")
    private class391 field867 = new class391();

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    private int field873 = 0;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Lvq;")
    public class22 field872 = new class22();

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "Z")
    private boolean field878 = false;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    private int field876 = 0;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "Lhe;")
    public class30 field874 = new class30();

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[Lbj;")
    public class251[] field871 = new class251[8192];

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "J")
    private long field863;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "J")
    private long field865;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "[Z")
    private static boolean[] field866 = new boolean[8];

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "[Z")
    private static boolean[] field870 = new boolean[8];

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 3)
    public final void method421() {
        this.field864 = true;
        for (class358 var1 = (class358) this.field872.method157((byte) -125); var1 != null; var1 = (class358) this.field872.method145(55)) {
            if (var1.field5109.field3431 == 1) {
                var1.method1398(110);
            }
        }
        this.field871 = new class251[8192];
        this.field868 = 0;
        this.field867 = new class391();
        this.field873 = 0;
        this.field872 = new class22();
        this.field876 = 0;
        this.method2731((byte) 87);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lja;J)Z", line = 24)
    public final boolean method422(class90 arg0, long arg1) {
        if (this.field865 == this.field863) {
            this.method425();
        } else {
            this.method431();
        }
        if (arg1 - this.field863 > 750L) {
            this.method421();
            return false;
        }
        int var4 = (int) (arg1 - this.field865);
        if (this.field878) {
            for (class347 var5 = (class347) this.field867.method2496(100); var5 != null; var5 = (class347) this.field867.method2487(0)) {
                for (int var6 = 0; var6 < var5.field4898.field1062; var6++) {
                    var5.method2236(1, -941343039, arg1, arg0, !this.field869);
                }
            }
            this.field878 = false;
        }
        for (class347 var7 = (class347) this.field867.method2496(122); var7 != null; var7 = (class347) this.field867.method2487(0)) {
            var7.method2236(var4, -941343039, arg1, arg0, !this.field869);
        }
        this.field865 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lja;[Loo;Z)V", line = 74)
    private final void method423(class90 arg0, class383[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field870[var4] = false;
        }
        label64: for (class347 var5 = (class347) this.field867.method2496(110); var5 != null; var5 = (class347) this.field867.method2487(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4916 || arg1[var8].field5488 == var5.field4916) {
                        field870[var8] = true;
                        var5.method2237((byte) -73);
                        var5.field4886 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4892 == 0) {
                    var5.method2731((byte) 88);
                    this.field873--;
                } else {
                    var5.field4886 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field873 != 8; var6++) {
            if (!field870[var6]) {
                class347 var7 = new class347(arg0, arg1[var6], this, this.field863);
                this.field867.method2483(126, var7);
                this.field873++;
                field870[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lja;J[Loo;[Lbo;Z)V", line = 147)
    public final void method424(class90 arg0, long arg1, class383[] arg2, class354[] arg3, boolean arg4) {
        if (!this.field864) {
            this.method423(arg0, arg2, arg4);
            this.method433(arg3, arg4);
            this.field863 = arg1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()V", line = 155)
    private final void method425() {
        this.field869 = false;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()V", line = 159)
    public final void method426() {
        this.field874.field428.method1001((byte) 108);
        for (class347 var1 = (class347) this.field867.method2496(104); var1 != null; var1 = (class347) this.field867.method2487(0)) {
            var1.method2238(65535, this.field865);
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()Lhe;", line = 172)
    public final class30 method427() {
        return this.field874;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "()V", line = 176)
    public final void method428() {
        this.field878 = true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V", line = 182)
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field880 = arg0;
        this.field875 = arg1;
        this.field877 = arg3;
        this.field879 = arg4;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I)V", line = 332)
    public class54(int arg0) {
        class322.field4654.method2483(122, this);
        this.field863 = (long) arg0;
        this.field865 = (long) arg0;
        this.field878 = true;
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "()V", line = 193)
    public static void method430() {
        field870 = null;
        field866 = null;
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "()V", line = 200)
    public final void method431() {
        this.field869 = true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(J)V", line = 210)
    public final void method432(long arg0) {
        this.field863 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([Lbo;Z)V", line = 219)
    private final void method433(class354[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field866[var3] = false;
        }
        label73: for (class358 var4 = (class358) this.field872.method157((byte) -125); var4 != null; var4 = (class358) this.field872.method145(-122)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field5115 || arg0[var7].field5040 == var4.field5115) {
                        field866[var7] = true;
                        var4.method2299(29764);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method251(42);
                this.field876--;
                if (var4.method1402(24997)) {
                    var4.method1398(110);
                    class311.field4528--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field876 != 8; var5++) {
            if (!field866[var5]) {
                class358 var6 = null;
                if (class402.method2552((byte) -125, arg0[var5].field5035).field3431 == 1 && class311.field4528 < 32) {
                    var6 = new class358(arg0[var5], this);
                    class26.field389.method2171(var6, (long) arg0[var5].field5035, 0);
                    class311.field4528++;
                }
                if (var6 == null) {
                    var6 = new class358(arg0[var5], this);
                }
                this.field872.method148((byte) 84, var6);
                this.field876++;
                field866[var5] = true;
            }
        }
    }
}
