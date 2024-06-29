import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class471 extends class481 {

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "Z")
    public boolean field6785 = false;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public int field6784 = 0;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "Z")
    private boolean field6789 = false;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Lgs;")
    private class439 field6783 = new class439();

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    private int field6791 = 0;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "Lmg;")
    public class530 field6790 = new class530();

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "Z")
    private boolean field6795 = false;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    private int field6798 = 0;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "Lvk;")
    public class334 field6792 = new class334();

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "[Lbe;")
    public class150[] field6788 = new class150[8192];

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "J")
    private long field6786;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "J")
    private long field6782;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "[Z")
    private static boolean[] field6781 = new boolean[8];

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "[Z")
    private static boolean[] field6787 = new boolean[8];

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public int field6794;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    public int field6797;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lza;J)Z")
    public final boolean method2728(class295 arg0, long arg1) {
        if (this.field6786 == this.field6782) {
            this.method2737();
        } else {
            this.method2732();
        }
        if (arg1 - this.field6786 > 750L) {
            this.method2730();
            return false;
        }
        int var4 = (int) (arg1 - this.field6782);
        if (this.field6795) {
            for (class377 var5 = (class377) this.field6783.method2600((byte) 122); var5 != null; var5 = (class377) this.field6783.method2601(111)) {
                for (int var6 = 0; var6 < var5.field5429.field7742; var6++) {
                    var5.method2252(arg0, 1, !this.field6789, arg1, -6174);
                }
            }
            this.field6795 = false;
        }
        for (class377 var7 = (class377) this.field6783.method2600((byte) 18); var7 != null; var7 = (class377) this.field6783.method2601(127)) {
            var7.method2252(arg0, var4, !this.field6789, arg1, -6174);
        }
        this.field6782 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lza;[Lmf;Z)V")
    private final void method2729(class295 arg0, class51[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field6781[var4] = false;
        }
        label64: for (class377 var5 = (class377) this.field6783.method2600((byte) -80); var5 != null; var5 = (class377) this.field6783.method2601(121)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5422 || arg1[var8].field740 == var5.field5422) {
                        field6781[var8] = true;
                        var5.method2251((byte) -92);
                        var5.field5414 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5440 == 0) {
                    var5.method2861((byte) 47);
                    this.field6791--;
                } else {
                    var5.field5414 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field6791 != 8; var6++) {
            if (!field6781[var6]) {
                class377 var7 = new class377(arg0, arg1[var6], this, this.field6786);
                this.field6783.method2599(1256, var7);
                this.field6791++;
                field6781[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
    public final void method2730() {
        this.field6785 = true;
        for (class96 var1 = (class96) this.field6790.method3137(0); var1 != null; var1 = (class96) this.field6790.method3132(0)) {
            if (var1.field1547.field5207 == 1) {
                var1.method1645(55);
            }
        }
        this.field6788 = new class150[8192];
        this.field6784 = 0;
        this.field6783 = new class439();
        this.field6791 = 0;
        this.field6790 = new class530();
        this.field6798 = 0;
        this.method2861((byte) 47);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "()Lvk;")
    public final class334 method2731() {
        return this.field6792;
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "()V")
    public final void method2732() {
        this.field6789 = true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(J)V")
    public final void method2733(long arg0) {
        this.field6786 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIII)V")
    public final void method2734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6793 = arg0;
        this.field6797 = arg1;
        this.field6796 = arg2;
        this.field6794 = arg3;
        this.field6799 = arg4;
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "()V")
    public final void method2735() {
        this.field6795 = true;
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "()V")
    public static void method2736() {
        field6781 = null;
        field6787 = null;
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "()V")
    private final void method2737() {
        this.field6789 = false;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lza;J[Lmf;[Lqe;Z)V")
    public final void method2738(class295 arg0, long arg1, class51[] arg2, class502[] arg3, boolean arg4) {
        if (!this.field6785) {
            this.method2729(arg0, arg2, arg4);
            this.method2740(arg3, arg4);
            this.field6786 = arg1;
        }
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "()V")
    public final void method2739() {
        this.field6792.field4875.method895(3);
        for (class377 var1 = (class377) this.field6783.method2600((byte) -85); var1 != null; var1 = (class377) this.field6783.method2601(121)) {
            var1.method2250(17128, this.field6782);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lqe;Z)V")
    private final void method2740(class502[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field6787[var3] = false;
        }
        label73: for (class96 var4 = (class96) this.field6790.method3137(0); var4 != null; var4 = (class96) this.field6790.method3132(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1545 || arg0[var7].field7342 == var4.field1545) {
                        field6787[var7] = true;
                        var4.method774(-109);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2791((byte) 112);
                this.field6798--;
                if (var4.method1648(3)) {
                    var4.method1645(65);
                    class516.field7580--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field6798 != 8; var5++) {
            if (!field6787[var5]) {
                class96 var6 = null;
                if (arg0[var5].method2984((byte) -121).field5207 == 1 && class516.field7580 < 32) {
                    var6 = new class96(arg0[var5], this);
                    class53.field759.method2563(-1, var6, (long) arg0[var5].field7346);
                    class516.field7580++;
                }
                if (var6 == null) {
                    var6 = new class96(arg0[var5], this);
                }
                this.field6790.method3139(0, var6);
                this.field6798++;
                field6787[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I)V")
    public class471(int arg0) {
        class32.field475.method2599(1256, this);
        this.field6786 = arg0;
        this.field6782 = arg0;
        this.field6795 = true;
    }
}
