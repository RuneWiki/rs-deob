import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class81 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lmt;")
    public class414 field1069 = null;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field1072 = 0;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Z")
    public boolean field1077 = false;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    public boolean field1071 = false;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
    public boolean field1068 = false;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[S")
    public short[] field1080;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[S")
    public short[] field1082;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[S")
    public short[] field1073;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "[S")
    public short[] field1076;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[S")
    public short[] field1067;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[B")
    public byte[] field1081;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[S")
    private static short[] field1070 = new short[500];

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[S")
    private static short[] field1078 = new short[500];

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[B")
    private static byte[] field1074 = new byte[500];

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[S")
    private static short[] field1075 = new short[500];

    @OriginalMember(owner = "client!u", name = "q", descriptor = "[S")
    private static short[] field1083 = new short[500];

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[S")
    private static short[] field1079 = new short[500];

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static void method604() {
        field1070 = null;
        field1079 = null;
        field1075 = null;
        field1083 = null;
        field1078 = null;
        field1074 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([BLmt;)V")
    public class81(byte[] arg0, class414 arg1) {
        this.field1069 = arg1;
        try {
            class120 var3 = new class120(arg0);
            class120 var4 = new class120(arg0);
            var3.method842(2384);
            var3.field1521 += 2;
            int var5 = var3.method842(2384);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1521 = var3.field1521 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1069.field5849[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method842(2384);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1070[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1079[var6] = var12;
                    } else {
                        field1079[var6] = (short) var4.method857(49152);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1075[var6] = var12;
                    } else {
                        field1075[var6] = (short) var4.method857(49152);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1083[var6] = var12;
                    } else {
                        field1083[var6] = (short) var4.method857(49152);
                    }
                    field1074[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1079[var6] = (short) (field1079[var6] << 2 & 0x3FFF);
                        field1075[var6] = (short) (field1075[var6] << 2 & 0x3FFF);
                        field1083[var6] = (short) (field1083[var6] << 2 & 0x3FFF);
                    }
                    field1078[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1078[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1077 = true;
                    } else if (var10 == 7) {
                        this.field1068 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1071 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1521) {
                throw new RuntimeException();
            }
            this.field1072 = var6;
            this.field1080 = new short[var6];
            this.field1082 = new short[var6];
            this.field1073 = new short[var6];
            this.field1076 = new short[var6];
            this.field1067 = new short[var6];
            this.field1081 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1080[var13] = field1070[var13];
                this.field1082[var13] = field1079[var13];
                this.field1073[var13] = field1075[var13];
                this.field1076[var13] = field1083[var13];
                this.field1067[var13] = field1078[var13];
                this.field1081[var13] = field1074[var13];
            }
        } catch (Exception var14) {
            this.field1072 = 0;
            this.field1077 = false;
            this.field1068 = false;
        }
    }
}
