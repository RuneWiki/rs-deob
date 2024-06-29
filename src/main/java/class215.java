import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class215 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field3597 = -1;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Leb;")
    public class110 field3598 = null;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Z")
    public boolean field3596 = false;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[S")
    public short[] field3593;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[S")
    public short[] field3594;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[S")
    public short[] field3605;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[S")
    public short[] field3601;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[S")
    public short[] field3600;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[S")
    private static short[] field3599 = new short[500];

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[S")
    private static short[] field3595 = new short[500];

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "[S")
    private static short[] field3604 = new short[500];

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[S")
    private static short[] field3602 = new short[500];

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "[S")
    private static short[] field3603 = new short[500];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 9)
    public static void method1518() {
        field3595 = null;
        field3602 = null;
        field3599 = null;
        field3603 = null;
        field3604 = null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([BLeb;)V", line = 50)
    public class215(byte[] arg0, class110 arg1) {
        this.field3598 = arg1;
        class26 var3 = new class26(arg0);
        class26 var4 = new class26(arg0);
        var3.field478 = 2;
        int var5 = var3.method226(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field478 = var3.field478 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field3598.field1932[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method226(255);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field3595[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3602[var6] = var12;
                } else {
                    field3602[var6] = (short) var4.method192((byte) -108);
                }
                if ((var11 & 0x2) == 0) {
                    field3599[var6] = var12;
                } else {
                    field3599[var6] = (short) var4.method192((byte) -120);
                }
                if ((var11 & 0x4) == 0) {
                    field3603[var6] = var12;
                } else {
                    field3603[var6] = (short) var4.method192((byte) 126);
                }
                if (var10 == 2) {
                    field3602[var6] = (short) (((field3602[var6] & 0xFF) << 3) + (field3602[var6] >> 8 & 0x7));
                    field3599[var6] = (short) (((field3599[var6] & 0xFF) << 3) + (field3599[var6] >> 8 & 0x7));
                    field3603[var6] = (short) (((field3603[var6] & 0xFF) << 3) + (field3603[var6] >> 8 & 0x7));
                }
                field3604[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field3604[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field3596 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field478) {
            throw new RuntimeException();
        }
        this.field3597 = var6;
        this.field3593 = new short[var6];
        this.field3594 = new short[var6];
        this.field3605 = new short[var6];
        this.field3601 = new short[var6];
        this.field3600 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field3593[var13] = field3595[var13];
            this.field3594[var13] = field3602[var13];
            this.field3605[var13] = field3599[var13];
            this.field3601[var13] = field3603[var13];
            this.field3600[var13] = field3604[var13];
        }
    }
}
