import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class289 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field4608 = -1;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    public boolean field4606 = false;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lpg;")
    public class186 field4610 = null;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Z")
    public boolean field4620 = false;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[S")
    public short[] field4617;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[S")
    public short[] field4609;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[S")
    public short[] field4611;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[S")
    public short[] field4614;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[S")
    public short[] field4613;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[B")
    public byte[] field4615;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[S")
    private static short[] field4607 = new short[500];

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[S")
    private static short[] field4616 = new short[500];

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[S")
    private static short[] field4612 = new short[500];

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[B")
    private static byte[] field4619 = new byte[500];

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[S")
    private static short[] field4618 = new short[500];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[S")
    private static short[] field4605 = new short[500];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public static void method1955() {
        field4616 = null;
        field4618 = null;
        field4612 = null;
        field4605 = null;
        field4607 = null;
        field4619 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([BLpg;)V")
    public class289(byte[] arg0, class186 arg1) {
        this.field4610 = arg1;
        class101 var3 = new class101(arg0);
        class101 var4 = new class101(arg0);
        var3.field1762 = 2;
        int var5 = var3.method669((byte) 36);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1762 = var3.field1762 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4610.field3011[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method669((byte) 36);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4616[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4618[var6] = var13;
                } else {
                    field4618[var6] = (short) var4.method648(-64);
                }
                if ((var12 & 0x2) == 0) {
                    field4612[var6] = var13;
                } else {
                    field4612[var6] = (short) var4.method648(-64);
                }
                if ((var12 & 0x4) == 0) {
                    field4605[var6] = var13;
                } else {
                    field4605[var6] = (short) var4.method648(-64);
                }
                field4619[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field4618[var6] = (short) (((field4618[var6] & 0xFF) << 3) + (field4618[var6] >> 8 & 0x7));
                    field4612[var6] = (short) (((field4612[var6] & 0xFF) << 3) + (field4612[var6] >> 8 & 0x7));
                    field4605[var6] = (short) (((field4605[var6] & 0xFF) << 3) + (field4605[var6] >> 8 & 0x7));
                }
                field4607[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4607[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4620 = true;
                } else if (var11 == 7) {
                    this.field4606 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1762) {
            throw new RuntimeException();
        }
        this.field4608 = var6;
        this.field4617 = new short[var6];
        this.field4609 = new short[var6];
        this.field4611 = new short[var6];
        this.field4614 = new short[var6];
        this.field4613 = new short[var6];
        this.field4615 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4617[var10] = field4616[var10];
            this.field4609[var10] = field4618[var10];
            this.field4611[var10] = field4612[var10];
            this.field4614[var10] = field4605[var10];
            this.field4613[var10] = field4607[var10];
            this.field4615[var10] = field4619[var10];
        }
    }
}
