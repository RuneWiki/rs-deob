import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class33 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lii;")
    public class88 field674 = null;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field682 = -1;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Z")
    public boolean field680 = false;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
    public short[] field681;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
    public short[] field679;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[S")
    public short[] field675;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[S")
    public short[] field678;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[S")
    public short[] field676;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[S")
    private static short[] field673 = new short[500];

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[S")
    private static short[] field677 = new short[500];

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[S")
    private static short[] field683 = new short[500];

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[S")
    private static short[] field684 = new short[500];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[S")
    private static short[] field672 = new short[500];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static void method239() {
        field672 = null;
        field673 = null;
        field684 = null;
        field683 = null;
        field677 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BLii;)V")
    public class33(byte[] arg0, class88 arg1) {
        this.field674 = arg1;
        class146 var3 = new class146(arg0);
        class146 var4 = new class146(arg0);
        var3.field2865 = 2;
        int var5 = var3.method991(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2865 = var3.field2865 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field674.field1766[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method991(255);
            if (var11 > 0) {
                if (this.field674.field1766[var9] == 0) {
                    var8 = var9;
                }
                field672[var6] = (short) var9;
                short var12 = 0;
                if (this.field674.field1766[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field673[var6] = var12;
                } else {
                    field673[var6] = (short) var4.method990((byte) 77);
                }
                if ((var11 & 0x2) == 0) {
                    field684[var6] = var12;
                } else {
                    field684[var6] = (short) var4.method990((byte) 76);
                }
                if ((var11 & 0x4) == 0) {
                    field683[var6] = var12;
                } else {
                    field683[var6] = (short) var4.method990((byte) 123);
                }
                if (this.field674.field1766[var9] == 2) {
                    field673[var6] = (short) (((field673[var6] & 0xFF) << 3) + (field673[var6] >> 8 & 0x7));
                    field684[var6] = (short) (((field684[var6] & 0xFF) << 3) + (field684[var6] >> 8 & 0x7));
                    field683[var6] = (short) (((field683[var6] & 0xFF) << 3) + (field683[var6] >> 8 & 0x7));
                }
                field677[var6] = -1;
                if (this.field674.field1766[var9] >= 1 && this.field674.field1766[var9] <= 3 && var7 > var8) {
                    field677[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field674.field1766[var9] == 5) {
                    this.field680 = true;
                }
            }
        }
        if (arg0.length != var4.field2865) {
            throw new RuntimeException();
        }
        this.field682 = var6;
        this.field681 = new short[var6];
        this.field679 = new short[var6];
        this.field675 = new short[var6];
        this.field678 = new short[var6];
        this.field676 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field681[var10] = field672[var10];
            this.field679[var10] = field673[var10];
            this.field675[var10] = field684[var10];
            this.field678[var10] = field683[var10];
            this.field676[var10] = field677[var10];
        }
    }
}
