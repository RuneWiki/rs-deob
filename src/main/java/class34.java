import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class34 {

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "Ljt;")
    private class106 field355 = new class106(128);

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lvd;")
    private class39 field353;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field352 = 2;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field354 = -1;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Led;")
    public final class707 method173(int arg0, int arg1) {
        field351++;
        class106 var3 = this.field355;
        class707 var4;
        synchronized (this.field355) {
            var4 = (class707) this.field355.method803(107, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field353;
        byte[] var6;
        synchronized (this.field353) {
            var6 = this.field353.method211(true, 1, arg0);
        }
        class707 var7 = new class707();
        if (var6 != null) {
            var7.method4022(-1, new class645(var6));
        }
        class106 var8 = this.field355;
        synchronized (this.field355) {
            int var9 = 20 % ((88 - arg1) / 35);
            this.field355.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
    public final void method174(int arg0) {
        class106 var2 = this.field355;
        synchronized (this.field355) {
            this.field355.method809(true);
            int var3 = 100 % ((-arg0 - 25) / 44);
        }
        field360++;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
    public final void method175(int arg0, int arg1) {
        class106 var3 = this.field355;
        synchronized (this.field355) {
            this.field355.method807(arg0, -1);
        }
        if (arg1 != -17213) {
            this.method173(82, 49);
        }
        field357++;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "([BI)Lru;")
    public static final class193 method176(byte[] arg0, int arg1) {
        field359++;
        class193 var2 = new class193();
        class645 var3 = new class645(arg0);
        var3.field9084 = var3.field9068.length - 2;
        int var4 = var3.method3712((byte) -124);
        if (arg1 != 1) {
            method176(null, 13);
        }
        int var5 = var3.field9068.length - var4 - 12 - 2;
        var3.field9084 = var5;
        int var6 = var3.method3720(-19541);
        var2.field2919 = var3.method3712((byte) -121);
        var2.field2926 = var3.method3712((byte) -8);
        var2.field2922 = var3.method3712((byte) 80);
        var2.field2927 = var3.method3712((byte) 61);
        int var7 = var3.method3745(-6314);
        if (var7 > 0) {
            var2.field2921 = new class372[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method3712((byte) -111);
                class372 var10 = new class372(class432.method2684(var9, arg1 ^ 0xFFFFAAF3));
                var2.field2921[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method3720(-19541);
                    int var12 = var3.method3720(arg1 - 19542);
                    var10.method2278((byte) -54, (long) var11, new class317(var12));
                }
            }
        }
        var3.field9084 = 0;
        var2.field2928 = var3.method3719((byte) 72);
        var2.field2920 = new int[var6];
        var2.field2918 = new String[var6];
        var2.field2924 = new int[var6];
        int var13 = 0;
        while (var3.field9084 < var5) {
            int var14 = var3.method3712((byte) 119);
            if (var14 == 3) {
                var2.field2918[var13] = var3.method3752(-2).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field2924[var13] = var3.method3745(-6314);
            } else {
                var2.field2924[var13] = var3.method3720(-19541);
            }
            var2.field2920[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V")
    public final void method177(int arg0) {
        field358++;
        class106 var2 = this.field355;
        synchronized (this.field355) {
            this.field355.method800(98);
            if (arg0 != -1) {
                this.field353 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class34(class464 arg0, int arg1, class39 arg2) {
        this.field353 = arg2;
        this.field353.method229(1, 0);
    }
}
