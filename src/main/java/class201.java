import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class201 extends class371 {

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field2900 = 0;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Z")
    public boolean field2903 = false;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Z")
    private boolean field2906 = false;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lst;")
    private class296 field2901 = new class296();

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    private int field2910 = 0;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lvp;")
    public class123 field2909 = new class123();

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Z")
    private boolean field2915 = false;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Lpo;")
    public class389 field2913 = new class389();

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[Ljv;")
    public class55[] field2907 = new class55[8192];

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "J")
    private long field2904;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "J")
    private long field2905;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[Z")
    private static boolean[] field2902 = new boolean[8];

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[Z")
    private static boolean[] field2908 = new boolean[8];

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 3)
    public static void method1361() {
        field2902 = null;
        field2908 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(J)V", line = 7)
    public final void method1362(long arg0) {
        this.field2904 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V", line = 10)
    private final void method1363() {
        this.field2906 = false;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V", line = 331)
    public class201(int arg0) {
        class190.field2802.method1878(2, this);
        this.field2904 = arg0;
        this.field2905 = arg0;
        this.field2915 = true;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V", line = 19)
    public final void method1364() {
        this.field2915 = true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lqa;[Lu;Z)V", line = 28)
    private final void method1365(class162 arg0, class52[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2902[var4] = false;
        }
        label64: for (class392 var5 = (class392) this.field2901.method1873((byte) -124); var5 != null; var5 = (class392) this.field2901.method1880(-61)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5929 || arg1[var8].field831 == var5.field5929) {
                        field2902[var8] = true;
                        var5.method2386(true);
                        var5.field5924 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5914 == 0) {
                    var5.method2289((byte) -55);
                    this.field2910--;
                } else {
                    var5.field5924 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2910 != 8; var6++) {
            if (!field2902[var6]) {
                class392 var7 = new class392(arg0, arg1[var6], this, this.field2904);
                this.field2901.method1878(2, var7);
                this.field2910++;
                field2902[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "()V", line = 101)
    public final void method1366() {
        this.field2906 = true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lqa;J[Lu;[Lat;Z)V", line = 104)
    public final void method1367(class162 arg0, long arg1, class52[] arg2, class255[] arg3, boolean arg4) {
        if (!this.field2903) {
            this.method1365(arg0, arg2, arg4);
            this.method1373(arg3, arg4);
            this.field2904 = arg1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lqa;J)Z", line = 113)
    public final boolean method1368(class162 arg0, long arg1) {
        if (this.field2905 == this.field2904) {
            this.method1363();
        } else {
            this.method1366();
        }
        if (arg1 - this.field2904 > 750L) {
            this.method1372();
            return false;
        }
        int var4 = (int) (arg1 - this.field2905);
        if (this.field2915) {
            for (class392 var5 = (class392) this.field2901.method1873((byte) 85); var5 != null; var5 = (class392) this.field2901.method1880(-61)) {
                for (int var6 = 0; var6 < var5.field5933.field7173; var6++) {
                    var5.method2385(1, arg1, !this.field2906, arg0, (byte) 88);
                }
            }
            this.field2915 = false;
        }
        for (class392 var7 = (class392) this.field2901.method1873((byte) 43); var7 != null; var7 = (class392) this.field2901.method1880(-61)) {
            var7.method2385(var4, arg1, !this.field2906, arg0, (byte) 57);
        }
        this.field2905 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "()Lpo;", line = 162)
    public final class389 method1369() {
        return this.field2913;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "()V", line = 168)
    public final void method1370() {
        this.field2913.field5869.method1474(26159);
        for (class392 var1 = (class392) this.field2901.method1873((byte) -127); var1 != null; var1 = (class392) this.field2901.method1880(-61)) {
            var1.method2382(this.field2905, 32767);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V", line = 189)
    public final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2916 = arg0;
        this.field2914 = arg1;
        this.field2917 = arg2;
        this.field2912 = arg3;
        this.field2918 = arg4;
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "()V", line = 199)
    public final void method1372() {
        this.field2903 = true;
        for (class476 var1 = (class476) this.field2909.method816(124); var1 != null; var1 = (class476) this.field2909.method812(119)) {
            if (var1.field7000.field4239 == 1) {
                var1.method1783((byte) -72);
            }
        }
        this.field2907 = new class55[8192];
        this.field2900 = 0;
        this.field2901 = new class296();
        this.field2910 = 0;
        this.field2909 = new class123();
        this.field2911 = 0;
        this.method2289((byte) -55);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([Lat;Z)V", line = 240)
    private final void method1373(class255[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2908[var3] = false;
        }
        label73: for (class476 var4 = (class476) this.field2909.method816(117); var4 != null; var4 = (class476) this.field2909.method812(111)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field7007 || arg0[var7].field3779 == var4.field7007) {
                        field2908[var7] = true;
                        var4.method2840(-25438);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2049(-102);
                this.field2911--;
                if (var4.method1784((byte) -77)) {
                    var4.method1783((byte) -68);
                    class169.field2509--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2911 != 8; var5++) {
            if (!field2908[var5]) {
                class476 var6 = null;
                if (arg0[var5].method1705((byte) 124).field4239 == 1 && class169.field2509 < 32) {
                    var6 = new class476(arg0[var5], this);
                    class320.field4578.method81(var6, (long) arg0[var5].field3780, true);
                    class169.field2509++;
                }
                if (var6 == null) {
                    var6 = new class476(arg0[var5], this);
                }
                this.field2909.method809(var6, false);
                this.field2911++;
                field2908[var5] = true;
            }
        }
    }
}
