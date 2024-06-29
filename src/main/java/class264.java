import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class264 {

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Z")
    public boolean field3332 = false;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Z")
    public boolean field3326 = false;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Lpi;")
    public class465 field3327 = null;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Z")
    public boolean field3334 = false;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public int field3337 = 0;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "[S")
    public short[] field3339;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "[S")
    public short[] field3323;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "[S")
    public short[] field3338;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "[S")
    public short[] field3336;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "[S")
    public short[] field3329;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "[B")
    public byte[] field3325;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[S")
    private static short[] field3330 = new short[500];

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[S")
    private static short[] field3324 = new short[500];

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[S")
    private static short[] field3331 = new short[500];

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[S")
    private static short[] field3328 = new short[500];

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "[B")
    private static byte[] field3335 = new byte[500];

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "[S")
    private static short[] field3333 = new short[500];

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "([BLpi;)V", line = 65)
    public class264(byte[] arg0, class465 arg1) {
        this.field3327 = arg1;
        try {
            class572 var3 = new class572(arg0);
            class572 var4 = new class572(arg0);
            var3.method3097((byte) 12);
            var3.field7313 += 2;
            int var5 = var3.method3097((byte) 12);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field7313 = var3.field7313 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3327.field5766[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3097((byte) 12);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3328[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3333[var6] = var12;
                    } else {
                        field3333[var6] = (short) var4.method3085(4107);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3330[var6] = var12;
                    } else {
                        field3330[var6] = (short) var4.method3085(4107);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3331[var6] = var12;
                    } else {
                        field3331[var6] = (short) var4.method3085(4107);
                    }
                    field3335[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3333[var6] = (short) (field3333[var6] << 2 & 0x3FFF);
                        field3330[var6] = (short) (field3330[var6] << 2 & 0x3FFF);
                        field3331[var6] = (short) (field3331[var6] << 2 & 0x3FFF);
                    }
                    field3324[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3324[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3334 = true;
                    } else if (var10 == 7) {
                        this.field3332 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3326 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field7313) {
                throw new RuntimeException();
            }
            this.field3337 = var6;
            this.field3339 = new short[var6];
            this.field3323 = new short[var6];
            this.field3338 = new short[var6];
            this.field3336 = new short[var6];
            this.field3329 = new short[var6];
            this.field3325 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3339[var13] = field3328[var13];
                this.field3323[var13] = field3333[var13];
                this.field3338[var13] = field3330[var13];
                this.field3336[var13] = field3331[var13];
                this.field3329[var13] = field3324[var13];
                this.field3325[var13] = field3335[var13];
            }
        } catch (Exception var14) {
            this.field3337 = 0;
            this.field3334 = false;
            this.field3332 = false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()V", line = 49)
    public static void method1568() {
        field3328 = null;
        field3333 = null;
        field3330 = null;
        field3331 = null;
        field3324 = null;
        field3335 = null;
    }
}
