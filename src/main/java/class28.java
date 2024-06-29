import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class28 {

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Z")
    public boolean field354 = false;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Z")
    public boolean field361 = false;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lej;")
    public class51 field362 = null;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public int field363 = -1;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[S")
    public short[] field358;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[S")
    public short[] field360;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[S")
    public short[] field359;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[S")
    public short[] field355;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[S")
    public short[] field348;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[B")
    public byte[] field353;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[S")
    private static short[] field352 = new short[500];

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[S")
    private static short[] field351 = new short[500];

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[S")
    private static short[] field349 = new short[500];

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[B")
    private static byte[] field350 = new byte[500];

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[S")
    private static short[] field356 = new short[500];

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[S")
    private static short[] field357 = new short[500];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public static void method167() {
        field351 = null;
        field352 = null;
        field357 = null;
        field349 = null;
        field356 = null;
        field350 = null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([BLej;)V")
    public class28(byte[] arg0, class51 arg1) {
        this.field362 = arg1;
        class202 var3 = new class202(arg0);
        class202 var4 = new class202(arg0);
        var3.field3272 = 2;
        int var5 = var3.method1420((byte) 0);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3272 = var3.field3272 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field362.field686[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1420((byte) 0);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field351[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field352[var6] = var13;
                } else {
                    field352[var6] = (short) var4.method1415(false);
                }
                if ((var12 & 0x2) == 0) {
                    field357[var6] = var13;
                } else {
                    field357[var6] = (short) var4.method1415(false);
                }
                if ((var12 & 0x4) == 0) {
                    field349[var6] = var13;
                } else {
                    field349[var6] = (short) var4.method1415(false);
                }
                field350[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field352[var6] = (short) (((field352[var6] & 0xFF) << 3) + (field352[var6] >> 8 & 0x7));
                    field357[var6] = (short) (((field357[var6] & 0xFF) << 3) + (field357[var6] >> 8 & 0x7));
                    field349[var6] = (short) (((field349[var6] & 0xFF) << 3) + (field349[var6] >> 8 & 0x7));
                }
                field356[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field356[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field354 = true;
                } else if (var11 == 7) {
                    this.field361 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3272) {
            throw new RuntimeException();
        }
        this.field363 = var6;
        this.field358 = new short[var6];
        this.field360 = new short[var6];
        this.field359 = new short[var6];
        this.field355 = new short[var6];
        this.field348 = new short[var6];
        this.field353 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field358[var10] = field351[var10];
            this.field360[var10] = field352[var10];
            this.field359[var10] = field357[var10];
            this.field355[var10] = field349[var10];
            this.field348[var10] = field356[var10];
            this.field353[var10] = field350[var10];
        }
    }
}
