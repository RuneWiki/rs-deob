import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class322 extends OutputStream {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Law;")
    public static class76 field4583 = new class76();

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lhda;")
    public static class752 field4586 = new class752(76, 10);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ne", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4587++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
    public static final void method1952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4584++;
        if (class431.field5944 >= arg4 && class380.field5289 <= arg5) {
            boolean var6;
            if (class261.field3632 > arg2) {
                arg2 = class261.field3632;
                var6 = false;
            } else if (class209.field3090 < arg2) {
                arg2 = class209.field3090;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class261.field3632 > arg3) {
                var7 = false;
                arg3 = class261.field3632;
            } else if (class209.field3090 >= arg3) {
                var7 = true;
            } else {
                arg3 = class209.field3090;
                var7 = false;
            }
            if (class380.field5289 > arg4) {
                arg4 = class380.field5289;
            } else {
                class717.method4012(arg0, -128, arg2, class690.field9616[arg4++], arg3);
            }
            if (arg5 > class431.field5944) {
                arg5 = class431.field5944;
            } else {
                class717.method4012(arg0, -114, arg2, class690.field9616[arg5--], arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg5; var8++) {
                    int[] var9 = class690.field9616[var8];
                    var9[arg2] = var9[arg3] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg5; var11++) {
                    class690.field9616[var11][arg2] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg5; var10++) {
                    class690.field9616[var10][arg3] = arg0;
                }
            }
        }
        if (arg1 <= 116) {
            method1953((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method1953(byte arg0) {
        field4583 = null;
        if (arg0 > 72) {
            field4586 = null;
        }
    }
}
