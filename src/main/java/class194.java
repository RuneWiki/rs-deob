import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class194 {

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[I")
    public static int[] field3485 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Z")
    public static boolean field3490 = false;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lud;")
    public static class279 field3484 = class130.method1024("Fallen lassen", 255);

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lud;")
    public static class279 field3496 = class130.method1024(")2", 255);

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    public static long field3494 = 0L;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lud;")
    public static class279 field3492 = class130.method1024(" <col=ffff00>", 255);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3498 = 0;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lud;")
    public static class279 field3499 = class130.method1024("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 255);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ldg;")
    public static class317 field3483 = new class317();

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[[[B")
    public static byte[][][] field3486;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[[[B")
    public static byte[][][] field3491;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[BZ)Lud;", line = 24)
    public static final class279 method1457(int arg0, int arg1, byte[] arg2, boolean arg3) {
        class279 var4 = new class279();
        field3497++;
        var4.field4935 = new byte[arg1];
        if (arg3) {
            return (class279) null;
        }
        var4.field4967 = 0;
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field4935[var4.field4967++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lok;B)I", line = 54)
    public static final int method1458(class149 arg0, byte arg1) {
        int var2 = 0;
        field3489++;
        if (arg0.method1186(class266.field4790, arg1 - 22634)) {
            var2++;
        }
        if (arg0.method1186(class115.field2093, -22698)) {
            var2++;
        }
        if (arg1 != -64) {
            field3492 = (class279) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Lrj;", line = 74)
    public static final class18 method1459(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3451; var4++) {
            class18 var5 = var3.field3455[var4];
            if ((var5.field546 >> 29 & 0x3L) == 2L && var5.field560 == arg1 && var5.field564 == arg2) {
                class213.method1565(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIILdb;IB)V", line = 98)
    public static final void method1460(boolean arg0, int arg1, int arg2, class182 arg3, int arg4, byte arg5) {
        field3493++;
        if (class260.field4620 >= 50 || arg3.field3316 == null || arg2 >= arg3.field3316.length || arg3.field3316[arg2] == null) {
            return;
        }
        int var6 = arg3.field3316[arg2][0];
        int var7 = var6 >> 8;
        int var8 = var6 & 0x1F;
        if (arg3.field3316[arg2].length > 1) {
            int var9 = (int) (Math.random() * (double) arg3.field3316[arg2].length);
            if (var9 > 0) {
                var7 = arg3.field3316[arg2][var9];
            }
        }
        int var10 = var6 >> 5 & 0x7;
        if (var8 == 0) {
            if (arg0) {
                class167.method1306(0, var7, (byte) 51, var10);
            }
        } else if (class3.field105 != 0) {
            int var11 = (arg1 - 64) / 128;
            if (arg5 > 96) {
                int var12 = (arg4 - 64) / 128;
                class3.field104[class260.field4620] = var7;
                class266.field4785[class260.field4620] = var10;
                class232.field4057[class260.field4620] = 0;
                class92.field1724[class260.field4620] = null;
                class55.field1196[class260.field4620] = (var12 << 8) + ((var11 << 16) + var8);
                class260.field4620++;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 183)
    public static void method1461(int arg0) {
        field3499 = null;
        field3486 = (byte[][][]) null;
        field3496 = null;
        field3492 = null;
        field3491 = (byte[][][]) null;
        field3484 = null;
        if (arg0 == 12510) {
            field3483 = null;
            field3485 = null;
        }
    }
}
