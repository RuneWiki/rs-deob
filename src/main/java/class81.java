import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class81 extends class439 {

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
    public int field1343 = 0;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "[J")
    public static long[] field1339 = new long[256];

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "Lkh;")
    public class13 field1334;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "Lgk;")
    public class330 field1329;

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "Lgk;")
    public class330 field1337;

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "Lia;")
    public static class413 field1351;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "Lbo;")
    public class510 field1331;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "Lps;")
    public class62 field1350;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "Z")
    public boolean field1345;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "[I")
    public int[] field1338;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
    public static void method647(int arg0) {
        field1339 = null;
        field1351 = null;
        if (arg0 != -1799743513) {
            field1351 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BZZII)Lhh;")
    public static final class84 method648(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field1335++;
        class518 var5 = null;
        if (class33.field521 != null) {
            var5 = new class518(arg4, class33.field521, class428.field6255[arg4], 1000000);
        }
        class401.field5888[arg4] = class161.field2437.method2408((byte) -86, arg4, class180.field2736, var5);
        if (arg0 == -22) {
            if (arg1) {
                class401.field5888[arg4].method315(arg0 ^ 0xFFFFFFEB);
            }
            return new class84(class401.field5888[arg4], arg2, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
    public final void method649(int arg0) {
        field1347++;
        int var2 = this.field1341;
        if (arg0 <= 76) {
            this.field1345 = true;
        }
        if (this.field1331 != null) {
            class510 var5 = this.field1331.method3027(class526.field7733, -12889);
            if (var5 == null) {
                this.field1338 = null;
                this.field1352 = 0;
                this.field1341 = -1;
                this.field1330 = 0;
                this.field1333 = 0;
                this.field1344 = 0;
            } else {
                this.field1344 = var5.field7487;
                this.field1333 = var5.field7457 << 7;
                this.field1330 = var5.field7502;
                this.field1341 = var5.field7503;
                this.field1338 = var5.field7461;
                this.field1352 = var5.field7470;
            }
        } else if (this.field1334 != null) {
            int var3 = class286.method1791(this.field1334, (byte) 78);
            if (var2 != var3) {
                this.field1341 = var3;
                class148 var4 = this.field1334.field210;
                if (var4.field2193 != null) {
                    var4 = var4.method1059((byte) -51, class526.field7733);
                }
                if (var4 == null) {
                    this.field1344 = this.field1333 = 0;
                } else {
                    this.field1344 = var4.field2189;
                    this.field1333 = var4.field2206 << 7;
                }
            }
        } else if (this.field1350 != null) {
            this.field1341 = class360.method2318(this.field1350, -1);
            this.field1344 = this.field1350.field1069;
            this.field1333 = this.field1350.field1085 << 7;
        }
        if (this.field1341 != var2 && this.field1337 != null) {
            class124.field1920.method232(this.field1337);
            this.field1337 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1339[var0] = var1;
        }
    }
}
