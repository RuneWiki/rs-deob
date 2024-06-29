import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[B")
    public byte[] field176 = new byte[18002];

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[[B")
    public byte[][] field188 = new byte[6][258];

    @OriginalMember(owner = "client!b", name = "h", descriptor = "[I")
    public int[] field181 = new int[6];

    @OriginalMember(owner = "client!b", name = "x", descriptor = "[[I")
    public int[][] field197 = new int[6][258];

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
    public int[] field187 = new int[256];

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[B")
    public byte[] field177 = new byte[18002];

    @OriginalMember(owner = "client!b", name = "q", descriptor = "[Z")
    public boolean[] field190 = new boolean[256];

    @OriginalMember(owner = "client!b", name = "F", descriptor = "[I")
    public int[] field204 = new int[16];

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field175 = 0;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "[Z")
    public boolean[] field210 = new boolean[16];

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
    public int[] field192 = new int[257];

    @OriginalMember(owner = "client!b", name = "w", descriptor = "[[I")
    public int[][] field196 = new int[6][258];

    @OriginalMember(owner = "client!b", name = "K", descriptor = "[B")
    public byte[] field209 = new byte[256];

    @OriginalMember(owner = "client!b", name = "D", descriptor = "[B")
    public byte[] field203 = new byte[4096];

    @OriginalMember(owner = "client!b", name = "z", descriptor = "[[I")
    public int[][] field199 = new int[6][258];

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public int field218 = 0;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Laf;")
    private static class7 field182 = class48.method406(40, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Laf;")
    public static class7 field194 = field182;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Laf;")
    public static class7 field184 = class48.method406(40, "Weiter");

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Laf;")
    public static class7 field200 = class48.method406(40, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field180 = 0;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "Laf;")
    public static class7 field211 = class48.method406(40, "k");

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Z")
    public static volatile boolean field217 = true;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "B")
    public byte field215;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "[B")
    public byte[] field212;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "[B")
    public byte[] field214;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
    public static final void method100(int arg0, int arg1, int arg2) {
        field178++;
        class94 var3 = class9.field252[field186][arg0][arg1];
        if (var3 == null) {
            class47.field1151.method1016(field186, arg0, arg1);
            return;
        }
        class20 var4 = null;
        class20 var5 = (class20) var3.method758(255);
        int var6 = -99999999;
        while (var5 != null) {
            class135 var11 = class64.method526(false, var5.field516);
            int var12 = var11.field3206;
            if (var11.field3194 == 1) {
                var12 = (var5.field514 + 1) * var12;
            }
            if (var12 > var6) {
                var4 = var5;
                var6 = var12;
            }
            var5 = (class20) var3.method766(-128);
        }
        if (var4 == null) {
            class47.field1151.method1016(field186, arg0, arg1);
            return;
        }
        var3.method767(var4, true);
        class20 var7 = (class20) var3.method758(255);
        class20 var8 = null;
        int var9 = (arg1 << 7) + arg0 + arg2;
        class20 var10 = null;
        while (var7 != null) {
            if (var4.field516 != var7.field516) {
                if (var10 == null) {
                    var10 = var7;
                }
                if (var7.field516 != var10.field516 && var8 == null) {
                    var8 = var7;
                }
            }
            var7 = (class20) var3.method766(arg2 ^ 0x9FFFFFA1);
        }
        class47.field1151.method995(field186, arg0, arg1, class119.method921(arg1 * 128 + 64, -21697, field186, arg0 * 128 + 64), var4, var9, var10, var8);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLaf;)V")
    public static final void method101(byte arg0, class7 arg1) {
        field201++;
        if (class43.field1031 >= 2) {
            if (arg1.method84(class66.field1427, 125)) {
                System.gc();
            }
            if (arg1.method84(class119.field2815, 125)) {
                class4.method27((byte) 67);
            }
            if (arg1.method84(class43.field1038, 127)) {
                class72.field1608 = true;
            }
            if (arg1.method84(class67.field1459, 124)) {
                class72.field1608 = false;
            }
            if (arg1.method84(class32.field852, arg0 + 69)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class155.field3609[var2].field2047[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method84(class53.field1304, 126) && class22.field617 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method94((byte) -123, class94.field2209)) {
                class126.field3007 = arg1.method61(-114, 12).method71(98).method73((byte) 86);
                class53.method432(class116.method905(new class7[] { class152.field3562, class51.method421((byte) -78, class126.field3007) }, 1), 0, null, arg0 ^ 0xFFFFFFB6);
            }
            if (arg1.method84(class28.field733, 125)) {
                class106.field2609 = true;
            }
        }
        class57.field1360++;
        class47.field1150.method1131(94, 2027385224);
        class47.field1150.method959(arg1.method92(-108) - 1, (byte) -120);
        if (arg0 != 55) {
            field180 = 104;
        }
        class47.field1150.method932(arg1.method61(arg0 - 128, 2), (byte) 86);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method102(int arg0) {
        if (arg0 != 6) {
            return;
        }
        field184 = null;
        field211 = null;
        field182 = null;
        field200 = null;
        field194 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method103(byte arg0) {
        field206++;
        if (class12.field302 != null) {
            class12.field302.method1172((byte) 10);
            class12.field302 = null;
        }
        class12.method122((byte) -126);
        class47.field1151.method1035();
        if (arg0 <= 95) {
            method101((byte) 3, null);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class155.field3609[var1].method721(-1);
        }
        System.gc();
        class2.method15(false, 2);
        class126.field3003 = -1;
        class19.field440 = false;
        class80.method674(0);
        class111.method880(20, 10);
    }
}
