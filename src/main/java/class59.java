import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class59 extends class28 {

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1258 = 0;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Lqe;")
    public static class179 field1267 = class206.method1380("sch-Utteln:", (byte) -127);

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field1272 = 0;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Lqe;")
    private static class179 field1276 = class206.method1380("Checking for updates )2 ", (byte) -126);

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lqe;")
    public static class179 field1270 = field1276;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Lqe;")
    public class179 field1274;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Leh;")
    public static class52 field1271;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "[I")
    public int[] field1259;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "[I")
    public int[] field1260;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "[I")
    public int[] field1261;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "[I")
    public static int[] field1265;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
    public int[] field1268;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "[I")
    public static int[] field1273;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "[I")
    public static int[] field1275;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "[Lnb;")
    public static class143[] field1257;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILra;B)V")
    private final void method399(int arg0, class185 arg1, byte arg2) {
        field1262++;
        if (arg0 == 1) {
            this.field1274 = arg1.method1242(-117);
        } else if (arg0 == 2) {
            int var7 = arg1.method1243(3);
            this.field1260 = new int[var7];
            this.field1261 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1261[var8] = arg1.method1252(2);
                int var9 = arg1.method1243(3);
                if (var9 == 0) {
                    this.field1260[var8] = -1;
                } else {
                    this.field1260[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1243(3);
            this.field1268 = new int[var4];
            this.field1259 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1268[var5] = arg1.method1252(2);
                int var6 = arg1.method1243(3);
                if (var6 == 0) {
                    this.field1259[var5] = -1;
                } else {
                    this.field1259[var5] = var6;
                }
            }
        }
        if (arg2 <= 110) {
            this.method400(-126, false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)I")
    public final int method400(int arg0, boolean arg1) {
        if (arg1) {
            return 66;
        }
        field1264++;
        if (this.field1261 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1261.length; var3++) {
            if (this.field1260[var3] == arg0) {
                return this.field1261[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method401(int arg0) {
        field1271 = null;
        field1270 = null;
        field1257 = null;
        field1267 = null;
        if (arg0 >= -115) {
            field1257 = null;
        }
        field1265 = null;
        field1275 = null;
        field1273 = null;
        field1276 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILra;)V")
    public final void method402(int arg0, class185 arg1) {
        while (true) {
            int var3 = arg1.method1243(3);
            if (var3 == 0) {
                if (arg0 != 2) {
                    return;
                }
                field1263++;
                return;
            }
            this.method399(var3, arg1, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
    public final int method403(int arg0, int arg1) {
        field1269++;
        if (this.field1268 == null) {
            return -1;
        }
        if (arg0 != 9612) {
            this.method400(58, true);
        }
        for (int var3 = 0; var3 < this.field1268.length; var3++) {
            if (this.field1259[var3] == arg1) {
                return this.field1268[var3];
            }
        }
        return -1;
    }
}
