import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class402 extends class117 {

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    private int field5895;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "Lvp;")
    public static class123 field5897 = new class123(19, 7);

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "Lao;")
    public static class188 field5900 = new class188(2, 8);

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "[I")
    public static int[] field5903 = new int[13];

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field5904 = 0;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "Lia;")
    public static class413 field5902;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[Lfl;")
    public class517[] field5891;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "[Lf;")
    public static class528[] field5901;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "[[B")
    private byte[][] field5899;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z", line = 3)
    public final boolean method2497(int arg0) {
        field5898++;
        if (this.field5891 != null) {
            return true;
        }
        if (this.field5899 == null) {
            if (!class54.field801.method673(-1, this.field5895)) {
                return false;
            }
            int[] var2 = class54.field801.method675((byte) 67, this.field5895);
            this.field5899 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field5899[var3] = class54.field801.method683(this.field5895, var2[var3], 5);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field5899.length; var5++) {
            byte[] var14 = this.field5899[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class310.field4443.method682(0, var15);
        }
        if (!var4) {
            return false;
        }
        class348 var6 = new class348();
        if (arg0 > -74) {
            field5903 = null;
        }
        int var7 = class54.field801.method656((byte) 122, this.field5895);
        this.field5891 = new class517[var7];
        int[] var8 = class54.field801.method675((byte) 67, this.field5895);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field5899[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class168 var12 = null;
            for (class168 var13 = (class168) var6.method2257((byte) 114); var13 != null; var13 = (class168) var6.method2256(-68)) {
                if (var13.field2521 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class168(var11, class310.field4443.method680(true, var11));
                var6.method2270(0, var12);
            }
            this.field5891[var8[var9]] = new class517(var10, var12);
        }
        this.field5899 = null;
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([SI[Ljava/lang/String;II)V", line = 103)
    public static final void method2498(short[] arg0, int arg1, String[] arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method2498(arg0, 1, arg2, var6 - 1, arg4);
            method2498(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg1 != 1) {
            method2498(null, -124, null, 84, 12);
        }
        field5890++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Z", line = 160)
    public final boolean method2499(int arg0, byte arg1) {
        field5892++;
        if (arg1 < 79) {
            this.method2499(121, (byte) -36);
        }
        return this.field5891[arg0].field7599;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)Z", line = 173)
    public final boolean method2500(int arg0, boolean arg1) {
        field5896++;
        return arg1 ? this.field5891[arg0].field7592 : true;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Z", line = 186)
    public final boolean method2501(int arg0, int arg1) {
        field5893++;
        return arg1 == -13123 ? this.field5891[arg0].field7591 : true;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V", line = 197)
    public static void method2502(byte arg0) {
        field5897 = null;
        field5900 = null;
        if (arg0 != 51) {
            method2498(null, 59, null, 39, -7);
        }
        field5901 = null;
        field5903 = null;
        field5902 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z", line = 217)
    public static final boolean method2503(int arg0, int arg1, int arg2) {
        if (arg2 > -36) {
            return true;
        } else {
            field5894++;
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V", line = 229)
    public class402(int arg0) {
        this.field5895 = arg0;
    }
}
