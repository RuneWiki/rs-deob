import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class104 {

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field1525 = -1;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Z")
    public boolean field1522 = false;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lfd;")
    public class234 field1528 = null;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Z")
    public boolean field1523 = false;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "[S")
    public short[] field1530;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[S")
    public short[] field1520;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "[S")
    public short[] field1535;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[S")
    public short[] field1534;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[S")
    public short[] field1524;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[B")
    public byte[] field1531;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[S")
    private static short[] field1521 = new short[500];

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[B")
    private static byte[] field1526 = new byte[500];

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[S")
    private static short[] field1529 = new short[500];

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "[S")
    private static short[] field1532 = new short[500];

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[S")
    private static short[] field1533 = new short[500];

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[S")
    private static short[] field1527 = new short[500];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 24)
    public static void method788() {
        field1521 = null;
        field1527 = null;
        field1533 = null;
        field1532 = null;
        field1529 = null;
        field1526 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([BLfd;)V", line = 60)
    public class104(byte[] arg0, class234 arg1) {
        this.field1528 = arg1;
        class254 var3 = new class254(arg0);
        class254 var4 = new class254(arg0);
        var3.field3866 = 2;
        int var5 = var3.method1774((byte) -124);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3866 = var3.field3866 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field1528.field3570[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1774((byte) 56);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field1521[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field1527[var6] = var12;
                } else {
                    field1527[var6] = (short) var4.method1763((byte) 105);
                }
                if ((var11 & 0x2) == 0) {
                    field1533[var6] = var12;
                } else {
                    field1533[var6] = (short) var4.method1763((byte) 112);
                }
                if ((var11 & 0x4) == 0) {
                    field1532[var6] = var12;
                } else {
                    field1532[var6] = (short) var4.method1763((byte) 60);
                }
                field1526[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field1527[var6] = (short) (((field1527[var6] & 0xFF) << 3) + (field1527[var6] >> 8 & 0x7));
                    field1533[var6] = (short) (((field1533[var6] & 0xFF) << 3) + (field1533[var6] >> 8 & 0x7));
                    field1532[var6] = (short) (((field1532[var6] & 0xFF) << 3) + (field1532[var6] >> 8 & 0x7));
                }
                field1529[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field1529[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field1523 = true;
                } else if (var10 == 7) {
                    this.field1522 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3866) {
            throw new RuntimeException();
        }
        this.field1525 = var6;
        this.field1530 = new short[var6];
        this.field1520 = new short[var6];
        this.field1535 = new short[var6];
        this.field1534 = new short[var6];
        this.field1524 = new short[var6];
        this.field1531 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field1530[var13] = field1521[var13];
            this.field1520[var13] = field1527[var13];
            this.field1535[var13] = field1533[var13];
            this.field1534[var13] = field1532[var13];
            this.field1524[var13] = field1529[var13];
            this.field1531[var13] = field1526[var13];
        }
    }
}
