import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class490 extends class128 {

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    private int field7079 = -1;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    private int field7083 = -1;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public int field7082;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[S")
    public static short[] field7085 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lvu;")
    public static class155 field7080;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "[I")
    public static int[] field7076;

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lpg;IIZ[[I)V", line = 9)
    public class490(class333 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field7082 = arg2;
        super.field1978.method1977(this, true);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field1972, arg2, arg2, 0, 32993, super.field1978.field4825, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class416.method2462(super.field1972, arg2, arg2, var7 + 34069, (byte) -45, arg4[var7], 32993, super.field1978.field4825);
            }
        }
        this.method928(111, true);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLdc;)V", line = 42)
    public static final void method2905(boolean arg0, class16 arg1) {
        ++field7081;
        boolean var2 = arg0;
        if (~class28.field417 != ~arg1.field181 && arg1.field166 != -1 && arg1.field226 == 0) {
            class55 var3 = class50.field716.method831(arg1.field166, (byte) 54);
            if (var3.field798 || ~(arg1.field191 - -1) < ~var3.field788[arg1.field194]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg1.field160 + arg1.field181;
            int var5 = -arg1.field160 + class28.field417;
            int var6 = arg1.field170 * 128 + 64 * arg1.method116(8569);
            int var7 = arg1.field184 * 128 - -(64 * arg1.method116(8569));
            int var8 = arg1.field183 * 128 + 64 * arg1.method116(8569);
            int var9 = arg1.field221 * 128 - -(arg1.method116(8569) * 64);
            arg1.field6284 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field6287 = ((-var5 + var4) * var7 + var5 * var9) / var4;
        }
        arg1.field266 = 0;
        if (arg1.field190 == 0) {
            arg1.method106(1113158831, false, 8192);
        }
        if (arg1.field190 == 1) {
            arg1.method106(1113158831, false, 12288);
        }
        if (~arg1.field190 == -3) {
            arg1.method106(1113158831, false, 0);
        }
        if (arg1.field190 == 3) {
            arg1.method106(1113158831, false, 4096);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lpg;IIZ[[BI)V", line = 97)
    public class490(class333 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field7082 = arg2;
        super.field1978.method1977(this, true);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field1972, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method928(111, true);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lpg;II)V", line = 136)
    public class490(class333 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field7082 = arg2;
        super.field1978.method1977(this, true);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field1972, arg2, arg2, 0, class332.method1958(super.field1972, (byte) 116), 5121, (byte[]) null, 0);
        }
        this.method928(96, true);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V", line = 123)
    public final void method2906(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field7084;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg0, super.field1975, arg1);
        this.field7083 = arg2;
        this.field7079 = arg3;
        if (arg4 != 66) {
            method2905(false, (class16) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 157)
    public static void method2907(int arg0) {
        field7080 = null;
        field7085 = null;
        if (arg0 >= -111) {
            method2907(79);
        }
        field7076 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 169)
    public final void method137(boolean arg0) {
        ++field7077;
        OpenGL.glFramebufferTexture2DEXT(this.field7083, this.field7079, 3553, 0, 0);
        this.field7079 = -1;
        this.field7083 = -1;
        if (arg0) {
            this.field7082 = -24;
        }
    }
}
