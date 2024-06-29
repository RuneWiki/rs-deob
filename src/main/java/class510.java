import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class510 extends class130 {

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field7414 = 0;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public int field7416;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public int field7419;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public int field7425;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "I")
    public int field7427;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
    public int field7429;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "Lfi;")
    public class38 field7417;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "Lfi;")
    public class38 field7423;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "Lc;")
    public static class517 field7421;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Lum;")
    public static class83 field7418;

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "Lum;")
    public static class83 field7431;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "Ljava/lang/String;")
    public String field7424;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "Z")
    public boolean field7420;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "[Ljava/lang/Object;")
    public Object[] field7413;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public static void method3033(byte arg0) {
        field7431 = null;
        if (arg0 >= -112) {
            method3036(9, null, -89);
        }
        field7418 = null;
        field7421 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZZI)I")
    public static final int method3034(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field7426++;
        class100 var5 = class48.method323(Integer.MIN_VALUE, arg3, arg1);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = arg4; var7 < var5.field1532.length; var7++) {
            if (var5.field1532[var7] >= 0 && var5.field1532[var7] < class300.field4608.field4787) {
                class221 var8 = class300.field4608.method2088(var5.field1532[var7], 116);
                int var9 = var8.method1513(arg0, class264.field4225.method2789((byte) 36, arg0).field6692, (byte) -126);
                if (arg2) {
                    var6 += var5.field1534[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)V")
    public static final void method3035(int arg0, int arg1, byte arg2) {
        field7422++;
        class188 var3 = class10.method48((byte) 98, 16, arg0);
        if (arg2 != -12) {
            field7421 = null;
        }
        var3.method1308(false);
        var3.field2873 = arg1;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILfh;I)V")
    public static final void method3036(int arg0, class194 arg1, int arg2) {
        if (class99.field1529 != null) {
            try {
                class99.field1529.method1460(0L, -56);
                class99.field1529.method1461(-1675, arg2, 24, arg1.field2973);
            } catch (Exception var3) {
            }
        }
        if (arg0 != -3255) {
            field7418 = null;
        }
        field7428++;
    }
}
