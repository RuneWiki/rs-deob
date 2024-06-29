import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class6 {

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Lqc;")
    private class325 field58 = new class325(256);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Ln;")
    private class472 field50;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Los;")
    private class468 field55;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)I")
    public static final int method24(int arg0, byte arg1, int arg2) {
        field56++;
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var6 = -54 % ((arg1 + 49) / 53);
        return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method25(int arg0) {
        field54++;
        this.field58.method2028(5, true);
        if (arg0 != -1) {
            method24(73, (byte) 81, 17);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZI)Z")
    public static final boolean method26(int arg0, boolean arg1, int arg2) {
        field53++;
        if (arg1) {
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
    public final void method27(boolean arg0) {
        field52++;
        if (arg0) {
            this.field55 = null;
        }
        this.field58.method2037(!arg0);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public static final void method28(int arg0) {
        if (arg0 != -1308369256) {
            field57 = 5;
        }
        field59++;
        class228.field3353.method2037(true);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lot;")
    public final class210 method29(int arg0, int arg1) {
        field51++;
        if (arg0 != 16711680) {
            field57 = 24;
        }
        Object var3 = this.field58.method2025((long) arg1, 2);
        if (var3 != null) {
            return (class210) var3;
        } else if (this.field50.method1758((byte) 54, arg1)) {
            class83 var4 = this.field50.method1762(arg1, (byte) 45);
            int var5 = var4.field964 ? 64 : this.field55.field6951;
            class210 var7;
            if (var4.field979 && this.field55.method345()) {
                float[] var6 = this.field50.method1766(var5, var5, arg1, 0.7F, -15678, false);
                var7 = new class210(this.field55, 3553, 34842, var5, var5, var4.field959 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field961) {
                    var8 = this.field50.method1764(0.7F, var5, arg1, var5, false, 123);
                } else {
                    var8 = this.field50.method1759(var5, var5, 0.7F, (byte) 97, arg1, true);
                }
                var7 = new class210(this.field55, 3553, 6408, var5, var5, var4.field959 != 0, var8, false);
            }
            var7.method1359(10497, var4.field976, var4.field967);
            this.field58.method2029(false, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Los;Ln;)V")
    public class6(class468 arg0, class472 arg1) {
        this.field50 = arg1;
        this.field55 = arg0;
    }
}
