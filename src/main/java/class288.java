import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class288 extends OutputStream {

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field4303 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "[I")
    public static int[] field4296 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIII)V", line = 12)
    public static final void method2026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4301++;
        int var6 = arg3 - arg0;
        int var7 = arg4 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class356.method2280(arg3, arg5, arg1 - 10604, arg2, arg0);
            }
        } else if (var6 == 0) {
            class417.method2614(390087964, arg5, arg0, arg4, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg0;
                int var10 = arg4;
                arg0 = var9;
                arg4 = arg3;
                arg3 = var10;
            }
            if (arg4 < arg2) {
                int var11 = arg2;
                int var12 = arg0;
                arg2 = arg4;
                arg0 = arg3;
                arg4 = var11;
                arg3 = var12;
            }
            int var13 = arg0;
            int var14 = arg4 - arg2;
            int var15 = arg3 - arg0;
            int var16 = -(var14 >> 1);
            int var17 = arg0 >= arg3 ? -1 : 1;
            if (~var15 > arg1) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg2; var19 <= arg4; var19++) {
                    class286.field4283[var19][var13] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg4; var18++) {
                    class286.field4283[var13][var18] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "write", descriptor = "(I)V", line = 128)
    public final void write(int arg0) throws IOException {
        field4299++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 138)
    public static void method2027(boolean arg0) {
        field4296 = null;
        if (arg0) {
            field4303 = -14;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZII)V", line = 149)
    public static final void method2028(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4302++;
        if (class51.method407(arg1, arg0 + 5)) {
            class152.method1170(arg3, (byte) 41, arg4, arg0, arg2, class45.field710[arg1]);
        }
    }
}
