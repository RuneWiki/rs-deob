import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class766 extends class112 {

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "Z")
    private boolean field10545 = false;

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "Z")
    public boolean field10547 = false;

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "I")
    public int field10549 = 0;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "Lml;")
    private class408 field10541 = new class408();

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
    private int field10551 = 0;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "Lifa;")
    public class450 field10550 = new class450();

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "Z")
    private boolean field10552 = false;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
    private int field10555 = 0;

    @OriginalMember(owner = "client!sia", name = "A", descriptor = "Z")
    public boolean field10556 = false;

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "Laf;")
    public class460 field10554 = new class460();

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "[Lcs;")
    public class360[] field10544 = new class360[8192];

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "[Z")
    private static boolean[] field10542 = new boolean[32];

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "[Z")
    private static boolean[] field10548 = new boolean[8];

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    public int field10553;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "J")
    private long field10543;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "J")
    private long field10546;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIII)V")
    public final void method4240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10553 = arg0;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "()V")
    public static void method4241() {
        field10542 = null;
        field10548 = null;
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "()V")
    private final void method4242() {
        this.field10545 = false;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([Lir;Z)V")
    private final void method4243(class28[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field10548[var3] = false;
        }
        label76: for (class109 var4 = (class109) this.field10550.method2725(37); var4 != null; var4 = (class109) this.field10550.method2726(-122)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1368 || arg0[var7].field431 == var4.field1368) {
                        field10548[var7] = true;
                        var4.method878((byte) 90);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2219(13630);
                this.field10555--;
                if (var4.method1092(-97)) {
                    var4.method1088(4);
                    class43.field592--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field10555 != 8; var5++) {
            if (!field10548[var5]) {
                class109 var6 = null;
                if (arg0[var5].method268((byte) 28).field4659 == 1 && class43.field592 < 32) {
                    var6 = new class109(arg0[var5], this);
                    class150.field1870.method949((byte) 26, var6, (long) arg0[var5].field426);
                    class43.field592++;
                }
                if (var6 == null) {
                    var6 = new class109(arg0[var5], this);
                }
                this.field10550.method2732(var6, 21939);
                this.field10555++;
                field10548[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "()Laf;")
    public final class460 method4244() {
        return this.field10554;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(J)V")
    public final void method4245(long arg0) {
        this.field10546 = arg0;
    }

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "()V")
    public final void method4246() {
        this.field10552 = true;
    }

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "()V")
    public final void method4247() {
        this.field10545 = true;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZ)V")
    private final void method4248(int arg0, boolean arg1) {
        class148.field1836.method2444(11586, this);
        this.field10546 = arg0;
        this.field10543 = arg0;
        this.field10552 = true;
        this.field10556 = arg1;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method4249(class66 arg0, long arg1) {
        if (this.field10546 == this.field10543) {
            this.method4242();
        } else {
            this.method4247();
        }
        if (arg1 - this.field10546 > 750L) {
            this.method4251();
            return false;
        }
        int var4 = (int) (arg1 - this.field10543);
        if (this.field10552) {
            for (class375 var5 = (class375) this.field10541.method2447(-123); var5 != null; var5 = (class375) this.field10541.method2439(-101)) {
                for (int var6 = 0; var6 < var5.field4711.field5150; var6++) {
                    var5.method2186(1, !this.field10545, 100, arg0, arg1);
                }
            }
            this.field10552 = false;
        }
        for (class375 var7 = (class375) this.field10541.method2447(-92); var7 != null; var7 = (class375) this.field10541.method2439(-95)) {
            var7.method2186(var4, !this.field10545, 104, arg0, arg1);
        }
        this.field10543 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lha;J[Lmk;[Lir;Z)V")
    public final void method4250(class66 arg0, long arg1, class62[] arg2, class28[] arg3, boolean arg4) {
        if (!this.field10547) {
            this.method4254(arg0, arg2, arg4);
            this.method4243(arg3, arg4);
            this.field10546 = arg1;
        }
    }

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "()V")
    public final void method4251() {
        this.field10547 = true;
        for (class109 var1 = (class109) this.field10550.method2725(37); var1 != null; var1 = (class109) this.field10550.method2726(-128)) {
            if (var1.field1367.field4659 == 1) {
                var1.method1088(4);
            }
        }
        for (int var2 = 0; var2 < this.field10544.length; var2++) {
            if (this.field10544[var2] != null) {
                this.field10544[var2].method2105();
                this.field10544[var2] = null;
            }
        }
        this.field10549 = 0;
        this.field10541 = new class408();
        this.field10551 = 0;
        this.field10550 = new class450();
        this.field10555 = 0;
        this.method892(50560);
        class345.field4326[class537.field7551] = this;
        class537.field7551 = class537.field7551 + 1 & class384.field4906[class538.field7580];
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lha;)V")
    public final void method4252(class66 arg0) {
        this.field10554.field6472.method1059(-121);
        for (class375 var2 = (class375) this.field10541.method2447(-85); var2 != null; var2 = (class375) this.field10541.method2439(-89)) {
            var2.method2184(arg0, this.field10543, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(IZ)Lsia;")
    public static final class766 method4253(int arg0, boolean arg1) {
        if (class537.field7551 == class413.field5388) {
            return new class766(arg0, arg1);
        } else {
            class766 var2 = class345.field4326[class413.field5388];
            class413.field5388 = class413.field5388 + 1 & class384.field4906[class538.field7580];
            var2.method4248(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lha;[Lmk;Z)V")
    private final void method4254(class66 arg0, class62[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field10542[var4] = false;
        }
        label67: for (class375 var5 = (class375) this.field10541.method2447(-123); var5 != null; var5 = (class375) this.field10541.method2439(-126)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4714 || arg1[var8].field846 == var5.field4714) {
                        field10542[var8] = true;
                        var5.method2187(63);
                        var5.field4700 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4699 == 0) {
                    var5.method892(50560);
                    this.field10551--;
                } else {
                    var5.field4700 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field10551 != 32; var6++) {
            if (!field10542[var6]) {
                class375 var7 = new class375(arg0, arg1[var6], this, this.field10546);
                this.field10541.method2444(11586, var7);
                this.field10551++;
                field10542[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "()Laf;")
    public final class460 method4255() {
        this.field10554.field6472.method1059(-128);
        for (int var1 = 0; var1 < this.field10544.length; var1++) {
            if (this.field10544[var1] != null && this.field10544[var1].field4471 != null) {
                this.field10554.field6472.method1054(false, this.field10544[var1]);
            }
        }
        return this.field10554;
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(IZ)V")
    private class766(int arg0, boolean arg1) {
        this.method4248(arg0, arg1);
    }
}
