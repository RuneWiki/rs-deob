import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class113 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Z")
    public boolean field1559 = false;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field1562 = 0;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Z")
    public boolean field1568 = false;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Ldr;")
    public class426 field1572 = null;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[S")
    public short[] field1565;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[S")
    public short[] field1561;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[S")
    public short[] field1570;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "[S")
    public short[] field1567;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "[S")
    public short[] field1569;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[B")
    public byte[] field1558;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[S")
    private static short[] field1557 = new short[500];

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[S")
    private static short[] field1563 = new short[500];

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[S")
    private static short[] field1564 = new short[500];

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[S")
    private static short[] field1560 = new short[500];

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "[S")
    private static short[] field1566 = new short[500];

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "[B")
    private static byte[] field1571 = new byte[500];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public static void method833() {
        field1566 = null;
        field1557 = null;
        field1564 = null;
        field1560 = null;
        field1563 = null;
        field1571 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([BLdr;)V")
    public class113(byte[] arg0, class426 arg1) {
        this.field1572 = arg1;
        try {
            class186 var3 = new class186(arg0);
            class186 var4 = new class186(arg0);
            var3.field3044 = 2;
            int var5 = var3.method1322(false);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3044 = var3.field3044 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1572.field6278[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1322(false);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1566[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1557[var6] = var12;
                    } else {
                        field1557[var6] = (short) var4.method1289(-1);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1564[var6] = var12;
                    } else {
                        field1564[var6] = (short) var4.method1289(-1);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1560[var6] = var12;
                    } else {
                        field1560[var6] = (short) var4.method1289(-1);
                    }
                    field1571[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field1557[var6] = (short) (((field1557[var6] & 0xFF) << 3) + (field1557[var6] >> 8 & 0x7));
                        field1564[var6] = (short) (((field1564[var6] & 0xFF) << 3) + (field1564[var6] >> 8 & 0x7));
                        field1560[var6] = (short) (((field1560[var6] & 0xFF) << 3) + (field1560[var6] >> 8 & 0x7));
                        field1557[var6] = (short) (field1557[var6] << 3);
                        field1564[var6] = (short) (field1564[var6] << 3);
                        field1560[var6] = (short) (field1560[var6] << 3);
                    }
                    field1563[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1563[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1559 = true;
                    } else if (var10 == 7) {
                        this.field1568 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3044) {
                throw new RuntimeException();
            }
            this.field1562 = var6;
            this.field1565 = new short[var6];
            this.field1561 = new short[var6];
            this.field1570 = new short[var6];
            this.field1567 = new short[var6];
            this.field1569 = new short[var6];
            this.field1558 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1565[var13] = field1566[var13];
                this.field1561[var13] = field1557[var13];
                this.field1570[var13] = field1564[var13];
                this.field1567[var13] = field1560[var13];
                this.field1569[var13] = field1563[var13];
                this.field1558[var13] = field1571[var13];
            }
        } catch (Exception var14) {
            this.field1562 = 0;
            this.field1559 = false;
            this.field1568 = false;
        }
    }
}
