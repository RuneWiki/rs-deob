import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class234 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ljm;")
    public class235 field3707 = null;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field3706 = -1;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
    public boolean field3709 = false;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Z")
    public boolean field3705 = false;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[S")
    public short[] field3708;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[S")
    public short[] field3711;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[S")
    public short[] field3719;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[S")
    public short[] field3718;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[S")
    public short[] field3710;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[B")
    public byte[] field3716;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[B")
    private static byte[] field3712 = new byte[500];

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[S")
    private static short[] field3714 = new short[500];

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[S")
    private static short[] field3715 = new short[500];

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[S")
    private static short[] field3717 = new short[500];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[S")
    private static short[] field3713 = new short[500];

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[S")
    private static short[] field3720 = new short[500];

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([BLjm;)V", line = 56)
    public class234(byte[] arg0, class235 arg1) {
        this.field3707 = arg1;
        class82 var3 = new class82(arg0);
        class82 var4 = new class82(arg0);
        var3.field1301 = 2;
        int var5 = var3.method642((byte) -86);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1301 = var3.field1301 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field3707.field3733[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method642((byte) -55);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field3720[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3717[var6] = var12;
                } else {
                    field3717[var6] = (short) var4.method636(-21208);
                }
                if ((var11 & 0x2) == 0) {
                    field3714[var6] = var12;
                } else {
                    field3714[var6] = (short) var4.method636(-21208);
                }
                if ((var11 & 0x4) == 0) {
                    field3713[var6] = var12;
                } else {
                    field3713[var6] = (short) var4.method636(-21208);
                }
                field3712[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field3717[var6] = (short) (((field3717[var6] & 0xFF) << 3) + (field3717[var6] >> 8 & 0x7));
                    field3714[var6] = (short) (((field3714[var6] & 0xFF) << 3) + (field3714[var6] >> 8 & 0x7));
                    field3713[var6] = (short) (((field3713[var6] & 0xFF) << 3) + (field3713[var6] >> 8 & 0x7));
                }
                field3715[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field3715[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field3709 = true;
                } else if (var10 == 7) {
                    this.field3705 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1301) {
            throw new RuntimeException();
        }
        this.field3706 = var6;
        this.field3708 = new short[var6];
        this.field3711 = new short[var6];
        this.field3719 = new short[var6];
        this.field3718 = new short[var6];
        this.field3710 = new short[var6];
        this.field3716 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field3708[var13] = field3720[var13];
            this.field3711[var13] = field3717[var13];
            this.field3719[var13] = field3714[var13];
            this.field3718[var13] = field3713[var13];
            this.field3710[var13] = field3715[var13];
            this.field3716[var13] = field3712[var13];
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 42)
    public static void method1577() {
        field3720 = null;
        field3717 = null;
        field3714 = null;
        field3713 = null;
        field3715 = null;
        field3712 = null;
    }
}
