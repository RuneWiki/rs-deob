import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class514 {

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "Lew;")
    private class270 field7528 = new class270(256);

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Lew;")
    private class270 field7531 = new class270(256);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Ldk;")
    private class421 field7522;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Ldk;")
    private class421 field7526;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "[[B")
    public static byte[][] field7532 = new byte[50][];

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "F")
    public static float field7533 = 0.0F;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "[C")
    public static char[] field7523 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 8)
    public static final void method3041(int arg0, Object[] arg1, long[] arg2) {
        if (arg0 != 65523) {
            method3041(-65, null, null);
        }
        class281.method1624((byte) 83, arg2.length - 1, arg1, arg2, 0);
        field7527++;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI[II)Lhe;", line = 19)
    private final class174 method3042(boolean arg0, int arg1, int[] arg2, int arg3) {
        field7524++;
        int var5 = arg1 ^ (arg3 << 4 & 0xFFF4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class174 var9 = (class174) this.field7531.method1592((byte) -25, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var10 = class64.method423(this.field7522, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            if (!arg0) {
                this.method3044(null, -17, 50);
            }
            class174 var11 = var10.method425();
            this.field7531.method1586(var11, var7, 1);
            if (arg2 != null) {
                arg2[0] -= var11.field2641.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[I)Lhe;", line = 55)
    public final class174 method3043(int arg0, int arg1, int[] arg2) {
        field7529++;
        if (this.field7522.method2493((byte) -41) == 1) {
            return this.method3042(true, arg0, arg2, 0);
        } else if (this.field7522.method2509(0, arg0) == 1) {
            return this.method3042(true, 0, arg2, arg0);
        } else if (arg1 == 65524) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([III)Lhe;", line = 88)
    public final class174 method3044(int[] arg0, int arg1, int arg2) {
        field7530++;
        if (this.field7526.method2493((byte) -41) == 1) {
            return this.method3046(0, arg0, arg1, -110);
        } else if (this.field7526.method2509(arg2 ^ arg2, arg1) == 1) {
            return this.method3046(arg1, arg0, 0, arg2 - 98);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 105)
    public static void method3045(byte arg0) {
        field7523 = null;
        field7532 = null;
        if (arg0 >= -87) {
            method3041(-45, null, null);
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ldk;Ldk;)V", line = 183)
    public class514(class421 arg0, class421 arg1) {
        this.field7522 = arg0;
        this.field7526 = arg1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[III)Lhe;", line = 122)
    private final class174 method3046(int arg0, int[] arg1, int arg2, int arg3) {
        field7525++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF3) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class174 var9 = (class174) this.field7531.method1592((byte) -25, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class252 var10 = (class252) this.field7528.method1592((byte) -25, var7);
            if (var10 == null) {
                var10 = class252.method1514(this.field7526, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field7528.method1586(var10, var7, 1);
            }
            class174 var11 = var10.method1507(arg1);
            if (var11 == null) {
                return null;
            }
            if (arg3 >= -46) {
                field7532 = null;
            }
            var10.method2791((byte) 112);
            this.field7531.method1586(var11, var7, 1);
            return var11;
        } else {
            return null;
        }
    }
}
