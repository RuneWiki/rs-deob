import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class683 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lah;")
    public class388 field9493 = null;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public int field9500 = 0;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Z")
    public boolean field9502 = false;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Z")
    public boolean field9495 = false;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
    public boolean field9504 = false;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[S")
    public short[] field9508;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[S")
    public short[] field9494;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[S")
    public short[] field9505;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[S")
    public short[] field9506;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "[S")
    public short[] field9507;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[B")
    public byte[] field9499;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[S")
    private static short[] field9492 = new short[500];

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[S")
    private static short[] field9501 = new short[500];

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[B")
    private static byte[] field9497 = new byte[500];

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[S")
    private static short[] field9503 = new short[500];

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[S")
    private static short[] field9498 = new short[500];

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[S")
    private static short[] field9496 = new short[500];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public static void method3869() {
        field9503 = null;
        field9501 = null;
        field9496 = null;
        field9492 = null;
        field9498 = null;
        field9497 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([BLah;)V")
    public class683(byte[] arg0, class388 arg1) {
        this.field9493 = arg1;
        try {
            class611 var3 = new class611(arg0);
            class611 var4 = new class611(arg0);
            var3.method3428((byte) 89);
            var3.field8520 += 2;
            int var5 = var3.method3428((byte) -128);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field8520 = var3.field8520 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field9493.field5472[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3428((byte) -7);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field9503[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field9501[var6] = var12;
                    } else {
                        field9501[var6] = (short) var4.method3438(-80);
                    }
                    if ((var11 & 0x2) == 0) {
                        field9496[var6] = var12;
                    } else {
                        field9496[var6] = (short) var4.method3438(-76);
                    }
                    if ((var11 & 0x4) == 0) {
                        field9492[var6] = var12;
                    } else {
                        field9492[var6] = (short) var4.method3438(-82);
                    }
                    field9497[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field9501[var6] = (short) (field9501[var6] << 2 & 0x3FFF);
                        field9496[var6] = (short) (field9496[var6] << 2 & 0x3FFF);
                        field9492[var6] = (short) (field9492[var6] << 2 & 0x3FFF);
                    }
                    field9498[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field9498[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field9502 = true;
                    } else if (var10 == 7) {
                        this.field9504 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field9495 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field8520) {
                throw new RuntimeException();
            }
            this.field9500 = var6;
            this.field9508 = new short[var6];
            this.field9494 = new short[var6];
            this.field9505 = new short[var6];
            this.field9506 = new short[var6];
            this.field9507 = new short[var6];
            this.field9499 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field9508[var13] = field9503[var13];
                this.field9494[var13] = field9501[var13];
                this.field9505[var13] = field9496[var13];
                this.field9506[var13] = field9492[var13];
                this.field9507[var13] = field9498[var13];
                this.field9499[var13] = field9497[var13];
            }
        } catch (Exception var14) {
            this.field9500 = 0;
            this.field9502 = false;
            this.field9504 = false;
        }
    }
}
