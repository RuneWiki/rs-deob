import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class424 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lpca;")
    private class714 field5968 = new class714(256);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Leea;")
    private class131 field5976;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Ld;")
    private class149 field5971;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field5967 = -1;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field5972 = -1;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    public static int[] field5977 = new int[14];

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field5974 = 1405;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "F")
    public static float field5965;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5973;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public final void method2591(int arg0) {
        field5969++;
        this.field5968.method4016(arg0, (byte) -73);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public final void method2592(boolean arg0) {
        if (!arg0) {
            field5973 = null;
        }
        this.field5968.method4023((byte) -126);
        field5970++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lmfa;")
    public final class615 method2593(int arg0, int arg1) {
        field5975++;
        Object var3 = this.field5968.method4022((long) arg0, (byte) -94);
        if (var3 != null) {
            return (class615) var3;
        } else if (this.field5971.method531(arg0, -105)) {
            class502 var4 = this.field5971.method532((byte) 127, arg0);
            int var5 = var4.field7208 ? 64 : this.field5976.field1781;
            class615 var7;
            if (var4.field7190 && this.field5976.method491()) {
                float[] var6 = this.field5971.method535(var5, -23173, var5, arg0, 0.7F, false);
                var7 = new class615(this.field5976, 3553, 34842, var5, var5, var4.field7200 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field7203 != 2 && class565.method3258((byte) -51, var4.field7204)) {
                    var8 = this.field5971.method534(true, var5, 20377, var5, 0.7F, arg0);
                } else {
                    var8 = this.field5971.method530(var5, -96, false, 0.7F, var5, arg0);
                }
                var7 = new class615(this.field5976, 3553, 6408, var5, var5, var4.field7200 != 0, var8, 0, 0, false);
            }
            var7.method3445(var4.field7197, var4.field7198, 105);
            if (arg1 > -101) {
                field5973 = null;
            }
            this.field5968.method4018((byte) 125, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method2594(int arg0) {
        field5973 = null;
        if (arg0 != -21052) {
            method2595(false, 103, 113, 20);
        }
        field5977 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIII)I")
    public static final int method2595(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -2) {
            return -85;
        }
        field5966++;
        class95 var4 = class71.method589(arg0, -9854, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && var4.field1113.length > arg3) {
            return var4.field1113[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Leea;Ld;)V")
    public class424(class131 arg0, class149 arg1) {
        this.field5976 = arg0;
        this.field5971 = arg1;
    }
}
