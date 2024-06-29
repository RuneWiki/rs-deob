import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class179 {

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field2594 = 0;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lkaa;")
    public class44 field2590 = null;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
    public boolean field2585 = false;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
    public boolean field2589 = false;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
    public boolean field2584 = false;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[S")
    public short[] field2588;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
    public short[] field2593;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[S")
    public short[] field2595;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[S")
    public short[] field2592;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[S")
    public short[] field2587;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[B")
    public byte[] field2597;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
    private static short[] field2586 = new short[500];

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[S")
    private static short[] field2596 = new short[500];

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[S")
    private static short[] field2598 = new short[500];

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[B")
    private static byte[] field2599 = new byte[500];

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[S")
    private static short[] field2591 = new short[500];

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[S")
    private static short[] field2600 = new short[500];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V", line = 16)
    public static void method1238() {
        field2596 = null;
        field2586 = null;
        field2591 = null;
        field2598 = null;
        field2600 = null;
        field2599 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLkaa;)V", line = 65)
    public class179(byte[] arg0, class44 arg1) {
        this.field2590 = arg1;
        try {
            class501 var3 = new class501(arg0);
            class501 var4 = new class501(arg0);
            var3.method2874((byte) -75);
            var3.field6892 += 2;
            int var5 = var3.method2874((byte) -75);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6892 = var3.field6892 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2590.field530[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2874((byte) -75);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2596[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2586[var6] = var12;
                    } else {
                        field2586[var6] = (short) var4.method2855((byte) -8);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2591[var6] = var12;
                    } else {
                        field2591[var6] = (short) var4.method2855((byte) -8);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2598[var6] = var12;
                    } else {
                        field2598[var6] = (short) var4.method2855((byte) -8);
                    }
                    field2599[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2586[var6] = (short) (field2586[var6] << 2 & 0x3FFF);
                        field2591[var6] = (short) (field2591[var6] << 2 & 0x3FFF);
                        field2598[var6] = (short) (field2598[var6] << 2 & 0x3FFF);
                    }
                    field2600[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2600[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2584 = true;
                    } else if (var10 == 7) {
                        this.field2589 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2585 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6892) {
                throw new RuntimeException();
            }
            this.field2594 = var6;
            this.field2588 = new short[var6];
            this.field2593 = new short[var6];
            this.field2595 = new short[var6];
            this.field2592 = new short[var6];
            this.field2587 = new short[var6];
            this.field2597 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2588[var13] = field2596[var13];
                this.field2593[var13] = field2586[var13];
                this.field2595[var13] = field2591[var13];
                this.field2592[var13] = field2598[var13];
                this.field2587[var13] = field2600[var13];
                this.field2597[var13] = field2599[var13];
            }
        } catch (Exception var14) {
            this.field2594 = 0;
            this.field2584 = false;
            this.field2589 = false;
        }
    }
}
