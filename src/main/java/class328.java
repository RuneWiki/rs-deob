import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class328 extends class111 {

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Z")
    private boolean field4754 = false;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Z")
    public boolean field4755 = false;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public int field4757 = 0;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lcl;")
    private class145 field4756 = new class145();

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    private int field4760 = 0;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Lkn;")
    public class442 field4759 = new class442();

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "Z")
    private boolean field4762 = false;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    private int field4767 = 0;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Lrm;")
    public class235 field4763 = new class235();

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "[Lqk;")
    public class12[] field4758 = new class12[8192];

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "J")
    private long field4752;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "J")
    private long field4753;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "[Z")
    private static boolean[] field4750 = new boolean[8];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "[Z")
    private static boolean[] field4751 = new boolean[8];

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public int field4765;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIIII)V")
    public final void method2150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4765 = arg0;
        this.field4764 = arg1;
        this.field4761 = arg3;
        this.field4766 = arg4;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lvq;[Lhq;Z)V")
    private final void method2151(class269 arg0, class88[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field4751[var4] = false;
        }
        label64: for (class238 var5 = (class238) this.field4756.method1082(119); var5 != null; var5 = (class238) this.field4756.method1078(false)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3494 || arg1[var8].field1156 == var5.field3494) {
                        field4751[var8] = true;
                        var5.method1624(34);
                        var5.field3510 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3504 == 0) {
                    var5.method674(-1);
                    this.field4760--;
                } else {
                    var5.field3510 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field4760 != 8; var6++) {
            if (!field4751[var6]) {
                class238 var7 = new class238(arg0, arg1[var6], this, this.field4752);
                this.field4756.method1076(115, var7);
                this.field4760++;
                field4751[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()Lrm;")
    public final class235 method2152() {
        return this.field4763;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V")
    public final void method2153() {
        this.field4762 = true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lvq;J[Lhq;[Lrl;Z)V")
    public final void method2154(class269 arg0, long arg1, class88[] arg2, class430[] arg3, boolean arg4) {
        if (!this.field4755) {
            this.method2151(arg0, arg2, arg4);
            this.method2162(arg3, arg4);
            this.field4752 = arg1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V")
    public final void method2155() {
        this.field4754 = true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(J)V")
    public final void method2156(long arg0) {
        this.field4752 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()V")
    public final void method2157() {
        this.field4755 = true;
        for (class241 var1 = (class241) this.field4759.method2752(-128); var1 != null; var1 = (class241) this.field4759.method2754(-1)) {
            if (var1.field3557.field340 == 1) {
                var1.method2365(true);
            }
        }
        this.field4758 = new class12[8192];
        this.field4757 = 0;
        this.field4756 = new class145();
        this.field4760 = 0;
        this.field4759 = new class442();
        this.field4767 = 0;
        this.method674(-1);
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "()V")
    public static void method2158() {
        field4751 = null;
        field4750 = null;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "()V")
    private final void method2159() {
        this.field4754 = false;
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "()V")
    public final void method2160() {
        this.field4763.field3458.method23((byte) -45);
        for (class238 var1 = (class238) this.field4756.method1082(114); var1 != null; var1 = (class238) this.field4756.method1078(false)) {
            var1.method1622(-1, this.field4753);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lvq;J)Z")
    public final boolean method2161(class269 arg0, long arg1) {
        if (this.field4753 == this.field4752) {
            this.method2159();
        } else {
            this.method2155();
        }
        if (arg1 - this.field4752 > 750L) {
            this.method2157();
            return false;
        }
        int var4 = (int) (arg1 - this.field4753);
        if (this.field4762) {
            for (class238 var5 = (class238) this.field4756.method1082(123); var5 != null; var5 = (class238) this.field4756.method1078(false)) {
                for (int var6 = 0; var6 < var5.field3515.field1746; var6++) {
                    var5.method1623(1, !this.field4754, arg0, true, arg1);
                }
            }
            this.field4762 = false;
        }
        for (class238 var7 = (class238) this.field4756.method1082(122); var7 != null; var7 = (class238) this.field4756.method1078(false)) {
            var7.method1623(var4, !this.field4754, arg0, true, arg1);
        }
        this.field4753 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([Lrl;Z)V")
    private final void method2162(class430[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field4750[var3] = false;
        }
        label73: for (class241 var4 = (class241) this.field4759.method2752(-127); var4 != null; var4 = (class241) this.field4759.method2754(-1)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field3550 || arg0[var7].field6109 == var4.field3550) {
                        field4750[var7] = true;
                        var4.method1644(7177);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2660((byte) 117);
                this.field4767--;
                if (var4.method2361(false)) {
                    var4.method2365(true);
                    class450.field6434--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field4767 != 8; var5++) {
            if (!field4750[var5]) {
                class241 var6 = null;
                if (class394.method2484(arg0[var5].field6121, 24111).field340 == 1 && class450.field6434 < 32) {
                    var6 = new class241(arg0[var5], this);
                    class44.field600.method1965(25199, (long) arg0[var5].field6121, var6);
                    class450.field6434++;
                }
                if (var6 == null) {
                    var6 = new class241(arg0[var5], this);
                }
                this.field4759.method2756(-116, var6);
                this.field4767++;
                field4750[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I)V")
    public class328(int arg0) {
        class130.field1904.method1076(118, this);
        this.field4752 = (long) arg0;
        this.field4753 = (long) arg0;
        this.field4762 = true;
    }
}
