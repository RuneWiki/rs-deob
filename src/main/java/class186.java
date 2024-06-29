import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class186 extends class379 {

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
    public static int field2250 = 0;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "[I")
    public static int[] field2252 = new int[4096];

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/io/File;B)[B")
    public static final byte[] method1238(File arg0, byte arg1) {
        if (arg1 > -65) {
            field2250 = -102;
        }
        field2249++;
        return class314.method1854((int) arg0.length(), arg0, -1);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        int var1 = 125 / ((arg0 - 37) / 54);
        field2252 = null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lha;IIIIILjw;IIIII)V")
    public static final void method1240(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class581 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg9 < arg4 && (arg1 + arg9) > arg4 && arg2 - 13 < arg7 && (arg2 + 3) > arg7) {
            arg11 = arg5;
        }
        field2253++;
        String var12 = class325.method1933(arg6, arg8 ^ 0xFFFFFF9F);
        if (arg8 != -13) {
            field2252 = null;
        }
        class452.field6380.method656(class256.field3026, arg2, arg9 + 3, -1, 0, class644.field8774, arg11, var12);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(II)V")
    public class186(int arg0, int arg1) {
        this.field2251 = arg0;
        this.field2248 = arg1;
    }
}
