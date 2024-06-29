import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class380 {

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
    public static volatile boolean field5449 = true;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[[Z")
    public static boolean[][] field5453 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lrh;")
    public static class59 field5450 = new class59();

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
    public static boolean field5455 = false;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Lbc;")
    public static class607 field5454 = new class607(1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "[Ljl;")
    public static class38[] field5452;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBIIIII)V", line = 11)
    public static final void method2301(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5447++;
        int var7 = arg6 - arg3;
        int var8 = arg3 + arg4;
        for (int var9 = arg4; var9 < var8; var9++) {
            class653.method3620(arg5, arg2, false, arg0, class319.field4673[var9]);
        }
        int var10 = arg5 - arg3;
        int var11 = arg2 + arg3;
        for (int var12 = arg6; var12 > var7; var12--) {
            class653.method3620(arg5, arg2, false, arg0, class319.field4673[var12]);
        }
        if (arg1 != -113) {
            method2303(true);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class319.field4673[var13];
            class653.method3620(var11, arg2, false, arg0, var14);
            class653.method3620(arg5, var10, false, arg0, var14);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I", line = 56)
    public static final int method2302(int arg0, int arg1) {
        return class629.field8555 == null ? 0 : class629.field8555[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 65)
    public static void method2303(boolean arg0) {
        field5453 = null;
        if (!arg0) {
            field5454 = null;
            field5450 = null;
            field5452 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I", line = 83)
    public final int method2304(int arg0, int arg1, int arg2) {
        if (arg2 != 65535) {
            return -125;
        }
        field5451++;
        int var4 = class303.field4059 <= arg0 ? arg0 : class303.field4059;
        if (class618.field8412 == this) {
            return 0;
        } else if (class483.field6508 == this) {
            return var4 - arg1;
        } else if (class128.field1626 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "toString", descriptor = "()Ljava/lang/String;", line = 107)
    public final String toString() {
        field5448++;
        throw new IllegalStateException();
    }
}
