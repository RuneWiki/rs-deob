import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field235 = 1;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lid;")
    public static class60 field230 = class11.method72("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lid;")
    private static class60 field239 = class11.method72("You need a members account to login to this world)3", (byte) 101);

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lid;")
    public static class60 field238 = class11.method72("(Y", (byte) 112);

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lid;")
    public static class60 field241 = field239;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lid;")
    private static class60 field244 = class11.method72("Take", (byte) 115);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lid;")
    public static class60 field231 = field244;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lqd;")
    public static class115 field240 = new class115(30);

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Z")
    public static boolean field245 = false;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lrc;")
    public static final class121 method81(int arg0, int arg1) {
        class121 var2 = (class121) class9.field134.method918(-89, (long) arg1);
        field242++;
        if (arg0 != 21299) {
            field245 = false;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field2225.method473((byte) 119, 13, arg1);
        class121 var4 = new class121();
        var4.field2770 = arg1;
        if (var3 != null) {
            var4.method939(6, new class103(var3));
        }
        class9.field134.method914(var4, (long) arg1, (byte) 81);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        field244 = null;
        field241 = null;
        field230 = null;
        if (arg0 > -40) {
            field239 = null;
        }
        field239 = null;
        field238 = null;
        field240 = null;
        field231 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lie;Lie;BLie;)V")
    public static final void method83(class61 arg0, class61 arg1, byte arg2, class61 arg3) {
        class24.field598 = arg0;
        field233++;
        if (arg2 >= -101) {
            field239 = null;
        }
        class87.field2179 = arg3;
        class69.field1650 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[B)V")
    public static final void method84(int arg0, byte[] arg1) {
        field236++;
        class103 var2 = new class103(arg1);
        var2.field2501 = arg1.length - 2;
        class35.field886 = var2.method808(-20054);
        class104.field2551 = new int[class35.field886];
        class90.field2236 = new int[class35.field886];
        class100.field2442 = new int[class35.field886];
        class89.field2205 = new byte[class35.field886][];
        class136.field3098 = new int[class35.field886];
        var2.field2501 = arg1.length - class35.field886 * 8 - 7;
        class146.field3281 = var2.method808(-20054);
        class90.field2237 = var2.method808(-20054);
        int var3 = (var2.method829((byte) 100) & 0xFF) + 1;
        for (int var4 = 0; var4 < class35.field886; var4++) {
            class90.field2236[var4] = var2.method808(-20054);
        }
        for (int var5 = 0; var5 < class35.field886; var5++) {
            class100.field2442[var5] = var2.method808(-20054);
        }
        int var6 = 0;
        if (arg0 > -118) {
            field230 = null;
        }
        while (var6 < class35.field886) {
            class104.field2551[var6] = var2.method808(-20054);
            var6++;
        }
        for (int var7 = 0; var7 < class35.field886; var7++) {
            class136.field3098[var7] = var2.method808(-20054);
        }
        var2.field2501 = arg1.length + 3 - class35.field886 * 8 - var3 * 3 - 7;
        class35.field879 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class35.field879[var8] = var2.method805(3);
            if (class35.field879[var8] == 0) {
                class35.field879[var8] = 1;
            }
        }
        var2.field2501 = 0;
        for (int var9 = 0; var9 < class35.field886; var9++) {
            int var10 = class136.field3098[var9];
            int var11 = class104.field2551[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class89.field2205[var9] = var13;
            int var14 = var2.method829((byte) -124);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method843(true);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method843(true);
                    }
                }
            }
        }
    }
}
