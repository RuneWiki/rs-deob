import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class26 {

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "J")
    public long field402 = 0L;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Z")
    public static boolean field399 = false;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lql;")
    public static class87 field403 = new class87();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lj;")
    public static class150 field398;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lwb;")
    public class253 field406;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 16)
    public static void method239(byte arg0) {
        int var1 = 57 / ((51 - arg0) / 47);
        field403 = null;
        field398 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BBII)Ljava/lang/String;", line = 31)
    public static final String method240(byte[] arg0, byte arg1, int arg2, int arg3) {
        field394++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg0[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class297.field4586[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        int var9 = 39 % ((arg1 + 48) / 59);
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILtb;)V", line = 70)
    public static final void method241(int arg0, class220 arg1) {
        if (arg0 == 3095) {
            field404++;
            if (class282.field4348 == arg1.field3482) {
                class34.field510[arg1.field3506] = true;
            }
        }
    }
}
