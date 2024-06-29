import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class437 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field6343;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field6349;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field6353;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[C")
    public static char[] field6350 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lee;")
    public static class226 field6344 = new class226(0, -1);

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
    public static int[] field6351 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
    public abstract void method294(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static final int method2740(int arg0, int arg1) {
        field6347++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 == 381 ? arg1 & ~var7 : 110;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
    public abstract void method295(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method2741(byte arg0) {
        field6344 = null;
        field6351 = null;
        field6350 = null;
        if (arg0 > -74) {
            method2742(-92);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method2742(int arg0) {
        class63.method558(25, true);
        field6348++;
        class331.method2167((byte) 90);
        if (arg0 == 4) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)V")
    public abstract void method290(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(III)V")
    public class437(int arg0, int arg1, int arg2) {
        this.field6343 = arg2;
        this.field6349 = arg1;
        this.field6353 = arg0;
    }
}
