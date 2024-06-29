import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Lu;")
    public static class38 field47 = class28.method177("overlay)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Lu;")
    public static class38 field48 = class28.method177("???", (byte) -84);

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Z")
    public static boolean field50 = false;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Z)V", line = 6)
    public static void method27(boolean arg0) {
        if (arg0) {
            field46 = -128;
        }
        field48 = null;
        field47 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([Lu;III)Lu;", line = 19)
    public static final class38 method28(class38[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class37.field477;
            }
            var4 += arg0[arg2 + var5].field494;
        }
        int var6 = 82 % ((arg1 + 10) / 47);
        byte[] var7 = new byte[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < arg3; var9++) {
            class38 var10 = arg0[arg2 + var9];
            class13.method63(var10.field483, 0, var7, var8, var10.field494);
            var8 += var10.field494;
        }
        class38 var11 = new class38();
        var11.field494 = var4;
        var11.field483 = var7;
        return var11;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IB)Lu;", line = 67)
    public static final class38 method29(int arg0, byte arg1) {
        class38 var2 = new class38();
        var2.field483 = new byte[arg0];
        if (arg1 != 39) {
            method27(true);
        }
        var2.field494 = 0;
        return var2;
    }
}
