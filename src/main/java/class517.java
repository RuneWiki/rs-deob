import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class517 {

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
    public boolean field7591 = false;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Z")
    public boolean field7592 = false;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lpd;")
    public class168 field7597 = null;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field7596 = 0;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Z")
    public boolean field7599 = false;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "[S")
    public short[] field7589;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[S")
    public short[] field7587;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[S")
    public short[] field7588;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[S")
    public short[] field7595;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[S")
    public short[] field7590;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[B")
    public byte[] field7601;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "[S")
    private static short[] field7594 = new short[500];

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[S")
    private static short[] field7598 = new short[500];

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[S")
    private static short[] field7600 = new short[500];

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[S")
    private static short[] field7593 = new short[500];

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "[B")
    private static byte[] field7602 = new byte[500];

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "[S")
    private static short[] field7603 = new short[500];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
    public static void method3058() {
        field7593 = null;
        field7603 = null;
        field7594 = null;
        field7600 = null;
        field7598 = null;
        field7602 = null;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([BLpd;)V")
    public class517(byte[] arg0, class168 arg1) {
        this.field7597 = arg1;
        try {
            class303 var3 = new class303(arg0);
            class303 var4 = new class303(arg0);
            var3.field4333 = 2;
            int var5 = var3.method1918((byte) 107);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field4333 = var3.field4333 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field7597.field2515[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1918((byte) 95);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field7593[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field7603[var6] = var12;
                    } else {
                        field7603[var6] = (short) var4.method1895(-68);
                    }
                    if ((var11 & 0x2) == 0) {
                        field7594[var6] = var12;
                    } else {
                        field7594[var6] = (short) var4.method1895(-58);
                    }
                    if ((var11 & 0x4) == 0) {
                        field7600[var6] = var12;
                    } else {
                        field7600[var6] = (short) var4.method1895(-25);
                    }
                    field7602[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field7603[var6] = (short) (((field7603[var6] & 0xFF) << 3) + (field7603[var6] >> 8 & 0x7));
                        field7594[var6] = (short) (((field7594[var6] & 0xFF) << 3) + (field7594[var6] >> 8 & 0x7));
                        field7600[var6] = (short) (((field7600[var6] & 0xFF) << 3) + (field7600[var6] >> 8 & 0x7));
                        field7603[var6] = (short) (field7603[var6] << 3);
                        field7594[var6] = (short) (field7594[var6] << 3);
                        field7600[var6] = (short) (field7600[var6] << 3);
                    }
                    field7598[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field7598[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field7599 = true;
                    } else if (var10 == 7) {
                        this.field7591 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field7592 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field4333) {
                throw new RuntimeException();
            }
            this.field7596 = var6;
            this.field7589 = new short[var6];
            this.field7587 = new short[var6];
            this.field7588 = new short[var6];
            this.field7595 = new short[var6];
            this.field7590 = new short[var6];
            this.field7601 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field7589[var13] = field7593[var13];
                this.field7587[var13] = field7603[var13];
                this.field7588[var13] = field7594[var13];
                this.field7595[var13] = field7600[var13];
                this.field7590[var13] = field7598[var13];
                this.field7601[var13] = field7602[var13];
            }
        } catch (Exception var14) {
            this.field7596 = 0;
            this.field7599 = false;
            this.field7591 = false;
        }
    }
}
