import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public abstract class class15 {

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "J")
    public static volatile long field232 = 0L;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Ll;")
    public static class22 field233 = new class22();

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Lca;")
    public static class6 field238 = null;

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "Ln;")
    public static class26 field242 = class9.method82(255, "Key");

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "Ln;")
    private static class26 field241 = class9.method82(255, "Combat Training");

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "I")
    public static volatile int field239 = 0;

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "[[[[B")
    public static byte[][][][] field236 = new byte[5][][][];

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "[J")
    public static long[] field237 = new long[32];

    @OriginalMember(owner = "mapview!h", name = "l", descriptor = "Ln;")
    public static class26 field243 = class9.method82(255, "loc)3dat");

    @OriginalMember(owner = "mapview!h", name = "m", descriptor = "Ln;")
    public static class26 field244 = class9.method82(255, "world");

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method112(boolean arg0) {
        if (arg0) {
            field243 = null;
        }
        if (class35.field419 != null) {
            class28 var1 = class35.field419;
            synchronized (class35.field419) {
                class35.field419 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)[Ln;", line = 40)
    public static final class26[] method113(int arg0) {
        return arg0 == 32 ? new class26[] { class21.field297, class8.field165, class21.field306, class33.field406, mapview.field34, class23.field324, class28.field361, class33.field402, class28.field360, class30.field381, class4.field112, field241, class6.field154, class6.field150, class7.field163, class6.field152, class9.field189, class11.field205, class26.field350, class28.field370, class17.field254, class28.field364, class8.field179, class11.field198, class19.field272, class21.field304, class4.field120, class35.field421, class7.field157, class29.field374, class7.field160, class33.field404, class34.field407, class29.field379, class30.field383, class4.field114, class30.field389, class17.field258, class1.field68, class8.field170, class18.field259, class5.field138, class7.field159, class7.field161, class4.field106, class9.field184, class22.field311, mapview.field18, class19.field270, class5.field129, class17.field257, class4.field108, class10.field194, class5.field127, class1.field72, class8.field169, class8.field171, class21.field305, class10.field192, class4.field110, class26.field351, class11.field199, class30.field385, class30.field385, class30.field385, class30.field385, class30.field385, class26.field342, class19.field267, class30.field385, class28.field365 } : (class26[]) null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 67)
    public static void method114(byte arg0) {
        field244 = null;
        field241 = null;
        field236 = null;
        field233 = null;
        field237 = null;
        field243 = null;
        field242 = null;
        if (arg0 != -60) {
            field237 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)V")
    public abstract void method62(int arg0);

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZII)I")
    public abstract int method63(boolean arg0, int arg1, int arg2);
}
