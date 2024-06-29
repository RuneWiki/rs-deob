import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class231 {

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Z")
    public boolean field4046 = false;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Ls;")
    public class230 field4048 = null;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field4051 = -1;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[S")
    public short[] field4041;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
    public short[] field4040;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[S")
    public short[] field4043;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[S")
    public short[] field4042;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[S")
    public short[] field4039;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[S")
    private static short[] field4044 = new short[500];

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[S")
    private static short[] field4045 = new short[500];

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[S")
    private static short[] field4050 = new short[500];

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[S")
    private static short[] field4049 = new short[500];

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[S")
    private static short[] field4047 = new short[500];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
    public static void method1556() {
        field4044 = null;
        field4045 = null;
        field4047 = null;
        field4050 = null;
        field4049 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BLs;)V")
    public class231(byte[] arg0, class230 arg1) {
        this.field4048 = arg1;
        class194 var3 = new class194(arg0);
        class194 var4 = new class194(arg0);
        var3.field3497 = 2;
        int var5 = var3.method1301(-8317);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3497 = var3.field3497 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4048.field4030[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1301(-8317);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4044[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4045[var6] = var13;
                } else {
                    field4045[var6] = (short) var4.method1307(5);
                }
                if ((var12 & 0x2) == 0) {
                    field4047[var6] = var13;
                } else {
                    field4047[var6] = (short) var4.method1307(5);
                }
                if ((var12 & 0x4) == 0) {
                    field4050[var6] = var13;
                } else {
                    field4050[var6] = (short) var4.method1307(5);
                }
                if (var11 == 2) {
                    field4045[var6] = (short) (((field4045[var6] & 0xFF) << 3) + (field4045[var6] >> 8 & 0x7));
                    field4047[var6] = (short) (((field4047[var6] & 0xFF) << 3) + (field4047[var6] >> 8 & 0x7));
                    field4050[var6] = (short) (((field4050[var6] & 0xFF) << 3) + (field4050[var6] >> 8 & 0x7));
                }
                field4049[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4049[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4046 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3497) {
            throw new RuntimeException();
        }
        this.field4051 = var6;
        this.field4041 = new short[var6];
        this.field4040 = new short[var6];
        this.field4043 = new short[var6];
        this.field4042 = new short[var6];
        this.field4039 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4041[var10] = field4044[var10];
            this.field4040[var10] = field4045[var10];
            this.field4043[var10] = field4047[var10];
            this.field4042[var10] = field4050[var10];
            this.field4039[var10] = field4049[var10];
        }
    }
}
