import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class586 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "[I")
    private int[] field8209;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lkr;")
    public static class693 field8208 = null;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field8213 = 0;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "F")
    public static float field8210;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Luq;")
    public static class146 field8211;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[Lf;")
    public static class702[] field8207;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 7)
    public static void method3319(int arg0) {
        if (arg0 != 1) {
            method3320(-43);
        }
        field8207 = null;
        field8211 = null;
        field8208 = null;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Lsu;", line = 24)
    public static final class191 method3320(int arg0) {
        field8212++;
        if (arg0 != 1391) {
            return null;
        }
        class191 var1 = (class191) class554.field7853.method849((byte) 116);
        if (var1 != null) {
            var1.method3678(-1);
            var1.method2258((byte) 121);
            return var1;
        }
        class191 var2;
        do {
            var2 = (class191) class655.field9192.method849((byte) 23);
            if (var2 == null) {
                return null;
            }
            if (var2.method1288(-7415) > class490.method2840(true)) {
                return null;
            }
            var2.method3678(-1);
            var2.method2258((byte) 112);
        } while ((var2.field5344 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([I)V", line = 66)
    public class586(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field8209 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field8209[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field8209[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field8209[var5 + var5] = arg0[var4];
            this.field8209[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)I", line = 101)
    public final int method3321(int arg0, byte arg1) {
        if (arg1 < 0) {
            this.method3321(-68, (byte) -22);
        }
        field8206++;
        int var3 = (this.field8209.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field8209[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field8209[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
