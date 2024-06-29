import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class176 extends class626 {

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Z")
    public boolean field2554;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lwga;")
    public static final class745 method1278(int arg0, int arg1) {
        field2548++;
        class745 var2 = (class745) class46.field677.method3236((long) arg1, (byte) 107);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class515.field7336.method1453(0, -116, arg1);
        int var4 = -42 % ((69 - arg0) / 52);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class745 var5;
        try {
            var5 = class204.method1421(113, var3);
        } catch (Exception var7) {
            throw new RuntimeException(var7.getMessage() + " S: " + arg1);
        }
        class46.field677.method3237((long) arg1, var5, 16205);
        return var5;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I")
    public static final int method1279(int arg0) {
        field2553++;
        return arg0 == -29035 ? class508.field7250 : -90;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lgs;ZZ)V")
    public static final void method1280(class43 arg0, boolean arg1, boolean arg2) {
        arg0.field654 = arg2;
        if (!class190.field2741) {
            class67.method707(arg0, class624.field8970);
        } else if (arg1) {
            class497.field7092[class497.field7092.length - 1].method3793(true, arg0);
        } else {
            int var3 = class63.method678(arg0.field655);
            int var4 = class694.field9757[2] * arg0.method393((byte) -83) / arg0.field647;
            int var5 = class63.method678(arg0.field655 - var4);
            int var6 = class63.method678(arg0.field655 + var4);
            if (var5 == var6) {
                class497.field7092[var3].method3793(true, arg0);
            } else if (var6 - var5 == 1) {
                class497.field7092[class368.field5159 + var5].method3793(true, arg0);
            } else {
                class497.field7092[class497.field7092.length - 1].method3793(true, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIZ)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2554 = arg5;
        this.field2547 = arg0;
        this.field2550 = arg2;
        this.field2549 = arg3;
        this.field2551 = arg4;
        this.field2552 = arg1;
    }
}
