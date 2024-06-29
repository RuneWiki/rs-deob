import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class189 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Z")
    public static boolean field3125 = false;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Lok;")
    private static class146 field3128 = class235.method1724(-12908, " is already on your friend list)3");

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Lok;")
    public static class146 field3134 = field3128;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[B")
    public byte[] field3130;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "[B")
    public byte[] field3137;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[Lbe;")
    public static class292[] field3127;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V", line = 27)
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 20 / ((-arg0 - 14) / 42);
        field3131++;
        int var8 = class21.method153(-122, arg5, class123.field2008, class318.field5394);
        int var9 = class21.method153(-128, arg4, class123.field2008, class318.field5394);
        int var10 = class21.method153(-124, arg2, class151.field2564, class126.field2058);
        int var11 = class21.method153(-120, arg3, class151.field2564, class126.field2058);
        int var12 = class21.method153(-120, arg5 + arg6, class123.field2008, class318.field5394);
        int var13 = class21.method153(-117, arg4 - arg6, class123.field2008, class318.field5394);
        for (int var14 = var8; var14 < var12; var14++) {
            class40.method281(arg1, var10, class81.field1297[var14], var11, 7);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class40.method281(arg1, var10, class81.field1297[var15], var11, 7);
        }
        int var16 = class21.method153(-128, arg2 + arg6, class151.field2564, class126.field2058);
        int var17 = class21.method153(-125, arg3 - arg6, class151.field2564, class126.field2058);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class81.field1297[var18];
            class40.method281(arg1, var10, var19, var16, 7);
            class40.method281(arg1, var17, var19, var11, 7);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 77)
    public static void method1465(byte arg0) {
        field3134 = null;
        field3127 = null;
        field3128 = null;
        int var1 = -123 % ((arg0 - 55) / 39);
    }
}
