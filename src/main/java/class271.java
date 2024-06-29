import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class271 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lof;")
    public class260 field4380 = null;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Z")
    public boolean field4389 = false;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Z")
    public boolean field4386 = false;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public int field4392 = -1;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[S")
    public short[] field4385;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[S")
    public short[] field4377;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[S")
    public short[] field4384;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[S")
    public short[] field4387;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[S")
    public short[] field4382;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[B")
    public byte[] field4383;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[S")
    private static short[] field4378 = new short[500];

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[S")
    private static short[] field4379 = new short[500];

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[S")
    private static short[] field4381 = new short[500];

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[B")
    private static byte[] field4390 = new byte[500];

    @OriginalMember(owner = "client!og", name = "o", descriptor = "[S")
    private static short[] field4391 = new short[500];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[S")
    private static short[] field4388 = new short[500];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public static void method1896() {
        field4378 = null;
        field4379 = null;
        field4391 = null;
        field4388 = null;
        field4381 = null;
        field4390 = null;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BLof;)V")
    public class271(byte[] arg0, class260 arg1) {
        this.field4380 = arg1;
        class53 var3 = new class53(arg0);
        class53 var4 = new class53(arg0);
        var3.field735 = 2;
        int var5 = var3.method366(-16505);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field735 = var3.field735 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4380.field4022[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method366(-16505);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4378[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4379[var6] = var13;
                } else {
                    field4379[var6] = (short) var4.method373(105);
                }
                if ((var12 & 0x2) == 0) {
                    field4391[var6] = var13;
                } else {
                    field4391[var6] = (short) var4.method373(114);
                }
                if ((var12 & 0x4) == 0) {
                    field4388[var6] = var13;
                } else {
                    field4388[var6] = (short) var4.method373(118);
                }
                field4390[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field4379[var6] = (short) (((field4379[var6] & 0xFF) << 3) + (field4379[var6] >> 8 & 0x7));
                    field4391[var6] = (short) (((field4391[var6] & 0xFF) << 3) + (field4391[var6] >> 8 & 0x7));
                    field4388[var6] = (short) (((field4388[var6] & 0xFF) << 3) + (field4388[var6] >> 8 & 0x7));
                }
                field4381[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4381[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4389 = true;
                } else if (var11 == 7) {
                    this.field4386 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field735) {
            throw new RuntimeException();
        }
        this.field4392 = var6;
        this.field4385 = new short[var6];
        this.field4377 = new short[var6];
        this.field4384 = new short[var6];
        this.field4387 = new short[var6];
        this.field4382 = new short[var6];
        this.field4383 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4385[var10] = field4378[var10];
            this.field4377[var10] = field4379[var10];
            this.field4384[var10] = field4391[var10];
            this.field4387[var10] = field4388[var10];
            this.field4382[var10] = field4381[var10];
            this.field4383[var10] = field4390[var10];
        }
    }
}
