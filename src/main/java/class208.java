import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class208 extends class135 {

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field3021;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field3015 = -1;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "[S")
    public static short[] field3022 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "[[I")
    public static int[][] field3016 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)C", line = 4)
    public static final char method1445(int arg0, byte arg1) {
        field3020++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class346.field4804[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (arg0 != 32404) {
            method1445(127, (byte) 14);
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)Z", line = 31)
    public final boolean method1030(byte arg0) {
        if (arg0 <= 57) {
            return false;
        } else {
            field3018++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 42)
    public static final void method1446(int arg0) {
        for (class189 var1 = (class189) class229.field3359.method2955(arg0 + 60); var1 != null; var1 = (class189) class229.field3359.method2952((byte) -45)) {
            var1.method1330();
        }
        if (arg0 != 2) {
            field3017 = 29;
        }
        field3019++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBZIILla;Lya;)V", line = 61)
    public static final void method1447(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class314 arg5, class38 arg6) {
        if (arg2) {
            class155.field2206.method111((class94.field1278 - class155.field2206.method125()) / 2, (class410.field6100 - class155.field2206.method117()) / 2);
            class439.field6528.method111((class94.field1278 - class439.field6528.method125()) / 2, 18);
        }
        field3014++;
        if (arg1 != 91) {
            field3015 = -79;
        }
        arg5.method1956(class94.field1278 / 2, arg4, 0, class410.field6100 / 2 - 26, -1, (class68.field872 == class61.field703 ? class330.field4607 : class140.field1987).method2031(true, class377.field5585));
        int var7 = class410.field6100 / 2 - 18;
        arg6.method397(class94.field1278 / 2 - 152, var7, 304, 34, arg0, 0);
        arg6.method397(class94.field1278 / 2 - 151, var7 - -1, 302, 32, 0, 0);
        arg6.method386(class94.field1278 / 2 - 150, var7 + 2, class264.field3869 * 3, 30, arg3, 0);
        arg6.method386(class264.field3869 * 3 + class94.field1278 / 2 - 150, var7 + 2, 300 - (class264.field3869 * 3), 30, 0, 0);
        arg5.method1956(class94.field1278 / 2, arg4, 0, class410.field6100 / 2 + 4, -1, class263.field3863);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 95)
    public static void method1448(boolean arg0) {
        field3016 = null;
        if (!arg0) {
            method1445(-91, (byte) 15);
        }
        field3022 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 111)
    public class208(Object arg0, int arg1) {
        super(arg1);
        this.field3021 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 122)
    public final Object method1032(int arg0) {
        field3013++;
        if (arg0 != 250) {
            field3022 = null;
        }
        return this.field3021;
    }
}
