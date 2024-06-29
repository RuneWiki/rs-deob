import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class320 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Z")
    public boolean field4559 = false;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lmk;")
    public class33 field4568 = null;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Z")
    public boolean field4567 = false;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public int field4570 = 0;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[S")
    public short[] field4564;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[S")
    public short[] field4563;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[S")
    public short[] field4560;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[S")
    public short[] field4556;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[S")
    public short[] field4565;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[B")
    public byte[] field4558;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[S")
    private static short[] field4557 = new short[500];

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[S")
    private static short[] field4562 = new short[500];

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[S")
    private static short[] field4561 = new short[500];

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[S")
    private static short[] field4566 = new short[500];

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[S")
    private static short[] field4569 = new short[500];

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "[B")
    private static byte[] field4571 = new byte[500];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V", line = 6)
    public static void method2096() {
        field4569 = null;
        field4561 = null;
        field4562 = null;
        field4557 = null;
        field4566 = null;
        field4571 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([BLmk;)V", line = 58)
    public class320(byte[] arg0, class33 arg1) {
        this.field4568 = arg1;
        try {
            class236 var3 = new class236(arg0);
            class236 var4 = new class236(arg0);
            var3.field3320 = 2;
            int var5 = var3.method1574(-124);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3320 = var3.field3320 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4568.field385[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1574(-62);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4569[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4561[var6] = var12;
                    } else {
                        field4561[var6] = (short) var4.method1577(-1640531527);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4562[var6] = var12;
                    } else {
                        field4562[var6] = (short) var4.method1577(-1640531527);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4557[var6] = var12;
                    } else {
                        field4557[var6] = (short) var4.method1577(-1640531527);
                    }
                    field4571[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field4561[var6] = (short) (((field4561[var6] & 0xFF) << 3) + (field4561[var6] >> 8 & 0x7));
                        field4562[var6] = (short) (((field4562[var6] & 0xFF) << 3) + (field4562[var6] >> 8 & 0x7));
                        field4557[var6] = (short) (((field4557[var6] & 0xFF) << 3) + (field4557[var6] >> 8 & 0x7));
                        field4561[var6] = (short) (field4561[var6] << 3);
                        field4562[var6] = (short) (field4562[var6] << 3);
                        field4557[var6] = (short) (field4557[var6] << 3);
                    }
                    field4566[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4566[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4567 = true;
                    } else if (var10 == 7) {
                        this.field4559 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3320) {
                throw new RuntimeException();
            }
            this.field4570 = var6;
            this.field4564 = new short[var6];
            this.field4563 = new short[var6];
            this.field4560 = new short[var6];
            this.field4556 = new short[var6];
            this.field4565 = new short[var6];
            this.field4558 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4564[var13] = field4569[var13];
                this.field4563[var13] = field4561[var13];
                this.field4560[var13] = field4562[var13];
                this.field4556[var13] = field4557[var13];
                this.field4565[var13] = field4566[var13];
                this.field4558[var13] = field4571[var13];
            }
        } catch (Exception var14) {
            this.field4570 = 0;
            this.field4567 = false;
            this.field4559 = false;
        }
    }
}
