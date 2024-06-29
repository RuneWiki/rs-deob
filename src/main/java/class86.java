import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class86 {

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Z")
    public boolean field1249 = false;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lmf;")
    public class29 field1244 = null;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Z")
    public boolean field1247 = false;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field1242 = -1;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[S")
    public short[] field1250;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[S")
    public short[] field1237;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[S")
    public short[] field1238;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[S")
    public short[] field1241;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[S")
    public short[] field1236;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[B")
    public byte[] field1239;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "[S")
    private static short[] field1245 = new short[500];

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[S")
    private static short[] field1246 = new short[500];

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[S")
    private static short[] field1240 = new short[500];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[B")
    private static byte[] field1248 = new byte[500];

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[S")
    private static short[] field1243 = new short[500];

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "[S")
    private static short[] field1251 = new short[500];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public static void method558() {
        field1251 = null;
        field1243 = null;
        field1246 = null;
        field1240 = null;
        field1245 = null;
        field1248 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([BLmf;)V")
    public class86(byte[] arg0, class29 arg1) {
        this.field1244 = arg1;
        class215 var3 = new class215(arg0);
        class215 var4 = new class215(arg0);
        var3.field3280 = 2;
        int var5 = var3.method1374((byte) -60);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3280 = var3.field3280 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field1244.field447[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1374((byte) -60);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field1251[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field1243[var6] = var13;
                } else {
                    field1243[var6] = (short) var4.method1352((byte) -16);
                }
                if ((var12 & 0x2) == 0) {
                    field1246[var6] = var13;
                } else {
                    field1246[var6] = (short) var4.method1352((byte) -16);
                }
                if ((var12 & 0x4) == 0) {
                    field1240[var6] = var13;
                } else {
                    field1240[var6] = (short) var4.method1352((byte) -16);
                }
                field1248[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field1243[var6] = (short) (((field1243[var6] & 0xFF) << 3) + (field1243[var6] >> 8 & 0x7));
                    field1246[var6] = (short) (((field1246[var6] & 0xFF) << 3) + (field1246[var6] >> 8 & 0x7));
                    field1240[var6] = (short) (((field1240[var6] & 0xFF) << 3) + (field1240[var6] >> 8 & 0x7));
                }
                field1245[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field1245[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field1249 = true;
                } else if (var11 == 7) {
                    this.field1247 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3280) {
            throw new RuntimeException();
        }
        this.field1242 = var6;
        this.field1250 = new short[var6];
        this.field1237 = new short[var6];
        this.field1238 = new short[var6];
        this.field1241 = new short[var6];
        this.field1236 = new short[var6];
        this.field1239 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1250[var10] = field1251[var10];
            this.field1237[var10] = field1243[var10];
            this.field1238[var10] = field1246[var10];
            this.field1241[var10] = field1240[var10];
            this.field1236[var10] = field1245[var10];
            this.field1239[var10] = field1248[var10];
        }
    }
}
