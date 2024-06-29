import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class190 extends class254 {

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "Z")
    private boolean field2728 = false;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "Z")
    public boolean field2732 = false;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public int field2733 = 0;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Lht;")
    private class410 field2731 = new class410();

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    private int field2738 = 0;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "Lar;")
    public class479 field2737 = new class479();

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "Z")
    private boolean field2739 = false;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    private int field2740 = 0;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "Lpn;")
    public class523 field2742 = new class523();

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "[Lwq;")
    public class114[] field2729 = new class114[8192];

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "J")
    private long field2734;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "J")
    private long field2735;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "[Z")
    private static boolean[] field2730 = new boolean[8];

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "[Z")
    private static boolean[] field2736 = new boolean[8];

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lya;J[Lqc;[Lpd;Z)V")
    public final void method1188(class38 arg0, long arg1, class521[] arg2, class169[] arg3, boolean arg4) {
        if (!this.field2732) {
            this.method1199(arg0, arg2, arg4);
            this.method1200(arg3, arg4);
            this.field2734 = arg1;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lya;J)Z")
    public final boolean method1189(class38 arg0, long arg1) {
        if (this.field2735 == this.field2734) {
            this.method1195();
        } else {
            this.method1197();
        }
        if (arg1 - this.field2734 > 750L) {
            this.method1196();
            return false;
        }
        int var4 = (int) (arg1 - this.field2735);
        if (this.field2739) {
            for (class21 var5 = (class21) this.field2731.method2461(-89); var5 != null; var5 = (class21) this.field2731.method2458(111)) {
                for (int var6 = 0; var6 < var5.field293.field1393; var6++) {
                    var5.method132(65535, arg0, !this.field2728, 1, arg1);
                }
            }
            this.field2739 = false;
        }
        for (class21 var7 = (class21) this.field2731.method2461(-91); var7 != null; var7 = (class21) this.field2731.method2458(125)) {
            var7.method132(65535, arg0, !this.field2728, var4, arg1);
        }
        this.field2735 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIII)V")
    public final void method1190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2745 = arg0;
        this.field2741 = arg1;
        this.field2744 = arg2;
        this.field2746 = arg3;
        this.field2743 = arg4;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "()V")
    public static void method1191() {
        field2736 = null;
        field2730 = null;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "()V")
    public final void method1192() {
        this.field2739 = true;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "()Lpn;")
    public final class523 method1193() {
        return this.field2742;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(J)V")
    public final void method1194(long arg0) {
        this.field2734 = arg0;
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "()V")
    private final void method1195() {
        this.field2728 = false;
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "()V")
    public final void method1196() {
        this.field2732 = true;
        for (class347 var1 = (class347) this.field2737.method2818((byte) 110); var1 != null; var1 = (class347) this.field2737.method2820((byte) -58)) {
            if (var1.field4965.field3851 == 1) {
                var1.method36(0);
            }
        }
        this.field2729 = new class114[8192];
        this.field2733 = 0;
        this.field2731 = new class410();
        this.field2738 = 0;
        this.field2737 = new class479();
        this.field2740 = 0;
        this.method1522(-59);
    }

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "()V")
    public final void method1197() {
        this.field2728 = true;
    }

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "()V")
    public final void method1198() {
        this.field2742.field7740.method912(7);
        for (class21 var1 = (class21) this.field2731.method2461(-111); var1 != null; var1 = (class21) this.field2731.method2458(35)) {
            var1.method133(1134647088, this.field2735);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lya;[Lqc;Z)V")
    private final void method1199(class38 arg0, class521[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field2736[var4] = false;
        }
        label64: for (class21 var5 = (class21) this.field2731.method2461(-86); var5 != null; var5 = (class21) this.field2731.method2458(112)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field278 || arg1[var8].field7715 == var5.field278) {
                        field2736[var8] = true;
                        var5.method131(true);
                        var5.field304 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field292 == 0) {
                    var5.method1522(-59);
                    this.field2738--;
                } else {
                    var5.field304 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field2738 != 8; var6++) {
            if (!field2736[var6]) {
                class21 var7 = new class21(arg0, arg1[var6], this, this.field2734);
                this.field2731.method2454(-9946, var7);
                this.field2738++;
                field2736[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([Lpd;Z)V")
    private final void method1200(class169[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2730[var3] = false;
        }
        label73: for (class347 var4 = (class347) this.field2737.method2818((byte) 111); var4 != null; var4 = (class347) this.field2737.method2820((byte) -58)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4967 || arg0[var7].field2528 == var4.field4967) {
                        field2730[var7] = true;
                        var4.method2051((byte) -112);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1565(0);
                this.field2740--;
                if (var4.method37(0)) {
                    var4.method36(0);
                    class2.field6--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field2740 != 8; var5++) {
            if (!field2730[var5]) {
                class347 var6 = null;
                if (arg0[var5].method1109(-126).field3851 == 1 && class2.field6 < 32) {
                    var6 = new class347(arg0[var5], this);
                    class451.field6652.method211((long) arg0[var5].field2521, var6, -1);
                    class2.field6++;
                }
                if (var6 == null) {
                    var6 = new class347(arg0[var5], this);
                }
                this.field2737.method2809(var6, 2);
                this.field2740++;
                field2730[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I)V")
    public class190(int arg0) {
        class458.field6717.method2454(-9946, this);
        this.field2734 = arg0;
        this.field2735 = arg0;
        this.field2739 = true;
    }
}
