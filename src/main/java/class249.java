import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class249 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field4295 = 3353893;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Loh;")
    public static class258 field4301 = class153.method1046("<col=00ff00>", 102);

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field4298 = 0;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Loh;")
    private static class258 field4297 = class153.method1046("Loaded title screen", 90);

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Loh;")
    public static class258 field4300 = field4297;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field4303 = 0;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Loh;")
    public static class258 field4305 = class153.method1046("null", 122);

    @OriginalMember(owner = "client!em", name = "e", descriptor = "F")
    public static float field4299;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[Lkl;")
    public static class65[] field4296;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 23)
    public static void method1693(byte arg0) {
        field4305 = null;
        field4297 = null;
        field4300 = null;
        field4296 = null;
        field4301 = null;
        int var1 = 111 / ((arg0 + 59) / 33);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([JB[Ljava/lang/Object;II)V", line = 47)
    public static final void method1694(long[] arg0, byte arg1, Object[] arg2, int arg3, int arg4) {
        if (arg1 != -93) {
            method1694((long[]) null, (byte) -32, (Object[]) null, -86, -36);
        }
        field4304++;
        if (arg4 >= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        long var6 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var6;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var8;
        int var9 = arg4;
        for (int var10 = arg4; var10 < arg3; var10++) {
            if (((long) (var10 & 0x1) + var6) > arg0[var10]) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var9];
                arg0[var9] = var11;
                Object var13 = arg2[var10];
                arg2[var10] = arg2[var9];
                arg2[var9++] = var13;
            }
        }
        arg0[arg3] = arg0[var9];
        arg0[var9] = var6;
        arg2[arg3] = arg2[var9];
        arg2[var9] = var8;
        method1694(arg0, (byte) -93, arg2, var9 - 1, arg4);
        method1694(arg0, (byte) -93, arg2, arg3, var9 + 1);
    }
}
