import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class208 extends class669 {

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "Luh;")
    public static class168 field2975 = new class168();

    @OriginalMember(owner = "client!dga", name = "M", descriptor = "Lwu;")
    public static class373 field2980 = new class373(16);

    @OriginalMember(owner = "client!dga", name = "O", descriptor = "Lmu;")
    public static class303 field2982 = new class303(83, 2);

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!dga", name = "J", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!dga", name = "N", descriptor = "[[B")
    public static byte[][] field2981;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBII)V", line = 6)
    public final void method1432(int arg0, byte arg1, int arg2, int arg3) {
        super.field9124 = arg2;
        super.field9119 = arg3;
        ++field2977;
        if (arg1 == 70) {
            super.field9133 = arg0;
        }
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(II)I", line = 19)
    public static final int method1433(int arg0, int arg1) {
        ++field2978;
        return arg1 != 16 ? 23 : 255 & arg0;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[BI)[B", line = 30)
    public static final byte[] method1434(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 4567) {
            method1434(-48, 112, (byte[]) null, -45);
        }
        ++field2976;
        byte[] var4;
        if (~arg1 < -1) {
            var4 = new byte[arg3];
            for (int var5 = 0; ~var5 > ~arg3; ++var5) {
                var4[var5] = arg2[arg1 + var5];
            }
        } else {
            var4 = arg2;
        }
        class486 var6 = new class486();
        var6.method2863(arg0 + -4682);
        var6.method2866((long) (arg3 * 8), var4, -69);
        byte[] var7 = new byte[64];
        var6.method2867(true, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIIIF)V", line = 66)
    public class208(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)V", line = 69)
    public static void method1435(byte arg0) {
        field2981 = null;
        if (arg0 != -23) {
            method1434(14, 86, (byte[]) null, -106);
        }
        field2975 = null;
        field2980 = null;
        field2982 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IF)V", line = 89)
    public final void method1436(int arg0, float arg1) {
        super.field9121 = arg1;
        if (arg0 == -1) {
            ++field2979;
        }
    }
}
