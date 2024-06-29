import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class523 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Z")
    public boolean field7405 = false;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
    public boolean field7413 = false;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public int field7401 = 0;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lgo;")
    public class416 field7416 = null;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Z")
    public boolean field7417 = false;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[S")
    public short[] field7406;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[S")
    public short[] field7403;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "[S")
    public short[] field7409;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[S")
    public short[] field7412;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[S")
    public short[] field7410;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[B")
    public byte[] field7402;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[S")
    private static short[] field7408 = new short[500];

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[S")
    private static short[] field7404 = new short[500];

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[B")
    private static byte[] field7411 = new byte[500];

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[S")
    private static short[] field7414 = new short[500];

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[S")
    private static short[] field7407 = new short[500];

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[S")
    private static short[] field7415 = new short[500];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    public static void method2962() {
        field7404 = null;
        field7407 = null;
        field7408 = null;
        field7414 = null;
        field7415 = null;
        field7411 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([BLgo;)V")
    public class523(byte[] arg0, class416 arg1) {
        this.field7416 = arg1;
        try {
            class115 var3 = new class115(arg0);
            class115 var4 = new class115(arg0);
            var3.method620((byte) -127);
            var3.field1218 += 2;
            int var5 = var3.method620((byte) -127);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1218 = var3.field1218 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field7416.field5575[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method620((byte) -126);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field7404[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field7407[var6] = var12;
                    } else {
                        field7407[var6] = (short) var4.method617(-26046);
                    }
                    if ((var11 & 0x2) == 0) {
                        field7408[var6] = var12;
                    } else {
                        field7408[var6] = (short) var4.method617(-26046);
                    }
                    if ((var11 & 0x4) == 0) {
                        field7414[var6] = var12;
                    } else {
                        field7414[var6] = (short) var4.method617(-26046);
                    }
                    field7411[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field7407[var6] = (short) (field7407[var6] << 2 & 0x3FFF);
                        field7408[var6] = (short) (field7408[var6] << 2 & 0x3FFF);
                        field7414[var6] = (short) (field7414[var6] << 2 & 0x3FFF);
                    }
                    field7415[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field7415[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field7413 = true;
                    } else if (var10 == 7) {
                        this.field7405 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field7417 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1218) {
                throw new RuntimeException();
            }
            this.field7401 = var6;
            this.field7406 = new short[var6];
            this.field7403 = new short[var6];
            this.field7409 = new short[var6];
            this.field7412 = new short[var6];
            this.field7410 = new short[var6];
            this.field7402 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field7406[var13] = field7404[var13];
                this.field7403[var13] = field7407[var13];
                this.field7409[var13] = field7408[var13];
                this.field7412[var13] = field7414[var13];
                this.field7410[var13] = field7415[var13];
                this.field7402[var13] = field7411[var13];
            }
        } catch (Exception var14) {
            this.field7401 = 0;
            this.field7413 = false;
            this.field7405 = false;
        }
    }
}
