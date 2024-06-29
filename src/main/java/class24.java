import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class24 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lvd;")
    public static class222 field553 = class212.method1357("Untersuchen", 10731);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lvd;")
    public static class222 field558 = class212.method1357("mem=", 10731);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public static int[] field555 = new int[25];

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ll;")
    public static class118 field554;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[Lva;")
    public static class219[] field552;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method216(int arg0) {
        field555 = null;
        field554 = null;
        field552 = null;
        if (arg0 != 128) {
            field553 = null;
        }
        field558 = null;
        field553 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class42.field898[arg0][var8][var14] == -class78.field1510) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class80.field1544[arg0][arg1][arg3] + arg5;
            if (!class191.method1191(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class191.method1191(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class191.method1191(var9, var11, var13)) {
                return false;
            } else if (class191.method1191(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class222.method1423(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class191.method1191(var6 + 1, class80.field1544[arg0][arg1][arg3] + arg5, var7 + 1) && class191.method1191(var6 + 128 - 1, class80.field1544[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class191.method1191(var6 + 128 - 1, class80.field1544[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class191.method1191(var6 + 1, class80.field1544[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lab;Lab;I)I")
    public static final int method218(class3 arg0, class3 arg1, int arg2) {
        int var3 = 0;
        field557++;
        if (arg1.method21(true, class20.field452)) {
            var3++;
        }
        if (arg0.method21(true, class212.field3943)) {
            var3++;
        }
        if (arg0.method21(true, class94.field1772)) {
            var3++;
        }
        if (arg0.method21(true, class175.field3289)) {
            var3++;
        }
        if (arg2 >= -102) {
            field555 = null;
        }
        if (arg0.method21(true, class221.field4104)) {
            var3++;
        }
        if (arg0.method21(true, class80.field1546)) {
            var3++;
        }
        arg0.method21(true, class125.field2386);
        arg0.method21(true, class201.field3688);
        arg0.method21(true, class181.field3351);
        arg0.method21(true, class32.field674);
        arg0.method21(true, class34.field763);
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Z")
    public static final boolean method219(int arg0, byte arg1) {
        if (arg1 >= -69) {
            method219(62, (byte) 3);
        }
        field556++;
        return (arg0 >> 31 & 0x1) != 0;
    }
}
