import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class443 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[[I")
    public static int[][] field6602 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lri;")
    public static class73 field6601 = new class73(45, 11);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "B")
    public static byte field6599;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2665(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field6605++;
        if (arg1 > -83) {
            field6601 = null;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method2666(byte arg0) {
        if (arg0 >= 106) {
            field6602 = null;
            field6601 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Z")
    public static final boolean method2667(int arg0, int arg1) {
        field6604++;
        if (arg1 != -31) {
            field6602 = null;
        }
        return arg0 == 15 || arg0 == 30 || arg0 == 1007 || arg0 == 51 || arg0 == 46;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lji;Z)[Lpp;")
    public static final class267[] method2668(class432 arg0, boolean arg1) {
        field6603++;
        if (!arg0.method2584(-116)) {
            return new class267[0];
        }
        class281 var2 = arg0.method2594(false);
        while (var2.field4032 == 0) {
            class246.method1659((byte) 117, 10L);
        }
        if (var2.field4032 == 2) {
            return new class267[0];
        }
        int[] var3 = (int[]) var2.field4030;
        if (arg1) {
            return null;
        }
        class267[] var4 = new class267[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class267 var6 = new class267();
            var4[var5] = var6;
            var6.field3900 = var3[var5 << 2];
            var6.field3898 = var3[(var5 << 2) + 1];
            var6.field3904 = var3[(var5 << 2) + 2];
            var6.field3902 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lvg;I)V")
    public static final void method2669(class38 arg0, int arg1) {
        field6600++;
        class38 var2 = class525.method3105((byte) 125, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class116.field1743;
            var3 = class4.field57;
        } else {
            var3 = var2.field553;
            var4 = var2.field472;
        }
        if (arg1 == -26134) {
            class87.method508(var4, false, arg0, var3, 0);
            class461.method2781(arg0, var3, var4, arg1 + 17922);
        }
    }
}
