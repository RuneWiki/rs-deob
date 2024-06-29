import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class501 {

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Lnj;")
    private class436 field6763 = new class436(256);

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "Lnj;")
    private class436 field6770 = new class436(256);

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "Lpq;")
    private class159 field6769;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "Lpq;")
    private class159 field6760;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Lcb;")
    public static class318 field6764 = new class318(15, -2);

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "Ljj;")
    public static class398 field6768 = new class398(82, 16);

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static final void method2821(byte arg0) {
        class654.field9256 = 0;
        field6762++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class186.field2281[var1] = null;
            class536.field7370[var1] = 1;
            class142.field1807[var1] = null;
        }
        int var2 = -30 / ((20 - arg0) / 51);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([IIBI)Lmda;")
    private final class53 method2822(int[] arg0, int arg1, byte arg2, int arg3) {
        field6767++;
        int var5 = arg3 ^ ((arg1 & 0x40000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        if (arg2 >= -9) {
            return null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class53 var9 = (class53) this.field6770.method2506(42, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class513 var10 = (class513) this.field6763.method2506(12, var7);
            if (var10 == null) {
                var10 = class513.method2906(this.field6760, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field6763.method2504(var7, 120, var10);
            }
            class53 var11 = var10.method2905(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method175(30604);
                this.field6770.method2504(var7, -113, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[I)Lmda;")
    public final class53 method2823(int arg0, int arg1, int[] arg2) {
        if (arg1 >= -61) {
            this.method2822(null, 4, (byte) 84, -21);
        }
        field6761++;
        if (this.field6760.method1074((byte) 92) == 1) {
            return this.method2822(arg2, 0, (byte) -19, arg0);
        } else if (this.field6760.method1076(arg0, 0) == 1) {
            return this.method2822(arg2, arg0, (byte) -78, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II[I)Lmda;")
    public final class53 method2824(int arg0, int arg1, int[] arg2) {
        field6766++;
        if (arg1 > -75) {
            return null;
        } else if (this.field6769.method1074((byte) 91) == 1) {
            return this.method2826(0, arg2, true, arg0);
        } else if (this.field6769.method1076(arg0, 0) == 1) {
            return this.method2826(arg0, arg2, true, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V")
    public static void method2825(byte arg0) {
        if (arg0 == 107) {
            field6768 = null;
            field6764 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I[IZI)Lmda;")
    private final class53 method2826(int arg0, int[] arg1, boolean arg2, int arg3) {
        field6765++;
        int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & 0xB0000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class53 var9 = (class53) this.field6770.method2506(16, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class586 var10 = class586.method3280(this.field6769, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            if (!arg2) {
                method2825((byte) 122);
            }
            class53 var11 = var10.method3279();
            this.field6770.method2504(var7, -65, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field696.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lpq;Lpq;)V")
    public class501(class159 arg0, class159 arg1) {
        this.field6769 = arg0;
        this.field6760 = arg1;
    }
}
