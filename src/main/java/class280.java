import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class280 {

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "[[I")
    public static int[][] field4443 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lqh;")
    public static class201 field4435;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[I")
    public static int[] field4434;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[S")
    public static short[] field4437;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)Lad;")
    public static final class252 method1884(byte arg0, int arg1) {
        field4441++;
        class252 var2 = (class252) class49.field867.method480((long) arg1, 83);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -52) {
            field4434 = null;
        }
        byte[] var3 = class162.field2582.method1357(arg1, 32, -1);
        class252 var4 = new class252();
        if (var3 != null) {
            var4.method1719(new class221(var3), (byte) -125);
        }
        var4.method1715((byte) -111);
        class49.field867.method474((long) arg1, (byte) 82, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(DI)V")
    public static final void method1885(double arg0, int arg1) {
        int var3 = -108 / ((74 - arg1) / 33);
        if (class67.field1106 != arg0) {
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
                class95.field1564[var4] = var5 <= 255 ? var5 : 255;
            }
            class67.field1106 = arg0;
        }
        field4436++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lf;I)V")
    public static final void method1886(class36 arg0, int arg1) {
        if (class67.field1110 == arg0.field569) {
            class275.field4352[arg0.field705] = true;
        }
        if (arg1 == 32) {
            field4432++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILf;)Lf;")
    public static final class36 method1887(int arg0, class36 arg1) {
        field4431++;
        if (arg0 != 1) {
            return null;
        } else if (arg1.field632 == -1) {
            int var2 = arg1.field648 >>> 16;
            class40 var3 = new class40(class128.field2062);
            for (class258 var4 = (class258) var3.method347(52); var4 != null; var4 = (class258) var3.method349(-18635)) {
                if (var4.field4100 == var2) {
                    return class64.method455((int) var4.field3247, arg0 ^ 0x234FB891);
                }
            }
            return null;
        } else {
            return class64.method455(arg1.field632, 592427152);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILqh;)Lea;")
    public static final class37 method1888(int arg0, int arg1, int arg2, class201 arg3) {
        if (arg1 == 14) {
            field4442++;
            return class239.method1657(arg0, arg1 ^ 0xFFFFFF80, arg2, arg3) ? class202.method1389(true) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method1889(byte arg0) {
        field4434 = null;
        field4435 = null;
        int var1 = -37 / ((49 - arg0) / 41);
        field4437 = null;
        field4443 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
    public static final int method1890(int arg0, int arg1) {
        field4439++;
        if (arg0 != -21830) {
            field4438 = 55;
        }
        return arg1 >>> 7;
    }
}
