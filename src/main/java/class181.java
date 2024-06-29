import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class181 extends class302 {

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Z")
    public boolean field2992 = false;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public int field2999 = 0;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Lla;")
    private class102 field2984 = new class102();

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    private int field3001 = 0;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "Lnb;")
    public class223 field3002 = new class223();

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "Z")
    private boolean field3003 = false;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    private int field3006 = 0;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[Lba;")
    public class176[] field2986;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "J")
    private long field2990;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2983 = 0;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
    private static boolean field2981 = false;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lak;")
    public static class146 field2988 = new class146(8);

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field2996 = 2;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    private static int field3000 = 0;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "[Z")
    private static boolean[] field2998 = new boolean[8];

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "[Z")
    private static boolean[] field2997 = new boolean[8];

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "J")
    private long field2982;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "J")
    public long field2993;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Lla;")
    private static class102 field2987;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[Lba;")
    public static class176[] field2985;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(J)Z")
    private final boolean method1268(long arg0) {
        long var3;
        if (this.field2990 > this.field2982) {
            var3 = this.field2990;
        } else {
            var3 = this.field2982;
        }
        int var5 = (int) (this.field2993 - var3);
        if (var5 > 750) {
            this.method1269();
            return false;
        }
        if (this.field2982 > 0L) {
            this.field3007 = this.field3005 - (this.field3017 << 6) >> 7;
            this.field3008 = ((this.field3017 << 6) + this.field3005 >> 7) - 1;
            this.field3013 = this.field3016 - (this.field3012 << 6) >> 7;
            this.field3010 = ((this.field3012 << 6) + this.field3016 >> 7) - 1;
            this.field3011 = this.field3004;
            if (this.field3014 < 3) {
                this.field3015 = class166.field2746[this.field3014 + 1][this.field3008][this.field3013] + class166.field2746[this.field3014 + 1][this.field3007][this.field3013] + class166.field2746[this.field3014 + 1][this.field3007][this.field3010] + class166.field2746[this.field3014 + 1][this.field3008][this.field3010] >> 2;
            } else {
                this.field3015 = this.field3011 - 1024;
            }
            int var6 = class136.field2191[this.field3009];
            int var7 = class136.field2193[this.field3009];
            this.method1271(var6, var7);
            if (this.field3003) {
                class130 var8 = (class130) this.field2984.method730((byte) 82);
                while (true) {
                    if (var8 == null) {
                        this.field3003 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2099.field1825; var9++) {
                        var8.method886((byte) -57, var7, var6, this.field2993, true, 1);
                    }
                    var8 = (class130) this.field2984.method729((byte) -128);
                }
            }
            int var10 = (int) (arg0 - this.field2993);
            for (class130 var11 = (class130) this.field2984.method730((byte) 102); var11 != null; var11 = (class130) this.field2984.method729((byte) -128)) {
                var11.method886((byte) -57, var7, var6, arg0, var5 < 10, var10);
            }
        }
        this.field2993 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public final void method1269() {
        this.field2992 = true;
        for (class295 var1 = (class295) this.field3002.method1553(true); var1 != null; var1 = (class295) this.field3002.method1551(0)) {
            if (var1.field4810.field1722.field1282 == 1) {
                var1.method1708((byte) 90);
            }
        }
        this.field2986 = new class176[8192];
        this.field2999 = 0;
        this.field2984 = new class102();
        this.field3001 = 0;
        this.field3002 = new class223();
        this.field3006 = 0;
        this.method2064(20307);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
    public final void method1270() {
        this.field3003 = true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
    private final void method1271(int arg0, int arg1) {
        for (class295 var3 = (class295) this.field3002.method1553(true); var3 != null; var3 = (class295) this.field3002.method1551(0)) {
            var3.field4818 = this.field3005 + var3.field4814;
            var3.field4813 = this.field3004 + var3.field4820;
            var3.field4808 = this.field3016 + var3.field4815;
            if (this.field3009 == 0) {
                var3.field4816 = var3.field4810.field1722.field1295;
                var3.field4811 = var3.field4810.field1722.field1293;
            } else {
                int var4 = var3.field4810.field1722.field1295;
                int var5 = var3.field4810.field1722.field1293;
                var3.field4816 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field4811 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()I")
    public static final int method1272() {
        return field2996;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lc;Z[I[I[I)V")
    private final void method1273(class112[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2997[var6] = false;
        }
        label91: for (class295 var7 = (class295) this.field3002.method1553(true); var7 != null; var7 = (class295) this.field3002.method1551(0)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field4810) {
                        field2997[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method952((byte) 69);
                this.field3006--;
                if (var7.method1709(192)) {
                    var7.method1708((byte) 90);
                    field3000--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field3006 != 8; var8++) {
            if (!field2997[var8]) {
                class295 var9 = null;
                if (arg0[var8].field1722.field1282 == 1 && field3000 < 32) {
                    var9 = new class295(arg0[var8], this);
                    field2988.method999(var9, -3, (long) arg0[var8].field1722.field1298);
                    field3000++;
                }
                if (var9 == null) {
                    var9 = new class295(arg0[var8], this);
                }
                this.field3002.method1554(5257, var9);
                this.field3006++;
                field2997[var8] = true;
            }
        }
        for (class295 var10 = (class295) this.field3002.method1553(true); var10 != null; var10 = (class295) this.field3002.method1551(0)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field2997[var11] && arg0[var11] == var10.field4810) {
                    var10.method2026(-18636, arg2[var10.field4810.field1716], arg3[var10.field4810.field1716], arg4[var10.field4810.field1716]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lk;[Lc;Z[I[I[I)V")
    public final void method1274(class192[] arg0, class112[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2992) {
            this.method1284(arg0, arg2, arg3, arg4, arg5);
            this.method1273(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
    public final void method1275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2992) {
            return;
        }
        if (this.field3009 != arg0) {
            for (class130 var6 = (class130) this.field2984.method730((byte) 62); var6 != null; var6 = (class130) this.field2984.method729((byte) -128)) {
                var6.field2079 = true;
            }
        }
        this.field2982 = this.field2993;
        this.field3009 = arg0;
        this.field3014 = arg1;
        this.field3005 = arg2;
        this.field3004 = arg3;
        this.field3016 = arg4;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(J)V")
    public static final void method1276(long arg0) {
        field2989 = field2995;
        field2983 = 0;
        field2995 = 0;
        long var2 = class264.method1778(6573);
        for (class181 var4 = (class181) field2987.method730((byte) -68); var4 != null; var4 = (class181) field2987.method729((byte) -128)) {
            if (var4.method1268(arg0)) {
                field2983++;
            }
        }
        if (field2981 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2987.method732(0) + ", running: " + field2983 + ". Particles: " + field2995 + ". Time taken: " + (class264.method1778(6573) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
    public static final void method1277(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lgi;)V")
    public static final void method1278(class164 arg0) {
        field2991 = 0;
        field2994 = 0;
        field2987 = new class102();
        field2985 = new class176[1024];
        class226.method1565((byte) 120, arg0);
        class153.method1036(62, arg0);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()V")
    public static final void method1279() {
        field2988 = new class146(8);
        field3000 = 0;
        for (class181 var0 = (class181) field2987.method730((byte) -51); var0 != null; var0 = (class181) field2987.method729((byte) -128)) {
            var0.method1269();
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "()V")
    public static void method1280() {
        field2987 = null;
        field2985 = null;
        field2988 = null;
        field2998 = null;
        field2997 = null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static final void method1281(int arg0) {
        field2996 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "()I")
    public final int method1282() {
        if (this.field3008 == this.field3007 && this.field3013 == this.field3010) {
            return 92;
        }
        int var1 = this.field3007 << 7;
        int var2 = (this.field3008 << 7) + 128;
        int var3 = this.field3013 << 7;
        int var4 = (this.field3010 << 7) + 128;
        int var5 = this.field3005 - var1;
        int var6 = var2 - this.field3005;
        if (var5 > var6) {
            int var7 = this.field3016 - var3;
            int var8 = var4 - this.field3016;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field3016 - var3;
            int var10 = var4 - this.field3016;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIIII)V")
    public final void method1283(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1275(arg0, arg1, class35.field567 + arg2, class251.field4123 + arg3, class280.field4561 + arg4);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lk;Z[I[I[I)V")
    private final void method1284(class192[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2998[var6] = false;
        }
        label82: for (class130 var7 = (class130) this.field2984.method730((byte) -55); var7 != null; var7 = (class130) this.field2984.method729((byte) -128)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field2091) {
                        field2998[var12] = true;
                        var7.field2097 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2076 == 0) {
                    var7.method2064(20307);
                    this.field3001--;
                } else {
                    var7.field2097 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field3001 != 8; var8++) {
            if (!field2998[var8]) {
                class130 var9 = new class130(arg0[var8], this, this.field2993);
                this.field2984.method726(var9, -15473);
                this.field3001++;
                field2998[var8] = true;
            }
        }
        for (class130 var10 = (class130) this.field2984.method730((byte) 89); var10 != null; var10 = (class130) this.field2984.method729((byte) -128)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field2998[var11] && arg0[var11] == var10.field2091) {
                    var10.method884(arg4[var10.field2091.field3138], arg2[var10.field2091.field3129], arg4[var10.field2091.field3136], arg2[var10.field2091.field3138], arg4[var10.field2091.field3129], arg3[var10.field2091.field3129], 31779, arg3[var10.field2091.field3136], arg2[var10.field2091.field3136], arg3[var10.field2091.field3138]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V")
    public class181(int arg0, int arg1, int arg2) {
        this.field3017 = arg1;
        this.field3012 = arg2;
        this.field2986 = new class176[8192];
        this.field2990 = (long) arg0;
        this.field3003 = true;
        field2987.method726(this, -15473);
    }

    static {
        new class274(131056);
    }
}
