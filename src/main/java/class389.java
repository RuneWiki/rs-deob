import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class389 extends class12 {

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
    private boolean field5697 = false;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Z")
    public boolean field5704 = false;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field5698 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lbn;")
    private class257 field5696 = new class257();

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    private int field5706 = 0;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Lvn;")
    public class169 field5705 = new class169();

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    private int field5708 = 0;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Z")
    private boolean field5713 = false;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "Lbg;")
    public class271 field5712 = new class271();

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[Lpr;")
    public class258[] field5699 = new class258[8192];

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "J")
    private long field5702;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "J")
    private long field5703;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[Z")
    private static boolean[] field5700 = new boolean[8];

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "[Z")
    private static boolean[] field5701 = new boolean[8];

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public int field5707;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public int field5710;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public int field5711;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V", line = 4)
    public static void method2481() {
        field5700 = null;
        field5701 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([Lor;Z)V", line = 10)
    private final void method2482(class382[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5701[var3] = false;
        }
        label73: for (class155 var4 = (class155) this.field5705.method1124(-1); var4 != null; var4 = (class155) this.field5705.method1119(false)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2214 || arg0[var7].field5607 == var4.field2214) {
                        field5701[var7] = true;
                        var4.method1025((byte) 93);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2290((byte) 98);
                this.field5708--;
                if (var4.method2520((byte) -10)) {
                    var4.method2519(-2107);
                    class56.field634--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5708 != 8; var5++) {
            if (!field5701[var5]) {
                class155 var6 = null;
                if (class334.method2146(arg0[var5].field5603, -8239).field1863 == 1 && class56.field634 < 32) {
                    var6 = new class155(arg0[var5], this);
                    class369.field5410.method2739((byte) -126, var6, (long) arg0[var5].field5603);
                    class56.field634++;
                }
                if (var6 == null) {
                    var6 = new class155(arg0[var5], this);
                }
                this.field5705.method1125(-1, var6);
                this.field5708++;
                field5701[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V", line = 95)
    public final void method2483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5711 = arg0;
        this.field5707 = arg1;
        this.field5710 = arg3;
        this.field5709 = arg4;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V", line = 332)
    public class389(int arg0) {
        class268.field3774.method1605(this, -14638);
        this.field5702 = (long) arg0;
        this.field5703 = (long) arg0;
        this.field5713 = true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Len;[Lnr;Z)V", line = 109)
    private final void method2484(class174 arg0, class35[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5700[var4] = false;
        }
        label64: for (class245 var5 = (class245) this.field5696.method1604((byte) -90); var5 != null; var5 = (class245) this.field5696.method1612(-1)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3325 || arg1[var8].field352 == var5.field3325) {
                        field5700[var8] = true;
                        var5.method1549((byte) 127);
                        var5.field3328 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3304 == 0) {
                    var5.method96(3);
                    this.field5706--;
                } else {
                    var5.field3328 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5706 != 8; var6++) {
            if (!field5700[var6]) {
                class245 var7 = new class245(arg0, arg1[var6], this, this.field5702);
                this.field5696.method1605(var7, -14638);
                this.field5706++;
                field5700[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Len;J[Lnr;[Lor;Z)V", line = 183)
    public final void method2485(class174 arg0, long arg1, class35[] arg2, class382[] arg3, boolean arg4) {
        if (!this.field5704) {
            this.method2484(arg0, arg2, arg4);
            this.method2482(arg3, arg4);
            this.field5702 = arg1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(J)V", line = 192)
    public final void method2486(long arg0) {
        this.field5702 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "()V", line = 195)
    public final void method2487() {
        this.field5712.field3845.method2559(1);
        for (class245 var1 = (class245) this.field5696.method1604((byte) -123); var1 != null; var1 = (class245) this.field5696.method1612(-1)) {
            var1.method1546(-25502, this.field5703);
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "()V", line = 209)
    public final void method2488() {
        this.field5713 = true;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "()V", line = 213)
    public final void method2489() {
        this.field5704 = true;
        for (class155 var1 = (class155) this.field5705.method1124(-1); var1 != null; var1 = (class155) this.field5705.method1119(false)) {
            if (var1.field2213.field1863 == 1) {
                var1.method2519(-2107);
            }
        }
        this.field5699 = new class258[8192];
        this.field5698 = 0;
        this.field5696 = new class257();
        this.field5706 = 0;
        this.field5705 = new class169();
        this.field5708 = 0;
        this.method96(3);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Len;J)Z", line = 234)
    public final boolean method2490(class174 arg0, long arg1) {
        if (this.field5703 == this.field5702) {
            this.method2493();
        } else {
            this.method2491();
        }
        if (arg1 - this.field5702 > 750L) {
            this.method2489();
            return false;
        }
        int var4 = (int) (arg1 - this.field5703);
        if (this.field5713) {
            for (class245 var5 = (class245) this.field5696.method1604((byte) 100); var5 != null; var5 = (class245) this.field5696.method1612(-1)) {
                for (int var6 = 0; var6 < var5.field3318.field439; var6++) {
                    var5.method1547(arg1, -24012, arg0, 1, !this.field5697);
                }
            }
            this.field5713 = false;
        }
        for (class245 var7 = (class245) this.field5696.method1604((byte) 121); var7 != null; var7 = (class245) this.field5696.method1612(-1)) {
            var7.method1547(arg1, -24012, arg0, var4, !this.field5697);
        }
        this.field5703 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "()V", line = 283)
    public final void method2491() {
        this.field5697 = true;
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "()Lbg;", line = 289)
    public final class271 method2492() {
        return this.field5712;
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "()V", line = 293)
    private final void method2493() {
        this.field5697 = false;
    }
}
