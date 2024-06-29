import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Leb;")
    public static class230 field70 = class68.method589(0, "(U3");

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lka;")
    public static class245 field66 = null;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lgd;")
    public static class73 field71;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public static final void method52(int arg0, int arg1) {
        field69++;
        class197 var2 = class164.method1228(10, arg1, -1665874464);
        var2.method1407(-128);
        if (arg0 != 0) {
            method54((byte[]) null, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLfk;)Lkj;")
    public static final class142 method53(byte arg0, class14 arg1) {
        if (arg0 != -96) {
            method55(false);
        }
        field72++;
        return new class142(arg1.method178(-1), arg1.method178(arg0 ^ 0x5F), arg1.method178(-1), arg1.method178(-1), arg1.method178(-1), arg1.method178(arg0 ^ 0x5F), arg1.method178(-1), arg1.method178(-1), arg1.method190(-25267), arg1.method200(255));
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BB)[B")
    public static final byte[] method54(byte[] arg0, byte arg1) {
        field68++;
        class14 var2 = new class14(arg0);
        int var3 = var2.method200(255);
        int var4 = var2.method187((byte) 61);
        if (arg1 > -121) {
            method55(true);
        }
        if (var4 < 0 || !(class116.field2091 == 0 || var4 <= class116.field2091)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method157(var5, 2, 0, var4);
            return var5;
        } else {
            int var6 = var2.method187((byte) 61);
            if (var6 < 0 || !(class116.field2091 == 0 || var6 <= class116.field2091)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class2.method15(var7, var6, arg0, var4, 9);
            } else {
                class135.field2432.method940(var2, 2678, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method55(boolean arg0) {
        field70 = null;
        if (arg0) {
            field70 = null;
        }
        field66 = null;
        field71 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZIJI)Leb;")
    public static final class230 method56(boolean arg0, int arg1, long arg2, int arg3) {
        field65++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var5 = 1;
        if (arg3 < 80) {
            method56(false, 40, -128L, -18);
        }
        long var6 = arg2 / (long) arg1;
        while (var6 != 0L) {
            var6 /= (long) arg1;
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg2 % (long) arg1);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg2 /= (long) arg1;
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class230 var11 = new class230();
        var11.field3990 = var8;
        var11.field3988 = var9;
        return var11;
    }
}
