import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class122 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[[B")
    public static byte[][] field2389 = new byte[250][];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lsd;")
    public static class166 field2388 = class135.method935("Lade Sprites )2 ", 0);

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lsd;")
    public static class166 field2395 = class135.method935("", 0);

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[[[B")
    public static byte[][][] field2387 = new byte[4][104][104];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lre;")
    public static class158 field2393;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Led;")
    public class42 field2386;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static void method878(boolean arg0) {
        field2395 = null;
        if (!arg0) {
            method878(true);
        }
        field2388 = null;
        field2389 = null;
        field2387 = null;
        field2393 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILnf;I)V")
    public static final void method879(byte arg0, int arg1, class123 arg2, int arg3) {
        if (arg0 != 21) {
            field2393 = null;
        }
        field2396++;
        if (arg2.field3543 == arg3 && arg3 != -1) {
            int var4 = class110.method798(arg3, 12).field1276;
            if (var4 == 1) {
                arg2.field3529 = 0;
                arg2.field3547 = 0;
                arg2.field3530 = arg1;
                arg2.field3519 = 0;
            }
            if (var4 == 2) {
                arg2.field3547 = 0;
            }
        } else if (arg3 == -1 || arg2.field3543 == -1 || class110.method798(arg3, 12).field1282 >= class110.method798(arg2.field3543, 12).field1282) {
            arg2.field3543 = arg3;
            arg2.field3483 = arg2.field3514;
            arg2.field3519 = 0;
            arg2.field3530 = arg1;
            arg2.field3547 = 0;
            arg2.field3529 = 0;
        }
    }
}
