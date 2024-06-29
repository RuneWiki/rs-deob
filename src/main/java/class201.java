import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class201 implements class758 {

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Loh;")
    private class404 field2376;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Loh;")
    public class404 field2379;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Llaa;")
    public class120 field2375;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "[S")
    public static short[] field2374 = new short[] { 17, 8, 3, 60, 21, 57, 47, 58 };

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "J")
    private long field2380;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Lda;")
    private class59 field2384;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)I")
    public final int method1212(int arg0) {
        field2382++;
        int var2 = class188.field2237.method4045(68);
        int var3 = arg0 * var2;
        if (this.field2378 == var2 && var2 != 0) {
            int var4 = class188.field2237.method4041(100);
            if (var2 < var4) {
                long var5 = this.field2380 - class188.field2237.method4049((byte) -126);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class652.method3700(-1) - this.field2380) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field2378 = var2;
            this.field2380 = class652.method3700(-1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)Z")
    public static final boolean method1213(byte arg0) {
        if (arg0 <= 41) {
            method1214(-36);
        }
        field2373++;
        if (class226.field2583) {
            try {
                class393.method2415("showVideoAd", 54, class255.field3123);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V")
    public static void method1214(int arg0) {
        if (arg0 >= -11) {
            field2372 = -91;
        }
        field2374 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIII)V")
    public abstract void method869(boolean arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZIIZ)V")
    public abstract void method867(boolean arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
    public final void method12(boolean arg0, int arg1) {
        field2383++;
        int var3 = this.field2375.field1253.method2395(class12.field92, (byte) -48, this.field2375.field1249) + this.field2375.field1244;
        int var4 = this.field2375.field1245.method1280(true, class181.field2143, this.field2375.field1250) + this.field2375.field1247;
        this.method869(arg0, var4, var3, -128);
        this.method867(arg0, var3, var4, true);
        String var5 = class188.field2237.method4052(99);
        if (class652.method3700(-1) - this.field2380 > 10000L) {
            var5 = var5 + " (" + class188.field2237.method4054((byte) 104).method3390(-122) + ")";
        }
        this.field2384.method450(-1, this.field2375.field1252, 0, var5, this.field2375.field1249 / 2 + var3, this.field2375.field1250 / 2 + this.field2375.field1255 + 4 + var4);
        int var6 = 88 / ((-arg1 - 56) / 42);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public void method11(int arg0) {
        if (arg0 != 23169) {
            this.method12(true, -27);
        }
        field2381++;
        class535 var2 = class618.method3528(this.field2376, (byte) 101, this.field2375.field1258);
        this.field2384 = class275.field3370.method373(var2, class155.method959(this.field2379, this.field2375.field1258), true);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
    public boolean method9(byte arg0) {
        field2377++;
        boolean var2 = true;
        if (!this.field2379.method2463((byte) 126, this.field2375.field1258)) {
            var2 = false;
        }
        if (!this.field2376.method2463((byte) 101, this.field2375.field1258)) {
            var2 = false;
        }
        return arg0 == 119 ? var2 : false;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Loh;Loh;Llaa;)V")
    public class201(class404 arg0, class404 arg1, class120 arg2) {
        this.field2376 = arg1;
        this.field2379 = arg0;
        this.field2375 = arg2;
    }
}
