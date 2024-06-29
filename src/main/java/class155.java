import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class155 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lrf;")
    public static class163 field3206 = class53.method392(47, "M");

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3216 = 0;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lrf;")
    public static class163 field3217 = class53.method392(84, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "B")
    public static byte field3214;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lu;")
    public static class184 field3210;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Z")
    public static boolean field3211;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[[[[Z")
    public static boolean[][][][] field3212;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[BI)Lrf;")
    public static final class163 method992(int arg0, int arg1, byte[] arg2, int arg3) {
        field3207++;
        class163 var4 = new class163();
        var4.field3341 = 0;
        if (arg3 != -2766) {
            method996(-67, -37, false);
        }
        var4.field3320 = new byte[arg1];
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field3320[var4.field3341++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III[[[I)V")
    public static final void method993(int arg0, int arg1, int arg2, int[][][] arg3) {
        class41.field847 = arg0;
        class80.field1620 = arg1;
        class92.field2007 = arg2;
        class97.field2054 = new class111[arg0][arg1][arg2];
        class31.field620 = new int[arg0][arg1 + 1][arg2 + 1];
        class99.field2086 = arg3;
        class7.method62();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)J")
    public static final synchronized long method994(int arg0) {
        field3208++;
        long var1 = System.currentTimeMillis();
        if (class73.field1533 > var1) {
            class200.field3957 += class73.field1533 - var1;
        }
        class73.field1533 = var1;
        if (arg0 < 4) {
            field3211 = true;
        }
        return class200.field3957 + var1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method995(byte arg0) {
        field3206 = null;
        field3210 = null;
        field3217 = null;
        if (arg0 != -22) {
            method996(9, 60, false);
        }
        field3212 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)I")
    public static final int method996(int arg0, int arg1, boolean arg2) {
        field3213++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (!arg2) {
            field3212 = null;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
