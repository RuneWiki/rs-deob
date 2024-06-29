import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class649 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lbc;")
    private class9 field9042 = new class9(256);

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lbc;")
    private class9 field9045 = new class9(256);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lpe;")
    private class615 field9036;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lpe;")
    private class615 field9039;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[[I")
    public static int[][] field9041 = new int[128][128];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public static int[] field9037 = new int[1000];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lnj;")
    public static class415 field9040 = new class415(81, 1);

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lcaa;")
    public static class541 field9035;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI[I)Lbp;", line = 5)
    public final class430 method3569(byte arg0, int arg1, int[] arg2) {
        field9038++;
        if (this.field9039.method3366(-71) == 1) {
            return this.method3571(-630920144, arg2, 0, arg1);
        } else if (this.field9039.method3341(arg1, -19046) == 1) {
            return this.method3571(-630920144, arg2, arg1, 0);
        } else if (arg0 <= 72) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[II)Lbp;", line = 28)
    public final class430 method3570(int arg0, int[] arg1, int arg2) {
        field9046++;
        if (arg2 != 2141299044) {
            this.method3572(-18, null, -52, 1);
        }
        if (this.field9036.method3366(-67) == 1) {
            return this.method3572(0, arg1, arg0, 0);
        } else if (this.field9036.method3341(arg0, -19046) == 1) {
            return this.method3572(0, arg1, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[III)Lbp;", line = 52)
    private final class430 method3571(int arg0, int[] arg1, int arg2, int arg3) {
        field9043++;
        int var5 = arg3 ^ ((arg2 & 0x80000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        if (arg0 != -630920144) {
            this.method3570(-91, null, -101);
        }
        long var7 = (long) var6;
        class430 var9 = (class430) this.field9045.method39(var7, arg0 ^ 0xDA649036);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class664 var10 = class664.method3633(this.field9039, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class430 var11 = var10.method3635();
            this.field9045.method38(var11, arg0 + 630920239, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field5570.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I[III)Lbp;", line = 96)
    private final class430 method3572(int arg0, int[] arg1, int arg2, int arg3) {
        field9044++;
        int var5 = arg2 ^ ((arg3 & 0x50000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class430 var9 = (class430) this.field9045.method39(var7, 31750);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class73 var10 = (class73) this.field9042.method39(var7, 31750);
            if (var10 == null) {
                var10 = class73.method582(this.field9036, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field9042.method38(var10, -124, var7);
            }
            class430 var11 = var10.method581(arg1);
            if (var11 == null) {
                return null;
            } else if (arg0 == 0) {
                var10.method2438((byte) 13);
                this.field9045.method38(var11, 72, var7);
                return var11;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 149)
    public static void method3573(byte arg0) {
        field9037 = null;
        field9040 = null;
        field9041 = null;
        field9035 = null;
        if (arg0 >= -67) {
            method3573((byte) 103);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lpe;Lpe;)V", line = 176)
    public class649(class615 arg0, class615 arg1) {
        this.field9036 = arg1;
        this.field9039 = arg0;
    }
}
