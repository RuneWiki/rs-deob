import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class222 implements class134 {

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lsea;")
    public class646 field2899;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Ljn;")
    private class668 field2896;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
    public static int[] field2887 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2890 = 1;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "B")
    public static byte field2888;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lf;")
    public class701 field2891;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1351(int arg0, int arg1) {
        field2898++;
        class233 var2 = class7.method44(arg0, arg1, -1);
        var2.method1423(0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 13)
    public static void method1352(byte arg0) {
        field2887 = null;
        if (arg0 != -91) {
            field2888 = 41;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V", line = 28)
    public static final void method1353(int arg0, boolean arg1) {
        class472 var2 = class230.field2993;
        synchronized (class230.field2993) {
            class230.field2993.method2777(arg0, 27);
        }
        field2893++;
        class472 var3 = class277.field3783;
        synchronized (class277.field3783) {
            class277.field3783.method2777(arg0, 34);
            if (!arg1) {
                field2890 = 124;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lcq;", line = 49)
    public static final class433 method1354(int arg0, int arg1, int arg2) {
        if (class281.field3808[arg0][arg1][arg2] == null) {
            boolean var3 = class281.field3808[0][arg1][arg2] != null && class281.field3808[0][arg1][arg2].field6207 != null;
            if (var3 && arg0 >= class663.field9391 - 1) {
                return null;
            }
            class531.method3123(arg0, arg1, arg2);
        }
        return class281.field3808[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BZ)V", line = 66)
    public void method893(byte arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field2899.field9196.method3298(false, class589.field8535, this.field2891.method896()) + this.field2899.field9192;
            int var4 = this.field2899.field9188.method1080(this.field2891.method901(), class6.field60, 81) + this.field2899.field9198;
            this.field2891.method3924(var3, var4);
        }
        field2892++;
        if (arg0 != -61) {
            field2887 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z", line = 87)
    public final boolean method753(int arg0) {
        if (arg0 != -29791) {
            this.method753(38);
        }
        field2895++;
        return this.field2896.method3802(this.field2899.field9193, (byte) -71);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLft;II)V", line = 98)
    public static final void method1355(int arg0, byte arg1, class4 arg2, int arg3, int arg4) {
        field2897++;
        long var5 = (long) (arg4 << 28 | arg0 << 14 | arg3);
        if (arg1 <= 37) {
            method1351(-86, 102);
        }
        class507 var7 = (class507) class475.field6655.method3678(var5, -119);
        if (var7 == null) {
            class507 var8 = new class507();
            class475.field6655.method3670(var5, var8, (byte) 127);
            var8.field7422.method1129(arg2, 262144);
            return;
        }
        class238 var9 = class65.field1021.method178(false, arg2.field25);
        int var10 = var9.field3228;
        if (var9.field3268 == 1) {
            var10 = (arg2.field24 + 1) * var10;
        }
        for (class4 var11 = (class4) var7.field7422.method1132((byte) 125); var11 != null; var11 = (class4) var7.field7422.method1134(8446)) {
            class238 var12 = class65.field1021.method178(false, var11.field25);
            int var13 = var12.field3228;
            if (var12.field3268 == 1) {
                var13 = (var11.field24 + 1) * var13;
            }
            if (var13 < var10) {
                class55.method577(var11, arg2, (byte) 42);
                return;
            }
        }
        var7.field7422.method1129(arg2, 262144);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 150)
    public final void method749(int arg0) {
        field2889++;
        this.field2891 = class273.method1638((byte) -102, this.field2896, this.field2899.field9193);
        if (arg0 != 27471) {
            field2887 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V", line = 164)
    public static final void method1356(byte arg0, int arg1) {
        class614.method3523(0);
        field2894++;
        int var2 = class193.field2350.method691(16, arg1).field6847;
        if (var2 == 0) {
            return;
        }
        int var3 = 80 / ((-arg0 - 5) / 41);
        int var4 = class410.field5804.field7894[arg1];
        if (var2 == 6) {
            class67.field1034 = var4;
        }
        if (var2 == 5) {
            class380.field5095 = var4;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljn;Lsea;)V", line = 189)
    public class222(class668 arg0, class646 arg1) {
        this.field2899 = arg1;
        this.field2896 = arg0;
    }
}
