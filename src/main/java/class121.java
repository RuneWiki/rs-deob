import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class121 {

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field2287 = 0;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    private int field2284 = -1;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lc;")
    private class125 field2285 = new class125();

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
    public boolean field2297 = false;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    private int field2283;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    private int field2291;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[Lfi;")
    private class33[] field2288;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[[[I")
    private int[][][] field2292;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
    public static int[] field2290 = new int[25];

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[Ljb;")
    public static class256[] field2295;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lr;")
    public static final class66 method819(int arg0) {
        field2296++;
        class66 var1 = class145.field2640;
        if (~class81.field1585 != arg0) {
            var1 = class178.field3115;
        }
        return class212.method1372(arg0 ^ 0xFFFFFFFD, new class66[] { class175.field3082, var1, class29.field439, class144.method989(class69.field1401, 0), class154.field2745, class144.method989(class182.field3194, 0), class10.field110 });
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method820(byte arg0) {
        if (arg0 != 103) {
            method820((byte) -94);
        }
        field2290 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIILjh;I)Ljh;")
    public static final class262 method821(int arg0, int arg1, int arg2, int arg3, int arg4, class262 arg5, int arg6) {
        field2294++;
        long var7 = (long) arg0;
        class262 var9 = (class262) class85.field1667.method1617(14366, var7);
        if (var9 == null) {
            class118 var10 = class118.method789(class115.field2173, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method801(64, 768, -50, -10, -50);
            class85.field1667.method1615(var9, 115, var7);
        }
        int var11 = arg5.method1477();
        int var12 = arg5.method1475();
        int var13 = arg5.method1481();
        int var14 = arg5.method1463();
        class262 var15 = var9.method1482(true, true);
        if (arg3 != 0) {
            var15.method1491(arg3);
        }
        if (arg4 != -10) {
            return null;
        }
        class229 var16 = (class229) var15;
        if (arg2 != class45.method327(arg6 + var11, class196.field3401, arg1 + var13, false) || class45.method327(arg6 + var12, class196.field3401, arg1 + var14, false) != arg2) {
            for (int var17 = 0; var17 < var16.field3931; var17++) {
                var16.field3910[var17] += class45.method327(var16.field3930[var17] + arg6, class196.field3401, var16.field3919[var17] + arg1, false) - arg2;
            }
            var16.field3921 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public final void method822(int arg0) {
        field2282++;
        for (int var2 = arg0; var2 < this.field2283; var2++) {
            this.field2292[var2][0] = null;
            this.field2292[var2][1] = null;
            this.field2292[var2][2] = null;
            this.field2292[var2] = null;
        }
        this.field2288 = null;
        this.field2292 = null;
        this.field2285.method864(arg0 ^ 0x69);
        this.field2285 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[[I")
    public final int[][] method823(int arg0, byte arg1) {
        int var3 = 96 % ((-arg1 - 65) / 33);
        field2281++;
        if (this.field2291 == this.field2283) {
            this.field2297 = this.field2288[arg0] == null;
            this.field2288[arg0] = class176.field3094;
            return this.field2292[arg0];
        } else if (this.field2283 == 1) {
            this.field2297 = this.field2284 != arg0;
            this.field2284 = arg0;
            return this.field2292[0];
        } else {
            class33 var4 = this.field2288[arg0];
            if (var4 == null) {
                this.field2297 = true;
                if (this.field2287 >= this.field2283) {
                    class33 var5 = (class33) this.field2285.method869(30568);
                    var4 = new class33(arg0, var5.field499);
                    this.field2288[var5.field493] = null;
                    var5.method560(-17554);
                } else {
                    var4 = new class33(arg0, this.field2287);
                    this.field2287++;
                }
                this.field2288[arg0] = var4;
            } else {
                this.field2297 = false;
            }
            this.field2285.method871((byte) 85, var4);
            return this.field2292[var4.field499];
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method824(byte arg0) {
        field2286++;
        if (this.field2291 != this.field2283) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 < 122) {
            this.method822(51);
        }
        for (int var2 = 0; var2 < this.field2283; var2++) {
            this.field2288[var2] = class176.field3094;
        }
        return this.field2292;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(III)V")
    public class121(int arg0, int arg1, int arg2) {
        this.field2283 = arg0;
        this.field2291 = arg1;
        this.field2288 = new class33[this.field2291];
        this.field2292 = new int[this.field2283][3][arg2];
    }
}
