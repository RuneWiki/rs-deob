import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class208 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lgb;")
    public class172 field3717 = null;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field3725 = -1;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Z")
    public boolean field3719 = false;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[S")
    public short[] field3723;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[S")
    public short[] field3722;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[S")
    public short[] field3716;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[S")
    public short[] field3721;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[S")
    public short[] field3715;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[S")
    private static short[] field3714 = new short[500];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[S")
    private static short[] field3713 = new short[500];

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[S")
    private static short[] field3720 = new short[500];

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[S")
    private static short[] field3718 = new short[500];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[S")
    private static short[] field3724 = new short[500];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 4)
    public static void method1448() {
        field3724 = null;
        field3713 = null;
        field3714 = null;
        field3720 = null;
        field3718 = null;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BLgb;)V", line = 53)
    public class208(byte[] arg0, class172 arg1) {
        this.field3717 = arg1;
        class249 var3 = new class249(arg0);
        class249 var4 = new class249(arg0);
        var3.field4314 = 2;
        int var5 = var3.method1731(true);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4314 = var3.field4314 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field3717.field3137[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1731(true);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field3724[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3713[var6] = var12;
                } else {
                    field3713[var6] = (short) var4.method1713((byte) 10);
                }
                if ((var11 & 0x2) == 0) {
                    field3714[var6] = var12;
                } else {
                    field3714[var6] = (short) var4.method1713((byte) 115);
                }
                if ((var11 & 0x4) == 0) {
                    field3720[var6] = var12;
                } else {
                    field3720[var6] = (short) var4.method1713((byte) 95);
                }
                if (var10 == 2) {
                    field3713[var6] = (short) (((field3713[var6] & 0xFF) << 3) + (field3713[var6] >> 8 & 0x7));
                    field3714[var6] = (short) (((field3714[var6] & 0xFF) << 3) + (field3714[var6] >> 8 & 0x7));
                    field3720[var6] = (short) (((field3720[var6] & 0xFF) << 3) + (field3720[var6] >> 8 & 0x7));
                }
                field3718[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field3718[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field3719 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4314) {
            throw new RuntimeException();
        }
        this.field3725 = var6;
        this.field3723 = new short[var6];
        this.field3722 = new short[var6];
        this.field3716 = new short[var6];
        this.field3721 = new short[var6];
        this.field3715 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field3723[var13] = field3724[var13];
            this.field3722[var13] = field3713[var13];
            this.field3716[var13] = field3714[var13];
            this.field3721[var13] = field3720[var13];
            this.field3715[var13] = field3718[var13];
        }
    }
}
