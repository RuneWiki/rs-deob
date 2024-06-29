import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class793 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Lee;")
    private class706 field10890 = new class706(256);

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Lee;")
    private class706 field10897 = new class706(256);

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Laj;")
    private class333 field10893;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "Laj;")
    private class333 field10889;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
    public static int[] field10891 = new int[120];

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Ljw;")
    public static class581 field10899;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "[I")
    public static int[] field10900;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field10892;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field10894;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field10895;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field10896;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field10898;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field10891[var1] = var0 / 4;
        }
        field10899 = new class581(117, 5);
        field10900 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III[I)Lks;", line = 9)
    private final class465 method4364(int arg0, int arg1, int arg2, int[] arg3) {
        field10896++;
        int var5 = arg1 ^ (arg0 << 4 & 0xFFF9 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class465 var9 = (class465) this.field10897.method3953(var7, 14);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class61 var10 = (class61) this.field10890.method3953(var7, arg2 + 4399);
            if (var10 == null) {
                var10 = class61.method424(this.field10889, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field10890.method3962(var7, var10, -123);
            }
            class465 var11 = var10.method426(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method792((byte) -112);
                this.field10897.method3962(var7, var11, arg2 ^ 0x1155);
                return arg2 == -4385 ? var11 : null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BZI)V", line = 51)
    public static final void method4365(byte arg0, boolean arg1, int arg2) {
        field10898++;
        if (arg0 != -41) {
            method4366(44);
        }
        class554.method3128(-3, class474.field6551.method2780(94, class38.field589), arg1, arg2);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 65)
    public static void method4366(int arg0) {
        field10899 = null;
        field10900 = null;
        if (arg0 != -50174896) {
            field10899 = null;
        }
        field10891 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([IIB)Lks;", line = 78)
    public final class465 method4367(int[] arg0, int arg1, byte arg2) {
        field10894++;
        if (this.field10889.method2094((byte) -115) == 1) {
            return this.method4364(0, arg1, arg2 - 4432, arg0);
        } else if (arg2 != 47) {
            return null;
        } else if (this.field10889.method2090(arg1, false) == 1) {
            return this.method4364(arg1, 0, -4385, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBI[I)Lks;", line = 102)
    private final class465 method4368(int arg0, byte arg1, int arg2, int[] arg3) {
        field10892++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF3) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class465 var9 = (class465) this.field10897.method3953(var7, 14);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class14 var10 = class14.method102(this.field10893, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class465 var11 = var10.method105();
            if (arg1 > -107) {
                return null;
            }
            this.field10897.method3962(var7, var11, -123);
            if (arg3 != null) {
                arg3[0] -= var11.field6457.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[II)Lks;", line = 141)
    public final class465 method4369(byte arg0, int[] arg1, int arg2) {
        field10895++;
        if (this.field10893.method2094((byte) -115) == 1) {
            return this.method4368(0, (byte) -123, arg2, arg1);
        } else if (this.field10893.method2090(arg2, false) == 1) {
            return this.method4368(arg2, (byte) -113, 0, arg1);
        } else {
            if (arg0 >= -89) {
                field10899 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Laj;Laj;)V", line = 201)
    public class793(class333 arg0, class333 arg1) {
        this.field10893 = arg0;
        this.field10889 = arg1;
    }
}
