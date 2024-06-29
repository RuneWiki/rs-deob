import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class190 extends class287 {

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "[F")
    public static float[] field3177 = new float[4];

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Leh;")
    public static class94 field3181 = new class94(8);

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lgb;")
    public static class212 field3182 = new class212(64);

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Ltl;")
    private static class59 field3188 = class85.method639("red:", 9588);

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Z")
    public static boolean field3187 = false;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Ltl;")
    public static class59 field3186 = field3188;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Ltl;")
    public static class59 field3189 = field3188;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[Z")
    public static boolean[] field3184;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[[B")
    public static byte[][] field3185;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 14)
    public static void method1400(int arg0) {
        field3182 = null;
        field3177 = null;
        field3186 = null;
        field3188 = null;
        field3184 = null;
        field3189 = null;
        if (arg0 != 64) {
            method1400(-52);
        }
        field3185 = (byte[][]) null;
        field3181 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([BI)Lvj;", line = 31)
    public static final class95 method1401(byte[] arg0, int arg1) {
        field3176++;
        int var2 = -11 % ((70 - arg1) / 37);
        if (arg0 == null) {
            return null;
        }
        class95 var3;
        if (class55.field815) {
            var3 = new class204(arg0, class243.field4061, class311.field5274, class41.field615, class236.field3925, class53.field794);
        } else {
            var3 = new class118(arg0, class243.field4061, class311.field5274, class41.field615, class236.field3925, class53.field794);
        }
        class133.method974((byte) 62);
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILfg;JZ)V", line = 71)
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, class176 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class296 var8 = new class296();
        var8.field5073 = arg4;
        var8.field5075 = arg1 * 128 + 64;
        var8.field5072 = arg2 * 128 + 64;
        var8.field5083 = arg3;
        var8.field5074 = arg5;
        var8.field5076 = arg6;
        if (class120.field2010[arg0][arg1][arg2] == null) {
            class120.field2010[arg0][arg1][arg2] = new class245(arg0, arg1, arg2);
        }
        class120.field2010[arg0][arg1][arg2].field4085 = var8;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(II)V", line = 101)
    public class190(int arg0, int arg1) {
        this.field3180 = arg0;
        this.field3175 = arg1;
    }
}
