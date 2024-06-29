import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class371 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Lho;")
    public class92 field5342 = null;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
    public boolean field5349 = false;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public int field5355 = 0;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Z")
    public boolean field5345 = false;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[S")
    public short[] field5351;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "[S")
    public short[] field5356;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[S")
    public short[] field5353;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[S")
    public short[] field5343;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[S")
    public short[] field5352;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[B")
    public byte[] field5344;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[S")
    private static short[] field5348 = new short[500];

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[S")
    private static short[] field5346 = new short[500];

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[B")
    private static byte[] field5347 = new byte[500];

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[S")
    private static short[] field5350 = new short[500];

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "[S")
    private static short[] field5354 = new short[500];

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[S")
    private static short[] field5357 = new short[500];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V")
    public static void method2276() {
        field5357 = null;
        field5354 = null;
        field5348 = null;
        field5346 = null;
        field5350 = null;
        field5347 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([BLho;)V")
    public class371(byte[] arg0, class92 arg1) {
        this.field5342 = arg1;
        try {
            class276 var3 = new class276(arg0);
            class276 var4 = new class276(arg0);
            var3.field4021 = 2;
            int var5 = var3.method1701(-23121);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field4021 = var3.field4021 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5342.field1159[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1701(-23121);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5357[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5354[var6] = var12;
                    } else {
                        field5354[var6] = (short) var4.method1726(-116);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5348[var6] = var12;
                    } else {
                        field5348[var6] = (short) var4.method1726(-73);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5346[var6] = var12;
                    } else {
                        field5346[var6] = (short) var4.method1726(-104);
                    }
                    field5347[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field5354[var6] = (short) (((field5354[var6] & 0xFF) << 3) + (field5354[var6] >> 8 & 0x7));
                        field5348[var6] = (short) (((field5348[var6] & 0xFF) << 3) + (field5348[var6] >> 8 & 0x7));
                        field5346[var6] = (short) (((field5346[var6] & 0xFF) << 3) + (field5346[var6] >> 8 & 0x7));
                        field5354[var6] = (short) (field5354[var6] << 3);
                        field5348[var6] = (short) (field5348[var6] << 3);
                        field5346[var6] = (short) (field5346[var6] << 3);
                    }
                    field5350[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5350[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5345 = true;
                    } else if (var10 == 7) {
                        this.field5349 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field4021) {
                throw new RuntimeException();
            }
            this.field5355 = var6;
            this.field5351 = new short[var6];
            this.field5356 = new short[var6];
            this.field5353 = new short[var6];
            this.field5343 = new short[var6];
            this.field5352 = new short[var6];
            this.field5344 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5351[var13] = field5357[var13];
                this.field5356[var13] = field5354[var13];
                this.field5353[var13] = field5348[var13];
                this.field5343[var13] = field5346[var13];
                this.field5352[var13] = field5350[var13];
                this.field5344[var13] = field5347[var13];
            }
        } catch (Exception var14) {
            this.field5355 = 0;
            this.field5345 = false;
            this.field5349 = false;
        }
    }
}
