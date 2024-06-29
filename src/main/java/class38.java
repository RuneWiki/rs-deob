import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class38 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field392 = new int[14];

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lph;")
    public static class114 field394 = new class114(128);

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[Lur;")
    public static class91[] field397 = new class91[32768];

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[Lum;")
    public static class184[] field396 = new class184[5];

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[Lom;")
    public static class127[] field398;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field399;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lam;")
    public static class286 field390;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field391;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[[S")
    public static short[][] field395;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method182(byte arg0) {
        field396 = null;
        if (arg0 != -75) {
            return;
        }
        field394 = null;
        field392 = null;
        field391 = null;
        field395 = null;
        field398 = null;
        field390 = null;
        field397 = null;
        field399 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3) {
        if (class116.field1450 != null) {
            class116.field1450[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public static final void method184(byte arg0) {
        field393++;
        if (class27.field264) {
            class27.field264 = false;
            class307.field4156 = null;
            class289.field3932 = null;
            int var1 = 69 / ((arg0 + 26) / 34);
        }
    }

    static {
        for (int var0 = 0; var0 < field396.length; var0++) {
            field396[var0] = new class184();
        }
        field398 = new class127[14];
        field399 = "Members object";
    }
}
