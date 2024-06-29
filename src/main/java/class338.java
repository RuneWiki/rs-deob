import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class338 {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field5446 = -1;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Z")
    public boolean field5444 = false;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lvb;")
    public class83 field5451 = null;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Z")
    public boolean field5454 = false;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "[S")
    public short[] field5445;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[S")
    public short[] field5449;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[S")
    public short[] field5447;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[S")
    public short[] field5440;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "[S")
    public short[] field5453;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[B")
    public byte[] field5452;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[B")
    private static byte[] field5442 = new byte[500];

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[S")
    private static short[] field5441 = new short[500];

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[S")
    private static short[] field5443 = new short[500];

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "[S")
    private static short[] field5448 = new short[500];

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[S")
    private static short[] field5450 = new short[500];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[S")
    private static short[] field5439 = new short[500];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V", line = 3)
    public static void method2388() {
        field5441 = null;
        field5439 = null;
        field5443 = null;
        field5450 = null;
        field5448 = null;
        field5442 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([BLvb;)V", line = 60)
    public class338(byte[] arg0, class83 arg1) {
        this.field5451 = arg1;
        class313 var3 = new class313(arg0);
        class313 var4 = new class313(arg0);
        var3.field5137 = 2;
        int var5 = var3.method2224(-120);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field5137 = var3.field5137 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field5451.field1197[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method2224(-123);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field5441[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field5439[var6] = var12;
                } else {
                    field5439[var6] = (short) var4.method2188(108);
                }
                if ((var11 & 0x2) == 0) {
                    field5443[var6] = var12;
                } else {
                    field5443[var6] = (short) var4.method2188(99);
                }
                if ((var11 & 0x4) == 0) {
                    field5450[var6] = var12;
                } else {
                    field5450[var6] = (short) var4.method2188(93);
                }
                field5442[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field5439[var6] = (short) (((field5439[var6] & 0xFF) << 3) + (field5439[var6] >> 8 & 0x7));
                    field5443[var6] = (short) (((field5443[var6] & 0xFF) << 3) + (field5443[var6] >> 8 & 0x7));
                    field5450[var6] = (short) (((field5450[var6] & 0xFF) << 3) + (field5450[var6] >> 8 & 0x7));
                }
                field5448[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field5448[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field5454 = true;
                } else if (var10 == 7) {
                    this.field5444 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field5137) {
            throw new RuntimeException();
        }
        this.field5446 = var6;
        this.field5445 = new short[var6];
        this.field5449 = new short[var6];
        this.field5447 = new short[var6];
        this.field5440 = new short[var6];
        this.field5453 = new short[var6];
        this.field5452 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field5445[var13] = field5441[var13];
            this.field5449[var13] = field5439[var13];
            this.field5447[var13] = field5443[var13];
            this.field5440[var13] = field5450[var13];
            this.field5453[var13] = field5448[var13];
            this.field5452[var13] = field5442[var13];
        }
    }
}
