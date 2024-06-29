import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class207 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field3852 = -1;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Z")
    public boolean field3862 = false;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lwa;")
    public class229 field3860 = null;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[S")
    public short[] field3855;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[S")
    public short[] field3857;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[S")
    public short[] field3850;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "[S")
    public short[] field3856;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "[S")
    public short[] field3858;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[S")
    private static short[] field3851 = new short[500];

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "[S")
    private static short[] field3859 = new short[500];

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[S")
    private static short[] field3853 = new short[500];

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[S")
    private static short[] field3854 = new short[500];

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "[S")
    private static short[] field3861 = new short[500];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
    public static void method1332() {
        field3851 = null;
        field3854 = null;
        field3859 = null;
        field3861 = null;
        field3853 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([BLwa;)V")
    public class207(byte[] arg0, class229 arg1) {
        this.field3860 = arg1;
        class109 var3 = new class109(arg0);
        class109 var4 = new class109(arg0);
        var3.field2053 = 2;
        int var5 = var3.method662((byte) -122);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2053 = var3.field2053 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3860.field4305[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method662((byte) -111);
            if (var11 > 0) {
                if (this.field3860.field4305[var9] == 0) {
                    var8 = var9;
                }
                field3851[var6] = (short) var9;
                short var12 = 0;
                if (this.field3860.field4305[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3854[var6] = var12;
                } else {
                    field3854[var6] = (short) var4.method697(127);
                }
                if ((var11 & 0x2) == 0) {
                    field3859[var6] = var12;
                } else {
                    field3859[var6] = (short) var4.method697(127);
                }
                if ((var11 & 0x4) == 0) {
                    field3861[var6] = var12;
                } else {
                    field3861[var6] = (short) var4.method697(127);
                }
                if (this.field3860.field4305[var9] == 2) {
                    field3854[var6] = (short) (((field3854[var6] & 0xFF) << 3) + (field3854[var6] >> 8 & 0x7));
                    field3859[var6] = (short) (((field3859[var6] & 0xFF) << 3) + (field3859[var6] >> 8 & 0x7));
                    field3861[var6] = (short) (((field3861[var6] & 0xFF) << 3) + (field3861[var6] >> 8 & 0x7));
                }
                field3853[var6] = -1;
                if (this.field3860.field4305[var9] >= 1 && this.field3860.field4305[var9] <= 3 && var7 > var8) {
                    field3853[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3860.field4305[var9] == 5) {
                    this.field3862 = true;
                }
            }
        }
        if (arg0.length != var4.field2053) {
            throw new RuntimeException();
        }
        this.field3852 = var6;
        this.field3855 = new short[var6];
        this.field3857 = new short[var6];
        this.field3850 = new short[var6];
        this.field3856 = new short[var6];
        this.field3858 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3855[var10] = field3851[var10];
            this.field3857[var10] = field3854[var10];
            this.field3850[var10] = field3859[var10];
            this.field3856[var10] = field3861[var10];
            this.field3858[var10] = field3853[var10];
        }
    }
}
