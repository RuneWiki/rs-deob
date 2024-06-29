import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class342 {

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Z")
    public boolean field4372 = false;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
    public boolean field4375 = false;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Z")
    public boolean field4369 = false;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lkk;")
    public class41 field4377 = null;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public int field4368 = 0;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[S")
    public short[] field4371;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[S")
    public short[] field4365;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[S")
    public short[] field4370;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "[S")
    public short[] field4364;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "[S")
    public short[] field4363;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "[B")
    public byte[] field4373;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[S")
    private static short[] field4366 = new short[500];

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[B")
    private static byte[] field4367 = new byte[500];

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "[S")
    private static short[] field4376 = new short[500];

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "[S")
    private static short[] field4374 = new short[500];

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "[S")
    private static short[] field4378 = new short[500];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[S")
    private static short[] field4362 = new short[500];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V")
    public static void method1970() {
        field4366 = null;
        field4376 = null;
        field4374 = null;
        field4362 = null;
        field4378 = null;
        field4367 = null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([BLkk;)V")
    public class342(byte[] arg0, class41 arg1) {
        this.field4377 = arg1;
        try {
            class26 var3 = new class26(arg0);
            class26 var4 = new class26(arg0);
            var3.method194((byte) 119);
            var3.field330 += 2;
            int var5 = var3.method194((byte) 119);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field330 = var3.field330 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4377.field577[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method194((byte) 119);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4366[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4376[var6] = var12;
                    } else {
                        field4376[var6] = (short) var4.method183(true);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4374[var6] = var12;
                    } else {
                        field4374[var6] = (short) var4.method183(true);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4362[var6] = var12;
                    } else {
                        field4362[var6] = (short) var4.method183(true);
                    }
                    field4367[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4376[var6] = (short) (field4376[var6] << 2 & 0x3FFF);
                        field4374[var6] = (short) (field4374[var6] << 2 & 0x3FFF);
                        field4362[var6] = (short) (field4362[var6] << 2 & 0x3FFF);
                    }
                    field4378[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4378[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4372 = true;
                    } else if (var10 == 7) {
                        this.field4369 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4375 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field330) {
                throw new RuntimeException();
            }
            this.field4368 = var6;
            this.field4371 = new short[var6];
            this.field4365 = new short[var6];
            this.field4370 = new short[var6];
            this.field4364 = new short[var6];
            this.field4363 = new short[var6];
            this.field4373 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4371[var13] = field4366[var13];
                this.field4365[var13] = field4376[var13];
                this.field4370[var13] = field4374[var13];
                this.field4364[var13] = field4362[var13];
                this.field4363[var13] = field4378[var13];
                this.field4373[var13] = field4367[var13];
            }
        } catch (Exception var14) {
            this.field4368 = 0;
            this.field4372 = false;
            this.field4369 = false;
        }
    }
}
