import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class246 {

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "Lwe;")
    public class181 field3597 = null;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Z")
    public boolean field3600 = false;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public int field3592 = 0;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "Z")
    public boolean field3606 = false;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "Z")
    public boolean field3607 = false;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "[S")
    public short[] field3593;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "[S")
    public short[] field3601;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "[S")
    public short[] field3598;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "[S")
    public short[] field3605;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "[S")
    public short[] field3596;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "[B")
    public byte[] field3604;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "[S")
    private static short[] field3595 = new short[500];

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "[S")
    private static short[] field3594 = new short[500];

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "[S")
    private static short[] field3602 = new short[500];

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "[S")
    private static short[] field3603 = new short[500];

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "[B")
    private static byte[] field3599 = new byte[500];

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "[S")
    private static short[] field3608 = new short[500];

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "([BLwe;)V", line = 62)
    public class246(byte[] arg0, class181 arg1) {
        this.field3597 = arg1;
        try {
            class428 var3 = new class428(arg0);
            class428 var4 = new class428(arg0);
            var3.field6221 = 2;
            int var5 = var3.method2561((byte) 120);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6221 = var3.field6221 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3597.field2779[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2561((byte) -55);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3608[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3602[var6] = var12;
                    } else {
                        field3602[var6] = (short) var4.method2594((byte) -21);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3594[var6] = var12;
                    } else {
                        field3594[var6] = (short) var4.method2594((byte) -21);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3603[var6] = var12;
                    } else {
                        field3603[var6] = (short) var4.method2594((byte) -21);
                    }
                    field3599[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3602[var6] = (short) (((field3602[var6] & 0xFF) << 3) + (field3602[var6] >> 8 & 0x7));
                        field3594[var6] = (short) (((field3594[var6] & 0xFF) << 3) + (field3594[var6] >> 8 & 0x7));
                        field3603[var6] = (short) (((field3603[var6] & 0xFF) << 3) + (field3603[var6] >> 8 & 0x7));
                        field3602[var6] = (short) (field3602[var6] << 3);
                        field3594[var6] = (short) (field3594[var6] << 3);
                        field3603[var6] = (short) (field3603[var6] << 3);
                    }
                    field3595[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3595[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3606 = true;
                    } else if (var10 == 7) {
                        this.field3600 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3607 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6221) {
                throw new RuntimeException();
            }
            this.field3592 = var6;
            this.field3593 = new short[var6];
            this.field3601 = new short[var6];
            this.field3598 = new short[var6];
            this.field3605 = new short[var6];
            this.field3596 = new short[var6];
            this.field3604 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3593[var13] = field3608[var13];
                this.field3601[var13] = field3602[var13];
                this.field3598[var13] = field3594[var13];
                this.field3605[var13] = field3603[var13];
                this.field3596[var13] = field3595[var13];
                this.field3604[var13] = field3599[var13];
            }
        } catch (Exception var14) {
            this.field3592 = 0;
            this.field3606 = false;
            this.field3600 = false;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "()V", line = 36)
    public static void method1573() {
        field3608 = null;
        field3602 = null;
        field3594 = null;
        field3603 = null;
        field3595 = null;
        field3599 = null;
    }
}
