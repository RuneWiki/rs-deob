import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 {

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Lf;")
    public static class10 field250 = method139("Altar", (byte) -90);

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Lf;")
    public static class10 field252 = method139("Amulet Shop", (byte) -125);

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Lf;")
    public static class10 field255 = method139("Mace Shop", (byte) -92);

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "Lf;")
    public static class10 field254 = method139("loc)3dat", (byte) -68);

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "I")
    public static int field253 = -1;

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Z")
    public static boolean field251 = false;

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "[[Lm;")
    public static class24[][] field248;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 19)
    public static void method137(int arg0) {
        field254 = null;
        field255 = null;
        field250 = null;
        field248 = null;
        field252 = null;
        if (arg0 != 43) {
            method137(-67);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II)[B", line = 57)
    public static final synchronized byte[] method138(int arg0, int arg1) {
        int var2 = 102 % ((-arg1 - 86) / 39);
        if (arg0 == 100 && class22.field243 > 0) {
            byte[] var3 = class33.field471[--class22.field243];
            class33.field471[class22.field243] = null;
            return var3;
        } else if (arg0 == 5000 && class18.field160 > 0) {
            byte[] var4 = class30.field407[--class18.field160];
            class30.field407[class18.field160] = null;
            return var4;
        } else if (arg0 == 30000 && class21.field241 > 0) {
            byte[] var5 = class1.field4[--class21.field241];
            class1.field4[class21.field241] = null;
            return var5;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/lang/String;B)Lf;", line = 132)
    public static final class10 method139(String arg0, byte arg1) {
        if (arg1 > -50) {
            field248 = null;
        }
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class10 var5 = new class10();
        var5.field112 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field112[var5.field106++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field112[var5.field106++] = (byte) var6;
            }
        }
        var5.method61(true);
        return var5.method75(-32360);
    }
}
