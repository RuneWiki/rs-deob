import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class113 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Z")
    public boolean field1573 = false;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Llr;")
    public class191 field1581 = null;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public int field1575 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Z")
    public boolean field1588 = false;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[S")
    public short[] field1579;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[S")
    public short[] field1578;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[S")
    public short[] field1580;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[S")
    public short[] field1576;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[S")
    public short[] field1577;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "[B")
    public byte[] field1582;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[S")
    private static short[] field1574 = new short[500];

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[S")
    private static short[] field1583 = new short[500];

    @OriginalMember(owner = "client!af", name = "m", descriptor = "[S")
    private static short[] field1585 = new short[500];

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[B")
    private static byte[] field1584 = new byte[500];

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[S")
    private static short[] field1587 = new short[500];

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[S")
    private static short[] field1586 = new short[500];

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "([BLlr;)V", line = 58)
    public class113(byte[] arg0, class191 arg1) {
        this.field1581 = arg1;
        try {
            class446 var3 = new class446(arg0);
            class446 var4 = new class446(arg0);
            var3.field6315 = 2;
            int var5 = var3.method2628(49152);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6315 = var3.field6315 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1581.field2928[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2628(49152);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1587[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1583[var6] = var12;
                    } else {
                        field1583[var6] = (short) var4.method2590(113);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1574[var6] = var12;
                    } else {
                        field1574[var6] = (short) var4.method2590(107);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1586[var6] = var12;
                    } else {
                        field1586[var6] = (short) var4.method2590(105);
                    }
                    field1584[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field1583[var6] = (short) (((field1583[var6] & 0xFF) << 3) + (field1583[var6] >> 8 & 0x7));
                        field1574[var6] = (short) (((field1574[var6] & 0xFF) << 3) + (field1574[var6] >> 8 & 0x7));
                        field1586[var6] = (short) (((field1586[var6] & 0xFF) << 3) + (field1586[var6] >> 8 & 0x7));
                        field1583[var6] = (short) (field1583[var6] << 3);
                        field1574[var6] = (short) (field1574[var6] << 3);
                        field1586[var6] = (short) (field1586[var6] << 3);
                    }
                    field1585[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1585[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1588 = true;
                    } else if (var10 == 7) {
                        this.field1573 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6315) {
                throw new RuntimeException();
            }
            this.field1575 = var6;
            this.field1579 = new short[var6];
            this.field1578 = new short[var6];
            this.field1580 = new short[var6];
            this.field1576 = new short[var6];
            this.field1577 = new short[var6];
            this.field1582 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1579[var13] = field1587[var13];
                this.field1578[var13] = field1583[var13];
                this.field1580[var13] = field1574[var13];
                this.field1576[var13] = field1586[var13];
                this.field1577[var13] = field1585[var13];
                this.field1582[var13] = field1584[var13];
            }
        } catch (Exception var14) {
            this.field1575 = 0;
            this.field1588 = false;
            this.field1573 = false;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V", line = 41)
    public static void method815() {
        field1587 = null;
        field1583 = null;
        field1574 = null;
        field1586 = null;
        field1585 = null;
        field1584 = null;
    }
}
