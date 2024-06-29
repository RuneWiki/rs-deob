import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class420 extends class287 {

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    private int field6076;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "J")
    public static long field6080 = -1L;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lrb;")
    public static class283 field6077 = new class283(90, 1);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "[Lwj;")
    public class226[] field6078;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[[B")
    private byte[][] field6082;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method2481(int arg0, int arg1) {
        field6079++;
        int var3 = -118 / ((arg1 + 91) / 35);
        return this.field6078[arg0].field3196;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Z", line = 14)
    public final boolean method2482(boolean arg0) {
        field6075++;
        if (this.field6078 != null) {
            return true;
        }
        if (this.field6082 == null) {
            if (!class429.field6227.method2489(this.field6076, (byte) 90)) {
                return false;
            }
            int[] var2 = class429.field6227.method2499(0, this.field6076);
            this.field6082 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6082[var3] = class429.field6227.method2512(this.field6076, (byte) -93, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field6082.length; var5++) {
            byte[] var14 = this.field6082[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class403.field5760.method2517(var15, (byte) -68);
        }
        if (!var4) {
            return false;
        }
        class530 var6 = new class530();
        int var7 = class429.field6227.method2509(0, this.field6076);
        this.field6078 = new class226[var7];
        int[] var8 = class429.field6227.method2499(0, this.field6076);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field6082[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class274 var12 = null;
            for (class274 var13 = (class274) var6.method3137(0); var13 != null; var13 = (class274) var6.method3132(0)) {
                if (var13.field3718 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class274(var11, class403.field5760.method2496(var11, 39));
                var6.method3139(0, var12);
            }
            this.field6078[var8[var9]] = new class226(var10, var12);
        }
        this.field6082 = null;
        if (arg0) {
            method2483(null, null, 85, -21, null, 91);
        }
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lor;Ll;IILjava/awt/Canvas;I)Lza;", line = 110)
    public static final class295 method2483(class173 arg0, class127 arg1, int arg2, int arg3, Canvas arg4, int arg5) {
        field6081++;
        if (arg2 != 90) {
            method2483(null, null, 115, -5, null, -9);
        }
        return new class333(arg3, arg4, arg1, arg5, arg0);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Z", line = 131)
    public final boolean method2484(int arg0, int arg1) {
        field6084++;
        return arg1 == -525275000 ? this.field6078[arg0].field3197 : false;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Z", line = 143)
    public final boolean method2485(byte arg0, int arg1) {
        field6083++;
        int var3 = -1 % ((48 - arg0) / 59);
        return this.field6078[arg1].field3194;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V", line = 159)
    public class420(int arg0) {
        this.field6076 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V", line = 167)
    public static void method2486(int arg0) {
        if (arg0 != 1) {
            method2486(79);
        }
        field6077 = null;
    }
}
