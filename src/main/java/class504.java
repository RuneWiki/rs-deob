import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class504 extends class319 {

    @OriginalMember(owner = "client!dv", name = "Bb", descriptor = "Lrb;")
    public static class283 field7371 = new class283(15, 0);

    @OriginalMember(owner = "client!dv", name = "Eb", descriptor = "Lkc;")
    public static class157 field7374 = new class157(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!dv", name = "Hb", descriptor = "Lkc;")
    public static class157 field7377 = new class157(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!dv", name = "Ib", descriptor = "[Lgk;")
    public static class468[] field7378 = new class468[0];

    @OriginalMember(owner = "client!dv", name = "zb", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!dv", name = "Ab", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!dv", name = "Cb", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!dv", name = "Db", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!dv", name = "Fb", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!dv", name = "Gb", descriptor = "I")
    public static int field7376;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dv", name = "Jb", descriptor = "Ljava/lang/Class;")
    public static Class field7379;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2993(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "(B)V", line = 3)
    public static void method2987(byte arg0) {
        field7374 = null;
        if (arg0 < -47) {
            field7371 = null;
            field7378 = null;
            field7377 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IF)V", line = 16)
    public final void method2988(int arg0, float arg1) {
        ++field7369;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field4336[super.field4360++] = (byte) (var3 >> 24);
        if (arg0 >= -34) {
            field7376 = 17;
        }
        super.field4336[super.field4360++] = (byte) (var3 >> 16);
        super.field4336[super.field4360++] = (byte) (var3 >> 8);
        super.field4336[super.field4360++] = (byte) var3;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(FI)V", line = 32)
    public final void method2989(float arg0, int arg1) {
        ++field7372;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field4336[super.field4360++] = (byte) var3;
        super.field4336[super.field4360++] = (byte) (var3 >> 8);
        super.field4336[super.field4360++] = (byte) (var3 >> 16);
        super.field4336[super.field4360++] = (byte) (var3 >> 24);
        if (arg1 != -13163) {
            this.method2988(-114, 0.97184855F);
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(I)V", line = 50)
    public class504(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIII)Z", line = 53)
    public static final boolean method2990(int arg0, int arg1, int arg2, int arg3) {
        ++field7370;
        boolean var4 = true;
        if (arg1 != 261910288) {
            method2991(100, 61, 108, -51, 79);
        }
        class303 var5 = (class303) class191.method1267(arg0, arg2, arg3);
        if (var5 != null) {
            var4 &= class237.method1450(7, var5);
        }
        class303 var6 = (class303) class377.method2254(arg0, arg2, arg3, field7379 != null ? field7379 : (field7379 = method2993("bn")));
        if (var6 != null) {
            var4 &= class237.method1450(arg1 + -261910281, var6);
        }
        class303 var7 = (class303) class126.method913(arg0, arg2, arg3);
        if (var7 != null) {
            var4 &= class237.method1450(7, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)V", line = 81)
    public static final void method2991(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7375;
        if (arg4 < 115) {
            method2990(29, 3, 116, -40);
        }
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class486.method2879((byte) 22, arg1 - -arg0, class375.field5387, class519.field7633);
        int var10 = class486.method2879((byte) 20, -arg0 + arg1, class375.field5387, class519.field7633);
        class188.method1259(var10, (byte) 27, var9, arg3, class42.field626[arg2]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (~var12 <= ~class23.field320 && ~class233.field3241 <= ~var11) {
                    int var13 = class486.method2879((byte) 90, arg1 - -var5, class375.field5387, class519.field7633);
                    int var14 = class486.method2879((byte) -103, -var5 + arg1, class375.field5387, class519.field7633);
                    if (~var12 >= ~class233.field3241) {
                        class188.method1259(var14, (byte) 27, var13, arg3, class42.field626[var12]);
                    }
                    if (var11 >= class23.field320) {
                        class188.method1259(var14, (byte) 27, var13, arg3, class42.field626[var11]);
                    }
                }
            }
            ++var5;
            int var15 = arg2 - var5;
            int var16 = arg2 - -var5;
            if (~var16 <= ~class23.field320 && ~var15 >= ~class233.field3241) {
                int var17 = class486.method2879((byte) 17, arg1 + var6, class375.field5387, class519.field7633);
                int var18 = class486.method2879((byte) -94, -var6 + arg1, class375.field5387, class519.field7633);
                if (class233.field3241 >= var16) {
                    class188.method1259(var18, (byte) 27, var17, arg3, class42.field626[var16]);
                }
                if (~class23.field320 >= ~var15) {
                    class188.method1259(var18, (byte) 27, var17, arg3, class42.field626[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 163)
    public static final int method2992(String arg0, boolean arg1) {
        ++field7373;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            var3 = class355.method2125(-15205, arg0.charAt(var4)) + (var3 << 5) + -var3;
        }
        if (!arg1) {
            method2991(55, -23, 110, -34, 4);
        }
        return var3;
    }
}
