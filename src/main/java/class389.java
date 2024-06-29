import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class389 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    private int field5497 = 0;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lva;")
    private class288 field5492;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "J")
    public static long field5493 = 0L;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[[I")
    public static int[][] field5495 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "S")
    public static short field5501 = 32767;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lgj;")
    public static class381 field5503;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lqf;")
    private class406 field5504;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
    public static int[] field5496;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[[[I")
    public static int[][][] field5494;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method2490(boolean arg0, String arg1) {
        field5498++;
        if (!arg0) {
            method2492(98);
        }
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class450.method2790((byte) 80, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Lqf;")
    public final class406 method2491(int arg0) {
        this.field5497 = 0;
        if (arg0 >= -72) {
            this.method2494((byte) -110);
        }
        field5499++;
        return this.method2494((byte) -119);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static void method2492(int arg0) {
        field5495 = null;
        if (arg0 != 8) {
            field5495 = null;
        }
        field5496 = null;
        field5494 = null;
        field5503 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILtq;)Lgq;")
    public static final class300 method2493(int arg0, int arg1, int arg2, class376 arg3) {
        field5502++;
        int var4 = 10 / ((arg0 - 53) / 60);
        class236 var5 = new class236(arg3.method2431((byte) 62, arg2, arg1));
        class300 var6 = new class300(arg1, var5.method1562(false), var5.method1562(false), var5.method1597(3641), var5.method1597(3641), var5.method1574(-5) == 1, var5.method1574(-122), var5.method1574(-112));
        int var7 = var5.method1574(-72);
        for (int var8 = 0; var8 < var7; var8++) {
            var6.field4211.method509((byte) 121, new class68(var5.method1574(-34), var5.method1617((byte) 48), var5.method1617((byte) 48), var5.method1617((byte) 48), var5.method1617((byte) 48), var5.method1617((byte) 48), var5.method1617((byte) 48), var5.method1617((byte) 48), var5.method1617((byte) 48)));
        }
        var6.method1976(-15044);
        return var6;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Lqf;")
    public final class406 method2494(byte arg0) {
        field5500++;
        if (this.field5497 > 0 && this.field5492.field4030[this.field5497 - 1] != this.field5504) {
            class406 var2 = this.field5504;
            this.field5504 = var2.field5862;
            return var2;
        } else if (arg0 >= -117) {
            return null;
        } else {
            while (this.field5492.field4025 > this.field5497) {
                class406 var3 = this.field5492.field4030[this.field5497++].field5862;
                if (this.field5492.field4030[this.field5497 - 1] != var3) {
                    this.field5504 = var3.field5862;
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lva;)V")
    public class389(class288 arg0) {
        this.field5492 = arg0;
    }
}
