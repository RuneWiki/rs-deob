import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class699 extends class514 {

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lvq;")
    public class488 field9649;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "F")
    public static float field9644;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ld;")
    public static class162 field9647;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZLjava/lang/String;IILha;I)V")
    public static final void method3890(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, class66 arg6, int arg7) {
        field9645++;
        if (class381.field5185 == null || class258.field3623 == null) {
            if (class346.field4664.method3737(class150.field2488, false) && class346.field4664.method3737(class737.field10181, false)) {
                class381.field5185 = arg6.method498(class49.method366(class346.field4664, class150.field2488, 0), true);
                class49 var8 = class49.method366(class346.field4664, class737.field10181, 0);
                class258.field3623 = arg6.method498(var8, true);
                var8.method363();
                class487.field6578 = arg6.method498(var8, true);
            } else {
                arg6.method537(arg0, arg5, arg7, arg4, 255 - class557.field7858 << 24 | class533.field7210, 1);
            }
        }
        if (class381.field5185 != null && class258.field3623 != null) {
            int var9 = (arg7 - (class258.field3623.method220() * 2)) / class381.field5185.method220();
            for (int var10 = 0; var10 < var9; var10++) {
                class381.field5185.method3430(class258.field3623.method220() + arg0 + (class381.field5185.method220() * var10), arg5);
            }
            class258.field3623.method3430(arg0, arg5);
            class487.field6578.method3430(arg7 + (arg0 - class487.field6578.method220()), arg5);
        }
        class557.field7861.method598(arg5 + 14, class534.field7221 | 0xFF000000, -1, arg3, arg0 + 3, (byte) -19);
        if (arg2) {
            field9647 = null;
        }
        arg6.method537(arg0, arg4 + arg5, arg7, arg1 - arg4, class533.field7210 | -class557.field7858 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
    public static final boolean method3891(int arg0, int arg1, int arg2) {
        field9646++;
        if (arg0 == 0) {
            return (arg1 & 0xC580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method3892(boolean arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        field9648++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class530.field7179.field3771 : class530.field7179.field3772);
        int var8 = var6;
        if (arg0) {
            return;
        }
        while (var7 > var8) {
            class533 var11 = class530.field7179.method1747(1, var8);
            if (var11.field7215 && var11.method3026(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class119.field2182 = null;
                    class792.field10853 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
            var8++;
        }
        class119.field2182 = var4;
        class792.field10853 = var5;
        class505.field6889 = 0;
        String[] var9 = new String[class792.field10853];
        for (int var10 = 0; var10 < class792.field10853; var10++) {
            var9[var10] = class530.field7179.method1747(1, var4[var10]).method3026(arg0);
        }
        class462.method2659(class119.field2182, !arg0, var9);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static void method3893(byte arg0) {
        if (arg0 <= 94) {
            field9644 = 1.200672F;
        }
        field9647 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lhk;II[B)V")
    public class699(class111 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9649 = class384.method2329(6406, arg1, false, arg2, arg0, 6406, (byte) 113, arg3);
        this.field9649.method1742(41, false, false);
    }
}
