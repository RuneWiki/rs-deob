import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class19 {

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lt;")
    public static class35 field218 = class3.method28(false, "Makeover Mage");

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "[[B")
    public static byte[][] field219 = new byte[50][];

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Lt;")
    public static class35 field222 = class3.method28(false, "map");

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Lt;")
    public static class35 field224 = class3.method28(false, "Furnace");

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "[[[[B")
    public static byte[][][][] field223 = new byte[5][][][];

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lea;")
    public static class10 field216;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "[I")
    public static int[] field215;

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "[I")
    public static int[] field217;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)B", line = 11)
    public static final byte method116(int arg0) {
        int var1 = 80 % ((57 - arg0) / 44);
        return class31.field382 == null ? 0 : class31.field382[class31.field392];
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)[Lja;", line = 38)
    public static final class20[] method117(int arg0) {
        if (arg0 != 127) {
            field223 = null;
        }
        class20[] var1 = new class20[class16.field189];
        for (int var2 = 0; var2 < class16.field189; var2++) {
            class20 var3 = var1[var2] = new class20();
            var3.field229 = class15.field177;
            var3.field228 = class23.field258;
            var3.field227 = class34.field426[var2];
            var3.field233 = class30.field341[var2];
            var3.field230 = class36.field448[var2];
            var3.field226 = class2.field67[var2];
            var3.field232 = class24.field275;
            var3.field231 = class13.field174[var2];
        }
        class18.method115(-1);
        return var1;
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(I)V", line = 71)
    public static void method118(int arg0) {
        field217 = null;
        field219 = null;
        if (arg0 != 0) {
            return;
        }
        field222 = null;
        field224 = null;
        field223 = null;
        field215 = null;
        field218 = null;
        field216 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(I)J", line = 137)
    public static final synchronized long method119(int arg0) {
        long var1 = System.currentTimeMillis();
        if (class34.field425 > var1) {
            class8.field133 += class34.field425 - var1;
        }
        if (arg0 <= 8) {
            field217 = null;
        }
        class34.field425 = var1;
        return var1 + class8.field133;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V", line = 156)
    public static final void method120(byte arg0) {
        class8 var1 = class26.field302;
        synchronized (class26.field302) {
            mapview.field5 = class31.field381;
            int var2 = -70 / ((61 - arg0) / 35);
            if (class27.field312 < 0) {
                for (int var3 = 0; var3 < 112; var3++) {
                    class24.field271[var3] = false;
                }
                class27.field312 = class29.field324;
            } else {
                while (class29.field324 != class27.field312) {
                    int var4 = class29.field326[class29.field324];
                    class29.field324 = class29.field324 + 1 & 0x7F;
                    if (var4 < 0) {
                        class24.field271[~var4] = false;
                    } else {
                        class24.field271[var4] = true;
                    }
                }
            }
            class31.field381 = class34.field427;
        }
    }
}
