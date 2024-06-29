import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class527 {

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Lmn;")
    private class249 field7656 = new class249(256);

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "Lmn;")
    private class249 field7663 = new class249(256);

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Lph;")
    private class459 field7655;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Lph;")
    private class459 field7661;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "[I")
    public static int[] field7657 = new int[13];

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "Lbj;")
    public static class162 field7654 = new class162(36, 7);

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[II)Lwq;", line = 7)
    public final class116 method3115(int arg0, int[] arg1, int arg2) {
        field7662++;
        int var4 = -120 / ((arg0 - 35) / 44);
        if (this.field7655.method2759(16460) == 1) {
            return this.method3117(-636479408, 0, arg1, arg2);
        } else if (this.field7655.method2763(arg2, -3) == 1) {
            return this.method3117(-636479408, arg2, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z[II)Lwq;", line = 32)
    public final class116 method3116(boolean arg0, int[] arg1, int arg2) {
        if (arg0) {
            this.method3119(-118, -124, null, -21);
        }
        field7658++;
        if (this.field7661.method2759(16460) == 1) {
            return this.method3119(0, arg2, arg1, 1322343716);
        } else if (this.field7661.method2763(arg2, -3) == 1) {
            return this.method3119(arg2, 0, arg1, 1322343716);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[II)Lwq;", line = 55)
    private final class116 method3117(int arg0, int arg1, int[] arg2, int arg3) {
        field7660++;
        int var5 = ((arg1 & 0xE0000FFF) << 4 | arg1 >>> 12) ^ arg3;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class116 var9 = (class116) this.field7663.method1622(var7, 39);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class465 var10 = (class465) this.field7656.method1622(var7, -109);
            if (var10 == null) {
                var10 = class465.method2792(this.field7655, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field7656.method1618(var10, var7, -1);
            }
            class116 var11 = var10.method2783(arg2);
            if (var11 == null) {
                return null;
            }
            var10.method1676(true);
            this.field7663.method1618(var11, var7, -1);
            if (arg0 != -636479408) {
                field7657 = null;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 103)
    public static void method3118(byte arg0) {
        field7654 = null;
        if (arg0 != -28) {
            field7654 = null;
        }
        field7657 = null;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II[II)Lwq;", line = 115)
    private final class116 method3119(int arg0, int arg1, int[] arg2, int arg3) {
        field7659++;
        int var5 = (arg0 >>> 12 | (arg0 & 0x10000FFF) << 4) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class116 var9 = (class116) this.field7663.method1622(var7, 69);
        if (var9 != null) {
            return var9;
        } else if (arg2 != null && arg2[0] <= 0) {
            return null;
        } else if (arg3 == 1322343716) {
            class367 var10 = class367.method2250(this.field7661, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class116 var11 = var10.method2251();
            this.field7663.method1618(var11, var7, arg3 - 1322343717);
            if (arg2 != null) {
                arg2[0] -= var11.field2068.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lph;Lph;)V", line = 171)
    public class527(class459 arg0, class459 arg1) {
        this.field7655 = arg1;
        this.field7661 = arg0;
    }
}
