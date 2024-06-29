import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class155 {

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Z")
    public boolean field2361 = false;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
    public boolean field2354 = false;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public int field2365 = 0;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lll;")
    public class251 field2359 = null;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "Z")
    public boolean field2369 = false;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "[S")
    public short[] field2367;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "[S")
    public short[] field2357;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "[S")
    public short[] field2360;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "[S")
    public short[] field2355;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "[S")
    public short[] field2368;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "[B")
    public byte[] field2362;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[S")
    private static short[] field2353 = new short[500];

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "[S")
    private static short[] field2356 = new short[500];

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "[S")
    private static short[] field2363 = new short[500];

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "[S")
    private static short[] field2358 = new short[500];

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "[B")
    private static byte[] field2364 = new byte[500];

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "[S")
    private static short[] field2366 = new short[500];

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "()V")
    public static void method1090() {
        field2356 = null;
        field2353 = null;
        field2363 = null;
        field2358 = null;
        field2366 = null;
        field2364 = null;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "([BLll;)V")
    public class155(byte[] arg0, class251 arg1) {
        this.field2359 = arg1;
        try {
            class519 var3 = new class519(arg0);
            class519 var4 = new class519(arg0);
            var3.field7558 = 2;
            int var5 = var3.method3072((byte) -123);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field7558 = var3.field7558 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2359.field3730[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3072((byte) -119);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2356[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2353[var6] = var12;
                    } else {
                        field2353[var6] = (short) var4.method3077((byte) -75);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2363[var6] = var12;
                    } else {
                        field2363[var6] = (short) var4.method3077((byte) -75);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2358[var6] = var12;
                    } else {
                        field2358[var6] = (short) var4.method3077((byte) -75);
                    }
                    field2364[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2353[var6] = (short) (((field2353[var6] & 0xFF) << 3) + (field2353[var6] >> 8 & 0x7));
                        field2363[var6] = (short) (((field2363[var6] & 0xFF) << 3) + (field2363[var6] >> 8 & 0x7));
                        field2358[var6] = (short) (((field2358[var6] & 0xFF) << 3) + (field2358[var6] >> 8 & 0x7));
                        field2353[var6] = (short) (field2353[var6] << 3);
                        field2363[var6] = (short) (field2363[var6] << 3);
                        field2358[var6] = (short) (field2358[var6] << 3);
                    }
                    field2366[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2366[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2354 = true;
                    } else if (var10 == 7) {
                        this.field2369 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2361 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field7558) {
                throw new RuntimeException();
            }
            this.field2365 = var6;
            this.field2367 = new short[var6];
            this.field2357 = new short[var6];
            this.field2360 = new short[var6];
            this.field2355 = new short[var6];
            this.field2368 = new short[var6];
            this.field2362 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2367[var13] = field2356[var13];
                this.field2357[var13] = field2353[var13];
                this.field2360[var13] = field2363[var13];
                this.field2355[var13] = field2358[var13];
                this.field2368[var13] = field2366[var13];
                this.field2362[var13] = field2364[var13];
            }
        } catch (Exception var14) {
            this.field2365 = 0;
            this.field2354 = false;
            this.field2369 = false;
        }
    }
}
