import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class124 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
    public boolean field1646 = false;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
    public boolean field1657 = false;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public int field1653 = 0;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lud;")
    public class23 field1655 = null;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[S")
    public short[] field1650;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[S")
    public short[] field1645;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[S")
    public short[] field1649;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[S")
    public short[] field1651;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[S")
    public short[] field1647;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[B")
    public byte[] field1654;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[S")
    private static short[] field1644 = new short[500];

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[S")
    private static short[] field1652 = new short[500];

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[S")
    private static short[] field1659 = new short[500];

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[S")
    private static short[] field1658 = new short[500];

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[B")
    private static byte[] field1648 = new byte[500];

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[S")
    private static short[] field1656 = new short[500];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
    public static void method744() {
        field1644 = null;
        field1652 = null;
        field1658 = null;
        field1656 = null;
        field1659 = null;
        field1648 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([BLud;)V")
    public class124(byte[] arg0, class23 arg1) {
        this.field1655 = arg1;
        try {
            class130 var3 = new class130(arg0);
            class130 var4 = new class130(arg0);
            var3.field1880 = 2;
            int var5 = var3.method837(true);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1880 = var3.field1880 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1655.field288[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method837(true);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1644[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1652[var6] = var12;
                    } else {
                        field1652[var6] = (short) var4.method803(96);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1658[var6] = var12;
                    } else {
                        field1658[var6] = (short) var4.method803(40);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1656[var6] = var12;
                    } else {
                        field1656[var6] = (short) var4.method803(65);
                    }
                    field1648[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field1652[var6] = (short) (((field1652[var6] & 0xFF) << 3) + (field1652[var6] >> 8 & 0x7));
                        field1658[var6] = (short) (((field1658[var6] & 0xFF) << 3) + (field1658[var6] >> 8 & 0x7));
                        field1656[var6] = (short) (((field1656[var6] & 0xFF) << 3) + (field1656[var6] >> 8 & 0x7));
                        field1652[var6] = (short) (field1652[var6] << 3);
                        field1658[var6] = (short) (field1658[var6] << 3);
                        field1656[var6] = (short) (field1656[var6] << 3);
                    }
                    field1659[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1659[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1657 = true;
                    } else if (var10 == 7) {
                        this.field1646 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1880) {
                throw new RuntimeException();
            }
            this.field1653 = var6;
            this.field1650 = new short[var6];
            this.field1645 = new short[var6];
            this.field1649 = new short[var6];
            this.field1651 = new short[var6];
            this.field1647 = new short[var6];
            this.field1654 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1650[var13] = field1644[var13];
                this.field1645[var13] = field1652[var13];
                this.field1649[var13] = field1658[var13];
                this.field1651[var13] = field1656[var13];
                this.field1647[var13] = field1659[var13];
                this.field1654[var13] = field1648[var13];
            }
        } catch (Exception var14) {
            this.field1653 = 0;
            this.field1657 = false;
            this.field1646 = false;
        }
    }
}
