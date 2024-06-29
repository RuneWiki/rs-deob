import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class64 extends class156 {

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "[I")
    private int[] field1225 = new int[this.field2546];

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Z")
    public static boolean field1227 = true;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1232 = "Attack";

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[B")
    private byte[] field1235;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)V", line = 5)
    public void method487(int arg0, byte arg1) {
        this.field1235[this.field1229++] = (byte) ((class61.method475(arg1, 255) >> 1) + 127);
        field1228++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V", line = 15)
    public final void method488(int arg0, int arg1, int arg2) {
        if (arg0 == -850495892) {
            this.field1233 += this.field1225[arg1] * arg2 >> 12;
            field1231++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 28)
    public final void method489(int arg0) {
        field1230++;
        this.field1233 = Math.abs(this.field1233);
        if (arg0 <= 90) {
            this.field1235 = (byte[]) null;
        }
        if (this.field1233 >= 4096) {
            this.field1233 = 4095;
        }
        this.method487(this.field1229++, (byte) (this.field1233 >> 4));
        this.field1233 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILag;I)Lbf;", line = 44)
    public static final class328 method490(int arg0, class202 arg1, int arg2) {
        field1224++;
        class328 var3 = new class328(arg0, arg1.method1307((byte) 102), arg1.method1307((byte) 102), arg1.method1346(arg2 - 23078), arg1.method1346(-117), arg1.method1317((byte) -73) == 1, arg1.method1317((byte) -87));
        int var4 = arg1.method1317((byte) -83);
        if (arg2 != 22953) {
            method491(false);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field5025.method427((byte) 120, new class99(arg1.method1317((byte) -70), arg1.method1317((byte) -78), arg1.method1315(14289), arg1.method1315(14289), arg1.method1315(14289), arg1.method1315(14289), arg1.method1315(arg2 - 8664), arg1.method1315(arg2 - 8664), arg1.method1315(14289), arg1.method1315(14289)));
        }
        var3.method2272((byte) -125);
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIF)V", line = 68)
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field2546; var7++) {
            this.field1225[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 88)
    public static void method491(boolean arg0) {
        field1232 = null;
        if (!arg0) {
            field1227 = true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIIIBIIII)V", line = 108)
    public static final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        field1226++;
        class6 var13 = new class6();
        int var14 = -103 % ((70 - arg8) / 54);
        var13.field132 = arg12;
        var13.field125 = arg2;
        var13.field117 = arg0;
        var13.field119 = arg6;
        var13.field120 = arg4;
        var13.field127 = arg1;
        var13.field128 = arg10;
        var13.field130 = arg3;
        var13.field131 = arg11;
        var13.field118 = arg7;
        var13.field126 = arg5;
        var13.field122 = arg9;
        class18.field329.method427((byte) -82, var13);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 140)
    public final void method493(byte arg0) {
        if (arg0 == -85) {
            this.field1229 = 0;
            this.field1233 = 0;
            field1234++;
        }
    }
}
