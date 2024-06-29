import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class317 {

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Z")
    public boolean field4392 = false;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "Z")
    public boolean field4395 = false;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Z")
    public boolean field4394 = false;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "Lega;")
    public class454 field4390 = null;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public int field4401 = 0;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "[S")
    public short[] field4406;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "[S")
    public short[] field4405;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "[S")
    public short[] field4399;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "[S")
    public short[] field4397;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "[S")
    public short[] field4400;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "[B")
    public byte[] field4404;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "[S")
    private static short[] field4396 = new short[500];

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "[B")
    private static byte[] field4398 = new byte[500];

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "[S")
    private static short[] field4391 = new short[500];

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[S")
    private static short[] field4393 = new short[500];

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "[S")
    private static short[] field4403 = new short[500];

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "[S")
    private static short[] field4402 = new short[500];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V", line = 25)
    public static void method2056() {
        field4403 = null;
        field4393 = null;
        field4396 = null;
        field4402 = null;
        field4391 = null;
        field4398 = null;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "([BLega;)V", line = 65)
    public class317(byte[] arg0, class454 arg1) {
        this.field4390 = arg1;
        try {
            class63 var3 = new class63(arg0);
            class63 var4 = new class63(arg0);
            var3.method505((byte) -119);
            var3.field956 += 2;
            int var5 = var3.method505((byte) -119);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field956 = var3.field956 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4390.field6289[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method505((byte) -119);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4403[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4393[var6] = var12;
                    } else {
                        field4393[var6] = (short) var4.method480((byte) 83);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4396[var6] = var12;
                    } else {
                        field4396[var6] = (short) var4.method480((byte) 83);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4402[var6] = var12;
                    } else {
                        field4402[var6] = (short) var4.method480((byte) 100);
                    }
                    field4398[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4393[var6] = (short) (field4393[var6] << 2 & 0x3FFF);
                        field4396[var6] = (short) (field4396[var6] << 2 & 0x3FFF);
                        field4402[var6] = (short) (field4402[var6] << 2 & 0x3FFF);
                    }
                    field4391[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4391[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4392 = true;
                    } else if (var10 == 7) {
                        this.field4395 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4394 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field956) {
                throw new RuntimeException();
            }
            this.field4401 = var6;
            this.field4406 = new short[var6];
            this.field4405 = new short[var6];
            this.field4399 = new short[var6];
            this.field4397 = new short[var6];
            this.field4400 = new short[var6];
            this.field4404 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4406[var13] = field4403[var13];
                this.field4405[var13] = field4393[var13];
                this.field4399[var13] = field4396[var13];
                this.field4397[var13] = field4402[var13];
                this.field4400[var13] = field4391[var13];
                this.field4404[var13] = field4398[var13];
            }
        } catch (Exception var14) {
            this.field4401 = 0;
            this.field4392 = false;
            this.field4395 = false;
        }
    }
}
