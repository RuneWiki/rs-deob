import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class509 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public int field7317 = 0;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "Lmd;")
    public class382 field7328 = null;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Z")
    public boolean field7327 = false;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Z")
    public boolean field7324 = false;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Z")
    public boolean field7330 = false;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[S")
    public short[] field7321;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "[S")
    public short[] field7314;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[S")
    public short[] field7319;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "[S")
    public short[] field7318;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[S")
    public short[] field7316;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "[B")
    public byte[] field7326;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[B")
    private static byte[] field7315 = new byte[500];

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[S")
    private static short[] field7322 = new short[500];

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "[S")
    private static short[] field7320 = new short[500];

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[S")
    private static short[] field7325 = new short[500];

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[S")
    private static short[] field7323 = new short[500];

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "[S")
    private static short[] field7329 = new short[500];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 12)
    public static void method3049() {
        field7323 = null;
        field7322 = null;
        field7325 = null;
        field7320 = null;
        field7329 = null;
        field7315 = null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([BLmd;)V", line = 65)
    public class509(byte[] arg0, class382 arg1) {
        this.field7328 = arg1;
        try {
            class463 var3 = new class463(arg0);
            class463 var4 = new class463(arg0);
            var3.field6631 = 2;
            int var5 = var3.method2737(false);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6631 = var3.field6631 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field7328.field5030[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2737(false);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field7323[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field7322[var6] = var12;
                    } else {
                        field7322[var6] = (short) var4.method2750((byte) -40);
                    }
                    if ((var11 & 0x2) == 0) {
                        field7325[var6] = var12;
                    } else {
                        field7325[var6] = (short) var4.method2750((byte) -40);
                    }
                    if ((var11 & 0x4) == 0) {
                        field7320[var6] = var12;
                    } else {
                        field7320[var6] = (short) var4.method2750((byte) -40);
                    }
                    field7315[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field7322[var6] = (short) (((field7322[var6] & 0xFF) << 3) + (field7322[var6] >> 8 & 0x7));
                        field7325[var6] = (short) (((field7325[var6] & 0xFF) << 3) + (field7325[var6] >> 8 & 0x7));
                        field7320[var6] = (short) (((field7320[var6] & 0xFF) << 3) + (field7320[var6] >> 8 & 0x7));
                        field7322[var6] = (short) (field7322[var6] << 3);
                        field7325[var6] = (short) (field7325[var6] << 3);
                        field7320[var6] = (short) (field7320[var6] << 3);
                    }
                    field7329[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field7329[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field7324 = true;
                    } else if (var10 == 7) {
                        this.field7330 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field7327 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6631) {
                throw new RuntimeException();
            }
            this.field7317 = var6;
            this.field7321 = new short[var6];
            this.field7314 = new short[var6];
            this.field7319 = new short[var6];
            this.field7318 = new short[var6];
            this.field7316 = new short[var6];
            this.field7326 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field7321[var13] = field7323[var13];
                this.field7314[var13] = field7322[var13];
                this.field7319[var13] = field7325[var13];
                this.field7318[var13] = field7320[var13];
                this.field7316[var13] = field7329[var13];
                this.field7326[var13] = field7315[var13];
            }
        } catch (Exception var14) {
            this.field7317 = 0;
            this.field7324 = false;
            this.field7330 = false;
        }
    }
}
