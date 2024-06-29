import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class158 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lrg;")
    public class217 field2696 = null;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field2699 = -1;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Z")
    public boolean field2695 = false;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[S")
    public short[] field2694;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[S")
    public short[] field2693;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[S")
    public short[] field2697;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[S")
    public short[] field2701;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[S")
    public short[] field2705;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[S")
    private static short[] field2698 = new short[500];

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[S")
    private static short[] field2700 = new short[500];

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[S")
    private static short[] field2703 = new short[500];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[S")
    private static short[] field2702 = new short[500];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[S")
    private static short[] field2704 = new short[500];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
    public static void method1034() {
        field2700 = null;
        field2702 = null;
        field2698 = null;
        field2704 = null;
        field2703 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([BLrg;)V")
    public class158(byte[] arg0, class217 arg1) {
        this.field2696 = arg1;
        class247 var3 = new class247(arg0);
        class247 var4 = new class247(arg0);
        var3.field4224 = 2;
        int var5 = var3.method1711((byte) -67);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4224 = var3.field4224 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2696.field3818[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1711((byte) -67);
            if (var11 > 0) {
                if (this.field2696.field3818[var9] == 0) {
                    var8 = var9;
                }
                field2700[var6] = (short) var9;
                short var12 = 0;
                if (this.field2696.field3818[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2702[var6] = var12;
                } else {
                    field2702[var6] = (short) var4.method1663(false);
                }
                if ((var11 & 0x2) == 0) {
                    field2698[var6] = var12;
                } else {
                    field2698[var6] = (short) var4.method1663(false);
                }
                if ((var11 & 0x4) == 0) {
                    field2704[var6] = var12;
                } else {
                    field2704[var6] = (short) var4.method1663(false);
                }
                if (this.field2696.field3818[var9] == 2) {
                    field2702[var6] = (short) (((field2702[var6] & 0xFF) << 3) + (field2702[var6] >> 8 & 0x7));
                    field2698[var6] = (short) (((field2698[var6] & 0xFF) << 3) + (field2698[var6] >> 8 & 0x7));
                    field2704[var6] = (short) (((field2704[var6] & 0xFF) << 3) + (field2704[var6] >> 8 & 0x7));
                }
                field2703[var6] = -1;
                if (this.field2696.field3818[var9] >= 1 && this.field2696.field3818[var9] <= 3 && var7 > var8) {
                    field2703[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2696.field3818[var9] == 5) {
                    this.field2695 = true;
                }
            }
        }
        if (arg0.length != var4.field4224) {
            throw new RuntimeException();
        }
        this.field2699 = var6;
        this.field2694 = new short[var6];
        this.field2693 = new short[var6];
        this.field2697 = new short[var6];
        this.field2701 = new short[var6];
        this.field2705 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2694[var10] = field2700[var10];
            this.field2693[var10] = field2702[var10];
            this.field2697[var10] = field2698[var10];
            this.field2701[var10] = field2704[var10];
            this.field2705[var10] = field2703[var10];
        }
    }
}
