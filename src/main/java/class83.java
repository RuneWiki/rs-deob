import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class83 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
    public boolean field1053 = false;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Lai;")
    public class134 field1063 = null;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Z")
    public boolean field1065 = false;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field1064 = -1;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[S")
    public short[] field1057;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[S")
    public short[] field1056;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[S")
    public short[] field1055;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[S")
    public short[] field1051;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[S")
    public short[] field1062;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[B")
    public byte[] field1060;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "[S")
    private static short[] field1052 = new short[500];

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[S")
    private static short[] field1054 = new short[500];

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[S")
    private static short[] field1059 = new short[500];

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[S")
    private static short[] field1061 = new short[500];

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "[S")
    private static short[] field1066 = new short[500];

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[B")
    private static byte[] field1058 = new byte[500];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 5)
    public static void method490() {
        field1061 = null;
        field1054 = null;
        field1059 = null;
        field1066 = null;
        field1052 = null;
        field1058 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([BLai;)V", line = 54)
    public class83(byte[] arg0, class134 arg1) {
        this.field1063 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1400 = 2;
        int var5 = var3.method661(-1);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1400 = var3.field1400 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field1063.field1845[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method661(-1);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field1061[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field1054[var6] = var12;
                } else {
                    field1054[var6] = (short) var4.method650(-124);
                }
                if ((var11 & 0x2) == 0) {
                    field1059[var6] = var12;
                } else {
                    field1059[var6] = (short) var4.method650(-103);
                }
                if ((var11 & 0x4) == 0) {
                    field1066[var6] = var12;
                } else {
                    field1066[var6] = (short) var4.method650(-113);
                }
                field1058[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field1054[var6] = (short) (((field1054[var6] & 0xFF) << 3) + (field1054[var6] >> 8 & 0x7));
                    field1059[var6] = (short) (((field1059[var6] & 0xFF) << 3) + (field1059[var6] >> 8 & 0x7));
                    field1066[var6] = (short) (((field1066[var6] & 0xFF) << 3) + (field1066[var6] >> 8 & 0x7));
                }
                field1052[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field1052[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field1053 = true;
                } else if (var10 == 7) {
                    this.field1065 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field1400) {
            throw new RuntimeException();
        }
        this.field1064 = var6;
        this.field1057 = new short[var6];
        this.field1056 = new short[var6];
        this.field1055 = new short[var6];
        this.field1051 = new short[var6];
        this.field1062 = new short[var6];
        this.field1060 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field1057[var13] = field1061[var13];
            this.field1056[var13] = field1054[var13];
            this.field1055[var13] = field1059[var13];
            this.field1051[var13] = field1066[var13];
            this.field1062[var13] = field1052[var13];
            this.field1060[var13] = field1058[var13];
        }
    }
}
