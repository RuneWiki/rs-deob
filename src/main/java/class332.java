import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class332 extends class236 {

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public int field4822 = 0;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Z")
    private boolean field4821 = false;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Z")
    public boolean field4820 = false;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "Li;")
    private class30 field4817 = new class30();

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    private int field4826 = 0;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "Lum;")
    public class347 field4827 = new class347();

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    private int field4829 = 0;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "Z")
    private boolean field4833 = false;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "Lbv;")
    public class191 field4831 = new class191();

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "[Lom;")
    public class241[] field4818 = new class241[8192];

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "J")
    private long field4819;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "J")
    private long field4824;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "[Z")
    private static boolean[] field4823 = new boolean[8];

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "[Z")
    private static boolean[] field4825 = new boolean[8];

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public int field4828;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public int field4832;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public int field4834;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()V")
    public final void method2001() {
        this.field4831.field2704.method2987(119);
        for (class303 var1 = (class303) this.field4817.method242(false); var1 != null; var1 = (class303) this.field4817.method244((byte) -73)) {
            var1.method1821(this.field4824, 5202);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Leq;[Lin;Z)V")
    private final void method2002(class134 arg0, class56[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field4825[var4] = false;
        }
        label64: for (class303 var5 = (class303) this.field4817.method242(false); var5 != null; var5 = (class303) this.field4817.method244((byte) -73)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4386 || arg1[var8].field859 == var5.field4386) {
                        field4825[var8] = true;
                        var5.method1823(-16052);
                        var5.field4384 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4405 == 0) {
                    var5.method1435(true);
                    this.field4826--;
                } else {
                    var5.field4384 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field4826 != 8; var6++) {
            if (!field4825[var6]) {
                class303 var7 = new class303(arg0, arg1[var6], this, this.field4819);
                this.field4817.method250((byte) -72, var7);
                this.field4826++;
                field4825[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Leq;J[Lin;[Lgq;Z)V")
    public final void method2003(class134 arg0, long arg1, class56[] arg2, class339[] arg3, boolean arg4) {
        if (!this.field4820) {
            this.method2002(arg0, arg2, arg4);
            this.method2012(arg3, arg4);
            this.field4819 = arg1;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()V")
    public final void method2004() {
        this.field4833 = true;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "()Lbv;")
    public final class191 method2005() {
        return this.field4831;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(J)V")
    public final void method2006(long arg0) {
        this.field4819 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "()V")
    public final void method2007() {
        this.field4821 = true;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "()V")
    public static void method2008() {
        field4825 = null;
        field4823 = null;
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "()V")
    public final void method2009() {
        this.field4820 = true;
        for (class430 var1 = (class430) this.field4827.method2096(-21400); var1 != null; var1 = (class430) this.field4827.method2084((byte) 19)) {
            if (var1.field6314.field3060 == 1) {
                var1.method589((byte) 51);
            }
        }
        this.field4818 = new class241[8192];
        this.field4822 = 0;
        this.field4817 = new class30();
        this.field4826 = 0;
        this.field4827 = new class347();
        this.field4829 = 0;
        this.method1435(true);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
    public final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4830 = arg0;
        this.field4834 = arg1;
        this.field4835 = arg2;
        this.field4828 = arg3;
        this.field4832 = arg4;
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "()V")
    private final void method2011() {
        this.field4821 = false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([Lgq;Z)V")
    private final void method2012(class339[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4823[var3] = false;
        }
        label73: for (class430 var4 = (class430) this.field4827.method2096(-21400); var4 != null; var4 = (class430) this.field4827.method2084((byte) 19)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field6322 || arg0[var7].field4931 == var4.field6322) {
                        field4823[var7] = true;
                        var4.method2557(2);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method536(false);
                this.field4829--;
                if (var4.method587(false)) {
                    var4.method589((byte) 51);
                    class38.field591--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field4829 != 8; var5++) {
            if (!field4823[var5]) {
                class430 var6 = null;
                if (arg0[var5].method2056(true).field3060 == 1 && class38.field591 < 32) {
                    var6 = new class430(arg0[var5], this);
                    class400.field5886.method2307((byte) -39, (long) arg0[var5].field4932, var6);
                    class38.field591++;
                }
                if (var6 == null) {
                    var6 = new class430(arg0[var5], this);
                }
                this.field4827.method2086((byte) -123, var6);
                this.field4829++;
                field4823[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Leq;J)Z")
    public final boolean method2013(class134 arg0, long arg1) {
        if (this.field4824 == this.field4819) {
            this.method2011();
        } else {
            this.method2007();
        }
        if (arg1 - this.field4819 > 750L) {
            this.method2009();
            return false;
        }
        int var4 = (int) (arg1 - this.field4824);
        if (this.field4833) {
            for (class303 var5 = (class303) this.field4817.method242(false); var5 != null; var5 = (class303) this.field4817.method244((byte) -73)) {
                for (int var6 = 0; var6 < var5.field4391.field6072; var6++) {
                    var5.method1825(arg0, 47, !this.field4821, 1, arg1);
                }
            }
            this.field4833 = false;
        }
        for (class303 var7 = (class303) this.field4817.method242(false); var7 != null; var7 = (class303) this.field4817.method244((byte) -73)) {
            var7.method1825(arg0, -103, !this.field4821, var4, arg1);
        }
        this.field4824 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
    public class332(int arg0) {
        class156.field1989.method250((byte) -72, this);
        this.field4819 = arg0;
        this.field4824 = arg0;
        this.field4833 = true;
    }
}
