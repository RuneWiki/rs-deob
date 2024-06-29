import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class254 {

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public static int field3581 = 0;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "Lfja;")
    public static class783 field3579 = new class783(83, -1);

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "F")
    public static float field3578;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "J")
    public static long field3577;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Z)V")
    public static void method1672(boolean arg0) {
        if (!arg0) {
            method1672(true);
        }
        field3579 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
    public static final void method1673(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1673(arg0, arg1, var6 - 1, arg3, 21);
            method1673(var6 + 1, arg1, arg2, arg3, 58);
        }
        field3576++;
        if (arg4 <= 20) {
            method1672(true);
        }
    }
}
