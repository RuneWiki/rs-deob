import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class110 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
    public boolean field1582 = false;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lvia;")
    public class565 field1585 = null;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field1590 = 0;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
    public boolean field1591 = false;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Z")
    public boolean field1595 = false;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[S")
    public short[] field1588;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "[S")
    public short[] field1596;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "[S")
    public short[] field1598;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
    public short[] field1587;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "[S")
    public short[] field1597;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[B")
    public byte[] field1592;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[S")
    private static short[] field1583 = new short[500];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[S")
    private static short[] field1584 = new short[500];

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[B")
    private static byte[] field1593 = new byte[500];

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[S")
    private static short[] field1594 = new short[500];

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
    private static short[] field1589 = new short[500];

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[S")
    private static short[] field1586 = new short[500];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()V", line = 7)
    public static void method877() {
        field1584 = null;
        field1586 = null;
        field1594 = null;
        field1583 = null;
        field1589 = null;
        field1593 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([BLvia;)V", line = 65)
    public class110(byte[] arg0, class565 arg1) {
        this.field1585 = arg1;
        try {
            class461 var3 = new class461(arg0);
            class461 var4 = new class461(arg0);
            var3.method2600((byte) -128);
            var3.field6193 += 2;
            int var5 = var3.method2600((byte) -125);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6193 = var3.field6193 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1585.field7942[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2600((byte) -127);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1584[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1586[var6] = var12;
                    } else {
                        field1586[var6] = (short) var4.method2564((byte) 34);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1594[var6] = var12;
                    } else {
                        field1594[var6] = (short) var4.method2564((byte) 34);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1583[var6] = var12;
                    } else {
                        field1583[var6] = (short) var4.method2564((byte) 34);
                    }
                    field1593[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1586[var6] = (short) (field1586[var6] << 2 & 0x3FFF);
                        field1594[var6] = (short) (field1594[var6] << 2 & 0x3FFF);
                        field1583[var6] = (short) (field1583[var6] << 2 & 0x3FFF);
                    }
                    field1589[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1589[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1591 = true;
                    } else if (var10 == 7) {
                        this.field1582 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1595 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6193) {
                throw new RuntimeException();
            }
            this.field1590 = var6;
            this.field1588 = new short[var6];
            this.field1596 = new short[var6];
            this.field1598 = new short[var6];
            this.field1587 = new short[var6];
            this.field1597 = new short[var6];
            this.field1592 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1588[var13] = field1584[var13];
                this.field1596[var13] = field1586[var13];
                this.field1598[var13] = field1594[var13];
                this.field1587[var13] = field1583[var13];
                this.field1597[var13] = field1589[var13];
                this.field1592[var13] = field1593[var13];
            }
        } catch (Exception var14) {
            this.field1590 = 0;
            this.field1591 = false;
            this.field1582 = false;
        }
    }
}
