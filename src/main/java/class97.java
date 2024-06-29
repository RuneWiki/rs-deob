import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class97 {

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Z")
    public boolean field1363 = false;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public int field1371 = 0;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Ltca;")
    public class173 field1374 = null;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "Z")
    public boolean field1375 = false;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Z")
    public boolean field1361 = false;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "[S")
    public short[] field1364;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "[S")
    public short[] field1376;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "[S")
    public short[] field1372;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "[S")
    public short[] field1370;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "[S")
    public short[] field1365;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "[B")
    public byte[] field1373;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "[S")
    private static short[] field1368 = new short[500];

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "[S")
    private static short[] field1369 = new short[500];

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "[S")
    private static short[] field1367 = new short[500];

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "[B")
    private static byte[] field1366 = new byte[500];

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "[S")
    private static short[] field1362 = new short[500];

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "[S")
    private static short[] field1377 = new short[500];

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([BLtca;)V", line = 61)
    public class97(byte[] arg0, class173 arg1) {
        this.field1374 = arg1;
        try {
            class645 var3 = new class645(arg0);
            class645 var4 = new class645(arg0);
            var3.method3745(-6314);
            var3.field9084 += 2;
            int var5 = var3.method3745(-6314);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field9084 = var3.field9084 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1374.field2683[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3745(-6314);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1367[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1362[var6] = var12;
                    } else {
                        field1362[var6] = (short) var4.method3741((byte) 89);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1368[var6] = var12;
                    } else {
                        field1368[var6] = (short) var4.method3741((byte) 63);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1369[var6] = var12;
                    } else {
                        field1369[var6] = (short) var4.method3741((byte) 75);
                    }
                    field1366[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1362[var6] = (short) (field1362[var6] << 2 & 0x3FFF);
                        field1368[var6] = (short) (field1368[var6] << 2 & 0x3FFF);
                        field1369[var6] = (short) (field1369[var6] << 2 & 0x3FFF);
                    }
                    field1377[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1377[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1375 = true;
                    } else if (var10 == 7) {
                        this.field1361 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1363 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field9084) {
                throw new RuntimeException();
            }
            this.field1371 = var6;
            this.field1364 = new short[var6];
            this.field1376 = new short[var6];
            this.field1372 = new short[var6];
            this.field1370 = new short[var6];
            this.field1365 = new short[var6];
            this.field1373 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1364[var13] = field1367[var13];
                this.field1376[var13] = field1362[var13];
                this.field1372[var13] = field1368[var13];
                this.field1370[var13] = field1369[var13];
                this.field1365[var13] = field1377[var13];
                this.field1373[var13] = field1366[var13];
            }
        } catch (Exception var14) {
            this.field1371 = 0;
            this.field1375 = false;
            this.field1361 = false;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "()V", line = 29)
    public static void method750() {
        field1367 = null;
        field1362 = null;
        field1368 = null;
        field1369 = null;
        field1377 = null;
        field1366 = null;
    }
}
