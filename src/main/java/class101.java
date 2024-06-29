import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class101 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Luj;")
    public class16 field1943 = null;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Z")
    public boolean field1945 = false;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field1949 = -1;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[S")
    public short[] field1948;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[S")
    public short[] field1950;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[S")
    public short[] field1951;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[S")
    public short[] field1953;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[S")
    public short[] field1954;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[S")
    private static short[] field1946 = new short[500];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[S")
    private static short[] field1942 = new short[500];

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[S")
    private static short[] field1947 = new short[500];

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[S")
    private static short[] field1944 = new short[500];

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[S")
    private static short[] field1952 = new short[500];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    public static void method812() {
        field1947 = null;
        field1942 = null;
        field1944 = null;
        field1946 = null;
        field1952 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([BLuj;)V")
    public class101(byte[] arg0, class16 arg1) {
        this.field1943 = arg1;
        class81 var3 = new class81(arg0);
        class81 var4 = new class81(arg0);
        var3.field1541 = 2;
        int var5 = var3.method622(true);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1541 = var3.field1541 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1943.field227[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method622(true);
            if (var11 > 0) {
                if (this.field1943.field227[var9] == 0) {
                    var8 = var9;
                }
                field1947[var6] = (short) var9;
                short var12 = 0;
                if (this.field1943.field227[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field1942[var6] = var12;
                } else {
                    field1942[var6] = (short) var4.method657((byte) -62);
                }
                if ((var11 & 0x2) == 0) {
                    field1944[var6] = var12;
                } else {
                    field1944[var6] = (short) var4.method657((byte) 126);
                }
                if ((var11 & 0x4) == 0) {
                    field1946[var6] = var12;
                } else {
                    field1946[var6] = (short) var4.method657((byte) 122);
                }
                if (this.field1943.field227[var9] == 2) {
                    field1942[var6] = (short) (((field1942[var6] & 0xFF) << 3) + (field1942[var6] >> 8 & 0x7));
                    field1944[var6] = (short) (((field1944[var6] & 0xFF) << 3) + (field1944[var6] >> 8 & 0x7));
                    field1946[var6] = (short) (((field1946[var6] & 0xFF) << 3) + (field1946[var6] >> 8 & 0x7));
                }
                field1952[var6] = -1;
                if (this.field1943.field227[var9] >= 1 && this.field1943.field227[var9] <= 3 && var7 > var8) {
                    field1952[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field1943.field227[var9] == 5) {
                    this.field1945 = true;
                }
            }
        }
        if (arg0.length != var4.field1541) {
            throw new RuntimeException();
        }
        this.field1949 = var6;
        this.field1948 = new short[var6];
        this.field1950 = new short[var6];
        this.field1951 = new short[var6];
        this.field1953 = new short[var6];
        this.field1954 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1948[var10] = field1947[var10];
            this.field1950[var10] = field1942[var10];
            this.field1951[var10] = field1944[var10];
            this.field1953[var10] = field1946[var10];
            this.field1954[var10] = field1952[var10];
        }
    }
}
