import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class165 {

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field2601 = -1;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Lej;")
    public class5 field2605 = null;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
    public boolean field2609 = false;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[S")
    public short[] field2598;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[S")
    public short[] field2600;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[S")
    public short[] field2608;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "[S")
    public short[] field2599;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[S")
    public short[] field2604;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[S")
    private static short[] field2597 = new short[500];

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[S")
    private static short[] field2602 = new short[500];

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[S")
    private static short[] field2606 = new short[500];

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[S")
    private static short[] field2603 = new short[500];

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "[S")
    private static short[] field2607 = new short[500];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V", line = 14)
    public static void method1045() {
        field2603 = null;
        field2597 = null;
        field2607 = null;
        field2602 = null;
        field2606 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([BLej;)V", line = 48)
    public class165(byte[] arg0, class5 arg1) {
        this.field2605 = arg1;
        class3 var3 = new class3(arg0);
        class3 var4 = new class3(arg0);
        var3.field44 = 2;
        int var5 = var3.method64((byte) 46);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field44 = var3.field44 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2605.field131[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method64((byte) 20);
            if (var10 > 0) {
                if (this.field2605.field131[var9] == 0) {
                    var8 = var9;
                }
                field2603[var6] = (short) var9;
                short var11 = 0;
                if (this.field2605.field131[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2597[var6] = var11;
                } else {
                    field2597[var6] = (short) var4.method34(1658959877);
                }
                if ((var10 & 0x2) == 0) {
                    field2607[var6] = var11;
                } else {
                    field2607[var6] = (short) var4.method34(1658959877);
                }
                if ((var10 & 0x4) == 0) {
                    field2602[var6] = var11;
                } else {
                    field2602[var6] = (short) var4.method34(1658959877);
                }
                if (this.field2605.field131[var9] == 2) {
                    field2597[var6] = (short) (((field2597[var6] & 0xFF) << 3) + (field2597[var6] >> 8 & 0x7));
                    field2607[var6] = (short) (((field2607[var6] & 0xFF) << 3) + (field2607[var6] >> 8 & 0x7));
                    field2602[var6] = (short) (((field2602[var6] & 0xFF) << 3) + (field2602[var6] >> 8 & 0x7));
                }
                field2606[var6] = -1;
                if (this.field2605.field131[var9] >= 1 && this.field2605.field131[var9] <= 3 && var7 > var8) {
                    field2606[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2605.field131[var9] == 5) {
                    this.field2609 = true;
                }
            }
        }
        if (arg0.length != var4.field44) {
            throw new RuntimeException();
        }
        this.field2601 = var6;
        this.field2598 = new short[var6];
        this.field2600 = new short[var6];
        this.field2608 = new short[var6];
        this.field2599 = new short[var6];
        this.field2604 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field2598[var12] = field2603[var12];
            this.field2600[var12] = field2597[var12];
            this.field2608[var12] = field2607[var12];
            this.field2599[var12] = field2602[var12];
            this.field2604[var12] = field2606[var12];
        }
    }
}
