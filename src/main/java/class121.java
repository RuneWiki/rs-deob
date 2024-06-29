import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class121 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Ler;")
    public static class69 field1655;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method736(int arg0) {
        field1655 = null;
        if (arg0 != -1) {
            field1655 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lqw;I)V")
    public static final void method737(class54 arg0, int arg1) {
        field1653++;
        if (class139.field1850) {
            return;
        }
        arg0.method25(arg1 - 3700);
        if (arg1 != -9789) {
            method738((byte) 34, -94, -97, 114, 84, -9);
        }
        class367.field5621--;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIIIII)V")
    public static final void method738(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1656++;
        int var6 = arg5 - arg2;
        int var7 = arg3 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class465.method2798(arg5, (byte) 83, arg2, arg4, arg1);
            }
        } else if (var6 == 0) {
            class229.method1539((byte) -106, arg4, arg2, arg3, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                int var10 = arg3;
                arg4 = arg2;
                arg2 = var9;
                arg3 = arg5;
                arg5 = var10;
            }
            if (arg3 < arg4) {
                int var11 = arg4;
                int var12 = arg2;
                arg4 = arg3;
                arg2 = arg5;
                arg3 = var11;
                arg5 = var12;
            }
            int var13 = arg2;
            int var14 = -51 / ((arg0 + 48) / 39);
            int var15 = arg3 - arg4;
            int var16 = arg5 - arg2;
            int var17 = -(var15 >> 1);
            if (var16 < 0) {
                var16 = -var16;
            }
            int var18 = arg2 < arg5 ? 1 : -1;
            if (var8) {
                for (int var20 = arg4; var20 <= arg3; var20++) {
                    var17 += var16;
                    class466.field6955[var20][var13] = arg1;
                    if (var17 > 0) {
                        var17 -= var15;
                        var13 += var18;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg3; var19++) {
                    var17 += var16;
                    class466.field6955[var13][var19] = arg1;
                    if (var17 > 0) {
                        var17 -= var15;
                        var13 += var18;
                    }
                }
            }
        }
    }
}
