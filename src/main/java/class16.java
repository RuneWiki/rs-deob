import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class16 extends class222 {

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "[[[Lfg;")
    public static class203[][][] field230 = new class203[4][104][104];

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "[I")
    public static int[] field234 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!ql", name = "cb", descriptor = "Lve;")
    private static class255 field241 = class87.method607(108, "Loaded world list data");

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "Lve;")
    public static class255 field229 = field241;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ql", name = "bb", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ql", name = "db", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!ql", name = "eb", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ql", name = "fb", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "Lch;")
    public class131 field238;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "[B")
    public byte[] field228;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)Luh;", line = 4)
    public static final class264 method76(byte arg0, int arg1) {
        field233++;
        if (arg0 >= -66) {
            method81(-106);
        }
        class264 var2 = (class264) class72.field1200.method58(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class118.field1980.method636(5, (byte) 74, arg1);
        class264 var4 = new class264();
        if (var3 != null) {
            var4.method1835(new class70(var3), true);
        }
        class72.field1200.method63(0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIBIIIII)V", line = 35)
    public static final void method77(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field244++;
        if (arg3 < 72) {
            method78(-21);
        }
        if (class225.method1570((byte) -96, arg5)) {
            class44.field687 = null;
            class150.method1112(arg2, true, arg4, arg0, class297.field5087[arg5], arg1, arg8, -1, arg7, arg6);
            if (class44.field687 != null) {
                class150.method1112(class264.field4470, true, arg4, arg0, class44.field687, arg1, arg8, -1412584499, class113.field1910, arg6);
                class44.field687 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class187.field3008[var9] = true;
            }
        } else {
            class187.field3008[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V", line = 76)
    public static final void method78(int arg0) {
        if (~class264.field4459 != arg0) {
            class205.method1489(class264.field4459, (byte) 103);
        }
        field236++;
        for (int var1 = 0; var1 < class279.field4784; var1++) {
            if (class187.field3008[var1]) {
                class236.field3931[var1] = true;
            }
            class4.field62[var1] = class187.field3008[var1];
            class187.field3008[var1] = false;
        }
        if (class281.field4827) {
            class141.field2340 = true;
        }
        class276.field4740 = -1;
        class239.field3984 = -1;
        class102.field1713 = null;
        class6.field95 = class277.field4768;
        if (class264.field4459 != -1) {
            class279.field4784 = 0;
            method77(0, class201.field3479, 0, (byte) 126, -1, class264.field4459, class210.field3589, 0, 0);
        }
        if (class281.field4827) {
            class126.method927();
        } else {
            class175.method1252();
        }
        class122.field2036 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(BI)Z", line = 121)
    public static final boolean method79(byte arg0, int arg1) {
        field240++;
        if (arg0 != -112) {
            field237 = 38;
        }
        return (arg1 & 0x242352BB) >> 29 != 0;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)I", line = 154)
    public final int method80(byte arg0) {
        field231++;
        if (arg0 == 60) {
            return this.field3742 ? 0 : 100;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V", line = 169)
    public static void method81(int arg0) {
        field234 = null;
        field229 = null;
        field241 = null;
        field230 = (class203[][][]) null;
        if (arg0 != -1412584499) {
            method77(-109, 100, 49, (byte) -82, -83, -52, -101, 5, 124);
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)[B", line = 203)
    public final byte[] method82(byte arg0) {
        field239++;
        if (this.field3742) {
            throw new RuntimeException();
        }
        if (arg0 != -16) {
            field234 = (int[]) null;
        }
        return this.field228;
    }
}
