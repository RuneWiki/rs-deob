import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class7 {

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public int field57 = 0;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public int field61 = 0;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "Lme;")
    private class668 field59 = new class668(64);

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "Lso;")
    private class98 field65 = null;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "Lpe;")
    private class615 field58;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "Lpe;")
    private class615 field60;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "Lnj;")
    public static class415 field63 = new class415(53, 8);

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "Lra;")
    public static class361 field66 = new class361(36, 1);

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "F")
    public static float field67;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "[B")
    public static byte[] field55;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V", line = 4)
    public static void method23(int arg0) {
        field66 = null;
        field55 = null;
        if (arg0 <= 13) {
            method23(39);
        }
        field63 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lrca;", line = 20)
    public final class30 method24(int arg0, int arg1) {
        field54++;
        class30 var3 = (class30) this.field59.method3655(-113, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field58.method3346(arg1 - 32768, 1, arg0);
        } else {
            var4 = this.field60.method3346(arg1 ^ 0xFFFF8000, 1, arg0 & 0x7FFF);
        }
        class30 var5 = new class30();
        var5.field461 = this;
        if (var4 != null) {
            var5.method244(0, new class418(var4));
        }
        if (arg0 >= 32768) {
            var5.method251((byte) 101);
        }
        if (arg1 == 32767) {
            this.field59.method3650((long) arg0, arg1 ^ 0xFFFF806C, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lmv;J[IB)Ljava/lang/String;", line = 56)
    public final String method25(class297 arg0, long arg1, int[] arg2, byte arg3) {
        if (arg3 < 44) {
            return null;
        }
        field62++;
        if (this.field65 != null) {
            String var6 = this.field65.method738((byte) -63, arg1, arg0, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)V", line = 79)
    public static final void method26(byte arg0, int arg1) {
        if (arg0 <= -76) {
            field64++;
            class367 var2 = class573.method3057(2, arg1, 2);
            var2.method2113(-125);
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(ILpe;Lpe;Lso;)V", line = 117)
    public class7(int arg0, class615 arg1, class615 arg2, class98 arg3) {
        this.field65 = arg3;
        this.field58 = arg1;
        this.field60 = arg2;
        if (this.field58 != null) {
            this.field61 = this.field58.method3341(1, -19046);
        }
        if (this.field60 != null) {
            this.field57 = this.field60.method3341(1, -19046);
        }
    }
}
