import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class78 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZIIIZ)V", line = 6)
    public static final void method635(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 != 4) {
            method636((int[]) null, 18, -85, -66, 112, -79);
        }
        field1133++;
        if (arg4 >= arg0) {
            return;
        }
        int var7 = (arg4 + arg0) / 2;
        int var8 = arg4;
        class316 var9 = class270.field4099[var7];
        class270.field4099[var7] = class270.field4099[arg0];
        class270.field4099[arg0] = var9;
        for (int var10 = arg4; var10 < arg0; var10++) {
            if (class239.method1767(arg5, var9, class270.field4099[var10], arg3, 3, arg2, arg6) <= 0) {
                class316 var11 = class270.field4099[var10];
                class270.field4099[var10] = class270.field4099[var8];
                class270.field4099[var8++] = var11;
            }
        }
        class270.field4099[arg0] = class270.field4099[var8];
        class270.field4099[var8] = var9;
        method635(var8 - 1, 4, arg2, arg3, arg4, arg5, arg6);
        method635(arg0, arg1, arg2, arg3, var8 + 1, arg5, arg6);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([IIIIII)V", line = 51)
    public static final void method636(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class167 var6 = class302.field4502[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class172 var7 = var6.field2394;
        if (var7 != null) {
            int var8 = var7.field2480;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class100 var10 = var6.field2415;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1430;
        int var12 = var10.field1439;
        int var13 = var10.field1441;
        int var14 = var10.field1433;
        int[] var15 = class266.field4066[var11];
        int[] var16 = class261.field3909[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILqf;I)V", line = 151)
    public static final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class359 arg6, int arg7) {
        field1135++;
        if (class288.field4363) {
            class144.field2084 = 32;
        } else {
            class144.field2084 = 0;
        }
        if (arg5 != 3621) {
            method638(28);
        }
        class288.field4363 = false;
        if (class96.field1346 != 0) {
            if (arg0 >= arg2 && arg0 < (arg2 + 16) && arg7 <= arg3 && arg3 < (arg7 + 16)) {
                arg6.field5641 -= 4;
                class83.method676(arg6, (byte) -118);
            } else if (arg0 >= arg2 && arg0 < (arg2 + 16) && (arg1 + arg7 - 16) <= arg3 && (arg1 + arg7) > arg3) {
                arg6.field5641 += 4;
                class83.method676(arg6, (byte) -43);
            } else if (arg0 >= arg2 - class144.field2084 && (class144.field2084 + arg2 + 16) > arg0 && arg3 >= arg7 + 16 && arg3 < arg7 - (16 - arg1)) {
                int var8 = (arg1 - 32) * arg1 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - arg7 - (var8 / 2) - 16;
                int var10 = arg1 - var8 - 32;
                arg6.field5641 = (arg4 - arg1) * var9 / var10;
                class83.method676(arg6, (byte) -108);
                class288.field4363 = true;
            }
        }
        if (class142.field2063 == 0) {
            return;
        }
        int var11 = arg6.field5506;
        if (arg0 >= arg2 - var11 && arg7 <= arg3 && arg2 + 16 > arg0 && arg3 <= arg1 + arg7) {
            arg6.field5641 += class142.field2063 * 45;
            class83.method676(arg6, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 217)
    public static final void method638(int arg0) {
        field1132++;
        if (arg0 == 4) {
            class104.field1491.method458((byte) -117);
        }
    }
}
