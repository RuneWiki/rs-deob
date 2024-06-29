import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class512 {

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public int field7528 = 8;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public int field7532 = 16777215;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Ljm;")
    public static class485 field7521 = new class485(17, 2);

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public int field7522;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public int field7523;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field7524;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public int field7530;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public int field7531;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Z")
    public boolean field7529;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILlh;I)V", line = 9)
    private final void method3003(int arg0, class365 arg1, int arg2) {
        if (arg2 != 7784) {
            this.field7532 = 100;
        }
        if (arg0 == 1) {
            this.field7528 = arg1.method2062((byte) 14);
        } else if (arg0 == 2) {
            this.field7529 = true;
        } else if (arg0 == 3) {
            this.field7523 = arg1.method2069(-127);
            this.field7524 = arg1.method2069(arg2 ^ 0xFFFFE1ED);
            this.field7522 = arg1.method2069(arg2 ^ 0xFFFFE1EF);
        } else if (arg0 == 4) {
            this.field7531 = arg1.method2099(arg2 ^ 0x1E97);
        } else if (arg0 == 5) {
            this.field7530 = arg1.method2062((byte) 14);
        } else if (arg0 == 6) {
            this.field7532 = arg1.method2111(arg2 - 7786);
        }
        field7527++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLht;)V", line = 58)
    public static final void method3004(byte arg0, class410 arg1) {
        field7525++;
        if (class67.field939 == null) {
            class166 var2 = new class166();
            byte[] var3 = var2.method1027(-87335540, 128, 128, 16);
            class67.field939 = class385.method2211(var3, false, 17341);
        }
        if (class239.field3282 == null) {
            class366 var4 = new class366();
            byte[] var5 = var4.method2118(-501, 128, 128, 16);
            class239.field3282 = class385.method2211(var5, false, 17341);
        }
        if (arg0 < 99) {
            return;
        }
        class519 var6 = arg1.field5861;
        if (var6.method3057(35632) && class178.field2527 == null) {
            byte[] var7 = class508.method2985(16, 4.0F, new class348(419684), 128, (byte) 111, 16.0F, 4.0F, 8, 0.6F, 128, 0.5F);
            class178.field2527 = class385.method2211(var7, false, 17341);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILlh;)V", line = 99)
    public final void method3005(int arg0, class365 arg1) {
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                field7526++;
                if (arg0 > -6) {
                    this.method3003(-68, null, 117);
                    return;
                }
                return;
            }
            this.method3003(var3, arg1, 7784);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 119)
    public static void method3006(int arg0) {
        if (arg0 == 27782) {
            field7521 = null;
        }
    }
}
