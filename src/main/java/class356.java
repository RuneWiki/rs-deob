import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class356 extends class221 {

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Z")
    private boolean field5517 = false;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public int field5519 = 0;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Z")
    public boolean field5518 = false;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "Lgn;")
    private class410 field5522 = new class410();

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    private int field5526 = 0;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "Lnj;")
    public class317 field5525 = new class317();

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    private int field5527 = 0;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
    private boolean field5534 = false;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "Ldm;")
    public class519 field5528 = new class519();

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "[Lmk;")
    public class251[] field5524 = new class251[8192];

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "J")
    private long field5520;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "J")
    private long field5521;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[Z")
    private static boolean[] field5516 = new boolean[8];

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "[Z")
    private static boolean[] field5523 = new boolean[8];

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public int field5529;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public int field5530;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public int field5531;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public int field5532;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public int field5533;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
    public final void method2346() {
        this.field5534 = true;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([Lvc;Z)V")
    private final void method2347(class100[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5516[var3] = false;
        }
        label73: for (class220 var4 = (class220) this.field5525.method2123(71); var4 != null; var4 = (class220) this.field5525.method2126((byte) 61)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3730 || arg0[var7].field1438 == var4.field3730) {
                        field5516[var7] = true;
                        var4.method1609(42);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method3149(70);
                this.field5527--;
                if (var4.method2221(true)) {
                    var4.method2219(0);
                    class61.field953--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5527 != 8; var5++) {
            if (!field5516[var5]) {
                class220 var6 = null;
                if (arg0[var5].method678((byte) 98).field6888 == 1 && class61.field953 < 32) {
                    var6 = new class220(arg0[var5], this);
                    class116.field1616.method1407((long) arg0[var5].field1437, var6, true);
                    class61.field953++;
                }
                if (var6 == null) {
                    var6 = new class220(arg0[var5], this);
                }
                this.field5525.method2124(var6, (byte) 101);
                this.field5527++;
                field5516[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lza;J)Z")
    public final boolean method2348(class497 arg0, long arg1) {
        if (this.field5521 == this.field5520) {
            this.method2353();
        } else {
            this.method2356();
        }
        if (arg1 - this.field5520 > 750L) {
            this.method2358();
            return false;
        }
        int var4 = (int) (arg1 - this.field5521);
        if (this.field5534) {
            for (class165 var5 = (class165) this.field5522.method2616(255); var5 != null; var5 = (class165) this.field5522.method2619(255)) {
                for (int var6 = 0; var6 < var5.field2411.field5056; var6++) {
                    var5.method1042(arg1, arg0, 1, (byte) 73, !this.field5517);
                }
            }
            this.field5534 = false;
        }
        for (class165 var7 = (class165) this.field5522.method2616(255); var7 != null; var7 = (class165) this.field5522.method2619(255)) {
            var7.method1042(arg1, arg0, var4, (byte) 115, !this.field5517);
        }
        this.field5521 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
    public final void method2349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5533 = arg0;
        this.field5532 = arg1;
        this.field5531 = arg2;
        this.field5530 = arg3;
        this.field5529 = arg4;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lza;[Lol;Z)V")
    private final void method2350(class497 arg0, class293[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5523[var4] = false;
        }
        label64: for (class165 var5 = (class165) this.field5522.method2616(255); var5 != null; var5 = (class165) this.field5522.method2619(255)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2401 || arg1[var8].field4608 == var5.field2401) {
                        field5523[var8] = true;
                        var5.method1038((byte) -65);
                        var5.field2391 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2409 == 0) {
                    var5.method1613(1049391719);
                    this.field5526--;
                } else {
                    var5.field2391 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5526 != 8; var6++) {
            if (!field5523[var6]) {
                class165 var7 = new class165(arg0, arg1[var6], this, this.field5520);
                this.field5522.method2625(var7, 0);
                this.field5526++;
                field5523[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "()V")
    public static void method2351() {
        field5523 = null;
        field5516 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lza;J[Lol;[Lvc;Z)V")
    public final void method2352(class497 arg0, long arg1, class293[] arg2, class100[] arg3, boolean arg4) {
        if (!this.field5518) {
            this.method2350(arg0, arg2, arg4);
            this.method2347(arg3, arg4);
            this.field5520 = arg1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()V")
    private final void method2353() {
        this.field5517 = false;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "()Ldm;")
    public final class519 method2354() {
        return this.field5528;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "()V")
    public final void method2355() {
        this.field5528.field7690.method2505(-1928);
        for (class165 var1 = (class165) this.field5522.method2616(255); var1 != null; var1 = (class165) this.field5522.method2619(255)) {
            var1.method1039(-82, this.field5521);
        }
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "()V")
    public final void method2356() {
        this.field5517 = true;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(J)V")
    public final void method2357(long arg0) {
        this.field5520 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "()V")
    public final void method2358() {
        this.field5518 = true;
        for (class220 var1 = (class220) this.field5525.method2123(110); var1 != null; var1 = (class220) this.field5525.method2126((byte) 61)) {
            if (var1.field3720.field6888 == 1) {
                var1.method2219(0);
            }
        }
        this.field5524 = new class251[8192];
        this.field5519 = 0;
        this.field5522 = new class410();
        this.field5526 = 0;
        this.field5525 = new class317();
        this.field5527 = 0;
        this.method1613(1049391719);
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
    public class356(int arg0) {
        class518.field7685.method2625(this, 0);
        this.field5520 = arg0;
        this.field5521 = arg0;
        this.field5534 = true;
    }
}
