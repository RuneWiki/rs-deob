import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class279 extends class275 {

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public int field4093 = 0;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
    private boolean field4098 = false;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Z")
    public boolean field4091 = false;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "Lep;")
    private class146 field4097 = new class146();

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    private int field4099 = 0;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Lmi;")
    public class408 field4100 = new class408();

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "Z")
    private boolean field4103 = false;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    private int field4105 = 0;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "Llc;")
    public class125 field4104 = new class125();

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "[Lsh;")
    public class341[] field4094 = new class341[8192];

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
    private long field4096;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "J")
    private long field4090;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "[Z")
    private static boolean[] field4092 = new boolean[8];

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "[Z")
    private static boolean[] field4095 = new boolean[8];

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lnr;[Ldn;Z)V", line = 5)
    private final void method1781(class437 arg0, class322[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field4095[var4] = false;
        }
        label64: for (class148 var5 = (class148) this.field4097.method976((byte) 42); var5 != null; var5 = (class148) this.field4097.method979(84)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field1952 || arg1[var8].field4599 == var5.field1952) {
                        field4095[var8] = true;
                        var5.method982(-24415);
                        var5.field1946 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field1941 == 0) {
                    var5.method1754((byte) 71);
                    this.field4099--;
                } else {
                    var5.field1946 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field4099 != 8; var6++) {
            if (!field4095[var6]) {
                class148 var7 = new class148(arg0, arg1[var6], this, this.field4096);
                this.field4097.method974(var7, (byte) -128);
                this.field4099++;
                field4095[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()V", line = 77)
    private final void method1782() {
        this.field4098 = false;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "()Llc;", line = 80)
    public final class125 method1783() {
        return this.field4104;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "()V", line = 83)
    public static void method1784() {
        field4095 = null;
        field4092 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(J)V", line = 88)
    public final void method1785(long arg0) {
        this.field4096 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([Lla;Z)V", line = 94)
    private final void method1786(class145[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4092[var3] = false;
        }
        label73: for (class416 var4 = (class416) this.field4100.method2649(0); var4 != null; var4 = (class416) this.field4100.method2656(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field6196 || arg0[var7].field1907 == var4.field6196) {
                        field4092[var7] = true;
                        var4.method2686(0);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2574((byte) 118);
                this.field4105--;
                if (var4.method1438(-29860)) {
                    var4.method1439(-29183);
                    class416.field6206--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field4105 != 8; var5++) {
            if (!field4092[var5]) {
                class416 var6 = null;
                if (class446.method2805(arg0[var5].field1905, (byte) -121).field928 == 1 && class416.field6206 < 32) {
                    var6 = new class416(arg0[var5], this);
                    class146.field1921.method1991(true, (long) arg0[var5].field1905, var6);
                    class416.field6206++;
                }
                if (var6 == null) {
                    var6 = new class416(arg0[var5], this);
                }
                this.field4100.method2660((byte) -123, var6);
                this.field4105++;
                field4092[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "()V", line = 179)
    public final void method1787() {
        this.field4091 = true;
        for (class416 var1 = (class416) this.field4100.method2649(0); var1 != null; var1 = (class416) this.field4100.method2656(0)) {
            if (var1.field6203.field928 == 1) {
                var1.method1439(-29183);
            }
        }
        this.field4094 = new class341[8192];
        this.field4093 = 0;
        this.field4097 = new class146();
        this.field4099 = 0;
        this.field4100 = new class408();
        this.field4105 = 0;
        this.method1754((byte) 71);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lnr;J)Z", line = 206)
    public final boolean method1788(class437 arg0, long arg1) {
        if (this.field4096 == this.field4090) {
            this.method1782();
        } else {
            this.method1789();
        }
        if (arg1 - this.field4096 > 750L) {
            this.method1787();
            return false;
        }
        int var4 = (int) (arg1 - this.field4090);
        if (this.field4103) {
            for (class148 var5 = (class148) this.field4097.method976((byte) 42); var5 != null; var5 = (class148) this.field4097.method979(25)) {
                for (int var6 = 0; var6 < var5.field1932.field2603; var6++) {
                    var5.method983(arg0, 1, !this.field4098, arg1, 65535);
                }
            }
            this.field4103 = false;
        }
        for (class148 var7 = (class148) this.field4097.method976((byte) 42); var7 != null; var7 = (class148) this.field4097.method979(37)) {
            var7.method983(arg0, var4, !this.field4098, arg1, 65535);
        }
        this.field4090 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V", line = 332)
    public class279(int arg0) {
        class175.field2291.method974(this, (byte) -126);
        this.field4096 = (long) arg0;
        this.field4090 = (long) arg0;
        this.field4103 = true;
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "()V", line = 261)
    public final void method1789() {
        this.field4098 = true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lnr;J[Ldn;[Lla;Z)V", line = 264)
    public final void method1790(class437 arg0, long arg1, class322[] arg2, class145[] arg3, boolean arg4) {
        if (!this.field4091) {
            this.method1781(arg0, arg2, arg4);
            this.method1786(arg3, arg4);
            this.field4096 = arg1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "()V", line = 279)
    public final void method1791() {
        this.field4103 = true;
    }

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "()V", line = 282)
    public final void method1792() {
        this.field4104.field1666.method2263(false);
        for (class148 var1 = (class148) this.field4097.method976((byte) 42); var1 != null; var1 = (class148) this.field4097.method979(28)) {
            var1.method981(this.field4090, 721491592);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V", line = 294)
    public final void method1793(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4101 = arg0;
        this.field4106 = arg1;
        this.field4107 = arg3;
        this.field4102 = arg4;
    }
}
