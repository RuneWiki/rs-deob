import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public abstract class class2 {

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "J")
    public static volatile long field14 = 0L;

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "La;")
    public static class1 field21 = class3.method36("Dairy Churn", -92);

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "La;")
    public static class1 field19 = class3.method36("Find", -97);

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "La;")
    public static class1 field18 = class3.method36("Anvil", -124);

    @OriginalMember(owner = "mapview!aa", name = "l", descriptor = "La;")
    public static class1 field24 = class3.method36("Pub)4Bar", -95);

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Z")
    public static boolean field16 = false;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "La;")
    public static class1 field15 = class3.method36("loc)3dat", -107);

    @OriginalMember(owner = "mapview!aa", name = "m", descriptor = "La;")
    public static class1 field25 = class3.method36("Next page", -96);

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Lga;")
    public static class13 field13 = new class13();

    @OriginalMember(owner = "mapview!aa", name = "n", descriptor = "I")
    public static int field26 = -1;

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "[B")
    public static byte[] field20;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "[I")
    public static int[] field22;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "[[[I")
    public static int[][][] field17;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I[B)[B", line = 7)
    public static final byte[] method30(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 != 2889) {
            method33(-58);
        }
        class18.method90(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)V", line = 24)
    public static final void method31(int arg0) {
        class13 var1 = field13;
        synchronized (field13) {
            class27.field381 = class23.field210;
            if (class28.field396 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class21.field200[var2] = false;
                }
                class28.field396 = class5.field56;
            } else {
                while (class5.field56 != class28.field396) {
                    int var3 = class30.field417[class5.field56];
                    class5.field56 = class5.field56 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class21.field200[var3] = true;
                    } else {
                        class21.field200[~var3] = false;
                    }
                }
            }
            class23.field210 = class26.field366;
            if (arg0 != 22378) {
                field15 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(I)V", line = 72)
    public static void method32(int arg0) {
        field24 = null;
        field13 = null;
        field21 = null;
        field18 = null;
        field22 = null;
        field25 = null;
        field17 = null;
        if (arg0 != -1) {
            field25 = null;
        }
        field15 = null;
        field20 = null;
        field19 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "(I)V", line = 94)
    public static final void method33(int arg0) {
        class7 var1 = class13.field116;
        synchronized (class13.field116) {
            if (arg0 < 6) {
                field25 = null;
            }
            class30.field413 = class41.field521;
            class40.field512 = class26.field372;
            class7.field70 = class33.field451;
            class35.field475 = class5.field49;
            class8.field84 = class27.field380;
            class36.field480 = class40.field516;
            class5.field49 = 0;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BII)I")
    public abstract int method34(byte arg0, int arg1, int arg2);
}
