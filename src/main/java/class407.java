import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class407 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "[[I")
    public int[][] field6052 = new int[6][258];

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "[[B")
    public byte[][] field6072 = new byte[6][258];

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "[B")
    public byte[] field6062 = new byte[4096];

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "[I")
    public int[] field6070 = new int[6];

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "[[I")
    public int[][] field6071 = new int[6][258];

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "[B")
    public byte[] field6068 = new byte[18002];

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public int field6054 = 0;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "[[I")
    public int[][] field6079 = new int[6][258];

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "[B")
    public byte[] field6080 = new byte[18002];

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "[B")
    public byte[] field6078 = new byte[256];

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "[I")
    public int[] field6082 = new int[256];

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "[I")
    public int[] field6083 = new int[257];

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public int field6069 = 0;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "[Z")
    public boolean[] field6086 = new boolean[16];

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "[Z")
    public boolean[] field6081 = new boolean[256];

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "[I")
    public int[] field6087 = new int[16];

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "[Z")
    public static boolean[] field6059 = new boolean[5];

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field6056 = 0;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field6061 = 0;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "B")
    public byte field6073;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public int field6053;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public int field6055;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public int field6057;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public int field6058;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public int field6060;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public int field6064;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public int field6065;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public int field6066;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public int field6067;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public int field6075;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public int field6077;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Lqr;")
    public static class48 field6063;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "[B")
    public byte[] field6084;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "[B")
    public byte[] field6085;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 28)
    public static void method2567(int arg0) {
        field6063 = null;
        if (arg0 != 4) {
            method2567(61);
        }
        field6059 = null;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 93)
    public static final void method2568(int arg0) {
        field6074++;
        int var1 = class286.field4337.length;
        if (arg0 != 30472) {
            field6056 = 81;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class286.field4337[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class39.field532; var4++) {
                    if (class505.field7380[var2] == class372.field5541[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class372.field5541[class39.field532] = class505.field7380[var2];
                    var3 = class39.field532++;
                }
                class217 var5 = new class217(class286.field4337[var2]);
                int var6 = 0;
                while (class286.field4337[var2].length > var5.field3556 && var6 < 511 && class167.field2471 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1511(111);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1F95) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class505.field7380[var2] >> 8) * 64 + var10 - class390.field5842;
                    int var13 = (class505.field7380[var2] & 0xFF) * 64 + var11 - class176.field2613;
                    class37 var14 = class175.field2605.method2782(var5.method1511(-68), (byte) -87);
                    if (class153.field2265[var7] == null && (var14.field456 & 0x1) > 0 && class61.field726 == var9 && var12 >= 0 && class69.field976 > var12 + var14.field494 && var13 >= 0 && class285.field4328 > var13 + var14.field494) {
                        class153.field2265[var7] = new class116();
                        class153.field2265[var7].field1881 = var7;
                        class116 var15 = class153.field2265[var7];
                        class470.field6797[class167.field2471++] = var7;
                        var15.field1882 = class475.field6854;
                        var15.method877(var14, 28766);
                        var15.method945(arg0 ^ 0xFFFFF0EB, var15.field1763.field494);
                        var15.field1934 = var15.field1763.field490 << 3;
                        if (var15.field1934 == 0) {
                            var15.method952(-443277064, 0);
                        } else {
                            var15.method952(-443277064, (var15.field1763.field492 + 4 & 0x51800007) << 11);
                        }
                        var15.method876(true, var15.method953(-106), var9, var12, 0, var13);
                    }
                }
            }
        }
    }
}
