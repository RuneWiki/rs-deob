import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class479 {

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "I")
    public int field6950;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
    public int field6949;

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "Z")
    public boolean field6945;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "B")
    public byte field6939;

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "S")
    public short field6944;

    @OriginalMember(owner = "client!lia", name = "n", descriptor = "S")
    public short field6952;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "S")
    public short field6941;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
    public int field6942;

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "I")
    public int field6943;

    @OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
    public int field6951;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "Z")
    public static boolean field6948 = false;

    @OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
    public static int field6953 = 0;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIILwh;[BIZI)Liba;", line = 3)
    public static final class531 method2883(int arg0, int arg1, int arg2, class148 arg3, byte[] arg4, int arg5, boolean arg6, int arg7) {
        field6947++;
        if (arg5 != 497309962) {
            field6948 = true;
        }
        if (!arg3.field2258 && (!class627.method3619(2, arg1) || !class627.method3619(arg5 - 497309960, arg0))) {
            return arg3.field2264 ? new class531(arg3, 34037, arg7, arg1, arg0, arg6, arg4, arg2) : new class531(arg3, arg7, arg1, arg0, class432.method2684(arg1, -21774), class432.method2684(arg0, arg5 ^ 0xE25BF3F8), arg4, arg2);
        } else {
            return new class531(arg3, 3553, arg7, arg1, arg0, arg6, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Loi;III)Lru;", line = 29)
    public static final class193 method2884(class73 arg0, int arg1, int arg2, int arg3) {
        field6940++;
        int var4 = arg1 << 10 | arg0.field1025;
        class193 var5 = (class193) class350.field5111.method2515((long) var4 << 16, (byte) -104);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class248.field3606.method226(63, class248.field3606.method215(var4, 9));
        if (var6 == null) {
            int var9 = arg2 + 65536 << 10 | arg0.field1025;
            class193 var10 = (class193) class350.field5111.method2515((long) var9 << 16, (byte) -119);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class248.field3606.method226(arg3 + 99, class248.field3606.method215(var9, arg3 ^ 0x27));
            if (var11 == null) {
                int var14 = arg0.field1025 | 0x3FFFC00;
                class193 var15 = (class193) class350.field5111.method2515((long) var14 << 16, (byte) 66);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class248.field3606.method226(53, class248.field3606.method215(var14, 4));
                if (var16 == null) {
                    if (arg3 != 1) {
                        field6948 = false;
                    }
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class193 var17;
                    try {
                        var17 = class34.method176(var16, arg3);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field2930 = arg0;
                    class350.field5111.method2518((long) var14 << 16, arg3 + 22362, var17);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class193 var12;
                try {
                    var12 = class34.method176(var11, 1);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field2930 = arg0;
                class350.field5111.method2518((long) var9 << 16, 22363, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class193 var7;
            try {
                var7 = class34.method176(var6, 1);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field2930 = arg0;
            class350.field5111.method2518((long) var4 << 16, arg3 ^ 0x575A, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V", line = 110)
    public static final void method2885(int arg0, int arg1) {
        field6946++;
        if (arg0 != 9816) {
            method2883(80, 39, -12, null, null, -41, false, -64);
        }
        class150 var2 = class676.method3885(1000, 8, arg1);
        var2.method1115(true);
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 138)
    public class479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field6950 = arg11;
        this.field6949 = arg2;
        this.field6945 = arg10;
        this.field6939 = (byte) arg8;
        this.field6944 = (short) arg5;
        this.field6952 = (short) arg4;
        this.field6941 = (short) arg6;
        this.field6942 = arg3;
        this.field6943 = arg0;
        this.field6951 = arg1;
    }
}
