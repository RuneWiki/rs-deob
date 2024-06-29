import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class270 extends class152 {

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "Z")
    private boolean field4564 = true;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Z")
    private boolean field4563 = true;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "Lce;")
    public static class126 field4555 = class206.method1445(-7923, "www");

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "Lce;")
    private static class126 field4565 = class206.method1445(-7923, "Loaded sprites");

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "Lce;")
    public static class126 field4561 = field4565;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "[I")
    public static int[] field4554;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)[[I", line = 7)
    public final int[][] method26(int arg0, int arg1) {
        field4560++;
        if (arg0 != 0) {
            field4566 = -15;
        }
        int[][] var3 = this.field2775.method319(-67, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(this.field4564 ? class314.field5378 - arg1 : arg1, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field4563) {
                for (int var11 = 0; var11 < class244.field4133; var11++) {
                    var8[var11] = var5[class321.field5490 - var11];
                    var10[var11] = var6[class321.field5490 - var11];
                    var9[var11] = var7[class321.field5490 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class244.field4133; var12++) {
                    var8[var12] = var5[var12];
                    var10[var12] = var6[var12];
                    var9[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILbb;)V", line = 89)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg1 == 0) {
            this.field4563 = arg2.method948(-125) == 1;
        } else if (arg1 == 1) {
            this.field4564 = arg2.method948(-127) == 1;
        } else if (arg1 == 2) {
            this.field2781 = arg2.method948(-126) == 1;
        }
        field4562++;
        if (arg0 != 8) {
            field4566 = -122;
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(II)I", line = 124)
    public static final int method1815(int arg0, int arg1) {
        if (arg0 > -12) {
            return -122;
        } else {
            field4557++;
            return arg1 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)[I", line = 145)
    public final int[] method6(boolean arg0, int arg1) {
        field4556++;
        if (!arg0) {
            field4561 = (class126) null;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(this.field4564 ? class314.field5378 - arg1 : arg1, 91, 0);
            if (this.field4563) {
                for (int var5 = 0; var5 < class244.field4133; var5++) {
                    var3[var5] = var4[class321.field5490 - var5];
                }
            } else {
                class230.method1568(var4, 0, var3, 0, class244.field4133);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V", line = 190)
    public static void method1816(int arg0) {
        field4554 = null;
        field4561 = null;
        if (arg0 != -2) {
            field4561 = (class126) null;
        }
        field4565 = null;
        field4555 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V", line = 203)
    public static final void method1817(byte arg0, int arg1) {
        field4559++;
        class192 var2 = (class192) class95.field1496.method1631(false, (long) arg1);
        if (var2 != null && arg0 == -96) {
            var2.method499((byte) 64);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 238)
    public class270() {
        super(1, false);
    }
}
