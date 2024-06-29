import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public abstract class class409 implements class167 {

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "Llh;")
    public class553 field5359;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "Lbt;")
    public class48 field5362;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "Lbt;")
    private class48 field5360;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "[[I")
    public static int[][] field5357 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field5358 = -1;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "F")
    public static float field5363;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
    private int field5369;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "J")
    private long field5361;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "Lda;")
    private class67 field5366;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
    public void method684(int arg0) {
        if (arg0 == 30573) {
            field5368++;
            class307 var2 = class779.method4323(-1, this.field5360, this.field5359.field7688);
            this.field5366 = class363.field4526.method579(var2, class600.method3419(this.field5362, this.field5359.field7688), true);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)V")
    public final void method821(int arg0, boolean arg1) {
        field5356++;
        int var3 = this.field5359.field7693.method860((byte) -62, class243.field2870, this.field5359.field7694) + this.field5359.field7690;
        int var4 = this.field5359.field7699.method102(this.field5359.field7703, (byte) 93, class412.field5381) + this.field5359.field7700;
        this.method681(var3, arg1, var4, (byte) -96);
        int var5 = -85 % ((53 - arg0) / 52);
        this.method680(var3, arg1, -30315, var4);
        String var6 = class691.field9417.method3640(0);
        if (class349.method2069(true) - this.field5361 > 10000L) {
            var6 = var6 + " (" + class691.field9417.method3651((byte) 107).method256(42) + ")";
        }
        this.field5366.method657(var6, -16777216, -1, this.field5359.field7691, this.field5359.field7703 / 2 + var4 + this.field5359.field7696 + 4, this.field5359.field7694 / 2 + var3);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIIBI)J")
    public static final long method2448(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5364++;
        class532.field7497.clear();
        int var7 = 65 / ((arg5 + 34) / 40);
        class532.field7497.set(arg2, arg3, arg1, arg6, arg0, arg4);
        return class532.field7497.getTime().getTime();
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
    public static void method2449(boolean arg0) {
        if (!arg0) {
            field5358 = 118;
        }
        field5357 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
    public boolean method685(int arg0) {
        field5367++;
        boolean var2 = true;
        if (!this.field5362.method433((byte) -112, this.field5359.field7688)) {
            var2 = false;
        }
        if (!this.field5360.method433((byte) -86, this.field5359.field7688)) {
            var2 = false;
        }
        return arg0 == -18299 ? var2 : true;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I")
    public final int method2450(byte arg0) {
        if (arg0 <= 2) {
            this.method684(71);
        }
        field5365++;
        int var2 = class691.field9417.method3653(0);
        int var3 = var2 * 100;
        if (this.field5369 == var2 && var2 != 0) {
            int var4 = class691.field9417.method3644((byte) 45);
            if (var2 < var4) {
                long var5 = this.field5361 - class691.field9417.method3641(0);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class349.method2069(true) - this.field5361) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + ((long) (var2 * 100)));
                    }
                }
            }
        } else {
            this.field5369 = var2;
            this.field5361 = class349.method2069(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZII)V")
    public abstract void method680(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZIB)V")
    public abstract void method681(int arg0, boolean arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lbt;Lbt;Llh;)V")
    public class409(class48 arg0, class48 arg1, class553 arg2) {
        this.field5359 = arg2;
        this.field5362 = arg0;
        this.field5360 = arg1;
    }
}
