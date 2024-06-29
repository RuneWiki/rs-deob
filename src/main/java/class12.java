import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class12 {

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "Lqr;")
    private class65 field189 = new class65(256);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lrda;")
    private class663 field182;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Ld;")
    private class152 field183;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field190 = -1;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Lms;")
    public static class763 field187 = new class763("stellardawn", 1);

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[Z")
    public static boolean[] field192 = new boolean[100];

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Z")
    public static boolean field194 = false;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 9)
    public final void method103(byte arg0) {
        this.field189.method561((byte) -78);
        field191++;
        if (arg0 > -121) {
            method104((byte) -90);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V", line = 21)
    public static void method104(byte arg0) {
        field192 = null;
        if (arg0 != -41) {
            method106(-63);
        }
        field187 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lsia;", line = 38)
    public final class737 method105(int arg0, int arg1) {
        field185++;
        Object var3 = this.field189.method552(4, (long) arg1);
        if (var3 != null) {
            return (class737) var3;
        } else if (!this.field183.method85(arg1, -32345)) {
            return null;
        } else if (arg0 < 57) {
            return null;
        } else {
            class758 var4 = this.field183.method91(arg1, (byte) 124);
            int var5 = var4.field10548 ? 64 : this.field182.field8939;
            class737 var7;
            if (var4.field10538 && this.field182.method459()) {
                float[] var6 = this.field183.method87(var5, false, var5, arg1, 0.7F, -2202);
                var7 = new class737(this.field182, 3553, 34842, var5, var5, var4.field10535 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field10541 != 2 && class620.method3416(var4.field10536, (byte) -14)) {
                    var8 = this.field183.method86(-118, var5, 0.7F, true, arg1, var5);
                } else {
                    var8 = this.field183.method92(false, (byte) -77, var5, var5, 0.7F, arg1);
                }
                var7 = new class737(this.field182, 3553, 6408, var5, var5, var4.field10535 != 0, var8, 0, 0, false);
            }
            var7.method4116((byte) -60, var4.field10551, var4.field10544);
            this.field189.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)[Lqj;", line = 85)
    public static final class512[] method106(int arg0) {
        field186++;
        if (arg0 != -12865) {
            method106(68);
        }
        return new class512[] { class556.field7330, class731.field10137, class381.field5298 };
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 98)
    public final void method107(int arg0) {
        if (arg0 >= -127) {
            method104((byte) -36);
        }
        field188++;
        this.field189.method553(5, -15782);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lrda;Ld;)V", line = 126)
    public class12(class663 arg0, class152 arg1) {
        this.field182 = arg0;
        this.field183 = arg1;
    }
}
