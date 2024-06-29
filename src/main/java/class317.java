import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class317 implements class262 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Lci;")
    private class560 field3944;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lbba;")
    private class575 field3946;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Z")
    public static boolean field3950 = true;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field3951 = 0;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Lbt;")
    public static class437 field3949 = new class437(5, 3);

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public static int field3953 = -1;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V", line = 5)
    public static void method1853(int arg0) {
        field3949 = null;
        if (arg0 != -21023) {
            field3953 = -30;
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V", line = 17)
    public static final void method1854(int arg0) {
        field3943++;
        if (class93.field1291 == null) {
            return;
        }
        class601.field7648 = new class190();
        class601.field7648.method1326(class45.field503, class93.field1291, 0, class93.field1291.field26, class93.field1291.field24.method3589(class496.field6338, -22395));
        if (arg0 == 2) {
            class181.field2469 = new Thread(class601.field7648, "");
            class181.field2469.start();
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V", line = 38)
    public final void method1035(int arg0) {
        field3942++;
        if (arg0 != 27889) {
            method1854(13);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lbba;Lci;)V", line = 47)
    public class317(class575 arg0, class560 arg1) {
        this.field3944 = arg1;
        this.field3946 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z", line = 58)
    public final boolean method1034(int arg0) {
        if (arg0 != -32160) {
            field3953 = -18;
        }
        field3945++;
        return this.field3946.method3094((byte) 121);
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V", line = 69)
    public static final void method1855(int arg0) {
        field3952++;
        int var1 = -66 % ((50 - arg0) / 41);
        class410.method2381(-224);
        class364.method2092(class485.field6252.field6930.method3991(false) == 1, 2, 22050, -8001);
        class331.field4047 = class596.method3216(1, 22050, class678.field8763, 0, class740.field10014);
        class288.method1748(class176.method1122(null, (byte) 117), -93, true);
        class223.field3037 = class596.method3216(1, 2048, class678.field8763, 1, class740.field10014);
        class223.field3037.method1029(class1.field10, 26707);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V", line = 89)
    public final void method835(boolean arg0, int arg1) {
        field3947++;
        class676 var3 = this.field3946.method3096(true, this.field3944.field7117);
        if (arg1 != 24726) {
            this.method1035(14);
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field3944.field7122.method4129(0, class719.field9443, this.field3944.field7112) + this.field3944.field7116;
        int var5 = this.field3944.field7114.method90(class398.field5240, this.field3944.field7120, arg1 ^ 0xFFFF9F07) + this.field3944.field7126;
        if (this.field3944.field7115) {
            class576.field7320.method911(var4, var5, this.field3944.field7112, this.field3944.field7120, this.field3944.field7118, 0);
        }
        int var6 = var5 + this.method1856(8, var5, class595.field7562, 5, var3.field8744, var4) * 12;
        int var9 = var6 + 8;
        if (this.field3944.field7115) {
            class576.field7320.method973(var4, var9, var4 + this.field3944.field7112 - 1, var9, this.field3944.field7118, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1856(arg1 ^ 0x609E, var6, class595.field7562, 5, var3.field8743, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1856(arg1 - 24718, var10, class595.field7562, 5, var3.field8745, var4) * 12;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILda;ILjava/lang/String;I)I", line = 123)
    private final int method1856(int arg0, int arg1, class420 arg2, int arg3, String arg4, int arg5) {
        field3955++;
        return arg0 == 8 ? arg2.method2426((byte) -128, 0, null, arg3 + arg5, arg1 - -arg3, arg4, 0, 0, null, this.field3944.field7112 - (arg3 * 2), 0, this.field3944.field7111, 0, this.field3944.field7121, this.field3944.field7120 - (arg3 * 2), null) : -16;
    }
}
