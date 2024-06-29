import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class385 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[I")
    public static int[] field5277 = new int[13];

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
    public static boolean field5284;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public int field5278;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Led;")
    public class384 field5279;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[I")
    public int[] field5276;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "[[[Lwr;")
    public static class52[][][] field5285;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method2345(int arg0) {
        field5285 = null;
        field5277 = null;
        if (arg0 != 22353) {
            field5277 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BI)V")
    public static final void method2346(String arg0, int arg1, int arg2, String arg3, String arg4, String arg5, byte arg6, int arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class217.field3135[var8] = class217.field3135[var8 - 1];
            class13.field115[var8] = class13.field115[var8 - 1];
            class151.field2081[var8] = class151.field2081[var8 - 1];
            class372.field5125[var8] = class372.field5125[var8 - 1];
            class290.field4118[var8] = class290.field4118[var8 - 1];
            class416.field5726[var8] = class416.field5726[var8 - 1];
            class416.field5707[var8] = class416.field5707[var8 - 1];
        }
        field5286++;
        class217.field3135[0] = arg2;
        class13.field115[0] = arg1;
        class151.field2081[0] = arg3;
        if (arg6 != 103) {
            method2346((String) null, -33, 114, (String) null, (String) null, (String) null, (byte) -15, -83);
        }
        class372.field5125[0] = arg0;
        class290.field4118[0] = arg4;
        class416.field5707[0] = arg7;
        class486.field6889++;
        class416.field5726[0] = arg5;
        class364.field5011 = class86.field1217;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIII)V")
    public static final void method2347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5282++;
        int var6 = 30 / ((arg0 - 73) / 38);
        int var7 = class67.method630(0, arg2, class151.field2091, class444.field6338);
        int var8 = class67.method630(0, arg3, class151.field2091, class444.field6338);
        int var9 = class67.method630(0, arg5, class103.field1457, class295.field4153);
        int var10 = class67.method630(0, arg1, class103.field1457, class295.field4153);
        for (int var11 = var7; var11 <= var8; var11++) {
            class61.method558(var10, -10647, class373.field5141[var11], var9, arg4);
        }
    }

    static {
        new class151("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field5283 = 0;
        field5284 = true;
    }
}
