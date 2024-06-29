import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class109 {

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
    public boolean field1494 = false;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Ljp;")
    public class402 field1498 = null;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "Z")
    public boolean field1503 = false;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public int field1505 = 0;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "[S")
    public short[] field1492;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "[S")
    public short[] field1500;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "[S")
    public short[] field1491;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "[S")
    public short[] field1497;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[S")
    public short[] field1501;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[B")
    public byte[] field1499;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[S")
    private static short[] field1493 = new short[500];

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[S")
    private static short[] field1495 = new short[500];

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[S")
    private static short[] field1490 = new short[500];

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "[S")
    private static short[] field1502 = new short[500];

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "[B")
    private static byte[] field1496 = new byte[500];

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "[S")
    private static short[] field1504 = new short[500];

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public static void method765() {
        field1504 = null;
        field1490 = null;
        field1502 = null;
        field1493 = null;
        field1495 = null;
        field1496 = null;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "([BLjp;)V")
    public class109(byte[] arg0, class402 arg1) {
        this.field1498 = arg1;
        try {
            class265 var3 = new class265(arg0);
            class265 var4 = new class265(arg0);
            var3.field3915 = 2;
            int var5 = var3.method1697(-72);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3915 = var3.field3915 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1498.field5979[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1697(-122);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1504[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1490[var6] = var12;
                    } else {
                        field1490[var6] = (short) var4.method1717((byte) 35);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1502[var6] = var12;
                    } else {
                        field1502[var6] = (short) var4.method1717((byte) 35);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1493[var6] = var12;
                    } else {
                        field1493[var6] = (short) var4.method1717((byte) 35);
                    }
                    field1496[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field1490[var6] = (short) (((field1490[var6] & 0xFF) << 3) + (field1490[var6] >> 8 & 0x7));
                        field1502[var6] = (short) (((field1502[var6] & 0xFF) << 3) + (field1502[var6] >> 8 & 0x7));
                        field1493[var6] = (short) (((field1493[var6] & 0xFF) << 3) + (field1493[var6] >> 8 & 0x7));
                        field1490[var6] = (short) (field1490[var6] << 3);
                        field1502[var6] = (short) (field1502[var6] << 3);
                        field1493[var6] = (short) (field1493[var6] << 3);
                    }
                    field1495[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1495[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1494 = true;
                    } else if (var10 == 7) {
                        this.field1503 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3915) {
                throw new RuntimeException();
            }
            this.field1505 = var6;
            this.field1492 = new short[var6];
            this.field1500 = new short[var6];
            this.field1491 = new short[var6];
            this.field1497 = new short[var6];
            this.field1501 = new short[var6];
            this.field1499 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1492[var13] = field1504[var13];
                this.field1500[var13] = field1490[var13];
                this.field1491[var13] = field1502[var13];
                this.field1497[var13] = field1493[var13];
                this.field1501[var13] = field1495[var13];
                this.field1499[var13] = field1496[var13];
            }
        } catch (Exception var14) {
            this.field1505 = 0;
            this.field1494 = false;
            this.field1503 = false;
        }
    }
}
