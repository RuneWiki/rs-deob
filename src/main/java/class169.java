import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class169 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lmb;")
    private static class96 field2974 = class243.method1708("scroll:", (byte) 93);

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "S")
    public static short field2971 = 256;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lmb;")
    public static class96 field2970 = class243.method1708("gleiten:", (byte) 111);

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lmb;")
    public static class96 field2972 = class243.method1708("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) 100);

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lmb;")
    public static class96 field2965 = field2974;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Z")
    public static boolean field2977 = true;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "J")
    public static long field2966 = 0L;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Lmb;")
    public static class96 field2978 = field2974;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lmb;")
    public static class96 field2967 = class243.method1708("Benutzen", (byte) 124);

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lmb;")
    private static class96 field2976 = class243.method1708("You can(Wt add yourself to your own friend list)3", (byte) 111);

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lmb;")
    public static class96 field2975 = field2976;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "B")
    public static byte field2964;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lw;")
    public static class107 field2968;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[[[B")
    public static byte[][][] field2969;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)J")
    public static final long method1213(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        return var3 == null || var3.field3279 == null ? 0L : var3.field3279.field111;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
    public static final void method1214(int arg0, boolean arg1) {
        class103.field1736 = arg1;
        class269.field4690 = -1;
        class141.field2525 = arg0;
        class33.field551 = 0;
        field2973++;
        class74.field1295 = -1;
        class85.field1436 = null;
        class249.field4308 = 1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)I")
    public static final int method1215(byte arg0, int arg1) {
        field2963++;
        if (!(arg1 < 97 || arg1 > 122) || !(arg1 < 224 || arg1 > 254 || arg1 == 247)) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            if (arg0 < 63) {
                field2962 = 54;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1216(int arg0) {
        if (arg0 != 122) {
            return;
        }
        field2969 = null;
        field2976 = null;
        field2972 = null;
        field2965 = null;
        field2974 = null;
        field2970 = null;
        field2968 = null;
        field2975 = null;
        field2967 = null;
        field2978 = null;
    }
}
