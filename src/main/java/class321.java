import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class321 {

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Z")
    public boolean field4542 = false;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field4534 = 0;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Z")
    public boolean field4543 = false;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljo;")
    public class373 field4536 = null;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Z")
    public boolean field4537 = false;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[S")
    public short[] field4544;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[S")
    public short[] field4541;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "[S")
    public short[] field4549;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[S")
    public short[] field4545;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[S")
    public short[] field4547;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "[B")
    public byte[] field4546;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[S")
    private static short[] field4535 = new short[500];

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[S")
    private static short[] field4540 = new short[500];

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[S")
    private static short[] field4538 = new short[500];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[B")
    private static byte[] field4533 = new byte[500];

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[S")
    private static short[] field4539 = new short[500];

    @OriginalMember(owner = "client!am", name = "p", descriptor = "[S")
    private static short[] field4548 = new short[500];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()V")
    public static void method2041() {
        field4535 = null;
        field4538 = null;
        field4539 = null;
        field4548 = null;
        field4540 = null;
        field4533 = null;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "([BLjo;)V")
    public class321(byte[] arg0, class373 arg1) {
        this.field4536 = arg1;
        try {
            class511 var3 = new class511(arg0);
            class511 var4 = new class511(arg0);
            var3.method3013(17);
            var3.field6962 += 2;
            int var5 = var3.method3013(73);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6962 = var3.field6962 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4536.field5364[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3013(111);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4535[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4538[var6] = var12;
                    } else {
                        field4538[var6] = (short) var4.method3022((byte) 77);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4539[var6] = var12;
                    } else {
                        field4539[var6] = (short) var4.method3022((byte) 83);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4548[var6] = var12;
                    } else {
                        field4548[var6] = (short) var4.method3022((byte) 100);
                    }
                    field4533[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4538[var6] = (short) (field4538[var6] << 2 & 0x3FFF);
                        field4539[var6] = (short) (field4539[var6] << 2 & 0x3FFF);
                        field4548[var6] = (short) (field4548[var6] << 2 & 0x3FFF);
                    }
                    field4540[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4540[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4543 = true;
                    } else if (var10 == 7) {
                        this.field4537 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4542 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6962) {
                throw new RuntimeException();
            }
            this.field4534 = var6;
            this.field4544 = new short[var6];
            this.field4541 = new short[var6];
            this.field4549 = new short[var6];
            this.field4545 = new short[var6];
            this.field4547 = new short[var6];
            this.field4546 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4544[var13] = field4535[var13];
                this.field4541[var13] = field4538[var13];
                this.field4549[var13] = field4539[var13];
                this.field4545[var13] = field4548[var13];
                this.field4547[var13] = field4540[var13];
                this.field4546[var13] = field4533[var13];
            }
        } catch (Exception var14) {
            this.field4534 = 0;
            this.field4543 = false;
            this.field4537 = false;
        }
    }
}
