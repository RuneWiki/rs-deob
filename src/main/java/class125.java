import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class125 extends class273 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field2189 = 0;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Z")
    public boolean field2190 = false;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Lel;")
    private class101 field2197 = new class101();

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    private int field2205 = 0;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Lli;")
    public class191 field2209 = new class191();

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    private int field2221 = 0;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "Z")
    private boolean field2224 = false;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "[Lef;")
    public class286[] field2194;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "J")
    private long field2196;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Z")
    private static boolean field2188 = false;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2191 = 0;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2200 = 0;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lml;")
    public static class115 field2199 = new class115(8);

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[Z")
    private static boolean[] field2208 = new boolean[8];

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    private static int field2206 = 0;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "[Z")
    private static boolean[] field2207 = new boolean[8];

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field2210 = 2;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "J")
    private long field2192;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "J")
    public long field2193;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Lel;")
    private static class101 field2195;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "[Lef;")
    public static class286[] field2198;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lgf;)V")
    public static final void method750(class7 arg0) {
        field2204 = 0;
        field2203 = 0;
        field2195 = new class101();
        field2198 = new class286[1024];
        class175.method1152(5, arg0);
        class143.method907(arg0, 0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
    public static final int method751() {
        return field2210;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lvb;Z[I[I[I)V")
    private final void method752(class44[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2208[var6] = false;
        }
        label74: for (class37 var7 = (class37) this.field2209.method1294(false); var7 != null; var7 = (class37) this.field2209.method1292((byte) 119)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field639) {
                        field2208[var11] = true;
                        continue label74;
                    }
                }
            }
            if (!arg1) {
                var7.method349(0);
                this.field2221--;
                if (var7.method1487((byte) 53)) {
                    var7.method1490(-28126);
                    field2206--;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field2221 != 8; var8++) {
                if (!field2208[var8]) {
                    class37 var9 = null;
                    if (arg0[var8].field894.field5096 == 1 && field2206 < 32) {
                        var9 = new class37(arg0[var8], this);
                        field2199.method695((long) arg0[var8].field894.field5098, var9, 765);
                        field2206++;
                    }
                    if (var9 == null) {
                        var9 = new class37(arg0[var8], this);
                    }
                    this.field2209.method1290((byte) -44, var9);
                    this.field2221++;
                }
            }
        }
        for (class37 var10 = (class37) this.field2209.method1294(false); var10 != null; var10 = (class37) this.field2209.method1292((byte) 101)) {
            var10.method244(24003, arg3[var10.field639.field898], arg2[var10.field639.field898], arg4[var10.field639.field898]);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
    public final void method753() {
        this.field2190 = true;
        for (class37 var1 = (class37) this.field2209.method1294(false); var1 != null; var1 = (class37) this.field2209.method1292((byte) 119)) {
            if (var1.field639.field894.field5096 == 1) {
                var1.method1490(-28126);
            }
        }
        this.field2194 = new class286[8192];
        this.field2189 = 0;
        this.field2197 = new class101();
        this.field2205 = 0;
        this.field2209 = new class191();
        this.field2221 = 0;
        this.method1800(-59);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(J)Z")
    private final boolean method754(long arg0) {
        long var3;
        if (this.field2196 > this.field2192) {
            var3 = this.field2196;
        } else {
            var3 = this.field2192;
        }
        int var5 = (int) (this.field2193 - var3);
        if (var5 > 750) {
            this.method753();
            return false;
        }
        if (this.field2192 > 0L) {
            this.field2223 = this.field2218 - (this.field2220 << 6) >> 7;
            this.field2211 = ((this.field2220 << 6) + this.field2218 >> 7) - 1;
            this.field2213 = this.field2215 - (this.field2217 << 6) >> 7;
            this.field2216 = ((this.field2217 << 6) + this.field2215 >> 7) - 1;
            this.field2225 = this.field2214;
            if (this.field2219 < 3) {
                this.field2222 = class192.field3535[this.field2219 + 1][this.field2223][this.field2213] + class192.field3535[this.field2219 + 1][this.field2211][this.field2213] + class192.field3535[this.field2219 + 1][this.field2223][this.field2216] + class192.field3535[this.field2219 + 1][this.field2211][this.field2216] >> 2;
            } else {
                this.field2222 = this.field2225 - 1024;
            }
            int var6 = class196.field3635[this.field2212];
            int var7 = class196.field3630[this.field2212];
            this.method757(var6, var7);
            if (this.field2224) {
                class1 var8 = (class1) this.field2197.method599(0);
                while (true) {
                    if (var8 == null) {
                        this.field2224 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field18.field4681; var9++) {
                        var8.method4((byte) -89, this.field2193, var7, var6, true, 1);
                    }
                    var8 = (class1) this.field2197.method607((byte) 125);
                }
            }
            int var10 = (int) (arg0 - this.field2193);
            for (class1 var11 = (class1) this.field2197.method599(0); var11 != null; var11 = (class1) this.field2197.method607((byte) 122)) {
                var11.method4((byte) -89, arg0, var7, var6, var5 < 10, var10);
            }
        }
        this.field2193 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()V")
    public static void method755() {
        field2195 = null;
        field2198 = null;
        field2199 = null;
        field2207 = null;
        field2208 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
    public final void method756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method758(arg0, arg1, class40.field682 + arg2, class266.field4782 + arg3, class264.field4751 + arg4);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
    private final void method757(int arg0, int arg1) {
        for (class37 var3 = (class37) this.field2209.method1294(false); var3 != null; var3 = (class37) this.field2209.method1292((byte) 118)) {
            var3.field645 = this.field2218 + var3.field651;
            var3.field653 = this.field2214 + var3.field641;
            var3.field640 = this.field2215 + var3.field637;
            if (this.field2212 == 0) {
                var3.field649 = var3.field639.field894.field5114;
                var3.field648 = var3.field639.field894.field5113;
            } else {
                int var4 = var3.field639.field894.field5114;
                int var5 = var3.field639.field894.field5113;
                var3.field649 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field648 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIII)V")
    public final void method758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2190) {
            return;
        }
        if (this.field2212 != arg0) {
            for (class1 var6 = (class1) this.field2197.method599(0); var6 != null; var6 = (class1) this.field2197.method607((byte) 126)) {
                var6.field1 = true;
            }
        }
        this.field2192 = this.field2193;
        this.field2212 = arg0;
        this.field2219 = arg1;
        this.field2218 = arg2;
        this.field2214 = arg3;
        this.field2215 = arg4;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
    public static final void method759() {
        field2199 = new class115(8);
        field2206 = 0;
        for (class125 var0 = (class125) field2195.method599(0); var0 != null; var0 = (class125) field2195.method607((byte) 126)) {
            var0.method753();
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(J)V")
    public static final void method760(long arg0) {
        field2191 = 0;
        field2200 = 0;
        long var2 = class205.method1403(-114);
        for (class125 var4 = (class125) field2195.method599(0); var4 != null; var4 = (class125) field2195.method607((byte) 122)) {
            if (var4.method754(arg0)) {
                field2191++;
            }
        }
        if (field2188 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2195.method606(-28616) + ", running: " + field2191 + ". Particles: " + field2200 + ". Time taken: " + (class205.method1403(-116) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static final void method761(int arg0) {
        field2210 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lkf;Z[I[I[I)V")
    private final void method762(class195[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2207[var6] = false;
        }
        label65: for (class1 var7 = (class1) this.field2197.method599(0); var7 != null; var7 = (class1) this.field2197.method607((byte) 122)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field25) {
                        field2207[var11] = true;
                        var7.field29 = false;
                        continue label65;
                    }
                }
            }
            if (!arg1) {
                if (var7.field32 == 0) {
                    var7.method1800(-27);
                    this.field2205--;
                } else {
                    var7.field29 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field2205 != 8; var8++) {
                if (!field2207[var8]) {
                    class1 var9 = new class1(arg0[var8], this, this.field2193);
                    this.field2197.method602(true, var9);
                    this.field2205++;
                }
            }
        }
        for (class1 var10 = (class1) this.field2197.method599(0); var10 != null; var10 = (class1) this.field2197.method607((byte) 124)) {
            var10.method2(arg4[var10.field25.field3610], -91, arg4[var10.field25.field3624], arg2[var10.field25.field3624], arg2[var10.field25.field3610], arg3[var10.field25.field3627], arg3[var10.field25.field3624], arg2[var10.field25.field3627], arg4[var10.field25.field3627], arg3[var10.field25.field3610]);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lkf;[Lvb;Z[I[I[I)V")
    public final void method763(class195[] arg0, class44[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2190) {
            this.method762(arg0, arg2, arg3, arg4, arg5);
            this.method752(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()V")
    public final void method764() {
        this.field2224 = true;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
    public class125(int arg0, int arg1, int arg2) {
        this.field2220 = arg1;
        this.field2217 = arg2;
        this.field2194 = new class286[8192];
        this.field2196 = (long) arg0;
        this.field2224 = true;
        field2195.method602(true, this);
    }

    static {
        new class190(131056);
    }
}
