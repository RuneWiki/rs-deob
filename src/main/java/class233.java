import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class233 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Z")
    public boolean field3738 = false;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public int field3743 = -1;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lmh;")
    public class152 field3742 = null;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Z")
    public boolean field3748 = false;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[S")
    public short[] field3751;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[S")
    public short[] field3745;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[S")
    public short[] field3747;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[S")
    public short[] field3744;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[S")
    public short[] field3739;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[B")
    public byte[] field3737;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[S")
    private static short[] field3740 = new short[500];

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[S")
    private static short[] field3741 = new short[500];

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "[B")
    private static byte[] field3746 = new byte[500];

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[S")
    private static short[] field3749 = new short[500];

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[S")
    private static short[] field3750 = new short[500];

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "[S")
    private static short[] field3752 = new short[500];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
    public static void method1587() {
        field3740 = null;
        field3750 = null;
        field3741 = null;
        field3749 = null;
        field3752 = null;
        field3746 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([BLmh;)V")
    public class233(byte[] arg0, class152 arg1) {
        this.field3742 = arg1;
        class25 var3 = new class25(arg0);
        class25 var4 = new class25(arg0);
        var3.field349 = 2;
        int var5 = var3.method201(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field349 = var3.field349 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field3742.field2263[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method201(255);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field3740[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field3750[var6] = var13;
                } else {
                    field3750[var6] = (short) var4.method168(-65);
                }
                if ((var12 & 0x2) == 0) {
                    field3741[var6] = var13;
                } else {
                    field3741[var6] = (short) var4.method168(-90);
                }
                if ((var12 & 0x4) == 0) {
                    field3749[var6] = var13;
                } else {
                    field3749[var6] = (short) var4.method168(-29);
                }
                field3746[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field3750[var6] = (short) (((field3750[var6] & 0xFF) << 3) + (field3750[var6] >> 8 & 0x7));
                    field3741[var6] = (short) (((field3741[var6] & 0xFF) << 3) + (field3741[var6] >> 8 & 0x7));
                    field3749[var6] = (short) (((field3749[var6] & 0xFF) << 3) + (field3749[var6] >> 8 & 0x7));
                }
                field3752[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field3752[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field3738 = true;
                } else if (var11 == 7) {
                    this.field3748 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field349) {
            throw new RuntimeException();
        }
        this.field3743 = var6;
        this.field3751 = new short[var6];
        this.field3745 = new short[var6];
        this.field3747 = new short[var6];
        this.field3744 = new short[var6];
        this.field3739 = new short[var6];
        this.field3737 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3751[var10] = field3740[var10];
            this.field3745[var10] = field3750[var10];
            this.field3747[var10] = field3741[var10];
            this.field3744[var10] = field3749[var10];
            this.field3739[var10] = field3752[var10];
            this.field3737[var10] = field3746[var10];
        }
    }
}
