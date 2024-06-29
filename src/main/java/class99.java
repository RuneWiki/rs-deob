import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class99 extends class286 {

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "[I")
    public static int[] field1674 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field1673 = 0;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "Lbe;")
    public static class283 field1676 = class153.method941(125, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "Lbe;")
    private static class283 field1681 = class153.method941(-68, " more options");

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "Lbe;")
    public static class283 field1682 = class153.method941(125, "::fpsoff");

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "Lbe;")
    public static class283 field1683 = class153.method941(-39, "Hierhin gehen");

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "Lbe;")
    public static class283 field1687 = field1681;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)V", line = 5)
    public static final void method654(int arg0, int arg1, byte arg2) {
        int var3 = -107 % ((-arg2 - 21) / 42);
        field1675++;
        if (class92.method588(arg0, -59)) {
            class261.method1767(class122.field2036[arg0], arg1, 96);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[F)[F", line = 19)
    public static final float[] method655(int arg0, float[] arg1) {
        field1680++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            int var3 = 122 % ((25 - arg0) / 53);
            class136.method844(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I", line = 38)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            method657((byte) -43, 31, 116, -86, -34);
        }
        field1686++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int var4 = class153.field2509[arg1];
            for (int var5 = 0; var5 < class27.field410; var5++) {
                var3[var5] = this.method660(var4, class174.field2978[var5], 415106369) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIII)V", line = 85)
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= class269.field4551 && class166.field2765 >= arg3 && arg6 >= class217.field3677 && arg0 <= class247.field4220) {
            class223.method1465(arg5, arg4, (byte) 104, arg3, arg0, arg1, arg2, arg6);
        } else {
            class304.method2063(arg2, arg5, arg1, arg3, arg6, arg0, (byte) 52, arg4);
        }
        field1672++;
        if (arg7 != -18602) {
            method655(-67, (float[]) null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 122)
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIII)V", line = 126)
    public static final void method657(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.field4074 = -1;
        if (arg0 != -37) {
            method658(false, -58);
        }
        class237.field3962 = -1;
        class7.field79 = class77.field1345 * arg4 / arg3;
        class159.field2604 = class134.field2254 * arg1 / arg2;
        class305.method2070(-1);
        field1677++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)I", line = 149)
    public static final int method658(boolean arg0, int arg1) {
        field1684++;
        if (arg0) {
            field1687 = (class283) null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILfe;)Lbb;", line = 162)
    public static final class85 method659(int arg0, class229 arg1) {
        if (arg0 != -25602) {
            field1685 = -2;
        }
        field1678++;
        return new class85(arg1.method1507(102), arg1.method1507(75), arg1.method1507(86), arg1.method1507(93), arg1.method1551(87), arg1.method1551(64), arg1.method1535((byte) 124));
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)I", line = 176)
    private final int method660(int arg0, int arg1, int arg2) {
        field1671++;
        int var4 = arg1 + (arg0 * 57);
        if (arg2 == 415106369) {
            int var5 = var4 << 1 ^ var4;
            return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 196)
    public static void method661(byte arg0) {
        field1676 = null;
        field1683 = null;
        field1682 = null;
        if (arg0 != 15) {
            method658(true, -126);
        }
        field1687 = null;
        field1681 = null;
        field1674 = null;
    }
}
