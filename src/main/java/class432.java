import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class432 {

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    public static int[] field6118 = new int[14];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field6114;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Z")
    public boolean field6115;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
    public static final boolean method2481(int arg0, int arg1, int arg2) {
        if (arg1 != -10041) {
            field6118 = null;
        }
        field6116++;
        boolean var3 = (arg0 & 0x37) == 0 ? class154.method835(arg2, arg0, arg1 + 10096) : class674.method3721(1457751848, arg0, arg2);
        return var3 | (arg2 & 0x10000) != 0 | class575.method3253(arg2, arg0, (byte) -88);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method2482(byte arg0) {
        class384.method2204(-97);
        field6120++;
        if (arg0 < 110) {
            method2482((byte) 52);
        }
        class530.method2975((byte) 104);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method2483(int arg0, int arg1) {
        if (arg0 >= -88) {
            method2485(null, -65, 115, 38);
        }
        class634.field8930 = -1;
        field6119++;
        class81.field838 = arg1;
        class453.field6485 = -1;
        class158.method858(111);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static final void method2484(boolean arg0) {
        field6113++;
        if (class188.field2163) {
            return;
        }
        if (class639.field9075.field6762) {
            class508.field7300 = ((int) class508.field7300 + 191 & 0xFFFFFF80);
        } else {
            class9.field94 += (24.0F - class9.field94) / 2.0F;
        }
        class119.field1336 = arg0;
        class188.field2163 = true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lrb;III)V")
    public static final void method2485(class383 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class122.field1369) {
            class499 var4 = class487.field7044[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field7230 != null && var4.field7230.method183((byte) -104)) {
                arg0.method184(0, class171.field1904, 2, 0, var4.field7230, class568.field8078, true);
            }
        }
        if (arg3 < class122.field1369) {
            class499 var5 = class487.field7044[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field7230 != null && var5.field7230.method183((byte) -79)) {
                arg0.method184(0, 0, 2, class171.field1904, var5.field7230, class568.field8078, true);
            }
        }
        if (arg2 < class122.field1369 && arg3 < class247.field3058) {
            class499 var6 = class487.field7044[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field7230 != null && var6.field7230.method183((byte) 119)) {
                arg0.method184(0, class171.field1904, 2, class171.field1904, var6.field7230, class568.field8078, true);
            }
        }
        if (arg2 < class122.field1369 && arg3 > 0) {
            class499 var7 = class487.field7044[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field7230 != null && var7.field7230.method183((byte) -57)) {
                arg0.method184(0, class171.field1904, 2, -class171.field1904, var7.field7230, class568.field8078, true);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method2486(int arg0) {
        field6118 = null;
        if (arg0 <= 94) {
            field6118 = null;
        }
    }
}
