import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class67 extends class64 {

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    private int field1255 = 585;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field1253 = 0;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lsg;")
    public static class169 field1258 = class165.method1060("Der Server wird gerade aktualisiert)3", 1536);

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field1257 = 50;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "[I")
    public static int[] field1256 = new int[field1257];

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "[I")
    public static int[] field1259 = new int[field1257];

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "[Lsg;")
    public static class169[] field1254 = new class169[field1257];

    @OriginalMember(owner = "client!hc", name = "ub", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "[I")
    public static int[] field1252 = new int[field1257];

    @OriginalMember(owner = "client!hc", name = "rb", descriptor = "Lsg;")
    public static class169 field1266 = class165.method1060("swe", 1536);

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "[I")
    public static int[] field1262 = new int[field1257];

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "[I")
    public static int[] field1264 = new int[field1257];

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "[I")
    public static int[] field1261 = new int[field1257];

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "Lsg;")
    private static class169 field1263 = class165.method1060("glow2:", 1536);

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "[I")
    public static int[] field1260 = new int[field1257];

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "Lsg;")
    public static class169 field1250 = field1263;

    @OriginalMember(owner = "client!hc", name = "vb", descriptor = "Lsg;")
    public static class169 field1270 = field1263;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!hc", name = "qb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hc", name = "tb", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!hc", name = "sb", descriptor = "[I")
    public static int[] field1267;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V")
    public static final void method425(int arg0) {
        class179.field3490.method1205(true);
        if (arg0 == 4096) {
            ++field1265;
            class11.field259.method1205(true);
            class149.field2765.method1205(true);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        int[] var3 = super.field1192.method19((byte) 125, arg0);
        if (super.field1192.field75) {
            int var4 = class189.field3699[arg0];
            for (int var5 = 0; ~class147.field2715 < ~var5; ++var5) {
                int var6 = class185.field3607[var5];
                if (this.field1255 < var6 && ~var6 > ~(-this.field1255 + 4096) && -this.field1255 + 2048 < var4 && var4 < this.field1255 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1255);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(-this.field1255 + 2048) && this.field1255 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1255;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1255 + 2048);
                } else if (var4 >= this.field1255 && ~(-this.field1255 + 4096) <= ~var4) {
                    if (var6 >= this.field1255 && var6 <= -this.field1255 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1255 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1255;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1255 + 2048);
                }
            }
        }
        if (arg1 != 19) {
            field1256 = null;
        }
        ++field1268;
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method426(byte arg0) {
        field1267 = null;
        if (arg0 < -45) {
            field1260 = null;
            field1256 = null;
            field1250 = null;
            field1270 = null;
            field1259 = null;
            field1261 = null;
            field1254 = null;
            field1258 = null;
            field1263 = null;
            field1264 = null;
            field1262 = null;
            field1266 = null;
            field1252 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1255 = arg1.method785(true);
        }
        ++field1251;
        int var5 = -51 % ((-60 - arg0) / 36);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class67() {
        super(0, true);
    }
}
