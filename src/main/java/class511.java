import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class511 {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lsr;")
    public class346[] field7527 = null;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lrg;")
    public class460 field7528 = null;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lrg;")
    public class460 field7524 = null;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[Lsr;")
    public class346[] field7525 = null;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lrg;")
    public class460 field7532 = null;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Z")
    public boolean field7523;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
    public static int[] field7522 = new int[1];

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "[I")
    public static int[] field7529 = new int[200];

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Ldn;")
    public static class201 field7533;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "[[B")
    public static byte[][] field7530;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lqa;B)V")
    public static final void method3048(class129 arg0, byte arg1) {
        if (arg1 <= 68) {
            method3048(null, (byte) -44);
        }
        field7526++;
        if (class419.field5575) {
            class121.method774(false, arg0);
        } else {
            class93.method637(1, arg0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method3049(int arg0) {
        field7533 = null;
        if (arg0 != 128) {
            method3050((byte) 48);
        }
        field7529 = null;
        field7522 = null;
        field7530 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static final void method3050(byte arg0) {
        if (arg0 != -30) {
            return;
        }
        for (int var1 = 0; var1 < class521.field7736.length; var1++) {
            for (int var2 = 0; var2 < class521.field7736[var1].length; var2++) {
                class521.field7736[var1][var2] = class380.field4952;
            }
        }
        field7531++;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lgk;)V")
    public class511(class463 arg0) {
        this.field7523 = arg0.field6752;
        class466.method2810(arg0, -113);
        if (this.field7523) {
            byte[] var6 = class360.method2119(class104.field1430, (byte) 97, false);
            this.field7532 = new class460(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class360.method2119(class112.field1542, (byte) 77, false);
            this.field7528 = new class460(arg0, 6410, 128, 128, 16, var7, 6410);
            class298 var8 = arg0.field6691;
            if (var8.method1789(27446)) {
                byte[] var9 = class360.method2119(class114.field1564, (byte) 87, false);
                this.field7524 = new class460(arg0, 6408, 128, 128, 16);
                class460 var10 = new class460(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1790(var10, 2.0F, -15185, this.field7524)) {
                    this.field7524.method217(47);
                } else {
                    this.field7524.method219(-23222);
                    this.field7524 = null;
                }
                var10.method219(-23222);
            }
        } else {
            this.field7525 = new class346[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class63.method359(32768, 50, var2 * 32768, class104.field1430);
                this.field7525[var2] = new class346(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field7527 = new class346[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class63.method359(32768, 50, var3 * 128 * 128 * 2, class112.field1542);
                this.field7527[var3] = new class346(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
