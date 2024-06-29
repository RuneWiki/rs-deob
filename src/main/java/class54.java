import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class54 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Z")
    public boolean field849 = false;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public int field857 = -1;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lpa;")
    public class260 field855 = null;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[S")
    public short[] field858;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[S")
    public short[] field851;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[S")
    public short[] field850;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[S")
    public short[] field856;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[S")
    public short[] field847;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[S")
    private static short[] field846 = new short[500];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[S")
    private static short[] field848 = new short[500];

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[S")
    private static short[] field854 = new short[500];

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[S")
    private static short[] field852 = new short[500];

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[S")
    private static short[] field853 = new short[500];

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([BLpa;)V", line = 45)
    public class54(byte[] arg0, class260 arg1) {
        this.field855 = arg1;
        class235 var3 = new class235(arg0);
        class235 var4 = new class235(arg0);
        var3.field4051 = 2;
        int var5 = var3.method1589(79);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4051 = var3.field4051 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field855.field4527[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method1589(89);
            if (var10 > 0) {
                if (this.field855.field4527[var9] == 0) {
                    var8 = var9;
                }
                field853[var6] = (short) var9;
                short var11 = 0;
                if (this.field855.field4527[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field846[var6] = var11;
                } else {
                    field846[var6] = (short) var4.method1572(56);
                }
                if ((var10 & 0x2) == 0) {
                    field852[var6] = var11;
                } else {
                    field852[var6] = (short) var4.method1572(18);
                }
                if ((var10 & 0x4) == 0) {
                    field848[var6] = var11;
                } else {
                    field848[var6] = (short) var4.method1572(-103);
                }
                if (this.field855.field4527[var9] == 2) {
                    field846[var6] = (short) (((field846[var6] & 0xFF) << 3) + (field846[var6] >> 8 & 0x7));
                    field852[var6] = (short) (((field852[var6] & 0xFF) << 3) + (field852[var6] >> 8 & 0x7));
                    field848[var6] = (short) (((field848[var6] & 0xFF) << 3) + (field848[var6] >> 8 & 0x7));
                }
                field854[var6] = -1;
                if (this.field855.field4527[var9] >= 1 && this.field855.field4527[var9] <= 3 && var7 > var8) {
                    field854[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field855.field4527[var9] == 5) {
                    this.field849 = true;
                }
            }
        }
        if (arg0.length != var4.field4051) {
            throw new RuntimeException();
        }
        this.field857 = var6;
        this.field858 = new short[var6];
        this.field851 = new short[var6];
        this.field850 = new short[var6];
        this.field856 = new short[var6];
        this.field847 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field858[var12] = field853[var12];
            this.field851[var12] = field846[var12];
            this.field850[var12] = field852[var12];
            this.field856[var12] = field848[var12];
            this.field847[var12] = field854[var12];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 22)
    public static void method427() {
        field853 = null;
        field846 = null;
        field852 = null;
        field848 = null;
        field854 = null;
    }
}
