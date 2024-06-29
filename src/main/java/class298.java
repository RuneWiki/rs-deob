import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class298 {

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "Z")
    public boolean field4278 = false;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lnk;")
    public class501 field4272 = null;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
    public boolean field4282 = false;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Z")
    public boolean field4284 = false;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public int field4280 = 0;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "[S")
    public short[] field4276;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "[S")
    public short[] field4270;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "[S")
    public short[] field4274;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "[S")
    public short[] field4283;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "[S")
    public short[] field4275;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "[B")
    public byte[] field4281;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "[S")
    private static short[] field4269 = new short[500];

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "[S")
    private static short[] field4271 = new short[500];

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "[S")
    private static short[] field4277 = new short[500];

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "[S")
    private static short[] field4279 = new short[500];

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "[B")
    private static byte[] field4268 = new byte[500];

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "[S")
    private static short[] field4273 = new short[500];

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([BLnk;)V", line = 65)
    public class298(byte[] arg0, class501 arg1) {
        this.field4272 = arg1;
        try {
            class65 var3 = new class65(arg0);
            class65 var4 = new class65(arg0);
            var3.field827 = 2;
            int var5 = var3.method577(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field827 = var3.field827 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4272.field7425[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method577(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4277[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4269[var6] = var12;
                    } else {
                        field4269[var6] = (short) var4.method589(-5115);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4273[var6] = var12;
                    } else {
                        field4273[var6] = (short) var4.method589(-5115);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4279[var6] = var12;
                    } else {
                        field4279[var6] = (short) var4.method589(-5115);
                    }
                    field4268[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4269[var6] = (short) (((field4269[var6] & 0xFF) << 3) + (field4269[var6] >> 8 & 0x7));
                        field4273[var6] = (short) (((field4273[var6] & 0xFF) << 3) + (field4273[var6] >> 8 & 0x7));
                        field4279[var6] = (short) (((field4279[var6] & 0xFF) << 3) + (field4279[var6] >> 8 & 0x7));
                        field4269[var6] = (short) (field4269[var6] << 3);
                        field4273[var6] = (short) (field4273[var6] << 3);
                        field4279[var6] = (short) (field4279[var6] << 3);
                    }
                    field4271[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4271[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4282 = true;
                    } else if (var10 == 7) {
                        this.field4284 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4278 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field827) {
                throw new RuntimeException();
            }
            this.field4280 = var6;
            this.field4276 = new short[var6];
            this.field4270 = new short[var6];
            this.field4274 = new short[var6];
            this.field4283 = new short[var6];
            this.field4275 = new short[var6];
            this.field4281 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4276[var13] = field4277[var13];
                this.field4270[var13] = field4269[var13];
                this.field4274[var13] = field4273[var13];
                this.field4283[var13] = field4279[var13];
                this.field4275[var13] = field4271[var13];
                this.field4281[var13] = field4268[var13];
            }
        } catch (Exception var14) {
            this.field4280 = 0;
            this.field4282 = false;
            this.field4284 = false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "()V", line = 31)
    public static void method1875() {
        field4277 = null;
        field4269 = null;
        field4273 = null;
        field4279 = null;
        field4271 = null;
        field4268 = null;
    }
}
