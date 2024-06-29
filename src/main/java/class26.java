import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    public static int[] field396 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lkb;")
    public static class93 field394 = class76.method390("(Z", 0);

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field415 = -1;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Lkb;")
    private static class93 field420 = class76.method390("Loaded sprites", 0);

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lkb;")
    public static class93 field422 = field420;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field408 = 2301979;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lme;")
    public static class114 field398;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lob;")
    public static class129 field399;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lef;")
    public static class45 field410;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lh;")
    public static class65[] field397;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method143(int arg0) {
        field398 = null;
        field397 = null;
        field420 = null;
        field394 = null;
        field422 = null;
        field410 = null;
        if (arg0 == -5344) {
            field399 = null;
            field396 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method144(byte arg0) {
        field418++;
        if (arg0 != -78) {
            field394 = null;
        }
        if (!class103.field1905) {
            return;
        }
        class65 var1 = class113.method621(class188.field3693, class148.field2855, -1);
        if (var1 != null && var1.field1150 != null) {
            class104 var2 = new class104();
            var2.field1924 = var1.field1150;
            var2.field1919 = var1;
            class82.method421(var2, false);
        }
        class103.field1905 = false;
        class160.method1095(0, var1);
    }
}
