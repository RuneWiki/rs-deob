import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class753 extends class105 {

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Z")
    private boolean field10487 = false;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field10488 = 0;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Z")
    public boolean field10494 = false;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lhda;")
    private class747 field10490 = new class747();

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    private int field10496 = 0;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lnt;")
    public class220 field10495 = new class220();

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
    private boolean field10499 = false;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    private int field10498 = 0;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Z")
    public boolean field10500 = false;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Loo;")
    public class624 field10497 = new class624();

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[Lgj;")
    public class632[] field10492 = new class632[8192];

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[Z")
    private static boolean[] field10486 = new boolean[8];

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[Z")
    private static boolean[] field10493 = new boolean[32];

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public int field10501;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "J")
    private long field10489;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "J")
    private long field10491;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(J)V", line = 3)
    public final void method4173(long arg0) {
        this.field10489 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;J)Z", line = 6)
    public final boolean method4174(class58 arg0, long arg1) {
        if (this.field10491 == this.field10489) {
            this.method4181();
        } else {
            this.method4179();
        }
        if (arg1 - this.field10489 > 750L) {
            this.method4177();
            return false;
        }
        int var4 = (int) (arg1 - this.field10491);
        if (this.field10499) {
            for (class131 var5 = (class131) this.field10490.method4159(0); var5 != null; var5 = (class131) this.field10490.method4151(7)) {
                for (int var6 = 0; var6 < var5.field1959.field8044; var6++) {
                    var5.method1001(!this.field10487, 1, (byte) 7, arg1, arg0);
                }
            }
            this.field10499 = false;
        }
        for (class131 var7 = (class131) this.field10490.method4159(0); var7 != null; var7 = (class131) this.field10490.method4151(7)) {
            var7.method1001(!this.field10487, var4, (byte) 7, arg1, arg0);
        }
        this.field10491 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;)V", line = 54)
    public final void method4175(class58 arg0) {
        this.field10497.field8974.method2300(true);
        for (class131 var2 = (class131) this.field10490.method4159(0); var2 != null; var2 = (class131) this.field10490.method4151(7)) {
            var2.method1000(arg0, this.field10491, 39);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V", line = 66)
    public final void method4176(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10501 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 77)
    public final void method4177() {
        this.field10494 = true;
        for (class436 var1 = (class436) this.field10495.method1522(true); var1 != null; var1 = (class436) this.field10495.method1527((byte) 82)) {
            if (var1.field6090.field7049 == 1) {
                var1.method1553(-110);
            }
        }
        for (int var2 = 0; var2 < this.field10492.length; var2++) {
            if (this.field10492[var2] != null) {
                this.field10492[var2].method3635();
                this.field10492[var2] = null;
            }
        }
        this.field10488 = 0;
        this.field10490 = new class747();
        this.field10496 = 0;
        this.field10495 = new class220();
        this.field10498 = 0;
        this.method909(105);
        class464.field6699[class172.field2498] = this;
        class172.field2498 = class172.field2498 + 1 & class590.field8289[class508.field7250];
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V", line = 114)
    public final void method4178() {
        this.field10499 = true;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V", line = 117)
    public final void method4179() {
        this.field10487 = true;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()Loo;", line = 120)
    public final class624 method4180() {
        this.field10497.field8974.method2300(true);
        for (int var1 = 0; var1 < this.field10492.length; var1++) {
            if (this.field10492[var1] != null && this.field10492[var1].field9054 != null) {
                this.field10497.field8974.method2304(this.field10492[var1], (byte) -125);
            }
        }
        return this.field10497;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V", line = 135)
    private final void method4181() {
        this.field10487 = false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;[Lgi;Z)V", line = 140)
    private final void method4182(class58 arg0, class675[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field10493[var4] = false;
        }
        label67: for (class131 var5 = (class131) this.field10490.method4159(0); var5 != null; var5 = (class131) this.field10490.method4151(7)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1963 || arg1[var8].field9476 == var5.field1963) {
                        field10493[var8] = true;
                        var5.method1002((byte) -121);
                        var5.field1966 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1968 == 0) {
                    var5.method909(-124);
                    this.field10496--;
                } else {
                    var5.field1966 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field10496 != 32; var6++) {
            if (!field10493[var6]) {
                class131 var7 = new class131(arg0, arg1[var6], this, this.field10489);
                this.field10490.method4152(var7, 0);
                this.field10496++;
                field10493[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lha;J[Lgi;[Luga;Z)V", line = 220)
    public final void method4183(class58 arg0, long arg1, class675[] arg2, class206[] arg3, boolean arg4) {
        if (!this.field10494) {
            this.method4182(arg0, arg2, arg4);
            this.method4184(arg3, arg4);
            this.field10489 = arg1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([Luga;Z)V", line = 231)
    private final void method4184(class206[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field10486[var3] = false;
        }
        label76: for (class436 var4 = (class436) this.field10495.method1522(true); var4 != null; var4 = (class436) this.field10495.method1527((byte) 127)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field6102 || arg0[var7].field2953 == var4.field6102) {
                        field10486[var7] = true;
                        var4.method2632(123);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3617(1);
                this.field10498--;
                if (var4.method1551((byte) 114)) {
                    var4.method1553(-122);
                    class25.field322--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field10498 != 8; var5++) {
            if (!field10486[var5]) {
                class436 var6 = null;
                if (arg0[var5].method1435((byte) 25).field7049 == 1 && class25.field322 < 32) {
                    var6 = new class436(arg0[var5], this);
                    class107.field1768.method417((long) arg0[var5].field2951, var6, 2);
                    class25.field322++;
                }
                if (var6 == null) {
                    var6 = new class436(arg0[var5], this);
                }
                this.field10495.method1526(var6, -52);
                this.field10498++;
                field10486[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "()Loo;", line = 320)
    public final class624 method4185() {
        return this.field10497;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "()V", line = 323)
    public static void method4186() {
        field10493 = null;
        field10486 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class753(int arg0, boolean arg1) {
        this.method4188(arg0, arg1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Lf;", line = 335)
    public static final class753 method4187(int arg0, boolean arg1) {
        if (class248.field3474 == class172.field2498) {
            return new class753(arg0, arg1);
        } else {
            class753 var2 = class464.field6699[class248.field3474];
            class248.field3474 = class248.field3474 + 1 & class590.field8289[class508.field7250];
            var2.method4188(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IZ)V", line = 348)
    private final void method4188(int arg0, boolean arg1) {
        class460.field6633.method4152(this, 0);
        this.field10489 = arg0;
        this.field10491 = arg0;
        this.field10499 = true;
        this.field10500 = arg1;
    }
}
