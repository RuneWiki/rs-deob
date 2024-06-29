import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class430 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lkda;")
    private class328 field5772;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lh;")
    public static class572 field5770 = new class572(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method2518(int arg0) {
        if (arg0 == 0) {
            field5770 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)[Llt;")
    public static final class581[] method2519(byte arg0) {
        field5769++;
        if (arg0 != 85) {
            method2521(14, -58);
        }
        return new class581[] { class55.field657, class613.field9073, class586.field8609 };
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    private static final void method2520(int arg0) {
        if (class99.field1445 != null) {
            class42.field491.method2234((byte) -24);
            class623.method3643();
            class618.method3620(arg0 ^ 0xFFFFF781);
            class104.method777(0);
            class459.method2778((byte) 51);
            class621.method3630((byte) 80);
            if (class212.field3123 != null) {
                class212.field3123.method3383(-15860);
            }
            class182.method1265(false);
            class459.method2781((byte) 72);
            class193.method1311(arg0 - 1954);
            class536.method3246(false, arg0 + 7009);
            class40.method254((byte) 90);
            for (int var1 = 0; var1 < 2048; var1++) {
                class373 var5 = class293.field4036[var1];
                if (var5 != null) {
                    var5.field1949 = null;
                    for (int var6 = 0; var6 < var5.field1951.length; var6++) {
                        var5.field1951[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class599.field8840; var2++) {
                class571 var3 = class57.field718[var2].field7148;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1951.length; var4++) {
                        var3.field1951[var4] = null;
                    }
                }
            }
            class106.field1520 = null;
            class259.field3707 = null;
            class99.field1445.method1372(4);
            class99.field1445 = null;
        }
        if (arg0 != 2048) {
            method2522(null, -5, 86, -28, 21, -46, 70);
        }
        field5773++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method2521(int arg0, int arg1) {
        field5771++;
        method2520(2048);
        class272.method1712((byte) -114);
        class586.method3486(true, (byte) 102, arg0);
        class234.method1500(class99.field1445, -1, class647.field9401, class585.field8595);
        class554.method3349(class585.field8595, arg1 - 14810, class99.field1445);
        class104.method777(0);
        class477.method2872(class416.field5639, (byte) -59);
        class504.method2996((byte) 110);
        class226.method1453((byte) 0);
        if (class472.field6670 == 2) {
            class18.method117((byte) -85, 3);
        } else if (class472.field6670 == 6) {
            class18.method117((byte) -85, 7);
        } else if (class472.field6670 == 9) {
            class18.method117((byte) -85, 10);
        } else if (class472.field6670 == 1) {
            class354.method2136(class585.field8595, (byte) -124, class99.field1445);
        }
        if (arg1 != -2) {
            field5770 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfaa;IIIIII)V")
    public static final void method2522(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class408.method2398(arg4, arg2, arg0.field8496, arg6, arg0.field8500, -5984, 0, arg5, arg0.field8501, arg3);
        field5767++;
        if (arg1 <= 7) {
            method2521(-77, 101);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class430(class39 arg0, int arg1, class328 arg2) {
        new class117(64);
        this.field5772 = arg2;
        this.field5768 = this.field5772.method1975(88, 15);
    }
}
