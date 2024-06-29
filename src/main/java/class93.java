import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class93 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public int field1751 = -1;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Z")
    public boolean field1749 = false;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
    public boolean field1756 = false;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Lpk;")
    public class112 field1762 = null;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "[S")
    public short[] field1761;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "[S")
    public short[] field1760;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "[S")
    public short[] field1757;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "[S")
    public short[] field1758;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[S")
    public short[] field1763;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[B")
    public byte[] field1754;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[S")
    private static short[] field1750 = new short[500];

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[S")
    private static short[] field1752 = new short[500];

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[S")
    private static short[] field1753 = new short[500];

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "[S")
    private static short[] field1755 = new short[500];

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "[S")
    private static short[] field1759 = new short[500];

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "[B")
    private static byte[] field1764 = new byte[500];

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "([BLpk;)V", line = 57)
    public class93(byte[] arg0, class112 arg1) {
        this.field1762 = arg1;
        class53 var3 = new class53(arg0);
        class53 var4 = new class53(arg0);
        var3.field1142 = 2;
        int var5 = var3.method483(-103);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1142 = var3.field1142 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field1762.field2054[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method483(-104);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field1755[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field1752[var6] = var12;
                } else {
                    field1752[var6] = (short) var4.method492(28129);
                }
                if ((var11 & 0x2) == 0) {
                    field1753[var6] = var12;
                } else {
                    field1753[var6] = (short) var4.method492(28129);
                }
                if ((var11 & 0x4) == 0) {
                    field1759[var6] = var12;
                } else {
                    field1759[var6] = (short) var4.method492(28129);
                }
                field1764[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field1752[var6] = (short) (((field1752[var6] & 0xFF) << 3) + (field1752[var6] >> 8 & 0x7));
                    field1753[var6] = (short) (((field1753[var6] & 0xFF) << 3) + (field1753[var6] >> 8 & 0x7));
                    field1759[var6] = (short) (((field1759[var6] & 0xFF) << 3) + (field1759[var6] >> 8 & 0x7));
                }
                field1750[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field1750[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field1749 = true;
                } else if (var10 == 7) {
                    this.field1756 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1142) {
            throw new RuntimeException();
        }
        this.field1751 = var6;
        this.field1761 = new short[var6];
        this.field1760 = new short[var6];
        this.field1757 = new short[var6];
        this.field1758 = new short[var6];
        this.field1763 = new short[var6];
        this.field1754 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field1761[var13] = field1755[var13];
            this.field1760[var13] = field1752[var13];
            this.field1757[var13] = field1753[var13];
            this.field1758[var13] = field1759[var13];
            this.field1763[var13] = field1750[var13];
            this.field1754[var13] = field1764[var13];
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 21)
    public static void method790() {
        field1755 = null;
        field1752 = null;
        field1753 = null;
        field1759 = null;
        field1750 = null;
        field1764 = null;
    }
}
