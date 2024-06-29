import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class70 {

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lva;")
    public class221 field1157 = null;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Z")
    public boolean field1156 = false;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public int field1150 = -1;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
    public boolean field1153 = false;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "[S")
    public short[] field1164;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "[S")
    public short[] field1158;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[S")
    public short[] field1152;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[S")
    public short[] field1151;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "[S")
    public short[] field1161;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[B")
    public byte[] field1159;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[S")
    private static short[] field1155 = new short[500];

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[B")
    private static byte[] field1163 = new byte[500];

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[S")
    private static short[] field1160 = new short[500];

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[S")
    private static short[] field1162 = new short[500];

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "[S")
    private static short[] field1165 = new short[500];

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[S")
    private static short[] field1154 = new short[500];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public static void method552() {
        field1155 = null;
        field1162 = null;
        field1165 = null;
        field1154 = null;
        field1160 = null;
        field1163 = null;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([BLva;)V")
    public class70(byte[] arg0, class221 arg1) {
        this.field1157 = arg1;
        class54 var3 = new class54(arg0);
        class54 var4 = new class54(arg0);
        var3.field887 = 2;
        int var5 = var3.method407(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field887 = var3.field887 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field1157.field3437[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method407(255);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field1155[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field1162[var6] = var13;
                } else {
                    field1162[var6] = (short) var4.method451(-25621);
                }
                if ((var12 & 0x2) == 0) {
                    field1165[var6] = var13;
                } else {
                    field1165[var6] = (short) var4.method451(-25621);
                }
                if ((var12 & 0x4) == 0) {
                    field1154[var6] = var13;
                } else {
                    field1154[var6] = (short) var4.method451(-25621);
                }
                field1163[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field1162[var6] = (short) (((field1162[var6] & 0xFF) << 3) + (field1162[var6] >> 8 & 0x7));
                    field1165[var6] = (short) (((field1165[var6] & 0xFF) << 3) + (field1165[var6] >> 8 & 0x7));
                    field1154[var6] = (short) (((field1154[var6] & 0xFF) << 3) + (field1154[var6] >> 8 & 0x7));
                }
                field1160[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field1160[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field1156 = true;
                } else if (var11 == 7) {
                    this.field1153 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field887) {
            throw new RuntimeException();
        }
        this.field1150 = var6;
        this.field1164 = new short[var6];
        this.field1158 = new short[var6];
        this.field1152 = new short[var6];
        this.field1151 = new short[var6];
        this.field1161 = new short[var6];
        this.field1159 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1164[var10] = field1155[var10];
            this.field1158[var10] = field1162[var10];
            this.field1152[var10] = field1165[var10];
            this.field1151[var10] = field1154[var10];
            this.field1161[var10] = field1160[var10];
            this.field1159[var10] = field1163[var10];
        }
    }
}
