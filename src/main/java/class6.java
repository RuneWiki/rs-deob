import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Z")
    public static volatile boolean field65 = false;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lwc;")
    public static class213 field67 = null;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lvh;")
    public static class252 field62 = new class252();

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
    public static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class242.method1660((byte) -79, class80.field1324[arg4], arg2, arg0 + arg3, -arg3 + arg0);
        field70++;
        int var5 = 0;
        int var6 = -1;
        int var7 = arg3;
        int var8 = -arg3;
        while (var5 < var7) {
            var5++;
            var6 += 2;
            var8 += var6;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var9 = class80.field1324[arg4 + var7];
                int var10 = arg0 + var5;
                int[] var11 = class80.field1324[arg4 - var7];
                int var12 = arg0 - var5;
                class242.method1660((byte) -79, var9, arg2, var10, var12);
                class242.method1660((byte) -79, var11, arg2, var10, var12);
            }
            int var13 = arg0 + var7;
            int[] var14 = class80.field1324[arg4 + var5];
            int var15 = arg0 - var7;
            int[] var16 = class80.field1324[arg4 - var5];
            class242.method1660((byte) -79, var14, arg2, var13, var15);
            class242.method1660((byte) -79, var16, arg2, var13, var15);
        }
        if (arg1 >= -18) {
            field67 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I")
    public static final int method25(int arg0, int arg1) {
        field69++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg0 > -117) {
            method24(-12, 108, 5, -47, 20);
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static final void method26(int arg0) {
        class255.field4451.method1631(arg0 - 27771);
        field64++;
        if (arg0 != 27771) {
            method25(109, 31);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -26) {
            field67 = null;
        }
        field61++;
        if (class175.field2867 < arg3 || class36.field542 > arg1) {
            return;
        }
        boolean var6;
        if (class28.field408 > arg5) {
            var6 = false;
            arg5 = class28.field408;
        } else if (arg5 > class115.field1954) {
            arg5 = class115.field1954;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg2 < class28.field408) {
            arg2 = class28.field408;
            var7 = false;
        } else if (class115.field1954 < arg2) {
            var7 = false;
            arg2 = class115.field1954;
        } else {
            var7 = true;
        }
        if (arg3 < class36.field542) {
            arg3 = class36.field542;
        } else {
            class242.method1660((byte) -79, class80.field1324[arg3++], arg4, arg2, arg5);
        }
        if (arg1 <= class175.field2867) {
            class242.method1660((byte) -79, class80.field1324[arg1--], arg4, arg2, arg5);
        } else {
            arg1 = class175.field2867;
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg1; var8++) {
                int[] var9 = class80.field1324[var8];
                var9[arg5] = var9[arg2] = arg4;
            }
        } else if (var6) {
            for (int var11 = arg3; var11 <= arg1; var11++) {
                class80.field1324[var11][arg5] = arg4;
            }
        } else if (var7) {
            for (int var10 = arg3; var10 <= arg1; var10++) {
                class80.field1324[var10][arg2] = arg4;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method28(int arg0) {
        field62 = null;
        field67 = null;
        int var1 = -91 % ((58 - arg0) / 35);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lu;I)V")
    public static final void method29(class111 arg0, int arg1) {
        field63++;
        if (arg1 != 26068) {
            field65 = false;
        }
        class263.field4598 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIIIII)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field66++;
        if (arg2 == arg3) {
            class87.method665(arg4, -31835, arg2, arg1, arg0);
            return;
        }
        if (arg5 != 0) {
            method28(50);
        }
        if (class28.field408 <= arg1 - arg2 && (arg1 + arg2) <= class115.field1954 && class36.field542 <= (arg4 - arg3) && class175.field2867 >= arg3 + arg4) {
            class75.method539(arg1, arg3, -1, arg2, arg0, arg4);
        } else {
            class95.method712(arg1, arg0, arg2, 2184, arg4, arg3);
        }
    }
}
