import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class187 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field2942 = 1;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Z")
    public boolean field2950 = true;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field2949 = 0;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field2940 = 2;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field2945 = 2;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Z")
    public boolean field2957 = true;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public int field2954 = 0;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public int field2946 = 2;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public int field2941 = 127;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Z")
    public boolean field2963 = true;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public int field2959 = 0;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Z")
    public boolean field2951 = true;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field2952 = 127;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
    public boolean field2944 = true;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Z")
    public boolean field2947 = true;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public int field2960 = 255;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Z")
    public boolean field2962 = true;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Z")
    public boolean field2955 = false;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    public boolean field2958 = false;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Z")
    public boolean field2948 = true;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Z")
    public boolean field2938 = true;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field2970 = 0;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Z")
    public boolean field2969 = true;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Z")
    public boolean field2964 = true;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Z")
    public boolean field2953 = true;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field2966 = 0;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public int field2971 = 0;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field2968 = 3;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public int field2974 = 2;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
    public boolean field2943 = true;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[B")
    public static byte[] field2956 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Lsk;")
    public static class423 field2967;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Z")
    public boolean field2961;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
    public static boolean field2965;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Z")
    public boolean field2972;

    static {
        new class423("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field2967 = new class423("Self", "Mich", "Moi", "Eu");
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZB)V", line = 14)
    public static final void method1157(boolean arg0, byte arg1) {
        class286 var2 = (class286) class14.field204.method8((byte) -98);
        if (arg1 != -11) {
            method1159(124, 96, -61, 96, -92, 46);
        }
        while (var2 != null) {
            if (var2.field4325 != null) {
                class178.field2786.method2099(var2.field4325);
                var2.field4325 = null;
            }
            if (var2.field4337 != null) {
                class178.field2786.method2099(var2.field4337);
                var2.field4337 = null;
            }
            var2.method1121(false);
            var2 = (class286) class14.field204.method17((byte) 66);
        }
        field2939++;
        if (!arg0) {
            return;
        }
        for (class286 var3 = (class286) class414.field5999.method8((byte) -98); var3 != null; var3 = (class286) class414.field5999.method17((byte) -70)) {
            if (var3.field4325 != null) {
                class178.field2786.method2099(var3.field4325);
                var3.field4325 = null;
            }
            var3.method1121(false);
        }
        for (class286 var4 = (class286) class199.field3141.method2415((byte) -75); var4 != null; var4 = (class286) class199.field3141.method2416((byte) -124)) {
            if (var4.field4325 != null) {
                class178.field2786.method2099(var4.field4325);
                var4.field4325 = null;
            }
            var4.method1121(false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 121)
    public static void method1158(byte arg0) {
        field2967 = null;
        field2956 = null;
        if (arg0 < 58) {
            field2965 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V", line = 215)
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2973++;
        int var6 = arg3 - arg1;
        int var7 = arg2 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class254.method1528(arg5, arg2, 15368, arg4, arg1);
            }
        } else if (var7 == 0) {
            class59.method418(arg4, (byte) 58, arg5, arg1, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class355.field5296) {
                var10 = class355.field5296;
                var11 = (class355.field5296 * var8 >> 12) + var9;
            } else if (class320.field4818 < arg3) {
                var10 = class320.field4818;
                var11 = (class320.field4818 * var8 >> 12) + var9;
            } else {
                var10 = arg3;
                var11 = arg2;
            }
            int var12;
            int var13;
            if (arg1 < class355.field5296) {
                var12 = class355.field5296;
                var13 = (class355.field5296 * var8 >> 12) + var9;
            } else if (arg1 > class320.field4818) {
                var12 = class320.field4818;
                var13 = var9 + (class320.field4818 * var8 >> 12);
            } else {
                var13 = arg5;
                var12 = arg1;
            }
            if (var11 < class248.field3808) {
                var11 = class248.field3808;
                var10 = (class248.field3808 - var9 << 12) / var8;
            } else if (var11 > class478.field7310) {
                var11 = class478.field7310;
                var10 = (class478.field7310 - var9 << 12) / var8;
            }
            if (class248.field3808 > var13) {
                var13 = class248.field3808;
                var12 = (class248.field3808 - var9 << 12) / var8;
            } else if (class478.field7310 < var13) {
                var13 = class478.field7310;
                var12 = (class478.field7310 - var9 << 12) / var8;
            }
            if (arg0 != 293599692) {
                method1157(true, (byte) 66);
            }
            class423.method2472(arg4, var10, var13, var11, arg0 - 293599570, var12);
        }
    }
}
