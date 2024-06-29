import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class262 extends class166 {

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    private int field4664;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lka;")
    public static class243 field4668 = new class243();

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Z")
    public static boolean field4669 = false;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "Lhj;")
    private static class69 field4671 = class181.method1318("Free world", (byte) -116);

    @OriginalMember(owner = "client!g", name = "W", descriptor = "Lhj;")
    public static class69 field4670 = field4671;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public static void method1796(int arg0) {
        field4671 = null;
        field4670 = null;
        field4668 = null;
        if (arg0 <= 48) {
            field4668 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(BI)V")
    public static final void method1797(byte arg0, int arg1) {
        ++field4667;
        if (class131.method971(arg1, (byte) -89)) {
            class134.method1004(-1, -27091, class116.field2222[arg1]);
            if (arg0 != -111) {
                field4671 = null;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIILed;JLed;Led;)V")
    public static final void method1798(int arg0, int arg1, int arg2, int arg3, class177 arg4, long arg5, class177 arg6, class177 arg7) {
        class204 var9 = new class204();
        var9.field3664 = arg4;
        var9.field3669 = arg1 * 128 + 64;
        var9.field3674 = arg2 * 128 + 64;
        var9.field3675 = arg3;
        var9.field3672 = arg5;
        var9.field3679 = arg6;
        var9.field3671 = arg7;
        int var10 = 0;
        class217 var11 = class158.field2935[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3940; ++var12) {
                class85 var13 = var11.field3933[var12];
                if ((var13.field1656 & 4194304L) == 4194304L) {
                    int var14 = var13.field1660.method211();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3678 = -var10;
        if (class158.field2935[arg0][arg1][arg2] == null) {
            class158.field2935[arg0][arg1][arg2] = new class217(arg0, arg1, arg2);
        }
        class158.field2935[arg0][arg1][arg2].field3935 = var9;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4665;
        if (arg1 != 8388607) {
            field4669 = false;
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            class1.method2(var3, 0, class253.field4565, this.field4664);
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
    private class262(int arg0) {
        super(0, true);
        this.field4664 = 4096;
        this.field4664 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class262() {
        this(4096);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 == 96) {
            if (~arg2 == -1) {
                this.field4664 = (arg1.method937(false) << 12) / 255;
            }
            ++field4662;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static final void method1799(byte arg0) {
        if (arg0 != 8) {
            method1798(42, -32, 124, -35, (class177) null, -122L, (class177) null, (class177) null);
        }
        class124.field2299.method1713(arg0 ^ 112);
        ++field4666;
        class116.field2224.method1713(-103);
    }
}
