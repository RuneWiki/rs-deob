import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class57 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lok;")
    public class40 field1163 = null;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public int field1162 = -1;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
    public boolean field1168 = false;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[S")
    public short[] field1170;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[S")
    public short[] field1166;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "[S")
    public short[] field1173;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[S")
    public short[] field1167;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[S")
    public short[] field1171;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[S")
    private static short[] field1164 = new short[500];

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[S")
    private static short[] field1169 = new short[500];

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[S")
    private static short[] field1165 = new short[500];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[S")
    private static short[] field1174 = new short[500];

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[S")
    private static short[] field1172 = new short[500];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
    public static void method445() {
        field1164 = null;
        field1169 = null;
        field1174 = null;
        field1165 = null;
        field1172 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([BLok;)V")
    public class57(byte[] arg0, class40 arg1) {
        this.field1163 = arg1;
        class106 var3 = new class106(arg0);
        class106 var4 = new class106(arg0);
        var3.field2085 = 2;
        int var5 = var3.method774((byte) 105);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2085 = var3.field2085 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field1163.field685[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method774((byte) 82);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field1164[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field1169[var6] = var13;
                } else {
                    field1169[var6] = (short) var4.method768((byte) 96);
                }
                if ((var12 & 0x2) == 0) {
                    field1174[var6] = var13;
                } else {
                    field1174[var6] = (short) var4.method768((byte) 96);
                }
                if ((var12 & 0x4) == 0) {
                    field1165[var6] = var13;
                } else {
                    field1165[var6] = (short) var4.method768((byte) 96);
                }
                if (var11 == 2) {
                    field1169[var6] = (short) (((field1169[var6] & 0xFF) << 3) + (field1169[var6] >> 8 & 0x7));
                    field1174[var6] = (short) (((field1174[var6] & 0xFF) << 3) + (field1174[var6] >> 8 & 0x7));
                    field1165[var6] = (short) (((field1165[var6] & 0xFF) << 3) + (field1165[var6] >> 8 & 0x7));
                }
                field1172[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field1172[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field1168 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2085) {
            throw new RuntimeException();
        }
        this.field1162 = var6;
        this.field1170 = new short[var6];
        this.field1166 = new short[var6];
        this.field1173 = new short[var6];
        this.field1167 = new short[var6];
        this.field1171 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1170[var10] = field1164[var10];
            this.field1166[var10] = field1169[var10];
            this.field1173[var10] = field1174[var10];
            this.field1167[var10] = field1165[var10];
            this.field1171[var10] = field1172[var10];
        }
    }
}
