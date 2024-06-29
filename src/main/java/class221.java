import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class221 extends class254 {

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Z")
    public boolean field4024 = false;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public int field4023 = 0;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lgb;")
    private class147 field4014 = new class147();

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    private int field4033 = 0;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Lsg;")
    public class162 field4032 = new class162();

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    private int field4043 = 0;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "Z")
    private boolean field4047 = false;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    private int field4041;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    private int field4038;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[Lia;")
    public class225[] field4015;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "J")
    private long field4020;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field4021 = 0;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Z")
    private static boolean field4011 = false;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field4025 = 0;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Ltc;")
    public static class177 field4026 = new class177(8);

    @OriginalMember(owner = "client!md", name = "M", descriptor = "[Z")
    private static boolean[] field4029 = new boolean[8];

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    private static int field4027 = 0;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field4028 = 2;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "[Z")
    private static boolean[] field4031 = new boolean[8];

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "J")
    private long field4016;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "J")
    public long field4030;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lgb;")
    private static class147 field4022;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "[Lia;")
    public static class225[] field4017;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(J)Z")
    private final boolean method1553(long arg0) {
        long var3;
        if (this.field4020 > this.field4016) {
            var3 = this.field4020;
        } else {
            var3 = this.field4016;
        }
        int var5 = (int) (this.field4030 - var3);
        if (var5 > 750) {
            this.method1559();
            return false;
        }
        if (this.field4016 > 0L) {
            this.field4042 = this.field4044 - (this.field4041 << 6) >> 7;
            this.field4034 = ((this.field4041 << 6) + this.field4044 >> 7) - 1;
            this.field4035 = this.field4040 - (this.field4038 << 6) >> 7;
            this.field4045 = ((this.field4038 << 6) + this.field4040 >> 7) - 1;
            this.field4048 = this.field4037;
            if (this.field4039 < 3) {
                this.field4046 = class271.field4803[this.field4039 + 1][this.field4042][this.field4035] + class271.field4803[this.field4039 + 1][this.field4034][this.field4035] + class271.field4803[this.field4039 + 1][this.field4042][this.field4045] + class271.field4803[this.field4039 + 1][this.field4034][this.field4045] >> 2;
            } else {
                this.field4046 = this.field4048 - 1024;
            }
            int var6 = class15.field278[this.field4036];
            int var7 = class15.field280[this.field4036];
            this.method1558(var6, var7);
            if (this.field4047) {
                class103 var8 = (class103) this.field4014.method1026(true);
                while (true) {
                    if (var8 == null) {
                        this.field4047 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field1991.field3084; var9++) {
                        var8.method704(var6, 1, this.field4030, var7, (byte) -126, true);
                    }
                    var8 = (class103) this.field4014.method1020(4745);
                }
            }
            int var10 = (int) (arg0 - this.field4030);
            for (class103 var11 = (class103) this.field4014.method1026(true); var11 != null; var11 = (class103) this.field4014.method1020(4745)) {
                var11.method704(var6, var10, arg0, var7, (byte) -126, var5 < 10);
            }
        }
        this.field4030 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lea;Z[I[I[I)V")
    private final void method1554(class37[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field4031[var6] = false;
        }
        label65: for (class103 var7 = (class103) this.field4014.method1026(true); var7 != null; var7 = (class103) this.field4014.method1020(4745)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field1976) {
                        field4031[var11] = true;
                        var7.field1998 = false;
                        continue label65;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2005 == 0) {
                    var7.method1754(-118);
                    this.field4033--;
                } else {
                    var7.field1998 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field4033 != 8; var8++) {
                if (!field4031[var8]) {
                    class103 var9 = new class103(arg0[var8], this, this.field4030);
                    this.field4014.method1023(var9, false);
                    this.field4033++;
                }
            }
        }
        for (class103 var10 = (class103) this.field4014.method1026(true); var10 != null; var10 = (class103) this.field4014.method1020(4745)) {
            var10.method707(arg4[var10.field1976.field640], arg3[var10.field1976.field633], arg4[var10.field1976.field643], arg2[var10.field1976.field640], (byte) 23, arg3[var10.field1976.field643], arg2[var10.field1976.field643], arg2[var10.field1976.field633], arg4[var10.field1976.field633], arg3[var10.field1976.field640]);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field4024) {
            return;
        }
        if (this.field4036 != arg0) {
            for (class103 var6 = (class103) this.field4014.method1026(true); var6 != null; var6 = (class103) this.field4014.method1020(4745)) {
                var6.field1980 = true;
            }
        }
        this.field4016 = this.field4030;
        this.field4036 = arg0;
        this.field4039 = arg1;
        this.field4044 = arg2;
        this.field4037 = arg3;
        this.field4040 = arg4;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(J)V")
    public static final void method1556(long arg0) {
        field4019 = 0;
        field4025 = 0;
        long var2 = class180.method1236(114);
        for (class221 var4 = (class221) field4022.method1026(true); var4 != null; var4 = (class221) field4022.method1020(4745)) {
            if (var4.method1553(arg0)) {
                field4019++;
            }
        }
        if (field4011 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field4022.method1018((byte) -126) + ", running: " + field4019 + ". Particles: " + field4025 + ". Time taken: " + (class180.method1236(106) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lsj;)V")
    public static final void method1557(class49 arg0) {
        field4021 = 0;
        field4012 = 0;
        field4022 = new class147();
        field4017 = new class225[1024];
        class229.method1605(arg0, 64);
        class181.method1242(arg0, 1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    private final void method1558(int arg0, int arg1) {
        for (class191 var3 = (class191) this.field4032.method1119(20896); var3 != null; var3 = (class191) this.field4032.method1120(108)) {
            var3.field3472 = this.field4044 + var3.field3476;
            var3.field3470 = this.field4037 + var3.field3471;
            var3.field3453 = this.field4040 + var3.field3475;
            if (this.field4036 == 0) {
                var3.field3456 = var3.field3464.field1938.field4767;
                var3.field3463 = var3.field3464.field1938.field4782;
            } else {
                int var4 = var3.field3464.field1938.field4767;
                int var5 = var3.field3464.field1938.field4782;
                var3.field3456 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field3463 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
    public final void method1559() {
        this.field4024 = true;
        for (class191 var1 = (class191) this.field4032.method1119(20896); var1 != null; var1 = (class191) this.field4032.method1120(58)) {
            if (var1.field3464.field1938.field4762 == 1) {
                var1.method1796(-71);
            }
        }
        this.field4015 = new class225[8192];
        this.field4023 = 0;
        this.field4014 = new class147();
        this.field4033 = 0;
        this.field4032 = new class162();
        this.field4043 = 0;
        this.method1754(-25);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lea;[Lpk;Z[I[I[I)V")
    public final void method1560(class37[] arg0, class99[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field4024) {
            this.method1554(arg0, arg2, arg3, arg4, arg5);
            this.method1567(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
    public static final int method1561() {
        return field4028;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIIII)V")
    public final void method1562(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1555(arg0, arg1, class272.field4824 + arg2, class215.field3878 + arg3, class87.field1732 + arg4);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
    public static void method1563() {
        field4022 = null;
        field4017 = null;
        field4026 = null;
        field4031 = null;
        field4029 = null;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
    public final void method1564() {
        this.field4047 = true;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public static final void method1565(int arg0) {
        field4028 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "()V")
    public static final void method1566() {
        field4026 = new class177(8);
        field4027 = 0;
        for (class221 var0 = (class221) field4022.method1026(true); var0 != null; var0 = (class221) field4022.method1020(4745)) {
            var0.method1559();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lpk;Z[I[I[I)V")
    private final void method1567(class99[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field4029[var6] = false;
        }
        label74: for (class191 var7 = (class191) this.field4032.method1119(20896); var7 != null; var7 = (class191) this.field4032.method1120(109)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field3464) {
                        field4029[var11] = true;
                        continue label74;
                    }
                }
            }
            if (!arg1) {
                var7.method269(-214950896);
                this.field4043--;
                if (var7.method1794(-111)) {
                    var7.method1796(-79);
                    field4027--;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field4043 != 8; var8++) {
                if (!field4029[var8]) {
                    class191 var9 = null;
                    if (arg0[var8].field1938.field4762 == 1 && field4027 < 32) {
                        var9 = new class191(arg0[var8], this);
                        field4026.method1220(var9, -125, (long) arg0[var8].field1938.field4779);
                        field4027++;
                    }
                    if (var9 == null) {
                        var9 = new class191(arg0[var8], this);
                    }
                    this.field4032.method1123(var9, (byte) -128);
                    this.field4043++;
                }
            }
        }
        for (class191 var10 = (class191) this.field4032.method1119(20896); var10 != null; var10 = (class191) this.field4032.method1120(114)) {
            var10.method1311(arg4[var10.field3464.field1925], arg2[var10.field3464.field1925], arg3[var10.field3464.field1925], (byte) 88);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(III)V")
    public class221(int arg0, int arg1, int arg2) {
        this.field4041 = arg1;
        this.field4038 = arg2;
        this.field4015 = new class225[8192];
        this.field4020 = (long) arg0;
        this.field4047 = true;
        field4022.method1023(this, false);
    }

    static {
        new class106(131056);
    }
}
