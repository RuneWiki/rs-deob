import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class123 {

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "Z")
    public static boolean field57 = false;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Loa;")
    private static class98 field54 = class38.method349(255, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Loa;")
    public static class98 field61 = class38.method349(255, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "Loa;")
    public static class98 field62 = field54;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "Loa;")
    public static class98 field64 = class38.method349(255, " ");

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "Ln;")
    public static class90 field55 = new class90(64);

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "[J")
    public static long[] field67 = new long[200];

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "Loa;")
    public static class98 field69 = class38.method349(255, ": ");

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "Ltb;")
    public static class130 field70;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "Lac;")
    public class4 field56;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "Lac;")
    public class4 field65;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
    public static void method19(byte arg0) {
        field70 = null;
        field61 = null;
        field64 = null;
        field54 = null;
        field55 = null;
        field62 = null;
        field69 = null;
        field67 = null;
        if (arg0 < 94) {
            field57 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ltb;I)I")
    public static final int method20(class130 arg0, int arg1) {
        field59++;
        int var2 = arg1;
        if (arg0.method1053(class75.field1612, class63.field1338, arg1 ^ 0x600)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1053(class75.field1612, class79.field1734, arg1 ^ 0x600)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class46.field1073, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class94.field2135, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class115.field2600, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class53.field1177, arg1 ^ 0x600)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class24.field592, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class24.field588, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class91.field2106, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class127.field2855, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class36.field888, arg1 ^ 0x600)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class135.field3296, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class148.field3649, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class14.field291, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class71.field1478, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class118.field2643, 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class42.field989, arg1 + 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class21.field464, arg1 + 1536)) {
            var2++;
        }
        if (arg0.method1053(class75.field1612, class86.field1981, 1536)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[B)V")
    public static final void method21(byte arg0, byte[] arg1) {
        field60++;
        class8 var2 = new class8(arg1);
        var2.field182 = arg1.length - 2;
        class73.field1543 = var2.method68(-2);
        class62.field1318 = new int[class73.field1543];
        class138.field3382 = new byte[class73.field1543][];
        if (arg0 <= 122) {
            method19((byte) 106);
        }
        class91.field2103 = new int[class73.field1543];
        class55.field1207 = new int[class73.field1543];
        class83.field1928 = new int[class73.field1543];
        var2.field182 = arg1.length - class73.field1543 * 8 - 7;
        class102.field2351 = var2.method68(-2);
        class78.field1713 = var2.method68(-2);
        int var3 = (var2.method62((byte) 118) & 0xFF) + 1;
        for (int var4 = 0; var4 < class73.field1543; var4++) {
            class55.field1207[var4] = var2.method68(-2);
        }
        for (int var5 = 0; var5 < class73.field1543; var5++) {
            class83.field1928[var5] = var2.method68(-2);
        }
        for (int var6 = 0; var6 < class73.field1543; var6++) {
            class62.field1318[var6] = var2.method68(-2);
        }
        for (int var7 = 0; var7 < class73.field1543; var7++) {
            class91.field2103[var7] = var2.method68(-2);
        }
        var2.field182 = arg1.length + 3 - var3 * 3 - class73.field1543 * 8 - 7;
        class83.field1934 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class83.field1934[var8] = var2.method56(-19856);
            if (class83.field1934[var8] == 0) {
                class83.field1934[var8] = 1;
            }
        }
        var2.field182 = 0;
        for (int var9 = 0; var9 < class73.field1543; var9++) {
            int var10 = class91.field2103[var9];
            int var11 = class62.field1318[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class138.field3382[var9] = var13;
            int var14 = var2.method62((byte) 97);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method57(33);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var11 * var16 + var15] = var2.method57(77);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 != 0) {
            method19((byte) -104);
        }
        field58++;
        if (this.field65 != null) {
            this.field65.field56 = this.field56;
            this.field56.field65 = this.field65;
            this.field56 = null;
            this.field65 = null;
        }
    }
}
