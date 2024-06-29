import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class249 {

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public int field3737 = -1;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public boolean field3735 = false;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lbc;")
    public class101 field3733 = null;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Z")
    public boolean field3746 = false;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[S")
    public short[] field3745;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[S")
    public short[] field3740;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[S")
    public short[] field3743;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[S")
    public short[] field3732;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[S")
    public short[] field3742;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[B")
    public byte[] field3734;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[S")
    private static short[] field3731 = new short[500];

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[S")
    private static short[] field3736 = new short[500];

    @OriginalMember(owner = "client!n", name = "k", descriptor = "[S")
    private static short[] field3741 = new short[500];

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[S")
    private static short[] field3738 = new short[500];

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[B")
    private static byte[] field3744 = new byte[500];

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[S")
    private static short[] field3739 = new short[500];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public static void method1637() {
        field3736 = null;
        field3739 = null;
        field3731 = null;
        field3738 = null;
        field3741 = null;
        field3744 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLbc;)V")
    public class249(byte[] arg0, class101 arg1) {
        this.field3733 = arg1;
        class114 var3 = new class114(arg0);
        class114 var4 = new class114(arg0);
        var3.field1673 = 2;
        int var5 = var3.method760(false);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1673 = var3.field1673 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field3733.field1501[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method760(false);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field3736[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field3739[var6] = var13;
                } else {
                    field3739[var6] = (short) var4.method736(-128);
                }
                if ((var12 & 0x2) == 0) {
                    field3731[var6] = var13;
                } else {
                    field3731[var6] = (short) var4.method736(-128);
                }
                if ((var12 & 0x4) == 0) {
                    field3738[var6] = var13;
                } else {
                    field3738[var6] = (short) var4.method736(-128);
                }
                field3744[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field3739[var6] = (short) (((field3739[var6] & 0xFF) << 3) + (field3739[var6] >> 8 & 0x7));
                    field3731[var6] = (short) (((field3731[var6] & 0xFF) << 3) + (field3731[var6] >> 8 & 0x7));
                    field3738[var6] = (short) (((field3738[var6] & 0xFF) << 3) + (field3738[var6] >> 8 & 0x7));
                }
                field3741[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field3741[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field3735 = true;
                } else if (var11 == 7) {
                    this.field3746 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1673) {
            throw new RuntimeException();
        }
        this.field3737 = var6;
        this.field3745 = new short[var6];
        this.field3740 = new short[var6];
        this.field3743 = new short[var6];
        this.field3732 = new short[var6];
        this.field3742 = new short[var6];
        this.field3734 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3745[var10] = field3736[var10];
            this.field3740[var10] = field3739[var10];
            this.field3743[var10] = field3731[var10];
            this.field3732[var10] = field3738[var10];
            this.field3742[var10] = field3741[var10];
            this.field3734[var10] = field3744[var10];
        }
    }
}
