import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class86 extends class16 {

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    private int field1292 = 8192;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    private int field1294 = 4096;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    private int field1300 = 12288;

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "I")
    private int field1303 = 0;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    private int field1301 = 2048;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "I")
    private int field1298 = 2048;

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "I")
    private int field1302 = 0;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1293 = "shake:";

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field1289 = 2;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "Lok;")
    public static class160 field1296 = null;

    @OriginalMember(owner = "client!ph", name = "fb", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ph", name = "jb", descriptor = "[I")
    public static int[] field1308 = new int[32];

    @OriginalMember(owner = "client!ph", name = "kb", descriptor = "[I")
    public static int[] field1309;

    @OriginalMember(owner = "client!ph", name = "lb", descriptor = "Ljava/lang/String;")
    public static String field1310;

    @OriginalMember(owner = "client!ph", name = "mb", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ph", name = "hb", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ph", name = "ib", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZI)[I", line = 6)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field1299++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = class130.field1921[arg1] - 2048;
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                int var6 = class27.field396[var5] - 2048;
                int var7 = this.field1302 + var4;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = this.field1298 + var6;
                int var10 = var9 < -2048 ? var9 + 4096 : var9;
                int var11 = var10 > 2048 ? var10 - 4096 : var10;
                int var12 = var8 <= 2048 ? var8 : var8 - 4096;
                int var13 = this.field1301 + var4;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var6 + this.field1303;
                int var16 = var15 >= -2048 ? var15 : var15 + 4096;
                int var17 = var16 > 2048 ? var16 - 4096 : var16;
                int var18 = var14 <= 2048 ? var14 : var14 - 4096;
                var3[var5] = this.method629(var11, var12, 255) || this.method628(var18, var17, 4) ? 4096 : 0;
            }
        }
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1308[var1] = var0 - 1;
            var0 += var0;
        }
        field1309 = new int[8];
        field1310 = "Unable to find ";
        field1311 = -1;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 136)
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V", line = 74)
    public static final void method626(boolean arg0) {
        class210.field3442.method1623(1);
        if (!arg0) {
            method627(41);
        }
        field1305++;
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V", line = 99)
    public static void method627(int arg0) {
        field1310 = null;
        field1293 = null;
        field1296 = null;
        field1309 = null;
        if (arg0 != 2) {
            method627(78);
        }
        field1308 = null;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)Z", line = 119)
    private final boolean method628(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            return true;
        }
        int var4 = (arg0 + arg1) * this.field1300 >> 12;
        field1291++;
        int var5 = class229.field3652[(var4 * 255 & 0xFF04A) >> 12];
        int var6 = (var5 << 12) / this.field1300;
        int var7 = (var6 << 12) / this.field1292;
        int var8 = this.field1294 * var7 >> 12;
        return arg0 - arg1 < var8 && (-var8) < (arg0 - arg1);
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(III)Z", line = 150)
    private final boolean method629(int arg0, int arg1, int arg2) {
        int var4 = (arg1 - arg0) * this.field1300 >> 12;
        field1306++;
        int var5 = class229.field3652[(arg2 * var4 & 0xFF38D) >> 12];
        int var6 = (var5 << 12) / this.field1300;
        int var7 = (var6 << 12) / this.field1292;
        int var8 = this.field1294 * var7 >> 12;
        return (arg0 + arg1) < var8 && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLim;I)V", line = 185)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1298 = arg1.method1396(arg0 - 63);
        } else if (arg2 == 1) {
            this.field1302 = arg1.method1396(-42);
        } else if (arg2 == 2) {
            this.field1303 = arg1.method1396(-125);
        } else if (arg2 == 3) {
            this.field1301 = arg1.method1396(-127);
        } else if (arg2 == 4) {
            this.field1300 = arg1.method1396(arg0 - 80);
        } else if (arg2 == 5) {
            this.field1294 = arg1.method1396(-78);
        } else if (arg2 == 6) {
            this.field1292 = arg1.method1396(-100);
        }
        field1295++;
        if (arg0 != -7) {
            method627(-53);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V", line = 244)
    public final void method55(byte arg0) {
        if (arg0 != 0) {
            this.method628(87, 19, -31);
        }
        field1290++;
        class103.method723(false);
    }
}
