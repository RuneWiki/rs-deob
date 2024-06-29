import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class453 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lew;")
    private class240 field6342;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    private int field6348;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field6347;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public int field6346;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lug;")
    public static class453 field6343 = new class453(0, 3, class240.field3097);

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lug;")
    public static class453 field6349 = new class453(1, 3, class240.field3097);

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lug;")
    public static class453 field6351 = new class453(2, 4, class240.field3093);

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lug;")
    public static class453 field6352 = new class453(3, 1, class240.field3097);

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lug;")
    public static class453 field6353 = new class453(4, 2, class240.field3097);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lug;")
    public static class453 field6354 = new class453(5, 3, class240.field3097);

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lug;")
    public static class453 field6355 = new class453(6, 4, class240.field3097);

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field6356 = class233.method1468(16, (byte) -37);

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "[[I")
    public static int[][] field6358 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "[C")
    private static char[] field6357 = new char[64];

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method2655(byte arg0) {
        field6353 = null;
        field6352 = null;
        field6354 = null;
        field6355 = null;
        field6349 = null;
        field6358 = null;
        field6357 = null;
        field6351 = null;
        if (arg0 != 61) {
            field6355 = null;
        }
        field6343 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)Lug;")
    public static final class453 method2656(byte arg0, int arg1) {
        field6345++;
        if (arg0 != -66) {
            method2655((byte) -36);
        }
        if (arg1 == 0) {
            return field6343;
        } else if (arg1 == 1) {
            return field6349;
        } else if (arg1 == 2) {
            return field6351;
        } else if (arg1 == 3) {
            return field6352;
        } else if (arg1 == 4) {
            return field6353;
        } else if (arg1 == 5) {
            return field6354;
        } else if (arg1 == 6) {
            return field6355;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IILew;)V")
    private class453(int arg0, int arg1, class240 arg2) {
        this.field6342 = arg2;
        this.field6348 = arg1;
        this.field6347 = arg0;
        this.field6346 = this.field6342.field3090 * this.field6348;
        if (this.field6347 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6350++;
        throw new IllegalStateException();
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field6357[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field6357[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field6357[var2] = (char) (var2 + 48 - 52);
        }
        field6357[62] = '+';
        field6357[63] = '/';
    }
}
