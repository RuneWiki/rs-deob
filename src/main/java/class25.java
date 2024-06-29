import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class25 extends class121 {

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lud;")
    public static class119 field227 = new class119();

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "[I")
    public static int[] field230 = new int[1024];

    @OriginalMember(owner = "client!as", name = "p", descriptor = "F")
    public static float field229;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "Lcd;")
    public class86 field221;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "[[B")
    public static byte[][] field231;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public static void method115(boolean arg0) {
        field231 = null;
        field227 = null;
        if (!arg0) {
            field227 = null;
        }
        field230 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field228++;
        if (!arg7) {
            field227 = null;
        }
        int var8 = arg1 + arg3;
        int var9 = arg2 - arg1;
        for (int var10 = arg3; var10 < var8; var10++) {
            class69.method418(arg6, class47.field558[var10], arg4, (byte) 117, arg5);
        }
        int var11 = arg4 - arg1;
        int var12 = arg1 + arg5;
        for (int var13 = arg2; var13 > var9; var13--) {
            class69.method418(arg6, class47.field558[var13], arg4, (byte) 117, arg5);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class47.field558[var14];
            class69.method418(arg6, var15, var12, (byte) 117, arg5);
            class69.method418(arg0, var15, var11, (byte) 117, var12);
            class69.method418(arg6, var15, arg4, (byte) 117, var11);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
    public static final void method117(int arg0, String arg1, File arg2) {
        class110.field1399.put(arg1, arg2);
        int var3 = 56 % ((arg0 + 24) / 54);
        field225++;
    }
}
