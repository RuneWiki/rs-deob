import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class109 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lkc;")
    public class111 field2051 = null;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Z")
    public boolean field2058 = false;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field2061 = -1;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[S")
    public short[] field2057;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[S")
    public short[] field2056;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "[S")
    public short[] field2063;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[S")
    public short[] field2052;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[S")
    public short[] field2053;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[S")
    private static short[] field2059 = new short[500];

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[S")
    private static short[] field2054 = new short[500];

    @OriginalMember(owner = "client!k", name = "j", descriptor = "[S")
    private static short[] field2060 = new short[500];

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[S")
    private static short[] field2055 = new short[500];

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[S")
    private static short[] field2062 = new short[500];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public static void method694() {
        field2055 = null;
        field2062 = null;
        field2054 = null;
        field2060 = null;
        field2059 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([BLkc;)V")
    public class109(byte[] arg0, class111 arg1) {
        this.field2051 = arg1;
        class112 var3 = new class112(arg0);
        class112 var4 = new class112(arg0);
        var3.field2133 = 2;
        int var5 = var3.method716(-1308);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2133 = var3.field2133 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2051.field2103[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method716(-1308);
            if (var11 > 0) {
                if (this.field2051.field2103[var9] == 0) {
                    var8 = var9;
                }
                field2055[var6] = (short) var9;
                short var12 = 0;
                if (this.field2051.field2103[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2062[var6] = var12;
                } else {
                    field2062[var6] = (short) var4.method735(false);
                }
                if ((var11 & 0x2) == 0) {
                    field2054[var6] = var12;
                } else {
                    field2054[var6] = (short) var4.method735(false);
                }
                if ((var11 & 0x4) == 0) {
                    field2060[var6] = var12;
                } else {
                    field2060[var6] = (short) var4.method735(false);
                }
                if (this.field2051.field2103[var9] == 2) {
                    field2062[var6] = (short) (((field2062[var6] & 0xFF) << 3) + (field2062[var6] >> 8 & 0x7));
                    field2054[var6] = (short) (((field2054[var6] & 0xFF) << 3) + (field2054[var6] >> 8 & 0x7));
                    field2060[var6] = (short) (((field2060[var6] & 0xFF) << 3) + (field2060[var6] >> 8 & 0x7));
                }
                field2059[var6] = -1;
                if (this.field2051.field2103[var9] >= 1 && this.field2051.field2103[var9] <= 3 && var7 > var8) {
                    field2059[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2051.field2103[var9] == 5) {
                    this.field2058 = true;
                }
            }
        }
        if (arg0.length != var4.field2133) {
            throw new RuntimeException();
        }
        this.field2061 = var6;
        this.field2057 = new short[var6];
        this.field2056 = new short[var6];
        this.field2063 = new short[var6];
        this.field2052 = new short[var6];
        this.field2053 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2057[var10] = field2055[var10];
            this.field2056[var10] = field2062[var10];
            this.field2063[var10] = field2054[var10];
            this.field2052[var10] = field2060[var10];
            this.field2053[var10] = field2059[var10];
        }
    }
}
