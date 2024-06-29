import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class427 extends class450 {

    @OriginalMember(owner = "client!un", name = "g", descriptor = "Lhda;")
    public static class752 field5881 = new class752(16, 2);

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Lkaa;")
    public static class47 field5891 = new class47(59, 3);

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Lhda;")
    public static class752 field5893 = new class752(6, 2);

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field5895 = -50;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "Lqda;")
    public static class105 field5894 = new class105(1);

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "[I")
    public static int[] field5887;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            this.method68(true);
        }
        ++field5880;
        if (super.field6170 != 0 && ~super.field6171.field3900.method1182(true) != -2) {
            super.field6170 = 0;
        }
        if (super.field6170 < 0 || super.field6170 > 1) {
            super.field6170 = this.method68(false);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([BLjava/lang/String;II)I")
    public static final int method2462(byte[] arg0, String arg1, int arg2, int arg3) {
        ++field5884;
        if (arg3 != 1) {
            field5881 = null;
        }
        int var4 = arg2;
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class6.method82(arg1.charAt(var6), 5041);
            int var8 = ~(var6 + 1) > ~var5 ? class6.method82(arg1.charAt(var6 + 1), 5041) : -1;
            int var9 = var6 + 2 >= var5 ? -1 : class6.method82(arg1.charAt(var6 + 2), 5041);
            int var10 = var5 > var6 + 3 ? class6.method82(arg1.charAt(var6 + 3), arg3 ^ 5040) : -1;
            arg0[arg2++] = (byte) class446.method2556(var8 >>> 4, var7 << 2);
            if (~var9 == 0) {
                break;
            }
            arg0[arg2++] = (byte) class446.method2556(class48.method346(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class446.method2556(class48.method346(var9 << 6, 192), var10);
        }
        return -var4 + arg2;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
    public static void method2463(byte arg0) {
        field5893 = null;
        field5891 = null;
        field5894 = null;
        int var1 = -23 % ((-74 - arg0) / 45);
        field5881 = null;
        field5887 = null;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)I")
    public final int method2464(boolean arg0) {
        if (!arg0) {
            field5894 = null;
        }
        ++field5890;
        return super.field6170;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lup;)V")
    public class427(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Z")
    public final boolean method2465(int arg0) {
        ++field5889;
        return arg0 != 260 ? true : true;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILee;I)V")
    public static final void method2466(int arg0, class677 arg1, int arg2) {
        if (class671.field9154 != null) {
            try {
                class671.field9154.method3138((byte) -66, 0L);
                class671.field9154.method3139(false, 24, arg1.field9399, arg0);
            } catch (Exception var3) {
            }
        }
        ++field5892;
        if (arg2 < 73) {
            method2468(-96, -92, 111, -49, 114, (String) null, -92, 11);
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
    public static final void method2467(int arg0) {
        ++field5883;
        class752.field10491 = 0;
        class121.field1937 = 0;
        class603.field7928 = 0;
        class264.field3679 = 0;
        if (arg0 >= -121) {
            field5894 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (arg0) {
            ++field5886;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(ILup;)V")
    public class427(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field5882;
        return arg0 != arg1 && ~super.field6171.field3900.method1182(true) != -2 ? 2 : 1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        ++field5885;
        if (arg0) {
            method2468(-127, 119, 6, -110, -18, (String) null, 9, -32);
        }
        return 1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public static final void method2468(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        if (arg4 > -59) {
            method2466(100, (class677) null, 82);
        }
        ++field5888;
        class381 var8 = new class381();
        var8.field5296 = arg3;
        var8.field5301 = arg7;
        var8.field5300 = arg0;
        var8.field5290 = arg5;
        var8.field5291 = arg2;
        var8.field5293 = class29.field474 + arg1;
        var8.field5295 = arg6;
        class36.field518.method3870(var8, 0);
    }
}
