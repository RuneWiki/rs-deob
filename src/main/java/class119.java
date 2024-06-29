import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class119 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Z")
    public boolean field2143 = false;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lqc;")
    public class171 field2153 = null;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public int field2151 = -1;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "[S")
    public short[] field2148;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "[S")
    public short[] field2152;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[S")
    public short[] field2147;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[S")
    public short[] field2144;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[S")
    public short[] field2142;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[S")
    private static short[] field2146 = new short[500];

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[S")
    private static short[] field2149 = new short[500];

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[S")
    private static short[] field2150 = new short[500];

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[S")
    private static short[] field2145 = new short[500];

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[S")
    private static short[] field2154 = new short[500];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static void method723() {
        field2149 = null;
        field2145 = null;
        field2150 = null;
        field2154 = null;
        field2146 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([BLqc;)V")
    public class119(byte[] arg0, class171 arg1) {
        this.field2153 = arg1;
        class229 var3 = new class229(arg0);
        class229 var4 = new class229(arg0);
        var3.field4101 = 2;
        int var5 = var3.method1475(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4101 = var3.field4101 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2153.field3113[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1475(255);
            if (var11 > 0) {
                if (this.field2153.field3113[var9] == 0) {
                    var8 = var9;
                }
                field2149[var6] = (short) var9;
                short var12 = 0;
                if (this.field2153.field3113[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2145[var6] = var12;
                } else {
                    field2145[var6] = (short) var4.method1470(84);
                }
                if ((var11 & 0x2) == 0) {
                    field2150[var6] = var12;
                } else {
                    field2150[var6] = (short) var4.method1470(105);
                }
                if ((var11 & 0x4) == 0) {
                    field2154[var6] = var12;
                } else {
                    field2154[var6] = (short) var4.method1470(25);
                }
                if (this.field2153.field3113[var9] == 2) {
                    field2145[var6] = (short) (((field2145[var6] & 0xFF) << 3) + (field2145[var6] >> 8 & 0x7));
                    field2150[var6] = (short) (((field2150[var6] & 0xFF) << 3) + (field2150[var6] >> 8 & 0x7));
                    field2154[var6] = (short) (((field2154[var6] & 0xFF) << 3) + (field2154[var6] >> 8 & 0x7));
                }
                field2146[var6] = -1;
                if (this.field2153.field3113[var9] >= 1 && this.field2153.field3113[var9] <= 3 && var7 > var8) {
                    field2146[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2153.field3113[var9] == 5) {
                    this.field2143 = true;
                }
            }
        }
        if (arg0.length != var4.field4101) {
            throw new RuntimeException();
        }
        this.field2151 = var6;
        this.field2148 = new short[var6];
        this.field2152 = new short[var6];
        this.field2147 = new short[var6];
        this.field2144 = new short[var6];
        this.field2142 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2148[var10] = field2149[var10];
            this.field2152[var10] = field2145[var10];
            this.field2147[var10] = field2150[var10];
            this.field2144[var10] = field2154[var10];
            this.field2142[var10] = field2146[var10];
        }
    }
}
