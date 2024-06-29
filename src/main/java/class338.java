import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class338 {

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "B")
    public byte field5007;

    @OriginalMember(owner = "client!nha", name = "w", descriptor = "I")
    private int field5027;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "I")
    public int field5021;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "Lpa;")
    public static class387 field5013 = new class387(4);

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public int field5008;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public int field5009;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!nha", name = "t", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!nha", name = "u", descriptor = "I")
    public int field5025;

    @OriginalMember(owner = "client!nha", name = "v", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "Lnha;")
    public class338 field5011;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "[I")
    public static int[] field5020;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 5)
    public static final int method2167(String arg0, int arg1) {
        field5016++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)V", line = 26)
    public static void method2168(boolean arg0) {
        field5013 = null;
        field5020 = null;
        if (!arg0) {
            field5013 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)Lbk;", line = 38)
    public static final class393 method2169(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5437;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Llh;", line = 47)
    public final class550 method2170(byte arg0) {
        field5026++;
        if (arg0 != -48) {
            this.method2170((byte) -11);
        }
        return class437.method2638(this.field5027, -123);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIII)Lnha;", line = 61)
    public final class338 method2171(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            this.field5007 = -2;
        }
        field5006++;
        return new class338(this.field5027, arg1, arg3, arg0, this.field5007);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(JBI)Ljava/lang/String;", line = 78)
    public static final String method2172(long arg0, byte arg1, int arg2) {
        class527.method3060(-12477, arg0);
        field5023++;
        int var4 = class241.field3461.get(5);
        if (arg1 == -69) {
            int var5 = class241.field3461.get(2);
            int var6 = class241.field3461.get(1);
            return arg2 == 3 ? class440.method2660(arg0, arg2, arg1 ^ 0x7D) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class87.field1123[arg2][var5] + "-" + var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIZ)V", line = 103)
    public static final void method2173(int arg0, int arg1, boolean arg2) {
        field5015++;
        class678 var3 = class630.method3597(29636, 1, (long) arg1);
        var3.method3834((byte) 10);
        var3.field9649 = arg0;
        if (arg2) {
            field5013 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(IIIIB)V", line = 126)
    public class338(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field5018 = arg3;
        this.field5007 = arg4;
        this.field5027 = arg0;
        this.field5021 = arg1;
        this.field5017 = arg2;
    }
}
