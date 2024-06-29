import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class198 extends class1 {

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "Z")
    private boolean field2865 = false;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public int field2864 = 0;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "Z")
    public boolean field2863 = false;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "Ljia;")
    private class336 field2861 = new class336();

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
    private int field2871 = 0;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "Lfha;")
    public class522 field2870 = new class522();

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "Z")
    private boolean field2872 = false;

    @OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
    private int field2874 = 0;

    @OriginalMember(owner = "client!pba", name = "u", descriptor = "Z")
    public boolean field2876 = false;

    @OriginalMember(owner = "client!pba", name = "t", descriptor = "Lev;")
    public class347 field2875 = new class347();

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "[Lnk;")
    public class427[] field2862 = new class427[8192];

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "[Z")
    private static boolean[] field2866 = new boolean[32];

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "[Z")
    private static boolean[] field2868 = new boolean[8];

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "J")
    private long field2867;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "J")
    private long field2869;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "()V", line = 3)
    private final void method1333() {
        this.field2865 = false;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lha;)V", line = 6)
    public final void method1334(class545 arg0) {
        this.field2875.field4410.method2962((byte) -29);
        for (class441 var2 = (class441) this.field2861.method1945(false); var2 != null; var2 = (class441) this.field2861.method1944(9408)) {
            var2.method2637(this.field2867, -128, arg0);
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "()Lev;", line = 18)
    public final class347 method1335() {
        this.field2875.field4410.method2962((byte) -29);
        for (int var1 = 0; var1 < this.field2862.length; var1++) {
            if (this.field2862[var1] != null && this.field2862[var1].field5907 != null) {
                this.field2875.field4410.method2959(-97, this.field2862[var1]);
            }
        }
        return this.field2875;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(J)V", line = 37)
    public final void method1336(long arg0) {
        this.field2869 = arg0;
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "()V", line = 40)
    public static void method1337() {
        field2866 = null;
        field2868 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "([Loo;Z)V", line = 46)
    private final void method1338(class648[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2868[var3] = false;
        }
        label76: for (class196 var4 = (class196) this.field2870.method3118((byte) 73); var4 != null; var4 = (class196) this.field2870.method3111(121)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2831 || arg0[var7].field9188 == var4.field2831) {
                        field2868[var7] = true;
                        var4.method1323(true);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method3065(-17363);
                this.field2874--;
                if (var4.method1707(0)) {
                    var4.method1706((byte) 79);
                    class502.field7021--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field2874 != 8; var5++) {
            if (!field2868[var5]) {
                class196 var6 = null;
                if (arg0[var5].method3757(0).field6209 == 1 && class502.field7021 < 32) {
                    var6 = new class196(arg0[var5], this);
                    class651.field9207.method1438((byte) 105, var6, (long) arg0[var5].field9192);
                    class502.field7021++;
                }
                if (var6 == null) {
                    var6 = new class196(arg0[var5], this);
                }
                this.field2870.method3116(29066, var6);
                this.field2874++;
                field2868[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "()V", line = 134)
    public final void method1339() {
        this.field2872 = true;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lha;J)Z", line = 137)
    public final boolean method1340(class545 arg0, long arg1) {
        if (this.field2869 == this.field2867) {
            this.method1333();
        } else {
            this.method1344();
        }
        if (arg1 - this.field2869 > 750L) {
            this.method1348();
            return false;
        }
        int var4 = (int) (arg1 - this.field2867);
        if (this.field2872) {
            for (class441 var5 = (class441) this.field2861.method1945(false); var5 != null; var5 = (class441) this.field2861.method1944(9408)) {
                for (int var6 = 0; var6 < var5.field6039.field2173; var6++) {
                    var5.method2635(-24638, !this.field2865, 1, arg1, arg0);
                }
            }
            this.field2872 = false;
        }
        for (class441 var7 = (class441) this.field2861.method1945(false); var7 != null; var7 = (class441) this.field2861.method1944(9408)) {
            var7.method2635(-24638, !this.field2865, var4, arg1, arg0);
        }
        this.field2867 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class198(int arg0, boolean arg1) {
        this.method1345(arg0, arg1);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lha;[Lhr;Z)V", line = 192)
    private final void method1341(class545 arg0, class57[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field2866[var4] = false;
        }
        label67: for (class441 var5 = (class441) this.field2861.method1945(false); var5 != null; var5 = (class441) this.field2861.method1944(9408)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6053 || arg1[var8].field806 == var5.field6053) {
                        field2866[var8] = true;
                        var5.method2639((byte) 24);
                        var5.field6049 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6051 == 0) {
                    var5.method1(113);
                    this.field2871--;
                } else {
                    var5.field6049 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field2871 != 32; var6++) {
            if (!field2866[var6]) {
                class441 var7 = new class441(arg0, arg1[var6], this, this.field2869);
                this.field2861.method1946(-116, var7);
                this.field2871++;
                field2866[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIII)V", line = 267)
    public final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2873 = arg0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZ)Lpba;", line = 281)
    public static final class198 method1343(int arg0, boolean arg1) {
        if (class380.field5355 == class260.field3536) {
            return new class198(arg0, arg1);
        } else {
            class198 var2 = class67.field918[class380.field5355];
            class380.field5355 = class380.field5355 + 1 & class534.field7482[class438.field6018];
            var2.method1345(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "()V", line = 294)
    public final void method1344() {
        this.field2865 = true;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(IZ)V", line = 298)
    private final void method1345(int arg0, boolean arg1) {
        class335.field4303.method1946(-115, this);
        this.field2869 = arg0;
        this.field2867 = arg0;
        this.field2872 = true;
        this.field2876 = arg1;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lha;J[Lhr;[Loo;Z)V", line = 305)
    public final void method1346(class545 arg0, long arg1, class57[] arg2, class648[] arg3, boolean arg4) {
        if (!this.field2863) {
            this.method1341(arg0, arg2, arg4);
            this.method1338(arg3, arg4);
            this.field2869 = arg1;
        }
    }

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "()Lev;", line = 314)
    public final class347 method1347() {
        return this.field2875;
    }

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "()V", line = 335)
    public final void method1348() {
        this.field2863 = true;
        for (class196 var1 = (class196) this.field2870.method3118((byte) 73); var1 != null; var1 = (class196) this.field2870.method3111(122)) {
            if (var1.field2828.field6209 == 1) {
                var1.method1706((byte) 79);
            }
        }
        for (int var2 = 0; var2 < this.field2862.length; var2++) {
            if (this.field2862[var2] != null) {
                this.field2862[var2].method2600();
                this.field2862[var2] = null;
            }
        }
        this.field2864 = 0;
        this.field2861 = new class336();
        this.field2871 = 0;
        this.field2870 = new class522();
        this.field2874 = 0;
        this.method1(119);
        class67.field918[class260.field3536] = this;
        class260.field3536 = class260.field3536 + 1 & class534.field7482[class438.field6018];
    }
}
