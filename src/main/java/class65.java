import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class65 extends class45 {

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    public boolean field933 = false;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public int field939 = 0;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "Lgf;")
    private class7 field937 = new class7();

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "Lol;")
    public class220 field949 = new class220();

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    private int field952 = 0;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Z")
    private boolean field956 = false;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "[Ldf;")
    public class154[] field944;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "J")
    private long field945;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field947 = 0;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "Z")
    private static boolean field948 = false;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "Loe;")
    public static class120 field940 = new class120(8);

    @OriginalMember(owner = "client!om", name = "I", descriptor = "[Z")
    private static boolean[] field951 = new boolean[8];

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    private static int field961 = 0;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "I")
    public static int field967 = 2;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "[Z")
    private static boolean[] field950 = new boolean[8];

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "J")
    private long field941;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "J")
    public long field942;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Lgf;")
    private static class7 field932;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "[Ldf;")
    public static class154[] field931;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field933) {
            return;
        }
        if (this.field957 != arg0) {
            for (class76 var6 = (class76) this.field937.method37(120); var6 != null; var6 = (class76) this.field937.method42(0)) {
                var6.field1159 = true;
            }
        }
        this.field941 = this.field942;
        this.field957 = arg0;
        this.field953 = arg1;
        this.field968 = arg2;
        this.field960 = arg3;
        this.field964 = arg4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(J)Z")
    private final boolean method417(long arg0) {
        long var3;
        if (this.field945 > this.field941) {
            var3 = this.field945;
        } else {
            var3 = this.field941;
        }
        int var5 = (int) (this.field942 - var3);
        if (var5 > 750) {
            this.method428();
            return false;
        }
        if (this.field941 > 0L) {
            this.field954 = this.field968 - (this.field962 << 6) >> 7;
            this.field955 = ((this.field962 << 6) + this.field968 >> 7) - 1;
            this.field959 = this.field964 - (this.field965 << 6) >> 7;
            this.field958 = ((this.field965 << 6) + this.field964 >> 7) - 1;
            this.field963 = this.field960;
            if (this.field953 < 3) {
                this.field966 = class8.field114[this.field953 + 1][this.field955][this.field959] + class8.field114[this.field953 + 1][this.field954][this.field959] + class8.field114[this.field953 + 1][this.field954][this.field958] + class8.field114[this.field953 + 1][this.field955][this.field958] >> 2;
            } else {
                this.field966 = this.field963 - 1024;
            }
            int var6 = class221.field3468[this.field957];
            int var7 = class221.field3465[this.field957];
            this.method432(var6, var7);
            if (this.field956) {
                class76 var8 = (class76) this.field937.method37(98);
                while (true) {
                    if (var8 == null) {
                        this.field956 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field1168.field4533; var9++) {
                        var8.method523(this.field942, var6, var7, (byte) 83, 1, true);
                    }
                    var8 = (class76) this.field937.method42(0);
                }
            }
            int var10 = (int) (arg0 - this.field942);
            for (class76 var11 = (class76) this.field937.method37(63); var11 != null; var11 = (class76) this.field937.method42(0)) {
                var11.method523(arg0, var6, var7, (byte) 83, var10, var5 < 10);
            }
        }
        this.field942 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([Lq;Z[I[I[I)V")
    private final void method418(class90[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field950[var6] = false;
        }
        label82: for (class76 var7 = (class76) this.field937.method37(53); var7 != null; var7 = (class76) this.field937.method42(0)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field1169) {
                        field950[var12] = true;
                        var7.field1153 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field1165 == 0) {
                    var7.method252(125);
                    this.field946--;
                } else {
                    var7.field1153 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field946 != 8; var8++) {
            if (!field950[var8]) {
                class76 var9 = new class76(arg0[var8], this, this.field942);
                this.field937.method39(var9, false);
                this.field946++;
                field950[var8] = true;
            }
        }
        for (class76 var10 = (class76) this.field937.method37(68); var10 != null; var10 = (class76) this.field937.method42(0)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field950[var11] && arg0[var11] == var10.field1169) {
                    var10.method524(arg4[var10.field1169.field1356], arg3[var10.field1169.field1356], arg2[var10.field1169.field1356], arg4[var10.field1169.field1358], arg2[var10.field1169.field1357], arg4[var10.field1169.field1357], arg3[var10.field1169.field1357], arg3[var10.field1169.field1358], 3, arg2[var10.field1169.field1358]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
    public static final void method419() {
        field940 = new class120(8);
        field961 = 0;
        for (class65 var0 = (class65) field932.method37(70); var0 != null; var0 = (class65) field932.method42(0)) {
            var0.method428();
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()I")
    public final int method420() {
        if (this.field955 == this.field954 && this.field959 == this.field958) {
            return 92;
        }
        int var1 = this.field954 << 7;
        int var2 = (this.field955 << 7) + 128;
        int var3 = this.field959 << 7;
        int var4 = (this.field958 << 7) + 128;
        int var5 = this.field968 - var1;
        int var6 = var2 - this.field968;
        if (var5 > var6) {
            int var7 = this.field964 - var3;
            int var8 = var4 - this.field964;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field964 - var3;
            int var10 = var4 - this.field964;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "()V")
    public final void method421() {
        this.field956 = true;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lvl;)V")
    public static final void method422(class73 arg0) {
        field930 = 0;
        field934 = 0;
        field932 = new class7();
        field931 = new class154[1024];
        class150.method1013((byte) 74, arg0);
        class113.method751(arg0, -12065);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IIIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method416(arg0, arg1, class220.field3458 + arg2, class148.field2203 + arg3, class140.field2008 + arg4);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V")
    public static final void method424(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([Lcj;Z[I[I[I)V")
    private final void method425(class303[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field951[var6] = false;
        }
        label91: for (class286 var7 = (class286) this.field949.method1548(0); var7 != null; var7 = (class286) this.field949.method1549(-125)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field4635) {
                        field951[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method1764(64);
                this.field952--;
                if (var7.method380(false)) {
                    var7.method378((byte) -126);
                    field961--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field952 != 8; var8++) {
            if (!field951[var8]) {
                class286 var9 = null;
                if (arg0[var8].field4819.field1857 == 1 && field961 < 32) {
                    var9 = new class286(arg0[var8], this);
                    field940.method786((long) arg0[var8].field4819.field1849, var9, 103);
                    field961++;
                }
                if (var9 == null) {
                    var9 = new class286(arg0[var8], this);
                }
                this.field949.method1540(var9, (byte) -107);
                this.field952++;
                field951[var8] = true;
            }
        }
        for (class286 var10 = (class286) this.field949.method1548(0); var10 != null; var10 = (class286) this.field949.method1549(87)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field951[var11] && arg0[var11] == var10.field4635) {
                    var10.method1957(arg4[var10.field4635.field4814], 126, arg3[var10.field4635.field4814], arg2[var10.field4635.field4814]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public static final void method426(int arg0) {
        field967 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([Lq;[Lcj;Z[I[I[I)V")
    public final void method427(class90[] arg0, class303[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field933) {
            this.method418(arg0, arg2, arg3, arg4, arg5);
            this.method425(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "()V")
    public final void method428() {
        this.field933 = true;
        for (class286 var1 = (class286) this.field949.method1548(0); var1 != null; var1 = (class286) this.field949.method1549(117)) {
            if (var1.field4635.field4819.field1857 == 1) {
                var1.method378((byte) -112);
            }
        }
        this.field944 = new class154[8192];
        this.field939 = 0;
        this.field937 = new class7();
        this.field946 = 0;
        this.field949 = new class220();
        this.field952 = 0;
        this.method252(-51);
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "()I")
    public static final int method429() {
        return field967;
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "()V")
    public static void method430() {
        field932 = null;
        field931 = null;
        field940 = null;
        field950 = null;
        field951 = null;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(J)V")
    public static final void method431(long arg0) {
        field947 = field935;
        field936 = 0;
        field935 = 0;
        long var2 = class98.method665(true);
        for (class65 var4 = (class65) field932.method37(81); var4 != null; var4 = (class65) field932.method42(0)) {
            if (var4.method417(arg0)) {
                field936++;
            }
        }
        if (field948 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field932.method38((byte) 46) + ", running: " + field936 + ". Particles: " + field935 + ". Time taken: " + (class98.method665(true) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V")
    private final void method432(int arg0, int arg1) {
        for (class286 var3 = (class286) this.field949.method1548(0); var3 != null; var3 = (class286) this.field949.method1549(-39)) {
            var3.field4627 = this.field968 + var3.field4621;
            var3.field4619 = this.field960 + var3.field4618;
            var3.field4634 = this.field964 + var3.field4631;
            if (this.field957 == 0) {
                var3.field4624 = var3.field4635.field4819.field1846;
                var3.field4630 = var3.field4635.field4819.field1847;
            } else {
                int var4 = var3.field4635.field4819.field1846;
                int var5 = var3.field4635.field4819.field1847;
                var3.field4624 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field4630 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(III)V")
    public class65(int arg0, int arg1, int arg2) {
        this.field962 = arg1;
        this.field965 = arg2;
        this.field944 = new class154[8192];
        this.field945 = (long) arg0;
        this.field956 = true;
        field932.method39(this, false);
    }

    static {
        new class170(131056);
    }
}
