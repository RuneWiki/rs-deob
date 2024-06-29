import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class424 {

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lcda;")
    public class147 field5453 = null;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public int field5454 = 0;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "Z")
    public boolean field5465 = false;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "Z")
    public boolean field5467 = false;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "Z")
    public boolean field5464 = false;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "[S")
    public short[] field5455;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "[S")
    public short[] field5462;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "[S")
    public short[] field5458;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "[S")
    public short[] field5469;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "[S")
    public short[] field5468;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "[B")
    public byte[] field5459;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[S")
    private static short[] field5456 = new short[500];

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "[S")
    private static short[] field5461 = new short[500];

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "[S")
    private static short[] field5457 = new short[500];

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "[S")
    private static short[] field5463 = new short[500];

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "[B")
    private static byte[] field5460 = new byte[500];

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "[S")
    private static short[] field5466 = new short[500];

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "()V")
    public static void method2393() {
        field5466 = null;
        field5456 = null;
        field5463 = null;
        field5457 = null;
        field5461 = null;
        field5460 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "([BLcda;)V")
    public class424(byte[] arg0, class147 arg1) {
        this.field5453 = arg1;
        try {
            class374 var3 = new class374(arg0);
            class374 var4 = new class374(arg0);
            var3.field4966 = 2;
            int var5 = var3.method2129(-120);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field4966 = var3.field4966 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5453.field1762[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2129(-92);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5466[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5456[var6] = var12;
                    } else {
                        field5456[var6] = (short) var4.method2119(true);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5463[var6] = var12;
                    } else {
                        field5463[var6] = (short) var4.method2119(true);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5457[var6] = var12;
                    } else {
                        field5457[var6] = (short) var4.method2119(true);
                    }
                    field5460[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field5456[var6] = (short) (((field5456[var6] & 0xFF) << 3) + (field5456[var6] >> 8 & 0x7));
                        field5463[var6] = (short) (((field5463[var6] & 0xFF) << 3) + (field5463[var6] >> 8 & 0x7));
                        field5457[var6] = (short) (((field5457[var6] & 0xFF) << 3) + (field5457[var6] >> 8 & 0x7));
                        field5456[var6] = (short) (field5456[var6] << 3);
                        field5463[var6] = (short) (field5463[var6] << 3);
                        field5457[var6] = (short) (field5457[var6] << 3);
                    }
                    field5461[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5461[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5464 = true;
                    } else if (var10 == 7) {
                        this.field5467 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field5465 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field4966) {
                throw new RuntimeException();
            }
            this.field5454 = var6;
            this.field5455 = new short[var6];
            this.field5462 = new short[var6];
            this.field5458 = new short[var6];
            this.field5469 = new short[var6];
            this.field5468 = new short[var6];
            this.field5459 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5455[var13] = field5466[var13];
                this.field5462[var13] = field5456[var13];
                this.field5458[var13] = field5463[var13];
                this.field5469[var13] = field5457[var13];
                this.field5468[var13] = field5461[var13];
                this.field5459[var13] = field5460[var13];
            }
        } catch (Exception var14) {
            this.field5454 = 0;
            this.field5464 = false;
            this.field5467 = false;
        }
    }
}
