import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class544 extends class149 {

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Z")
    public static boolean field7577 = false;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field7580 = -2;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Lha;")
    public static class116 field7579;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Ljt;")
    public static class489 field7578;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)Loj;")
    public abstract class498 method323(boolean arg0);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method3047(int arg0) {
        field7578 = null;
        int var1 = -127 / ((22 - arg0) / 58);
        field7579 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(DI)V")
    public static final void method3048(double arg0, int arg1) {
        if (class146.field2240 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class401.field5995[var3] = var4 <= 255 ? var4 : 255;
            }
            class146.field2240 = arg0;
        }
        if (arg1 != 255) {
            field7577 = false;
        }
        field7575++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLco;I)Ljava/lang/String;")
    public static final String method3049(boolean arg0, class268 arg1, int arg2) {
        field7576++;
        try {
            if (arg0) {
                method3048(0.09706729931210692D, 34);
            }
            int var3 = arg1.method1749((byte) 107);
            if (var3 > arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field3913 += class321.field4653.method2499((byte) 57, var3, arg1.field3952, var4, 0, arg1.field3913);
            return class277.method1781(var3, 0, var4, -19);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
