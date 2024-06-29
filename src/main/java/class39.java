import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class39 extends OutputStream {

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Ls;")
    public static class169 field566 = new class169(5, 2);

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field567 = 104;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "Lmc;")
    public static class78 field568 = new class78(44, 1);

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field570 = 0;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "Z")
    public static boolean field569;

    @OriginalMember(owner = "client!nr", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field565++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lmr;IILmr;BIIIII)V", line = 17)
    public static final void method279(class86 arg0, int arg1, int arg2, class86 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field564++;
        int var10 = arg0.method541(true);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class139 var12 = (class139) class209.field2828.method493((byte) 19, (long) var10);
        if (var12 == null) {
            class325[] var13 = class325.method1823(class473.field6525, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class98.field1432.method2050(var13[0], true);
            class209.field2828.method505((long) var10, var12, 64);
        }
        class108.method673(0, arg3.field6507, arg3.field6502, arg3.method545(false) * 64, arg5, arg6 >> 1, arg3.field6501, arg9, (byte) 25, arg7 >> 1);
        int var14 = arg2 + class168.field2324[0] - 18;
        if (arg4 != -50) {
            return;
        }
        int var15 = arg1 - (-class168.field2324[1] + 16) - 54;
        int var16 = arg8 / 4 * 18 + var14;
        int var17 = arg8 % 4 * 18 + var15;
        var12.method836(var16, var17);
        if (arg0 == arg3) {
            class98.field1432.method2219(arg4 - 16335, var17 - 1, var16 - 1, 18, -256, 18);
        }
        class408 var18 = class154.method908((byte) -97);
        var18.field5587 = var17;
        var18.field5589 = var16;
        var18.field5586 = var17 + 16;
        var18.field5584 = arg0;
        var18.field5591 = var16 + 16;
        class165.field2281.method2767(arg4 ^ 0x714, var18);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 66)
    public static void method280(int arg0) {
        field568 = null;
        field566 = null;
        if (arg0 <= 118) {
            method279((class86) null, -23, -30, (class86) null, (byte) -84, -13, 89, 27, -119, -117);
        }
    }
}
