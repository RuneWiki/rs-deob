import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class158 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Z")
    public boolean field2357 = false;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lrj;")
    public class8 field2359 = null;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Z")
    public boolean field2366 = false;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field2369 = -1;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[S")
    public short[] field2360;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[S")
    public short[] field2368;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[S")
    public short[] field2362;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[S")
    public short[] field2356;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[S")
    public short[] field2365;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[B")
    public byte[] field2363;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[S")
    private static short[] field2364 = new short[500];

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "[S")
    private static short[] field2367 = new short[500];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[S")
    private static short[] field2355 = new short[500];

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[B")
    private static byte[] field2361 = new byte[500];

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "[S")
    private static short[] field2370 = new short[500];

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[S")
    private static short[] field2358 = new short[500];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public static void method1138() {
        field2364 = null;
        field2370 = null;
        field2355 = null;
        field2367 = null;
        field2358 = null;
        field2361 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLrj;)V")
    public class158(byte[] arg0, class8 arg1) {
        this.field2359 = arg1;
        class31 var3 = new class31(arg0);
        class31 var4 = new class31(arg0);
        var3.field541 = 2;
        int var5 = var3.method265(-107);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field541 = var3.field541 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field2359.field132[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method265(-99);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field2364[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field2370[var6] = var13;
                } else {
                    field2370[var6] = (short) var4.method285(-2);
                }
                if ((var12 & 0x2) == 0) {
                    field2355[var6] = var13;
                } else {
                    field2355[var6] = (short) var4.method285(-2);
                }
                if ((var12 & 0x4) == 0) {
                    field2367[var6] = var13;
                } else {
                    field2367[var6] = (short) var4.method285(-2);
                }
                field2361[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field2370[var6] = (short) (((field2370[var6] & 0xFF) << 3) + (field2370[var6] >> 8 & 0x7));
                    field2355[var6] = (short) (((field2355[var6] & 0xFF) << 3) + (field2355[var6] >> 8 & 0x7));
                    field2367[var6] = (short) (((field2367[var6] & 0xFF) << 3) + (field2367[var6] >> 8 & 0x7));
                }
                field2358[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field2358[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field2357 = true;
                } else if (var11 == 7) {
                    this.field2366 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field541) {
            throw new RuntimeException();
        }
        this.field2369 = var6;
        this.field2360 = new short[var6];
        this.field2368 = new short[var6];
        this.field2362 = new short[var6];
        this.field2356 = new short[var6];
        this.field2365 = new short[var6];
        this.field2363 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2360[var10] = field2364[var10];
            this.field2368[var10] = field2370[var10];
            this.field2362[var10] = field2355[var10];
            this.field2356[var10] = field2367[var10];
            this.field2365[var10] = field2358[var10];
            this.field2363[var10] = field2361[var10];
        }
    }
}
