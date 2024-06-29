import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class157 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lgf;")
    public class7 field2885 = null;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public int field2891 = -1;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Z")
    public boolean field2889 = false;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[S")
    public short[] field2892;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[S")
    public short[] field2896;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[S")
    public short[] field2895;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[S")
    public short[] field2886;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[S")
    public short[] field2884;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[S")
    private static short[] field2890 = new short[500];

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[S")
    private static short[] field2894 = new short[500];

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[S")
    private static short[] field2888 = new short[500];

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
    private static short[] field2893 = new short[500];

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[S")
    private static short[] field2887 = new short[500];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static void method1059() {
        field2894 = null;
        field2888 = null;
        field2890 = null;
        field2893 = null;
        field2887 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BLgf;)V")
    public class157(byte[] arg0, class7 arg1) {
        this.field2885 = arg1;
        class135 var3 = new class135(arg0);
        class135 var4 = new class135(arg0);
        var3.field2449 = 2;
        int var5 = var3.method920((byte) 61);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2449 = var3.field2449 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2885.field252[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method920((byte) 27);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2894[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2888[var6] = var13;
                } else {
                    field2888[var6] = (short) var4.method940(false);
                }
                if ((var12 & 0x2) == 0) {
                    field2890[var6] = var13;
                } else {
                    field2890[var6] = (short) var4.method940(false);
                }
                if ((var12 & 0x4) == 0) {
                    field2893[var6] = var13;
                } else {
                    field2893[var6] = (short) var4.method940(false);
                }
                if (var11 == 2) {
                    field2888[var6] = (short) (((field2888[var6] & 0xFF) << 3) + (field2888[var6] >> 8 & 0x7));
                    field2890[var6] = (short) (((field2890[var6] & 0xFF) << 3) + (field2890[var6] >> 8 & 0x7));
                    field2893[var6] = (short) (((field2893[var6] & 0xFF) << 3) + (field2893[var6] >> 8 & 0x7));
                }
                field2887[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2887[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2889 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2449) {
            throw new RuntimeException();
        }
        this.field2891 = var6;
        this.field2892 = new short[var6];
        this.field2896 = new short[var6];
        this.field2895 = new short[var6];
        this.field2886 = new short[var6];
        this.field2884 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2892[var10] = field2894[var10];
            this.field2896[var10] = field2888[var10];
            this.field2895[var10] = field2890[var10];
            this.field2886[var10] = field2893[var10];
            this.field2884[var10] = field2887[var10];
        }
    }
}
