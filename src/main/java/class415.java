import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class415 {

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lrp;")
    private class288 field6009 = new class288(64);

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Llt;")
    private class458 field6007;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Llt;")
    private class458 field6005;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lbg;")
    public static class310 field6003 = new class310(16, 3);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field6011 = 0;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Loe;")
    public static class127 field6010 = new class127(55, 2);

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field6013 = 765;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[[I")
    public static int[][] field6012 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2442(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field6008++;
        long var6 = (long) (arg4 | (arg5 ? Integer.MIN_VALUE : 0));
        class146 var8 = (class146) class206.field3237.method2409(false, var6);
        if (var8 == null) {
            var8 = new class146();
            class206.field3237.method2413(var6, arg0 - 7, var8);
        }
        if (arg0 != 6) {
            method2445(75);
        }
        if (arg2 >= var8.field2367.length) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var11 < var8.field2367.length; var11++) {
                var9[var11] = var8.field2367[var11];
                var10[var11] = var8.field2359[var11];
            }
            for (int var12 = var8.field2367.length; var12 < arg2; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field2359 = var10;
            var8.field2367 = var9;
        }
        var8.field2367[arg2] = arg3;
        var8.field2359[arg2] = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2443(String arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        }
        field6006++;
        String var2 = class38.method213(arg1 - 6, class212.method1305(false, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Lbk;")
    public final class243 method2444(int arg0, byte arg1) {
        field6004++;
        class243 var3 = (class243) this.field6009.method1752(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field6007.method2715(arg0 & 0x7FFF, 0, false);
        } else {
            var4 = this.field6005.method2715(arg0, 0, false);
        }
        class243 var5 = new class243();
        if (var4 != null) {
            var5.method1454(new class40(var4), (byte) 108);
        }
        if (arg0 >= 32768) {
            var5.method1459(-121);
        }
        int var6 = -40 % ((-arg1 - 56) / 53);
        this.field6009.method1758(1, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method2445(int arg0) {
        field6012 = null;
        if (arg0 == 2) {
            field6010 = null;
            field6003 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(ILlt;Llt;)V")
    public class415(int arg0, class458 arg1, class458 arg2) {
        this.field6007 = arg2;
        this.field6005 = arg1;
        if (this.field6005 != null) {
            this.field6005.method2726((byte) 113, 0);
        }
        if (this.field6007 != null) {
            this.field6007.method2726((byte) 113, 0);
        }
    }
}
