import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class116 {

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lsv;")
    public class575 field1441 = null;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
    public boolean field1445 = false;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Z")
    public boolean field1438 = false;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public int field1444 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
    public boolean field1439 = false;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[S")
    public short[] field1435;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[S")
    public short[] field1436;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[S")
    public short[] field1437;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[S")
    public short[] field1449;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[S")
    public short[] field1447;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[B")
    public byte[] field1434;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[S")
    private static short[] field1433 = new short[500];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[S")
    private static short[] field1442 = new short[500];

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "[S")
    private static short[] field1440 = new short[500];

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "[S")
    private static short[] field1446 = new short[500];

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "[S")
    private static short[] field1448 = new short[500];

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[B")
    private static byte[] field1443 = new byte[500];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V", line = 5)
    public static void method720() {
        field1433 = null;
        field1446 = null;
        field1440 = null;
        field1442 = null;
        field1448 = null;
        field1443 = null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([BLsv;)V", line = 65)
    public class116(byte[] arg0, class575 arg1) {
        this.field1441 = arg1;
        try {
            class194 var3 = new class194(arg0);
            class194 var4 = new class194(arg0);
            var3.method1177(255);
            var3.field2610 += 2;
            int var5 = var3.method1177(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2610 = var3.field2610 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1441.field8293[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1177(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1433[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1446[var6] = var12;
                    } else {
                        field1446[var6] = (short) var4.method1193(-1);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1440[var6] = var12;
                    } else {
                        field1440[var6] = (short) var4.method1193(-1);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1442[var6] = var12;
                    } else {
                        field1442[var6] = (short) var4.method1193(-1);
                    }
                    field1443[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1446[var6] = (short) (field1446[var6] << 2 & 0x3FFF);
                        field1440[var6] = (short) (field1440[var6] << 2 & 0x3FFF);
                        field1442[var6] = (short) (field1442[var6] << 2 & 0x3FFF);
                    }
                    field1448[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1448[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1439 = true;
                    } else if (var10 == 7) {
                        this.field1445 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1438 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2610) {
                throw new RuntimeException();
            }
            this.field1444 = var6;
            this.field1435 = new short[var6];
            this.field1436 = new short[var6];
            this.field1437 = new short[var6];
            this.field1449 = new short[var6];
            this.field1447 = new short[var6];
            this.field1434 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1435[var13] = field1433[var13];
                this.field1436[var13] = field1446[var13];
                this.field1437[var13] = field1440[var13];
                this.field1449[var13] = field1442[var13];
                this.field1447[var13] = field1448[var13];
                this.field1434[var13] = field1443[var13];
            }
        } catch (Exception var14) {
            this.field1444 = 0;
            this.field1439 = false;
            this.field1445 = false;
        }
    }
}
