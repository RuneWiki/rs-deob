import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class458 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lgea;")
    public class82 field6536 = null;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
    public boolean field6539 = false;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Z")
    public boolean field6537 = false;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Z")
    public boolean field6540 = false;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public int field6538 = 0;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[S")
    public short[] field6531;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[S")
    public short[] field6541;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[S")
    public short[] field6533;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[S")
    public short[] field6530;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[S")
    public short[] field6532;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[B")
    public byte[] field6543;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[S")
    private static short[] field6534 = new short[500];

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[S")
    private static short[] field6542 = new short[500];

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[S")
    private static short[] field6535 = new short[500];

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[B")
    private static byte[] field6546 = new byte[500];

    @OriginalMember(owner = "client!h", name = "p", descriptor = "[S")
    private static short[] field6545 = new short[500];

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[S")
    private static short[] field6544 = new short[500];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
    public static void method2659() {
        field6544 = null;
        field6545 = null;
        field6542 = null;
        field6534 = null;
        field6535 = null;
        field6546 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([BLgea;)V")
    public class458(byte[] arg0, class82 arg1) {
        this.field6536 = arg1;
        try {
            class551 var3 = new class551(arg0);
            class551 var4 = new class551(arg0);
            var3.method3045(-128);
            var3.field7707 += 2;
            int var5 = var3.method3045(-128);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field7707 = var3.field7707 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6536.field1104[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3045(-128);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6544[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6545[var6] = var12;
                    } else {
                        field6545[var6] = (short) var4.method3069(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6542[var6] = var12;
                    } else {
                        field6542[var6] = (short) var4.method3069(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6534[var6] = var12;
                    } else {
                        field6534[var6] = (short) var4.method3069(false);
                    }
                    field6546[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field6545[var6] = (short) (field6545[var6] << 2 & 0x3FFF);
                        field6542[var6] = (short) (field6542[var6] << 2 & 0x3FFF);
                        field6534[var6] = (short) (field6534[var6] << 2 & 0x3FFF);
                    }
                    field6535[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6535[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6539 = true;
                    } else if (var10 == 7) {
                        this.field6537 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field6540 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field7707) {
                throw new RuntimeException();
            }
            this.field6538 = var6;
            this.field6531 = new short[var6];
            this.field6541 = new short[var6];
            this.field6533 = new short[var6];
            this.field6530 = new short[var6];
            this.field6532 = new short[var6];
            this.field6543 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6531[var13] = field6544[var13];
                this.field6541[var13] = field6545[var13];
                this.field6533[var13] = field6542[var13];
                this.field6530[var13] = field6534[var13];
                this.field6532[var13] = field6535[var13];
                this.field6543[var13] = field6546[var13];
            }
        } catch (Exception var14) {
            this.field6538 = 0;
            this.field6539 = false;
            this.field6537 = false;
        }
    }
}
