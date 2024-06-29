import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class136 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2912 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lth;")
    public static class187 field2910 = new class187();

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Ldd;")
    public static class35 field2916 = class180.method1196((byte) 127, "Passwort: ");

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Ldd;")
    public static class35 field2917 = class180.method1196((byte) -62, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Ldd;")
    public static class35 field2918 = class180.method1196((byte) 127, "b12_full");

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ldd;")
    public static class35 field2919 = class180.method1196((byte) 127, "Mem:");

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)I")
    public static final int method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        field2914++;
        if (arg3 == var7) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg6 - arg2;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        if (arg0 != 100) {
            field2917 = null;
        }
        field2910 = null;
        field2918 = null;
        field2919 = null;
        field2916 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILdd;)I")
    public static final int method932(int arg0, class35 arg1) {
        field2911++;
        if (class106.field2373 == 1) {
            return 7;
        } else if (arg1.method335(class188.field3821, 92)) {
            return 1;
        } else if (arg1.method335(class43.field939, -97)) {
            return 1;
        } else {
            int var2 = 6 % ((arg0 + 51) / 48);
            if (arg1.method335(class24.field487, 62)) {
                return 2;
            } else if (arg1.method335(class158.field3213, -52)) {
                return 2;
            } else if (arg1.method335(class150.field3127, 57)) {
                return 3;
            } else if (arg1.method335(class61.field1500, 73)) {
                return 4;
            } else if (arg1.method335(class45.field974, 66)) {
                return 4;
            } else if (arg1.method335(class125.field2730, 124)) {
                return 5;
            } else if (arg1.method335(class78.field1824, 103)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[BBI)Z")
    public static final boolean method933(int arg0, byte[] arg1, byte arg2, int arg3) {
        field2915++;
        boolean var4 = true;
        if (arg2 > -101) {
            return true;
        }
        int var5 = -1;
        class26 var6 = new class26(arg1);
        label60: while (true) {
            int var7 = var6.method245((byte) 125);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method259((byte) -87);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var6.method221(-128) >> 2;
                    int var15 = arg3 + var12;
                    int var16 = arg0 + var13;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class145 var17 = class4.method23((byte) -125, var5);
                        if (var14 != 22 || !class35.field781 || var17.field3043 != 0 || var17.field3045 == 1 || var17.field3027) {
                            if (!var17.method999(-1)) {
                                var4 = false;
                                class26.field576++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method259((byte) -97);
                if (var10 == 0) {
                    break;
                }
                var6.method221(-103);
            }
        }
    }
}
