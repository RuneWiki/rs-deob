import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class77 extends class226 {

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Z")
    public boolean field1207 = false;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public int field1214 = 0;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Lnj;")
    private class150 field1213 = new class150();

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    private int field1219 = 0;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "Lwa;")
    public class281 field1220 = new class281();

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Z")
    private boolean field1222 = false;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    private int field1229 = 0;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[Ljl;")
    public class269[] field1202;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "J")
    private long field1211;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Z")
    private static boolean field1201 = false;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lge;")
    public static class72 field1208 = new class72(8);

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "[Z")
    private static boolean[] field1218 = new boolean[8];

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    private static int field1216 = 0;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field1215 = 2;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "[Z")
    private static boolean[] field1217 = new boolean[8];

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "J")
    private long field1198;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "J")
    public long field1203;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lnj;")
    private static class150 field1206;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[Ljl;")
    public static class269[] field1197;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lnb;Z[I[I[I)V")
    private final void method503(class223[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field1217[var6] = false;
        }
        label82: for (class143 var7 = (class143) this.field1213.method994(97); var7 != null; var7 = (class143) this.field1213.method997(1863)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field2256) {
                        field1217[var12] = true;
                        var7.field2243 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2229 == 0) {
                    var7.method1574((byte) 120);
                    this.field1219--;
                } else {
                    var7.field2243 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field1219 != 8; var8++) {
            if (!field1217[var8]) {
                class143 var9 = new class143(arg0[var8], this, this.field1203);
                this.field1213.method998(var9, (byte) -61);
                this.field1219++;
                field1217[var8] = true;
            }
        }
        for (class143 var10 = (class143) this.field1213.method994(34); var10 != null; var10 = (class143) this.field1213.method997(1863)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field1217[var11] && arg0[var11] == var10.field2256) {
                    var10.method963(arg3[var10.field2256.field3547], arg2[var10.field2256.field3557], arg4[var10.field2256.field3557], arg3[var10.field2256.field3553], (byte) 121, arg3[var10.field2256.field3557], arg2[var10.field2256.field3553], arg2[var10.field2256.field3547], arg4[var10.field2256.field3553], arg4[var10.field2256.field3547]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static final void method504(int arg0) {
        field1215 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(J)V")
    public static final void method505(long arg0) {
        field1212 = field1210;
        field1200 = 0;
        field1210 = 0;
        long var2 = class267.method1841((byte) 119);
        for (class77 var4 = (class77) field1206.method994(104); var4 != null; var4 = (class77) field1206.method997(1863)) {
            if (var4.method507(arg0)) {
                field1200++;
            }
        }
        if (field1201 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field1206.method992(-32208) + ", running: " + field1200 + ". Particles: " + field1210 + ". Time taken: " + (class267.method1841((byte) 123) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
    public static final int method506() {
        return field1215;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(J)Z")
    private final boolean method507(long arg0) {
        long var3;
        if (this.field1211 > this.field1198) {
            var3 = this.field1211;
        } else {
            var3 = this.field1198;
        }
        int var5 = (int) (this.field1203 - var3);
        if (var5 > 750) {
            this.method511();
            return false;
        }
        if (this.field1198 > 0L) {
            this.field1227 = this.field1230 - (this.field1225 << 6) >> 7;
            this.field1226 = ((this.field1225 << 6) + this.field1230 >> 7) - 1;
            this.field1232 = this.field1224 - (this.field1234 << 6) >> 7;
            this.field1233 = ((this.field1234 << 6) + this.field1224 >> 7) - 1;
            this.field1223 = this.field1235;
            if (this.field1221 < 3) {
                this.field1231 = class242.field3842[this.field1221 + 1][this.field1227][this.field1232] + class242.field3842[this.field1221 + 1][this.field1226][this.field1232] + class242.field3842[this.field1221 + 1][this.field1227][this.field1233] + class242.field3842[this.field1221 + 1][this.field1226][this.field1233] >> 2;
            } else {
                this.field1231 = this.field1223 - 1024;
            }
            int var6 = class172.field2669[this.field1228];
            int var7 = class172.field2658[this.field1228];
            this.method512(var6, var7);
            if (this.field1222) {
                class143 var8 = (class143) this.field1213.method994(18);
                while (true) {
                    if (var8 == null) {
                        this.field1222 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2254.field552; var9++) {
                        var8.method968(true, 1, true, var7, this.field1203, var6);
                    }
                    var8 = (class143) this.field1213.method997(1863);
                }
            }
            int var10 = (int) (arg0 - this.field1203);
            for (class143 var11 = (class143) this.field1213.method994(15); var11 != null; var11 = (class143) this.field1213.method997(1863)) {
                var11.method968(true, var10, var5 < 10, var7, arg0, var6);
            }
        }
        this.field1203 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()V")
    public static void method508() {
        field1206 = null;
        field1197 = null;
        field1208 = null;
        field1217 = null;
        field1218 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()V")
    public final void method509() {
        this.field1222 = true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method516(arg0, arg1, class160.field2527 + arg2, class60.field925 + arg3, class60.field927 + arg4);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()V")
    public final void method511() {
        this.field1207 = true;
        for (class271 var1 = (class271) this.field1220.method1959(205); var1 != null; var1 = (class271) this.field1220.method1956(116)) {
            if (var1.field4440.field4736.field2194 == 1) {
                var1.method1075(7596);
            }
        }
        this.field1202 = new class269[8192];
        this.field1214 = 0;
        this.field1213 = new class150();
        this.field1219 = 0;
        this.field1220 = new class281();
        this.field1229 = 0;
        this.method1574((byte) 115);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    private final void method512(int arg0, int arg1) {
        for (class271 var3 = (class271) this.field1220.method1959(205); var3 != null; var3 = (class271) this.field1220.method1956(112)) {
            var3.field4436 = this.field1230 + var3.field4438;
            var3.field4434 = this.field1235 + var3.field4433;
            var3.field4449 = this.field1224 + var3.field4444;
            if (this.field1228 == 0) {
                var3.field4445 = var3.field4440.field4736.field2178;
                var3.field4447 = var3.field4440.field4736.field2167;
            } else {
                int var4 = var3.field4440.field4736.field2178;
                int var5 = var3.field4440.field4736.field2167;
                var3.field4445 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field4447 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfa;)V")
    public static final void method513(class273 arg0) {
        field1205 = 0;
        field1204 = 0;
        field1206 = new class150();
        field1197 = new class269[1024];
        class102.method666((byte) -53, arg0);
        class150.method990(arg0, 37);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lik;Z[I[I[I)V")
    private final void method514(class283[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field1218[var6] = false;
        }
        label91: for (class271 var7 = (class271) this.field1220.method1959(205); var7 != null; var7 = (class271) this.field1220.method1956(94)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field4440) {
                        field1218[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method900(58);
                this.field1229--;
                if (var7.method1077((byte) -87)) {
                    var7.method1075(7596);
                    field1216--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field1229 != 8; var8++) {
            if (!field1218[var8]) {
                class271 var9 = null;
                if (arg0[var8].field4736.field2194 == 1 && field1216 < 32) {
                    var9 = new class271(arg0[var8], this);
                    field1208.method454(false, var9, (long) arg0[var8].field4736.field2176);
                    field1216++;
                }
                if (var9 == null) {
                    var9 = new class271(arg0[var8], this);
                }
                this.field1220.method1952(var9, 76);
                this.field1229++;
                field1218[var8] = true;
            }
        }
        for (class271 var10 = (class271) this.field1220.method1959(205); var10 != null; var10 = (class271) this.field1220.method1956(90)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field1218[var11] && arg0[var11] == var10.field4440) {
                    var10.method1859(arg3[var10.field4440.field4734], arg2[var10.field4440.field4734], arg4[var10.field4440.field4734], false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()V")
    public static final void method515() {
        field1208 = new class72(8);
        field1216 = 0;
        for (class77 var0 = (class77) field1206.method994(43); var0 != null; var0 = (class77) field1206.method997(1863)) {
            var0.method511();
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1207) {
            return;
        }
        if (this.field1228 != arg0) {
            for (class143 var6 = (class143) this.field1213.method994(83); var6 != null; var6 = (class143) this.field1213.method997(1863)) {
                var6.field2251 = true;
            }
        }
        this.field1198 = this.field1203;
        this.field1228 = arg0;
        this.field1221 = arg1;
        this.field1230 = arg2;
        this.field1235 = arg3;
        this.field1224 = arg4;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
    public static final void method517(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "()I")
    public final int method518() {
        if (this.field1227 == this.field1226 && this.field1233 == this.field1232) {
            return 92;
        }
        int var1 = this.field1227 << 7;
        int var2 = (this.field1226 << 7) + 128;
        int var3 = this.field1232 << 7;
        int var4 = (this.field1233 << 7) + 128;
        int var5 = this.field1230 - var1;
        int var6 = var2 - this.field1230;
        if (var5 > var6) {
            int var7 = this.field1224 - var3;
            int var8 = var4 - this.field1224;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field1224 - var3;
            int var10 = var4 - this.field1224;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lnb;[Lik;Z[I[I[I)V")
    public final void method519(class223[] arg0, class283[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field1207) {
            this.method503(arg0, arg2, arg3, arg4, arg5);
            this.method514(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(III)V")
    public class77(int arg0, int arg1, int arg2) {
        this.field1225 = arg1;
        this.field1234 = arg2;
        this.field1202 = new class269[8192];
        this.field1211 = (long) arg0;
        this.field1222 = true;
        field1206.method998(this, (byte) -61);
    }

    static {
        new class202(131056);
    }
}
