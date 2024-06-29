import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class102 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    public static int[] field1585;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method777(int arg0) {
        field1585 = null;
        if (arg0 <= 83) {
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method778(int arg0) {
        if (class67.field1058 != null) {
            class67.field1058.method580(false);
        }
        if (arg0 != -9546) {
            field1585 = null;
        }
        field1588++;
        if (class304.field4889 != null) {
            class304.field4889.method580(false);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method779(int arg0, int arg1) {
        class19.field265.method1166((byte) 23, arg1);
        if (arg0 != 0) {
            field1585 = null;
        }
        field1586++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZLnl;IILnl;Z)I")
    public static final int method780(int arg0, boolean arg1, class98 arg2, int arg3, int arg4, class98 arg5, boolean arg6) {
        field1584++;
        int var7 = class192.method1369((byte) 126, arg3, arg2, arg6, arg5);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (~arg0 == arg4) {
            return 0;
        } else {
            int var8 = class192.method1369((byte) 127, arg0, arg2, arg1, arg5);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
    public static final void method781(int arg0, int arg1, int arg2) {
        class250 var3 = class263.method1768(arg0, (byte) -46);
        int var4 = var3.field4004;
        int var5 = var3.field4005;
        int var6 = var3.field4001;
        int var7 = class64.field1006[var5 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = 72 / ((32 - arg2) / 43);
        int var9 = var7 << var6;
        class200.method1413(class257.field4090[var4] & ~var9 | var9 & arg1 << var6, var4, 98);
        field1587++;
    }
}
