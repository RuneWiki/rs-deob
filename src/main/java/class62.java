import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class62 extends class77 {

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[J")
    private long[] field1226 = new long[10];

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    private int field1215 = 1;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    private int field1218 = 256;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    private int field1219 = 0;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "J")
    private long field1221 = class1.method2((byte) -48);

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field1214 = 0;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Lob;")
    public static class141 field1217 = class175.method1195(40, "<img=1>");

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lob;")
    public static class141 field1225 = class175.method1195(40, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lob;")
    private static class141 field1222 = class175.method1195(40, "Please enter your password)3");

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lob;")
    public static class141 field1216 = field1222;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lpe;")
    public static class154 field1227;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
    public final int method413(int arg0, int arg1, int arg2) {
        int var4 = this.field1218;
        this.field1218 = 300;
        if (arg0 >= -93) {
            return -90;
        }
        field1213++;
        int var5 = this.field1215;
        this.field1215 = 1;
        this.field1221 = class1.method2((byte) -94);
        if (this.field1226[this.field1220] == 0L) {
            this.field1218 = var4;
            this.field1215 = var5;
        } else if (this.field1221 > this.field1226[this.field1220]) {
            this.field1218 = (int) ((long) (arg2 * 2560) / (this.field1221 - this.field1226[this.field1220]));
        }
        if (this.field1218 < 25) {
            this.field1218 = 25;
        }
        if (this.field1218 > 256) {
            this.field1218 = 256;
            this.field1215 = (int) ((long) arg2 - (this.field1221 - this.field1226[this.field1220]) / 10L);
        }
        if (arg2 < this.field1215) {
            this.field1215 = arg2;
        }
        this.field1226[this.field1220] = this.field1221;
        this.field1220 = (this.field1220 + 1) % 10;
        if (this.field1215 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1226[var6] != 0L) {
                    this.field1226[var6] -= -((long) this.field1215);
                }
            }
        }
        if (this.field1215 < arg1) {
            this.field1215 = arg1;
        }
        int var7 = 0;
        class93.method638((long) this.field1215, (byte) -8);
        while (this.field1219 < 256) {
            var7++;
            this.field1219 += this.field1218;
        }
        this.field1219 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method414(int arg0) {
        field1216 = null;
        field1217 = null;
        field1225 = null;
        field1222 = null;
        field1227 = null;
        if (arg0 <= 98) {
            field1222 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public final void method415(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1226[var2] = 0L;
        }
        if (arg0 != 112) {
            this.method415((byte) -111);
        }
        field1224++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method416(int arg0) {
        class95.field1885.method1385(9946);
        field1223++;
        if (arg0 != 255) {
            method414(-76);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class62() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1226[var1] = this.field1221;
        }
    }
}
