import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class1 extends class32 {

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "[[I")
    public static int[][] field5 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Z")
    public static boolean field6 = false;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lij;")
    private static class50 field2 = class78.method578(122, "K");

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lij;")
    public static class50 field3 = field2;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lij;")
    public static class50 field12 = field2;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
    public static int[] field7 = new int[2];

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lij;")
    public static class50 field10 = class78.method578(125, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static final void method1(int arg0) {
        class36.field701 = null;
        class102.field1869 = null;
        class80.field1466 = null;
        class179.field2984 = null;
        class203.field3383 = null;
        class196.field3250 = null;
        if (arg0 != -747) {
            method2(43, (byte) -55, 89);
        }
        class130.field2280 = null;
        class172.field2871 = null;
        class186.field3056 = null;
        class201.field3315 = null;
        class155.field2702 = null;
        field11++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)V")
    public static final void method2(int arg0, byte arg1, int arg2) {
        field13++;
        class86 var3 = class184.field3022[class201.field3312][arg0][arg2];
        if (var3 == null) {
            class235.method1593(class201.field3312, arg0, arg2);
        } else if (arg1 == -35) {
            int var4 = -99999999;
            class238 var5 = (class238) var3.method689(1001);
            class238 var6 = null;
            while (var5 != null) {
                class239 var13 = class15.method111(var5.field4043.field1993, false);
                int var14 = var13.field4093;
                if (var13.field4117 == 1) {
                    var14 = (var5.field4043.field2009 + 1) * var14;
                }
                if (var4 < var14) {
                    var6 = var5;
                    var4 = var14;
                }
                var5 = (class238) var3.method688(arg1 ^ 0x42);
            }
            if (var6 == null) {
                class235.method1593(class201.field3312, arg0, arg2);
            } else {
                var3.method677(var6, -1);
                class114 var7 = null;
                class238 var8 = (class238) var3.method689(1001);
                class114 var9 = null;
                while (var8 != null) {
                    class114 var12 = var8.field4043;
                    if (var6.field4043.field1993 != var12.field1993) {
                        if (var7 == null) {
                            var7 = var12;
                        }
                        if (var7.field1993 != var12.field1993 && var9 == null) {
                            var9 = var12;
                        }
                    }
                    var8 = (class238) var3.method688(arg1 ^ 0x67);
                }
                long var10 = (long) ((arg2 << 7) + arg0 + 1610612736);
                class5.method30(class201.field3312, arg0, arg2, class187.method1260((byte) 23, arg0 * 128 + 64, arg2 * 128 + 64, class201.field3312), var6.field4043, var10, var7, var9);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method3(byte arg0) {
        field3 = null;
        field5 = null;
        field7 = null;
        field2 = null;
        field10 = null;
        if (arg0 == 38) {
            field12 = null;
        }
    }
}
