import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class71 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "F")
    public static float field1495;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lgn;")
    public static class257 field1493;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lib;")
    public static class312 field1494;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[Loj;")
    public static class283[] field1497;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I", line = 10)
    public static final int method541(int arg0, int arg1) {
        field1492++;
        double var2 = (double) (arg1 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var8 = var6;
        if (var6 > var4) {
            var8 = var4;
        }
        if (var8 > var2) {
            var8 = var2;
        }
        double var10 = 0.0D;
        double var12 = (double) arg0;
        double var14 = var6;
        if (var6 < var4) {
            var14 = var4;
        }
        if (var14 < var2) {
            var14 = var2;
        }
        double var16 = (var8 + var14) / 2.0D;
        if (var8 != var14) {
            if (var6 == var14) {
                var10 = (var4 - var2) / (var14 - var8);
            } else if (var4 == var14) {
                var10 = (var2 - var6) / (var14 - var8) + 2.0D;
            } else if (var2 == var14) {
                var10 = (var6 - var4) / (var14 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var12 = (var14 - var8) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (var14 - var8) / (2.0D - var14 - var8);
            }
        }
        int var18 = (int) (var12 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var19 = (int) (var16 * 256.0D);
        double var20 = var10 / 6.0D;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var22 = (int) (var20 * 256.0D);
        if (var19 > 243) {
            var18 >>= 0x4;
        } else if (var19 > 217) {
            var18 >>= 0x3;
        } else if (var19 > 192) {
            var18 >>= 0x2;
        } else if (var19 > 179) {
            var18 >>= 0x1;
        }
        return (var18 >> 5 << 7) + (var22 >> 2 << 10) + (var19 >> 1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V", line = 110)
    public static final void method543() {
        if (class197.field3169 != null) {
            for (int var0 = 0; var0 < class197.field3169.length; var0++) {
                for (int var1 = 0; var1 < class306.field4629; var1++) {
                    for (int var2 = 0; var2 < class39.field762; var2++) {
                        class197.field3169[var0][var1][var2] = null;
                    }
                }
            }
        }
        class61.field1180 = (class16[][]) null;
        if (class239.field3738 != null) {
            for (int var3 = 0; var3 < class239.field3738.length; var3++) {
                for (int var4 = 0; var4 < class306.field4629; var4++) {
                    for (int var5 = 0; var5 < class39.field762; var5++) {
                        class239.field3738[var3][var4][var5] = null;
                    }
                }
            }
        }
        class48.field1001 = (class16[][]) null;
        class66.field1249 = 0;
        if (class274.field4204 != null) {
            for (int var6 = 0; var6 < class66.field1249; var6++) {
                class274.field4204[var6] = null;
            }
        }
        if (class2.field37 != null) {
            for (int var7 = 0; var7 < class175.field2819; var7++) {
                class2.field37[var7] = null;
            }
            class175.field2819 = 0;
        }
        if (class276.field4215 != null) {
            for (int var8 = 0; var8 < class276.field4215.length; var8++) {
                class276.field4215[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 218)
    public static void method544(int arg0) {
        field1493 = null;
        field1494 = null;
        if (arg0 != 29187) {
            field1497 = (class283[]) null;
        }
        field1497 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBZLjava/lang/String;)Z", line = 230)
    public static final boolean method545(int arg0, byte arg1, boolean arg2, String arg3) {
        field1490++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        int var8 = 0;
        if (arg1 < 34) {
            method545(54, (byte) 11, false, (String) null);
        }
        while (var8 < var7) {
            label76: {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var5 = true;
                        break label76;
                    }
                    if (var9 == '+' && arg2) {
                        break label76;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg0) {
                    return false;
                }
                if (var5) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if ((var10 / arg0) != var6) {
                    return false;
                }
                var6 = var10;
                var4 = true;
            }
            var8++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lbm;BI)[Lmg;", line = 304)
    public static final class113[] method546(class307 arg0, byte arg1, int arg2) {
        if (arg1 == 3) {
            field1491++;
            return class148.method966((byte) 103, arg2, arg0) ? class180.method1135((byte) 107) : null;
        } else {
            return (class113[]) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lhf;", line = 324)
    public static final class313 method547(int arg0, byte arg1) {
        field1496++;
        class313 var2 = (class313) class147.field2415.method1881(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class123.field2128.method2036(16, arg0, (byte) 65);
        if (arg1 != -53) {
            return (class313) null;
        }
        class313 var4 = new class313();
        if (var3 != null) {
            var4.method2132(0, new class202(var3));
        }
        class147.field2415.method1880(var4, (long) arg0, 63);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method542(Component arg0, byte arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method548(byte arg0, Component arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
    public abstract int method549(byte arg0);
}
