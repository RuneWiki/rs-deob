import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class249 extends class222 {

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[I")
    public int[] field4487 = new int[] { -1 };

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "[I")
    public int[] field4494 = new int[1];

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
    public static int[] field4482 = new int[32];

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lcf;")
    public static class93 field4481 = class147.method1066("<br>", -48);

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lcf;")
    public static class93 field4485 = class147.method1066("rot:", -48);

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lcf;")
    private static class93 field4488 = class147.method1066("Select", -48);

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lcf;")
    public static class93 field4483 = field4488;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lcf;")
    public static class93 field4492 = class147.method1066("Spieler kann nicht gefunden werden: ", -48);

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "B")
    public static byte field4491;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Z")
    public static boolean field4484;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "[[[B")
    public static byte[][][] field4490;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLcf;)V")
    public static final void method1689(byte arg0, class93 arg1) {
        class131.method960((byte) -28, false);
        if (arg0 == -33) {
            field4486++;
            class212.method1497((byte) 122, arg1);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)I")
    public static final int method1690(int arg0, byte arg1, int arg2) {
        class249 var3 = (class249) class282.field5069.method135((long) arg0, true);
        if (arg1 != 26) {
            method1693(-84, -26, -75, 97, (class211) null, (class211) null, 17, -12, -30, -66, -103L);
        }
        field4495++;
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field4487.length) {
            return var3.field4487[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method1691(int arg0, int arg1) {
        if (arg1 != -1) {
            field4491 = -24;
        }
        field4493++;
        class124.field2212 = new int[arg0];
        class144.field2496 = new int[arg0];
        class69.field1249 = new int[arg0];
        class144.field2498 = new int[arg0];
        class268.field4787 = new int[arg0];
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static final void method1692(int arg0) {
        class218.field3972.method294(arg0);
        field4489++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILgl;Lgl;IIIIJ)V")
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, class211 arg4, class211 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class24 var12 = new class24();
        var12.field303 = arg10;
        var12.field293 = arg1 * 128 + 64;
        var12.field304 = arg2 * 128 + 64;
        var12.field307 = arg3;
        var12.field295 = arg4;
        var12.field301 = arg5;
        var12.field305 = arg6;
        var12.field299 = arg7;
        var12.field302 = arg8;
        var12.field297 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class232.field4138[var13][arg1][arg2] == null) {
                class232.field4138[var13][arg1][arg2] = new class41(var13, arg1, arg2);
            }
        }
        class232.field4138[arg0][arg1][arg2].field641 = var12;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static void method1694(byte arg0) {
        field4488 = null;
        field4492 = null;
        field4490 = null;
        field4481 = null;
        field4485 = null;
        field4483 = null;
        field4482 = null;
        if (arg0 <= 102) {
            method1691(82, -19);
        }
    }
}
