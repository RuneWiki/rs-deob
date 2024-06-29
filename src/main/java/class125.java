import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class125 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Z")
    public boolean field2074 = false;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lf;")
    public class273 field2077 = null;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field2075 = -1;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "[S")
    public short[] field2073;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[S")
    public short[] field2069;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[S")
    public short[] field2068;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[S")
    public short[] field2067;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[S")
    public short[] field2065;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[S")
    private static short[] field2072 = new short[500];

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[S")
    private static short[] field2066 = new short[500];

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "[S")
    private static short[] field2076 = new short[500];

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[S")
    private static short[] field2071 = new short[500];

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[S")
    private static short[] field2070 = new short[500];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
    public static void method850() {
        field2072 = null;
        field2066 = null;
        field2070 = null;
        field2071 = null;
        field2076 = null;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "([BLf;)V")
    public class125(byte[] arg0, class273 arg1) {
        this.field2077 = arg1;
        class225 var3 = new class225(arg0);
        class225 var4 = new class225(arg0);
        var3.field3996 = 2;
        int var5 = var3.method1580(-118);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3996 = var3.field3996 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2077.field4826[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1580(-57);
            if (var11 > 0) {
                if (this.field2077.field4826[var9] == 0) {
                    var8 = var9;
                }
                field2072[var6] = (short) var9;
                short var12 = 0;
                if (this.field2077.field4826[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2066[var6] = var12;
                } else {
                    field2066[var6] = (short) var4.method1588(128);
                }
                if ((var11 & 0x2) == 0) {
                    field2070[var6] = var12;
                } else {
                    field2070[var6] = (short) var4.method1588(128);
                }
                if ((var11 & 0x4) == 0) {
                    field2071[var6] = var12;
                } else {
                    field2071[var6] = (short) var4.method1588(128);
                }
                if (this.field2077.field4826[var9] == 2) {
                    field2066[var6] = (short) (((field2066[var6] & 0xFF) << 3) + (field2066[var6] >> 8 & 0x7));
                    field2070[var6] = (short) (((field2070[var6] & 0xFF) << 3) + (field2070[var6] >> 8 & 0x7));
                    field2071[var6] = (short) (((field2071[var6] & 0xFF) << 3) + (field2071[var6] >> 8 & 0x7));
                }
                field2076[var6] = -1;
                if (this.field2077.field4826[var9] >= 1 && this.field2077.field4826[var9] <= 3 && var7 > var8) {
                    field2076[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2077.field4826[var9] == 5) {
                    this.field2074 = true;
                }
            }
        }
        if (arg0.length != var4.field3996) {
            throw new RuntimeException();
        }
        this.field2075 = var6;
        this.field2073 = new short[var6];
        this.field2069 = new short[var6];
        this.field2068 = new short[var6];
        this.field2067 = new short[var6];
        this.field2065 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2073[var10] = field2072[var10];
            this.field2069[var10] = field2066[var10];
            this.field2068[var10] = field2070[var10];
            this.field2067[var10] = field2071[var10];
            this.field2065[var10] = field2076[var10];
        }
    }
}
