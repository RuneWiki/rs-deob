import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class475 extends class142 {

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "Z")
    public boolean field6686 = false;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
    public int field6685 = 0;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "Z")
    private boolean field6682 = false;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "Lit;")
    private class555 field6683 = new class555();

    @OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
    private int field6688 = 0;

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "Ldm;")
    public class46 field6687 = new class46();

    @OriginalMember(owner = "client!jw", name = "A", descriptor = "I")
    private int field6695 = 0;

    @OriginalMember(owner = "client!jw", name = "B", descriptor = "Z")
    private boolean field6696 = false;

    @OriginalMember(owner = "client!jw", name = "y", descriptor = "Lhp;")
    public class274 field6693 = new class274();

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "[Lg;")
    public class135[] field6679 = new class135[8192];

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "[Z")
    private static boolean[] field6681 = new boolean[8];

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "[Z")
    private static boolean[] field6684 = new boolean[8];

    @OriginalMember(owner = "client!jw", name = "u", descriptor = "I")
    public int field6689;

    @OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!jw", name = "w", descriptor = "I")
    public int field6691;

    @OriginalMember(owner = "client!jw", name = "x", descriptor = "I")
    public int field6692;

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "I")
    public int field6694;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "J")
    private long field6678;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "J")
    private long field6680;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "()V")
    public final void method2756() {
        this.field6696 = true;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)Ljw;")
    public static final class475 method2757(int arg0) {
        if (class80.field1309 == class397.field5666) {
            return new class475(arg0);
        } else {
            class475 var1 = class272.field3788[class80.field1309];
            class80.field1309 = class80.field1309 + 1 & class470.field6615[class265.field3701];
            var1.method2763(arg0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lqa;J)Z")
    public final boolean method2758(class207 arg0, long arg1) {
        if (this.field6680 == this.field6678) {
            this.method2760();
        } else {
            this.method2762();
        }
        if (arg1 - this.field6680 > 750L) {
            this.method2765();
            return false;
        }
        int var4 = (int) (arg1 - this.field6678);
        if (this.field6696) {
            for (class504 var5 = (class504) this.field6683.method3150(16); var5 != null; var5 = (class504) this.field6683.method3147(16)) {
                for (int var6 = 0; var6 < var5.field7039.field4497; var6++) {
                    var5.method2919(1, arg1, arg0, 0, !this.field6682);
                }
            }
            this.field6696 = false;
        }
        for (class504 var7 = (class504) this.field6683.method3150(16); var7 != null; var7 = (class504) this.field6683.method3147(16)) {
            var7.method2919(var4, arg1, arg0, 0, !this.field6682);
        }
        this.field6678 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIII)V")
    public final void method2759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6694 = arg0;
        this.field6692 = arg1;
        this.field6691 = arg2;
        this.field6690 = arg3;
        this.field6689 = arg4;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "()V")
    private final void method2760() {
        this.field6682 = false;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(J)V")
    public final void method2761(long arg0) {
        this.field6680 = arg0;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "()V")
    public final void method2762() {
        this.field6682 = true;
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)V")
    private final void method2763(int arg0) {
        class150.field2281.method3145(this, Integer.MAX_VALUE);
        this.field6680 = arg0;
        this.field6678 = arg0;
        this.field6696 = true;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lqa;[Lig;Z)V")
    private final void method2764(class207 arg0, class203[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field6681[var4] = false;
        }
        label64: for (class504 var5 = (class504) this.field6683.method3150(16); var5 != null; var5 = (class504) this.field6683.method3147(16)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field7031 || arg1[var8].field2841 == var5.field7031) {
                        field6681[var8] = true;
                        var5.method2918(-120);
                        var5.field7034 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field7029 == 0) {
                    var5.method939(79);
                    this.field6688--;
                } else {
                    var5.field7034 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field6688 != 8; var6++) {
            if (!field6681[var6]) {
                class504 var7 = new class504(arg0, arg1[var6], this, this.field6680);
                this.field6683.method3145(var7, Integer.MAX_VALUE);
                this.field6688++;
                field6681[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "()V")
    public final void method2765() {
        this.field6686 = true;
        for (class192 var1 = (class192) this.field6687.method456((byte) -88); var1 != null; var1 = (class192) this.field6687.method460((byte) 125)) {
            if (var1.field2717.field9219 == 1) {
                var1.method896(0);
            }
        }
        for (int var2 = 0; var2 < this.field6679.length; var2++) {
            if (this.field6679[var2] != null) {
                this.field6679[var2].method910();
                this.field6679[var2] = null;
            }
        }
        this.field6685 = 0;
        this.field6683 = new class555();
        this.field6688 = 0;
        this.field6687 = new class46();
        this.field6695 = 0;
        this.method939(68);
        class272.field3788[class397.field5666] = this;
        class397.field5666 = class397.field5666 + 1 & class470.field6615[class265.field3701];
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lqa;)V")
    public final void method2766(class207 arg0) {
        this.field6693.field3798.method1460((byte) -116);
        for (class504 var2 = (class504) this.field6683.method3150(16); var2 != null; var2 = (class504) this.field6683.method3147(16)) {
            var2.method2916(arg0, this.field6678, 124);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lqa;J[Lig;[Lrn;Z)V")
    public final void method2767(class207 arg0, long arg1, class203[] arg2, class225[] arg3, boolean arg4) {
        if (!this.field6686) {
            this.method2764(arg0, arg2, arg4);
            this.method2769(arg3, arg4);
            this.field6680 = arg1;
        }
    }

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "()Lhp;")
    public final class274 method2768() {
        return this.field6693;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "([Lrn;Z)V")
    private final void method2769(class225[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field6684[var3] = false;
        }
        label73: for (class192 var4 = (class192) this.field6687.method456((byte) -58); var4 != null; var4 = (class192) this.field6687.method460((byte) -110)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2715 || arg0[var7].field3224 == var4.field2715) {
                        field6684[var7] = true;
                        var4.method1193((byte) -81);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1117(0);
                this.field6695--;
                if (var4.method895(false)) {
                    var4.method896(0);
                    class496.field6937--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field6695 != 8; var5++) {
            if (!field6684[var5]) {
                class192 var6 = null;
                if (arg0[var5].method1441((byte) 32).field9219 == 1 && class496.field6937 < 32) {
                    var6 = new class192(arg0[var5], this);
                    class556.field7671.method2912(-106, var6, (long) arg0[var5].field3230);
                    class496.field6937++;
                }
                if (var6 == null) {
                    var6 = new class192(arg0[var5], this);
                }
                this.field6687.method463(var6, -113);
                this.field6695++;
                field6684[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "()V")
    public static void method2770() {
        field6681 = null;
        field6684 = null;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(I)V")
    private class475(int arg0) {
        this.method2763(arg0);
    }
}
