import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class288 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
    public boolean field4425 = false;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Z")
    public boolean field4426 = false;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public int field4430 = 0;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Ldf;")
    public class620 field4428 = null;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Z")
    public boolean field4438 = false;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[S")
    public short[] field4433;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[S")
    public short[] field4429;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[S")
    public short[] field4437;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "[S")
    public short[] field4441;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[S")
    public short[] field4436;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[B")
    public byte[] field4439;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[S")
    private static short[] field4434 = new short[500];

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[S")
    private static short[] field4427 = new short[500];

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[S")
    private static short[] field4431 = new short[500];

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[S")
    private static short[] field4432 = new short[500];

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[S")
    private static short[] field4440 = new short[500];

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[B")
    private static byte[] field4435 = new byte[500];

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([BLdf;)V", line = 65)
    public class288(byte[] arg0, class620 arg1) {
        this.field4428 = arg1;
        try {
            class301 var3 = new class301(arg0);
            class301 var4 = new class301(arg0);
            var3.method1987(-23);
            var3.field4534 += 2;
            int var5 = var3.method1987(-93);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field4534 = var3.field4534 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4428.field8715[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1987(-127);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4431[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4434[var6] = var12;
                    } else {
                        field4434[var6] = (short) var4.method1985(-1189380592);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4427[var6] = var12;
                    } else {
                        field4427[var6] = (short) var4.method1985(-1189380592);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4440[var6] = var12;
                    } else {
                        field4440[var6] = (short) var4.method1985(-1189380592);
                    }
                    field4435[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4434[var6] = (short) (field4434[var6] << 2 & 0x3FFF);
                        field4427[var6] = (short) (field4427[var6] << 2 & 0x3FFF);
                        field4440[var6] = (short) (field4440[var6] << 2 & 0x3FFF);
                    }
                    field4432[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4432[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4425 = true;
                    } else if (var10 == 7) {
                        this.field4438 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4426 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field4534) {
                throw new RuntimeException();
            }
            this.field4430 = var6;
            this.field4433 = new short[var6];
            this.field4429 = new short[var6];
            this.field4437 = new short[var6];
            this.field4441 = new short[var6];
            this.field4436 = new short[var6];
            this.field4439 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4433[var13] = field4431[var13];
                this.field4429[var13] = field4434[var13];
                this.field4437[var13] = field4427[var13];
                this.field4441[var13] = field4440[var13];
                this.field4436[var13] = field4432[var13];
                this.field4439[var13] = field4435[var13];
            }
        } catch (Exception var14) {
            this.field4430 = 0;
            this.field4425 = false;
            this.field4438 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()V", line = 12)
    public static void method1884() {
        field4431 = null;
        field4434 = null;
        field4427 = null;
        field4440 = null;
        field4432 = null;
        field4435 = null;
    }
}
