import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class52 {

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Z")
    public boolean field830 = false;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field832 = -1;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lnc;")
    public class149 field836 = null;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[S")
    public short[] field824;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[S")
    public short[] field827;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[S")
    public short[] field828;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[S")
    public short[] field835;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[S")
    public short[] field825;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[S")
    private static short[] field829 = new short[500];

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[S")
    private static short[] field826 = new short[500];

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[S")
    private static short[] field831 = new short[500];

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[S")
    private static short[] field834 = new short[500];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[S")
    private static short[] field833 = new short[500];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 7)
    public static void method371() {
        field833 = null;
        field829 = null;
        field826 = null;
        field834 = null;
        field831 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([BLnc;)V", line = 48)
    public class52(byte[] arg0, class149 arg1) {
        this.field836 = arg1;
        class94 var3 = new class94(arg0);
        class94 var4 = new class94(arg0);
        var3.field1653 = 2;
        int var5 = var3.method756(915905888);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1653 = var3.field1653 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field836.field2685[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method756(915905888);
            if (var10 > 0) {
                if (this.field836.field2685[var9] == 0) {
                    var8 = var9;
                }
                field833[var6] = (short) var9;
                short var11 = 0;
                if (this.field836.field2685[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field829[var6] = var11;
                } else {
                    field829[var6] = (short) var4.method702(-117);
                }
                if ((var10 & 0x2) == 0) {
                    field826[var6] = var11;
                } else {
                    field826[var6] = (short) var4.method702(-47);
                }
                if ((var10 & 0x4) == 0) {
                    field834[var6] = var11;
                } else {
                    field834[var6] = (short) var4.method702(-92);
                }
                if (this.field836.field2685[var9] == 2) {
                    field829[var6] = (short) (((field829[var6] & 0xFF) << 3) + (field829[var6] >> 8 & 0x7));
                    field826[var6] = (short) (((field826[var6] & 0xFF) << 3) + (field826[var6] >> 8 & 0x7));
                    field834[var6] = (short) (((field834[var6] & 0xFF) << 3) + (field834[var6] >> 8 & 0x7));
                }
                field831[var6] = -1;
                if (this.field836.field2685[var9] >= 1 && this.field836.field2685[var9] <= 3 && var7 > var8) {
                    field831[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field836.field2685[var9] == 5) {
                    this.field830 = true;
                }
            }
        }
        if (arg0.length != var4.field1653) {
            throw new RuntimeException();
        }
        this.field832 = var6;
        this.field824 = new short[var6];
        this.field827 = new short[var6];
        this.field828 = new short[var6];
        this.field835 = new short[var6];
        this.field825 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field824[var12] = field833[var12];
            this.field827[var12] = field829[var12];
            this.field828[var12] = field826[var12];
            this.field835[var12] = field834[var12];
            this.field825[var12] = field831[var12];
        }
    }
}
