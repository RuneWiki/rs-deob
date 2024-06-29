import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class585 extends class476 {

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public int field8330 = 0;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "Z")
    private boolean field8334 = false;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
    public boolean field8333 = false;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Led;")
    private class115 field8329 = new class115();

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    private int field8337 = 0;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "Lfea;")
    public class47 field8336 = new class47();

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Z")
    private boolean field8341 = false;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    private int field8343 = 0;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "Lsh;")
    public class616 field8345 = new class616();

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "[Lfo;")
    public class22[] field8335 = new class22[8192];

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "[Z")
    private static boolean[] field8327 = new boolean[8];

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "[Z")
    private static boolean[] field8332 = new boolean[8];

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public int field8338;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public int field8339;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public int field8340;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public int field8342;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public int field8344;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "J")
    private long field8328;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
    private long field8331;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([Ltf;Z)V", line = 5)
    private final void method3343(class643[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field8332[var3] = false;
        }
        label73: for (class208 var4 = (class208) this.field8336.method427(true); var4 != null; var4 = (class208) this.field8336.method420(false)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2940 || arg0[var7].field9350 == var4.field2940) {
                        field8332[var7] = true;
                        var4.method1335((byte) 55);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method911(-52);
                this.field8343--;
                if (var4.method2617((byte) -95)) {
                    var4.method2619(true);
                    class583.field8315--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field8343 != 8; var5++) {
            if (!field8332[var5]) {
                class208 var6 = null;
                if (arg0[var5].method3704(false).field3664 == 1 && class583.field8315 < 32) {
                    var6 = new class208(arg0[var5], this);
                    class210.field2968.method2465((long) arg0[var5].field9348, var6, 69);
                    class583.field8315++;
                }
                if (var6 == null) {
                    var6 = new class208(arg0[var5], this);
                }
                this.field8336.method414(var6, (byte) 108);
                this.field8343++;
                field8332[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()V", line = 92)
    public final void method3344() {
        this.field8333 = true;
        for (class208 var1 = (class208) this.field8336.method427(true); var1 != null; var1 = (class208) this.field8336.method420(false)) {
            if (var1.field2939.field3664 == 1) {
                var1.method2619(true);
            }
        }
        for (int var2 = 0; var2 < this.field8335.length; var2++) {
            if (this.field8335[var2] != null) {
                this.field8335[var2].method234();
                this.field8335[var2] = null;
            }
        }
        this.field8330 = 0;
        this.field8329 = new class115();
        this.field8337 = 0;
        this.field8336 = new class47();
        this.field8343 = 0;
        this.method2753(0);
        class72.field1359[class47.field653] = this;
        class47.field653 = class47.field653 + 1 & class531.field7380[class507.field7055];
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqa;J[Lon;[Ltf;Z)V", line = 128)
    public final void method3345(class167 arg0, long arg1, class595[] arg2, class643[] arg3, boolean arg4) {
        if (!this.field8333) {
            this.method3356(arg0, arg2, arg4);
            this.method3343(arg3, arg4);
            this.field8328 = arg1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V", line = 137)
    public final void method3346(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8344 = arg0;
        this.field8338 = arg1;
        this.field8339 = arg2;
        this.field8340 = arg3;
        this.field8342 = arg4;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "()V", line = 145)
    public final void method3347() {
        this.field8334 = true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqa;)V", line = 148)
    public final void method3348(class167 arg0) {
        this.field8345.field8719.method2803(27385);
        for (class65 var2 = (class65) this.field8329.method944(107); var2 != null; var2 = (class65) this.field8329.method947((byte) 120)) {
            var2.method511(this.field8331, arg0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(J)V", line = 160)
    public final void method3349(long arg0) {
        this.field8328 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "()Lsh;", line = 168)
    public final class616 method3350() {
        return this.field8345;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "()V", line = 171)
    public static void method3351() {
        field8327 = null;
        field8332 = null;
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "()V", line = 175)
    private final void method3352() {
        this.field8334 = false;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)Lqp;", line = 178)
    public static final class585 method3353(int arg0) {
        if (class47.field653 == class33.field448) {
            return new class585(arg0);
        } else {
            class585 var1 = class72.field1359[class33.field448];
            class33.field448 = class33.field448 + 1 & class531.field7380[class507.field7055];
            var1.method3357(arg0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V", line = 365)
    private class585(int arg0) {
        this.method3357(arg0);
    }

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "()V", line = 197)
    public final void method3354() {
        this.field8341 = true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqa;J)Z", line = 200)
    public final boolean method3355(class167 arg0, long arg1) {
        if (this.field8331 == this.field8328) {
            this.method3352();
        } else {
            this.method3347();
        }
        if (arg1 - this.field8328 > 750L) {
            this.method3344();
            return false;
        }
        int var4 = (int) (arg1 - this.field8331);
        if (this.field8341) {
            for (class65 var5 = (class65) this.field8329.method944(115); var5 != null; var5 = (class65) this.field8329.method947((byte) -43)) {
                for (int var6 = 0; var6 < var5.field920.field721; var6++) {
                    var5.method510((byte) -28, arg0, arg1, !this.field8334, 1);
                }
            }
            this.field8341 = false;
        }
        for (class65 var7 = (class65) this.field8329.method944(69); var7 != null; var7 = (class65) this.field8329.method947((byte) -53)) {
            var7.method510((byte) -28, arg0, arg1, !this.field8334, var4);
        }
        this.field8331 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqa;[Lon;Z)V", line = 250)
    private final void method3356(class167 arg0, class595[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field8327[var4] = false;
        }
        label64: for (class65 var5 = (class65) this.field8329.method944(-128); var5 != null; var5 = (class65) this.field8329.method947((byte) 122)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field925 || arg1[var8].field8473 == var5.field925) {
                        field8327[var8] = true;
                        var5.method508((byte) 99);
                        var5.field926 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field915 == 0) {
                    var5.method2753(0);
                    this.field8337--;
                } else {
                    var5.field926 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field8337 != 8; var6++) {
            if (!field8327[var6]) {
                class65 var7 = new class65(arg0, arg1[var6], this, this.field8328);
                this.field8329.method952((byte) 59, var7);
                this.field8337++;
                field8327[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V", line = 332)
    private final void method3357(int arg0) {
        class501.field7030.method952((byte) 92, this);
        this.field8328 = arg0;
        this.field8331 = arg0;
        this.field8341 = true;
    }
}
