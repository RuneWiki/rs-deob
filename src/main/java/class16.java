import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Z")
    public boolean field157 = false;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Luh;")
    public class101 field162 = null;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public int field165 = -1;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "[S")
    public short[] field167;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[S")
    public short[] field164;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[S")
    public short[] field159;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[S")
    public short[] field158;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[S")
    public short[] field163;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[S")
    private static short[] field161 = new short[500];

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[S")
    private static short[] field166 = new short[500];

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[S")
    private static short[] field160 = new short[500];

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[S")
    private static short[] field168 = new short[500];

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[S")
    private static short[] field169 = new short[500];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public static void method99() {
        field161 = null;
        field169 = null;
        field166 = null;
        field160 = null;
        field168 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLuh;)V")
    public class16(byte[] arg0, class101 arg1) {
        this.field162 = arg1;
        class261 var3 = new class261(arg0);
        class261 var4 = new class261(arg0);
        var3.field4587 = 2;
        int var5 = var3.method1693((byte) -93);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4587 = var3.field4587 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field162.field1723[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1693((byte) 87);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field161[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field169[var6] = var13;
                } else {
                    field169[var6] = (short) var4.method1728(31597);
                }
                if ((var12 & 0x2) == 0) {
                    field166[var6] = var13;
                } else {
                    field166[var6] = (short) var4.method1728(31597);
                }
                if ((var12 & 0x4) == 0) {
                    field160[var6] = var13;
                } else {
                    field160[var6] = (short) var4.method1728(31597);
                }
                if (var11 == 2) {
                    field169[var6] = (short) (((field169[var6] & 0xFF) << 3) + (field169[var6] >> 8 & 0x7));
                    field166[var6] = (short) (((field166[var6] & 0xFF) << 3) + (field166[var6] >> 8 & 0x7));
                    field160[var6] = (short) (((field160[var6] & 0xFF) << 3) + (field160[var6] >> 8 & 0x7));
                }
                field168[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field168[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field157 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4587) {
            throw new RuntimeException();
        }
        this.field165 = var6;
        this.field167 = new short[var6];
        this.field164 = new short[var6];
        this.field159 = new short[var6];
        this.field158 = new short[var6];
        this.field163 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field167[var10] = field161[var10];
            this.field164[var10] = field169[var10];
            this.field159[var10] = field166[var10];
            this.field158[var10] = field160[var10];
            this.field163[var10] = field168[var10];
        }
    }
}
