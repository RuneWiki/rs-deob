import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class383 {

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field5640 = 0;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public int field5636 = 0;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lfa;")
    private class156 field5641 = new class156(64);

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Llo;")
    private class528 field5642 = null;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lfs;")
    private class387 field5638;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lfs;")
    private class387 field5639;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lal;")
    public static class66 field5635;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lho;B[IJ)Ljava/lang/String;", line = 5)
    public final String method2332(class102 arg0, byte arg1, int[] arg2, long arg3) {
        field5637++;
        if (arg1 > -95) {
            method2334(false, -17, -21);
        }
        if (this.field5642 != null) {
            String var6 = this.field5642.method2097(arg3, (byte) 85, arg2, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 27)
    public static void method2333(int arg0) {
        field5635 = null;
        if (arg0 != -7675) {
            field5635 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII)B", line = 39)
    public static final byte method2334(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2333(-19);
        }
        field5634++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(ILfs;Lfs;Llo;)V", line = 115)
    public class383(int arg0, class387 arg1, class387 arg2, class528 arg3) {
        this.field5642 = arg3;
        this.field5638 = arg1;
        this.field5639 = arg2;
        if (this.field5638 != null) {
            this.field5636 = this.field5638.method2367(1, 28724);
        }
        if (this.field5639 != null) {
            this.field5640 = this.field5639.method2367(1, 28724);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)Lau;", line = 78)
    public final class516 method2335(int arg0, byte arg1) {
        field5633++;
        class516 var3 = (class516) this.field5641.method1115((long) arg0, (byte) 58);
        if (var3 != null) {
            return var3;
        }
        if (arg1 != -99) {
            method2333(51);
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field5639.method2363(arg0 & 0x7FFF, 1, arg1 + 192);
        } else {
            var4 = this.field5638.method2363(arg0, 1, 115);
        }
        class516 var5 = new class516();
        var5.field7601 = this;
        if (var4 != null) {
            var5.method3067(new class65(var4), 9536);
        }
        if (arg0 >= 32768) {
            var5.method3063(75);
        }
        this.field5641.method1107(arg1 ^ 0xFFFFFF9C, (long) arg0, var5);
        return var5;
    }
}
