import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class12 extends OutputStream {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lec;")
    public static class25 field152 = new class25(100);

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field161 = "Loaded fonts";

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[I")
    public static int[] field162 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Z")
    public static boolean field160 = true;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
    public static int[] field157;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method64(int arg0) {
        field161 = null;
        if (arg0 != -9134) {
            method64(-12);
        }
        field152 = null;
        field157 = null;
        field162 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIBII)V")
    public static final void method65(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 < 21) {
            field159 = 59;
        }
        field154++;
        class165.field2603 = arg0;
        class138.field2131 = arg1;
        class117.field1788 = arg3;
        class68.field993 = arg5;
        class178.field2767 = arg6;
        if (arg2 && class138.field2131 >= 100) {
            class174.field2724 = class178.field2767 * 128 + 64;
            class53.field715 = class165.field2603 * 128 + 64;
            class262.field4326 = method66(class53.field715, class165.field2600, class174.field2724, 0) - class117.field1788;
        }
        class92.field1402 = 2;
    }

    @OriginalMember(owner = "client!hd", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field156++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)I")
    public static final int method66(int arg0, int arg1, int arg2, int arg3) {
        field151++;
        if (class242.field3842 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var5 < arg3 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class128.field1972[1][var5][var4] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var8) * class242.field3842[var6][var5][var4 + 1] + (class242.field3842[var6][var5 + 1][var4 + 1] * var8) >> 7;
        int var10 = (128 - var8) * class242.field3842[var6][var5][var4] + (class242.field3842[var6][var5 + 1][var4] * var8) >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }
}
