import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class20 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Llc;")
    public static class143 field322 = class66.method374("::errortest", -1);

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Llc;")
    public static class143 field330 = class66.method374("Bitte entfernen Sie ", -1);

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Llc;")
    public static class143 field328 = class66.method374("<)4col>", -1);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "[[[B")
    public static byte[][][] field327;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
    public static final int method140(int arg0, int arg1, int arg2, int arg3) {
        field325++;
        if (class192.field3535 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        if (arg1 < 73) {
            field322 = null;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class231.field4225[1][var5][var4] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class192.field3535[var6][var5][var4] + class192.field3535[var6][var5 + 1][var4] * var7 >> 7;
        int var10 = (128 - var7) * class192.field3535[var6][var5][var4 + 1] + class192.field3535[var6][var5 + 1][var4 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method141(Component arg0, int arg1) {
        Method var2 = class81.field1486;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class229.field4189);
        field323++;
        arg0.addFocusListener(class229.field4189);
        int var3 = -27 % ((arg1 + 80) / 40);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)I")
    public static final int method142(boolean arg0, int arg1) {
        if (!arg0) {
            method142(true, 103);
        }
        field326++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method143(int arg0) {
        field327 = null;
        field330 = null;
        field328 = null;
        if (arg0 >= 81) {
            field322 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class184.field3349 * arg0 + class149.field2740 * arg3 >> 16;
        int var6 = class184.field3349 * arg3 - class149.field2740 * arg0 >> 16;
        int var7 = class91.field1635 * arg1 + class217.field3978 * var6 >> 16;
        int var8 = class217.field3978 * arg1 - class91.field1635 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class91.field1635 * arg2 + class217.field3978 * var6 >> 16;
        int var12 = class217.field3978 * arg2 - class91.field1635 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class140.field2450 && var13 < class140.field2450) {
            return false;
        } else if (var9 > class119.field2109 && var13 > class119.field2109) {
            return false;
        } else if (var10 < class92.field1654 && var14 < class92.field1654) {
            return false;
        } else {
            return var10 <= class5.field79 || var14 <= class5.field79;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static final void method145(int arg0) {
        field324++;
        int var1 = class82.field1493.length;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class82.field1493[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class266.field4785; var4++) {
                    if (class6.field88[var2] == class244.field4375[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class244.field4375[class266.field4785] = class6.field88[var2];
                    var3 = class266.field4785++;
                }
                int var5 = 0;
                class190 var6 = new class190(class82.field1493[var2]);
                while (class82.field1493[var2].length > var6.field3487 && var5 < 511) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method1275(arg0 ^ 0x80);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class6.field88[var2] >> 8) * 64 + var10 - class148.field2733;
                    int var13 = (class6.field88[var2] & 0xFF) * 64 + var11 - class141.field2466;
                    class85 var14 = class154.method1018(-112, var6.method1275(128));
                    if (class259.field4648[var7] == null && (var14.field1523 & 0x1) > 0 && class225.field4075 == var9 && var12 >= 0 && (var14.field1531 + var12) < 104 && var13 >= 0 && (var14.field1531 + var13) < 104) {
                        class259.field4648[var7] = new class187();
                        class187 var15 = class259.field4648[var7];
                        class56.field1093[class212.field3945++] = var7;
                        var15.field4146 = class146.field2635;
                        var15.method1219((byte) 72, var14);
                        var15.method1557(6622, var15.field3384.field1531);
                        var15.field4168 = var15.field4183 = class58.field1118[var15.field3384.field1550];
                        var15.field4142 = var15.field3384.field1571;
                        var15.field4181 = var15.field3384.field1519;
                        var15.field4125 = var15.field3384.field1555;
                        var15.field4141 = var15.field3384.field1551;
                        var15.field4157 = var15.field3384.field1525;
                        if (var15.field4125 == 0) {
                            var15.field4183 = 0;
                        }
                        var15.field4114 = var15.field3384.field1553;
                        var15.field4113 = var15.field3384.field1528;
                        var15.field4137 = var15.field3384.field1556;
                        var15.method1552(var15.method218((byte) -128), var12, true, var13, (byte) -84);
                    }
                }
            }
        }
    }
}
