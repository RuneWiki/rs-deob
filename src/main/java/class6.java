import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class6 {

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Lia;")
    public static class15 field50 = class28.method196("Hair Dressers", false);

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "I")
    public static int field49 = 500;

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "I")
    public static int field56 = 20;

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Lia;")
    public static class15 field53 = class28.method196("Key", false);

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lia;")
    public static class15 field48 = class28.method196("Cooking Range", false);

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "I")
    public static int field54 = 50;

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "Lia;")
    public static class15 field58 = class28.method196("Key", false);

    @OriginalMember(owner = "mapview!d", name = "l", descriptor = "[[B")
    public static byte[][] field59 = new byte[1000][];

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "B")
    public byte field51;

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Li;")
    public static class14 field52;

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Ld;")
    public static class6 field55;

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "[B")
    public byte[] field57;

    @OriginalMember(owner = "mapview!d", name = "m", descriptor = "[I")
    public static int[] field60;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 15)
    public static void method26(byte arg0) {
        field53 = null;
        field52 = null;
        field58 = null;
        field55 = null;
        field60 = null;
        field59 = null;
        if (arg0 == 57) {
            field50 = null;
            field48 = null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 36)
    public final void method27(int arg0) {
        int var2 = -1 / ((arg0 + 55) / 56);
        boolean var3 = true;
        if (this.field57 == null) {
            return;
        }
        this.field51 = this.field57[0];
        for (int var4 = 0; var4 < 4096; var4++) {
            if (this.field57[var4] != this.field51) {
                var3 = false;
                break;
            }
        }
        if (var3) {
            this.field57 = null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I[Lia;II)Lia;", line = 71)
    public static final class15 method28(int arg0, class15[] arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class29.field417;
            }
            var4 += arg1[arg0 + var5].field142;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg3; var8++) {
            class15 var9 = arg1[arg0 + var8];
            class23.method154(var9.field148, 0, var7, var6, var9.field142);
            var6 += var9.field142;
        }
        int var10 = -2 / ((76 - arg2) / 34);
        class15 var11 = new class15();
        var11.field142 = var4;
        var11.field148 = var7;
        return var11;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)I", line = 144)
    public static int method29(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
