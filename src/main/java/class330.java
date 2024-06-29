import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class330 extends class393 {

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
    private boolean field4233 = false;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "Z")
    public boolean field4234 = false;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public int field4237 = 0;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "Lcr;")
    private class362 field4236 = new class362();

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    private int field4239 = 0;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "Ltu;")
    public class7 field4240 = new class7();

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "Z")
    private boolean field4244 = false;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
    private int field4246 = 0;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "Liv;")
    public class287 field4247 = new class287();

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "[Lu;")
    public class341[] field4232 = new class341[8192];

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "J")
    private long field4230;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "J")
    private long field4231;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "[Z")
    private static boolean[] field4235 = new boolean[8];

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "[Z")
    private static boolean[] field4238 = new boolean[8];

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
    private final void method1963() {
        this.field4233 = false;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(J)V")
    public final void method1964(long arg0) {
        this.field4230 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "()V")
    public final void method1965() {
        this.field4234 = true;
        for (class90 var1 = (class90) this.field4240.method49(13); var1 != null; var1 = (class90) this.field4240.method46((byte) 53)) {
            if (var1.field1256.field5090 == 1) {
                var1.method540((byte) -74);
            }
        }
        this.field4232 = new class341[8192];
        this.field4237 = 0;
        this.field4236 = new class362();
        this.field4239 = 0;
        this.field4240 = new class7();
        this.field4246 = 0;
        this.method2336((byte) 111);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lqa;J[Lsm;[Lot;Z)V")
    public final void method1966(class129 arg0, long arg1, class473[] arg2, class165[] arg3, boolean arg4) {
        if (!this.field4234) {
            this.method1971(arg0, arg2, arg4);
            this.method1970(arg3, arg4);
            this.field4230 = arg1;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method1967(class129 arg0, long arg1) {
        if (this.field4231 == this.field4230) {
            this.method1963();
        } else {
            this.method1972();
        }
        if (arg1 - this.field4230 > 750L) {
            this.method1965();
            return false;
        }
        int var4 = (int) (arg1 - this.field4231);
        if (this.field4244) {
            for (class380 var5 = (class380) this.field4236.method2122(0); var5 != null; var5 = (class380) this.field4236.method2129(-126)) {
                for (int var6 = 0; var6 < var5.field4935.field3798; var6++) {
                    var5.method2212(-31027, arg0, !this.field4233, 1, arg1);
                }
            }
            this.field4244 = false;
        }
        for (class380 var7 = (class380) this.field4236.method2122(0); var7 != null; var7 = (class380) this.field4236.method2129(-98)) {
            var7.method2212(-31027, arg0, !this.field4233, var4, arg1);
        }
        this.field4231 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "()V")
    public final void method1968() {
        this.field4244 = true;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "()Liv;")
    public final class287 method1969() {
        return this.field4247;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([Lot;Z)V")
    private final void method1970(class165[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4235[var3] = false;
        }
        label73: for (class90 var4 = (class90) this.field4240.method49(-124); var4 != null; var4 = (class90) this.field4240.method46((byte) 90)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1252 || arg0[var7].field2133 == var4.field1252) {
                        field4235[var7] = true;
                        var4.method625(-42);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method3021(34);
                this.field4246--;
                if (var4.method539(50)) {
                    var4.method540((byte) 116);
                    class78.field997--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field4246 != 8; var5++) {
            if (!field4235[var5]) {
                class90 var6 = null;
                if (arg0[var5].method1096(2).field5090 == 1 && class78.field997 < 32) {
                    var6 = new class90(arg0[var5], this);
                    class505.field7429.method746(122, (long) arg0[var5].field2132, var6);
                    class78.field997++;
                }
                if (var6 == null) {
                    var6 = new class90(arg0[var5], this);
                }
                this.field4240.method42(var6, 0);
                this.field4246++;
                field4235[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lqa;[Lsm;Z)V")
    private final void method1971(class129 arg0, class473[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field4238[var4] = false;
        }
        label64: for (class380 var5 = (class380) this.field4236.method2122(0); var5 != null; var5 = (class380) this.field4236.method2129(69)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4926 || arg1[var8].field6920 == var5.field4926) {
                        field4238[var8] = true;
                        var5.method2211(97);
                        var5.field4933 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4936 == 0) {
                    var5.method2336((byte) 104);
                    this.field4239--;
                } else {
                    var5.field4933 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field4239 != 8; var6++) {
            if (!field4238[var6]) {
                class380 var7 = new class380(arg0, arg1[var6], this, this.field4230);
                this.field4236.method2124(var7, 102);
                this.field4239++;
                field4238[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "()V")
    public final void method1972() {
        this.field4233 = true;
    }

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "()V")
    public final void method1973() {
        this.field4247.field3665.method2829(85);
        for (class380 var1 = (class380) this.field4236.method2122(0); var1 != null; var1 = (class380) this.field4236.method2129(103)) {
            var1.method2210(this.field4231, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
    public final void method1974(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4242 = arg0;
        this.field4248 = arg1;
        this.field4241 = arg2;
        this.field4245 = arg3;
        this.field4243 = arg4;
    }

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "()V")
    public static void method1975() {
        field4238 = null;
        field4235 = null;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V")
    public class330(int arg0) {
        class287.field3663.method2124(this, -122);
        this.field4230 = arg0;
        this.field4231 = arg0;
        this.field4244 = true;
    }
}
