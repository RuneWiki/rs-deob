import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class135 extends class172 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lqk;")
    public static class1 field1721 = new class1(20, -1);

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "[[I")
    public static int[][] field1727 = new int[128][128];

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Lqk;")
    public static class1 field1726 = new class1(88, -1);

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Ljava/lang/String;")
    private String field1729;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)V")
    public static final void method904(byte arg0, int arg1, int arg2) {
        field1730++;
        class17 var3 = class245.method1634(1, (long) arg2 | (long) arg1 << 32, 19);
        var3.method69(13);
        if (arg0 != 48) {
            field1727 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[BLtf;I)V")
    public static final void method905(byte[][] arg0, class245 arg1, int arg2) {
        field1728++;
        for (int var3 = 0; var3 < arg1.field10098; var3++) {
            class482.method2865(23105);
            for (int var4 = 0; var4 < (class741.field10208 >> 3); var4++) {
                for (int var5 = 0; var5 < class525.field7224 >> 3; var5++) {
                    int var6 = class465.field6476[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg1.field10088 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class611.field8607.length; var12++) {
                                if (class611.field8607[var12] == var11 && arg0[var12] != null) {
                                    arg1.method1642((var10 & 0x7) * 8, true, var8, class111.field1332, (var9 & 0x7) * 8, var4 * 8, var5 * 8, arg0[var12], var7, client.field1305, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 8780) {
            field1726 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLhia;)V")
    public final void method100(byte arg0, class48 arg1) {
        field1725++;
        arg1.method389(this.field1729, arg0 ^ 0xFFFFFFB8, this.field1723);
        if (arg0 != 71) {
            this.field1729 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILgga;)V")
    public final void method102(int arg0, class511 arg1) {
        this.field1723 = arg1.method3008(64);
        field1724++;
        this.field1729 = arg1.method2993((byte) -109);
        if (arg0 != 2048) {
            method905(null, null, 1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
    public static final boolean method906(int arg0, int arg1, int arg2) {
        field1722++;
        int var3 = 15 / ((arg2 + 41) / 58);
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static void method907(int arg0) {
        field1721 = null;
        if (arg0 != 12328) {
            method904((byte) 110, -98, 32);
        }
        field1726 = null;
        field1727 = null;
    }
}
