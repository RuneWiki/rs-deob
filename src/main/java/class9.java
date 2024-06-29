import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[Lrf;")
    public static class163[] field180 = new class163[8];

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lrf;")
    public static class163 field186 = class53.method392(-59, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lrf;")
    public static class163 field179 = class53.method392(106, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lrf;")
    public static class163 field189 = class53.method392(91, ":duelfriend:");

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lrf;")
    public static class163 field194 = class53.method392(-75, "Angreifen");

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
    public static int[] field193 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "J")
    public long field192;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Ls;")
    public class166 field184;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method71(String arg0, int arg1) throws ClassNotFoundException {
        field190++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            int var2 = 19 % ((arg1 - 37) / 33);
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public static final void method72(int arg0, int arg1) {
        class180.field3611 = 1;
        class209.field4074 = 0;
        class158.field3230 = arg1;
        class155.field3211 = false;
        field188++;
        class155.field3210 = null;
        class29.field543 = arg0;
        class51.field1024 = -1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Lmh;")
    public static final class121 method73(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2359; var4++) {
            class121 var5 = var3.field2344[var4];
            if ((var5.field2536 >> 29 & 0x3L) == 2L && var5.field2544 == arg1 && var5.field2542 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)J")
    public static final long method74(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2359; var4++) {
            class121 var5 = var3.field2344[var4];
            if ((var5.field2536 >> 29 & 0x3L) == 2L && var5.field2544 == arg1 && var5.field2542 == arg2) {
                return var5.field2536;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method75(int arg0) {
        field179 = null;
        field193 = null;
        field194 = null;
        field180 = null;
        field189 = null;
        field186 = null;
        if (arg0 != 1) {
            method76(null, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lrf;B)V")
    public static final void method76(class163 arg0, byte arg1) {
        field187++;
        if (class21.field366 >= 2) {
            if (arg0.method1038(class196.field3895, 0)) {
                System.gc();
            }
            if (arg0.method1038(class65.field1396, 0)) {
                class117.method807(-1);
            }
            if (arg0.method1038(class31.field624, 0)) {
                class96.field2047 = true;
            }
            if (arg0.method1038(class96.field2044, 0)) {
                class96.field2047 = false;
            }
            arg0.method1038(class20.field342, 0);
            arg0.method1038(class85.field1865, 0);
            if (arg0.method1038(class205.field4016, 0)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class103.field2163[var2].field2736[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method1024(108, class205.field4021) && class36.field700 != 0) {
                class60.method430(false, arg0.method1039(6, 66).method1025(20559));
            }
            if (arg0.method1038(class147.field3037, 0) && class36.field700 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1024(96, class111.field2336)) {
                class49.field953 = arg0.method1039(12, -60).method1052(65).method1025(20559);
                class43.method267((byte) -65, class180.method1216(new class163[] { class121.field2558, class34.method217(class49.field953, -98) }, false), null, 0);
            }
            if (arg0.method1038(class210.field4093, 0)) {
                class135.field2791 = true;
            }
        }
        class141.field2896.method326(104, 142);
        if (arg1 >= -104) {
            method76(null, (byte) 51);
        }
        class155.field3209++;
        class141.field2896.method370(arg0.method1029(127) - 1, (byte) 123);
        class141.field2896.method342(true, arg0.method1039(2, -108));
    }
}
