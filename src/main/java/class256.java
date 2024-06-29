import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class256 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lpk;")
    private class100 field4137 = new class100(256);

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lpk;")
    private class100 field4144 = new class100(256);

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Ldl;")
    private class123 field4143;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Ldl;")
    private class123 field4140;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
    public static final void method1758(int arg0, int arg1) {
        if (arg0 == 0) {
            field4145++;
            class229.field3706.method1425(arg1, -126);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[II)Lu;")
    public final class119 method1759(int arg0, int[] arg1, int arg2) {
        field4139++;
        if (this.field4140.method812(99) == 1) {
            return this.method1761(0, -53201492, arg0, arg1);
        } else if (arg2 == this.field4140.method820(arg0, 112)) {
            return this.method1761(arg0, arg2 - 53201493, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[III)Lu;")
    private final class119 method1760(int arg0, int[] arg1, int arg2, int arg3) {
        field4138++;
        int var5 = ((arg2 & 0x10000FFF) << 4 | arg2 >>> 12) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        int var9 = -105 / ((77 - arg0) / 39);
        class119 var10 = (class119) this.field4144.method665((byte) 106, var7);
        if (var10 != null) {
            return var10;
        } else if (arg1 == null || arg1[0] > 0) {
            class259 var11 = (class259) this.field4137.method665((byte) -122, var7);
            if (var11 == null) {
                var11 = class259.method1783(this.field4143, arg2, arg3);
                if (var11 == null) {
                    return null;
                }
                this.field4137.method662(0, var11, var7);
            }
            class119 var12 = var11.method1776(arg1);
            if (var12 == null) {
                return null;
            } else {
                var11.method784(false);
                this.field4144.method662(0, var12, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[I)Lu;")
    private final class119 method1761(int arg0, int arg1, int arg2, int[] arg3) {
        field4142++;
        int var5 = arg2 ^ (arg0 << 4 & 0xFFF1 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        if (arg1 != -53201492) {
            return null;
        }
        class119 var9 = (class119) this.field4144.method665((byte) 107, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class14 var10 = class14.method100(this.field4140, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class119 var11 = var10.method99();
            this.field4144.method662(0, var11, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field1745.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ldl;Ldl;)V")
    public class256(class123 arg0, class123 arg1) {
        this.field4143 = arg1;
        this.field4140 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
    public static final void method1762(int arg0, int arg1, int arg2) {
        if (arg0 >= 15) {
            field4146++;
            class287 var3 = class261.method1786(arg2, false, 1);
            var3.method1914((byte) 46);
            var3.field4547 = arg1;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[II)Lu;")
    public final class119 method1763(byte arg0, int[] arg1, int arg2) {
        field4141++;
        if (this.field4143.method812(9) == 1) {
            return this.method1760(-55, arg1, 0, arg2);
        }
        int var4 = -91 % ((-arg0 - 28) / 59);
        if (this.field4143.method820(arg2, 112) != 1) {
            throw new RuntimeException();
        }
        return this.method1760(120, arg1, arg2, 0);
    }
}
