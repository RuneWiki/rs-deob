import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class107 extends class16 {

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "[I")
    private int[] field1619 = new int[3];

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    private int field1616 = 409;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
    private int field1621 = 4096;

    @OriginalMember(owner = "client!sl", name = "gb", descriptor = "I")
    private int field1623 = 4096;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "I")
    private int field1620 = 4096;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1612 = " from your friend list first.";

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "[[B")
    public static byte[][] field1611 = new byte[1000][];

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Z")
    public static boolean field1608 = false;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field1617 = "Drop";

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "[I")
    public static int[] field1614 = new int[14];

    @OriginalMember(owner = "client!sl", name = "hb", descriptor = "J")
    public static long field1624 = 0L;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!sl", name = "fb", descriptor = "Lca;")
    public static class106 field1622;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Ldm;")
    public static class300 field1607;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "Lkb;")
    public static class39 field1618;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLim;I)V", line = 8)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field1609++;
        if (arg2 == 0) {
            this.field1616 = arg1.method1396(-60);
        } else if (arg2 == 1) {
            this.field1621 = arg1.method1396(-117);
        } else if (arg2 == 2) {
            this.field1623 = arg1.method1396(arg0 - 33);
        } else if (arg2 == 3) {
            this.field1620 = arg1.method1396(-52);
        } else if (arg2 == 4) {
            int var5 = arg1.method1378(false);
            this.field1619[1] = class200.method1465(var5, 65280) >> 4;
            this.field1619[2] = class200.method1465(255, var5) >> 12;
            this.field1619[0] = class200.method1465(267386880, var5 << 4);
        }
        if (arg0 != -7) {
            field1608 = true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 78)
    public class107() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)[[I", line = 92)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = -4 / ((40 - arg1) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[][] var5 = this.method111(0, (byte) 122, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[1];
            int[] var9 = var5[2];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class276.field4376; var12++) {
                int var13 = var6[var12];
                int var14 = var13 - this.field1619[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (this.field1616 >= var14) {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field1619[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var16 <= this.field1616) {
                        int var17 = var9[var12];
                        int var18 = var17 - this.field1619[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (this.field1616 >= var18) {
                            var10[var12] = this.field1620 * var13 >> 12;
                            var8[var12] = this.field1623 * var15 >> 12;
                            var11[var12] = this.field1621 * var17 >> 12;
                        } else {
                            var10[var12] = var13;
                            var8[var12] = var15;
                            var11[var12] = var17;
                        }
                    } else {
                        var10[var12] = var13;
                        var8[var12] = var15;
                        var11[var12] = var9[var12];
                    }
                } else {
                    var10[var12] = var13;
                    var8[var12] = var7[var12];
                    var11[var12] = var9[var12];
                }
            }
        }
        field1610++;
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V", line = 181)
    public static void method742(int arg0) {
        field1614 = null;
        field1607 = null;
        field1611 = (byte[][]) null;
        field1618 = null;
        field1617 = null;
        field1612 = null;
        field1622 = null;
        if (arg0 != -1) {
            method742(-19);
        }
    }
}
