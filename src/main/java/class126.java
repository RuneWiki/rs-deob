import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class126 {

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Z")
    public boolean field1329;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[I")
    public static int[] field1321 = new int[25];

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1328 = -1;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lel;")
    public class545 field1324;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lel;")
    public class545 field1326;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Z")
    public boolean field1323;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[Lhu;")
    public static class131[] field1322;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIB)I", line = 3)
    public static final int method802(int arg0, int arg1, byte arg2) {
        if (arg2 != -49) {
            method802(58, 15, (byte) -76);
        }
        field1319++;
        byte var3;
        if (arg1 > 20000) {
            var3 = 4;
            class164.method1016(43);
        } else if (arg1 > 10000) {
            var3 = 3;
            class234.method1390(false);
        } else if (arg1 <= 5000) {
            var3 = 1;
            class707.method3960(127, true);
        } else {
            var3 = 2;
            class177.method1091((byte) 112);
        }
        if (arg0 != class654.field9334.field9850.method1512(117)) {
            class654.field9334.method3924(true, class654.field9334.field9835, arg0);
            class627.method3597(false, arg0, arg2 - 31569);
        }
        class37.method168((byte) 114);
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 49)
    public final void method803(int arg0) {
        if (this.field1324 != null) {
            this.field1324.method262(true);
        }
        if (arg0 != 7355) {
            field1322 = null;
        }
        field1327++;
        this.field1323 = false;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Z", line = 71)
    public final boolean method804(int arg0) {
        int var2 = -94 % ((23 - arg0) / 49);
        field1320++;
        return this.field1323 && !this.field1329;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 81)
    public static void method805(byte arg0) {
        if (arg0 != 104) {
            field1328 = 111;
        }
        field1322 = null;
        field1321 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Z)V", line = 96)
    public class126(boolean arg0) {
        this.field1329 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V", line = 110)
    public static final void method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1325++;
        int var8 = class211.method1255(class224.field2571, arg1, false, class578.field8182);
        if (arg7 != 25) {
            field1322 = null;
        }
        int var9 = class211.method1255(class224.field2571, arg5, false, class578.field8182);
        int var10 = class211.method1255(class338.field4355, arg4, false, class744.field10385);
        int var11 = class211.method1255(class338.field4355, arg3, false, class744.field10385);
        int var12 = class211.method1255(class224.field2571, arg0 + arg1, false, class578.field8182);
        int var13 = class211.method1255(class224.field2571, arg5 - arg0, false, class578.field8182);
        for (int var14 = var8; var14 < var12; var14++) {
            class223.method1297(class408.field5585[var14], -7, var10, arg6, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class223.method1297(class408.field5585[var15], arg7 - 32, var10, arg6, var11);
        }
        int var16 = class211.method1255(class338.field4355, arg0 + arg4, false, class744.field10385);
        int var17 = class211.method1255(class338.field4355, arg3 - arg0, false, class744.field10385);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class408.field5585[var18];
            class223.method1297(var19, arg7 ^ 0xFFFFFFE0, var10, arg6, var16);
            class223.method1297(var19, -7, var16, arg2, var17);
            class223.method1297(var19, -7, var17, arg6, var11);
        }
    }
}
