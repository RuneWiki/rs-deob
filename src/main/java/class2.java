import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Ld;")
    public static class7 field9 = class38.method251((byte) 118, "Axe Shop");

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "Z")
    public static boolean field12 = false;

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "Ld;")
    public static class7 field15 = class38.method251((byte) -95, "Chainmail Shop");

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Lka;")
    public static class21 field8;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "[I")
    public static int[] field14;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "[[Lh;")
    public static class15[][] field11;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(II)[B", line = 21)
    public static final synchronized byte[] method11(int arg0, int arg1) {
        if (arg0 == 100 && class35.field469 > 0) {
            byte[] var2 = class8.field88[--class35.field469];
            class8.field88[class35.field469] = null;
            return var2;
        } else if (arg0 == 5000 && class28.field407 > 0) {
            byte[] var3 = class8.field90[--class28.field407];
            class8.field90[class28.field407] = null;
            return var3;
        } else {
            int var4 = -121 / ((arg1 - 78) / 43);
            if (arg0 == 30000 && class12.field136 > 0) {
                byte[] var5 = mapview.field291[--class12.field136];
                mapview.field291[class12.field136] = null;
                return var5;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)V", line = 61)
    public static void method12(int arg0) {
        field11 = null;
        field15 = null;
        if (arg0 != 0) {
            method12(-50);
        }
        field8 = null;
        field14 = null;
        field9 = null;
    }
}
