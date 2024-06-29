import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class60 extends class103 {

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "[J")
    private long[] field1298 = new long[10];

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    private int field1306 = 256;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    private int field1305 = 1;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    private int field1299 = 0;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "J")
    private long field1292 = class111.method874(30351);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
    public static int[] field1290 = new int[2];

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lsg;")
    public static class30 field1295 = class167.method1221((byte) 33, "b12_full");

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lsg;")
    private static class30 field1300 = class167.method1221((byte) 33, "Loaded interfaces");

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lsg;")
    public static class30 field1302 = field1300;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1303 = 7759444;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lsg;")
    public static class30 field1297 = class167.method1221((byte) 33, "event_opbase");

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lkb;")
    public static class27 field1307;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public final int method550(int arg0, int arg1, int arg2) {
        field1291++;
        int var4 = this.field1305;
        this.field1305 = 1;
        int var5 = this.field1306;
        this.field1306 = 300;
        this.field1292 = class111.method874(30351);
        if (this.field1298[this.field1294] == 0L) {
            this.field1306 = var5;
            this.field1305 = var4;
        } else if (this.field1298[this.field1294] < this.field1292) {
            this.field1306 = (int) ((long) (arg0 * 2560) / (this.field1292 - this.field1298[this.field1294]));
        }
        if (this.field1306 < 25) {
            this.field1306 = 25;
        }
        if (arg1 > -126) {
            return -99;
        }
        if (this.field1306 > 256) {
            this.field1306 = 256;
            this.field1305 = (int) ((long) arg0 - ((this.field1292 - this.field1298[this.field1294]) / 10L));
        }
        if (this.field1305 > arg0) {
            this.field1305 = arg0;
        }
        this.field1298[this.field1294] = this.field1292;
        this.field1294 = (this.field1294 + 1) % 10;
        if (this.field1305 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1298[var6] != 0L) {
                    this.field1298[var6] -= -((long) this.field1305);
                }
            }
        }
        if (arg2 > this.field1305) {
            this.field1305 = arg2;
        }
        int var7 = 0;
        class160.method1191((long) this.field1305, 0);
        while (this.field1299 < 256) {
            this.field1299 += this.field1306;
            var7++;
        }
        this.field1299 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Z")
    public static final boolean method551(byte arg0, int arg1) {
        if (arg0 != 6) {
            method551((byte) -117, -70);
        }
        field1304++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public final void method552(int arg0) {
        field1296++;
        if (arg0 > -16) {
            this.field1298 = null;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1298[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method553(byte arg0) {
        field1302 = null;
        field1300 = null;
        if (arg0 != -113) {
            method551((byte) 23, -97);
        }
        field1307 = null;
        field1295 = null;
        field1297 = null;
        field1290 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class60() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1298[var1] = this.field1292;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsg;B)Lsg;")
    public static final class30 method554(class30 arg0, byte arg1) {
        if (arg1 < 70) {
            return null;
        } else {
            field1301++;
            int var2 = class179.method1304((byte) -83, arg0);
            return var2 == -1 ? class106.field2127 : class29.field556.field3457[var2].method298((byte) 107, class273.field4778, class174.field3250);
        }
    }
}
