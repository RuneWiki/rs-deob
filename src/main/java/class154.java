import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class154 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Z")
    public boolean field2512 = true;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public int field2508;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    public static int[] field2515 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lbm;")
    public static class307 field2514;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V", line = 17)
    public static final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2519++;
        int var8 = arg4 + arg7;
        int var9 = arg3 - arg4;
        int var10 = arg4 + arg6;
        int var11 = arg5 - arg4;
        for (int var12 = arg7; var12 < var8; var12++) {
            class241.method1598(arg0, -7, class155.field2522[var12], arg5, arg6);
        }
        if (arg2 != 1280) {
            method999(37, -22, 96, 92, 22, -69, -19, -60);
        }
        for (int var13 = arg3; var13 > var9; var13--) {
            class241.method1598(arg0, -7, class155.field2522[var13], arg5, arg6);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class155.field2522[var14];
            class241.method1598(arg0, -7, var15, var10, arg6);
            class241.method1598(arg1, arg2 ^ 0xFFFFFAF9, var15, var11, var10);
            class241.method1598(arg0, -7, var15, arg5, var11);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1000(int arg0) {
        if (arg0 != 768) {
            field2514 = (class307) null;
        }
        field2511++;
        class159.field2601.method1877(-29702);
        class341.field5286.method1877(-29702);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 76)
    public static void method1001(boolean arg0) {
        field2514 = null;
        if (arg0) {
            method999(-72, -23, -126, -120, -67, -126, 24, -3);
        }
        field2515 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIZ)V", line = 99)
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2510 = arg4;
        this.field2513 = arg1;
        this.field2516 = arg0;
        this.field2509 = arg5;
        this.field2517 = arg2;
        this.field2512 = arg6;
        this.field2508 = arg3;
    }
}
